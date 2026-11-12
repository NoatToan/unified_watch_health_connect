package com.huawei.openalliance.ad.linked.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.PPSActivity;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.gz;
import com.huawei.openalliance.ad.ha;
import com.huawei.openalliance.ad.hc;
import com.huawei.openalliance.ad.hd;
import com.huawei.openalliance.ad.he;
import com.huawei.openalliance.ad.hj;
import com.huawei.openalliance.ad.hk;
import com.huawei.openalliance.ad.hl;
import com.huawei.openalliance.ad.hm;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ir;
import com.huawei.openalliance.ad.jo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.views.VideoView;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;

/* JADX INFO: loaded from: classes12.dex */
public class b extends d implements hm, IViewLifeCycle {
    private final MediaStateListener A;
    private MediaBufferListener B;
    private final MediaErrorListener C;
    private hj D;
    private LinkedAppDetailView E;
    private Context F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f19471a;
    private a f;
    private c.a g;
    private boolean h;
    private hk i;
    private gz j;
    private hd k;
    private VideoInfo l;
    private ImageInfo m;
    private boolean n;
    private long o;
    private LinkedNativeViewControlPanel p;
    private VideoView q;
    private jo r;
    private boolean s;
    private int t;
    private final com.huawei.openalliance.ad.media.listener.a u;
    private final MuteListener v;
    private final hk.a w;
    private long x;
    private long y;
    private final ReportVideoTimeListener z;

    public interface a {
        void a();

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    @Override // com.huawei.openalliance.ad.hm
    public void setVideoView(VideoView videoView) {
        this.q = videoView;
    }

    public void setVideoReleaseListener(c.a aVar) {
        this.g = aVar;
    }

    public void setVideoEventListener(a aVar) {
        this.f = aVar;
    }

    public void setPlayModeChangeListener(PPSActivity.b bVar) {
        hk hkVar = this.i;
        if (hkVar != null) {
            hkVar.a(bVar);
        }
    }

    public void setNotShowDataUsageAlert(boolean z) {
        this.i.h(z);
    }

    @Override // com.huawei.openalliance.ad.linked.view.d, com.huawei.openalliance.ad.hm
    public void setLinkedNativeAd(gz gzVar) {
        this.j = gzVar;
        this.D.a(gzVar);
        MediaState currentState = this.q.getCurrentState();
        if (this.j == gzVar && currentState.isNotState(MediaState.State.IDLE) && currentState.isNotState(MediaState.State.ERROR)) {
            hw.a("LinkedLandVideoView", "setLinkedNativeAd - has the same ad");
            return;
        }
        super.setLinkedNativeAd(gzVar);
        m();
        if (this.j == null) {
            this.i.d(true);
            this.l = null;
        } else {
            k();
            l();
            this.i.f(false);
            this.k.a(this.j);
        }
    }

    @Override // com.huawei.openalliance.ad.hm
    public void setLinkedLandView(hl hlVar) {
        this.D.a(this.E);
    }

    public void setCoverClickListener(View.OnClickListener onClickListener) {
        this.i.a(onClickListener);
        this.E.setVideoCoverClickListener(onClickListener);
    }

    public void setAudioFocusType(int i) {
        this.q.setAudioFocusType(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        this.i.k();
        hw.b("LinkedLandVideoView", RewardMethods.RESUME_VIEW);
        j();
        this.f19491c = false;
        this.e.onGlobalLayout();
        this.q.setNeedPauseOnSurfaceDestory(true);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        this.i.j();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.e == null) {
            return;
        }
        hw.a("LinkedLandVideoView", "on window focus changed, has window focus: %s, is playing: %s", Boolean.valueOf(z), Boolean.valueOf(this.q.isPlaying()));
        if (this.q.isPlaying()) {
            return;
        }
        if (z) {
            this.e.j();
        } else {
            this.e.o();
        }
    }

    @Override // com.huawei.openalliance.ad.hm
    public void i() {
        View view = this.f19471a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            hw.a("LinkedLandVideoView", "removeSelf removeView");
            ((ViewGroup) this.f19471a.getParent()).removeView(this.f19471a);
        } else {
            hw.a("LinkedLandVideoView", "removeSelf gone");
            this.f19471a.setVisibility(8);
        }
    }

    @Override // com.huawei.openalliance.ad.hm
    public LinkedAppDetailView h() {
        return this.E;
    }

    @Override // com.huawei.openalliance.ad.hm
    public VideoView getVideoView() {
        return this.q;
    }

    public String getSoundSwtich() {
        VideoInfo videoInfo = this.l;
        return videoInfo != null ? videoInfo.getSoundSwitch() : "n";
    }

    public ImageView getPreviewImageView() {
        return this.p.m();
    }

    @Override // com.huawei.openalliance.ad.hm
    public hk getLinkedVideoControlBridge() {
        return this.i;
    }

    @Override // com.huawei.openalliance.ad.hm
    public ha getLinkedNativeAd() {
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.linked.view.d
    protected int getHiddenAreaPercentageThreshhold() {
        VideoInfo videoInfo = this.l;
        return videoInfo != null ? Math.max(100 - videoInfo.getAutoStopPlayAreaRatio(), 0) : super.getHiddenAreaPercentageThreshhold();
    }

    public int getContinuePlayTime() {
        VideoInfo videoInfo = this.l;
        if (videoInfo == null) {
            return 0;
        }
        int iB = videoInfo.b();
        hw.a("LinkedLandVideoView", "getContinuePlayTime %d", Integer.valueOf(iB));
        return iB;
    }

    @Override // com.huawei.openalliance.ad.linked.view.d
    protected int getAutoPlayAreaPercentageThresshold() {
        VideoInfo videoInfo = this.l;
        return videoInfo != null ? videoInfo.getAutoPlayAreaRatio() : super.getAutoPlayAreaPercentageThresshold();
    }

    public float getAspectRatio() {
        Float videoRatio;
        VideoInfo videoInfo = this.l;
        if (videoInfo == null || (videoRatio = videoInfo.getVideoRatio()) == null) {
            return 0.0f;
        }
        return videoRatio.floatValue();
    }

    @Override // com.huawei.openalliance.ad.hm
    public void g() {
        this.i.e();
    }

    public void f() {
        this.s = true;
        this.i.i();
        this.e.k();
    }

    public void e() {
        this.e.l();
        if (this.D == null || this.l == null || !this.f19491c) {
            hw.a("LinkedLandVideoView", "autoPlay not satisfied condition, return");
        } else {
            this.i.a(this.l.getTimeBeforeVideoAutoPlay());
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        VideoView videoView = this.q;
        if (videoView == null) {
            return;
        }
        videoView.removeMediaErrorListener(this.C);
        this.q.removeMuteListener(this.v);
        this.q.destroyView();
    }

    @Override // com.huawei.openalliance.ad.linked.view.d
    protected void d() {
        super.d();
        this.q.setNeedPauseOnSurfaceDestory(true);
    }

    @Override // com.huawei.openalliance.ad.linked.view.d
    protected void c() {
        if (this.D.e()) {
            this.i.f(false);
            return;
        }
        hw.b("LinkedLandVideoView", "onViewShownBetweenFullAndPartial");
        this.i.a(getContinuePlayTime());
        this.i.f(true);
        j();
    }

    @Override // com.huawei.openalliance.ad.hm
    public void b(String str) {
        this.k.a(str);
    }

    @Override // com.huawei.openalliance.ad.linked.view.d
    protected void b() {
        hw.b("LinkedLandVideoView", "onViewPartialHidden");
        if (this.l != null) {
            this.i.f(false);
            this.i.c(false);
            this.i.d();
            this.i.i();
            this.i.a(getContinuePlayTime());
        }
    }

    public void a(String str) {
        hw.a("LinkedLandVideoView", "customToggleVideoMute %s", str);
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            videoInfo.e(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.openalliance.ad.hm
    public void a(VideoInfo videoInfo, boolean z) {
        c.a aVar;
        hw.b("LinkedLandVideoView", "onCheckVideoResult: %s", Boolean.valueOf(z));
        if (z || !v() || !a(videoInfo)) {
            if (z) {
            }
            aVar = this.g;
            if (aVar != null) {
                aVar.a(null, 0, 0, 0);
            }
        }
        hw.a("LinkedLandVideoView", "jssdk or api request type allow play http link video url when video mode is CACHE_MODE");
        VideoInfo videoInfo2 = this.l;
        if (videoInfo2 != null && videoInfo != null && TextUtils.equals(videoInfo2.getVideoDownloadUrl(), videoInfo.getVideoDownloadUrl())) {
            this.n = true;
            String strA = as.a(getContext().getApplicationContext(), videoInfo);
            if (TextUtils.isEmpty(strA)) {
                strA = videoInfo.getVideoDownloadUrl();
            }
            if (dg.l(strA) && !TextUtils.isEmpty(b(videoInfo))) {
                hw.b("LinkedLandVideoView", "play mode 3, cache while playing.");
                strA = b(videoInfo);
            }
            hw.b("LinkedLandVideoView", "downloadurl: %s", dg.h(strA));
            this.i.a(strA);
            hw.a("LinkedLandVideoView", "onCheckVideoHashResult, hasFullShown: %s", Boolean.valueOf(this.f19491c));
            if (this.f19491c) {
                this.i.a(getContinuePlayTime());
                boolean zO = o();
                hw.b("LinkedLandVideoView", "onCheckVideoResult - full shown, autoPlay: %s", Boolean.valueOf(zO));
                this.i.c(zO);
                long timeBeforeVideoAutoPlay = ((long) videoInfo.getTimeBeforeVideoAutoPlay()) - (System.currentTimeMillis() - this.o);
                if (timeBeforeVideoAutoPlay < 0) {
                    timeBeforeVideoAutoPlay = 0;
                }
                this.i.a(timeBeforeVideoAutoPlay);
                return;
            }
            return;
        }
        aVar = this.g;
        if (aVar != null) {
            aVar.a(null, 0, 0, 0);
        }
    }

    @Override // com.huawei.openalliance.ad.hm
    public void a(ImageInfo imageInfo, Drawable drawable) {
        ImageInfo imageInfo2 = this.m;
        if (imageInfo2 == null || imageInfo == null || !TextUtils.equals(imageInfo2.getUrl(), imageInfo.getUrl())) {
            return;
        }
        this.i.a(drawable);
    }

    public void a(int i) {
        MediaErrorListener mediaErrorListener = this.C;
        if (mediaErrorListener != null) {
            mediaErrorListener.onError(null, this.t, i, -1);
        }
        hd hdVar = this.k;
        if (hdVar != null) {
            hdVar.a(this.t, i);
        }
    }

    @Override // com.huawei.openalliance.ad.linked.view.d
    protected void a() {
        if (this.D.e()) {
            this.i.u();
            return;
        }
        this.o = System.currentTimeMillis();
        this.i.f(true);
        j();
        VideoView videoView = this.q;
        boolean z = videoView != null && videoView.isPlaying();
        hw.b("LinkedLandVideoView", "onViewFullShown hashCheckSuccess: %s isVideoPlaying: %s", Boolean.valueOf(this.n), Boolean.valueOf(z));
        if (!this.n || z) {
            return;
        }
        boolean zO = o();
        hw.b("LinkedLandVideoView", "onViewFullShown autoplay: %s", Boolean.valueOf(zO));
        this.i.c(zO);
        this.i.a(getContinuePlayTime());
        this.i.a(this.l.getTimeBeforeVideoAutoPlay());
    }

    private boolean v() {
        gz gzVar = this.j;
        if (gzVar == null || gzVar.c() == null) {
            return false;
        }
        int iV = this.j.c().v();
        return iV == 1 || iV == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.c();
        }
        c.a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    private boolean q() {
        gz gzVar = this.j;
        return (gzVar == null || gzVar.n() == null) ? false : true;
    }

    private boolean o() {
        if (q() && !pa.G(this.j.h())) {
            int autoPlayNetwork = this.j.n().getAutoPlayNetwork();
            hw.b("LinkedLandVideoView", "videoCfg landPage, can auto play net: %s.", Integer.valueOf(autoPlayNetwork));
            if (autoPlayNetwork == 2) {
                return false;
            }
            if (autoPlayNetwork == 1 || (autoPlayNetwork == 0 && cb.c(this.F))) {
                return true;
            }
            if (autoPlayNetwork == 0 && !cb.c(this.F)) {
                return false;
            }
        }
        VideoInfo videoInfo = this.l;
        if (videoInfo == null) {
            return false;
        }
        return TextUtils.equals(videoInfo.getVideoAutoPlay(), "a") || (TextUtils.equals(this.l.getVideoAutoPlay(), "y") && cb.c(this.F));
    }

    private boolean n() {
        if (q() && !pa.H(this.j.h())) {
            return !this.j.n().isMute();
        }
        VideoInfo videoInfo = this.l;
        return videoInfo != null && TextUtils.equals(videoInfo.getSoundSwitch(), "y");
    }

    private void m() {
        this.n = false;
        this.i.g(true);
    }

    private void l() {
        gz gzVar = this.j;
        if (gzVar == null) {
            return;
        }
        VideoInfo videoInfoG = gzVar.g();
        this.l = videoInfoG;
        if (videoInfoG == null) {
            this.i.a();
            return;
        }
        if (this.j.k() == 1) {
            this.l.a(this.j.i());
        }
        a(this.l.getSoundSwitch());
        Float videoRatio = this.l.getVideoRatio();
        if (videoRatio == null) {
            videoRatio = Float.valueOf(1.7777778f);
        }
        if (videoRatio.floatValue() < 1.0f) {
            videoRatio = Float.valueOf(1.7777778f);
        }
        setRatio(videoRatio);
        this.i.a(new he(this.F, this.q, this.l, this.j));
        this.i.d(!n());
        this.i.a(getContinuePlayTime());
        this.i.b(this.l.getVideoDuration());
        this.i.i(true);
        int videoFileSize = this.l.getVideoFileSize();
        this.i.d(videoFileSize);
        this.i.a(Boolean.TRUE.toString().equals(this.l.i()));
        this.p.setNonWifiAlertMsg(videoFileSize > 0 ? getResources().getString(R.string.hiad_consume_data_to_play_video, ai.a(getContext(), this.l.getVideoFileSize())) : getResources().getString(R.string.hiad_consume_data_to_play_video_no_data_size));
        this.k.a(this.l);
    }

    private void k() {
        ImageInfo imageInfoJ;
        gz gzVar = this.j;
        if (gzVar == null || (imageInfoJ = gzVar.j()) == null) {
            return;
        }
        this.m = imageInfoJ;
        if (imageInfoJ != null) {
            a(imageInfoJ);
        }
    }

    private void j() {
        hw.b("LinkedLandVideoView", "setInnerListener");
        this.q.addMediaErrorListener(this.C);
        this.q.addMuteListener(this.v);
        this.i.d(!n());
    }

    private String b(VideoInfo videoInfo) {
        if (videoInfo != null && dg.l(videoInfo.g()) && as.a(videoInfo)) {
            return as.a(this.F, videoInfo, new ir(this));
        }
        return null;
    }

    private boolean a(VideoInfo videoInfo) {
        return videoInfo != null && dg.l(videoInfo.getVideoDownloadUrl());
    }

    private void a(ImageInfo imageInfo) {
        if (imageInfo.getHeight() > 0) {
            setRatio(Float.valueOf((imageInfo.getWidth() * 1.0f) / imageInfo.getHeight()));
        }
        this.k.a(imageInfo);
    }

    private void a(Context context) {
        String str;
        try {
            hw.a("LinkedLandVideoView", "init nativeVideoView");
            this.F = context;
            this.r = new jo("LinkedLandVideoView");
            this.k = new hc(context, this);
            this.f19471a = LayoutInflater.from(context).inflate(R.layout.hiad_linked_native_video_view, this);
            this.q = (VideoView) findViewById(R.id.hiad_id_video_view);
            this.p = (LinkedNativeViewControlPanel) findViewById(R.id.hiad_link_native_video_ctrl_panel);
            this.E = (LinkedAppDetailView) findViewById(R.id.hiad_link_app_detail);
            this.q.setStandalone(true);
            this.q.setScreenOnWhilePlaying(true);
            this.q.setAutoScaleResizeLayoutOnVideoSizeChange(false);
            hk hkVar = new hk(context, this.q, this.p);
            this.i = hkVar;
            hkVar.a(this.D);
            this.i.a(this.w);
            this.i.a(this.k);
            this.q.addMediaStateListener(this.A);
            this.q.addReportVideoTimeListenersSet(this.z);
            this.q.addMediaBufferListener(this.B);
            this.q.addMediaErrorListener(this.C);
            this.q.addMuteListener(this.v);
            this.q.addMediaInfoListener(this.u);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("LinkedLandVideoView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("LinkedLandVideoView", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            videoInfo.e(z ? 0 : i);
        }
        this.r.c();
        if (this.h) {
            this.h = false;
            if (z) {
                this.k.b(this.x, System.currentTimeMillis(), this.y, i);
            } else {
                this.k.c(this.x, System.currentTimeMillis(), this.y, i);
            }
        }
    }

    public b(Context context) {
        super(context);
        this.h = false;
        this.n = false;
        this.s = false;
        this.t = -1;
        this.u = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.linked.view.b.1
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i) {
                b.this.i.c(i);
            }
        };
        this.v = new MuteListener() { // from class: com.huawei.openalliance.ad.linked.view.b.2
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("LinkedLandVideoView", "onUnmute");
                if (b.this.l != null) {
                    b.this.l.e("y");
                }
                b.this.i.e(false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("LinkedLandVideoView", "onMute");
                if (b.this.l != null) {
                    b.this.l.e("n");
                }
                b.this.i.e(true);
                if (b.this.f != null) {
                    b.this.f.a(true);
                }
            }
        };
        this.w = new hk.a() { // from class: com.huawei.openalliance.ad.linked.view.b.3
            @Override // com.huawei.openalliance.ad.hk.a
            public void d() {
                if (b.this.k != null) {
                    b.this.k.c();
                }
            }

            @Override // com.huawei.openalliance.ad.hk.a
            public void c() {
                if (b.this.k != null) {
                    o.h(new Runnable() { // from class: com.huawei.openalliance.ad.linked.view.b.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.k.a(b.this.x, System.currentTimeMillis(), b.this.y, b.this.q.getCurrentPosition());
                        }
                    });
                }
            }

            @Override // com.huawei.openalliance.ad.hk.a
            public void b() {
                if (b.this.k != null) {
                    b.this.k.b();
                }
            }

            @Override // com.huawei.openalliance.ad.hk.a
            public void a(boolean z) {
                hw.b("LinkedLandVideoView", "doRealPlay, auto:" + z);
                b.this.r.a();
            }

            @Override // com.huawei.openalliance.ad.hk.a
            public void a() {
                if (b.this.k != null) {
                    b.this.k.a();
                }
            }
        };
        this.z = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.linked.view.b.4
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("LinkedLandVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (b.this.k != null) {
                    b.this.k.b(j);
                }
            }
        };
        this.A = new MediaStateListener() { // from class: com.huawei.openalliance.ad.linked.view.b.5
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i, int i2) {
                b.this.t = i2;
                if (b.this.k != null) {
                    b.this.k.a(i2, b.this.l == null ? 0L : b.this.l.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
                b.this.a(i, false);
                b.this.t();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
                b.this.G = true;
                if (b.this.h) {
                    return;
                }
                if (hw.a()) {
                    hw.a("LinkedLandVideoView", "onMediaStart: %d", Integer.valueOf(i));
                }
                b.this.h = true;
                b.this.y = i;
                b.this.x = System.currentTimeMillis();
                b.this.r();
                hd hdVar = b.this.k;
                if (i > 0) {
                    hdVar.i();
                } else {
                    hdVar.h();
                    b.this.k.a(b.this.r.e(), b.this.r.d(), b.this.x);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
                b.this.a(i, false);
                b.this.s();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
                b.this.a(i, true);
                b.this.u();
                if (b.this.k != null) {
                    long j = i;
                    b.this.k.a(j, j);
                }
            }
        };
        this.B = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.linked.view.b.6
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("LinkedLandVideoView", "onBufferingStart");
                }
                b.this.r.b();
            }
        };
        this.C = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.linked.view.b.7
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
                b.this.a(i, false);
                if (b.this.g != null) {
                    b.this.g.a(mediaPlayerAgent, i, i2, i3);
                }
                if (b.this.d || cb.e(b.this.getContext())) {
                    return;
                }
                b.this.i.h();
            }
        };
        this.D = new hj();
        this.G = false;
        a(context);
    }
}
