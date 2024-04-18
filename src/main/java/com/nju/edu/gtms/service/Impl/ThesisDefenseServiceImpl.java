package com.nju.edu.gtms.service.Impl;

import com.nju.edu.gtms.dao.ThesisDefenseDao;
import com.nju.edu.gtms.model.po.ThesisDefensePO;
import com.nju.edu.gtms.model.po.ThesisPO;
import com.nju.edu.gtms.model.vo.ThesisDefenseVO;
import com.nju.edu.gtms.service.ThesisDefenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThesisDefenseServiceImpl implements ThesisDefenseService {

    private final ThesisDefenseDao thesisDefenseDao;

    public ThesisDefenseServiceImpl(ThesisDefenseDao thesisDefenseDao) {
        this.thesisDefenseDao = thesisDefenseDao;
    }

    @Override
    public void saveInformation(ThesisDefenseVO thesisDefenseVO){

        ThesisDefensePO thesisDefensePO = new ThesisDefensePO() ;

        thesisDefensePO.setThesisId(Integer.parseInt(thesisDefenseVO.getThesisId()));

        thesisDefensePO.setConclusion(thesisDefenseVO.getState());

        thesisDefensePO.setReview(thesisDefenseVO.getReview());

        thesisDefensePO.setDefenseRemarks(thesisDefenseVO.getDefenseRemarks());

        thesisDefensePO.setDefenseUrl(thesisDefenseVO.getDefenseUrl());


        thesisDefenseDao.saveInformation(thesisDefensePO);


    }

    @Override
    public ThesisDefensePO findDefenseByThesisId(String thesisId){
        return thesisDefenseDao.findDefenseByThesisId(thesisId);
    }

    @Override
    public List<ThesisDefensePO> getThesisByTeacherId(String teacherId){
        System.out.println(thesisDefenseDao.findThesisByTeacherId(teacherId));
        return thesisDefenseDao.findThesisByTeacherId(teacherId);
    }


}
