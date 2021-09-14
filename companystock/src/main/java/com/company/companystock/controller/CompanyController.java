package com.company.companystock.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.companystock.model.Company;
import com.company.companystock.service.CompanyService;

@RestController
@RequestMapping("/api/v1.0/market")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@PostMapping("/company/register")
	public void registerCompany(@RequestBody Company company)
	{
		companyService.registerCompany(company);
		
	}
	
	@GetMapping("/company/info/{companyCode}")
	public Optional<Company> getCompanyDetails(@PathVariable("companyCode") int companyCode)
	{
		return companyService.getCompanyDetails(companyCode);
		
	}
	
	@GetMapping("/company/getall")
	public Iterable<Company> getallCompanies()
	{
		return companyService.getallCompanies();
		
	}
	
	@GetMapping("/company/delete/{companyCode}")
	public void deleteCompany(@PathVariable("companyCode") int companyCode)
	{
		 companyService.deleteCompany(companyCode);
		
	}
	

}
