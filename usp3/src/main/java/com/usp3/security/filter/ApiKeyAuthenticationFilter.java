package com.usp3.security.filter;

import java.io.IOException;

import com.usp3.security.service.ApiKeyService;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ApiKeyAuthenticationFilter implements Filter {

    public ApiKeyAuthenticationFilter(ApiKeyService apiKeyService) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doFilter'");
    }

}
