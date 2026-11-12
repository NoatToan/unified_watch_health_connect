package defpackage;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class t98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f34472a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34473a;

        static {
            int[] iArr = new int[Mode.values().length];
            f34473a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34473a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34473a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34473a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, zo2 zo2Var, String str2) throws WriterException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                zo2Var.c(b2, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    public static void b(CharSequence charSequence, zo2 zo2Var) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iP = p(charSequence.charAt(i));
            if (iP == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iP2 = p(charSequence.charAt(i2));
                if (iP2 == -1) {
                    throw new WriterException();
                }
                zo2Var.c((iP * 45) + iP2, 11);
                i += 2;
            } else {
                zo2Var.c(iP, 6);
                i = i2;
            }
        }
    }

    public static void c(String str, Mode mode, zo2 zo2Var, String str2) throws WriterException {
        int i = a.f34473a[mode.ordinal()];
        if (i == 1) {
            h(str, zo2Var);
            return;
        }
        if (i == 2) {
            b(str, zo2Var);
        } else if (i == 3) {
            a(str, zo2Var, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            e(str, zo2Var);
        }
    }

    public static void d(CharacterSetECI characterSetECI, zo2 zo2Var) {
        zo2Var.c(Mode.ECI.getBits(), 4);
        zo2Var.c(characterSetECI.getValue(), 8);
    }

    public static void e(String str, zo2 zo2Var) throws WriterException {
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
                if (i == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                zo2Var.c(((i >> 8) * 192) + (i & 255), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    public static void f(int i, bpq bpqVar, Mode mode, zo2 zo2Var) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(bpqVar);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            zo2Var.c(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    public static void g(Mode mode, zo2 zo2Var) {
        zo2Var.c(mode.getBits(), 4);
    }

    public static void h(CharSequence charSequence, zo2 zo2Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                zo2Var.c((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    zo2Var.c((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    zo2Var.c(iCharAt, 4);
                }
            }
        }
    }

    public static int i(Mode mode, zo2 zo2Var, zo2 zo2Var2, bpq bpqVar) {
        return zo2Var.k() + mode.getCharacterCountBits(bpqVar) + zo2Var2.k();
    }

    public static int j(k73 k73Var) {
        return r5f.a(k73Var) + r5f.c(k73Var) + r5f.d(k73Var) + r5f.e(k73Var);
    }

    public static int k(zo2 zo2Var, ErrorCorrectionLevel errorCorrectionLevel, bpq bpqVar, k73 k73Var) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            w8f.a(zo2Var, errorCorrectionLevel, bpqVar, i3, k73Var);
            int iJ = j(k73Var);
            if (iJ < i) {
                i2 = i3;
                i = iJ;
            }
        }
        return i2;
    }

    public static Mode l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return Mode.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        return z2 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static bpq m(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            bpq bpqVarI = bpq.i(i2);
            if (v(i, bpqVarI, errorCorrectionLevel)) {
                return bpqVarI;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public static hfi n(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        bpq bpqVarT;
        CharacterSetECI characterSetECIByName;
        boolean z = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String string = z ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode modeL = l(str, string);
        zo2 zo2Var = new zo2();
        Mode mode = Mode.BYTE;
        if (modeL == mode && z && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            d(characterSetECIByName, zo2Var);
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue()) {
                g(Mode.FNC1_FIRST_POSITION, zo2Var);
            }
        }
        g(modeL, zo2Var);
        zo2 zo2Var2 = new zo2();
        c(str, modeL, zo2Var2, string);
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType2)) {
                bpqVarT = bpq.i(Integer.parseInt(map.get(encodeHintType2).toString()));
                if (!v(i(modeL, zo2Var, zo2Var2, bpqVarT), bpqVarT, errorCorrectionLevel)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                bpqVarT = t(errorCorrectionLevel, modeL, zo2Var, zo2Var2);
            }
        } else {
            bpqVarT = t(errorCorrectionLevel, modeL, zo2Var, zo2Var2);
        }
        zo2 zo2Var3 = new zo2();
        zo2Var3.b(zo2Var);
        f(modeL == mode ? zo2Var2.l() : str.length(), bpqVarT, modeL, zo2Var3);
        zo2Var3.b(zo2Var2);
        bpq.b bVarF = bpqVarT.f(errorCorrectionLevel);
        int iH = bpqVarT.h() - bVarF.d();
        u(iH, zo2Var3);
        zo2 zo2VarR = r(zo2Var3, bpqVarT.h(), iH, bVarF.c());
        hfi hfiVar = new hfi();
        hfiVar.c(errorCorrectionLevel);
        hfiVar.f(modeL);
        hfiVar.g(bpqVarT);
        int iE = bpqVarT.e();
        k73 k73Var = new k73(iE, iE);
        int iK = k(zo2VarR, errorCorrectionLevel, bpqVarT, k73Var);
        hfiVar.d(iK);
        w8f.a(zo2VarR, errorCorrectionLevel, bpqVarT, iK, k73Var);
        hfiVar.e(k73Var);
        return hfiVar;
    }

    public static byte[] o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new vak(cya.l).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static int p(int i) {
        int[] iArr = f34472a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static void q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    public static zo2 r(zo2 zo2Var, int i, int i2, int i3) throws WriterException {
        if (zo2Var.l() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i, i2, i3, i5, iArr, iArr2);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            zo2Var.t(i4 << 3, bArr, 0, i6);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new uv2(bArr, bArrO));
            iMax = Math.max(iMax, i6);
            iMax2 = Math.max(iMax2, bArrO.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new WriterException("Data bytes does not match offset");
        }
        zo2 zo2Var2 = new zo2();
        for (int i7 = 0; i7 < iMax; i7++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((uv2) it.next()).a();
                if (i7 < bArrA.length) {
                    zo2Var2.c(bArrA[i7], 8);
                }
            }
        }
        for (int i8 = 0; i8 < iMax2; i8++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((uv2) it2.next()).b();
                if (i8 < bArrB.length) {
                    zo2Var2.c(bArrB[i8], 8);
                }
            }
        }
        if (i == zo2Var2.l()) {
            return zo2Var2;
        }
        throw new WriterException("Interleaving error: " + i + " and " + zo2Var2.l() + " differ.");
    }

    public static boolean s(String str) {
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

    public static bpq t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, zo2 zo2Var, zo2 zo2Var2) throws WriterException {
        return m(i(mode, zo2Var, zo2Var2, m(i(mode, zo2Var, zo2Var2, bpq.i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    public static void u(int i, zo2 zo2Var) throws WriterException {
        int i2 = i << 3;
        if (zo2Var.k() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + zo2Var.k() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && zo2Var.k() < i2; i3++) {
            zo2Var.a(false);
        }
        int iK = zo2Var.k() & 7;
        if (iK > 0) {
            while (iK < 8) {
                zo2Var.a(false);
                iK++;
            }
        }
        int iL = i - zo2Var.l();
        for (int i4 = 0; i4 < iL; i4++) {
            zo2Var.c((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (zo2Var.k() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static boolean v(int i, bpq bpqVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return bpqVar.h() - bpqVar.f(errorCorrectionLevel).d() >= (i + 7) / 8;
    }
}
