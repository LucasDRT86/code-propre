package ex1;

import java.util.Date;


/** Classe utiliser pour enregister une nouvelle entreprise*/
public class entreprise {

	/** numéro de siret*/
	public int Siret;
	
	/** Nom de l'entreprise*/
	public String Nom;
	
	/** Adresse de l'entreprise*/
	public String adresse;
	
	/** Date de céation de l'entreprise*/
	public Date date_Creation;
	
	/**  Le capital de l'entreprise*/
	public static final int capital = 3000000;
	
	/** Constructeur de la classe entreprise
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param date_Creation
	 */
	public entreprise(int siret, String nom, String adresse, Date date_Creation) {
		Siret = siret;
		Nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;
	}



	/** Méthodes pour afficher les caractéristique de l'entreprise
	 * @return String
	 * */
	
	
	public String afficherStatut() {
		return "Siret=" + Siret + ", Nom=" + Nom + ", adresse=" + adresse + ", date_Creation="
				+ date_Creation;
	}
	
 
	/** getter de siret
	 * @return the siret
	 */
	public int getSiret() {
		return Siret;
	}

	/** getter de nom
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}

	/** setter de nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}

	/** getter d'adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** setter d'adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** getter de date de création
	 * @return the date_Creation
	 */
	public Date getDate_Creation() {
		return date_Creation;
	}


	/** Getter de capital
	 * @return the capital
	 */
	public static int getCapital() {
		return capital;
	}
	
	
}
