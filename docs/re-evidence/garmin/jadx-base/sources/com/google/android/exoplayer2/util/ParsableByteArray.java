package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.v;
import com.google.common.base.Charsets;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class ParsableByteArray {
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray(int i14) {
        this.data = new byte[i14];
        this.limit = i14;
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i14) {
        if (i14 > capacity()) {
            this.data = Arrays.copyOf(this.data, i14);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i14 = this.position;
        return (char) ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & UnsignedBytes.MAX_VALUE;
    }

    public void readBytes(byte[] bArr, int i14, int i15) {
        System.arraycopy(this.data, this.position, bArr, i14, i15);
        this.position += i15;
    }

    public String readDelimiterTerminatedString(char c14) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i14 = this.position;
        while (i14 < this.limit && this.data[i14] != c14) {
            i14++;
        }
        byte[] bArr = this.data;
        int i15 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i15, i14 - i15);
        this.position = i14;
        if (i14 < this.limit) {
            this.position = i14 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 24;
        int i17 = i14 + 2;
        this.position = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 16) | i16;
        int i19 = i14 + 3;
        this.position = i19;
        int i24 = i18 | ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 8);
        this.position = i14 + 4;
        return (bArr[i19] & UnsignedBytes.MAX_VALUE) | i24;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 24) >> 8;
        int i17 = i14 + 2;
        this.position = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        this.position = i14 + 3;
        return (bArr[i17] & UnsignedBytes.MAX_VALUE) | i18;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    public String readLine() {
        int i14;
        if (bytesLeft() == 0) {
            return null;
        }
        int i15 = this.position;
        while (i15 < this.limit && !Util.isLinebreak(this.data[i15])) {
            i15++;
        }
        int i16 = this.position;
        if (i15 - i16 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i16] == -17 && bArr[i16 + 1] == -69 && bArr[i16 + 2] == -65) {
                this.position = i16 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i17 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i17, i15 - i17);
        this.position = i15;
        int i18 = this.limit;
        if (i15 != i18) {
            byte[] bArr3 = this.data;
            if (bArr3[i15] == 13) {
                int i19 = i15 + 1;
                this.position = i19;
                if (i19 != i18) {
                    i14 = this.position;
                    if (bArr3[i14] == 10) {
                        this.position = i14 + 1;
                    }
                }
            } else {
                i14 = this.position;
                if (bArr3[i14] == 10) {
                    this.position = i14 + 1;
                }
            }
        }
        return strFromUtf8Bytes;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        int i17 = i14 + 2;
        this.position = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        int i19 = i14 + 3;
        this.position = i19;
        int i24 = i18 | ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 16);
        this.position = i14 + 4;
        return ((bArr[i19] & UnsignedBytes.MAX_VALUE) << 24) | i24;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        int i17 = i14 + 2;
        this.position = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        this.position = i14 + 3;
        return ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 16) | i18;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        long j8 = ((long) bArr[i14]) & 255;
        int i16 = i14 + 2;
        this.position = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 8);
        int i17 = i14 + 3;
        this.position = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i14 + 4;
        this.position = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 24);
        int i19 = i14 + 5;
        this.position = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 32);
        int i24 = i14 + 6;
        this.position = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 40);
        int i25 = i14 + 7;
        this.position = i25;
        long j19 = j18 | ((((long) bArr[i24]) & 255) << 48);
        this.position = i14 + 8;
        return ((((long) bArr[i25]) & 255) << 56) | j19;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        this.position = i14 + 2;
        return (short) (((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        long j8 = ((long) bArr[i14]) & 255;
        int i16 = i14 + 2;
        this.position = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 8);
        int i17 = i14 + 3;
        this.position = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 16);
        this.position = i14 + 4;
        return ((((long) bArr[i17]) & 255) << 24) | j15;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        int i17 = i14 + 2;
        this.position = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        this.position = i14 + 3;
        return ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 16) | i18;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        h.z(v.b(29, littleEndianInt, "Top bit not zero: "));
        return 0;
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        this.position = i14 + 2;
        return ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        long j8 = (((long) bArr[i14]) & 255) << 56;
        int i16 = i14 + 2;
        this.position = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 48);
        int i17 = i14 + 3;
        this.position = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 40);
        int i18 = i14 + 4;
        this.position = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 32);
        int i19 = i14 + 5;
        this.position = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 24);
        int i24 = i14 + 6;
        this.position = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 16);
        int i25 = i14 + 7;
        this.position = i25;
        long j19 = j18 | ((((long) bArr[i24]) & 255) << 8);
        this.position = i14 + 8;
        return (((long) bArr[i25]) & 255) | j19;
    }

    public String readNullTerminatedString(int i14) {
        if (i14 == 0) {
            return "";
        }
        int i15 = this.position;
        int i16 = (i15 + i14) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i15, (i16 >= this.limit || this.data[i16] != 0) ? i14 : i14 - 1);
        this.position += i14;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        this.position = i14 + 2;
        return (short) ((bArr[i15] & UnsignedBytes.MAX_VALUE) | i16);
    }

    public String readString(int i14, Charset charset) {
        String str = new String(this.data, this.position, i14, charset);
        this.position += i14;
        return str;
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i14 = this.position;
        this.position = i14 + 1;
        return bArr[i14] & UnsignedBytes.MAX_VALUE;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        this.position = i14 + 2;
        int i17 = (bArr[i15] & UnsignedBytes.MAX_VALUE) | i16;
        this.position = i14 + 4;
        return i17;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        long j8 = (((long) bArr[i14]) & 255) << 24;
        int i16 = i14 + 2;
        this.position = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i14 + 3;
        this.position = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.position = i14 + 4;
        return (((long) bArr[i17]) & 255) | j15;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 16;
        int i17 = i14 + 2;
        this.position = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        this.position = i14 + 3;
        return (bArr[i17] & UnsignedBytes.MAX_VALUE) | i18;
    }

    public int readUnsignedIntToInt() {
        int i14 = readInt();
        if (i14 >= 0) {
            return i14;
        }
        h.z(v.b(29, i14, "Top bit not zero: "));
        return 0;
    }

    public long readUnsignedLongToLong() {
        long j8 = readLong();
        if (j8 >= 0) {
            return j8;
        }
        StringBuilder sb3 = new StringBuilder(38);
        sb3.append("Top bit not zero: ");
        sb3.append(j8);
        throw new IllegalStateException(sb3.toString());
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i14 = this.position;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        this.position = i14 + 2;
        return (bArr[i15] & UnsignedBytes.MAX_VALUE) | i16;
    }

    public long readUtf8EncodedLong() {
        int i14;
        int i15;
        long j8 = this.data[this.position];
        int i16 = 7;
        while (true) {
            if (i16 >= 0) {
                int i17 = 1 << i16;
                if ((((long) i17) & j8) == 0) {
                    if (i16 < 6) {
                        j8 &= (long) (i17 - 1);
                        i15 = 7 - i16;
                        break;
                    }
                    if (i16 == 7) {
                        i15 = 1;
                        break;
                    }
                } else {
                    i16--;
                }
            }
            i15 = 0;
            break;
        }
        if (i15 == 0) {
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("Invalid UTF-8 sequence first byte: ");
            sb3.append(j8);
            throw new NumberFormatException(sb3.toString());
        }
        for (i14 = 1; i14 < i15; i14++) {
            byte b14 = this.data[this.position + i14];
            if ((b14 & 192) != 128) {
                StringBuilder sb4 = new StringBuilder(62);
                sb4.append("Invalid UTF-8 sequence continuation byte: ");
                sb4.append(j8);
                throw new NumberFormatException(sb4.toString());
            }
            j8 = (j8 << 6) | ((long) (b14 & 63));
        }
        this.position += i15;
        return j8;
    }

    public void reset(int i14) {
        reset(capacity() < i14 ? new byte[i14] : this.data, i14);
    }

    public void setLimit(int i14) {
        Assertions.checkArgument(i14 >= 0 && i14 <= this.data.length);
        this.limit = i14;
    }

    public void setPosition(int i14) {
        Assertions.checkArgument(i14 >= 0 && i14 <= this.limit);
        this.position = i14;
    }

    public void skipBytes(int i14) {
        setPosition(this.position + i14);
    }

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i14) {
        readBytes(parsableBitArray.data, 0, i14);
        parsableBitArray.setPosition(0);
    }

    public ParsableByteArray(byte[] bArr, int i14) {
        this.data = bArr;
        this.limit = i14;
    }

    public void readBytes(ByteBuffer byteBuffer, int i14) {
        byteBuffer.put(this.data, this.position, i14);
        this.position += i14;
    }

    public String readString(int i14) {
        return readString(i14, Charsets.UTF_8);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void reset(byte[] bArr, int i14) {
        this.data = bArr;
        this.limit = i14;
        this.position = 0;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }
}
