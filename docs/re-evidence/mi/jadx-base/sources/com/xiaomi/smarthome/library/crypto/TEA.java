package com.xiaomi.smarthome.library.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class TEA {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CUPS = 32;
    private static final int SUGAR = -1640531527;
    private static final int UNSUGAR = -957401312;
    public static String quote = "Now rise, and show your strength. Be eloquent, and deep, and tender; see, with a clear eye, into Nature, and into life:  spread your white wings of quivering thought, and soar, a god-like spirit, over the whirling world beneath you, up through long lanes of flaming stars to the gates of eternity!";
    private int[] S = new int[4];

    public TEA(byte[] bArr) {
        if (bArr == null) {
            throw new RuntimeException("Invalid key: Key was null");
        }
        if (bArr.length < 16) {
            throw new RuntimeException("Invalid key: Length was less than 16 bytes");
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int[] iArr = this.S;
            int i3 = i + 3;
            int i4 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
            i += 4;
            iArr[i2] = i4 | ((bArr[i3] & 255) << 24);
        }
    }

    public static void main(String[] strArr) {
        TEA tea = new TEA("And is there honey still for tea?".getBytes());
        if (!new String(tea.decrypt(tea.encrypt(quote.getBytes()))).equals(quote)) {
            throw new RuntimeException("Fail");
        }
    }

    public void brew(int[] iArr) {
        for (int i = 1; i < iArr.length; i += 2) {
            int i2 = iArr[i];
            int i3 = i + 1;
            int i4 = iArr[i3];
            int i5 = 32;
            int i6 = 0;
            while (true) {
                int i7 = i5 - 1;
                if (i5 > 0) {
                    i6 -= 1640531527;
                    int[] iArr2 = this.S;
                    i2 += (((i4 << 4) + iArr2[0]) ^ i4) + ((i4 >>> 5) ^ i6) + iArr2[1];
                    i4 += (((i2 << 4) + iArr2[2]) ^ i2) + ((i2 >>> 5) ^ i6) + iArr2[3];
                    i5 = i7;
                }
            }
            iArr[i] = i2;
            iArr[i3] = i4;
        }
    }

    public byte[] decrypt(byte[] bArr) {
        int[] iArr = new int[bArr.length / 4];
        pack(bArr, iArr, 0);
        unbrew(iArr);
        return unpack(iArr, 1, iArr[0]);
    }

    public byte[] encrypt(byte[] bArr) {
        int length = (((bArr.length / 8) + (bArr.length % 8 == 0 ? 0 : 1)) * 2) + 1;
        int[] iArr = new int[length];
        iArr[0] = bArr.length;
        pack(bArr, iArr, 1);
        brew(iArr);
        return unpack(iArr, 0, length * 4);
    }

    public void pack(byte[] bArr, int[] iArr, int i) {
        iArr[i] = 0;
        int i2 = 24;
        for (int i3 : bArr) {
            iArr[i] = iArr[i] | ((i3 & 255) << i2);
            if (i2 == 0) {
                i++;
                if (i < iArr.length) {
                    iArr[i] = 0;
                }
                i2 = 24;
            } else {
                i2 -= 8;
            }
        }
    }

    public void unbrew(int[] iArr) {
        for (int i = 1; i < iArr.length; i += 2) {
            int i2 = iArr[i];
            int i3 = i + 1;
            int i4 = iArr[i3];
            int i5 = 32;
            int i6 = UNSUGAR;
            while (true) {
                int i7 = i5 - 1;
                if (i5 > 0) {
                    int[] iArr2 = this.S;
                    i4 -= ((((i2 << 4) + iArr2[2]) ^ i2) + ((i2 >>> 5) ^ i6)) + iArr2[3];
                    i2 -= ((((i4 << 4) + iArr2[0]) ^ i4) + ((i4 >>> 5) ^ i6)) + iArr2[1];
                    i6 += 1640531527;
                    i5 = i7;
                }
            }
            iArr[i] = i2;
            iArr[i3] = i4;
        }
    }

    public byte[] unpack(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((iArr[i] >> (24 - (i3 * 8))) & 255);
            i3++;
            if (i3 == 4) {
                i++;
                i3 = 0;
            }
        }
        return bArr;
    }
}
