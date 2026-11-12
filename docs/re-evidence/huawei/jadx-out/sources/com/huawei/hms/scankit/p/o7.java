package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* JADX INFO: loaded from: classes34.dex */
final class o7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16246c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16247a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f16248b = new StringBuilder();

    o7() {
    }

    private int a(r rVar, int[] iArr, StringBuilder sb) throws a {
        int[] iArr2 = this.f16247a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iD = rVar.d();
        int iD2 = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 5 && iD2 < iD; i2++) {
            int iA = q7.a(rVar, iArr2, iD2, q7.g);
            sb.append((char) ((iA % 10) + 48));
            for (int i3 : iArr2) {
                iD2 += i3;
            }
            if (iA >= 10) {
                i |= 1 << (4 - i2);
            }
            if (i2 != 4) {
                iD2 = rVar.d(rVar.c(iD2));
            }
        }
        if (sb.length() == 5) {
            if (a(sb.toString()) == a(i)) {
                return iD2;
            }
            throw a.a();
        }
        throw a.a();
    }

    s6 a(int i, r rVar, int[] iArr) throws a {
        StringBuilder sb = this.f16248b;
        sb.setLength(0);
        float f = i;
        return new s6(sb.toString(), null, new u6[]{new u6((iArr[0] + iArr[1]) / 2.0f, f), new u6(a(rVar, iArr, sb), f)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }

    private static int a(int i) throws a {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f16246c[i2]) {
                return i2;
            }
        }
        throw a.a();
    }

    private static int a(CharSequence charSequence) {
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
}
