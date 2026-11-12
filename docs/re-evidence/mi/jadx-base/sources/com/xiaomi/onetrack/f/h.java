package com.xiaomi.onetrack.f;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f13891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f13892b;

    public h(g gVar, Context context) {
        this.f13892b = gVar;
        this.f13891a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        g.c(this.f13891a);
        com.xiaomi.onetrack.c.c.a(this.f13891a);
    }
}
