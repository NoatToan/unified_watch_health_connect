package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.br;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.ns;
import com.huawei.openalliance.ad.oi;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes41.dex */
public class x extends n<oi> implements com.huawei.openalliance.ad.views.interfaces.m {
    private boolean A;
    private boolean B;
    private boolean C;
    private float D;
    private jo E;
    private View.OnClickListener F;
    private PPSVideoRenderListener G;
    private final ReportVideoTimeListener H;
    private MediaStateListener I;
    private MediaErrorListener J;
    private final MediaBufferListener K;
    private MuteListener L;
    private VideoView i;
    private ImageView j;
    private boolean k;
    private VideoInfo l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long q;
    private long r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public void setStartVol(float f) {
        this.D = f;
    }

    public void setMuteButtonState(boolean z) {
        this.z = z;
        if (this.j != null) {
            this.j.setImageResource(dk.a(z));
            this.j.setSelected(!z);
        }
    }

    public void setIgnoreSoundCtrl(boolean z) {
        this.B = z;
    }

    public void setHideSoundIcon(boolean z) {
        this.A = z;
    }

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.n
    public void setAudioFocusType(int i) {
        this.u = i;
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.setAudioFocusType(i);
        }
    }

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.pauseView();
            this.i.pause();
        }
    }

    @Override // com.huawei.openalliance.ad.views.n, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VideoView videoView = this.i;
        if (videoView != null) {
            removeView(videoView);
            this.i.destroyView();
            this.i = null;
        }
        this.p = Integer.MAX_VALUE;
    }

    public void k() {
        hw.b("PPSVideoView", "unMuteCustomized");
        VideoView videoView = this.i;
        if (videoView != null) {
            float f = this.D;
            if (f > 0.0f) {
                videoView.a(f);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.n
    public void h() {
        super.h();
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.stop();
        }
    }

    public VideoView getVideoView() {
        return this.i;
    }

    protected int getSplashDuration() {
        return this.m;
    }

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.n
    public void g() {
        super.g();
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.stop();
        }
    }

    @Override // com.huawei.openalliance.ad.views.n
    protected void f() {
        pauseView();
    }

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.n
    public boolean e() {
        return this.m > 0;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.m
    public void a(String str) {
        this.l = this.d.T();
        jo joVar = this.E;
        if (joVar != null) {
            joVar.a();
        }
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            this.C = TextUtils.equals("y", videoInfo.e());
            if (TextUtils.equals("n", this.l.n()) || this.A) {
                this.k = false;
            }
        }
        n();
        l();
        this.i.setAudioFocusType(this.u);
        this.i.setAlpha(0.0f);
        this.i.setVideoFileUrl(str);
        if (this.B || !this.C) {
            this.i.mute();
        } else {
            this.i.unmute();
        }
        if (this.h.d() == 1) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.x.2
                @Override // java.lang.Runnable
                public void run() {
                    if (x.this.i != null) {
                        x.this.i.play(true);
                    }
                }
            }, 200L);
        } else {
            this.i.play(true);
        }
    }

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.n
    public void a(int i, int i2) {
        super.a(i, i2);
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndUpdateLeftTime(int i) {
        if (!o()) {
            d(this.m - i);
            return;
        }
        int i2 = (this.m + this.g) - i;
        if (i2 <= this.m) {
            d(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        VideoView videoView = this.i;
        if (videoView == null || this.B || !this.C) {
            return;
        }
        float f = this.D;
        if (f > 0.0f) {
            videoView.setSoundVolume(f);
        }
    }

    private void q() {
        VideoInfo videoInfo = this.l;
        if (videoInfo == null) {
            return;
        }
        this.o = videoInfo.b();
        if (this.f <= 0 || this.o - this.g <= 0) {
            this.m = Math.min(5000, this.o);
            this.g = 0;
            this.d.p(this.g);
        } else {
            this.m = Math.min(this.l.b() - this.g, this.f);
        }
        this.n = this.m + this.g;
    }

    private void p() {
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            this.m = videoInfo.b();
        }
        MetaData metaDataJ = this.d.j();
        if (metaDataJ == null || metaDataJ.y() <= 0) {
            return;
        }
        this.m = (int) metaDataJ.y();
    }

    private boolean o() {
        return this.d != null && this.d.f() == 1;
    }

    private void n() {
        if (o()) {
            q();
        } else {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00ed  */
    public void m() {
        if (this.k && this.j == null) {
            ImageView imageView = new ImageView(getContext());
            this.j = imageView;
            imageView.setId(R.id.hiad_mute_icon);
            this.j.setImageResource(dk.a(true));
            dk.a(this.j);
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hiad_8_dp);
            this.j.setPadding(0, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.hiad_page_margin_side), dimensionPixelSize);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(21);
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.haid_splash_sound_margin_bottom);
            layoutParams.rightMargin = resources.getDimensionPixelSize(R.dimen.haid_splash_sound_margin_right);
            layoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.haid_splash_sound_margin_right));
            if (this.v == 0) {
                if (cc.b(getContext())) {
                    if (layoutParams.isMarginRelative()) {
                        layoutParams.setMarginEnd(layoutParams.rightMargin + this.w + dk.f(getContext()));
                    } else {
                        layoutParams.rightMargin += this.w + dk.f(getContext());
                    }
                    if (this.d.q() != 1 && (5 == this.x || com.huawei.openalliance.ad.utils.ab.n(getContext()) || com.huawei.openalliance.ad.utils.ab.q(getContext()))) {
                        layoutParams.bottomMargin += dk.f(getContext());
                    }
                } else if (layoutParams.isMarginRelative()) {
                    layoutParams.setMarginEnd(this.w + dk.f(getContext()));
                } else {
                    layoutParams.rightMargin = this.w + dk.f(getContext());
                }
            } else if (this.d.q() != 1) {
                layoutParams.bottomMargin += dk.f(getContext());
            }
            addView(this.j, layoutParams);
            this.j.bringToFront();
            this.j.setOnClickListener(this.F);
        }
    }

    private void l() {
        if (this.i == null) {
            VideoView videoView = new VideoView(getContext());
            this.i = videoView;
            videoView.setBackgroundColor(0);
            this.i.setScreenOnWhilePlaying(true);
            this.i.setStandalone(true);
            this.i.setAutoScaleResizeLayoutOnVideoSizeChange(false);
            this.i.setVideoScaleMode(2);
            this.i.setMuteOnlyOnLostAudioFocus(true);
            this.i.addPPSVideoRenderListener(this.G);
            this.i.addMediaStateListener(this.I);
            this.i.addMediaErrorListener(this.J);
            this.i.addMuteListener(this.L);
            this.i.addMediaBufferListener(this.K);
            this.i.addReportVideoTimeListenersSet(this.H);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.i, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        if (!o()) {
            return false;
        }
        int i2 = this.n;
        return i > i2 || i2 == 0;
    }

    private void d(int i) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(1, (int) Math.ceil((iMax * 1.0f) / 1000.0f));
        hw.a("PPSVideoView", "left seconds: %d", Integer.valueOf(iMax));
        if (iMax2 < this.p) {
            this.p = iMax2;
            c(iMax2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        hw.b("PPSVideoView", "switchSound enableSound: " + z);
        VideoView videoView = this.i;
        if (videoView == null) {
            return;
        }
        if (z) {
            videoView.unmute();
        } else {
            videoView.mute();
        }
        ((oi) this.f21289a).a(!z);
    }

    public x(Context context, int i, int i2, int i3, int i4) {
        super(context);
        this.k = true;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.s = false;
        this.t = false;
        this.u = 1;
        this.y = false;
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = 0.0f;
        this.F = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.x.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                x.this.a(!view.isSelected());
            }
        };
        this.G = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.x.3
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.a("PPSVideoView", "onVideoRenderStart, alreadyNotified: %s", Boolean.valueOf(x.this.y));
                if (x.this.y) {
                    return;
                }
                x.this.y = true;
                if (x.this.i != null) {
                    x.this.i.setAlpha(1.0f);
                }
                x.this.c();
                if (x.this.A) {
                    x.this.k = false;
                }
                x.this.m();
            }
        };
        this.H = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.x.4
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PPSVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (x.this.f21289a != 0) {
                    ((oi) x.this.f21289a).b(j);
                }
            }
        };
        this.I = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.x.5
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i5, int i6) {
                hw.a("PPSVideoView", "onProgress, playTime: %d, alreadyNotified: %s", Integer.valueOf(i6), Boolean.valueOf(x.this.y));
                if (x.this.e(i6)) {
                    a(i6);
                }
                if (i6 > 0 && !x.this.y) {
                    x.this.y = true;
                    if (x.this.i != null) {
                        x.this.i.setAlpha(1.0f);
                    }
                    x.this.c();
                    x.this.m();
                }
                if (x.this.i != null && x.this.i.getCurrentState().a() && x.this.m > 0) {
                    x.this.setAndUpdateLeftTime(i6);
                }
                if (x.this.s) {
                    x.this.f21291c.a(i5);
                    if (x.this.f21289a != 0) {
                        ((oi) x.this.f21289a).a(i6, x.this.m);
                    }
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i5) {
                a(i5, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i5) {
                if (x.this.s) {
                    return;
                }
                x.this.r();
                x.this.s = true;
                x.this.r = i5;
                x.this.q = as.c();
                x xVar = x.this;
                if (i5 > 0) {
                    xVar.f21291c.l();
                } else {
                    if (xVar.l != null) {
                        x.this.f21291c.a(x.this.l.b(), x.this.z);
                    }
                    ((oi) x.this.f21289a).a(x.this.E.e(), x.this.E.d(), x.this.q);
                }
                ((oi) x.this.f21289a).i();
                x.this.h.a(x.this.q);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, final int i5) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.x.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a(i5, false);
                    }
                }, 1000L);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i5) {
                if (x.this.i != null) {
                    df.a(x.this.i.getSurfaceBitmap());
                }
                df.a((Drawable) null);
                a(i5, true);
                if (x.this.f21289a != 0) {
                    long j = i5;
                    ((oi) x.this.f21289a).a(j, j);
                }
            }

            private void b(int i5) {
                if (x.this.t) {
                    hw.b("PPSVideoView", "has reported play end event");
                } else {
                    x.this.t = true;
                    ((oi) x.this.f21289a).a(x.this.q, as.c(), x.this.r, i5);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i5, boolean z) {
                if (x.this.s) {
                    x.this.s = false;
                    if (x.this.E != null) {
                        x.this.E.c();
                    }
                    b(i5);
                    ((oi) x.this.f21289a).b();
                    mh mhVar = x.this.f21291c;
                    if (z) {
                        mhVar.g();
                    } else {
                        mhVar.k();
                    }
                }
            }

            private void a(int i5) {
                onMediaStop(null, i5);
                if (x.this.getContext() == null || x.this.d == null) {
                    return;
                }
                BaseAnalysisInfo baseAnalysisInfo = new BaseAnalysisInfo();
                baseAnalysisInfo.ak("2100056");
                baseAnalysisInfo.al(String.valueOf(x.this.d.f()));
                baseAnalysisInfo.am(String.valueOf(x.this.m));
                baseAnalysisInfo.an(String.valueOf(i5));
                baseAnalysisInfo.ao(String.valueOf(x.this.o));
                baseAnalysisInfo.ap(String.valueOf(x.this.n));
                new br(x.this.getContext()).b(x.this.d, baseAnalysisInfo);
            }
        };
        this.J = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.x.6
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i5, int i6, int i7) {
                x.this.b(ErrorCode.ERROR_CODE_FAIL_TO_DISPLAY_VIDEO_AD);
                x.this.a();
            }
        };
        this.K = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.x.7
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i5) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                x.this.f21291c.h();
                if (x.this.E != null) {
                    x.this.E.b();
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                x.this.f21291c.i();
            }
        };
        this.L = new MuteListener() { // from class: com.huawei.openalliance.ad.views.x.8
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                x.this.setMuteButtonState(false);
                x.this.f21291c.b(1.0f);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                x.this.setMuteButtonState(true);
                x.this.f21291c.b(0.0f);
            }
        };
        this.w = i2;
        this.v = i;
        this.x = i3;
        this.f21289a = new ns(context, this, i4);
        this.E = new jo("PPSVideoView");
        l();
    }
}
