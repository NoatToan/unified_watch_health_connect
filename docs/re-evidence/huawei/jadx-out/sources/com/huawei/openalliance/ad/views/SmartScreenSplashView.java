package com.huawei.openalliance.ad.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.uiengine.common.MediaStateApi;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import com.huawei.openalliance.ad.constant.AdLoadState;
import com.huawei.openalliance.ad.constant.ApiNames;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.ht;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.HiAdSplash;
import com.huawei.openalliance.ad.inter.IHiAdSplash;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdListener;
import com.huawei.openalliance.ad.jf;
import com.huawei.openalliance.ad.jg;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.ju;
import com.huawei.openalliance.ad.jv;
import com.huawei.openalliance.ad.jx;
import com.huawei.openalliance.ad.jz;
import com.huawei.openalliance.ad.nj;
import com.huawei.openalliance.ad.oc;
import com.huawei.openalliance.ad.op;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.tc;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.bs;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class SmartScreenSplashView extends RelativeLayout implements IViewLifeCycle, com.huawei.openalliance.ad.views.interfaces.l {
    private float A;
    private jx B;
    private pc C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected gk f21116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdSlotParam f21118c;
    private AdListener d;
    private jj e;
    private AdActionListener f;
    private op g;
    private af h;
    private View i;
    private View j;
    private com.huawei.openalliance.ad.views.interfaces.n k;
    private TextView l;
    private PPSCircleProgressBar m;
    private PPSLabelView n;
    private TextView o;
    private int p;
    private RelativeLayout q;
    private RelativeLayout r;
    private long s;
    private int t;
    private final String u;
    private long v;
    private boolean w;
    private boolean x;
    private int y;
    private a z;

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(int i, int i2, String str, boolean z, Integer num) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(int i, boolean z) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(View view, ContentRecord contentRecord) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(ContentRecord contentRecord) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public Integer b(ContentRecord contentRecord) {
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public int getAdType() {
        return 18;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public int getAudioFocusType() {
        return 0;
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    public String getUniqueId() {
        return null;
    }

    public void setStartMaxVol(float f) {
        if (f >= 0.0f) {
            float f2 = 1.0f;
            if (f <= 1.0f) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                hw.b("SmartScreenSplashView", "music max %s, current %s， maxVol： %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
                float f3 = streamVolume;
                float f4 = streamMaxVolume * 1.0f * f;
                if (f3 * 1.0f >= f4) {
                    f2 = f4 / f3;
                    Float.valueOf(f2).getClass();
                }
                if (hw.a()) {
                    hw.a("SmartScreenSplashView", "maxVol end: %s", Float.valueOf(f2));
                }
                this.A = f2;
                return;
            }
        }
        hw.c("SmartScreenSplashView", "valid max vol is from 0.0 to 1.0");
    }

    public void setSloganView(View view) {
        if (view != null) {
            this.i = view;
            view.setVisibility(8);
        }
    }

    public void setSloganResId(int i) {
        if (as.b(getContext())) {
            if (dk.c(getContext())) {
                hw.c("SmartScreenSplashView", "setSloganResId - activity finished, not add view");
                return;
            }
            if (this.f21118c == null) {
                throw new com.huawei.openalliance.ad.exception.b("Must invoke SplashAdView's setAdSlotParam method before invoke setSloganResId method");
            }
            if (this.h == null) {
                af afVar = new af(getContext(), this.f21118c.b(), i, 18);
                this.h = afVar;
                this.q.addView(afVar, new RelativeLayout.LayoutParams(-1, -1));
                this.h.b();
            }
        }
    }

    public void setLogo(View view, int i) {
        this.j = view;
        view.setVisibility(i);
        this.p = i;
    }

    public void setLogo(View view) {
        setLogo(view, 0);
    }

    public void setLinkedSupportMode(int i) {
        this.f21117b = i;
    }

    public void setAudioFocusType(int i) {
        this.y = i;
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.k;
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
            adSlotParam.a(8);
            adSlotParam.b(Integer.valueOf(this.f21117b));
            adSlotParam.c((Integer) 0);
            adSlotParam.d(Integer.valueOf((HiAd.a(getContext()).e() && com.huawei.openalliance.ad.utils.d.s(getContext())) ? 0 : 1));
            this.f21118c = adSlotParam;
            IHiAdSplash hiAdSplash = HiAdSplash.getInstance(getContext());
            if (hiAdSplash instanceof HiAdSplash) {
                ((HiAdSplash) hiAdSplash).a(adSlotParam);
            }
        }
    }

    public void setAdListener(AdListener adListener) {
        this.d = adListener;
        this.g.a(adListener);
        jj jjVar = this.e;
        if (jjVar != null) {
            jjVar.a(adListener);
        }
    }

    public void setAdActionListener(AdActionListener adActionListener) {
        this.f = adActionListener;
        jj jjVar = this.e;
        if (jjVar != null) {
            jjVar.a(adActionListener);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        hw.b("SmartScreenSplashView", "resumeView ");
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.k;
        if (nVar != null) {
            nVar.resumeView();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        hw.b("SmartScreenSplashView", "pauseView ");
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.k;
        if (nVar != null) {
            nVar.pauseView();
        }
        if (getContext() != null) {
            try {
                if (this.z != null) {
                    getContext().unregisterReceiver(this.z);
                    this.z = null;
                }
            } catch (Throwable th) {
                hw.c("SmartScreenSplashView", "unregister err: %s", th.getClass().getSimpleName());
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        jj jjVar;
        hw.b("SmartScreenSplashView", "onKeyDown, keyCode: %s", Integer.valueOf(keyEvent.getKeyCode()));
        if (this.x && 4 == keyEvent.getKeyCode() && keyEvent.getAction() == 1 && (jjVar = this.e) != null) {
            jjVar.a(0, 0);
        }
        return false;
    }

    public void loadAd() {
        AdSlotParam adSlotParam;
        this.s = System.currentTimeMillis();
        hw.b("SmartScreenSplashView", ApiNames.LOAD_AD);
        if (this.g.b()) {
            if (this.g.c() && (adSlotParam = this.f21118c) != null) {
                Integer numR = adSlotParam.r();
                hw.b("SmartScreenSplashView", "startMode %s", numR);
                if ((numR != null && numR.intValue() == 0) || (numR.intValue() == 1 && com.huawei.openalliance.ad.inter.c.a(getContext()).a())) {
                    c();
                    return;
                }
            }
            if (this.f21118c != null) {
                bo.b(getContext().getApplicationContext(), this.f21118c.l());
            }
            this.w = true;
            this.g.a();
        }
    }

    public boolean isLoading() {
        jj jjVar = this.e;
        if (jjVar == null) {
            return this.w;
        }
        return jjVar.b() == AdLoadState.LOADING;
    }

    public boolean isLoaded() {
        jj jjVar = this.e;
        return jjVar != null && jjVar.b() == AdLoadState.LOADED;
    }

    public float getStartMaxVol() {
        return this.A;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public MediaStateApi getMediaProxy() {
        jx jxVar = this.B;
        if (jxVar instanceof jz) {
            return new ju((jz) jxVar);
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public AdSlotParam getAdSlotParam() {
        AdSlotParam adSlotParam = this.f21118c;
        if (adSlotParam != null) {
            adSlotParam.d(18);
        }
        return this.f21118c;
    }

    public AdListener getAdListener() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jj jjVar;
        hw.b("SmartScreenSplashView", "dispatchKeyEvent:" + keyEvent.getKeyCode() + ", " + keyEvent.getAction());
        if (this.x && 4 == keyEvent.getKeyCode() && keyEvent.getAction() == 1 && (jjVar = this.e) != null) {
            jjVar.a(0, 0);
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        hw.b("SmartScreenSplashView", "destroyView ");
        com.huawei.openalliance.ad.views.interfaces.n nVar = this.k;
        if (nVar != null) {
            nVar.destroyView();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void b(int i) {
        hw.a("SmartScreenSplashView", "update left time, total: %s, left: %s", Long.valueOf(this.v), Integer.valueOf(i));
        long j = this.v;
        int iDoubleValue = j > 0 ? (int) ((1.0d - bs.a(Double.valueOf(((double) ((i - 1) * 1000)) / j), 2, 4).doubleValue()) * 100.0d) : 0;
        if (iDoubleValue >= 100) {
            iDoubleValue = 100;
        }
        PPSCircleProgressBar pPSCircleProgressBar = this.m;
        if (pPSCircleProgressBar != null) {
            pPSCircleProgressBar.a(iDoubleValue, dg.a(Integer.valueOf(i)));
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void b() {
        af afVar = this.h;
        if (afVar != null) {
            afVar.b();
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(com.huawei.openalliance.ad.views.interfaces.n nVar, ContentRecord contentRecord) {
        if (dk.c(getContext())) {
            hw.c("SmartScreenSplashView", "showAdView - activity finished, not add view");
            return;
        }
        if (nVar == 0 || !(nVar instanceof View)) {
            return;
        }
        View view = (View) nVar;
        this.k = nVar;
        a(false, view, contentRecord);
        nVar.setAudioFocusType(this.y);
        a(this.k);
        ViewParent parent = view.getParent();
        if (parent == this.q) {
            view.setVisibility(0);
            return;
        }
        if (parent != null && (parent instanceof ViewGroup)) {
            hw.b("SmartScreenSplashView", "showAdView, remove adView.");
            ((ViewGroup) parent).removeView(view);
        } else if (parent != null) {
            return;
        }
        setVisibleAndBringToFont(this.r);
        setVisibleAndBringToFont(this.j);
        this.q.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        view.setVisibility(0);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(ht htVar) {
        View view = this.i;
        if (view != null) {
            view.setVisibility(0);
            new nj(this.f21116a, htVar).a();
            return;
        }
        af afVar = this.h;
        if (afVar != null) {
            afVar.setSloganShowListener(htVar);
            this.h.a();
            return;
        }
        hw.b("SmartScreenSplashView", "create default slogan");
        setSloganResId(R.drawable.hiad_default_slogan);
        af afVar2 = this.h;
        if (afVar2 != null) {
            afVar2.setSloganShowListener(htVar);
            this.h.a();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(ContentRecord contentRecord, int i) {
        hw.a("SmartScreenSplashView", "showLabelView and logo.");
        if (this.l != null && this.m != null) {
            if (contentRecord != null && contentRecord.j() != null && contentRecord.F() == 9) {
                long jY = contentRecord.j().y();
                this.v = jY;
                this.m.a(0, dg.a(Integer.valueOf((int) ((jY * 1.0f) / 1000.0f))));
            }
            d();
        }
        if (this.r != null && this.j != null) {
            hw.b("SmartScreenSplashView", "show logo, visibility: %s", Integer.valueOf(this.p));
            this.r.addView(this.j);
            this.j.setVisibility(this.p);
        }
        d(contentRecord);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a(AdLoadMode adLoadMode) {
        jf jfVarA = jg.a(adLoadMode, this);
        this.e = jfVarA;
        jfVarA.a(this.d);
        this.e.a(this.f);
        this.e.a(this.f21117b);
        this.e.b(this.s);
        this.e.A();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public void a() {
        jx jxVar = this.B;
        if (jxVar != null) {
            jxVar.b();
            this.B = null;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.l
    public com.huawei.openalliance.ad.views.interfaces.n a(int i) {
        if (i == 2) {
            return new r(getContext(), 18);
        }
        if (i != 9) {
            return null;
        }
        x xVar = new x(getContext(), this.f21118c.b(), 0, this.f21118c.d(), 18);
        xVar.setHideSoundIcon(true);
        xVar.setIgnoreSoundCtrl(false);
        xVar.setStartVol(this.A);
        return xVar;
    }

    private void setVisibleAndBringToFont(View view) {
        if (view != null) {
            view.setVisibility(0);
            view.bringToFront();
        }
    }

    private void d(ContentRecord contentRecord) {
        MetaData metaDataJ;
        if (contentRecord == null) {
            return;
        }
        if (this.n != null) {
            String strP = contentRecord.P();
            this.n.setDataAndRefreshUi(contentRecord);
            if (TextUtils.isEmpty(strP) || !this.n.a()) {
                this.n.setVisibility(8);
            } else {
                MetaData metaDataJ2 = contentRecord.j();
                if (metaDataJ2 == null || AdSource.a(metaDataJ2.L()) == null) {
                    this.n.setText(strP);
                } else {
                    this.n.a(AdSource.a(metaDataJ2.L()), strP);
                }
                this.n.setVisibility(0);
            }
        }
        if (this.o == null || (metaDataJ = contentRecord.j()) == null) {
            return;
        }
        String strE = dg.e(metaDataJ.l());
        if (TextUtils.isEmpty(strE)) {
            this.o.setVisibility(8);
        } else {
            this.o.setText(strE);
            this.o.setVisibility(0);
        }
    }

    private void d() {
        if (this.l == null || this.m == null) {
            return;
        }
        int i = this.t;
        if (i > 0) {
            hw.b("SmartScreenSplashView", "%d delay, skip btn show", Integer.valueOf(i));
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.SmartScreenSplashView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (SmartScreenSplashView.this.l != null) {
                        hw.a("SmartScreenSplashView", "skip hint show");
                        SmartScreenSplashView.this.l.setVisibility(0);
                    }
                    if (SmartScreenSplashView.this.m != null) {
                        hw.a("SmartScreenSplashView", "coutDownView show");
                        SmartScreenSplashView.this.m.setVisibility(0);
                    }
                    SmartScreenSplashView.this.x = true;
                }
            }, this.u, this.t);
        } else {
            hw.b("SmartScreenSplashView", "direct show skip hint");
            this.x = true;
            this.l.setVisibility(0);
            this.m.setVisibility(0);
        }
    }

    private boolean c(ContentRecord contentRecord) {
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

    private void c() {
        List<String> listA = this.f21118c.a();
        this.g.a(!bm.a(listA) ? listA.get(0) : null, 18);
        this.g.h();
        jx jxVar = this.B;
        if (jxVar != null) {
            jxVar.b();
        }
        com.huawei.openalliance.ad.inter.c.a(getContext().getApplicationContext()).a(false);
    }

    private void b(Context context) {
        inflate(context, as.o(context) ? R.layout.hiad_view_tv_splash_ad_elderly : R.layout.hiad_view_tv_splash_ad, this);
        this.q = (RelativeLayout) findViewById(R.id.rl_splash_container);
        this.r = (RelativeLayout) findViewById(R.id.hiad_logo_container);
        this.l = (TextView) findViewById(R.id.hiad_skip_text);
        this.m = (PPSCircleProgressBar) findViewById(R.id.hiad_count_progress);
        this.n = (PPSLabelView) findViewById(R.id.hiad_ad_label);
        this.o = (TextView) findViewById(R.id.hiad_ad_source);
        setFocusable(true);
    }

    private void a(boolean z, View view, ContentRecord contentRecord) {
        if (contentRecord == null) {
            hw.b("SmartScreenSplashView", "getMonitor, contentRecord is null.");
            return;
        }
        this.C.a(contentRecord.b());
        jx jxVarA = jv.a(getContext(), c(contentRecord), this.C, contentRecord, z);
        this.B = jxVarA;
        jxVarA.a(view);
        if (view instanceof x) {
            this.B.a(((x) view).getVideoView());
        }
        jv.a(contentRecord.o(), this.B);
    }

    private void a(com.huawei.openalliance.ad.views.interfaces.n nVar) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.VOLUME_CHANGED_ACTION);
        if (this.z == null) {
            this.z = new a(nVar);
        }
        as.a(getContext(), this.z, intentFilter);
    }

    private void a(Context context) {
        b(context);
        this.f21116a = fp.b(context.getApplicationContext());
        this.g = new oc(context.getApplicationContext(), this);
        this.t = this.f21116a.cr();
        this.C = new pc(context, new tc(context, 1));
    }

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<com.huawei.openalliance.ad.views.interfaces.n> f21120a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.huawei.openalliance.ad.views.interfaces.n nVar;
            if (intent == null || !Constants.VOLUME_CHANGED_ACTION.equals(intent.getAction()) || (nVar = this.f21120a.get()) == null || !(nVar instanceof x)) {
                return;
            }
            ((x) nVar).k();
        }

        public a(com.huawei.openalliance.ad.views.interfaces.n nVar) {
            this.f21120a = new WeakReference<>(nVar);
        }
    }

    public SmartScreenSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21117b = 0;
        this.p = 0;
        this.t = 0;
        this.u = "skip_btn_delay_id_" + hashCode();
        this.w = false;
        this.x = false;
        this.y = 1;
        this.A = 0.18f;
        a(context);
    }

    public SmartScreenSplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21117b = 0;
        this.p = 0;
        this.t = 0;
        this.u = "skip_btn_delay_id_" + hashCode();
        this.w = false;
        this.x = false;
        this.y = 1;
        this.A = 0.18f;
        a(context);
    }

    public SmartScreenSplashView(Context context) {
        super(context);
        this.f21117b = 0;
        this.p = 0;
        this.t = 0;
        this.u = "skip_btn_delay_id_" + hashCode();
        this.w = false;
        this.x = false;
        this.y = 1;
        this.A = 0.18f;
        a(context);
    }
}
