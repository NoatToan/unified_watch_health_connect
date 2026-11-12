package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.ControlDispatcher;
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
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public class StyledPlayerView extends FrameLayout implements AdViewProvider {
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;
    private static final int G = 3;
    private static final int H = -1;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private boolean A;
    private final a a;

    @Nullable
    private final AspectRatioFrameLayout b;

    @Nullable
    private final View c;

    @Nullable
    private final View d;
    private final boolean e;

    @Nullable
    private final ImageView f;

    @Nullable
    private final SubtitleView g;

    @Nullable
    private final View h;

    @Nullable
    private final TextView i;

    @Nullable
    private final StyledPlayerControlView j;

    @Nullable
    private final FrameLayout k;

    @Nullable
    private final FrameLayout l;

    @Nullable
    private Player m;
    private boolean n;

    @Nullable
    private StyledPlayerControlView.VisibilityListener o;
    private boolean p;

    @Nullable
    private Drawable q;
    private int r;
    private boolean s;

    @Nullable
    private ErrorMessageProvider<? super PlaybackException> t;

    @Nullable
    private CharSequence u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public final class a implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.VisibilityListener {
        private final Timeline.Period a = new Timeline.Period();

        @Nullable
        private Object b;

        public a() {
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
            StyledPlayerView.this.B();
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> cues) {
            if (StyledPlayerView.this.g != null) {
                StyledPlayerView.this.g.onCues(cues);
            }
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
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            n0.i(this, z);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            StyledPlayerView.o((TextureView) view, StyledPlayerView.this.z);
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
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
            StyledPlayerView.this.D();
            StyledPlayerView.this.F();
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            n0.n(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int playbackState) {
            StyledPlayerView.this.D();
            StyledPlayerView.this.G();
            StyledPlayerView.this.F();
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
        public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
            if (StyledPlayerView.this.u() && StyledPlayerView.this.x) {
                StyledPlayerView.this.hideController();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
            if (StyledPlayerView.this.c != null) {
                StyledPlayerView.this.c.setVisibility(4);
            }
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
        public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray selections) {
            Player player = (Player) Assertions.checkNotNull(StyledPlayerView.this.m);
            Timeline currentTimeline = player.getCurrentTimeline();
            if (currentTimeline.isEmpty()) {
                this.b = null;
            } else if (player.getCurrentTrackGroups().isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod != -1) {
                        if (player.getCurrentWindowIndex() == currentTimeline.getPeriod(indexOfPeriod, this.a).windowIndex) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), this.a, true).uid;
            }
            StyledPlayerView.this.H(false);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            com.google.android.exoplayer2.video.b.c(this, i, i2, i3, f);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(VideoSize videoSize) {
            StyledPlayerView.this.C();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener
        public void onVisibilityChange(int visibility) {
            StyledPlayerView.this.E();
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onVolumeChanged(float f) {
            n0.E(this, f);
        }
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    private void A(boolean showIndefinitely) {
        if (J()) {
            this.j.setShowTimeoutMs(showIndefinitely ? 0 : this.v);
            this.j.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        if (J() && this.m != null) {
            if (!this.j.isFullyVisible()) {
                v(true);
                return true;
            }
            if (this.y) {
                this.j.hide();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Player player = this.m;
        VideoSize videoSize = player != null ? player.getVideoSize() : VideoSize.UNKNOWN;
        int i = videoSize.width;
        int i2 = videoSize.height;
        int i3 = videoSize.unappliedRotationDegrees;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.pixelWidthHeightRatio) / i2;
        View view = this.d;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.z != 0) {
                view.removeOnLayoutChangeListener(this.a);
            }
            this.z = i3;
            if (i3 != 0) {
                this.d.addOnLayoutChangeListener(this.a);
            }
            o((TextureView) this.d, this.z);
        }
        onContentAspectRatioChanged(this.b, this.e ? 0.0f : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        int i;
        if (this.h != null) {
            Player player = this.m;
            boolean z = true;
            if (player == null || player.getPlaybackState() != 2 || ((i = this.r) != 2 && (i != 1 || !this.m.getPlayWhenReady()))) {
                z = false;
            }
            this.h.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        StyledPlayerControlView styledPlayerControlView = this.j;
        if (styledPlayerControlView == null || !this.n) {
            setContentDescription(null);
        } else if (styledPlayerControlView.isFullyVisible()) {
            setContentDescription(this.y ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (u() && this.x) {
            hideController();
        } else {
            v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
        TextView textView = this.i;
        if (textView != null) {
            CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.i.setVisibility(0);
                return;
            }
            Player player = this.m;
            PlaybackException playerError = player != null ? player.getPlayerError() : null;
            if (playerError == null || (errorMessageProvider = this.t) == null) {
                this.i.setVisibility(8);
            } else {
                this.i.setText((CharSequence) errorMessageProvider.getErrorMessage(playerError).second);
                this.i.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(boolean isNewPlayer) {
        Player player = this.m;
        if (player == null || player.getCurrentTrackGroups().isEmpty()) {
            if (this.s) {
                return;
            }
            s();
            p();
            return;
        }
        if (isNewPlayer && !this.s) {
            p();
        }
        TrackSelectionArray currentTrackSelections = player.getCurrentTrackSelections();
        for (int i = 0; i < currentTrackSelections.length; i++) {
            TrackSelection trackSelection = currentTrackSelections.get(i);
            if (trackSelection != null) {
                for (int i2 = 0; i2 < trackSelection.length(); i2++) {
                    if (MimeTypes.getTrackType(trackSelection.getFormat(i2).sampleMimeType) == 2) {
                        s();
                        return;
                    }
                }
            }
        }
        p();
        if (I() && (w(player.getMediaMetadata()) || x(this.q))) {
            return;
        }
        s();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean I() {
        if (!this.p) {
            return false;
        }
        Assertions.checkStateNotNull(this.f);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean J() {
        if (!this.n) {
            return false;
        }
        Assertions.checkStateNotNull(this.j);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(TextureView textureView, int textureViewRotation) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && textureViewRotation != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(textureViewRotation, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private void p() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void q(Resources resources, ImageView logo) {
        logo.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo));
        logo.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    @RequiresApi(23)
    private static void r(Resources resources, ImageView logo) {
        logo.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
        logo.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
    }

    private void s() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f.setVisibility(4);
        }
    }

    public static void switchTargetView(Player player, @Nullable StyledPlayerView oldPlayerView, @Nullable StyledPlayerView newPlayerView) {
        if (oldPlayerView == newPlayerView) {
            return;
        }
        if (newPlayerView != null) {
            newPlayerView.setPlayer(player);
        }
        if (oldPlayerView != null) {
            oldPlayerView.setPlayer(null);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean t(int keyCode) {
        return keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u() {
        Player player = this.m;
        return player != null && player.isPlayingAd() && this.m.getPlayWhenReady();
    }

    private void v(boolean isForced) {
        if (!(u() && this.x) && J()) {
            boolean z = this.j.isFullyVisible() && this.j.getShowTimeoutMs() <= 0;
            boolean z2 = z();
            if (isForced || z || z2) {
                A(z2);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean w(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr == null) {
            return false;
        }
        return x(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @RequiresNonNull({"artworkView"})
    private boolean x(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.b, intrinsicWidth / intrinsicHeight);
                this.f.setImageDrawable(drawable);
                this.f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void y(AspectRatioFrameLayout aspectRatioFrame, int resizeMode) {
        aspectRatioFrame.setResizeMode(resizeMode);
    }

    private boolean z() {
        Player player = this.m;
        if (player == null) {
            return true;
        }
        int playbackState = player.getPlaybackState();
        return this.w && !this.m.getCurrentTimeline().isEmpty() && (playbackState == 1 || playbackState == 4 || !((Player) Assertions.checkNotNull(this.m)).getPlayWhenReady());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Player player = this.m;
        if (player != null && player.isPlayingAd()) {
            return super.dispatchKeyEvent(event);
        }
        boolean zT = t(event.getKeyCode());
        if ((zT && J() && !this.j.isFullyVisible()) || dispatchMediaKeyEvent(event) || super.dispatchKeyEvent(event)) {
            v(true);
            return true;
        }
        if (!zT || !J()) {
            return false;
        }
        v(true);
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent event) {
        return J() && this.j.dispatchMediaKeyEvent(event);
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.j;
        if (styledPlayerControlView != null) {
            arrayList.add(new AdOverlayInfo(styledPlayerControlView, 0));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) Assertions.checkStateNotNull(this.k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public int getControllerShowTimeoutMs() {
        return this.v;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.q;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    @Nullable
    public Player getPlayer() {
        return this.m;
    }

    public int getResizeMode() {
        Assertions.checkStateNotNull(this.b);
        return this.b.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.g;
    }

    public boolean getUseArtwork() {
        return this.p;
    }

    public boolean getUseController() {
        return this.n;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.d;
    }

    public void hideController() {
        StyledPlayerControlView styledPlayerControlView = this.j;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.hide();
        }
    }

    public boolean isControllerFullyVisible() {
        StyledPlayerControlView styledPlayerControlView = this.j;
        return styledPlayerControlView != null && styledPlayerControlView.isFullyVisible();
    }

    public void onContentAspectRatioChanged(@Nullable AspectRatioFrameLayout contentFrame, float aspectRatio) {
        if (contentFrame != null) {
            contentFrame.setAspectRatio(aspectRatio);
        }
    }

    public void onPause() {
        View view = this.d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!J() || this.m == null) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        }
        if (action != 1 || !this.A) {
            return false;
        }
        this.A = false;
        return performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent ev) {
        if (!J() || this.m == null) {
            return false;
        }
        v(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return B();
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener listener) {
        Assertions.checkStateNotNull(this.b);
        this.b.setAspectRatioListener(listener);
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
        Assertions.checkStateNotNull(this.j);
        this.j.setControlDispatcher(controlDispatcher);
    }

    public void setControllerAutoShow(boolean controllerAutoShow) {
        this.w = controllerAutoShow;
    }

    public void setControllerHideDuringAds(boolean controllerHideDuringAds) {
        this.x = controllerHideDuringAds;
    }

    public void setControllerHideOnTouch(boolean controllerHideOnTouch) {
        Assertions.checkStateNotNull(this.j);
        this.y = controllerHideOnTouch;
        E();
    }

    public void setControllerOnFullScreenModeChangedListener(@Nullable StyledPlayerControlView.OnFullScreenModeChangedListener listener) {
        Assertions.checkStateNotNull(this.j);
        this.j.setOnFullScreenModeChangedListener(listener);
    }

    public void setControllerShowTimeoutMs(int controllerShowTimeoutMs) {
        Assertions.checkStateNotNull(this.j);
        this.v = controllerShowTimeoutMs;
        if (this.j.isFullyVisible()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(@Nullable StyledPlayerControlView.VisibilityListener listener) {
        Assertions.checkStateNotNull(this.j);
        StyledPlayerControlView.VisibilityListener visibilityListener = this.o;
        if (visibilityListener == listener) {
            return;
        }
        if (visibilityListener != null) {
            this.j.removeVisibilityListener(visibilityListener);
        }
        this.o = listener;
        if (listener != null) {
            this.j.addVisibilityListener(listener);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence message) {
        Assertions.checkState(this.i != null);
        this.u = message;
        G();
    }

    public void setDefaultArtwork(@Nullable Drawable defaultArtwork) {
        if (this.q != defaultArtwork) {
            this.q = defaultArtwork;
            H(false);
        }
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.t != errorMessageProvider) {
            this.t = errorMessageProvider;
            G();
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] extraAdGroupTimesMs, @Nullable boolean[] extraPlayedAdGroups) {
        Assertions.checkStateNotNull(this.j);
        this.j.setExtraAdGroupMarkers(extraAdGroupTimesMs, extraPlayedAdGroups);
    }

    public void setKeepContentOnPlayerReset(boolean keepContentOnPlayerReset) {
        if (this.s != keepContentOnPlayerReset) {
            this.s = keepContentOnPlayerReset;
            H(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.m;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener((Player.Listener) this.a);
            View view = this.d;
            if (view instanceof TextureView) {
                player2.clearVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player2.clearVideoSurfaceView((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.m = player;
        if (J()) {
            this.j.setPlayer(player);
        }
        D();
        G();
        H(true);
        if (player == null) {
            hideController();
            return;
        }
        if (player.isCommandAvailable(26)) {
            View view2 = this.d;
            if (view2 instanceof TextureView) {
                player.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                player.setVideoSurfaceView((SurfaceView) view2);
            }
            C();
        }
        if (this.g != null && player.isCommandAvailable(27)) {
            this.g.setCues(player.getCurrentCues());
        }
        player.addListener((Player.Listener) this.a);
        v(false);
    }

    public void setRepeatToggleModes(int repeatToggleModes) {
        Assertions.checkStateNotNull(this.j);
        this.j.setRepeatToggleModes(repeatToggleModes);
    }

    public void setResizeMode(int resizeMode) {
        Assertions.checkStateNotNull(this.b);
        this.b.setResizeMode(resizeMode);
    }

    public void setShowBuffering(int showBuffering) {
        if (this.r != showBuffering) {
            this.r = showBuffering;
            D();
        }
    }

    public void setShowFastForwardButton(boolean showFastForwardButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowFastForwardButton(showFastForwardButton);
    }

    public void setShowMultiWindowTimeBar(boolean showMultiWindowTimeBar) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowMultiWindowTimeBar(showMultiWindowTimeBar);
    }

    public void setShowNextButton(boolean showNextButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowNextButton(showNextButton);
    }

    public void setShowPreviousButton(boolean showPreviousButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowPreviousButton(showPreviousButton);
    }

    public void setShowRewindButton(boolean showRewindButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowRewindButton(showRewindButton);
    }

    public void setShowShuffleButton(boolean showShuffleButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowShuffleButton(showShuffleButton);
    }

    public void setShowSubtitleButton(boolean showSubtitleButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowSubtitleButton(showSubtitleButton);
    }

    public void setShowVrButton(boolean showVrButton) {
        Assertions.checkStateNotNull(this.j);
        this.j.setShowVrButton(showVrButton);
    }

    public void setShutterBackgroundColor(int color) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }

    public void setUseArtwork(boolean useArtwork) {
        Assertions.checkState((useArtwork && this.f == null) ? false : true);
        if (this.p != useArtwork) {
            this.p = useArtwork;
            H(false);
        }
    }

    public void setUseController(boolean useController) {
        Assertions.checkState((useController && this.j == null) ? false : true);
        if (this.n == useController) {
            return;
        }
        this.n = useController;
        if (J()) {
            this.j.setPlayer(this.m);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.j;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.hide();
                this.j.setPlayer(null);
            }
        }
        E();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(visibility);
        }
    }

    public void showController() {
        A(z());
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        boolean z;
        int i;
        boolean z2;
        int integer;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        boolean z6;
        boolean z7;
        boolean z8;
        super(context, attrs, defStyleAttr);
        a aVar = new a();
        this.a = aVar;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            ImageView imageView = new ImageView(context);
            if (Util.SDK_INT >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i6 = R.layout.exo_styled_player_view;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.StyledPlayerView, 0, 0);
            try {
                int i7 = R.styleable.StyledPlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i7);
                int color = typedArrayObtainStyledAttributes.getColor(i7, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerView_player_layout_id, i6);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerView_default_artwork, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_use_controller, true);
                int i8 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_surface_type, 1);
                int i9 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_resize_mode, 0);
                int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_show_timeout, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_hide_on_touch, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.StyledPlayerView_show_buffering, 0);
                this.s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_keep_content_on_player_reset, this.s);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z11;
                z = z12;
                i = i9;
                z6 = z10;
                i4 = resourceId2;
                z5 = z9;
                z4 = zHasValue;
                i3 = color;
                i2 = i8;
                z2 = z13;
                i6 = resourceId;
                i5 = i10;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            i = 0;
            z2 = true;
            integer = 0;
            z3 = true;
            i2 = 1;
            i3 = 0;
            z4 = false;
            z5 = true;
            i4 = 0;
            i5 = 5000;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i6, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            y(aspectRatioFrameLayout, i);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i3);
        }
        if (aspectRatioFrameLayout != null && i2 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i2 == 2) {
                this.d = new TextureView(context);
            } else {
                if (i2 == 3) {
                    try {
                        this.d = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                        z8 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i2 != 4) {
                    this.d = new SurfaceView(context);
                } else {
                    try {
                        this.d = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(aVar);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
                z7 = z8;
            }
            z8 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(aVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z7 = z8;
        } else {
            this.d = null;
            z7 = false;
        }
        this.e = z7;
        this.k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f = imageView2;
        this.p = z5 && imageView2 != null;
        if (i4 != 0) {
            this.q = ContextCompat.getDrawable(getContext(), i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.g = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.r = integer;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i11 = R.id.exo_controller;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i11);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.j = styledPlayerControlView;
        } else if (viewFindViewById3 != null) {
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attrs);
            this.j = styledPlayerControlView2;
            styledPlayerControlView2.setId(i11);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            this.j = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.j;
        this.v = styledPlayerControlView3 != null ? i5 : 0;
        this.y = z3;
        this.w = z;
        this.x = z2;
        this.n = z6 && styledPlayerControlView3 != null;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.hideImmediately();
            this.j.addVisibilityListener(aVar);
        }
        E();
    }
}
