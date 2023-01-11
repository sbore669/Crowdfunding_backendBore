package com.CrowdfundingSoutenance.CrowdfundingSout.Models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
public class Realisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  IdRealisation;
    private String nomRealisation;
    private String montantRealisation;
    private String imageRealisation;
    private Date daterealisation;




}
