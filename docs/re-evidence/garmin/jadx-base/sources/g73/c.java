package g73;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    public static int a(int i14, CharSequence charSequence) {
        char cCharAt;
        if (i14 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i14) == '<') {
            while (true) {
                i14++;
                if (i14 >= charSequence.length() || (cCharAt = charSequence.charAt(i14)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i14 + 1;
                }
                if (cCharAt == '\\') {
                    int i15 = i14 + 1;
                    if (d.a(i15, charSequence)) {
                        i14 = i15;
                    }
                }
            }
            return -1;
        }
        int i16 = 0;
        int i17 = i14;
        while (i17 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i17);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i17 != i14) {
                    return i17;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i18 = i17 + 1;
                if (d.a(i18, charSequence)) {
                    i17 = i18;
                }
            } else if (cCharAt2 == '(') {
                i16++;
                if (i16 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i17 != i14) {
                        return i17;
                    }
                    return -1;
                }
            } else {
                if (i16 == 0) {
                    return i17;
                }
                i16--;
            }
            i17++;
        }
        return charSequence.length();
    }

    public static int b(int i14, CharSequence charSequence) {
        while (i14 < charSequence.length()) {
            switch (charSequence.charAt(i14)) {
                case '[':
                    return -1;
                case '\\':
                    int i15 = i14 + 1;
                    if (d.a(i15, charSequence)) {
                        i14 = i15;
                    }
                    break;
                case ']':
                    return i14;
            }
            i14++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    public static int c(CharSequence charSequence, int i14, char c14) {
        while (i14 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '\\') {
                int i15 = i14 + 1;
                if (d.a(i15, charSequence)) {
                    i14 = i15;
                } else {
                    if (cCharAt == c14) {
                        return i14;
                    }
                    if (c14 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c14) {
                    return i14;
                }
                if (c14 == ')') {
                    continue;
                }
            }
            i14++;
        }
        return charSequence.length();
    }
}
