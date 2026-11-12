package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class h1 implements o6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u6[] f16106b = new u6[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f16107a = new u1();

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map map) throws a {
        k2 k2VarA = new e2(pVar.b()).a();
        try {
            x1 x1VarA = this.f16107a.a(k2VarA.a(), map);
            return new s6(x1VarA.d(), x1VarA.c(), k2VarA.d(), BarcodeFormat.DATA_MATRIX);
        } catch (a e) {
            if (k2VarA.d() == null || r3.f16302c) {
                throw e;
            }
            double dSqrt = Math.sqrt(Math.pow(k2VarA.d()[0].b() - k2VarA.d()[1].b(), 2.0d) + Math.pow(k2VarA.d()[0].c() - k2VarA.d()[1].c(), 2.0d));
            double dSqrt2 = Math.sqrt(Math.pow(k2VarA.d()[0].b() - k2VarA.d()[3].b(), 2.0d) + Math.pow(k2VarA.d()[0].c() - k2VarA.d()[3].c(), 2.0d));
            if (this.f16107a.a() == null || Math.abs(dSqrt - dSqrt2) / dSqrt >= 0.1d) {
                throw e;
            }
            return new s6(null, null, k2VarA.d(), BarcodeFormat.DATA_MATRIX);
        }
    }
}
