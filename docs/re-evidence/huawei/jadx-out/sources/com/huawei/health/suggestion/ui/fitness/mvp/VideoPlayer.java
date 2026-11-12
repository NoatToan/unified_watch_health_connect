package com.huawei.health.suggestion.ui.fitness.mvp;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public class VideoPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9434c;
    private VideoCurrentPositionCallBack d;
    private boolean e;
    private MediaPlayer g;
    private SurfaceView k;
    private MediaPlayer l;
    private PreviewPrepareOkListener n;
    private VideoPlayPositionListener o;
    private SurfaceView p;
    private Timer q;
    private ViewGroup r;
    private boolean j = false;
    private boolean i = false;
    private boolean h = false;
    private int f = -1;
    private ArrayList<VideoPlayStateListener> m = new ArrayList<>();

    public interface PreviewPrepareOkListener {
        void prepareOk();
    }

    public interface VideoCurrentPositionCallBack {
        void onCurrentPostionChange(int i);

        void onVideoDurationChange(int i);
    }

    public interface VideoPlayPositionListener {
        void onPlayPositionChange(int i, int i2);
    }

    public interface VideoPlayStateListener {
        public static final int STATE_PAUSE = 2;
        public static final int STATE_PLAYING = 1;
        public static final int STATE_SMALL_RESET = 3;
        public static final int STATE_STOP = 0;

        void onPlayStateChange(int i);
    }

    public VideoPlayer(Context context) {
        this.f9434c = context;
    }

    public void d() {
        if (this.g == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.g = mediaPlayer;
            mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: hmo
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
                    this.e.c(mediaPlayer2, i, i2);
                }
            });
            if (this.p == null) {
                this.p = new SurfaceView(this.f9434c);
                LogUtil.a("Suggestion_VideoPlayer", "new mSurfaceView");
            }
            this.p.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.5
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    if (surfaceHolder == null) {
                        LogUtil.e("Suggestion_VideoPlayer", "createPlayer surfaceHolder is null");
                        return;
                    }
                    Surface surface = surfaceHolder.getSurface();
                    if (surface == null) {
                        LogUtil.e("Suggestion_VideoPlayer", "surface is null");
                        return;
                    }
                    if (surface.isValid()) {
                        if (VideoPlayer.this.g != null) {
                            VideoPlayer.this.g.setDisplay(surfaceHolder);
                            LogUtil.a("Suggestion_VideoPlayer", "surfaceCreated");
                            return;
                        }
                        return;
                    }
                    LogUtil.e("Suggestion_VideoPlayer", "surface is not Valid");
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    LogUtil.d("Suggestion_VideoPlayer", "surfaceChanged");
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    LogUtil.d("Suggestion_VideoPlayer", "surfaceDestroyed");
                }
            });
        }
    }

    public /* synthetic */ void c(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.r != null) {
            int videoWidth = this.g.getVideoWidth();
            int videoHeight = this.g.getVideoHeight();
            LogUtil.a("Suggestion_VideoPlayer", "createPlayer videoWidth:", Integer.valueOf(videoWidth), ", videoHeight:", Integer.valueOf(videoHeight));
            if (videoWidth <= 0 || videoHeight <= 0) {
                return;
            }
            d(this.p, videoWidth, videoHeight);
        }
    }

    public void a() {
        if (this.l == null) {
            LogUtil.d("Suggestion_VideoPlayer", "createPlayer mPreviewPlayer");
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.l = mediaPlayer;
            mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: hms
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
                    this.f36920c.e(mediaPlayer2, i, i2);
                }
            });
            this.l.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: hmr
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    this.d.a(mediaPlayer2);
                }
            });
            this.k = new SurfaceView(this.f9434c);
            LogUtil.d("Suggestion_VideoPlayer", "new mPreviewSurfaceView");
            this.k.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.1
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    if (surfaceHolder == null) {
                        LogUtil.e("Suggestion_VideoPlayer", "preview surfaceHolder is null");
                        return;
                    }
                    Surface surface = surfaceHolder.getSurface();
                    if (surface == null) {
                        LogUtil.e("Suggestion_VideoPlayer", "preview surface is null");
                        return;
                    }
                    if (surface.isValid()) {
                        if (VideoPlayer.this.l != null) {
                            VideoPlayer.this.l.setDisplay(surfaceHolder);
                            LogUtil.a("Suggestion_VideoPlayer", "preview surfaceCreated");
                            return;
                        }
                        return;
                    }
                    LogUtil.e("Suggestion_VideoPlayer", "preview surface is not Valid");
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    LogUtil.d("Suggestion_VideoPlayer", "preview surfaceChanged");
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    LogUtil.d("Suggestion_VideoPlayer", "preview surfaceDestroyed");
                }
            });
        }
    }

    public /* synthetic */ void e(MediaPlayer mediaPlayer, int i, int i2) {
        i();
    }

    public /* synthetic */ void a(MediaPlayer mediaPlayer) {
        l();
    }

    public void i() {
        MediaPlayer mediaPlayer;
        if (this.r == null || (mediaPlayer = this.l) == null) {
            return;
        }
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = this.l.getVideoHeight();
        LogUtil.a("Suggestion_VideoPlayer", "setPreviewSize videoWidth :", Integer.valueOf(videoWidth), " , videoHeight :", Integer.valueOf(videoHeight));
        if (videoWidth <= 0 || videoHeight <= 0) {
            return;
        }
        d(this.k, videoWidth, videoHeight);
    }

    public void o() {
        if (this.q == null) {
            LogUtil.d("Suggestion_VideoPlayer", "startTimer new Timer");
            Timer timer = new Timer("Suggestion_VideoPlayer");
            this.q = timer;
            timer.schedule(new TimerTask() { // from class: com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (VideoPlayer.this.d == null || !VideoPlayer.this.i) {
                        return;
                    }
                    VideoPlayer.this.d.onCurrentPostionChange(VideoPlayer.this.l.getCurrentPosition());
                }
            }, 0L, 1000L);
        }
    }

    public void a(VideoCurrentPositionCallBack videoCurrentPositionCallBack) {
        this.d = videoCurrentPositionCallBack;
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.r = viewGroup;
            viewGroup.removeAllViews();
            k();
            this.r.addView(this.p);
            this.p.setZOrderMediaOverlay(true);
            this.p.getHolder().setFormat(-3);
            LogUtil.a("Suggestion_VideoPlayer", "setContentView ok");
        }
    }

    public SurfaceView e() {
        return this.k;
    }

    public void c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.r = viewGroup;
            viewGroup.removeAllViews();
            f();
            this.r.addView(this.k);
            this.k.getHolder().setFormat(-3);
            LogUtil.a("Suggestion_VideoPlayer", "setPreviewContentView ok");
        }
    }

    public void j() {
        LogUtil.d("Suggestion_VideoPlayer", "resetPreviewPlay");
        m();
        LogUtil.d("Suggestion_VideoPlayer", "resetPreviewPlay mIsPreviewPlaying release");
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.l.release();
        }
        this.l = null;
        this.i = false;
    }

    public void d(SurfaceView surfaceView, int i, int i2) {
        if (surfaceView == null) {
            LogUtil.j("Suggestion_VideoPlayer", "tryResetSurfaceSize surfaceView is null");
            return;
        }
        if (!(surfaceView.getParent() instanceof ViewGroup)) {
            LogUtil.j("Suggestion_VideoPlayer", "tryResetSurfaceSize getParent is not ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) surfaceView.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        LogUtil.a("Suggestion_VideoPlayer", "tryResetSurfaceSize, width:", Integer.valueOf(width), " height:", Integer.valueOf(height), " videoWidth:", Integer.valueOf(i), " videoHeight:", Integer.valueOf(i2));
        if (width <= 0 || height <= 0) {
            return;
        }
        if (!(surfaceView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            LogUtil.j("Suggestion_VideoPlayer", "!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
        if (i2 == 0) {
            LogUtil.j("Suggestion_VideoPlayer", "tryResetSurfaceSize videoHeight == 0");
            return;
        }
        float f = i / i2;
        if (f == 0.0f) {
            LogUtil.j("Suggestion_VideoPlayer", "tryResetSurfaceSize scaleVideo is zero");
            return;
        }
        if (f > width / height) {
            layoutParams.width = width;
        } else {
            layoutParams.width = (height * 16) / 9;
        }
        layoutParams.height = (int) (layoutParams.width / f);
        layoutParams.gravity = 17;
        LogUtil.a("Suggestion_VideoPlayer", "params.width:", Integer.valueOf(layoutParams.width), " params.height:", Integer.valueOf(layoutParams.height));
        surfaceView.setLayoutParams(layoutParams);
    }

    public void l() {
        LogUtil.d("Suggestion_VideoPlayer", "stopPreviewPlay");
        this.i = false;
        this.e = false;
        this.h = false;
        this.f9433b = 0;
        m();
        a(0);
        LogUtil.d("Suggestion_VideoPlayer", "stopPreviewPlay notifyStateChange STATE_STOP");
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.l.release();
        }
        this.l = null;
    }

    public void g() {
        a(2);
        if (this.j) {
            this.g.pause();
        }
        this.j = false;
        this.f = -1;
        VideoPlayPositionListener videoPlayPositionListener = this.o;
        if (videoPlayPositionListener != null) {
            videoPlayPositionListener.onPlayPositionChange(-1, -1);
        }
    }

    public void d(boolean z) {
        MediaPlayer mediaPlayer;
        LogUtil.a("Suggestion_VideoPlayer", "pausePreviewPlay");
        if (z) {
            LogUtil.a("Suggestion_VideoPlayer", "pausePreviewPlay notify:", Boolean.valueOf(z));
            a(2);
        }
        if (h() && (mediaPlayer = this.l) != null) {
            mediaPlayer.pause();
        }
        this.i = false;
    }

    private void a(int i) {
        LogUtil.d("Suggestion_VideoPlayer", "notifyStateChange start");
        if (njy.b(this.m)) {
            LogUtil.d("Suggestion_VideoPlayer", "notifyStateChange mStateListeners not empty");
            for (VideoPlayStateListener videoPlayStateListener : this.m) {
                if (videoPlayStateListener == null) {
                    LogUtil.e("Suggestion_VideoPlayer", "notifyStateChange: listener is null");
                } else {
                    LogUtil.j("Suggestion_VideoPlayer", "notifyStateChange: notify state is ", Integer.valueOf(i));
                    videoPlayStateListener.onPlayStateChange(i);
                }
            }
        }
    }

    public boolean b() {
        return this.j;
    }

    public boolean h() {
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    public void b(boolean z) {
        this.f9432a = z;
    }

    public void c() {
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            this.j = false;
            mediaPlayer.release();
        }
        if (this.m != null) {
            LogUtil.d("Suggestion_VideoPlayer", "destroyPlay mStateListeners");
            this.m = null;
        }
        m();
        k();
    }

    private void k() {
        SurfaceView surfaceView = this.p;
        if (surfaceView == null || surfaceView.getParent() == null || !(this.p.getParent() instanceof ViewGroup)) {
            return;
        }
        LogUtil.a("Suggestion_VideoPlayer", "removeFromParentView:", this.p.getParent());
        ((ViewGroup) this.p.getParent()).removeView(this.p);
    }

    public void f() {
        SurfaceView surfaceView = this.k;
        if (surfaceView == null || surfaceView.getParent() == null || !(this.k.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.k.getParent()).removeView(this.k);
    }

    public void c(int i) {
        LogUtil.a("Suggestion_VideoPlayer", "previewSeekTo");
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i, 2);
        } else {
            LogUtil.e("Suggestion_VideoPlayer", "previewSeekTo mediaPlayer is null");
        }
    }

    public void m() {
        Timer timer = this.q;
        if (timer == null) {
            LogUtil.j("Suggestion_VideoPlayer", "setTimerCancel mTimer is null.");
        } else {
            timer.cancel();
            this.q = null;
        }
    }

    public void e(int i) {
        LogUtil.a("Suggestion_VideoPlayer", "restorePreviewPlay currentPosintion:", Integer.valueOf(i), ", !isPreviewPlaying():", Boolean.valueOf(h()), ", mIsPrepareOk:", Boolean.valueOf(this.h));
        if (this.h && !h()) {
            LogUtil.a("Suggestion_VideoPlayer", "restorePreviewPlay mIsPrepareOk ok");
            d(i);
        } else {
            this.e = true;
            this.f9433b = i;
            LogUtil.a("Suggestion_VideoPlayer", "restorePreviewPlay mIsPrepareOk else");
        }
    }

    public void e(String str, boolean z) {
        a();
        this.h = false;
        this.e = z;
        this.f9433b = 0;
        try {
            this.l.setDataSource(str);
            LogUtil.a("Suggestion_VideoPlayer", "mPreviewPlayer.setDataSource :", str);
            this.l.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: hmq
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f36919c.e(mediaPlayer);
                }
            });
            this.l.prepareAsync();
            this.l.setScreenOnWhilePlaying(true);
        } catch (IOException e) {
            LogUtil.e("Suggestion_VideoPlayer", "IOException mPreviewPlayer:", LogAnonymous.b(e));
        } catch (IllegalArgumentException e2) {
            LogUtil.e("Suggestion_VideoPlayer", "IllegalArgumentException startPreviewPlay:", LogAnonymous.b(e2));
        } catch (IllegalStateException e3) {
            LogUtil.e("Suggestion_VideoPlayer", "IllegalStateException startPreviewPlay:", LogAnonymous.b(e3));
        } catch (SecurityException e4) {
            LogUtil.e("Suggestion_VideoPlayer", "SecurityException startPreviewPlay:", LogAnonymous.b(e4));
        }
    }

    public /* synthetic */ void e(MediaPlayer mediaPlayer) {
        this.h = true;
        if (this.n != null) {
            LogUtil.d("Suggestion_VideoPlayer", "previewPrepare mPreviewPrepareOkListener prepareOk");
            this.n.prepareOk();
        }
        if (this.l != null) {
            LogUtil.a("Suggestion_VideoPlayer", "previewPrepare ok mIsAutoPlay:", Boolean.valueOf(this.e));
            if (this.e) {
                d(this.f9433b);
                LogUtil.a("Suggestion_VideoPlayer", "previewPrepare mIsAutoPlay mCurrentPosintion:", Integer.valueOf(this.f9433b));
            }
            this.l.setLooping(this.f9432a);
            VideoCurrentPositionCallBack videoCurrentPositionCallBack = this.d;
            if (videoCurrentPositionCallBack != null) {
                videoCurrentPositionCallBack.onVideoDurationChange(this.l.getDuration());
            }
        }
    }

    public void d(int i) {
        LogUtil.d("Suggestion_VideoPlayer", "startPreviewPlay");
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            this.i = true;
            mediaPlayer.start();
            c(i);
            o();
            a(1);
            LogUtil.a("Suggestion_VideoPlayer", "startPreviewPlay notifyStateChange STATE_PLAYING");
        }
    }

    public void a(String str, int i) {
        VideoPlayPositionListener videoPlayPositionListener = this.o;
        if (videoPlayPositionListener != null) {
            videoPlayPositionListener.onPlayPositionChange(this.f, i);
        }
        this.f = i;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.g.release();
            this.g = null;
            LogUtil.d("Suggestion_VideoPlayer", "startPlay mPlayer.reset");
        }
        d();
        try {
            this.g.setDataSource(str);
            this.g.prepareAsync();
            this.g.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: hmp
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f36918b.b(mediaPlayer2);
                }
            });
            this.g.setScreenOnWhilePlaying(true);
        } catch (IOException e) {
            LogUtil.e("Suggestion_VideoPlayer", "IOException startPlay position ", LogAnonymous.b(e));
        } catch (IllegalArgumentException e2) {
            LogUtil.e("Suggestion_VideoPlayer", "IllegalArgumentException startPlay position", LogAnonymous.b(e2));
        } catch (IllegalStateException e3) {
            LogUtil.e("Suggestion_VideoPlayer", "IllegalStateException startPlay position ", LogAnonymous.b(e3));
        } catch (SecurityException e4) {
            LogUtil.e("Suggestion_VideoPlayer", "SecurityException startPlay position ", LogAnonymous.b(e4));
        }
    }

    public /* synthetic */ void b(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.g;
        if (mediaPlayer2 != null) {
            this.j = true;
            mediaPlayer2.start();
            this.g.setLooping(this.f9432a);
            a(1);
        }
    }

    public void c(VideoPlayStateListener videoPlayStateListener) {
        if (videoPlayStateListener == null) {
            return;
        }
        this.m.add(videoPlayStateListener);
    }

    public void a(VideoPlayPositionListener videoPlayPositionListener) {
        this.o = videoPlayPositionListener;
    }
}
