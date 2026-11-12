package org.apache.commons.lang3.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class WordUtils {
    public static String capitalize(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (StringUtils.isEmpty(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z14 = true;
        for (int i14 = 0; i14 < charArray.length; i14++) {
            char c14 = charArray[i14];
            if (isDelimiter(c14, cArr)) {
                z14 = true;
            } else if (z14) {
                charArray[i14] = Character.toTitleCase(c14);
                z14 = false;
            }
        }
        return new String(charArray);
    }

    public static String capitalizeFully(String str, char... cArr) {
        return (StringUtils.isEmpty(str) || (cArr == null ? -1 : cArr.length) == 0) ? str : capitalize(str.toLowerCase(), cArr);
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

    public static String initials(String str, char... cArr) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        int length = str.length();
        char[] cArr2 = new char[(length / 2) + 1];
        boolean z14 = true;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (isDelimiter(cCharAt, cArr)) {
                z14 = true;
            } else if (z14) {
                cArr2[i14] = cCharAt;
                i14++;
                z14 = false;
            }
        }
        return new String(cArr2, 0, i14);
    }

    private static boolean isDelimiter(char c14, char[] cArr) {
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

    public static String swapCase(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean zIsWhitespace = true;
        for (int i14 = 0; i14 < charArray.length; i14++) {
            char c14 = charArray[i14];
            if (Character.isUpperCase(c14) || Character.isTitleCase(c14)) {
                charArray[i14] = Character.toLowerCase(c14);
            } else {
                if (!Character.isLowerCase(c14)) {
                    zIsWhitespace = Character.isWhitespace(c14);
                } else if (zIsWhitespace) {
                    charArray[i14] = Character.toTitleCase(c14);
                } else {
                    charArray[i14] = Character.toUpperCase(c14);
                }
            }
            zIsWhitespace = false;
        }
        return new String(charArray);
    }

    public static String uncapitalize(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (StringUtils.isEmpty(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z14 = true;
        for (int i14 = 0; i14 < charArray.length; i14++) {
            char c14 = charArray[i14];
            if (isDelimiter(c14, cArr)) {
                z14 = true;
            } else if (z14) {
                charArray[i14] = Character.toLowerCase(c14);
                z14 = false;
            }
        }
        return new String(charArray);
    }

    public static String wrap(String str, int i14, String str2, boolean z14, String str3) {
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
        int iEnd = 0;
        while (iEnd < length) {
            int i15 = iEnd + i14;
            Matcher matcher = patternCompile.matcher(str.substring(iEnd, Math.min((int) Math.min(2147483647L, ((long) i15) + 1), length)));
            if (!matcher.find()) {
                iStart = -1;
            } else if (matcher.start() == 0) {
                iEnd += matcher.end();
            } else {
                iStart = matcher.start() + iEnd;
            }
            if (length - iEnd <= i14) {
                break;
            }
            while (matcher.find()) {
                iStart = matcher.start() + iEnd;
            }
            if (iStart >= iEnd) {
                sb3.append((CharSequence) str, iEnd, iStart);
                sb3.append(str2);
            } else if (z14) {
                sb3.append((CharSequence) str, iEnd, i15);
                sb3.append(str2);
                iEnd = i15;
            } else {
                Matcher matcher2 = patternCompile.matcher(str.substring(i15));
                if (matcher2.find()) {
                    iStart = matcher2.start() + iEnd + i14;
                }
                if (iStart >= 0) {
                    sb3.append((CharSequence) str, iEnd, iStart);
                    sb3.append(str2);
                } else {
                    sb3.append((CharSequence) str, iEnd, str.length());
                    iEnd = length;
                }
            }
            iEnd = iStart + 1;
        }
        sb3.append((CharSequence) str, iEnd, str.length());
        return sb3.toString();
    }

    public static String capitalizeFully(String str) {
        return capitalizeFully(str, null);
    }

    public static String capitalize(String str) {
        return capitalize(str, null);
    }

    public static String uncapitalize(String str) {
        return uncapitalize(str, null);
    }

    public static String initials(String str) {
        return initials(str, null);
    }

    public static String wrap(String str, int i14, String str2, boolean z14) {
        return wrap(str, i14, str2, z14, StringUtils.SPACE);
    }

    public static String wrap(String str, int i14) {
        return wrap(str, i14, null, false);
    }
}
