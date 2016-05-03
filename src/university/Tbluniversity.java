/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "tbluniversity", catalog = "ift232university", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbluniversity.findAll", query = "SELECT t FROM Tbluniversity t"),
    @NamedQuery(name = "Tbluniversity.findByStdId", query = "SELECT t FROM Tbluniversity t WHERE t.stdId = :stdId"),
    @NamedQuery(name = "Tbluniversity.findByStdFirstName", query = "SELECT t FROM Tbluniversity t WHERE t.stdFirstName = :stdFirstName"),
    @NamedQuery(name = "Tbluniversity.findByStdLastName", query = "SELECT t FROM Tbluniversity t WHERE t.stdLastName = :stdLastName"),
    @NamedQuery(name = "Tbluniversity.findByStdGender", query = "SELECT t FROM Tbluniversity t WHERE t.stdGender = :stdGender"),
    @NamedQuery(name = "Tbluniversity.findByStdAcademicYear", query = "SELECT t FROM Tbluniversity t WHERE t.stdAcademicYear = :stdAcademicYear"),
    @NamedQuery(name = "Tbluniversity.findByStdLebanese", query = "SELECT t FROM Tbluniversity t WHERE t.stdLebanese = :stdLebanese"),
    @NamedQuery(name = "Tbluniversity.findByStdEmail", query = "SELECT t FROM Tbluniversity t WHERE t.stdEmail = :stdEmail"),
    @NamedQuery(name = "Tbluniversity.findByStdAddress", query = "SELECT t FROM Tbluniversity t WHERE t.stdAddress = :stdAddress")})
public class Tbluniversity implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stdId")
    private Integer stdId;
    @Basic(optional = false)
    @Column(name = "stdFirstName")
    private String stdFirstName;
    @Basic(optional = false)
    @Column(name = "stdLastName")
    private String stdLastName;
    @Basic(optional = false)
    @Column(name = "stdGender")
    private String stdGender;
    @Basic(optional = false)
    @Column(name = "stdAcademicYear")
    private short stdAcademicYear;
    @Basic(optional = false)
    @Column(name = "stdLebanese")
    private boolean stdLebanese;
    @Column(name = "stdEmail")
    private String stdEmail;
    @Column(name = "stdAddress")
    private String stdAddress;

    public Tbluniversity() {
    }

    public Tbluniversity(Integer stdId) {
        this.stdId = stdId;
    }

    public Tbluniversity(Integer stdId, String stdFirstName, String stdLastName, String stdGender, short stdAcademicYear, boolean stdLebanese) {
        this.stdId = stdId;
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
        this.stdGender = stdGender;
        this.stdAcademicYear = stdAcademicYear;
        this.stdLebanese = stdLebanese;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        Integer oldStdId = this.stdId;
        this.stdId = stdId;
        changeSupport.firePropertyChange("stdId", oldStdId, stdId);
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        String oldStdFirstName = this.stdFirstName;
        this.stdFirstName = stdFirstName;
        changeSupport.firePropertyChange("stdFirstName", oldStdFirstName, stdFirstName);
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        String oldStdLastName = this.stdLastName;
        this.stdLastName = stdLastName;
        changeSupport.firePropertyChange("stdLastName", oldStdLastName, stdLastName);
    }

    public String getStdGender() {
        return stdGender;
    }

    public void setStdGender(String stdGender) {
        String oldStdGender = this.stdGender;
        this.stdGender = stdGender;
        changeSupport.firePropertyChange("stdGender", oldStdGender, stdGender);
    }

    public short getStdAcademicYear() {
        return stdAcademicYear;
    }

    public void setStdAcademicYear(short stdAcademicYear) {
        short oldStdAcademicYear = this.stdAcademicYear;
        this.stdAcademicYear = stdAcademicYear;
        changeSupport.firePropertyChange("stdAcademicYear", oldStdAcademicYear, stdAcademicYear);
    }

    public boolean getStdLebanese() {
        return stdLebanese;
    }

    public void setStdLebanese(boolean stdLebanese) {
        boolean oldStdLebanese = this.stdLebanese;
        this.stdLebanese = stdLebanese;
        changeSupport.firePropertyChange("stdLebanese", oldStdLebanese, stdLebanese);
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        String oldStdEmail = this.stdEmail;
        this.stdEmail = stdEmail;
        changeSupport.firePropertyChange("stdEmail", oldStdEmail, stdEmail);
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        String oldStdAddress = this.stdAddress;
        this.stdAddress = stdAddress;
        changeSupport.firePropertyChange("stdAddress", oldStdAddress, stdAddress);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stdId != null ? stdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbluniversity)) {
            return false;
        }
        Tbluniversity other = (Tbluniversity) object;
        if ((this.stdId == null && other.stdId != null) || (this.stdId != null && !this.stdId.equals(other.stdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.Tbluniversity[ stdId=" + stdId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
