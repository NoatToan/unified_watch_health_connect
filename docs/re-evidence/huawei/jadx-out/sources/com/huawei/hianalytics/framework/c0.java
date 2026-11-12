package com.huawei.hianalytics.framework;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ThreadFactory {
    public static final AtomicInteger d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadGroup f11502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f11503b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11504c;

    public c0(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f11502a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f11504c = "HASDK-" + str + Constants.LINK + d.getAndIncrement();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(this.f11502a, runnable, this.f11504c + this.f11503b.getAndIncrement(), 0L);
    }
}
