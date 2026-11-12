package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import b71.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzob {
    final /* synthetic */ zzoc zza;

    public zzob(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zza = zzocVar;
    }

    public final void zza() {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzp(zzicVar.zzaZ().currentTimeMillis())) {
            zzicVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzicVar.zzaV().zzk().zza("Detected application was in foreground");
                zzc(zzicVar.zzaZ().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j8, boolean z14) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzocVar.zzj();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzp(j8)) {
            zzicVar.zzd().zzg.zzb(true);
            zzocVar.zzu.zzv().zzi();
        }
        zzicVar.zzd().zzk.zzb(j8);
        if (zzicVar.zzd().zzg.zza()) {
            zzc(j8, z14);
        }
    }

    public final void zzc(long j8, boolean z14) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(j8);
            zzicVar.zzaV().zzk().zzb("Session started, time", Long.valueOf(zzicVar.zzaZ().elapsedRealtime()));
            long j14 = j8 / 1000;
            zzic zzicVar2 = zzocVar.zzu;
            zzicVar2.zzj().zzN(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", Long.valueOf(j14), j8);
            zzicVar.zzd().zzl.zzb(j14);
            zzicVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j14);
            zzicVar2.zzj().zzG(TtmlNode.TEXT_EMPHASIS_AUTO, "_s", j8, bundle);
            String strZza = zzicVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            zzicVar2.zzj().zzG(TtmlNode.TEXT_EMPHASIS_AUTO, "_ssr", j8, i.d("_ffr", strZza));
        }
    }
}
