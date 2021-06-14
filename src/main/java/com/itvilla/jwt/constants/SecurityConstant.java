package com.itvilla.jwt.constants;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 900000; // 15 mins expressed in milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String ITVILLA_LLC = "itvilla company, LLC";
    public static final String ITVILLA_ADMINISTRATION = "itvilla administration";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    
    //public static final String[] PUBLIC_URLS = { "/register","/login","/swagger-ui*/**","/swagger.html","/admin/menul1/**", "/home/menul1/**", "/tut/menul1/**" };
   
    public static final String[] PUBLIC_URLS = { "**" };
}
