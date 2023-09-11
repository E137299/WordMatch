# WordMatch

SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.

- Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
- Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods are called only when their preconditions are satisfied.
- In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.
 
This question involves the WordMatch class, which stores a secret string and provides methods that compare other strings to the secret string. You will write two methods in the WordMatch class.
```java
public class WordMatch

{

/** The secret string. */

private String secret;

 

/** Constructs a WordMatch object with the given secret string

* of lowercase letters.

*/

public WordMatch(String word)

{

/* implementation not shown */

}

 

/** Returns a score for guess, as described in part (a).

* Precondition: 0 < guess.length() <= secret.length()

*/

public int scoreGuess(String guess)

{ /* to be implemented in part (a) */ }

 

/** Returns the better of two guesses, as determined by scoreGuess

* and the rules for a tie-breaker that are described in part (b).

* Precondition: guess1 and guess2 contain all lowercase letters.

* guess1 is not the same as guess2.

*/

public String findBetterGuess(String guess1, String guess2)

{ /* to be implemented in part (b) */ }

}
```

## (a) 
Write the WordMatch method scoreGuess. To determine the score to be returned, scoreGuess finds the number of times that guess occurs as a substring of secret and then multiplies that number by the square of the length of guess. Occurrences of guess may overlap within secret.

Assume that the length of guess is less than or equal to the length of secret and that guess is not an empty string.

The following examples show declarations of a WordMatch object. The tables show the outcomes of some possible calls to the scoreGuess method.
```java
WordMatch game = new WordMatch("mississippi");
```
![WordMatch1](assets/WordMatch1.PNG)
```java
WordMatch game = new WordMatch("aaaabb");
```
![WordMatch1](assets/WordMatch2.PNG)

Complete the scoreGuess method.
```java
/** Returns a score for guess, as described in part (a).

* Precondition: 0 < guess.length() <= secret.length()

*/

public int scoreGuess(String guess)
```


## (b) 
Write the WordMatch method findBetterGuess, which returns the better guess of its two String parameters, guess1 and guess2. If the scoreGuess method returns different values for guess1 and guess2, then the guess with the higher score is returned. If the scoreGuess method returns the same value for guess1 and guess2, then the alphabetically greater guess is returned.

The following example shows a declaration of a WordMatch object and the outcomes of some possible calls to the scoreGuess and findBetterGuess methods.
```java
WordMatch game = new WordMatch("concatenation");
```
![WordMatch3](assets/WordMatch3.PNG)
Complete method findBetterGuess.

Assume that scoreGuess works as specified, regardless of what you wrote in part (a). You must use scoreGuess appropriately to receive full credit.
```java
/** Returns the better of two guesses, as determined by scoreGuess

* and the rules for a tie-breaker that are described in part (b).

* Precondition: guess1 and guess2 contain all lowercase letters.

* guess1 is not the same as guess2.

*/

public String findBetterGuess(String guess1, String guess2)
```

  
