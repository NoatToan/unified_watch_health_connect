package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AvcConfig {

    @Nullable
    public final String codecs;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthAspectRatio;
    public final int width;

    private AvcConfig(List<byte[]> initializationData, int nalUnitLengthFieldLength, int width, int height, float pixelWidthAspectRatio, @Nullable String codecs) {
        this.initializationData = initializationData;
        this.nalUnitLengthFieldLength = nalUnitLengthFieldLength;
        this.width = width;
        this.height = height;
        this.pixelWidthAspectRatio = pixelWidthAspectRatio;
        this.codecs = codecs;
    }

    private static byte[] a(ParsableByteArray data) {
        int unsignedShort = data.readUnsignedShort();
        int position = data.getPosition();
        data.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(data.getData(), position, unsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray data) throws ParserException {
        String strBuildAvcCodecString;
        int i;
        float f;
        try {
            data.skipBytes(4);
            int unsignedByte = (data.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = data.readUnsignedByte() & 31;
            for (int i2 = 0; i2 < unsignedByte2; i2++) {
                arrayList.add(a(data));
            }
            int unsignedByte3 = data.readUnsignedByte();
            for (int i3 = 0; i3 < unsignedByte3; i3++) {
                arrayList.add(a(data));
            }
            int i4 = -1;
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i5 = spsNalUnit.width;
                int i6 = spsNalUnit.height;
                float f2 = spsNalUnit.pixelWidthAspectRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i4 = i5;
                i = i6;
                f = f2;
            } else {
                strBuildAvcCodecString = null;
                i = -1;
                f = 1.0f;
            }
            return new AvcConfig(arrayList, unsignedByte, i4, i, f, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
