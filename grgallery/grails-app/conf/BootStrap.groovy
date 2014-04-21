import groovy.io.FileType
import grgallery.*

class BootStrap {

    def init = { servletContext ->
		
		def dir = new File(servletContext.getRealPath("WEB-INF"))
		def files = dir.list([accept:{d, f-> f ==~ /.*?\.jpg/ }] as FilenameFilter)		
		files.each{ f->
			println f
			def file = new File("${dir.absolutePath}/$f")
			def img = new ImageDetail(name:file.name, 
				fullPath: "${dir.absolutePath}/$f", 
				size:file.size())
			img.save(flush:true,failOnError:true)
		}
		
    }
	
	
    def destroy = {
    }
}
