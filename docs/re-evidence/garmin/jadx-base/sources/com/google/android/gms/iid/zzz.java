package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzz<T> {
    final int what;
    final int zzcp;
    final TaskCompletionSource<T> zzcq = new TaskCompletionSource<>();
    final Bundle zzcr;

    public zzz(int i14, int i15, Bundle bundle) {
        this.zzcp = i14;
        this.what = i15;
        this.zzcr = bundle;
    }

    public String toString() {
        int i14 = this.what;
        int i15 = this.zzcp;
        zzw();
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("Request { what=");
        sb3.append(i14);
        sb3.append(" id=");
        sb3.append(i15);
        sb3.append(" oneWay=false}");
        return sb3.toString();
    }

    public final void zzd(zzaa zzaaVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzaaVar);
            new StringBuilder(strValueOf2.length() + strValueOf.length() + 14);
        }
        this.zzcq.setException(zzaaVar);
    }

    public abstract void zzh(Bundle bundle);

    public abstract boolean zzw();
}
