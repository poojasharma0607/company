package com.company.companystock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int companyCode;
	private String companyName;
	private String companyCEO;
	private String companyTurnOver;
	private String companyWebSite;
	private String stockExchange;

}
