package models;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String position;
    private int Department_id;
    private String role;

    public User(int id, String name, String position, int department_id, String role) {
        this.id = id;
        this.name = name;
        this.position = position;
        Department_id = department_id;
        this.role = role;
    }

    public User(String name, String position, int department_id, String role) {
        this.name = name;
        this.position = position;
        Department_id = department_id;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDepartment_id() {
        return Department_id;
    }

    public void setDepartment_id(int department_id) {
        Department_id = department_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Department_id == user.Department_id &&
                Objects.equals(name, user.name) &&
                Objects.equals(position, user.position) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, Department_id, role);
    }
}
