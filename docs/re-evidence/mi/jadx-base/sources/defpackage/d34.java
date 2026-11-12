package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class d34 extends nah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f15027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f15028b = {'T', 'N', '*', 'E'};
    public static final char[] c = {'/', AbstractJsonLexerKt.COLON, '+', '.'};
    public static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f15027a = cArr;
        d = cArr[0];
    }

    @Override // defpackage.nah
    public boolean[] c(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = d;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f15027a;
            boolean zG = c34.g(cArr, upperCase);
            boolean zG2 = c34.g(cArr, upperCase2);
            char[] cArr2 = f15028b;
            boolean zG3 = c34.g(cArr2, upperCase);
            boolean zG4 = c34.g(cArr2, upperCase2);
            if (zG) {
                if (!zG2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zG3) {
                if (zG2 || zG4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c3 = d;
                sb2.append(c3);
                sb2.append(str);
                sb2.append(c3);
                str = sb2.toString();
            } else if (!zG4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!c34.g(c, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = c34.d;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = c34.e[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
