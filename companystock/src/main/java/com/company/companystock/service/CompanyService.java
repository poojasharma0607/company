package com.company.companystock.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.companystock.dao.ICompanyDao;
import com.company.companystock.model.Company;

@Service
public class CompanyService implements ICompanyService {
	
	@Autowired
	ICompanyDao companydao;

	@Override
	public void registerCompany(Company company) {
		// TODO Auto-generated method stub
		companydao.save(company);
		
	}

	public Optional<Company> getCompanyDetails(int companyCode) {
		// TODO Auto-generated method stub
		return companydao.findById(companyCode);
		 
		
	}

	public Iterable<Company> getallCompanies() {
		// TODO Auto-generated method stub
		return companydao.findAll();
	}

	public void deleteCompany(Integer companyCode) {
		 companydao.deleteById(companyCode);
		// TODO Auto-generated method stub
		//return companydao.deleteById(companyCode);
		
	}

}
