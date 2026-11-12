package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ee implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger(1);
    private final AtomicInteger b;
    private final String c;
    private final boolean d;
    private final ThreadGroup e;

    public ee() {
        this("amap-threadpool-" + a.getAndIncrement(), (byte) 0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.e, runnable, this.c + this.b.getAndIncrement(), 0L);
        thread.setDaemon(this.d);
        return thread;
    }

    public ee(String str) {
        this(str, (byte) 0);
    }

    private ee(String str, byte b) {
        String str2;
        this.b = new AtomicInteger(1);
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str + "-thread-";
        }
        this.c = str2;
        this.d = false;
        SecurityManager securityManager = System.getSecurityManager();
        this.e = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
    }
}
