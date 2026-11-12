package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ReedSolomonEncoder {
    private final GenericGF a;
    private final List<a> b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new a(genericGF, new int[]{1}));
    }

    private a a(int i) {
        if (i >= this.b.size()) {
            List<a> list = this.b;
            a aVarI = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                GenericGF genericGF = this.a;
                aVarI = aVarI.i(new a(genericGF, new int[]{1, genericGF.c((size - 1) + genericGF.getGeneratorBase())}));
                this.b.add(aVarI);
            }
        }
        return this.b.get(i);
    }

    public void encode(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        a aVarA = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrE = new a(this.a, iArr2).j(i, 1).b(aVarA)[1].e();
        int length2 = i - iArrE.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrE, 0, iArr, length + length2, iArrE.length);
    }
}
