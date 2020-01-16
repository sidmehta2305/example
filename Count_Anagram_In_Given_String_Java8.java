import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = in.next();
			System.out.println(sherlockAndAnagrams(S));
		}

		in.close();
	}

	static int sherlockAndAnagrams(String str) {
		Map<String, Integer> key2count = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String key = generateKey(str.substring(i, j));
                //System.out.println(key);
				if (!key2count.containsKey(key)) {
					key2count.put(key, 0);
				}
				key2count.put(key, key2count.get(key) + 1);
			}
		}
		return key2count.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
	}

	static String generateKey(String str) {
		return str.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining());
	}
}