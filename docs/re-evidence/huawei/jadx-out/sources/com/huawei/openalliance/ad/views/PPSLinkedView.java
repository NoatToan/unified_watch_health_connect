package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.ce;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.ILinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdShowListener;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import com.huawei.openalliance.ad.ji;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.jl;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.ILinkedMediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.oh;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.ph;
import com.huawei.openalliance.ad.sa;
import com.huawei.openalliance.ad.sb;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.ua;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.uu;
import com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class PPSLinkedView extends j {

    public interface OnLinkedAdClickListener {
        void onClick(int i);
    }

    public interface OnLinkedAdPreparedListener {
        void onPrepared();
    }

    public interface OnLinkedAdSwitchListener {
        void onSwitch(int i);
    }

    public void unregister(IAppDownloadButton iAppDownloadButton) {
        hw.b("PPSLinkedView", "begin unregister appDownloadButton");
        if (iAppDownloadButton == null || iAppDownloadButton != this.w) {
            return;
        }
        this.w.setPpsLinkedView(null);
        this.w.setNativeAd(null);
        this.w = null;
        this.ap = false;
    }

    public void unregister() {
        hw.b("PPSLinkedView", "unregister. ");
        V();
    }

    public void unmute() {
        hw.b("PPSLinkedView", "call unmute. ");
        this.e.c(this.o);
    }

    public void stopView() {
        hw.b("PPSLinkedView", "stopView, LinkedState: %s, isStartScale: %s", Integer.valueOf(this.ad), Boolean.valueOf(this.au));
        if (this.ad == 1) {
            if (!this.ak && this.N && !this.au) {
                hw.a("PPSLinkedView", "report imp on splash. ");
                a((Integer) 8, false);
                this.p.a(System.currentTimeMillis() - this.Q, 100);
                this.Q = -1L;
            }
            O();
            if (this.au && this.av != null) {
                this.aA = false;
                this.av.end();
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.8
                @Override // java.lang.Runnable
                public void run() {
                    PPSLinkedView.this.c(false);
                }
            }, 200L);
            this.as = true;
            this.ad = 2;
        }
        if (this.B != null) {
            this.B.setVisibility(8);
            this.B = null;
        }
        if (this.H != null) {
            this.H = null;
        }
        if (this.L != null) {
            this.L = null;
        }
        this.e.g();
        if (this.l != null) {
            this.l.j(false);
        }
    }

    public void start(Context context) {
        if (this.an) {
            hw.c("PPSLinkedView", "register failed, can't start now");
            return;
        }
        if (this.ao || !this.aw) {
            hw.c("PPSLinkedView", "Already started:%s, isPrepared:%s, can't start now", Boolean.valueOf(this.ao), Boolean.valueOf(this.aw));
            return;
        }
        if (!(context instanceof Activity)) {
            a("context not activity");
            return;
        }
        this.aS = new WeakReference<>(context);
        this.ao = true;
        if (this.m != null && this.m.t()) {
            a("already started play normal ad. ");
            return;
        }
        hw.b("PPSLinkedView", "start after prepare, mediator: %S", Boolean.valueOf(this.m == null));
        if (this.B != null) {
            hw.b("PPSLinkedView", "test, mediator: %S", this.B.getAdMediator());
        }
        if (this.m instanceof ji) {
            hw.b("PPSLinkedView", "start, set shown");
            ((ji) this.m).c(true);
        }
        if (!z()) {
            hw.c("PPSLinkedView", "exsplash unable user info or over time, can't start now");
            return;
        }
        this.aW = false;
        this.g = context.getApplicationContext();
        this.C = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        this.C.addView(this.v, b(context));
        a(context);
        a(this.l, this.h.aT());
        y();
        b(true);
    }

    public void start() {
        hw.b("PPSLinkedView", "start. ");
        if (this.an || this.ao) {
            hw.c("PPSLinkedView", "can't start now, reg fail: %s, already start: %s", Boolean.valueOf(this.an), Boolean.valueOf(this.ao));
            return;
        }
        w();
        if (this.m != null && this.m.t()) {
            a("already started play normal ad. ");
            return;
        }
        hw.b("PPSLinkedView", "start, adMediator:%s, splashView:%s", this.m, this.B);
        if (this.B != null) {
            hw.b("PPSLinkedView", "start, splashView.getAdMediator():%s", this.B.getAdMediator());
        }
        if (this.m instanceof ji) {
            hw.b("PPSLinkedView", "start, set shown");
            ((ji) this.m).c(true);
        }
        if (x()) {
            return;
        }
        e(this.l.P());
        v();
    }

    public void setOnLinkedAdSwitchListener(OnLinkedAdSwitchListener onLinkedAdSwitchListener) {
        this.q = onLinkedAdSwitchListener;
    }

    public void setOnLinkedAdPreparedListener(OnLinkedAdPreparedListener onLinkedAdPreparedListener) {
        this.s = onLinkedAdPreparedListener;
    }

    public void setOnLinkedAdClickListener(OnLinkedAdClickListener onLinkedAdClickListener) {
        this.r = onLinkedAdClickListener;
    }

    public void setMuteOnlyOnLostAudioFocus(boolean z) {
        this.ay = z;
    }

    public void setLinkedAdActionListener(AdActionListener adActionListener) {
        hw.b("PPSLinkedView", "setLinkedAdActionListener. ");
        if (this.p != null) {
            this.p.a(adActionListener);
        }
    }

    public void setAdShowListener(AdShowListener adShowListener) {
        hw.b("PPSLinkedView", "setAdShowListener. ");
        if (this.p != null) {
            this.p.a(adShowListener);
        }
    }

    public void resumeView() {
        hw.b("PPSLinkedView", "resumeView, LinkedState: %s", Integer.valueOf(this.ad));
        if (this.as) {
            this.ad = 2;
        }
        if (this.ad == 2) {
            this.e.a(this.o);
            if (this.k == null) {
                J();
            }
            if (this.k != null) {
                this.k.f();
            }
        } else if (this.ad == 1 && this.S) {
            O();
            if (this.au && this.av != null) {
                this.av.end();
            }
            c(true);
            if (this.al != null) {
                this.al.onAdDismissed();
            }
            this.ad = 2;
        }
        if (this.B != null) {
            this.B = null;
        }
        if (this.H != null) {
            this.H = null;
        }
        if (this.L != null) {
            this.L = null;
        }
    }

    public void registerSplashView(PPSSplashView pPSSplashView) {
        hw.b("PPSLinkedView", "begin register splashView");
        if (this.aq) {
            hw.c("PPSLinkedView", "Already registered splashView, can't register now");
            return;
        }
        this.aq = true;
        this.B = pPSSplashView;
        if (pPSSplashView != null) {
            if (pPSSplashView.getAdListener() instanceof LinkedAdListener) {
                this.al = (LinkedAdListener) pPSSplashView.getAdListener();
            }
            this.I = pPSSplashView.getLogoResId();
            this.M = pPSSplashView.getMediaNameResId();
            this.L = pPSSplashView.getLogo();
            this.H = pPSSplashView.getSloganView();
            this.m = pPSSplashView.getAdMediator();
            this.n = pPSSplashView.getAudioFocusType();
        }
        hw.b("PPSLinkedView", "register PPSSplashView, linkedAdListener: %s. ", dg.b(this.al));
    }

    public boolean register(IAppDownloadButton iAppDownloadButton) {
        hw.b("PPSLinkedView", "begin register appDownloadButton");
        boolean nativeAd = false;
        if (this.ap) {
            hw.c("PPSLinkedView", "Already registered appDownloadButton, can't register now");
            return false;
        }
        this.ap = true;
        if (this.l == null) {
            throw new IllegalStateException("Register INativeAd first");
        }
        this.w = iAppDownloadButton;
        if (iAppDownloadButton != null) {
            iAppDownloadButton.setPpsLinkedView(this);
            nativeAd = iAppDownloadButton.setNativeAd(this.l);
        }
        if (hw.a()) {
            hw.a("PPSLinkedView", "register downloadbutton, succ:%s", Boolean.valueOf(nativeAd));
        }
        return nativeAd;
    }

    public void register(ILinkedSplashAd iLinkedSplashAd, List<View> list, final PPSDestView pPSDestView) {
        hw.b("PPSLinkedView", "register, linkedSplashAd: %s, clickableViews: %s, destView: %s. ", iLinkedSplashAd, list, pPSDestView);
        if (this.am) {
            hw.c("PPSLinkedView", "Already registered, can't register now");
            return;
        }
        if (iLinkedSplashAd == null || iLinkedSplashAd.getVideoInfo() == null) {
            hw.c("PPSLinkedView", "register failed, ad is null");
            return;
        }
        this.am = true;
        if (this.l == null) {
            register(iLinkedSplashAd);
        }
        if (pPSDestView == null) {
            hw.c("PPSLinkedView", "register failed, destView is null");
            this.an = true;
            return;
        }
        this.z = pPSDestView;
        setDestViewClickable(pPSDestView);
        this.e.a(this.g, iLinkedSplashAd);
        if (list != null) {
            this.A = list;
            a(list);
        }
        this.v = new aj(this.g);
        a(iLinkedSplashAd);
        s();
        u();
        r();
        this.J = this.v.getViewStub();
        t();
        setSplashViewClickable(this.v);
        hw.b("PPSLinkedView", "add view");
        pPSDestView.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.2
            @Override // java.lang.Runnable
            public void run() {
                PPSDestView pPSDestView2;
                hw.a("PPSLinkedView", "destView post");
                if (!dk.c() || (pPSDestView2 = pPSDestView) == null || pPSDestView2.getX() >= 0.0f) {
                    return;
                }
                PPSLinkedView.this.D();
                pPSDestView.setX((PPSLinkedView.this.aa - Math.abs(pPSDestView.getX())) - pPSDestView.getWidth());
            }
        });
        pPSDestView.addView(this.e.f(), getDestViewParam());
    }

    public void register(ILinkedSplashAd iLinkedSplashAd) {
        hw.b("PPSLinkedView", "register, linkedSplashAd: %s. ", iLinkedSplashAd);
        if (this.ar) {
            hw.c("PPSLinkedView", "Already registered ad, can't register now");
            return;
        }
        this.ar = true;
        if (iLinkedSplashAd instanceof LinkedSplashAd) {
            this.l = (LinkedSplashAd) iLinkedSplashAd;
            this.l.setListener(this.al);
            this.o = this.l.getVideoInfo();
            if (this.o != null && !this.o.e()) {
                this.F = false;
            }
            this.p.a(this.l);
            W();
            this.p.h();
        }
        X();
    }

    public boolean q() {
        if (this.k != null) {
            return this.k.p();
        }
        return false;
    }

    public void prepare() {
        if (this.an) {
            hw.c("PPSLinkedView", "register failed, can't prepare now");
            return;
        }
        if (this.aw) {
            hw.c("PPSLinkedView", "already prepared");
            return;
        }
        if (this.l != null && this.l.isFromExsplash()) {
            this.al = HiAd.a(this.g).g();
            this.l.setListener(this.al);
        }
        if (!B()) {
            hw.c("PPSLinkedView", "prepare check failed");
            return;
        }
        if (this.l == null || this.o == null) {
            hw.c("PPSLinkedView", "prepare, linkedSplashAd is null");
            return;
        }
        e(this.l.P());
        hw.b("PPSLinkedView", "start prepare");
        C();
        this.e.b();
    }

    public void play() {
        hw.b("PPSLinkedView", "call play. ");
        this.e.h();
    }

    public void pause() {
        hw.b("PPSLinkedView", "call pause. ");
        this.e.g();
    }

    public void p() {
        hw.b("PPSLinkedView", "onClose");
        U();
        this.p.c();
        a((Integer) 3, true);
        this.d.c();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        hw.a("PPSLinkedView", "onVisibilityChanged:");
        if (this.k != null) {
            this.k.j();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.a("PPSLinkedView", "onDetechedFromWindow");
        if (this.k != null) {
            this.k.i();
        }
        dq.a(this.f21250c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.a("PPSLinkedView", "onAttachedToWindow");
        if (this.k != null) {
            this.k.h();
        }
        dq.a(this.f21250c);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        hw.b("PPSLinkedView", "onApplyWindowInsets, sdk: %s", Integer.valueOf(Build.VERSION.SDK_INT));
        if (dk.b() && windowInsets != null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                List boundingRects = displayCutout.getBoundingRects();
                if (!bm.a(boundingRects)) {
                    this.U = ((Rect) boundingRects.get(0)).height();
                }
            } else {
                hw.b("PPSLinkedView", "DisplayCutout is null");
            }
        }
        if (this.U <= 0 && cc.a(this.g).a(this.g)) {
            this.U = Math.max(this.U, cc.a(this.g).a(this));
        }
        hw.b("PPSLinkedView", "notchHeight:" + this.U);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // com.huawei.openalliance.ad.views.j
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // com.huawei.openalliance.ad.views.j
    public /* bridge */ /* synthetic */ aj n() {
        return super.n();
    }

    public void mute() {
        hw.b("PPSLinkedView", "call mute. ");
        this.e.b(this.o);
    }

    @Override // com.huawei.openalliance.ad.views.j
    public /* bridge */ /* synthetic */ jj m() {
        return super.m();
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void j() {
        hw.b("PPSLinkedView", "startScaleDown. ");
        O();
        if (!F()) {
            if (this.ak || this.Q == -1) {
                return;
            }
            this.p.a(System.currentTimeMillis() - this.Q, 100);
            this.Q = -1L;
            return;
        }
        this.au = true;
        g();
        this.v.setClickable(false);
        this.av = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.av.setInterpolator(new gx(0.4f, 0.0f, 0.2f, 1.0f));
        this.av.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                try {
                    float animatedFraction = (valueAnimator.getAnimatedFraction() * (PPSLinkedView.this.af - 1.0f)) + 1.0f;
                    float animatedFraction2 = (valueAnimator.getAnimatedFraction() * (PPSLinkedView.this.ah - 1.0f)) + 1.0f;
                    PPSLinkedView.this.y.a(animatedFraction, valueAnimator.getAnimatedFraction() * PPSLinkedView.this.ag, animatedFraction2, (int) (PPSLinkedView.this.aa * animatedFraction2), (int) (PPSLinkedView.this.W * animatedFraction));
                } catch (Throwable th) {
                    hw.b("PPSLinkedView", "scaleAndTransAnimation err: %s", th.getClass().getSimpleName());
                }
            }
        });
        K();
        this.av.setDuration(1000L).start();
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void i() {
        hw.b("PPSLinkedView", "reportDisplayError, adMediator: %s, linkedAdListener: %s", dg.b(this.m), dg.b(this.al));
        if (!this.aG && this.m != null) {
            hw.b("PPSLinkedView", "report display error. ");
            this.aG = true;
            this.m.c(-3);
            this.m.B();
            return;
        }
        if (this.aG) {
            return;
        }
        hw.b("PPSLinkedView", "report fail to display. ");
        this.aG = true;
        c(-3);
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void h() {
        if (this.ad != 1 || this.aj) {
            return;
        }
        this.aj = true;
        O();
        this.ad = 0;
        this.e.i();
        I();
        if (this.x != null) {
            this.x.i();
        }
        this.B = null;
        this.H = null;
        this.L = null;
        Y();
        if (this.aI != null) {
            this.aI.a();
        }
        if (this.ak || !this.N) {
            return;
        }
        hw.a("PPSLinkedView", "report imp and phyImp on splash. ");
        this.p.a(System.currentTimeMillis() - this.P, 100);
        a((Integer) 8, false);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSLinkedView
    public String getSplashViewSlotPosition() {
        return dk.a((js) this.B);
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void g() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        hw.b("PPSLinkedView", "calculateScaleAndTrans");
        D();
        if (this.W <= 0.0f || this.aa <= 0.0f) {
            hw.c("PPSLinkedView", "calculateScaleAndTrans, get screen size failed. ");
            i();
            unregister();
            return;
        }
        boolean zM = dk.m(this.g);
        hw.b("PPSLinkedView", "calculateScaleAndTrans, MultiWindow:%s, screenHeight:%s,  screenWidth:%s", Boolean.valueOf(zM), Float.valueOf(this.W), Float.valueOf(this.aa));
        this.z.getLocationOnScreen(this.ai);
        this.ab = this.z.getHeight();
        this.ac = this.z.getWidth();
        hw.b("PPSLinkedView", "calculateScaleAndTrans, destViewHeight:%s, destViewWidth:%s, locationX:%s, locationY:%s", Integer.valueOf(this.ab), Integer.valueOf(this.ac), Integer.valueOf(this.ai[0]), Integer.valueOf(this.ai[1]));
        Point point = new Point();
        this.C.getDefaultDisplay().getRealSize(point);
        hw.a("PPSLinkedView", "calculateScaleAndTrans, screenHeight:%s, point.y:%s", Float.valueOf(this.W), Integer.valueOf(point.y));
        if (this.U <= 0 && cc.a(this.g).a(this.g)) {
            this.U = Math.max(this.U, cc.a(this.g).a(this));
        }
        if ((point.y - this.U) - this.W > dk.j(this.g)) {
            this.V = dk.g(this.g);
        } else {
            this.V = 0;
        }
        hw.b("PPSLinkedView", "calculateScaleAndTrans, NotchEnable: %s, scrennHeight:%s, screenWidth:%s, navigationBarHeight:%s, notchHeight:%s", Boolean.valueOf(cc.a(this.g).a(this.g)), Float.valueOf(this.W), Float.valueOf(this.aa), Integer.valueOf(this.V), Integer.valueOf(this.U));
        if (cc.a(this.g).a(this.g)) {
            if (zM) {
                this.af = (this.ab * 1.0f) / (this.W + this.U);
                f3 = this.ai[1] + ((this.ab * 1.0f) / 2.0f);
                f5 = this.W;
                i = this.U;
            } else {
                this.af = (this.ab * 1.0f) / ((this.W + this.U) + this.V);
                f3 = this.ai[1] + ((this.ab * 1.0f) / 2.0f);
                f5 = this.W + this.U;
                i = this.V;
            }
            f4 = ((f5 + i) * 1.0f) / 2.0f;
        } else {
            if (zM) {
                this.af = (this.ab * 1.0f) / this.W;
                f = this.ai[1] + ((this.ab * 1.0f) / 2.0f);
                f2 = this.W;
            } else {
                this.af = (this.ab * 1.0f) / (this.V + this.W);
                f = this.ai[1] + ((this.ab * 1.0f) / 2.0f);
                f2 = this.W + this.V;
            }
            f3 = f - ((f2 * 1.0f) / 2.0f);
            f4 = this.U;
        }
        this.ag = f3 - f4;
        this.ah = ((this.ac * 1.0f) / this.aa) * 1.0f;
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void f() {
        if (!this.S) {
            this.S = true;
            if (this.l != null && this.l.isFromExsplash()) {
                na.a(this.g).a(RTCMethods.DISMISS_SLOGAN, null, null, null);
            }
            this.Q = System.currentTimeMillis();
            if (!this.h.bv()) {
                a((Long) null, (Integer) null, (Integer) 8, false);
                this.ak = true;
            }
            if (!this.aW && this.ad == 1) {
                P();
            }
        }
        if (this.H != null) {
            this.H.setVisibility(8);
            this.H = null;
        }
        if (this.B != null) {
            hw.a("PPSLinkedView", "PPSSplashView is not null. ");
            this.B.setVisibility(8);
            this.B = null;
        }
        if (this.L != null) {
            this.L.setVisibility(8);
            this.L = null;
        }
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void e() {
        hw.b("PPSLinkedView", "onViewShownBetweenFullAndPartial: ");
        this.e.d(this.o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0) {
                this.f = tz.a(this, motionEvent);
            }
            if (1 == iA) {
                tz.a(this, motionEvent, null, this.f);
            }
        } catch (Throwable th) {
            hw.c("PPSLinkedView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void destroyView() {
        hw.b("PPSLinkedView", "destroyView. ");
        unregister();
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void d() {
        hw.b("PPSLinkedView", "onViewPartialHidden: ");
        this.e.e(this.o);
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void c() {
        hw.b("PPSLinkedView", "onViewFullShown: ");
        this.e.a(this.o, this.az);
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void b(long j, int i) {
        hw.b("PPSLinkedView", "onViewPhysicalShowEnd: ");
        dq.a(this.f21249b);
        if (this.l != null) {
            this.l.j(false);
        }
        this.e.e();
        hw.a("PPSLinkedView", "onViewPhysicalShowEnd, noPhyImp: %s. ", Boolean.valueOf(this.ak));
        if (this.ak || i <= 0) {
            return;
        }
        hw.a("PPSLinkedView", "report phyImp. ");
        if (this.Q == -1) {
            this.p.a(j, i);
        } else {
            this.p.a(System.currentTimeMillis() - this.Q, i);
            this.Q = -1L;
        }
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void b() {
        hw.b("PPSLinkedView", "onViewPhysicalShowStart");
        if (!this.aj || this.l == null || this.l.ao()) {
            return;
        }
        l();
        k();
    }

    public void addMuteListener(MuteListener muteListener) {
        this.u = muteListener;
    }

    public void addLinkedMediaStateListener(ILinkedMediaStateListener iLinkedMediaStateListener) {
        if (iLinkedMediaStateListener == null) {
            return;
        }
        this.t = iLinkedMediaStateListener;
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected boolean a(MaterialClickInfo materialClickInfo) {
        if (this.aI != null && materialClickInfo != null) {
            int mode = this.aI.getMode();
            if (hw.a()) {
                hw.a("PPSLinkedView", "splashpro mode:%d", Integer.valueOf(mode));
            }
            if (1 != mode && mode != 0) {
                Rect rect = new Rect();
                this.aI.getHitRect(rect);
                boolean zContains = rect.contains(materialClickInfo.b().intValue(), materialClickInfo.c().intValue());
                hw.b("PPSLinkedView", "check result:" + zContains);
                return zContains;
            }
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.views.j
    public /* bridge */ /* synthetic */ void a(boolean z, int i, int i2, int i3) {
        super.a(z, i, i2, i3);
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void a(boolean z) {
        VideoInfo videoInfo;
        String str;
        hw.b("PPSLinkedView", "switchSound enableSound: " + z);
        if (this.y == null || this.e.k() == null) {
            return;
        }
        uu uuVar = this.e;
        if (z) {
            uuVar.d();
            this.E.setSelected(true);
            if (this.o != null) {
                videoInfo = this.o;
                str = "y";
                videoInfo.e(str);
            }
        } else {
            uuVar.c();
            this.E.setSelected(false);
            if (this.o != null) {
                videoInfo = this.o;
                str = "n";
                videoInfo.e(str);
            }
        }
        this.p.a(!z);
    }

    @Override // com.huawei.openalliance.ad.views.j
    public void a(Integer num, boolean z) {
        hw.a("PPSLinkedView", "reportSplashAdShowEvent. ");
        a(Long.valueOf(System.currentTimeMillis() - this.P), (Integer) 100, num, z);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSLinkedView
    public void a(Integer num) {
        a(Long.valueOf(System.currentTimeMillis() - this.k.e()), Integer.valueOf(this.k.d()), num, false);
    }

    protected void a(ContentRecord contentRecord, int[] iArr, int[] iArr2) {
        if (as.a(iArr, 2) && as.a(iArr2, 2) && contentRecord != null) {
            if (hw.a()) {
                hw.a("PPSLinkedView", "addComplianceDialog, loc: %s, %s", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                hw.a("PPSLinkedView", "addComplianceDialog, size: %s, %s", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.aX = new ua(getContext(), iArr, iArr2);
            this.v.addView(this.aX, layoutParams);
            contentRecord.u(dg.e(contentRecord.ab()));
            this.aX.setScreenWidth(this.v.getMeasuredWidth());
            this.aX.setScreenHeight(this.v.getMeasuredHeight());
            this.aX.setAdContent(contentRecord);
        }
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void a(long j, int i) {
        hw.b("PPSLinkedView", "onViewShowEndRecord");
        dq.a(this.f21249b);
        if (this.k.a(j)) {
            if (this.T) {
                return;
            }
            this.T = true;
            a(Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(this.ad == 2 ? 9 : 8), false);
            return;
        }
        if (this.T || this.l == null || this.l.ad()) {
            return;
        }
        hw.a("PPSLinkedView", "onSplashImpCannotReport.");
        this.aD.a(this.l.P(), Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void a(int i, boolean z) {
        if (this.o != null) {
            this.o.e(z ? 0 : i);
        }
        if (this.N) {
            this.N = false;
            oh ohVar = this.p;
            long j = this.P;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.R;
            long j3 = i;
            if (z) {
                ohVar.a(j, jCurrentTimeMillis, j2, j3);
                this.d.h();
            } else {
                ohVar.b(j, jCurrentTimeMillis, j2, j3);
                this.d.i();
            }
        }
        this.e.b(false);
    }

    @Override // com.huawei.openalliance.ad.views.j
    protected void a(int i) {
        b(this.ad);
        if (this.p == null || this.p.a(i, this.f)) {
            O();
            if (18 == i) {
                Context context = this.aS.get();
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(R.anim.hiad_open, R.anim.hiad_close);
                }
            }
        } else if (this.w != null && (this.w instanceof AppDownloadButton)) {
            if (AppStatus.DOWNLOAD == ((AppDownloadButton) this.w).getStatus() && this.l != null && this.l.isAutoDownloadApp() && pa.h(this.l.getCtrlSwitchs())) {
                hw.b("PPSLinkedView", "download app directly");
                ((AppDownloadButton) this.w).performClick();
            }
        }
        this.f = null;
        this.d.a();
        int i2 = 1;
        if (this.ad == 1) {
            this.ax = 3;
            if (this.r == null) {
                return;
            }
        } else {
            i2 = 2;
            if (this.ad != 2) {
                return;
            }
            this.ax = 4;
            if (this.r == null) {
                return;
            }
        }
        this.r.onClick(i2);
    }

    @Override // com.huawei.openalliance.ad.jl.a
    public void a() {
        hw.b("PPSLinkedView", "onViewShowStartRecord");
        LinkedSplashAd linkedSplashAd = this.l;
        if (linkedSplashAd == null || !this.aj) {
            return;
        }
        hw.a("PPSLinkedView", "ad.getMinEffectiveShowTime: %s. ", Long.valueOf(linkedSplashAd.getMinEffectiveShowTime()));
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.1
            @Override // java.lang.Runnable
            public void run() {
                PPSLinkedView pPSLinkedView;
                Long lValueOf;
                Integer numValueOf;
                int i;
                LinkedSplashAd linkedSplashAd2 = PPSLinkedView.this.l;
                if (linkedSplashAd2 == null) {
                    return;
                }
                if (PPSLinkedView.this.ad == 2) {
                    pPSLinkedView = PPSLinkedView.this;
                    lValueOf = Long.valueOf(linkedSplashAd2.getMinEffectiveShowTime());
                    numValueOf = Integer.valueOf(PPSLinkedView.this.k.d());
                    i = 9;
                } else {
                    pPSLinkedView = PPSLinkedView.this;
                    lValueOf = Long.valueOf(linkedSplashAd2.getMinEffectiveShowTime());
                    numValueOf = Integer.valueOf(PPSLinkedView.this.k.d());
                    i = 8;
                }
                pPSLinkedView.a(lValueOf, numValueOf, Integer.valueOf(i), false);
            }
        }, this.f21249b, linkedSplashAd.getMinEffectiveShowTime());
    }

    private boolean z() {
        if (this.l == null || !this.l.isFromExsplash() || this.h == null) {
            return true;
        }
        if (this.al == null) {
            this.al = HiAd.a(this.g).g();
            this.l.setListener(this.al);
        }
        Long lBV = this.h.bV();
        long jLongValue = lBV.longValue();
        int iBW = this.h.bW();
        long jBX = this.h.bX();
        long j = iBW;
        long j2 = jLongValue + j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String contentId = this.l.getContentId();
        String slotId = this.l.getSlotId();
        hw.a("PPSLinkedView", "ExSplashPreCheck, sloganStartTime:%s, sloganShowTime:%s, redundancyTime:%s", lBV, Integer.valueOf(iBW), Long.valueOf(jBX));
        hw.a("PPSLinkedView", "ExSplashPreCheck, thresholdTime:%s, currentTime: %s", Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
        if (HiAd.getInstance(this.g).isEnableUserInfo() && jCurrentTimeMillis <= j2) {
            return true;
        }
        hw.c("PPSLinkedView", "ExSplashPreCheck, unable user info or over time");
        na.a(this.g).a(RTCMethods.SHOW_SPLASH, null, null, null);
        this.aD.a(this.aC, 1, slotId, contentId, (jCurrentTimeMillis - jLongValue) - j);
        i();
        I();
        unregister();
        return false;
    }

    private void y() {
        if (this.D != null) {
            this.D.setLinkedOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        hw.b("PPSLinkedView", "onTouch: begin to scale");
                        PPSLinkedView.this.D.setVisibility(4);
                        PPSLinkedView.this.p();
                        PPSLinkedView.this.ax = 1;
                        PPSLinkedView.this.j();
                    }
                    return true;
                }
            });
        }
    }

    private boolean x() {
        String str;
        if (getResources().getConfiguration().orientation != 1) {
            str = "orientation not portrait. ";
        } else if (!this.am) {
            str = "not register linkedSplashAd and destview. ";
        } else if (this.l == null || this.o == null) {
            str = "videoInfo is null. ";
        } else {
            if (this.C != null && this.v != null && this.y != null) {
                return false;
            }
            str = "splash view not ready. ";
        }
        a(str);
        return true;
    }

    private void w() {
        this.ao = true;
        if (this.m == null && this.B != null && this.B.getAdMediator() != null) {
            hw.b("PPSLinkedView", "set mediator.");
            this.m = this.B.getAdMediator();
        }
        if (this.l == null || !this.l.isFromExsplash()) {
            return;
        }
        this.I = HiAd.a(this.g).h();
        this.M = HiAd.a(this.g).i();
        this.al = HiAd.a(this.g).g();
        this.l.setListener(this.al);
    }

    private void v() {
        this.aW = false;
        this.ad = 1;
        this.ae = (((double) this.o.d()) < -1.0E-7d || ((double) this.o.d()) > 1.0E-7d) ? (int) (this.o.d() * 1000.0f) : IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW;
        this.G = new j.d(this.ae, 1000L);
        C();
        if (!z()) {
            hw.c("PPSLinkedView", "exsplash unable user info or over time, can't start now");
            return;
        }
        this.C.addView(this.v, b(this.g));
        this.aS = new WeakReference<>(getContext());
        a(this.g);
        a(this.l, this.h.aT());
        y();
        b(false);
    }

    private void u() {
        if (this.x == null) {
            return;
        }
        this.e.a(this.x.h());
        MediaPlayerAgent mediaPlayerAgentK = this.e.k();
        if (mediaPlayerAgentK == null) {
            return;
        }
        mediaPlayerAgentK.a(this.aY);
        mediaPlayerAgentK.addMediaStateListener(this.ba);
        mediaPlayerAgentK.addMediaErrorListener(this.bg);
        mediaPlayerAgentK.addMediaInfoListener(this.bb);
        mediaPlayerAgentK.addMuteListener(this.bh);
        mediaPlayerAgentK.addMediaBufferListener(this.bi);
        mediaPlayerAgentK.addReportVideoTimeListenersSet(this.aZ);
    }

    private void t() {
        this.aI = this.v.getProView();
        this.aJ = this.v.getSwipeView();
        this.aK = this.v.getTwistView();
        this.aU = this.v.getSwipeClickView();
        this.aV = this.v.getTwistClickView();
    }

    private void setSplashViewClickable(aj ajVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ajVar);
        a(arrayList);
    }

    private void setSkipBtnDelayTime(ContentRecord contentRecord) {
        if (contentRecord == null || contentRecord.av() <= 0) {
            return;
        }
        this.aH = contentRecord.av();
    }

    private void setDestViewClickable(PPSDestView pPSDestView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pPSDestView);
        a(arrayList);
    }

    private void s() {
        this.x = new h(this.g);
        this.x.a(this.y);
        this.x.a(this.e.f());
    }

    private void r() {
        this.i = this.v.getPpswlsView();
        this.j = this.v.getPpsSplashAdSourceView();
    }

    private RelativeLayout.LayoutParams getDestViewParam() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        return layoutParams;
    }

    private boolean e(int i) {
        if (2 != i && 3 != i) {
            return false;
        }
        if (this.h.bf()) {
            return !com.huawei.openalliance.ad.utils.ab.l(getContext().getApplicationContext());
        }
        return true;
    }

    private void e(ContentRecord contentRecord) {
        if (contentRecord == null || this.e.f() == null) {
            return;
        }
        hw.b("PPSLinkedView", "initOmsdkResource");
        this.d.a(this, contentRecord, this.z, this.g, this.v);
    }

    private void d(int i) {
        String strAi;
        String strN;
        if (this.aE != null) {
            ContentRecord contentRecordA = ph.a(this.l);
            if (contentRecordA != null) {
                strAi = contentRecordA.ai();
                strN = contentRecordA.n();
            } else {
                strAi = null;
                strN = null;
            }
            this.aE.a(i, new com.huawei.openalliance.ad.analysis.a(strAi, strN, 1), (String) null, contentRecordA);
        }
    }

    private String d(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.k();
        }
        return null;
    }

    private Integer d(ContentRecord contentRecord) {
        int iN = pa.n(contentRecord.X());
        if (iN == 0) {
            return null;
        }
        int iC = c(contentRecord);
        hw.b("PPSLinkedView", "initial mode: %s", Integer.valueOf(iC));
        if (iC == 0) {
            return Integer.valueOf(iC);
        }
        Map<String, String> mapA = bk.a(this.h.cv());
        if (mapA != null) {
            if ((2 == iC || 3 == iC) && a(dg.k(mapA.get(Constants.TWIST_TYPE)))) {
                iC = 4;
            }
            if ((1 == iC || 4 == iC) && a(dg.k(mapA.get(Constants.SWIPE_TYPE)))) {
                return 0;
            }
        }
        if (1 != getResources().getConfiguration().orientation || 2 != iN) {
            return 0;
        }
        if (!e(iC)) {
            return Integer.valueOf(iC);
        }
        hw.b("PPSLinkedView", "can't use twist, enable : %s", Boolean.valueOf(this.h.bf()));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        hw.b("PPSLinkedView", "moveLinkedView");
        if (F() && !this.aj) {
            I();
            if (this.q != null) {
                this.q.onSwitch(this.ax);
            }
            if (z) {
                J();
            }
            this.aj = true;
        }
    }

    private void c(int i) {
        if (this.al != null) {
            this.al.onAdFailedToLoad(i);
        }
        d(i);
    }

    private String c(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.j();
        }
        return null;
    }

    private int c(ContentRecord contentRecord) {
        return (contentRecord.aL() == null || contentRecord.aL().a() == null) ? this.h.F() : contentRecord.aL().a().intValue();
    }

    private void b(boolean z) {
        hw.b("PPSLinkedView", "start play. ");
        this.e.a(this.ay);
        if (z) {
            this.aW = true;
            P();
        }
        if (this.G != null) {
            hw.b("PPSLinkedView", "start count down. ");
            this.G.start();
        }
    }

    private void b(LinkedSplashAd linkedSplashAd) {
        hw.b("PPSLinkedView", "LinkedSplashAd:%s, isChinaRom:%s", linkedSplashAd, Boolean.valueOf(this.aB));
        if (linkedSplashAd != null) {
            Integer numD = d(linkedSplashAd.P());
            InteractCfg interactCfgAL = linkedSplashAd.P().aL();
            Integer numF = interactCfgAL == null ? null : interactCfgAL.f();
            if (this.aB) {
                this.j.a(this, numD, numF, as.a(true, linkedSplashAd.isTransparencyOpen(), linkedSplashAd.getTransparencyTplUrl()));
                this.j.setVisibility(0);
                this.j.a(linkedSplashAd.P(), false, this.U, 1, false);
                return;
            }
            this.i.setPpsLinkedView(this);
            this.i.a(numD, numF);
            this.i.setVisibility(0);
            this.i.a(linkedSplashAd.P(), false, this.U, 1, false);
            if (bm.a(linkedSplashAd.Q())) {
                return;
            }
            this.i.setChoiceViewOnClickListener(new j.a(this, linkedSplashAd.P()));
        }
    }

    private void b(int i) {
        int i2;
        if (i == 1) {
            i2 = 12;
        } else if (i != 2) {
            return;
        } else {
            i2 = 13;
        }
        a(Integer.valueOf(i2), true);
    }

    private String b(ContentRecord contentRecord) {
        String strA = com.huawei.openalliance.ad.utils.c.a(getContext(), contentRecord, 0);
        if (TextUtils.isEmpty(strA)) {
            return !TextUtils.isEmpty(this.h.G()) ? this.h.G() : contentRecord.az();
        }
        return strA;
    }

    private String b(InteractCfg interactCfg, String str) {
        if (TextUtils.isEmpty(str)) {
            return (interactCfg == null || interactCfg.l() == null) ? this.h.K() : interactCfg.l();
        }
        return str;
    }

    private String b(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.i();
        }
        return null;
    }

    private WindowManager.LayoutParams b(Context context) {
        String str;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.flags = 134218760;
        layoutParams.format = 1;
        try {
            if (Build.VERSION.SDK_INT >= 28 && dk.i(context)) {
                hw.a("PPSLinkedView", " isNotchEnable");
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            ce.a(this.g).a(layoutParams);
            return layoutParams;
        } catch (NoSuchMethodError unused) {
            str = "initOnApplyWindowInsets NoSuchMethodError setDisplaySideMode";
            hw.c("PPSLinkedView", str);
            return layoutParams;
        } catch (Throwable th) {
            str = "initOnApplyWindowInsets error:" + th.getClass().getSimpleName();
            hw.c("PPSLinkedView", str);
            return layoutParams;
        }
    }

    private void aa() {
        if (this.D != null) {
            hw.a("PPSLinkedView", "%d delay, skip btn show", Integer.valueOf(this.aH));
            if (this.aH > 0) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PPSLinkedView.this.D != null) {
                            hw.a("PPSLinkedView", "skip btn show");
                            PPSLinkedView.this.D.setVisibility(0);
                        }
                    }
                }, this.f21250c, this.aH);
            } else {
                hw.a("PPSLinkedView", "skip btn show");
                this.D.setVisibility(0);
            }
        }
    }

    private boolean a(Long l) {
        return fp.b(getContext()).a(l);
    }

    private void a(boolean z, int i, ContentRecord contentRecord) {
        this.v.setOnClickListener(null);
        InteractCfg interactCfgAL = contentRecord.aL();
        String strA = com.huawei.openalliance.ad.utils.c.a(getContext(), contentRecord, i);
        if (1 == i) {
            if (this.aJ == null) {
                return;
            }
            this.aJ.setVisibility(4);
            this.aJ.a(a(interactCfgAL), a(interactCfgAL, strA));
            this.aJ.setShowLogo(z);
            this.aJ.setVisibility(0);
            this.v.setOnTouchListener(this.bd);
            return;
        }
        if (2 == i) {
            if (this.aK == null) {
                return;
            }
            this.aK.setVisibility(4);
            this.aK.a(b(interactCfgAL), b(interactCfgAL, strA));
            this.aK.setShowLogo(z);
            this.aK.setVisibility(0);
            this.v.setOnTouchListener(f21248a);
            R();
            S();
            return;
        }
        if (3 != i) {
            if (4 != i || this.aU == null) {
                return;
            }
            this.aU.setVisibility(4);
            this.aU.a(c(interactCfgAL), a(interactCfgAL, strA));
            this.aU.setShowLogo(z);
            this.aU.setVisibility(0);
            this.v.setOnTouchListener(this.bd);
            this.aU.getClickAreaView().setOnTouchListener(this.be);
            return;
        }
        if (this.aV == null) {
            return;
        }
        this.aV.setVisibility(4);
        this.aV.a(d(interactCfgAL), b(interactCfgAL, strA));
        this.aV.setShowLogo(z);
        this.aV.setVisibility(0);
        this.v.setOnTouchListener(f21248a);
        this.aV.getClickAreaView().setOnTouchListener(this.be);
        R();
        S();
    }

    private void a(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof NativeVideoView) {
                ((NativeVideoView) view).setCoverClickListener(this.bc);
            } else if (view != null) {
                view.setOnClickListener(this.bc);
            }
        }
    }

    private void a(String str) {
        hw.c("PPSLinkedView", str);
        A();
        i();
        unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Long l, Integer num, Integer num2, boolean z) {
        hw.a("PPSLinkedView", "reportAdShowEvent. ");
        if (this.l == null) {
            return;
        }
        boolean zA = com.huawei.openalliance.ad.utils.c.a(this.l.d(), num2);
        if (!this.l.ad() || (zA && !this.l.b())) {
            if (!this.h.bv()) {
                this.l.h(true);
                this.p.a(null, null, num2);
            } else if (z || l.longValue() >= this.l.getMinEffectiveShowTime()) {
                this.l.h(true);
                hw.a("PPSLinkedView", "report imp. ");
                this.p.a(l, num, num2);
            } else {
                this.aD.a(this.l.P(), l, num);
            }
            if (zA) {
                this.l.a(true);
            }
            this.d.d();
        }
    }

    private void a(LinkedSplashAd linkedSplashAd, int i) {
        float fN;
        int iO;
        String str;
        String str2;
        if (linkedSplashAd != null) {
            String strL = linkedSplashAd.L();
            String strM = linkedSplashAd.M();
            fN = linkedSplashAd.N();
            iO = linkedSplashAd.O();
            setSkipBtnDelayTime(linkedSplashAd.P());
            str = strL;
            str2 = strM;
        } else {
            fN = 0.0f;
            iO = 0;
            str = null;
            str2 = null;
        }
        this.D = a(str, i, str2, false, fN, iO);
        this.D.setId(R.id.hiad_btn_skip);
        this.v.addView(this.D);
        this.D.bringToFront();
        this.D.setVisibility(4);
    }

    private void a(LinkedSplashAd linkedSplashAd) {
        ContentRecord contentRecordP;
        Integer numD;
        if (this.aI == null || linkedSplashAd == null || (contentRecordP = linkedSplashAd.P()) == null) {
            return;
        }
        int iN = pa.n(contentRecordP.X());
        int iT = pa.t(contentRecordP.X());
        hw.b("PPSLinkedView", "set splashpro mode:" + iN);
        if (iN == 0 || (numD = d(contentRecordP)) == null) {
            this.aI.setVisibility(8);
        } else if (numD.intValue() == 0) {
            a(contentRecordP, iT);
        } else {
            a(contentRecordP);
            a(false, numD.intValue(), contentRecordP);
        }
        this.aI.setMode(iN);
    }

    private void a(ILinkedSplashAd iLinkedSplashAd) {
        this.y = this.v.getLinkedVideoView();
        if (iLinkedSplashAd.getVideoInfo() != null) {
            this.y.setVideoRatio(iLinkedSplashAd.getVideoInfo().getVideoRatio());
        }
    }

    private void a(ContentRecord contentRecord, int i) {
        Q();
        this.aI.setVisibility(4);
        this.aI.setDesc(b(contentRecord));
        this.aI.a(false, i);
        if (i != 0) {
            this.aI.setVisibility(0);
        }
        this.v.setOnTouchListener(this.bf);
    }

    private void a(ContentRecord contentRecord) {
        int iIntValue;
        this.aP = fp.b(getContext()).J();
        if (contentRecord.aL() != null) {
            InteractCfg interactCfgAL = contentRecord.aL();
            if (this.aP <= 0 && interactCfgAL.b() != null && interactCfgAL.b().intValue() > 0) {
                this.aP = interactCfgAL.b().intValue();
            }
            this.aR = interactCfgAL.c() != null ? interactCfgAL.c().intValue() : fp.b(getContext()).M();
            this.aQ = interactCfgAL.d() != null ? interactCfgAL.d().intValue() : fp.b(getContext()).L();
            this.aT = interactCfgAL.g().intValue();
            iIntValue = interactCfgAL.e().intValue();
        } else {
            this.aP = fp.b(getContext()).J();
            this.aR = fp.b(getContext()).M();
            this.aQ = fp.b(getContext()).L();
            iIntValue = 0;
        }
        this.aO = iIntValue;
        this.aP = this.aP <= 0 ? 200 : this.aP;
        hw.a("PPSLinkedView", "origin limit Swipe distance is %s dp", Integer.valueOf(this.aP));
        this.aP = as.a(this.g, this.aP);
        this.aN = this.aQ * 2;
    }

    private String a(InteractCfg interactCfg, String str) {
        if (TextUtils.isEmpty(str)) {
            return (interactCfg == null || interactCfg.l() == null) ? this.h.I() : interactCfg.l();
        }
        return str;
    }

    private String a(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.h();
        }
        return null;
    }

    private w a(String str, int i, String str2, boolean z, float f, int i2) {
        return new w(getContext(), str, 1, 4, i, str2, z, this.U, f, i2, false);
    }

    private void Z() {
        if (this.F && this.E == null) {
            this.E = new ImageView(getContext());
            this.E.setImageResource(R.drawable.hiad_selector_ic_sound_check);
            dk.a(this.E);
            Resources resources = this.g.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hiad_8_dp);
            this.E.setPadding(0, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.hiad_page_margin_side), dimensionPixelSize);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(21);
            layoutParams.rightMargin = resources.getDimensionPixelSize(R.dimen.haid_splash_sound_margin_right);
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.haid_splash_sound_margin_bottom);
            layoutParams.bottomMargin += dk.f(this.g);
            layoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.haid_splash_sound_margin_right));
            this.v.addView(this.E, layoutParams);
            this.E.bringToFront();
            this.E.setSelected(false);
            this.E.setOnClickListener(this.bj);
        }
    }

    private void Y() {
        if (this.A == null || this.A.isEmpty()) {
            return;
        }
        for (View view : this.A) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        setOnClickListener(null);
    }

    private void X() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.A = arrayList;
        a(arrayList);
    }

    private void W() {
        if (!q() || this.l == null || this.l.ao()) {
            return;
        }
        hw.b("PPSLinkedView", " maybe report show start.");
        b();
    }

    private void V() {
        if (this.l != null) {
            this.l.j(false);
        }
        this.l = null;
        this.B = null;
        this.H = null;
        this.L = null;
        if (this.aS != null) {
            this.aS.clear();
        }
        if (this.y != null) {
            this.y.a();
        }
        al alVarF = this.e.f();
        if (alVarF != null) {
            alVarF.destroyView();
        }
        if (this.x != null) {
            this.x.i();
        }
        this.e.b(false);
        Y();
        df.a((IAd) null);
        dq.a(this.f21250c);
        this.d.b();
        com.huawei.openalliance.ad.inter.c.a(this.g).a(false);
    }

    private void U() {
        if (this.w != null) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.7
                @Override // java.lang.Runnable
                public void run() {
                    PPSLinkedView.this.w.cancel();
                }
            });
        }
    }

    private void T() {
        String str;
        try {
            if (this.K == null) {
                this.K = this.J.inflate();
                this.K.setId(R.id.hiad_full_logo_region);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.K.getLayoutParams();
            if (this.U > 0) {
                hw.a("PPSLinkedView", "left:%d, top:%d, right:%d", Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.rightMargin));
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + this.U, layoutParams.rightMargin, layoutParams.bottomMargin);
                this.K.setLayoutParams(layoutParams);
            }
            ImageView imageView = (ImageView) this.K.findViewById(R.id.hiad_full_mode_logo);
            if (this.I > 0) {
                imageView.setImageResource(this.I);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            TextView textView = (TextView) this.K.findViewById(R.id.hiad_media_name);
            if (this.M <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.M);
                textView.setVisibility(0);
            }
        } catch (Resources.NotFoundException unused) {
            str = "showFullModeLogo res not found";
            hw.c("PPSLinkedView", str);
        } catch (Exception e) {
            str = "showFullModeLogo " + e.getClass().getSimpleName();
            hw.c("PPSLinkedView", str);
        }
    }

    private void S() {
        hw.b("PPSLinkedView", "setRotationListener");
        if (this.aL == null) {
            hw.b("PPSLinkedView", " new setRotationListener");
            this.aL = new sb(getContext());
            this.aL.a(new j.c());
            this.aL.a();
        }
    }

    private void R() {
        hw.b("PPSLinkedView", "setAccListener");
        if (this.aM == null) {
            hw.b("PPSLinkedView", "new setAccListener");
            this.aM = new sa(getContext());
            this.aM.a(new j.b());
            this.aM.a();
        }
    }

    private void Q() {
        int iH = this.h.H();
        if (iH > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.aI.getLayoutParams();
            int iA = as.a(this.g, iH);
            this.aI.setPadding(iA, iA, iA, iA);
            if (layoutParams.isMarginRelative()) {
                layoutParams.setMarginStart(layoutParams.leftMargin - iA);
                layoutParams.setMarginEnd(layoutParams.rightMargin - iA);
            } else {
                layoutParams.setMargins(layoutParams.leftMargin - iA, layoutParams.topMargin, layoutParams.rightMargin - iA, layoutParams.bottomMargin);
            }
            this.aI.setLayoutParams(layoutParams);
        }
    }

    private void P() {
        aa();
        Z();
        b(this.l);
        T();
        a(this.l);
    }

    private void O() {
        if (this.G != null) {
            this.G.cancel();
            this.G = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.aL != null) {
            this.aL.b();
        }
        if (this.aM != null) {
            this.aM.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.aM == null && this.aL == null) {
            return;
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.aJ != null) {
            this.aJ.setVisibility(8);
            this.aJ.b();
        }
        if (this.aK != null) {
            this.aK.setVisibility(8);
        }
        if (this.aV != null) {
            this.aV.setVisibility(8);
        }
        if (this.aU != null) {
            this.aU.setVisibility(8);
        }
    }

    private void K() {
        this.av.addListener(new Animator.AnimatorListener() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.6
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                hw.b("PPSLinkedView", "onAnimationStart");
                if (PPSLinkedView.this.aX != null) {
                    PPSLinkedView.this.aX.setVisibility(8);
                }
                if (PPSLinkedView.this.E != null) {
                    PPSLinkedView.this.E.setVisibility(8);
                }
                if (PPSLinkedView.this.D != null) {
                    PPSLinkedView.this.D.setVisibility(8);
                }
                if (PPSLinkedView.this.j != null) {
                    PPSLinkedView.this.j.a();
                    PPSLinkedView.this.j.setVisibility(8);
                }
                if (PPSLinkedView.this.i != null) {
                    PPSLinkedView.this.i.setVisibility(8);
                }
                if (PPSLinkedView.this.K != null) {
                    PPSLinkedView.this.K.setVisibility(8);
                }
                if (PPSLinkedView.this.aI != null) {
                    PPSLinkedView.this.aI.setVisibility(8);
                    PPSLinkedView.this.aI.a();
                }
                PPSLinkedView.this.L();
                if (PPSLinkedView.this.v != null) {
                    PPSLinkedView.this.v.setOnTouchListener(null);
                }
                PPSLinkedView.this.M();
                PPSLinkedView.this.N();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LinkedSurfaceView linkedSurfaceView;
                float fFloatValue;
                float f;
                int i;
                PPSLinkedView pPSLinkedView;
                hw.b("PPSLinkedView", "onAnimationEnd");
                try {
                    if (PPSLinkedView.this.ab > 0 && PPSLinkedView.this.o != null) {
                        hw.b("PPSLinkedView", "onAnimationEnd, VideoRatio = %s", PPSLinkedView.this.o.getVideoRatio());
                        if (PPSLinkedView.this.o.getVideoRatio().floatValue() < 1.0f) {
                            linkedSurfaceView = PPSLinkedView.this.y;
                            fFloatValue = (PPSLinkedView.this.ac * 1.0f) / (PPSLinkedView.this.ab * 1.0f);
                            f = (PPSLinkedView.this.ac * 1.0f) / (PPSLinkedView.this.ab * 1.0f);
                            i = PPSLinkedView.this.ac;
                            pPSLinkedView = PPSLinkedView.this;
                        } else {
                            linkedSurfaceView = PPSLinkedView.this.y;
                            fFloatValue = PPSLinkedView.this.o.getVideoRatio().floatValue();
                            f = (PPSLinkedView.this.ac * 1.0f) / (PPSLinkedView.this.ab * 1.0f);
                            i = PPSLinkedView.this.ac;
                            pPSLinkedView = PPSLinkedView.this;
                        }
                        linkedSurfaceView.a(fFloatValue, f, i, pPSLinkedView.ab);
                    }
                    PPSLinkedView.this.E();
                    PPSLinkedView.this.ad = 2;
                } catch (Throwable th) {
                    hw.b("PPSLinkedView", "onAnimationEnd err: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    private void J() {
        hw.b("PPSLinkedView", "addMonitor");
        this.k = new jl(this, this);
        this.k.h();
        if (this.l != null) {
            this.k.b(this.l.getMinEffectiveShowTime(), this.l.getMinEffectiveShowRatio());
        }
        this.k.a(this.l);
    }

    private void I() {
        hw.b("PPSLinkedView", "removeSplashView");
        if (this.v != null) {
            this.v.setVisibility(8);
            this.v.a();
        }
        if (this.y != null) {
            this.y.a();
            if (this.x != null) {
                this.x.b(this.y);
            }
            this.y = null;
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLinkedView.4
            @Override // java.lang.Runnable
            public void run() {
                if (PPSLinkedView.this.v != null) {
                    if (PPSLinkedView.this.v.isAttachedToWindow()) {
                        PPSLinkedView.this.C.removeView(PPSLinkedView.this.v);
                    }
                    PPSLinkedView.this.v.b();
                    PPSLinkedView.this.v = null;
                }
            }
        }, 20L);
        if (this.aI != null) {
            this.aI.a();
        }
        if (this.aJ != null) {
            this.aJ.b();
        }
        if (this.aM != null || this.aL != null) {
            o();
        }
        if (this.aL != null) {
            this.aL.b();
        }
        if (this.aM != null) {
            this.aM.b();
        }
    }

    private boolean H() {
        al alVarF = this.e.f();
        return alVarF == null || !alVarF.i();
    }

    private boolean G() {
        return this.z == null || this.z.getHeight() == 0 || this.z.getWidth() == 0;
    }

    private boolean F() {
        boolean zG = G();
        boolean zH = H();
        if (!zG && !zH) {
            return true;
        }
        hw.c("PPSLinkedView", "checkDestView, destView change null, linkedAdListener: %s, isMoved:%s. ", dg.b(this.al), Boolean.valueOf(this.aj));
        hw.b("PPSLinkedView", "isDestViewNull:%s, isDestViewNotAvalible:%s", Boolean.valueOf(zG), Boolean.valueOf(zH));
        if (!this.aG) {
            this.aG = true;
            c(-5);
            if (this.al != null) {
                this.al.onAdDismissed();
            }
        }
        if (!this.aj) {
            this.aj = true;
            this.ad = 0;
            this.e.i();
            I();
            Y();
            if (this.q != null) {
                this.q.onSwitch(this.ax);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        hw.b("PPSLinkedView", "switchViewOnAnimationEnd. ");
        c(this.aA);
        if (hw.a()) {
            boolean z = this.aj;
            hw.a("PPSLinkedView", "isMoved: %s, linkedAdListener on switch: %s ", Boolean.valueOf(z), this.al);
        }
        if (this.al == null) {
            hw.c("PPSLinkedView", "linkedAdListener is null. ");
        } else {
            hw.a("PPSLinkedView", "splash show end. ");
            this.al.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
        this.W = displayMetrics.heightPixels;
        this.aa = displayMetrics.widthPixels;
    }

    private void C() {
        this.e.a(this.l.K(), this.o, this.n);
        this.y.setClickable(false);
    }

    private boolean B() {
        String str;
        if (this.m == null && this.B != null && this.B.getAdMediator() != null) {
            hw.b("PPSLinkedView", "set adMediator. ");
            this.m = this.B.getAdMediator();
        }
        if (getResources().getConfiguration().orientation != 1) {
            str = "orientation not portrait. ";
        } else if (!this.am) {
            str = "not register linkedSplashAd and destview. ";
        } else if (this.o == null) {
            str = "videoInfo is null. ";
        } else {
            if (this.v != null && this.y != null) {
                this.ad = 1;
                this.ae = (((double) this.o.d()) < -1.0E-7d || ((double) this.o.d()) > 1.0E-7d) ? (int) (this.o.d() * 1000.0f) : IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW;
                this.G = new j.d(this.ae, 1000L);
                return true;
            }
            str = "splash view not ready. ";
        }
        a(str);
        return false;
    }

    private void A() {
        if (this.l == null || !this.l.isFromExsplash()) {
            return;
        }
        na.a(this.g).a(RTCMethods.SHOW_SPLASH, null, null, null);
        this.aD.a(this.aC, 1, this.l.getSlotId(), this.l.getContentId());
    }

    public PPSLinkedView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PPSLinkedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PPSLinkedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PPSLinkedView(Context context) {
        super(context);
    }
}
