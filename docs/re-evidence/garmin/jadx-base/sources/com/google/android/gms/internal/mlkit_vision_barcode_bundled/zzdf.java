package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import am.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.lang3.e;
import org.slf4j.Marker;
import tn.k;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzdf zzb = new zzde(zzep.zzb);
    private int zza = 0;

    static {
        int i14 = zzct.zza;
    }

    private static zzdf zzc(Iterator it, int i14) {
        if (i14 <= 0) {
            h.s(e0.f(i14, "length (", ") must be >= 1"));
            return null;
        }
        if (i14 == 1) {
            return (zzdf) it.next();
        }
        int i15 = i14 >>> 1;
        zzdf zzdfVarZzc = zzc(it, i15);
        zzdf zzdfVarZzc2 = zzc(it, i14 - i15);
        if (Integer.MAX_VALUE - zzdfVarZzc.zzd() >= zzdfVarZzc2.zzd()) {
            return zzgd.zzy(zzdfVarZzc, zzdfVarZzc2);
        }
        h.s(k.e(zzdfVarZzc.zzd(), zzdfVarZzc2.zzd(), "ByteString would be too long: ", Marker.ANY_NON_NULL_MARKER));
        return null;
    }

    public static int zzo(int i14, int i15, int i16) {
        int i17 = i15 - i14;
        if ((i14 | i15 | i17 | (i16 - i15)) >= 0) {
            return i17;
        }
        if (i14 < 0) {
            e.v(e0.f(i14, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i15 < i14) {
            e.v(k.e(i14, i15, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        e.v(k.e(i15, i16, "End index: ", " >= "));
        return 0;
    }

    public static zzdf zzr(byte[] bArr, int i14, int i15) {
        zzo(i14, i14 + i15, bArr.length);
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = inputStream.read(bArr, i14, iMin - i14);
                if (i15 == -1) {
                    break;
                }
                i14 += i15;
            }
            zzdf zzdfVarZzr = i14 == 0 ? null : zzr(bArr, 0, i14);
            if (zzdfVarZzr == null) {
                break;
            }
            arrayList.add(zzdfVarZzr);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzu(int i14, int i15) {
        if (((i15 - (i14 + 1)) | i14) < 0) {
            if (i14 >= 0) {
                throw new ArrayIndexOutOfBoundsException(k.e(i14, i15, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(j.h(i14, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return j.o(zzd() <= 50 ? zzgq.zza(this) : zzgq.zza(zzk(0, 47)).concat("..."), "\">", androidx.core.view.j.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public abstract byte zza(int i14);

    public abstract byte zzb(int i14);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i14, int i15, int i16);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i14, int i15, int i16);

    public abstract int zzj(int i14, int i15, int i16);

    public abstract zzdf zzk(int i14, int i15);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzcx zzcxVar);

    public abstract boolean zzn();

    public final int zzp() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzdb iterator() {
        return new zzcy(this);
    }

    public final String zzt() {
        return zzd() == 0 ? "" : zzl(zzep.zza);
    }

    @Deprecated
    public final void zzv(byte[] bArr, int i14, int i15, int i16) {
        zzo(0, i16, zzd());
        zzo(i15, i15 + i16, bArr.length);
        if (i16 > 0) {
            zze(bArr, 0, i15, i16);
        }
    }

    public final byte[] zzw() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzep.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
