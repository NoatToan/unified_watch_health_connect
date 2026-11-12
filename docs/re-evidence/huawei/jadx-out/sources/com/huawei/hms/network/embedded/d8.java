package com.huawei.hms.network.embedded;

/* JADX INFO: loaded from: classes34.dex */
public abstract class d8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14706a;

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f14706a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    public d8(String str, Object... objArr) {
        this.f14706a = f8.a(str, objArr);
    }
}
