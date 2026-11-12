package com.google.android.gms.internal.measurement;

import am.j;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh zzb = new zzlg(zzmp.zzb);
    private int zza = 0;

    static {
        int i14 = zzkv.zza;
    }

    public static zzlh zzh(byte[] bArr, int i14, int i15) {
        zzj(i14, i14 + i15, bArr.length);
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        return new zzlg(bArr2);
    }

    public static int zzj(int i14, int i15, int i16) {
        int i17 = i15 - i14;
        if ((i14 | i15 | i17 | (i16 - i15)) >= 0) {
            return i17;
        }
        if (i14 < 0) {
            e.v(u0.k(new StringBuilder(String.valueOf(i14).length() + 21), "Beginning index: ", i14, " < 0"));
            return 0;
        }
        if (i15 < i14) {
            com.garmin.proto.generated.a.e(String.valueOf(i14).length() + 44 + String.valueOf(i15).length(), "Beginning index larger than ending index: ", ", ", i14, i15);
            return 0;
        }
        com.garmin.proto.generated.a.e(String.valueOf(i15).length() + 15 + String.valueOf(i16).length(), "End index: ", " >= ", i15, i16);
        return 0;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzla(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return j.o(zzc() <= 50 ? zzog.zza(this) : zzog.zza(zze(0, 47)).concat("..."), "\">", androidx.core.view.j.k(zzc(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public abstract byte zza(int i14);

    public abstract byte zzb(int i14);

    public abstract int zzc();

    public abstract zzlh zze(int i14, int i15);

    public abstract void zzf(zzkz zzkzVar);

    public abstract int zzg(int i14, int i15, int i16);

    public final int zzi() {
        return this.zza;
    }
}
