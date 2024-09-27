package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Orders {
	@Id
	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private LocalDate orderdate;
}




