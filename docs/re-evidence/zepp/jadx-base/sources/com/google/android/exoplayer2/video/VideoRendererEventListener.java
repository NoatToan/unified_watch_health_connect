package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler a;

        @Nullable
        private final VideoRendererEventListener b;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener listener) {
            this.a = listener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.b = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(int i, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onDroppedFrames(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoInputFormatChanged(format);
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(Object obj, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onRenderedFirstFrame(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(long j, int i) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoFrameProcessingOffset(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(VideoSize videoSize) {
            ((VideoRendererEventListener) Util.castNonNull(this.b)).onVideoSizeChanged(videoSize);
        }

        public void decoderInitialized(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: za8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k(decoderName, initializedTimestampMs, initializationDurationMs);
                    }
                });
            }
        }

        public void decoderReleased(final String decoderName) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ya8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(decoderName);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters counters) {
            counters.ensureUpdated();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ta8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.m(counters);
                    }
                });
            }
        }

        public void droppedFrames(final int droppedFrameCount, final long elapsedMs) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: qa8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.n(droppedFrameCount, elapsedMs);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ua8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.o(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: sa8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.p(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object output) {
            if (this.a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.a.post(new Runnable() { // from class: xa8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.q(output, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long totalProcessingOffsetUs, final int frameCount) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ra8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.r(totalProcessingOffsetUs, frameCount);
                    }
                });
            }
        }

        public void videoCodecError(final Exception videoCodecError) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: wa8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.s(videoCodecError);
                    }
                });
            }
        }

        public void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: va8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.t(videoSize);
                    }
                });
            }
        }
    }

    void onDroppedFrames(int count, long elapsedMs);

    void onRenderedFirstFrame(Object output, long renderTimeMs);

    void onVideoCodecError(Exception videoCodecError);

    void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void onVideoDecoderReleased(String decoderName);

    void onVideoDisabled(DecoderCounters counters);

    void onVideoEnabled(DecoderCounters counters);

    void onVideoFrameProcessingOffset(long totalProcessingOffsetUs, int frameCount);

    @Deprecated
    void onVideoInputFormatChanged(Format format);

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(VideoSize videoSize);
}
