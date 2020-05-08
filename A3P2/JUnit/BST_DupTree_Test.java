import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BST_DupTree_Test {

	static DupTree dtr;
	static List<Integer> al = new ArrayList<Integer>();
	static Random r = new Random();

	@BeforeAll
	public static void setup() {
	 	// code to be filled in by you
	}

	@AfterEach
	void check_invariant() {
		// code to be filled in by you
	}
	
	@Test
	void test_insert() {
		// code to be filled in by you 
	}
	
	@Test
	void test_delete() {
		// code to be filled in by you
	}		

	public int get_count(DupTree tr, int v) {
		// code to be filled in by you 
	}

	public boolean ordered(Tree tr) {
		// code to be filled in by you
	}
}