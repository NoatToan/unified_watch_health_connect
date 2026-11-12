package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class m7 implements l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2 f16218a = new p2();

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f16218a.a("0" + str, BarcodeFormat.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + barcodeFormat);
    }
}
