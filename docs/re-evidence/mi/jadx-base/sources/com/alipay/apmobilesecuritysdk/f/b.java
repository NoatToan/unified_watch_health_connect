package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f5783a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f5784b = null;
    private LinkedList<Runnable> c = new LinkedList<>();

    public static b a() {
        return f5783a;
    }

    public static /* synthetic */ Thread b(b bVar) {
        bVar.f5784b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.c.add(runnable);
        if (this.f5784b == null) {
            Thread thread = new Thread(new c(this));
            this.f5784b = thread;
            thread.start();
        }
    }
}
