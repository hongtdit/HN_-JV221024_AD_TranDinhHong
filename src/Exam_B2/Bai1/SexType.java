package Exam_B2.Bai1;

public enum SexType {
        MALE("Nam"), FEMALE("Nữ"), OTHER("Khác");

    private final String value;
    SexType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
