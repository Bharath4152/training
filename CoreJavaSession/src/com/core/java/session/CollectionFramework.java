package com.core.java.session;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Java Collection means a single unit of objects. Java Collection framework
 * provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList,
 * Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet)
 * 
 * HashMap also a part of Collection
 * 
 * @author tamil
 *
 */
public class CollectionFramework {

	public static void main(String[] args) {
		/** List **/
		listExample();

		/** Set **/
		setExample();

		/** Map **/
		mapExample();

		/** Queue **/
		queueExample();
	}

	/** List **/
	private static void listExample() {
		Dog dog1 = new Dog("Puppy");
		Dog dog2 = new Dog("Johnny");
		Dog dog3 = new Dog("Puppy");
		Dog dog4 = new Dog("Johnny");
		Dog dog5 = new Dog("Rosi");

		ArrayList<Dog> dogs = new ArrayList<Dog>();

		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		dogs.add(dog5);

		System.out.println(dogs);

	}

	/** Set **/
	private static void setExample() {
		Dog dog1 = new Dog("Puppy");
		Dog dog2 = new Dog("Johnny");
		Dog dog3 = new Dog("Puppy");
		Dog dog4 = new Dog("Johnny");
		Dog dog5 = new Dog("Rosi");

		HashSet<Dog> dogs = new HashSet<Dog>();

		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		dogs.add(dog5);

		System.out.println(dogs);
	}

	/** Map **/
	private static void mapExample() {
		HashMap<String, Dog> dogs = new HashMap<>();
		Dog dog1 = new Dog("Puppy");
		Dog dog2 = new Dog("Johnny");
		Dog dog3 = new Dog("Rosi");

		String key_one = "one";
		String key_two = "two";
		String key_three = "three";

		// use put() method in HashMap to add objects by specifying key
		dogs.put(key_one, dog1);
		dogs.put(key_two, dog2);
		dogs.put(key_three, dog3);

		System.out.println(dogs);

		// Taking out object from the by specifying the key
		Dog dog = dogs.get("three");
		System.out.println("Name -> " + dog.getName());

	}

	/** Queue **/
	private static void queueExample() {
		/** Double ended queue **/
		Deque<String> queue = new ArrayDeque<>();
		queue.add("Puppy");
		queue.add("Johnny");
		queue.add("Rosi");
		queue.add("Jimmy");
		queue.add("Walter");
		System.out.println("head:" + queue.element()); // throws exception if queue is empty
		System.out.println("head:" + queue.peek()); // returns null if queue is empty
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
