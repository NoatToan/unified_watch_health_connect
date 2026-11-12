package com.huawei.openalliance.ad.views;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.hms.ads.uiengine.common.IInterstitialView;
import com.huawei.hms.ads.uiengine.common.InterstitialApi;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.jm;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mw;
import com.huawei.openalliance.ad.nk;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pf;
import com.huawei.openalliance.ad.tu;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bb;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.bi;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bu;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dr;
import com.huawei.openalliance.ad.views.gif.GifPlayView;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class PPSInterstitialView extends AutoScaleSizeRelativeLayout implements View.OnClickListener, IInterstitialView, jm.a, js, lu, MuteListener, SegmentMediaStateListener, com.huawei.openalliance.ad.media.listener.a, NetworkChangeListener {
    private int A;
    private boolean B;
    private long C;
    private int D;
    private long E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private long K;
    private boolean L;
    private boolean M;
    private jm N;
    private com.huawei.openalliance.ad.inter.listeners.a O;
    private final String P;
    private AdLandingPageData Q;
    private int R;
    private CountDownTimer S;
    private int T;
    private Context U;
    private boolean V;
    private boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mh f20872a;
    private dn aa;
    private PPSAppDetailTemplateView ab;
    private TextView ac;
    private PPSAppDownLoadWithAnimationView ad;
    private MaterialClickInfo ae;
    private boolean af;
    private boolean ag;
    private TextView ah;
    private int ai;
    private int aj;
    private hr ak;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.d f20873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentRecord f20874c;
    private String d;
    private PPSInterstitialVideoView e;
    private ImageView f;
    private int g;
    private View h;
    private PPSAppDetailView i;
    private PPSAppDetailView j;
    private PPSExpandButtonDetailView k;
    private TextView l;
    private ImageView m;
    private GifPlayView n;
    private ViewGroup o;
    private TextView p;
    private PPSLabelSourceView q;
    private PPSLabelView r;
    private boolean s;
    private b t;
    private nk u;
    private ChoicesView v;
    private boolean w;
    private Dialog x;
    private ProgressBar y;
    private boolean z;

    public interface b {
        void b();
    }

    @Override // com.huawei.openalliance.ad.media.listener.a
    public void b(int i) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void bindData(String str) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public ViewGroup getContentContainer() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void onAppStatusChanged(String str) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void onBtnClick(Bundle bundle) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void onCallBack(String str, Bundle bundle) {
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkDisconnected() {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void setIsNeedRemindData(boolean z) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void setProxy(InterstitialApi interstitialApi) {
    }

    public void setOnCloseListener(b bVar) {
        this.t = bVar;
    }

    public void setFullScreen(int i) {
        this.T = i;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void resumeVideoView() {
        b(true);
    }

    public void removeInterstitialAdStatusListener() {
        this.O = null;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void pauseView() {
        hw.b("PPSInterstitialView", RewardMethods.PAUSE_VIEW);
        setTryResumeVideoView(false);
        PPSInterstitialVideoView pPSInterstitialVideoView = this.e;
        if (pPSInterstitialVideoView != null) {
            pPSInterstitialVideoView.d();
        }
        if (v()) {
            View view = this.h;
            if (view != null) {
                view.setVisibility(0);
            }
            PPSInterstitialVideoView pPSInterstitialVideoView2 = this.e;
            if (pPSInterstitialVideoView2 != null) {
                pPSInterstitialVideoView2.a();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.j();
        }
        String interstitialJumpText = getInterstitialJumpText();
        if (this.ah != null) {
            if (!this.w || TextUtils.isEmpty(interstitialJumpText)) {
                this.ah.setVisibility(8);
                String label = this.f20873b.getLabel();
                if (this.l == null || !this.w || TextUtils.isEmpty(label)) {
                    return;
                }
                this.l.setText(label);
                this.l.setVisibility(0);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MuteListener
    public void onUnmute() {
        this.s = false;
        a(false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentProgress(String str, String str2, int i, int i2) {
        int i3;
        boolean z = this.B;
        if (!z && this.A < 0) {
            this.A = i2;
            this.B = true;
        } else if (z && (i3 = this.A) >= 0) {
            long j = i2 - i3;
            this.C = j;
            jm jmVar = this.N;
            if (jmVar != null) {
                c(this.E + j, jmVar.c());
            }
            nk nkVar = this.u;
            if (nkVar != null) {
                nkVar.a(i2, this.J);
            }
        }
        int i4 = this.J;
        if (i2 > i4 && i4 > 0) {
            i2 = i4;
        }
        int i5 = i2 / 1000;
        if (this.R * 1000 >= i4) {
            this.R = i4 / 1000;
        }
        int i6 = this.R - i5;
        if (i6 > 0) {
            a(i6, false);
        } else {
            ImageView imageView = this.m;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            a(i5, true);
        }
        if (i2 < this.J || i >= 100) {
            return;
        }
        this.E += (long) (i2 - this.A);
        if (this.e != null) {
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.8
                @Override // java.lang.Runnable
                public void run() {
                    PPSInterstitialView.this.e.f();
                }
            });
        }
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        hw.b("PPSInterstitialView", "check end");
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaStop(String str, String str2, int i) {
        PPSInterstitialVideoView pPSInterstitialVideoView;
        if (hw.a()) {
            hw.a("PPSInterstitialView", "video stop");
        }
        if (!this.H) {
            c(i);
        }
        if (i < this.J || (pPSInterstitialVideoView = this.e) == null) {
            return;
        }
        pPSInterstitialVideoView.c(i);
        onSegmentMediaCompletion(null, str2, i);
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaStart(String str, String str2, int i) {
        com.huawei.openalliance.ad.inter.listeners.a aVar;
        if (hw.a()) {
            hw.a("PPSInterstitialView", "video start");
        }
        if (this.V) {
            TextView textView = this.p;
            if (textView != null) {
                textView.setVisibility(0);
            }
            this.V = false;
        }
        ProgressBar progressBar = this.y;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (!this.B && (aVar = this.O) != null) {
            aVar.f();
        }
        this.B = true;
        this.A = i;
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaPause(String str, String str2, int i) {
        if (hw.a()) {
            hw.a("PPSInterstitialView", "video pause");
        }
        c(i);
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaError(String str, String str2, int i, int i2, int i3) {
        hw.b("PPSInterstitialView", "onSegmentMediaError");
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (!cb.e(getContext())) {
            Toast.makeText(getContext().getApplicationContext(), R.string.hiad_network_error, 0).show();
        }
        c(i);
        com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
        if (aVar != null) {
            aVar.a(i2, i3);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaCompletion(String str, String str2, int i) {
        if (hw.a()) {
            hw.a("PPSInterstitialView", "video end");
        }
        if (!this.H) {
            this.H = true;
            c(i);
            k();
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.9
            @Override // java.lang.Runnable
            public void run() {
                PPSInterstitialView.this.s();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkConnectedOrChanged(boolean z) {
        Dialog dialog;
        this.z = !z;
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        boolean z2 = dVar != null && dVar.aj();
        if (!z && r() && !q() && z2) {
            pauseView();
            y();
        }
        if (!z || (dialog = this.x) == null) {
            return;
        }
        dialog.dismiss();
        this.z = false;
        b(false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MuteListener
    public void onMute() {
        this.s = true;
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("PPSInterstitialView", "onDetechedFromWindow");
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.i();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.af) {
            this.af = false;
            int id = view.getId();
            com.huawei.openalliance.ad.utils.ah.b();
            if (id == R.id.interstitial_close) {
                j();
            } else if (id == R.id.interstitial_video_view || id == R.id.interstitial_image_view || id == R.id.interstitial_content_view) {
                i();
            } else {
                hw.d("PPSInterstitialView", "un handle action");
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.7
                @Override // java.lang.Runnable
                public void run() {
                    PPSInterstitialView.this.af = true;
                }
            }, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.a("PPSInterstitialView", "onAttachedToWindow");
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.h();
        }
    }

    public int getmInsreTemplate() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0) {
                this.ae = tz.a(this, motionEvent);
            }
            if (1 == iA) {
                tz.a(this, motionEvent, null, this.ae);
            }
        } catch (Throwable th) {
            hw.c("PPSInterstitialView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void destroyView() {
        dq.a(this.P);
        nk nkVar = this.u;
        if (nkVar != null) {
            nkVar.a((com.huawei.openalliance.ad.inter.data.d) null);
        }
        jm jmVar = this.N;
        if (jmVar != null) {
            jmVar.b();
        }
        if (this.e != null) {
            setTryResumeVideoView(false);
            if (v()) {
                this.e.f();
            }
            this.e.e();
        }
        CountDownTimer countDownTimer = this.S;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.S = null;
        }
        this.f20872a.b();
        com.huawei.openalliance.ad.download.app.d.a().c(this.ak);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b(long j, int i) {
        dq.a(this.P);
        if (!this.G) {
            this.G = true;
            nk nkVar = this.u;
            if (nkVar != null) {
                nkVar.a(j, i);
            }
        }
        J();
        pauseView();
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b() {
        this.F = false;
        this.G = false;
        long jC = as.c();
        hw.a("PPSInterstitialView", "onViewPhysicalShowStart, currentTime: %s", Long.valueOf(jC));
        String strValueOf = String.valueOf(jC);
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        if (dVar != null) {
            dVar.g(false);
            this.f20873b.a(false);
        }
        ContentRecord contentRecord = this.f20874c;
        if (contentRecord != null) {
            contentRecord.c(strValueOf);
            this.f20874c.h(jC);
        }
        nk nkVar = this.u;
        if (nkVar != null) {
            nkVar.a(strValueOf);
            this.u.a(jC);
        }
        PPSInterstitialVideoView pPSInterstitialVideoView = this.e;
        if (pPSInterstitialVideoView != null) {
            pPSInterstitialVideoView.a(strValueOf);
            this.e.a(jC);
        }
        AdLandingPageData adLandingPageData = this.Q;
        if (adLandingPageData != null && this.i != null) {
            adLandingPageData.c(strValueOf);
            this.Q.a(jC);
            this.i.setAdLandingData(this.Q);
        }
        nk nkVar2 = this.u;
        if (nkVar2 != null) {
            nkVar2.c();
        }
        resumeVideoView();
    }

    public void addInterstitialAdStatusListener(com.huawei.openalliance.ad.inter.listeners.a aVar) {
        if (aVar == null) {
            return;
        }
        this.O = aVar;
    }

    public void a(Integer num) {
        if (this.f20872a == null || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            this.f20872a.a(mw.CLICK);
        } else if (iIntValue == 3 && !this.H) {
            this.f20872a.j();
            this.f20872a.b();
        }
    }

    public void a(com.huawei.openalliance.ad.inter.data.d dVar, int i, String str) {
        Resources resources;
        int i2;
        this.R = fp.b(this.U).cj();
        this.f20873b = dVar;
        ContentRecord contentRecordA = pf.a(dVar);
        this.f20874c = contentRecordA;
        this.Q = new AdLandingPageData(contentRecordA, getContext(), true);
        this.d = str;
        this.I = i;
        K();
        try {
            a(this.U, this.f20874c);
            jm jmVar = this.N;
            if (jmVar != null) {
                jmVar.b(this.f20873b.getMinEffectiveShowTime(), this.f20873b.getMinEffectiveShowRatio());
            }
            nk nkVar = this.u;
            if (nkVar != null) {
                nkVar.a(this.f20873b);
            }
            z();
            h();
            g();
            G();
            d(R.drawable.hiad_loading_image);
            b(this.f20873b.getLabel());
            com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
            if (aVar != null) {
                aVar.a();
            }
            if ((this.f.getVisibility() == 0 || this.v.getVisibility() == 0) && this.ah.getVisibility() == 0) {
                if (this.ai == R.layout.hiad_interstitial_half_layout) {
                    resources = getResources();
                    i2 = R.dimen.haid_interstitial_template_half;
                } else {
                    resources = getResources();
                    i2 = R.dimen.haid_interstitial_template;
                }
                this.aj = resources.getDimensionPixelSize(i2);
                if (dk.c()) {
                    this.aj = 0;
                }
                this.q.setPadding(0, 0, as.a(getContext(), this.aj), 0);
            }
            e(pf.a(dVar));
            if (fp.b(this.U).cm() == 1 && this.n != null && f()) {
                ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.n.setLayoutParams(layoutParams);
            }
        } catch (RuntimeException | Exception unused) {
            hw.d("PPSInterstitialView", "refresh ui error");
        }
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a(long j, int i) {
        jm jmVar;
        dq.a(this.P);
        if (this.L) {
            if ((w() || x()) && (jmVar = this.N) != null) {
                c(j - (this.K - jmVar.d()), i);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.a
    public void a(int i) {
        hw.a("PPSInterstitialView", "onDurationReady %d", Integer.valueOf(i));
        if (i > 0) {
            this.J = i;
        }
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a() {
        this.A = -1;
        this.B = false;
        this.E = 0L;
        if (this.L) {
            H();
        }
    }

    private void z() {
        if (bi.b(this.f20873b.J())) {
            this.W = true;
        }
        A();
        this.i.setVisibility(0);
        if (bi.d(this.f20873b.J())) {
            this.Q.c(true);
        } else {
            D();
        }
        this.i.setAppDetailClickListener(new com.huawei.openalliance.ad.views.interfaces.c() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.11
            @Override // com.huawei.openalliance.ad.views.interfaces.c
            public void a(com.huawei.openalliance.ad.views.interfaces.b bVar) {
                if (bVar == null || bVar.e() == null) {
                    hw.c("PPSInterstitialView", "invalid click");
                    return;
                }
                Integer numE = bVar.e();
                int iIntValue = numE.intValue();
                hw.b("PPSInterstitialView", "action: %d", numE);
                if (iIntValue != 0) {
                    return;
                }
                PPSInterstitialView.this.a(bVar);
            }
        });
        this.i.setNeedPerBeforDownload(true);
        int i = this.g;
        if (i == 1 || i == 3 || i == 5) {
            this.i.setLoadAppIconSelf(false);
        }
        this.i.setAdLandingData(this.Q);
        this.i.setInteractedListener(new com.huawei.openalliance.ad.views.interfaces.a() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.12
            @Override // com.huawei.openalliance.ad.views.interfaces.a
            public void a(int i2) {
                PPSInterstitialView.this.c(Integer.valueOf(i2));
            }
        });
        if (this.i.getVisibility() == 8) {
            this.q.setVisibility(0);
        }
        a(this.Q.getAppInfo());
    }

    private void y() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.10
            @Override // java.lang.Runnable
            public void run() {
                if (PPSInterstitialView.this.x != null && PPSInterstitialView.this.x.isShowing()) {
                    PPSInterstitialView.this.x.dismiss();
                }
                hw.b("PPSInterstitialView", "pop up dialog");
                Resources resources = PPSInterstitialView.this.getResources();
                String string = resources.getString(R.string.hiad_consume_data_to_play_video_no_data_size);
                String string2 = resources.getString(R.string.hiad_reward_close_dialog_continue);
                String string3 = resources.getString(R.string.hiad_reward_close_dialog_close);
                PPSInterstitialView pPSInterstitialView = PPSInterstitialView.this;
                pPSInterstitialView.x = com.huawei.openalliance.ad.utils.ac.a(pPSInterstitialView.getContext(), "", string, string2, string3, new com.huawei.openalliance.ad.utils.ac.a() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.10.1
                    @Override // com.huawei.openalliance.ad.utils.ac.a
                    public void a(boolean z) {
                        PPSInterstitialView.this.j();
                    }

                    @Override // com.huawei.openalliance.ad.utils.ac.a
                    public void a() {
                        PPSInterstitialView.this.z = false;
                        PPSInterstitialView.this.b(false);
                    }
                });
                PPSInterstitialView.this.x.setCancelable(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        return dVar != null && dVar.getCreativeType() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        return dVar != null && dVar.getCreativeType() == 2;
    }

    private boolean v() {
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        return (dVar == null || dVar.P() == null || this.f20873b.getCreativeType() != 9) ? false : true;
    }

    private void u() {
        if (r()) {
            hw.b("PPSInterstitialView", "played");
            return;
        }
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
        }
        PPSInterstitialVideoView pPSInterstitialVideoView = this.e;
        if (pPSInterstitialVideoView != null) {
            pPSInterstitialVideoView.a(true, this.s);
        }
    }

    private boolean t() {
        PPSInterstitialVideoView pPSInterstitialVideoView;
        if (this.f20873b.P() == null || (pPSInterstitialVideoView = this.e) == null || pPSInterstitialVideoView.getVideoView() == null) {
            hw.b("PPSInterstitialView", "setCacheUrlBeforeLoopPlay return");
            return false;
        }
        try {
            String videoDownloadUrl = this.f20873b.P().getVideoDownloadUrl();
            if (dg.l(videoDownloadUrl) && !TextUtils.isEmpty(this.aa.e(videoDownloadUrl))) {
                dn dnVar = this.aa;
                String strC = dnVar.c(dnVar.e(videoDownloadUrl));
                if (com.huawei.openalliance.ad.utils.ai.b(strC) && com.huawei.openalliance.ad.utils.ai.a(this.f20873b.P().getSha256(), new File(strC))) {
                    hw.b("PPSInterstitialView", "change path to local");
                    this.e.getVideoView().setVideoFileUrl(strC);
                    this.f20873b.P().a(strC);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            hw.d("PPSInterstitialView", "setCacheUrlBeforeLoopPlay exception: %s", e.getClass().getSimpleName());
            return false;
        }
    }

    private void setTryResumeVideoView(boolean z) {
        this.ag = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        hw.b("PPSInterstitialView", "loop");
        if (v() && (t() || o())) {
            u();
            return;
        }
        if (r()) {
            this.e.a();
        }
        this.z = true;
        View view = this.h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private boolean r() {
        return this.e != null && v() && this.e.b();
    }

    private boolean q() {
        String videoDownloadUrl = this.f20873b.P().getVideoDownloadUrl();
        boolean z = (dg.l(videoDownloadUrl) && TextUtils.isEmpty(this.aa.e(videoDownloadUrl))) ? false : true;
        hw.b("PPSInterstitialView", "cache %s", Boolean.valueOf(z));
        return z;
    }

    private boolean o() {
        if (v()) {
            return q() || cb.c(getContext());
        }
        return false;
    }

    private boolean n() {
        return !this.f20873b.aj();
    }

    private boolean m() {
        if (!r()) {
            return o() || n();
        }
        hw.b("PPSInterstitialView", "in play");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (m()) {
            u();
            return;
        }
        if (!cb.e(getContext())) {
            Toast.makeText(getContext().getApplicationContext(), R.string.hiad_network_error, 0).show();
        } else if (this.z) {
            y();
        } else {
            u();
        }
    }

    private void k() {
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        b bVar = this.t;
        if (bVar != null) {
            bVar.b();
        }
        nk nkVar = this.u;
        if (nkVar != null) {
            nkVar.b();
        }
        c((Integer) 3);
        a((Integer) 3);
        com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
        if (aVar != null) {
            aVar.d();
        }
        CountDownTimer countDownTimer = this.S;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.S = null;
        }
    }

    private void i() {
        if (I()) {
            com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
            if (aVar != null) {
                aVar.b();
            }
            c((Integer) 1);
            b((Integer) null);
        }
    }

    private void h() {
        if (d(this.f20874c)) {
            int i = this.g;
            if (i == 3 || i == 4 || i == 5) {
                PPSAppDetailTemplateView pPSAppDetailTemplateView = this.ab;
                if (pPSAppDetailTemplateView != null) {
                    pPSAppDetailTemplateView.setVisibility(0);
                    this.ab.setAdLandingData(this.Q);
                }
                if (this.ac != null) {
                    com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
                    if (dVar == null || dVar.getAppInfo() == null || TextUtils.isEmpty(this.f20873b.getAppInfo().getAppDesc())) {
                        this.ac.setVisibility(4);
                    } else {
                        this.ac.setVisibility(0);
                        this.ac.setText(this.f20873b.getAppInfo().getAppDesc());
                    }
                }
                a(this.U);
                E();
            }
        }
    }

    private String getInterstitialJumpText() {
        ContentRecord contentRecord = this.f20874c;
        if (contentRecord == null) {
            return null;
        }
        return com.huawei.openalliance.ad.utils.c.a(contentRecord, getContext(), !I());
    }

    private void g() {
        if (fp.b(this.U).cn() == 0 || !B()) {
            return;
        }
        this.o.setOnClickListener(this);
        PPSAppDetailTemplateView pPSAppDetailTemplateView = this.ab;
        if (pPSAppDetailTemplateView != null) {
            pPSAppDetailTemplateView.setEnabled(false);
        }
    }

    private boolean f() {
        int i = this.g;
        return (i == 3 || i == 4 || i == 5) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        this.p.setVisibility(0);
        CountDownTimer countDownTimer = this.S;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(i, 500L) { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.6
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                int i2 = (int) (j / 1000);
                PPSInterstitialView.this.a(i2 + 1, false);
                hw.a("PPSInterstitialView", "count down time: %d seconds: %d", Long.valueOf(j), Integer.valueOf(i2));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                PPSInterstitialView.this.p.setVisibility(8);
                PPSInterstitialView.this.m.setVisibility(0);
            }
        };
        this.S = countDownTimer2;
        countDownTimer2.start();
    }

    private void e(ContentRecord contentRecord) {
        if (contentRecord == null || contentRecord.b(this.U) == null) {
            return;
        }
        this.f20872a.a(getContext(), contentRecord, this, true);
        this.f20872a.a(false);
        this.f20872a.c();
        a(this.f20872a, contentRecord);
    }

    private void e() {
        this.p.setMaxWidth((int) (((double) com.huawei.openalliance.ad.utils.d.a(getContext(), dk.k(getContext()))) * 0.5d));
    }

    private int e(int i) {
        int i2 = (this.J / 1000) - i;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    private boolean d(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return bi.a(contentRecord.D());
    }

    private boolean d() {
        return this.ai == R.layout.hiad_interstitial_layout || this.ai == R.layout.hiad_interstitial_half_layout || this.g == 5 || bi.c(this.f20874c.D());
    }

    private void d(final int i) {
        if (v()) {
            this.n.setVisibility(8);
            return;
        }
        String strC = this.aa.c(this.f20873b.ah());
        if (com.huawei.openalliance.ad.utils.ai.b(strC)) {
            bd.a(getContext(), strC, new bd.a() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.3
                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a(final Drawable drawable) {
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (PPSInterstitialView.this.T == 1 && !as.n(PPSInterstitialView.this.U)) {
                                PPSInterstitialView.this.o.setBackgroundColor(PPSInterstitialView.this.getResources().getColor(R.color.hiad_70_percent_black));
                            }
                            if (drawable instanceof com.huawei.openalliance.ad.views.gif.b) {
                                PPSInterstitialView.this.n.setImageDrawable(drawable);
                                ((com.huawei.openalliance.ad.views.gif.b) drawable).a(PPSInterstitialView.this.new a(drawable));
                            } else {
                                PPSInterstitialView.this.y.setVisibility(8);
                                PPSInterstitialView.this.n.setImageDrawable(drawable);
                                PPSInterstitialView.this.L = true;
                                PPSInterstitialView.this.K = System.currentTimeMillis();
                                PPSInterstitialView.this.H();
                            }
                            PPSInterstitialView.this.f(PPSInterstitialView.this.R * 1000);
                        }
                    });
                }

                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a() {
                    hw.d("PPSInterstitialView", "loadImage fail");
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            PPSInterstitialView.this.p.setVisibility(8);
                            PPSInterstitialView.this.m.setVisibility(0);
                            PPSInterstitialView.this.n.setImageResource(i);
                        }
                    });
                }
            });
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.4
                @Override // java.lang.Runnable
                public void run() {
                    PPSInterstitialView.this.p.setVisibility(8);
                    PPSInterstitialView.this.m.setVisibility(0);
                }
            });
        }
    }

    private boolean c() {
        ContentRecord contentRecord = this.f20874c;
        return contentRecord == null || contentRecord.D() == 10 || this.f20874c.D() == 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Integer num) {
        if (this.N != null) {
            a(Long.valueOf(System.currentTimeMillis() - this.N.d()), Integer.valueOf(this.N.c()), num);
        }
    }

    private void c(long j, int i) {
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        if (dVar == null || this.F || j <= dVar.getMinEffectiveShowTime() || i < this.f20873b.getMinEffectiveShowRatio()) {
            return;
        }
        this.F = true;
        a(Long.valueOf(j), Integer.valueOf(i), (Integer) null);
    }

    private void c(int i) {
        int i2;
        if (this.B && (i2 = this.A) >= 0) {
            this.C = i - i2;
            this.B = false;
        }
        this.A = -1;
    }

    private int c(ContentRecord contentRecord) {
        int I = (contentRecord == null || contentRecord.j() == null) ? 2 : contentRecord.j().I();
        if ((this.T == 1 && !as.n(this.U)) || I < 1 || I > 5 || ((I == 1 || I == 5) && (contentRecord == null || contentRecord.ag() == null || TextUtils.isEmpty(contentRecord.ag().getIconUrl())))) {
            return 2;
        }
        if (2 == getResources().getConfiguration().orientation && I != 1) {
            return 2;
        }
        int iK = dk.k(getContext());
        if (((iK == 0 || 8 == iK) && I != 1) || !d(contentRecord)) {
            return 2;
        }
        return I;
    }

    private boolean b(Integer num) {
        HashMap map = new HashMap();
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        if (dVar != null) {
            map.put("appId", dVar.O());
            map.put("thirdId", this.f20873b.N());
        }
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(getContext(), this.f20874c, map);
        if (!aVarA.a()) {
            return false;
        }
        com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
        if (aVar != null) {
            aVar.e();
        }
        nk nkVar = this.u;
        if (nkVar != null) {
            nkVar.a(aVarA, num, this.ae);
            this.ae = null;
        }
        a((Integer) 1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        hw.b("PPSInterstitialView", "resume %s", Boolean.valueOf(z));
        if (v()) {
            if (z && this.ag) {
                return;
            }
            this.ag = true;
            PPSInterstitialVideoView pPSInterstitialVideoView = this.e;
            if (pPSInterstitialVideoView != null) {
                pPSInterstitialVideoView.c();
                l();
                if (this.s) {
                    this.e.g();
                } else {
                    this.e.h();
                }
            }
            a(this.s);
        }
    }

    private void b(String str) {
        if (!this.w || TextUtils.isEmpty(str)) {
            this.l.setVisibility(8);
        } else {
            this.l.setText(str);
            if (this.ah.getVisibility() == 8) {
                this.l.setVisibility(0);
            }
        }
        if (this.w) {
            return;
        }
        String adChoiceUrl = this.f20873b.getAdChoiceUrl();
        String adChoiceIcon = this.f20873b.getAdChoiceIcon();
        if (!TextUtils.isEmpty(adChoiceUrl)) {
            if (TextUtils.isEmpty(adChoiceIcon)) {
                this.v.b();
            } else {
                this.v.setAdChoiceIcon(adChoiceIcon);
            }
        }
        this.v.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSInterstitialView.this.f20873b == null) {
                    hw.c("PPSInterstitialView", "AdInfo is null or contentData is null");
                } else if (bm.a(PPSInterstitialView.this.f20873b.getCompliance())) {
                    com.huawei.openalliance.ad.utils.d.a(PPSInterstitialView.this.getContext(), PPSInterstitialView.this.f20873b);
                } else {
                    ComplianceActivity.a(PPSInterstitialView.this.getContext(), view, pf.a(PPSInterstitialView.this.f20873b), true);
                }
            }
        });
    }

    private void b(ContentRecord contentRecord) {
        this.e.setVideoBackgroundColor(getResources().getColor(R.color.hiad_black));
        this.e.setBackgroundColor(getResources().getColor(R.color.hiad_black));
        this.e.setVideoScaleMode(1);
        if (!d(contentRecord)) {
            this.e.setAutoScaleResizeLayoutOnVideoSizeChange(false);
            return;
        }
        int i = this.g;
        if (i == 1 || i == 2) {
            this.e.setAutoScaleResizeLayoutOnVideoSizeChange(false);
            return;
        }
        if (i != 3 && i != 4 && i != 5) {
            this.e.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        } else {
            this.e.setUnUseDefault(false);
            this.e.setAutoScaleResizeLayoutOnVideoSizeChange(true);
        }
    }

    private String b(int i, boolean z) {
        return (z || "1".equals(this.f20873b.getAdSign())) ? getResources().getQuantityString(R.plurals.hiad_reward_countdown, i, Integer.valueOf(i)) : getResources().getQuantityString(R.plurals.hiad_interstitial_time_countdown, i, Integer.valueOf(i));
    }

    private void a(boolean z) {
        int iA = dk.a(this.g, z);
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageResource(iA);
        }
    }

    private void a(String str) {
        if (!this.w || TextUtils.isEmpty(str)) {
            this.ah.setVisibility(8);
            return;
        }
        this.ah.setText(str);
        this.l.setVisibility(8);
        this.ah.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Long l, Integer num, Integer num2) {
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        if (dVar == null) {
            return;
        }
        boolean zA = com.huawei.openalliance.ad.utils.c.a(dVar.d(), num2);
        if (!this.f20873b.W() || (zA && !this.f20873b.b())) {
            nk nkVar = this.u;
            if (nkVar != null) {
                nkVar.a(l.longValue(), num.intValue(), num2);
            }
            if (zA) {
                this.f20873b.a(true);
            }
            if (this.f20873b.W()) {
                return;
            }
            this.f20873b.g(true);
            mh mhVar = this.f20872a;
            if (mhVar != null) {
                mhVar.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.huawei.openalliance.ad.views.interfaces.b bVar) {
        boolean zA = bVar.a();
        boolean zB = bVar.b();
        hw.b("PPSInterstitialView", "onClick, isAppRelated: %s, isHandled: %s, destination:%s", Boolean.valueOf(zA), Boolean.valueOf(zB), bVar.c());
        com.huawei.openalliance.ad.inter.listeners.a aVar = this.O;
        if (aVar != null) {
            aVar.b();
        }
        c((Integer) 1);
        if (bVar.b()) {
            a((Integer) 1);
        } else {
            b(bVar.d());
        }
    }

    private void a(mh mhVar, ContentRecord contentRecord) {
        if (this.e != null && contentRecord.T() != null) {
            this.e.a(mhVar);
        } else {
            if (this.n == null || dg.b(contentRecord.A())) {
                return;
            }
            mhVar.f();
        }
    }

    private void a(AppInfo appInfo) {
        if (appInfo == null || TextUtils.isEmpty(appInfo.getIconUrl()) || !d(this.f20874c)) {
            return;
        }
        int i = this.g;
        if (i == 1 || i == 3 || i == 5) {
            this.i.a(new ImageView(this.U), appInfo.getIconUrl(), new bd.a() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.13
                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a(final Drawable drawable) {
                    if (drawable != null) {
                        final Drawable drawableA = bb.a(PPSInterstitialView.this.U, drawable, 5.0f, 8.0f);
                        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.13.1
                            @Override // java.lang.Runnable
                            public void run() {
                                PPSInterstitialView.this.i.setAppIconImageDrawable(drawable);
                                if (PPSInterstitialView.this.ab != null) {
                                    PPSInterstitialView.this.ab.setAppIconImageDrawable(drawable);
                                }
                                if (!(drawable instanceof com.huawei.openalliance.ad.views.gif.b) && PPSInterstitialView.this.o != null && drawableA != null && PPSInterstitialView.this.g != 3) {
                                    PPSInterstitialView.this.o.setBackground(drawableA);
                                    View viewD = dr.d(PPSInterstitialView.this.U);
                                    if (viewD != null) {
                                        PPSInterstitialView.this.o.addView(viewD, 0);
                                    }
                                }
                                hw.a("PPSInterstitialView", "get icon suucess");
                            }
                        });
                    }
                }

                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a() {
                    hw.b("PPSInterstitialView", "get icon failed");
                }
            });
        }
    }

    private void a(ContentRecord contentRecord) {
        if (contentRecord == null || contentRecord.ag() == null) {
            return;
        }
        this.ak = new hr(new TextView[]{this.ah, this.l}, this.f20874c, new boolean[]{!I(), this.w}, this.f20873b.getLabel());
        com.huawei.openalliance.ad.download.app.d.a().b(this.ak);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0221  */
    private void a(Context context, ContentRecord contentRecord) {
        int i;
        int i2;
        int i3;
        boolean zD;
        boolean zA;
        int i4;
        int iC = c(contentRecord);
        this.g = iC;
        hw.b("PPSInterstitialView", "insreTemplate %s", Integer.valueOf(iC));
        if (this.T != 1 || as.n(context)) {
            if (d(contentRecord)) {
                int i5 = this.g;
                if (i5 == 1) {
                    i = R.layout.hiad_interstitial_layout;
                    i2 = R.id.interstitial_content_view;
                    i3 = R.color.hiad_emui_color_subbg;
                    a(context, i, i2, i3);
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            a(context, R.layout.hiad_interstitial_layout4, R.id.interstitial_content_view, R.color.hiad_emui_color_subbg);
                            this.ab = (PPSAppDetailTemplateView) findViewById(R.id.interstitial_app_detail_template);
                        } else if (i5 == 5) {
                            a(context, R.layout.hiad_interstitial_layout5, R.id.interstitial_content_view, R.color.hiad_emui_color_subbg);
                            PPSAppDetailTemplateView pPSAppDetailTemplateView = (PPSAppDetailTemplateView) findViewById(R.id.interstitial_app_detail_template);
                            this.ab = pPSAppDetailTemplateView;
                            pPSAppDetailTemplateView.setLoadAppIconSelf(false);
                        }
                        this.ac = (TextView) findViewById(R.id.interstitial_app_detail_appdesc_template);
                        this.ad = (PPSAppDownLoadWithAnimationView) findViewById(R.id.interstitial_app_download_btn_template);
                    } else {
                        a(context, R.layout.hiad_interstitial_layout3, R.id.interstitial_content_view, R.color.hiad_emui_color_subbg);
                        PPSAppDetailTemplateView pPSAppDetailTemplateView2 = (PPSAppDetailTemplateView) findViewById(R.id.interstitial_app_detail_template);
                        this.ab = pPSAppDetailTemplateView2;
                        pPSAppDetailTemplateView2.setLoadAppIconSelf(false);
                        this.ac = (TextView) findViewById(R.id.interstitial_app_detail_appdesc_template);
                    }
                }
                this.o = (ViewGroup) findViewById(R.id.interstitial_content_view);
                PPSInterstitialVideoView pPSInterstitialVideoView = (PPSInterstitialVideoView) findViewById(R.id.interstitial_video_view);
                this.e = pPSInterstitialVideoView;
                pPSInterstitialVideoView.setOnClickListener(this);
                this.h = findViewById(R.id.video_control_view);
                this.v = (ChoicesView) findViewById(R.id.interstitial_info);
                zD = cc.a(context).d();
                this.w = zD;
                if (zD) {
                    this.v.setVisibility(8);
                }
                PPSLabelSourceView pPSLabelSourceView = (PPSLabelSourceView) findViewById(R.id.custom_ad_bg_layout);
                this.q = pPSLabelSourceView;
                pPSLabelSourceView.setBackgroundColor(getResources().getColor(R.color.hiad_transparent));
                zA = as.a(this.w, contentRecord.bf(), contentRecord.be());
                this.q.b(context, zA);
                this.q.a(this, contentRecord, zA);
                this.r = this.q.getAdLabel();
                this.l = this.q.getAdSource();
                this.ah = this.q.getAdJumpText();
                if (zA || d()) {
                    if (zA) {
                        this.ah.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
                        this.ah.setPadding(as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0, as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0);
                    }
                    this.ah.setTextColor(getResources().getColor(R.color.hiad_ad_source_color));
                    this.ah.setTextSize(1, 10.0f);
                }
                a(getInterstitialJumpText());
                if (context.getResources().getConfiguration().orientation == 1 && this.w) {
                    i4 = R.id.interstitial_mute_icon;
                } else {
                    i4 = R.id.interstitial_oversea_mute_icon;
                }
                this.f = (ImageView) findViewById(i4);
                this.f.setImageResource(dk.a(this.g, this.s));
                dk.a(this.f);
                this.f.setVisibility(0);
                this.r.setVisibility(0);
                ImageView imageView = (ImageView) findViewById(R.id.interstitial_close);
                this.m = imageView;
                imageView.setOnClickListener(this);
                this.j = (PPSAppDetailView) findViewById(R.id.interstitial_download_area);
                this.k = (PPSExpandButtonDetailView) findViewById(R.id.interstitial_expand_button_download_area);
                GifPlayView gifPlayView = (GifPlayView) findViewById(R.id.interstitial_image_view);
                this.n = gifPlayView;
                gifPlayView.setOnClickListener(this);
                this.y = (ProgressBar) findViewById(R.id.interstitial_progress);
                this.p = (TextView) findViewById(R.id.insterstitial_count_down);
                AdSource adSourceA = AdSource.a(this.f20873b.t());
                this.r.setDataAndRefreshUi(contentRecord);
                if (!this.r.a()) {
                    this.R = 0;
                }
                this.r.a(adSourceA, this.f20873b.u());
                e();
                a(contentRecord);
            }
            i = R.layout.hiad_interstitial_layout;
        } else {
            i = R.layout.hiad_interstitial_half_layout;
        }
        i2 = R.id.interstitial_content_view;
        i3 = R.color.hiad_black;
        a(context, i, i2, i3);
        this.o = (ViewGroup) findViewById(R.id.interstitial_content_view);
        PPSInterstitialVideoView pPSInterstitialVideoView2 = (PPSInterstitialVideoView) findViewById(R.id.interstitial_video_view);
        this.e = pPSInterstitialVideoView2;
        pPSInterstitialVideoView2.setOnClickListener(this);
        this.h = findViewById(R.id.video_control_view);
        this.v = (ChoicesView) findViewById(R.id.interstitial_info);
        zD = cc.a(context).d();
        this.w = zD;
        if (zD) {
            this.v.setVisibility(8);
        }
        PPSLabelSourceView pPSLabelSourceView2 = (PPSLabelSourceView) findViewById(R.id.custom_ad_bg_layout);
        this.q = pPSLabelSourceView2;
        pPSLabelSourceView2.setBackgroundColor(getResources().getColor(R.color.hiad_transparent));
        zA = as.a(this.w, contentRecord.bf(), contentRecord.be());
        this.q.b(context, zA);
        this.q.a(this, contentRecord, zA);
        this.r = this.q.getAdLabel();
        this.l = this.q.getAdSource();
        this.ah = this.q.getAdJumpText();
        if (zA) {
            if (zA) {
                this.ah.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
                this.ah.setPadding(as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0, as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0);
            }
            this.ah.setTextColor(getResources().getColor(R.color.hiad_ad_source_color));
            this.ah.setTextSize(1, 10.0f);
        } else {
            if (zA) {
                this.ah.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
                this.ah.setPadding(as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0, as.a(getContext(), getResources().getDimension(R.dimen.hiad_2_dp)), 0);
            }
            this.ah.setTextColor(getResources().getColor(R.color.hiad_ad_source_color));
            this.ah.setTextSize(1, 10.0f);
        }
        a(getInterstitialJumpText());
        if (context.getResources().getConfiguration().orientation == 1) {
            i4 = R.id.interstitial_oversea_mute_icon;
        } else {
            i4 = R.id.interstitial_oversea_mute_icon;
        }
        this.f = (ImageView) findViewById(i4);
        this.f.setImageResource(dk.a(this.g, this.s));
        dk.a(this.f);
        this.f.setVisibility(0);
        this.r.setVisibility(0);
        ImageView imageView2 = (ImageView) findViewById(R.id.interstitial_close);
        this.m = imageView2;
        imageView2.setOnClickListener(this);
        this.j = (PPSAppDetailView) findViewById(R.id.interstitial_download_area);
        this.k = (PPSExpandButtonDetailView) findViewById(R.id.interstitial_expand_button_download_area);
        GifPlayView gifPlayView2 = (GifPlayView) findViewById(R.id.interstitial_image_view);
        this.n = gifPlayView2;
        gifPlayView2.setOnClickListener(this);
        this.y = (ProgressBar) findViewById(R.id.interstitial_progress);
        this.p = (TextView) findViewById(R.id.insterstitial_count_down);
        AdSource adSourceA2 = AdSource.a(this.f20873b.t());
        this.r.setDataAndRefreshUi(contentRecord);
        if (!this.r.a()) {
            this.R = 0;
        }
        this.r.a(adSourceA2, this.f20873b.u());
        e();
        a(contentRecord);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewFullScreen)) != null) {
            try {
                int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.ViewFullScreen_fullScreen, 0);
                this.T = integer;
                hw.a("PPSInterstitialView", "mFullScreen %d", Integer.valueOf(integer));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.U = context;
        this.V = true;
        this.aa = com.huawei.openalliance.ad.dk.a(context, "normal");
        this.u = new nk(context, this);
        this.N = new jm(this, this);
    }

    private void a(Context context, int i, int i2, int i3) {
        inflate(context, i, this);
        this.ai = i;
        ViewGroup viewGroup = (ViewGroup) findViewById(i2);
        this.o = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(i3));
    }

    private void a(Context context) {
        if (as.n(context)) {
            this.ac.setTextSize(1, 21.0f);
            int i = this.g;
            if (i == 3) {
                this.ac.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ab.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin - ((int) dr.a(context, 14)));
                this.ab.setLayoutParams(layoutParams);
                return;
            }
            if (i == 4) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ab.getLayoutParams();
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - ((int) dr.a(context, 8)), layoutParams2.rightMargin, layoutParams2.bottomMargin);
                this.ab.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ac.getLayoutParams();
                layoutParams3.setMargins(layoutParams3.leftMargin, layoutParams3.topMargin, layoutParams3.rightMargin, layoutParams3.bottomMargin);
                this.ac.setLayoutParams(layoutParams3);
                return;
            }
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.ab.getLayoutParams();
            layoutParams4.setMargins(layoutParams4.leftMargin, layoutParams4.topMargin, layoutParams4.rightMargin, layoutParams4.bottomMargin + ((int) dr.a(context, 2)));
            this.ab.setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.ac.getLayoutParams();
            layoutParams5.setMargins(layoutParams5.leftMargin, layoutParams5.topMargin, layoutParams5.rightMargin, layoutParams5.bottomMargin);
            this.ac.setLayoutParams(layoutParams5);
            PPSAppDownLoadWithAnimationView pPSAppDownLoadWithAnimationView = this.ad;
            if (pPSAppDownLoadWithAnimationView != null) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) pPSAppDownLoadWithAnimationView.getLayoutParams();
                layoutParams6.setMargins(layoutParams6.leftMargin, layoutParams6.topMargin + ((int) dr.a(context, 12)), layoutParams6.rightMargin, layoutParams6.bottomMargin);
                this.ad.setLayoutParams(layoutParams6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        if (this.p == null) {
            return;
        }
        if (z && (i = e(i)) == 0) {
            this.p.setVisibility(8);
        }
        this.p.setText(b(i, z));
    }

    private void K() {
        com.huawei.openalliance.ad.inter.data.d dVar = this.f20873b;
        if (dVar != null) {
            this.s = dVar.Z();
        }
    }

    private void J() {
        PPSLabelView pPSLabelView = this.r;
        if (pPSLabelView == null) {
            return;
        }
        pPSLabelView.b();
    }

    private boolean I() {
        boolean zC = c();
        boolean zCk = fp.b(this.U).ck();
        hw.b("PPSInterstitialView", "current material isAdClickable: %s", Boolean.valueOf(zCk));
        return zC || zCk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (this.f20873b != null) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.5
                @Override // java.lang.Runnable
                public void run() {
                    com.huawei.openalliance.ad.inter.data.d dVar = PPSInterstitialView.this.f20873b;
                    if (PPSInterstitialView.this.L) {
                        if ((PPSInterstitialView.this.w() || PPSInterstitialView.this.x()) && PPSInterstitialView.this.N != null) {
                            PPSInterstitialView.this.a(Long.valueOf(dVar.getMinEffectiveShowTime()), Integer.valueOf(PPSInterstitialView.this.N.c()), (Integer) null);
                        }
                    }
                }
            }, this.P, this.f20873b.getMinEffectiveShowTime());
        }
    }

    private void G() {
        if (!v()) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            return;
        }
        this.e.a((com.huawei.openalliance.ad.media.listener.a) this);
        this.e.a((MuteListener) this);
        this.e.a((SegmentMediaStateListener) this);
        this.e.a((NetworkChangeListener) this);
        b(this.f20874c);
        this.e.a(this.f20873b, this.f20874c);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PPSInterstitialView.this.s) {
                    PPSInterstitialView.this.e.h();
                } else {
                    PPSInterstitialView.this.e.g();
                }
                if (PPSInterstitialView.this.u != null) {
                    PPSInterstitialView.this.u.a(!PPSInterstitialView.this.s);
                }
            }
        });
        VideoInfo videoInfoP = this.f20873b.P();
        if (videoInfoP != null) {
            if (!videoInfoP.e()) {
                this.f.setVisibility(4);
            }
            if (this.J <= 0) {
                this.J = videoInfoP.getVideoDuration();
            }
        }
        if (this.J <= 0) {
            this.J = (int) this.f20873b.ab();
        }
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSInterstitialView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSInterstitialView.this.l();
                PPSInterstitialView pPSInterstitialView = PPSInterstitialView.this;
                pPSInterstitialView.a(Long.valueOf(pPSInterstitialView.f20873b.getMinEffectiveShowTime()), Integer.valueOf(PPSInterstitialView.this.N.c()), (Integer) 5);
            }
        });
    }

    private boolean F() {
        return pa.f(this.f20873b.getCtrlSwitchs()) == 2 || as.n(this.U);
    }

    private void E() {
        TextView textView;
        if ((F() || this.W) && (textView = this.ac) != null && this.g == 3) {
            textView.setVisibility(8);
        }
    }

    private void D() {
        if (TextUtils.isEmpty(this.f20873b.L()) && TextUtils.isEmpty(this.f20873b.getCta())) {
            this.i.setVisibility(8);
        } else {
            AppInfo appInfo = new AppInfo();
            appInfo.o(this.f20873b.L());
            this.Q.a(appInfo);
            this.i.setAppRelated(false);
        }
        if (this.f20873b.J() == 0) {
            this.i.setVisibility(8);
        }
    }

    private boolean C() {
        int i = this.g;
        return i == 4 || i == 5;
    }

    private boolean B() {
        return this.T != 1 || as.n(this.U);
    }

    private void A() {
        if (B() && d(this.f20874c) && C()) {
            this.i = this.ad;
            return;
        }
        this.j = (PPSAppDetailView) findViewById(R.id.interstitial_download_area);
        this.k = (PPSExpandButtonDetailView) findViewById(R.id.interstitial_expand_button_download_area);
        PPSAppDetailView pPSAppDetailView = (F() || this.W) ? this.k : this.j;
        this.i = pPSAppDetailView;
        pPSAppDetailView.setBackgroundColor(getResources().getColor(R.color.hiad_90_percent_white));
    }

    class a implements com.huawei.openalliance.ad.views.gif.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f20898b;

        @Override // com.huawei.openalliance.ad.views.gif.d
        public void c() {
        }

        @Override // com.huawei.openalliance.ad.views.gif.d
        public void b() {
            PPSInterstitialView.this.p.setVisibility(8);
            PPSInterstitialView.this.m.setVisibility(0);
        }

        @Override // com.huawei.openalliance.ad.views.gif.d
        public void a() {
            if (PPSInterstitialView.this.M || this.f20898b.getIntrinsicHeight() == PPSInterstitialView.this.D || this.f20898b.getIntrinsicWidth() == PPSInterstitialView.this.D) {
                return;
            }
            PPSInterstitialView.this.M = true;
            PPSInterstitialView.this.y.setVisibility(8);
            PPSInterstitialView.this.n.requestLayout();
            PPSInterstitialView.this.L = true;
            PPSInterstitialView.this.K = System.currentTimeMillis();
            PPSInterstitialView.this.H();
        }

        public a(Drawable drawable) {
            this.f20898b = drawable;
        }
    }

    public PPSInterstitialView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20872a = new lw();
        this.s = true;
        this.w = true;
        this.z = true;
        this.A = -1;
        this.B = false;
        this.C = -1L;
        this.D = -1;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.L = false;
        this.M = false;
        this.P = "interstitial_imp_monitor_" + hashCode();
        this.T = 0;
        this.W = false;
        this.af = true;
        this.ag = false;
        a(context, attributeSet);
    }

    public PPSInterstitialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20872a = new lw();
        this.s = true;
        this.w = true;
        this.z = true;
        this.A = -1;
        this.B = false;
        this.C = -1L;
        this.D = -1;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.L = false;
        this.M = false;
        this.P = "interstitial_imp_monitor_" + hashCode();
        this.T = 0;
        this.W = false;
        this.af = true;
        this.ag = false;
        a(context, attributeSet);
    }

    public PPSInterstitialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20872a = new lw();
        this.s = true;
        this.w = true;
        this.z = true;
        this.A = -1;
        this.B = false;
        this.C = -1L;
        this.D = -1;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.L = false;
        this.M = false;
        this.P = "interstitial_imp_monitor_" + hashCode();
        this.T = 0;
        this.W = false;
        this.af = true;
        this.ag = false;
        a(context, attributeSet);
    }

    public PPSInterstitialView(Context context) {
        super(context);
        this.f20872a = new lw();
        this.s = true;
        this.w = true;
        this.z = true;
        this.A = -1;
        this.B = false;
        this.C = -1L;
        this.D = -1;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.L = false;
        this.M = false;
        this.P = "interstitial_imp_monitor_" + hashCode();
        this.T = 0;
        this.W = false;
        this.af = true;
        this.ag = false;
        a(context, (AttributeSet) null);
    }
}
