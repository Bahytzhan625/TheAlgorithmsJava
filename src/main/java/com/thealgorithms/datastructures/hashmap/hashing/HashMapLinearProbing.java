package main.java.com.thealgorithms.datastructures.hashmap.hashing;

import java.util.*;

/**
 * This class is an implementation of a hash table using linear probing It uses
 * a dynamic array to lengthen the size of the hash table when load factor > .7
 */
public class HashMapLinearProbing {

	private int hsize; // size of the hash table
	private Integer[] buckets; // array representing the table
	private Integer AVAILABLE;
	private int size; // amount of elements in the hash table

	/**
	 * Constructor initializes buckets array, hsize, and creates dummy object
	 * for AVAILABLE
	 *
	 * @param hsize the desired size of the hash map
	 */
	public HashMapLinearProbing(int hsize) {
		this.buckets = new Integer[hsize];
		this.hsize = hsize;
		this.AVAILABLE = Integer.MIN_VALUE;
		this.size = 0;
	}

	/**
	 * The Hash Function takes a given key and finds an index based on its data
	 *
	 * @param key the desired key to be converted
	 * @return int an index corresponding to the key
	 */
	public int hashing(int key) {
		int hash = key % hsize;
		if (hash < 0) {
			hash += hsize;
		}
		return hash;
	}

	/**
	 * inserts the key into the hash map by wrapping it as an Integer object
	 *
	 * @param key the desired key to be inserted in the hash map
	 */
	public void insertHash(int key) {
		khvvkvk
	}
}
