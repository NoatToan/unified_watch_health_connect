package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.featuremarketing.route.IMarketRouteHelper;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.weight.WeightApi;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginoperation.util.DietKakaUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class evs implements IMarketRouteHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33537c = ddx.e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f33538a;
    private String d;

    public evs(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.d = str;
        this.f33538a = iBaseResponseCallback;
    }

    @Override // com.huawei.health.featuremarketing.route.IMarketRouteHelper
    public void jumpActivity() {
        if (TextUtils.isEmpty(this.d)) {
            LogUtil.j("WebViewRouterHelper", "mLinkUrl is null");
            IBaseResponseCallback iBaseResponseCallback = this.f33538a;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, null);
                return;
            }
            return;
        }
        if (this.d.contains("localeUrl:moduleName=openService")) {
            AppRouter.c("/OpenService/1.0/OpenServiceActivity").d(268435456).i();
            IBaseResponseCallback iBaseResponseCallback2 = this.f33538a;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(0, null);
                return;
            }
            return;
        }
        String queryParameter = Uri.parse(this.d).getQueryParameter("address");
        Uri uri = Uri.parse(qqy.g(this.d));
        String queryParameter2 = uri.getQueryParameter("systemBrower");
        String queryParameter3 = uri.getQueryParameter("h5pro");
        String queryParameter4 = uri.getQueryParameter("thirdDevProdId");
        d(this.d, queryParameter, queryParameter3);
        if (!TextUtils.isEmpty(queryParameter2)) {
            qqy.i(this.d);
            IBaseResponseCallback iBaseResponseCallback3 = this.f33538a;
            if (iBaseResponseCallback3 != null) {
                iBaseResponseCallback3.a(0, null);
                return;
            }
            return;
        }
        if ("true".equals(queryParameter3)) {
            if (this.d.contains("thirdDevProdId")) {
                if (TextUtils.isEmpty(queryParameter4)) {
                    LogUtil.a("WebViewRouterHelper", "productId is null");
                    return;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("productId", queryParameter4);
                ddv.b().initThirdDeviceH5Pro(b(this.d), contentValues, "#/measure/hw_authorized/?type=4");
                return;
            }
            H5ProLaunchOption.Builder builderC = c(this.d);
            b(uri, builderC);
            if (qqy.f(this.d)) {
                LogUtil.a("WebViewRouterHelper", "mLinkUrl is url.");
                e(this.d);
                ddv.b().loadH5LightApp(BaseApplication.b(), this.d, builderC);
            } else if (qqy.f(queryParameter)) {
                LogUtil.a("WebViewRouterHelper", "mLinkUrl contains url.");
                ddv.b().loadH5LightApp(BaseApplication.b(), queryParameter, builderC);
            } else {
                LogUtil.a("WebViewRouterHelper", "mLinkUrl is h5 mini program.");
                ddv.b().initH5Pro();
                b(builderC);
            }
            IBaseResponseCallback iBaseResponseCallback4 = this.f33538a;
            if (iBaseResponseCallback4 != null) {
                iBaseResponseCallback4.a(0, null);
                return;
            }
            return;
        }
        a(this.d);
    }

    private void b(final H5ProLaunchOption.Builder builder) {
        this.d = b(this.d);
        final Context contextB = BaseApplication.b();
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        String str = this.d;
        if (str == null) {
            return;
        }
        if (str.contains("com.huawei.health.h5.fasting-lite")) {
            builder.setNeedSoftInputAdapter().addPath("#/guide_index");
            if (weightApi != null) {
                H5ProServiceManager.getInstance().registerService(weightApi.getFastingLiteRepositoryApi());
            } else {
                LogUtil.j("WebViewRouterHelper", "weightApi is null.");
            }
            H5ProClient.startH5MiniProgram(contextB, "com.huawei.health.h5.fasting-lite", builder.build());
            return;
        }
        String str2 = this.d;
        String str3 = f33537c;
        if (str2.contains(str3)) {
            builder.setNeedSoftInputAdapter().addCustomizeJsModule("DietKakaUtil", DietKakaUtil.class).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction"));
            if (weightApi != null) {
                H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            } else {
                LogUtil.j("WebViewRouterHelper", "weightApi is null.");
            }
            H5ProClient.startH5MiniProgram(contextB, str3, builder.build());
            return;
        }
        if (this.d.contains("com.huawei.health.h5.ecg") && !this.d.contains("com.huawei.health.h5.ecgce")) {
            Class<? extends JsModuleBase> commonJsModule = ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getCommonJsModule("healthZoneApi");
            if (commonJsModule != null) {
                builder.addCustomizeJsModule("healthZoneApi", commonJsModule);
            } else {
                LogUtil.j("WebViewRouterHelper", "startH5ProActivity: healthZoneApi is null");
            }
            Class<? extends JsModuleBase> commonJsModule2 = ddv.b().getCommonJsModule("shareToCaasApi");
            if (commonJsModule2 != null) {
                builder.addCustomizeJsModule("shareToCaasApi", commonJsModule2);
            } else {
                LogUtil.j("WebViewRouterHelper", "startH5ProActivity: shareToCaasApi is null");
            }
            builder.setForceDarkMode(1);
            H5ProClient.startH5MiniProgram(contextB, "com.huawei.health.h5.ecg", builder.build());
            return;
        }
        if (this.d.contains("com.huawei.health.h5.ecgce")) {
            ddv.b().loadH5ProApp(contextB, "com.huawei.health.h5.ecgce", builder);
            return;
        }
        if (this.d.contains("com.huawei.health.h5.ppg")) {
            pfi.c().launchActivity(contextB, new Intent(), new AppBundleLauncher.InstallCallback() { // from class: evv
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return evs.a(contextB, builder, context, intent);
                }
            });
        } else if (this.d.contains("com.huawei.health.h5.vascular-health")) {
            ddv.b().loadH5ProApp(contextB, "com.huawei.health.h5.vascular-health", builder);
        } else {
            H5ProClient.startH5MiniProgram(contextB, this.d, builder.build());
        }
    }

    static /* synthetic */ boolean a(Context context, H5ProLaunchOption.Builder builder, Context context2, Intent intent) {
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.ppg", builder);
        return false;
    }

    private void a(String str) {
        Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(BaseApplication.b(), new Bundle(), 268435456);
        if (intentCreateWebViewIntent != null) {
            intentCreateWebViewIntent.putExtra("url", str);
            BaseApplication.b().getApplicationContext().startActivity(intentCreateWebViewIntent);
            IBaseResponseCallback iBaseResponseCallback = this.f33538a;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        LogUtil.e("WebViewRouterHelper", "startH5Activity intent is null");
        IBaseResponseCallback iBaseResponseCallback2 = this.f33538a;
        if (iBaseResponseCallback2 != null) {
            iBaseResponseCallback2.a(-1, null);
        }
    }

    private static H5ProLaunchOption.Builder c(String str) {
        H5ProLaunchOption.Builder builderAddCustomizeJsModule = new H5ProLaunchOption.Builder().addCustomizeJsModule("message", ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).getCommonJsModule("message")).addCustomizeJsModule("ecgJsModule", ddv.b().getCommonJsModule("ecgJsModule")).addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION)).addCustomizeJsModule("notificationAudioControl", ddv.b().getCommonJsModule("notificationAudioControl")).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("breathtrain", ddv.b().getCommonJsModule("breathtrain")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        if (str.contains("isImmerse")) {
            builderAddCustomizeJsModule.setImmerse();
        }
        if (str.contains("showStatusBar")) {
            builderAddCustomizeJsModule.showStatusBar();
        }
        if (str.contains("statusBarTextBlack")) {
            builderAddCustomizeJsModule.setStatusBarTextBlack(true);
        }
        builderAddCustomizeJsModule.setAnim("none");
        return builderAddCustomizeJsModule;
    }

    private static String b(String str) {
        int iIndexOf;
        return (!str.contains("?") || (iIndexOf = str.indexOf("?")) <= 0) ? str : str.substring(0, iIndexOf);
    }

    private static void e(String str) {
        LogUtil.a("WebViewRouterHelper", "interceptOperationMusic");
        String str2 = EnvironmentHelper.getInstance().getUrl() + "operationmusic" + File.separator;
        String strReplace = str2.replace("/sandbox", "");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith(str2) || str.startsWith(strReplace)) {
            ThreadPoolManager.c().a("WebViewRouterHelper", new Runnable() { // from class: evs.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.b(), "H5_OTHER_SHAREDPREFERENCE", "H5_PATCH_OPERATIONMUSIC_DEL_FLAG"))) {
                        LogUtil.a("WebViewRouterHelper", "interceptOperationMusic start clean dir.");
                        File file = new File(StorageUtil.getNativeFilePath(BaseApplication.b(), "operationmusic"));
                        if (file.exists()) {
                            FileUtils.d(file);
                        }
                        SharedPreferenceManager.e(BaseApplication.b(), "H5_OTHER_SHAREDPREFERENCE", "H5_PATCH_OPERATIONMUSIC_DEL_FLAG", "1", new StorageParams(0));
                    }
                }
            });
        }
    }

    private void d(String str, String str2, String str3) {
        LogUtil.a("WebViewRouterHelper", "putBiEventFromDeeplink");
        String strE = e(str, str2, str3);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("Steps", 1);
        map.put("H5package", strE);
        map.put("H5url", str);
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.H5_RESOURCE_LOAD_EVENT_VALUE.value(), map, 0);
    }

    private String e(String str, String str2, String str3) {
        if (qqy.f(str)) {
            return str;
        }
        if (qqy.f(str2)) {
            return str2;
        }
        if ("true".equals(str3)) {
            if (!TextUtils.isEmpty(str2)) {
                return b(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                return b(str);
            }
            return "";
        }
        return "";
    }

    private void b(Uri uri, H5ProLaunchOption.Builder builder) {
        if (uri.isOpaque()) {
            return;
        }
        for (String str : uri.getQueryParameterNames()) {
            if (Analyzer.isGlobalParamKeys(str)) {
                String queryParameter = uri.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    builder.addGlobalBiParam(str, queryParameter);
                }
            }
        }
    }
}
