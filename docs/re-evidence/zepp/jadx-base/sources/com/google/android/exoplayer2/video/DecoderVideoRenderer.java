package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    private static final String U = "DecoderVideoRenderer";
    private static final int V = 0;
    private static final int W = 1;
    private static final int X = 2;

    @Nullable
    private VideoFrameMetadataListener A;

    @Nullable
    private DrmSession B;

    @Nullable
    private DrmSession C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private boolean K;
    private boolean L;
    private boolean M;

    @Nullable
    private VideoSize N;
    private long O;
    private int P;
    private int Q;
    private int R;
    private long S;
    private long T;
    public DecoderCounters decoderCounters;
    private final long m;
    private final int n;
    private final VideoRendererEventListener.EventDispatcher o;
    private final TimedValueQueue<Format> p;
    private final DecoderInputBuffer q;
    private Format r;
    private Format s;

    @Nullable
    private Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> t;
    private VideoDecoderInputBuffer u;
    private VideoDecoderOutputBuffer v;
    private int w;

    @Nullable
    private Object x;

    @Nullable
    private Surface y;

    @Nullable
    private VideoDecoderOutputBufferRenderer z;

    public DecoderVideoRenderer(long allowedJoiningTimeMs, @Nullable Handler eventHandler, @Nullable VideoRendererEventListener eventListener, int maxDroppedFramesToNotify) {
        super(2);
        this.m = allowedJoiningTimeMs;
        this.n = maxDroppedFramesToNotify;
        this.J = C.TIME_UNSET;
        b();
        this.p = new TimedValueQueue<>();
        this.q = DecoderInputBuffer.newNoDataInstance();
        this.o = new VideoRendererEventListener.EventDispatcher(eventHandler, eventListener);
        this.D = 0;
        this.w = -1;
    }

    private void a() {
        this.F = false;
    }

    private void b() {
        this.N = null;
    }

    private boolean c(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException, DecoderException {
        if (this.v == null) {
            VideoDecoderOutputBuffer videoDecoderOutputBufferDequeueOutputBuffer = this.t.dequeueOutputBuffer();
            this.v = videoDecoderOutputBufferDequeueOutputBuffer;
            if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
                return false;
            }
            DecoderCounters decoderCounters = this.decoderCounters;
            int i = decoderCounters.skippedOutputBufferCount;
            int i2 = videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
            decoderCounters.skippedOutputBufferCount = i + i2;
            this.R -= i2;
        }
        if (!this.v.isEndOfStream()) {
            boolean zQ = q(positionUs, elapsedRealtimeUs);
            if (zQ) {
                onProcessedOutputBuffer(this.v.timeUs);
                this.v = null;
            }
            return zQ;
        }
        if (this.D == 2) {
            releaseDecoder();
            h();
        } else {
            this.v.release();
            this.v = null;
            this.M = true;
        }
        return false;
    }

    private boolean d() throws ExoPlaybackException, DecoderException {
        Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.t;
        if (decoder == null || this.D == 2 || this.L) {
            return false;
        }
        if (this.u == null) {
            VideoDecoderInputBuffer videoDecoderInputBufferDequeueInputBuffer = decoder.dequeueInputBuffer();
            this.u = videoDecoderInputBufferDequeueInputBuffer;
            if (videoDecoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.D == 1) {
            this.u.setFlags(4);
            this.t.queueInputBuffer(this.u);
            this.u = null;
            this.D = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.u, 0);
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
        if (this.u.isEndOfStream()) {
            this.L = true;
            this.t.queueInputBuffer(this.u);
            this.u = null;
            return false;
        }
        if (this.K) {
            this.p.add(this.u.timeUs, this.r);
            this.K = false;
        }
        this.u.flip();
        VideoDecoderInputBuffer videoDecoderInputBuffer = this.u;
        videoDecoderInputBuffer.format = this.r;
        onQueueInputBuffer(videoDecoderInputBuffer);
        this.t.queueInputBuffer(this.u);
        this.R++;
        this.E = true;
        this.decoderCounters.inputBufferCount++;
        this.u = null;
        return true;
    }

    private boolean e() {
        return this.w != -1;
    }

    private static boolean f(long earlyUs) {
        return earlyUs < -30000;
    }

    private static boolean g(long earlyUs) {
        return earlyUs < -500000;
    }

    private void h() throws ExoPlaybackException {
        if (this.t != null) {
            return;
        }
        r(this.C);
        ExoMediaCrypto mediaCrypto = null;
        DrmSession drmSession = this.B;
        if (drmSession != null && (mediaCrypto = drmSession.getMediaCrypto()) == null && this.B.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.t = createDecoder(this.r, mediaCrypto);
            setDecoderOutputMode(this.w);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.o.decoderInitialized(this.t.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (DecoderException e) {
            Log.e(U, "Video codec error", e);
            this.o.videoCodecError(e);
            throw createRendererException(e, this.r, 4001);
        } catch (OutOfMemoryError e2) {
            throw createRendererException(e2, this.r, 4001);
        }
    }

    private void i() {
        if (this.P > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.o.droppedFrames(this.P, jElapsedRealtime - this.O);
            this.P = 0;
            this.O = jElapsedRealtime;
        }
    }

    private void j() {
        this.H = true;
        if (this.F) {
            return;
        }
        this.F = true;
        this.o.renderedFirstFrame(this.x);
    }

    private void k(int width, int height) {
        VideoSize videoSize = this.N;
        if (videoSize != null && videoSize.width == width && videoSize.height == height) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(width, height);
        this.N = videoSize2;
        this.o.videoSizeChanged(videoSize2);
    }

    private void l() {
        if (this.F) {
            this.o.renderedFirstFrame(this.x);
        }
    }

    private void m() {
        VideoSize videoSize = this.N;
        if (videoSize != null) {
            this.o.videoSizeChanged(videoSize);
        }
    }

    private void n() {
        m();
        a();
        if (getState() == 2) {
            s();
        }
    }

    private void o() {
        b();
        a();
    }

    private void p() {
        m();
        l();
    }

    private boolean q(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException, DecoderException {
        if (this.I == C.TIME_UNSET) {
            this.I = positionUs;
        }
        long j = this.v.timeUs - positionUs;
        if (!e()) {
            if (!f(j)) {
                return false;
            }
            skipOutputBuffer(this.v);
            return true;
        }
        long j2 = this.v.timeUs - this.T;
        Format formatPollFloor = this.p.pollFloor(j2);
        if (formatPollFloor != null) {
            this.s = formatPollFloor;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.S;
        boolean z = getState() == 2;
        if ((this.H ? !this.F : z || this.G) || (z && shouldForceRenderOutputBuffer(j, jElapsedRealtime))) {
            renderOutputBuffer(this.v, j2, this.s);
            return true;
        }
        if (!z || positionUs == this.I || (shouldDropBuffersToKeyframe(j, elapsedRealtimeUs) && maybeDropBuffersToKeyframe(positionUs))) {
            return false;
        }
        if (shouldDropOutputBuffer(j, elapsedRealtimeUs)) {
            dropOutputBuffer(this.v);
            return true;
        }
        if (j < 30000) {
            renderOutputBuffer(this.v, j2, this.s);
            return true;
        }
        return false;
    }

    private void r(@Nullable DrmSession session) {
        g.b(this.B, session);
        this.B = session;
    }

    private void s() {
        this.J = this.m > 0 ? SystemClock.elapsedRealtime() + this.m : C.TIME_UNSET;
    }

    private void t(@Nullable DrmSession session) {
        g.b(this.C, session);
        this.C = session;
    }

    public DecoderReuseEvaluation canReuseDecoder(String decoderName, Format oldFormat, Format newFormat) {
        return new DecoderReuseEvaluation(decoderName, oldFormat, newFormat, 0, 1);
    }

    public abstract Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder(Format format, @Nullable ExoMediaCrypto mediaCrypto) throws DecoderException;

    public void dropOutputBuffer(VideoDecoderOutputBuffer outputBuffer) {
        updateDroppedBufferCounters(1);
        outputBuffer.release();
    }

    @CallSuper
    public void flushDecoder() throws ExoPlaybackException {
        this.R = 0;
        if (this.D != 0) {
            releaseDecoder();
            h();
            return;
        }
        this.u = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.v;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.v = null;
        }
        this.t.flush();
        this.E = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
        if (messageType == 1) {
            setOutput(message);
        } else if (messageType == 6) {
            this.A = (VideoFrameMetadataListener) message;
        } else {
            super.handleMessage(messageType, message);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.M;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        if (this.r != null && ((isSourceReady() || this.v != null) && (this.F || !e()))) {
            this.J = C.TIME_UNSET;
            return true;
        }
        if (this.J == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.J) {
            return true;
        }
        this.J = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(long positionUs) throws ExoPlaybackException {
        int iSkipSource = skipSource(positionUs);
        if (iSkipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(this.R + iSkipSource);
        flushDecoder();
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.r = null;
        b();
        a();
        try {
            t(null);
            releaseDecoder();
        } finally {
            this.o.disabled(this.decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.o.enabled(decoderCounters);
        this.G = mayRenderStartOfStream;
        this.H = false;
    }

    @CallSuper
    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        this.K = true;
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        t(formatHolder.drmSession);
        Format format2 = this.r;
        this.r = format;
        Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.t;
        if (decoder == null) {
            h();
            this.o.inputFormatChanged(this.r, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = this.C != this.B ? new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 128) : canReuseDecoder(decoder.getName(), format2, format);
        if (decoderReuseEvaluation.result == 0) {
            if (this.E) {
                this.D = 1;
            } else {
                releaseDecoder();
                h();
            }
        }
        this.o.inputFormatChanged(this.r, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
        this.L = false;
        this.M = false;
        a();
        this.I = C.TIME_UNSET;
        this.Q = 0;
        if (this.t != null) {
            flushDecoder();
        }
        if (joining) {
            s();
        } else {
            this.J = C.TIME_UNSET;
        }
        this.p.clear();
    }

    @CallSuper
    public void onProcessedOutputBuffer(long presentationTimeUs) {
        this.R--;
    }

    public void onQueueInputBuffer(VideoDecoderInputBuffer buffer) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        this.P = 0;
        this.O = SystemClock.elapsedRealtime();
        this.S = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        this.J = C.TIME_UNSET;
        i();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) throws ExoPlaybackException {
        this.T = offsetUs;
        super.onStreamChanged(formats, startPositionUs, offsetUs);
    }

    @CallSuper
    public void releaseDecoder() {
        this.u = null;
        this.v = null;
        this.D = 0;
        this.E = false;
        this.R = 0;
        Decoder<VideoDecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.t;
        if (decoder != null) {
            this.decoderCounters.decoderReleaseCount++;
            decoder.release();
            this.o.decoderReleased(this.t.getName());
            this.t = null;
        }
        r(null);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
        if (this.M) {
            return;
        }
        if (this.r == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.q.clear();
            int source = readSource(formatHolder, this.q, 2);
            if (source != -5) {
                if (source == -4) {
                    Assertions.checkState(this.q.isEndOfStream());
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        h();
        if (this.t != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (c(positionUs, elapsedRealtimeUs)) {
                }
                while (d()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (DecoderException e) {
                Log.e(U, "Video codec error", e);
                this.o.videoCodecError(e);
                throw createRendererException(e, this.r, PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    public void renderOutputBuffer(VideoDecoderOutputBuffer outputBuffer, long presentationTimeUs, Format outputFormat) throws DecoderException {
        VideoFrameMetadataListener videoFrameMetadataListener = this.A;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(presentationTimeUs, System.nanoTime(), outputFormat, null);
        }
        this.S = C.msToUs(SystemClock.elapsedRealtime() * 1000);
        int i = outputBuffer.mode;
        boolean z = i == 1 && this.y != null;
        boolean z2 = i == 0 && this.z != null;
        if (!z2 && !z) {
            dropOutputBuffer(outputBuffer);
            return;
        }
        k(outputBuffer.width, outputBuffer.height);
        if (z2) {
            this.z.setOutputBuffer(outputBuffer);
        } else {
            renderOutputBufferToSurface(outputBuffer, this.y);
        }
        this.Q = 0;
        this.decoderCounters.renderedOutputBufferCount++;
        j();
    }

    public abstract void renderOutputBufferToSurface(VideoDecoderOutputBuffer outputBuffer, Surface surface) throws DecoderException;

    public abstract void setDecoderOutputMode(int outputMode);

    public final void setOutput(@Nullable Object output) {
        if (output instanceof Surface) {
            this.y = (Surface) output;
            this.z = null;
            this.w = 1;
        } else if (output instanceof VideoDecoderOutputBufferRenderer) {
            this.y = null;
            this.z = (VideoDecoderOutputBufferRenderer) output;
            this.w = 0;
        } else {
            this.y = null;
            this.z = null;
            this.w = -1;
            output = null;
        }
        if (this.x == output) {
            if (output != null) {
                p();
                return;
            }
            return;
        }
        this.x = output;
        if (output == null) {
            o();
            return;
        }
        if (this.t != null) {
            setDecoderOutputMode(this.w);
        }
        n();
    }

    public boolean shouldDropBuffersToKeyframe(long earlyUs, long elapsedRealtimeUs) {
        return g(earlyUs);
    }

    public boolean shouldDropOutputBuffer(long earlyUs, long elapsedRealtimeUs) {
        return f(earlyUs);
    }

    public boolean shouldForceRenderOutputBuffer(long earlyUs, long elapsedSinceLastRenderUs) {
        return f(earlyUs) && elapsedSinceLastRenderUs > com.google.android.exoplayer2.extractor.mp3.b.e;
    }

    public void skipOutputBuffer(VideoDecoderOutputBuffer outputBuffer) {
        this.decoderCounters.skippedOutputBufferCount++;
        outputBuffer.release();
    }

    public void updateDroppedBufferCounters(int droppedBufferCount) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += droppedBufferCount;
        this.P += droppedBufferCount;
        int i = this.Q + droppedBufferCount;
        this.Q = i;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i2 = this.n;
        if (i2 <= 0 || this.P < i2) {
            return;
        }
        i();
    }
}
