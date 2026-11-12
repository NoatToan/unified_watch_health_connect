package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final int q0 = 1000;
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;

    @Nullable
    private Player G;
    private ControlDispatcher H;

    @Nullable
    private ProgressUpdateListener I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;
    private final b a;
    private final CopyOnWriteArrayList<VisibilityListener> b;

    @Nullable
    private final View c;

    @Nullable
    private final View d;

    @Nullable
    private final View e;

    @Nullable
    private final View f;

    @Nullable
    private final View g;

    @Nullable
    private final View h;

    @Nullable
    private final ImageView i;

    @Nullable
    private final ImageView j;

    @Nullable
    private final View k;

    @Nullable
    private final TextView l;

    @Nullable
    private final TextView m;
    private boolean[] m0;

    @Nullable
    private final TimeBar n;
    private long[] n0;
    private final StringBuilder o;
    private boolean[] o0;
    private final Formatter p;
    private long p0;
    private final Timeline.Period q;
    private final Timeline.Window r;
    private final Runnable s;
    private final Runnable t;
    private final Drawable u;
    private final Drawable v;
    private final Drawable w;
    private final String x;
    private final String y;
    private final String z;

    public interface ProgressUpdateListener {
        void onProgressUpdate(long position, long bufferedPosition);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int visibility);
    }

    public final class b implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        private b() {
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.G;
            if (player == null) {
                return;
            }
            if (PlayerControlView.this.d == view) {
                PlayerControlView.this.H.dispatchNext(player);
                return;
            }
            if (PlayerControlView.this.c == view) {
                PlayerControlView.this.H.dispatchPrevious(player);
                return;
            }
            if (PlayerControlView.this.g == view) {
                if (player.getPlaybackState() != 4) {
                    PlayerControlView.this.H.dispatchFastForward(player);
                    return;
                }
                return;
            }
            if (PlayerControlView.this.h == view) {
                PlayerControlView.this.H.dispatchRewind(player);
                return;
            }
            if (PlayerControlView.this.e == view) {
                PlayerControlView.this.B(player);
                return;
            }
            if (PlayerControlView.this.f == view) {
                PlayerControlView.this.A(player);
            } else if (PlayerControlView.this.i == view) {
                PlayerControlView.this.H.dispatchSetRepeatMode(player, RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.P));
            } else if (PlayerControlView.this.j == view) {
                PlayerControlView.this.H.dispatchSetShuffleModeEnabled(player, !player.getShuffleModeEnabled());
            }
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
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6)) {
                PlayerControlView.this.N();
            }
            if (events.containsAny(5, 6, 8)) {
                PlayerControlView.this.O();
            }
            if (events.contains(9)) {
                PlayerControlView.this.P();
            }
            if (events.contains(10)) {
                PlayerControlView.this.Q();
            }
            if (events.containsAny(9, 10, 12, 0)) {
                PlayerControlView.this.M();
            }
            if (events.containsAny(12, 0)) {
                PlayerControlView.this.R();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            n0.h(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            n0.i(this, z);
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
        public /* synthetic */ void onMetadata(Metadata metadata) {
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
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            n0.o(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            n0.p(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            n0.q(this, playbackException);
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

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long position) {
            if (PlayerControlView.this.m != null) {
                PlayerControlView.this.m.setText(Util.getStringForTime(PlayerControlView.this.o, PlayerControlView.this.p, position));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long position) {
            PlayerControlView.this.M = true;
            if (PlayerControlView.this.m != null) {
                PlayerControlView.this.m.setText(Util.getStringForTime(PlayerControlView.this.o, PlayerControlView.this.p, position));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long position, boolean canceled) {
            PlayerControlView.this.M = false;
            if (canceled || PlayerControlView.this.G == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.I(playerControlView.G, position);
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
        public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            com.google.android.exoplayer2.video.b.c(this, i, i2, i3, f);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            n0.D(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onVolumeChanged(float f) {
            n0.E(this, f);
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Player player) {
        this.H.dispatchSetPlayWhenReady(player, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            this.H.dispatchPrepare(player);
        } else if (playbackState == 4) {
            H(player, player.getCurrentWindowIndex(), C.TIME_UNSET);
        }
        this.H.dispatchSetPlayWhenReady(player, true);
    }

    private void C(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            B(player);
        } else {
            A(player);
        }
    }

    private static int D(TypedArray a2, int defaultValue) {
        return a2.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, defaultValue);
    }

    private void E() {
        removeCallbacks(this.t);
        if (this.N <= 0) {
            this.V = C.TIME_UNSET;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.N;
        this.V = jUptimeMillis + ((long) i);
        if (this.J) {
            postDelayed(this.t, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean F(int keyCode) {
        return keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88;
    }

    private void G() {
        View view;
        View view2;
        boolean zJ = J();
        if (!zJ && (view2 = this.e) != null) {
            view2.requestFocus();
        } else {
            if (!zJ || (view = this.f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private boolean H(Player player, int windowIndex, long positionMs) {
        return this.H.dispatchSeekTo(player, windowIndex, positionMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(Player player, long positionMs) {
        int currentWindowIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.L && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentWindowIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentWindowIndex, this.r).getDurationMs();
                if (positionMs < durationMs) {
                    break;
                }
                if (currentWindowIndex == windowCount - 1) {
                    positionMs = durationMs;
                    break;
                } else {
                    positionMs -= durationMs;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = player.getCurrentWindowIndex();
        }
        H(player, currentWindowIndex, positionMs);
        O();
    }

    private boolean J() {
        Player player = this.G;
        return (player == null || player.getPlaybackState() == 4 || this.G.getPlaybackState() == 1 || !this.G.getPlayWhenReady()) ? false : true;
    }

    private void K() {
        N();
        M();
        P();
        Q();
        R();
    }

    private void L(boolean visible, boolean enabled, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(enabled);
        view.setAlpha(enabled ? this.C : this.D);
        view.setVisibility(visible ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        boolean z;
        boolean zIsCommandAvailable;
        boolean z2;
        boolean z3;
        if (isVisible() && this.J) {
            Player player = this.G;
            boolean z4 = false;
            if (player != null) {
                boolean zIsCommandAvailable2 = player.isCommandAvailable(4);
                boolean zIsCommandAvailable3 = player.isCommandAvailable(6);
                z3 = player.isCommandAvailable(10) && this.H.isRewindEnabled();
                if (player.isCommandAvailable(11) && this.H.isFastForwardEnabled()) {
                    z4 = true;
                }
                zIsCommandAvailable = player.isCommandAvailable(8);
                z = z4;
                z4 = zIsCommandAvailable3;
                z2 = zIsCommandAvailable2;
            } else {
                z = false;
                zIsCommandAvailable = false;
                z2 = false;
                z3 = false;
            }
            L(this.S, z4, this.c);
            L(this.Q, z3, this.h);
            L(this.R, z, this.g);
            L(this.T, zIsCommandAvailable, this.d);
            TimeBar timeBar = this.n;
            if (timeBar != null) {
                timeBar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        boolean z;
        if (isVisible() && this.J) {
            boolean zJ = J();
            View view = this.e;
            if (view != null) {
                z = (zJ && view.isFocused()) | false;
                this.e.setVisibility(zJ ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= !zJ && view2.isFocused();
                this.f.setVisibility(zJ ? 0 : 8);
            }
            if (z) {
                G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        long contentBufferedPosition;
        if (isVisible() && this.J) {
            Player player = this.G;
            long contentPosition = 0;
            if (player != null) {
                contentPosition = this.p0 + player.getContentPosition();
                contentBufferedPosition = this.p0 + player.getContentBufferedPosition();
            } else {
                contentBufferedPosition = 0;
            }
            TextView textView = this.m;
            if (textView != null && !this.M) {
                textView.setText(Util.getStringForTime(this.o, this.p, contentPosition));
            }
            TimeBar timeBar = this.n;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.n.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.I;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.s);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.s, 1000L);
                return;
            }
            TimeBar timeBar2 = this.n;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.s, Util.constrainValue(f > 0.0f ? (long) (jMin / f) : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        ImageView imageView;
        if (isVisible() && this.J && (imageView = this.i) != null) {
            if (this.P == 0) {
                L(false, false, imageView);
                return;
            }
            Player player = this.G;
            if (player == null) {
                L(true, false, imageView);
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
                return;
            }
            L(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
            } else if (repeatMode == 1) {
                this.i.setImageDrawable(this.v);
                this.i.setContentDescription(this.y);
            } else if (repeatMode == 2) {
                this.i.setImageDrawable(this.w);
                this.i.setContentDescription(this.z);
            }
            this.i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ImageView imageView;
        if (isVisible() && this.J && (imageView = this.j) != null) {
            Player player = this.G;
            if (!this.U) {
                L(false, false, imageView);
                return;
            }
            if (player == null) {
                L(true, false, imageView);
                this.j.setImageDrawable(this.B);
                this.j.setContentDescription(this.F);
            } else {
                L(true, true, imageView);
                this.j.setImageDrawable(player.getShuffleModeEnabled() ? this.A : this.B);
                this.j.setContentDescription(player.getShuffleModeEnabled() ? this.E : this.F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    public void R() {
        int i;
        Timeline.Window window;
        long positionInWindowUs;
        long[] jArr;
        int length;
        Player player = this.G;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.L = this.K && z(player.getCurrentTimeline(), this.r);
        long j = 0;
        this.p0 = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i = 0;
        } else {
            int currentWindowIndex = player.getCurrentWindowIndex();
            boolean z2 = this.L;
            int i2 = z2 ? 0 : currentWindowIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentWindowIndex;
            long j2 = 0;
            i = 0;
            while (i2 <= windowCount) {
                if (i2 == currentWindowIndex) {
                    this.p0 = C.usToMs(j2);
                }
                currentTimeline.getWindow(i2, this.r);
                Timeline.Window window2 = this.r;
                if (window2.durationUs == C.TIME_UNSET) {
                    Assertions.checkState(this.L ^ z);
                    break;
                }
                int i3 = window2.firstPeriodIndex;
                while (true) {
                    window = this.r;
                    if (i3 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i3, this.q);
                        int adGroupCount = this.q.getAdGroupCount();
                        for (int removedAdGroupCount = this.q.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                            long adGroupTimeUs = this.q.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j3 = this.q.durationUs;
                                if (j3 != C.TIME_UNSET) {
                                    adGroupTimeUs = j3;
                                    positionInWindowUs = adGroupTimeUs + this.q.getPositionInWindowUs();
                                    if (positionInWindowUs >= 0) {
                                        jArr = this.W;
                                        if (i == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.W = Arrays.copyOf(jArr, length);
                                            this.m0 = Arrays.copyOf(this.m0, length);
                                        }
                                        this.W[i] = C.usToMs(j2 + positionInWindowUs);
                                        this.m0[i] = this.q.hasPlayedAdGroup(removedAdGroupCount);
                                        i++;
                                    }
                                }
                            } else {
                                positionInWindowUs = adGroupTimeUs + this.q.getPositionInWindowUs();
                                if (positionInWindowUs >= 0) {
                                    jArr = this.W;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.W = Arrays.copyOf(jArr, length);
                                        this.m0 = Arrays.copyOf(this.m0, length);
                                    }
                                    this.W[i] = C.usToMs(j2 + positionInWindowUs);
                                    this.m0[i] = this.q.hasPlayedAdGroup(removedAdGroupCount);
                                    i++;
                                }
                            }
                        }
                        i3++;
                    }
                }
                j2 += window.durationUs;
                i2++;
                z = true;
            }
            j = j2;
        }
        long jUsToMs = C.usToMs(j);
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.o, this.p, jUsToMs));
        }
        TimeBar timeBar = this.n;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.n0.length;
            int i4 = i + length2;
            long[] jArr2 = this.W;
            if (i4 > jArr2.length) {
                this.W = Arrays.copyOf(jArr2, i4);
                this.m0 = Arrays.copyOf(this.m0, i4);
            }
            System.arraycopy(this.n0, 0, this.W, i, length2);
            System.arraycopy(this.o0, 0, this.m0, i, length2);
            this.n.setAdGroupTimesMs(this.W, this.m0, i4);
        }
        O();
    }

    private static boolean z(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    public void addVisibilityListener(VisibilityListener listener) {
        Assertions.checkNotNull(listener);
        this.b.add(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return dispatchMediaKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        Player player = this.G;
        if (player == null || !F(keyCode)) {
            return false;
        }
        if (event.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            this.H.dispatchFastForward(player);
            return true;
        }
        if (keyCode == 89) {
            this.H.dispatchRewind(player);
            return true;
        }
        if (event.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            C(player);
            return true;
        }
        if (keyCode == 87) {
            this.H.dispatchNext(player);
            return true;
        }
        if (keyCode == 88) {
            this.H.dispatchPrevious(player);
            return true;
        }
        if (keyCode == 126) {
            B(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        A(player);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (ev.getAction() == 1) {
            E();
        }
        return super.dispatchTouchEvent(ev);
    }

    @Nullable
    public Player getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.V = C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j = this.V;
        if (j != C.TIME_UNSET) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.t, jUptimeMillis);
            }
        } else if (isVisible()) {
            E();
        }
        K();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    public void removeVisibilityListener(VisibilityListener listener) {
        this.b.remove(listener);
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (this.H != controlDispatcher) {
            this.H = controlDispatcher;
            M();
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] extraAdGroupTimesMs, @Nullable boolean[] extraPlayedAdGroups) {
        if (extraAdGroupTimesMs == null) {
            this.n0 = new long[0];
            this.o0 = new boolean[0];
        } else {
            boolean[] zArr = (boolean[]) Assertions.checkNotNull(extraPlayedAdGroups);
            Assertions.checkArgument(extraAdGroupTimesMs.length == zArr.length);
            this.n0 = extraAdGroupTimesMs;
            this.o0 = zArr;
        }
        R();
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.G;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener((Player.Listener) this.a);
        }
        this.G = player;
        if (player != null) {
            player.addListener((Player.Listener) this.a);
        }
        K();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener listener) {
        this.I = listener;
    }

    public void setRepeatToggleModes(int repeatToggleModes) {
        this.P = repeatToggleModes;
        Player player = this.G;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (repeatToggleModes == 0 && repeatMode != 0) {
                this.H.dispatchSetRepeatMode(this.G, 0);
            } else if (repeatToggleModes == 1 && repeatMode == 2) {
                this.H.dispatchSetRepeatMode(this.G, 1);
            } else if (repeatToggleModes == 2 && repeatMode == 1) {
                this.H.dispatchSetRepeatMode(this.G, 2);
            }
        }
        P();
    }

    public void setShowFastForwardButton(boolean showFastForwardButton) {
        this.R = showFastForwardButton;
        M();
    }

    public void setShowMultiWindowTimeBar(boolean showMultiWindowTimeBar) {
        this.K = showMultiWindowTimeBar;
        R();
    }

    public void setShowNextButton(boolean showNextButton) {
        this.T = showNextButton;
        M();
    }

    public void setShowPreviousButton(boolean showPreviousButton) {
        this.S = showPreviousButton;
        M();
    }

    public void setShowRewindButton(boolean showRewindButton) {
        this.Q = showRewindButton;
        M();
    }

    public void setShowShuffleButton(boolean showShuffleButton) {
        this.U = showShuffleButton;
        Q();
    }

    public void setShowTimeoutMs(int showTimeoutMs) {
        this.N = showTimeoutMs;
        if (isVisible()) {
            E();
        }
    }

    public void setShowVrButton(boolean showVrButton) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(showVrButton ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int minUpdateIntervalMs) {
        this.O = Util.constrainValue(minUpdateIntervalMs, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            L(getShowVrButton(), onClickListener != null, this.k);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().onVisibilityChange(getVisibility());
            }
            K();
            G();
        }
        E();
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, attrs);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet playbackAttrs) {
        super(context, attrs, defStyleAttr);
        int resourceId = R.layout.exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = C.TIME_UNSET;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (playbackAttrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(playbackAttrs, R.styleable.PlayerControlView, 0, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_controller_layout_id, resourceId);
                this.P = D(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_time_bar_min_update_interval, this.O));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.b = new CopyOnWriteArrayList<>();
        this.q = new Timeline.Period();
        this.r = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.o = sb;
        this.p = new Formatter(sb, Locale.getDefault());
        this.W = new long[0];
        this.m0 = new boolean[0];
        this.n0 = new long[0];
        this.o0 = new boolean[0];
        b bVar = new b();
        this.a = bVar;
        this.H = new DefaultControlDispatcher();
        this.s = new Runnable() { // from class: j16
            @Override // java.lang.Runnable
            public final void run() {
                this.a.O();
            }
        };
        this.t = new Runnable() { // from class: i16
            @Override // java.lang.Runnable
            public final void run() {
                this.a.hide();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.n = timeBar;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, playbackAttrs);
            defaultTimeBar.setId(i);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.n = defaultTimeBar;
        } else {
            this.n = null;
        }
        this.l = (TextView) findViewById(R.id.exo_duration);
        this.m = (TextView) findViewById(R.id.exo_position);
        TimeBar timeBar2 = this.n;
        if (timeBar2 != null) {
            timeBar2.addListener(bVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.k = viewFindViewById8;
        setShowVrButton(false);
        L(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.u = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.v = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.w = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.A = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.B = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.x = resources.getString(R.string.exo_controls_repeat_off_description);
        this.y = resources.getString(R.string.exo_controls_repeat_one_description);
        this.z = resources.getString(R.string.exo_controls_repeat_all_description);
        this.E = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.F = resources.getString(R.string.exo_controls_shuffle_off_description);
    }
}
