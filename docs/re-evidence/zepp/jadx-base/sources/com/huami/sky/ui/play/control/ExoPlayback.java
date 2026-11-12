package com.huami.sky.ui.play.control;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001f\u00102\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b$\u00101¨\u00066"}, d2 = {"Lcom/huami/sky/ui/play/control/ExoPlayback;", "Lcom/huami/sky/ui/play/control/IPlayback;", "", "a", "", "musicUrl", "play", "restart", "pause", Command.STOP, "release", "", "volume", "setVolume", "getVolume", "", "getDuration", "getCurrentPosition", "", "getDurations", "getCurrentPositions", "getLeftTime", "Lcom/huami/sky/ui/play/control/IPlayback$ICallback;", "callback", "setCallback", "", "playerRestartEnable", "isPlayerPlaying", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onFocusChangeListener", "requestAudioFocus", "abandonAudioFocus", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "b", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "exoPlayer", "c", "Lcom/huami/sky/ui/play/control/IPlayback$ICallback;", "playCallback", "Landroid/media/AudioFocusRequest;", GoogleApiAvailabilityLight.a, "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioManager;", "e", "Lkotlin/Lazy;", "()Landroid/media/AudioManager;", "audioManager", "<init>", "(Landroid/content/Context;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ExoPlayback implements IPlayback {
    private static final int f = 1000;

    @NotNull
    private static final String g = "ExoPlayback";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SimpleExoPlayer exoPlayer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private IPlayback.ICallback playCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private AudioFocusRequest audioFocusRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioManager = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/media/AudioManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AudioManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AudioManager invoke() {
            Object systemService = ExoPlayback.this.context.getSystemService("audio");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    public ExoPlayback(@NotNull Context context) {
        this.context = context;
    }

    private final void a() {
        DefaultRenderersFactory extensionRendererMode = new DefaultRenderersFactory(this.context).setExtensionRendererMode(2);
        DefaultTrackSelector.Parameters parametersBuild = new DefaultTrackSelector.ParametersBuilder(this.context).build();
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.context);
        defaultTrackSelector.setParameters(parametersBuild);
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(this.context, extensionRendererMode).setTrackSelector(defaultTrackSelector).build();
        this.exoPlayer = simpleExoPlayerBuild;
        if (simpleExoPlayerBuild != null) {
            simpleExoPlayerBuild.setAudioAttributes(AudioAttributes.DEFAULT, false);
        }
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.addListener(new Player.Listener() { // from class: com.huami.sky.ui.play.control.ExoPlayback$createPlayer$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ PlaybackException a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(PlaybackException playbackException) {
                    super(0);
                    this.a = playbackException;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "播放器播放异常：" + this.a.getErrorCodeName();
                }
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
            public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                n0.a(this, audioAttributes);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
            public /* synthetic */ void onAudioSessionIdChanged(int i) {
                n0.b(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                n0.c(this, commands);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
            public /* synthetic */ void onCues(List list) {
                n0.d(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
            public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                n0.e(this, deviceInfo);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
            public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                n0.f(this, i, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onEvents(Player player, Player.Events events) {
                n0.g(this, player, events);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onIsLoadingChanged(boolean z) {
                n0.h(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public void onIsPlayingChanged(boolean isPlaying) {
                IPlayback.ICallback iCallback;
                n0.i(this, isPlaying);
                if (!isPlaying || (iCallback = this.a.playCallback) == null) {
                    return;
                }
                iCallback.onPlayStart();
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onLoadingChanged(boolean z) {
                m0.e(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
                m0.f(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                n0.j(this, mediaItem, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                n0.k(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
            public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
                n0.l(this, metadata);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                n0.m(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                n0.n(this, playbackParameters);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public void onPlaybackStateChanged(int playbackState) {
                IPlayback.ICallback iCallback;
                n0.o(this, playbackState);
                if (playbackState != 4 || (iCallback = this.a.playCallback) == null) {
                    return;
                }
                iCallback.onPlayEnd();
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                n0.p(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public void onPlayerError(@NotNull PlaybackException error) {
                n0.q(this, error);
                HMLog.info("ExoPlayback", new a(error));
                IPlayback.ICallback iCallback = this.a.playCallback;
                if (iCallback == null) {
                    return;
                }
                iCallback.onPlayError();
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                n0.r(this, playbackException);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                m0.o(this, z, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                n0.s(this, mediaMetadata);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPositionDiscontinuity(int i) {
                m0.q(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                n0.t(this, positionInfo, positionInfo2, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
            public /* synthetic */ void onRenderedFirstFrame() {
                n0.u(this);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onRepeatModeChanged(int i) {
                n0.v(this, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onSeekBackIncrementChanged(long j) {
                n0.w(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                n0.x(this, j);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onSeekProcessed() {
                m0.v(this);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                n0.y(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                n0.z(this, z);
            }

            @Override // com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onStaticMetadataChanged(List list) {
                m0.x(this, list);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
            public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                n0.A(this, i, i2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                n0.B(this, timeline, i);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
            public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
                n0.C(this, trackGroupArray, trackSelectionArray);
            }

            @Override // com.google.android.exoplayer2.video.VideoListener
            public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f2) {
                b.c(this, i, i2, i3, f2);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
            public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                n0.D(this, videoSize);
            }

            @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
            public /* synthetic */ void onVolumeChanged(float f2) {
                n0.E(this, f2);
            }
        });
    }

    private final AudioManager b() {
        return (AudioManager) this.audioManager.getValue();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void abandonAudioFocus(@NotNull AudioManager.OnAudioFocusChangeListener onFocusChangeListener) {
        AudioManager audioManagerB;
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManagerB2 = b();
            if (audioManagerB2 == null) {
                return;
            }
            audioManagerB2.abandonAudioFocus(onFocusChangeListener);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || (audioManagerB = b()) == null) {
            return;
        }
        audioManagerB.abandonAudioFocusRequest(audioFocusRequest);
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public long getCurrentPosition() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return 0L;
        }
        return simpleExoPlayer.getCurrentPosition();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public int getCurrentPositions() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        return (int) ((simpleExoPlayer == null ? 0L : simpleExoPlayer.getCurrentPosition()) / ((long) 1000));
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public long getDuration() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return 0L;
        }
        return simpleExoPlayer.getDuration();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public int getDurations() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        return (int) ((simpleExoPlayer == null ? 0L : simpleExoPlayer.getDuration()) / ((long) 1000));
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public int getLeftTime() {
        return getDurations() - getCurrentPositions();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public float getVolume() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return 1.0f;
        }
        return simpleExoPlayer.getVolume();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public boolean isPlayerPlaying() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        long duration = simpleExoPlayer == null ? 0L : simpleExoPlayer.getDuration();
        SimpleExoPlayer simpleExoPlayer2 = this.exoPlayer;
        return duration - (simpleExoPlayer2 == null ? 0L : simpleExoPlayer2.getCurrentPosition()) > 0;
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void pause() {
        SimpleExoPlayer simpleExoPlayer;
        SimpleExoPlayer simpleExoPlayer2 = this.exoPlayer;
        boolean z = false;
        if (simpleExoPlayer2 != null && simpleExoPlayer2.isPlaying()) {
            z = true;
        }
        if (!z || (simpleExoPlayer = this.exoPlayer) == null) {
            return;
        }
        simpleExoPlayer.pause();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void play(@NotNull String musicUrl) {
        if (this.exoPlayer == null) {
            a();
        }
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return;
        }
        MediaItem mediaItemFromUri = MediaItem.fromUri(musicUrl);
        Context context = this.context;
        simpleExoPlayer.setMediaSource(new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory(this.context, new DefaultHttpDataSource.Factory().setUserAgent(Util.getUserAgent(context, context.getPackageName())).setConnectTimeoutMs(8000).setReadTimeoutMs(8000).setAllowCrossProtocolRedirects(true))).createMediaSource(mediaItemFromUri));
        simpleExoPlayer.prepare();
        simpleExoPlayer.play();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public boolean playerRestartEnable() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (!(simpleExoPlayer != null && simpleExoPlayer.isPlaying())) {
            SimpleExoPlayer simpleExoPlayer2 = this.exoPlayer;
            if (simpleExoPlayer2 != null && simpleExoPlayer2.getPlaybackState() == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void release() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
        }
        this.exoPlayer = null;
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void requestAudioFocus(@NotNull AudioManager.OnAudioFocusChangeListener onFocusChangeListener) {
        AudioManager audioManagerB;
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManagerB2 = b();
            if (audioManagerB2 == null) {
                return;
            }
            audioManagerB2.requestAudioFocus(onFocusChangeListener, 3, 1);
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onFocusChangeListener).build();
        this.audioFocusRequest = audioFocusRequestBuild;
        if (audioFocusRequestBuild == null || (audioManagerB = b()) == null) {
            return;
        }
        audioManagerB.requestAudioFocus(audioFocusRequestBuild);
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void restart() {
        SimpleExoPlayer simpleExoPlayer;
        if (!playerRestartEnable() || (simpleExoPlayer = this.exoPlayer) == null) {
            return;
        }
        simpleExoPlayer.play();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void setCallback(@NotNull IPlayback.ICallback callback) {
        this.playCallback = callback;
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void setVolume(float volume) {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(volume);
    }

    @Override // com.huami.sky.ui.play.control.IPlayback
    public void stop() {
        SimpleExoPlayer simpleExoPlayer;
        SimpleExoPlayer simpleExoPlayer2 = this.exoPlayer;
        boolean z = false;
        if (simpleExoPlayer2 != null && simpleExoPlayer2.isPlaying()) {
            z = true;
        }
        if (!z || (simpleExoPlayer = this.exoPlayer) == null) {
            return;
        }
        simpleExoPlayer.stop();
    }
}
