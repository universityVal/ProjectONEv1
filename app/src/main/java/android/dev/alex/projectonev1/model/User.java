package android.dev.alex.projectonev1.model;

public class User {
    long id, role_id, group_id;
    String first_name, second_name, middle_name, gender, date_of_birth;

    public User(long id, long role_id, long group_id, String first_name, String second_name, String middle_name, String gender, String date_of_birth) {
        this.id = id;
        this.role_id = role_id;
        this.group_id = group_id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.middle_name = middle_name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
    }

    public long getId() {
        return id;
    }

    public long getRole_id() {
        return role_id;
    }

    public long getGroup_id() {
        return group_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getGender() {
        return gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }
}
