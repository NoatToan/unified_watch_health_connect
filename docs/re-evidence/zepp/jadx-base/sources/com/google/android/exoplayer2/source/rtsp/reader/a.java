package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
final class a implements RtpPayloadReader {
    private static final String j = "AAC-lbr";
    private static final String k = "AAC-hbr";
    private static final String l = "RtpAacReader";
    private final RtpPayloadFormat a;
    private final ParsableBitArray b = new ParsableBitArray();
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private long g;
    private TrackOutput h;
    private long i;

    public a(RtpPayloadFormat payloadFormat) {
        this.a = payloadFormat;
        this.c = payloadFormat.clockRate;
        String str = (String) Assertions.checkNotNull(payloadFormat.fmtpParameters.get("mode"));
        if (Ascii.equalsIgnoreCase(str, k)) {
            this.d = 13;
            this.e = 3;
        } else {
            if (!Ascii.equalsIgnoreCase(str, j)) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }

    private static void a(TrackOutput trackOutput, long sampleTimeUs, int size) {
        trackOutput.sampleMetadata(sampleTimeUs, 1, size, 0, null);
    }

    private static long b(long startTimeOffsetUs, long rtpTimestamp, long firstReceivedRtpTimestamp, int sampleRate) {
        return startTimeOffsetUs + Util.scaleLargeTimestamp(rtpTimestamp - firstReceivedRtpTimestamp, 1000000L, sampleRate);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray data, long timestamp, int sequenceNumber, boolean rtpMarker) {
        Assertions.checkNotNull(this.h);
        short s = data.readShort();
        int i = s / this.f;
        long jB = b(this.i, timestamp, this.g, this.c);
        this.b.reset(data);
        if (i == 1) {
            int bits = this.b.readBits(this.d);
            this.b.skipBits(this.e);
            this.h.sampleData(data, data.bytesLeft());
            if (rtpMarker) {
                a(this.h, jB, bits);
                return;
            }
            return;
        }
        data.skipBytes((s + 7) / 8);
        for (int i2 = 0; i2 < i; i2++) {
            int bits2 = this.b.readBits(this.d);
            this.b.skipBits(this.e);
            this.h.sampleData(data, bits2);
            a(this.h, jB, bits2);
            jB += Util.scaleLargeTimestamp(i, 1000000L, this.c);
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int trackId) {
        TrackOutput trackOutputTrack = extractorOutput.track(trackId, 1);
        this.h = trackOutputTrack;
        trackOutputTrack.format(this.a.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long timestamp, int sequenceNumber) {
        this.g = timestamp;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long nextRtpTimestamp, long timeUs) {
        this.g = nextRtpTimestamp;
        this.i = timeUs;
    }
}
