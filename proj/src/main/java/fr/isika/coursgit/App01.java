/**
 * 
 */
package fr.isika.coursgit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rhona
 * Modif locale avec Eclipse nouveau
 * Modif direct sur la master
 * modif oubenia
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
		// i vaut maintenant 99
		int i = 99;
		log.info("Méthode m avec i = {}", i);
	}

}
