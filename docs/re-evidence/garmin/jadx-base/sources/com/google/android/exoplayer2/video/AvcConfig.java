package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class AvcConfig {
    public final String codecs;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i14, int i15, int i16, float f14, String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i14;
        this.width = i15;
        this.height = i16;
        this.pixelWidthHeightRatio = f14;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) {
        float f14;
        String strBuildAvcCodecString;
        int i14;
        int i15;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i16 = 0; i16 < unsignedByte2; i16++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i17 = 0; i17 < unsignedByte3; i17++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i18 = spsNalUnit.width;
                int i19 = spsNalUnit.height;
                f14 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i14 = i18;
                i15 = i19;
            } else {
                f14 = 1.0f;
                strBuildAvcCodecString = null;
                i14 = -1;
                i15 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i14, i15, f14, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e4);
        }
    }
}
