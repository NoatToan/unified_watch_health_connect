package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zzhj implements ServiceConnection {
    final /* synthetic */ zzhk zza;
    private final String zzb;

    public zzhj(zzhk zzhkVar, String str) {
        Objects.requireNonNull(zzhkVar);
        this.zza = zzhkVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            a.q(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbq zzbqVarZzb = com.google.android.gms.internal.measurement.zzbp.zzb(iBinder);
            zzhk zzhkVar = this.zza;
            if (zzbqVarZzb == null) {
                zzhkVar.zza.zzaV().zze().zza("Install Referrer Service implementation was not found");
                return;
            }
            zzic zzicVar = zzhkVar.zza;
            zzicVar.zzaV().zzk().zza("Install Referrer Service connected");
            zzicVar.zzaW().zzj(new zzhi(this, zzbqVarZzb, this));
        } catch (RuntimeException e4) {
            this.zza.zza.zzaV().zze().zzb("Exception occurred while calling Install Referrer API", e4);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaV().zzk().zza("Install Referrer Service disconnected");
    }

    public final /* synthetic */ String zza() {
        return this.zzb;
    }
}
