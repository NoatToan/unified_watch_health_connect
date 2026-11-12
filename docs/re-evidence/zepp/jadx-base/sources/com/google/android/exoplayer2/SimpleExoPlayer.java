package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleExoPlayer extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.MetadataComponent, ExoPlayer.DeviceComponent {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    private static final String T = "SimpleExoPlayer";
    private int A;
    private int B;
    private int C;

    @Nullable
    private DecoderCounters D;

    @Nullable
    private DecoderCounters E;
    private int F;
    private AudioAttributes G;
    private float H;
    private boolean I;
    private List<Cue> J;

    @Nullable
    private VideoFrameMetadataListener K;

    @Nullable
    private CameraMotionListener L;
    private boolean M;
    private boolean N;

    @Nullable
    private PriorityTaskManager O;
    private boolean P;
    private boolean Q;
    private DeviceInfo R;
    private VideoSize S;
    private final ConditionVariable a;
    private final Context b;
    private final c0 c;
    private final b d;
    private final c e;
    private final CopyOnWriteArraySet<VideoListener> f;
    private final CopyOnWriteArraySet<AudioListener> g;
    private final CopyOnWriteArraySet<TextOutput> h;
    private final CopyOnWriteArraySet<MetadataOutput> i;
    private final CopyOnWriteArraySet<DeviceListener> j;
    private final AnalyticsCollector k;
    private final AudioBecomingNoisyManager l;
    private final AudioFocusManager m;
    private final StreamVolumeManager n;
    private final s0 o;
    private final t0 p;
    private final long q;

    @Nullable
    private Format r;
    public final Renderer[] renderers;

    @Nullable
    private Format s;

    @Nullable
    private AudioTrack t;

    @Nullable
    private Object u;

    @Nullable
    private Surface v;

    @Nullable
    private SurfaceHolder w;

    @Nullable
    private SphericalGLSurfaceView x;
    private boolean y;

    @Nullable
    private TextureView z;

    public static final class Builder {
        private final Context a;
        private final RenderersFactory b;
        private Clock c;
        private long d;
        private TrackSelector e;
        private MediaSourceFactory f;
        private LoadControl g;
        private BandwidthMeter h;
        private AnalyticsCollector i;
        private Looper j;

        @Nullable
        private PriorityTaskManager k;
        private AudioAttributes l;
        private boolean m;
        private int n;
        private boolean o;
        private boolean p;
        private int q;
        private boolean r;
        private SeekParameters s;
        private long t;
        private long u;
        private LivePlaybackSpeedControl v;
        private long w;
        private long x;
        private boolean y;
        private boolean z;

        public Builder(Context context) {
            this(context, new DefaultRenderersFactory(context), new DefaultExtractorsFactory());
        }

        public SimpleExoPlayer build() {
            Assertions.checkState(!this.z);
            this.z = true;
            return new SimpleExoPlayer(this);
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long timeoutMs) {
            Assertions.checkState(!this.z);
            this.d = timeoutMs;
            return this;
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.z);
            this.i = analyticsCollector;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean handleAudioFocus) {
            Assertions.checkState(!this.z);
            this.l = audioAttributes;
            this.m = handleAudioFocus;
            return this;
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.z);
            this.h = bandwidthMeter;
            return this;
        }

        @VisibleForTesting
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.z);
            this.c = clock;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long detachSurfaceTimeoutMs) {
            Assertions.checkState(!this.z);
            this.x = detachSurfaceTimeoutMs;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean handleAudioBecomingNoisy) {
            Assertions.checkState(!this.z);
            this.o = handleAudioBecomingNoisy;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.z);
            this.v = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl) {
            Assertions.checkState(!this.z);
            this.g = loadControl;
            return this;
        }

        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.z);
            this.j = looper;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
            Assertions.checkState(!this.z);
            this.f = mediaSourceFactory;
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems) {
            Assertions.checkState(!this.z);
            this.y = pauseAtEndOfMediaItems;
            return this;
        }

        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.z);
            this.k = priorityTaskManager;
            return this;
        }

        public Builder setReleaseTimeoutMs(long releaseTimeoutMs) {
            Assertions.checkState(!this.z);
            this.w = releaseTimeoutMs;
            return this;
        }

        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long seekBackIncrementMs) {
            Assertions.checkArgument(seekBackIncrementMs > 0);
            Assertions.checkState(true ^ this.z);
            this.t = seekBackIncrementMs;
            return this;
        }

        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long seekForwardIncrementMs) {
            Assertions.checkArgument(seekForwardIncrementMs > 0);
            Assertions.checkState(true ^ this.z);
            this.u = seekForwardIncrementMs;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.z);
            this.s = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean skipSilenceEnabled) {
            Assertions.checkState(!this.z);
            this.p = skipSilenceEnabled;
            return this;
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
            Assertions.checkState(!this.z);
            this.e = trackSelector;
            return this;
        }

        public Builder setUseLazyPreparation(boolean useLazyPreparation) {
            Assertions.checkState(!this.z);
            this.r = useLazyPreparation;
            return this;
        }

        public Builder setVideoScalingMode(int videoScalingMode) {
            Assertions.checkState(!this.z);
            this.q = videoScalingMode;
            return this;
        }

        public Builder setWakeMode(int wakeMode) {
            Assertions.checkState(!this.z);
            this.n = wakeMode;
            return this;
        }

        public Builder(Context context, RenderersFactory renderersFactory) {
            this(context, renderersFactory, new DefaultExtractorsFactory());
        }

        public Builder(Context context, ExtractorsFactory extractorsFactory) {
            this(context, new DefaultRenderersFactory(context), extractorsFactory);
        }

        public Builder(Context context, RenderersFactory renderersFactory, ExtractorsFactory extractorsFactory) {
            this(context, renderersFactory, new DefaultTrackSelector(context), new DefaultMediaSourceFactory(context, extractorsFactory), new DefaultLoadControl(), DefaultBandwidthMeter.getSingletonInstance(context), new AnalyticsCollector(Clock.DEFAULT));
        }

        public Builder(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
            this.a = context;
            this.b = renderersFactory;
            this.e = trackSelector;
            this.f = mediaSourceFactory;
            this.g = loadControl;
            this.h = bandwidthMeter;
            this.i = analyticsCollector;
            this.j = Util.getCurrentOrMainLooper();
            this.l = AudioAttributes.DEFAULT;
            this.n = 0;
            this.q = 1;
            this.r = true;
            this.s = SeekParameters.DEFAULT;
            this.t = 5000L;
            this.u = 15000L;
            this.v = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.c = Clock.DEFAULT;
            this.w = 500L;
            this.x = 2000L;
        }
    }

    public final class b implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, Player.EventListener, ExoPlayer.AudioOffloadListener {
        private b() {
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int playerCommand) {
            boolean playWhenReady = SimpleExoPlayer.this.getPlayWhenReady();
            SimpleExoPlayer.this.S(playWhenReady, playerCommand, SimpleExoPlayer.I(playWhenReady, playerCommand));
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            SimpleExoPlayer.this.S(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception audioCodecError) {
            SimpleExoPlayer.this.k.onAudioCodecError(audioCodecError);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
            SimpleExoPlayer.this.k.onAudioDecoderInitialized(decoderName, initializedTimestampMs, initializationDurationMs);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String decoderName) {
            SimpleExoPlayer.this.k.onAudioDecoderReleased(decoderName);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters counters) {
            SimpleExoPlayer.this.k.onAudioDisabled(counters);
            SimpleExoPlayer.this.s = null;
            SimpleExoPlayer.this.E = null;
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters counters) {
            SimpleExoPlayer.this.E = counters;
            SimpleExoPlayer.this.k.onAudioEnabled(counters);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format) {
            com.google.android.exoplayer2.audio.b.f(this, format);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            SimpleExoPlayer.this.s = format;
            SimpleExoPlayer.this.k.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long playoutStartSystemTimeMs) {
            SimpleExoPlayer.this.k.onAudioPositionAdvancing(playoutStartSystemTimeMs);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception audioSinkError) {
            SimpleExoPlayer.this.k.onAudioSinkError(audioSinkError);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
            SimpleExoPlayer.this.k.onAudioUnderrun(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            m0.a(this, commands);
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> cues) {
            SimpleExoPlayer.this.J = cues;
            Iterator it2 = SimpleExoPlayer.this.h.iterator();
            while (it2.hasNext()) {
                ((TextOutput) it2.next()).onCues(cues);
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onDroppedFrames(int count, long elapsed) {
            SimpleExoPlayer.this.k.onDroppedFrames(count, elapsed);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            m0.b(this, player, events);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
            com.google.android.exoplayer2.b.a(this, z);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public void onExperimentalSleepingForOffloadChanged(boolean sleepingForOffload) {
            SimpleExoPlayer.this.T();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsLoadingChanged(boolean isLoading) {
            if (SimpleExoPlayer.this.O != null) {
                if (isLoading && !SimpleExoPlayer.this.P) {
                    SimpleExoPlayer.this.O.add(0);
                    SimpleExoPlayer.this.P = true;
                } else {
                    if (isLoading || !SimpleExoPlayer.this.P) {
                        return;
                    }
                    SimpleExoPlayer.this.O.remove(0);
                    SimpleExoPlayer.this.P = false;
                }
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            m0.d(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            m0.e(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
            m0.f(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            m0.g(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            m0.h(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
            SimpleExoPlayer.this.k.onMetadata(metadata);
            SimpleExoPlayer.this.c.o0(metadata);
            Iterator it2 = SimpleExoPlayer.this.i.iterator();
            while (it2.hasNext()) {
                ((MetadataOutput) it2.next()).onMetadata(metadata);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
            SimpleExoPlayer.this.T();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            m0.j(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int playbackState) {
            SimpleExoPlayer.this.T();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            m0.l(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            m0.m(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            m0.n(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            m0.o(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            m0.p(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            m0.q(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            m0.r(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object output, long renderTimeMs) {
            SimpleExoPlayer.this.k.onRenderedFirstFrame(output, renderTimeMs);
            if (SimpleExoPlayer.this.u == output) {
                Iterator it2 = SimpleExoPlayer.this.f.iterator();
                while (it2.hasNext()) {
                    ((VideoListener) it2.next()).onRenderedFirstFrame();
                }
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            m0.s(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            m0.t(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            m0.u(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            m0.v(this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            m0.w(this, z);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
            if (SimpleExoPlayer.this.I == skipSilenceEnabled) {
                return;
            }
            SimpleExoPlayer.this.I = skipSilenceEnabled;
            SimpleExoPlayer.this.L();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            m0.x(this, list);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int streamType) {
            DeviceInfo deviceInfoH = SimpleExoPlayer.H(SimpleExoPlayer.this.n);
            if (deviceInfoH.equals(SimpleExoPlayer.this.R)) {
                return;
            }
            SimpleExoPlayer.this.R = deviceInfoH;
            Iterator it2 = SimpleExoPlayer.this.j.iterator();
            while (it2.hasNext()) {
                ((DeviceListener) it2.next()).onDeviceInfoChanged(deviceInfoH);
            }
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(int streamVolume, boolean streamMuted) {
            Iterator it2 = SimpleExoPlayer.this.j.iterator();
            while (it2.hasNext()) {
                ((DeviceListener) it2.next()).onDeviceVolumeChanged(streamVolume, streamMuted);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
            SimpleExoPlayer.this.Q(surfaceTexture);
            SimpleExoPlayer.this.K(width, height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.R(null);
            SimpleExoPlayer.this.K(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
            SimpleExoPlayer.this.K(width, height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            m0.y(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            m0.z(this, trackGroupArray, trackSelectionArray);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoCodecError(Exception videoCodecError) {
            SimpleExoPlayer.this.k.onVideoCodecError(videoCodecError);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
            SimpleExoPlayer.this.k.onVideoDecoderInitialized(decoderName, initializedTimestampMs, initializationDurationMs);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String decoderName) {
            SimpleExoPlayer.this.k.onVideoDecoderReleased(decoderName);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters counters) {
            SimpleExoPlayer.this.k.onVideoDisabled(counters);
            SimpleExoPlayer.this.r = null;
            SimpleExoPlayer.this.D = null;
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters counters) {
            SimpleExoPlayer.this.D = counters;
            SimpleExoPlayer.this.k.onVideoEnabled(counters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long totalProcessingOffsetUs, int frameCount) {
            SimpleExoPlayer.this.k.onVideoFrameProcessingOffset(totalProcessingOffsetUs, frameCount);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format) {
            com.google.android.exoplayer2.video.c.i(this, format);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            SimpleExoPlayer.this.r = format;
            SimpleExoPlayer.this.k.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(VideoSize videoSize) {
            SimpleExoPlayer.this.S = videoSize;
            SimpleExoPlayer.this.k.onVideoSizeChanged(videoSize);
            for (VideoListener videoListener : SimpleExoPlayer.this.f) {
                videoListener.onVideoSizeChanged(videoSize);
                videoListener.onVideoSizeChanged(videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
            SimpleExoPlayer.this.R(surface);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
            SimpleExoPlayer.this.R(null);
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float volumeMultiplier) {
            SimpleExoPlayer.this.O();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            SimpleExoPlayer.this.K(width, height);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            if (SimpleExoPlayer.this.y) {
                SimpleExoPlayer.this.R(holder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            if (SimpleExoPlayer.this.y) {
                SimpleExoPlayer.this.R(null);
            }
            SimpleExoPlayer.this.K(0, 0);
        }
    }

    public static final class c implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int e = 6;
        public static final int f = 7;
        public static final int g = 10000;

        @Nullable
        private VideoFrameMetadataListener a;

        @Nullable
        private CameraMotionListener b;

        @Nullable
        private VideoFrameMetadataListener c;

        @Nullable
        private CameraMotionListener d;

        private c() {
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public void handleMessage(int messageType, @Nullable Object message) {
            if (messageType == 6) {
                this.a = (VideoFrameMetadataListener) message;
                return;
            }
            if (messageType == 7) {
                this.b = (CameraMotionListener) message;
                return;
            }
            if (messageType != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) message;
            if (sphericalGLSurfaceView == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotion(long timeUs, float[] rotation) {
            CameraMotionListener cameraMotionListener = this.d;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(timeUs, rotation);
            }
            CameraMotionListener cameraMotionListener2 = this.b;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(timeUs, rotation);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            CameraMotionListener cameraMotionListener = this.d;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener2 = this.b;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long presentationTimeUs, long releaseTimeNs, Format format, @Nullable MediaFormat mediaFormat) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.c;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(presentationTimeUs, releaseTimeNs, format, mediaFormat);
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.a;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(presentationTimeUs, releaseTimeNs, format, mediaFormat);
            }
        }
    }

    @Deprecated
    public SimpleExoPlayer(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector, boolean useLazyPreparation, Clock clock, Looper applicationLooper) {
        this(new Builder(context, renderersFactory).setTrackSelector(trackSelector).setMediaSourceFactory(mediaSourceFactory).setLoadControl(loadControl).setBandwidthMeter(bandwidthMeter).setAnalyticsCollector(analyticsCollector).setUseLazyPreparation(useLazyPreparation).setClock(clock).setLooper(applicationLooper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceInfo H(StreamVolumeManager streamVolumeManager) {
        return new DeviceInfo(0, streamVolumeManager.e(), streamVolumeManager.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(boolean playWhenReady, int playerCommand) {
        return (!playWhenReady || playerCommand == 1) ? 1 : 2;
    }

    private int J(int audioSessionId) {
        AudioTrack audioTrack = this.t;
        if (audioTrack != null && audioTrack.getAudioSessionId() != audioSessionId) {
            this.t.release();
            this.t = null;
        }
        if (this.t == null) {
            this.t = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
        }
        return this.t.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int width, int height) {
        if (width == this.B && height == this.C) {
            return;
        }
        this.B = width;
        this.C = height;
        this.k.onSurfaceSizeChanged(width, height);
        Iterator<VideoListener> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().onSurfaceSizeChanged(width, height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        this.k.onSkipSilenceEnabledChanged(this.I);
        Iterator<AudioListener> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().onSkipSilenceEnabledChanged(this.I);
        }
    }

    private void M() {
        if (this.x != null) {
            this.c.createMessage(this.e).setType(10000).setPayload(null).send();
            this.x.removeVideoSurfaceListener(this.d);
            this.x = null;
        }
        TextureView textureView = this.z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.d) {
                Log.w(T, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.z.setSurfaceTextureListener(null);
            }
            this.z = null;
        }
        SurfaceHolder surfaceHolder = this.w;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.d);
            this.w = null;
        }
    }

    private void N(int trackType, int messageType, @Nullable Object payload) {
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == trackType) {
                this.c.createMessage(renderer).setType(messageType).setPayload(payload).send();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        N(1, 2, Float.valueOf(this.H * this.m.h()));
    }

    private void P(SurfaceHolder nonVideoOutputSurfaceHolder) {
        this.y = false;
        this.w = nonVideoOutputSurfaceHolder;
        nonVideoOutputSurfaceHolder.addCallback(this.d);
        Surface surface = this.w.getSurface();
        if (surface == null || !surface.isValid()) {
            K(0, 0);
        } else {
            Rect surfaceFrame = this.w.getSurfaceFrame();
            K(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        R(surface);
        this.v = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(@Nullable Object videoOutput) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Renderer[] rendererArr = this.renderers;
        int length = rendererArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            Renderer renderer = rendererArr[i];
            if (renderer.getTrackType() == 2) {
                arrayList.add(this.c.createMessage(renderer).setType(1).setPayload(videoOutput).send());
            }
            i++;
        }
        Object obj = this.u;
        if (obj == null || obj == videoOutput) {
            z = false;
        } else {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((PlayerMessage) it2.next()).blockUntilDelivered(this.q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj2 = this.u;
            Surface surface = this.v;
            if (obj2 == surface) {
                surface.release();
                this.v = null;
            }
        }
        this.u = videoOutput;
        if (z) {
            this.c.u0(false, ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean playWhenReady, int playerCommand, int playWhenReadyChangeReason) {
        int i = 0;
        boolean z = playWhenReady && playerCommand != -1;
        if (z && playerCommand != 1) {
            i = 1;
        }
        this.c.t0(z, i, playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.o.b(getPlayWhenReady() && !experimentalIsSleepingForOffload());
                this.p.b(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.o.b(false);
        this.p.b(false);
    }

    private void U() {
        this.a.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.M) {
                throw new IllegalStateException(invariant);
            }
            Log.w(T, invariant, this.N ? null : new IllegalStateException());
            this.N = true;
        }
    }

    public void addAnalyticsListener(AnalyticsListener listener) {
        Assertions.checkNotNull(listener);
        this.k.addListener(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    @Deprecated
    public void addAudioListener(AudioListener listener) {
        Assertions.checkNotNull(listener);
        this.g.add(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
        this.c.addAudioOffloadListener(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public void addDeviceListener(DeviceListener listener) {
        Assertions.checkNotNull(listener);
        this.j.add(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.Listener listener) {
        Assertions.checkNotNull(listener);
        addAudioListener(listener);
        addVideoListener(listener);
        addTextOutput(listener);
        addMetadataOutput(listener);
        addDeviceListener(listener);
        addListener((Player.EventListener) listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int index, List<MediaItem> mediaItems) {
        U();
        this.c.addMediaItems(index, mediaItems);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        U();
        this.c.addMediaSource(mediaSource);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List<MediaSource> mediaSources) {
        U();
        this.c.addMediaSources(mediaSources);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.MetadataComponent
    @Deprecated
    public void addMetadataOutput(MetadataOutput output) {
        Assertions.checkNotNull(output);
        this.i.add(output);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.TextComponent
    @Deprecated
    public void addTextOutput(TextOutput listener) {
        Assertions.checkNotNull(listener);
        this.h.add(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    @Deprecated
    public void addVideoListener(VideoListener listener) {
        Assertions.checkNotNull(listener);
        this.f.add(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        setAuxEffectInfo(new AuxEffectInfo(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener listener) {
        U();
        if (this.L != listener) {
            return;
        }
        this.c.createMessage(this.e).setType(7).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener listener) {
        U();
        if (this.K != listener) {
            return;
        }
        this.c.createMessage(this.e).setType(6).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface() {
        U();
        M();
        R(null);
        K(0, 0);
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        U();
        if (surfaceHolder == null || surfaceHolder != this.w) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        U();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        U();
        if (textureView == null || textureView != this.z) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        U();
        return this.c.createMessage(target);
    }

    @Override // com.google.android.exoplayer2.Player
    public void decreaseDeviceVolume() {
        U();
        this.n.c();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
        U();
        return this.c.experimentalIsSleepingForOffload();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled) {
        U();
        this.c.experimentalSetOffloadSchedulingEnabled(offloadSchedulingEnabled);
    }

    public AnalyticsCollector getAnalyticsCollector() {
        return this.k;
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
        return this.c.getApplicationLooper();
    }

    @Override // com.google.android.exoplayer2.Player
    public AudioAttributes getAudioAttributes() {
        return this.G;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.AudioComponent getAudioComponent() {
        return this;
    }

    @Nullable
    public DecoderCounters getAudioDecoderCounters() {
        return this.E;
    }

    @Nullable
    public Format getAudioFormat() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        return this.F;
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
        U();
        return this.c.getAvailableCommands();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        U();
        return this.c.getBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Clock getClock() {
        return this.c.getClock();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
        U();
        return this.c.getContentBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        U();
        return this.c.getContentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        U();
        return this.c.getCurrentAdGroupIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        U();
        return this.c.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.Player
    public List<Cue> getCurrentCues() {
        U();
        return this.J;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        U();
        return this.c.getCurrentPeriodIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        U();
        return this.c.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public List<Metadata> getCurrentStaticMetadata() {
        U();
        return this.c.getCurrentStaticMetadata();
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        U();
        return this.c.getCurrentTimeline();
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackGroupArray getCurrentTrackGroups() {
        U();
        return this.c.getCurrentTrackGroups();
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionArray getCurrentTrackSelections() {
        U();
        return this.c.getCurrentTrackSelections();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentWindowIndex() {
        U();
        return this.c.getCurrentWindowIndex();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.DeviceComponent getDeviceComponent() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Player
    public DeviceInfo getDeviceInfo() {
        U();
        return this.R;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getDeviceVolume() {
        U();
        return this.n.g();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        U();
        return this.c.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getMaxSeekToPreviousPosition() {
        U();
        return this.c.getMaxSeekToPreviousPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getMediaMetadata() {
        return this.c.getMediaMetadata();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.MetadataComponent getMetadataComponent() {
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        U();
        return this.c.getPauseAtEndOfMediaItems();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        U();
        return this.c.getPlayWhenReady();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.c.getPlaybackLooper();
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        U();
        return this.c.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        U();
        return this.c.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        U();
        return this.c.getPlaybackSuppressionReason();
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
        return this.c.getPlaylistMetadata();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
        U();
        return this.c.getRendererCount();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int index) {
        U();
        return this.c.getRendererType(index);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        U();
        return this.c.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
        U();
        return this.c.getSeekBackIncrement();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
        U();
        return this.c.getSeekForwardIncrement();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public SeekParameters getSeekParameters() {
        U();
        return this.c.getSeekParameters();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        U();
        return this.c.getShuffleModeEnabled();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        return this.I;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.TextComponent getTextComponent() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        U();
        return this.c.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public TrackSelector getTrackSelector() {
        U();
        return this.c.getTrackSelector();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.VideoComponent getVideoComponent() {
        return this;
    }

    @Nullable
    public DecoderCounters getVideoDecoderCounters() {
        return this.D;
    }

    @Nullable
    public Format getVideoFormat() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        return this.A;
    }

    @Override // com.google.android.exoplayer2.Player
    public VideoSize getVideoSize() {
        return this.S;
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
        return this.H;
    }

    @Override // com.google.android.exoplayer2.Player
    public void increaseDeviceVolume() {
        U();
        this.n.i();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isDeviceMuted() {
        U();
        return this.n.j();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        U();
        return this.c.isLoading();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        U();
        return this.c.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int fromIndex, int toIndex, int newIndex) {
        U();
        this.c.moveMediaItems(fromIndex, toIndex, newIndex);
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        U();
        boolean playWhenReady = getPlayWhenReady();
        int iQ = this.m.q(playWhenReady, 2);
        S(playWhenReady, iQ, I(playWhenReady, iQ));
        this.c.prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        AudioTrack audioTrack;
        U();
        if (Util.SDK_INT < 21 && (audioTrack = this.t) != null) {
            audioTrack.release();
            this.t = null;
        }
        this.l.b(false);
        this.n.k();
        this.o.b(false);
        this.p.b(false);
        this.m.j();
        this.c.release();
        this.k.release();
        M();
        Surface surface = this.v;
        if (surface != null) {
            surface.release();
            this.v = null;
        }
        if (this.P) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.O)).remove(0);
            this.P = false;
        }
        this.J = Collections.emptyList();
        this.Q = true;
    }

    public void removeAnalyticsListener(AnalyticsListener listener) {
        this.k.removeListener(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    @Deprecated
    public void removeAudioListener(AudioListener listener) {
        this.g.remove(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
        this.c.removeAudioOffloadListener(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public void removeDeviceListener(DeviceListener listener) {
        this.j.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
        Assertions.checkNotNull(listener);
        removeAudioListener(listener);
        removeVideoListener(listener);
        removeTextOutput(listener);
        removeMetadataOutput(listener);
        removeDeviceListener(listener);
        removeListener((Player.EventListener) listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int fromIndex, int toIndex) {
        U();
        this.c.removeMediaItems(fromIndex, toIndex);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.MetadataComponent
    @Deprecated
    public void removeMetadataOutput(MetadataOutput output) {
        this.i.remove(output);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.TextComponent
    @Deprecated
    public void removeTextOutput(TextOutput listener) {
        this.h.remove(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    @Deprecated
    public void removeVideoListener(VideoListener listener) {
        this.f.remove(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void retry() {
        U();
        prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int windowIndex, long positionMs) {
        U();
        this.k.notifySeekStarted();
        this.c.seekTo(windowIndex, positionMs);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean handleAudioFocus) {
        U();
        if (this.Q) {
            return;
        }
        if (!Util.areEqual(this.G, audioAttributes)) {
            this.G = audioAttributes;
            N(1, 3, audioAttributes);
            this.n.m(Util.getStreamTypeForAudioUsage(audioAttributes.usage));
            this.k.onAudioAttributesChanged(audioAttributes);
            Iterator<AudioListener> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().onAudioAttributesChanged(audioAttributes);
            }
        }
        AudioFocusManager audioFocusManager = this.m;
        if (!handleAudioFocus) {
            audioAttributes = null;
        }
        audioFocusManager.n(audioAttributes);
        boolean playWhenReady = getPlayWhenReady();
        int iQ = this.m.q(playWhenReady, getPlaybackState());
        S(playWhenReady, iQ, I(playWhenReady, iQ));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(int audioSessionId) {
        U();
        if (this.F == audioSessionId) {
            return;
        }
        if (audioSessionId == 0) {
            audioSessionId = Util.SDK_INT < 21 ? J(0) : C.generateAudioSessionIdV21(this.b);
        } else if (Util.SDK_INT < 21) {
            J(audioSessionId);
        }
        this.F = audioSessionId;
        N(1, 102, Integer.valueOf(audioSessionId));
        N(2, 102, Integer.valueOf(audioSessionId));
        this.k.onAudioSessionIdChanged(audioSessionId);
        Iterator<AudioListener> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().onAudioSessionIdChanged(audioSessionId);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        U();
        N(1, 5, auxEffectInfo);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener listener) {
        U();
        this.L = listener;
        this.c.createMessage(this.e).setType(7).setPayload(listener).send();
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceMuted(boolean muted) {
        U();
        this.n.l(muted);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceVolume(int volume) {
        U();
        this.n.n(volume);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean foregroundMode) {
        U();
        this.c.setForegroundMode(foregroundMode);
    }

    public void setHandleAudioBecomingNoisy(boolean handleAudioBecomingNoisy) {
        U();
        if (this.Q) {
            return;
        }
        this.l.b(handleAudioBecomingNoisy);
    }

    @Deprecated
    public void setHandleWakeLock(boolean z) {
        setWakeMode(z ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, boolean resetPosition) {
        U();
        this.c.setMediaItems(mediaItems, resetPosition);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        U();
        this.c.setMediaSource(mediaSource);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources) {
        U();
        this.c.setMediaSources(mediaSources);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems) {
        U();
        this.c.setPauseAtEndOfMediaItems(pauseAtEndOfMediaItems);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean playWhenReady) {
        U();
        int iQ = this.m.q(playWhenReady, getPlaybackState());
        S(playWhenReady, iQ, I(playWhenReady, iQ));
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        U();
        this.c.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.c.setPlaylistMetadata(mediaMetadata);
    }

    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        U();
        if (Util.areEqual(this.O, priorityTaskManager)) {
            return;
        }
        if (this.P) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.O)).remove(0);
        }
        if (priorityTaskManager == null || !isLoading()) {
            this.P = false;
        } else {
            priorityTaskManager.add(0);
            this.P = true;
        }
        this.O = priorityTaskManager;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int repeatMode) {
        U();
        this.c.setRepeatMode(repeatMode);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
        U();
        this.c.setSeekParameters(seekParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean shuffleModeEnabled) {
        U();
        this.c.setShuffleModeEnabled(shuffleModeEnabled);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        U();
        this.c.setShuffleOrder(shuffleOrder);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean skipSilenceEnabled) {
        U();
        if (this.I == skipSilenceEnabled) {
            return;
        }
        this.I = skipSilenceEnabled;
        N(1, 101, Boolean.valueOf(skipSilenceEnabled));
        L();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean throwsWhenUsingWrongThread) {
        this.M = throwsWhenUsingWrongThread;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener listener) {
        U();
        this.K = listener;
        this.c.createMessage(this.e).setType(6).setPayload(listener).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int videoScalingMode) {
        U();
        this.A = videoScalingMode;
        N(2, 4, Integer.valueOf(videoScalingMode));
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurface(@Nullable Surface surface) {
        U();
        M();
        R(surface);
        int i = surface == null ? 0 : -1;
        K(i, i);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        U();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        M();
        this.y = true;
        this.w = surfaceHolder;
        surfaceHolder.addCallback(this.d);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            R(null);
            K(0, 0);
        } else {
            R(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            K(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        U();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            M();
            R(surfaceView);
            P(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            M();
            this.x = (SphericalGLSurfaceView) surfaceView;
            this.c.createMessage(this.e).setType(10000).setPayload(this.x).send();
            this.x.addVideoSurfaceListener(this.d);
            R(this.x.getVideoSurface());
            P(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        U();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        M();
        this.z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w(T, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.d);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            R(null);
            K(0, 0);
        } else {
            Q(surfaceTexture);
            K(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float audioVolume) {
        U();
        float fConstrainValue = Util.constrainValue(audioVolume, 0.0f, 1.0f);
        if (this.H == fConstrainValue) {
            return;
        }
        this.H = fConstrainValue;
        O();
        this.k.onVolumeChanged(fConstrainValue);
        Iterator<AudioListener> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().onVolumeChanged(fConstrainValue);
        }
    }

    public void setWakeMode(int wakeMode) {
        U();
        if (wakeMode == 0) {
            this.o.a(false);
            this.p.a(false);
        } else if (wakeMode == 1) {
            this.o.a(true);
            this.p.a(false);
        } else {
            if (wakeMode != 2) {
                return;
            }
            this.o.a(true);
            this.p.a(true);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void stop(boolean reset) {
        U();
        this.m.q(getPlayWhenReady(), 1);
        this.c.stop(reset);
        this.J = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
        U();
        return this.c.getPlayerError();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int index, MediaSource mediaSource) {
        U();
        this.c.addMediaSource(index, mediaSource);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int index, List<MediaSource> mediaSources) {
        U();
        this.c.addMediaSources(index, mediaSources);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs) {
        U();
        this.c.setMediaItems(mediaItems, startWindowIndex, startPositionMs);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean resetPosition) {
        U();
        this.c.setMediaSource(mediaSource, resetPosition);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, boolean resetPosition) {
        U();
        this.c.setMediaSources(mediaSources, resetPosition);
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        U();
        if (surface == null || surface != this.u) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long startPositionMs) {
        U();
        this.c.setMediaSource(mediaSource, startPositionMs);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs) {
        U();
        this.c.setMediaSources(mediaSources, startWindowIndex, startPositionMs);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void addListener(Player.EventListener listener) {
        Assertions.checkNotNull(listener);
        this.c.addListener(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean resetPosition, boolean resetState) {
        U();
        setMediaSources(Collections.singletonList(mediaSource), resetPosition);
        prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void removeListener(Player.EventListener listener) {
        this.c.removeListener(listener);
    }

    public SimpleExoPlayer(Builder builder) throws Throwable {
        SimpleExoPlayer simpleExoPlayer;
        ConditionVariable conditionVariable = new ConditionVariable();
        this.a = conditionVariable;
        try {
            Context applicationContext = builder.a.getApplicationContext();
            this.b = applicationContext;
            AnalyticsCollector analyticsCollector = builder.i;
            this.k = analyticsCollector;
            this.O = builder.k;
            this.G = builder.l;
            this.A = builder.q;
            this.I = builder.p;
            this.q = builder.x;
            b bVar = new b();
            this.d = bVar;
            c cVar = new c();
            this.e = cVar;
            this.f = new CopyOnWriteArraySet<>();
            this.g = new CopyOnWriteArraySet<>();
            this.h = new CopyOnWriteArraySet<>();
            this.i = new CopyOnWriteArraySet<>();
            this.j = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(builder.j);
            Renderer[] rendererArrCreateRenderers = builder.b.createRenderers(handler, bVar, bVar, bVar, bVar);
            this.renderers = rendererArrCreateRenderers;
            this.H = 1.0f;
            if (Util.SDK_INT < 21) {
                this.F = J(0);
            } else {
                this.F = C.generateAudioSessionIdV21(applicationContext);
            }
            this.J = Collections.emptyList();
            this.M = true;
            try {
                c0 c0Var = new c0(rendererArrCreateRenderers, builder.e, builder.f, builder.g, builder.h, analyticsCollector, builder.r, builder.s, builder.t, builder.u, builder.v, builder.w, builder.y, builder.c, builder.j, this, new Player.Commands.Builder().addAll(20, 21, 22, 23, 24, 25, 26, 27).build());
                simpleExoPlayer = this;
                try {
                    simpleExoPlayer.c = c0Var;
                    c0Var.addListener(bVar);
                    c0Var.addAudioOffloadListener(bVar);
                    if (builder.d > 0) {
                        c0Var.E(builder.d);
                    }
                    AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.a, handler, bVar);
                    simpleExoPlayer.l = audioBecomingNoisyManager;
                    audioBecomingNoisyManager.b(builder.o);
                    AudioFocusManager audioFocusManager = new AudioFocusManager(builder.a, handler, bVar);
                    simpleExoPlayer.m = audioFocusManager;
                    audioFocusManager.n(builder.m ? simpleExoPlayer.G : null);
                    StreamVolumeManager streamVolumeManager = new StreamVolumeManager(builder.a, handler, bVar);
                    simpleExoPlayer.n = streamVolumeManager;
                    streamVolumeManager.m(Util.getStreamTypeForAudioUsage(simpleExoPlayer.G.usage));
                    s0 s0Var = new s0(builder.a);
                    simpleExoPlayer.o = s0Var;
                    s0Var.a(builder.n != 0);
                    t0 t0Var = new t0(builder.a);
                    simpleExoPlayer.p = t0Var;
                    t0Var.a(builder.n == 2);
                    simpleExoPlayer.R = H(streamVolumeManager);
                    simpleExoPlayer.S = VideoSize.UNKNOWN;
                    simpleExoPlayer.N(1, 102, Integer.valueOf(simpleExoPlayer.F));
                    simpleExoPlayer.N(2, 102, Integer.valueOf(simpleExoPlayer.F));
                    simpleExoPlayer.N(1, 3, simpleExoPlayer.G);
                    simpleExoPlayer.N(2, 4, Integer.valueOf(simpleExoPlayer.A));
                    simpleExoPlayer.N(1, 101, Boolean.valueOf(simpleExoPlayer.I));
                    simpleExoPlayer.N(2, 6, cVar);
                    simpleExoPlayer.N(6, 7, cVar);
                    conditionVariable.open();
                } catch (Throwable th) {
                    th = th;
                    simpleExoPlayer.a.open();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                simpleExoPlayer = this;
            }
        } catch (Throwable th3) {
            th = th3;
            simpleExoPlayer = this;
        }
    }
}
