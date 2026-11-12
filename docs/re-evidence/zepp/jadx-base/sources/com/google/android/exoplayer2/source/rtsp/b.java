package com.google.android.exoplayer2.source.rtsp;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.source.rtsp.reader.DefaultRtpPayloadReaderFactory;
import com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Extractor {
    private final RtpPayloadReader a;
    private final int d;
    private ExtractorOutput g;
    private boolean h;

    @GuardedBy("lock")
    private boolean k;
    private final ParsableByteArray b = new ParsableByteArray(RtpPacket.MAX_SIZE);
    private final ParsableByteArray c = new ParsableByteArray();
    private final Object e = new Object();
    private final d f = new d();
    private volatile long i = C.TIME_UNSET;
    private volatile int j = -1;

    @GuardedBy("lock")
    private long l = C.TIME_UNSET;

    @GuardedBy("lock")
    private long m = C.TIME_UNSET;

    public b(RtpPayloadFormat payloadFormat, int trackId) {
        this.d = trackId;
        this.a = (RtpPayloadReader) Assertions.checkNotNull(new DefaultRtpPayloadReaderFactory().createPayloadReader(payloadFormat));
    }

    private static long a(long packetArrivalTimeMs) {
        return packetArrivalTimeMs - 30;
    }

    public boolean b() {
        return this.h;
    }

    public void c() {
        synchronized (this.e) {
            this.k = true;
        }
    }

    public void d(int firstSequenceNumber) {
        this.j = firstSequenceNumber;
    }

    public void e(long firstTimestamp) {
        this.i = firstTimestamp;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.a.createTracks(output, this.d);
        output.endTracks();
        output.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.g = output;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkNotNull(this.g);
        int i = input.read(this.b.getData(), 0, RtpPacket.MAX_SIZE);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.b.setPosition(0);
        this.b.setLimit(i);
        RtpPacket rtpPacket = RtpPacket.parse(this.b);
        if (rtpPacket == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jA = a(jElapsedRealtime);
        this.f.f(rtpPacket, jElapsedRealtime);
        RtpPacket rtpPacketG = this.f.g(jA);
        if (rtpPacketG == null) {
            return 0;
        }
        if (!this.h) {
            if (this.i == C.TIME_UNSET) {
                this.i = rtpPacketG.timestamp;
            }
            if (this.j == -1) {
                this.j = rtpPacketG.sequenceNumber;
            }
            this.a.onReceivingFirstPacket(this.i, this.j);
            this.h = true;
        }
        synchronized (this.e) {
            if (!this.k) {
                do {
                    this.c.reset(rtpPacketG.payloadData);
                    this.a.consume(this.c, rtpPacketG.timestamp, rtpPacketG.sequenceNumber, rtpPacketG.marker);
                    rtpPacketG = this.f.g(jA);
                } while (rtpPacketG != null);
            } else if (this.l != C.TIME_UNSET && this.m != C.TIME_UNSET) {
                this.f.i();
                this.a.seek(this.l, this.m);
                this.k = false;
                this.l = C.TIME_UNSET;
                this.m = C.TIME_UNSET;
            }
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long nextRtpTimestamp, long playbackStartTimeUs) {
        synchronized (this.e) {
            this.l = nextRtpTimestamp;
            this.m = playbackStartTimeUs;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }
}
