package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.MedicineReviewRepository;
import com.example.demo.entity.Reviews;
@SpringBootTest
class MedicineReviewServiceImplTest {

	@Mock
	MedicineReviewRepository reviewRepository;
	@InjectMocks
	MedicineReviewServiceImpl reviewService;
	
	@Test@DisplayName("Get all the reviews")
	void testGetAllReviews() throws Exception 
	{Reviews reviews1 = new Reviews((long) 1,"the product is okay",7.2);
	Reviews reviews2= new Reviews((long) 1,"the product is okay",7.2);
	List<Reviews> sampleOutput = new ArrayList<>();
	sampleOutput.add(reviews1);
	sampleOutput.add(reviews2);
	BDDMockito.given(reviewService.getAllReviews()).willReturn(sampleOutput);
	List<Reviews>actualOutput= reviewService.getAllReviews();assertNotNull(actualOutput);assertIterableEquals(sampleOutput, actualOutput);}
	
	
	
	
	
	
	
	
	@Test
	void testGetReviewBetweenIds() throws Exception {
		Reviews sampleInput = new Reviews((long) 1,"the product is okay",6.6);
		Reviews expectedOutput = new Reviews((long) 1,"the product is okay",6.6);
		BDDMockito.given(reviewService.insertReview(sampleInput)).willReturn(expectedOutput	);
		}

	}