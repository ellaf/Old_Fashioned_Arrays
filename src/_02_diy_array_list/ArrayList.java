package _02_diy_array_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<E> implements List{

	Object[] kevin = new Object[10];
	int number = 0;
	
	@Override
	public int size() {
		
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		boolean tf = false;
		for (int i = 0; i < kevin.length; i++) {
			if (kevin[i] == o) {
				tf = true;
			}
		}
		
		return tf;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		boolean tf = false;
		kevin[number] = e;
		number ++;
		if(kevin[number -1] == e) {
		tf = true;
		}
		return tf;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		
		
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		E george = (E)kevin[index];
		System.out.println(george);
		return george;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		kevin[index] = element;
		
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public void addAt(int index, Object element) {
		// TODO Auto-generated method stub
	
	int realLength = 0;
		for (int i = 0; i < kevin.length; i++) {
		if (kevin[i] != null) {
			realLength ++;
		}
	}
	Object[] patricia = new Object[kevin.length];
	for (int i = 0; i < index; i++) {
	patricia[i] = kevin[i];
	}
	patricia[index] = element;
	for (int i = index+1; i < kevin.length; i++) {
	patricia[i] = kevin[i-1];
	}
	for (int i = 0; i < realLength+1; i++) {
	kevin[i] = patricia[i];
	}
	
	}
	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		
		int realVal = 0;
		for (int i = 0; i < kevin.length; i++) {
			if (kevin[i] != null) {
				realVal ++;
			}
		}
		Object[] calvin = new Object[kevin.length-1];
		for (int i = 0; i < index; i++) {
			calvin[i] = kevin[i];
		}
		for (int i = index; i < realVal; i++) {
			calvin[i] = kevin[i+1];
		}
		for (int i = 0; i < calvin.length; i++) {
			kevin[i]=calvin[i];
		}
		kevin[calvin.length] = null;
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		
		
		return null;
	}



}
