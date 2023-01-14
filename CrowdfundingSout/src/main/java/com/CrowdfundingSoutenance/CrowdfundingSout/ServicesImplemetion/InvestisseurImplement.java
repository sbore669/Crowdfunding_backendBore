package com.CrowdfundingSoutenance.CrowdfundingSout.ServicesImplemetion;

import com.CrowdfundingSoutenance.CrowdfundingSout.Models.Investisseur;
import com.CrowdfundingSoutenance.CrowdfundingSout.Repository.InvestisseurReposotory;
import com.CrowdfundingSoutenance.CrowdfundingSout.ServicesInterfaces.InvestisseurServInter;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class InvestisseurImplement implements InvestisseurServInter {

    @Autowired
    private InvestisseurReposotory investisseurReposotory;
    @Override
    public Investisseur createInvest(Investisseur investisseur) {
        return investisseurReposotory.save(investisseur);
    }

    @Override
    public Investisseur updateById(Long idUsers, Investisseur investisseur) {
        return investisseurReposotory.save(investisseur);
    }

    @Override
    public List<Investisseur> getAllInvestisseur() {
        return investisseurReposotory.findAll();
    }

    @Override
    public Investisseur getInvestisseurById(Long idUsers) {
        return investisseurReposotory.findById(idUsers).orElse(null);
    }
}