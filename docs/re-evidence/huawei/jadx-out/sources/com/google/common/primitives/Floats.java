package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Floats extends FloatsMethodsForWeb {
    public static int e(float f) {
        return Float.valueOf(f).hashCode();
    }

    /* JADX INFO: loaded from: classes21.dex */
    enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Float.compare(fArr[i], fArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }
}
