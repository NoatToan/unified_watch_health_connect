package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class kx<P> implements la<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f19445a;

    protected abstract String a(P p);

    @Override // com.huawei.openalliance.ad.la
    public String a(P p, kw kwVar) {
        if (kwVar != null) {
            kwVar.a(p);
        }
        return a(p);
    }

    public kx(Context context) {
        this.f19445a = context;
    }
}
