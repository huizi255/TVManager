package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{
	
	/**
	 * 栏目的处理
	 */
	private static final long serialVersionUID = 1L;
	private ICategoryService categoryService 
                               = new CategoryServiceImpl();
    private String name;
    private String code;
	
	@Action(value="AddCategory")
	public void AddCategory(){
		Category category = new Category(name,code);
		categoryService.save(category);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
