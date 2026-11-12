package org.cybergarage.util;

/* JADX INFO: loaded from: classes23.dex */
public final class StringUtil {
    public static final int findFirstNotOf(String str, String str2) {
        return findOf(str, str2, 0, str.length() - 1, 1, false);
    }

    public static final int findFirstOf(String str, String str2) {
        return findOf(str, str2, 0, str.length() - 1, 1, true);
    }

    public static final int findLastNotOf(String str, String str2) {
        return findOf(str, str2, str.length() - 1, 0, -1, false);
    }

    public static final int findLastOf(String str, String str2) {
        return findOf(str, str2, str.length() - 1, 0, -1, true);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0024  */
    /* JADX WARN: Code duplicated, block: B:25:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0029 A[SYNTHETIC] */
    public static final int findOf(String str, String str2, int i, int i2, int i3, boolean z) {
        char cCharAt;
        int i4;
        int i5;
        char cCharAt2;
        if (i3 == 0) {
            return -1;
        }
        int length = str2.length();
        while (true) {
            if (i3 > 0) {
                if (i2 < i) {
                    break;
                }
                cCharAt = str.charAt(i);
                i5 = 0;
                for (i4 = 0; i4 < length; i4++) {
                    cCharAt2 = str2.charAt(i4);
                    if (z) {
                        if (cCharAt != cCharAt2) {
                            i5++;
                        }
                        if (i5 == length) {
                            return i;
                        }
                    } else if (cCharAt == cCharAt2) {
                        return i;
                    }
                }
                i += i3;
            } else {
                if (i < i2) {
                    break;
                }
                cCharAt = str.charAt(i);
                i5 = 0;
                while (i4 < length) {
                    cCharAt2 = str2.charAt(i4);
                    if (z) {
                        if (cCharAt != cCharAt2) {
                            i5++;
                        }
                        if (i5 == length) {
                            return i;
                        }
                    } else if (cCharAt == cCharAt2) {
                        return i;
                    }
                }
                i += i3;
            }
        }
        return -1;
    }

    public static final boolean hasData(String str) {
        return str != null && str.length() > 0;
    }

    public static final int toInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            Debug.warning(e);
            return 0;
        }
    }

    public static final long toLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            Debug.warning(e);
            return 0L;
        }
    }

    public static final String trim(String str, String str2) {
        int iFindFirstNotOf = findFirstNotOf(str, str2);
        if (iFindFirstNotOf < 0) {
            return str;
        }
        String strSubstring = str.substring(iFindFirstNotOf, str.length());
        int iFindLastNotOf = findLastNotOf(strSubstring, str2);
        return iFindLastNotOf < 0 ? strSubstring : strSubstring.substring(0, iFindLastNotOf + 1);
    }
}
