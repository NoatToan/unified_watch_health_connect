package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: loaded from: classes14.dex */
final class zza implements Runnable {
    private final Runnable zza;

    public zza(Runnable runnable, int i14) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.zza.run();
    }
}
