package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler a;

        @Nullable
        private final AudioRendererEventListener b;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener listener) {
            this.a = listener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.b = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(String str) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(DecoderCounters decoderCounters) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioInputFormatChanged(format);
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(long j) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioPositionAdvancing(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(boolean z) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onSkipSilenceEnabledChanged(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.b)).onAudioUnderrun(i, j, j2);
        }

        public void audioCodecError(final Exception audioCodecError) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k(audioCodecError);
                    }
                });
            }
        }

        public void audioSinkError(final Exception audioSinkError) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: oj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(audioSinkError);
                    }
                });
            }
        }

        public void decoderInitialized(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: qj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.m(decoderName, initializedTimestampMs, initializationDurationMs);
                    }
                });
            }
        }

        public void decoderReleased(final String decoderName) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.n(decoderName);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters counters) {
            counters.ensureUpdated();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: lj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.o(counters);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.p(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: kj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.q(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void positionAdvancing(final long playoutStartSystemTimeMs) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: jj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.r(playoutStartSystemTimeMs);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean skipSilenceEnabled) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: rj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.s(skipSilenceEnabled);
                    }
                });
            }
        }

        public void underrun(final int bufferSize, final long bufferSizeMs, final long elapsedSinceLastFeedMs) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ij
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.t(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
                    }
                });
            }
        }
    }

    void onAudioCodecError(Exception audioCodecError);

    void onAudioDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void onAudioDecoderReleased(String decoderName);

    void onAudioDisabled(DecoderCounters counters);

    void onAudioEnabled(DecoderCounters counters);

    @Deprecated
    void onAudioInputFormatChanged(Format format);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long playoutStartSystemTimeMs);

    void onAudioSinkError(Exception audioSinkError);

    void onAudioUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs);

    void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled);
}
