/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import utility.Logger;

/**
 *
 * @author yanpa
 */
@Named
@RequestScoped
public class Knight {
    @Produces
    private int myInt=5;
    @Inject @Dragon
    private Quest quest;
    
    @Produces@Named(value="hobbyList")
    public List<String> hobby(){
        List<String>hobbyList=new ArrayList<>();
        hobbyList.add("Swimming");
        hobbyList.add("Skiing");
        hobbyList.add("Day Dreaming");
        hobbyList.add("Reading");
        return hobbyList;
    }
    @Inject
    private int myInt2;
    @Logger
    public void goQuest(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(quest.quest()+""+myInt2));
        
    }
}
