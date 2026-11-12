package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import defpackage.fxk;
import defpackage.fxn;
import defpackage.pfi;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeepLink extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_DeepLink";
    private static final String TAG = "ArkUIX_DeepLink";

    public DeepLink(Context context, String str, int i) {
        super(context, str, i);
    }

    public DeepLink(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    /* JADX INFO: renamed from: toPage, reason: merged with bridge method [inline-methods] */
    public void m1402xbd95d570(final int i, final Object obj) {
        final String strReplaceAll;
        boolean z;
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.DeepLink$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1402xbd95d570(i, obj);
                }
            });
            return;
        }
        ReleaseLogUtil.c(R_TAG, "toPage enter");
        if (obj == null) {
            ohProOnFailure(i, "");
            LogUtil.d(TAG, "toPage param is null.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(String.valueOf(obj));
            strReplaceAll = String.valueOf(jSONObject.get("deeplink"));
            try {
                z = jSONObject.getBoolean("useMarketingRouter");
            } catch (JSONException unused) {
                LogUtil.c(TAG, "toPage occur json error.");
                z = false;
            }
        } catch (JSONException unused2) {
            strReplaceAll = null;
        }
        if (TextUtils.isEmpty(strReplaceAll)) {
            ohProOnFailure(i, "");
            LogUtil.d(TAG, "toPage deeplink empty");
            return;
        }
        ReleaseLogUtil.c(R_TAG, "isUseMarketingRouter:", Boolean.valueOf(z));
        if (z) {
            marketingToPage(strReplaceAll);
            ohProOnSuccess(i, "");
            return;
        }
        if (strReplaceAll.contains("path=#/")) {
            strReplaceAll = strReplaceAll.replaceAll(Constants.H5PRO_PAGE_PREFIX, "");
        }
        LogUtil.a(TAG, "toPage deeplink: ", strReplaceAll);
        setNewDotExist(strReplaceAll);
        if (isNeedLogin(strReplaceAll) && LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.DeepLink$$ExternalSyntheticLambda2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj2) {
                    this.f$0.m1403xeb6e6fcf(strReplaceAll, i2, obj2);
                }
            }, null);
        } else {
            dispatchDeeplink(strReplaceAll);
        }
        ohProOnSuccess(i, "");
    }

    /* JADX INFO: renamed from: lambda$toPage$1$com-huawei-hwarkuix-oHBrigdePlugin-health-DeepLink, reason: not valid java name */
    /* synthetic */ void m1403xeb6e6fcf(String str, int i, Object obj) {
        LogUtil.a(TAG, "toPage browsingToLogin errorCode is:", Integer.valueOf(i));
        if (i == 0) {
            dispatchDeeplink(str);
        }
    }

    private void marketingToPage(final String str) {
        LogUtil.a(TAG, "marketingToPage deeplink：", str);
        final MarketRouterApi marketRouterApi = (MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class);
        if (!fxk.b(str)) {
            marketRouterApi.router(str);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.DeepLink$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    DeepLink.lambda$marketingToPage$2(marketRouterApi, str, i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    static /* synthetic */ void lambda$marketingToPage$2(MarketRouterApi marketRouterApi, String str, int i, Object obj) {
        LogUtil.a(TAG, "marketingToPage login resultCode = ", Integer.valueOf(i));
        if (i == 0) {
            marketRouterApi.router(str);
        }
    }

    private void dispatchDeeplink(String str) {
        if (str.contains("com.huawei.study.hiresearch")) {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(str);
                return;
            }
            return;
        }
        if (checkEnvironment(str)) {
            LogUtil.a(TAG, "dispatchDeeplink by Environment.");
        } else if (checkDeviceDeeplink(str)) {
            LogUtil.a(TAG, "dispatchDeeplink by DeviceDeeplink.");
        } else {
            AppRouter.e(Uri.parse(str)).a(ArkUIXConstants.FROM_TYPE, 1).i();
            LogUtil.d(TAG, "dispatchDeeplink by AppRouter.");
        }
    }

    private boolean isNeedLogin(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.contains("com.huawei.health.h5.ppg") || str.contains("com.huawei.health.h5.ecgce") || str.contains("com.huawei.health.h5.vascular-health") || str.contains("com.huawei.health.h5.ecg") || str.contains("com.huawei.health.h5.health-data-subpage") || str.contains("com.huawei.health.h5.setting") || str.contains("com.huawei.health.h5.abpm") || str.contains("com.huawei.health.h5.knowledge");
        }
        LogUtil.d(TAG, "isNeedLogin deeplink is empty.");
        return false;
    }

    private static void setNewDotExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("com.huawei.health.h5.ppg")) {
            fxn.b(false, "ArrhythmiaItemHolder");
        }
        if (str.contains("com.huawei.health.h5.ecgce")) {
            fxn.b(false, "NormalItemHolder");
        }
        if (str.contains("com.huawei.health.h5.ecg")) {
            fxn.b(false, "NormalDiaItemHolder");
        }
        if (str.contains("com.huawei.health.h5.vascular-health")) {
            fxn.b(false, "VascularItemHolder");
        }
    }

    private boolean checkEnvironment(final String str) {
        if (!str.contains("com.huawei.health.h5.ppg")) {
            return false;
        }
        pfi.c().launchActivity(BaseApplication.getContext(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.DeepLink$$ExternalSyntheticLambda3
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return DeepLink.lambda$checkEnvironment$3(str, context, intent);
            }
        });
        return true;
    }

    static /* synthetic */ boolean lambda$checkEnvironment$3(String str, Context context, Intent intent) {
        AppRouter.e(Uri.parse(str)).a(ArkUIXConstants.FROM_TYPE, 1).i();
        return false;
    }

    private boolean checkDeviceDeeplink(String str) {
        Uri uri = Uri.parse(str);
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        LogUtil.a(TAG, "checkDeviceDeeplink scheme: ", scheme, " ,host: ", host, " ,path: ", path);
        if (!"huaweischeme".equals(scheme) || !"healthapp".equals(host) || path == null || !path.contains("devicemgr")) {
            return false;
        }
        LogUtil.a(TAG, "checkDeviceDeeplink deviceMgrType: ", uri.getQueryParameter("deviceMgrType"));
        return true;
    }
}
