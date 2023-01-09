package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        int code = (int) character;
        if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
            if (character == 'a') {
                System.out.println("Vowel");
            } else {
                if (character == 'e') {
                    System.out.println("Vowel");
                } else {
                    if (character == 'i') {
                        System.out.println("Vowel");
                    } else {
                        if (character == 'o') {
                            System.out.println("Vowel");
                        } else {
                            if (character == 'y') {
                                System.out.println("Vowel");
                            } else {
                                if (character == 'u') {
                                    System.out.println("Vowel");
                                } else {
                                    if (character == 'w') {
                                        System.out.println("Vowel");
                                    } else {
                                        System.out.println("Consonant");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("wrong alphabet!");
        }

    }
}
