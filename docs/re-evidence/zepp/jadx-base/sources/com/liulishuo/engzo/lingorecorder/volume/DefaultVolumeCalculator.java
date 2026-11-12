package com.liulishuo.engzo.lingorecorder.volume;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes18.dex */
public class DefaultVolumeCalculator implements IVolumeCalculator {
    @Override // com.liulishuo.engzo.lingorecorder.volume.IVolumeCalculator
    public double onAudioChunk(byte[] bArr, int i, int i2) {
        int i3 = 0;
        double dAbs = 0.0d;
        if (i2 == 16) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
            i /= 2;
            short[] sArr = new short[i];
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
            while (i3 < i) {
                dAbs += (double) Math.abs((int) sArr[i3]);
                i3++;
            }
        } else {
            while (i3 < i) {
                dAbs += (double) Math.abs((int) bArr[i3]);
                i3++;
            }
        }
        return Math.log10(dAbs / ((double) i)) * 20.0d;
    }
}
