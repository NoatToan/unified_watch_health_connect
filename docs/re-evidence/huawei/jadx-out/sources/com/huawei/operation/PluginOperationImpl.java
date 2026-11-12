package com.huawei.operation;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.baseapi.pluginoperation.PluginOperationApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.cloud.OperationCloudUtil;
import com.huawei.operation.h5pro.H5MiniProgramSecurityHelper;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import com.huawei.operation.h5pro.jsmodules.ArkUIJsApi;
import com.huawei.operation.h5pro.jsmodules.BloodPressureService;
import com.huawei.operation.h5pro.jsmodules.BreathTrainJsModule;
import com.huawei.operation.h5pro.jsmodules.CampaignJsApi;
import com.huawei.operation.h5pro.jsmodules.Device;
import com.huawei.operation.h5pro.jsmodules.EarphonePairJsApi;
import com.huawei.operation.h5pro.jsmodules.EcgJsModule;
import com.huawei.operation.h5pro.jsmodules.InnerApi;
import com.huawei.operation.h5pro.jsmodules.JsInteractionCompact;
import com.huawei.operation.h5pro.jsmodules.LocationService;
import com.huawei.operation.h5pro.jsmodules.MenstrualModule;
import com.huawei.operation.h5pro.jsmodules.NotificationUtil;
import com.huawei.operation.h5pro.jsmodules.PlanDeviceManager;
import com.huawei.operation.h5pro.jsmodules.PpgJsModule;
import com.huawei.operation.h5pro.jsmodules.Social;
import com.huawei.operation.h5pro.jsmodules.Sport;
import com.huawei.operation.h5pro.jsmodules.SportRouteService;
import com.huawei.operation.h5pro.jsmodules.Storage;
import com.huawei.operation.h5pro.jsmodules.WeightJsApi;
import com.huawei.operation.h5pro.jsmodules.WeightManagementJsApi;
import com.huawei.operation.h5pro.jsmodules.audiocontrol.AudioControlApi;
import com.huawei.operation.h5pro.jsmodules.healthengine.HealthyLivingEntry;
import com.huawei.operation.h5pro.jsmodules.healthengine.datastore.HealthEngineEntry;
import com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api;
import com.huawei.operation.h5pro.jsmodules.sharecaas.ShareToCaasApi;
import com.huawei.operation.h5pro.jsmodules.trade.JsTradeApi;
import com.huawei.operation.h5pro.jsmodules.wearengine.WearEngineEntry;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.pluginbase.PluginBaseAdapter;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.pca;
import defpackage.pez;
import defpackage.pfh;
import defpackage.pjo;
import defpackage.prf;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.KeyValDbManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class PluginOperationImpl implements PluginOperationApi {
    private static final String ECG_AC_NAME = "com.huawei.health.h5.ecg";
    private static final String ECG_NAME = "com.huawei.health.h5.ecgce";
    private static final Map<String, Class<? extends JsModuleBase>> JS_MODULE_MAP = generateJsModuleMap();
    private static final String TAG = "PluginOperation_PluginOperationImpl";

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void initAdapter(Context context, PluginBaseAdapter pluginBaseAdapter) {
        PluginOperation.getInstance(context).initAdapter(context, pluginBaseAdapter);
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public PluginBaseAdapter getAdapter(Context context) {
        LogUtil.a(TAG, "getAdapter");
        if (context != null) {
            return PluginOperation.getInstance(context).getAdapter();
        }
        LogUtil.a(TAG, "Context is null");
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void loadH5LightApp(Context context, String str, H5ProLaunchOption.Builder builder) {
        LogUtil.a(TAG, "loadH5LightApp start");
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "loadH5LightApp param empty");
            return;
        }
        initH5Pro();
        if (builder == null) {
            builder = new H5ProLaunchOption.Builder();
        }
        builder.addCustomizeJsModule("JsInteraction", JsInteractionCompact.class);
        if (CampaignJsApi.isCampaignUrl(str)) {
            builder.setImmerse().showStatusBar().setStatusBarTextBlack(true).addCustomizeJsModule(CampaignJsApi.CAMPAIGN_JS_API, CampaignJsApi.class);
        }
        H5ProClient.startH5LightApp(context, str, builder.build());
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void initH5Pro() {
        H5proUtil.initH5pro();
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void initThirdDeviceH5Pro(String str, ContentValues contentValues, String str2) {
        new BleJsInteractionCompact().startH5Pro(BaseApplication.b(), str, contentValues, str2);
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public Class<? extends JsModuleBase> getJsInteraction() {
        return JsInteractionCompact.class;
    }

    private static Map<String, Class<? extends JsModuleBase>> generateJsModuleMap() {
        HashMap map = new HashMap();
        map.put("JsInteraction", JsInteractionCompact.class);
        map.put("innerapi", InnerApi.class);
        map.put(RemoteMessageConst.NOTIFICATION, NotificationUtil.class);
        map.put("notificationAudioControl", AudioControlApi.class);
        map.put(NotificationCompat.CATEGORY_SOCIAL, Social.class);
        map.put("sport", Sport.class);
        map.put("SportRouteService", SportRouteService.class);
        map.put("storage", Storage.class);
        map.put("ecgJsModule", EcgJsModule.class);
        map.put("breathtrain", BreathTrainJsModule.class);
        map.put("shareToCaasApi", ShareToCaasApi.class);
        map.put("tradeApi", JsTradeApi.class);
        map.put("ppgJsModule", PpgJsModule.class);
        map.put("device", Device.class);
        map.put("WeightManagement", WeightManagementJsApi.class);
        map.put("wearengine", WearEngineEntry.class);
        map.put("healthengine", HealthEngineEntry.class);
        map.put("healthyliving", HealthyLivingEntry.class);
        map.put("weight", WeightJsApi.class);
        map.put("mediaCenter", MediaCenterH5Api.class);
        map.put("menstrual", MenstrualModule.class);
        map.put("EarphonePairManager", EarphonePairJsApi.class);
        map.put(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        map.put("BloodPressureImpl", BloodPressureService.class);
        map.put("LocationService", LocationService.class);
        map.put("PlanDeviceManager", PlanDeviceManager.class);
        return map;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        Class<? extends JsModuleBase> cls = JS_MODULE_MAP.get(str);
        if (cls != null) {
            return cls;
        }
        LogUtil.j(TAG, "unknow JsModule:", str);
        return JsModuleBase.class;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void loadH5ProApp(final Context context, final String str, final H5ProLaunchOption.Builder builder) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "loadH5ProApp: context -> " + context + ", pkgName -> " + str);
            return;
        }
        if (TextUtils.equals(str, "com.huawei.health.h5.diet-diary")) {
            str = ddx.e;
        }
        H5proUtil.initH5pro(str);
        if (builder == null) {
            builder = new H5ProLaunchOption.Builder();
        }
        String strC = KeyValDbManager.d(BaseApplication.b()).c("AT_SCOPE_DEAL");
        LogUtil.a(TAG, "hms download flag is " + strC);
        if ((ECG_AC_NAME.equals(str) || ECG_NAME.equals(str)) && !TextUtils.isEmpty(strC) && "2".equals(strC) && CommonUtil.z(BaseApplication.b()) && !CompileParameterUtil.c("GOOGLE_PLAY_OEM_BETTERME", false)) {
            prf.b(context);
            return;
        }
        if (str.equals("com.huawei.health.h5.snack-control")) {
            pfh.a().launchActivity(BaseApplication.b(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.operation.PluginOperationImpl$$ExternalSyntheticLambda0
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context2, Intent intent) {
                    return PluginOperationImpl.lambda$loadH5ProApp$0(context, str, builder, context2, intent);
                }
            });
            return;
        }
        if (str.equals("com.huawei.health.h5.ai-body-shape")) {
            LogUtil.a(TAG, "start body shape analysis algorithm download");
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.PluginOperationImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    pca.d().launchActivity(BaseApplication.b(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.operation.PluginOperationImpl$$ExternalSyntheticLambda4
                        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                        public final boolean call(Context context2, Intent intent) {
                            return PluginOperationImpl.lambda$loadH5ProApp$1(builder, context, str, context2, intent);
                        }
                    });
                }
            });
        } else if (str.equals("com.huawei.health.h5.cycle-calendar")) {
            LogUtil.a(TAG, "start cycle calendar");
            pez.d().launchActivity(BaseApplication.b(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.operation.PluginOperationImpl$$ExternalSyntheticLambda2
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context2, Intent intent) {
                    return PluginOperationImpl.lambda$loadH5ProApp$3(builder, context, str, context2, intent);
                }
            });
        } else if (str.equals("com.huawei.health.h5.sleepdetection") && isNeedPluginPath(builder)) {
            LogUtil.a(TAG, "start sleep detection");
            pjo.b().launchActivity(BaseApplication.b(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.operation.PluginOperationImpl$$ExternalSyntheticLambda3
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context2, Intent intent) {
                    return PluginOperationImpl.lambda$loadH5ProApp$4(context, str, builder, context2, intent);
                }
            });
        } else {
            H5ProClient.startH5MiniProgram(context, str, H5proUtil.buildOption(str, builder));
        }
    }

    static /* synthetic */ boolean lambda$loadH5ProApp$0(Context context, String str, H5ProLaunchOption.Builder builder, Context context2, Intent intent) {
        interceptSnackControl(context, str, builder);
        return false;
    }

    static /* synthetic */ boolean lambda$loadH5ProApp$1(H5ProLaunchOption.Builder builder, Context context, String str, Context context2, Intent intent) {
        LogUtil.a(TAG, "start body shape H5 mini program");
        if (builder != null) {
            builder.addCustomizeJsModule("bodyShapeAnalysisApi", pca.d().getBodyShapeAnalysisJsApi("bodyShapeAnalysisApi"));
        }
        H5ProClient.startH5MiniProgram(context, str, H5proUtil.buildOption(str, builder));
        return false;
    }

    static /* synthetic */ boolean lambda$loadH5ProApp$3(H5ProLaunchOption.Builder builder, Context context, String str, Context context2, Intent intent) {
        LogUtil.a(TAG, "cycle calendar plugin has download");
        if (builder != null) {
            builder.addCustomizeJsModule("menstrual", MenstrualModule.class);
        }
        H5ProClient.startH5MiniProgram(context, str, H5proUtil.buildOption(str, builder));
        return false;
    }

    static /* synthetic */ boolean lambda$loadH5ProApp$4(Context context, String str, H5ProLaunchOption.Builder builder, Context context2, Intent intent) {
        LogUtil.a(TAG, "sleep detection plugin has download");
        H5ProClient.startH5MiniProgram(context, str, H5proUtil.buildOption(str, builder));
        return false;
    }

    private boolean isNeedPluginPath(H5ProLaunchOption.Builder builder) {
        if (builder == null) {
            return false;
        }
        return pjo.b().d(builder.getPath());
    }

    private static void interceptSnackControl(Context context, String str, H5ProLaunchOption.Builder builder) {
        if (builder != null) {
            builder.addCustomizeJsModule("ocrJsModule", pfh.a().getOcrJsApi("ocrJsModule"));
            builder.addCustomizeJsModule("device", ddv.b().getCommonJsModule("device"));
            builder.addCustomizeJsModule("WeightManagement", ddv.b().getCommonJsModule("WeightManagement"));
            builder.addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction"));
        }
        H5ProClient.startH5MiniProgram(context, str, H5proUtil.buildOption(str, builder));
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public Intent createWebViewIntent(Context context, Bundle bundle, Integer num) {
        LogUtil.a(TAG, "createWebViewIntent start");
        if (context == null) {
            LogUtil.j(TAG, "createWebViewIntent context empty");
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        return intent;
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public boolean isSuperTrustedMiniProgram(String str, String str2) {
        return H5MiniProgramSecurityHelper.isSuperTrustedMiniProgram(str, str2);
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public boolean switchToMarketingTwo() {
        return OperationUtils.switchToMarketingTwo();
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void startOperationWebPage(Context context, String str) {
        LogUtil.a(TAG, "startOperationWebPage");
        if (context == null) {
            LogUtil.a(TAG, "context is null");
        } else {
            PluginOperation.getInstance(context).startOperationWebPage(str);
        }
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void loadEmbeddedH5(H5ProWebView h5ProWebView, String str, H5ProLaunchOption.Builder builder) {
        H5proUtil.initH5pro(str);
        H5ProClient.startH5MiniProgram(str, h5ProWebView, H5proUtil.buildOption(str, builder));
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void putBiEventFromH5Deeplink(String str, String str2) {
        H5proUtil.putBiEventFromH5Deeplink(str, str2);
    }

    @Override // com.huawei.health.baseapi.pluginoperation.PluginOperationApi
    public void functionEntrance(String str, boolean z) {
        OperationCloudUtil.functionEntrance(str, z);
    }
}
