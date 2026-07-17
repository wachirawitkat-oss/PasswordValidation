// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // TODO: implement ตาม spec ใน README.md (R1-R6)
        if (pw==null) throw new IllegalArgumentException();
        if (pw.length()<MIN_LEN || pw.length()>MAX_LEN) return false;
        
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasDigit = false ;
        boolean NoSpace = true ;
        
        for (int i = 0; i < pw.length(); i++) {
            Character c = pw.charAt(i);
            if(Character.isLowerCase(c)) hasLower = true;
            else if(Character.isUpperCase(c)) hasUpper = true;
            else if(Character.isDigit(c)) hasDigit = true;
            else if(c == ' ') NoSpace = false;
        }
        return hasLower && hasUpper && hasDigit && NoSpace;
    }
}
