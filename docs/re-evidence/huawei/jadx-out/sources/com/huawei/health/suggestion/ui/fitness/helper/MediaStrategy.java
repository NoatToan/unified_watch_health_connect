package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.xkf;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MediaStrategy implements PlayerStrategy, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f9339a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f9341c;
    protected String d;
    protected MediaPlayer e;
    private int f;
    private SurfaceView g;
    private int j;
    private MediaPlayer.OnVideoSizeChangedListener l;
    private int n;
    private PathType o;
    private ViewGroup s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f9340b = AudioConstant.WOMAN;
    private List<Uri> k = new ArrayList(10);
    private List<String> h = new ArrayList(10);
    private List<Integer> m = new ArrayList(10);
    private Context i = BaseApplication.getContext();

    enum PathType {
        URI,
        ASSET,
        RAW,
        SD
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public ExoPlayer getExoPlayer() {
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy, androidx.media3.common.Player.Listener
    public void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy prepare() {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setMediaUrl(String str) {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setOnVideoSizeChangedListener(Player.Listener listener) {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy stop() {
        return this;
    }

    public MediaStrategy() {
        this.f9339a = true;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.e = mediaPlayer;
        mediaPlayer.setOnVideoSizeChangedListener(this);
        this.f9339a = true;
        this.e.setLooping(true);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.l = onVideoSizeChangedListener;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        SurfaceView surfaceView = this.g;
        if (surfaceView != null) {
            e(surfaceView, i, i2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        SurfaceView surfaceView;
        int width;
        if (this.s == null || (surfaceView = this.g) == null || this.e == null || (width = surfaceView.getWidth()) == this.s.getWidth() || width == (this.s.getHeight() * 16) / 9) {
            return;
        }
        LogUtil.a("Suggestion_mediaHelper", "onGlobalLayout, displayWidth =", Integer.valueOf(width), " mViewGroup.getWidth() =", Integer.valueOf(this.s.getWidth()), " mViewGroup.getHeight() =", Integer.valueOf(this.s.getHeight()));
        e(this.g, this.e.getVideoWidth(), this.e.getVideoHeight());
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy start() {
        this.f9341c = 0;
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy play() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setLooper(boolean z) {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setMediaSources(final Uri... uriArr) {
        final MediaPlayer mediaPlayer = this.e;
        ThreadPoolManager.c().execute(new Runnable() { // from class: hkd
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(uriArr, mediaPlayer);
            }
        });
        return this;
    }

    public /* synthetic */ void a(Uri[] uriArr, MediaPlayer mediaPlayer) {
        this.n = uriArr.length;
        this.f9341c = 0;
        try {
            if (mediaPlayer == null) {
                LogUtil.e("Suggestion_mediaHelper", "setMediaSources mPlayer == null");
                return;
            }
            this.o = PathType.URI;
            this.k.clear();
            this.k.addAll(Arrays.asList(uriArr));
            mediaPlayer.reset();
            mediaPlayer.setDataSource(this.i, uriArr[0]);
            b(mediaPlayer);
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Suggestion_mediaHelper", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setAssetSources(String... strArr) {
        this.f9341c = 0;
        try {
            this.n = strArr.length;
            if (this.e == null) {
                LogUtil.e("Suggestion_mediaHelper", "setAssetSources mPlayer == null");
            } else {
                this.o = PathType.ASSET;
                this.h.clear();
                this.h.addAll(Arrays.asList(strArr));
                this.e.reset();
                Context context = this.i;
                if (context == null || context.getAssets() == null) {
                    LogUtil.e("Suggestion_mediaHelper", "mContext == null || mContext.getAssets == null");
                } else {
                    AssetFileDescriptor assetFileDescriptorOpenFd = null;
                    try {
                        try {
                            try {
                                assetFileDescriptorOpenFd = this.i.getAssets().openFd(strArr[0]);
                                this.e.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                                b();
                                if (assetFileDescriptorOpenFd != null) {
                                    assetFileDescriptorOpenFd.close();
                                }
                            } catch (FileNotFoundException unused) {
                                LogUtil.e("Suggestion_mediaHelper", "fileDescriptor, FileNotFoundException");
                                if (assetFileDescriptorOpenFd != null) {
                                }
                            }
                        } catch (IOException e) {
                            LogUtil.e("Suggestion_mediaHelper", LogAnonymous.b(e));
                            if (assetFileDescriptorOpenFd != null) {
                            }
                        }
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd != null) {
                            assetFileDescriptorOpenFd.close();
                        }
                        throw th;
                    }
                }
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e2) {
            LogUtil.e("Suggestion_mediaHelper", LogAnonymous.b(e2));
        }
        return this;
    }

    protected void e(View view, int i, int i2) {
        if (view == null) {
            LogUtil.j("Suggestion_mediaHelper", "parameter view is null");
            return;
        }
        if (!(view.getParent() instanceof ViewGroup)) {
            LogUtil.j("Suggestion_mediaHelper", "tryResetSurfaceSize !(view.getParent() instanceof ViewGroup)");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        LogUtil.a("Suggestion_mediaHelper", "tryResetSurfaceSize, width:", Integer.valueOf(width), " height:", Integer.valueOf(height), " videoWidth:", Integer.valueOf(i), " videoHeight:", Integer.valueOf(i2));
        if (width <= 0 || height <= 0) {
            return;
        }
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            LogUtil.j("Suggestion_mediaHelper", "!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (i2 == 0) {
            LogUtil.j("Suggestion_mediaHelper", "tryResetSurfaceSize videoHeight == 0");
            return;
        }
        float f = i / i2;
        if (f == 0.0f) {
            LogUtil.j("Suggestion_mediaHelper", "tryResetSurfaceSize scaleVideo == 0");
            return;
        }
        if (f > width / height) {
            layoutParams.width = width;
        } else {
            layoutParams.width = (height * 16) / 9;
        }
        layoutParams.height = (int) (layoutParams.width / f);
        layoutParams.gravity = 17;
        LogUtil.a("Suggestion_mediaHelper", "params.width:", Integer.valueOf(layoutParams.width), " params.height:", Integer.valueOf(layoutParams.height));
        this.j = (width - layoutParams.width) / 2;
        this.f = (height - layoutParams.height) / 2;
        view.setLayoutParams(layoutParams);
        MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.l;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged(this.e, i, i2);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getDarkAreaWidth() {
        return this.j;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getDarkAreaHeight() {
        return this.f;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void refreshAssetSources(String... strArr) {
        this.n = strArr.length;
        this.o = PathType.ASSET;
        this.h.clear();
        this.h.addAll(Arrays.asList(strArr));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setAudioAssetSources(List<String> list) {
        this.n = list.size();
        this.f9341c = 0;
        if (this.e != null) {
            try {
                this.o = PathType.ASSET;
                this.h.clear();
                this.h.addAll(list);
                this.e.reset();
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    assetFileDescriptorOpenFd = this.i.getAssets().openFd(list.get(0));
                    this.e.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                    b();
                    if (assetFileDescriptorOpenFd != null) {
                        return this;
                    }
                } finally {
                    if (assetFileDescriptorOpenFd != null) {
                        assetFileDescriptorOpenFd.close();
                    }
                }
            } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
                LogUtil.e("Suggestion_mediaHelper", "setAudioAssetSources", LogAnonymous.b(e));
            }
            return this;
        }
        LogUtil.e("Suggestion_mediaHelper", "setAudioAssetSources mPlayer == null");
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setSdSourcesBackground(String str) {
        setSdSources(xkf.b(str, this.f9340b, this.d, AudioConstant.AUDIO));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSdSources(String... strArr) {
        if (CommonUtil.ca()) {
            return setAssetSources(strArr);
        }
        this.f9341c = 0;
        try {
            this.n = strArr.length;
            if (this.e == null || this.h == null) {
                LogUtil.e("Suggestion_mediaHelper", "setSdSources mPlayer == null or mAssetSources == null");
                return this;
            }
            this.o = PathType.SD;
            this.h.clear();
            this.h.addAll(Arrays.asList(strArr));
            this.e.reset();
            if (this.h.size() > 0 && this.h.get(0) != null) {
                this.e.setDataSource(this.h.get(0));
                b();
                return this;
            }
            return this;
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Suggestion_mediaHelper", "setDataSource fail -- ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSdSources(List<String> list) {
        if (CommonUtil.ca()) {
            return setAudioAssetSources(list);
        }
        this.f9341c = 0;
        try {
            this.n = list.size();
            if (this.e == null) {
                LogUtil.e("Suggestion_mediaHelper", "setSdSources mPlayer == null");
                return this;
            }
            this.o = PathType.SD;
            this.h.clear();
            this.h.addAll(list);
            this.e.reset();
            if (this.h.get(0) != null) {
                this.e.setDataSource(this.h.get(0));
                b();
                return this;
            }
            return this;
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Suggestion_mediaHelper", "setSdSources(@NonNull List<String> fileName) ", LogAnonymous.b(e));
        }
    }

    protected void b() {
        b(this.e);
    }

    protected void b(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            LogUtil.e("Suggestion_mediaHelper", "mPlayer is null");
            return;
        }
        mediaPlayer.setLooping(this.f9339a);
        setVideoScalingMode();
        try {
            mediaPlayer.prepare();
        } catch (Exception e) {
            LogUtil.e("Suggestion_mediaHelper", "later player prepare()error: ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setRawSources(Integer... numArr) {
        this.n = numArr.length;
        this.f9341c = 0;
        if (this.e != null) {
            this.o = PathType.RAW;
            this.m.clear();
            this.m.addAll(Arrays.asList(numArr));
            this.e.reset();
            MediaPlayer mediaPlayerCreate = MediaPlayer.create(this.i, numArr[0].intValue());
            this.e = mediaPlayerCreate;
            mediaPlayerCreate.setLooping(this.f9339a);
            setVideoScalingMode();
            return this;
        }
        LogUtil.e("Suggestion_mediaHelper", "setRawSources mPlayer == null");
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setDisplay(final SurfaceHolder surfaceHolder) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.helper.MediaStrategy.4
            @Override // java.lang.Runnable
            public void run() {
                if (MediaStrategy.this.e != null && surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid()) {
                    MediaStrategy.this.e.setDisplay(surfaceHolder);
                } else {
                    LogUtil.e("Suggestion_mediaHelper", "setDisplay mPlayer == null");
                }
            }
        });
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
        this.f9341c = i;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getVideoWidth() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getVideoHeight() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setPlayerSpeed(final float f) {
        if (this.e != null) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hkg
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(f);
                }
            });
        }
    }

    public /* synthetic */ void b(float f) {
        try {
            this.e.setPlaybackParams(new PlaybackParams().setSpeed(f));
        } catch (IllegalArgumentException | IllegalStateException unused) {
            LogUtil.e("Suggestion_mediaHelper", "setPlaybackParamsClickEvent IllegalArgumentException or IllegalStateException");
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setSurfaceParentGlobalLayoutListener(ViewGroup viewGroup) {
        this.s = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy setSurface(Surface surface) {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
            return this;
        }
        LogUtil.e("Suggestion_mediaHelper", "setSurface mPlayer == null");
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy pause() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy repeat() {
        if (this.e != null) {
            this.f9341c--;
            next();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy pre() {
        try {
            if (this.e == null) {
                LogUtil.e("Suggestion_mediaHelper", "Prepare mPlayer == null");
                return this;
            }
            int i = this.f9341c;
            int i2 = i - 1;
            this.f9341c = i2;
            if (i2 < 0) {
                this.f9341c = i;
                LogUtil.d("Suggestion_mediaHelper", "It's the first");
                return this;
            }
            c();
            return this;
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Suggestion_mediaHelper", LogAnonymous.b(e));
            return this;
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy next() {
        try {
            if (this.e == null) {
                LogUtil.e("Suggestion_mediaHelper", "Next mPlayer == null");
                return this;
            }
            int i = this.f9341c;
            int i2 = i + 1;
            this.f9341c = i2;
            if (i2 >= this.n) {
                this.f9341c = i;
                LogUtil.d("Suggestion_mediaHelper", "It's the last");
                return this;
            }
            c();
            return this;
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Suggestion_mediaHelper", "next_error--", LogAnonymous.b(e));
            return this;
        }
    }

    private void c() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            if (this.o == PathType.ASSET) {
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    if (njy.c(this.h, this.f9341c)) {
                        assetFileDescriptorOpenFd = this.i.getAssets().openFd(this.h.get(this.f9341c));
                        this.e.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        this.e.prepare();
                    }
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused) {
                            LogUtil.e("Suggestion_mediaHelper", "IOException");
                        }
                    }
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused2) {
                            LogUtil.e("Suggestion_mediaHelper", "IOException");
                        }
                    }
                    throw th;
                }
            } else if (this.o == PathType.RAW) {
                if (njy.c(this.m, this.f9341c)) {
                    this.e = MediaPlayer.create(this.i, this.m.get(this.f9341c).intValue());
                }
            } else if (this.o == PathType.SD) {
                if (njy.c(this.h, this.f9341c)) {
                    LogUtil.a("Suggestion_mediaHelper", "mCurrent video path is ", this.h.get(this.f9341c));
                    this.e.setDataSource(this.h.get(this.f9341c));
                    this.e.prepare();
                }
            } else if (njy.c(this.k, this.f9341c)) {
                this.e.setDataSource(this.i, this.k.get(this.f9341c));
                this.e.prepare();
            }
            this.e.setLooping(this.f9339a);
            this.e.start();
            setVideoScalingMode();
            return;
        }
        LogUtil.e("Suggestion_mediaHelper", "changeSource mPlayer == null");
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy videoContinue() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MediaStrategy setLooping(boolean z) {
        this.f9339a = z;
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public PlayerStrategy release() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            this.f9341c = 0;
            this.m = null;
            this.h = null;
            this.k = null;
            mediaPlayer.release();
            this.e = null;
            this.g = null;
        }
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public String getCurrentName() {
        if (njy.c(this.h, this.f9341c)) {
            return this.h.get(this.f9341c);
        }
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getSourceNum() {
        return this.n;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setVolume(float f) {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void saveCurrent(int i) {
        this.f9341c = i;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void changeAudioGender() {
        this.f9340b = "M".equals(this.f9340b) ? AudioConstant.WOMAN : "M";
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setGender(int i) {
        if (i == 1) {
            this.f9340b = AudioConstant.WOMAN;
        } else {
            this.f9340b = "M";
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public MediaPlayer getPlayer() {
        return this.e;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public int getDuration() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void reset() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public List<String> getNumberPaths(int i) {
        ArrayList arrayList = new ArrayList();
        if (i > 130) {
            d(arrayList, i);
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("B");
        int length = String.valueOf(i).length();
        for (int i2 = 0; i2 < 3 - length; i2++) {
            sb.append("0");
        }
        sb.append(i);
        arrayList.add(xkf.b(sb.toString(), this.f9340b, this.d, AudioConstant.AUDIO));
        return arrayList;
    }

    private void a(List<String> list, int i) {
        LogUtil.d("Suggestion_mediaHelper", "getNumWithinTen()---", Integer.valueOf(i));
        if (i < 10) {
            list.add(d(i));
        }
    }

    private String d(int i) {
        return xkf.b("B00" + i, this.f9340b, this.d, AudioConstant.AUDIO);
    }

    private void c(List<String> list, int i) {
        LogUtil.d("Suggestion_mediaHelper", "dealNumAboveTenWithinHundred", Integer.valueOf(i));
        if (i <= 9 || i >= 100) {
            return;
        }
        list.add(xkf.b("B0" + ((i / 10) * 10), this.f9340b, this.d, AudioConstant.AUDIO));
        int i2 = i % 10;
        if (i2 > 0) {
            a(list, i2);
        }
    }

    private void d(List<String> list, int i) {
        LogUtil.d("Suggestion_mediaHelper", "getNumAboveHundredWithinThousand", Integer.valueOf(i));
        list.add(xkf.b("B" + ((i / 100) * 100), this.f9340b, this.d, AudioConstant.AUDIO));
        if (i > 100) {
            if (i < 120) {
                a(list, 1);
                LogUtil.e("Suggestion_mediaHelper", "have no media");
            } else {
                c(list, i % 100);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void saveFitnessType(String str) {
        this.d = str;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i, 2);
        } else {
            LogUtil.e("Suggestion_mediaHelper", "mediaPlayer is null");
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy
    public void setVideoScalingMode() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVideoScalingMode(2);
            } catch (RuntimeException e) {
                LogUtil.e("Suggestion_mediaHelper", "setVideoScalingMode RuntimeError.", LogAnonymous.b(e));
            }
        }
    }
}
