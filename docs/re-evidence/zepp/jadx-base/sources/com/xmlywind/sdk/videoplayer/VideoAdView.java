package com.xmlywind.sdk.videoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.utils.o;
import com.xmlywind.sdk.nativead.SigAdView;
import com.xmlywind.sdk.nativead.h;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes22.dex */
public class VideoAdView extends RelativeLayout implements View.OnClickListener, View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    public static boolean a = true;
    public static int b = 6;
    public static int c = 1;
    public static boolean d = false;
    public static boolean e = true;
    public static int f;
    public int A;
    public a B;
    public boolean C;
    public VideoPlayerTextureView D;
    public AudioManager.OnAudioFocusChangeListener E;
    private ViewGroup F;
    private ViewGroup G;
    private ViewGroup H;
    private ViewGroup I;
    private ViewGroup J;
    private ViewGroup K;
    private ViewGroup L;
    private ViewGroup M;
    private ProgressBar N;
    private ImageView O;
    private h P;
    private boolean Q;
    private com.xmlywind.sdk.videoplayer.a R;
    private ImageView S;
    private int T;
    private int U;
    private c V;
    private boolean W;
    private View aa;
    private boolean ab;
    private View ac;
    public VideoAdView g;
    public int h;
    public int i;
    public d j;
    public int k;
    public int l;
    public Class m;
    public boolean n;
    public e o;
    public int p;
    public int q;
    public int r;
    public long s;
    public ImageView t;
    public ImageView u;
    public ImageView v;
    public boolean w;
    public long x;
    public Timer y;
    public int z;

    /* JADX INFO: renamed from: com.xmlywind.sdk.videoplayer.VideoAdView$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.xmlywind.sdk.videoplayer.c.values().length];
            a = iArr;
            try {
                iArr[com.xmlywind.sdk.videoplayer.c.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.xmlywind.sdk.videoplayer.c.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.xmlywind.sdk.videoplayer.c.VOLUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.xmlywind.sdk.videoplayer.c.FULLSCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.xmlywind.sdk.videoplayer.c.BIGRETRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.xmlywind.sdk.videoplayer.c.BACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            VideoAdView videoAdView = VideoAdView.this;
            int i = videoAdView.h;
            if (i == 4 || i == 5) {
                videoAdView.post(new Runnable() { // from class: com.xmlywind.sdk.videoplayer.VideoAdView.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        long currentPositionWhenPlaying = VideoAdView.this.getCurrentPositionWhenPlaying();
                        long duration = VideoAdView.this.getDuration();
                        VideoAdView.this.a((int) ((100 * currentPositionWhenPlaying) / (duration == 0 ? 1L : duration)), currentPositionWhenPlaying, duration);
                    }
                });
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public class c extends BroadcastReceiver {
        public b a;

        public c(b bVar) {
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int streamVolume;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || this.a == null || (streamVolume = ((AudioManager) VideoAdView.this.getApplicationContext().getSystemService("audio")).getStreamVolume(3)) < 0) {
                return;
            }
            this.a.a(streamVolume);
        }
    }

    public VideoAdView(Context context) {
        super(context);
        this.h = -1;
        this.i = -1;
        this.k = 0;
        this.l = 0;
        this.n = true;
        this.p = -1;
        this.q = 0;
        this.r = -1;
        this.s = 0L;
        this.w = false;
        this.x = 0L;
        this.E = new AudioManager.OnAudioFocusChangeListener() { // from class: com.xmlywind.sdk.videoplayer.VideoAdView.1
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                StringBuilder sb;
                String str;
                if (i == -2) {
                    sb = new StringBuilder();
                    str = "AUDIOFOCUS_LOSS_TRANSIENT [";
                } else {
                    if (i != -1) {
                        return;
                    }
                    VideoAdView.this.D();
                    sb = new StringBuilder();
                    str = "AUDIOFOCUS_LOSS [";
                }
                sb.append(str);
                sb.append(hashCode());
                sb.append("]");
                SigmobLog.i(sb.toString());
            }
        };
        this.Q = true;
        this.W = false;
        a(context);
    }

    public VideoAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        this.i = -1;
        this.k = 0;
        this.l = 0;
        this.n = true;
        this.p = -1;
        this.q = 0;
        this.r = -1;
        this.s = 0L;
        this.w = false;
        this.x = 0L;
        this.E = new AudioManager.OnAudioFocusChangeListener() { // from class: com.xmlywind.sdk.videoplayer.VideoAdView.1
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                StringBuilder sb;
                String str;
                if (i == -2) {
                    sb = new StringBuilder();
                    str = "AUDIOFOCUS_LOSS_TRANSIENT [";
                } else {
                    if (i != -1) {
                        return;
                    }
                    VideoAdView.this.D();
                    sb = new StringBuilder();
                    str = "AUDIOFOCUS_LOSS [";
                }
                sb.append(str);
                sb.append(hashCode());
                sb.append("]");
                SigmobLog.i(sb.toString());
            }
        };
        this.Q = true;
        this.W = false;
        a(context);
    }

    private void E() {
        try {
            e eVar = this.o;
            if (eVar != null) {
                eVar.d();
            }
            Class cls = this.m;
            this.o = cls == null ? new f(this) : (e) cls.getConstructor(VideoAdView.class).newInstance(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void A() {
    }

    public void B() {
        int i;
        VideoAdView videoAdView = this.g;
        if (videoAdView == null || (i = videoAdView.h) == 0) {
            l();
            return;
        }
        if (i == 5) {
            h hVar = this.P;
            if (hVar != null) {
                hVar.onVideoAdResume();
            }
            this.g.f();
            this.g.o.a();
            return;
        }
        if (i == 3) {
            h hVar2 = this.P;
            if (hVar2 != null) {
                hVar2.onVideoAdStartPlay();
            }
            this.g.o.a();
            this.g.f();
        }
    }

    public void C() {
        VideoAdView videoAdView = this.g;
        if (videoAdView != null) {
            int i = videoAdView.h;
            if (i == 6 || i == 0 || i == 1 || i == 7) {
                D();
            } else if (i != 5) {
                videoAdView.g();
                this.g.o.c();
            }
        }
    }

    public void D() {
        SigmobLog.i("releaseAllVideos");
        VideoAdView videoAdView = this.g;
        if (videoAdView != null) {
            videoAdView.k();
            this.g = null;
        }
    }

    public void a() {
        D();
        if (this.V != null) {
            getContext().unregisterReceiver(this.V);
            this.V = null;
        }
    }

    public void a(int i, int i2) {
        String str;
        SigmobLog.d("onInfo what - " + i + " extra - " + i2);
        if (i == 3) {
            int i3 = this.h;
            if (i3 == 3 || i3 == 2) {
                f();
                return;
            }
            return;
        }
        if (i == 701) {
            if (this.h == 4) {
                this.ab = true;
                this.o.c();
                g();
            }
            str = "MEDIA_INFO_BUFFERING_START";
        } else {
            if (i != 702) {
                return;
            }
            if (this.ab) {
                this.ab = false;
                this.o.a();
                f();
            }
            str = "MEDIA_INFO_BUFFERING_END";
        }
        SigmobLog.d(str);
    }

    public void a(int i, int i2, int i3) {
        if (i == 0) {
            b();
            return;
        }
        if (i == 1) {
            c();
            return;
        }
        if (i == 2) {
            a(i2, i3);
            return;
        }
        if (i == 4) {
            f();
            return;
        }
        if (i == 5) {
            g();
        } else if (i == 6) {
            i();
        } else {
            if (i != 7) {
                return;
            }
            h();
        }
    }

    public void a(int i, long j) {
        this.h = 2;
        this.s = j;
        this.j.a = i;
        this.o.a((Surface) null);
        this.o.d();
        this.o.b();
    }

    public void a(int i, long j, long j2) {
        ProgressBar progressBar;
        SigmobLog.d("onProgress: progress=" + i + " position=" + j + " duration=" + j2);
        if (!this.C) {
            int i2 = this.r;
            if (i2 != -1) {
                if (i2 > i) {
                    return;
                } else {
                    this.r = -1;
                }
            } else if (i != 0 && (progressBar = this.N) != null) {
                progressBar.setProgress(i);
            }
        }
        h hVar = this.P;
        if (hVar != null) {
            hVar.onProgressUpdate(j, j2);
        }
    }

    public void a(Context context) {
        View.inflate(context, getLayoutId(), this);
        this.J = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_sound_rl"));
        this.G = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_start_rl"));
        this.H = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_fullscreen_rl"));
        this.I = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_replay_rl"));
        this.v = (ImageView) findViewById(o.a(getContext(), "sig_native_video_sound_btn"));
        this.t = (ImageView) findViewById(o.a(getContext(), "sig_native_video_start_btn"));
        this.u = (ImageView) findViewById(o.a(getContext(), "sig_native_video_fullscreen_btn"));
        this.F = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_surface_container"));
        this.M = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_app_container"));
        this.N = (ProgressBar) findViewById(o.a(getContext(), "sig_native_video_bottom_progress"));
        this.K = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_big_replay"));
        this.O = (ImageView) findViewById(o.a(getContext(), "sig_native_video_thumb"));
        this.S = (ImageView) findViewById(o.a(getContext(), "sig_native_video_blurImageView"));
        this.L = (ViewGroup) findViewById(o.a(getContext(), "sig_native_video_back_rl"));
        this.aa = findViewById(o.a(getContext(), "sig_native_video_layout_top"));
        this.ac = findViewById(o.a(getContext(), "sig_native_video_layout_bottom"));
        this.I.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.G.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.z = getContext().getResources().getDisplayMetrics().widthPixels;
        this.A = getContext().getResources().getDisplayMetrics().heightPixels;
        this.V = new c(new b() { // from class: com.xmlywind.sdk.videoplayer.VideoAdView.2
            @Override // com.xmlywind.sdk.videoplayer.VideoAdView.b
            public void a(int i) {
                if (i == 0 || VideoAdView.this.Q) {
                    VideoAdView videoAdView = VideoAdView.this;
                    videoAdView.v.setImageResource(o.c(videoAdView.getContext(), "sig_image_video_mute"));
                } else {
                    VideoAdView videoAdView2 = VideoAdView.this;
                    videoAdView2.v.setImageResource(o.c(videoAdView2.getContext(), "sig_image_video_unmute"));
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        context.registerReceiver(this.V, intentFilter);
        this.h = -1;
    }

    public void a(com.xmlywind.sdk.videoplayer.c cVar, boolean z) {
        ViewGroup viewGroup;
        int i = 4;
        switch (AnonymousClass3.a[cVar.ordinal()]) {
            case 1:
                viewGroup = this.G;
                if (z) {
                }
                a(viewGroup, i);
            case 2:
                viewGroup = this.I;
                if (z) {
                }
                a(viewGroup, i);
            case 3:
                viewGroup = this.J;
                if (z) {
                }
                a(viewGroup, i);
            case 4:
                viewGroup = this.H;
                if (z) {
                }
                a(viewGroup, i);
            case 5:
                viewGroup = this.K;
                if (z) {
                }
                a(viewGroup, i);
            case 6:
                viewGroup = this.L;
                if (z) {
                }
                a(viewGroup, i);
            default:
                return;
        }
        i = 0;
        a(viewGroup, i);
    }

    public void a(d dVar, int i) {
        a(dVar, i, (Class) null);
    }

    public void a(d dVar, int i, Class cls) {
        if (System.currentTimeMillis() - this.x < 200) {
            return;
        }
        this.j = dVar;
        this.i = i;
        b();
        this.m = cls;
    }

    public void a(boolean z) {
        this.W = z;
    }

    public void b() {
        SigmobLog.d("onStateNormal stat" + this.h + " [" + hashCode() + "] ");
        this.h = 0;
        a(this.O, 0);
        a(this.G, 0);
        p();
        e eVar = this.o;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void b(int i, int i2) {
        SigmobLog.e("onError " + i + " - " + i2 + " [" + hashCode() + "] ");
        h hVar = this.P;
        if (hVar != null) {
            hVar.onVideoError(i, i2);
        }
        if (i == 38 || i2 == -38 || i == -38 || i2 == 38 || i2 == -19) {
            return;
        }
        h();
        this.o.d();
    }

    public void c() {
        SigmobLog.d("onStatePreparing  [" + hashCode() + "] ");
        this.h = 1;
        q();
    }

    public void c(int i, int i2) {
        this.T = i2;
        this.U = i;
        SigmobLog.d("onVideoSizeChanged  [" + hashCode() + "] ");
        VideoPlayerTextureView videoPlayerTextureView = this.D;
        if (videoPlayerTextureView != null) {
            int i3 = this.q;
            if (i3 != 0) {
                videoPlayerTextureView.setRotation(i3);
            }
            this.D.a(i, i2);
        }
    }

    public boolean d() {
        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService("audio");
        return audioManager != null && audioManager.getStreamVolume(3) == 0;
    }

    public void e() {
        SigmobLog.d("onPrepared  [" + hashCode() + "] ");
        this.h = 3;
        setSoundChange(this.Q);
        h hVar = this.P;
        if (hVar != null) {
            hVar.onVideoLoad();
        }
        if (!this.w) {
            h hVar2 = this.P;
            if (hVar2 != null) {
                hVar2.onVideoAdStartPlay();
            }
            SigmobLog.d("mediaInterface start");
            f();
            this.o.a();
            this.w = false;
        } else if (this.W) {
            this.O.setImageBitmap(this.D.getBitmap());
        }
        if (this.j.a().toString().toLowerCase().contains("mp3") || this.j.a().toString().toLowerCase().contains("wma") || this.j.a().toString().toLowerCase().contains("aac") || this.j.a().toString().toLowerCase().contains("m4a") || this.j.a().toString().toLowerCase().contains("wav")) {
            f();
        }
    }

    public void f() {
        SigmobLog.d("onStatePlaying  [" + hashCode() + "] ");
        a(this.O, 4);
        a(this.G, 4);
        if (this.h == 3) {
            long j = this.s;
            if (j != 0) {
                this.o.a(j);
                this.s = 0L;
            }
        }
        this.h = 4;
        o();
    }

    public void g() {
        SigmobLog.i("onStatePause  [" + hashCode() + "] ");
        this.h = 5;
        a(this.G, 0);
        h hVar = this.P;
        if (hVar != null) {
            hVar.onVideoAdPaused();
        }
        o();
    }

    public ViewGroup getAppContainer() {
        return this.M;
    }

    public Context getApplicationContext() {
        Context applicationContext;
        Context context = getContext();
        return (context == null || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }

    public ImageView getBlurImageView() {
        return this.S;
    }

    public View getBottomLayoutView() {
        return this.ac;
    }

    public long getCurrentPositionWhenPlaying() {
        int i = this.h;
        if (i == 4 || i == 5) {
            try {
                return this.o.e();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    public long getDuration() {
        try {
            return this.o.f();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public int getLayoutId() {
        return o.b(getContext(), "sig_video_player_layout");
    }

    public ViewGroup getSigAdView() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        while (!(viewGroup instanceof SigAdView) && (viewGroup = (ViewGroup) getParent()) != null) {
        }
        return viewGroup;
    }

    public Bitmap getTextureBitmap() {
        VideoPlayerTextureView videoPlayerTextureView = this.D;
        if (videoPlayerTextureView != null) {
            return videoPlayerTextureView.getBitmap();
        }
        return null;
    }

    public ImageView getThumbView() {
        return this.O;
    }

    public View getTopLayoutView() {
        return this.aa;
    }

    public int getVideoHeight() {
        return this.T;
    }

    public int getVideoSurferViewHeight() {
        VideoPlayerTextureView videoPlayerTextureView = this.D;
        if (videoPlayerTextureView != null) {
            return videoPlayerTextureView.getHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        return this.U;
    }

    public void h() {
        SigmobLog.d("onStateError  [" + hashCode() + "] ");
        this.h = 7;
        p();
        a(this.i == 1 ? this.G : this.I, 0);
    }

    public void i() {
        SigmobLog.i("onStateAutoComplete  [" + hashCode() + "] ");
        this.h = 6;
        p();
        ProgressBar progressBar = this.N;
        if (progressBar != null) {
            progressBar.setProgress(100);
        }
    }

    public void j() {
        Runtime.getRuntime().gc();
        h hVar = this.P;
        if (hVar != null) {
            hVar.onVideoAdComplete();
        }
        SigmobLog.d("onAutoCompletion  [" + hashCode() + "] ");
        p();
        A();
        y();
        z();
        i();
        Window windowC = com.xmlywind.sdk.videoplayer.b.c(getContext());
        if (windowC != null) {
            windowC.clearFlags(128);
        }
        q();
        this.g = null;
    }

    public void k() {
        SigmobLog.d("reset  [" + hashCode() + "] ");
        p();
        q();
        A();
        y();
        z();
        b();
        this.F.removeAllViews();
        Window windowC = com.xmlywind.sdk.videoplayer.b.c(getContext());
        if (windowC != null) {
            windowC.clearFlags(128);
        }
        e eVar = this.o;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void l() {
        SigmobLog.d("startVideo [" + hashCode() + "] ");
        setCurrentVideoAdView(this);
        try {
            E();
            a(this.I, 4);
            a(this.K, 4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Window windowC = com.xmlywind.sdk.videoplayer.b.c(getContext());
        if (windowC != null) {
            windowC.setFlags(16777216, 16777216);
            windowC.addFlags(128);
        }
        m();
        c();
    }

    public void m() {
        SigmobLog.d("addTextureView [" + hashCode() + "] ");
        VideoPlayerTextureView videoPlayerTextureView = this.D;
        if (videoPlayerTextureView != null) {
            this.F.removeView(videoPlayerTextureView);
        }
        VideoPlayerTextureView videoPlayerTextureView2 = new VideoPlayerTextureView(getContext().getApplicationContext());
        this.D = videoPlayerTextureView2;
        videoPlayerTextureView2.setSurfaceTextureListener(this.o);
        this.F.addView(this.D, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void n() {
        Window windowC = com.xmlywind.sdk.videoplayer.b.c(getContext());
        if (windowC != null) {
            ((ViewGroup) windowC.getDecorView()).removeView(this);
        }
    }

    public void o() {
        SigmobLog.d("startProgressTimer:  [" + hashCode() + "] ");
        p();
        this.y = new Timer();
        a aVar = new a();
        this.B = aVar;
        this.y.schedule(aVar, 0L, 300L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        onTouch(view, null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.i;
        if (i3 == 1 || i3 == 2 || this.k == 0 || this.l == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = (int) ((size * this.l) / this.k);
        setMeasuredDimension(size, i4);
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            getDuration();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        SigmobLog.d("bottomProgress onStartTrackingTouch [" + hashCode() + "] ");
        p();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        SigmobLog.d("bottomProgress onStopTrackingTouch [" + hashCode() + "] ");
        o();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        int i = this.h;
        if (i == 4 || i == 5) {
            long progress = (((long) seekBar.getProgress()) * getDuration()) / 100;
            this.r = seekBar.getProgress();
            this.o.a(progress);
            SigmobLog.d("seekTo " + progress + " [" + hashCode() + "] ");
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() == 1) {
            if (view == this.H) {
                int i = this.i;
                if (i == 0) {
                    r();
                } else if (i == 1) {
                    s();
                }
            } else if (view == this.J) {
                setSoundChange(!this.Q);
            } else if (view == this.I || view == this.K) {
                h hVar = this.P;
                if (hVar != null) {
                    hVar.a();
                }
                l();
            } else if (view == this.G) {
                int i2 = this.h;
                if (i2 == 0) {
                    if (!e && !this.j.a().toString().startsWith("file") && !this.j.a().toString().startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) && !com.xmlywind.sdk.videoplayer.b.a(getContext())) {
                        x();
                        return true;
                    }
                } else {
                    if (i2 == 4) {
                        SigmobLog.d("pauseVideo [" + hashCode() + "] ");
                        this.o.c();
                        g();
                        return true;
                    }
                    if (i2 == 5) {
                        h hVar2 = this.P;
                        if (hVar2 != null) {
                            hVar2.onVideoAdResume();
                        }
                        this.o.a();
                        f();
                        return true;
                    }
                    if (i2 != 6) {
                        if (i2 != 3) {
                            return true;
                        }
                        this.o.a();
                        f();
                        h hVar3 = this.P;
                        if (hVar3 == null) {
                            return true;
                        }
                        hVar3.onVideoAdStartPlay();
                        return true;
                    }
                }
                l();
                return true;
            }
        }
        return false;
    }

    public void p() {
        Timer timer = this.y;
        if (timer != null) {
            timer.cancel();
        }
        a aVar = this.B;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    public void q() {
        ProgressBar progressBar = this.N;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    public void r() {
        com.xmlywind.sdk.videoplayer.a aVar = this.R;
        if (aVar != null) {
            aVar.e();
        }
        u();
        this.u.setImageResource(o.c(getContext(), "sig_image_video_small"));
    }

    public void s() {
        this.x = System.currentTimeMillis();
        com.xmlywind.sdk.videoplayer.a aVar = this.R;
        if (aVar != null) {
            aVar.d();
        }
        t();
        this.u.setImageResource(o.c(getContext(), "sig_image_video_fullscreen"));
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(onClickListener);
        }
    }

    public void setBufferProgress(int i) {
        SigmobLog.d("setBufferProgress() called with: bufferProgress = [" + i + "]");
    }

    public void setCurrentVideoAdView(VideoAdView videoAdView) {
        this.g = videoAdView;
    }

    public void setHolderImageResource(int i) {
    }

    public void setMediaInterface(Class cls) {
        k();
        this.m = cls;
    }

    @Override // android.view.View
    public void setRotation(float f2) {
        this.D.setRotation(f2);
    }

    public void setScreen(int i) {
        if (i == 0) {
            t();
        } else if (i == 1) {
            u();
        } else {
            if (i != 2) {
                return;
            }
            v();
        }
    }

    public void setSoundChange(boolean z) {
        ImageView imageView;
        Context context;
        String str;
        this.Q = z;
        if (z) {
            e eVar = this.o;
            if (eVar != null) {
                eVar.a(0.0f);
            }
            imageView = this.v;
            context = getContext();
            str = "sig_image_video_mute";
        } else {
            e eVar2 = this.o;
            if (eVar2 != null) {
                eVar2.a(1.0f);
            }
            imageView = this.v;
            context = getContext();
            str = "sig_image_video_unmute";
        }
        imageView.setImageResource(o.c(context, str));
    }

    public void setState(int i) {
        a(i, 0, 0);
    }

    public void setTextureViewRotation(int i) {
        VideoPlayerTextureView videoPlayerTextureView;
        VideoAdView videoAdView = this.g;
        if (videoAdView == null || (videoPlayerTextureView = videoAdView.D) == null) {
            return;
        }
        videoPlayerTextureView.setRotation(i);
    }

    public void setUp(String str) {
        a(new d(str, null), 0);
    }

    public void setVideoAdStatusListener(h hVar) {
        this.P = hVar;
    }

    public void setVideoAdViewListener(com.xmlywind.sdk.videoplayer.a aVar) {
        this.R = aVar;
    }

    public void setVideoImageDisplayType(int i) {
        VideoPlayerTextureView videoPlayerTextureView;
        f = i;
        VideoAdView videoAdView = this.g;
        if (videoAdView == null || (videoPlayerTextureView = videoAdView.D) == null) {
            return;
        }
        videoPlayerTextureView.requestLayout();
    }

    public void t() {
        this.i = 0;
    }

    public void u() {
        this.i = 1;
    }

    public void v() {
        this.i = 2;
    }

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }

    public void z() {
    }
}
