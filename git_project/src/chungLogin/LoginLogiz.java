
package chungLogin;

public class LoginLogiz {
public static String mem_id="test";
public static String mem_pw="123";

	public static void main(String[] args) {
		if(mem_id.equals("test") && mem_pw.equals("123")) {
			System.out.println("로그인");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
