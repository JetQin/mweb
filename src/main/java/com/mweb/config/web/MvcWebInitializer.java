package com.mweb.config.web;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mweb.config.security.SecurityConfiguration;
import com.mweb.config.socket.WebSocketConfiguration;


@Order(1)
public class MvcWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[]
		{ SecurityConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class[]
		{ MvcConfiguration.class,WebSocketConfiguration.class };
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[]
		{ "/" };
	}

}
