package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes14.dex */
final class zzae extends zzz {
    private final zzah zza;

    public zzae(zzah zzahVar, int i14) {
        super(zzahVar.size(), i14);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i14) {
        return this.zza.get(i14);
    }
}
