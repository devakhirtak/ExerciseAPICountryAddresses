package com.country.addresses.api.service.address;

import java.util.List;

import com.country.addresses.api.service.modal.Address;

//@Created By MShahid
public interface AddressService {

	List<Address> findAll();

	Address findById(Long id);

	List<Address> findAllByCountryName(String countryname);

	List<Address> findByCityName(String cityname);
}