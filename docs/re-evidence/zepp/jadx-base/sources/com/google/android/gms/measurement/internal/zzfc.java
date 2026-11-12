package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfc implements ServiceConnection {
    private final String a;
    public final /* synthetic */ zzfd b;

    public zzfc(zzfd zzfdVar, String str) {
        this.b = zzfdVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.zzay().zzk().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.b.a.zzay().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.b.a.zzay().zzj().zza("Install Referrer Service connected");
                this.b.a.zzaz().zzp(new x(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e) {
            this.b.a.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.zzay().zzj().zza("Install Referrer Service disconnected");
    }
}
