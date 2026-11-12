package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* JADX INFO: loaded from: classes34.dex */
final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16231a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f16232b = new StringBuilder();

    n7() {
    }

    private int a(r rVar, int[] iArr, StringBuilder sb) throws a {
        int[] iArr2 = this.f16231a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iD = rVar.d();
        int iD2 = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 2 && iD2 < iD; i2++) {
            int iA = q7.a(rVar, iArr2, iD2, q7.g);
            sb.append((char) ((iA % 10) + 48));
            for (int i3 : iArr2) {
                iD2 += i3;
            }
            if (iA >= 10) {
                i |= 1 << (1 - i2);
            }
            if (i2 != 1) {
                iD2 = rVar.d(rVar.c(iD2));
            }
        }
        if (sb.length() == 2) {
            try {
                if (Integer.parseInt(sb.toString()) % 4 == i) {
                    return iD2;
                }
                throw a.a();
            } catch (NumberFormatException unused) {
                throw a.a();
            }
        }
        throw a.a();
    }

    s6 a(int i, r rVar, int[] iArr) throws a {
        StringBuilder sb = this.f16232b;
        sb.setLength(0);
        float f = i;
        return new s6(sb.toString(), null, new u6[]{new u6((iArr[0] + iArr[1]) / 2.0f, f), new u6(a(rVar, iArr, sb), f)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }
}
