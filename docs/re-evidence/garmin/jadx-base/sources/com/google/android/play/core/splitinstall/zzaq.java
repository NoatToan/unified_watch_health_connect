package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzaq extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzbc zzbcVar, TaskCompletionSource taskCompletionSource, int i14, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzbcVar;
        this.zza = i14;
        this.zzb = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            ?? Zze = this.zzc.zza.zze();
            zzbc zzbcVar = this.zzc;
            Zze.zzh(zzbcVar.zzd, this.zza, new zzay(zzbcVar, this.zzb));
        } catch (RemoteException e4) {
            zzbc.zzb.zzc(e4, "getSessionState(%d)", Integer.valueOf(this.zza));
            this.zzb.trySetException(new RuntimeException(e4));
        }
    }
}
