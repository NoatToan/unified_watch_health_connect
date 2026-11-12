package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class l7 extends q7 {
    private final q7 h = new o2();

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] iArr, int[] iArr2) {
        int i = iArr2[1];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr[0];
        return Math.abs(((int) Math.round(((double) (i - i4)) / (((double) ((i - i2) + (i3 - i4))) / 6.0d))) + (-113)) <= 5;
    }

    @Override // com.huawei.hms.scankit.p.q7
    public boolean a(int i, int i2, r rVar) {
        return rVar.a(i2, (i2 - i) + i2, false, false);
    }

    @Override // com.huawei.hms.scankit.p.g5, com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map map) {
        return a(this.h.a(pVar, map));
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(r rVar, int[] iArr, StringBuilder sb) {
        return this.h.a(rVar, iArr, sb);
    }

    @Override // com.huawei.hms.scankit.p.q7, com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) {
        return a(this.h.a(i, rVar, map));
    }

    @Override // com.huawei.hms.scankit.p.q7
    public s6 a(int i, r rVar, int[] iArr, Map map) {
        return a(this.h.a(i, rVar, iArr, map));
    }

    private static s6 a(s6 s6Var) throws a {
        String strK = s6Var.k();
        if (strK.charAt(0) == '0') {
            return new s6(strK.substring(1), null, s6Var.j(), BarcodeFormat.UPC_A);
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.q7
    BarcodeFormat a() {
        return BarcodeFormat.UPC_A;
    }
}
