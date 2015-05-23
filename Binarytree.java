
public class Binarytree<T extends Comparable<T> > {
	
	/**
	 * The Node of the Tree.
	 */
	private TreeNode<T> node;
	
	/**
	 * Local class for the Nodes of the Binary-Tree.
	 * Is made of the Element, which should be saved, and two references to the next Parts of the Binary-Tree.
	 * @author nikita
	 *
	 * @param <T> The element of Type T.
	 */
	private class TreeNode<T extends Comparable<T>> {
		
		private T element;
		
		private Binarytree<T> righttree;
		private Binarytree<T> lefttree;
		
		public TreeNode(T element) {
			
			this.element = element;
			this.righttree = null;
			this.lefttree = null;
			
		}
	}
	
	
	/**
	 * Constructs a new Binary-Tree with an Element in the root.
	 * @param element An unspecified element
	 */
	public Binarytree(T element) {
		
		this.node = new TreeNode<T>(element);
	
	}
	
	

}



