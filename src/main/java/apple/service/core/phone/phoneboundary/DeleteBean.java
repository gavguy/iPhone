package apple.service.core.phone.phoneboundary;

import apple.service.core.phone.model.PhoneEntity;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class DeleteBean implements Serializable {
    @PersistenceContext
    private EntityManager em;
    private boolean delete = false;

    private Long id;


    public String phonedelete() {
        PhoneEntity phone;
        phone = em.find(PhoneEntity.class, id);
        em.remove(phone);
        delete = true;
        return null;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void doSearch() {
        System.out.println("Searching");
    }
}
