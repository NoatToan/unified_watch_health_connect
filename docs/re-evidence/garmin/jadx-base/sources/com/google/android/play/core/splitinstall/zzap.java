package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class zzap extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ List zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzbc zzbcVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzbcVar;
        this.zza = list;
        this.zzb = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            this.zzc.zza.zze().zzf(this.zzc.zzd, zzbc.zzm(this.zza), zzbc.zzo(), new zzaw(this.zzc, this.zzb));
        } catch (RemoteException e4) {
            zzbc.zzb.zzc(e4, "deferredLanguageUninstall(%s)", this.zza);
            this.zzb.trySetException(new RuntimeException(e4));
        }
    }
}
