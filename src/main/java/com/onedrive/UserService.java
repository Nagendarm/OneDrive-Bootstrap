package com.onedrive;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.xmlbeans.XmlException;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonSyntaxException;

public interface UserService {
	
	public String authorizeAndGetUserToken() throws URISyntaxException;

	public ModelAndView  finaldownload(TokenAndPath tokenAndPath) throws IOException, IllegalStateException, JsonSyntaxException, InterruptedException, NumberFormatException, OpenXML4JException, XmlException;
}
