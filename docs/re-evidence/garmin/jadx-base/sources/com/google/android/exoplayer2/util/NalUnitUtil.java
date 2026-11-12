package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class H265SpsData {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int i14, boolean z14, int i15, int i16, int[] iArr, int i17, int i18, int i19, int i24, float f14) {
            this.generalProfileSpace = i14;
            this.generalTierFlag = z14;
            this.generalProfileIdc = i15;
            this.generalProfileCompatibilityFlags = i16;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i17;
            this.seqParameterSetId = i18;
            this.width = i19;
            this.height = i24;
            this.pixelWidthHeightRatio = f14;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i14, int i15, boolean z14) {
            this.picParameterSetId = i14;
            this.seqParameterSetId = i15;
            this.bottomFieldPicOrderInFramePresentFlag = z14;
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
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i14, int i15, int i16, int i17, int i18, int i19, float f14, boolean z14, boolean z15, int i24, int i25, int i26, boolean z16) {
            this.profileIdc = i14;
            this.constraintsFlagsAndReservedZero2Bits = i15;
            this.levelIdc = i16;
            this.seqParameterSetId = i17;
            this.width = i18;
            this.height = i19;
            this.pixelWidthHeightRatio = f14;
            this.separateColorPlaneFlag = z14;
            this.frameMbsOnlyFlag = z15;
            this.frameNumLength = i24;
            this.picOrderCountType = i25;
            this.picOrderCntLsbLength = i26;
            this.deltaPicOrderAlwaysZeroFlag = z16;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i14 + 1;
            if (i16 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i17 = byteBuffer.get(i14) & UnsignedBytes.MAX_VALUE;
            if (i15 == 3) {
                if (i17 == 1 && (byteBuffer.get(i16) & Ascii.US) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i14 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i17 == 0) {
                i15++;
            }
            if (i17 != 0) {
                i15 = 0;
            }
            i14 = i16;
        }
    }

    public static int findNalUnit(byte[] bArr, int i14, int i15, boolean[] zArr) {
        int i16 = i15 - i14;
        Assertions.checkState(i16 >= 0);
        if (i16 == 0) {
            return i15;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i14 - 3;
        }
        if (i16 > 1 && zArr[1] && bArr[i14] == 1) {
            clearPrefixFlags(zArr);
            return i14 - 2;
        }
        if (i16 > 2 && zArr[2] && bArr[i14] == 0 && bArr[i14 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i14 - 1;
        }
        int i17 = i15 - 1;
        int i18 = i14 + 2;
        while (i18 < i17) {
            byte b14 = bArr[i18];
            if ((b14 & 254) == 0) {
                int i19 = i18 - 2;
                if (bArr[i19] == 0 && bArr[i18 - 1] == 0 && b14 == 1) {
                    clearPrefixFlags(zArr);
                    return i19;
                }
                i18 -= 2;
            }
            i18 += 3;
        }
        zArr[0] = i16 <= 2 ? !(i16 != 2 ? !(zArr[1] && bArr[i17] == 1) : !(zArr[2] && bArr[i15 + (-2)] == 0 && bArr[i17] == 1)) : bArr[i15 + (-3)] == 0 && bArr[i15 + (-2)] == 0 && bArr[i17] == 1;
        zArr[1] = i16 <= 1 ? zArr[2] && bArr[i17] == 0 : bArr[i15 + (-2)] == 0 && bArr[i17] == 0;
        zArr[2] = bArr[i17] == 0;
        return i15;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i14, int i15) {
        while (i14 < i15 - 2) {
            if (bArr[i14] == 0 && bArr[i14 + 1] == 0 && bArr[i14 + 2] == 3) {
                return i14;
            }
            i14++;
        }
        return i15;
    }

    public static int getH265NalUnitType(byte[] bArr, int i14) {
        return (bArr[i14 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i14) {
        return bArr[i14 + 3] & Ascii.US;
    }

    public static boolean isNalUnitSei(String str, byte b14) {
        return (MimeTypes.VIDEO_H264.equals(str) && (b14 & Ascii.US) == 6) || (MimeTypes.VIDEO_H265.equals(str) && ((b14 & 126) >> 1) == 39);
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i14, int i15) {
        return parseH265SpsNalUnitPayload(bArr, i14 + 2, i15);
    }

    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i14, int i15) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i14, i15);
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        int bits2 = parsableNalUnitBitArray.readBits(2);
        boolean bit = parsableNalUnitBitArray.readBit();
        int bits3 = parsableNalUnitBitArray.readBits(5);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i17 >= 32) {
                break;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i16 |= 1 << i17;
            }
            i17++;
        }
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = parsableNalUnitBitArray.readBits(8);
        }
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int i19 = 0;
        for (int i24 = 0; i24 < bits; i24++) {
            if (parsableNalUnitBitArray.readBit()) {
                i19 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i19 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i19);
        if (bits > 0) {
            parsableNalUnitBitArray.skipBits((8 - bits) * 2);
        }
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt2 == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 -= (unsignedExpGolombCodedInt5 + unsignedExpGolombCodedInt6) * ((unsignedExpGolombCodedInt2 == 1 || unsignedExpGolombCodedInt2 == 2) ? 2 : 1);
            unsignedExpGolombCodedInt4 -= (unsignedExpGolombCodedInt7 + unsignedExpGolombCodedInt8) * (unsignedExpGolombCodedInt2 == 1 ? 2 : 1);
        }
        int i25 = unsignedExpGolombCodedInt3;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i26 = parsableNalUnitBitArray.readBit() ? 0 : bits; i26 <= bits; i26++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipH265ScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            for (int i27 = 0; i27 < parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(); i27++) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt9 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f14 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits5 = parsableNalUnitBitArray.readBits(8);
                if (bits5 == 255) {
                    int bits6 = parsableNalUnitBitArray.readBits(16);
                    int bits7 = parsableNalUnitBitArray.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f14 = bits6 / bits7;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits5 < fArr.length) {
                        f14 = fArr[bits5];
                    } else {
                        v.e(46, bits5, "Unexpected aspect_ratio_idc value: ", TAG);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(4);
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(24);
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                unsignedExpGolombCodedInt4 *= 2;
            }
        }
        return new H265SpsData(bits2, bit, bits3, i16, iArr, bits4, unsignedExpGolombCodedInt, i25, unsignedExpGolombCodedInt4, f14);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i14, int i15) {
        return parsePpsNalUnitPayload(bArr, i14 + 1, i15);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i14, int i15) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i14, i15);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i14, int i15) {
        return parseSpsNalUnitPayload(bArr, i14 + 1, i15);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155  */
    /* JADX WARN: Code duplicated, block: B:83:0x015a  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x010b, please report this as an issue */
    /*  JADX ERROR: StackOverflowError in pass: IfRegionVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.getRegisterArgs(InsnNode.java:200)
        	at jadx.core.dex.regions.conditions.IfCondition.getRegisterArgs(IfCondition.java:259)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:97)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        */
    public static com.google.android.exoplayer2.util.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.NalUnitUtil.parseSpsNalUnitPayload(byte[], int, int):com.google.android.exoplayer2.util.NalUnitUtil$SpsData");
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = 0;
            while (i15 < 6) {
                int i16 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i14 << 1) + 4));
                    if (i14 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i17 = 0; i17 < iMin; i17++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i14 == 3) {
                    i16 = 3;
                }
                i15 += i16;
            }
        }
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i14) {
        int signedExpGolombCodedInt = 8;
        int i15 = 8;
        for (int i16 = 0; i16 < i14; i16++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i15) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i15 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean bit = false;
        int i14 = 0;
        for (int i15 = 0; i15 < unsignedExpGolombCodedInt; i15++) {
            if (i15 != 0) {
                bit = parsableNalUnitBitArray.readBit();
            }
            if (bit) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i16 = 0; i16 <= i14; i16++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                }
            } else {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int i17 = unsignedExpGolombCodedInt2 + unsignedExpGolombCodedInt3;
                for (int i18 = 0; i18 < unsignedExpGolombCodedInt2; i18++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                for (int i19 = 0; i19 < unsignedExpGolombCodedInt3; i19++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                i14 = i17;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i14) {
        int i15;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i16 = 0;
            while (iFindNextUnescapeIndex < i14) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i14);
                    if (iFindNextUnescapeIndex < i14) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i16) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i16] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i16++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            i15 = i14 - i16;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                int i24 = scratchEscapePositions[i19] - i18;
                System.arraycopy(bArr, i18, bArr, i17, i24);
                int i25 = i17 + i24;
                int i26 = i25 + 1;
                bArr[i25] = 0;
                i17 = i25 + 2;
                bArr[i26] = 0;
                i18 += i24 + 3;
            }
            System.arraycopy(bArr, i18, bArr, i17, i15 - i17);
        }
        return i15;
    }
}
