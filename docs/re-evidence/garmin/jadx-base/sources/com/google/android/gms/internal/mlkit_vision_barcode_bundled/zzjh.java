package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
public final class zzjh extends zzeh implements zzfn {
    private static final zzjh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzjh zzjhVar = new zzjh();
        zzb = zzjhVar;
        zzeh.zzV(zzjh.class, zzjhVar);
    }

    private zzjh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i15 == 3) {
            return new zzjh();
        }
        zzhi zzhiVar = null;
        if (i15 == 4) {
            return new zzjg(zzhiVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
