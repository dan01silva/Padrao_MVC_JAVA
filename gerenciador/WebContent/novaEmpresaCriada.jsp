<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page JSP</title>
</head>
<body>

	<c:if test="${not empty empresa}">
	
		Empresa ${ empresa} cadastrada com sucesso em ${data}
	</c:if>
	

	
 <A HREF="listaEmpresas">Lista das Empresas Cadastradas</A> 

</body>
</html>