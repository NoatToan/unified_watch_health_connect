package com.huawei.hms.scankit.p;

import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16378a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static abstract /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16379a;

        static {
            int[] iArr = new int[u4.values().length];
            f16379a = iArr;
            try {
                iArr[u4.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16379a[u4.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16379a[u4.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16379a[u4.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void b(CharSequence charSequence, r rVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                rVar.a((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    rVar.a((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    rVar.a(iCharAt, 4);
                }
            }
        }
    }

    static void a(String str, r rVar, String str2) throws WriterException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                rVar.a(b2, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    static void a(CharSequence charSequence, r rVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iA = a(charSequence.charAt(i));
            if (iA == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iA2 = a(charSequence.charAt(i2));
                if (iA2 != -1) {
                    rVar.a((iA * 45) + iA2, 11);
                    i += 2;
                } else {
                    throw new WriterException();
                }
            } else {
                rVar.a(iA, 6);
                i = i2;
            }
        }
    }

    private static void a(o0 o0Var, r rVar) {
        rVar.a(u4.ECI.b(), 4);
        rVar.a(o0Var.b(), 8);
    }

    static void a(String str, r rVar) throws WriterException {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                int i4 = 33088;
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - i4;
                } else if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                } else {
                    i4 = 49472;
                    i = i3 - i4;
                }
                if (i != -1) {
                    rVar.a(((i >> 8) * PsExtractor.AUDIO_STREAM) + (i & 255), 13);
                } else {
                    throw new WriterException("Invalid byte sequence");
                }
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    static void a(int i, b8 b8Var, u4 u4Var, r rVar) throws WriterException {
        int iA = u4Var.a(b8Var);
        int i2 = 1 << iA;
        if (i < i2) {
            rVar.a(i, iA);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    static void a(u4 u4Var, r rVar) {
        rVar.a(u4Var.b(), 4);
    }

    private static int a(u4 u4Var, r rVar, r rVar2, b8 b8Var) {
        return rVar.d() + u4Var.a(b8Var) + rVar2.d();
    }

    private static int a(c0 c0Var) {
        return r4.a(c0Var) + r4.b(c0Var) + r4.c(c0Var) + r4.d(c0Var);
    }

    private static int a(r rVar, b3 b3Var, b8 b8Var, c0 c0Var) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            t4.a(rVar, b3Var, b8Var, i3, c0Var);
            int iA = a(c0Var);
            if (iA < i) {
                i2 = i3;
                i = iA;
            }
        }
        return i2;
    }

    private static b8 a(int i, b3 b3Var) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            b8 b8VarC = b8.c(i2);
            if (a(i, b8VarC, b3Var)) {
                return b8VarC;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public static h6 a(String str, b3 b3Var, Map map) throws WriterException {
        String string;
        b8 b8VarA;
        o0 o0VarA;
        boolean z = map != null && map.containsKey(u2.CHARACTER_SET);
        if (!z) {
            string = "ISO-8859-1";
        } else {
            string = map.get(u2.CHARACTER_SET).toString();
        }
        u4 u4VarA = a(str, string);
        r rVar = new r();
        u4 u4Var = u4.BYTE;
        if (u4VarA == u4Var && z && (o0VarA = o0.a(string)) != null) {
            a(o0VarA, rVar);
        }
        if (map != null) {
            u2 u2Var = u2.GS1_FORMAT;
            if (map.containsKey(u2Var) && Boolean.valueOf(map.get(u2Var).toString()).booleanValue()) {
                a(u4.FNC1_FIRST_POSITION, rVar);
            }
        }
        a(u4VarA, rVar);
        r rVar2 = new r();
        a(str, u4VarA, rVar2, string);
        if (map != null) {
            u2 u2Var2 = u2.QR_VERSION;
            if (map.containsKey(u2Var2)) {
                b8VarA = b8.c(Integer.parseInt(map.get(u2Var2).toString()));
                if (!a(a(u4VarA, rVar, rVar2, b8VarA), b8VarA, b3Var)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                b8VarA = a(b3Var, u4VarA, rVar, rVar2);
            }
        } else {
            b8VarA = a(b3Var, u4VarA, rVar, rVar2);
        }
        r rVar3 = new r();
        rVar3.a(rVar);
        a(u4VarA == u4Var ? rVar2.e() : str.length(), b8VarA, u4VarA, rVar3);
        rVar3.a(rVar2);
        b8.b bVarA = b8VarA.a(b3Var);
        int iE = b8VarA.e() - bVarA.d();
        a(iE, rVar3);
        r rVarA = a(rVar3, b8VarA.e(), iE, bVarA.c());
        h6 h6Var = new h6();
        h6Var.a(b3Var);
        h6Var.a(u4VarA);
        h6Var.a(b8VarA);
        int iD = b8VarA.d();
        c0 c0Var = new c0(iD, iD);
        int iA = a(rVarA, b3Var, b8VarA, c0Var);
        h6Var.b(iA);
        t4.a(rVarA, b3Var, b8VarA, iA, c0Var);
        h6Var.a(c0Var);
        return h6Var;
    }

    static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new q6(o3.l).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static int a(int i) {
        int[] iArr = f16378a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i2 / i3;
            int i9 = i8 + 1;
            int i10 = i7 - i8;
            int i11 = (i7 + 1) - i9;
            if (i10 != i11) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i != ((i8 + i10) * i6) + ((i9 + i11) * i5)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i4 < i6) {
                iArr[0] = i8;
                iArr2[0] = i10;
                return;
            } else {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            }
        }
        throw new WriterException("Block ID too large");
    }

    static r a(r rVar, int i, int i2, int i3) throws WriterException {
        if (rVar.e() == i2) {
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            int iMax = 0;
            int iMax2 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                a(i, i2, i3, i5, iArr, iArr2);
                int i6 = iArr[0];
                byte[] bArr = new byte[i6];
                rVar.a(i4 * 8, bArr, 0, i6);
                byte[] bArrA = a(bArr, iArr2[0]);
                arrayList.add(new y(bArr, bArrA));
                iMax = Math.max(iMax, i6);
                iMax2 = Math.max(iMax2, bArrA.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                r rVar2 = new r();
                for (int i7 = 0; i7 < iMax; i7++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] bArrA2 = ((y) it.next()).a();
                        if (i7 < bArrA2.length) {
                            rVar2.a(bArrA2[i7], 8);
                        }
                    }
                }
                for (int i8 = 0; i8 < iMax2; i8++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] bArrB = ((y) it2.next()).b();
                        if (i8 < bArrB.length) {
                            rVar2.a(bArrB[i8], 8);
                        }
                    }
                }
                if (i == rVar2.e()) {
                    return rVar2;
                }
                throw new WriterException("Interleaving error: " + i + " and " + rVar2.e() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static b8 a(b3 b3Var, u4 u4Var, r rVar, r rVar2) {
        return a(a(u4Var, rVar, rVar2, a(a(u4Var, rVar, rVar2, b8.c(1)), b3Var)), b3Var);
    }

    static void a(int i, r rVar) throws WriterException {
        int i2 = i * 8;
        if (rVar.d() <= i2) {
            for (int i3 = 0; i3 < 4 && rVar.d() < i2; i3++) {
                rVar.a(false);
            }
            int iD = rVar.d() & 7;
            if (iD > 0) {
                while (iD < 8) {
                    rVar.a(false);
                    iD++;
                }
            }
            int iE = rVar.e();
            for (int i4 = 0; i4 < i - iE; i4++) {
                rVar.a((i4 & 1) == 0 ? FitnessSleepType.HW_FITNESS_DREAM : 17, 8);
            }
            if (rVar.d() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + rVar.d() + " > " + i2);
    }

    private static boolean a(int i, b8 b8Var, b3 b3Var) {
        return b8Var.e() - b8Var.a(b3Var).d() >= (i + 7) / 8;
    }

    private static u4 a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && a(str)) {
            return u4.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (a(cCharAt) == -1) {
                    return u4.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return u4.ALPHANUMERIC;
        }
        if (z2) {
            return u4.NUMERIC;
        }
        return u4.BYTE;
    }

    static void a(String str, u4 u4Var, r rVar, String str2) throws WriterException {
        int i = a.f16379a[u4Var.ordinal()];
        if (i == 1) {
            b(str, rVar);
            return;
        }
        if (i == 2) {
            a((CharSequence) str, rVar);
            return;
        }
        if (i == 3) {
            a(str, rVar, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: " + u4Var);
            }
            a(str, rVar);
        }
    }
}
