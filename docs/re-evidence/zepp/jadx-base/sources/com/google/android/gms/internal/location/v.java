package com.google.android.gms.internal.location;

import android.os.DeadObjectException;

/* JADX INFO: loaded from: classes3.dex */
final class v implements zzbg<zzam> {
    public final /* synthetic */ zzi a;

    public v(zzi zziVar) {
        this.a = zziVar;
    }

    public final zzam a() throws DeadObjectException {
        return (zzam) this.a.getService();
    }
}
