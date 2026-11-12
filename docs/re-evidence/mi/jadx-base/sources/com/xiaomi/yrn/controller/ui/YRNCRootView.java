package com.xiaomi.yrn.controller.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.facebook.react.uimanager.SizeMonitoringFrameLayout;
import com.facebook.yrn.manager.YRNReactContainerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.view.ui.YRNRootView;
import defpackage.aje;
import defpackage.gvr;
import defpackage.hvr;
import defpackage.ivr;
import defpackage.zxr;

/* JADX INFO: loaded from: classes2.dex */
public class YRNCRootView extends YRNRootView {
    public static int x = 1;
    public static boolean y = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14534r;
    public String s;
    public boolean t;
    public int u;
    public final SizeMonitoringFrameLayout.a v;
    public final BroadcastReceiver w;

    public class a implements SizeMonitoringFrameLayout.a {
        public a() {
        }

        @Override // com.facebook.react.uimanager.SizeMonitoringFrameLayout.a
        public void a(int i, int i2, int i3, int i4) {
            YRNCRootView.this.R(i, i2);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.getAction().equals("rn_view_size_changed")) {
                return;
            }
            Context context2 = YRNCRootView.this.getContext();
            String str = YRNCRootView.this.i;
            int iH = hvr.h(context);
            int iG = hvr.g(context);
            YRNCRootView yRNCRootView = YRNCRootView.this;
            ivr.c(context2, str, iH, iG, yRNCRootView.s, yRNCRootView.f14534r);
        }
    }

    public YRNCRootView(Activity activity, String str, String str2, Bundle bundle) {
        super(activity, str, str2, bundle);
        this.s = "";
        this.t = false;
        this.u = 0;
        a aVar = new a();
        this.v = aVar;
        b bVar = new b();
        this.w = bVar;
        int i = x;
        x = i + 1;
        this.f14534r = i;
        this.f14556k.putInt("instance", i);
        this.s = this.f14556k.getString("url");
        YRNReactContainerView yRNReactContainerView = this.f14555b;
        if (yRNReactContainerView != null) {
            yRNReactContainerView.getReactRootView().setOnSizeChangedListener(aVar);
            this.u = this.f14555b.getReactRootView().hashCode();
            Q(getContext(), bVar);
        }
        if (y) {
            zxr.a("YRNCRootView", "YRNCRootView.isWorkaround=true");
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: qvr
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    this.f31895a.L(view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
        }
    }

    public static void Q(Context context, BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("rn_view_size_changed");
        aje.b(context).c(broadcastReceiver, intentFilter);
    }

    public static void S(Context context, BroadcastReceiver broadcastReceiver) {
        aje.b(context).e(broadcastReceiver);
    }

    public static void setIsWorkaround(boolean z) {
        y = z;
    }

    public final void J() {
        YRNReactContainerView yRNReactContainerView = this.f14555b;
        if (yRNReactContainerView == null || yRNReactContainerView.getReactRootView() == null || this.f14555b.getReactRootView().hashCode() == this.u) {
            return;
        }
        zxr.a("YRNCRootView", "onResume: setOnSizeChangedListener,reactRootViewHashCode=" + this.u + ",newHashCode =" + this.f14555b.getReactRootView().hashCode());
        this.f14555b.getReactRootView().setOnSizeChangedListener(this.v);
        this.u = this.f14555b.getReactRootView().hashCode();
        final int measuredWidth = this.f14555b.getReactRootView().getMeasuredWidth();
        final int measuredHeight = this.f14555b.getReactRootView().getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        post(new Runnable() { // from class: rvr
            @Override // java.lang.Runnable
            public final void run() {
                this.f32953a.K(measuredWidth, measuredHeight);
            }
        });
    }

    public final /* synthetic */ void K(int i, int i2) {
        try {
            if (isAttachedToWindow()) {
                R(i, i2);
                zxr.a("YRNCRootView", "triggerOnSizeChanged,width=" + i + ",height =" + i2);
            }
        } catch (Throwable th) {
            zxr.b("YRNCRootView", "triggerOnSizeChanged,width=" + i + ",height =" + i2 + ",error=" + Log.getStackTraceString(th));
        }
    }

    public final /* synthetic */ void L(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        J();
    }

    public void M() {
        this.t = false;
        View view = this.e;
        if (view instanceof WebView) {
            ((WebView) view).onPause();
        } else {
            ivr.e(this.i, this.f14534r, this.s);
        }
    }

    public void N() {
        this.t = true;
        View view = this.e;
        if (view instanceof WebView) {
            ((WebView) view).onResume();
        } else {
            ivr.d(this.i, this.f14534r, this.s);
        }
        if (y) {
            J();
        }
    }

    public void O() {
        this.t = true;
        if (this.e != null) {
            return;
        }
        ivr.f(this.i, this.f14534r, this.s);
    }

    public void P() {
        this.t = false;
        if (this.e != null) {
            return;
        }
        ivr.g(this.i, this.f14534r, this.s);
    }

    public final void R(int i, int i2) {
        boolean zJ = hvr.j(getContext());
        float f = hvr.f(getContext(), this.s);
        int iH = hvr.h(getContext());
        if (zJ) {
            if (f < 1.0f && i == iH) {
                return;
            }
        } else if (f == 1.0f && i < iH) {
            return;
        }
        ivr.c(getContext(), this.i, i, i2, this.s, this.f14534r);
    }

    public int getInstanceId() {
        return this.f14534r;
    }

    @Override // com.xiaomi.yrn.view.ui.YRNRootView
    public Bundle i(YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        YRNReactContainerView yRNReactContainerView = this.f14555b;
        int measuredWidth = yRNReactContainerView != null ? yRNReactContainerView.getMeasuredWidth() : 0;
        YRNReactContainerView yRNReactContainerView2 = this.f14555b;
        gvr.a(getContext(), this.i, this.s, this.f14556k, measuredWidth, yRNReactContainerView2 != null ? yRNReactContainerView2.getMeasuredHeight() : 0, yRNBundleInfo, yRNBundleInfo2);
        return this.f14556k;
    }

    @Override // com.xiaomi.yrn.view.ui.YRNRootView
    public void y() {
        super.y();
        if (this.t) {
            ivr.d(this.i, this.f14534r, this.s);
        }
    }

    @Override // com.xiaomi.yrn.view.ui.YRNRootView
    public void z() {
        super.z();
        zxr.a("YRNCRootView", LifecycleConstantKt.ON_DESTROY);
        S(getContext(), this.w);
    }
}
