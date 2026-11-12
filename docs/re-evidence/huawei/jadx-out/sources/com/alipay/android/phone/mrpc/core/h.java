package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class h extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1991a;

    @Override // com.alipay.android.phone.mrpc.core.x
    public <T> T a(Class<T> cls, ab abVar) {
        return (T) new y(a(abVar)).a(cls);
    }

    private g a(ab abVar) {
        return new i(this, abVar);
    }

    public h(Context context) {
        this.f1991a = context;
    }
}
