package com.google.android.gms.internal.gcm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes14.dex */
public interface zzf {
    ExecutorService zzd(int i14, ThreadFactory threadFactory, int i15);

    ExecutorService zzd(ThreadFactory threadFactory, int i14);

    ScheduledExecutorService zze(int i14, ThreadFactory threadFactory, int i15);
}
