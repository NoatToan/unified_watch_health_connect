package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes14.dex */
public final class zzk implements ServiceConnection {
    private final Intent zzbp;
    private final ScheduledExecutorService zzbq;
    private final Queue<zzg> zzbr;
    private zzi zzbs;
    private boolean zzbt;
    private final Context zzl;

    private zzk(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzbr = new ArrayDeque();
        this.zzbt = false;
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext;
        this.zzbp = new Intent(str).setPackage(applicationContext.getPackageName());
        this.zzbq = scheduledExecutorService;
    }

    private final synchronized void zzm() {
        while (!this.zzbr.isEmpty()) {
            try {
                zzi zziVar = this.zzbs;
                if (zziVar == null || !zziVar.isBinderAlive()) {
                    if (!this.zzbt) {
                        this.zzbt = true;
                        try {
                            if (ConnectionTracker.getInstance().bindService(this.zzl, this.zzbp, this, 65)) {
                                return;
                            }
                        } catch (SecurityException unused) {
                        }
                        this.zzbt = false;
                        zzn();
                    }
                    return;
                }
                this.zzbs.zzd(this.zzbr.poll());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void zzn() {
        while (!this.zzbr.isEmpty()) {
            this.zzbr.poll().finish();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            try {
                this.zzbt = false;
                this.zzbs = (zzi) iBinder;
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    new StringBuilder(String.valueOf(componentName).length() + 20);
                }
                if (iBinder == null) {
                    zzn();
                } else {
                    zzm();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            new StringBuilder(String.valueOf(componentName).length() + 23);
        }
        zzm();
    }

    public final synchronized void zzd(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.zzbr.add(new zzg(intent, pendingResult, this.zzbq));
        zzm();
    }

    public zzk(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("EnhancedIntentService")));
    }
}
