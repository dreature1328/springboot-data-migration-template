package com.springboot.data.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.springboot.data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DataController {
	@Autowired
	private DataService dataService;
	@RequestMapping("/data/request")
	public String requestData(HttpServletRequest request) throws Exception {
		return dataService.requestData(request.getParameterMap());
	}

	@RequestMapping("/data/select")
	public JSONObject selectData(String id) throws Exception {
		return (JSONObject) JSON.toJSON(dataService.selectData(id));
	}

	@RequestMapping("/data/bselect")
	public JSONArray batchSelectData(String ids) throws Exception {
		return JSONArray.parseArray(JSON.toJSONString(dataService.batchSelectData(ids)));
	}

	@RequestMapping("/data/pselect")
	public JSONArray pageSelectData(String ids) throws Exception {
		return JSONArray.parseArray(JSON.toJSONString(dataService.pageSelectData(ids)));
	}

	@RequestMapping("/data/insert")
	public void insertData() throws Exception {
		dataService.insertData();
		return ;
	}

	@RequestMapping("/data/binsert")
	public void batchInsertData() throws Exception {
		dataService.batchInsertData();
		return ;
	}

	@RequestMapping("/data/pinsert")
	public void pageInsertData() throws Exception {
		dataService.pageInsertData();
		return ;
	}

	@RequestMapping("/data/update")
	public void updateData() throws Exception {
		dataService.updateData();
		return ;
	}

	@RequestMapping("/data/bupdate")
	public void batchUpdateData() throws Exception {
		dataService.batchUpdateData();
		return ;
	}

	@RequestMapping("/data/pupdate")
	public void pageUpdateData() throws Exception {
		dataService.pageUpdateData();
		return ;
	}

	@RequestMapping("/data/insertorupdate")
	public void insertOrUpdateData() throws Exception {
		dataService.insertOrUpdateData();
		return ;
	}

	@RequestMapping("/data/binsertorupdate")
	public void batchInsertOrUpdateData() throws Exception {
		dataService.batchInsertOrUpdateData();
		return ;
	}

	@RequestMapping("/data/pinsertorupdate")
	public void pageInsertOrUpdateData() throws Exception {
		dataService.pageInsertOrUpdateData();
		return ;
	}

	@RequestMapping("/data/delete")
	public void deleteData(String id) throws Exception {
		dataService.batchDeleteData(id);
		return ;
	}

	@RequestMapping("/data/bdelete")
	public void batchDeleteData(String ids) throws Exception {
		dataService.batchDeleteData(ids);
		return ;
	}

	@RequestMapping("/data/pdelete")
	public void pageDeleteData(String ids) throws Exception {
		dataService.pageDeleteData(ids);
		return ;
	}

	@RequestMapping("/data/clear")
	public void clearData() throws Exception {
		dataService.clearData();
		return ;
	}
}
