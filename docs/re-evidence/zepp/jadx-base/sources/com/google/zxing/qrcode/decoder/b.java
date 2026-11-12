package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    private final int a;
    private final byte[] b;

    private b(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static b[] b(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != version.getTotalCodewords()) {
            throw new IllegalArgumentException();
        }
        Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
        Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
        int count = 0;
        for (Version.ECB ecb : eCBlocks) {
            count += ecb.getCount();
        }
        b[] bVarArr = new b[count];
        int i = 0;
        for (Version.ECB ecb2 : eCBlocks) {
            int i2 = 0;
            while (i2 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                bVarArr[i] = new b(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                i2++;
                i++;
            }
        }
        int length = bVarArr[0].b.length;
        int i3 = count - 1;
        while (i3 >= 0 && bVarArr[i3].b.length != length) {
            i3--;
        }
        int i4 = i3 + 1;
        int eCCodewordsPerBlock = length - eCBlocksForLevel.getECCodewordsPerBlock();
        int i5 = 0;
        for (int i6 = 0; i6 < eCCodewordsPerBlock; i6++) {
            int i7 = 0;
            while (i7 < i) {
                bVarArr[i7].b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        int i8 = i4;
        while (i8 < i) {
            bVarArr[i8].b[eCCodewordsPerBlock] = bArr[i5];
            i8++;
            i5++;
        }
        int length2 = bVarArr[0].b.length;
        while (eCCodewordsPerBlock < length2) {
            int i9 = 0;
            while (i9 < i) {
                bVarArr[i9].b[i9 < i4 ? eCCodewordsPerBlock : eCCodewordsPerBlock + 1] = bArr[i5];
                i9++;
                i5++;
            }
            eCCodewordsPerBlock++;
        }
        return bVarArr;
    }

    public byte[] a() {
        return this.b;
    }

    public int c() {
        return this.a;
    }
}
