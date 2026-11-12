package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class g extends IOException {
    public final MediaChunk a;
    public final long b;
    public final long c;

    public g(MediaChunk mediaChunk, long lastAcceptedSampleTimeUs, long rejectedSampleTimeUs) {
        long jUsToMs = C.usToMs(rejectedSampleTimeUs);
        long j = mediaChunk.startTimeUs;
        long j2 = mediaChunk.endTimeUs;
        StringBuilder sb = new StringBuilder(103);
        sb.append("Unexpected sample timestamp: ");
        sb.append(jUsToMs);
        sb.append(" in chunk [");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        super(sb.toString());
        this.a = mediaChunk;
        this.b = lastAcceptedSampleTimeUs;
        this.c = rejectedSampleTimeUs;
    }
}
