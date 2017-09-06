package en.words.accountsservice.model;

public enum  UserRoleType {

    ADMIN(0),
    STUDENT(1),
    TEACHER(2);

    private int type;

    UserRoleType(int type) {
        this.type = type;
    }
}
