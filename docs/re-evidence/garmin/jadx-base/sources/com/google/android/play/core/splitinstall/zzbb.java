package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzbp;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
class zzbb extends zzbp {
    final TaskCompletionSource zza;
    final /* synthetic */ zzbc zzb;

    public zzbb(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzbcVar;
        this.zza = taskCompletionSource;
    }

    public void zzb(int i14, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onCancelInstall(%d)", Integer.valueOf(i14));
    }

    public void zzc(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredInstall", new Object[0]);
    }

    public void zzd(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredLanguageInstall", new Object[0]);
    }

    public void zze(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredLanguageUninstall", new Object[0]);
    }

    public void zzf(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredUninstall", new Object[0]);
    }

    public void zzg(int i14, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onGetSession(%d)", Integer.valueOf(i14));
    }

    public void zzh(List list) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onGetSessionStates", new Object[0]);
    }

    public void zzi(int i14, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onStartInstall(%d)", Integer.valueOf(i14));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzj(int i14, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onCompleteInstall(%d)", Integer.valueOf(i14));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzk(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzl(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        int i14 = bundle.getInt("error_code");
        zzbc.zzb.zzb("onError(%d)", Integer.valueOf(i14));
        this.zza.trySetException(new SplitInstallException(i14));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzm(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onGetSplitsForAppUpdate", new Object[0]);
    }
}
