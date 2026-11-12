package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
public final class zzm extends zzeh implements zzfn {
    private static final zzm zzb;
    private int zzd;
    private zzeo zze = zzeh.zzP();
    private String zzf = "";

    static {
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzeh.zzV(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i15 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i15 == 4) {
            return new zzl(zzkVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
