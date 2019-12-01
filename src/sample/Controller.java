package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField textTaken;
    @FXML
    Label aNumber;
    @FXML
    Label eNumber;
    @FXML
    Label iNumber;
    @FXML
    Label oNumber;
    @FXML
    Label uNumber;
    @FXML
    Label totalNumber;
    @FXML
    Button findButton;


    public int countVowel()
    {

        String word = textTaken.getText();

        int vowel = 0;
        int i = 0;
        word = word.toLowerCase();

        int aVowel = 0;
        int eVowel = 0;
        int iVowel = 0;
        int oVowel = 0;
        int uVowel = 0;

        while (i < word.length())
        {
            if (word.charAt(i) == 'a')
            {
                aVowel++;
                vowel++;
            }

            else if (word.charAt(i) == 'e')
            {
                eVowel++;
                vowel++;
            }
            else if (word.charAt(i) == 'i')
            {
                iVowel++;
                vowel++;
            }
            else if (word.charAt(i) == 'o')
            {
                oVowel++;
                vowel++;
            }
            else if (word.charAt(i) == 'u')
            {
                uVowel++;
                vowel++;
            }

            i++;
        }
//
//        System.out.println("A: " + aVowel);
//        System.out.println("E: " + eVowel);
//        System.out.println("I: " + iVowel);
//        System.out.println("O: " + oVowel);
//        System.out.println("U: " + uVowel);
//        System.out.println("Total Vowels: " + vowel);
//

        aNumber.setText(String.valueOf(aVowel));
        eNumber.setText(String.valueOf(eVowel));
        iNumber.setText(String.valueOf(iVowel));
        oNumber.setText(String.valueOf(oVowel));
        uNumber.setText(String.valueOf(uVowel));
        totalNumber.setText(String.valueOf(vowel));
        return vowel;
    }
}
