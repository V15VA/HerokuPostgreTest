package PatientDatabase;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private long patient_id;
    private String dob;

    public Long getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }

    public long getPatientID() {
        return patient_id;
    }

    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
