package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes11.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a.C0829a f13651a;

    public g(c.a.C0829a c0829a) {
        this.f13651a = c0829a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13651a.f13644b.size() != 0) {
            this.f13651a.f();
        } else if (this.f13651a.c != null) {
            this.f13651a.c.cancel(false);
            this.f13651a.c = null;
        }
    }
}
