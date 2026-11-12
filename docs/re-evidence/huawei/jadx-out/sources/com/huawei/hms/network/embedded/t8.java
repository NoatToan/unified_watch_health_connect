package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class t8 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f15403a;

    @Override // com.huawei.hms.network.embedded.n7
    public v7 intercept(n7.a aVar) throws IOException {
        k9 k9Var = (k9) aVar;
        t7 t7VarRequest = k9Var.request();
        d9 d9VarF = k9Var.f();
        return k9Var.a(t7VarRequest, d9VarF, d9VarF.newExchange(aVar, !t7VarRequest.h().equals("GET")));
    }

    public t8(q7 q7Var) {
        this.f15403a = q7Var;
    }
}
