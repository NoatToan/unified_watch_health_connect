package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f28381a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f28382b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<Runnable> f28383c = new LinkedList<>();

    public static /* synthetic */ Thread b(b bVar) {
        bVar.f28382b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.f28383c.add(runnable);
        if (this.f28382b == null) {
            Thread thread = new Thread(new c(this));
            this.f28382b = thread;
            thread.start();
        }
    }

    public static b a() {
        return f28381a;
    }
}
