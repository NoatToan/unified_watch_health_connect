package com.facebook.react.views.text;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes4.dex */
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7564a;

        static {
            int[] iArr = new int[TextTransform.values().length];
            f7564a = iArr;
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7564a[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7564a[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, TextTransform textTransform) {
        if (str == null) {
            return null;
        }
        int i = a.f7564a[textTransform.ordinal()];
        if (i == 1) {
            return str.toUpperCase();
        }
        if (i != 2) {
            return i != 3 ? str : capitalize(str);
        }
        return str.toLowerCase();
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        while (true) {
            int i = iFirst;
            iFirst = wordInstance.next();
            if (iFirst == -1) {
                return sb.toString();
            }
            String strSubstring = str.substring(i, iFirst);
            if (Character.isLetterOrDigit(strSubstring.charAt(0))) {
                sb.append(Character.toUpperCase(strSubstring.charAt(0)));
                sb.append(strSubstring.substring(1).toLowerCase());
            } else {
                sb.append(strSubstring);
            }
        }
    }
}
