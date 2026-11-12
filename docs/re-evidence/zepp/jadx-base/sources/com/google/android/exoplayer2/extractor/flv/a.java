package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
final class a extends TagPayloadReader {
    private static final int e = 2;
    private static final int f = 7;
    private static final int g = 8;
    private static final int h = 10;
    private static final int i = 0;
    private static final int j = 1;
    private static final int[] k = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public a(TrackOutput output) {
        super(output);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(ParsableByteArray data) throws TagPayloadReader.UnsupportedFormatException {
        if (this.b) {
            data.skipBytes(1);
        } else {
            int unsignedByte = data.readUnsignedByte();
            int i2 = (unsignedByte >> 4) & 15;
            this.d = i2;
            if (i2 == 2) {
                this.a.format(new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_MPEG).setChannelCount(1).setSampleRate(k[(unsignedByte >> 2) & 3]).build());
                this.c = true;
            } else if (i2 == 7 || i2 == 8) {
                this.a.format(new Format.Builder().setSampleMimeType(i2 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).setChannelCount(1).setSampleRate(8000).build());
                this.c = true;
            } else if (i2 != 10) {
                int i3 = this.d;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i3);
                throw new TagPayloadReader.UnsupportedFormatException(sb.toString());
            }
            this.b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(ParsableByteArray data, long timeUs) throws ParserException {
        if (this.d == 2) {
            int iBytesLeft = data.bytesLeft();
            this.a.sampleData(data, iBytesLeft);
            this.a.sampleMetadata(timeUs, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = data.readUnsignedByte();
        if (unsignedByte != 0 || this.c) {
            if (this.d == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = data.bytesLeft();
            this.a.sampleData(data, iBytesLeft2);
            this.a.sampleMetadata(timeUs, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = data.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        data.readBytes(bArr, 0, iBytesLeft3);
        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
        this.a.format(new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.codecs).setChannelCount(audioSpecificConfig.channelCount).setSampleRate(audioSpecificConfig.sampleRateHz).setInitializationData(Collections.singletonList(bArr)).build());
        this.c = true;
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void d() {
    }
}
