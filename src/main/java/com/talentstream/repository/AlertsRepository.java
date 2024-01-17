package com.talentstream.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.talentstream.entity.Alerts;
 
public interface AlertsRepository extends JpaRepository<Alerts, Long>{
 
	//List<Alerts> findByApplyJob_ApplyJobIdOrderByChangeDateDesc(long applyJobId);
 
	List<Alerts> findByApplicant_IdOrderByChangeDateDesc(long applicantId);
}