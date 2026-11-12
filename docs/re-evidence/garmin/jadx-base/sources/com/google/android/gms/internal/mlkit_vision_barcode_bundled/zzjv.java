package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
public final class zzjv extends zzed implements zzfn {
    private static final zzjv zzd;
    private byte zze = 2;

    static {
        zzjv zzjvVar = new zzjv();
        zzd = zzjvVar;
        zzeh.zzV(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    public static zzjv zzf() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return Byte.valueOf(this.zze);
        }
        zzjt zzjtVar = null;
        if (i15 == 2) {
            return zzeh.zzS(zzd, "\u0003\u0000", null);
        }
        if (i15 == 3) {
            return new zzjv();
        }
        if (i15 == 4) {
            return new zzju(zzjtVar);
        }
        if (i15 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
