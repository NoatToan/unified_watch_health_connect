package org.apache.commons.codec.binary;

import am.j;
import com.google.common.base.Ascii;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.lang3.e;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US};
    private static final byte[] HEX_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final long MASK_1BITS = 1;
    private static final long MASK_2BITS = 3;
    private static final long MASK_3BITS = 7;
    private static final long MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public static class Builder extends BaseNCodec.AbstractBuilder<Base32, Builder> {
        public Builder() {
            super(Base32.ENCODE_TABLE);
        }

        @Override // java.util.function.Supplier
        public Base32 get() {
            return new Base32(getLineLength(), getLineSeparator(), getEncodeTable(), getPadding(), getDecodingPolicy());
        }
    }

    private Base32(int i14, byte[] bArr, byte[] bArr2, byte b14, CodecPolicy codecPolicy) {
        super(5, 8, i14, BaseNCodec.toLength(bArr), b14, codecPolicy);
        Objects.requireNonNull(bArr2, "encodeTable");
        this.encodeTable = bArr2;
        this.decodeTable = bArr2 == HEX_ENCODE_TABLE ? HEX_DECODE_TABLE : DECODE_TABLE;
        if (i14 <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else {
            if (bArr == null) {
                h.s(e0.f(i14, "lineLength ", " > 0, but lineSeparator is null"));
                throw null;
            }
            byte[] bArr3 = (byte[]) bArr.clone();
            if (containsAlphabetOrPad(bArr3)) {
                h.s(j.m("lineSeparator must not contain Base32 characters: [", StringUtils.newStringUtf8(bArr3), "]"));
                throw null;
            }
            this.encodeSize = bArr3.length + 8;
            this.lineSeparator = bArr3;
        }
        if (isInAlphabet(b14) || Character.isWhitespace(b14)) {
            h.s("pad must not be in alphabet or whitespace");
            throw null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void validateCharacter(long j8, BaseNCodec.Context context) {
        if (!isStrictDecoding() || (j8 & context.lbitWorkArea) == 0) {
            return;
        }
        h.s("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
    }

    private void validateTrailingCharacters() {
        if (isStrictDecoding()) {
            h.s("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
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
        int i18 = i14;
        while (i17 < i15) {
            int i19 = i18 + 1;
            byte b15 = bArr[i18];
            if (b15 == this.pad) {
                context.eof = true;
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(i16, context);
            if (b15 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b15 < bArr2.length && (b14 = bArr2[b15]) >= 0) {
                    int i24 = (context.modulus + 1) % 8;
                    context.modulus = i24;
                    long j8 = (context.lbitWorkArea << 5) + ((long) b14);
                    context.lbitWorkArea = j8;
                    if (i24 == 0) {
                        int i25 = context.pos;
                        int i26 = i25 + 1;
                        context.pos = i26;
                        bArrEnsureBufferSize[i25] = (byte) ((j8 >> 32) & 255);
                        int i27 = i25 + 2;
                        context.pos = i27;
                        bArrEnsureBufferSize[i26] = (byte) ((j8 >> 24) & 255);
                        int i28 = i25 + 3;
                        context.pos = i28;
                        bArrEnsureBufferSize[i27] = (byte) ((j8 >> 16) & 255);
                        int i29 = i25 + 4;
                        context.pos = i29;
                        bArrEnsureBufferSize[i28] = (byte) ((j8 >> 8) & 255);
                        context.pos = i25 + 5;
                        bArrEnsureBufferSize[i29] = (byte) (j8 & 255);
                    }
                }
            }
            i17++;
            i18 = i19;
        }
        if (!context.eof || context.modulus <= 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(i16, context);
        switch (context.modulus) {
            case 1:
                validateTrailingCharacters();
                break;
            case 2:
                break;
            case 3:
                validateTrailingCharacters();
                int i30 = context.pos;
                context.pos = i30 + 1;
                bArrEnsureBufferSize2[i30] = (byte) ((context.lbitWorkArea >> MASK_3BITS) & 255);
                return;
            case 4:
                validateCharacter(15L, context);
                long j14 = context.lbitWorkArea;
                long j15 = j14 >> 4;
                context.lbitWorkArea = j15;
                int i34 = context.pos;
                int i35 = i34 + 1;
                context.pos = i35;
                bArrEnsureBufferSize2[i34] = (byte) ((j14 >> 12) & 255);
                context.pos = i34 + 2;
                bArrEnsureBufferSize2[i35] = (byte) (j15 & 255);
                return;
            case 5:
                validateCharacter(1L, context);
                long j16 = context.lbitWorkArea;
                long j17 = j16 >> 1;
                context.lbitWorkArea = j17;
                int i36 = context.pos;
                int i37 = i36 + 1;
                context.pos = i37;
                bArrEnsureBufferSize2[i36] = (byte) ((j16 >> 17) & 255);
                int i38 = i36 + 2;
                context.pos = i38;
                bArrEnsureBufferSize2[i37] = (byte) ((j16 >> 9) & 255);
                context.pos = i36 + 3;
                bArrEnsureBufferSize2[i38] = (byte) (j17 & 255);
                return;
            case 6:
                validateTrailingCharacters();
                long j18 = context.lbitWorkArea;
                long j19 = j18 >> 6;
                context.lbitWorkArea = j19;
                int i39 = context.pos;
                int i44 = i39 + 1;
                context.pos = i44;
                bArrEnsureBufferSize2[i39] = (byte) ((j18 >> 22) & 255);
                int i45 = i39 + 2;
                context.pos = i45;
                bArrEnsureBufferSize2[i44] = (byte) ((j18 >> 14) & 255);
                context.pos = i39 + 3;
                bArrEnsureBufferSize2[i45] = (byte) (j19 & 255);
                return;
            case 7:
                validateCharacter(MASK_3BITS, context);
                long j24 = context.lbitWorkArea;
                long j25 = j24 >> 3;
                context.lbitWorkArea = j25;
                int i46 = context.pos;
                int i47 = i46 + 1;
                context.pos = i47;
                bArrEnsureBufferSize2[i46] = (byte) ((j24 >> 27) & 255);
                int i48 = i46 + 2;
                context.pos = i48;
                bArrEnsureBufferSize2[i47] = (byte) ((j24 >> 19) & 255);
                int i49 = i46 + 3;
                context.pos = i49;
                bArrEnsureBufferSize2[i48] = (byte) ((j24 >> 11) & 255);
                context.pos = i46 + 4;
                bArrEnsureBufferSize2[i49] = (byte) (j25 & 255);
                return;
            default:
                e.i(context.modulus, "Impossible modulus ");
                return;
        }
        validateCharacter(3L, context);
        int i54 = context.pos;
        context.pos = i54 + 1;
        bArrEnsureBufferSize2[i54] = (byte) ((context.lbitWorkArea >> 2) & 255);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i14, int i15, BaseNCodec.Context context) {
        int i16;
        if (context.eof) {
            return;
        }
        int i17 = 1;
        if (i15 >= 0) {
            int i18 = i14;
            int i19 = 0;
            while (i19 < i15) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i24 = (context.modulus + i17) % 5;
                context.modulus = i24;
                int i25 = i18 + 1;
                int i26 = bArr[i18];
                if (i26 < 0) {
                    i26 += 256;
                }
                long j8 = (context.lbitWorkArea << 8) + ((long) i26);
                context.lbitWorkArea = j8;
                if (i24 == 0) {
                    int i27 = context.pos;
                    int i28 = i27 + 1;
                    context.pos = i28;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i27] = bArr2[((int) (j8 >> 35)) & 31];
                    int i29 = i27 + 2;
                    context.pos = i29;
                    i16 = i25;
                    bArrEnsureBufferSize[i28] = bArr2[((int) (j8 >> 30)) & 31];
                    int i30 = i27 + 3;
                    context.pos = i30;
                    bArrEnsureBufferSize[i29] = bArr2[((int) (j8 >> 25)) & 31];
                    int i34 = i27 + 4;
                    context.pos = i34;
                    bArrEnsureBufferSize[i30] = bArr2[((int) (j8 >> 20)) & 31];
                    int i35 = i27 + 5;
                    context.pos = i35;
                    bArrEnsureBufferSize[i34] = bArr2[((int) (j8 >> 15)) & 31];
                    int i36 = i27 + 6;
                    context.pos = i36;
                    bArrEnsureBufferSize[i35] = bArr2[((int) (j8 >> 10)) & 31];
                    int i37 = i27 + 7;
                    context.pos = i37;
                    bArrEnsureBufferSize[i36] = bArr2[((int) (j8 >> 5)) & 31];
                    int i38 = i27 + 8;
                    context.pos = i38;
                    bArrEnsureBufferSize[i37] = bArr2[((int) j8) & 31];
                    int i39 = context.currentLinePos + 8;
                    context.currentLinePos = i39;
                    int i44 = this.lineLength;
                    if (i44 > 0 && i44 <= i39) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i38, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                } else {
                    i16 = i25;
                }
                i19++;
                i18 = i16;
                i17 = 1;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i45 = context.pos;
        int i46 = context.modulus;
        if (i46 != 0) {
            if (i46 == 1) {
                int i47 = i45 + 1;
                context.pos = i47;
                byte[] bArr4 = this.encodeTable;
                long j14 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i45] = bArr4[((int) (j14 >> 3)) & 31];
                int i48 = i45 + 2;
                context.pos = i48;
                bArrEnsureBufferSize2[i47] = bArr4[((int) (j14 << 2)) & 31];
                int i49 = i45 + 3;
                context.pos = i49;
                byte b14 = this.pad;
                bArrEnsureBufferSize2[i48] = b14;
                int i54 = i45 + 4;
                context.pos = i54;
                bArrEnsureBufferSize2[i49] = b14;
                int i55 = i45 + 5;
                context.pos = i55;
                bArrEnsureBufferSize2[i54] = b14;
                int i56 = i45 + 6;
                context.pos = i56;
                bArrEnsureBufferSize2[i55] = b14;
                int i57 = i45 + 7;
                context.pos = i57;
                bArrEnsureBufferSize2[i56] = b14;
                context.pos = i45 + 8;
                bArrEnsureBufferSize2[i57] = b14;
            } else if (i46 == 2) {
                int i58 = i45 + 1;
                context.pos = i58;
                byte[] bArr5 = this.encodeTable;
                long j15 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i45] = bArr5[((int) (j15 >> 11)) & 31];
                int i59 = i45 + 2;
                context.pos = i59;
                bArrEnsureBufferSize2[i58] = bArr5[((int) (j15 >> 6)) & 31];
                int i64 = i45 + 3;
                context.pos = i64;
                bArrEnsureBufferSize2[i59] = bArr5[((int) (j15 >> 1)) & 31];
                int i65 = i45 + 4;
                context.pos = i65;
                bArrEnsureBufferSize2[i64] = bArr5[((int) (j15 << 4)) & 31];
                int i66 = i45 + 5;
                context.pos = i66;
                byte b15 = this.pad;
                bArrEnsureBufferSize2[i65] = b15;
                int i67 = i45 + 6;
                context.pos = i67;
                bArrEnsureBufferSize2[i66] = b15;
                int i68 = i45 + 7;
                context.pos = i68;
                bArrEnsureBufferSize2[i67] = b15;
                context.pos = i45 + 8;
                bArrEnsureBufferSize2[i68] = b15;
            } else if (i46 == 3) {
                int i69 = i45 + 1;
                context.pos = i69;
                byte[] bArr6 = this.encodeTable;
                long j16 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i45] = bArr6[((int) (j16 >> 19)) & 31];
                int i74 = i45 + 2;
                context.pos = i74;
                bArrEnsureBufferSize2[i69] = bArr6[((int) (j16 >> 14)) & 31];
                int i75 = i45 + 3;
                context.pos = i75;
                bArrEnsureBufferSize2[i74] = bArr6[((int) (j16 >> 9)) & 31];
                int i76 = i45 + 4;
                context.pos = i76;
                bArrEnsureBufferSize2[i75] = bArr6[((int) (j16 >> 4)) & 31];
                int i77 = i45 + 5;
                context.pos = i77;
                bArrEnsureBufferSize2[i76] = bArr6[((int) (j16 << 1)) & 31];
                int i78 = i45 + 6;
                context.pos = i78;
                byte b16 = this.pad;
                bArrEnsureBufferSize2[i77] = b16;
                int i79 = i45 + 7;
                context.pos = i79;
                bArrEnsureBufferSize2[i78] = b16;
                context.pos = i45 + 8;
                bArrEnsureBufferSize2[i79] = b16;
            } else {
                if (i46 != 4) {
                    e.i(context.modulus, "Impossible modulus ");
                    return;
                }
                int i84 = i45 + 1;
                context.pos = i84;
                byte[] bArr7 = this.encodeTable;
                long j17 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i45] = bArr7[((int) (j17 >> 27)) & 31];
                int i85 = i45 + 2;
                context.pos = i85;
                bArrEnsureBufferSize2[i84] = bArr7[((int) (j17 >> 22)) & 31];
                int i86 = i45 + 3;
                context.pos = i86;
                bArrEnsureBufferSize2[i85] = bArr7[((int) (j17 >> 17)) & 31];
                int i87 = i45 + 4;
                context.pos = i87;
                bArrEnsureBufferSize2[i86] = bArr7[((int) (j17 >> 12)) & 31];
                int i88 = i45 + 5;
                context.pos = i88;
                bArrEnsureBufferSize2[i87] = bArr7[((int) (j17 >> MASK_3BITS)) & 31];
                int i89 = i45 + 6;
                context.pos = i89;
                bArrEnsureBufferSize2[i88] = bArr7[((int) (j17 >> 2)) & 31];
                int i93 = i45 + 7;
                context.pos = i93;
                bArrEnsureBufferSize2[i89] = bArr7[((int) (j17 << 3)) & 31];
                context.pos = i45 + 8;
                bArrEnsureBufferSize2[i93] = this.pad;
            }
        }
        int i94 = context.currentLinePos;
        int i95 = context.pos;
        int i96 = (i95 - i45) + i94;
        context.currentLinePos = i96;
        if (this.lineLength <= 0 || i96 <= 0) {
            return;
        }
        byte[] bArr8 = this.lineSeparator;
        System.arraycopy(bArr8, 0, bArrEnsureBufferSize2, i95, bArr8.length);
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

    public Base32() {
        this(false);
    }

    public Base32(boolean z14) {
        this(0, null, z14, (byte) 61);
    }

    public Base32(boolean z14, byte b14) {
        this(0, null, z14, b14);
    }

    public Base32(byte b14) {
        this(false, b14);
    }

    public Base32(int i14) {
        this(i14, BaseNCodec.CHUNK_SEPARATOR);
    }

    public Base32(int i14, byte[] bArr) {
        this(i14, bArr, false, (byte) 61);
    }

    public Base32(int i14, byte[] bArr, boolean z14) {
        this(i14, bArr, z14, (byte) 61);
    }

    public Base32(int i14, byte[] bArr, boolean z14, byte b14) {
        this(i14, bArr, z14, b14, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base32(int i14, byte[] bArr, boolean z14, byte b14, CodecPolicy codecPolicy) {
        this(i14, bArr, z14 ? HEX_ENCODE_TABLE : ENCODE_TABLE, b14, codecPolicy);
    }
}
