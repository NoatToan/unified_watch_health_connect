package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* JADX INFO: loaded from: classes10.dex */
public final class o2 extends q7 {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private String i = "";
    private final int[] h = new int[4];

    private static boolean a(StringBuilder sb) {
        int iCharAt;
        char cCharAt = sb.charAt(sb.length() - 1);
        int i = 0;
        for (int i2 = 0; i2 < sb.length() - 1; i2++) {
            if (i2 % 2 == 0) {
                iCharAt = sb.charAt(i2) - '0';
            } else {
                iCharAt = (sb.charAt(i2) - '0') * 3;
            }
            i += iCharAt;
        }
        return (i + (cCharAt + 65488)) % 10 == 0;
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] iArr, int[] iArr2) {
        int i = iArr2[1];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr[0];
        int iRound = (int) Math.round(((double) (i - i4)) / (((double) ((i - i2) + (i3 - i4))) / 6.0d));
        if (this.i.equals("0")) {
            return ((double) Math.abs(iRound + (-95))) <= 18.05d || ((double) Math.abs(iRound + (-113))) <= 21.47d;
        }
        return ((double) Math.abs(iRound + (-95))) <= 18.05d;
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int i, int i2, r rVar) {
        return rVar.a(i2, (i2 - i) + i2, false, false);
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(r rVar, int[] iArr, StringBuilder sb) throws a {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iD = rVar.d();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < iD; i3++) {
            int iA = q7.a(rVar, iArr2, i, q7.g);
            sb.append((char) ((iA % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (iA >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        a(sb, i2);
        this.i = sb.substring(0, 1);
        int i5 = q7.a(rVar, i, true, q7.d)[1];
        for (int i6 = 0; i6 < 6 && i5 < iD; i6++) {
            sb.append((char) (q7.a(rVar, iArr2, i5, q7.f) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        if (a(sb)) {
            return i5;
        }
        throw a.a();
    }

    private static void a(StringBuilder sb, int i) throws a {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.q7
    BarcodeFormat a() {
        return BarcodeFormat.EAN_13;
    }
}
