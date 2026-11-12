package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final String a = "NalUnitUtil";
    private static final int b = 6;
    private static final int c = 7;
    private static final int d = 39;
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object e = new Object();
    private static int[] f = new int[10];

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int picParameterSetId, int seqParameterSetId, boolean bottomFieldPicOrderInFramePresentFlag) {
            this.picParameterSetId = picParameterSetId;
            this.seqParameterSetId = seqParameterSetId;
            this.bottomFieldPicOrderInFramePresentFlag = bottomFieldPicOrderInFramePresentFlag;
        }
    }

    public static final class SpsData {
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthAspectRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int profileIdc, int constraintsFlagsAndReservedZero2Bits, int levelIdc, int seqParameterSetId, int width, int height, float pixelWidthAspectRatio, boolean separateColorPlaneFlag, boolean frameMbsOnlyFlag, int frameNumLength, int picOrderCountType, int picOrderCntLsbLength, boolean deltaPicOrderAlwaysZeroFlag) {
            this.profileIdc = profileIdc;
            this.constraintsFlagsAndReservedZero2Bits = constraintsFlagsAndReservedZero2Bits;
            this.levelIdc = levelIdc;
            this.seqParameterSetId = seqParameterSetId;
            this.width = width;
            this.height = height;
            this.pixelWidthAspectRatio = pixelWidthAspectRatio;
            this.separateColorPlaneFlag = separateColorPlaneFlag;
            this.frameMbsOnlyFlag = frameMbsOnlyFlag;
            this.frameNumLength = frameNumLength;
            this.picOrderCountType = picOrderCountType;
            this.picOrderCntLsbLength = picOrderCntLsbLength;
            this.deltaPicOrderAlwaysZeroFlag = deltaPicOrderAlwaysZeroFlag;
        }
    }

    private NalUnitUtil() {
    }

    private static int a(byte[] bytes, int offset, int limit) {
        while (offset < limit - 2) {
            if (bytes[offset] == 0 && bytes[offset + 1] == 0 && bytes[offset + 2] == 3) {
                return offset;
            }
            offset++;
        }
        return limit;
    }

    private static void b(ParsableNalUnitBitArray bitArray, int size) {
        int signedExpGolombCodedInt = 8;
        int i = 8;
        for (int i2 = 0; i2 < size; i2++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((bitArray.readSignedExpGolombCodedInt() + i) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i = signedExpGolombCodedInt;
            }
        }
    }

    public static void clearPrefixFlags(boolean[] prefixFlags) {
        prefixFlags[0] = false;
        prefixFlags[1] = false;
        prefixFlags[2] = false;
    }

    public static void discardToSps(ByteBuffer data) {
        int iPosition = data.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                data.clear();
                return;
            }
            int i4 = data.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (data.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = data.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    data.position(0);
                    data.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int findNalUnit(byte[] data, int startOffset, int endOffset, boolean[] prefixFlags) {
        int i = endOffset - startOffset;
        Assertions.checkState(i >= 0);
        if (i == 0) {
            return endOffset;
        }
        if (prefixFlags[0]) {
            clearPrefixFlags(prefixFlags);
            return startOffset - 3;
        }
        if (i > 1 && prefixFlags[1] && data[startOffset] == 1) {
            clearPrefixFlags(prefixFlags);
            return startOffset - 2;
        }
        if (i > 2 && prefixFlags[2] && data[startOffset] == 0 && data[startOffset + 1] == 1) {
            clearPrefixFlags(prefixFlags);
            return startOffset - 1;
        }
        int i2 = endOffset - 1;
        int i3 = startOffset + 2;
        while (i3 < i2) {
            if ((data[i3] & 254) == 0) {
                int i4 = i3 - 2;
                if (data[i4] == 0 && data[i3 - 1] == 0 && data[i3] == 1) {
                    clearPrefixFlags(prefixFlags);
                    return i4;
                }
                i3 -= 2;
            }
            i3 += 3;
        }
        prefixFlags[0] = i <= 2 ? !(i != 2 ? !(prefixFlags[1] && data[i2] == 1) : !(prefixFlags[2] && data[endOffset + (-2)] == 0 && data[i2] == 1)) : data[endOffset + (-3)] == 0 && data[endOffset + (-2)] == 0 && data[i2] == 1;
        prefixFlags[1] = i <= 1 ? prefixFlags[2] && data[i2] == 0 : data[endOffset + (-2)] == 0 && data[i2] == 0;
        prefixFlags[2] = data[i2] == 0;
        return endOffset;
    }

    public static int getH265NalUnitType(byte[] data, int offset) {
        return (data[offset + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] data, int offset) {
        return data[offset + 3] & 31;
    }

    public static boolean isNalUnitSei(@Nullable String mimeType, byte nalUnitHeaderFirstByte) {
        if (MimeTypes.VIDEO_H264.equals(mimeType) && (nalUnitHeaderFirstByte & 31) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(mimeType) && ((nalUnitHeaderFirstByte & 126) >> 1) == 39;
    }

    public static PpsData parsePpsNalUnit(byte[] nalData, int nalOffset, int nalLimit) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalData, nalOffset, nalLimit);
        parsableNalUnitBitArray.skipBits(8);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    public static SpsData parseSpsNalUnit(byte[] bArr, int i, int i2) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int unsignedExpGolombCodedInt2;
        boolean z;
        boolean bit2;
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        parsableNalUnitBitArray.skipBits(8);
        int bits = parsableNalUnitBitArray.readBits(8);
        int bits2 = parsableNalUnitBitArray.readBits(8);
        int bits3 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i8 = 1;
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i9 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (parsableNalUnitBitArray.readBit()) {
                        b(parsableNalUnitBitArray, i10 < 6 ? 16 : 64);
                    }
                    i10++;
                }
            }
        } else {
            unsignedExpGolombCodedInt = 1;
            bit = false;
        }
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt5 != 0) {
            if (unsignedExpGolombCodedInt5 == 1) {
                boolean bit3 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                long unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i11 = 0; i11 < unsignedExpGolombCodedInt6; i11++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z = bit3;
                unsignedExpGolombCodedInt2 = 0;
            } else {
                unsignedExpGolombCodedInt2 = 0;
            }
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            bit2 = parsableNalUnitBitArray.readBit();
            int i12 = (2 - (bit2 ? 1 : 0)) * unsignedExpGolombCodedInt8;
            if (!bit2) {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            i3 = unsignedExpGolombCodedInt7 * 16;
            i4 = i12 * 16;
            if (parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (unsignedExpGolombCodedInt == 0) {
                    i7 = 2 - (bit2 ? 1 : 0);
                } else {
                    if (unsignedExpGolombCodedInt == 3) {
                        i5 = 1;
                        i6 = 1;
                    } else {
                        i5 = 1;
                        i6 = 2;
                    }
                    if (unsignedExpGolombCodedInt == i5) {
                        i5 = 2;
                    }
                    i7 = (2 - (bit2 ? 1 : 0)) * i5;
                    i8 = i6;
                }
                i3 -= (unsignedExpGolombCodedInt9 + unsignedExpGolombCodedInt10) * i8;
                i4 -= (unsignedExpGolombCodedInt11 + unsignedExpGolombCodedInt12) * i7;
            }
            int i13 = i4;
            int i14 = i3;
            float f3 = 1.0f;
            if (parsableNalUnitBitArray.readBit() || !parsableNalUnitBitArray.readBit()) {
                f2 = 1.0f;
            } else {
                int bits4 = parsableNalUnitBitArray.readBits(8);
                if (bits4 == 255) {
                    int bits5 = parsableNalUnitBitArray.readBits(16);
                    int bits6 = parsableNalUnitBitArray.readBits(16);
                    if (bits5 != 0 && bits6 != 0) {
                        f3 = bits5 / bits6;
                    }
                    f2 = f3;
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits4 < fArr.length) {
                        f2 = fArr[bits4];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(bits4);
                        Log.w(a, sb.toString());
                        f2 = 1.0f;
                    }
                }
            }
            return new SpsData(bits, bits2, bits3, unsignedExpGolombCodedInt3, i14, i13, f2, bit, bit2, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt2, z);
        }
        unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        z = false;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        bit2 = parsableNalUnitBitArray.readBit();
        int i15 = (2 - (bit2 ? 1 : 0)) * unsignedExpGolombCodedInt14;
        if (!bit2) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        i3 = unsignedExpGolombCodedInt13 * 16;
        i4 = i15 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt17 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt18 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i7 = 2 - (bit2 ? 1 : 0);
            } else {
                if (unsignedExpGolombCodedInt == 3) {
                    i5 = 1;
                    i6 = 1;
                } else {
                    i5 = 1;
                    i6 = 2;
                }
                if (unsignedExpGolombCodedInt == i5) {
                    i5 = 2;
                }
                i7 = (2 - (bit2 ? 1 : 0)) * i5;
                i8 = i6;
            }
            i3 -= (unsignedExpGolombCodedInt15 + unsignedExpGolombCodedInt16) * i8;
            i4 -= (unsignedExpGolombCodedInt17 + unsignedExpGolombCodedInt18) * i7;
        }
        int i16 = i4;
        int i17 = i3;
        float f4 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f;
        }
        return new SpsData(bits, bits2, bits3, unsignedExpGolombCodedInt3, i17, i16, f2, bit, bit2, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt2, z);
    }

    public static int unescapeStream(byte[] data, int limit) {
        int i;
        synchronized (e) {
            int iA = 0;
            int i2 = 0;
            while (iA < limit) {
                try {
                    iA = a(data, iA, limit);
                    if (iA < limit) {
                        int[] iArr = f;
                        if (iArr.length <= i2) {
                            f = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f[i2] = iA;
                        iA += 3;
                        i2++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i = limit - i2;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = f[i5] - i4;
                System.arraycopy(data, i4, data, i3, i6);
                int i7 = i3 + i6;
                int i8 = i7 + 1;
                data[i7] = 0;
                i3 = i8 + 1;
                data[i8] = 0;
                i4 += i6 + 3;
            }
            System.arraycopy(data, i4, data, i3, i - i3);
        }
        return i;
    }
}
