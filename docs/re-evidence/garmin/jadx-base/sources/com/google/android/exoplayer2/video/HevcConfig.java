package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final String codecs;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i14, int i15, int i16, float f14, String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i14;
        this.width = i15;
        this.height = i16;
        this.pixelWidthHeightRatio = f14;
        this.codecs = str;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) {
        boolean z14;
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                z14 = true;
                if (i15 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i17 = 0; i17 < unsignedShort; i17++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i16 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i15++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i16];
            int i18 = -1;
            int i19 = -1;
            float f14 = 1.0f;
            String strBuildHevcCodecString = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 127;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i26 = i14;
                while (i26 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z15 = z14;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i27 = unsignedByte;
                    System.arraycopy(bArr2, i14, bArr, i25, bArr2.length);
                    int length = i25 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i26 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        i18 = h265SpsNalUnit.width;
                        i19 = h265SpsNalUnit.height;
                        f14 = h265SpsNalUnit.pixelWidthHeightRatio;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                    }
                    i25 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i26++;
                    z14 = z15;
                    unsignedByte = i27;
                    unsignedByte2 = unsignedByte2;
                    i14 = 0;
                }
                i24++;
                i14 = 0;
            }
            return new HevcConfig(i16 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i18, i19, f14, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e4);
        }
    }
}
