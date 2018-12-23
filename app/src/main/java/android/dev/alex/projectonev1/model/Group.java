package android.dev.alex.projectonev1.model;

public class Group {
    Long id;
    Integer speciality_id;
    String name;

    public Long getId() {
        return id;
    }

    public Integer getSpeciality_id() {
        return speciality_id;
    }

    public String getName() {
        return name;
    }

    public Group(Long id, Integer speciality_id, String name) {

        this.id = id;
        this.speciality_id = speciality_id;
        this.name = name;
    }
}
