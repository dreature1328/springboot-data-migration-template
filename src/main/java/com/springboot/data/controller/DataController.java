package com.springboot.data.controller;

import com.springboot.data.common.pojo.Data;
import com.springboot.data.common.vo.HTTPResult;
import com.springboot.data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {
	@Autowired
	private DataService dataService;

	// 生成对象
	@ResponseBody
	@RequestMapping("/data/get")
	public HTTPResult getDatas() throws Exception {
		return HTTPResult.success(dataService.getDatas());
	}

	// 依次查询
	@ResponseBody
	@RequestMapping("/data/select")
	public HTTPResult selectData(String id) throws Exception {
		return HTTPResult.success(dataService.selectData(id));
	}

	// 批量查询
	@ResponseBody
	@RequestMapping("/data/bselect")
	public HTTPResult batchSelectData(String ids) throws Exception {
		List<String> idList = Arrays.asList(ids.split(","));
		return HTTPResult.success(dataService.batchSelectData(idList));
	}

	// 分页查询
	@ResponseBody
	@RequestMapping("/data/pselect")
	public HTTPResult pageSelectData(String ids) throws Exception {
		List<String> idList = Arrays.asList(ids.split(","));
		return HTTPResult.success(dataService.batchSelectData(idList));
	}

	// 依次插入
	@ResponseBody
	@RequestMapping("/data/insert")
	public HTTPResult insertData() throws Exception {
		dataService.insertData(dataService.getDatas().toArray(new Data[0]));
		return HTTPResult.success(null);
	}

	// 批量插入
	@ResponseBody
	@RequestMapping("/data/binsert")
	public HTTPResult batchInsertData() throws Exception {
		dataService.batchInsertData(dataService.getDatas());
		return HTTPResult.success(null);
	}

	// 分页插入
	@ResponseBody
	@RequestMapping("/data/pinsert")
	public HTTPResult pageInsertData() throws Exception {
		dataService.pageInsertData(dataService.getDatas());
		return HTTPResult.success(null);
	}

	// 依次更新
	@ResponseBody
	@RequestMapping("/data/update")
	public HTTPResult updateData() throws Exception {
		dataService.updateData(dataService.getDatas().toArray(new Data[0]));
		return HTTPResult.success(null);
	}

	// 批量更新
	@ResponseBody
	@RequestMapping("/data/bupdate")
	public HTTPResult batchUpdateData() throws Exception {
		dataService.batchUpdateData(dataService.getDatas());
		return HTTPResult.success(null);
	}

	// 分页更新
	@ResponseBody
	@RequestMapping("/data/pupdate")
	public HTTPResult pageUpdateData() throws Exception {
		dataService.pageUpdateData(dataService.getDatas());
		return HTTPResult.success(null);
	}

	// 依次插入或更新
	@ResponseBody
	@RequestMapping("/data/insertOrUpdate")
	public HTTPResult insertOrUpdateData() throws Exception {
		dataService.insertOrUpdateData(dataService.getDatas().toArray(new Data[0]));
		return HTTPResult.success(null);
	}

	// 批量插入或更新
	@ResponseBody
	@RequestMapping("/data/binsertOrUpdate")
	public HTTPResult batchInsertOrUpdateData() throws Exception {
		dataService.batchInsertOrUpdateData(dataService.getDatas());
		return HTTPResult.success(null);
	}

	// 分页插入或更新
	@ResponseBody
	@RequestMapping("/data/pinsertOrUpdate")
	public HTTPResult pageInsertOrUpdateData() throws Exception {
		dataService.pageInsertOrUpdateData(dataService.getDatas());
		return HTTPResult.success(null);
	}

	// 依次删除
	@ResponseBody
	@RequestMapping("/data/delete")
	public HTTPResult deleteData(String id) throws Exception {
		dataService.deleteData(id);
		return HTTPResult.success(null);
	}

	// 批量删除
	@ResponseBody
	@RequestMapping("/data/bdelete")
	public HTTPResult batchDeleteData(String ids) throws Exception {
		List<String> idList = Arrays.asList(ids.split(","));
		dataService.batchDeleteData(idList);
		return HTTPResult.success(null);
	}

	// 分页删除
	@ResponseBody
	@RequestMapping("/data/pdelete")
	public HTTPResult pageDeleteData(String ids) throws Exception {
		List<String> idList = Arrays.asList(ids.split(","));
		dataService.pageDeleteData(idList);
		return HTTPResult.success(null);
	}

	// 清空
	@ResponseBody
	@RequestMapping("/data/clear")
	public HTTPResult clearData() throws Exception {
		dataService.clearData();
		return HTTPResult.success(null);
	}
}
