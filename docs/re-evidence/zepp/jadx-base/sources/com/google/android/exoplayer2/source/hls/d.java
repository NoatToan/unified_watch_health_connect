package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class d implements SampleStream {
    private final int a;
    private final HlsSampleStreamWrapper b;
    private int c = -1;

    public d(HlsSampleStreamWrapper sampleStreamWrapper, int trackGroupIndex) {
        this.b = sampleStreamWrapper;
        this.a = trackGroupIndex;
    }

    private boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public void a() {
        Assertions.checkArgument(this.c == -1);
        this.c = this.b.d(this.a);
    }

    public void c() {
        if (this.c != -1) {
            this.b.U(this.a);
            this.c = -1;
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return this.c == -3 || (b() && this.b.w(this.c));
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
        int i = this.c;
        if (i == -2) {
            throw new SampleQueueMappingException(this.b.getTrackGroups().get(this.a).getFormat(0).sampleMimeType);
        }
        if (i == -1) {
            this.b.z();
        } else if (i != -3) {
            this.b.A(i);
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        if (this.c == -3) {
            buffer.addFlag(4);
            return -4;
        }
        if (b()) {
            return this.b.J(this.c, formatHolder, buffer, readFlags);
        }
        return -3;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long positionUs) {
        if (b()) {
            return this.b.T(this.c, positionUs);
        }
        return 0;
    }
}
