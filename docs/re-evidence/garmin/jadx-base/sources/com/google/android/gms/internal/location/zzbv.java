package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes14.dex */
final class zzbv extends zzbt {
    private final zzbx zza;

    public zzbv(zzbx zzbxVar, int i14) {
        super(zzbxVar.size(), i14);
        this.zza = zzbxVar;
    }

    @Override // com.google.android.gms.internal.location.zzbt
    public final Object zza(int i14) {
        return this.zza.get(i14);
    }
}
