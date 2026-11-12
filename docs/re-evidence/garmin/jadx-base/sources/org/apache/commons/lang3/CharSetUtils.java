package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes3.dex */
public class CharSetUtils {
    public static boolean containsAny(String str, String... strArr) {
        if (!StringUtils.isEmpty(str) && !deepEmpty(strArr)) {
            CharSet charSet = CharSet.getInstance(strArr);
            for (char c14 : str.toCharArray()) {
                if (charSet.contains(c14)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int count(String str, String... strArr) {
        if (StringUtils.isEmpty(str) || deepEmpty(strArr)) {
            return 0;
        }
        CharSet charSet = CharSet.getInstance(strArr);
        int i14 = 0;
        for (char c14 : str.toCharArray()) {
            if (charSet.contains(c14)) {
                i14++;
            }
        }
        return i14;
    }

    private static boolean deepEmpty(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (StringUtils.isNotEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    public static String delete(String str, String... strArr) {
        return (StringUtils.isEmpty(str) || deepEmpty(strArr)) ? str : modify(str, strArr, false);
    }

    public static String keep(String str, String... strArr) {
        if (str == null) {
            return null;
        }
        return (str.isEmpty() || deepEmpty(strArr)) ? "" : modify(str, strArr, true);
    }

    private static String modify(String str, String[] strArr, boolean z14) {
        CharSet charSet = CharSet.getInstance(strArr);
        StringBuilder sb3 = new StringBuilder(str.length());
        for (char c14 : str.toCharArray()) {
            if (charSet.contains(c14) == z14) {
                sb3.append(c14);
            }
        }
        return sb3.toString();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e A[PHI: r5
      0x004e: PHI (r5v2 java.lang.Character) = (r5v1 java.lang.Character), (r5v4 java.lang.Character), (r5v1 java.lang.Character) binds: [B:10:0x002c, B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public static String squeeze(String str, String... strArr) {
        if (StringUtils.isEmpty(str) || deepEmpty(strArr)) {
            return str;
        }
        CharSet charSet = CharSet.getInstance(strArr);
        StringBuilder sb3 = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c14 = charArray[0];
        sb3.append(c14);
        Character chValueOf = null;
        Character chValueOf2 = null;
        for (int i14 = 1; i14 < length; i14++) {
            char c15 = charArray[i14];
            if (c15 != c14) {
                sb3.append(c15);
                c14 = c15;
            } else if (chValueOf == null || c15 != chValueOf.charValue()) {
                if (chValueOf2 != null && c15 == chValueOf2.charValue()) {
                    sb3.append(c15);
                    c14 = c15;
                } else if (charSet.contains(c15)) {
                    chValueOf = Character.valueOf(c15);
                } else {
                    chValueOf2 = Character.valueOf(c15);
                    sb3.append(c15);
                    c14 = c15;
                }
            }
        }
        return sb3.toString();
    }
}
