package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    public interface AudioComponent {
        @Deprecated
        void addAudioListener(AudioListener listener);

        void clearAuxEffectInfo();

        AudioAttributes getAudioAttributes();

        int getAudioSessionId();

        boolean getSkipSilenceEnabled();

        float getVolume();

        @Deprecated
        void removeAudioListener(AudioListener listener);

        void setAudioAttributes(AudioAttributes audioAttributes, boolean handleAudioFocus);

        void setAudioSessionId(int audioSessionId);

        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        void setSkipSilenceEnabled(boolean skipSilenceEnabled);

        void setVolume(float audioVolume);
    }

    public interface AudioOffloadListener {
        void onExperimentalOffloadSchedulingEnabledChanged(boolean offloadSchedulingEnabled);

        void onExperimentalSleepingForOffloadChanged(boolean sleepingForOffload);
    }

    public interface DeviceComponent {
        @Deprecated
        void addDeviceListener(DeviceListener listener);

        void decreaseDeviceVolume();

        DeviceInfo getDeviceInfo();

        int getDeviceVolume();

        void increaseDeviceVolume();

        boolean isDeviceMuted();

        @Deprecated
        void removeDeviceListener(DeviceListener listener);

        void setDeviceMuted(boolean muted);

        void setDeviceVolume(int volume);
    }

    public interface MetadataComponent {
        @Deprecated
        void addMetadataOutput(MetadataOutput output);

        @Deprecated
        void removeMetadataOutput(MetadataOutput output);
    }

    public interface TextComponent {
        @Deprecated
        void addTextOutput(TextOutput listener);

        List<Cue> getCurrentCues();

        @Deprecated
        void removeTextOutput(TextOutput listener);
    }

    public interface VideoComponent {
        @Deprecated
        void addVideoListener(VideoListener listener);

        void clearCameraMotionListener(CameraMotionListener listener);

        void clearVideoFrameMetadataListener(VideoFrameMetadataListener listener);

        void clearVideoSurface();

        void clearVideoSurface(@Nullable Surface surface);

        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void clearVideoTextureView(@Nullable TextureView textureView);

        int getVideoScalingMode();

        VideoSize getVideoSize();

        @Deprecated
        void removeVideoListener(VideoListener listener);

        void setCameraMotionListener(CameraMotionListener listener);

        void setVideoFrameMetadataListener(VideoFrameMetadataListener listener);

        void setVideoScalingMode(int videoScalingMode);

        void setVideoSurface(@Nullable Surface surface);

        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addAudioOffloadListener(AudioOffloadListener listener);

    void addMediaSource(int index, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int index, List<MediaSource> mediaSources);

    void addMediaSources(List<MediaSource> mediaSources);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled);

    @Nullable
    AudioComponent getAudioComponent();

    Clock getClock();

    @Nullable
    DeviceComponent getDeviceComponent();

    @Nullable
    MetadataComponent getMetadataComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    ExoPlaybackException getPlayerError();

    @Override // com.google.android.exoplayer2.Player
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    int getRendererCount();

    int getRendererType(int index);

    SeekParameters getSeekParameters();

    @Nullable
    TextComponent getTextComponent();

    @Nullable
    TrackSelector getTrackSelector();

    @Nullable
    VideoComponent getVideoComponent();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean resetPosition, boolean resetState);

    void removeAudioOffloadListener(AudioOffloadListener listener);

    @Deprecated
    void retry();

    void setForegroundMode(boolean foregroundMode);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long startPositionMs);

    void setMediaSource(MediaSource mediaSource, boolean resetPosition);

    void setMediaSources(List<MediaSource> mediaSources);

    void setMediaSources(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs);

    void setMediaSources(List<MediaSource> mediaSources, boolean resetPosition);

    void setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems);

    void setSeekParameters(@Nullable SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @Deprecated
    public static final class Builder {
        private final Renderer[] a;
        private Clock b;
        private TrackSelector c;
        private MediaSourceFactory d;
        private LoadControl e;
        private BandwidthMeter f;
        private Looper g;

        @Nullable
        private AnalyticsCollector h;
        private boolean i;
        private SeekParameters j;
        private boolean k;
        private long l;
        private LivePlaybackSpeedControl m;
        private boolean n;
        private long o;

        public Builder(Context context, Renderer... renderers) {
            this(renderers, new DefaultTrackSelector(context), new DefaultMediaSourceFactory(context), new DefaultLoadControl(), DefaultBandwidthMeter.getSingletonInstance(context));
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.n);
            this.n = true;
            c0 c0Var = new c0(this.a, this.c, this.d, this.e, this.f, this.h, this.i, this.j, 5000L, 15000L, this.m, this.l, this.k, this.b, this.g, null, Player.Commands.EMPTY);
            long j = this.o;
            if (j > 0) {
                c0Var.E(j);
            }
            return c0Var;
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long timeoutMs) {
            Assertions.checkState(!this.n);
            this.o = timeoutMs;
            return this;
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.n);
            this.h = analyticsCollector;
            return this;
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.n);
            this.f = bandwidthMeter;
            return this;
        }

        @VisibleForTesting
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.n);
            this.b = clock;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.n);
            this.m = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl) {
            Assertions.checkState(!this.n);
            this.e = loadControl;
            return this;
        }

        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.n);
            this.g = looper;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
            Assertions.checkState(!this.n);
            this.d = mediaSourceFactory;
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems) {
            Assertions.checkState(!this.n);
            this.k = pauseAtEndOfMediaItems;
            return this;
        }

        public Builder setReleaseTimeoutMs(long releaseTimeoutMs) {
            Assertions.checkState(!this.n);
            this.l = releaseTimeoutMs;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.n);
            this.j = seekParameters;
            return this;
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
            Assertions.checkState(!this.n);
            this.c = trackSelector;
            return this;
        }

        public Builder setUseLazyPreparation(boolean useLazyPreparation) {
            Assertions.checkState(!this.n);
            this.i = useLazyPreparation;
            return this;
        }

        public Builder(Renderer[] renderers, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter) {
            Assertions.checkArgument(renderers.length > 0);
            this.a = renderers;
            this.c = trackSelector;
            this.d = mediaSourceFactory;
            this.e = loadControl;
            this.f = bandwidthMeter;
            this.g = Util.getCurrentOrMainLooper();
            this.i = true;
            this.j = SeekParameters.DEFAULT;
            this.m = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.b = Clock.DEFAULT;
            this.l = 500L;
        }
    }
}
