package se.kaxig.hpalmhult.model;

import java.util.Date;

public class Coupon {
    private Integer _id = null;
    private String _name = null;
    private Date _validFrom = null;
    private Date _validUntil = null;

    public Coupon(Integer id,String name, Date validFrom, Date validUntil) {
        _id = id;
        _name = name;
        _validFrom = validFrom;
        _validUntil = validUntil;
    }
    public Integer getId() { return _id; }
    public String getName() { return _name; }
    public Date getValidFrom() { return _validFrom; }
    public Date getValidUntil() { return _validUntil; }

}
