package com.projeto.santoandre.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tbfruits")
@Table(name ="tbfruits")
@Getter
@Setter
@EqualsAndHashCode(of = "idfruit")
public class FruitModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idfruit;
	
	private String nomefruit,color;
	private int price;
	public Long getIdfruit() {
		return idfruit;
	}
	public void setIdfruit(Long idfruit) {
		this.idfruit = idfruit;
	}
	public String getNomefruit() {
		return nomefruit;
	}
	public void setNomefruit(String nomefruit) {
		this.nomefruit = nomefruit;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



	
	

	
	
	

}
