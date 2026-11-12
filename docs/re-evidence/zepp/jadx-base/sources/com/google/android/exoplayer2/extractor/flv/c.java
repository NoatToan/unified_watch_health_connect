package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.AvcConfig;

/* JADX INFO: loaded from: classes2.dex */
final class c extends TagPayloadReader {
    private static final int h = 7;
    private static final int i = 1;
    private static final int j = 5;
    private static final int k = 0;
    private static final int l = 1;
    private final ParsableByteArray b;
    private final ParsableByteArray c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public c(TrackOutput output) {
        super(output);
        this.b = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.c = new ParsableByteArray(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(ParsableByteArray data) throws TagPayloadReader.UnsupportedFormatException {
        int unsignedByte = data.readUnsignedByte();
        int i2 = (unsignedByte >> 4) & 15;
        int i3 = unsignedByte & 15;
        if (i3 == 7) {
            this.g = i2;
            return i2 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i3);
        throw new TagPayloadReader.UnsupportedFormatException(sb.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(ParsableByteArray data, long timeUs) throws ParserException {
        int unsignedByte = data.readUnsignedByte();
        long int24 = timeUs + (((long) data.readInt24()) * 1000);
        if (unsignedByte == 0 && !this.e) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(new byte[data.bytesLeft()]);
            data.readBytes(parsableByteArray.getData(), 0, data.bytesLeft());
            AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
            this.d = avcConfig.nalUnitLengthFieldLength;
            this.a.format(new Format.Builder().setSampleMimeType(MimeTypes.VIDEO_H264).setCodecs(avcConfig.codecs).setWidth(avcConfig.width).setHeight(avcConfig.height).setPixelWidthHeightRatio(avcConfig.pixelWidthAspectRatio).setInitializationData(avcConfig.initializationData).build());
            this.e = true;
            return false;
        }
        if (unsignedByte != 1 || !this.e) {
            return false;
        }
        int i2 = this.g == 1 ? 1 : 0;
        if (!this.f && i2 == 0) {
            return false;
        }
        byte[] data2 = this.c.getData();
        data2[0] = 0;
        data2[1] = 0;
        data2[2] = 0;
        int i3 = 4 - this.d;
        int i4 = 0;
        while (data.bytesLeft() > 0) {
            data.readBytes(this.c.getData(), i3, this.d);
            this.c.setPosition(0);
            int unsignedIntToInt = this.c.readUnsignedIntToInt();
            this.b.setPosition(0);
            this.a.sampleData(this.b, 4);
            this.a.sampleData(data, unsignedIntToInt);
            i4 = i4 + 4 + unsignedIntToInt;
        }
        this.a.sampleMetadata(int24, i2, i4, 0, null);
        this.f = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void d() {
        this.f = false;
    }
}
