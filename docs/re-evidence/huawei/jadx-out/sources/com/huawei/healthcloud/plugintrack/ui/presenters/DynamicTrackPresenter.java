package com.huawei.healthcloud.plugintrack.ui.presenters;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.healthcloud.plugintrack.ui.constraints.DynamicTrackContract;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes.dex */
public class DynamicTrackPresenter implements DynamicTrackContract.Ipresenter<DynamicTrackContract.Iview> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DynamicTrackContract.Iview f11228c;
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11227a = false;

    public DynamicTrackPresenter(DynamicTrackContract.Iview iview) {
        this.f11228c = iview;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.constraints.DynamicTrackContract.Ipresenter
    public void judgeVipStatus() {
        if (this.f11228c == null) {
            LogUtil.j("Suggestion_DynamicTrackPresenter", "judgeVipStatus: view is mull");
        } else {
            b(new CommonSingleCallback() { // from class: jrw
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.f38957c.c((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Boolean bool) {
        this.d = bool.booleanValue();
        this.f11228c.judgeVipResult(bool.booleanValue());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.constraints.DynamicTrackContract.Ipresenter
    public void switchPremiumEdition(boolean z) {
        if (this.f11228c == null) {
            LogUtil.j("Suggestion_DynamicTrackPresenter", "switchPremiumEdition: view is mull");
            return;
        }
        if (z) {
            this.f11227a = false;
            LogUtil.a("Suggestion_DynamicTrackPresenter", "switchPremiumEdition: set mIsNeedJudgeVip = false");
            this.f11228c.judgeVipResult(false);
        } else {
            this.f11227a = true;
            b(new CommonSingleCallback() { // from class: jrx
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.e.a((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.d = bool.booleanValue();
        this.f11227a = !bool.booleanValue();
        if (bool.booleanValue()) {
            this.f11228c.judgeVipResult(true);
        } else {
            b();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        LogUtil.a("Suggestion_DynamicTrackPresenter", "onResume: ignore_three_dimensional_track");
    }

    private void b() {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&urlType=4&pName=com.huawei.health&path=PrivilegeDetail&functionId=3");
        }
    }

    private void b(CommonSingleCallback<Boolean> commonSingleCallback) {
        LogUtil.a("Suggestion_DynamicTrackPresenter", "judgeFunctionAuth: ignore_three_dimensional_track");
    }
}
