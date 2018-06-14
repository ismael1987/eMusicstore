<%--
  Created by IntelliJ IDEA.
  User: ismael
  Date: 6/14/18
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Checkout all the awesome products available now!</p>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width:100%; height: 300px" />
                </div>

                <div class="col-md-5">
                    <h3>Product Name</h3>
                    <p>Product Description</p>
                    <p>Manufacturer</p>
                    <p>Category</p>
                    <p>Condition</p>
                    <p>Price</p>
                </div>
            </div>
        </div>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>
