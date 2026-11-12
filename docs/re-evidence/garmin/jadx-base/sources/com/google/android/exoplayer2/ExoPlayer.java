package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z14);

        @Deprecated
        void setAudioSessionId(int i14);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z14);

        @Deprecated
        void setVolume(float f14);
    }

    public interface AudioOffloadListener {
        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z14) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z14) {
        }
    }

    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z14);

        @Deprecated
        void setDeviceVolume(int i14);
    }

    @Deprecated
    public interface TextComponent {
        @Deprecated
        List<Cue> getCurrentCues();
    }

    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i14);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i14);

        @Deprecated
        void setVideoSurface(Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i14, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i14, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z14);

    AnalyticsCollector getAnalyticsCollector();

    @Deprecated
    AudioComponent getAudioComponent();

    DecoderCounters getAudioDecoderCounters();

    Format getAudioFormat();

    int getAudioSessionId();

    Clock getClock();

    @Deprecated
    DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    ExoPlaybackException getPlayerError();

    Renderer getRenderer(int i14);

    int getRendererCount();

    int getRendererType(int i14);

    SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @Deprecated
    TextComponent getTextComponent();

    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    VideoComponent getVideoComponent();

    DecoderCounters getVideoDecoderCounters();

    Format getVideoFormat();

    int getVideoScalingMode();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z14, boolean z15);

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Deprecated
    void retry();

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z14);

    void setAudioSessionId(int i14);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z14);

    void setHandleAudioBecomingNoisy(boolean z14);

    @Deprecated
    void setHandleWakeLock(boolean z14);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j8);

    void setMediaSource(MediaSource mediaSource, boolean z14);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i14, long j8);

    void setMediaSources(List<MediaSource> list, boolean z14);

    void setPauseAtEndOfMediaItems(boolean z14);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    void setSeekParameters(SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z14);

    void setVideoChangeFrameRateStrategy(int i14);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i14);

    void setWakeMode(int i14);

    public static final class Builder {
        Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        Supplier<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier<LoadControl> loadControlSupplier;
        Looper looper;
        Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        Supplier<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        Supplier<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2, Supplier<TrackSelector> supplier3, Supplier<LoadControl> supplier4, Supplier<BandwidthMeter> supplier5, Function<Clock, AnalyticsCollector> function) {
            this.context = context;
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long j8) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j8;
            return this;
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            this.analyticsCollectorFunction = new f(analyticsCollector, 1);
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z14) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = audioAttributes;
            this.handleAudioFocus = z14;
            return this;
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            this.bandwidthMeterSupplier = new e(bandwidthMeter, 1);
            return this;
        }

        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j8) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j8;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z14) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z14;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            this.loadControlSupplier = new d(loadControl, 0);
            return this;
        }

        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.looper = looper;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            this.mediaSourceFactorySupplier = new j(factory, 1);
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z14) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z14;
            return this;
        }

        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setReleaseTimeoutMs(long j8) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j8;
            return this;
        }

        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            this.renderersFactorySupplier = new h(renderersFactory, 1);
            return this;
        }

        public Builder setSeekBackIncrementMs(long j8) {
            Assertions.checkArgument(j8 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j8;
            return this;
        }

        public Builder setSeekForwardIncrementMs(long j8) {
            Assertions.checkArgument(j8 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j8;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z14) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z14;
            return this;
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            this.trackSelectorSupplier = new g(trackSelector, 0);
            return this;
        }

        public Builder setUseLazyPreparation(boolean z14) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z14;
            return this;
        }

        public Builder setVideoChangeFrameRateStrategy(int i14) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i14;
            return this;
        }

        public Builder setVideoScalingMode(int i14) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i14;
            return this;
        }

        public Builder setWakeMode(int i14) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i14;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final Context context, RenderersFactory renderersFactory) {
            final int i14 = 0;
            this(context, new h(renderersFactory, i14), (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return ExoPlayer.Builder.lambda$new$3(context);
                        case 1:
                            return ExoPlayer.Builder.lambda$new$4(context);
                        case 2:
                            return ExoPlayer.Builder.lambda$new$14(context);
                        case 3:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        case 4:
                            return ExoPlayer.Builder.lambda$new$0(context);
                        default:
                            return ExoPlayer.Builder.lambda$new$1(context);
                    }
                }
            });
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final Context context, MediaSource.Factory factory) {
            final int i14 = 1;
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return ExoPlayer.Builder.lambda$new$3(context);
                        case 1:
                            return ExoPlayer.Builder.lambda$new$4(context);
                        case 2:
                            return ExoPlayer.Builder.lambda$new$14(context);
                        case 3:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        case 4:
                            return ExoPlayer.Builder.lambda$new$0(context);
                        default:
                            return ExoPlayer.Builder.lambda$new$1(context);
                    }
                }
            }, new j(factory, 0));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory) {
            int i14 = 2;
            this(context, new h(renderersFactory, i14), new j(factory, i14));
        }

        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
            h hVar = new h(renderersFactory, 3);
            j jVar = new j(factory, 3);
            int i14 = 1;
            g gVar = new g(trackSelector, i14);
            d dVar = new d(loadControl, i14);
            int i15 = 0;
            this(context, hVar, jVar, gVar, dVar, new e(bandwidthMeter, i15), new f(analyticsCollector, i15));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Builder(final Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
            final int i14 = 2;
            final int i15 = 3;
            this(context, supplier, supplier2, (Supplier<TrackSelector>) new Supplier() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return ExoPlayer.Builder.lambda$new$3(context);
                        case 1:
                            return ExoPlayer.Builder.lambda$new$4(context);
                        case 2:
                            return ExoPlayer.Builder.lambda$new$14(context);
                        case 3:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        case 4:
                            return ExoPlayer.Builder.lambda$new$0(context);
                        default:
                            return ExoPlayer.Builder.lambda$new$1(context);
                    }
                }
            }, new k(), (Supplier<BandwidthMeter>) new Supplier() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i15) {
                        case 0:
                            return ExoPlayer.Builder.lambda$new$3(context);
                        case 1:
                            return ExoPlayer.Builder.lambda$new$4(context);
                        case 2:
                            return ExoPlayer.Builder.lambda$new$14(context);
                        case 3:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        case 4:
                            return ExoPlayer.Builder.lambda$new$0(context);
                        default:
                            return ExoPlayer.Builder.lambda$new$1(context);
                    }
                }
            }, new l());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final Context context) {
            final int i14 = 4;
            final int i15 = 5;
            this(context, (Supplier<RenderersFactory>) new Supplier() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return ExoPlayer.Builder.lambda$new$3(context);
                        case 1:
                            return ExoPlayer.Builder.lambda$new$4(context);
                        case 2:
                            return ExoPlayer.Builder.lambda$new$14(context);
                        case 3:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        case 4:
                            return ExoPlayer.Builder.lambda$new$0(context);
                        default:
                            return ExoPlayer.Builder.lambda$new$1(context);
                    }
                }
            }, (Supplier<MediaSource.Factory>) new Supplier() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i15) {
                        case 0:
                            return ExoPlayer.Builder.lambda$new$3(context);
                        case 1:
                            return ExoPlayer.Builder.lambda$new$4(context);
                        case 2:
                            return ExoPlayer.Builder.lambda$new$14(context);
                        case 3:
                            return DefaultBandwidthMeter.getSingletonInstance(context);
                        case 4:
                            return ExoPlayer.Builder.lambda$new$0(context);
                        default:
                            return ExoPlayer.Builder.lambda$new$1(context);
                    }
                }
            });
        }
    }
}
