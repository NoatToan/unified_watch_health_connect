package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzop.zza() && zzop.zzb()) {
            int i14 = zzkv.zza;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zza(byte[] bArr, int i14, int i15) {
        while (i14 < i15 && bArr[i14] >= 0) {
            i14++;
        }
        if (i14 >= i15) {
            return true;
        }
        while (i14 < i15) {
            int i16 = i14 + 1;
            int iZzd = bArr[i14];
            if (iZzd >= 0) {
                i14 = i16;
            } else if (iZzd < -32) {
                if (i16 >= i15) {
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                if (iZzd < -62) {
                    return false;
                }
                i14 += 2;
                if (bArr[i16] > -65) {
                    return false;
                }
            } else if (iZzd < -16) {
                if (i16 >= i15 - 1) {
                    iZzd = zzd(bArr, i16, i15);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i17 = i14 + 2;
                char c14 = bArr[i16];
                if (c14 > -65) {
                    return false;
                }
                if (iZzd == -32 && c14 < -96) {
                    return false;
                }
                if (iZzd == -19 && c14 >= -96) {
                    return false;
                }
                i14 += 3;
                if (bArr[i17] > -65) {
                    return false;
                }
            } else {
                if (i16 >= i15 - 2) {
                    iZzd = zzd(bArr, i16, i15);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i18 = i14 + 2;
                int i19 = bArr[i16];
                if (i19 > -65) {
                    return false;
                }
                if ((((i19 + 112) + (iZzd << 28)) >> 30) != 0) {
                    return false;
                }
                int i24 = i14 + 3;
                if (bArr[i18] > -65) {
                    return false;
                }
                i14 += 4;
                if (bArr[i24] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzb(String str) {
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
                                throw new zzor(i15, length2);
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
        long j8 = ((long) i16) + 4294967296L;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j8).length() + 34);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(j8);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int zzc(String str, byte[] bArr, int i14, int i15) {
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
                            throw new zzor(i19, length);
                        }
                        StringBuilder sb3 = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i24).length());
                        sb3.append("Failed writing ");
                        sb3.append(cCharAt2);
                        sb3.append(" at index ");
                        sb3.append(i24);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
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
                    throw new zzor(i19 - 1, length);
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

    public static /* synthetic */ int zzd(byte[] bArr, int i14, int i15) {
        int i16 = i15 - i14;
        byte b14 = bArr[i14 - 1];
        if (i16 == 0) {
            if (b14 <= -12) {
                return b14;
            }
            return -1;
        }
        if (i16 == 1) {
            byte b15 = bArr[i14];
            if (b14 > -12 || b15 > -65) {
                return -1;
            }
            return (b15 << 8) ^ b14;
        }
        if (i16 != 2) {
            e0.l();
            return 0;
        }
        byte b16 = bArr[i14];
        byte b17 = bArr[i14 + 1];
        if (b14 > -12 || b16 > -65 || b17 > -65) {
            return -1;
        }
        return (b17 << Ascii.DLE) ^ ((b16 << 8) ^ b14);
    }
}
