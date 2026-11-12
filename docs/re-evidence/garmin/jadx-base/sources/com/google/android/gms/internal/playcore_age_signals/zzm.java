package com.google.android.gms.internal.playcore_age_signals;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzm implements ServiceConnection {
    final /* synthetic */ zzo zza;

    public /* synthetic */ zzm(zzo zzoVar, zzn zznVar) {
        Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzo zzoVar = this.zza;
        zzoVar.zzc.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzoVar.zzc().post(new zzk(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzo zzoVar = this.zza;
        zzoVar.zzc.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzoVar.zzc().post(new zzl(this));
    }
}
