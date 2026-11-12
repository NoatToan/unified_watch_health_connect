package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import com.garmin.proto.generated.a;

/* JADX INFO: loaded from: classes14.dex */
public final class zzi extends Binder {
    private final zze zzbm;

    public zzi(zze zzeVar) {
        this.zzbm = zzeVar;
    }

    public final void zzd(zzg zzgVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            this.zzbm.zzbb.execute(new zzj(this, zzgVar));
        } else {
            a.h("Binding only allowed within app");
        }
    }
}
