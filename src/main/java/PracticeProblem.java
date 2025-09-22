public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String s){
        String s1 = s.toLowerCase();
        String finalStr = s1.replaceAll(" ", "");
        for (int i = 0; i < finalStr.length()/2; i++) {
            if (finalStr.charAt(i) != finalStr.charAt(finalStr.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static int getAge(String[] names, int[] age, String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return age[i];
            }
        }
        return -1;
    }
    public static int countWords(String inputText, char letter){
        int count = 0;
        String[] words = inputText.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(letter))) {
                count++;
            }
        }
        return count;
    }

}
