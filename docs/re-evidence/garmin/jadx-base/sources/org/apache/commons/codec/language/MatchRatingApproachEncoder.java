package org.apache.commons.codec.language;

import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import tn.k;

/* JADX INFO: loaded from: classes3.dex */
public class MatchRatingApproachEncoder implements StringEncoder {
    private static final String[] DOUBLE_CONSONANT = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", LocaleUnitResolver.ImperialCountryCode.MYANMAR, "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};
    private static final String EMPTY = "";
    private static final String PLAIN_ASCII = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final String SPACE = " ";
    private static final String UNICODE = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";

    public String cleanName(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String[] strArr = {"\\-", "[&]", "\\'", "\\.", "[\\,]"};
        for (int i14 = 0; i14 < 5; i14++) {
            upperCase = upperCase.replaceAll(strArr[i14], "");
        }
        return removeAccents(upperCase).replaceAll("\\s+", "");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final String encode(String str) {
        if (str != null && !"".equalsIgnoreCase(str) && !" ".equalsIgnoreCase(str) && str.length() != 1) {
            String strCleanName = cleanName(str);
            if (!" ".equals(strCleanName) && !strCleanName.isEmpty()) {
                String strRemoveVowels = removeVowels(strCleanName);
                if (!" ".equals(strRemoveVowels) && !strRemoveVowels.isEmpty()) {
                    return getFirst3Last3(removeDoubleConsonants(strRemoveVowels));
                }
            }
        }
        return "";
    }

    public String getFirst3Last3(String str) {
        int length = str.length();
        return length > 6 ? str.substring(0, 3).concat(str.substring(length - 3, length)) : str;
    }

    public int getMinRating(int i14) {
        if (i14 <= 4) {
            return 5;
        }
        if (i14 <= 7) {
            return 4;
        }
        if (i14 <= 11) {
            return 3;
        }
        return i14 == 12 ? 2 : 1;
    }

    public boolean isEncodeEquals(String str, String str2) {
        if (str != null && !"".equalsIgnoreCase(str) && !" ".equalsIgnoreCase(str) && str2 != null && !"".equalsIgnoreCase(str2) && !" ".equalsIgnoreCase(str2) && str.length() != 1 && str2.length() != 1) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
            String strCleanName = cleanName(str);
            String strCleanName2 = cleanName(str2);
            String strRemoveVowels = removeVowels(strCleanName);
            String strRemoveVowels2 = removeVowels(strCleanName2);
            String strRemoveDoubleConsonants = removeDoubleConsonants(strRemoveVowels);
            String strRemoveDoubleConsonants2 = removeDoubleConsonants(strRemoveVowels2);
            String first3Last3 = getFirst3Last3(strRemoveDoubleConsonants);
            String first3Last4 = getFirst3Last3(strRemoveDoubleConsonants2);
            if (Math.abs(first3Last3.length() - first3Last4.length()) >= 3) {
                return false;
            }
            if (leftToRightThenRightToLeftProcessing(first3Last3, first3Last4) >= getMinRating(Math.abs(first3Last4.length() + first3Last3.length()))) {
                return true;
            }
        }
        return false;
    }

    public boolean isVowel(String str) {
        return str.equalsIgnoreCase("E") || str.equalsIgnoreCase("A") || str.equalsIgnoreCase("O") || str.equalsIgnoreCase("I") || str.equalsIgnoreCase("U");
    }

    public int leftToRightThenRightToLeftProcessing(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int i14 = 0;
        while (i14 < charArray.length && i14 <= length2) {
            int i15 = i14 + 1;
            String strSubstring = str.substring(i14, i15);
            int i16 = length - i14;
            String strSubstring2 = str.substring(i16, i16 + 1);
            String strSubstring3 = str2.substring(i14, i15);
            int i17 = length2 - i14;
            String strSubstring4 = str2.substring(i17, i17 + 1);
            if (strSubstring.equals(strSubstring3)) {
                charArray[i14] = ' ';
                charArray2[i14] = ' ';
            }
            if (strSubstring2.equals(strSubstring4)) {
                charArray[i16] = ' ';
                charArray2[i17] = ' ';
            }
            i14 = i15;
        }
        String strReplaceAll = new String(charArray).replaceAll("\\s+", "");
        String strReplaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        return strReplaceAll.length() > strReplaceAll2.length() ? Math.abs(6 - strReplaceAll.length()) : Math.abs(6 - strReplaceAll2.length());
    }

    public String removeAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            int iIndexOf = UNICODE.indexOf(cCharAt);
            if (iIndexOf > -1) {
                sb3.append(PLAIN_ASCII.charAt(iIndexOf));
            } else {
                sb3.append(cCharAt);
            }
        }
        return sb3.toString();
    }

    public String removeDoubleConsonants(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : DOUBLE_CONSONANT) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    public String removeVowels(String str) {
        String strSubstring = str.substring(0, 1);
        String strReplaceAll = str.replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replaceAll("\\s{2,}\\b", " ");
        return isVowel(strSubstring) ? k.g(strSubstring, strReplaceAll) : strReplaceAll;
    }

    @Override // org.apache.commons.codec.Encoder
    public final Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }
}
