/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.session.CustomerManagerLocal;
import com.udea.session.TransaccionManagerLocal;
import javax.ejb.EJB;

/**
 *
 * @author hp
 */
public class TransaccionMBean {

    @EJB
    private TransaccionManagerLocal transaccionManager;

    @EJB
    private CustomerManagerLocal customerManager;

    @EJB
    private com.udea.session.CreditcardManagerLocal creditcardManager;

    public TransaccionMBean() {
    }
    
}
