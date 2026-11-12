package com.huawei.openalliance.ad.views;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.Toast;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.by;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.RewardKeys;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.RewardEvent;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.jm;
import com.huawei.openalliance.ad.nt;
import com.huawei.openalliance.ad.nx;
import com.huawei.openalliance.ad.om;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pn;
import com.huawei.openalliance.ad.pw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.ay;
import com.huawei.openalliance.ad.utils.az;
import com.huawei.openalliance.ad.utils.ba;
import com.huawei.openalliance.ad.utils.bi;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.uz;
import com.huawei.openalliance.ad.vb;
import com.huawei.openalliance.ad.vc;
import com.huawei.openalliance.ad.vf;
import com.huawei.openalliance.ad.vg;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import com.huawei.openalliance.ad.vm;
import com.huawei.openalliance.ad.vt;

/* JADX INFO: loaded from: classes12.dex */
public class PPSRewardTemplateView extends AutoScaleSizeRelativeLayout implements jm.a, IViewLifeCycle, com.huawei.openalliance.ad.views.interfaces.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jm f20981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f20983c;
    private com.huawei.openalliance.ad.inter.data.i d;
    private om e;
    private ContentRecord f;
    private AdLandingPageData g;
    private PPSWebView h;
    private int i;
    private u j;
    private Dialog k;
    private Dialog l;
    private Dialog m;
    private IRewardAdStatusListener n;
    private com.huawei.openalliance.ad.views.interfaces.ab o;
    private az p;
    private ba q;
    private IRemoteCreator r;
    private by s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void addNonwifiActionListener(INonwifiActionListener iNonwifiActionListener) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public AppDownloadButton getAppDownloadButton() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public az getAppointJs() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public boolean h() {
        return false;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void l() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void removeRewardAdStatusListener() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setContentRecord(ContentRecord contentRecord) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setTemplateErrorListener(com.huawei.openalliance.ad.views.interfaces.ab abVar) {
        this.o = abVar;
    }

    public void setPopUpView(u uVar) {
        this.j = uVar;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setOrientation(int i) {
        this.i = i;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void setNonwifiDialog(Dialog dialog) {
        this.l = dialog;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void setDownloadDialog(Dialog dialog) {
        this.m = dialog;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        d(RewardMethods.RESUME_VIEW);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        d(RewardMethods.PAUSE_VIEW);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jm jmVar = this.f20981a;
        if (jmVar != null) {
            jmVar.j();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void onEvent(RewardEvent rewardEvent) {
        a(rewardEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("PPSRewardTView", "onDetach");
        jm jmVar = this.f20981a;
        if (jmVar != null) {
            jmVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.b("PPSRewardTView", "onAttach");
        jm jmVar = this.f20981a;
        if (jmVar != null) {
            jmVar.h();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void n() {
        this.k = null;
        b(RewardMethods.SHOW_CLOSE_CONFIRM);
        resumeView();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void m() {
        this.k = null;
        v();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void k() {
        if (this.h == null) {
            hw.b("PPSRewardTView", "webview is null");
            return;
        }
        hw.b("PPSRewardTView", "showWebView");
        if (!this.w) {
            this.h.loadPage();
        }
        this.w = true;
        this.h.onResume();
        this.h.setVisibility(0);
        this.h.setIsInLandingpage(true);
        this.h.bringToFront();
        this.h.setRealOpenTime(as.c());
        if ("1".equals(this.d.ai())) {
            pa.i(this.d.getCtrlSwitchs());
        }
        if (nx.a(this.f)) {
            ((PPSRewardActivity) getContext()).setRequestedOrientation(1);
        }
        if (this.y) {
            this.y = false;
            Toast.makeText(getContext(), R.string.hiad_third_party_page_hint, 0).show();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void j() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSRewardTemplateView.1
            @Override // java.lang.Runnable
            public void run() {
                if (PPSRewardTemplateView.this.l == null || !PPSRewardTemplateView.this.l.isShowing()) {
                    return;
                }
                PPSRewardTemplateView.this.l.dismiss();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void i() {
        dq.a(new vm(this));
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public WebSettings getWebViewSettings() {
        PPSWebView pPSWebView = this.h;
        if (pPSWebView != null) {
            return pPSWebView.getSettings();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public u getPopUpView() {
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public Dialog getNonwifiDialog() {
        return this.l;
    }

    public Dialog getDownloadDialog() {
        return this.m;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void g() {
        if (this.h != null && bi.e(this.d.I()) && this.w) {
            this.h.onStop();
        }
        d(RewardMethods.STOP_VIEW);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void f() {
        setNonwifiDialog(null);
        v();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void e() {
        setNonwifiDialog(null);
        this.v = false;
        b("showNonWifiPlay");
        resumeView();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        d(RewardMethods.DESTROY_VIEW);
        PPSWebView pPSWebView = this.h;
        if (pPSWebView != null) {
            pPSWebView.destroy();
        }
        Dialog dialog = this.k;
        if (dialog != null) {
            dialog.dismiss();
            this.k = null;
        }
        by byVar = this.s;
        if (byVar != null) {
            byVar.b();
            this.s = null;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void d() {
        by byVar = this.s;
        if (byVar != null) {
            byVar.f(RewardMethods.PERFORM_DOWNLOAD, null);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public boolean c(boolean z) {
        String str;
        if (getDownloadDialog() != null) {
            hw.b("PPSRewardTView", "download dialog is displaying.");
            return true;
        }
        if (this.j == null) {
            str = "show download dialog, popupView is null.";
        } else {
            if (!this.d.ag()) {
                hw.b("PPSRewardTView", "show download confirm dialog.");
                boolean zA = this.j.a();
                if (zA) {
                    pauseView();
                    AlertDialog dialog = this.j.getDialog();
                    this.m = dialog;
                    if (dialog != null) {
                        dialog.setOnCancelListener(new uz(this));
                    }
                    c("127");
                }
                return zA;
            }
            str = "show download dialog, hasRewarded.";
        }
        hw.c("PPSRewardTView", str);
        return false;
    }

    public void c(String str) {
        om omVar = this.e;
        if (omVar != null) {
            omVar.a(str, this.f);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void c() {
        by byVar = this.s;
        if (byVar != null) {
            byVar.f(RewardMethods.SHOW_CLOSE, null);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void b(boolean z) {
        if (this.s != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(RewardKeys.IS_FOREGROUND, z);
            this.s.f(RewardMethods.ACTIVITY_SWITCH, bundle);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void b(String str) {
        a(str, (String) null);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b(long j, int i) {
        hw.b("PPSRewardTView", "onViewPhysicalShowEnd, duration: %s", Long.valueOf(j));
        if (t() || this.s == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("show_duration", j);
        bundle.putInt("show_ratio", i);
        this.s.f(RewardMethods.VIEW_PHY_END, bundle);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b() {
        hw.b("PPSRewardTView", "onViewPhyShowStart.");
        if (t()) {
            return;
        }
        u();
        if (this.h != null && this.e.b(this.d) && this.w) {
            this.h.onResume();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void addRewardAdStatusListener(IRewardAdStatusListener iRewardAdStatusListener) {
        if (iRewardAdStatusListener == null) {
            return;
        }
        this.n = iRewardAdStatusListener;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public boolean a(int i, MaterialClickInfo materialClickInfo) {
        om omVar = this.e;
        if (omVar != null) {
            return omVar.a(i, materialClickInfo);
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(boolean z, String str) {
        if (getDownloadDialog() != null) {
            getDownloadDialog().dismiss();
            a(RewardMethods.SHOW_DOWNLOAD_CONFIRM, str);
            if (z) {
                resumeView();
            }
            setDownloadDialog(null);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(boolean z) {
        if (this.s == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(RewardKeys.IS_WIFI, z);
        bundle.putBoolean(RewardKeys.AD_SHOW_MOBILE_ALERT, this.d.ak());
        bundle.putBoolean(RewardKeys.NEED_REMIND_DATA, this.v);
        this.s.f(RewardMethods.NET_CHANGE, bundle);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void a(String str, RewardItem rewardItem) {
        if (this.e == null) {
            hw.c("PPSRewardTView", "notify reward, rewardPresenter is null");
            return;
        }
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar != null && rewardItem != null) {
            iVar.setRewardItem(rewardItem);
        }
        this.e.b(str, this.d, this.n);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(String str) {
        if (this.d == null || this.f20982b == null || getPopUpView() == null || TextUtils.isEmpty(str)) {
            hw.c("PPSRewardTView", "invalid parameter");
            return;
        }
        setContentRecord(pw.a(this.d));
        getPopUpView();
        u.a(this.f20982b, str, this.f);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(Integer num) {
        com.huawei.openalliance.ad.inter.data.i iVar;
        if (num == null || (iVar = this.d) == null || this.e == null) {
            return;
        }
        int minEffectiveShowRatio = iVar.getMinEffectiveShowRatio();
        long minEffectiveShowTime = this.d.getMinEffectiveShowTime();
        boolean zA = com.huawei.openalliance.ad.utils.c.a(this.d.d(), num);
        if (!this.d.X() || (zA && !this.d.b())) {
            hw.b("PPSRewardTView", "reportAdShowEvent, source: %s", num);
            om omVar = this.e;
            if (omVar != null) {
                omVar.a(minEffectiveShowTime, minEffectiveShowRatio, num);
            }
            if (zA) {
                this.d.a(true);
            }
            if (this.d.X()) {
                return;
            }
            this.d.g(true);
        }
    }

    public void a(RewardEvent rewardEvent, boolean z) {
        if (this.s != null) {
            Bundle bundle = new Bundle();
            bundle.putString("event_type", rewardEvent.a());
            bundle.putBoolean(RewardKeys.CLOSE_BTN_CLICKED, z);
            this.s.f(RewardMethods.ON_EVENT, bundle);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.k
    public void a(IRewardAd iRewardAd, boolean z) {
        if (iRewardAd instanceof com.huawei.openalliance.ad.inter.data.i) {
            if (this.r == null) {
                hw.c("PPSRewardTView", "remote creator is null");
                com.huawei.openalliance.ad.views.interfaces.ab abVar = this.o;
                if (abVar != null) {
                    abVar.a(-4);
                    return;
                }
                return;
            }
            com.huawei.openalliance.ad.inter.data.i iVar = (com.huawei.openalliance.ad.inter.data.i) iRewardAd;
            this.d = iVar;
            ContentRecord contentRecordA = pw.a(iVar);
            this.f = contentRecordA;
            this.g = new AdLandingPageData(contentRecordA, this.f20982b, true);
            this.e.c(this.d);
            by byVar = new by(this.f20982b, iVar, this);
            this.s = byVar;
            View viewA = this.e.a(this.r, byVar, this.f, this.d);
            if (viewA != null) {
                addView(viewA);
                dk.a(this.f20982b, this.i, this.f20983c);
                a(iVar);
                o();
                return;
            }
            hw.c("PPSRewardTView", "remote view is null.");
            com.huawei.openalliance.ad.views.interfaces.ab abVar2 = this.o;
            if (abVar2 != null) {
                abVar2.a(-3);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a(long j, int i) {
        by byVar;
        if (t() || (byVar = this.s) == null) {
            return;
        }
        byVar.f(RewardMethods.VIEW_END_RECORD, null);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void a(int i, Bundle bundle) {
        int iA;
        if (this.n == null) {
            hw.c("PPSRewardTView", "onStatusChange listener empty");
            return;
        }
        hw.b("PPSRewardTView", "onStatus change: %s", Integer.valueOf(i));
        if (i == 1) {
            this.n.onAdShown();
            return;
        }
        if (i == 2) {
            this.n.onAdClicked();
            return;
        }
        if (i == 3) {
            this.n.onAdCompleted();
            return;
        }
        if (i == 4) {
            this.n.onAdClosed();
            return;
        }
        if (i != 6) {
            hw.b("PPSRewardTView", "on status change, fall to default.");
            return;
        }
        int i2 = -1;
        if (bundle != null) {
            gr grVar = new gr(bundle);
            int iA2 = grVar.a("error_code", -1);
            iA = grVar.a("error_extra", -1);
            i2 = iA2;
        } else {
            iA = -1;
        }
        this.n.onAdError(i2, iA);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.j
    public void a(int i) {
        if (this.k == null) {
            if (i == -1) {
                i = this.u;
            }
            Dialog dialogA = com.huawei.openalliance.ad.utils.ac.a(getContext(), (String) null, getResources().getQuantityString(R.plurals.hiad_reward_close_dialog_message, i, Integer.valueOf(i)), getResources().getString(R.string.hiad_reward_close_dialog_continue), getResources().getString(R.string.hiad_reward_close_dialog_close), new vf(this));
            this.k = dialogA;
            dialogA.setOnCancelListener(new vg(this));
            pauseView();
        }
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a() {
        by byVar;
        if (t() || (byVar = this.s) == null) {
            return;
        }
        byVar.f(RewardMethods.VIEW_START_RECORD, null);
    }

    private void v() {
        by byVar = this.s;
        if (byVar != null) {
            byVar.f("handleClose", null);
        }
    }

    private void u() {
        long jC = as.c();
        String strValueOf = String.valueOf(jC);
        hw.b("PPSRewardTView", "updateShowId: %s", strValueOf);
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar != null) {
            iVar.g(false);
            this.d.a(false);
            this.d.h(strValueOf);
            this.d.c(jC);
        }
        om omVar = this.e;
        if (omVar != null) {
            omVar.a(strValueOf);
        }
        by byVar = this.s;
        if (byVar != null) {
            byVar.a(jC);
            Bundle bundle = new Bundle();
            bundle.putLong(RewardKeys.SHOW_TIME, jC);
            this.s.f(RewardMethods.VIEW_PHY_START, bundle);
        }
        AdLandingPageData adLandingPageData = this.g;
        if (adLandingPageData == null || this.h == null) {
            return;
        }
        adLandingPageData.c(strValueOf);
        this.g.a(jC);
        this.h.setAdLandingPageData(this.g);
    }

    private boolean t() {
        if (this.d != null) {
            return false;
        }
        hw.b("PPSRewardTView", "ad is null! please register first");
        return true;
    }

    private void s() {
        ba baVar = new ba(this.f20982b, this.g, new AppDownloadButton(this.f20982b), this.h, new vt(this));
        this.q = baVar;
        baVar.a(1);
        this.h.addJavascriptInterface(this.q, Constants.PPS_JS_NAME);
        this.h.addJavascriptInterface(new ay(getContext(), pn.a(this.g)), Constants.LANDING_JS_NAME);
        az azVar = new az(getContext(), pn.a(this.g), this.h);
        this.p = azVar;
        this.h.addJavascriptInterface(azVar, Constants.APPOINT_JS_NAME);
    }

    private void r() {
        AdLandingPageData adLandingPageData = this.g;
        if (adLandingPageData != null && !dg.b(adLandingPageData.K()) && this.g.K().startsWith(Constants.SDK_EMP)) {
            hw.b("PPSRewardTView", "dsl ad, not need handleWebView");
            return;
        }
        PPSWebView pPSWebView = this.h;
        if (pPSWebView != null) {
            pPSWebView.setVisibility(8);
            this.h.setAdLandingPageData(this.g);
            s();
            if (this.e.b(this.d) && this.x) {
                this.h.loadPage();
                this.w = true;
            }
        }
    }

    private void q() {
        hw.b("PPSRewardTView", "init pop-up");
        if (bi.g(this.d.I()) || this.d.getAppInfo() == null) {
            hw.b("PPSRewardTView", "appInfo is null or web, skip init popup");
            return;
        }
        boolean zU = fp.b(this.f20982b).U();
        this.j = new u(getContext(), this.i);
        getPopUpView().setAdPopupData(this.g);
        getPopUpView().setPopUpClickListener(new vc(this, zU));
        getPopUpView().setDismissListener(new vb(this));
    }

    private void o() {
        if (nx.a(this.f)) {
            this.x = false;
            this.h.setWebViewBackgroundColor(getResources().getColor(R.color.hiad_black));
            this.h.d();
        }
        if ("4".equals(this.f.af())) {
            this.x = false;
        }
        r();
        q();
        jm jmVar = this.f20981a;
        if (jmVar != null) {
            jmVar.b(this.d.getMinEffectiveShowTime(), this.d.getMinEffectiveShowRatio());
        }
    }

    private void d(String str) {
        by byVar = this.s;
        if (byVar != null) {
            byVar.f(str, null);
        }
    }

    private void a(String str, String str2) {
        by byVar = this.s;
        if (byVar != null) {
            byVar.a(str, false, str2);
        }
    }

    private void a(com.huawei.openalliance.ad.inter.data.i iVar) {
        int iAj = (int) iVar.aj();
        this.t = iAj;
        this.u = nx.a(this.f20982b, iAj);
        this.x = fp.b(this.f20982b).Y();
        this.y = this.e.c();
    }

    private void a(Context context) {
        this.f20982b = context;
        this.e = new nx(context, this);
        this.f20981a = new jm(this, this);
        inflate(context, R.layout.hiad_reward_v3_container_layout, this);
        PPSWebView pPSWebView = (PPSWebView) findViewById(R.id.reward_webview);
        this.h = pPSWebView;
        pPSWebView.setPPSWebEventCallback(nt.a());
        this.f20983c = (ViewGroup) findViewById(R.id.reward_layout);
        this.r = com.huawei.openalliance.ad.e.a(context.getApplicationContext());
    }

    public PPSRewardTemplateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 1;
        this.v = true;
        this.w = false;
        this.x = true;
        this.y = false;
        a(context);
    }

    public PPSRewardTemplateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 1;
        this.v = true;
        this.w = false;
        this.x = true;
        this.y = false;
        a(context);
    }

    public PPSRewardTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 1;
        this.v = true;
        this.w = false;
        this.x = true;
        this.y = false;
        a(context);
    }

    public PPSRewardTemplateView(Context context) {
        super(context);
        this.i = 1;
        this.v = true;
        this.w = false;
        this.x = true;
        this.y = false;
        a(context);
    }
}
