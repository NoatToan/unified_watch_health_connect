package com.alipay.security.mobile.module.d;

/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5932a;

    public c(b bVar) {
        this.f5932a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5932a.d();
        } catch (Exception e) {
            d.c(e);
        }
    }
}
