package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes14.dex */
public final class zzc extends zzeh implements zzfn {
    private static final zzc zzb;
    private int zzd;
    private zzem zze = zzeh.zzM();
    private zzem zzf = zzeh.zzM();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzc zzcVar = new zzc();
        zzb = zzcVar;
        zzeh.zzV(zzc.class, zzcVar);
    }

    private zzc() {
    }

    public static zzb zza() {
        return (zzb) zzb.zzG();
    }

    public static /* synthetic */ void zzc(zzc zzcVar, int i14) {
        zzcVar.zzd |= 2;
        zzcVar.zzh = i14;
    }

    public static /* synthetic */ void zzd(zzc zzcVar, float f14) {
        zzem zzemVar = zzcVar.zze;
        if (!zzemVar.zzc()) {
            zzcVar.zze = zzeh.zzN(zzemVar);
        }
        zzcVar.zze.zzh(f14);
    }

    public static /* synthetic */ void zze(zzc zzcVar, float f14) {
        zzem zzemVar = zzcVar.zzf;
        if (!zzemVar.zzc()) {
            zzcVar.zzf = zzeh.zzN(zzemVar);
        }
        zzcVar.zzf.zzh(f14);
    }

    public static /* synthetic */ void zzf(zzc zzcVar, int i14) {
        zzcVar.zzd |= 1;
        zzcVar.zzg = i14;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i14, Object obj, Object obj2) {
        int i15 = i14 - 1;
        if (i15 == 0) {
            return (byte) 1;
        }
        if (i15 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i15 == 3) {
            return new zzc();
        }
        zza zzaVar = null;
        if (i15 == 4) {
            return new zzb(zzaVar);
        }
        if (i15 != 5) {
            return null;
        }
        return zzb;
    }
}
