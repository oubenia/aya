/**
 * 
 */
package fr.isika.coursgit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rhona
 *
 */
public class App01 {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App01 app01 = new App01();
		app01.m();
	}
	
	void m() {
		int i = 10;
		log.info("Méthode m avec i = {}", i);
	}

}