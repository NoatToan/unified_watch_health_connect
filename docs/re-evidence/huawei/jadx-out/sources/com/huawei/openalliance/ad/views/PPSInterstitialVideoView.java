package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.jo;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mx;
import com.huawei.openalliance.ad.my;
import com.huawei.openalliance.ad.nl;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes12.dex */
public class PPSInterstitialVideoView extends AutoScaleSizeRelativeLayout implements js, MediaErrorListener, MediaStateListener, com.huawei.openalliance.ad.media.listener.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mh f20863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20865c;
    private boolean d;
    private com.huawei.openalliance.ad.inter.data.d e;
    private VideoView f;
    private long g;
    private long h;
    private nl i;
    private jo j;
    private MuteListener k;
    private Context l;
    private int m;
    private boolean n;
    private boolean o;
    private final ReportVideoTimeListener p;
    private MediaBufferListener q;
    private final MuteListener r;

    @Override // com.huawei.openalliance.ad.media.listener.a
    public void b(int i) {
    }

    public void setVideoScaleMode(int i) {
        VideoView videoView = this.f;
        if (videoView != null) {
            videoView.setVideoScaleMode(i);
        }
    }

    public void setVideoBackgroundColor(int i) {
        VideoView videoView = this.f;
        if (videoView != null) {
            videoView.setBackgroundColor(i);
        }
    }

    public void setUnUseDefault(boolean z) {
        this.n = z;
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z) {
        VideoView videoView = this.f;
        if (videoView != null) {
            videoView.setAutoScaleResizeLayoutOnVideoSizeChange(z);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onProgress(int i, int i2) {
        if (this.d) {
            this.f20863a.a(i);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
        if (hw.a()) {
            hw.a("PPSInterstitialVideoView", "onMediaStart: %d", Integer.valueOf(i));
        }
        this.h = i;
        this.g = System.currentTimeMillis();
        if (i > 0) {
            this.i.c();
            this.f20863a.l();
        } else {
            if (this.f20863a != null && this.e.P() != null) {
                this.f20863a.a(getMediaDuration(), !"y".equals(this.e.P().getSoundSwitch()));
            }
            if (!this.d) {
                this.i.b();
                this.i.a(this.j.e(), this.j.d(), this.g);
            }
        }
        this.d = true;
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, true);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
    public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
        a(i, false);
    }

    public void h() {
        this.f.unmute();
    }

    public VideoView getVideoView() {
        return this.f;
    }

    public void g() {
        this.f.mute();
    }

    public void f() {
        this.f.stop();
    }

    public void e() {
        this.f.destroyView();
    }

    public void d() {
        this.f.pauseView();
    }

    public void c(int i) {
        this.f.seekTo(0);
        a(i, true);
    }

    public void c() {
        this.f.resumeView();
        this.f.setNeedPauseOnSurfaceDestory(true);
    }

    public boolean b() {
        return this.f.isPlaying();
    }

    public void a(boolean z, boolean z2) {
        if (!this.f20864b || this.f.isPlaying()) {
            this.f20865c = true;
            return;
        }
        hw.b("PPSInterstitialVideoView", "play, auto:" + z + ", isMute:" + z2);
        this.j.a();
        if (z2) {
            this.f.mute();
        } else {
            this.f.unmute();
        }
        this.f.play(z);
    }

    public void a(String str) {
        this.i.a(str);
    }

    public void a(NetworkChangeListener networkChangeListener) {
        this.f.addNetworkChangeListener(networkChangeListener);
    }

    public void a(mh mhVar) {
        this.f20863a = mhVar;
        this.f20863a.a(my.a(0.0f, j(), mx.STANDALONE));
    }

    public void a(com.huawei.openalliance.ad.media.listener.a aVar) {
        this.f.addMediaInfoListener(aVar);
    }

    public void a(SegmentMediaStateListener segmentMediaStateListener) {
        this.f.addSegmentMediaStateListener(segmentMediaStateListener);
    }

    public void a(MuteListener muteListener) {
        this.k = muteListener;
        this.f.addMuteListener(this.r);
    }

    public void a(com.huawei.openalliance.ad.inter.data.d dVar, ContentRecord contentRecord) {
        this.e = dVar;
        this.f.setPreferStartPlayTime(0);
        this.i.a(contentRecord);
        this.o = dVar.Z();
        i();
    }

    public void a(long j) {
        this.i.a(j);
    }

    @Override // com.huawei.openalliance.ad.media.listener.a
    public void a(int i) {
        hw.a("PPSInterstitialVideoView", "onDurationReady %s", Integer.valueOf(i));
        if (i > 0) {
            this.m = i;
        }
    }

    public void a() {
        this.f.pause();
    }

    private boolean j() {
        com.huawei.openalliance.ad.inter.data.d dVar = this.e;
        if (dVar == null || dVar.P() == null || !cb.e(getContext())) {
            return false;
        }
        if (cb.a(getContext())) {
            return true;
        }
        return (dg.l(this.e.P().getVideoDownloadUrl()) && TextUtils.isEmpty(dk.a(getContext(), "normal").e(this.e.P().getVideoDownloadUrl()))) ? false : true;
    }

    private void i() {
        if (this.e == null) {
            return;
        }
        hw.b("PPSInterstitialVideoView", "loadVideoInfo");
        VideoInfo videoInfoP = this.e.P();
        if (videoInfoP != null) {
            dn dnVarA = dk.a(this.l, "normal");
            String strC = dnVarA.c(dnVarA.e(videoInfoP.getVideoDownloadUrl()));
            if (com.huawei.openalliance.ad.utils.ai.b(strC)) {
                hw.b("PPSInterstitialVideoView", "change path to local");
                videoInfoP.a(strC);
            }
            this.f20864b = false;
            Float videoRatio = videoInfoP.getVideoRatio();
            if (videoRatio != null && this.n) {
                setRatio(videoRatio);
                this.f.setRatio(videoRatio);
            }
            this.f.setDefaultDuration(videoInfoP.getVideoDuration());
            a(videoInfoP);
        }
    }

    private int getMediaDuration() {
        if (this.m <= 0 && this.e.P() != null) {
            this.m = this.e.P().getVideoDuration();
        }
        return this.m;
    }

    private void a(final VideoInfo videoInfo) {
        if (videoInfo == null) {
            return;
        }
        hw.b("PPSInterstitialVideoView", "checkVideoHash");
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                if (dg.l(videoInfo.getVideoDownloadUrl()) || videoInfo.b(PPSInterstitialVideoView.this.l)) {
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PPSInterstitialVideoView.this.f.setVideoFileUrl(videoInfo.getVideoDownloadUrl());
                            PPSInterstitialVideoView.this.f20864b = true;
                            if (PPSInterstitialVideoView.this.f20865c) {
                                PPSInterstitialVideoView.this.f20865c = false;
                                PPSInterstitialVideoView.this.a(true, PPSInterstitialVideoView.this.o);
                            }
                            PPSInterstitialVideoView.this.f.prefetch();
                        }
                    });
                }
            }
        });
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_placement_pure_video_view, this);
        this.i = new nl(context, this);
        this.j = new jo("PPSInterstitialVideoView");
        this.l = context;
        VideoView videoView = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.f = videoView;
        videoView.addMediaInfoListener(this);
        this.f.setScreenOnWhilePlaying(true);
        this.f.setAudioFocusType(1);
        this.f.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.f.setMuteOnlyOnLostAudioFocus(true);
        this.f.addMediaStateListener(this);
        this.f.addMediaErrorListener(this);
        this.f.addMediaBufferListener(this.q);
        this.f.addReportVideoTimeListenersSet(this.p);
        this.f.setRemediate(true);
    }

    private void a(int i, boolean z) {
        this.j.c();
        if (this.d) {
            this.d = false;
            if (z) {
                this.i.a(this.g, System.currentTimeMillis(), this.h, i);
                this.f20863a.g();
            } else {
                this.i.b(this.g, System.currentTimeMillis(), this.h, i);
                this.f20863a.k();
            }
        }
    }

    public PPSInterstitialVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20863a = new lw();
        this.f20864b = false;
        this.f20865c = false;
        this.d = false;
        this.n = true;
        this.o = true;
        this.p = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSInterstitialVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (PPSInterstitialVideoView.this.i != null) {
                    PPSInterstitialVideoView.this.i.b(j);
                }
            }
        };
        this.q = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i2) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("PPSInterstitialVideoView", "onBufferingStart");
                }
                PPSInterstitialVideoView.this.j.b();
                PPSInterstitialVideoView.this.f20863a.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                PPSInterstitialVideoView.this.f20863a.i();
            }
        };
        this.r = new MuteListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (PPSInterstitialVideoView.this.k != null) {
                    PPSInterstitialVideoView.this.k.onUnmute();
                    PPSInterstitialVideoView.this.f20863a.b(1.0f);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (PPSInterstitialVideoView.this.k != null) {
                    PPSInterstitialVideoView.this.k.onMute();
                    PPSInterstitialVideoView.this.f20863a.b(0.0f);
                }
            }
        };
        a(context);
    }

    public PPSInterstitialVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20863a = new lw();
        this.f20864b = false;
        this.f20865c = false;
        this.d = false;
        this.n = true;
        this.o = true;
        this.p = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSInterstitialVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (PPSInterstitialVideoView.this.i != null) {
                    PPSInterstitialVideoView.this.i.b(j);
                }
            }
        };
        this.q = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i2) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("PPSInterstitialVideoView", "onBufferingStart");
                }
                PPSInterstitialVideoView.this.j.b();
                PPSInterstitialVideoView.this.f20863a.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                PPSInterstitialVideoView.this.f20863a.i();
            }
        };
        this.r = new MuteListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (PPSInterstitialVideoView.this.k != null) {
                    PPSInterstitialVideoView.this.k.onUnmute();
                    PPSInterstitialVideoView.this.f20863a.b(1.0f);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (PPSInterstitialVideoView.this.k != null) {
                    PPSInterstitialVideoView.this.k.onMute();
                    PPSInterstitialVideoView.this.f20863a.b(0.0f);
                }
            }
        };
        a(context);
    }

    public PPSInterstitialVideoView(Context context) {
        super(context);
        this.f20863a = new lw();
        this.f20864b = false;
        this.f20865c = false;
        this.d = false;
        this.n = true;
        this.o = true;
        this.p = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSInterstitialVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (PPSInterstitialVideoView.this.i != null) {
                    PPSInterstitialVideoView.this.i.b(j);
                }
            }
        };
        this.q = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i2) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("PPSInterstitialVideoView", "onBufferingStart");
                }
                PPSInterstitialVideoView.this.j.b();
                PPSInterstitialVideoView.this.f20863a.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                PPSInterstitialVideoView.this.f20863a.i();
            }
        };
        this.r = new MuteListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (PPSInterstitialVideoView.this.k != null) {
                    PPSInterstitialVideoView.this.k.onUnmute();
                    PPSInterstitialVideoView.this.f20863a.b(1.0f);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (PPSInterstitialVideoView.this.k != null) {
                    PPSInterstitialVideoView.this.k.onMute();
                    PPSInterstitialVideoView.this.f20863a.b(0.0f);
                }
            }
        };
        a(context);
    }
}
