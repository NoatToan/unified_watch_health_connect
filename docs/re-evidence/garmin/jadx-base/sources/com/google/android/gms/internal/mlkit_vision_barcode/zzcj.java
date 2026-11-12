package com.google.android.gms.internal.mlkit_vision_barcode;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzcj {
    public static int zza(int i14) {
        return (i14 + 1) * (i14 < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i14, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZza = zzck.zza(obj);
        int i15 = iZza & i14;
        int iZzc = zzc(obj3, i15);
        if (iZzc != 0) {
            int i16 = ~i14;
            int i17 = iZza & i16;
            int i18 = -1;
            while (true) {
                int i19 = iZzc - 1;
                int i24 = iArr[i19];
                int i25 = i24 & i14;
                if ((i24 & i16) != i17 || !zzax.zza(obj, objArr[i19]) || (objArr2 != null && !zzax.zza(obj2, objArr2[i19]))) {
                    if (i25 == 0) {
                        break;
                    }
                    i18 = i19;
                    iZzc = i25;
                } else {
                    if (i18 == -1) {
                        zze(obj3, i15, i25);
                        return i19;
                    }
                    iArr[i18] = (iArr[i18] & i16) | (i25 & i14);
                    return i19;
                }
            }
        }
        return -1;
    }

    public static int zzc(Object obj, int i14) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i14] & UnsignedBytes.MAX_VALUE;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i14] : ((int[]) obj)[i14];
    }

    public static Object zzd(int i14) {
        if (i14 < 2 || i14 > 1073741824 || Integer.highestOneBit(i14) != i14) {
            h.s(j.h(i14, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i14 <= 256) {
            return new byte[i14];
        }
        return i14 <= 65536 ? new short[i14] : new int[i14];
    }

    public static void zze(Object obj, int i14, int i15) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i14] = (byte) i15;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i14] = (short) i15;
        } else {
            ((int[]) obj)[i14] = i15;
        }
    }
}
