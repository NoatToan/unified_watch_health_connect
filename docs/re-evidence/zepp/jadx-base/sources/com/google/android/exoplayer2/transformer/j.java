package com.google.android.exoplayer2.transformer;

import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
abstract class j extends BaseRenderer {
    public final b m;
    public final k n;
    public final g o;
    public boolean p;

    public j(int trackType, b muxerWrapper, k mediaClock, g transformation) {
        super(trackType);
        this.m = muxerWrapper;
        this.n = mediaClock;
        this.o = transformation;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final MediaClock getMediaClock() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return isSourceReady();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onEnabled(boolean joining, boolean mayRenderStartOfStream) {
        this.m.e();
        this.n.a(getTrackType(), 0L);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStarted() {
        this.p = true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void onStopped() {
        this.p = false;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
        String str = format.sampleMimeType;
        if (MimeTypes.getTrackType(str) != getTrackType()) {
            return q0.a(0);
        }
        return this.m.g(str) ? q0.a(4) : q0.a(1);
    }
}
