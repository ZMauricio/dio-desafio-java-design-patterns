package one.digitalinnovation.gof.iterator;

/*
 * Referência: Iterator Pattern. Disponível em: https://www.javatpoint.com/iterator-pattern
 * */
public class Colecao implements Container {
	public String elementos[] = {"Maria", "Duda", "Tonika", "Lilika"};

	@Override
	public Iterator getIterator() {
		return new ColecaoIterate();
	}
	
	private class ColecaoIterate implements Iterator {
		int i = 0;
		
		public boolean hasNext() {
			if (i < elementos.length) {
				return true;
			}
			
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
			 return elementos[i++];
			}
			
			return null;
		}
		
	}
}
