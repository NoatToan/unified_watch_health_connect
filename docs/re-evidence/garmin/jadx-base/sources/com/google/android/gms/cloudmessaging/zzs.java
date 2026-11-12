package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import hb.a;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    public zzs(int i14, int i15, Bundle bundle) {
        this.zza = i14;
        this.zzc = i15;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Request { what=");
        sb3.append(this.zzc);
        sb3.append(" id=");
        sb3.append(this.zza);
        sb3.append(" oneWay=");
        return a.k(sb3, zzb(), StringSubstitutor.DEFAULT_VAR_END);
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.zzb.setException(zztVar);
    }

    public final void zzd(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.zzb.setResult(obj);
    }
}
