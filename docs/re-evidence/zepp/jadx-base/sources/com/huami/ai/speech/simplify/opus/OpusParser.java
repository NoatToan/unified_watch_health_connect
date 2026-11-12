package com.huami.ai.speech.simplify.opus;

import com.hm.opuslib.OpusTool;

/* JADX INFO: loaded from: classes3.dex */
public class OpusParser {
    private static final int a = -32767;

    private static void a(short[] sArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = sArr[i2] * 1;
            if (i3 < a) {
                i3 = a;
            }
            sArr[i2] = (short) i3;
        }
    }

    private static byte[] b(short[] sArr, int i) {
        byte[] bArr = new byte[i << 1];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            bArr[i3] = (byte) sArr[i2];
            bArr[i3 + 1] = (byte) (sArr[i2] >> 8);
        }
        return bArr;
    }

    public static byte[] parse(OpusTool opusTool, byte[] bArr) {
        short[] sArr = new short[1024];
        int iDecodeBytes = opusTool.decodeBytes(bArr, sArr);
        a(sArr, iDecodeBytes);
        return b(sArr, iDecodeBytes);
    }
}
