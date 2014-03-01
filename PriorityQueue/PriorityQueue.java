/**	Ajayveer Aujla 6595863*/
/** Vic */
/** Friday, March 7, 2014 */
/** SOEN 331 Assignment 2 */
package PriorityQueue;

@invariant("$this.size>=3")
public class PriorityQueue implements PriorityQueueADT {

	private int size = 0;

	@ensures({ "this.collection != null" })
	public PriorityQueue(int size) {
		this.size = size;
		// this.collection = new Object[size];
	}

	@requires({ "true" })
	@ensures({ "$result >= 3" })
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return true;
	}

	/** HELPER FUNCTION */
	public boolean isFull() {
		return true;
	}

	/** HELPER FUNCTION */

	@requires({ "key != null", "$this.isFull() == false" })
	@ensures({ "$this.colection.contains(element)",
			"$this.size() == $old($this.size()) + 1" })
	public void insert(int key, String element) {
	}

	@requires({ "$this.isEmpty() == false" })
	@ensures({ "$result != null" })
	public String getMax() {
		return "abc";
	}

	@ensures({ "$result != null", "$result == $old($this.top)",
			"$this.size() == $old($this.size()) - 1" })
	public String remove() {
		return "abc";
	}
}
