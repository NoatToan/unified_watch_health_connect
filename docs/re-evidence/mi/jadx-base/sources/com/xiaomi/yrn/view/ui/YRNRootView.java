package com.xiaomi.yrn.view.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.ReactRootView;
import com.facebook.yrn.manager.YRNReactContainerView;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import defpackage.ezr;
import defpackage.fv5;
import defpackage.fwr;
import defpackage.gur;
import defpackage.h1d;
import defpackage.iur;
import defpackage.jzr;
import defpackage.l1d;
import defpackage.m1d;
import defpackage.o1d;
import defpackage.our;
import defpackage.sk1;
import defpackage.v1d;
import defpackage.vwr;
import defpackage.xxr;
import defpackage.zxr;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class YRNRootView extends FrameLayout implements m1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public YRNReactContainerView f14555b;
    public o1d c;
    public v1d d;
    public View e;
    public View f;
    public gur g;
    public boolean h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f14556k;
    public Handler l;
    public l1d m;
    public fwr n;
    public our o;
    public final b p;
    public long q;

    public class a implements ReactRootView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f14557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fwr f14558b;
        public final /* synthetic */ YRNReactContainerView c;
        public final /* synthetic */ com.facebook.react.a d;

        public a(boolean z, fwr fwrVar, YRNReactContainerView yRNReactContainerView, com.facebook.react.a aVar) {
            this.f14557a = z;
            this.f14558b = fwrVar;
            this.c = yRNReactContainerView;
            this.d = aVar;
        }

        @Override // com.facebook.react.ReactRootView.b
        public void a() {
            ezr ezrVarC = ezr.c();
            String str = YRNRootView.this.i;
            boolean z = this.f14557a;
            ezrVarC.f(YRNTraceEvent.newEvent(str, z ? 1100 : 320, z ? "视图更新重建成功" : "初始化View层成功", this.f14558b.b(), YRNRootView.this.o != null ? YRNRootView.this.o.b() : YRNRootView.this.j, this.f14557a ? 0L : System.currentTimeMillis() - YRNRootView.this.q));
            if (this.c.getReactRootView() != null) {
                this.c.getReactRootView().k(this);
            }
            YRNRootView.this.B(true);
            YRNRootView.this.m();
            com.facebook.react.a aVar = this.d;
            if (aVar != null && YRNRootView.this.f14554a != null) {
                try {
                    aVar.S();
                    if (YRNRootView.this.f14554a.get() instanceof fv5) {
                        this.d.V(YRNRootView.this.f14554a.get(), (fv5) YRNRootView.this.f14554a.get());
                    } else {
                        this.d.U(YRNRootView.this.f14554a.get());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    ezr.c().f(YRNTraceEvent.newEvent(YRNRootView.this.i, 1200, e.toString(), null, null));
                }
            }
            YRNRootView.this.y();
            zxr.a("YRN_YRNV3_SDK", "YRNRootView.startToRenderReactRootView:finish render new reactRootView,module is " + YRNRootView.this.j);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), xxr.f39572a)) {
                zxr.a("YRN_YRNV3_SDK", "YRNRootView.onReceive: update broadcast");
                String stringExtra = intent.getStringExtra("appName");
                String stringExtra2 = intent.getStringExtra(RnReportConst.ApiReport.PARAM_MODULE);
                if (TextUtils.equals(stringExtra, YRNRootView.this.i) && TextUtils.equals(stringExtra2, YRNRootView.this.j) && !YRNRootView.this.j()) {
                    ezr ezrVarC = ezr.c();
                    YRNRootView yRNRootView = YRNRootView.this;
                    ezrVarC.f(YRNTraceEvent.newEvent(yRNRootView.i, 1100, "视图开始更新重建", yRNRootView.n != null ? YRNRootView.this.n.b() : null, YRNRootView.this.o != null ? YRNRootView.this.o.b() : YRNRootView.this.j));
                    YRNRootView.this.A();
                    YRNRootView.this.l();
                    zxr.a("YRN_YRNV3_SDK", "YRNRootView.onReceive: recreate instance,destroy old reactRootView,module is " + YRNRootView.this.j);
                    YRNRootView.this.D(YRNRootView.this.k(), true);
                }
            }
        }

        public /* synthetic */ b(YRNRootView yRNRootView, a aVar) {
            this();
        }
    }

    public YRNRootView(Activity activity, String str, String str2, Bundle bundle) {
        super(activity);
        this.h = false;
        this.p = new b(this, null);
        sk1.d(activity, "activity can not be null");
        iur.b(str, str2);
        this.i = str;
        this.j = str2;
        this.f14556k = bundle == null ? new Bundle() : bundle;
        this.f14554a = new WeakReference<>(activity);
        this.l = new Handler(Looper.getMainLooper());
        o();
        q();
        jzr.e().i(activity);
    }

    public void A() {
        o1d o1dVar = this.c;
        if (o1dVar != null) {
            o1dVar.showLoading();
        }
    }

    public void B(boolean z) {
        YRNReactContainerView yRNReactContainerView = this.f14555b;
        if (yRNReactContainerView != null) {
            yRNReactContainerView.setVisibility(z ? 0 : 4);
        }
    }

    public void C() {
        o1d o1dVar = this.c;
        if (o1dVar != null) {
            o1dVar.showRetry();
        }
    }

    public final synchronized void D(final YRNReactContainerView yRNReactContainerView, final boolean z) {
        this.l.post(new Runnable() { // from class: nyr
            @Override // java.lang.Runnable
            public final void run() {
                this.f28578a.u(yRNReactContainerView, z);
            }
        });
    }

    public com.facebook.react.a getReactInstanceManager() {
        fwr fwrVar = this.n;
        if (fwrVar != null) {
            return fwrVar.o();
        }
        return null;
    }

    public Bundle i(YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        return this.f14556k;
    }

    public boolean j() {
        if (this.e == null) {
            return false;
        }
        ezr.c().f(YRNTraceEvent.newEvent(this.i, 1100, "降级视图", null, this.j));
        return true;
    }

    public final YRNReactContainerView k() {
        YRNReactContainerView yRNReactContainerView = this.d != null ? new YRNReactContainerView(getContext(), this.d) : new YRNReactContainerView(getContext());
        addView(yRNReactContainerView, 0, new FrameLayout.LayoutParams(-1, -1));
        yRNReactContainerView.setVisibility(0);
        return yRNReactContainerView;
    }

    public void l() {
        YRNReactContainerView yRNReactContainerView = this.f14555b;
        if (yRNReactContainerView != null) {
            v1d v1dVar = this.d;
            if (v1dVar != null) {
                v1dVar.destroyReactRootView(yRNReactContainerView);
            }
            if (this.f14555b.getReactRootView() != null) {
                this.f14555b.destroy();
                removeView(this.f14555b);
            }
            this.f14555b = null;
        }
        l1d l1dVar = this.m;
        if (l1dVar != null) {
            l1dVar.g(this.i, this.n, this.o);
        }
    }

    public void m() {
        o1d o1dVar = this.c;
        if (o1dVar != null) {
            o1dVar.dismiss();
        }
    }

    public final Bundle n(fwr fwrVar) {
        YRNBundleInfo yRNBundleInfoM873clone;
        YRNBundleInfo yRNBundleInfo = null;
        if (fwrVar == null || fwrVar.b() == null) {
            yRNBundleInfoM873clone = null;
        } else {
            YRNBundleInfo yRNBundleInfoM873clone2 = fwrVar.b().m873clone();
            yRNBundleInfoM873clone = fwrVar.k(this.j) != null ? fwrVar.k(this.j).m873clone() : null;
            yRNBundleInfo = yRNBundleInfoM873clone2;
        }
        return i(yRNBundleInfo, yRNBundleInfoM873clone);
    }

    public final void o() {
        gur gurVarD = vwr.g().d(this.i);
        this.g = gurVarD;
        if (gurVarD != null) {
            this.h = gurVarD.t();
        } else {
            ezr.c().f(YRNTraceEvent.newEvent(this.i, 1200, "YRNRootView initConfig,config is null,mModule is " + this.j, null, this.f14556k));
        }
        this.m = jzr.e().d();
    }

    @Override // defpackage.m1d
    public void onLoadFailure(String str) {
        zxr.b("YRN_YRNV3_SDK", "YRNRootView.onLoadFailure:appName is" + this.i + ",module is " + this.j + ",message is " + str);
        if (j()) {
            return;
        }
        ezr.c().f(YRNTraceEvent.newEvent(this.i, 321, "初始化View层失败：" + str, null, this.j, System.currentTimeMillis() - this.q));
        this.l.post(new Runnable() { // from class: pyr
            @Override // java.lang.Runnable
            public final void run() {
                this.f30918a.t();
            }
        });
    }

    @Override // defpackage.m1d
    public void onLoadStart() {
    }

    @Override // defpackage.m1d
    public void onLoadSuccess(String str) {
        zxr.a("YRN_YRNV3_SDK", "YRNRootView.onLoadSuccess");
        if (j()) {
            return;
        }
        ezr.c().f(YRNTraceEvent.newEvent(this.i, 1100, "View 通道加载成功", null, this.j, System.currentTimeMillis() - this.q));
        D(this.f14555b, false);
    }

    public final void p() {
        h1d h1dVarA = jzr.e().a(this.i);
        if (h1dVarA != null) {
            if (!r()) {
                View downgradeView = h1dVarA.getDowngradeView(getContext(), this.f14556k);
                this.e = downgradeView;
                if (downgradeView != null) {
                    addView(downgradeView);
                } else {
                    zxr.b("YRN_YRNV3_SDK", "initContainerView: mDowngradeWebView is null");
                }
            }
            o1d loadingOrRetryViewProvider = h1dVarA.getLoadingOrRetryViewProvider(getContext(), this.f14556k);
            this.c = loadingOrRetryViewProvider;
            if (loadingOrRetryViewProvider != null && loadingOrRetryViewProvider.getView() != null) {
                this.f = this.c.getView();
                A();
                addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
                this.c.setOnRetryListener(new View.OnClickListener() { // from class: oyr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f29832a.s(view);
                    }
                });
            }
            this.d = h1dVarA.getReactRootViewProvider(getContext(), this.f14556k);
        }
    }

    public final void q() {
        this.f14556k.putString("appName", this.i);
        this.f14556k.putString(RnReportConst.ApiReport.PARAM_MODULE, this.j);
        p();
        if (j()) {
            m();
            return;
        }
        this.f14555b = k();
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        jzr.e().j(this.i, this.j);
        xxr.a(getContext(), this.p);
        v();
    }

    public boolean r() {
        gur gurVar = this.g;
        return gurVar != null && gurVar.s();
    }

    public final /* synthetic */ void s(View view) {
        w();
    }

    public final /* synthetic */ void t() {
        C();
        B(false);
    }

    public final /* synthetic */ void u(YRNReactContainerView yRNReactContainerView, boolean z) {
        l1d l1dVar;
        fwr fwrVarD;
        com.facebook.react.a aVarO;
        if (yRNReactContainerView == null || yRNReactContainerView.getReactRootView() == null || yRNReactContainerView.getReactRootView().getReactInstanceManager() != null || (l1dVar = this.m) == null || (fwrVarD = l1dVar.d(this.i, this.j)) == null || (aVarO = fwrVarD.o()) == null) {
            return;
        }
        if (yRNReactContainerView.getReactRootView() != null) {
            yRNReactContainerView.getReactRootView().f(new a(z, fwrVarD, yRNReactContainerView, aVarO));
        }
        Bundle bundleN = n(fwrVarD);
        if (fwrVarD.p()) {
            yRNReactContainerView.startReactApplication(aVarO, null, this.j, bundleN);
        } else if (this.h) {
            yRNReactContainerView.startReactApplication(aVarO, null, this.j, bundleN);
            this.m.i(this.i, fwrVarD);
        } else {
            our ourVarJ = fwrVarD.j(this.j);
            if (ourVarJ == null || ourVarJ.i() == null) {
                zxr.b("YRN_YRNV3_SDK", "YRNRootView.startToRenderReactRootView:bizInstance is null");
                C();
                return;
            } else {
                yRNReactContainerView.startReactApplication(aVarO, ourVarJ.i(), this.j, bundleN);
                this.m.i(this.i, ourVarJ);
                this.o = ourVarJ;
            }
        }
        this.n = fwrVarD;
        this.f14555b = yRNReactContainerView;
    }

    public void v() {
        if (j() || this.m == null) {
            return;
        }
        this.q = System.currentTimeMillis();
        ezr.c().f(YRNTraceEvent.newEvent(this.i, 32, "开始初始化View层", null, this.j));
        this.m.h(this.i, this.j, this);
    }

    public void w() {
        if (j() || this.m == null) {
            return;
        }
        fwr fwrVar = this.n;
        if (fwrVar == null || fwrVar.o() == null) {
            v();
            return;
        }
        if (this.n.p()) {
            this.n.o().D().handleReloadJS();
            return;
        }
        A();
        l();
        this.f14555b = k();
        if (this.h) {
            A();
            l();
            v();
        } else if (this.n.j(this.j) != null) {
            D(this.f14555b, true);
        } else {
            v();
        }
    }

    public boolean x() {
        zxr.a("YRN_YRNV3_SDK", "YRNRootView.onBackPress");
        View view = this.e;
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            if (webView.canGoBack()) {
                webView.goBack();
                return true;
            }
        }
        fwr fwrVar = this.n;
        if (fwrVar == null || fwrVar.o() == null) {
            return false;
        }
        this.n.o().P();
        return true;
    }

    public void y() {
    }

    public void z() {
        zxr.a("YRN_YRNV3_SDK", "YRNRootView.onDestroy");
        View view = this.e;
        if (view instanceof WebView) {
            ((WebView) view).destroy();
            removeView(this.e);
            this.e = null;
        }
        m();
        removeView(this.f);
        l();
        l1d l1dVar = this.m;
        if (l1dVar != null) {
            l1dVar.f(this.i, this.j, this);
        }
        xxr.c(getContext(), this.p);
    }
}
