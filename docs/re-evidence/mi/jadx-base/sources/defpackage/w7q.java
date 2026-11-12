package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class w7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f37702a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f37703b = new StringBuilder();

    public static Map<ResultMetadataType, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    public final int a(zo2 zo2Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f37702a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iK = zo2Var.k();
        int iJ = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 2 && iJ < iK; i2++) {
            int i3 = z7q.i(zo2Var, iArr2, iJ, z7q.h);
            sb.append((char) ((i3 % 10) + 48));
            for (int i4 : iArr2) {
                iJ += i4;
            }
            if (i3 >= 10) {
                i |= 1 << (1 - i2);
            }
            if (i2 != 1) {
                iJ = zo2Var.j(zo2Var.i(iJ));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i) {
            return iJ;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public wsk b(int i, zo2 zo2Var, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f37703b;
        sb.setLength(0);
        int iA = a(zo2Var, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapC = c(string);
        float f = i;
        wsk wskVar = new wsk(string, null, new atk[]{new atk((iArr[0] + iArr[1]) / 2.0f, f), new atk(iA, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapC != null) {
            wskVar.g(mapC);
        }
        return wskVar;
    }
}
