package com.google.android.gms.internal.playcore_age_signals;

import android.os.IBinder;
import com.google.android.play.agesignals.protocol.IAgeSignalsService;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzk extends zze {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzm zzb;

    public zzk(zzm zzmVar, IBinder iBinder) {
        this.zza = iBinder;
        Objects.requireNonNull(zzmVar);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        IAgeSignalsService iAgeSignalsServiceAsInterface = IAgeSignalsService.Stub.asInterface(this.zza);
        zzo zzoVar = this.zzb.zza;
        zzoVar.zzn = iAgeSignalsServiceAsInterface;
        zzo.zzr(zzoVar);
        zzoVar.zzh = false;
        Iterator it = zzoVar.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzoVar.zze.clear();
    }
}
