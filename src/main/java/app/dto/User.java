package app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("Number")
    private Long id;
    @JsonProperty("First Name")
    private String name;
    @JsonProperty("Second Name")
    private String phone;
    @JsonIgnore
    private String level;

    public User() {
    }

    public User(Long id, String name, String phone, String level) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
