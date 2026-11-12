package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzlm extends zzkz {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzlm.class.getName());
    private static final boolean zzd = zzop.zza();
    zzln zza;

    public /* synthetic */ zzlm(byte[] bArr) {
    }

    public static int zzA(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzos.zzb(str);
        } catch (zzor unused) {
            length = str.getBytes(zzmp.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zznm zznmVar) {
        int iZzcn = zznmVar.zzcn();
        return zzz(iZzcn) + iZzcn;
    }

    public static int zzD(zznm zznmVar, zznx zznxVar) {
        int iZzcd = ((zzks) zznmVar).zzcd(zznxVar);
        return zzz(iZzcd) + iZzcd;
    }

    @Deprecated
    public static int zzG(int i14, zznm zznmVar, zznx zznxVar) {
        int iZzz = zzz(i14 << 3);
        return ((zzks) zznmVar).zzcd(zznxVar) + iZzz + iZzz;
    }

    public static int zzz(int i14) {
        return (352 - (Integer.numberOfLeadingZeros(i14) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzy() == 0) {
            return;
        }
        h.z("Did not write as much data as expected.");
    }

    public final void zzF(String str, zzor zzorVar) throws zzll {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzorVar);
        byte[] bytes = str.getBytes(zzmp.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zzw(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(e4);
        }
    }

    public abstract void zza(int i14, int i15);

    public abstract void zzb(int i14, int i15);

    public abstract void zzc(int i14, int i15);

    public abstract void zzd(int i14, int i15);

    public abstract void zze(int i14, long j8);

    public abstract void zzf(int i14, long j8);

    public abstract void zzg(int i14, boolean z14);

    public abstract void zzh(int i14, String str);

    public abstract void zzi(int i14, zzlh zzlhVar);

    public abstract void zzj(zzlh zzlhVar);

    public abstract void zzk(byte[] bArr, int i14, int i15);

    public abstract void zzl(int i14, zznm zznmVar, zznx zznxVar);

    public abstract void zzm(int i14, zznm zznmVar);

    public abstract void zzn(int i14, zzlh zzlhVar);

    public abstract void zzo(zznm zznmVar);

    public abstract void zzp(byte b14);

    public abstract void zzq(int i14);

    public abstract void zzr(int i14);

    public abstract void zzs(int i14);

    public abstract void zzt(long j8);

    public abstract void zzu(long j8);

    public abstract void zzw(byte[] bArr, int i14, int i15);

    public abstract void zzx(String str);

    public abstract int zzy();

    private zzlm() {
        throw null;
    }
}
