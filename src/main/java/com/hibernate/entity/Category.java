package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
private String  categoryId;
private String 	category;
private String 	parentId;
public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getParentId() {
	return parentId;
}
public void setParentId(String parentId) {
	this.parentId = parentId;
}
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", category=" + category + ", parentId=" + parentId + "]";
}


}
