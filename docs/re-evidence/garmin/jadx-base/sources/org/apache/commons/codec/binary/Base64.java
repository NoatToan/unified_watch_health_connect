package org.apache.commons.codec.binary;

import am.j;
import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Base64 extends BaseNCodec {
    private static final int ALPHABET_LENGTH = 64;
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int DECODING_TABLE_LENGTH = 256;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final boolean isUrlSafe;
    private final byte[] lineSeparator;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, 63, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public static class Builder extends BaseNCodec.AbstractBuilder<Base64, Builder> {
        public Builder() {
            super(Base64.STANDARD_ENCODE_TABLE);
        }

        @Override // java.util.function.Supplier
        public Base64 get() {
            return new Base64(getLineLength(), getLineSeparator(), getPadding(), getEncodeTable(), getDecodingPolicy());
        }

        public Builder setUrlSafe(boolean z14) {
            return setEncodeTable(Base64.toUrlSafeEncodeTable(z14));
        }
    }

    private Base64(int i14, byte[] bArr, byte b14, byte[] bArr2, CodecPolicy codecPolicy) {
        super(3, 4, i14, BaseNCodec.toLength(bArr), b14, codecPolicy);
        Objects.requireNonNull(bArr2, "encodeTable");
        if (bArr2.length != 64) {
            h.s("encodeTable must have exactly 64 entries.");
            throw null;
        }
        boolean z14 = bArr2 == URL_SAFE_ENCODE_TABLE;
        this.isUrlSafe = z14;
        if (bArr2 == STANDARD_ENCODE_TABLE || z14) {
            this.decodeTable = DECODE_TABLE;
            this.encodeTable = bArr2;
        } else {
            byte[] bArr3 = (byte[]) bArr2.clone();
            this.encodeTable = bArr3;
            this.decodeTable = calculateDecodeTable(bArr3);
        }
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
            return;
        }
        byte[] bArr4 = (byte[]) bArr.clone();
        if (containsAlphabetOrPad(bArr4)) {
            h.s(j.m("lineSeparator must not contain base64 characters: [", StringUtils.newStringUtf8(bArr4), "]"));
            throw null;
        }
        if (i14 > 0) {
            this.encodeSize = bArr4.length + 4;
            this.lineSeparator = bArr4;
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private byte[] calculateDecodeTable(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        Arrays.fill(bArr2, (byte) -1);
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr2[bArr[i14]] = (byte) i14;
        }
        return bArr2;
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z14, boolean z15, int i14) {
        if (BinaryCodec.isEmpty(bArr)) {
            return bArr;
        }
        Base64 base64 = z14 ? new Base64(z15) : new Base64(0, BaseNCodec.CHUNK_SEPARATOR, z15);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i14) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i14);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInteger");
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte[] bArr) {
        for (byte b14 : bArr) {
            if (!isBase64(b14) && !Character.isWhitespace(b14)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i14 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i14 = 0;
        }
        int i15 = iBitLength / 8;
        int i16 = i15 - length;
        byte[] bArr = new byte[i15];
        System.arraycopy(byteArray, i14, bArr, i16, length);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] toUrlSafeEncodeTable(boolean z14) {
        return z14 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    private void validateCharacter(int i14, BaseNCodec.Context context) {
        if (!isStrictDecoding() || (i14 & context.ibitWorkArea) == 0) {
            return;
        }
        h.s("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
    }

    private void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            h.s("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i14, int i15, BaseNCodec.Context context) {
        byte b14;
        if (context.eof) {
            return;
        }
        if (i15 < 0) {
            context.eof = true;
        }
        int i16 = this.encodeSize - 1;
        int i17 = 0;
        while (i17 < i15) {
            byte[] bArrEnsureBufferSize = ensureBufferSize(i16, context);
            int i18 = i14 + 1;
            byte b15 = bArr[i14];
            if (b15 == this.pad) {
                context.eof = true;
                break;
            }
            if (b15 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b15 < bArr2.length && (b14 = bArr2[b15]) >= 0) {
                    int i19 = (context.modulus + 1) % 4;
                    context.modulus = i19;
                    int i24 = (context.ibitWorkArea << 6) + b14;
                    context.ibitWorkArea = i24;
                    if (i19 == 0) {
                        int i25 = context.pos;
                        int i26 = i25 + 1;
                        context.pos = i26;
                        bArrEnsureBufferSize[i25] = (byte) ((i24 >> 16) & 255);
                        int i27 = i25 + 2;
                        context.pos = i27;
                        bArrEnsureBufferSize[i26] = (byte) ((i24 >> 8) & 255);
                        context.pos = i25 + 3;
                        bArrEnsureBufferSize[i27] = (byte) (i24 & 255);
                    }
                }
            }
            i17++;
            i14 = i18;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(i16, context);
        int i28 = context.modulus;
        if (i28 == 1) {
            validateTrailingCharacter();
            return;
        }
        if (i28 == 2) {
            validateCharacter(15, context);
            int i29 = context.ibitWorkArea >> 4;
            context.ibitWorkArea = i29;
            int i30 = context.pos;
            context.pos = i30 + 1;
            bArrEnsureBufferSize2[i30] = (byte) (i29 & 255);
            return;
        }
        if (i28 != 3) {
            e.i(context.modulus, "Impossible modulus ");
            return;
        }
        validateCharacter(3, context);
        int i34 = context.ibitWorkArea;
        int i35 = i34 >> 2;
        context.ibitWorkArea = i35;
        int i36 = context.pos;
        int i37 = i36 + 1;
        context.pos = i37;
        bArrEnsureBufferSize2[i36] = (byte) ((i34 >> 10) & 255);
        context.pos = i36 + 2;
        bArrEnsureBufferSize2[i37] = (byte) (i35 & 255);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i14, int i15, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i15 >= 0) {
            int i16 = 0;
            while (i16 < i15) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i17 = (context.modulus + 1) % 3;
                context.modulus = i17;
                int i18 = i14 + 1;
                int i19 = bArr[i14];
                if (i19 < 0) {
                    i19 += 256;
                }
                int i24 = (context.ibitWorkArea << 8) + i19;
                context.ibitWorkArea = i24;
                if (i17 == 0) {
                    int i25 = context.pos;
                    int i26 = i25 + 1;
                    context.pos = i26;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i25] = bArr2[(i24 >> 18) & 63];
                    int i27 = i25 + 2;
                    context.pos = i27;
                    bArrEnsureBufferSize[i26] = bArr2[(i24 >> 12) & 63];
                    int i28 = i25 + 3;
                    context.pos = i28;
                    bArrEnsureBufferSize[i27] = bArr2[(i24 >> 6) & 63];
                    int i29 = i25 + 4;
                    context.pos = i29;
                    bArrEnsureBufferSize[i28] = bArr2[i24 & 63];
                    int i30 = context.currentLinePos + 4;
                    context.currentLinePos = i30;
                    int i34 = this.lineLength;
                    if (i34 > 0 && i34 <= i30) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i29, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i16++;
                i14 = i18;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i35 = context.pos;
        int i36 = context.modulus;
        if (i36 != 0) {
            if (i36 == 1) {
                int i37 = i35 + 1;
                context.pos = i37;
                byte[] bArr4 = this.encodeTable;
                int i38 = context.ibitWorkArea;
                bArrEnsureBufferSize2[i35] = bArr4[(i38 >> 2) & 63];
                int i39 = i35 + 2;
                context.pos = i39;
                bArrEnsureBufferSize2[i37] = bArr4[(i38 << 4) & 63];
                if (bArr4 == STANDARD_ENCODE_TABLE) {
                    int i44 = i35 + 3;
                    context.pos = i44;
                    byte b14 = this.pad;
                    bArrEnsureBufferSize2[i39] = b14;
                    context.pos = i35 + 4;
                    bArrEnsureBufferSize2[i44] = b14;
                }
            } else {
                if (i36 != 2) {
                    e.i(context.modulus, "Impossible modulus ");
                    return;
                }
                int i45 = i35 + 1;
                context.pos = i45;
                byte[] bArr5 = this.encodeTable;
                int i46 = context.ibitWorkArea;
                bArrEnsureBufferSize2[i35] = bArr5[(i46 >> 10) & 63];
                int i47 = i35 + 2;
                context.pos = i47;
                bArrEnsureBufferSize2[i45] = bArr5[(i46 >> 4) & 63];
                int i48 = i35 + 3;
                context.pos = i48;
                bArrEnsureBufferSize2[i47] = bArr5[(i46 << 2) & 63];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    context.pos = i35 + 4;
                    bArrEnsureBufferSize2[i48] = this.pad;
                }
            }
        }
        int i49 = context.currentLinePos;
        int i54 = context.pos;
        int i55 = (i54 - i35) + i49;
        context.currentLinePos = i55;
        if (this.lineLength <= 0 || i55 <= 0) {
            return;
        }
        byte[] bArr6 = this.lineSeparator;
        System.arraycopy(bArr6, 0, bArrEnsureBufferSize2, i54, bArr6.length);
        context.pos += this.lineSeparator.length;
    }

    public byte[] getLineSeparator() {
        return this.lineSeparator;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b14) {
        if (b14 < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b14 < bArr.length && bArr[b14] != -1;
    }

    public boolean isUrlSafe() {
        return this.isUrlSafe;
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static boolean isBase64(byte b14) {
        if (b14 == 61) {
            return true;
        }
        if (b14 < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return b14 < bArr.length && bArr[b14] != -1;
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z14) {
        return encodeBase64(bArr, z14, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z14, boolean z15) {
        return encodeBase64(bArr, z14, z15, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public Base64() {
        this(0);
    }

    public Base64(boolean z14) {
        this(76, BaseNCodec.CHUNK_SEPARATOR, z14);
    }

    public Base64(int i14) {
        this(i14, BaseNCodec.CHUNK_SEPARATOR);
    }

    public Base64(int i14, byte[] bArr) {
        this(i14, bArr, false);
    }

    public Base64(int i14, byte[] bArr, boolean z14) {
        this(i14, bArr, (byte) 61, toUrlSafeEncodeTable(z14), BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base64(int i14, byte[] bArr, boolean z14, CodecPolicy codecPolicy) {
        this(i14, bArr, (byte) 61, toUrlSafeEncodeTable(z14), codecPolicy);
    }
}
