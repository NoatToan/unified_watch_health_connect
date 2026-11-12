package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class SignedBytes {
    public static int c(byte b2, byte b3) {
        return b2 - b3;
    }

    enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iC = SignedBytes.c(bArr[i], bArr2[i]);
                if (iC != 0) {
                    return iC;
                }
            }
            return bArr.length - bArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }
}
