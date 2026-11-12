package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class HexDumpUtils {
    @KeepForSdk
    public static String dump(byte[] bArr, int i14, int i15, boolean z14) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i14 < 0 || i15 <= 0 || i14 + i15 > length) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder(((i15 + 15) / 16) * (z14 ? 75 : 57));
        int i16 = i15;
        int i17 = 0;
        int i18 = 0;
        while (i16 > 0) {
            if (i17 == 0) {
                if (i15 < 65536) {
                    sb3.append(String.format("%04X:", Integer.valueOf(i14)));
                } else {
                    sb3.append(String.format("%08X:", Integer.valueOf(i14)));
                }
                i18 = i14;
            } else if (i17 == 8) {
                sb3.append(" -");
            }
            sb3.append(String.format(" %02X", Integer.valueOf(bArr[i14] & UnsignedBytes.MAX_VALUE)));
            i16--;
            i17++;
            if (z14 && (i17 == 16 || i16 == 0)) {
                int i19 = 16 - i17;
                if (i19 > 0) {
                    for (int i24 = 0; i24 < i19; i24++) {
                        sb3.append("   ");
                    }
                }
                if (i19 >= 8) {
                    sb3.append("  ");
                }
                sb3.append("  ");
                for (int i25 = 0; i25 < i17; i25++) {
                    char c14 = (char) bArr[i18 + i25];
                    if (c14 < ' ' || c14 > '~') {
                        c14 = '.';
                    }
                    sb3.append(c14);
                }
            }
            if (i17 == 16 || i16 == 0) {
                sb3.append('\n');
                i17 = 0;
            }
            i14++;
        }
        return sb3.toString();
    }
}
