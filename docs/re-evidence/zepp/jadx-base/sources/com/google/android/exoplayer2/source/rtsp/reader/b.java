package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
final class b implements RtpPayloadReader {
    private static final String j = "RtpH264Reader";
    private static final long k = 90000;
    private static final int l = 2;
    private static final int m = 24;
    private static final int n = 28;
    private static final int o = 5;
    private final RtpPayloadFormat c;
    private TrackOutput d;
    private int e;
    private int h;
    private long i;
    private final ParsableByteArray b = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    private final ParsableByteArray a = new ParsableByteArray();
    private long f = C.TIME_UNSET;
    private int g = -1;

    public b(RtpPayloadFormat payloadFormat) {
        this.c = payloadFormat;
    }

    private static int a(int nalType) {
        return nalType == 5 ? 1 : 0;
    }

    @RequiresNonNull({"trackOutput"})
    private void b(ParsableByteArray data, int packetSequenceNumber) {
        byte b = data.getData()[0];
        byte b2 = data.getData()[1];
        int i = (b & MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT) | (b2 & 31);
        boolean z = (b2 & 128) > 0;
        boolean z2 = (b2 & 64) > 0;
        if (z) {
            this.h += f();
            data.getData()[1] = (byte) i;
            this.a.reset(data.getData());
            this.a.setPosition(1);
        } else {
            int i2 = (this.g + 1) % 65535;
            if (packetSequenceNumber != i2) {
                Log.w(j, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i2), Integer.valueOf(packetSequenceNumber)));
                return;
            } else {
                this.a.reset(data.getData());
                this.a.setPosition(2);
            }
        }
        int iBytesLeft = this.a.bytesLeft();
        this.d.sampleData(this.a, iBytesLeft);
        this.h += iBytesLeft;
        if (z2) {
            this.e = a(i & 31);
        }
    }

    @RequiresNonNull({"trackOutput"})
    private void c(ParsableByteArray data) {
        int iBytesLeft = data.bytesLeft();
        this.h += f();
        this.d.sampleData(data, iBytesLeft);
        this.h += iBytesLeft;
        this.e = a(data.getData()[0] & 31);
    }

    @RequiresNonNull({"trackOutput"})
    private void d(ParsableByteArray data) {
        data.readUnsignedByte();
        while (data.bytesLeft() > 4) {
            int unsignedShort = data.readUnsignedShort();
            this.h += f();
            this.d.sampleData(data, unsignedShort);
            this.h += unsignedShort;
        }
        this.e = 0;
    }

    private static long e(long startTimeOffsetUs, long rtpTimestamp, long firstReceivedRtpTimestamp) {
        return startTimeOffsetUs + Util.scaleLargeTimestamp(rtpTimestamp - firstReceivedRtpTimestamp, 1000000L, 90000L);
    }

    private int f() {
        this.b.setPosition(0);
        int iBytesLeft = this.b.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.d)).sampleData(this.b, iBytesLeft);
        return iBytesLeft;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray data, long timestamp, int sequenceNumber, boolean rtpMarker) throws ParserException {
        try {
            int i = data.getData()[0] & 31;
            Assertions.checkStateNotNull(this.d);
            if (i > 0 && i < 24) {
                c(data);
            } else if (i == 24) {
                d(data);
            } else {
                if (i != 28) {
                    throw ParserException.createForMalformedManifest(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i)), null);
                }
                b(data, sequenceNumber);
            }
            if (rtpMarker) {
                if (this.f == C.TIME_UNSET) {
                    this.f = timestamp;
                }
                this.d.sampleMetadata(e(this.i, timestamp, this.f), this.e, this.h, 0, null);
                this.h = 0;
            }
            this.g = sequenceNumber;
        } catch (IndexOutOfBoundsException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int trackId) {
        TrackOutput trackOutputTrack = extractorOutput.track(trackId, 2);
        this.d = trackOutputTrack;
        ((TrackOutput) Util.castNonNull(trackOutputTrack)).format(this.c.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long timestamp, int sequenceNumber) {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long nextRtpTimestamp, long timeUs) {
        this.f = nextRtpTimestamp;
        this.h = 0;
        this.i = timeUs;
    }
}
