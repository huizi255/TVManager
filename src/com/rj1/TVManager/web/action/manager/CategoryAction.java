package com.rj1.TVManager.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.rj1.TVManager.bean.Category;
import com.rj1.TVManager.service.ICategoryService;
import com.rj1.TVManager.service.impl.CategoryServiceImpl;
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
    private Long id;
	private Category category;
    /**
     * @author huizi;
     * 添加栏目功能；
     * */
	@Action(value="AddCategory")
	public void AddCategory(){
		Category category = new Category(name,code);
		categoryService.save(category);
	}

	/**
	 * @author huizi;
	 * 删除栏目功能；
	 * */
	@Action(value="delCategory")
	public void delCategory(){
		categoryService.delete(id);
	}
	
	/**
	 * @author huizi;
	 * 修改栏目；
	 * */
	@Action("UpdCategory")  //value="UpdCategory"，value可省略
	public void UpdCategory(){
		Category category = new Category(name, code);
		category.setId(id);
		categoryService.update(category);
	}
	/**
	 * 跳转到修改栏目界面
	 * */
	@Action(value="toUpdCategory",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/UpdCategory.jsp")})
	public String toUpdCategory(){
		category = categoryService.findById(id);
		return "success";
		
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
