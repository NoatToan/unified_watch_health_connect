package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i14, int i15, int i16) {
        int i17;
        int i18 = i14;
        while (true) {
            i17 = (i15 & (-4)) + i14;
            if (i18 >= i17) {
                break;
            }
            int i19 = ((bArr[i18] & 255) | ((bArr[i18 + 1] & 255) << 8) | ((bArr[i18 + 2] & 255) << 16) | (bArr[i18 + 3] << 24)) * (-862048943);
            int i24 = i16 ^ (((i19 >>> 17) | (i19 << 15)) * 461845907);
            i16 = (((i24 >>> 19) | (i24 << 13)) * 5) - 430675100;
            i18 += 4;
        }
        int i25 = i15 & 3;
        int i26 = 0;
        if (i25 == 1) {
            int i27 = ((bArr[i17] & 255) | i26) * (-862048943);
            i16 ^= ((i27 >>> 17) | (i27 << 15)) * 461845907;
        } else {
            if (i25 != 2) {
                i26 = i25 == 3 ? (bArr[i17 + 2] & 255) << 16 : 0;
            }
            i26 |= (bArr[i17 + 1] & 255) << 8;
            int i28 = ((bArr[i17] & 255) | i26) * (-862048943);
            i16 ^= ((i28 >>> 17) | (i28 << 15)) * 461845907;
        }
        int i29 = i16 ^ i15;
        int i30 = (i29 ^ (i29 >>> 16)) * (-2048144789);
        int i34 = (i30 ^ (i30 >>> 13)) * (-1028477387);
        return i34 ^ (i34 >>> 16);
    }
}
