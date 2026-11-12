package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class e0 extends f0 {
    public static final String h = "DNKeeperResolver";

    @Override // com.huawei.hms.network.embedded.f0
    public m0 c() {
        String strB;
        int iA;
        Logger.v(h, "Resolve to DNKeeper, host: %s", this.f14743a);
        m0 m0Var = new m0();
        l0 l0VarC = t.m().c();
        if (l0VarC != null) {
            t.i iVarB = t.m().b(this.f14743a);
            if (iVarB != null) {
                strB = iVarB.b();
                iA = iVarB.a();
            } else {
                strB = null;
                iA = 0;
            }
            m0Var = l0VarC.a(this.f14743a, strB, iA);
            m0Var.b(1);
            t.m().a(this.f14743a);
        }
        if (y.b(m0Var)) {
            Logger.w(h, "Resolve from DNKeeper is null, host: %s", this.f14743a);
            return m0Var;
        }
        List<String> listD = m0Var.d();
        if (!listD.isEmpty()) {
            m0Var.b(listD);
        }
        Logger.v(h, this.f14743a + " Resolve to DNKeeper, result: " + m0Var);
        return m0Var;
    }

    public e0(String str, f0.a aVar) {
        super(str, 1, "dns_sync_query", aVar);
    }
}
