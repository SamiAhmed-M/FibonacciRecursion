package fibRecursion;

public class FiboRecursion {
	
public static int display (int n) {
		
	if(n == 0) {
		return 0;
	}
	else if (n==1 || n==2) {
		return 1;
	}
	return
		display(n-1) + display(n-2);
	}	
}
