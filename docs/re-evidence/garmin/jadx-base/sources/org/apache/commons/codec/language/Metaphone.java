package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class Metaphone implements StringEncoder {
    private static final String FRONTV = "EIY";
    private static final String VARSON = "CSPTG";
    private static final String VOWELS = "AEIOU";
    private int maxCodeLen = 4;

    private boolean isLastChar(int i14, int i15) {
        return i15 + 1 == i14;
    }

    private boolean isNextChar(StringBuilder sb3, int i14, char c14) {
        return i14 >= 0 && i14 < sb3.length() - 1 && sb3.charAt(i14 + 1) == c14;
    }

    private boolean isPreviousChar(StringBuilder sb3, int i14, char c14) {
        return i14 > 0 && i14 < sb3.length() && sb3.charAt(i14 - 1) == c14;
    }

    private boolean isVowel(StringBuilder sb3, int i14) {
        return VOWELS.indexOf(sb3.charAt(i14)) >= 0;
    }

    private boolean regionMatch(StringBuilder sb3, int i14, String str) {
        if (i14 < 0 || (str.length() + i14) - 1 >= sb3.length()) {
            return false;
        }
        return sb3.substring(i14, str.length() + i14).equals(str);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return metaphone((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isMetaphoneEqual(String str, String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    /* JADX WARN: Code duplicated, block: B:131:0x020d  */
    public String metaphone(String str) {
        int length;
        boolean z14;
        if (str == null || (length = str.length()) == 0) {
            return "";
        }
        boolean z15 = true;
        if (length == 1) {
            return str.toUpperCase(Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(Locale.ENGLISH).toCharArray();
        StringBuilder sb3 = new StringBuilder(40);
        StringBuilder sb4 = new StringBuilder(10);
        int i14 = 0;
        char c14 = charArray[0];
        if (c14 != 'A') {
            if (c14 == 'G' || c14 == 'K' || c14 == 'P') {
                if (charArray[1] == 'N') {
                    sb3.append(charArray, 1, charArray.length - 1);
                } else {
                    sb3.append(charArray);
                }
            } else if (c14 == 'W') {
                char c15 = charArray[1];
                if (c15 == 'R') {
                    sb3.append(charArray, 1, charArray.length - 1);
                } else if (c15 == 'H') {
                    sb3.append(charArray, 1, charArray.length - 1);
                    sb3.setCharAt(0, 'W');
                } else {
                    sb3.append(charArray);
                }
            } else if (c14 != 'X') {
                sb3.append(charArray);
            } else {
                charArray[0] = 'S';
                sb3.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            sb3.append(charArray, 1, charArray.length - 1);
        } else {
            sb3.append(charArray);
        }
        int length2 = sb3.length();
        while (sb4.length() < getMaxCodeLen() && i14 < length2) {
            char cCharAt = sb3.charAt(i14);
            if (cCharAt == 'C' || !isPreviousChar(sb3, i14, cCharAt)) {
                z14 = z15;
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if (i14 == 0) {
                            sb4.append(cCharAt);
                        }
                        break;
                    case 'B':
                        if (!isPreviousChar(sb3, i14, 'M') || !isLastChar(length2, i14)) {
                            sb4.append(cCharAt);
                        }
                        break;
                    case 'C':
                        if (!isPreviousChar(sb3, i14, 'S') || isLastChar(length2, i14) || FRONTV.indexOf(sb3.charAt(i14 + 1)) < 0) {
                            if (regionMatch(sb3, i14, "CIA")) {
                                sb4.append('X');
                            } else if (!isLastChar(length2, i14) && FRONTV.indexOf(sb3.charAt(i14 + 1)) >= 0) {
                                sb4.append('S');
                            } else if ((isPreviousChar(sb3, i14, 'S') && isNextChar(sb3, i14, 'H')) || !isNextChar(sb3, i14, 'H') || (i14 == 0 && length2 >= 3 && isVowel(sb3, 2))) {
                                sb4.append('K');
                            } else {
                                sb4.append('X');
                            }
                        }
                        break;
                    case 'D':
                        if (!isLastChar(length2, i14 + 1) && isNextChar(sb3, i14, 'G')) {
                            int i15 = i14 + 2;
                            if (FRONTV.indexOf(sb3.charAt(i15)) < 0) {
                                sb4.append('T');
                            } else {
                                sb4.append('J');
                                i14 = i15;
                            }
                        } else {
                            sb4.append('T');
                        }
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'R':
                        sb4.append(cCharAt);
                        break;
                    case 'G':
                        int i16 = i14 + 1;
                        if ((!isLastChar(length2, i16) || !isNextChar(sb3, i14, 'H')) && ((isLastChar(length2, i16) || !isNextChar(sb3, i14, 'H') || isVowel(sb3, i14 + 2)) && (i14 <= 0 || (!regionMatch(sb3, i14, "GN") && !regionMatch(sb3, i14, "GNED"))))) {
                            boolean zIsPreviousChar = isPreviousChar(sb3, i14, 'G');
                            if (isLastChar(length2, i14) || FRONTV.indexOf(sb3.charAt(i16)) < 0 || zIsPreviousChar) {
                                sb4.append('K');
                            } else {
                                sb4.append('J');
                            }
                        }
                        break;
                    case 'H':
                        if (!isLastChar(length2, i14) && ((i14 <= 0 || VARSON.indexOf(sb3.charAt(i14 - 1)) < 0) && isVowel(sb3, i14 + 1))) {
                            sb4.append('H');
                        }
                        break;
                    case 'K':
                        if (i14 <= 0 || !isPreviousChar(sb3, i14, 'C')) {
                            sb4.append(cCharAt);
                        }
                        break;
                    case 'P':
                        if (!isNextChar(sb3, i14, 'H')) {
                            sb4.append(cCharAt);
                        } else {
                            sb4.append('F');
                        }
                        break;
                    case 'Q':
                        sb4.append('K');
                        break;
                    case 'S':
                        if (regionMatch(sb3, i14, "SH") || regionMatch(sb3, i14, "SIO") || regionMatch(sb3, i14, "SIA")) {
                            sb4.append('X');
                        } else {
                            sb4.append('S');
                        }
                        break;
                    case 'T':
                        if (regionMatch(sb3, i14, "TIA") || regionMatch(sb3, i14, "TIO")) {
                            sb4.append('X');
                        } else if (!regionMatch(sb3, i14, "TCH")) {
                            if (!regionMatch(sb3, i14, "TH")) {
                                sb4.append('T');
                            } else {
                                sb4.append('0');
                            }
                        }
                        break;
                    case 'V':
                        sb4.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!isLastChar(length2, i14) && isVowel(sb3, i14 + 1)) {
                            sb4.append(cCharAt);
                        }
                        break;
                    case 'X':
                        sb4.append('K');
                        sb4.append('S');
                        break;
                    case 'Z':
                        sb4.append('S');
                        break;
                }
            } else {
                z14 = z15;
            }
            i14++;
            if (sb4.length() > getMaxCodeLen()) {
                sb4.setLength(getMaxCodeLen());
            }
            z15 = z14;
        }
        return sb4.toString();
    }

    public void setMaxCodeLen(int i14) {
        this.maxCodeLen = i14;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return metaphone(str);
    }
}
