BSTStringSet.java:

public class BSTSTringSet implement Iterable{
	void put()
	boolean contains()
	Iterator<String> iterator(){
		return new BSTIterator()
	}
	private class BSTIterator implements Iterator{
	 //...
	 	next()
	 	hasNext()
	 	helper:addTree()
	 	helper var: stack
	}

	Iterator<String> iterator(low, high){
		returb new ....()
	}

	private class BSTRangItertor implements Iterator{
		next()
		hasNext()
		
	}

}

interface iterabke
{
	iterator()
}
Iterable
->iterator()
->subclass: implements Iterator
	->next()
	->hasNext()