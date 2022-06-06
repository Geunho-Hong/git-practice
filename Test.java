public class Test {
    public static void main(String[] args) {

        //String[] register_id = {"card","ace13","ace16","banker","ace17","ace14"};
        //String[] register_id = {"cow","cow1","cow2","cow3","cow4","cow9","cow8","cow7","cow6","cow5"};

        String[] register_id = {"bird99","bird98","bird101","gotoxy"};

        System.out.println(solution(register_id,"bird98"));
    }

    private static String solution(String[] register,String new_id) {

        boolean isIdCheck = false;
        String registerId = new_id;

        for(int i =0; i< register.length; i ++) {
            if(register[i].equals(registerId)) {
                isIdCheck = true;
            }
        }

        if(!isIdCheck) {
            return registerId;
        }


        for (int i = 0; i < register.length; i++) {
            System.out.println("registerId = " + registerId);
            System.out.println("registerId [i] = " + register[i]);

            if(register[i].equals(registerId)) {
                registerId = diff(register[i]);
                i = -1;
            }
        }

        return registerId;
    }

    private static String diff(String test){

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        boolean isExistNumber = false;

        System.out.println("test = " +test);

        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            if(ch >= '0' && ch <= '9') {
                isExistNumber = true;
                break;
            }
            idx++;
        }

        if(!isExistNumber) {
            sb.append(test + 1);
        } else {
            int digit = Integer.parseInt(test.substring(idx,test.length()));
            sb.append(test.substring(0,idx));
            sb.append((digit+1));
        }

        System.out.println("result = " + sb.toString());

        return sb.toString();
    }
}
