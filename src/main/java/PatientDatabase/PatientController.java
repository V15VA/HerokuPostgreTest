package PatientDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")

public class PatientController {

    private PatientRepository repository;

    @Autowired
    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Patient> get(@PathVariable("id") Long id) {
        Patient patient = repository.findOne(id);
        if (null == patient) {
            return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Patient>(patient, HttpStatus.OK);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<Patient> update(@RequestBody Patient patient) {
        repository.save(patient);
        return get(patient.getId());
    }

    @RequestMapping
    public List<Patient> all() {
        return repository.findAll();
    }
}
