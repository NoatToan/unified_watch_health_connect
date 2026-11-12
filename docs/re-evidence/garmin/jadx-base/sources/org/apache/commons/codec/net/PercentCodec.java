package org.apache.commons.codec.net;

import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PercentCodec implements BinaryEncoder, BinaryDecoder {
    private static final byte ESCAPE_CHAR = 37;
    private final BitSet alwaysEncodeChars;
    private int alwaysEncodeCharsMax;
    private int alwaysEncodeCharsMin;
    private final boolean plusForSpace;

    public PercentCodec() {
        this.alwaysEncodeChars = new BitSet();
        this.alwaysEncodeCharsMin = Integer.MAX_VALUE;
        this.alwaysEncodeCharsMax = Integer.MIN_VALUE;
        this.plusForSpace = false;
        insertAlwaysEncodeChar(ESCAPE_CHAR);
    }

    private boolean canEncode(byte b14) {
        if (isAsciiChar(b14)) {
            return inAlwaysEncodeCharsRange(b14) && this.alwaysEncodeChars.get(b14);
        }
        return true;
    }

    private boolean containsSpace(byte[] bArr) {
        for (byte b14 : bArr) {
            if (b14 == 32) {
                return true;
            }
        }
        return false;
    }

    private byte[] doEncode(byte[] bArr, int i14, boolean z14) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i14);
        for (byte b14 : bArr) {
            if (z14 && canEncode(b14)) {
                if (b14 < 0) {
                    b14 = (byte) (b14 + 256);
                }
                char cHexDigit = Utils.hexDigit(b14 >> 4);
                char cHexDigit2 = Utils.hexDigit(b14);
                byteBufferAllocate.put(ESCAPE_CHAR);
                byteBufferAllocate.put((byte) cHexDigit);
                byteBufferAllocate.put((byte) cHexDigit2);
            } else if (this.plusForSpace && b14 == 32) {
                byteBufferAllocate.put((byte) 43);
            } else {
                byteBufferAllocate.put(b14);
            }
        }
        return byteBufferAllocate.array();
    }

    private int expectedDecodingBytes(byte[] bArr) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < bArr.length) {
            i14 += bArr[i14] == 37 ? 3 : 1;
            i15++;
        }
        return i15;
    }

    private int expectedEncodingBytes(byte[] bArr) {
        int i14 = 0;
        for (byte b14 : bArr) {
            i14 += canEncode(b14) ? 3 : 1;
        }
        return i14;
    }

    private boolean inAlwaysEncodeCharsRange(byte b14) {
        return b14 >= this.alwaysEncodeCharsMin && b14 <= this.alwaysEncodeCharsMax;
    }

    private void insertAlwaysEncodeChar(byte b14) {
        if (b14 < 0) {
            h.s("byte must be >= 0");
            return;
        }
        this.alwaysEncodeChars.set(b14);
        if (b14 < this.alwaysEncodeCharsMin) {
            this.alwaysEncodeCharsMin = b14;
        }
        if (b14 > this.alwaysEncodeCharsMax) {
            this.alwaysEncodeCharsMax = b14;
        }
    }

    private void insertAlwaysEncodeChars(byte[] bArr) {
        if (bArr != null) {
            for (byte b14 : bArr) {
                insertAlwaysEncodeChar(b14);
            }
        }
        insertAlwaysEncodeChar(ESCAPE_CHAR);
    }

    private boolean isAsciiChar(byte b14) {
        return b14 >= 0;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(expectedDecodingBytes(bArr));
        int i14 = 0;
        while (i14 < bArr.length) {
            byte b14 = bArr[i14];
            if (b14 == 37) {
                try {
                    int iDigit16 = Utils.digit16(bArr[i14 + 1]);
                    i14 += 2;
                    byteBufferAllocate.put((byte) ((iDigit16 << 4) + Utils.digit16(bArr[i14])));
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new DecoderException("Invalid percent decoding: ", e4);
                }
            } else if (this.plusForSpace && b14 == 43) {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put(b14);
            }
            i14++;
        }
        return byteBufferAllocate.array();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be Percent encoded");
    }

    public PercentCodec(byte[] bArr, boolean z14) {
        this.alwaysEncodeChars = new BitSet();
        this.alwaysEncodeCharsMin = Integer.MAX_VALUE;
        this.alwaysEncodeCharsMax = Integer.MIN_VALUE;
        this.plusForSpace = z14;
        insertAlwaysEncodeChars(bArr);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int iExpectedEncodingBytes = expectedEncodingBytes(bArr);
        boolean z14 = iExpectedEncodingBytes != bArr.length;
        return (z14 || (this.plusForSpace && containsSpace(bArr))) ? doEncode(bArr, iExpectedEncodingBytes, z14) : bArr;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be Percent decoded");
    }
}
