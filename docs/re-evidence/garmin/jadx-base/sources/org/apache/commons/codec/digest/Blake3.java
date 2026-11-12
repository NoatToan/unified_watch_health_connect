package org.apache.commons.codec.digest;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import i3.e5;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang3.e;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public final class Blake3 {
    private static final int BLOCK_INTS = 16;
    private static final int BLOCK_LEN = 64;
    private static final int CHAINING_VALUE_INTS = 8;
    private static final int CHUNK_END = 2;
    private static final int CHUNK_LEN = 1024;
    private static final int CHUNK_START = 1;
    private static final int DERIVE_KEY_CONTEXT = 32;
    private static final int DERIVE_KEY_MATERIAL = 64;
    private static final int KEYED_HASH = 16;
    private static final int KEY_INTS = 8;
    private static final int KEY_LEN = 32;
    private static final int OUT_LEN = 32;
    private static final int PARENT = 4;
    private static final int ROOT = 8;
    private final EngineState engineState;
    private static final int[] IV = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] MSG_SCHEDULE = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI}, new byte[]{2, 6, 3, 10, 7, 0, 4, Ascii.CR, 1, Ascii.VT, Ascii.FF, 5, 9, Ascii.SO, Ascii.SI, 8}, new byte[]{3, 4, 10, Ascii.FF, Ascii.CR, 2, 7, Ascii.SO, 6, 5, 9, 0, Ascii.VT, Ascii.SI, 8, 1}, new byte[]{10, 7, Ascii.FF, 9, Ascii.SO, 3, Ascii.CR, Ascii.SI, 4, 0, Ascii.VT, 2, 5, 8, 1, 6}, new byte[]{Ascii.FF, Ascii.CR, 9, Ascii.VT, Ascii.SI, 10, Ascii.SO, 8, 7, 2, 5, 3, 0, 1, 6, 4}, new byte[]{9, Ascii.SO, Ascii.VT, 5, 8, Ascii.FF, Ascii.SI, 1, Ascii.CR, 3, 0, 10, 2, 6, 4, 7}, new byte[]{Ascii.VT, Ascii.SI, 5, 0, 1, 9, 8, 6, Ascii.SO, 10, 2, Ascii.FF, 3, 4, 7, Ascii.CR}};

    public static final class ChunkState {
        private final byte[] block;
        private int blockLength;
        private int blocksCompressed;
        private int[] chainingValue;
        private final long chunkCounter;
        private final int flags;

        private ChunkState(int[] iArr, long j8, int i14) {
            this.block = new byte[64];
            this.chainingValue = iArr;
            this.chunkCounter = j8;
            this.flags = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int length() {
            return (this.blocksCompressed * 64) + this.blockLength;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Output output() {
            return new Output(this.chainingValue, Blake3.unpackInts(this.block, 16), this.chunkCounter, this.blockLength, this.flags | startFlag() | 2);
        }

        private int startFlag() {
            return this.blocksCompressed == 0 ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update(byte[] bArr, int i14, int i15) {
            while (i15 > 0) {
                if (this.blockLength == 64) {
                    this.chainingValue = Arrays.copyOf(Blake3.compress(this.chainingValue, Blake3.unpackInts(this.block, 16), 64, this.chunkCounter, this.flags | startFlag()), 8);
                    this.blocksCompressed++;
                    this.blockLength = 0;
                    Arrays.fill(this.block, (byte) 0);
                }
                int iMin = Math.min(64 - this.blockLength, i15);
                System.arraycopy(bArr, i14, this.block, this.blockLength, iMin);
                this.blockLength += iMin;
                i14 += iMin;
                i15 -= iMin;
            }
        }
    }

    public static final class EngineState {
        private final int[][] cvStack;
        private final int flags;
        private final int[] key;
        private int stackLen;
        private ChunkState state;

        private EngineState(int[] iArr, int i14) {
            this.cvStack = new int[54][];
            this.key = iArr;
            this.flags = i14;
            this.state = new ChunkState(iArr, 0L, i14);
        }

        private void addChunkCV(int[] iArr, long j8) {
            while ((1 & j8) == 0) {
                iArr = Blake3.parentChainingValue(popCV(), iArr, this.key, this.flags);
                j8 >>= 1;
            }
            pushCV(iArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void inputData(byte[] bArr, int i14, int i15) {
            while (i15 > 0) {
                if (this.state.length() == 1024) {
                    int[] iArrChainingValue = this.state.output().chainingValue();
                    long j8 = this.state.chunkCounter + 1;
                    addChunkCV(iArrChainingValue, j8);
                    this.state = new ChunkState(this.key, j8, this.flags);
                }
                int iMin = Math.min(1024 - this.state.length(), i15);
                this.state.update(bArr, i14, iMin);
                i14 += iMin;
                i15 -= iMin;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void outputHash(byte[] bArr, int i14, int i15) {
            Output output = this.state.output();
            int i16 = this.stackLen;
            while (true) {
                int i17 = i16 - 1;
                if (i16 <= 0) {
                    output.rootOutputBytes(bArr, i14, i15);
                    return;
                } else {
                    output = Blake3.parentOutput(this.cvStack[i17], output.chainingValue(), this.key, this.flags);
                    i16 = i17;
                }
            }
        }

        private int[] popCV() {
            int[][] iArr = this.cvStack;
            int i14 = this.stackLen - 1;
            this.stackLen = i14;
            return iArr[i14];
        }

        private void pushCV(int[] iArr) {
            int[][] iArr2 = this.cvStack;
            int i14 = this.stackLen;
            this.stackLen = i14 + 1;
            iArr2[i14] = iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.stackLen = 0;
            Arrays.fill(this.cvStack, (Object) null);
            this.state = new ChunkState(this.key, 0L, this.flags);
        }
    }

    public static final class Output {
        private final int blockLength;
        private final int[] blockWords;
        private final long counter;
        private final int flags;
        private final int[] inputChainingValue;

        private Output(int[] iArr, int[] iArr2, long j8, int i14, int i15) {
            this.inputChainingValue = iArr;
            this.blockWords = iArr2;
            this.counter = j8;
            this.blockLength = i14;
            this.flags = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int[] chainingValue() {
            return Arrays.copyOf(Blake3.compress(this.inputChainingValue, this.blockWords, this.blockLength, this.counter, this.flags), 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rootOutputBytes(byte[] bArr, int i14, int i15) {
            int i16 = 0;
            while (i15 > 0) {
                int iMin = Math.min(64, i15);
                i15 -= iMin;
                int i17 = i16 + 1;
                int[] iArrCompress = Blake3.compress(this.inputChainingValue, this.blockWords, this.blockLength, i16, this.flags | 8);
                int i18 = 0;
                while (iMin > 0) {
                    int iMin2 = Math.min(4, iMin);
                    Blake3.packInt(iArrCompress[i18], bArr, i14, iMin2);
                    i14 += iMin2;
                    iMin -= iMin2;
                    i18++;
                }
                i16 = i17;
            }
        }
    }

    private Blake3(int[] iArr, int i14) {
        this.engineState = new EngineState(iArr, i14);
    }

    private static void checkBufferArgs(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr);
        if (i14 < 0) {
            e.v("Offset must be non-negative");
            return;
        }
        if (i15 < 0) {
            e.v("Length must be non-negative");
            return;
        }
        int length = bArr.length;
        if (i14 <= length - i15) {
            return;
        }
        l2.j(length, e5.j(i14, i15, "Offset ", " and length ", " out of bounds with buffer length "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] compress(int[] iArr, int[] iArr2, int i14, long j8, int i15) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 16);
        System.arraycopy(IV, 0, iArrCopyOf, 8, 4);
        iArrCopyOf[12] = (int) j8;
        iArrCopyOf[13] = (int) (j8 >> 32);
        iArrCopyOf[14] = i14;
        iArrCopyOf[15] = i15;
        for (int i16 = 0; i16 < 7; i16++) {
            round(iArrCopyOf, iArr2, MSG_SCHEDULE[i16]);
        }
        for (int i17 = 0; i17 < iArrCopyOf.length / 2; i17++) {
            int i18 = i17 + 8;
            iArrCopyOf[i17] = iArrCopyOf[i17] ^ iArrCopyOf[i18];
            iArrCopyOf[i18] = iArrCopyOf[i18] ^ iArr[i17];
        }
        return iArrCopyOf;
    }

    private static void g(int[] iArr, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i24 = iArr[i15] + i18 + iArr[i14];
        iArr[i14] = i24;
        int iRotateRight = Integer.rotateRight(iArr[i17] ^ i24, 16);
        iArr[i17] = iRotateRight;
        int i25 = iArr[i16] + iRotateRight;
        iArr[i16] = i25;
        int iRotateRight2 = Integer.rotateRight(iArr[i15] ^ i25, 12);
        iArr[i15] = iRotateRight2;
        int i26 = iRotateRight2 + i19 + iArr[i14];
        iArr[i14] = i26;
        int iRotateRight3 = Integer.rotateRight(iArr[i17] ^ i26, 8);
        iArr[i17] = iRotateRight3;
        int i27 = iArr[i16] + iRotateRight3;
        iArr[i16] = i27;
        iArr[i15] = Integer.rotateRight(iArr[i15] ^ i27, 7);
    }

    public static byte[] hash(byte[] bArr) {
        return initHash().update(bArr).doFinalize(32);
    }

    public static Blake3 initHash() {
        return new Blake3(IV, 0);
    }

    public static Blake3 initKeyDerivationFunction(byte[] bArr) {
        Objects.requireNonNull(bArr);
        EngineState engineState = new EngineState(IV, 32);
        engineState.inputData(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[32];
        engineState.outputHash(bArr2, 0, 32);
        return new Blake3(unpackInts(bArr2, 8), 64);
    }

    public static Blake3 initKeyedHash(byte[] bArr) {
        Objects.requireNonNull(bArr);
        if (bArr.length == 32) {
            return new Blake3(unpackInts(bArr, 8), 16);
        }
        h.s("Blake3 keys must be 32 bytes");
        return null;
    }

    public static byte[] keyedHash(byte[] bArr, byte[] bArr2) {
        return initKeyedHash(bArr).update(bArr2).doFinalize(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void packInt(int i14, byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            bArr[i15 + i17] = (byte) (i14 >>> (i17 * 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] parentChainingValue(int[] iArr, int[] iArr2, int[] iArr3, int i14) {
        return parentOutput(iArr, iArr2, iArr3, i14).chainingValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Output parentOutput(int[] iArr, int[] iArr2, int[] iArr3, int i14) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 16);
        System.arraycopy(iArr2, 0, iArrCopyOf, 8, 8);
        return new Output((int[]) iArr3.clone(), iArrCopyOf, 0L, 64, i14 | 4);
    }

    private static void round(int[] iArr, int[] iArr2, byte[] bArr) {
        g(iArr, 0, 4, 8, 12, iArr2[bArr[0]], iArr2[bArr[1]]);
        g(iArr, 1, 5, 9, 13, iArr2[bArr[2]], iArr2[bArr[3]]);
        g(iArr, 2, 6, 10, 14, iArr2[bArr[4]], iArr2[bArr[5]]);
        g(iArr, 3, 7, 11, 15, iArr2[bArr[6]], iArr2[bArr[7]]);
        g(iArr, 0, 5, 10, 15, iArr2[bArr[8]], iArr2[bArr[9]]);
        g(iArr, 1, 6, 11, 12, iArr2[bArr[10]], iArr2[bArr[11]]);
        g(iArr, 2, 7, 8, 13, iArr2[bArr[12]], iArr2[bArr[13]]);
        g(iArr, 3, 4, 9, 14, iArr2[bArr[14]], iArr2[bArr[15]]);
    }

    private static int unpackInt(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] unpackInts(byte[] bArr, int i14) {
        int[] iArr = new int[i14];
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            iArr[i15] = unpackInt(bArr, i16);
            i15++;
            i16 += 4;
        }
        return iArr;
    }

    public byte[] doFinalize(int i14) {
        if (i14 < 0) {
            h.s("Requested bytes must be non-negative");
            return null;
        }
        byte[] bArr = new byte[i14];
        doFinalize(bArr);
        return bArr;
    }

    public Blake3 reset() {
        this.engineState.reset();
        return this;
    }

    public Blake3 update(byte[] bArr, int i14, int i15) {
        checkBufferArgs(bArr, i14, i15);
        this.engineState.inputData(bArr, i14, i15);
        return this;
    }

    public Blake3 update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    public Blake3 doFinalize(byte[] bArr, int i14, int i15) {
        checkBufferArgs(bArr, i14, i15);
        this.engineState.outputHash(bArr, i14, i15);
        return this;
    }

    public Blake3 doFinalize(byte[] bArr) {
        return doFinalize(bArr, 0, bArr.length);
    }
}
