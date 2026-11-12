package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class x3 implements Callable<String> {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ zzks b;

    public x3(zzks zzksVar, zzp zzpVar) {
        this.b = zzksVar;
        this.a = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        if (this.b.M((String) Preconditions.checkNotNull(this.a.zza)).zzk() && zzag.zzb(this.a.zzv).zzk()) {
            return this.b.L(this.a).f0();
        }
        this.b.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
