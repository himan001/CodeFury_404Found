package com.hsbc.asset.model.beans;

public class Asset extends AssetType{
	
	private int assetId;
	private String assetName;
	private String assetType;
	private String assetDescription;
	private int quantity;
	
	
	
	
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Asset(int assetId, String assetName, String assetType, String assetDescription, int quantity) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetType = assetType;
		this.assetDescription = assetDescription;
		this.quantity = quantity;
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
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getAssetDescription() {
		return assetDescription;
	}
	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetName=" + assetName + ", assetType=" + assetType
				+ ", assetDescription=" + assetDescription + ", quantity=" + quantity + "]";
	}
	
	
	

}