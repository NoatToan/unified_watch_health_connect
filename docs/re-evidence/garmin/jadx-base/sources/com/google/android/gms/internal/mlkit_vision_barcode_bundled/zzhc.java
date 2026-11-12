package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes14.dex */
final class zzhc extends zzhb {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(int i14, byte[] bArr, int i15, int i16) {
        int i17;
        int i18;
        if (i14 != 0) {
            if (i15 >= i16) {
                return i14;
            }
            byte b14 = (byte) i14;
            if (b14 < -32) {
                if (b14 >= -62) {
                    i18 = i15 + 1;
                }
                return -1;
            }
            int i19 = ~(i14 >> 8);
            if (b14 < -16) {
                byte b15 = (byte) i19;
                if (b15 == 0) {
                    int i24 = i15 + 1;
                    byte b16 = bArr[i15];
                    if (i24 >= i16) {
                        return zzhe.zzh(b14, b16);
                    }
                    i15 = i24;
                    b15 = b16;
                }
                if (b15 <= -65 && ((b14 != -32 || b15 >= -96) && (b14 != -19 || b15 < -96))) {
                    i18 = i15 + 1;
                }
                return -1;
            }
            byte b17 = (byte) i19;
            if (b17 == 0) {
                int i25 = i15 + 1;
                b17 = bArr[i15];
                if (i25 >= i16) {
                    return zzhe.zzh(b14, b17);
                }
                i15 = i25;
                i17 = 0;
            } else {
                i17 = i14 >> 16;
            }
            if (i17 == 0) {
                int i26 = i15 + 1;
                byte b18 = bArr[i15];
                if (i26 >= i16) {
                    return zzhe.zzi(b14, b17, b18);
                }
                i15 = i26;
                i17 = b18;
            }
            if (b17 <= -65) {
                if ((((b17 + 112) + (b14 << Ascii.FS)) >> 30) == 0 && i17 <= -65) {
                    i18 = i15 + 1;
                }
            }
            return -1;
            i15 = i18;
        }
        while (i15 < i16 && bArr[i15] >= 0) {
            i15++;
        }
        if (i15 >= i16) {
            return 0;
        }
        while (i15 < i16) {
            int i27 = i15 + 1;
            byte b19 = bArr[i15];
            if (b19 >= 0) {
                i15 = i27;
            } else {
                if (b19 < -32) {
                    if (i27 >= i16) {
                        return b19;
                    }
                    if (b19 >= -62) {
                        i15 += 2;
                        if (bArr[i27] > -65) {
                        }
                    }
                    return -1;
                }
                if (b19 >= -16) {
                    if (i27 >= i16 - 2) {
                        return zzhe.zzc(bArr, i27, i16);
                    }
                    int i28 = i15 + 2;
                    byte b24 = bArr[i27];
                    if (b24 <= -65) {
                        if ((((b24 + 112) + (b19 << Ascii.FS)) >> 30) == 0) {
                            int i29 = i15 + 3;
                            if (bArr[i28] <= -65) {
                                i15 += 4;
                                if (bArr[i29] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i27 >= i16 - 1) {
                    return zzhe.zzc(bArr, i27, i16);
                }
                int i30 = i15 + 2;
                byte b25 = bArr[i27];
                if (b25 > -65 || (b19 == -32 && b25 < -96)) {
                    return -1;
                }
                if (b19 == -19 && b25 >= -96) {
                    return -1;
                }
                i15 += 3;
                if (bArr[i30] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
