package Exam_B2.Bai1;
import java.util.Map;
import java.util.Scanner;
public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private SexType sex;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;

    public Student inputData(Map<String, Student> studentList) {
        Student student = new Student();
        student.setStudentId(id(studentList));
        student.setStudentName(name());
        student.setAge(age());
        student.setSex(sex());
        student.setPhone(phone());
        student.setAddress(address());
        student.setHtml(html());
        student.setCss(css());
        student.setJavascript(js());
        return student;
    }

    public void displayData() {
        String BoldOn = "";
        String BoldOff = "";

        System.out.println(BoldOn + "Mã sinh viên: " + BoldOff + getStudentId() + "\t" + BoldOn + "Tên sinh viên: " + BoldOff + getStudentName());
        System.out.println(BoldOn + "Năm sinh: " + getAge() + BoldOff + "\t" + BoldOn + "Giới tính: " + BoldOff + getSex().getValue() + "\t" + BoldOn + "Điện thoại: " + BoldOff + getPhone());
        System.out.println(BoldOn + "Địa chỉ: " + BoldOff + getAddress() + "\t" + BoldOn + "Điểm TB: " + BoldOff + getAvgMark());

    }
    private String id(Map<String, Student> studentList) {
        while (true) {
            System.out.print("Mã sinh viên: ");
            String id = new Scanner(System.in).next();
            if (id != null && id.length() == 5 && id.startsWith("RA") && studentList.get(id) == null) {
                return id;
            }
            System.err.println("Mã sai định dạng, vui lòng nhập lại theo định dạng RA***");
        }
    }
    private String name() {
        while (true) {
            System.out.print("Tên sinh viên: ");
            String name = new Scanner(System.in).nextLine();
            if (name != null && name.length() > 20 && name.length() < 50) {
                return name;
            }
            System.out.println("Tên sai định dạng, độ dài yêu cầu 20 đến 50 ký tự");
        }
    }
    private int age() {
        while (true) {
            System.out.print("Tuổi sinh viên: ");
            int age = new Scanner(System.in).nextInt();
            if (age > 18) {
                return age;
            }
            System.out.println("Tuổi sai định dạng, yêu cầu lớn hơn 18 tuổi");
        }
    }
    private SexType sex() {
        while (true) {
            System.out.print("Giới tính vd.MALE, FEMALE, OTHER,...: ");
            String sex = new Scanner(System.in).next();
            try {
                return SexType.valueOf(sex.toUpperCase());
            } catch (Exception e) {
                System.err.println("Giới tính sai định dạng, vd.MALE, FEMALE, OTHER");
            }
        }
    }
    private String phone() {
        while (true) {
            System.out.print("SĐT : ");
            String phone = new Scanner(System.in).next();
            if (phone != null && phone.length() == 10 && phone.charAt(0) == '0') {
                return phone;
            }
            System.err.println("SĐT sai định dạng, độ dài yêu cầu là 10 và bắt đầu bằng 0");
        }
    }
    private String address() {
        System.out.print("Địa chỉ: ");
        return new Scanner(System.in).next();
    }
    private float html() {
        while (true) {
            System.out.print("Điểm html: ");
            float html = new Scanner(System.in).nextFloat();
            if (html >= 0 && html <= 10) {
                return html;
            }
            System.err.println("Điểm html sai định dạng, yêu cầu từ 0 đến 10 điểm");
        }
    }
    private float css() {
        while (true) {
            System.out.print("Điểm css: ");
            float css = new Scanner(System.in).nextFloat();
            if (css >= 0 && css <= 10) {
                return css;
            }
            System.err.println("Điểm css sai định dạng, yêu cầu từ 0 đến 10 điểm");
        }
    }
    private float js() {
        while (true) {
            System.out.print("Điểm js: ");
            float js = new Scanner(System.in).nextFloat();
            if (js >= 0 && js <= 10) {
                return js;
            }
            System.err.println("Điểm js sai định dạng, yêu cầu từ 0 đến 10 điểm");
        }
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public SexType getSex() {
        return sex;
    }
    public void setSex(SexType sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getHtml() {
        return html;
    }
    public void setHtml(float html) {
        this.html = html;
    }
    public float getCss() {
        return css;
    }
    public void setCss(float css) {
        this.css = css;
    }
    public float getJavascript() {
        return javascript;
    }
    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }
    public float getAvgMark() {
        return (getHtml() + getCss() + getJavascript()) / 3;
    }

}
