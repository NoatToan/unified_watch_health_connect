package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes34.dex */
public class j0 extends f0 {
    public static final String h = "HttpDnsResolver";

    @Override // com.huawei.hms.network.embedded.f0
    public m0 c() {
        m0 m0Var = new m0();
        n0 n0VarE = t.m().e();
        if (n0VarE != null) {
            m0Var = n0VarE.a(this.f14743a);
        }
        if (y.b(m0Var)) {
            Logger.w(h, "Resolve from HttpDns is null, host: %s", this.f14743a);
        }
        return m0Var;
    }

    public j0(String str, String str2, f0.a aVar) {
        super(str, 3, str2, aVar);
    }
}
