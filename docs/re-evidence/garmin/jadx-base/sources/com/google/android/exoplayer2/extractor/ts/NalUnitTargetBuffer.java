package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i14, int i15) {
        this.targetType = i14;
        byte[] bArr = new byte[i15 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i14, int i15) {
        if (this.isFilling) {
            int i16 = i15 - i14;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i17 = this.nalLength;
            if (length < i17 + i16) {
                this.nalData = Arrays.copyOf(bArr2, (i17 + i16) * 2);
            }
            System.arraycopy(bArr, i14, this.nalData, this.nalLength, i16);
            this.nalLength += i16;
        }
    }

    public boolean endNalUnit(int i14) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i14;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i14) {
        Assertions.checkState(!this.isFilling);
        boolean z14 = i14 == this.targetType;
        this.isFilling = z14;
        if (z14) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}
