public class RammiStackLink {
	public static void main(String[] args) {
        String input = "{}{}{}[][][]([[[]]])";
        equalbrackets(input);
    		
	}
    public static void equalbrackets(String input) {

        StackLinkedListbalance<Character> stack = new StackLinkedListbalance<Character>();

        for(int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                char last = stack.top();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') {
                    stack.pop();
                }
            }      
        }
        if(stack.top() == null) {
            System.out.println("Balanced");
        } else {
            System.out.println("unbalaned");
        }

    }
}