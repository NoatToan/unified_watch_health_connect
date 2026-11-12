package org.apache.commons.text;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class WordUtils {
    public static String abbreviate(String str, int i14, int i15, String str2) {
        boolean z14 = true;
        Validate.isTrue(i15 >= -1, "upper value cannot be less than -1", new Object[0]);
        if (i15 < i14 && i15 != -1) {
            z14 = false;
        }
        Validate.isTrue(z14, "upper value is less than lower value", new Object[0]);
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (i14 > str.length()) {
            i14 = str.length();
        }
        if (i15 == -1 || i15 > str.length()) {
            i15 = str.length();
        }
        StringBuilder sb3 = new StringBuilder();
        int iIndexOf = StringUtils.indexOf(str, StringUtils.SPACE, i14);
        if (iIndexOf == -1) {
            sb3.append((CharSequence) str, 0, i15);
            if (i15 != str.length()) {
                sb3.append(StringUtils.defaultString(str2));
            }
        } else if (iIndexOf > i15) {
            sb3.append((CharSequence) str, 0, i15);
            sb3.append(StringUtils.defaultString(str2));
        } else {
            sb3.append((CharSequence) str, 0, iIndexOf);
            sb3.append(StringUtils.defaultString(str2));
        }
        return sb3.toString();
    }

    public static String capitalize(String str, char... cArr) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        Set<Integer> setGenerateDelimiterSet = generateDelimiterSet(cArr);
        int length = str.length();
        int[] iArr = new int[length];
        int iCharCount = 0;
        int i14 = 0;
        while (true) {
            boolean z14 = true;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (setGenerateDelimiterSet.contains(Integer.valueOf(iCodePointAt))) {
                    iArr[i14] = iCodePointAt;
                    iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                    i14++;
                } else if (z14) {
                    int titleCase = Character.toTitleCase(iCodePointAt);
                    int i15 = i14 + 1;
                    iArr[i14] = titleCase;
                    int iCharCount2 = Character.charCount(titleCase) + iCharCount;
                    z14 = false;
                    iCharCount = iCharCount2;
                    i14 = i15;
                } else {
                    iArr[i14] = iCodePointAt;
                    iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                    i14++;
                }
            }
            return new String(iArr, 0, i14);
        }
    }

    public static String capitalizeFully(String str, char... cArr) {
        return StringUtils.isEmpty(str) ? str : capitalize(str.toLowerCase(), cArr);
    }

    public static boolean containsAllWords(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (StringUtils.isEmpty(charSequence) || ArrayUtils.isEmpty(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (StringUtils.isBlank(charSequence2)) {
                return false;
            }
            if (!Pattern.compile(".*\\b" + ((Object) charSequence2) + "\\b.*").matcher(charSequence).matches()) {
                return false;
            }
        }
        return true;
    }

    private static Set<Integer> generateDelimiterSet(char[] cArr) {
        HashSet hashSet = new HashSet();
        if (cArr == null || cArr.length == 0) {
            if (cArr == null) {
                hashSet.add(Integer.valueOf(Character.codePointAt(new char[]{' '}, 0)));
            }
            return hashSet;
        }
        for (int i14 = 0; i14 < cArr.length; i14++) {
            hashSet.add(Integer.valueOf(Character.codePointAt(cArr, i14)));
        }
        return hashSet;
    }

    public static String initials(String str, char... cArr) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        Set<Integer> setGenerateDelimiterSet = generateDelimiterSet(cArr);
        int length = str.length();
        int[] iArr = new int[(length / 2) + 1];
        boolean z14 = true;
        int iCharCount = 0;
        int i14 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (setGenerateDelimiterSet.contains(Integer.valueOf(iCodePointAt)) || (cArr == null && Character.isWhitespace(iCodePointAt))) {
                z14 = true;
            } else if (z14) {
                iArr[i14] = iCodePointAt;
                i14++;
                z14 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return new String(iArr, 0, i14);
    }

    @Deprecated
    public static boolean isDelimiter(int i14, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(i14);
        }
        for (int i15 = 0; i15 < cArr.length; i15++) {
            if (Character.codePointAt(cArr, i15) == i14) {
                return true;
            }
        }
        return false;
    }

    public static String swapCase(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        boolean zIsWhitespace = true;
        int iCharCount = 0;
        int i14 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (Character.isUpperCase(iCodePointAt) || Character.isTitleCase(iCodePointAt)) {
                iCodePointAt = Character.toLowerCase(iCodePointAt);
            } else {
                if (!Character.isLowerCase(iCodePointAt)) {
                    zIsWhitespace = Character.isWhitespace(iCodePointAt);
                } else if (zIsWhitespace) {
                    iCodePointAt = Character.toTitleCase(iCodePointAt);
                } else {
                    iCodePointAt = Character.toUpperCase(iCodePointAt);
                }
                iArr[i14] = iCodePointAt;
                iCharCount += Character.charCount(iCodePointAt);
                i14++;
            }
            zIsWhitespace = false;
            iArr[i14] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i14++;
        }
        return new String(iArr, 0, i14);
    }

    public static String uncapitalize(String str, char... cArr) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        Set<Integer> setGenerateDelimiterSet = generateDelimiterSet(cArr);
        int length = str.length();
        int[] iArr = new int[length];
        int iCharCount = 0;
        int i14 = 0;
        while (true) {
            boolean z14 = true;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (setGenerateDelimiterSet.contains(Integer.valueOf(iCodePointAt))) {
                    iArr[i14] = iCodePointAt;
                    iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                    i14++;
                } else if (z14) {
                    int lowerCase = Character.toLowerCase(iCodePointAt);
                    int i15 = i14 + 1;
                    iArr[i14] = lowerCase;
                    int iCharCount2 = Character.charCount(lowerCase) + iCharCount;
                    z14 = false;
                    iCharCount = iCharCount2;
                    i14 = i15;
                } else {
                    iArr[i14] = iCodePointAt;
                    iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                    i14++;
                }
            }
            return new String(iArr, 0, i14);
        }
    }

    public static String wrap(String str, int i14, String str2, boolean z14, String str3) {
        int iEnd;
        int iStart;
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = System.lineSeparator();
        }
        if (i14 < 1) {
            i14 = 1;
        }
        if (StringUtils.isBlank(str3)) {
            str3 = StringUtils.SPACE;
        }
        Pattern patternCompile = Pattern.compile(str3);
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length + 32);
        int iEnd2 = 0;
        loop0: while (true) {
            iEnd = -1;
            while (true) {
                if (iEnd2 >= length) {
                    break loop0;
                }
                Matcher matcher = patternCompile.matcher(str.substring(iEnd2, Math.min((int) Math.min(2147483647L, ((long) (iEnd2 + i14)) + 1), length)));
                if (matcher.find()) {
                    if (matcher.start() == 0) {
                        iEnd = matcher.end() - matcher.start();
                        if (iEnd != 0) {
                            iEnd2 += matcher.end();
                        } else {
                            iEnd2++;
                        }
                    }
                    iStart = matcher.start() + iEnd2;
                } else {
                    iStart = -1;
                }
                if (length - iEnd2 <= i14) {
                    break loop0;
                }
                while (matcher.find()) {
                    iStart = matcher.start() + iEnd2;
                }
                if (iStart < iEnd2) {
                    if (!z14) {
                        Matcher matcher2 = patternCompile.matcher(str.substring(iEnd2 + i14));
                        if (matcher2.find()) {
                            iEnd = matcher2.end() - matcher2.start();
                            iStart = matcher2.start() + iEnd2 + i14;
                        }
                        if (iStart < 0) {
                            if (iEnd == 0 && iEnd2 != 0) {
                                iEnd2--;
                            }
                            sb3.append((CharSequence) str, iEnd2, str.length());
                            iEnd2 = length;
                            break;
                        }
                        if (iEnd == 0 && iEnd2 != 0) {
                            iEnd2--;
                        }
                        sb3.append((CharSequence) str, iEnd2, iStart);
                        sb3.append(str2);
                    } else {
                        if (iEnd == 0) {
                            iEnd2--;
                        }
                        int i15 = i14 + iEnd2;
                        sb3.append((CharSequence) str, iEnd2, i15);
                        sb3.append(str2);
                        iEnd2 = i15;
                        break;
                    }
                } else {
                    sb3.append((CharSequence) str, iEnd2, iStart);
                    sb3.append(str2);
                }
                iEnd2 = iStart + 1;
            }
        }
        if (iEnd == 0 && iEnd2 < length) {
            iEnd2--;
        }
        sb3.append((CharSequence) str, iEnd2, str.length());
        return sb3.toString();
    }

    public static String capitalizeFully(String str) {
        return capitalizeFully(str, null);
    }

    @Deprecated
    public static boolean isDelimiter(char c14, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(c14);
        }
        for (char c15 : cArr) {
            if (c14 == c15) {
                return true;
            }
        }
        return false;
    }

    public static String initials(String str) {
        return initials(str, null);
    }

    public static String capitalize(String str) {
        return capitalize(str, null);
    }

    public static String uncapitalize(String str) {
        return uncapitalize(str, null);
    }

    public static String wrap(String str, int i14, String str2, boolean z14) {
        return wrap(str, i14, str2, z14, StringUtils.SPACE);
    }

    public static String wrap(String str, int i14) {
        return wrap(str, i14, null, false);
    }
}
