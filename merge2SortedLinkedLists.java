package mergeTwoSortedLinkedLists;

import java.util.LinkedList;

public class merge2SortedLinkedLists {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		
		
		//l1.remove(0);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		l2.add(2);
		l2.add(4);
		l2.add(6);
		System.out.println("Input 1: "+l1);
		System.out.println("Input 2: "+l2);
		System.out.println(mergeLinkedLists(l1, l2));
		//mergeLinkedLists(l1, l2);

	}
	
	public static LinkedList<Integer> mergeLinkedLists(LinkedList<Integer> a, LinkedList<Integer> b){
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		int  countSize = Math.max(a.size(), b.size()), i = 0;
		int addVal = 0;
		while(i < countSize) {
			if(a.size() > 0 && b.size() >0) {
				if(a.get(0) < b.get(0)) {
					addVal = a.get(0);
					result.add(addVal);
					a.remove(0);
					//System.out.println("If 1 of If 1: "+result);
				}else if(a.get(0) > b.get(0)) {
					addVal = b.get(0);
					result.add(addVal);
					b.remove(0);
					//System.out.println("If 2 of If 1: "+result);
				}else if(a.get(0) == b.get(0)) {
					addVal = a.get(0);
					result.add(addVal);
					result.add(addVal);
					a.remove(0);
					b.remove(0);
					//System.out.println("If 3 of If 1: "+result);
				}
				
			}else if(a.size() > 0 && b.size() ==0) {
				addVal = a.get(0);
				result.add(addVal);
				a.remove(0);
				//System.out.println("If 1 of If 2: "+result);
			}else if(a.size() == 0 && b.size() >0) {
				addVal = b.get(0);
				result.add(addVal);
				b.remove(0);
				//System.out.println("If 1 of If 3: "+result);
			}else {
				//do nothing
			}
			
			countSize++;
		}
		
		
		
		return result;
	}
	
	public static void popVal(LinkedList<Integer> popList, int x) {
		if(popList.size() >0 && popList.get(0) < x) {
			popList.remove(0);
		}
	}

}
