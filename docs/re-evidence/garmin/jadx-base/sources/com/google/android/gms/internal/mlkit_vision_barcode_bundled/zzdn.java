package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzdn extends zzcx {
    private static final Logger zzb = Logger.getLogger(zzdn.class.getName());
    private static final boolean zzc = zzgz.zzx();
    zzdo zza;

    public /* synthetic */ zzdn(zzdm zzdmVar) {
    }

    public static int zzA(int i14) {
        return (352 - (Integer.numberOfLeadingZeros(i14) * 9)) >>> 6;
    }

    public static int zzB(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i14, zzfm zzfmVar, zzge zzgeVar) {
        int iZzA = zzA(i14 << 3);
        return ((zzcq) zzfmVar).zzB(zzgeVar) + iZzA + iZzA;
    }

    public static int zzx(zzfm zzfmVar) {
        int iZzF = zzfmVar.zzF();
        return zzA(iZzF) + iZzF;
    }

    public static int zzy(zzfm zzfmVar, zzge zzgeVar) {
        int iZzB = ((zzcq) zzfmVar).zzB(zzgeVar);
        return zzA(iZzB) + iZzB;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzhe.zze(str);
        } catch (zzhd unused) {
            length = str.getBytes(zzep.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() == 0) {
            return;
        }
        h.z("Did not write as much data as expected.");
    }

    public final void zzD(String str, zzhd zzhdVar) throws zzdl {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhdVar);
        byte[] bytes = str.getBytes(zzep.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzdl(e4);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b14);

    public abstract void zzd(int i14, boolean z14);

    public abstract void zze(int i14, zzdf zzdfVar);

    public abstract void zzf(int i14, int i15);

    public abstract void zzg(int i14);

    public abstract void zzh(int i14, long j8);

    public abstract void zzi(long j8);

    public abstract void zzj(int i14, int i15);

    public abstract void zzk(int i14);

    public abstract void zzl(byte[] bArr, int i14, int i15);

    public abstract void zzm(int i14, zzfm zzfmVar, zzge zzgeVar);

    public abstract void zzn(int i14, zzfm zzfmVar);

    public abstract void zzo(int i14, zzdf zzdfVar);

    public abstract void zzp(int i14, String str);

    public abstract void zzr(int i14, int i15);

    public abstract void zzs(int i14, int i15);

    public abstract void zzt(int i14);

    public abstract void zzu(int i14, long j8);

    public abstract void zzv(long j8);

    private zzdn() {
        throw null;
    }
}
