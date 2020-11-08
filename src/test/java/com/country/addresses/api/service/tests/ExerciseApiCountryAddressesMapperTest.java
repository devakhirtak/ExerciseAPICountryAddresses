package com.country.addresses.api.service.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.StringJoiner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;
import com.country.addresses.api.service.modal.Address;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ExerciseApiCountryAddressesMapperTest {
	
private final Logger log = LoggerFactory.getLogger(this.getClass()); 

Address addressMapper = new Address();

@Test
@Order(2)
public void testUSAddressesMapping() {		
		
		//Set Data 
		addressMapper.setId(new Long(1));
		addressMapper.setAddress1("451 W 51 ST");
		addressMapper.setAddress2("254 address2");
		addressMapper.setCity("Columbia");
		addressMapper.setState("MO");
		addressMapper.setZipCode("65203");
		addressMapper.setCountry("USA");
		
		//Display results
		log.info(new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
	                .add("id=" + addressMapper.getId())
	                .add("Address1 ='" + addressMapper.getAddress1()+ "'")
	                .add("Address2 ='" + addressMapper.getAddress2()+ "'")
	                .add("City ='" + addressMapper.getCity()+ "'")
	                .add("State ='" + addressMapper.getState()+ "'")
	                .add("Zip Code ='" + addressMapper.getZipCode()+ "'")
	                .add("Country ='" + addressMapper.getCountry()+ "'")
	                .toString());   	
		assertNotEquals("USA", addressMapper.getCountry().toLowerCase());
		}
	
@Test
@Order(1)
	public void testCAAddressesMapping() {
		//Set Data 
		addressMapper.setId(new Long(1));
		addressMapper.setAddress1("451 W 51 ST");
		addressMapper.setAddress2("254 address2");
		addressMapper.setCity("Vancouver");
		addressMapper.setState("British Columbia");
		addressMapper.setZipCode("M5H2N1");
		addressMapper.setCountry("CANADA");
		
		//Display results
		log.info(new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
	                .add("id=" + addressMapper.getId())
	                .add("Address1 ='" + addressMapper.getAddress1()+ "'")
	                .add("Address2 ='" + addressMapper.getAddress2()+ "'")
	                .add("City ='" + addressMapper.getCity()+ "'")
	                .add("State ='" + addressMapper.getState()+ "'")
	                .add("Zip Code ='" + addressMapper.getZipCode()+ "'")
	                .add("Country ='" + addressMapper.getCountry()+ "'")
	                .toString());   	
		assertEquals("CANADA", addressMapper.getCountry().toUpperCase());
		}
}
	
