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
public class FriendCirclesBFS {
	private static final Logger log = LoggerFactory.getLogger(FriendCirclesBFS.class);

	public int getFriendsCircle(String[] friends) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
