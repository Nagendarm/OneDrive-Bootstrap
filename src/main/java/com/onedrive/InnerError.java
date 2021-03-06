package com.onedrive;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class InnerError implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5485989958953816443L;


	@SerializedName("request-id")
	private String request_id;
	 
	 
	 private Date date;
	
	/**
	 * @return the request_id
	 */
	public String getRequest_id() {
		return request_id;
	}

	/**
	 * @param request_id the request_id to set
	 */
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InnerError [request_id=" + request_id + ", date=" + date + "]";
	}

	
}
