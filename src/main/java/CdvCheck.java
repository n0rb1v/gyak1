public class CdvCheck {
    public boolean check(String s) {
        if (s.length()!=10){
            throw new IllegalArgumentException("hibas szam");
        }
        int sum = 0;
        try {
            for (int i = 0; i < 9; i++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i))) * (i+1);
            }
            if (Integer.parseInt(String.valueOf(s.charAt(9))) == sum % 11) {
                return true;
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("hibas parameter");
        }
        return false;
    }
}
