package com.google.android.gms.gcm;

import com.google.android.exoplayer2.v;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
final class zze implements ThreadFactory {
    private final AtomicInteger zzy = new AtomicInteger(1);

    public zze(GcmTaskService gcmTaskService) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, v.b(20, this.zzy.getAndIncrement(), "gcm-task#"));
        thread.setPriority(4);
        return thread;
    }
}
