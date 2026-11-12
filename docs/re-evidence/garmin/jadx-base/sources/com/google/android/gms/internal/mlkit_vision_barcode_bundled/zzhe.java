package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.protobuf.a;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzhe {
    public static final /* synthetic */ int zza = 0;
    private static final zzhb zzb;

    static {
        if (zzgz.zzx() && zzgz.zzy()) {
            int i14 = zzct.zza;
        }
        zzb = new zzhc();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i14, int i15) {
        int i16 = i15 - i14;
        byte b14 = bArr[i14 - 1];
        if (i16 == 0) {
            if (b14 > -12) {
                return -1;
            }
            return b14;
        }
        if (i16 == 1) {
            return zzh(b14, bArr[i14]);
        }
        if (i16 == 2) {
            return zzi(b14, bArr[i14], bArr[i14 + 1]);
        }
        e0.l();
        return 0;
    }

    public static int zzd(String str, byte[] bArr, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int length = str.length();
        int i19 = 0;
        while (true) {
            i16 = i14 + i15;
            if (i19 >= length || (i18 = i19 + i14) >= i16 || (cCharAt = str.charAt(i19)) >= 128) {
                break;
            }
            bArr[i18] = (byte) cCharAt;
            i19++;
        }
        if (i19 == length) {
            return i14 + length;
        }
        int i24 = i14 + i19;
        while (i19 < length) {
            char cCharAt2 = str.charAt(i19);
            if (cCharAt2 < 128 && i24 < i16) {
                bArr[i24] = (byte) cCharAt2;
                i24++;
            } else if (cCharAt2 < 2048 && i24 <= i16 - 2) {
                bArr[i24] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i24 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i24 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i24 > i16 - 3) {
                    if (i24 > i16 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i17 = i19 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i17)))) {
                            throw new zzhd(i19, length);
                        }
                        a.n(cCharAt2, i24);
                        return 0;
                    }
                    int i25 = i19 + 1;
                    if (i25 != str.length()) {
                        char cCharAt3 = str.charAt(i25);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i26 = i24 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i24] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i24 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i24 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i24 += 4;
                            bArr[i26] = (byte) ((codePoint & 63) | 128);
                            i19 = i25;
                        } else {
                            i19 = i25;
                        }
                    }
                    throw new zzhd(i19 - 1, length);
                }
                bArr[i24] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i24 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i24 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i24 += 3;
            }
            i19++;
        }
        return i24;
    }

    public static int zze(String str) {
        int length = str.length();
        int i14 = 0;
        int i15 = 0;
        while (i15 < length && str.charAt(i15) < 128) {
            i15++;
        }
        int i16 = length;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i15 < length2) {
                    char cCharAt2 = str.charAt(i15);
                    if (cCharAt2 < 2048) {
                        i14 += (127 - cCharAt2) >>> 31;
                    } else {
                        i14 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i15) < 65536) {
                                throw new zzhd(i15, length2);
                            }
                            i15++;
                        }
                    }
                    i15++;
                }
                i16 += i14;
                break;
            }
            i16 += (127 - cCharAt) >>> 31;
            i15++;
        }
        if (i16 >= length) {
            return i16;
        }
        a.g(((long) i16) + 4294967296L);
        return 0;
    }

    public static int zzf(int i14, byte[] bArr, int i15, int i16) {
        return zzb.zza(i14, bArr, i15, i16);
    }

    public static boolean zzg(byte[] bArr, int i14, int i15) {
        return zzb.zza(0, bArr, i14, i15) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzh(int i14, int i15) {
        if (i14 > -12 || i15 > -65) {
            return -1;
        }
        return i14 ^ (i15 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(int i14, int i15, int i16) {
        if (i14 > -12 || i15 > -65 || i16 > -65) {
            return -1;
        }
        return (i14 ^ (i15 << 8)) ^ (i16 << 16);
    }
}
