package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes14.dex */
final class zzha {
    public static /* bridge */ /* synthetic */ void zza(byte b14, byte b15, byte b16, byte b17, char[] cArr, int i14) throws zzer {
        if (!zze(b15)) {
            if ((((b15 + 112) + (b14 << Ascii.FS)) >> 30) == 0 && !zze(b16) && !zze(b17)) {
                int i15 = ((b14 & 7) << 18) | ((b15 & 63) << 12) | ((b16 & 63) << 6) | (b17 & 63);
                cArr[i14] = (char) ((i15 >>> 10) + 55232);
                cArr[i14 + 1] = (char) ((i15 & 1023) + 56320);
                return;
            }
        }
        a.r("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void zzb(byte b14, byte b15, byte b16, char[] cArr, int i14) throws zzer {
        if (!zze(b15)) {
            if (b14 != -32) {
                if (b14 != -19) {
                    if (!zze(b16)) {
                        cArr[i14] = (char) (((b14 & Ascii.SI) << 12) | ((b15 & 63) << 6) | (b16 & 63));
                        return;
                    }
                } else if (b15 < -96) {
                    b14 = -19;
                    if (!zze(b16)) {
                        cArr[i14] = (char) (((b14 & Ascii.SI) << 12) | ((b15 & 63) << 6) | (b16 & 63));
                        return;
                    }
                }
            } else if (b15 >= -96) {
                b14 = -32;
                if (b14 != -19) {
                    if (!zze(b16)) {
                        cArr[i14] = (char) (((b14 & Ascii.SI) << 12) | ((b15 & 63) << 6) | (b16 & 63));
                        return;
                    }
                } else if (b15 < -96) {
                    b14 = -19;
                    if (!zze(b16)) {
                        cArr[i14] = (char) (((b14 & Ascii.SI) << 12) | ((b15 & 63) << 6) | (b16 & 63));
                        return;
                    }
                }
            }
        }
        a.r("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b14, byte b15, char[] cArr, int i14) throws zzer {
        if (b14 < -62 || zze(b15)) {
            a.r("Protocol message had invalid UTF-8.");
        } else {
            cArr[i14] = (char) (((b14 & Ascii.US) << 6) | (b15 & 63));
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b14) {
        return b14 >= 0;
    }

    private static boolean zze(byte b14) {
        return b14 > -65;
    }
}
