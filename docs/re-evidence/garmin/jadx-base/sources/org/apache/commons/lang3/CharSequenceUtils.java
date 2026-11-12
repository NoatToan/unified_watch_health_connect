package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes3.dex */
public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;
    static final int TO_STRING_LIMIT = 16;

    private static boolean checkLaterThan1(CharSequence charSequence, CharSequence charSequence2, int i14, int i15) {
        int i16 = 1;
        for (int i17 = i14 - 1; i16 <= i17; i17--) {
            if (charSequence.charAt(i15 + i16) != charSequence2.charAt(i16) || charSequence.charAt(i15 + i17) != charSequence2.charAt(i17)) {
                return false;
            }
            i16++;
        }
        return true;
    }

    public static int indexOf(CharSequence charSequence, int i14, int i15) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i14, i15);
        }
        int length = charSequence.length();
        if (i15 < 0) {
            i15 = 0;
        }
        if (i14 < 65536) {
            while (i15 < length) {
                if (charSequence.charAt(i15) == i14) {
                    return i15;
                }
                i15++;
            }
            return -1;
        }
        if (i14 <= 1114111) {
            char[] chars = Character.toChars(i14);
            while (i15 < length - 1) {
                char cCharAt = charSequence.charAt(i15);
                int i16 = i15 + 1;
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt == chars[0] && cCharAt2 == chars[1]) {
                    return i15;
                }
                i15 = i16;
            }
        }
        return -1;
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i14) {
        if (charSequence2 != null && charSequence != null) {
            if (charSequence2 instanceof String) {
                if (charSequence instanceof String) {
                    return ((String) charSequence).lastIndexOf((String) charSequence2, i14);
                }
                if (charSequence instanceof StringBuilder) {
                    return ((StringBuilder) charSequence).lastIndexOf((String) charSequence2, i14);
                }
                if (charSequence instanceof StringBuffer) {
                    return ((StringBuffer) charSequence).lastIndexOf((String) charSequence2, i14);
                }
            }
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (i14 > length) {
                i14 = length;
            }
            if (i14 >= 0 && length2 >= 0 && length2 <= length) {
                if (length2 == 0) {
                    return i14;
                }
                if (length2 <= 16) {
                    if (charSequence instanceof String) {
                        return ((String) charSequence).lastIndexOf(charSequence2.toString(), i14);
                    }
                    if (charSequence instanceof StringBuilder) {
                        return ((StringBuilder) charSequence).lastIndexOf(charSequence2.toString(), i14);
                    }
                    if (charSequence instanceof StringBuffer) {
                        return ((StringBuffer) charSequence).lastIndexOf(charSequence2.toString(), i14);
                    }
                }
                if (i14 + length2 > length) {
                    i14 = length - length2;
                }
                char cCharAt = charSequence2.charAt(0);
                while (true) {
                    if (charSequence.charAt(i14) != cCharAt) {
                        i14--;
                        if (i14 < 0) {
                            return -1;
                        }
                    } else {
                        if (checkLaterThan1(charSequence, charSequence2, length2, i14)) {
                            return i14;
                        }
                        i14--;
                        if (i14 < 0) {
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static boolean regionMatches(CharSequence charSequence, boolean z14, int i14, CharSequence charSequence2, int i15, int i16) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z14, i14, (String) charSequence2, i15, i16);
        }
        int length = charSequence.length() - i14;
        int length2 = charSequence2.length() - i15;
        if (i14 < 0 || i15 < 0 || i16 < 0 || length < i16 || length2 < i16) {
            return false;
        }
        while (true) {
            int i17 = i16 - 1;
            if (i16 <= 0) {
                return true;
            }
            int i18 = i14 + 1;
            char cCharAt = charSequence.charAt(i14);
            int i19 = i15 + 1;
            char cCharAt2 = charSequence2.charAt(i15);
            if (cCharAt != cCharAt2) {
                if (!z14) {
                    return false;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                char upperCase2 = Character.toUpperCase(cCharAt2);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
            i14 = i18;
            i16 = i17;
            i15 = i19;
        }
    }

    public static CharSequence subSequence(CharSequence charSequence, int i14) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i14, charSequence.length());
    }

    public static char[] toCharArray(CharSequence charSequence) {
        int length = StringUtils.length(charSequence);
        if (length == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        char[] cArr = new char[length];
        for (int i14 = 0; i14 < length; i14++) {
            cArr[i14] = charSequence.charAt(i14);
        }
        return cArr;
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i14) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(charSequence2.toString(), i14);
        }
        if (charSequence instanceof StringBuilder) {
            return ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i14);
        }
        if (charSequence instanceof StringBuffer) {
            return ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i14);
        }
        return charSequence.toString().indexOf(charSequence2.toString(), i14);
    }

    public static int lastIndexOf(CharSequence charSequence, int i14, int i15) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i14, i15);
        }
        int length = charSequence.length();
        if (i15 < 0) {
            return -1;
        }
        if (i15 >= length) {
            i15 = length - 1;
        }
        if (i14 < 65536) {
            while (i15 >= 0) {
                if (charSequence.charAt(i15) == i14) {
                    return i15;
                }
                i15--;
            }
            return -1;
        }
        if (i14 <= 1114111) {
            char[] chars = Character.toChars(i14);
            if (i15 == length - 1) {
                return -1;
            }
            while (i15 >= 0) {
                char cCharAt = charSequence.charAt(i15);
                char cCharAt2 = charSequence.charAt(i15 + 1);
                if (chars[0] == cCharAt && chars[1] == cCharAt2) {
                    return i15;
                }
                i15--;
            }
        }
        return -1;
    }
}
