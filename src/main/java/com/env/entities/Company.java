package com.env.entities;

import java.sql.Date;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "reg_address")
    private String regAddress;
    @Column(name = "address")
    private String address;
    @Column(name = "pro_time")
    private Date productionTime;
    @Column(name = "credit_code")
    private String creditCode;
    @Column(name = "rep_person")
    private String representative;
    @Column(name = "tech_person")
    private String technicalPerson;
    @Column(name = "tech_person_contact")
    private String technicalPersonContact;

    protected Company(){}

    public Company(String name, String regAddress, String address, Date productionTime, String creditCode,
                   String representative, String technicalPerson, String technicalPersonContact)
    {
        this.name = name;
        this.regAddress = regAddress;
        this.address = address;
        this.productionTime = productionTime;
        this.creditCode = creditCode;
        this.representative = representative;
        this.technicalPerson = technicalPerson;
        this.technicalPersonContact = technicalPersonContact;
    }
}
