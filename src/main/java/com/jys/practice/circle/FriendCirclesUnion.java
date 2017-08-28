package com.jys.practice.circle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: 
 * Matrix showing friendship: Y = friends, N = not friends.
 * Friendship is transitive. Friend circle is a group of direct or
 * indirect(friend of a friend) friends. Find total number of friend circles.
 * 
 * Constraints: 
 * * 1 <= n <= 300 
 * * Each element of matrix is either Y or N 
 * * Rows and Column sizes are equal 
 * * You are always your own friend, love yourself 
 * * Always two way friends, no liars
 * 
 * Input format: 
 * String[]
 * 
 * Output format: 
 * integer
 * 
 * Sample input: 
 * String[] library = new String[]{"4", "YYNN", "YYYN", "NYYN", "NNNY"};
 * Looks like:
 * YYNN
 * YYYN
 * NYYN
 * NNNY
 * 
 * Sample output: 
 * First group - 
 * 	2 - because 1st and 2nd are direct friends. 
 * 	2nd and 3rd are direct friends making 1st and 3rd indirect friends. 
 * Second group -
 * 	4 is a friend on his own.
 *
 */
public class FriendCirclesUnion {
	private static final Logger log = LoggerFactory.getLogger(FriendCirclesUnion.class);

	public class UnionSearch {
		int[] parentsList;
		int numberOfCircles = 0;

		public UnionSearch(int num) {
			this.numberOfCircles = num; // assume nobody has friends to start with
			this.parentsList = new int[num];

			// init the list
			for (int i = 0; i < num; i++) {
				parentsList[i] = i;
			}
		}

		public int findParents(int p) {
			while (p != parentsList[p]) {
				// reduce comparisons
				parentsList[p] = parentsList[parentsList[p]];
				p = parentsList[p];
			}
			log.debug("p index found: " + p);
			return p;
		}

		public boolean isLinked(int p1, int p2) {
			boolean result = findParents(p1) == findParents(p2);
			log.debug("Index: " + p1 + " & " + p2 + " are linked: " + result);
			return result;
		}

		public boolean union(int p1, int p2) {
			if (!isLinked(p1, p2)) {
				for (int i = 0; i < parentsList.length; i++) {
					if (parentsList[i] == findParents(p2)) {
						parentsList[i] = findParents(p1);
					}
				}
				numberOfCircles--;
				return true;
			}
			return false;
		}
	}

	public int getFriendCircles(String[] friends) {
		UnionSearch search = new UnionSearch(friends.length);
		for (int i = 0; i < friends.length; ++i) {
			for (int j = 0; j < friends[i].length(); ++j) {
				if (i != j && friends[i].charAt(j) == 'Y')
					search.union(i, j);
			}
		}
		return search.numberOfCircles;
	}

}
