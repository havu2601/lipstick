package ejb;

import model.Accounts;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AccountEJB {
    @PersistenceContext
    private EntityManager em;
    public List<Accounts> findAll(){return em.createNamedQuery("Account.findAll").getResultList();}
}
