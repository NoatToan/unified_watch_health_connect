package org.apache.commons.codec.digest;

import com.google.common.primitives.UnsignedBytes;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes3.dex */
public class XXHash32 implements Checksum {
    private static final int BUF_SIZE = 16;
    private static final int PRIME1 = -1640531535;
    private static final int PRIME2 = -2048144777;
    private static final int PRIME3 = -1028477379;
    private static final int PRIME4 = 668265263;
    private static final int PRIME5 = 374761393;
    private static final int ROTATE_BITS = 13;
    private final byte[] buffer;
    private final byte[] oneByte;
    private int pos;
    private final int seed;
    private final int[] state;
    private boolean stateUpdated;
    private int totalLen;

    public XXHash32(int i14) {
        this.oneByte = new byte[1];
        this.state = new int[4];
        this.buffer = new byte[16];
        this.seed = i14;
        initializeState();
    }

    private static int getInt(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    private void initializeState() {
        int[] iArr = this.state;
        int i14 = this.seed;
        iArr[0] = 606290984 + i14;
        iArr[1] = PRIME2 + i14;
        iArr[2] = i14;
        iArr[3] = i14 - PRIME1;
    }

    private void process(byte[] bArr, int i14) {
        int[] iArr = this.state;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int iRotateLeft = Integer.rotateLeft((getInt(bArr, i14) * PRIME2) + i15, 13) * PRIME1;
        int iRotateLeft2 = Integer.rotateLeft((getInt(bArr, i14 + 4) * PRIME2) + i16, 13) * PRIME1;
        int iRotateLeft3 = Integer.rotateLeft((getInt(bArr, i14 + 8) * PRIME2) + i17, 13) * PRIME1;
        int iRotateLeft4 = Integer.rotateLeft((getInt(bArr, i14 + 12) * PRIME2) + i18, 13) * PRIME1;
        int[] iArr2 = this.state;
        iArr2[0] = iRotateLeft;
        iArr2[1] = iRotateLeft2;
        iArr2[2] = iRotateLeft3;
        iArr2[3] = iRotateLeft4;
        this.stateUpdated = true;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int iRotateLeft;
        boolean z14 = this.stateUpdated;
        int[] iArr = this.state;
        int i14 = 0;
        if (z14) {
            iRotateLeft = Integer.rotateLeft(this.state[3], 18) + Integer.rotateLeft(this.state[2], 12) + Integer.rotateLeft(this.state[1], 7) + Integer.rotateLeft(iArr[0], 1);
        } else {
            iRotateLeft = iArr[2] + PRIME5;
        }
        int iRotateLeft2 = iRotateLeft + this.totalLen;
        int i15 = this.pos - 4;
        while (i14 <= i15) {
            iRotateLeft2 = Integer.rotateLeft((getInt(this.buffer, i14) * PRIME3) + iRotateLeft2, 17) * PRIME4;
            i14 += 4;
        }
        while (i14 < this.pos) {
            iRotateLeft2 = PRIME1 * Integer.rotateLeft(((this.buffer[i14] & UnsignedBytes.MAX_VALUE) * PRIME5) + iRotateLeft2, 11);
            i14++;
        }
        int i16 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * PRIME2;
        int i17 = (i16 ^ (i16 >>> 13)) * PRIME3;
        return ((long) (i17 ^ (i17 >>> 16))) & 4294967295L;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        initializeState();
        this.totalLen = 0;
        this.pos = 0;
        this.stateUpdated = false;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i14, int i15) {
        if (i15 <= 0) {
            return;
        }
        this.totalLen += i15;
        int i16 = i14 + i15;
        int i17 = this.pos;
        if ((i17 + i15) - 16 < 0) {
            System.arraycopy(bArr, i14, this.buffer, i17, i15);
            this.pos += i15;
            return;
        }
        if (i17 > 0) {
            int i18 = 16 - i17;
            System.arraycopy(bArr, i14, this.buffer, i17, i18);
            process(this.buffer, 0);
            i14 += i18;
        }
        int i19 = i16 - 16;
        while (i14 <= i19) {
            process(bArr, i14);
            i14 += 16;
        }
        if (i14 >= i16) {
            this.pos = 0;
            return;
        }
        int i24 = i16 - i14;
        this.pos = i24;
        System.arraycopy(bArr, i14, this.buffer, 0, i24);
    }

    public XXHash32() {
        this(0);
    }

    @Override // java.util.zip.Checksum
    public void update(int i14) {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) (i14 & 255);
        update(bArr, 0, 1);
    }
}
