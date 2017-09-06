package en.words.accountsservice.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class User {

    private long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private UserRoleType userRole = UserRoleType.STUDENT;
    private String email;
    private String phone;
}
