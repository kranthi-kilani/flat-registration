package com.cg.flat.dao;

import java.util.ArrayList;

import com.cg.flat.util.DataBase;

public class FlatDaoImpl implements IFlatDao {

	@Override
	public ArrayList<Integer> getFlatDetails() {
		// TODO Auto-generated method stub
		return DataBase.getFlatDetails();
		
	}
public ArrayList<String> getRoomDetails(){
	return DataBase.getRoomDetails();
}
	
}
