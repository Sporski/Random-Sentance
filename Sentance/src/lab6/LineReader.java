package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class LineReader implements Iterator<String>, Iterable<String> {
	private Scanner _scan;
	public LineReader(String filename) {
		try {
			_scan = new Scanner(new File(filename));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	@Override public boolean hasNext() {
		return _scan.hasNext();
	}
	@Override public String next() {
		return _scan.nextLine();
	}
	@Override public void remove() {
		throw new UnsupportedOperationException();
	}
	@Override public Iterator<String> iterator() {
		return this;
	}

}
