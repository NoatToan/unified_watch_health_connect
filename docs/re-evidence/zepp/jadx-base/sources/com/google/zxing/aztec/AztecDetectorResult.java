package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* JADX INFO: loaded from: classes4.dex */
public final class AztecDetectorResult extends DetectorResult {
    private final boolean c;
    private final int d;
    private final int e;

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z, int i, int i2) {
        super(bitMatrix, resultPointArr);
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public int getNbDatablocks() {
        return this.d;
    }

    public int getNbLayers() {
        return this.e;
    }

    public boolean isCompact() {
        return this.c;
    }
}
