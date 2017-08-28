package com.jys.practice;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jys.practice.circle.FriendCirclesUnion;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
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
			
			log.info("Using union find: ");
			FriendCirclesUnion friendsCircle = new FriendCirclesUnion();
			int numberOfFriendCircles = friendsCircle.getFriendCircles(friends);
			System.out.println(numberOfFriendCircles);
			
			log.info("Using bfs find: ");
		}
	}
}
