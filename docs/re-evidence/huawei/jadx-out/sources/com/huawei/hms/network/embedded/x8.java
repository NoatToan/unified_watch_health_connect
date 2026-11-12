package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class x8 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f15604a;

    @Override // com.huawei.hms.network.embedded.n7
    public v7 intercept(n7.a aVar) throws IOException {
        k9 k9Var = (k9) aVar;
        t7 t7VarRequest = k9Var.request();
        k9Var.f().prepareToConnect(t7VarRequest);
        k9Var.f().getExchangeFinder().a(this.f15604a, t7VarRequest);
        return new v7.a().a(r7.HTTP_2).a("").a(new l9("", 1L, null)).a(200).a(t7VarRequest).a();
    }

    public x8(q7 q7Var) {
        this.f15604a = q7Var;
    }
}
