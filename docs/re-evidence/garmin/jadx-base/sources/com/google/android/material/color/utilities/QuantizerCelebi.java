package com.google.android.material.color.utilities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i14) {
        Set<Integer> setKeySet = new QuantizerWu().quantize(iArr, i14).colorToCount.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            iArr2[i15] = it.next().intValue();
            i15++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i14);
    }
}
