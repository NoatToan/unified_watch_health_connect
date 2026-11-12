package com.huawei.ui.homehealth.runcard.trackfragments;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.listener.SportPageResTrigger;
import com.huawei.health.knit.section.model.MarketingIdInfo;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.ScrollUtil;
import defpackage.fwx;
import defpackage.qkz;
import health.compact.a.Services;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes17.dex */
public class SportTabPageResTrigger extends SportPageResTrigger {
    private static final String TAG = "SportTabPageResTrigger";
    private boolean mIsOnPageCreatedCalled;
    private a mObserver;

    public SportTabPageResTrigger(Context context, int i, MarketingIdInfo marketingIdInfo) {
        super(context, i, marketingIdInfo);
        this.mIsOnPageCreatedCalled = false;
    }

    @Override // com.huawei.health.knit.section.listener.SportPageResTrigger, com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageCreated(Activity activity, View view) {
        if (activity == null) {
            LogUtil.j(TAG, "onPageCreated failed, cause context is null");
            return;
        }
        if (view == null) {
            LogUtil.e(TAG, "onPageCreated failed, cause scrollableView is null");
            return;
        }
        if (this.mIsOnPageCreatedCalled) {
            LogUtil.j(TAG, "onPageCreated has been called");
            return;
        }
        LogUtil.a(TAG, "onPageCreated: ", Integer.valueOf(this.mResPosId));
        qkz.d(fwx.f34659c);
        a aVar = new a(this, activity, view);
        this.mObserver = aVar;
        ObserverManagerUtil.d(aVar, "UPDATE_AD_SHOW");
        initMarketing(activity, view);
        this.mIsOnPageCreatedCalled = true;
    }

    @Override // com.huawei.health.knit.section.listener.SportPageResTrigger, com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageVisibilityChanged(Activity activity, boolean z, View view) {
        if (z && !this.mIsOnPageCreatedCalled) {
            LogUtil.a(TAG, "has not called onPageCreated yet, call it now");
            onPageCreated(activity, view);
        }
        super.onPageVisibilityChanged(activity, z, view);
    }

    @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onDestroy(Activity activity) {
        a aVar = this.mObserver;
        if (aVar != null) {
            try {
                ObserverManagerUtil.a(aVar, "UPDATE_AD_SHOW");
            } catch (IllegalStateException unused) {
                LogUtil.e(TAG, "unregisterObserver exception");
            }
            this.mObserver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMarketing(Activity activity, View view) {
        int i = this.mMarketingIdInfo.getmFloatingBoxId();
        LogUtil.a(TAG, "initMarketing posIdId: ", Integer.valueOf(this.mResPosId), " floatingBoxId: ", Integer.valueOf(i));
        qkz.a(i);
        int i2 = this.mMarketingIdInfo.getmPageId();
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(activity).setPageId(i2).build());
        }
        LogUtil.a(TAG, "sport setScreenTouchListening: ", Integer.valueOf(i));
        ScrollUtil.a(view, activity.getWindow().getDecorView(), i);
    }

    static class a implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Activity> f25952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<View> f25953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SportTabPageResTrigger> f25954c;

        public a(SportTabPageResTrigger sportTabPageResTrigger, Activity activity, View view) {
            this.f25954c = new WeakReference<>(sportTabPageResTrigger);
            this.f25952a = new WeakReference<>(activity);
            this.f25953b = new WeakReference<>(view);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a(SportTabPageResTrigger.TAG, "SportUpdateShowAdObserver notify, label: ", str);
            if (!"UPDATE_AD_SHOW".equals(str) || this.f25954c == null || this.f25952a == null || this.f25953b == null) {
                return;
            }
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportTabPageResTrigger.a.3
                @Override // java.lang.Runnable
                public void run() {
                    SportTabPageResTrigger sportTabPageResTrigger = (SportTabPageResTrigger) a.this.f25954c.get();
                    Activity activity = (Activity) a.this.f25952a.get();
                    View view = (View) a.this.f25953b.get();
                    if (sportTabPageResTrigger == null || activity == null || view == null) {
                        return;
                    }
                    sportTabPageResTrigger.initMarketing(activity, view);
                }
            }, 50L);
        }
    }
}
