package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class x7q {
    public static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f38795a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f38796b = new StringBuilder();

    public static int c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = length - 2; i >= 0; i -= 2) {
            iCharAt += charSequence.charAt(i) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            iCharAt2 += charSequence.charAt(i2) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    public static String e(String str) {
        String str2;
        byte b2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt != '5') {
            str2 = "";
            if (cCharAt == '9') {
                switch (str.hashCode()) {
                    case 54118329:
                        if (!str.equals("90000")) {
                            b2 = -1;
                        }
                        break;
                    case 54395376:
                        b2 = !str.equals("99990") ? (byte) -1 : (byte) 1;
                        break;
                    case 54395377:
                        b2 = !str.equals("99991") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int i = Integer.parseInt(str.substring(1));
        String strValueOf = String.valueOf(i / 100);
        int i2 = i % 100;
        return str2 + strValueOf + '.' + (i2 < 10 ? "0".concat(String.valueOf(i2)) : String.valueOf(i2));
    }

    public static Map<ResultMetadataType, Object> f(String str) {
        String strE;
        if (str.length() != 5 || (strE = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, strE);
        return enumMap;
    }

    public final int a(zo2 zo2Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f38795a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iK = zo2Var.k();
        int iJ = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 5 && iJ < iK; i2++) {
            int i3 = z7q.i(zo2Var, iArr2, iJ, z7q.h);
            sb.append((char) ((i3 % 10) + 48));
            for (int i4 : iArr2) {
                iJ += i4;
            }
            if (i3 >= 10) {
                i |= 1 << (4 - i2);
            }
            if (i2 != 4) {
                iJ = zo2Var.j(zo2Var.i(iJ));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (d(sb.toString()) == c(i)) {
            return iJ;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public wsk b(int i, zo2 zo2Var, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f38796b;
        sb.setLength(0);
        int iA = a(zo2Var, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapF = f(string);
        float f = i;
        wsk wskVar = new wsk(string, null, new atk[]{new atk((iArr[0] + iArr[1]) / 2.0f, f), new atk(iA, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapF != null) {
            wskVar.g(mapF);
        }
        return wskVar;
    }
}
