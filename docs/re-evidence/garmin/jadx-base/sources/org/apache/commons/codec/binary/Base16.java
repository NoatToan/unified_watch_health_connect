package org.apache.commons.codec.binary;

import am.j;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Base16 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 4;
    private static final int BYTES_PER_ENCODED_BLOCK = 2;
    private static final int BYTES_PER_UNENCODED_BLOCK = 1;
    private static final int MASK_4BITS = 15;
    private final byte[] decodeTable;
    private final byte[] encodeTable;
    private static final byte[] UPPER_CASE_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI};
    private static final byte[] UPPER_CASE_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    private static final byte[] LOWER_CASE_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI};
    private static final byte[] LOWER_CASE_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    private Base16(boolean z14, byte[] bArr, CodecPolicy codecPolicy) {
        super(1, 2, 0, 0, (byte) 61, codecPolicy);
        Objects.requireNonNull(bArr, "encodeTable");
        this.encodeTable = bArr;
        this.decodeTable = bArr == LOWER_CASE_ENCODE_TABLE ? LOWER_CASE_DECODE_TABLE : UPPER_CASE_DECODE_TABLE;
    }

    private int decodeOctet(byte b14) {
        int i14 = b14 & UnsignedBytes.MAX_VALUE;
        byte[] bArr = this.decodeTable;
        byte b15 = i14 < bArr.length ? bArr[b14] : (byte) -1;
        if (b15 != -1) {
            return b15;
        }
        h.s(j.h(b14, "Invalid octet in encoded value: "));
        return 0;
    }

    private void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            h.s("Strict decoding: Last encoded character is a valid base 16 alphabet character but not a possible encoding. Decoding requires at least two characters to create one byte.");
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i14, int i15, BaseNCodec.Context context) {
        if (context.eof || i15 < 0) {
            context.eof = true;
            if (context.ibitWorkArea != 0) {
                validateTrailingCharacter();
                return;
            }
            return;
        }
        int iMin = Math.min(bArr.length - i14, i15);
        int i16 = (context.ibitWorkArea != 0 ? 1 : 0) + iMin;
        if (i16 == 1 && i16 == iMin) {
            context.ibitWorkArea = decodeOctet(bArr[i14]) + 1;
            return;
        }
        int i17 = i14 + iMin;
        byte[] bArrEnsureBufferSize = ensureBufferSize((i16 % 2 == 0 ? i16 : i16 - 1) / 2, context);
        if (iMin < i16) {
            int i18 = i14 + 1;
            int iDecodeOctet = decodeOctet(bArr[i14]) | ((context.ibitWorkArea - 1) << 4);
            int i19 = context.pos;
            context.pos = i19 + 1;
            bArrEnsureBufferSize[i19] = (byte) iDecodeOctet;
            context.ibitWorkArea = 0;
            i14 = i18;
        }
        int i24 = i17 - 1;
        while (i14 < i24) {
            int i25 = i14 + 1;
            int iDecodeOctet2 = decodeOctet(bArr[i14]) << 4;
            i14 += 2;
            int iDecodeOctet3 = decodeOctet(bArr[i25]) | iDecodeOctet2;
            int i26 = context.pos;
            context.pos = i26 + 1;
            bArrEnsureBufferSize[i26] = (byte) iDecodeOctet3;
        }
        if (i14 < i17) {
            context.ibitWorkArea = decodeOctet(bArr[i14]) + 1;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i14, int i15, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i15 < 0) {
            context.eof = true;
            return;
        }
        int i16 = i15 * 2;
        if (i16 < 0) {
            h.s(j.h(i15, "Input length exceeds maximum size for encoded data: "));
            return;
        }
        byte[] bArrEnsureBufferSize = ensureBufferSize(i16, context);
        int i17 = i15 + i14;
        while (i14 < i17) {
            byte b14 = bArr[i14];
            int i18 = (b14 >> 4) & 15;
            int i19 = b14 & Ascii.SI;
            int i24 = context.pos;
            int i25 = i24 + 1;
            context.pos = i25;
            byte[] bArr2 = this.encodeTable;
            bArrEnsureBufferSize[i24] = bArr2[i18];
            context.pos = i24 + 2;
            bArrEnsureBufferSize[i25] = bArr2[i19];
            i14++;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b14) {
        int i14 = b14 & UnsignedBytes.MAX_VALUE;
        byte[] bArr = this.decodeTable;
        return i14 < bArr.length && bArr[b14] != -1;
    }

    public Base16(boolean z14) {
        this(z14, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base16() {
        this(false);
    }

    public Base16(boolean z14, CodecPolicy codecPolicy) {
        this(z14, z14 ? LOWER_CASE_ENCODE_TABLE : UPPER_CASE_ENCODE_TABLE, codecPolicy);
    }
}
