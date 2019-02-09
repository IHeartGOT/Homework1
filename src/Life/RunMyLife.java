package Life;

public class RunMyLife {
	public static void main(String[] args) {
		MyLife children = new MyLife();
		children.LookingBack();
		
	int result =children.addition(1, 1);
	System.out.println("I have "+result+" children");
	
	children.MyFavFood("Rice", "chicken");
	
	children.ClassLocation();
	
	children.MyFuture();
	
	}
	
	}