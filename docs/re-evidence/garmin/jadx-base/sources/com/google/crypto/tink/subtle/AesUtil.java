package com.google.crypto.tink.subtle;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class AesUtil {
    public static final int BLOCK_SIZE = 16;

    public static byte[] cmacPad(byte[] bArr) {
        if (bArr.length >= 16) {
            h.s("x must be smaller than a block.");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = UnsignedBytes.MAX_POWER_OF_TWO;
        return bArrCopyOf;
    }

    public static byte[] dbl(byte[] bArr) {
        if (bArr.length != 16) {
            h.s("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i14 = 0; i14 < 16; i14++) {
            byte b14 = (byte) ((bArr[i14] << 1) & 254);
            bArr2[i14] = b14;
            if (i14 < 15) {
                bArr2[i14] = (byte) (((byte) ((bArr[i14 + 1] >> 7) & 1)) | b14);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3)) ^ bArr2[15]);
        return bArr2;
    }
}
