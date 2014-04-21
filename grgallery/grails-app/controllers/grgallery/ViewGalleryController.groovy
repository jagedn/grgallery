package grgallery

class ViewGalleryController {

    def index() { 
		
		return [ list : ImageDetail.list() ]
	}
	
	def showImage = {	
		def imgDetail = ImageDetail.get(params.id)		
		def file = new File(imgDetail.fullPath)			
		response.outputStream << file.getBytes()
		response.outputStream.flush()		
	}
}
