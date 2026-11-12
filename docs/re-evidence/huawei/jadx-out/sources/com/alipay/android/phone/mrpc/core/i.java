package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab f1992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1993b;

    public Context e() {
        return this.f1993b.f1991a.getApplicationContext();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public boolean d() {
        return this.f1992a.c();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ab c() {
        return this.f1992a;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ad b() {
        return l.a(e());
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public String a() {
        return this.f1992a.a();
    }

    public i(h hVar, ab abVar) {
        this.f1993b = hVar;
        this.f1992a = abVar;
    }
}
