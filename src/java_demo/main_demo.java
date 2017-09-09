package java_demo;
import java.util.*;

public class main_demo {

	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<String>();
		buildArrayList(wordList,"amma");
		System.out.println(isPalindrom(wordList));
		
	}
	
	static void buildArrayList (ArrayList<String> wordList, String word){
		
		for(int i = 0; i< word.length(); i++) {
			wordList.add(word.charAt(i) + "");
		}
	}
	
	static void displayArrayList (ArrayList<String> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	
	static boolean isPalindrom ( ArrayList<String> word) {
		ArrayList<String> reverseWord = new ArrayList<String>();
		reverseWord.addAll(word);
		Collections.reverse(reverseWord);
		
		for(int i = 0; i< word.size(); i++) {
			if(!word.get(i).equals(reverseWord.get(i))) {
				return false;
			}
		}
		return true;
	}

}
