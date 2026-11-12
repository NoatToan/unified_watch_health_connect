package d53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class s extends r {
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    public static final boolean e(String str) {
        char c14;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        String str2;
        boolean z17;
        boolean z18 = true;
        int length = str.length() - 1;
        int i15 = 0;
        while (true) {
            c14 = ' ';
            if (i15 > length || str.charAt(i15) > ' ') {
                break;
            }
            i15++;
        }
        if (i15 > length) {
            return false;
        }
        while (length > i15 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i15) == '+' || str.charAt(i15) == '-') {
            i15++;
        }
        if (i15 > length) {
            return false;
        }
        if (str.charAt(i15) != '0') {
            z14 = true;
            z15 = false;
        } else {
            int i16 = i15 + 1;
            if (i16 > length) {
                return true;
            }
            if ((str.charAt(i16) | ' ') == 120) {
                int i17 = i15 + 2;
                int i18 = i17;
                while (true) {
                    if (i18 > length) {
                        z14 = z18;
                        break;
                    }
                    char cCharAt = str.charAt(i18);
                    z14 = z18;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i18++;
                    z18 = z14;
                }
                boolean z19 = i17 != i18 ? z14 : false;
                if (i18 <= length) {
                    if (str.charAt(i18) == '.') {
                        int i19 = i18 + 1;
                        int i24 = i19;
                        while (i24 <= length) {
                            char cCharAt2 = str.charAt(i24);
                            char c15 = c14;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i24++;
                            c14 = c15;
                        }
                        z17 = i19 != i24 ? z14 : false;
                        i18 = i24;
                    } else {
                        z17 = false;
                    }
                    if (z19 || z17) {
                        i15 = i18;
                    }
                    if (i15 != -1 || i15 > length) {
                        return false;
                    }
                    z15 = z14;
                }
                i15 = -1;
                if (i15 != -1) {
                }
                return false;
            }
            z14 = true;
            z15 = false;
        }
        if (!z15) {
            int i25 = i15;
            while (i25 <= length && ((str.charAt(i25) - '0') & 65535) < 10) {
                i25++;
            }
            boolean z24 = i15 != i25 ? z14 : false;
            if (i25 > length) {
                i15 = i25;
            } else {
                if (str.charAt(i25) == '.') {
                    int i26 = i25 + 1;
                    i14 = i26;
                    while (i14 <= length && ((str.charAt(i14) - '0') & 65535) < 10) {
                        i14++;
                    }
                    if (i26 != i14) {
                        z16 = z14;
                    }
                    if (!z24 || z16) {
                        i15 = i14;
                    } else {
                        if (length == i14 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i14 + 7 ? "Infinity" : null;
                        }
                        i15 = (str2 != null && w.E(str, str2, i14, false) == i14) ? length + 1 : -1;
                    }
                } else {
                    i14 = i25;
                }
                z16 = false;
                if (z24) {
                    i15 = i14;
                } else {
                    i15 = i14;
                }
            }
            if (i15 == -1) {
                return false;
            }
            if (i15 > length) {
                return z14;
            }
        }
        int i27 = i15 + 1;
        int iCharAt = str.charAt(i15) | ' ';
        if (iCharAt != (z15 ? 112 : 101)) {
            if (z15 || (!(iCharAt == 102 || iCharAt == 100) || i27 <= length)) {
                return false;
            }
            return z14;
        }
        if (i27 > length) {
            return false;
        }
        if ((str.charAt(i27) == '+' || str.charAt(i27) == '-') && (i27 = i15 + 2) > length) {
            return false;
        }
        while (i27 <= length && ((str.charAt(i27) - '0') & 65535) < 10) {
            i27++;
        }
        if (i27 > length) {
            return z14;
        }
        if (i27 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i27) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z14;
        }
        return false;
    }

    public static Double f(String str) {
        str.getClass();
        try {
            if (e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float g(String str) {
        str.getClass();
        try {
            if (e(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
