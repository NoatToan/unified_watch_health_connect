package com.google.android.exoplayer2.transformer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
public final class Transformer {
    public static final int PROGRESS_STATE_AVAILABLE = 1;
    public static final int PROGRESS_STATE_NO_TRANSFORMATION = 4;
    public static final int PROGRESS_STATE_UNAVAILABLE = 2;
    public static final int PROGRESS_STATE_WAITING_FOR_AVAILABILITY = 0;
    private final Context a;
    private final MediaSourceFactory b;
    private final Muxer.Factory c;
    private final g d;
    private final Looper e;
    private final Clock f;
    private Listener g;

    @Nullable
    private com.google.android.exoplayer2.transformer.b h;

    @Nullable
    private SimpleExoPlayer i;
    private int j;

    public static final class Builder {
        private Context a;
        private MediaSourceFactory b;
        private Muxer.Factory c;
        private boolean d;
        private boolean e;
        private boolean f;
        private String g;
        private Listener h;
        private Looper i;
        private Clock j;

        public class a implements Listener {
            public a(final Builder this$0) {
            }

            @Override // com.google.android.exoplayer2.transformer.Transformer.Listener
            public /* synthetic */ void onTransformationCompleted(MediaItem mediaItem) {
                h.a(this, mediaItem);
            }

            @Override // com.google.android.exoplayer2.transformer.Transformer.Listener
            public /* synthetic */ void onTransformationError(MediaItem mediaItem, Exception exc) {
                h.b(this, mediaItem, exc);
            }
        }

        @VisibleForTesting
        public Builder a(Clock clock) {
            this.j = clock;
            return this;
        }

        @VisibleForTesting
        public Builder b(Muxer.Factory muxerFactory) {
            this.c = muxerFactory;
            return this;
        }

        public Transformer build() {
            Assertions.checkStateNotNull(this.a);
            if (this.b == null) {
                DefaultExtractorsFactory defaultExtractorsFactory = new DefaultExtractorsFactory();
                if (this.f) {
                    defaultExtractorsFactory.setMp4ExtractorFlags(4);
                }
                this.b = new DefaultMediaSourceFactory(this.a, defaultExtractorsFactory);
            }
            boolean zSupportsOutputMimeType = this.c.supportsOutputMimeType(this.g);
            String strValueOf = String.valueOf(this.g);
            Assertions.checkState(zSupportsOutputMimeType, strValueOf.length() != 0 ? "Unsupported output MIME type: ".concat(strValueOf) : new String("Unsupported output MIME type: "));
            return new Transformer(this.a, this.b, this.c, new g(this.d, this.e, this.f, this.g), this.h, this.i, this.j);
        }

        public Builder setContext(Context context) {
            this.a = context.getApplicationContext();
            return this;
        }

        public Builder setFlattenForSlowMotion(boolean flattenForSlowMotion) {
            this.f = flattenForSlowMotion;
            return this;
        }

        public Builder setListener(Listener listener) {
            this.h = listener;
            return this;
        }

        public Builder setLooper(Looper looper) {
            this.i = looper;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
            this.b = mediaSourceFactory;
            return this;
        }

        public Builder setOutputMimeType(String outputMimeType) {
            this.g = outputMimeType;
            return this;
        }

        public Builder setRemoveAudio(boolean removeAudio) {
            this.d = removeAudio;
            return this;
        }

        public Builder setRemoveVideo(boolean removeVideo) {
            this.e = removeVideo;
            return this;
        }

        public Builder() {
            this.c = new FrameworkMuxer.Factory();
            this.g = MimeTypes.VIDEO_MP4;
            this.h = new a(this);
            this.i = Util.getCurrentOrMainLooper();
            this.j = Clock.DEFAULT;
        }

        private Builder(Transformer transformer) {
            this.a = transformer.a;
            this.b = transformer.b;
            this.c = transformer.c;
            this.d = transformer.d.a;
            this.e = transformer.d.b;
            this.f = transformer.d.c;
            this.g = transformer.d.d;
            this.h = transformer.g;
            this.i = transformer.e;
            this.j = transformer.f;
        }
    }

    public interface Listener {
        void onTransformationCompleted(MediaItem inputMediaItem);

        void onTransformationError(MediaItem inputMediaItem, Exception exception);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressState {
    }

    public final class b implements AnalyticsListener {
        private final MediaItem a;
        private final com.google.android.exoplayer2.transformer.b b;

        public b(MediaItem mediaItem, com.google.android.exoplayer2.transformer.b muxerWrapper) {
            this.a = mediaItem;
            this.b = muxerWrapper;
        }

        private void a(@Nullable Exception exception) {
            try {
                Transformer.this.l(false);
            } catch (IllegalStateException e) {
                if (exception == null) {
                    exception = e;
                }
            }
            if (exception == null) {
                Transformer.this.g.onTransformationCompleted(this.a);
            } else {
                Transformer.this.g.onTransformationError(this.a, exception);
            }
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
            com.google.android.exoplayer2.analytics.a.a(this, eventTime, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
            com.google.android.exoplayer2.analytics.a.b(this, eventTime, exc);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
            com.google.android.exoplayer2.analytics.a.c(this, eventTime, str, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
            com.google.android.exoplayer2.analytics.a.d(this, eventTime, str, j, j2);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
            com.google.android.exoplayer2.analytics.a.e(this, eventTime, str);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.analytics.a.f(this, eventTime, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.analytics.a.g(this, eventTime, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
            com.google.android.exoplayer2.analytics.a.h(this, eventTime, format);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            com.google.android.exoplayer2.analytics.a.i(this, eventTime, format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
            com.google.android.exoplayer2.analytics.a.j(this, eventTime, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
            com.google.android.exoplayer2.analytics.a.k(this, eventTime, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
            com.google.android.exoplayer2.analytics.a.l(this, eventTime, exc);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
            com.google.android.exoplayer2.analytics.a.m(this, eventTime, i, j, j2);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
            com.google.android.exoplayer2.analytics.a.n(this, eventTime, commands);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
            com.google.android.exoplayer2.analytics.a.o(this, eventTime, i, j, j2);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.analytics.a.p(this, eventTime, i, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.analytics.a.q(this, eventTime, i, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
            com.google.android.exoplayer2.analytics.a.r(this, eventTime, i, str, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
            com.google.android.exoplayer2.analytics.a.s(this, eventTime, i, format);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
            com.google.android.exoplayer2.analytics.a.t(this, eventTime, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.u(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.v(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.w(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.x(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
            com.google.android.exoplayer2.analytics.a.y(this, eventTime, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
            com.google.android.exoplayer2.analytics.a.z(this, eventTime, exc);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.A(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
            com.google.android.exoplayer2.analytics.a.B(this, eventTime, i, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onEvents(Player player, AnalyticsListener.Events events) {
            com.google.android.exoplayer2.analytics.a.C(this, player, events);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            com.google.android.exoplayer2.analytics.a.D(this, eventTime, z);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            com.google.android.exoplayer2.analytics.a.E(this, eventTime, z);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            com.google.android.exoplayer2.analytics.a.F(this, eventTime, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            com.google.android.exoplayer2.analytics.a.G(this, eventTime, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            com.google.android.exoplayer2.analytics.a.H(this, eventTime, loadEventInfo, mediaLoadData, iOException, z);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            com.google.android.exoplayer2.analytics.a.I(this, eventTime, loadEventInfo, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            com.google.android.exoplayer2.analytics.a.J(this, eventTime, z);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, int i) {
            com.google.android.exoplayer2.analytics.a.K(this, eventTime, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
            com.google.android.exoplayer2.analytics.a.L(this, eventTime, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.analytics.a.M(this, eventTime, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
            com.google.android.exoplayer2.analytics.a.N(this, eventTime, metadata);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
            com.google.android.exoplayer2.analytics.a.O(this, eventTime, z, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
            com.google.android.exoplayer2.analytics.a.P(this, eventTime, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int state) {
            if (state == 4) {
                a(null);
            }
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
            com.google.android.exoplayer2.analytics.a.R(this, eventTime, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException error) {
            a(error);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.T(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
            com.google.android.exoplayer2.analytics.a.U(this, eventTime, z, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.analytics.a.V(this, eventTime, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
            com.google.android.exoplayer2.analytics.a.W(this, eventTime, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            com.google.android.exoplayer2.analytics.a.X(this, eventTime, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
            com.google.android.exoplayer2.analytics.a.Y(this, eventTime, obj, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
            com.google.android.exoplayer2.analytics.a.Z(this, eventTime, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
            com.google.android.exoplayer2.analytics.a.a0(this, eventTime, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
            com.google.android.exoplayer2.analytics.a.b0(this, eventTime, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.c0(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            com.google.android.exoplayer2.analytics.a.d0(this, eventTime);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            com.google.android.exoplayer2.analytics.a.e0(this, eventTime, z);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
            com.google.android.exoplayer2.analytics.a.f0(this, eventTime, z);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
            com.google.android.exoplayer2.analytics.a.g0(this, eventTime, list);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
            com.google.android.exoplayer2.analytics.a.h0(this, eventTime, i, i2);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int reason) {
            if (Transformer.this.j != 0) {
                return;
            }
            Timeline.Window window = new Timeline.Window();
            eventTime.timeline.getWindow(0, window);
            if (window.isPlaceholder) {
                return;
            }
            long j = window.durationUs;
            Transformer.this.j = (j <= 0 || j == C.TIME_UNSET) ? 2 : 1;
            ((SimpleExoPlayer) Assertions.checkNotNull(Transformer.this.i)).play();
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
            if (this.b.d() == 0) {
                a(new IllegalStateException("The output does not contain any tracks. Check that at least one of the input sample formats is supported."));
            }
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
            com.google.android.exoplayer2.analytics.a.k0(this, eventTime, mediaLoadData);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
            com.google.android.exoplayer2.analytics.a.l0(this, eventTime, exc);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
            com.google.android.exoplayer2.analytics.a.m0(this, eventTime, str, j);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
            com.google.android.exoplayer2.analytics.a.n0(this, eventTime, str, j, j2);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
            com.google.android.exoplayer2.analytics.a.o0(this, eventTime, str);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.analytics.a.p0(this, eventTime, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.analytics.a.q0(this, eventTime, decoderCounters);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
            com.google.android.exoplayer2.analytics.a.r0(this, eventTime, j, i);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
            com.google.android.exoplayer2.analytics.a.s0(this, eventTime, format);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            com.google.android.exoplayer2.analytics.a.t0(this, eventTime, format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
            com.google.android.exoplayer2.analytics.a.u0(this, eventTime, i, i2, i3, f);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
            com.google.android.exoplayer2.analytics.a.v0(this, eventTime, videoSize);
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
            com.google.android.exoplayer2.analytics.a.w0(this, eventTime, f);
        }
    }

    public static final class c implements RenderersFactory {
        private final com.google.android.exoplayer2.transformer.b a;
        private final k b = new k();
        private final g c;

        public c(com.google.android.exoplayer2.transformer.b muxerWrapper, g transformation) {
            this.a = muxerWrapper;
            this.c = transformation;
        }

        @Override // com.google.android.exoplayer2.RenderersFactory
        public Renderer[] createRenderers(Handler eventHandler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textRendererOutput, MetadataOutput metadataRendererOutput) {
            g gVar = this.c;
            boolean z = gVar.a;
            char c = 1;
            Renderer[] rendererArr = new Renderer[(z || gVar.b) ? 1 : 2];
            if (z) {
                c = 0;
            } else {
                rendererArr[0] = new i(this.a, this.b, gVar);
            }
            g gVar2 = this.c;
            if (!gVar2.b) {
                rendererArr[c] = new l(this.a, this.b, gVar2);
            }
            return rendererArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean forCancellation) {
        n();
        SimpleExoPlayer simpleExoPlayer = this.i;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
            this.i = null;
        }
        com.google.android.exoplayer2.transformer.b bVar = this.h;
        if (bVar != null) {
            bVar.f(forCancellation);
            this.h = null;
        }
        this.j = 4;
    }

    private void m(MediaItem mediaItem, Muxer muxer) {
        n();
        if (this.i != null) {
            throw new IllegalStateException("There is already a transformation in progress.");
        }
        com.google.android.exoplayer2.transformer.b bVar = new com.google.android.exoplayer2.transformer.b(muxer);
        this.h = bVar;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.a);
        defaultTrackSelector.setParameters(new DefaultTrackSelector.ParametersBuilder(this.a).setForceHighestSupportedBitrate(true).build());
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(this.a, new c(bVar, this.d)).setMediaSourceFactory(this.b).setTrackSelector(defaultTrackSelector).setLoadControl(new DefaultLoadControl.Builder().setBufferDurationsMs(50000, 50000, 250, 500).build()).setLooper(this.e).setClock(this.f).build();
        this.i = simpleExoPlayerBuild;
        simpleExoPlayerBuild.setMediaItem(mediaItem);
        this.i.addAnalyticsListener(new b(mediaItem, bVar));
        this.i.prepare();
        this.j = 0;
    }

    private void n() {
        if (Looper.myLooper() != this.e) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public void cancel() {
        l(true);
    }

    public Looper getApplicationLooper() {
        return this.e;
    }

    public int getProgress(ProgressHolder progressHolder) {
        n();
        if (this.j == 1) {
            Player player = (Player) Assertions.checkNotNull(this.i);
            progressHolder.progress = Math.min((int) ((player.getCurrentPosition() * 100) / player.getDuration()), 99);
        }
        return this.j;
    }

    public void setListener(Listener listener) {
        n();
        this.g = listener;
    }

    public void startTransformation(MediaItem mediaItem, String path) throws IOException {
        m(mediaItem, this.c.create(path, this.d.d));
    }

    private Transformer(Context context, MediaSourceFactory mediaSourceFactory, Muxer.Factory muxerFactory, g transformation, Listener listener, Looper looper, Clock clock) {
        Assertions.checkState((transformation.a && transformation.b) ? false : true, "Audio and video cannot both be removed.");
        this.a = context;
        this.b = mediaSourceFactory;
        this.c = muxerFactory;
        this.d = transformation;
        this.g = listener;
        this.e = looper;
        this.f = clock;
        this.j = 4;
    }

    @RequiresApi(26)
    public void startTransformation(MediaItem mediaItem, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        m(mediaItem, this.c.create(parcelFileDescriptor, this.d.d));
    }
}
