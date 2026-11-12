package com.xmlywind.sdk.splash;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.models.AdStatus;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.sdk.common.mta.PointEntitySigmobError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements com.xmlywind.sdk.base.a.b.a, f.a {
    private final LoadAdRequest a;
    private final WeakReference<Activity> c;
    private Handler d;
    private f e;
    private Context f;
    private b g;
    private int h;
    private AdStatus i;
    private SplashAdView j;
    private BaseAdUnit k;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private final Runnable b = new Runnable() { // from class: com.xmlywind.sdk.splash.g.1
        @Override // java.lang.Runnable
        public void run() {
            if (g.this.d != null) {
                g.this.d.removeCallbacksAndMessages(null);
                if (g.this.j == null) {
                    return;
                }
                if (g.this.h <= 0) {
                    g.this.j.setDuration(0);
                    g gVar = g.this;
                    gVar.a((String) null, PointCategory.COMPLETE, gVar.k, g.this.a.getPlacementId());
                    return;
                }
                g.this.j.setDuration(g.this.h);
                g.d(g.this);
                if (g.this.n != 2 && g.this.o > 0 && ((g.this.m - g.this.h) * 100) / g.this.m >= g.this.o) {
                    SigmobLog.e("performAdClick: " + (((g.this.m - g.this.h) * 100) / g.this.m));
                    g.this.j.d();
                }
                g.this.d.postDelayed(g.this.b, 1000L);
            }
        }
    };

    public g(Activity activity, LoadAdRequest loadAdRequest, b bVar) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 23 && (rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets()) != null) {
            com.xmlywind.sdk.common.a.n().a(rootWindowInsets);
        }
        this.f = activity.getApplicationContext();
        this.c = new WeakReference<>(activity);
        this.i = AdStatus.AdStatusNone;
        this.d = new Handler(Looper.getMainLooper());
        this.a = loadAdRequest;
        this.g = bVar;
        this.e = new f(this);
        if (1 == com.xmlywind.sdk.common.a.n().Q().intValue()) {
            return;
        }
        h();
    }

    private void a(final int i, final String str, final String str2, int i2, String str3) {
        t.a(PointCategory.SERVER_ERROR, i2, str3, (BaseAdUnit) null, new t.a() { // from class: com.xmlywind.sdk.splash.g.2
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmobError) {
                    PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                    pointEntitySigmobError.setRequest_id(str2);
                    pointEntitySigmobError.setPlacement_id(str);
                    pointEntitySigmobError.setAdtype(String.valueOf(i));
                }
            }
        });
    }

    private void a(int i, String str, boolean z) {
        SplashAdView splashAdView;
        this.i = AdStatus.AdStatusNone;
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
        if (!j() && (splashAdView = this.j) != null) {
            splashAdView.a();
        }
        b bVar = this.g;
        if (bVar != null) {
            if (z) {
                bVar.onSplashAdLoadFail(i, str);
            } else {
                bVar.onSplashAdFailToPresent(i, str);
            }
            this.g = null;
        }
        f fVar = this.e;
        if (fVar != null) {
            fVar.c(this.k);
        }
        com.xmlywind.sdk.base.common.d.f();
        com.xmlywind.sdk.base.common.d.g();
    }

    private void a(String str, BaseAdUnit baseAdUnit, final String str2, final int i, String str3) {
        t.a(str, i, str3, baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.splash.g.3
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmobError) {
                    PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                    pointEntitySigmobError.setPlacement_id(str2);
                    pointEntitySigmobError.setAdtype(String.valueOf(2));
                    if (i == SigmobError.REQUEST_AD_SLOT_NOT_MATCH__AD_TYPE.getErrorCode()) {
                        pointEntitySigmobError.setUrl(g.this.k.getMaterial().image_src);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, BaseAdUnit baseAdUnit, String str3) {
        a(str, str2, baseAdUnit, str3, (String) null);
    }

    private void a(String str, String str2, BaseAdUnit baseAdUnit, final String str3, final String str4) {
        t.a(str2, str, baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.splash.g.4
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setPlacement_id(str3);
                    pointEntitySigmob.setAdtype(String.valueOf(2));
                    pointEntitySigmob.setRequest_id(str4);
                }
            }
        });
    }

    private boolean a(Context context, BaseAdUnit baseAdUnit) {
        if (baseAdUnit == null) {
            return false;
        }
        SplashAdView splashAdView = new SplashAdView(context);
        this.j = splashAdView;
        splashAdView.b();
        this.j.setShowAppLogo(this.l != 0);
        return this.j.a(baseAdUnit);
    }

    public static /* synthetic */ int d(g gVar) {
        int i = gVar.h;
        gVar.h = i - 1;
        return i;
    }

    private Activity i() {
        WeakReference<Activity> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean j() {
        Map<String, Object> options = this.a.getOptions();
        if (options != null && options.get(LoadAdRequest.SPLASH_DISABLE_AD_HIDE) != null) {
            try {
                return ((Boolean) options.get(LoadAdRequest.SPLASH_DISABLE_AD_HIDE)).booleanValue();
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
        return false;
    }

    private void k() {
        SplashAdView splashAdView;
        f fVar = this.e;
        if (fVar != null) {
            d dVar = fVar.e;
            if (dVar != null) {
                dVar.b(this.f, 0, this.k);
            }
            this.e.c(this.k);
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
        if (!j() && (splashAdView = this.j) != null) {
            splashAdView.a();
        }
        this.g = null;
        this.j = null;
        com.xmlywind.sdk.base.common.d.f();
        com.xmlywind.sdk.base.common.d.g();
    }

    @Override // com.xmlywind.sdk.base.common.k.c
    public void a() {
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(int i, String str, String str2, LoadAdRequest loadAdRequest) {
        a("0", PointCategory.RESPOND, (BaseAdUnit) null, this.a.getPlacementId(), str2);
        a("request", (BaseAdUnit) null, loadAdRequest.getPlacementId(), i, str);
        if (i != SigmobError.ERROR_SIGMOB_NETWORK.getErrorCode()) {
            a(loadAdRequest.getAdType(), loadAdRequest.getPlacementId(), str2, i, str);
        }
        a(i, str, true);
    }

    public void a(Activity activity) {
        if (this.j == null || activity != i()) {
            return;
        }
        this.j.e();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null && this.f != null) {
            viewGroup.removeAllViews();
            if (a(viewGroup.getContext(), this.k)) {
                viewGroup.addView(this.j, new FrameLayout.LayoutParams(-1, -1));
                this.e.a(this.f, this.k, (Bundle) null);
                this.h = this.e.e.d();
                this.n = this.e.e.f();
                this.o = this.e.e.g();
                this.j.setDuration(this.h);
                if (this.j.c()) {
                    return;
                }
            }
        }
        c();
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit) {
        SigmobLog.d(" onInterstitialLoadstart");
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit, String str) {
        SigmobError sigmobError = SigmobError.ERROR_SIGMOB_FILE_DOWNLOAD;
        a(sigmobError.getErrorCode(), str, true);
        a(PointCategory.LOAD, baseAdUnit, (String) null, sigmobError.getErrorCode(), str);
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(List<BaseAdUnit> list, LoadAdRequest loadAdRequest) {
        Context context;
        if (list == null || list.size() <= 0) {
            a("0", PointCategory.RESPOND, (BaseAdUnit) null, this.a.getPlacementId(), this.a.getRequestId());
            String placementId = loadAdRequest.getPlacementId();
            SigmobError sigmobError = SigmobError.ERROR_REQUEST_NEED_AD_SLOTS_INFO;
            a("request", (BaseAdUnit) null, placementId, sigmobError.getErrorCode(), sigmobError.getMessage());
            a(sigmobError.getErrorCode(), sigmobError.getMessage(), true);
            return;
        }
        BaseAdUnit baseAdUnit = list.get(0);
        a("1", PointCategory.RESPOND, baseAdUnit, this.a.getPlacementId());
        this.k = baseAdUnit;
        f fVar = this.e;
        if (fVar == null || (context = this.f) == null) {
            return;
        }
        fVar.a(context, (Map<String, Object>) null, baseAdUnit);
    }

    public void a(boolean z) {
        String placementId;
        String str;
        f fVar;
        Context context;
        if (z) {
            this.a.setRequest_scene_type(com.xmlywind.sdk.rewardVideoAd.a.SplashCloseRequest.a().intValue());
            placementId = this.a.getPlacementId();
            str = "play";
        } else {
            this.i = AdStatus.AdStatusLoading;
            Object objD = com.xmlywind.sdk.common.utils.d.d(com.xmlywind.sdk.common.utils.d.e());
            if (objD instanceof BaseAdUnit) {
                BaseAdUnit baseAdUnit = (BaseAdUnit) objD;
                if (baseAdUnit.getAd() != null) {
                    com.xmlywind.sdk.common.utils.d.b(com.xmlywind.sdk.common.utils.d.e());
                    this.k = baseAdUnit;
                    if (g() && (fVar = this.e) != null && (context = this.f) != null) {
                        fVar.a(context, (Map<String, Object>) null, this.k);
                        return;
                    }
                }
            }
            this.a.setRequest_scene_type(com.xmlywind.sdk.rewardVideoAd.a.NormalRequest.a().intValue());
            placementId = this.a.getPlacementId();
            str = PointCategory.INIT;
        }
        a(str, "request", (BaseAdUnit) null, placementId);
        com.xmlywind.sdk.base.a.b.a(SDKConfig.sharedInstance().getAdsUrl(), this.a, this);
    }

    @Override // com.xmlywind.sdk.base.common.k.c
    public void b() {
        BaseBroadcastReceiver.a(this.f, this.k.getUuid(), IntentActions.ACTION_INTERSTITIAL_DISMISS);
    }

    public void b(Activity activity) {
        if (this.j == null || activity != i()) {
            return;
        }
        this.j.f();
        if (this.d == null) {
            this.d = new Handler(Looper.getMainLooper());
        }
        this.d.post(this.b);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void b(BaseAdUnit baseAdUnit) {
        SigmobLog.d(" onInterstitialLoaded");
        if (this.i == AdStatus.AdStatusClose) {
            SigmobLog.d(" next load");
            com.xmlywind.sdk.common.utils.d.a(baseAdUnit, com.xmlywind.sdk.common.utils.d.e());
        }
        if (this.i != AdStatus.AdStatusLoading) {
            return;
        }
        if (!(1 == com.xmlywind.sdk.common.a.n().Q().intValue())) {
            h();
            return;
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.i = AdStatus.AdStatusReady;
        b bVar = this.g;
        if (bVar != null) {
            bVar.onSplashAdLoadSuccess();
        }
    }

    @Override // com.xmlywind.sdk.splash.f.a
    public void c() {
        BaseAdUnit baseAdUnit = this.k;
        SigmobError sigmobError = SigmobError.ERROR_SIGMOB_SPLASH_UNSUPPORT_RESOURCE;
        a("play", baseAdUnit, (String) null, sigmobError.getErrorCode(), "");
        a(sigmobError.getErrorCode(), sigmobError.getMessage(), false);
        k();
    }

    public void c(Activity activity) {
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void c(BaseAdUnit baseAdUnit) {
        this.i = AdStatus.AdStatusPlaying;
        com.xmlywind.sdk.base.common.d.b(baseAdUnit);
        if (this.j.getDuration() > 0 && this.j.getDuration() < this.h) {
            this.h = this.j.getDuration();
        }
        SplashAdView splashAdView = this.j;
        if (splashAdView != null) {
            splashAdView.setDuration(this.h);
            this.j.setVisibility(0);
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.onSplashAdSuccessPresentScreen();
        }
        if (this.d == null) {
            this.d = new Handler(Looper.getMainLooper());
        }
        this.m = this.h;
        this.d.post(this.b);
    }

    @Override // com.xmlywind.sdk.splash.f.a
    public void d() {
        d dVar;
        f fVar = this.e;
        if (fVar != null && (dVar = fVar.e) != null) {
            dVar.c(this.f, 0, this.k);
        }
        this.j.setDuration(0);
        b bVar = this.g;
        if (bVar != null) {
            bVar.onSplashAdSkip();
        }
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void d(BaseAdUnit baseAdUnit) {
        this.i = AdStatus.AdStatusClick;
        b bVar = this.g;
        if (bVar != null) {
            bVar.onSplashAdClicked();
        }
    }

    @Override // com.xmlywind.sdk.splash.f.a
    public void e() {
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void e(BaseAdUnit baseAdUnit) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.onSplashClosed();
        }
        k();
        this.i = AdStatus.AdStatusClose;
        com.xmlywind.sdk.base.common.d.c(baseAdUnit);
        a(true);
    }

    @Override // com.xmlywind.sdk.splash.f.a
    public void f() {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public boolean g() {
        boolean z;
        try {
            if (this.i != AdStatus.AdStatusReady && this.k == null) {
                return false;
            }
            boolean zCanRead = new File(this.k.getSplashFilePath()).canRead();
            if (this.k.getAd().expired_time.intValue() != 0) {
                if (System.currentTimeMillis() - this.k.getCreate_time() > this.k.getAdExpiredTime().intValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            return zCanRead && !z;
        } catch (Exception e) {
            SigmobLog.e(e.getMessage());
            return false;
        }
    }

    public void h() {
        BaseAdUnit baseAdUnit = this.k;
        SigmobError sigmobError = SigmobError.ERROR_SIGMOB_SPLASH_UNSUPPORT_ORIENTATION;
        a("play", baseAdUnit, (String) null, sigmobError.getErrorCode(), "");
        a(sigmobError.getErrorCode(), sigmobError.getMessage(), true);
        k();
    }
}
