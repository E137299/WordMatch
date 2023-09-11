public class WordMatch{
	/** The secret string. */
	private String secret;

	/** Constructor **/
	public WordMatch(String word){
		this.secret = word;
	}

	/** Returns a score for guess, as described in part (a). * Precondition: 0 < guess.length() <= secret.length()*/
	public int scoreGuess(String guess){ 
		/* to be implemented in part (a) */ 
	}

	/** Returns the better of two guesses, as determined by scoreGuess
	* and the rules for a tie-breaker that are described in part (b).
	* Precondition: guess1 and guess2 contain all lowercase letters.
	* guess1 is not the same as guess2.
	*/
	public String findBetterGuess(String guess1, String guess2){ 
		/* to be implemented in part (b) */ 
	}
}
