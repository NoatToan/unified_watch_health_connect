package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class h implements o6 {
    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map map) throws a {
        u6[] u6VarArrD;
        v6 v6Var;
        d2 d2Var = new d2(pVar.b());
        x1 x1VarA = null;
        try {
            g gVarA = d2Var.a(false);
            u6VarArrD = gVarA.d();
            try {
                x1 x1VarA2 = new t1().a(gVarA, map);
                e = null;
                x1VarA = x1VarA2;
            } catch (a e) {
                e = e;
            }
        } catch (a e2) {
            e = e2;
            u6VarArrD = null;
        }
        if (x1VarA == null) {
            try {
                g gVarA2 = d2Var.a(true);
                u6VarArrD = gVarA2.d();
                x1VarA = new t1().a(gVarA2, map);
            } catch (a e3) {
                if (u6VarArrD != null && !r3.f16302c) {
                    return new s6(null, null, 0, (u6[]) u6VarArrD.clone(), BarcodeFormat.AZTEC, System.currentTimeMillis());
                }
                if (e != null) {
                    throw e;
                }
                throw e3;
            }
        }
        u6[] u6VarArr = u6VarArrD;
        if (map != null && (v6Var = (v6) map.get(m1.j)) != null && u6VarArr != null) {
            for (u6 u6Var : u6VarArr) {
                v6Var.a(u6Var);
            }
        }
        return new s6(x1VarA.d(), x1VarA.c(), x1VarA.a(), u6VarArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
    }
}
