package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private final int a;

    @Nullable
    private RendererConfiguration c;
    private int d;
    private int e;

    @Nullable
    private SampleStream f;

    @Nullable
    private Format[] g;
    private long h;
    private long i;
    private boolean k;
    private boolean l;
    private final FormatHolder b = new FormatHolder();
    private long j = Long.MIN_VALUE;

    public BaseRenderer(int trackType) {
        this.a = trackType;
    }

    public final ExoPlaybackException createRendererException(Throwable cause, @Nullable Format format, int errorCode) {
        return createRendererException(cause, format, false, errorCode);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        Assertions.checkState(this.e == 1);
        this.b.clear();
        this.e = 0;
        this.f = null;
        this.g = null;
        this.k = false;
        onDisabled();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(RendererConfiguration configuration, Format[] formats, SampleStream stream, long positionUs, boolean joining, boolean mayRenderStartOfStream, long startPositionUs, long offsetUs) throws ExoPlaybackException {
        Assertions.checkState(this.e == 0);
        this.c = configuration;
        this.e = 1;
        this.i = positionUs;
        onEnabled(joining, mayRenderStartOfStream);
        replaceStream(formats, stream, startPositionUs, offsetUs);
        onPositionReset(positionUs, joining);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    public final RendererConfiguration getConfiguration() {
        return (RendererConfiguration) Assertions.checkNotNull(this.c);
    }

    public final FormatHolder getFormatHolder() {
        this.b.clear();
        return this.b;
    }

    public final int getIndex() {
        return this.d;
    }

    public final long getLastResetPositionUs() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long getReadingPositionUs() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.f;
    }

    public final Format[] getStreamFormats() {
        return (Format[]) Assertions.checkNotNull(this.g);
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.j == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.k;
    }

    public final boolean isSourceReady() {
        return hasReadStreamToEnd() ? this.k : ((SampleStream) Assertions.checkNotNull(this.f)).isReady();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
        ((SampleStream) Assertions.checkNotNull(this.f)).maybeThrowError();
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
    }

    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
    }

    public void onReset() {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() {
    }

    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) throws ExoPlaybackException {
    }

    public final int readSource(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        int data = ((SampleStream) Assertions.checkNotNull(this.f)).readData(formatHolder, buffer, readFlags);
        if (data == -4) {
            if (buffer.isEndOfStream()) {
                this.j = Long.MIN_VALUE;
                return this.k ? -4 : -3;
            }
            long j = buffer.timeUs + this.h;
            buffer.timeUs = j;
            this.j = Math.max(this.j, j);
        } else if (data == -5) {
            Format format = (Format) Assertions.checkNotNull(formatHolder.format);
            if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.h).build();
            }
        }
        return data;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(Format[] formats, SampleStream stream, long startPositionUs, long offsetUs) throws ExoPlaybackException {
        Assertions.checkState(!this.k);
        this.f = stream;
        if (this.j == Long.MIN_VALUE) {
            this.j = startPositionUs;
        }
        this.g = formats;
        this.h = offsetUs;
        onStreamChanged(formats, startPositionUs, offsetUs);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.checkState(this.e == 0);
        this.b.clear();
        onReset();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long positionUs) throws ExoPlaybackException {
        this.k = false;
        this.i = positionUs;
        this.j = positionUs;
        onPositionReset(positionUs, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.k = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setIndex(int index) {
        this.d = index;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
        p0.a(this, f, f2);
    }

    public int skipSource(long positionUs) {
        return ((SampleStream) Assertions.checkNotNull(this.f)).skipData(positionUs - this.h);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.checkState(this.e == 1);
        this.e = 2;
        onStarted();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        Assertions.checkState(this.e == 2);
        this.e = 1;
        onStopped();
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public final ExoPlaybackException createRendererException(Throwable cause, @Nullable Format format, boolean isRecoverable, int errorCode) {
        int i;
        if (format == null || this.l) {
            i = 4;
        } else {
            this.l = true;
            try {
                int iD = q0.d(supportsFormat(format));
                this.l = false;
                i = iD;
            } catch (ExoPlaybackException unused) {
                this.l = false;
                i = 4;
            } catch (Throwable th) {
                this.l = false;
                throw th;
            }
        }
        return ExoPlaybackException.createForRenderer(cause, getName(), getIndex(), format, i, isRecoverable, errorCode);
    }
}
