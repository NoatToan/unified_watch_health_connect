package com.huawei.hms.scankit.p;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f16293a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f16294b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigInteger[] f16295c;

    static abstract /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16296a;

        static {
            int[] iArr = new int[b.values().length];
            f16296a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16296a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16296a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16296a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16296a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16296a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f16295c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f16295c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    private static boolean a(int i) {
        return i == 901 || i == 924 || i == 902 || i == 928 || i == 923 || i == 922;
    }

    private static b[] f(StringBuilder sb, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        b bVar3;
        int i = iArr2[1];
        if (i < 29) {
            iArr2[2] = f16293a[i];
        } else {
            if (i == 29 || i == 900) {
                bVar3 = b.ALPHA;
            } else if (i == 913) {
                sb.append((char) iArr[iArr2[0]]);
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
            return new b[]{bVar3, bVar2};
        }
        bVar3 = bVar2;
        return new b[]{bVar3, bVar2};
    }

    private static b[] b(StringBuilder sb, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        b bVar3;
        int i = iArr2[1];
        if (i < 26) {
            iArr2[2] = (char) (i + 65);
        } else {
            if (i == 26) {
                iArr2[2] = 32;
            } else if (i == 900) {
                bVar3 = b.ALPHA;
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
            return new b[]{bVar3, bVar2};
        }
        bVar3 = bVar2;
        return new b[]{bVar3, bVar2};
    }

    private static b[] e(StringBuilder sb, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        int i = iArr2[1];
        if (i < 29) {
            iArr2[2] = f16293a[i];
        } else if (i == 29 || i == 900) {
            bVar = b.ALPHA;
        } else if (i == 913) {
            sb.append((char) iArr[iArr2[0]]);
        } else {
            throw com.huawei.hms.scankit.p.a.a();
        }
        return new b[]{bVar, bVar2};
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    private static b[] d(StringBuilder sb, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        int i = iArr2[1];
        if (i < 25) {
            iArr2[2] = f16294b[i];
        } else if (i == 900) {
            bVar = b.ALPHA;
        } else if (i != 913) {
            switch (i) {
                case 25:
                    bVar = b.PUNCT;
                    break;
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    bVar = b.LOWER;
                    break;
                case 28:
                    bVar = b.ALPHA;
                    break;
                case 29:
                    bVar2 = bVar;
                    bVar = b.PUNCT_SHIFT;
                    break;
                default:
                    throw com.huawei.hms.scankit.p.a.a();
            }
        } else {
            sb.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    private static b[] c(StringBuilder sb, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        b bVar3;
        int i = iArr2[1];
        if (i < 26) {
            iArr2[2] = (char) (i + 97);
        } else if (i == 900) {
            bVar = b.ALPHA;
        } else if (i != 913) {
            switch (i) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    bVar3 = b.ALPHA_SHIFT;
                    bVar2 = bVar;
                    bVar = bVar3;
                    break;
                case 28:
                    bVar = b.MIXED;
                    break;
                case 29:
                    bVar3 = b.PUNCT_SHIFT;
                    bVar2 = bVar;
                    bVar = bVar3;
                    break;
                default:
                    throw com.huawei.hms.scankit.p.a.a();
            }
        } else {
            sb.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    private static int a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int iA;
        int i3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i == 901) {
            int[] iArr2 = new int[6];
            int i4 = i2 + 1;
            int i5 = iArr[i2];
            boolean z = false;
            int i6 = 0;
            long j = 0;
            while (true) {
                i3 = iArr[0];
                if (i4 < i3 && !z) {
                    int i7 = i6 + 1;
                    iArr2[i6] = i5;
                    j = (j * 900) + ((long) i5);
                    int i8 = i4 + 1;
                    i5 = iArr[i4];
                    if (i5 != 928) {
                        switch (i5) {
                            case 900:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i5) {
                                    case 922:
                                    case 923:
                                    case 924:
                                        break;
                                    default:
                                        if (i7 % 5 != 0 || i7 <= 0) {
                                            i4 = i8;
                                            i6 = i7;
                                        } else {
                                            for (int i9 = 0; i9 < 6; i9++) {
                                                byteArrayOutputStream.write((byte) (j >> ((5 - i9) * 8)));
                                            }
                                            i4 = i8;
                                            j = 0;
                                            i6 = 0;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    z = true;
                    i6 = i7;
                }
            }
            if (i4 == i3 && i5 < 900) {
                iArr2[i6] = i5;
                i6++;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                byteArrayOutputStream.write((byte) iArr2[i10]);
            }
            iA = i4;
        } else {
            iA = i == 924 ? a(i2, iArr, false, 0, 0L, byteArrayOutputStream) : i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return iA;
    }

    private static int b(int[] iArr, int i, StringBuilder sb) throws com.huawei.hms.scankit.p.a {
        int i2 = (iArr[0] - i) * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 == 900) {
                iArr2[i3] = 900;
                i3++;
            } else if (i5 == 913) {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            } else {
                if (!a(i5)) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
                z = true;
            }
            i = i4;
        }
        a(iArr2, iArr3, i3, sb);
        return i;
    }

    private static int a(int i, int[] iArr, boolean z, int i2, long j, ByteArrayOutputStream byteArrayOutputStream) throws com.huawei.hms.scankit.p.a {
        while (i < iArr[0] && !z) {
            int i3 = iArr[i];
            if (i3 < 900) {
                i2++;
                j = (j * 900) + ((long) i3);
                i++;
            } else {
                if (i3 != 928) {
                    switch (i3) {
                        default:
                            switch (i3) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    throw com.huawei.hms.scankit.p.a.a();
                            }
                        case 900:
                        case 901:
                        case 902:
                            z = true;
                            break;
                    }
                }
                z = true;
            }
            if (i2 % 5 == 0 && i2 > 0) {
                for (int i4 = 0; i4 < 6; i4++) {
                    byteArrayOutputStream.write((byte) (j >> ((5 - i4) * 8)));
                }
                j = 0;
                i2 = 0;
            }
        }
        return i;
    }

    private static b[] a(StringBuilder sb, int[] iArr, b bVar, b bVar2, int[] iArr2) throws com.huawei.hms.scankit.p.a {
        int i = iArr2[1];
        if (i < 26) {
            iArr2[2] = (char) (i + 65);
        } else if (i == 900) {
            bVar = b.ALPHA;
        } else if (i != 913) {
            switch (i) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    bVar = b.LOWER;
                    break;
                case 28:
                    bVar = b.MIXED;
                    break;
                case 29:
                    bVar2 = bVar;
                    bVar = b.PUNCT_SHIFT;
                    break;
                default:
                    throw com.huawei.hms.scankit.p.a.a();
            }
        } else {
            sb.append((char) iArr[iArr2[0]]);
        }
        return new b[]{bVar, bVar2};
    }

    static x1 a(int[] iArr, String str, Map map) throws com.huawei.hms.scankit.p.a {
        int i;
        int iA;
        StringBuilder sb = new StringBuilder(iArr.length * 2);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        s5 s5Var = new s5();
        Charset charsetForName = charset;
        int i3 = 2;
        int i4 = i2;
        while (true) {
            int i5 = iArr[0];
            if (i3 > i5 || (i3 == i5 && sb.length() > 0)) {
                break;
            }
            if (i4 == 927) {
                iA = i3 + 1;
                charsetForName = Charset.forName(o0.a(iArr[i3]).name());
            } else {
                iA = a(sb, i4, iArr, i3, charsetForName, s5Var);
            }
            if (iA < iArr.length) {
                i3 = iA + 1;
                i4 = iArr[iA];
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        if (sb.length() != 0) {
            if (charsetForName == StandardCharsets.ISO_8859_1) {
                int length = sb.length();
                byte[] bArr = new byte[length];
                for (i = 0; i < length; i++) {
                    bArr[i] = (byte) sb.charAt(i);
                }
                try {
                    x1 x1Var = new x1(null, new String(bArr, c7.a(bArr, map)), null, str);
                    x1Var.a(s5Var);
                    return x1Var;
                } catch (UnsupportedEncodingException unused) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
            }
            x1 x1Var2 = new x1(null, sb.toString(), null, str);
            x1Var2.a(s5Var);
            return x1Var2;
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    static int a(int[] iArr, int i, s5 s5Var) throws com.huawei.hms.scankit.p.a {
        int i2 = 0;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            try {
                s5Var.c(Integer.parseInt(a(iArr2, 2)));
                StringBuilder sb = new StringBuilder();
                int iB = b(iArr, i, sb);
                s5Var.b(sb.toString());
                int i3 = iArr[iB] == 923 ? iB + 1 : -1;
                a(iB, iArr, s5Var);
                if (i3 != -1) {
                    int i4 = iB - i3;
                    if (s5Var.a()) {
                        i4--;
                    }
                    s5Var.a(Arrays.copyOfRange(iArr, i3, i4 + i3));
                }
                return iB;
            } catch (Exception unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static int a(int[] iArr, int i, StringBuilder sb) throws com.huawei.hms.scankit.p.a {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                    i = i4;
                } else if (i5 == 900 || i5 == 901 || i5 == 928) {
                    z = true;
                } else {
                    switch (i5) {
                        case 922:
                        case 923:
                        case 924:
                            z = true;
                            break;
                        default:
                            throw com.huawei.hms.scankit.p.a.a();
                    }
                }
                if (i2 % 15 == 0 || i5 == 902 || z) {
                    if (i2 > 0) {
                        sb.append(a(iArr2, i2));
                        i2 = 0;
                    }
                }
            }
        }
        return i;
    }

    private static int a(StringBuilder sb, int i, int[] iArr, int i2, Charset charset, s5 s5Var) throws com.huawei.hms.scankit.p.a {
        if (i == 913) {
            sb.append((char) iArr[i2]);
            return i2 + 1;
        }
        if (i != 928) {
            switch (i) {
                case 900:
                    return b(iArr, i2, sb);
                case 901:
                    break;
                case 902:
                    return a(iArr, i2, sb);
                default:
                    switch (i) {
                        case 922:
                        case 923:
                            throw com.huawei.hms.scankit.p.a.a();
                        case 924:
                            break;
                        case 925:
                            return i2 + 1;
                        case 926:
                            return i2 + 2;
                        default:
                            return b(iArr, i2 - 1, sb);
                    }
                    break;
            }
            return a(i, iArr, charset, i2, sb);
        }
        return a(iArr, i2, s5Var);
    }

    private static void a(int i, int[] iArr, s5 s5Var) throws com.huawei.hms.scankit.p.a {
        while (i < iArr[0]) {
            int i2 = iArr[i];
            if (i2 == 923) {
                int i3 = iArr[i + 1];
                if (i3 == 0) {
                    StringBuilder sb = new StringBuilder();
                    i = b(iArr, i + 2, sb);
                    s5Var.c(sb.toString());
                } else if (i3 == 3) {
                    StringBuilder sb2 = new StringBuilder();
                    i = b(iArr, i + 2, sb2);
                    s5Var.d(sb2.toString());
                } else if (i3 == 4) {
                    StringBuilder sb3 = new StringBuilder();
                    i = b(iArr, i + 2, sb3);
                    s5Var.a(sb3.toString());
                } else if (i3 == 1) {
                    StringBuilder sb4 = new StringBuilder();
                    i = a(iArr, i + 2, sb4);
                    s5Var.b(Integer.parseInt(sb4.toString()));
                } else if (i3 == 2) {
                    StringBuilder sb5 = new StringBuilder();
                    i = a(iArr, i + 2, sb5);
                    s5Var.b(Long.parseLong(sb5.toString()));
                } else if (i3 == 6) {
                    StringBuilder sb6 = new StringBuilder();
                    i = a(iArr, i + 2, sb6);
                    s5Var.a(Integer.parseInt(sb6.toString()));
                } else if (i3 == 5) {
                    StringBuilder sb7 = new StringBuilder();
                    i = a(iArr, i + 2, sb7);
                    s5Var.a(Long.parseLong(sb7.toString()));
                } else {
                    throw com.huawei.hms.scankit.p.a.a();
                }
            } else if (i2 == 922) {
                i++;
                s5Var.a(true);
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i, StringBuilder sb) throws com.huawei.hms.scankit.p.a {
        b bVar = b.ALPHA;
        b bVar2 = bVar;
        int i2 = 0;
        while (i2 < i) {
            int[] iArr3 = {i2, iArr[i2], 0};
            b[] bVarArrA = {bVar, bVar2};
            switch (a.f16296a[bVar.ordinal()]) {
                case 1:
                    bVarArrA = a(sb, iArr2, bVar, bVar2, iArr3);
                    break;
                case 2:
                    bVarArrA = c(sb, iArr2, bVar, bVar2, iArr3);
                    break;
                case 3:
                    bVarArrA = d(sb, iArr2, bVar, bVar2, iArr3);
                    break;
                case 4:
                    bVarArrA = e(sb, iArr2, bVar, bVar2, iArr3);
                    break;
                case 5:
                    bVarArrA = b(sb, iArr2, bVar, bVar2, iArr3);
                    break;
                case 6:
                    bVarArrA = f(sb, iArr2, bVar, bVar2, iArr3);
                    break;
            }
            bVar = bVarArrA[0];
            b bVar3 = bVarArrA[1];
            int i3 = iArr3[0];
            char c2 = (char) iArr3[2];
            if (c2 != 0) {
                sb.append(c2);
            }
            i2 = i3 + 1;
            bVar2 = bVar3;
        }
    }

    private static String a(int[] iArr, int i) throws com.huawei.hms.scankit.p.a {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(f16295c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }
}
