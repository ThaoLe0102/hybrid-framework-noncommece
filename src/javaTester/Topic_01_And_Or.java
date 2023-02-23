package javaTester;

public class Topic_01_And_Or {

	public static void main(String[] args) {
		boolean firstCondition;
		boolean secondCondition;
		firstCondition = true;
		secondCondition = false;
        System.out.println(firstCondition && secondCondition);
        
        firstCondition = false;
		secondCondition = true;
        System.out.println(firstCondition && secondCondition);
        
        firstCondition = false;
		secondCondition = false;
        System.out.println(firstCondition && secondCondition);
        
        firstCondition = true;
		secondCondition = true;
        System.out.println(firstCondition && secondCondition);
        
        firstCondition = true;
		secondCondition = false;
        System.out.println(firstCondition || secondCondition);
        
        firstCondition = false;
		secondCondition = true;
        System.out.println(firstCondition || secondCondition);
        
        firstCondition = false;
		secondCondition = false;
        System.out.println(firstCondition || secondCondition);
        
        firstCondition = true;
		secondCondition = true;
        System.out.println(firstCondition || secondCondition);
	}

}
