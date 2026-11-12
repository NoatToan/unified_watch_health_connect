package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.uiengine.common.MediaStateApi;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import com.huawei.openalliance.ad.constant.AdLoadState;
import com.huawei.openalliance.ad.constant.ApiNames;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.cr;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.ht;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.HiAdSplash;
import com.huawei.openalliance.ad.inter.IHiAdSplash;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdListener;
import com.huawei.openalliance.ad.inter.listeners.AdShowListener;
import com.huawei.openalliance.ad.jf;
import com.huawei.openalliance.ad.jg;
import com.huawei.openalliance.ad.ji;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.ju;
import com.huawei.openalliance.ad.jv;
import com.huawei.openalliance.ad.jx;
import com.huawei.openalliance.ad.jz;
import com.huawei.openalliance.ad.nj;
import com.huawei.openalliance.ad.oc;
import com.huawei.openalliance.ad.op;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.tc;
import com.huawei.openalliance.ad.ua;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.dc;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class PPSSplashView extends v implements IViewLifeCycle, com.huawei.openalliance.ad.views.interfaces.l {
    private View A;
    private boolean B;
    private long C;
    private int D;
    private final String E;
    private int F;
    private RewardVerifyConfig G;
    private PPSSplashProView H;
    private PPSSplashSwipeView I;
    private PPSSplashTwistView J;
    private PPSSplashSwipeClickView K;
    private PPSSplashTwistClickView L;
    private b M;
    private ContentRecord N;
    private jx O;
    private boolean P;
    private pc Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    af f21037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    RelativeLayout f21038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RelativeLayout f21039c;
    w d;
    protected gk e;
    private AdSlotParam f;
    private View g;
    private int h;
    private PPSWLSView i;
    private PPSSplashAdSourceView j;
    private jj k;
    private op l;
    private AdListener m;
    private AdActionListener n;
    private AdShowListener o;
    private boolean p;
    private int q;
    private View r;
    private com.huawei.openalliance.ad.views.interfaces.n s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    private boolean c(int i) {
        return 2 == i || 3 == i;
    }

    private boolean d(int i) {
        return 1 == i || 4 == i;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public int getAdType() {
        return 1;
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    public void setStartMaxVol(float f) {
    }

    public void startShowAd() {
        ji jiVar;
        hw.b("PPSSplashView", "startShowAd. ");
        jj jjVar = this.k;
        if (jjVar instanceof ji) {
            jiVar = (ji) jjVar;
            if (jiVar.C()) {
                hw.b("PPSSplashView", "startShowAd, adHadShown.");
                return;
            }
        } else {
            jiVar = null;
        }
        ContentRecord contentRecordG = df.g();
        if (contentRecordG == null || TextUtils.isEmpty(contentRecordG.A())) {
            return;
        }
        hw.b("PPSSplashView", "startShowAd, find normal ad. ");
        if (this.k == null) {
            hw.c("PPSSplashView", "startShowAd, adMediator is null, can't show");
            return;
        }
        if (jiVar != null) {
            jiVar.c(true);
        }
        boolean zC = this.k.c(contentRecordG);
        this.k.e(1201);
        if (hw.a()) {
            hw.a("PPSSplashView", "startShowAd, showResult: %s", Boolean.valueOf(zC));
        }
        df.a((ContentRecord) null);
    }

    public void setWideSloganResId(int i) {
        af afVar = this.f21037a;
        if (afVar != null) {
            afVar.setWideSloganResId(i);
        } else {
            this.u = i;
        }
    }

    public void setSloganView(View view) {
        if (view != null) {
            this.A = view;
            view.setVisibility(8);
        }
    }

    public void setSloganResId(int i) {
        if (as.b(getContext())) {
            if (dk.c(getContext())) {
                hw.c("PPSSplashView", "setSloganResId - activity finished, not add view");
                return;
            }
            if (this.f == null) {
                throw new com.huawei.openalliance.ad.exception.b("Must invoke SplashAdView's setAdSlotParam method before invoke setSloganResId method");
            }
            if (this.f21037a == null) {
                af afVar = new af(getContext(), this.f.b(), i, 1);
                this.f21037a = afVar;
                int i2 = this.u;
                if (i2 > 0) {
                    afVar.setWideSloganResId(i2);
                }
                this.f21038b.addView(this.f21037a, new RelativeLayout.LayoutParams(-1, -1));
                this.f21037a.b();
            }
        }
    }

    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        this.G = rewardVerifyConfig;
    }

    public void setMediaNameResId(int i) {
        this.t = i;
    }

    public void setLogoResId(int i) {
        this.q = i;
    }

    public void setLogo(View view, int i) {
        this.g = view;
        view.setVisibility(i);
        this.h = i;
    }

    public void setLogo(View view) {
        setLogo(view, 8);
    }

    public void setLinkedSupportMode(int i) {
        this.z = i;
    }

    public void setAudioFocusType(int i) {
        this.v = i;
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.s;
        if (nVar != null) {
            nVar.setAudioFocusType(i);
        }
    }

    public void setAdSlotParam(AdSlotParam adSlotParam) {
        if (as.b(getContext())) {
            int iA = com.huawei.openalliance.ad.utils.d.a(getContext(), adSlotParam.b());
            int iB = com.huawei.openalliance.ad.utils.d.b(getContext(), adSlotParam.b());
            adSlotParam.b(iA);
            adSlotParam.c(iB);
            adSlotParam.a(this.F);
            adSlotParam.b(Integer.valueOf(this.z));
            adSlotParam.c((Integer) 0);
            boolean zE = HiAd.a(getContext()).e();
            this.P = zE;
            adSlotParam.d(Integer.valueOf((zE && com.huawei.openalliance.ad.utils.d.s(getContext())) ? 0 : 1));
            df.b(!this.P ? 1 : 0);
            this.f = adSlotParam;
            IHiAdSplash hiAdSplash = HiAdSplash.getInstance(getContext());
            if (hiAdSplash instanceof HiAdSplash) {
                ((HiAdSplash) hiAdSplash).a(adSlotParam);
            }
        }
    }

    public void setAdShowListener(AdShowListener adShowListener) {
        this.o = adShowListener;
        jj jjVar = this.k;
        if (jjVar != null) {
            jjVar.a(adShowListener);
        }
    }

    public void setAdListener(AdListener adListener) {
        this.m = adListener;
        this.l.a(adListener);
        jj jjVar = this.k;
        if (jjVar != null) {
            jjVar.a(adListener);
        }
    }

    public void setAdActionListener(AdActionListener adActionListener) {
        this.n = adActionListener;
        jj jjVar = this.k;
        if (jjVar != null) {
            jjVar.a(adActionListener);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        hw.b("PPSSplashView", "resumeView ");
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.s;
        if (nVar != null) {
            nVar.resumeView();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        hw.b("PPSSplashView", "pauseView ");
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.s;
        if (nVar != null) {
            nVar.pauseView();
        }
        PPSSplashProView pPSSplashProView = this.H;
        if (pPSSplashProView != null) {
            pPSSplashProView.a();
        }
        PPSSplashSwipeView pPSSplashSwipeView = this.I;
        if (pPSSplashSwipeView != null) {
            pPSSplashSwipeView.b();
        }
        PPSSplashSwipeClickView pPSSplashSwipeClickView = this.K;
        if (pPSSplashSwipeClickView != null) {
            pPSSplashSwipeClickView.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dc.a(this.E);
        PPSSplashProView pPSSplashProView = this.H;
        if (pPSSplashProView != null) {
            pPSSplashProView.a();
        }
        PPSSplashSwipeView pPSSplashSwipeView = this.I;
        if (pPSSplashSwipeView != null) {
            pPSSplashSwipeView.b();
        }
        PPSSplashSwipeClickView pPSSplashSwipeClickView = this.K;
        if (pPSSplashSwipeClickView != null) {
            pPSSplashSwipeClickView.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.b("PPSSplashView", "onAttachedToWindow");
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        String str;
        hw.b("PPSSplashView", "onApplyWindowInsets, sdk: %s", Integer.valueOf(Build.VERSION.SDK_INT));
        if (dk.b() && windowInsets != null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                List boundingRects = displayCutout.getBoundingRects();
                StringBuilder sb = new StringBuilder("boundingRects:");
                sb.append(boundingRects == null);
                hw.b("PPSSplashView", sb.toString());
                if (!bm.a(boundingRects)) {
                    this.w = ((Rect) boundingRects.get(0)).height();
                }
                this.x = displayCutout.getSafeInsetLeft();
                hw.b("PPSSplashView", "notchHeight left:" + this.x);
                this.y = displayCutout.getSafeInsetRight();
                str = "notchHeight right:" + this.y;
            } else {
                str = "DisplayCutout is null";
            }
            hw.b("PPSSplashView", str);
        }
        if (this.w <= 0 && cc.a(getContext()).a(getContext())) {
            this.w = Math.max(this.w, cc.a(getContext()).a(this));
        }
        hw.b("PPSSplashView", "notchHeight:" + this.w);
        return super.onApplyWindowInsets(windowInsets);
    }

    public void loadAd() {
        AdSlotParam adSlotParam;
        this.C = System.currentTimeMillis();
        hw.b("PPSSplashView", ApiNames.LOAD_AD);
        if (this.l.b()) {
            if (this.l.c() && (adSlotParam = this.f) != null) {
                Integer numR = adSlotParam.r();
                boolean zA = com.huawei.openalliance.ad.inter.c.a(getContext()).a();
                hw.b("PPSSplashView", "startMode: %s, isExSplashStart: %s", numR, Boolean.valueOf(zA));
                if ((numR != null && numR.intValue() == 0) || (numR.intValue() == 1 && zA)) {
                    c();
                    return;
                }
            }
            if (this.f != null) {
                bo.b(getContext().getApplicationContext(), this.f.l());
            }
            this.p = true;
            this.l.a();
        }
    }

    public boolean isLoading() {
        jj jjVar = this.k;
        if (jjVar == null) {
            return this.p;
        }
        return jjVar.b() == AdLoadState.LOADING;
    }

    public boolean isLoaded() {
        jj jjVar = this.k;
        return jjVar != null && jjVar.b() == AdLoadState.LOADED;
    }

    public String getUniqueId() {
        jj jjVar = this.k;
        if (jjVar != null) {
            return jjVar.w();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.v
    protected String getTAG() {
        return "PPSSplashView_" + hashCode();
    }

    public View getSloganView() {
        return this.A;
    }

    public RewardVerifyConfig getRewardVerifyConfig() {
        return this.G;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public MediaStateApi getMediaProxy() {
        if (this.O instanceof jz) {
            return new ju((jz) this.O);
        }
        return null;
    }

    public int getMediaNameResId() {
        return this.t;
    }

    public int getLogoResId() {
        return this.q;
    }

    public View getLogo() {
        return this.g;
    }

    public BiddingInfo getBiddingInfo() {
        jj jjVar = this.k;
        return (jjVar == null || jjVar.x() == null) ? new BiddingInfo() : this.k.x();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public int getAudioFocusType() {
        return this.v;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public AdSlotParam getAdSlotParam() {
        AdSlotParam adSlotParam = this.f;
        if (adSlotParam != null) {
            adSlotParam.d(1);
        }
        return this.f;
    }

    public jj getAdMediator() {
        return this.k;
    }

    public AdListener getAdListener() {
        return this.m;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        hw.b("PPSSplashView", "destroyView ");
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.s;
        if (nVar != null) {
            nVar.destroyView();
        }
        try {
            PPSSplashProView pPSSplashProView = this.H;
            if (pPSSplashProView != null) {
                pPSSplashProView.a();
            }
            com.huawei.openalliance.ad.inter.c.a(getContext().getApplicationContext()).b(this.M);
            com.huawei.openalliance.ad.inter.c.a(getContext().getApplicationContext()).a(false);
            PPSSplashSwipeView pPSSplashSwipeView = this.I;
            if (pPSSplashSwipeView != null) {
                pPSSplashSwipeView.b();
            }
            PPSSplashSwipeClickView pPSSplashSwipeClickView = this.K;
            if (pPSSplashSwipeClickView != null) {
                pPSSplashSwipeClickView.b();
            }
            RelativeLayout relativeLayout = this.f21038b;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable th) {
            hw.b("PPSSplashView", "destroy err: %s", th.getClass().getSimpleName());
        }
        this.p = false;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void b(int i) {
        w wVar = this.d;
        if (wVar != null) {
            wVar.a(i);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void b() {
        af afVar = this.f21037a;
        if (afVar != null) {
            afVar.b();
        }
        View view = this.A;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public Integer b(ContentRecord contentRecord) {
        int iN = pa.n(contentRecord.X());
        if (iN == 0) {
            return null;
        }
        int iC = c(contentRecord);
        hw.b("PPSSplashView", "initial mode: %s", Integer.valueOf(iC));
        if (iC == 0) {
            return Integer.valueOf(iC);
        }
        Map<String, String> mapA = bk.a(fp.b(getContext()).cv());
        int i = 4;
        if (mapA != null) {
            if (c(iC)) {
                boolean zB = dk.B(getContext());
                boolean z = dk.D(getContext()) && dk.C(getContext());
                if (a(dg.k(mapA.get(Constants.TWIST_TYPE))) || !zB || !z) {
                    iC = 4;
                }
            }
            if (d(iC) && a(dg.k(mapA.get(Constants.SWIPE_TYPE)))) {
                return 0;
            }
        }
        if (c(iC)) {
            boolean zB2 = dk.B(getContext());
            boolean z2 = dk.D(getContext()) && dk.C(getContext());
            if (zB2 && z2) {
                i = iC;
            }
        } else {
            i = iC;
        }
        if (1 != this.f.b() || 2 != iN) {
            hw.b("PPSSplashView", "proMode: %s", Integer.valueOf(iN));
        } else {
            if (!c(i) || !d()) {
                return Integer.valueOf(i);
            }
            hw.b("PPSSplashView", "can't use twist, enable : %s", Boolean.valueOf(this.e.bf()));
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(com.huawei.openalliance.ad.views.interfaces.n nVar, ContentRecord contentRecord) {
        Integer numB = b(contentRecord);
        if (dk.c(getContext())) {
            hw.c("PPSSplashView", "showAdView - activity finished, not add view");
            return;
        }
        if (nVar == 0 || !(nVar instanceof View)) {
            return;
        }
        View view = (View) nVar;
        this.s = nVar;
        a(false, view, contentRecord);
        hw.b("PPSSplashView", "showAdView %s,", contentRecord.toString());
        ViewParent parent = view.getParent();
        if (parent == this.f21038b) {
            view.setVisibility(0);
            return;
        }
        if (parent != null && (parent instanceof ViewGroup)) {
            hw.b("PPSSplashView", "showAdView, remove adView.");
            ((ViewGroup) parent).removeView(view);
        } else if (parent != null) {
            return;
        }
        this.f21038b.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        view.setVisibility(0);
        nVar.setAudioFocusType(this.v);
        hw.b("PPSSplashView", "set splashpro view to adview");
        if (numB != null && numB.intValue() == 4) {
            nVar.a(this.K.getClickAreaView(), numB);
        } else if (numB == null || numB.intValue() != 3) {
            nVar.a(this.H, numB);
        } else {
            nVar.a(this.L.getClickAreaView(), numB);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(ht htVar) {
        View view = this.g;
        if (view != null) {
            view.setVisibility(this.h);
        }
        View view2 = this.A;
        if (view2 != null) {
            view2.setVisibility(0);
            new nj(this.e, htVar).a();
            return;
        }
        af afVar = this.f21037a;
        if (afVar != null) {
            afVar.setSloganShowListener(htVar);
            this.f21037a.a();
            return;
        }
        hw.b("PPSSplashView", "create default slogan");
        setSloganResId(R.drawable.hiad_default_slogan);
        af afVar2 = this.f21037a;
        if (afVar2 != null) {
            afVar2.setSloganShowListener(htVar);
            this.f21037a.a();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(ContentRecord contentRecord, int i) {
        this.N = contentRecord;
        setSkipBtnDelayTime(contentRecord);
        if (this.d == null) {
            b(contentRecord, i);
        }
        w wVar = this.d;
        if (wVar != null) {
            com.huawei.openalliance.ad.views.interfaces.n nVar = this.s;
            if (nVar != null) {
                wVar.setShowLeftTime(nVar.e());
            }
            if (contentRecord != null && contentRecord.F() == 9) {
                com.huawei.openalliance.ad.views.interfaces.n nVar2 = this.s;
                if (nVar2 instanceof x) {
                    this.d.a((int) Math.ceil((((x) nVar2).getSplashDuration() * 1.0f) / 1000.0f));
                }
            }
            k();
        }
        e(contentRecord);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(ContentRecord contentRecord) {
        super.setAdData(contentRecord);
        super.j();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(AdLoadMode adLoadMode) {
        jf jfVarA = jg.a(adLoadMode, this);
        this.k = jfVarA;
        jfVarA.a(this.m);
        this.k.a(this.n);
        this.k.a(this.o);
        this.k.a(this.z);
        this.k.b(this.C);
        this.k.a(this.G);
        this.k.A();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(View view, ContentRecord contentRecord) {
        hw.b("PPSSplashView", "showTemplateView");
        if (dk.c(getContext())) {
            hw.c("PPSSplashView", "showAdView - activity finished, not add view");
            return;
        }
        a(true, view, contentRecord);
        this.f21038b.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        view.setVisibility(0);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(int i, boolean z) {
        View view = this.g;
        if (view == null) {
            return;
        }
        if (1 == i) {
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
        if (z) {
            f();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(int i, int i2, String str, boolean z, Integer num) {
        if (this.H == null) {
            return;
        }
        hw.b("PPSSplashView", "set splashpro mode: %d", Integer.valueOf(i));
        hw.b("PPSSplashView", "interactCfg = %s", num);
        if (num == null) {
            this.H.setVisibility(8);
        } else if (num.intValue() == 0) {
            a(i2, str, z);
        } else {
            a(z, num.intValue());
        }
        this.H.setMode(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a() {
        jx jxVar = this.O;
        if (jxVar != null) {
            jxVar.b();
            this.O = null;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public com.huawei.openalliance.ad.views.interfaces.n a(int i) {
        if (i == 2) {
            return new r(getContext(), 1);
        }
        if (i != 9) {
            return null;
        }
        Context context = getContext();
        int iB = this.f.b();
        int i2 = this.y;
        if (i2 <= 0) {
            i2 = 0;
        }
        return new x(context, iB, i2, this.f.d(), 1);
    }

    private void setSkipBtnDelayTime(ContentRecord contentRecord) {
        if (contentRecord == null || contentRecord.av() <= 0) {
            return;
        }
        this.D = contentRecord.av();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!this.p || this.f == null) {
            return;
        }
        hw.b("PPSSplashView", " exsplash start, dismiss");
        c();
    }

    private void k() {
        if (this.d != null) {
            hw.a("PPSSplashView", "%d delay, skip btn show", Integer.valueOf(this.D));
            if (this.D > 0) {
                dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PPSSplashView.this.d != null) {
                            hw.a("PPSSplashView", "skip btn show");
                            PPSSplashView.this.d.setVisibility(0);
                        }
                    }
                }, this.E, this.D);
            } else {
                hw.a("PPSSplashView", "skip btn show");
                this.d.setVisibility(0);
            }
        }
    }

    private void i() {
        Context applicationContext = getContext().getApplicationContext();
        cr crVarA = cc.a(applicationContext);
        boolean zA = crVarA.a(applicationContext);
        if (this.w <= 0) {
            this.w = zA ? crVarA.a(this) : as.h(getContext().getApplicationContext());
        }
    }

    private void h() {
        int i;
        ImageView imageView = (ImageView) this.r.findViewById(R.id.hiad_full_mode_logo);
        int i2 = this.q;
        if (i2 > 0) {
            imageView.setImageResource(i2);
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    private void g() {
        int i;
        TextView textView = (TextView) this.r.findViewById(R.id.hiad_media_name);
        int i2 = this.t;
        if (i2 > 0) {
            textView.setText(i2);
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    private void f() {
        String str;
        try {
            if (this.r == null) {
                View viewInflate = ((ViewStub) findViewById(R.id.hiad_logo_stub)).inflate();
                this.r = viewInflate;
                viewInflate.setId(R.id.hiad_full_logo_region);
            }
            a((RelativeLayout.LayoutParams) this.r.getLayoutParams());
            h();
            g();
        } catch (Resources.NotFoundException unused) {
            str = "showFullModeLogo res not found";
            hw.c("PPSSplashView", str);
        } catch (Exception e) {
            str = "showFullModeLogo " + e.getClass().getSimpleName();
            hw.c("PPSSplashView", str);
        }
    }

    private void e(ContentRecord contentRecord) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        PPSWLSView pPSWLSView;
        if (contentRecord != null) {
            int iB = this.f.b();
            Integer numB = b(contentRecord);
            InteractCfg interactCfgAL = contentRecord.aL();
            Integer numF = interactCfgAL == null ? null : interactCfgAL.f();
            i();
            boolean z4 = false;
            if (this.B) {
                this.j.a(this, numB, numF, as.a(true, contentRecord.bf(), contentRecord.be()));
                this.j.setVisibility(0);
                if (1 == iB) {
                    this.j.a(contentRecord, contentRecord.q() == 1, this.w, iB, false);
                    return;
                }
                hw.b("PPSSplashView", "showAdLabel, orientation: %s, leftNotchHeight: %s, rightNotchHeight: %s", Integer.valueOf(iB), Integer.valueOf(this.x), Integer.valueOf(this.y));
                int i3 = this.x;
                if (i3 > 0) {
                    i = i3;
                    z = true;
                } else {
                    i = this.y;
                    z = false;
                }
                this.j.a(contentRecord, contentRecord.q() == 1, i, iB, z);
                return;
            }
            this.i.setAdMediator(this.k);
            this.i.a(numB, numF);
            this.i.setVisibility(0);
            if (1 == iB) {
                PPSWLSView pPSWLSView2 = this.i;
                boolean z5 = contentRecord.q() == 1;
                i2 = this.w;
                z3 = z5;
                pPSWLSView = pPSWLSView2;
            } else {
                hw.b("PPSSplashView", "showAdLabel, orientation: %s, leftNotchHeight: %s, rightNotchHeight: %s", Integer.valueOf(iB), Integer.valueOf(this.x), Integer.valueOf(this.y));
                int i4 = this.x;
                if (i4 > 0) {
                    z2 = true;
                } else {
                    i4 = this.y;
                    z2 = false;
                }
                PPSWLSView pPSWLSView3 = this.i;
                i2 = i4;
                if (contentRecord.q() == 1) {
                    z4 = z2;
                    pPSWLSView = pPSWLSView3;
                    z3 = true;
                } else {
                    z3 = false;
                    z4 = z2;
                    pPSWLSView = pPSWLSView3;
                }
            }
            pPSWLSView.a(contentRecord, z3, i2, iB, z4);
            if (bm.a(contentRecord.aU())) {
                return;
            }
            this.i.setChoiceViewOnClickListener(new a(this, contentRecord));
        }
    }

    private void e() {
        int iH = this.e.H();
        if (iH > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
            int iA = as.a(getContext(), iH);
            this.H.setPadding(iA, iA, iA, iA);
            if (layoutParams.isMarginRelative()) {
                layoutParams.setMarginStart(layoutParams.leftMargin - iA);
                layoutParams.setMarginEnd(layoutParams.rightMargin - iA);
            } else {
                layoutParams.setMargins(layoutParams.leftMargin - iA, layoutParams.topMargin, layoutParams.rightMargin - iA, layoutParams.bottomMargin);
            }
            this.H.setLayoutParams(layoutParams);
        }
    }

    private boolean d(ContentRecord contentRecord) {
        if (contentRecord.aQ() == 2 && contentRecord.T() != null) {
            return false;
        }
        if (contentRecord.aQ() != 3 || bm.a(contentRecord.aY())) {
            return true;
        }
        Iterator<Asset> it = contentRecord.aY().iterator();
        while (it.hasNext()) {
            if (it.next().e() != null) {
                return false;
            }
        }
        return true;
    }

    private boolean d() {
        if (this.e.bf()) {
            return !com.huawei.openalliance.ad.utils.ab.l(getContext().getApplicationContext());
        }
        return true;
    }

    private String d(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.k();
        }
        return null;
    }

    private void c() {
        List<String> listA = this.f.a();
        this.l.a(!bm.a(listA) ? listA.get(0) : null, 1);
        this.l.h();
        jx jxVar = this.O;
        if (jxVar != null) {
            jxVar.b();
        }
        com.huawei.openalliance.ad.inter.c.a(getContext().getApplicationContext()).a(false);
    }

    private String c(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.j();
        }
        return null;
    }

    private int c(ContentRecord contentRecord) {
        return (contentRecord.aL() == null || contentRecord.aL().a() == null) ? this.e.F() : contentRecord.aL().a().intValue();
    }

    private void b(ContentRecord contentRecord, int i) {
        float fAk;
        boolean z;
        int iAl;
        String str;
        String str2;
        if (dk.c(getContext())) {
            hw.c("PPSSplashView", "addSkipAdButton - activity finished, not add view");
            return;
        }
        if (contentRecord != null) {
            boolean z2 = contentRecord.q() == 1;
            String strG = contentRecord.g();
            String strN = contentRecord.N();
            fAk = contentRecord.ak();
            iAl = contentRecord.al();
            z = z2;
            str = strG;
            str2 = strN;
        } else {
            fAk = 0.0f;
            z = false;
            iAl = 0;
            str = null;
            str2 = null;
        }
        w wVarA = a(str, i, str2, z, fAk, iAl);
        this.d = wVarA;
        wVarA.setId(R.id.hiad_btn_skip);
        addView(this.d);
        this.d.setVisibility(4);
    }

    private void b(Context context) {
        inflate(context, R.layout.hiad_view_splash_ad, this);
        this.f21038b = (RelativeLayout) findViewById(R.id.rl_splash_container);
        this.f21039c = (RelativeLayout) findViewById(R.id.ar_install_container);
        this.i = (PPSWLSView) findViewById(R.id.splash_wls_view);
        this.j = (PPSSplashAdSourceView) findViewById(R.id.splash_ad_source_view);
        this.B = cc.a(context).d();
        this.H = (PPSSplashProView) findViewById(R.id.hiad_splash_pro_view);
        this.I = (PPSSplashSwipeView) findViewById(R.id.hiad_splash_swipe_view);
        this.J = (PPSSplashTwistView) findViewById(R.id.hiad_splash_twist_view);
        this.L = (PPSSplashTwistClickView) findViewById(R.id.hiad_splash_twist_click_view);
        this.K = (PPSSplashSwipeClickView) findViewById(R.id.hiad_splash_swipe_click_view);
    }

    private String b(InteractCfg interactCfg, String str) {
        if (TextUtils.isEmpty(str)) {
            return (interactCfg == null || interactCfg.l() == null) ? this.e.I() : interactCfg.l();
        }
        return str;
    }

    private String b(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.i();
        }
        return null;
    }

    private boolean a(Long l) {
        return fp.b(getContext()).a(l);
    }

    private void a(boolean z, View view, ContentRecord contentRecord) {
        if (contentRecord == null) {
            hw.b("PPSSplashView", "getMonitor, contentRecord is null.");
            return;
        }
        hw.b("PPSSplashView", "getMonitor, sdkMonitor is %s", Integer.valueOf(contentRecord.b()));
        this.Q.a(contentRecord.b());
        this.Q.a(contentRecord);
        jx jxVarA = jv.a(getContext(), d(contentRecord), this.Q, contentRecord, z);
        this.O = jxVarA;
        jxVarA.a(this);
        if (view instanceof x) {
            this.O.a(((x) view).getVideoView());
        }
        jv.a(contentRecord.o(), this.O);
    }

    private void a(boolean z, int i) {
        PPSSplashSwipeClickView pPSSplashSwipeClickView;
        hw.b("PPSSplashView", "showNewStyle, cfg= %s", Integer.valueOf(i));
        String strA = com.huawei.openalliance.ad.utils.c.a(getContext(), this.N, i);
        ContentRecord contentRecord = this.N;
        InteractCfg interactCfgAL = contentRecord != null ? contentRecord.aL() : null;
        if (1 == i) {
            PPSSplashSwipeView pPSSplashSwipeView = this.I;
            if (pPSSplashSwipeView == null) {
                return;
            }
            pPSSplashSwipeView.setVisibility(4);
            this.I.a(a(interactCfgAL), b(interactCfgAL, strA));
            this.I.setOrientation(this.f.b());
            this.I.setShowLogo(z);
            this.I.setVisibility(0);
            return;
        }
        if (2 == i) {
            PPSSplashTwistView pPSSplashTwistView = this.J;
            if (pPSSplashTwistView == null) {
                return;
            }
            pPSSplashTwistView.setVisibility(4);
            this.J.a(b(interactCfgAL), a(interactCfgAL, strA));
            this.J.setOrientation(this.f.b());
            this.J.setShowLogo(z);
            this.J.setVisibility(0);
            return;
        }
        if (3 == i) {
            PPSSplashTwistClickView pPSSplashTwistClickView = this.L;
            if (pPSSplashTwistClickView == null) {
                return;
            }
            pPSSplashTwistClickView.setVisibility(4);
            this.L.a(d(interactCfgAL), a(interactCfgAL, strA));
            this.L.setOrientation(this.f.b());
            this.L.setShowLogo(z);
            this.L.setVisibility(0);
            return;
        }
        if (4 != i || (pPSSplashSwipeClickView = this.K) == null) {
            return;
        }
        pPSSplashSwipeClickView.setVisibility(4);
        this.K.a(c(interactCfgAL), b(interactCfgAL, strA));
        this.K.setOrientation(this.f.b());
        this.K.setShowLogo(z);
        this.K.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ContentRecord contentRecord, int[] iArr, int[] iArr2) {
        if (as.a(iArr, 2) && as.a(iArr2, 2) && contentRecord != null) {
            if (hw.a()) {
                hw.a("PPSSplashView", "addComplianceDialog, loc: %s, %s", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                hw.a("PPSSplashView", "addComplianceDialog, size: %s, %s", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
            }
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            ua uaVar = new ua(getContext(), iArr, iArr2);
            addView(uaVar, layoutParams);
            contentRecord.u(dg.e(contentRecord.ab()));
            uaVar.setScreenHeight(getMeasuredHeight());
            uaVar.setScreenWidth(getMeasuredWidth());
            uaVar.setAdContent(contentRecord);
        }
    }

    private void a(RelativeLayout.LayoutParams layoutParams) {
        int iF;
        int iF2;
        if (1 == this.f.b()) {
            i();
            int iA = as.a(getContext(), 24.0f);
            hw.a("PPSSplashView", "left:" + layoutParams.leftMargin + ", top:" + layoutParams.topMargin + ", right:" + layoutParams.rightMargin);
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + iA, layoutParams.rightMargin, layoutParams.bottomMargin);
        } else {
            hw.b("PPSSplashView", "showFullModeLogo, orientation: %s, leftNotchHeight: %s", Integer.valueOf(this.f.b()), Integer.valueOf(this.x));
            hw.a("PPSSplashView", "left:%d, top:%d, right:%d, leftNotchHeight:%d", Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.rightMargin), Integer.valueOf(this.x));
            if (!cc.b(getContext()) || this.x <= 0) {
                if (!cc.b(getContext()) || (cc.b(getContext()) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 && !com.huawei.openalliance.ad.utils.ab.n(getContext()))) {
                    if (layoutParams.isMarginRelative()) {
                        iF2 = dk.f(getContext());
                        layoutParams.setMarginStart(iF2);
                        this.r.setLayoutParams(layoutParams);
                    } else {
                        iF = dk.f(getContext());
                        layoutParams.setMargins(iF, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                        this.r.setLayoutParams(layoutParams);
                    }
                }
            } else if (layoutParams.isMarginRelative()) {
                iF2 = layoutParams.leftMargin + this.x;
                layoutParams.setMarginStart(iF2);
                this.r.setLayoutParams(layoutParams);
            } else {
                iF = layoutParams.leftMargin + this.x;
                layoutParams.setMargins(iF, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                this.r.setLayoutParams(layoutParams);
            }
            layoutParams.topMargin += as.a(getContext(), 12.0f);
        }
        this.r.setLayoutParams(layoutParams);
    }

    private void a(Context context) {
        b(context);
        this.l = new oc(context.getApplicationContext(), this);
        this.e = fp.b(context.getApplicationContext());
        this.Q = new pc(context, new tc(context, 1));
        this.F = com.huawei.openalliance.ad.utils.ab.k(context.getApplicationContext());
        this.M = new b();
        com.huawei.openalliance.ad.inter.c.a(context.getApplicationContext()).a(this.M);
    }

    private void a(int i, String str, boolean z) {
        hw.b("PPSSplashView", "showClickButton");
        e();
        this.H.setVisibility(4);
        this.H.setDesc(a(str));
        this.H.setOrientation(this.f.b());
        this.H.a(z, i);
        if (i != 0) {
            this.H.setVisibility(0);
        }
    }

    private String a(String str) {
        String strA = com.huawei.openalliance.ad.utils.c.a(getContext(), this.N, 0);
        if (TextUtils.isEmpty(strA)) {
            return !TextUtils.isEmpty(this.e.G()) ? this.e.G() : str;
        }
        return strA;
    }

    private String a(InteractCfg interactCfg, String str) {
        if (TextUtils.isEmpty(str)) {
            return (interactCfg == null || interactCfg.l() == null) ? this.e.K() : interactCfg.l();
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
        int i3;
        boolean z2;
        w wVar;
        int iB = this.f.b();
        int iD = this.f.d();
        i();
        if (1 == iB) {
            wVar = new w(getContext(), str, iB, iD, i, str2, z, as.a(getContext(), 24.0f), f, i2, false);
        } else {
            hw.b("PPSSplashView", "createSkipAdButton, orientation: %s, leftNotchHeight: %s, rightNotchHeight: %s", Integer.valueOf(iB), Integer.valueOf(this.x), Integer.valueOf(this.y));
            int i4 = this.x;
            if (i4 > 0) {
                z2 = true;
                i3 = i4;
            } else {
                i3 = this.y;
                z2 = false;
            }
            wVar = new w(getContext(), str, iB, iD, i, str2, z, i3, f, i2, z2);
        }
        wVar.setAdMediator(this.k);
        return wVar;
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<PPSSplashView> f21041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ContentRecord f21042b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final PPSSplashView pPSSplashView = this.f21041a.get();
            if (pPSSplashView != null) {
                final int[] choiceViewLoc = pPSSplashView.i.getChoiceViewLoc();
                final int[] choiceViewSize = pPSSplashView.i.getChoiceViewSize();
                if (as.a(choiceViewLoc, 2) && as.a(choiceViewSize, 2)) {
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSSplashView.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            pPSSplashView.a(a.this.f21042b, choiceViewLoc, choiceViewSize);
                        }
                    });
                }
            }
        }

        public a(PPSSplashView pPSSplashView, ContentRecord contentRecord) {
            this.f21041a = new WeakReference<>(pPSSplashView);
            this.f21042b = contentRecord;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class b implements com.huawei.openalliance.ad.inter.c.b {
        @Override // com.huawei.openalliance.ad.inter.c.b
        public void a() {
            hw.b("PPSSplashView", "onStart");
            PPSSplashView.this.l();
        }

        private b() {
        }
    }

    public PPSSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 8;
        this.p = false;
        this.t = 0;
        this.u = 0;
        this.v = 1;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.B = true;
        this.D = 0;
        this.E = "skip_btn_delay_id_" + hashCode();
        a(context);
    }

    public PPSSplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 8;
        this.p = false;
        this.t = 0;
        this.u = 0;
        this.v = 1;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.B = true;
        this.D = 0;
        this.E = "skip_btn_delay_id_" + hashCode();
        a(context);
    }

    public PPSSplashView(Context context) {
        super(context);
        this.h = 8;
        this.p = false;
        this.t = 0;
        this.u = 0;
        this.v = 1;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.B = true;
        this.D = 0;
        this.E = "skip_btn_delay_id_" + hashCode();
        a(context);
    }
}
