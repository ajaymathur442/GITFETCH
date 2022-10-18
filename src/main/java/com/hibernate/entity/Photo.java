package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class Photo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int   photoId; 

private String 	urlSmall;
private String 	urlMedium;
private String 	urlLarge;

@OneToOne(mappedBy = "photo")
private Book book;


public String getUrlSmall() {
	return urlSmall;
}
public void setUrlSmall(String urlSmall) {
	this.urlSmall = urlSmall;
}
public String getUrlMedium() {
	return urlMedium;
}
public void setUrlMedium(String urlMedium) {
	this.urlMedium = urlMedium;
}
public String getUrlLarge() {
	return urlLarge;
}
public void setUrlLarge(String urlLarge) {
	this.urlLarge = urlLarge;
}
public int getPhotoId() {
	return photoId;
}
public void setPhotoId(int photoId) {
	this.photoId = photoId;
}
@Override
public String toString() {
	return "Photo [photoId=" + photoId + ", urlSmall=" + urlSmall + ", urlMedium=" + urlMedium + ", urlLarge="
			+ urlLarge + ", book=" + book + "]";
}



}
