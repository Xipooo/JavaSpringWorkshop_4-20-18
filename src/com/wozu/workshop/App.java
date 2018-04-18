package com.wozu.workshop;

import com.wozu.workshop.namecollector.NameCollector;

public class App {

	public static void main(String[] args) {
		NameCollector nameCollector = new NameCollector();
		nameCollector.AddName("Tina");
		String[] names = nameCollector.GetNames();
		int i = 1;
		while (i++ <= names.length) {
			System.out.println(names[i]);
		}
	}
}
