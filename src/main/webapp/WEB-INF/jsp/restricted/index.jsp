<html>
<body>
<h2>
    This is index page!
    <br>
    There are head page with authorization for admins and consumers.
    <br>
<%--    <p><a href="https://localhost:9000/public/user_registration_page">consumer registration</a></p>--%>
   <%-- <p><a href="https://localhost:9000/public/authorizationPage">Login page</a></p>--%>
    <p><a href="/profile?command=profile">Your profile</a></p>
    <p><a href="/login?command=loginPage">Login page</a></p>
    <p><a href="/regpage?command=regPage">Registration page</a></p>
    <p><a href="/events?command=events">list of expositions</a></p>
</h2>
<h2>Massage: <%= request.getAttribute("message")%></h2>
</body>
</html>