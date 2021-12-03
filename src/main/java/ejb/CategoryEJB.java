package ejb;

import model.Categories;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CategoryEJB {
    @PersistenceContext
    private EntityManager em;

    public List<Categories> categories(){
        return em.createNamedQuery("Category.findAll").getResultList();
    }
}
