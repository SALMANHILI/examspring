<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assign Employee to Project</title>
</head>
<body>
<h2>Assign Employee to Project</h2>
<form action="/assign" method="post">
    <label for="employeeId">Employee:</label>
    <select id="employeeId" name="employeeId">
        <!-- Populate employee options dynamically -->
    </select>
    <br>
    <label for="projectId">Project:</label>
    <select id="projectId" name="projectId">
        <c:forEach var="project" items="${projects}">
            <option value="${project.id}">${project.name}</option>
        </c:forEach>
    </select>
    <br>
    <button type="submit">Assign to Project</button>
</form>
</body>
</html>
