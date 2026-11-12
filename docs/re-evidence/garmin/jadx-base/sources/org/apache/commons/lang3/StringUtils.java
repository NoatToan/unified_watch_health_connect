package org.apache.commons.lang3;

import i3.e5;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.apache.commons.lang3.function.ToBooleanBiFunction;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class StringUtils {
    public static final String CR = "\r";
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    public static final String LF = "\n";
    private static final int PAD_LIMIT = 8192;
    public static final String SPACE = " ";
    private static final int STRING_BUILDER_SIZE = 256;
    private static final Pattern STRIP_ACCENTS_PATTERN = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public static String abbreviate(String str, String str2, int i14, int i15) {
        if (isNotEmpty(str) && "".equals(str2) && i15 > 0) {
            return substring(str, 0, i15);
        }
        if (isAnyEmpty(str, str2)) {
            return str;
        }
        int length = str2.length();
        int i16 = length + 1;
        int i17 = length + length + 1;
        if (i15 < i16) {
            e.s("Minimum abbreviation width is %d", new Object[]{Integer.valueOf(i16)});
            return null;
        }
        int length2 = str.length();
        if (length2 <= i15) {
            return str;
        }
        if (i14 > length2) {
            i14 = length2;
        }
        int i18 = i15 - length;
        if (length2 - i14 < i18) {
            i14 = length2 - i18;
        }
        if (i14 <= i16) {
            return str.substring(0, i18).concat(str2);
        }
        if (i15 < i17) {
            e.s("Minimum abbreviation width with offset is %d", new Object[]{Integer.valueOf(i17)});
            return null;
        }
        if ((i15 + i14) - length >= length2) {
            return str2.concat(str.substring(length2 - i18));
        }
        StringBuilder sbK = e5.k(str2);
        sbK.append(abbreviate(str.substring(i14), str2, i18));
        return sbK.toString();
    }

    public static String abbreviateMiddle(String str, String str2, int i14) {
        if (isAnyEmpty(str, str2) || i14 >= str.length() || i14 < str2.length() + 2) {
            return str;
        }
        int length = i14 - str2.length();
        int i15 = length / 2;
        return str.substring(0, (length % 2) + i15) + str2 + str.substring(str.length() - i15);
    }

    private static String appendIfMissing(String str, CharSequence charSequence, boolean z14, CharSequence... charSequenceArr) {
        if (str == null || isEmpty(charSequence) || endsWith(str, charSequence, z14)) {
            return str;
        }
        if (ArrayUtils.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (endsWith(str, charSequence2, z14)) {
                    return str;
                }
            }
        }
        StringBuilder sbK = e5.k(str);
        sbK.append(charSequence.toString());
        return sbK.toString();
    }

    public static String appendIfMissingIgnoreCase(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return appendIfMissing(str, charSequence, true, charSequenceArr);
    }

    public static String capitalize(String str) {
        int iCodePointAt;
        int titleCase;
        int length = length(str);
        if (length == 0 || iCodePointAt == (titleCase = Character.toTitleCase((iCodePointAt = str.codePointAt(0))))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = titleCase;
        int iCharCount = Character.charCount(iCodePointAt);
        int i14 = 1;
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            iArr[i14] = iCodePointAt2;
            iCharCount += Character.charCount(iCodePointAt2);
            i14++;
        }
        return new String(iArr, 0, i14);
    }

    public static String center(String str, int i14, String str2) {
        if (str == null || i14 <= 0) {
            return str;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str.length();
        int i15 = i14 - length;
        return i15 <= 0 ? str : rightPad(leftPad(str, (i15 / 2) + length, str2), i14, str2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    public static String chomp(String str) {
        if (isEmpty(str)) {
            return str;
        }
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            return (cCharAt == '\r' || cCharAt == '\n') ? "" : str;
        }
        int length = str.length();
        int i14 = length - 1;
        char cCharAt2 = str.charAt(i14);
        if (cCharAt2 == '\n') {
            if (str.charAt(length - 2) == '\r') {
                length -= 2;
            } else {
                length = i14;
            }
        } else if (cCharAt2 == '\r') {
            length = i14;
        }
        return str.substring(0, length);
    }

    public static String chop(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i14 = length - 1;
        String strSubstring = str.substring(0, i14);
        if (str.charAt(i14) == '\n') {
            int i15 = length - 2;
            if (strSubstring.charAt(i15) == '\r') {
                return strSubstring.substring(0, i15);
            }
        }
        return strSubstring;
    }

    public static int compare(String str, String str2, boolean z14) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return z14 ? -1 : 1;
        }
        if (str2 == null) {
            return z14 ? 1 : -1;
        }
        return str.compareTo(str2);
    }

    public static int compareIgnoreCase(String str, String str2, boolean z14) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return z14 ? -1 : 1;
        }
        if (str2 == null) {
            return z14 ? 1 : -1;
        }
        return str.compareToIgnoreCase(str2);
    }

    public static boolean contains(CharSequence charSequence, int i14) {
        return !isEmpty(charSequence) && CharSequenceUtils.indexOf(charSequence, i14, 0) >= 0;
    }

    public static boolean containsAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i14 = length - 1;
            int i15 = length2 - 1;
            for (int i16 = 0; i16 < length; i16++) {
                char cCharAt = charSequence.charAt(i16);
                for (int i17 = 0; i17 < length2; i17++) {
                    if (cArr[i17] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i17 == i15) {
                            return true;
                        }
                        if (i16 < i14 && cArr[i17 + 1] == charSequence.charAt(i16 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean containsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        return containsAny(new o2.c(29), charSequence, charSequenceArr);
    }

    public static boolean containsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            int i14 = 0;
            while (i14 <= length2) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (CharSequenceUtils.regionMatches(charSequence3, true, i14, charSequence4, 0, length)) {
                    return true;
                }
                i14++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return false;
    }

    public static boolean containsNone(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i14 = length - 1;
            int length2 = cArr.length;
            int i15 = length2 - 1;
            for (int i16 = 0; i16 < length; i16++) {
                char cCharAt = charSequence.charAt(i16);
                for (int i17 = 0; i17 < length2; i17++) {
                    if (cArr[i17] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i17 == i15) {
                            return false;
                        }
                        if (i16 < i14 && cArr[i17 + 1] == charSequence.charAt(i16 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnly(CharSequence charSequence, char... cArr) {
        if (cArr != null && charSequence != null) {
            if (charSequence.length() == 0) {
                return true;
            }
            if (cArr.length != 0 && indexOfAnyBut(charSequence, cArr) == -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (Character.isWhitespace(charSequence.charAt(i14))) {
                return true;
            }
        }
        return false;
    }

    private static void convertRemainingAccentCharacters(StringBuilder sb3) {
        for (int i14 = 0; i14 < sb3.length(); i14++) {
            if (sb3.charAt(i14) == 321) {
                sb3.setCharAt(i14, 'L');
            } else if (sb3.charAt(i14) == 322) {
                sb3.setCharAt(i14, 'l');
            }
        }
    }

    public static int countMatches(CharSequence charSequence, CharSequence charSequence2) {
        int length = 0;
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return 0;
        }
        int i14 = 0;
        while (true) {
            int iIndexOf = CharSequenceUtils.indexOf(charSequence, charSequence2, length);
            if (iIndexOf == -1) {
                return i14;
            }
            i14++;
            length = iIndexOf + charSequence2.length();
        }
    }

    public static <T extends CharSequence> T defaultIfBlank(T t7, T t14) {
        return isBlank(t7) ? t14 : t7;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t7, T t14) {
        return isEmpty(t7) ? t14 : t7;
    }

    public static String defaultString(String str) {
        return defaultString(str, "");
    }

    public static String deleteWhitespace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (!Character.isWhitespace(str.charAt(i15))) {
                cArr[i14] = str.charAt(i15);
                i14++;
            }
        }
        if (i14 == length) {
            return str;
        }
        return i14 == 0 ? "" : new String(cArr, 0, i14);
    }

    public static String difference(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int iIndexOfDifference = indexOfDifference(str, str2);
        return iIndexOfDifference == -1 ? "" : str2.substring(iIndexOfDifference);
    }

    private static boolean endsWith(CharSequence charSequence, CharSequence charSequence2, boolean z14) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return CharSequenceUtils.regionMatches(charSequence, z14, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    public static boolean endsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (endsWith(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean endsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return endsWith(charSequence, charSequence2, true);
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (charSequence.charAt(i14) != charSequence2.charAt(i14)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (ArrayUtils.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (equals(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equalsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (ArrayUtils.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (equalsIgnoreCase(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return CharSequenceUtils.regionMatches(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    @SafeVarargs
    public static <T extends CharSequence> T firstNonBlank(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t7 : tArr) {
            if (isNotBlank(t7)) {
                return t7;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T extends CharSequence> T firstNonEmpty(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t7 : tArr) {
            if (isNotEmpty(t7)) {
                return t7;
            }
        }
        return null;
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str == null ? ArrayUtils.EMPTY_BYTE_ARRAY : str.getBytes(Charsets.toCharset(charset));
    }

    public static String getCommonPrefix(String... strArr) {
        if (ArrayUtils.isEmpty(strArr)) {
            return "";
        }
        int iIndexOfDifference = indexOfDifference(strArr);
        if (iIndexOfDifference != -1) {
            return iIndexOfDifference == 0 ? "" : strArr[0].substring(0, iIndexOfDifference);
        }
        String str = strArr[0];
        return str == null ? "" : str;
    }

    public static String getDigits(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length);
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        return sb3.toString();
    }

    @Deprecated
    public static int getFuzzyDistance(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        if (charSequence == null || charSequence2 == null) {
            h.s("Strings must not be null");
            return 0;
        }
        if (locale == null) {
            h.s("Locale must not be null");
            return 0;
        }
        String lowerCase = charSequence.toString().toLowerCase(locale);
        String lowerCase2 = charSequence2.toString().toLowerCase(locale);
        int i14 = Integer.MIN_VALUE;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < lowerCase2.length(); i17++) {
            char cCharAt = lowerCase2.charAt(i17);
            boolean z14 = false;
            while (i16 < lowerCase.length() && !z14) {
                if (cCharAt == lowerCase.charAt(i16)) {
                    int i18 = i15 + 1;
                    if (i14 + 1 == i16) {
                        i18 = i15 + 3;
                    }
                    i15 = i18;
                    z14 = true;
                    i14 = i16;
                }
                i16++;
            }
        }
        return i15;
    }

    public static <T extends CharSequence> T getIfBlank(T t7, Supplier<T> supplier) {
        if (!isBlank(t7)) {
            return t7;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static <T extends CharSequence> T getIfEmpty(T t7, Supplier<T> supplier) {
        if (!isEmpty(t7)) {
            return t7;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Deprecated
    public static double getJaroWinklerDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("Strings must not be null");
            return 0.0d;
        }
        int[] iArrMatches = matches(charSequence, charSequence2);
        double d14 = iArrMatches[0];
        if (d14 == 0.0d) {
            return 0.0d;
        }
        double length = (((d14 - ((double) iArrMatches[1])) / d14) + ((d14 / ((double) charSequence2.length())) + (d14 / ((double) charSequence.length())))) / 3.0d;
        if (length >= 0.7d) {
            length = o2.c.b(1.0d, length, Math.min(0.1d, 1.0d / ((double) iArrMatches[3])) * ((double) iArrMatches[2]), length);
        }
        return Math.round(length * 100.0d) / 100.0d;
    }

    @Deprecated
    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2, int i14) {
        int i15;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            h.s("Strings must not be null");
            return 0;
        }
        if (i14 < 0) {
            h.s("Threshold must not be negative");
            return 0;
        }
        int length2 = charSequence.length();
        int length3 = charSequence2.length();
        int i16 = -1;
        if (length2 == 0) {
            if (length3 <= i14) {
                return length3;
            }
            return -1;
        }
        if (length3 == 0) {
            if (length2 <= i14) {
                return length2;
            }
            return -1;
        }
        if (Math.abs(length2 - length3) > i14) {
            return -1;
        }
        if (length2 > length3) {
            length = charSequence.length();
            i15 = length3;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i15 = length2;
            length = length3;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i17 = i15 + 1;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        int i18 = 1;
        int iMin = Math.min(i15, i14) + 1;
        for (int i19 = 0; i19 < iMin; i19++) {
            iArr[i19] = i19;
        }
        Arrays.fill(iArr, iMin, i17, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i24 = 1;
        while (i24 <= length) {
            char cCharAt = charSequence4.charAt(i24 - 1);
            iArr2[0] = i24;
            int iMax = Math.max(i18, i24 - i14);
            int iMin2 = i24 > Integer.MAX_VALUE - i14 ? i15 : Math.min(i15, i24 + i14);
            if (iMax > iMin2) {
                return i16;
            }
            if (iMax > i18) {
                iArr2[iMax - 1] = Integer.MAX_VALUE;
            }
            while (iMax <= iMin2) {
                int i25 = iMax - 1;
                int i26 = i16;
                if (charSequence3.charAt(i25) == cCharAt) {
                    iArr2[iMax] = iArr[i25];
                } else {
                    iArr2[iMax] = Math.min(Math.min(iArr2[i25], iArr[iMax]), iArr[i25]) + 1;
                }
                iMax++;
                i18 = i18;
                i16 = i26;
            }
            int i27 = i16;
            i24++;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
            i16 = i27;
        }
        int i28 = i16;
        int i29 = iArr[i15];
        return i29 <= i14 ? i29 : i28;
    }

    public static int indexOf(CharSequence charSequence, int i14) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, i14, 0);
    }

    public static int indexOfAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int i14 = length - 1;
            int length2 = cArr.length;
            int i15 = length2 - 1;
            for (int i16 = 0; i16 < length; i16++) {
                char cCharAt = charSequence.charAt(i16);
                for (int i17 = 0; i17 < length2; i17++) {
                    if (cArr[i17] == cCharAt && (i16 >= i14 || i17 >= i15 || !Character.isHighSurrogate(cCharAt) || cArr[i17 + 1] == charSequence.charAt(i16 + 1))) {
                        return i16;
                    }
                }
            }
        }
        return -1;
    }

    public static int indexOfAnyBut(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int i14 = length - 1;
            int length2 = cArr.length;
            int i15 = length2 - 1;
            for (int i16 = 0; i16 < length; i16++) {
                char cCharAt = charSequence.charAt(i16);
                for (int i17 = 0; i17 < length2; i17++) {
                    if (cArr[i17] != cCharAt || (i16 < i14 && i17 < i15 && Character.isHighSurrogate(cCharAt) && cArr[i17 + 1] != charSequence.charAt(i16 + 1))) {
                    }
                }
                return i16;
            }
        }
        return -1;
    }

    public static int indexOfDifference(CharSequence... charSequenceArr) {
        if (ArrayUtils.getLength(charSequenceArr) <= 1) {
            return -1;
        }
        int length = charSequenceArr.length;
        int iMin = Integer.MAX_VALUE;
        boolean z14 = true;
        int iMax = 0;
        boolean z15 = false;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                z15 = true;
                iMin = 0;
            } else {
                iMin = Math.min(charSequence.length(), iMin);
                iMax = Math.max(charSequence.length(), iMax);
                z14 = false;
            }
        }
        if (z14 || (iMax == 0 && !z15)) {
            return -1;
        }
        if (iMin == 0) {
            return 0;
        }
        int i14 = -1;
        for (int i15 = 0; i15 < iMin; i15++) {
            char cCharAt = charSequenceArr[0].charAt(i15);
            for (int i16 = 1; i16 < length; i16++) {
                if (charSequenceArr[i16].charAt(i15) != cCharAt) {
                    i14 = i15;
                    break;
                }
            }
            if (i14 != -1) {
                break;
            }
        }
        return (i14 != -1 || iMin == iMax) ? i14 : iMin;
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i14) {
        if (charSequence != null && charSequence2 != null) {
            if (i14 < 0) {
                i14 = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i14 > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i14;
            }
            int i15 = i14;
            while (i15 < length) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (CharSequenceUtils.regionMatches(charSequence3, true, i15, charSequence4, 0, charSequence2.length())) {
                    return i15;
                }
                i15++;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static boolean isAllBlank(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isNotBlank(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllEmpty(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isNotEmpty(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllLowerCase(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isLowerCase(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUpperCase(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isUpperCase(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlpha(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isLetter(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphaSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt != ' ' && !Character.isLetter(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt != ' ' && !Character.isLetterOrDigit(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnyBlank(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isBlank(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyEmpty(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isEmpty(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAsciiPrintable(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!CharUtils.isAsciiPrintable(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length = length(charSequence);
        if (length == 0) {
            return true;
        }
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isWhitespace(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isMixedCase(CharSequence charSequence) {
        if (!isEmpty(charSequence) && charSequence.length() != 1) {
            int length = charSequence.length();
            boolean z14 = false;
            boolean z15 = false;
            for (int i14 = 0; i14 < length; i14++) {
                if (z14 && z15) {
                    return true;
                }
                if (Character.isUpperCase(charSequence.charAt(i14))) {
                    z14 = true;
                } else if (Character.isLowerCase(charSequence.charAt(i14))) {
                    z15 = true;
                }
            }
            if (z14 && z15) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoneBlank(CharSequence... charSequenceArr) {
        return !isAnyBlank(charSequenceArr);
    }

    public static boolean isNoneEmpty(CharSequence... charSequenceArr) {
        return !isAnyEmpty(charSequenceArr);
    }

    public static boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static boolean isNumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isDigit(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt != ' ' && !Character.isDigit(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!Character.isWhitespace(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static String join(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb3 = new StringBuilder(256);
        if (next != null) {
            sb3.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb3.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb3.append(next2);
            }
        }
        return sb3.toString();
    }

    public static String joinWith(String str, Object... objArr) {
        if (objArr != null) {
            return join(objArr, str);
        }
        h.s("Object varargs must not be null");
        return null;
    }

    public static int lastIndexOf(CharSequence charSequence, int i14) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, i14, charSequence.length());
    }

    public static int lastIndexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iLastIndexOf;
        int i14 = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (iLastIndexOf = CharSequenceUtils.lastIndexOf(charSequence, charSequence2, charSequence.length())) > i14) {
                    i14 = iLastIndexOf;
                }
            }
        }
        return i14;
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i14) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            if (i14 > length2) {
                i14 = length2;
            }
            if (i14 < 0) {
                return -1;
            }
            if (length == 0) {
                return i14;
            }
            int i15 = i14;
            while (i15 >= 0) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (CharSequenceUtils.regionMatches(charSequence3, true, i15, charSequence4, 0, length)) {
                    return i15;
                }
                i15--;
                charSequence = charSequence3;
                charSequence2 = charSequence4;
            }
        }
        return -1;
    }

    public static int lastOrdinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i14) {
        return ordinalIndexOf(charSequence, charSequence2, i14, true);
    }

    public static String left(String str, int i14) {
        if (str == null) {
            return null;
        }
        if (i14 < 0) {
            return "";
        }
        return str.length() <= i14 ? str : str.substring(0, i14);
    }

    public static String leftPad(String str, int i14, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i14 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return leftPad(str, i14, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i15 = 0; i15 < length2; i15++) {
            cArr[i15] = charArray[i15 % length];
        }
        return new String(cArr).concat(str);
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(LocaleUtils.toLocale(locale));
    }

    private static int[] matches(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int iMax = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i14 = 0;
        for (int i15 = 0; i15 < charSequence3.length(); i15++) {
            char cCharAt = charSequence3.charAt(i15);
            int iMin = Math.min(i15 + iMax + 1, charSequence4.length());
            for (int iMax2 = Math.max(i15 - iMax, 0); iMax2 < iMin; iMax2++) {
                if (!zArr[iMax2] && cCharAt == charSequence4.charAt(iMax2)) {
                    iArr[i15] = iMax2;
                    zArr[iMax2] = true;
                    i14++;
                    break;
                }
            }
        }
        char[] cArr = new char[i14];
        char[] cArr2 = new char[i14];
        int i16 = 0;
        for (int i17 = 0; i17 < charSequence3.length(); i17++) {
            if (iArr[i17] != -1) {
                cArr[i16] = charSequence3.charAt(i17);
                i16++;
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < charSequence4.length(); i19++) {
            if (zArr[i19]) {
                cArr2[i18] = charSequence4.charAt(i19);
                i18++;
            }
        }
        int i24 = 0;
        for (int i25 = 0; i25 < i14; i25++) {
            if (cArr[i25] != cArr2[i25]) {
                i24++;
            }
        }
        int i26 = 0;
        for (int i27 = 0; i27 < charSequence3.length() && charSequence.charAt(i27) == charSequence2.charAt(i27); i27++) {
            i26++;
        }
        return new int[]{i14, i24 / 2, i26, charSequence4.length()};
    }

    public static String mid(String str, int i14, int i15) {
        if (str == null) {
            return null;
        }
        if (i15 < 0 || i14 > str.length()) {
            return "";
        }
        if (i14 < 0) {
            i14 = 0;
        }
        int i16 = i15 + i14;
        return str.length() <= i16 ? str.substring(i14) : str.substring(i14, i16);
    }

    private static StringJoiner newStringJoiner(char c14) {
        return new StringJoiner(String.valueOf(c14));
    }

    public static String normalizeSpace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        boolean z14 = true;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = str.charAt(i16);
            if (Character.isWhitespace(cCharAt)) {
                if (i15 == 0 && !z14) {
                    cArr[i14] = SPACE.charAt(0);
                    i14++;
                }
                i15++;
            } else {
                int i17 = i14 + 1;
                if (cCharAt == 160) {
                    cCharAt = ' ';
                }
                cArr[i14] = cCharAt;
                i15 = 0;
                i14 = i17;
                z14 = false;
            }
        }
        if (z14) {
            return "";
        }
        return new String(cArr, 0, i14 - (i15 <= 0 ? 0 : 1)).trim();
    }

    private static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i14, boolean z14) {
        int length = -1;
        if (charSequence != null && charSequence2 != null && i14 > 0) {
            int i15 = 0;
            if (charSequence2.length() == 0) {
                if (z14) {
                    return charSequence.length();
                }
                return 0;
            }
            length = z14 ? charSequence.length() : -1;
            do {
                length = z14 ? CharSequenceUtils.lastIndexOf(charSequence, charSequence2, length - 1) : CharSequenceUtils.indexOf(charSequence, charSequence2, length + 1);
                if (length < 0) {
                    break;
                }
                i15++;
            } while (i15 < i14);
        }
        return length;
    }

    public static String overlay(String str, String str2, int i14, int i15) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i14 < 0) {
            i14 = 0;
        }
        if (i14 > length) {
            i14 = length;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        if (i15 <= length) {
            length = i15;
        }
        if (i14 > length) {
            int i16 = length;
            length = i14;
            i14 = i16;
        }
        return str.substring(0, i14) + str2 + str.substring(length);
    }

    private static String prependIfMissing(String str, CharSequence charSequence, boolean z14, CharSequence... charSequenceArr) {
        if (str == null || isEmpty(charSequence) || startsWith(str, charSequence, z14)) {
            return str;
        }
        if (ArrayUtils.isNotEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (startsWith(str, charSequence2, z14)) {
                    return str;
                }
            }
        }
        return charSequence.toString() + str;
    }

    public static String prependIfMissingIgnoreCase(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return prependIfMissing(str, charSequence, true, charSequenceArr);
    }

    public static String remove(String str, char c14) {
        if (isEmpty(str) || str.indexOf(c14) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i14 = 0;
        for (char c15 : charArray) {
            if (c15 != c14) {
                charArray[i14] = c15;
                i14++;
            }
        }
        return new String(charArray, 0, i14);
    }

    @Deprecated
    public static String removeAll(String str, String str2) {
        return RegExUtils.removeAll(str, str2);
    }

    public static String removeEnd(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String removeEndIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !endsWithIgnoreCase(str, str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    @Deprecated
    public static String removeFirst(String str, String str2) {
        return replaceFirst(str, str2, "");
    }

    public static String removeIgnoreCase(String str, String str2) {
        return replaceIgnoreCase(str, str2, "", -1);
    }

    @Deprecated
    public static String removePattern(String str, String str2) {
        return RegExUtils.removePattern(str, str2);
    }

    public static String removeStart(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String removeStartIgnoreCase(String str, String str2) {
        return (str == null || !startsWithIgnoreCase(str, str2)) ? str : str.substring(length(str2));
    }

    public static String repeat(String str, int i14) {
        if (str == null) {
            return null;
        }
        if (i14 <= 0) {
            return "";
        }
        int length = str.length();
        if (i14 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i14 <= 8192) {
            return repeat(str.charAt(0), i14);
        }
        int i15 = length * i14;
        if (length == 1) {
            return repeat(str.charAt(0), i14);
        }
        if (length != 2) {
            StringBuilder sb3 = new StringBuilder(i15);
            for (int i16 = 0; i16 < i14; i16++) {
                sb3.append(str);
            }
            return sb3.toString();
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char[] cArr = new char[i15];
        for (int i17 = (i14 * 2) - 2; i17 >= 0; i17 -= 2) {
            cArr[i17] = cCharAt;
            cArr[i17 + 1] = cCharAt2;
        }
        return new String(cArr);
    }

    private static String replace(String str, String str2, String str3, int i14, boolean z14) {
        if (isEmpty(str) || isEmpty(str2) || str3 == null || i14 == 0) {
            return str;
        }
        if (z14) {
            str2 = str2.toLowerCase();
        }
        int i15 = 0;
        int iIndexOfIgnoreCase = z14 ? indexOfIgnoreCase(str, str2, 0) : indexOf(str, str2, 0);
        if (iIndexOfIgnoreCase == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb3 = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * (i14 < 0 ? 16 : Math.min(i14, 64))));
        while (iIndexOfIgnoreCase != -1) {
            sb3.append((CharSequence) str, i15, iIndexOfIgnoreCase);
            sb3.append(str3);
            i15 = iIndexOfIgnoreCase + length;
            i14--;
            if (i14 == 0) {
                break;
            }
            iIndexOfIgnoreCase = z14 ? indexOfIgnoreCase(str, str2, i15) : indexOf(str, str2, i15);
        }
        sb3.append((CharSequence) str, i15, str.length());
        return sb3.toString();
    }

    @Deprecated
    public static String replaceAll(String str, String str2, String str3) {
        return RegExUtils.replaceAll(str, str2, str3);
    }

    public static String replaceChars(String str, String str2, String str3) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb3 = new StringBuilder(length2);
        boolean z14 = false;
        for (int i14 = 0; i14 < length2; i14++) {
            char cCharAt = str.charAt(i14);
            int iIndexOf = str2.indexOf(cCharAt);
            if (iIndexOf >= 0) {
                if (iIndexOf < length) {
                    sb3.append(str3.charAt(iIndexOf));
                }
                z14 = true;
            } else {
                sb3.append(cCharAt);
            }
        }
        return z14 ? sb3.toString() : str;
    }

    private static String replaceEach(String str, String[] strArr, String[] strArr2, boolean z14, int i14) {
        String str2;
        String str3;
        int length;
        if (i14 < 0) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            hashSet.retainAll(new HashSet(Arrays.asList(strArr2)));
            if (!hashSet.isEmpty()) {
                h.z("Aborting to protect against StackOverflowError - output of one loop is the input of another");
                return null;
            }
        }
        if (isEmpty(str) || ArrayUtils.isEmpty(strArr) || ArrayUtils.isEmpty(strArr2)) {
            return str;
        }
        if (ArrayUtils.isNotEmpty(strArr) && i14 == -1) {
            return str;
        }
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (length2 != length3) {
            h.s(k.e(length2, length3, "Search and Replace array lengths don't match: ", " vs "));
            return null;
        }
        boolean[] zArr = new boolean[length2];
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < length2; i17++) {
            if (!zArr[i17] && !isEmpty(strArr[i17]) && strArr2[i17] != null) {
                int iIndexOf = str.indexOf(strArr[i17]);
                if (iIndexOf == -1) {
                    zArr[i17] = true;
                } else if (i15 == -1 || iIndexOf < i15) {
                    i16 = i17;
                    i15 = iIndexOf;
                }
            }
        }
        if (i15 == -1) {
            return str;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < strArr.length; i19++) {
            if (strArr[i19] != null && (str3 = strArr2[i19]) != null && (length = str3.length() - strArr[i19].length()) > 0) {
                i18 += length * 3;
            }
        }
        StringBuilder sb3 = new StringBuilder(str.length() + Math.min(i18, str.length() / 5));
        int length4 = 0;
        while (i15 != -1) {
            while (length4 < i15) {
                sb3.append(str.charAt(length4));
                length4++;
            }
            sb3.append(strArr2[i16]);
            length4 = strArr[i16].length() + i15;
            i15 = -1;
            i16 = -1;
            for (int i24 = 0; i24 < length2; i24++) {
                if (!zArr[i24] && (str2 = strArr[i24]) != null && !str2.isEmpty() && strArr2[i24] != null) {
                    int iIndexOf2 = str.indexOf(strArr[i24], length4);
                    if (iIndexOf2 == -1) {
                        zArr[i24] = true;
                    } else if (i15 == -1 || iIndexOf2 < i15) {
                        i16 = i24;
                        i15 = iIndexOf2;
                    }
                }
            }
        }
        int length5 = str.length();
        while (length4 < length5) {
            sb3.append(str.charAt(length4));
            length4++;
        }
        String string = sb3.toString();
        return !z14 ? string : replaceEach(string, strArr, strArr2, z14, i14 - 1);
    }

    public static String replaceEachRepeatedly(String str, String[] strArr, String[] strArr2) {
        return replaceEach(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    @Deprecated
    public static String replaceFirst(String str, String str2, String str3) {
        return RegExUtils.replaceFirst(str, str2, str3);
    }

    public static String replaceIgnoreCase(String str, String str2, String str3) {
        return replaceIgnoreCase(str, str2, str3, -1);
    }

    public static String replaceOnce(String str, String str2, String str3) {
        return replace(str, str2, str3, 1);
    }

    public static String replaceOnceIgnoreCase(String str, String str2, String str3) {
        return replaceIgnoreCase(str, str2, str3, 1);
    }

    @Deprecated
    public static String replacePattern(String str, String str2, String str3) {
        return RegExUtils.replacePattern(str, str2, str3);
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseDelimited(String str, char c14) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = split(str, c14);
        ArrayUtils.reverse(strArrSplit);
        return join(strArrSplit, c14);
    }

    public static String right(String str, int i14) {
        if (str == null) {
            return null;
        }
        if (i14 < 0) {
            return "";
        }
        return str.length() <= i14 ? str : str.substring(str.length() - i14);
    }

    public static String rightPad(String str, int i14, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i14 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return rightPad(str, i14, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i15 = 0; i15 < length2; i15++) {
            cArr[i15] = charArray[i15 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String rotate(String str, int i14) {
        int i15;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (i14 == 0 || length == 0 || (i15 = i14 % length) == 0) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(length);
        int i16 = -i15;
        sb3.append(substring(str, i16));
        sb3.append(substring(str, 0, i16));
        return sb3.toString();
    }

    public static String[] split(String str) {
        return split(str, null, -1);
    }

    private static String[] splitByCharacterType(String str, boolean z14) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        int type = Character.getType(charArray[0]);
        for (int i15 = 1; i15 < charArray.length; i15++) {
            int type2 = Character.getType(charArray[i15]);
            if (type2 != type) {
                if (z14 && type2 == 2 && type == 1) {
                    int i16 = i15 - 1;
                    if (i16 != i14) {
                        arrayList.add(new String(charArray, i14, i16 - i14));
                        i14 = i16;
                    }
                } else {
                    arrayList.add(new String(charArray, i14, i15 - i14));
                    i14 = i15;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i14, charArray.length - i14));
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String[] splitByCharacterTypeCamelCase(String str) {
        return splitByCharacterType(str, true);
    }

    public static String[] splitByWholeSeparator(String str, String str2) {
        return splitByWholeSeparatorWorker(str, str2, -1, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2) {
        return splitByWholeSeparatorWorker(str, str2, -1, true);
    }

    private static String[] splitByWholeSeparatorWorker(String str, String str2, int i14, boolean z14) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        if (str2 == null || "".equals(str2)) {
            return splitWorker(str, null, i14, z14);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 0;
        int i15 = 0;
        int i16 = 0;
        while (iIndexOf < length) {
            iIndexOf = str.indexOf(str2, i15);
            if (iIndexOf > -1) {
                if (iIndexOf > i15) {
                    i16++;
                    if (i16 == i14) {
                        arrayList.add(str.substring(i15));
                    } else {
                        arrayList.add(str.substring(i15, iIndexOf));
                    }
                } else if (z14) {
                    i16++;
                    if (i16 == i14) {
                        arrayList.add(str.substring(i15));
                        iIndexOf = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i15 = iIndexOf + length2;
            } else {
                arrayList.add(str.substring(i15));
            }
            iIndexOf = length;
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String[] splitPreserveAllTokens(String str) {
        return splitWorker(str, null, -1, true);
    }

    private static String[] splitWorker(String str, String str2, int i14, boolean z14) {
        int i15;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        boolean z17;
        boolean z18;
        int i18;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i17 = 0;
            z17 = false;
            z18 = false;
            i18 = 0;
            int i19 = 1;
            while (i17 < length) {
                if (Character.isWhitespace(str.charAt(i17))) {
                    if (z17 || z14) {
                        int i24 = i19 + 1;
                        if (i19 == i14) {
                            i17 = length;
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        arrayList.add(str.substring(i18, i17));
                        i19 = i24;
                        z17 = false;
                    }
                    i18 = i17 + 1;
                    i17 = i18;
                } else {
                    i17++;
                    z18 = false;
                    z17 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char cCharAt = str2.charAt(0);
                i15 = 0;
                z15 = false;
                z16 = false;
                i16 = 0;
                int i25 = 1;
                while (i15 < length) {
                    if (str.charAt(i15) == cCharAt) {
                        if (z15 || z14) {
                            int i26 = i25 + 1;
                            if (i25 == i14) {
                                i15 = length;
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            arrayList.add(str.substring(i16, i15));
                            i25 = i26;
                            z15 = false;
                        }
                        i16 = i15 + 1;
                        i15 = i16;
                    } else {
                        i15++;
                        z16 = false;
                        z15 = true;
                    }
                }
            } else {
                i15 = 0;
                z15 = false;
                z16 = false;
                i16 = 0;
                int i27 = 1;
                while (i15 < length) {
                    if (str2.indexOf(str.charAt(i15)) >= 0) {
                        if (z15 || z14) {
                            int i28 = i27 + 1;
                            if (i27 == i14) {
                                i15 = length;
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            arrayList.add(str.substring(i16, i15));
                            i27 = i28;
                            z15 = false;
                        }
                        i16 = i15 + 1;
                        i15 = i16;
                    } else {
                        i15++;
                        z16 = false;
                        z15 = true;
                    }
                }
            }
            i17 = i15;
            z17 = z15;
            z18 = z16;
            i18 = i16;
        }
        if (z17 || (z14 && z18)) {
            arrayList.add(str.substring(i18, i17));
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    private static boolean startsWith(CharSequence charSequence, CharSequence charSequence2, boolean z14) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        int length = charSequence2.length();
        if (length > charSequence.length()) {
            return false;
        }
        return CharSequenceUtils.regionMatches(charSequence, z14, 0, charSequence2, 0, length);
    }

    public static boolean startsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (startsWith(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean startsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return startsWith(charSequence, charSequence2, true);
    }

    public static String strip(String str, String str2) {
        return stripEnd(stripStart(str, str2), str2);
    }

    public static String stripAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder(Normalizer.normalize(str, Normalizer.Form.NFD));
        convertRemainingAccentCharacters(sb3);
        return STRIP_ACCENTS_PATTERN.matcher(sb3).replaceAll("");
    }

    public static String[] stripAll(String[] strArr, String str) {
        int length = ArrayUtils.getLength(strArr);
        if (length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        for (int i14 = 0; i14 < length; i14++) {
            strArr2[i14] = strip(strArr[i14], str);
        }
        return strArr2;
    }

    public static String stripEnd(String str, String str2) {
        int length = length(str);
        if (length != 0) {
            if (str2 == null) {
                while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                    length--;
                }
            } else if (!str2.isEmpty()) {
                while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                    length--;
                }
            }
            return str.substring(0, length);
        }
        return str;
    }

    public static String stripStart(String str, String str2) {
        int length = length(str);
        if (length != 0) {
            int i14 = 0;
            if (str2 == null) {
                while (i14 != length && Character.isWhitespace(str.charAt(i14))) {
                    i14++;
                }
            } else if (!str2.isEmpty()) {
                while (i14 != length && str2.indexOf(str.charAt(i14)) != -1) {
                    i14++;
                }
            }
            return str.substring(i14);
        }
        return str;
    }

    public static String stripToEmpty(String str) {
        return str == null ? "" : strip(str, null);
    }

    public static String stripToNull(String str) {
        if (str == null) {
            return null;
        }
        String strStrip = strip(str, null);
        if (strStrip.isEmpty()) {
            return null;
        }
        return strStrip;
    }

    public static String substring(String str, int i14, int i15) {
        if (str == null) {
            return null;
        }
        if (i15 < 0) {
            i15 += str.length();
        }
        if (i14 < 0) {
            i14 += str.length();
        }
        if (i15 > str.length()) {
            i15 = str.length();
        }
        if (i14 > i15) {
            return "";
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        return str.substring(i14, i15);
    }

    public static String substringAfter(String str, String str2) {
        int iIndexOf;
        if (isEmpty(str)) {
            return str;
        }
        return (str2 == null || (iIndexOf = str.indexOf(str2)) == -1) ? "" : str.substring(str2.length() + iIndexOf);
    }

    public static String substringAfterLast(String str, String str2) {
        int iLastIndexOf;
        if (isEmpty(str)) {
            return str;
        }
        return (isEmpty(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1 || iLastIndexOf == str.length() - str2.length()) ? "" : str.substring(str2.length() + iLastIndexOf);
    }

    public static String substringBefore(String str, String str2) {
        if (isEmpty(str) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    public static String substringBeforeLast(String str, String str2) {
        int iLastIndexOf;
        return (isEmpty(str) || isEmpty(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1) ? str : str.substring(0, iLastIndexOf);
    }

    public static String substringBetween(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        if (!ObjectUtils.allNotNull(str, str2, str3) || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + iIndexOf, iIndexOf2);
    }

    public static String[] substringsBetween(String str, String str2, String str3) {
        int iIndexOf;
        int i14;
        int iIndexOf2;
        if (str == null || isEmpty(str2) || isEmpty(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (i15 < length - length2 && (iIndexOf = str.indexOf(str2, i15)) >= 0 && (iIndexOf2 = str.indexOf(str3, (i14 = iIndexOf + length3))) >= 0) {
            arrayList.add(str.substring(i14, iIndexOf2));
            i15 = iIndexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String swapCase(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        int iCharCount = 0;
        int i14 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (Character.isUpperCase(iCodePointAt) || Character.isTitleCase(iCodePointAt)) {
                iCodePointAt = Character.toLowerCase(iCodePointAt);
            } else if (Character.isLowerCase(iCodePointAt)) {
                iCodePointAt = Character.toUpperCase(iCodePointAt);
            }
            iArr[i14] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i14++;
        }
        return new String(iArr, 0, i14);
    }

    public static int[] toCodePoints(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return ArrayUtils.EMPTY_INT_ARRAY;
        }
        String string = charSequence.toString();
        int iCodePointCount = string.codePointCount(0, string.length());
        int[] iArr = new int[iCodePointCount];
        int iCharCount = 0;
        for (int i14 = 0; i14 < iCodePointCount; i14++) {
            int iCodePointAt = string.codePointAt(iCharCount);
            iArr[i14] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return iArr;
    }

    public static String toEncodedString(byte[] bArr, Charset charset) {
        return new String(bArr, Charsets.toCharset(charset));
    }

    public static String toRootLowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static String toRootUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.ROOT);
    }

    @Deprecated
    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    private static String toStringOrEmpty(Object obj) {
        return Objects.toString(obj, "");
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String trimToEmpty(String str) {
        return str == null ? "" : str.trim();
    }

    public static String trimToNull(String str) {
        String strTrim = trim(str);
        if (isEmpty(strTrim)) {
            return null;
        }
        return strTrim;
    }

    public static String truncate(String str, int i14, int i15) {
        if (i14 < 0) {
            h.s("offset cannot be negative");
            return null;
        }
        if (i15 < 0) {
            h.s("maxWith cannot be negative");
            return null;
        }
        if (str == null) {
            return null;
        }
        if (i14 > str.length()) {
            return "";
        }
        return str.length() > i15 ? str.substring(i14, Math.min(i15 + i14, str.length())) : str.substring(i14);
    }

    public static String uncapitalize(String str) {
        int iCodePointAt;
        int lowerCase;
        int length = length(str);
        if (length == 0 || iCodePointAt == (lowerCase = Character.toLowerCase((iCodePointAt = str.codePointAt(0))))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = lowerCase;
        int iCharCount = Character.charCount(iCodePointAt);
        int i14 = 1;
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            iArr[i14] = iCodePointAt2;
            iCharCount += Character.charCount(iCodePointAt2);
            i14++;
        }
        return new String(iArr, 0, i14);
    }

    public static String unwrap(String str, String str2) {
        if (isEmpty(str) || isEmpty(str2) || str.length() < str2.length() * 2 || !startsWith(str, str2) || !endsWith(str, str2)) {
            return str;
        }
        int iIndexOf = str.indexOf(str2);
        int iLastIndexOf = str.lastIndexOf(str2);
        return (iIndexOf == -1 || iLastIndexOf == -1) ? str : str.substring(iIndexOf + str2.length(), iLastIndexOf);
    }

    public static String upperCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(LocaleUtils.toLocale(locale));
    }

    public static String valueOf(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return String.valueOf(cArr);
    }

    public static String wrap(String str, char c14) {
        if (isEmpty(str) || c14 == 0) {
            return str;
        }
        return c14 + str + c14;
    }

    public static String wrapIfMissing(String str, char c14) {
        if (isEmpty(str) || c14 == 0) {
            return str;
        }
        boolean z14 = str.charAt(0) != c14;
        boolean z15 = str.charAt(str.length() - 1) != c14;
        if (!z14 && !z15) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 2);
        if (z14) {
            sb3.append(c14);
        }
        sb3.append(str);
        if (z15) {
            sb3.append(c14);
        }
        return sb3.toString();
    }

    public static String replaceIgnoreCase(String str, String str2, String str3, int i14) {
        return replace(str, str2, str3, i14, true);
    }

    public static String defaultString(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static String[] split(String str, char c14) {
        return splitWorker(str, c14, false);
    }

    public static String[] splitByWholeSeparator(String str, String str2, int i14) {
        return splitByWholeSeparatorWorker(str, str2, i14, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2, int i14) {
        return splitByWholeSeparatorWorker(str, str2, i14, true);
    }

    public static String[] split(String str, String str2) {
        return splitWorker(str, str2, -1, false);
    }

    public static String[] splitPreserveAllTokens(String str, char c14) {
        return splitWorker(str, c14, true);
    }

    public static String[] split(String str, String str2, int i14) {
        return splitWorker(str, str2, i14, false);
    }

    public static String[] splitPreserveAllTokens(String str, String str2) {
        return splitWorker(str, str2, -1, true);
    }

    public static String strip(String str) {
        return strip(str, null);
    }

    public static String[] splitPreserveAllTokens(String str, String str2, int i14) {
        return splitWorker(str, str2, i14, true);
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static byte[] getBytes(String str, String str2) {
        return str == null ? ArrayUtils.EMPTY_BYTE_ARRAY : str.getBytes(Charsets.toCharsetName(str2));
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i14) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, charSequence2, i14);
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, charSequence2, 0);
    }

    public static int indexOf(CharSequence charSequence, int i14, int i15) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, i14, i15);
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || CharSequenceUtils.indexOf(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i14) {
        return CharSequenceUtils.lastIndexOf(charSequence, charSequence2, i14);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, charSequence2, charSequence.length());
    }

    public static int lastIndexOf(CharSequence charSequence, int i14, int i15) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, i14, i15);
    }

    public static int compare(String str, String str2) {
        return compare(str, str2, true);
    }

    public static int compareIgnoreCase(String str, String str2) {
        return compareIgnoreCase(str, str2, true);
    }

    public static String[] stripAll(String... strArr) {
        return stripAll(strArr, null);
    }

    public static boolean containsOnly(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return containsOnly(charSequence, str.toCharArray());
    }

    public static String wrap(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : str2.concat(str).concat(str2);
    }

    public static String substringAfter(String str, int i14) {
        if (isEmpty(str)) {
            return str;
        }
        int iIndexOf = str.indexOf(i14);
        if (iIndexOf == -1) {
            return "";
        }
        return str.substring(iIndexOf + 1);
    }

    public static int countMatches(CharSequence charSequence, char c14) {
        if (isEmpty(charSequence)) {
            return 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < charSequence.length(); i15++) {
            if (c14 == charSequence.charAt(i15)) {
                i14++;
            }
        }
        return i14;
    }

    public static String substringBefore(String str, int i14) {
        int iIndexOf;
        return (isEmpty(str) || (iIndexOf = str.indexOf(i14)) == -1) ? str : str.substring(0, iIndexOf);
    }

    public static String center(String str, int i14, char c14) {
        int length;
        int length2;
        return (str == null || i14 <= 0 || (length2 = i14 - (length = str.length())) <= 0) ? str : rightPad(leftPad(str, (length2 / 2) + length, c14), i14, c14);
    }

    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        return startsWith(charSequence, charSequence2, false);
    }

    public static String center(String str, int i14) {
        return center(str, i14, ' ');
    }

    public static String substringBetween(String str, String str2) {
        return substringBetween(str, str2, str2);
    }

    public static String remove(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : replace(str, str2, "", -1);
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return lastIndexOfIgnoreCase(charSequence, charSequence2, charSequence.length());
    }

    public static String substring(String str, int i14) {
        if (str == null) {
            return null;
        }
        if (i14 < 0) {
            i14 += str.length();
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i14 > str.length()) {
            return "";
        }
        return str.substring(i14);
    }

    public static String substringAfterLast(String str, int i14) {
        if (isEmpty(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(i14);
        if (iLastIndexOf != -1 && iLastIndexOf != str.length() - 1) {
            return str.substring(iLastIndexOf + 1);
        }
        return "";
    }

    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        return endsWith(charSequence, charSequence2, false);
    }

    public static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i14) {
        return ordinalIndexOf(charSequence, charSequence2, i14, false);
    }

    public static String appendIfMissing(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return appendIfMissing(str, charSequence, false, charSequenceArr);
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return indexOfIgnoreCase(charSequence, charSequence2, 0);
    }

    public static String truncate(String str, int i14) {
        return truncate(str, 0, i14);
    }

    public static String prependIfMissing(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return prependIfMissing(str, charSequence, false, charSequenceArr);
    }

    public static String unwrap(String str, char c14) {
        return (isEmpty(str) || c14 == 0 || str.length() == 1 || str.charAt(0) != c14 || str.charAt(str.length() - 1) != c14) ? str : fb1.c.m(1, 1, str);
    }

    public static boolean containsNone(CharSequence charSequence, String str) {
        if (str == null) {
            return true;
        }
        return containsNone(charSequence, str.toCharArray());
    }

    @Deprecated
    public static String chomp(String str, String str2) {
        return removeEnd(str, str2);
    }

    public static String join(boolean[] zArr, char c14, int i14, int i15) {
        if (zArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf(zArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String wrapIfMissing(String str, String str2) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        boolean zStartsWith = str.startsWith(str2);
        boolean zEndsWith = str.endsWith(str2);
        if (zStartsWith && zEndsWith) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str2.length() + str2.length() + str.length());
        if (!zStartsWith) {
            sb3.append(str2);
        }
        sb3.append(str);
        if (!zEndsWith) {
            sb3.append(str2);
        }
        return sb3.toString();
    }

    public static int indexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int iIndexOf;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i14 = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (iIndexOf = CharSequenceUtils.indexOf(charSequence, charSequence2, 0)) != -1 && iIndexOf < i14) {
                i14 = iIndexOf;
            }
        }
        if (i14 == Integer.MAX_VALUE) {
            return -1;
        }
        return i14;
    }

    public static int indexOfAnyBut(CharSequence charSequence, CharSequence charSequence2) {
        if (!isEmpty(charSequence) && !isEmpty(charSequence2)) {
            int length = charSequence.length();
            int i14 = 0;
            while (i14 < length) {
                char cCharAt = charSequence.charAt(i14);
                boolean z14 = CharSequenceUtils.indexOf(charSequence2, cCharAt, 0) >= 0;
                int i15 = i14 + 1;
                if (i15 < length && Character.isHighSurrogate(cCharAt)) {
                    char cCharAt2 = charSequence.charAt(i15);
                    if (z14 && CharSequenceUtils.indexOf(charSequence2, cCharAt2, 0) < 0) {
                        return i14;
                    }
                    i14 = i15;
                } else {
                    if (!z14) {
                        return i14;
                    }
                    i14 = i15;
                }
            }
        }
        return -1;
    }

    public static String replaceChars(String str, char c14, char c15) {
        if (str == null) {
            return null;
        }
        return str.replace(c14, c15);
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return containsAny(charSequence, CharSequenceUtils.toCharArray(charSequence2));
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        return containsAny(new o2.c(28), charSequence, charSequenceArr);
    }

    public static int indexOfAny(CharSequence charSequence, String str) {
        if (isEmpty(charSequence) || isEmpty(str)) {
            return -1;
        }
        return indexOfAny(charSequence, str.toCharArray());
    }

    public static String join(byte[] bArr, char c14) {
        if (bArr == null) {
            return null;
        }
        return join(bArr, c14, 0, bArr.length);
    }

    private static boolean containsAny(ToBooleanBiFunction<CharSequence, CharSequence> toBooleanBiFunction, CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (toBooleanBiFunction.applyAsBoolean(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String join(byte[] bArr, char c14, int i14, int i15) {
        if (bArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf((int) bArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String join(char[] cArr, char c14) {
        if (cArr == null) {
            return null;
        }
        return join(cArr, c14, 0, cArr.length);
    }

    public static String join(char[] cArr, char c14, int i14, int i15) {
        if (cArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf(cArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String join(double[] dArr, char c14) {
        if (dArr == null) {
            return null;
        }
        return join(dArr, c14, 0, dArr.length);
    }

    public static String join(double[] dArr, char c14, int i14, int i15) {
        if (dArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf(dArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String join(float[] fArr, char c14) {
        if (fArr == null) {
            return null;
        }
        return join(fArr, c14, 0, fArr.length);
    }

    public static String join(float[] fArr, char c14, int i14, int i15) {
        if (fArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf(fArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String leftPad(String str, int i14, char c14) {
        if (str == null) {
            return null;
        }
        int length = i14 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return leftPad(str, i14, String.valueOf(c14));
        }
        return repeat(c14, length).concat(str);
    }

    public static String rightPad(String str, int i14, char c14) {
        if (str == null) {
            return null;
        }
        int length = i14 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return rightPad(str, i14, String.valueOf(c14));
        }
        return str.concat(repeat(c14, length));
    }

    public static String join(int[] iArr, char c14) {
        if (iArr == null) {
            return null;
        }
        return join(iArr, c14, 0, iArr.length);
    }

    public static String leftPad(String str, int i14) {
        return leftPad(str, i14, ' ');
    }

    public static String rightPad(String str, int i14) {
        return rightPad(str, i14, ' ');
    }

    public static String join(int[] iArr, char c14, int i14, int i15) {
        if (iArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf(iArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String join(Iterable<?> iterable, char c14) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), c14);
    }

    public static String join(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), str);
    }

    public static int indexOfDifference(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i14 = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i14 < charSequence.length() && i14 < charSequence2.length() && charSequence.charAt(i14) == charSequence2.charAt(i14)) {
                i14++;
            }
            if (i14 >= charSequence2.length() && i14 >= charSequence.length()) {
                return -1;
            }
        }
        return i14;
    }

    public static String join(Iterator<?> it, char c14) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return toStringOrEmpty(next);
        }
        StringBuilder sb3 = new StringBuilder(256);
        if (next != null) {
            sb3.append(next);
        }
        while (it.hasNext()) {
            sb3.append(c14);
            Object next2 = it.next();
            if (next2 != null) {
                sb3.append(next2);
            }
        }
        return sb3.toString();
    }

    public static String repeat(char c14, int i14) {
        if (i14 <= 0) {
            return "";
        }
        char[] cArr = new char[i14];
        Arrays.fill(cArr, c14);
        return new String(cArr);
    }

    public static String[] splitByCharacterType(String str) {
        return splitByCharacterType(str, false);
    }

    public static String repeat(String str, String str2, int i14) {
        if (str != null && str2 != null) {
            return removeEnd(repeat(str.concat(str2), i14), str2);
        }
        return repeat(str, i14);
    }

    public static String join(boolean[] zArr, char c14) {
        if (zArr == null) {
            return null;
        }
        return join(zArr, c14, 0, zArr.length);
    }

    public static String join(List<?> list, char c14, int i14, int i15) {
        if (list == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        return join(list.subList(i14, i15).iterator(), c14);
    }

    public static String replace(String str, String str2, String str3, int i14) {
        return replace(str, str2, str3, i14, false);
    }

    public static String join(List<?> list, String str, int i14, int i15) {
        if (list == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        return join(list.subList(i14, i15).iterator(), str);
    }

    public static String replace(String str, String str2, String str3) {
        return replace(str, str2, str3, -1);
    }

    public static String join(long[] jArr, char c14) {
        if (jArr == null) {
            return null;
        }
        return join(jArr, c14, 0, jArr.length);
    }

    public static String join(long[] jArr, char c14, int i14, int i15) {
        if (jArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf(jArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String join(Object[] objArr, char c14) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c14, 0, objArr.length);
    }

    public static String join(Object[] objArr, char c14, int i14, int i15) {
        if (objArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(toStringOrEmpty(objArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    public static String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    public static String join(Object[] objArr, String str, int i14, int i15) {
        if (objArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoiner = new StringJoiner(toStringOrEmpty(str));
        while (i14 < i15) {
            stringJoiner.add(toStringOrEmpty(objArr[i14]));
            i14++;
        }
        return stringJoiner.toString();
    }

    public static String join(short[] sArr, char c14) {
        if (sArr == null) {
            return null;
        }
        return join(sArr, c14, 0, sArr.length);
    }

    public static String join(short[] sArr, char c14, int i14, int i15) {
        if (sArr == null) {
            return null;
        }
        if (i15 - i14 <= 0) {
            return "";
        }
        StringJoiner stringJoinerNewStringJoiner = newStringJoiner(c14);
        while (i14 < i15) {
            stringJoinerNewStringJoiner.add(String.valueOf((int) sArr[i14]));
            i14++;
        }
        return stringJoinerNewStringJoiner.toString();
    }

    @SafeVarargs
    public static <T> String join(T... tArr) {
        return join(tArr, (String) null);
    }

    public static String abbreviate(String str, int i14, int i15) {
        return abbreviate(str, "...", i14, i15);
    }

    public static String abbreviate(String str, String str2, int i14) {
        return abbreviate(str, str2, 0, i14);
    }

    public static String abbreviate(String str, int i14) {
        return abbreviate(str, "...", 0, i14);
    }

    private static String[] splitWorker(String str, char c14, boolean z14) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        boolean z15 = false;
        boolean z16 = false;
        int i15 = 0;
        while (i14 < length) {
            if (str.charAt(i14) == c14) {
                if (z15 || z14) {
                    arrayList.add(str.substring(i15, i14));
                    z15 = false;
                    z16 = true;
                }
                i15 = i14 + 1;
                i14 = i15;
            } else {
                i14++;
                z16 = false;
                z15 = true;
            }
        }
        if (z15 || (z14 && z16)) {
            arrayList.add(str.substring(i15, i14));
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    @Deprecated
    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                return length2;
            }
            if (length2 == 0) {
                return length;
            }
            if (length > length2) {
                length2 = charSequence.length();
                length = length2;
            } else {
                charSequence2 = charSequence;
                charSequence = charSequence2;
            }
            int[] iArr = new int[length + 1];
            for (int i14 = 0; i14 <= length; i14++) {
                iArr[i14] = i14;
            }
            for (int i15 = 1; i15 <= length2; i15++) {
                int i16 = iArr[0];
                char cCharAt = charSequence.charAt(i15 - 1);
                iArr[0] = i15;
                int i17 = 1;
                while (i17 <= length) {
                    int i18 = iArr[i17];
                    int i19 = i17 - 1;
                    iArr[i17] = Math.min(Math.min(iArr[i19] + 1, iArr[i17] + 1), i16 + (charSequence2.charAt(i19) == cCharAt ? 0 : 1));
                    i17++;
                    i16 = i18;
                }
            }
            return iArr[length];
        }
        h.s("Strings must not be null");
        return 0;
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        return replaceEach(str, strArr, strArr2, false, 0);
    }
}
