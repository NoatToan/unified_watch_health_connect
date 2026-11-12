package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class RtpAc3Reader implements RtpPayloadReader {
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 3;
    private static final int l = 2;
    private final RtpPayloadFormat a;
    private TrackOutput c;
    private int d;
    private long f;
    private long g;
    private final ParsableBitArray b = new ParsableBitArray();
    private long e = C.TIME_UNSET;

    public RtpAc3Reader(RtpPayloadFormat payloadFormat) {
        this.a = payloadFormat;
    }

    private void a() {
        if (this.d > 0) {
            b();
        }
    }

    private void b() {
        ((TrackOutput) Util.castNonNull(this.c)).sampleMetadata(this.f, 1, this.d, 0, null);
        this.d = 0;
    }

    private void c(ParsableByteArray data, boolean isFrameBoundary, int frameType, long sampleTimeUs) {
        int iBytesLeft = data.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.c)).sampleData(data, iBytesLeft);
        this.d += iBytesLeft;
        this.f = sampleTimeUs;
        if (isFrameBoundary && frameType == 3) {
            b();
        }
    }

    private void d(ParsableByteArray data, int numOfFrames, long sampleTimeUs) {
        this.b.reset(data.getData());
        this.b.skipBytes(2);
        for (int i2 = 0; i2 < numOfFrames; i2++) {
            Ac3Util.SyncFrameInfo ac3SyncframeInfo = Ac3Util.parseAc3SyncframeInfo(this.b);
            ((TrackOutput) Assertions.checkNotNull(this.c)).sampleData(data, ac3SyncframeInfo.frameSize);
            ((TrackOutput) Util.castNonNull(this.c)).sampleMetadata(sampleTimeUs, 1, ac3SyncframeInfo.frameSize, 0, null);
            sampleTimeUs += ((long) (ac3SyncframeInfo.sampleCount / ac3SyncframeInfo.sampleRate)) * 1000000;
            this.b.skipBytes(ac3SyncframeInfo.frameSize);
        }
    }

    private void e(ParsableByteArray data, long sampleTimeUs) {
        int iBytesLeft = data.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.c)).sampleData(data, iBytesLeft);
        ((TrackOutput) Util.castNonNull(this.c)).sampleMetadata(sampleTimeUs, 1, iBytesLeft, 0, null);
    }

    private static long f(long startTimeOffsetUs, long rtpTimestamp, long firstReceivedRtpTimestamp, int sampleRate) {
        return startTimeOffsetUs + Util.scaleLargeTimestamp(rtpTimestamp - firstReceivedRtpTimestamp, 1000000L, sampleRate);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray data, long timestamp, int sequenceNumber, boolean rtpMarker) {
        int unsignedByte = data.readUnsignedByte() & 3;
        int unsignedByte2 = data.readUnsignedByte() & 255;
        long jF = f(this.g, timestamp, this.e, this.a.clockRate);
        if (unsignedByte == 0) {
            a();
            if (unsignedByte2 == 1) {
                e(data, jF);
                return;
            } else {
                d(data, unsignedByte2, jF);
                return;
            }
        }
        if (unsignedByte == 1 || unsignedByte == 2) {
            a();
        } else if (unsignedByte != 3) {
            throw new IllegalArgumentException(String.valueOf(unsignedByte));
        }
        c(data, rtpMarker, unsignedByte, jF);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int trackId) {
        TrackOutput trackOutputTrack = extractorOutput.track(trackId, 1);
        this.c = trackOutputTrack;
        trackOutputTrack.format(this.a.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long timestamp, int sequenceNumber) {
        Assertions.checkState(this.e == C.TIME_UNSET);
        this.e = timestamp;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long nextRtpTimestamp, long timeUs) {
        this.e = nextRtpTimestamp;
        this.g = timeUs;
    }
}
