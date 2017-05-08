package com.mydrive.web.service;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.xmlbeans.XmlException;

import com.google.gson.JsonSyntaxException;
import com.mydrive.TokenAndPath;

public interface UserService {
	
	public String authorizeAndGetUserToken() throws URISyntaxException;

	public String  finaldownload(TokenAndPath tokenAndPath) throws IOException, IllegalStateException, JsonSyntaxException, InterruptedException, NumberFormatException, OpenXML4JException, XmlException;
}
