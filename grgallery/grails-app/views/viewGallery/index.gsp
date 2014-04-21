<html>
<head>
	<meta name="layout" content="main"/>
</head>
<body>
	
	<g:each in="${list}" status="i" var="imageDetail">
		<li> 
		<img src='<g:createLink action="showImage" id="${imageDetail.id }"/>' width="400px" height="300px"/>		
		</li> 
	</g:each>
	 
</body>
</html>