package service;

import java.util.List;
import java.util.ArrayList;

public class ServicoDeImpressao<T> {
	List<T> list = new ArrayList<>();

	public void addValue(T numDigitado) {

		list.add(numDigitado);

	}

	public T primeiroNumero() {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("Lista está vazia");

		} else
			return list.get(0);

	}

	public void print() {

		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));

		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print("," + list.get(i));

		}
		System.out.println("]");

	}

}