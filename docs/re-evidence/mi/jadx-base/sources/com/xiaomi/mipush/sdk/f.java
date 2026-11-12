package com.xiaomi.mipush.sdk;

import com.xiaomi.push.Cif;

/* JADX INFO: loaded from: classes11.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cif f13649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.a.C0829a f13650b;

    public f(c.a.C0829a c0829a, Cif cif) {
        this.f13650b = c0829a;
        this.f13649a = cif;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13650b.f13644b.add(this.f13649a);
        this.f13650b.c();
    }
}
