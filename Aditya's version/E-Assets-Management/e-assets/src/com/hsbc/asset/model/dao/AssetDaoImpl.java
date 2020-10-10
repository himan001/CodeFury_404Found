package com.hsbc.asset.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.asset.model.beans.Asset;
import com.hsbc.asset.utility.DBUtility;

public class AssetDaoImpl implements AssetDao {

	@Override
	public Asset storeAsset(Asset asset) {
		try {
			
			Connection connection = DBUtility.getConnection();
			PreparedStatement insertStatement = 
					connection.prepareStatement("insert into asset_details (asset_name, asset_type, asset_description, quantity) values(?,?,?,?)");
			
			insertStatement.setString(1, asset.getAssetName());
			insertStatement.setString(2, asset.getAssetType());
			insertStatement.setString(3, asset.getAssetDescription());
			insertStatement.setInt(4, asset.getQuantity());
			
			insertStatement.executeUpdate();
			insertStatement.close();
			connection.close();
			
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return asset;
	}

}