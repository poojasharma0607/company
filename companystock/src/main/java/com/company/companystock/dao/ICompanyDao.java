package com.company.companystock.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.companystock.model.Company;


public interface ICompanyDao extends CrudRepository<Company, Integer>{
	

}
