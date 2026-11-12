package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import r9.a;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zze extends Service {
    private Binder zzbc;
    private int zzbd;
    final ExecutorService zzbb = com.google.android.gms.internal.gcm.zzg.zzaa().zzd(new NamedThreadFactory("EnhancedIntentService"), 9);
    private final Object lock = new Object();
    private int zzbe = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Intent intent) {
        if (intent != null) {
            a.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i14 = this.zzbe - 1;
                this.zzbe = i14;
                if (i14 == 0) {
                    stopSelfResult(this.zzbd);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.zzbc == null) {
                this.zzbc = new zzi(this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.zzbc;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        synchronized (this.lock) {
            this.zzbd = i15;
            this.zzbe++;
        }
        if (intent == null) {
            zzf(intent);
            return 2;
        }
        this.zzbb.execute(new zzf(this, intent, intent));
        return 3;
    }
}
