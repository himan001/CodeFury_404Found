package com.hsbc.asset.model.beans;

import java.sql.Timestamp;

public class Transaction {
	
	private int userId;
	private String userName;
	private int transId;
	private int assetId;
	private String assetName;
	private String itemType;
	private Timestamp dateIssued;
	private Timestamp tentativeReturn;
	private Timestamp actualReturn;
	private float fine;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public Timestamp getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Timestamp dateIssued) {
		this.dateIssued = dateIssued;
	}
	public Timestamp getTentativeReturn() {
		return tentativeReturn;
	}
	public void setTentativeReturn(Timestamp tentativeReturn) {
		this.tentativeReturn = tentativeReturn;
	}
	public Timestamp getActualReturn() {
		return actualReturn;
	}
	public void setActualReturn(Timestamp actualReturn) {
		this.actualReturn = actualReturn;
	}
	public float getFine() {
		return fine;
	}
	public void setFine(float fine) {
		this.fine = fine;
	}
	
	
	
	
	
	
	
	

}