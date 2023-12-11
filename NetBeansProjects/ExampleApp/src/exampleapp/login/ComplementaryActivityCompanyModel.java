/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleapp.login;

import java.io.Serializable;


public class ComplementaryActivityCompanyModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int idComplementaryActivityCompany;
    private int idcompany;            
    private String name;
    private int idcomplementaryactivity;
    private String activityname;
    private int idLogin = 0; 
    
    public ComplementaryActivityCompanyModel(){
    }
    
    public ComplementaryActivityCompanyModel(int idComplementaryActivityCompany,int idcompany, String name,int idcomplementaryactivity,String activityname,int idLogin){
        this.idComplementaryActivityCompany = idComplementaryActivityCompany;
        this.idcompany = idcompany;
        this.name = name;
        this.idcomplementaryactivity = idcomplementaryactivity;
        this.activityname = activityname;
        this.idLogin = idLogin;
    }
    
    

    /**
     * @return the idComplementaryActivityCompany
     */
    public int getIdComplementaryActivityCompany() {
        return idComplementaryActivityCompany;
    }

    /**
     * @param idComplementaryActivityCompany the idComplementaryActivityCompany to set
     */
    public void setIdComplementaryActivityCompany(int idComplementaryActivityCompany) {
        this.idComplementaryActivityCompany = idComplementaryActivityCompany;
    }

    /**
     * @return the idcompany
     */
    public int getIdcompany() {
        return idcompany;
    }

    /**
     * @param idcompany the idcompany to set
     */
    public void setIdcompany(int idcompany) {
        this.idcompany = idcompany;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the idcomplementaryactivity
     */
    public int getIdcomplementaryactivity() {
        return idcomplementaryactivity;
    }

    /**
     * @param idcomplementaryactivity the idcomplementaryactivity to set
     */
    public void setIdcomplementaryactivity(int idcomplementaryactivity) {
        this.idcomplementaryactivity = idcomplementaryactivity;
    }

    /**
     * @return the activityname
     */
    public String getActivityname() {
        return activityname;
    }

    /**
     * @param activityname the activityname to set
     */
    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    /**
     * @return the idLogin
     */
    public int getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
    
    
}
