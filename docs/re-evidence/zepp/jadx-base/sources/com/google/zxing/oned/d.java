package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes4.dex */
final class d {
    private static final int[] c = {1, 1, 2};
    private final b a = new b();
    private final c b = new c();

    public Result a(int i, BitArray bitArray, int i2) throws NotFoundException {
        int[] iArrD = UPCEANReader.d(bitArray, i2, false, c);
        try {
            return this.b.b(i, bitArray, iArrD);
        } catch (ReaderException unused) {
            return this.a.b(i, bitArray, iArrD);
        }
    }
}
