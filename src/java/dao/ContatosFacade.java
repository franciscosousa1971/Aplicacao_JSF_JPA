/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Contatos;

/**
 *
 * @author seduc
 */
@Stateless
public class ContatosFacade extends AbstractFacade<Contatos> {

    @PersistenceContext(unitName = "Aplicacao_JSF_JPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContatosFacade() {
        super(Contatos.class);
    }
    
}
