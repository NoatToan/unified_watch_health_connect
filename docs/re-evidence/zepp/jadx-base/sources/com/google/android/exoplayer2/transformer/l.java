package com.google.android.exoplayer2.transformer;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
final class l extends j {
    private static final String v = "TransformerVideoRenderer";
    private final DecoderInputBuffer q;

    @Nullable
    private c r;
    private boolean s;
    private boolean t;
    private boolean u;

    public l(b muxerWrapper, k mediaClock, g transformation) {
        super(2, muxerWrapper, mediaClock, transformation);
        this.q = new DecoderInputBuffer(2);
    }

    private boolean a() {
        this.q.clear();
        int source = readSource(getFormatHolder(), this.q, 0);
        if (source == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (source == -3) {
            return false;
        }
        if (this.q.isEndOfStream()) {
            this.u = true;
            this.m.c(getTrackType());
            return false;
        }
        this.n.a(getTrackType(), this.q.timeUs);
        ((ByteBuffer) Assertions.checkNotNull(this.q.data)).flip();
        c cVar = this.r;
        if (cVar != null) {
            cVar.a(this.q);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return v;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.u;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) {
        boolean z;
        if (!this.p || isEnded()) {
            return;
        }
        if (!this.s) {
            FormatHolder formatHolder = getFormatHolder();
            if (readSource(formatHolder, this.q, 2) != -5) {
                return;
            }
            Format format = (Format) Assertions.checkNotNull(formatHolder.format);
            this.s = true;
            if (this.o.c) {
                this.r = new d(format);
            }
            this.m.a(format);
        }
        do {
            if (!this.t && !a()) {
                return;
            }
            b bVar = this.m;
            int trackType = getTrackType();
            DecoderInputBuffer decoderInputBuffer = this.q;
            z = !bVar.h(trackType, decoderInputBuffer.data, decoderInputBuffer.isKeyFrame(), this.q.timeUs);
            this.t = z;
        } while (!z);
    }
}
