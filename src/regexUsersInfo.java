import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUsersInfo {

    public static void main(String[] args) {
        String usersInput = """
                One can cook on and with an open fire. These are some of the Paquito Gonzales ways to cook with fire outside.
                 Cooking meat using 1994-jan-13 a spit is a great way to evenly cook meat.
                 In order to keep meat from burning, 0931392355 it's best to slowly rotate it. Hot stones can be used to toast bread.
                 Coals are hot and can bring things to a boil quickly. If one is very adventurous, one can make a hole in the ground,
                  fill it with coals and place alex@gmail.ru foil-covered meat,  veggies, and potatoes into the coals, and cover all of it with dirt.
                  In a short period of time, the food will be baked. Campfire cooking can be done in many ways.""";

        String usersInput2 = "Pedro Castro 1898.feb.28 0931392355 alex@verycool.net.au";

        System.out.println(regexNameCheck(usersInput) + " " + regexBirthdayCheck(usersInput) + " " + regexPhoneCheck(usersInput) + " " + regexEmailCheck(usersInput));
    }

    public static String regexNameCheck(String usersInput) {
        String result = "";
        Pattern namePattern = Pattern.compile("\\b[A-Z][A-Za-z]+ [A-Z][A-Za-z]+\\b", Pattern.MULTILINE);
        Matcher nameMatcher = namePattern.matcher(usersInput);
        while (nameMatcher.find()) {
            result = nameMatcher.group();//it groups all it found and returns that
        }

        return result;
    }

    public static String regexBirthdayCheck(String usersInput) {
        String result = "";
        Pattern birthdayPattern = Pattern.compile("\\b((19|2[0-9])[0-9]{2})(-| |.)([A-Za-z]{3,9}|(0?[1-9]|1?[012]))(-| |.)(0?[1-9]|[12][0-9]|3[01])\\b", Pattern.MULTILINE);
        Matcher birthdayMatcher = birthdayPattern.matcher(usersInput);
        while (birthdayMatcher.find()) {
            result = birthdayMatcher.group();

        }
        return result;
    }

    public static String regexPhoneCheck(String usersInput) {
        String result = "";
        Pattern phonePattern = Pattern.compile("((?:(\\+\\d{1,4})?)[ -]?\\(?(\\d{3})\\)?[ -]?(\\d{3})[ -]?(\\d{4}))", Pattern.MULTILINE);
        Matcher phoneMatcher = phonePattern.matcher(usersInput);
        while (phoneMatcher.find()) {
            result = phoneMatcher.group();

        }
        return result;

    }

    public static String regexEmailCheck(String usersInput) {
        String result = "";
        Pattern emailPattern = Pattern.compile("([a-zA-Z0-9._-]+@[A-Za-z]{2,}\\.[A-Za-z]{2,3}\\.?([A-Za-z]{2,3})?)", Pattern.MULTILINE);
        Matcher emailMatcher = emailPattern.matcher(usersInput);
        while (emailMatcher.find()) {
            result = emailMatcher.group();

        }
        return result;
    }
}



