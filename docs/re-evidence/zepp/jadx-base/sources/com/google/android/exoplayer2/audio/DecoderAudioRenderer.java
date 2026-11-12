package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {
    private static final String H = "DecoderAudioRenderer";
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private boolean A;
    private boolean B;
    private long C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private final AudioRendererEventListener.EventDispatcher m;
    private final AudioSink n;
    private final DecoderInputBuffer o;
    private DecoderCounters p;
    private Format q;
    private int r;
    private int s;
    private boolean t;

    @Nullable
    private T u;

    @Nullable
    private DecoderInputBuffer v;

    @Nullable
    private SimpleOutputBuffer w;

    @Nullable
    private DrmSession x;

    @Nullable
    private DrmSession y;
    private int z;

    public final class b implements AudioSink.Listener {
        private b() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onAudioSinkError(Exception audioSinkError) {
            Log.e(DecoderAudioRenderer.H, "Audio sink error", audioSinkError);
            DecoderAudioRenderer.this.m.audioSinkError(audioSinkError);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public /* synthetic */ void onOffloadBufferEmptying() {
            c.b(this);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public /* synthetic */ void onOffloadBufferFull(long j) {
            c.c(this, j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionAdvancing(long playoutStartSystemTimeMs) {
            DecoderAudioRenderer.this.m.positionAdvancing(playoutStartSystemTimeMs);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            DecoderAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
            DecoderAudioRenderer.this.m.skipSilenceEnabledChanged(skipSilenceEnabled);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
            DecoderAudioRenderer.this.m.underrun(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
        }
    }

    public DecoderAudioRenderer() {
        this((Handler) null, (AudioRendererEventListener) null, new AudioProcessor[0]);
    }

    private boolean b() throws ExoPlaybackException, AudioSink.WriteException, AudioSink.InitializationException, AudioSink.ConfigurationException, DecoderException {
        if (this.w == null) {
            SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) this.u.dequeueOutputBuffer();
            this.w = simpleOutputBuffer;
            if (simpleOutputBuffer == null) {
                return false;
            }
            int i = simpleOutputBuffer.skippedOutputBufferCount;
            if (i > 0) {
                this.p.skippedOutputBufferCount += i;
                this.n.handleDiscontinuity();
            }
        }
        if (this.w.isEndOfStream()) {
            if (this.z == 2) {
                releaseDecoder();
                d();
                this.B = true;
            } else {
                this.w.release();
                this.w = null;
                try {
                    e();
                } catch (AudioSink.WriteException e) {
                    throw createRendererException(e, e.format, e.isRecoverable, 5002);
                }
            }
            return false;
        }
        if (this.B) {
            this.n.configure(getOutputFormat(this.u).buildUpon().setEncoderDelay(this.r).setEncoderPadding(this.s).build(), 0, null);
            this.B = false;
        }
        AudioSink audioSink = this.n;
        SimpleOutputBuffer simpleOutputBuffer2 = this.w;
        if (!audioSink.handleBuffer(simpleOutputBuffer2.data, simpleOutputBuffer2.timeUs, 1)) {
            return false;
        }
        this.p.renderedOutputBufferCount++;
        this.w.release();
        this.w = null;
        return true;
    }

    private boolean c() throws ExoPlaybackException, DecoderException {
        T t = this.u;
        if (t == null || this.z == 2 || this.F) {
            return false;
        }
        if (this.v == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) t.dequeueInputBuffer();
            this.v = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.z == 1) {
            this.v.setFlags(4);
            this.u.queueInputBuffer(this.v);
            this.v = null;
            this.z = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.v, 0);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4) {
            if (source == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.v.isEndOfStream()) {
            this.F = true;
            this.u.queueInputBuffer(this.v);
            this.v = null;
            return false;
        }
        this.v.flip();
        onQueueInputBuffer(this.v);
        this.u.queueInputBuffer(this.v);
        this.A = true;
        this.p.inputBufferCount++;
        this.v = null;
        return true;
    }

    private void d() throws ExoPlaybackException {
        if (this.u != null) {
            return;
        }
        f(this.y);
        ExoMediaCrypto mediaCrypto = null;
        DrmSession drmSession = this.x;
        if (drmSession != null && (mediaCrypto = drmSession.getMediaCrypto()) == null && this.x.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            TraceUtil.beginSection("createAudioDecoder");
            this.u = (T) createDecoder(this.q, mediaCrypto);
            TraceUtil.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.m.decoderInitialized(this.u.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.p.decoderInitCount++;
        } catch (DecoderException e) {
            Log.e(H, "Audio codec error", e);
            this.m.audioCodecError(e);
            throw createRendererException(e, this.q, 4001);
        } catch (OutOfMemoryError e2) {
            throw createRendererException(e2, this.q, 4001);
        }
    }

    private void e() throws AudioSink.WriteException {
        this.G = true;
        this.n.playToEndOfStream();
    }

    private void f(@Nullable DrmSession session) {
        com.google.android.exoplayer2.drm.g.b(this.x, session);
        this.x = session;
    }

    private void flushDecoder() throws ExoPlaybackException {
        if (this.z != 0) {
            releaseDecoder();
            d();
            return;
        }
        this.v = null;
        SimpleOutputBuffer simpleOutputBuffer = this.w;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.w = null;
        }
        this.u.flush();
        this.A = false;
    }

    private void g(@Nullable DrmSession session) {
        com.google.android.exoplayer2.drm.g.b(this.y, session);
        this.y = session;
    }

    private void h() {
        long currentPositionUs = this.n.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.E) {
                currentPositionUs = Math.max(this.C, currentPositionUs);
            }
            this.C = currentPositionUs;
            this.E = false;
        }
    }

    private void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        g(formatHolder.drmSession);
        Format format2 = this.q;
        this.q = format;
        this.r = format.encoderDelay;
        this.s = format.encoderPadding;
        T t = this.u;
        if (t == null) {
            d();
            this.m.inputFormatChanged(this.q, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = this.y != this.x ? new DecoderReuseEvaluation(t.getName(), format2, format, 0, 128) : canReuseDecoder(t.getName(), format2, format);
        if (decoderReuseEvaluation.result == 0) {
            if (this.A) {
                this.z = 1;
            } else {
                releaseDecoder();
                d();
                this.B = true;
            }
        }
        this.m.inputFormatChanged(this.q, decoderReuseEvaluation);
    }

    private void releaseDecoder() {
        this.v = null;
        this.w = null;
        this.z = 0;
        this.A = false;
        T t = this.u;
        if (t != null) {
            this.p.decoderReleaseCount++;
            t.release();
            this.m.decoderReleased(this.u.getName());
            this.u = null;
        }
        f(null);
    }

    public DecoderReuseEvaluation canReuseDecoder(String decoderName, Format oldFormat, Format newFormat) {
        return new DecoderReuseEvaluation(decoderName, oldFormat, newFormat, 0, 1);
    }

    public abstract T createDecoder(Format format, @Nullable ExoMediaCrypto mediaCrypto) throws DecoderException;

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean enableKeepAudioTrackOnSeek) {
        this.t = enableKeepAudioTrackOnSeek;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return this;
    }

    public abstract Format getOutputFormat(T decoder);

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.n.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            h();
        }
        return this.C;
    }

    public final int getSinkFormatSupport(Format format) {
        return this.n.getFormatSupport(format);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
        if (messageType == 2) {
            this.n.setVolume(((Float) message).floatValue());
            return;
        }
        if (messageType == 3) {
            this.n.setAudioAttributes((AudioAttributes) message);
            return;
        }
        if (messageType == 5) {
            this.n.setAuxEffectInfo((AuxEffectInfo) message);
        } else if (messageType == 101) {
            this.n.setSkipSilenceEnabled(((Boolean) message).booleanValue());
        } else if (messageType != 102) {
            super.handleMessage(messageType, message);
        } else {
            this.n.setAudioSessionId(((Integer) message).intValue());
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.G && this.n.isEnded();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return this.n.hasPendingData() || (this.q != null && (isSourceReady() || this.w != null));
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.q = null;
        this.B = true;
        try {
            g(null);
            releaseDecoder();
            this.n.reset();
        } finally {
            this.m.disabled(this.p);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.p = decoderCounters;
        this.m.enabled(decoderCounters);
        if (getConfiguration().tunneling) {
            this.n.enableTunnelingV21();
        } else {
            this.n.disableTunneling();
        }
    }

    @CallSuper
    public void onPositionDiscontinuity() {
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
        if (this.t) {
            this.n.experimentalFlushWithoutAudioTrackRelease();
        } else {
            this.n.flush();
        }
        this.C = positionUs;
        this.D = true;
        this.E = true;
        this.F = false;
        this.G = false;
        if (this.u != null) {
            flushDecoder();
        }
    }

    public void onQueueInputBuffer(DecoderInputBuffer buffer) {
        if (!this.D || buffer.isDecodeOnly()) {
            return;
        }
        if (Math.abs(buffer.timeUs - this.C) > 500000) {
            this.C = buffer.timeUs;
        }
        this.D = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        this.n.play();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        h();
        this.n.pause();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
        if (this.G) {
            try {
                this.n.playToEndOfStream();
                return;
            } catch (AudioSink.WriteException e) {
                throw createRendererException(e, e.format, e.isRecoverable, 5002);
            }
        }
        if (this.q == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.o.clear();
            int source = readSource(formatHolder, this.o, 2);
            if (source != -5) {
                if (source == -4) {
                    Assertions.checkState(this.o.isEndOfStream());
                    this.F = true;
                    try {
                        e();
                        return;
                    } catch (AudioSink.WriteException e2) {
                        throw createRendererException(e2, null, 5002);
                    }
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        d();
        if (this.u != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (b()) {
                }
                while (c()) {
                }
                TraceUtil.endSection();
                this.p.ensureUpdated();
            } catch (AudioSink.ConfigurationException e3) {
                throw createRendererException(e3, e3.format, 5001);
            } catch (AudioSink.InitializationException e4) {
                throw createRendererException(e4, e4.format, e4.isRecoverable, 5001);
            } catch (AudioSink.WriteException e5) {
                throw createRendererException(e5, e5.format, e5.isRecoverable, 5002);
            } catch (DecoderException e6) {
                Log.e(H, "Audio codec error", e6);
                this.m.audioCodecError(e6);
                throw createRendererException(e6, this.q, PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.n.setPlaybackParameters(playbackParameters);
    }

    public final boolean sinkSupportsFormat(Format format) {
        return this.n.supportsFormat(format);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
        if (!MimeTypes.isAudio(format.sampleMimeType)) {
            return q0.a(0);
        }
        int iSupportsFormatInternal = supportsFormatInternal(format);
        if (iSupportsFormatInternal <= 2) {
            return q0.a(iSupportsFormatInternal);
        }
        return q0.b(iSupportsFormatInternal, 8, Util.SDK_INT >= 21 ? 32 : 0);
    }

    public abstract int supportsFormatInternal(Format format);

    public DecoderAudioRenderer(@Nullable Handler eventHandler, @Nullable AudioRendererEventListener eventListener, AudioProcessor... audioProcessors) {
        this(eventHandler, eventListener, null, audioProcessors);
    }

    public DecoderAudioRenderer(@Nullable Handler eventHandler, @Nullable AudioRendererEventListener eventListener, @Nullable AudioCapabilities audioCapabilities, AudioProcessor... audioProcessors) {
        this(eventHandler, eventListener, new DefaultAudioSink(audioCapabilities, audioProcessors));
    }

    public DecoderAudioRenderer(@Nullable Handler eventHandler, @Nullable AudioRendererEventListener eventListener, AudioSink audioSink) {
        super(1);
        this.m = new AudioRendererEventListener.EventDispatcher(eventHandler, eventListener);
        this.n = audioSink;
        audioSink.setListener(new b());
        this.o = DecoderInputBuffer.newNoDataInstance();
        this.z = 0;
        this.B = true;
    }
}
