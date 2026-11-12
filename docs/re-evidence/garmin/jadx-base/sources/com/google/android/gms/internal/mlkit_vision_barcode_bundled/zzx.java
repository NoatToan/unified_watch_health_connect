package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
public final class zzx extends zzeh implements zzfn {
    private static final zzx zzb;
    private int zzd;
    private zzaa zze;

    static {
        zzx zzxVar = new zzx();
        zzb = zzxVar;
        zzeh.zzV(zzx.class, zzxVar);
    }

    private zzx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i15 == 3) {
            return new zzx();
        }
        zzv zzvVar = null;
        if (i15 == 4) {
            return new zzw(zzvVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
