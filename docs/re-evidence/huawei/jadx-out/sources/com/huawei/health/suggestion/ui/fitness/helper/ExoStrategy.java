package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy;
import com.huawei.hms.network.embedded.y;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ExoStrategy implements PlayerStrategy, Player.Listener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f9302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f9303c;
    protected ExoPlayer d;
    private Context e;
    private int f;
    private SurfaceView g;
    private int h;
    private List<Uri> i;
    private PathType j;
    private ViewGroup k;
    private Player.Listener m;

    enum PathType {
        URI,
        ASSET,
        RAW,
        SD
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void changeAudioGender() {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public String getCurrentName() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public List<String> getNumberPaths(int i) {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public MediaPlayer getPlayer() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getSourceNum() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy next() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy pre() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void refreshAssetSources(String... strArr) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy repeat() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void saveFitnessType(String str) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setAssetSources(String... strArr) {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setAudioAssetSources(List<String> list) {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setGender(int i) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setRawSources(Integer... numArr) {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSdSources(List<String> list) {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSdSources(String... strArr) {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setSdSourcesBackground(String str) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy stop() {
        return this;
    }

    public ExoStrategy() {
        this.f9302b = true;
        this.i = new ArrayList(10);
        this.e = BaseApplication.getContext();
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.e).build();
        this.d = exoPlayerBuild;
        exoPlayerBuild.addListener(this);
        this.f9302b = true;
        this.d.setRepeatMode(1);
    }

    public ExoStrategy(Context context) {
        this.f9302b = true;
        this.i = new ArrayList(10);
        this.e = context;
        DefaultRenderersFactory enableDecoderFallback = new DefaultRenderersFactory(this.e).setEnableDecoderFallback(true);
        DefaultLoadControl defaultLoadControlBuild = new DefaultLoadControl.Builder().setBufferDurationsMs(y.f15619c, 30000, 1000, 5000).setTargetBufferBytes(ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT).build();
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.e);
        defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setForceHighestSupportedBitrate(true));
        this.d = new ExoPlayer.Builder(this.e).setTrackSelector(defaultTrackSelector).setLoadControl(defaultLoadControlBuild).setRenderersFactory(enableDecoderFallback).build();
        LogUtil.a("Suggestion_media3Helper", "setShortVideoPlayer ExoStrategy");
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setOnVideoSizeChangedListener(Player.Listener listener) {
        this.m = listener;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy, androidx.media3.common.Player.Listener
    public void onVideoSizeChanged(VideoSize videoSize) {
        SurfaceView surfaceView = this.g;
        if (surfaceView != null) {
            e(surfaceView, videoSize);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        SurfaceView surfaceView;
        int width;
        if (this.k == null || (surfaceView = this.g) == null || this.d == null || (width = surfaceView.getWidth()) == this.k.getWidth() || width == (this.k.getHeight() * 16) / 9) {
            return;
        }
        LogUtil.a("Suggestion_media3Helper", "onGlobalLayout, displayWidth =", Integer.valueOf(width), " mViewGroup.getWidth() =", Integer.valueOf(this.k.getWidth()), " mViewGroup.getHeight() =", Integer.valueOf(this.k.getHeight()));
        e(this.g, this.d.getVideoSize());
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy prepare() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.prepare();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setMediaUrl(String str) {
        if (this.d != null) {
            this.d.setMediaItem(MediaItem.fromUri(str));
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy start() {
        this.f9303c = 0;
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy play() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setLooper(boolean z) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(z ? 1 : 0);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setMediaSources(Uri... uriArr) {
        this.f = uriArr.length;
        this.f9303c = 0;
        try {
            if (this.d == null || this.i == null) {
                LogUtil.e("Suggestion_media3Helper", "setMediaSources mPlayer == null or mUriSources == null");
                return this;
            }
            this.j = PathType.URI;
            this.i.clear();
            this.i.addAll(Arrays.asList(uriArr));
            reset();
            this.d.setMediaItems(Collections.EMPTY_LIST);
            this.d.setMediaItem(MediaItem.fromUri(uriArr[0]));
            c();
            return this;
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Suggestion_media3Helper", LogAnonymous.b(e));
            return this;
        }
    }

    protected void e(View view, VideoSize videoSize) {
        if (videoSize == null) {
            LogUtil.j("Suggestion_media3Helper", "parameter videoSize is null");
            return;
        }
        int i = videoSize.width;
        int i2 = videoSize.height;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            LogUtil.j("Suggestion_media3Helper", "parameter view is null");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        LogUtil.a("Suggestion_media3Helper", "tryResetSurfaceSize, width:", Integer.valueOf(width), " height:", Integer.valueOf(height), " videoWidth:", Integer.valueOf(i), " videoHeight:", Integer.valueOf(i2));
        if (width <= 0 || height <= 0) {
            return;
        }
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            LogUtil.j("Suggestion_media3Helper", "!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (i2 == 0) {
            LogUtil.j("Suggestion_media3Helper", "tryResetSurfaceSize videoHeight == 0");
            return;
        }
        float f = i / i2;
        if (f == 0.0f) {
            LogUtil.j("Suggestion_media3Helper", "tryResetSurfaceSize scaleVideo == 0");
            return;
        }
        if (f > width / height) {
            layoutParams.width = width;
        } else {
            layoutParams.width = (height * 16) / 9;
        }
        layoutParams.height = (int) (layoutParams.width / f);
        layoutParams.gravity = 17;
        LogUtil.a("Suggestion_media3Helper", "params.width:", Integer.valueOf(layoutParams.width), " params.height:", Integer.valueOf(layoutParams.height));
        this.h = (width - layoutParams.width) / 2;
        this.f9301a = (height - layoutParams.height) / 2;
        view.setLayoutParams(layoutParams);
        Player.Listener listener = this.m;
        if (listener != null) {
            listener.onVideoSizeChanged(videoSize);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getDarkAreaWidth() {
        return this.h;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getDarkAreaHeight() {
        return this.f9301a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected void c() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(this.f9302b ? 1 : 0);
        }
        try {
            ExoPlayer exoPlayer2 = this.d;
            if (exoPlayer2 != null) {
                exoPlayer2.prepare();
                this.d.setPlayWhenReady(true);
            }
        } catch (IllegalStateException e) {
            ReleaseLogUtil.a("Suggestion_media3Helper", "later player prepare()error: ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.d != null && surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid()) {
            this.d.setVideoSurfaceHolder(surfaceHolder);
        } else {
            LogUtil.e("Suggestion_media3Helper", "setDisplay mPlayer == null");
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSurfaceDisplay(SurfaceView surfaceView) {
        if (surfaceView != null) {
            this.g = surfaceView;
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setCurrent(int i) {
        this.f9303c = i;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getVideoWidth() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            return exoPlayer.getVideoSize().width;
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getVideoHeight() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            return exoPlayer.getVideoSize().height;
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setPlayerSpeed(float f) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.setPlaybackParameters(new PlaybackParameters(f));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getCurrentPosition() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            return (int) exoPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setSurfaceParentGlobalLayoutListener(ViewGroup viewGroup) {
        this.k = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSurface(Surface surface) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.setVideoSurface(surface);
            return this;
        }
        LogUtil.e("Suggestion_media3Helper", "setSurface mPlayer == null");
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy pause() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy videoContinue() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ExoStrategy setLooping(boolean z) {
        this.f9302b = z;
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy release() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            this.f9303c = 0;
            this.i = null;
            exoPlayer.release();
            this.d = null;
            this.g = null;
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setVolume(float f) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.setVolume(f);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void saveCurrent(int i) {
        this.f9303c = i;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public ExoPlayer getExoPlayer() {
        return this.d;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            return exoPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getDuration() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            return (int) exoPlayer.getDuration();
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void reset() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.stop();
            this.d.clearMediaItems();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void seekTo(int i) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.seekTo(i);
        } else {
            LogUtil.e("Suggestion_media3Helper", "ExoPlayer is null");
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setVideoScalingMode() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            try {
                exoPlayer.setVideoScalingMode(2);
            } catch (RuntimeException e) {
                LogUtil.e("Suggestion_media3Helper", "setVideoScalingMode RuntimeError.", LogAnonymous.b(e));
            }
        }
    }
}
