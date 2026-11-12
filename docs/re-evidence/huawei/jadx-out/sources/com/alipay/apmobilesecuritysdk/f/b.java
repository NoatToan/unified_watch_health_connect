package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f2041a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f2042b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<Runnable> f2043c = new LinkedList<>();

    public void a(Runnable runnable) {
        synchronized (this) {
            this.f2043c.add(runnable);
            if (this.f2042b == null) {
                Thread thread = new Thread(new c(this));
                this.f2042b = thread;
                thread.start();
            }
        }
    }

    public static b a() {
        return f2041a;
    }
}
