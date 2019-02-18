package apple.service.core.phone.model;

import javax.persistence.*;

import javax.transaction.Transactional;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Transactional
@Entity(name = "Phone")
@Table(name = "phones")
public class PhoneEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Title shouldn't be empty")
    @Size(max = 200)
    @Column(name = "owner", length = 200, nullable = false)
    private String owner;

    @NotEmpty
    @Size(min = 1, max = 50)
    @Column(name = "product", length = 50, nullable = false)
    private String product;

    @NotEmpty
    @Size(max = 30)
    @Column(name = "version", length = 30, nullable = false)
    private String version;

    @NotEmpty
    @Size(min = 1, max = 20)
    @Column(name = "ios", length = 20, nullable = false)
    private String ios;

    @NotEmpty
    @Size(min = 1, max = 30)
    @Column(name = "color", length = 30, nullable = false)
    private String color;

    @NotEmpty
    @Size(min = 3, max = 30)
    @Column(name = "cover", length = 30, nullable = false)
    private String cover;


    @Size(min = 1, max = 50)
    @Column(name = "country", length = 50, nullable = false)
    private String country;


    @NotEmpty
    //min-8!
    @Size(min = 4, max = 30)
    @Column(name = "serialNr", length = 30, nullable = false)
    private String serialNr;

    @Min(value = 1)
    @NotNull
    @Column(name = "year", nullable = false)
    private int year;

    @Size(max = 1000)
    @Column(name = "information", length = 1000)
    private String information;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSerialNr() {
        return serialNr;
    }

    public void setSerialNr(String serialNr) {
        this.serialNr = serialNr;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
