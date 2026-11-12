package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.common.IMediaStateApiTransfer;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.AdLoadState;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.HiAdSplash;
import com.huawei.openalliance.ad.inter.IHiAdSplash;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdListener;
import com.huawei.openalliance.ad.inter.listeners.AdShowListener;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.views.PPSSplashView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes41.dex */
public abstract class jf implements jj, ri {
    private static long L;
    private AdActionListener A;
    private AdShowListener B;
    private String C;
    private ContentRecord D;
    private sb K;
    private int N;
    private com.huawei.openalliance.ad.analysis.c O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WeakReference<com.huawei.openalliance.ad.views.interfaces.n> f19307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AdLoadState f19308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected gk f19309c;
    protected fz d;
    protected rc e;
    protected ContentRecord k;
    protected RewardVerifyConfig m;
    protected int n;
    protected Context o;
    private WeakReference<com.huawei.openalliance.ad.views.interfaces.l> p;
    private AdListener r;
    private qx s;
    private CountDownTimer t;
    private mh q = new lw();
    protected boolean f = false;
    private boolean u = false;
    private boolean v = false;
    protected boolean g = false;
    private boolean w = false;
    protected final String h = "load_timeout_" + hashCode();
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    protected long i = 0;
    private int E = 0;
    private long F = -1;
    protected boolean j = false;
    protected DelayInfo l = new DelayInfo();
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private long M = 0;
    private long P = 0;
    private boolean Q = false;

    protected abstract void d(ContentRecord contentRecord);

    protected abstract String r();

    protected abstract String z();

    @Override // com.huawei.openalliance.ad.jj
    public String y() {
        ContentRecord contentRecord = this.D;
        if (contentRecord != null) {
            return contentRecord.l();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    @Override // com.huawei.openalliance.ad.jj
    public BiddingInfo x() {
        Float fValueOf;
        if (this.D == null) {
            return new BiddingInfo();
        }
        BiddingInfo.a aVar = new BiddingInfo.a();
        aVar.a(this.D.bk()).b(this.D.bm()).setLurl(this.D.bn());
        EncryptionField<String> encryptionFieldBl = this.D.bl();
        if (encryptionFieldBl != null) {
            String strA = encryptionFieldBl.a(l());
            if (TextUtils.isEmpty(strA)) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(strA);
            }
        } else {
            fValueOf = null;
        }
        aVar.a(fValueOf);
        return aVar.a();
    }

    @Override // com.huawei.openalliance.ad.jj
    public String w() {
        ContentRecord contentRecord = this.D;
        if (contentRecord != null) {
            return contentRecord.ac();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void v() {
        if (this.H) {
            hw.b(z(), "already reset");
            return;
        }
        this.H = true;
        if (q() != null) {
            q().destroyView();
            if (!q().i()) {
                hw.b(z(), "not show Icon");
                df.c(null);
                df.a((Drawable) null);
                df.a((Bitmap) null);
            }
        }
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP != null) {
            lVarP.a();
        }
        df.a((ContentRecord) null);
        df.b((ContentRecord) null);
        com.huawei.openalliance.ad.utils.as.i(this.o);
        com.huawei.openalliance.ad.inter.c.a(this.o).a(false);
    }

    @Override // com.huawei.openalliance.ad.jj
    public void u() {
        hw.b(z(), "onDisplayTimeUp hasShowFinish: %s", Boolean.valueOf(this.G));
        if (this.G) {
            return;
        }
        this.G = true;
        v();
        j();
    }

    @Override // com.huawei.openalliance.ad.jj
    public boolean t() {
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void s() {
        this.l.u().k(System.currentTimeMillis());
    }

    protected com.huawei.openalliance.ad.views.interfaces.n q() {
        WeakReference<com.huawei.openalliance.ad.views.interfaces.n> weakReference = this.f19307a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    protected com.huawei.openalliance.ad.views.interfaces.l p() {
        return this.p.get();
    }

    protected void o() {
        j();
    }

    protected void n() {
        int iAZ = this.f19309c.aZ();
        hw.b(z(), "startAdLoadTimeoutTask - max load time: %d", Integer.valueOf(iAZ));
        com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.14
            @Override // java.lang.Runnable
            public void run() {
                synchronized (jf.this) {
                    hw.b(jf.this.z(), "on load task timeout, loadingTimeout: %s", Boolean.valueOf(jf.this.f));
                    if (!jf.this.f && !jf.this.d(-2)) {
                        jf.this.c(-2);
                        jf.this.o();
                    }
                }
            }
        }, this.h, iAZ);
    }

    protected void m() {
        Context context;
        AdSlotParam adSlotParamK = k();
        if (adSlotParamK == null) {
            d((ContentRecord) null);
            return;
        }
        Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(this.o, true);
        if (pairB == null && this.f19309c.by() && (context = this.o) != null && cc.h(context)) {
            hw.b(z(), "start to request oaid");
            a(adSlotParamK, this.o);
            return;
        }
        if (pairB != null) {
            hw.b(z(), "use cached oaid ");
            adSlotParamK.a((String) pairB.first);
            adSlotParamK.a((Boolean) pairB.second);
        }
        a(adSlotParamK);
    }

    public Context l() {
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP == null) {
            return null;
        }
        return lVarP.getContext();
    }

    protected AdSlotParam k() {
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP == null) {
            return null;
        }
        AdSlotParam adSlotParam = lVarP.getAdSlotParam();
        if (adSlotParam != null) {
            this.l.a(adSlotParam.a());
        }
        return adSlotParam;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void j() {
        hw.b(z(), "notifyAdDismissed");
        if (this.u) {
            hw.b(z(), "ad already dismissed");
            return;
        }
        this.u = true;
        AdListener adListener = this.r;
        if (adListener != null) {
            adListener.onAdDismissed();
        }
        ContentRecord contentRecord = this.D;
        if (contentRecord != null && contentRecord.aQ() != 3) {
            pz.a(this.o).a(this.D.ac(), -10);
        }
        com.huawei.openalliance.ad.views.interfaces.n nVarQ = q();
        if (nVarQ != null) {
            nVarQ.destroyView();
        }
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP != null) {
            lVarP.a();
        }
    }

    @Override // com.huawei.openalliance.ad.jj
    public void i() {
        if (this.z) {
            return;
        }
        this.z = true;
        if (this.F < 0) {
            this.F = com.huawei.openalliance.ad.utils.as.c();
        }
        D();
        this.e.b();
        mh mhVar = this.q;
        if (mhVar != null) {
            mhVar.f();
        }
    }

    protected void h() {
        this.d.b();
        ex.b(this.o).b();
    }

    protected void g(int i) {
        this.w = true;
        this.l.a(i);
        j(this.D);
    }

    public void g() {
        AdActionListener adActionListener = this.A;
        if (adActionListener != null) {
            adActionListener.onAdClick();
        }
        com.huawei.openalliance.ad.utils.as.i(this.o);
    }

    @Override // com.huawei.openalliance.ad.jj
    public void f(final ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.5
            @Override // java.lang.Runnable
            public void run() {
                if (contentRecord.aQ() == 3) {
                    ex.b(jf.this.o).a(contentRecord, "load failed");
                    return;
                }
                String strA = contentRecord.A();
                if (!com.huawei.openalliance.ad.utils.dg.b(strA)) {
                    com.huawei.openalliance.ad.utils.ai.a(jf.this.o, strA);
                }
                ew.a(jf.this.o).b(contentRecord.o(), contentRecord.n(), contentRecord.ac());
            }
        });
    }

    @Override // com.huawei.openalliance.ad.jj
    public void f(int i) {
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP != null) {
            lVarP.b(i);
        }
    }

    @Override // com.huawei.openalliance.ad.jj
    public void f() {
        a(11, "feedback hasShowFinish", Long.valueOf(this.i));
        com.huawei.openalliance.ad.views.interfaces.n nVarQ = q();
        if (nVarQ != null) {
            nVarQ.h();
        }
    }

    protected void e(ContentRecord contentRecord) {
        this.D = contentRecord;
        if (contentRecord == null || contentRecord.aQ() != 3) {
            return;
        }
        this.d = ex.b(this.o);
    }

    @Override // com.huawei.openalliance.ad.jj
    public void e(int i) {
        i(i);
        AdListener adListener = this.r;
        if (adListener instanceof LinkedAdListener) {
            adListener.onAdFailedToLoad(-6);
        }
    }

    @Override // com.huawei.openalliance.ad.jj
    public void e() {
        a(10, "onWhyThisAd hasShowFinish", Long.valueOf(this.i));
        com.huawei.openalliance.ad.views.interfaces.n nVarQ = q();
        if (nVarQ != null) {
            nVarQ.g();
        }
    }

    public boolean d(int i) {
        hw.b(z(), "showSpare");
        ContentRecord contentRecordH = df.h();
        hw.b(z(), "showSpare, loadingTimeout: %s %s", Boolean.valueOf(this.f), Boolean.valueOf(contentRecordH == null));
        if (this.f || contentRecordH == null || !g(contentRecordH)) {
            this.f = true;
            return false;
        }
        hw.b(z(), "show spare splash");
        com.huawei.openalliance.ad.utils.dc.a(this.h);
        this.f = true;
        this.g = true;
        contentRecordH.c(true);
        this.i = System.currentTimeMillis();
        this.l.b(System.currentTimeMillis());
        h(i);
        a(contentRecordH, i);
        d(contentRecordH);
        return true;
    }

    @Override // com.huawei.openalliance.ad.jj
    public int d() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.openalliance.ad.jj
    public boolean c(ContentRecord contentRecord) {
        hw.b(z(), "showAdContent");
        this.j = true;
        if (this.m != null) {
            hw.b(z(), "set verifyConfig.");
            contentRecord.G(com.huawei.openalliance.ad.utils.dg.f(this.m.getData()));
            contentRecord.H(com.huawei.openalliance.ad.utils.dg.f(this.m.getUserId()));
        }
        this.e.a(contentRecord);
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP == null) {
            return false;
        }
        hw.b(z(), "showAdContent, getTemplateIdV3 = %s, sdkMonitor %s", contentRecord.aP(), Integer.valueOf(contentRecord.b()));
        if (!com.huawei.openalliance.ad.utils.dg.b(contentRecord.aP()) || com.huawei.openalliance.ad.utils.c.a(this.o, contentRecord.aX(), contentRecord.n(), 1)) {
            this.I = true;
            if (!(lVarP instanceof PPSSplashView)) {
                hw.c(z(), "not PPSSplashView");
                return false;
            }
            IRemoteCreator iRemoteCreatorA = e.a(this.o);
            if (iRemoteCreatorA == null) {
                hw.b(z(), "Creator is null");
                return false;
            }
            bz bzVar = new bz(lVarP.getContext(), this, contentRecord);
            String strB = com.huawei.openalliance.ad.utils.bk.b(AdContentData.a(this.o, contentRecord));
            Bundle bundle = new Bundle();
            bundle.putInt("audioFocusType", lVarP.getAudioFocusType());
            PPSSplashView pPSSplashView = (PPSSplashView) lVarP;
            bundle.putInt(ParamConstants.Param.MEDIA_NAME_RES_ID, pPSSplashView.getMediaNameResId());
            bundle.putInt(ParamConstants.Param.LOGO_RES_ID, pPSSplashView.getLogoResId());
            bundle.putString("content", strB);
            hw.a(z(), "contentJson : %s", strB);
            AdSlotParam adSlotParamK = k();
            if (adSlotParamK != null) {
                bundle.putInt(ParamConstants.Param.ORIENTATION, adSlotParamK.b());
                bundle.putInt(ParamConstants.Param.END_MODE, adSlotParamK.F() != null ? adSlotParamK.F().intValue() : 1);
            }
            try {
                View view = (View) ObjectWrapper.unwrap(iRemoteCreatorA.newSplashTemplateView(bundle, bzVar));
                if (view == 0) {
                    hw.c(z(), "templateView is null");
                    return false;
                }
                this.q = null;
                lVarP.a(view, contentRecord);
                iRemoteCreatorA.bindData(ObjectWrapper.wrap(view), strB);
                if (view instanceof IMediaStateApiTransfer) {
                    ((IMediaStateApiTransfer) view).setProxy(lVarP.getMediaProxy());
                } else {
                    hw.c(z(), "splash template view is not a IMediaStateApiTransfer instance");
                }
                H();
            } catch (Throwable th) {
                hw.c(z(), "create splashTemplateView err: %s", th.getClass().getSimpleName());
                return false;
            }
        } else {
            com.huawei.openalliance.ad.views.interfaces.n nVarA = a(contentRecord, lVarP);
            if (nVarA == null) {
                return false;
            }
            mh mhVar = this.q;
            if (mhVar != null) {
                mhVar.c();
            }
            i(contentRecord);
            this.f19307a = new WeakReference<>(nVarA);
            lVarP.a(nVarA, contentRecord);
            nVarA.b();
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void c(int i) {
        hw.b(z(), "ad failed:" + i);
        if (this.v) {
            hw.b(z(), "ad is already failed");
            return;
        }
        this.v = true;
        this.i = System.currentTimeMillis();
        this.l.b(System.currentTimeMillis());
        AdListener adListener = this.r;
        if (adListener != null) {
            adListener.onAdFailedToLoad(i);
        }
        b(this.D);
        com.huawei.openalliance.ad.utils.as.i(this.o);
        J();
        h(i);
        dk.b();
    }

    public AdListener c() {
        return this.r;
    }

    public void b(boolean z) {
        this.Q = z;
    }

    protected void b(ContentRecord contentRecord) {
        int iP = df.p();
        this.N = iP;
        if (iP == 0) {
            this.O.a(0, this.P, this.M, contentRecord);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = L;
            if (j != 0) {
                this.M = jCurrentTimeMillis - j;
            }
            L = jCurrentTimeMillis;
            this.O.a(1, this.P, this.M, contentRecord);
        }
        hw.b(z(), "rptSplStaPatten, mode: %s, adStartLoadTime: %s, timeInterval: %s", Integer.valueOf(this.N), Long.valueOf(this.P), Long.valueOf(this.M));
    }

    @Override // com.huawei.openalliance.ad.jj
    public void b(long j) {
        this.P = j;
        this.l.a(j);
    }

    @Override // com.huawei.openalliance.ad.jj
    public void b(int i) {
        ContentRecord contentRecordH;
        hw.b(z(), "toShowSpare");
        if (!this.D.au() && (contentRecordH = df.h()) != null && g(contentRecordH)) {
            this.l.b(System.currentTimeMillis());
            this.i = System.currentTimeMillis();
            h(i);
            this.D = contentRecordH;
            this.e.a(contentRecordH);
            a(contentRecordH, i);
            if (c(contentRecordH)) {
                return;
            } else {
                i = ErrorCode.ERROR_CODE_NULL_AD_VIEW;
            }
        }
        c(i);
        B();
    }

    @Override // com.huawei.openalliance.ad.jj
    public AdLoadState b() {
        return this.f19308b;
    }

    @Override // com.huawei.openalliance.ad.jj
    public boolean a(int i, int i2, ContentRecord contentRecord, Long l, MaterialClickInfo materialClickInfo, int i3) {
        hw.b(z(), "onTouch");
        boolean z = true;
        b(true);
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.o, contentRecord, new HashMap(0));
        if (aVarA.a()) {
            if (18 == i3 && (l() instanceof Activity)) {
                ((Activity) l()).overridePendingTransition(R.anim.hiad_open, R.anim.hiad_close);
            }
            a(i, i2, aVarA, l, materialClickInfo, i3);
        } else {
            z = false;
        }
        com.huawei.openalliance.ad.inter.c.a(this.o).a(false);
        return z;
    }

    public boolean a() {
        return this.y;
    }

    public void a(boolean z) {
        this.y = z;
    }

    public void a(final List<ContentRecord> list, final int i, final int i2) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.jf.4
            @Override // java.lang.Runnable
            public void run() {
                if (list == null || jf.this.o == null) {
                    return;
                }
                com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(jf.this.o);
                for (ContentRecord contentRecord : list) {
                    if (contentRecord != null) {
                        if (contentRecord.S() != null) {
                            if ((i == 0 && contentRecord.S().e() >= contentRecord.S().d()) || (i == 1 && contentRecord.S().e() < contentRecord.S().d())) {
                                cVar.a(contentRecord, i, i2, jf.this.C);
                            }
                        } else if (contentRecord.T() != null) {
                            if (jf.this.a(contentRecord, contentRecord.T().m(), i)) {
                                cVar.a(contentRecord, i, i2, jf.this.C);
                            }
                        }
                    }
                }
            }
        });
    }

    public void a(Long l, Integer num, Integer num2, js jsVar) {
        ContentRecord contentRecord = this.D;
        boolean zA = com.huawei.openalliance.ad.utils.c.a(contentRecord != null ? contentRecord.bc() : null, num2);
        if (I() && (!zA || a())) {
            hw.c(z(), "show event already reported before, ignore this");
            return;
        }
        String strE = E();
        if (this.D != null) {
            hw.a(z(), "slotId: %s, contentId: %s, slot pos: %s", this.D.n(), this.D.o(), strE);
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        if (!com.huawei.openalliance.ad.utils.dg.b(strE)) {
            c0229a.d(strE);
        }
        c0229a.a(l).a(num).b(num2).a(com.huawei.openalliance.ad.utils.b.a(jsVar)).c(F());
        a(c0229a);
        this.e.a(c0229a.a());
        if (zA) {
            a(true);
        }
        if (I()) {
            return;
        }
        c(true);
        AdActionListener adActionListener = this.A;
        if (adActionListener != null) {
            adActionListener.onAdShowed();
        }
        mh mhVar = this.q;
        if (mhVar != null) {
            mhVar.e();
        }
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(AdShowListener adShowListener) {
        this.B = adShowListener;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(AdListener adListener) {
        this.r = adListener;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(AdActionListener adActionListener) {
        this.A = adActionListener;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(RewardVerifyConfig rewardVerifyConfig) {
        this.m = rewardVerifyConfig;
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(ContentRecord contentRecord, long j, int i) {
        J();
        if (!this.f19309c.bv()) {
            hw.c(z(), "onAdShowEnd - use old adshow event");
            return;
        }
        hw.b(z(), "onAdShowEnd duration: %d showRatio: %d", Long.valueOf(j), Integer.valueOf(i));
        this.e.a(j, i);
        if (contentRecord == null) {
            hw.c(z(), "onAdShowEnd - content record is null");
            return;
        }
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ == null) {
            hw.c(z(), "onAdShowEnd - metaData is null");
            return;
        }
        if (j >= metaDataJ.i() && i >= metaDataJ.k()) {
            a(Long.valueOf(j), Integer.valueOf(i), (Integer) null, q());
            return;
        }
        if (!I()) {
            this.O.a(contentRecord, Long.valueOf(j), Integer.valueOf(i));
        }
        hw.c(z(), "duration or show ratio is invalid for showId %s", contentRecord.l());
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(final ContentRecord contentRecord) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.9
            @Override // java.lang.Runnable
            public void run() {
                jf.this.h(contentRecord);
                if (!jf.this.I || 3 == contentRecord.aQ()) {
                    return;
                }
                ft.a(jf.this.o).a(contentRecord.n(), System.currentTimeMillis());
            }
        });
        com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
        if (lVarP != null) {
            int iQ = contentRecord.q();
            lVarP.a(iQ, !this.I);
            lVarP.b();
            if (!this.I) {
                lVarP.a(contentRecord, this.f19309c.aT());
                lVarP.a(pa.n(contentRecord.X()), pa.t(contentRecord.X()), contentRecord.az(), 1 == iQ, lVarP.b(contentRecord));
            }
            lVarP.a(contentRecord);
        }
        this.f19308b = AdLoadState.LOADED;
        CountDownTimer countDownTimer = this.t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        hw.b(z(), "ad loaded");
        this.i = System.currentTimeMillis();
        this.l.b(System.currentTimeMillis());
        df.c(contentRecord);
        AdListener adListener = this.r;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
        if (this.B != null && this.n == 1 && contentRecord != null) {
            HashMap map = new HashMap();
            map.put(AdShowExtras.PRELOAD_MODE, String.valueOf(fl.a(this.o).a(contentRecord.n())));
            map.put(AdShowExtras.DOWNLOAD_SOURCE, com.huawei.openalliance.ad.utils.d.a(contentRecord.V()));
            this.B.onAdShowed(map);
        }
        b(contentRecord);
        g(200);
        D();
        i();
        if (!this.f19309c.bv()) {
            a((Long) null, (Integer) null, (Integer) null, lVarP);
        }
        dk.b();
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(long j) {
        if (this.F < 0) {
            this.F = j;
        }
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(int i, int i2) {
        com.huawei.openalliance.ad.views.interfaces.n nVarQ = q();
        if (nVarQ != null) {
            nVarQ.a(i, i2);
        }
        this.e.b(i, i2);
        a(Long.valueOf(this.i), 3);
        j();
        v();
    }

    @Override // com.huawei.openalliance.ad.jj
    public void a(int i) {
        this.E = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ContentRecord contentRecord) {
        if (!this.g || !this.w || this.o == null || this.l.a() <= 0) {
            return;
        }
        if (hw.a()) {
            hw.b(z(), "reportSplashCostTime");
        }
        this.w = false;
        com.huawei.openalliance.ad.analysis.d.a(this.o, r(), this.l, this.C, contentRecord, this.n);
    }

    private void i(ContentRecord contentRecord) {
        if (this.q == null) {
            return;
        }
        if (contentRecord != null && contentRecord.F() == 9) {
            this.q.a(my.a(0.0f, true, mx.STANDALONE));
        } else if (contentRecord != null) {
            if (contentRecord.F() == 4 || contentRecord.F() == 2) {
                this.q.f();
            }
        }
    }

    private void i(int i) {
        List<String> listA;
        if (this.k == null || this.o == null) {
            return;
        }
        new com.huawei.openalliance.ad.analysis.h(this.o).a(i, new com.huawei.openalliance.ad.analysis.a(this.C, (k() == null || (listA = k().a()) == null || listA.isEmpty()) ? null : listA.get(0), this.n), r(), this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        contentRecord.J();
        ArrayList arrayList = new ArrayList();
        arrayList.add("priority");
        arrayList.add(ContentRecord.LAST_SHOW_TIME);
        arrayList.add(ContentRecord.DISPLAY_COUNT);
        hw.b(z(), "updateContentOnAdLoad, uniqueId: %s", contentRecord.ac());
        this.d.b(contentRecord, arrayList);
        this.d.a(contentRecord.p(), com.huawei.openalliance.ad.utils.as.c());
    }

    private void h(int i) {
        String strR;
        ContentRecord contentRecord;
        List<String> listA;
        if (this.o != null) {
            com.huawei.openalliance.ad.analysis.h hVar = new com.huawei.openalliance.ad.analysis.h(this.o);
            com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a(this.C, (k() == null || (listA = k().a()) == null || listA.isEmpty()) ? null : listA.get(0), this.n);
            if (i == -6) {
                strR = r();
                contentRecord = this.k;
            } else {
                strR = r();
                contentRecord = this.D;
            }
            hVar.a(i, aVar, strR, contentRecord);
        }
        g(i);
    }

    private boolean g(ContentRecord contentRecord) {
        String strD;
        Context context;
        int i;
        int i2;
        hw.b(z(), "checkMediaPath.");
        if (contentRecord.aQ() == 3) {
            return true;
        }
        if (TextUtils.isEmpty(contentRecord.B())) {
            String strA = contentRecord.A();
            if (TextUtils.isEmpty(strA)) {
                context = this.o;
                i = this.n;
                i2 = -1;
            } else {
                if (!com.huawei.openalliance.ad.utils.dg.l(strA)) {
                    strD = strA;
                } else {
                    if (a(contentRecord, this.o)) {
                        return false;
                    }
                    strD = dn.d(strA);
                }
                if (!strA.startsWith(Scheme.CONTENT.toString())) {
                    String strO = contentRecord.o();
                    String strN = contentRecord.n();
                    String strAc = contentRecord.ac();
                    hw.b(z(), "checkMediaPath, uniqueId: %s", strAc);
                    String strA2 = a(this.o, strD, strO, strN, strAc);
                    if (TextUtils.isEmpty(strA2)) {
                        context = this.o;
                        i = this.n;
                        i2 = 4;
                    } else {
                        contentRecord.j(strA2);
                        contentRecord.i(strD);
                    }
                }
            }
            com.huawei.openalliance.ad.analysis.d.a(context, contentRecord, i2, i);
            return false;
        }
        hw.b(z(), "Spare splash is valid.");
        com.huawei.openalliance.ad.analysis.d.a(this.o, contentRecord, 200, this.n);
        return true;
    }

    private void c(boolean z) {
        this.x = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ContentRecord contentRecord, Float f, int i) {
        if (f == null) {
            return i == 0;
        }
        if (i == 0 && f.floatValue() < 1.0f) {
            return true;
        }
        if (contentRecord.F() == 12) {
            return i == 0;
        }
        return i == 1 && f.floatValue() > 1.0f;
    }

    private boolean a(ContentRecord contentRecord, Context context) {
        AdSlotParam adSlotParamK = k();
        if (adSlotParamK == null) {
            return true;
        }
        int iB = adSlotParamK.b();
        int iV = contentRecord.v();
        int iU = contentRecord.u();
        if (iB == 0 && (contentRecord.F() == 12 || iU <= iV)) {
            com.huawei.openalliance.ad.analysis.d.a(context, contentRecord, 2, this.n);
            return true;
        }
        if (iB == 1 && contentRecord.F() != 12 && iU > iV) {
            com.huawei.openalliance.ad.analysis.d.a(context, contentRecord, 3, this.n);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= contentRecord.t() && jCurrentTimeMillis <= contentRecord.s()) {
            return false;
        }
        com.huawei.openalliance.ad.analysis.d.a(context, contentRecord, 1, this.n);
        return true;
    }

    private void a(Long l, int i) {
        a(l != null ? Long.valueOf(System.currentTimeMillis() - l.longValue()) : null, (Integer) 100, Integer.valueOf(i), (js) q());
    }

    private void a(com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a) {
        Object objP = p();
        if (!(objP instanceof View) || c0229a == null) {
            return;
        }
        c0229a.e(vv.b((View) objP));
    }

    private void a(ContentRecord contentRecord, com.huawei.openalliance.ad.views.interfaces.l lVar, com.huawei.openalliance.ad.views.interfaces.n nVar) {
        if (contentRecord == null || nVar == null || this.q == null) {
            hw.c(z(), "there is no splash ad or adView is null");
            return;
        }
        hw.b(z(), "initOmsdkResource");
        this.q.a(l(), contentRecord, lVar, true);
        nVar.a(this.q);
    }

    private void a(final ContentRecord contentRecord, final int i) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jf.2
            @Override // java.lang.Runnable
            public void run() {
                hw.b(jf.this.z(), "start report");
                if (jf.this.o == null) {
                    return;
                }
                new com.huawei.openalliance.ad.analysis.c(jf.this.o).a(contentRecord, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdContentRsp adContentRsp, long j) {
        AdSlotParam adSlotParamK = k();
        if (adSlotParamK == null) {
            hw.c(z(), "onPostAdRequest adSlotParam is null");
        } else {
            this.s.a(adContentRsp, adSlotParamK, this, new qw() { // from class: com.huawei.openalliance.ad.jf.13
                @Override // com.huawei.openalliance.ad.qw
                public void a(final ContentRecord contentRecord) {
                    hw.b(jf.this.z(), "onDownloaded");
                    jf.this.l.u().j(com.huawei.openalliance.ad.utils.as.c());
                    synchronized (jf.this) {
                        hw.b(jf.this.z(), "onDownloaded, loadingTimeout:" + jf.this.f);
                        jf.this.g = true;
                        if (jf.this.f) {
                            jf.this.l.a(-2);
                            jf.this.w = true;
                        } else {
                            com.huawei.openalliance.ad.utils.dc.a(jf.this.h);
                            hw.b(jf.this.z(), "cancel loadTimeoutTask");
                            jf.this.l.f(com.huawei.openalliance.ad.utils.as.c());
                            if (contentRecord == null || 12 != contentRecord.F()) {
                                final long jC = com.huawei.openalliance.ad.utils.as.c();
                                com.huawei.openalliance.ad.utils.dc.a(jf.this.o, new Runnable() { // from class: com.huawei.openalliance.ad.jf.13.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        jf jfVar;
                                        ContentRecord contentRecord2;
                                        jf.this.l.g(com.huawei.openalliance.ad.utils.as.c() - jC);
                                        if (contentRecord != null) {
                                            jf.this.f = true;
                                            jfVar = jf.this;
                                            contentRecord2 = contentRecord;
                                        } else {
                                            if (jf.this.d(ErrorCode.ERROR_CODE_NO_AD_RECORD)) {
                                                return;
                                            }
                                            jfVar = jf.this;
                                            contentRecord2 = null;
                                        }
                                        jfVar.d(contentRecord2);
                                    }
                                });
                            } else {
                                hw.b(jf.this.z(), "notify linked ad on current thread");
                                jf.this.f = true;
                                jf.this.d(contentRecord);
                            }
                        }
                        jf.this.j(contentRecord);
                    }
                }
            }, j, 0);
        }
    }

    private void a(final AdSlotParam adSlotParam, final Context context) {
        OAIDServiceManager.getInstance(context).requireOaid(new OAIDServiceManager.OaidResultCallback() { // from class: com.huawei.openalliance.ad.jf.10
            @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
            public int b() {
                return jf.this.n;
            }

            @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
            public void a(String str, boolean z) {
                hw.b(jf.this.z(), "onOaidAcquired");
                adSlotParam.a(str);
                adSlotParam.a(Boolean.valueOf(z));
                jf.this.a(adSlotParam);
                com.huawei.openalliance.ad.utils.d.a(context, str, z);
            }

            @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
            public void a() {
                hw.b(jf.this.z(), "onOaidAcquireFailed");
                jf.this.a(adSlotParam);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AdSlotParam adSlotParam) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                hw.b(jf.this.z(), "doAdRequest " + jCurrentTimeMillis2);
                jf.this.l.d(jCurrentTimeMillis2 - jCurrentTimeMillis);
                jf.this.C = com.huawei.openalliance.ad.utils.as.a();
                adSlotParam.b(jf.this.C);
                jf.this.a(jf.this.s.a(jf.this.o, adSlotParam, jf.this.n), jCurrentTimeMillis2);
                jf.this.G();
            }
        }, com.huawei.openalliance.ad.utils.o.a.SPLASH_NET, false);
    }

    private void a(int i, final String str, Long l) {
        a(l, i);
        if (this.G) {
            hw.b(z(), str);
            return;
        }
        this.G = true;
        v();
        if (d() == 1) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.8
                @Override // java.lang.Runnable
                public void run() {
                    hw.b(jf.this.z(), "%s pauseView", str);
                    if (jf.this.q() != null) {
                        jf.this.q().pauseView();
                    }
                }
            }, 150L);
        }
    }

    private void a(int i, int i2, com.huawei.openalliance.ad.uriaction.interfaces.a aVar, Long l, MaterialClickInfo materialClickInfo, int i3) {
        a(l, 1);
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar2.a(i).b(i2).b(aVar.c()).a(Integer.valueOf(i3)).a(materialClickInfo).d(com.huawei.openalliance.ad.utils.b.a(p())).e(F());
        this.e.a(aVar2.a());
        if (this.G) {
            hw.b(z(), "onDoActionSucc hasShowFinish");
            return;
        }
        this.G = true;
        g();
        if (d() == 1) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.6
                @Override // java.lang.Runnable
                public void run() {
                    hw.b(jf.this.z(), "onDoActionSucc pauseView");
                    if (jf.this.q() != null) {
                        jf.this.q().pauseView();
                    }
                }
            }, 150L);
        }
        v();
    }

    private String a(final Context context, final String str, final String str2, final String str3, final String str4) {
        try {
            return (String) com.huawei.openalliance.ad.utils.dj.c(new Callable<String>() { // from class: com.huawei.openalliance.ad.jf.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String call() {
                    String strC = dk.a(context, "normal").c(str);
                    if (com.huawei.openalliance.ad.utils.ai.c(context, strC, "normal")) {
                        return strC;
                    }
                    com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (context != null) {
                                ew.a(context).b(str2, str3, str4);
                            }
                            com.huawei.openalliance.ad.utils.ai.a(context, str);
                        }
                    }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
                    return "";
                }
            });
        } catch (Throwable unused) {
            hw.c(z(), "get media local path exception");
            return "";
        }
    }

    private com.huawei.openalliance.ad.views.interfaces.n a(ContentRecord contentRecord, com.huawei.openalliance.ad.views.interfaces.l lVar) {
        if (contentRecord == null) {
            return null;
        }
        com.huawei.openalliance.ad.views.interfaces.n nVarA = lVar.a(contentRecord.F());
        if (nVarA != null) {
            nVarA.setAdContent(contentRecord);
            nVarA.setAdMediator(this);
            int iAv = contentRecord.av() > 0 ? contentRecord.av() : 0;
            if (2 == contentRecord.F() || 4 == contentRecord.F()) {
                nVarA.a((contentRecord.aw() >= 2000 ? contentRecord.aw() : this.f19309c.aQ()) + iAv, 0, 0);
            }
            if (9 == contentRecord.F()) {
                nVarA.a(0, this.f19309c.aR(), iAv);
            }
            a(contentRecord, lVar, nVarA);
        }
        return nVarA;
    }

    private void J() {
        try {
            if (this.J) {
                hw.b(z(), "already end");
                return;
            }
            com.huawei.openalliance.ad.views.interfaces.l lVarP = p();
            if (lVarP != null) {
                lVarP.a();
            }
            hw.b(z(), "onAdEnd");
            this.J = true;
            sb sbVar = this.K;
            if (sbVar != null) {
                sbVar.b();
            }
            com.huawei.hms.ads.uiengine.e eVarB = e.b();
            if (eVarB != null) {
                eVarB.b(this.n, (Bundle) null);
            }
        } catch (Throwable th) {
            hw.b(z(), "end err: %s", th.getClass().getSimpleName());
        }
    }

    private boolean I() {
        return this.x;
    }

    private void H() {
        CountDownTimer countDownTimer = new CountDownTimer(2000L, 500L) { // from class: com.huawei.openalliance.ad.jf.3
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                hw.a(jf.this.z(), "onTick = %s", Long.valueOf(j));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                hw.b(jf.this.z(), "onFinish");
                if (jf.this.f19308b != AdLoadState.LOADED) {
                    jf.this.c(-10);
                    jf.this.B();
                }
            }
        };
        this.t = countDownTimer;
        countDownTimer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        com.huawei.openalliance.ad.utils.dc.a(new Runnable() { // from class: com.huawei.openalliance.ad.jf.12
            @Override // java.lang.Runnable
            public void run() {
                IHiAdSplash hiAdSplash = HiAdSplash.getInstance(jf.this.o);
                if (hiAdSplash instanceof HiAdSplash) {
                    HiAdSplash hiAdSplash2 = (HiAdSplash) hiAdSplash;
                    long jBI = jf.this.f19309c.bI();
                    long jA = hiAdSplash2.a();
                    if (System.currentTimeMillis() - jA >= jBI) {
                        if (jf.this.n == 1) {
                            hiAdSplash2.preloadAd();
                            return;
                        } else {
                            hiAdSplash2.preloadSmartScreenAd();
                            return;
                        }
                    }
                    hw.b(jf.this.z(), "request time limit, timeInter=" + jBI + ", lastTime=" + jA);
                }
            }
        }, (this.f19309c.aQ() * 3) + 1000);
    }

    private String F() {
        ContentRecord contentRecord;
        if (!this.I || (contentRecord = this.D) == null || 3 == contentRecord.aQ() || this.D.aX() == null) {
            return null;
        }
        return this.D.aX().a();
    }

    private String E() {
        return com.huawei.openalliance.ad.utils.dk.a(p());
    }

    private void D() {
        ContentRecord contentRecord = this.D;
        if (contentRecord == null || contentRecord.a()) {
            return;
        }
        long jC = this.F;
        if (jC <= 0) {
            jC = com.huawei.openalliance.ad.utils.as.c();
        }
        hw.a(z(), "recordShowStartTime: %s", Long.valueOf(jC));
        this.D.c(String.valueOf(jC));
        this.D.h(jC);
        this.e.a(this.D);
    }

    private void C() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jf.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    jf jfVar = jf.this;
                    jfVar.K = new sb(jfVar.o);
                    jf.this.K.a();
                    com.huawei.hms.ads.uiengine.e eVarB = e.b();
                    if (eVarB != null) {
                        eVarB.a(jf.this.n, (Bundle) null);
                    }
                } catch (Throwable th) {
                    hw.b(jf.this.z(), "inform err: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public jf(com.huawei.openalliance.ad.views.interfaces.l lVar) {
        this.p = new WeakReference<>(lVar);
        this.n = lVar.getAdType();
        Context applicationContext = lVar.getContext().getApplicationContext();
        this.o = applicationContext;
        this.f19309c = fp.b(applicationContext);
        this.d = ew.a(this.o);
        this.e = new pc(this.o, new tc(this.o, this.n));
        this.s = new ot(this.o);
        this.O = new com.huawei.openalliance.ad.analysis.c(this.o);
        this.s.a(this.l);
        C();
    }
}
