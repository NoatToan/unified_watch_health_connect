package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class a implements SampleStream {
    private final Format a;
    private long[] c;
    private boolean d;
    private EventStream e;
    private boolean f;
    private int g;
    private final EventMessageEncoder b = new EventMessageEncoder();
    private long h = C.TIME_UNSET;

    public a(EventStream eventStream, Format upstreamFormat, boolean eventStreamAppendable) {
        this.a = upstreamFormat;
        this.e = eventStream;
        this.c = eventStream.presentationTimesUs;
        c(eventStream, eventStreamAppendable);
    }

    public String a() {
        return this.e.id();
    }

    public void b(long positionUs) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.c, positionUs, true, false);
        this.g = iBinarySearchCeil;
        if (!(this.d && iBinarySearchCeil == this.c.length)) {
            positionUs = C.TIME_UNSET;
        }
        this.h = positionUs;
    }

    public void c(EventStream eventStream, boolean eventStreamAppendable) {
        int i = this.g;
        long j = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = eventStreamAppendable;
        this.e = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.c = jArr;
        long j2 = this.h;
        if (j2 != C.TIME_UNSET) {
            b(j2);
        } else if (j != C.TIME_UNSET) {
            this.g = Util.binarySearchCeil(jArr, j, false, false);
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        int i = this.g;
        boolean z = i == this.c.length;
        if (z && !this.d) {
            buffer.setFlags(4);
            return -4;
        }
        if ((readFlags & 2) != 0 || !this.f) {
            formatHolder.format = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        this.g = i + 1;
        byte[] bArrEncode = this.b.encode(this.e.events[i]);
        buffer.ensureSpaceForWrite(bArrEncode.length);
        buffer.data.put(bArrEncode);
        buffer.timeUs = this.c[i];
        buffer.setFlags(1);
        return -4;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long positionUs) {
        int iMax = Math.max(this.g, Util.binarySearchCeil(this.c, positionUs, true, false));
        int i = iMax - this.g;
        this.g = iMax;
        return i;
    }
}
