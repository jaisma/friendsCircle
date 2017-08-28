package com.jys.practice;

import java.util.Scanner;

import com.jys.practice.circle.FriendsCircle;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input size:");
			int matrixSize = Integer.parseInt(scanner.nextLine());
			String[] friends = new String[matrixSize];
			System.out.println("Friends:");
			for (int i = 0; i < matrixSize; ++i) {
				// create string[] of input. assume good input
				friends[i] = scanner.nextLine();
			}
			FriendsCircle friendsCircle = new FriendsCircle();
			int numberOfFriendCircles = friendsCircle.getFriendsCircle(friends);
			System.out.println(numberOfFriendCircles);
		}
	}
}
