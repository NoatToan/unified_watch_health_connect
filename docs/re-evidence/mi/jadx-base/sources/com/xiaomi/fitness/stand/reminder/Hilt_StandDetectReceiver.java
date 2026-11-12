package com.xiaomi.fitness.stand.reminder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.gbq;
import defpackage.j9o;
import defpackage.l53;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_StandDetectReceiver extends BroadcastReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();

    public void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            try {
                if (!this.injected) {
                    ((j9o) l53.a(context)).b((StandDetectReceiver) gbq.a(this));
                    this.injected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
    }
}
