package com.huawei.operation.h5pro;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.google.common.base.Ascii;
import com.huawei.common.util.Utils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.ext.H5ProResidentExtManager;
import com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubInterceptor;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubManager;
import com.huawei.health.h5pro.jsbridge.system.network.NetWorkEntry;
import com.huawei.health.h5pro.jsbridge.system.share.ShareEntry;
import com.huawei.health.h5pro.load.expression.ExpressionFunctionRegistry;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogPrintOperate;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.webkit.H5ProDeeplinkManager;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.health.healthheadlines.HealthHeadLinesJsApi;
import com.huawei.health.heartrate.HeartRateApi;
import com.huawei.health.heartratesetting.HeartRateSettingApi;
import com.huawei.health.main.api.UtilApi;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pressure.PressureApi;
import com.huawei.health.recognizekit.h5.RecognizeH5Helper;
import com.huawei.health.sleep.SleepApi;
import com.huawei.health.summary.SummaryApi;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.weight.WeightApi;
import com.huawei.healthcloud.plugintrack.golf.h5.GolfH5DownloadInterface;
import com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface;
import com.huawei.healthcloud.plugintrack.physicalfitness.h5.PhysicalFitnessH5Interface;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.BuildConfig;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import com.huawei.operation.h5pro.bridgeimpl.PermissionImpl;
import com.huawei.operation.h5pro.bridgeimpl.ShareImpl;
import com.huawei.operation.h5pro.jsmodules.AiChatJsApi;
import com.huawei.operation.h5pro.jsmodules.ArkUIJsApi;
import com.huawei.operation.h5pro.jsmodules.BloodPressureService;
import com.huawei.operation.h5pro.jsmodules.CampaignJsApi;
import com.huawei.operation.h5pro.jsmodules.Device;
import com.huawei.operation.h5pro.jsmodules.EcgJsModule;
import com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi;
import com.huawei.operation.h5pro.jsmodules.InnerApi;
import com.huawei.operation.h5pro.jsmodules.JsInteractionCompact;
import com.huawei.operation.h5pro.jsmodules.PlanDeviceManager;
import com.huawei.operation.h5pro.jsmodules.SportHistoryJsApi;
import com.huawei.operation.h5pro.jsmodules.WeChatJsApi;
import com.huawei.operation.h5pro.jsmodules.WeightJsApi;
import com.huawei.operation.h5pro.jsmodules.WeightManagementJsApi;
import com.huawei.operation.h5pro.jsmodules.common.HealthCommonApi;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintJsApi;
import com.huawei.operation.h5pro.jsmodules.crypto.CryptoApi;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.operation.h5pro.jsmodules.device.DeviceResourceJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceStatusJsApi;
import com.huawei.operation.h5pro.jsmodules.device.FileServiceJsApi;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi;
import com.huawei.operation.h5pro.jsmodules.device.MessageNotificationJsApi;
import com.huawei.operation.h5pro.jsmodules.device.UpdateDeviceJsApi;
import com.huawei.operation.h5pro.jsmodules.dialog.DialogApi;
import com.huawei.operation.h5pro.jsmodules.group.GroupJsApi;
import com.huawei.operation.h5pro.jsmodules.healthengine.autoLoginH5.AutoLoginH5Entry;
import com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi;
import com.huawei.operation.h5pro.jsmodules.mediaCenter.MediaCenterH5Api;
import com.huawei.operation.h5pro.jsmodules.privacy.PrivacyCollectionJsApi;
import com.huawei.operation.h5pro.jsmodules.trade.JsTradeApi;
import com.huawei.operation.h5pro.preload.H5PreloadDeviceStrategy;
import com.huawei.operation.h5pro.preload.H5PreloadWeightStrategy;
import com.huawei.operation.h5pro.preload.H5ProAppLoadStorageServiceImpl;
import com.huawei.operation.h5pro.preload.H5ProPkgPreloadSyncTask;
import com.huawei.operation.h5pro.prerequest.CloudFunctions;
import com.huawei.operation.h5pro.versionmanage.H5ProVersionManager;
import com.huawei.operation.h5pro.versionmanage.H5ProVersionUpgradeExitImpl;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.pluginoperation.util.DietKakaUtil;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.ecu;
import defpackage.ffv;
import defpackage.fga;
import defpackage.jbg;
import defpackage.kjy;
import defpackage.ksu;
import defpackage.lmf;
import defpackage.lua;
import defpackage.pjo;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BuildTypeConfig;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class H5proUtil {
    private static final long HOME_PRELOAD_DELAY = 3000;
    private static final String KEY_LAST_REFRESH_PLAN_TIME_MILLIS = "LAST_REFRESH_PLAN_TIME_MILLIS";
    private static final String OAuth_Login = "oauth2/v3/authorize.html";
    private static final String PARAM_PATH = "path";
    private static final int STEP_H5_DEEPLINK_START = 1;
    private static final String TAG = "H5PRO_H5proUtil";
    private static final String URL_BETA_PATH = "/sandbox/cch5/health/";
    private static final String URL_RELEASE_PATH = "/cch5/health/";
    private static final String URL_TEST_PATH = "/sandbox/cch5/testappCCH5/";
    private static final List<String> GLOBAL_BI_PARAM_KEYS = Arrays.asList(WebViewHelp.BI_KEY_PULL_FROM, "fromPageTitle", "resourceName", "resourceId", "pullOrder", "itemId", "algId", x2.AB_INFO);
    private static boolean sHasInit = false;
    private static final int GROUP_BACKGROUND_COLOR = Color.rgb(241, 243, 245);
    private static final String[] HOME_PRELOAD_H5_PKG_ARRAY = {"com.huawei.health.h5.weight", "com.huawei.health.h5.vip"};
    private static final String[] DEVICE_PRELOAD_H5_PKG_ARRAY = {"com.huawei.health.h5.dm-ccbk"};
    private static boolean isOpenH5VersionGraySwitch = true;

    private H5proUtil() {
    }

    public static void initH5pro() {
        initH5pro("");
    }

    public static void initH5pro(String str) {
        initBiAnalyser();
        initJsSdk();
        initUserFlag();
        if (TextUtils.isEmpty(EnvironmentHelper.getInstance().getUrl())) {
            initEnvironment();
        }
        if (sHasInit) {
            return;
        }
        sHasInit = true;
        LogPrintOperate.setLogDecodePrintInterceptor(new LogDecodePrintInterceptorImpl());
        H5ProTrustListChecker.setTrustListChecker(new TrustListCheckerImpl());
        ksu.d(BaseApplication.getAppPackage());
        initJsBridgeModule();
        initSalableServices();
        initBiAnalyserOnce();
        NetWorkEntry.setDataTransferInterceptor(new DataTransferInterceptorImpl());
        NetWorkEntry.setSseRequest(new SseRequestInterceptorImpl());
        ExpressionFunctionRegistry.register("CloudFunctions", new CloudFunctions());
        H5ProEventHubManager.setEventHubInterceptor(new H5ProEventHubInterceptor() { // from class: com.huawei.operation.h5pro.H5proUtil$$ExternalSyntheticLambda1
            @Override // com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubInterceptor
            public final boolean isAllowedUseApi(H5ProAppInfo h5ProAppInfo, String str2) {
                return H5MiniProgramSecurityHelper.isTrustedMiniProgram(h5ProAppInfo);
            }
        });
        H5ProDeeplinkManager.setDeeplinkInterceptor(new H5ProDeeplinkInterceptorImpl());
    }

    private static void initJsSdk() {
        String accountInfo;
        H5ProClient.setAccountGrsAppName(AccountConstants.GRS_APP_NAME);
        boolean z = CommonUtil.z(BaseApplication.getContext());
        if (!z) {
            accountInfo = "";
        } else {
            Utils.initGrsOld(Utils.getCountryCode(), BaseApplication.getContext());
            accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        }
        H5ProClient.useHmsLite(z, accountInfo);
        H5ProClient.setAccountJsLoginUrl(BuildConfig.ACCOUNT_JS_URL);
    }

    private static void initUserFlag() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo) && accountInfo.length() >= 6) {
            H5ProClient.setUserFlag(accountInfo.substring(accountInfo.length() - 6));
        } else {
            LogUtil.e(TAG, "initUserFlag -> huid: empty or length < 6");
        }
    }

    public static void jumpFromDeeplink(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "jumpFromDeeplink: url is empty");
            return;
        }
        if (TrustListCheckerImpl.containsXss(str)) {
            LogUtil.j(TAG, "jumpFromDeeplink: url cannot contain Xss");
            return;
        }
        if (context == null) {
            context = BaseApplication.getContext();
        }
        if (context == null) {
            LogUtil.j(TAG, "jumpFromDeeplink: context is null");
            return;
        }
        H5ProLaunchOption.Builder builderCreateLaunchOptionBuilderForDeeplink = createLaunchOptionBuilderForDeeplink(str);
        if (str.startsWith("http://") || str.startsWith("https://")) {
            LogUtil.a(TAG, "jumpFromDeeplink: the url is http(s)");
            startH5WithHttp(context, str, builderCreateLaunchOptionBuilderForDeeplink);
        } else if (str.startsWith(Constants.PREFIX_FILE)) {
            LogUtil.a(TAG, "jumpFromDeeplink: the url is FILE_SCHEME");
            startH5WithFile(context, str, builderCreateLaunchOptionBuilderForDeeplink);
        } else {
            LogUtil.a(TAG, "jumpFromDeeplink: the url is h5 mini program");
            String packageNameFromUrl = getPackageNameFromUrl(str);
            addParam(builderCreateLaunchOptionBuilderForDeeplink, str);
            ddv.b().loadH5ProApp(context, packageNameFromUrl, builderCreateLaunchOptionBuilderForDeeplink);
        }
    }

    private static void addInternalApi(boolean z, String str, H5ProLaunchOption.Builder builder) {
        if (TrustListCheckerImpl.isMountSpecialJsModule(z, str)) {
            builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        }
    }

    private static void startH5WithHttp(Context context, String str, H5ProLaunchOption.Builder builder) {
        PluginBaseAdapter adapter = PluginOperation.getInstance(context).getAdapter();
        if (adapter instanceof PluginOperationAdapter) {
            if (!com.huawei.operation.utils.Utils.isWhiteUrlLogicJudge(str, (PluginOperationAdapter) adapter)) {
                LogUtil.j(TAG, "url is not in whiteList.");
            } else {
                startH5LightApp(context, str, builder);
            }
        }
    }

    private static void startH5WithFile(Context context, String str, H5ProLaunchOption.Builder builder) {
        if (str.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
            LogUtil.j(TAG, "jumpToH5Application invalid url");
        } else {
            startH5LightApp(context, str, builder);
        }
    }

    private static void startH5LightApp(Context context, String str, H5ProLaunchOption.Builder builder) {
        initH5pro();
        addInternalApi(false, str, builder);
        builder.addCustomizeJsModule("JsInteraction", JsInteractionCompact.class);
        builder.addCustomizeJsModule("WeChatJsApi", WeChatJsApi.class);
        interceptComplaintCenter(str, builder);
        if (CampaignJsApi.isCampaignUrl(str)) {
            builder.setImmerse().showStatusBar().setStatusBarTextBlack(true).addCustomizeJsModule(CampaignJsApi.CAMPAIGN_JS_API, CampaignJsApi.class);
        }
        H5ProClient.startH5LightApp(context, str, builder.build());
    }

    private static void addParam(H5ProLaunchOption.Builder builder, String str) {
        String queryParameter = Uri.parse(Constants.OPEN_HEALTH_SPORT_PREFIX + str).getQueryParameter("path");
        LogUtil.d(TAG, "get path = " + queryParameter);
        if (!TextUtils.isEmpty(queryParameter)) {
            builder.addPath(Constants.H5PRO_PAGE_PREFIX + queryParameter + getQueryParamFromUrl(str));
            return;
        }
        builder.addPath(Constants.H5PRO_PAGE_PREFIX + getQueryParamFromUrl(str));
    }

    private static H5ProLaunchOption.Builder createLaunchOptionBuilderForDeeplink(String str) {
        H5ProLaunchOption.Builder builderAddCustomizeJsModule = new H5ProLaunchOption.Builder().addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        if (str.contains("isImmerse")) {
            builderAddCustomizeJsModule.setImmerse();
        }
        if (str.contains("showStatusBar")) {
            builderAddCustomizeJsModule.showStatusBar();
        }
        if (str.contains("statusBarTextBlack")) {
            builderAddCustomizeJsModule.setStatusBarTextBlack(true);
        }
        if (str.contains("needSoftInputAdapter")) {
            builderAddCustomizeJsModule.setNeedSoftInputAdapter();
        }
        if (str.contains("enableSlowWholeDocumentDraw=true")) {
            builderAddCustomizeJsModule.enableSlowWholeDocumentDraw();
        }
        if (str.contains("isStartAtBottomOfStatusBar=true")) {
            builderAddCustomizeJsModule.startAtBottomOfStatusBar();
        }
        if (str.contains("fitness-game")) {
            LogUtil.a(TAG, "interceptBodySensorOption");
            interceptBodySensorOption(builderAddCustomizeJsModule);
        }
        if (str.contains("isNewSingleInstance=true")) {
            builderAddCustomizeJsModule.setActivityStartFlag(67108864);
        }
        if (str.contains(OAuth_Login)) {
            builderAddCustomizeJsModule.addCustomizeJsModule("autoLoginH5", AutoLoginH5Entry.class);
        }
        ArrayMap<String, String> uri = com.huawei.operation.utils.Utils.parseUri(str);
        if (!TextUtils.isEmpty(uri.get("anim"))) {
            builderAddCustomizeJsModule.setAnim(uri.get("anim"));
        }
        String str2 = uri.get("forceDarkMode");
        if (!TextUtils.isEmpty(str2) && StringUtils.a(str2)) {
            try {
                builderAddCustomizeJsModule.setForceDarkMode(Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                LogUtil.e(TAG, "forceDarkMode: NumberFormatException");
            }
        }
        String str3 = uri.get("startMode");
        if (!TextUtils.isEmpty(str3) && StringUtils.a(str3)) {
            try {
                builderAddCustomizeJsModule.setStartMode(Integer.parseInt(str3));
            } catch (NumberFormatException unused2) {
                LogUtil.e(TAG, "forceDarkMode: NumberFormatException");
            }
        }
        putH5ProGlobalBiParams(str, builderAddCustomizeJsModule);
        return addBundleForDeeplink(uri, builderAddCustomizeJsModule);
    }

    private static H5ProLaunchOption.Builder addBundleForDeeplink(ArrayMap<String, String> arrayMap, H5ProLaunchOption.Builder builder) {
        if (arrayMap != null && !arrayMap.isEmpty()) {
            H5ProBundle h5ProBundle = new H5ProBundle();
            for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (TextUtils.isEmpty(value)) {
                    LogUtil.d(TAG, String.format(Locale.ENGLISH, "addBundle: %s is empty", key));
                } else {
                    h5ProBundle.putString(key, value);
                }
            }
            builder.addBundle(h5ProBundle);
        }
        return builder;
    }

    public static String getPackageNameFromUrl(String str) {
        int iIndexOf;
        LogUtil.d(TAG, "Base Url = " + str);
        if (str.contains("?") && (iIndexOf = str.indexOf("?")) > 0) {
            return str.substring(0, iIndexOf);
        }
        return "";
    }

    private static String getQueryParamFromUrl(String str) {
        int iIndexOf;
        if (str.contains("?") && (iIndexOf = str.indexOf("?")) > 0) {
            return str.substring(iIndexOf);
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    public static H5ProLaunchOption buildOption(String str, H5ProLaunchOption.Builder builder) {
        if (builder == null) {
            builder = new H5ProLaunchOption.Builder();
        }
        buildCommon(str, builder);
        byte b2 = 1;
        addInternalApi(true, str, builder);
        if (!TextUtils.isEmpty(str) && str.startsWith("com.huawei.health.h5.annual-report-")) {
            return interceptAnnualReport(builder);
        }
        if (ddx.e.equals(str)) {
            return interceptDietDiaryOption(builder);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1391389376:
                if (!str.equals("com.huawei.health.h5.ecg")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1391378402:
                if (!str.equals("com.huawei.health.h5.ppg")) {
                    b2 = -1;
                }
                break;
            case -1391372844:
                if (!str.equals("com.huawei.health.h5.vip")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1390358110:
                if (!str.equals("com.huawei.health.h5.ecgce")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -1244321934:
                if (!str.equals("com.huawei.health.h5.ai-body-shape")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -789387129:
                if (!str.equals("com.huawei.health.h5.setting")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -722204190:
                if (!str.equals("com.huawei.health.h5.my-annual-flag")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -585620429:
                if (!str.equals("com.huawei.health.h5.generative-sleep-music")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -420752163:
                if (!str.equals("com.huawei.health.h5.vascular-health")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -390333327:
                if (!str.equals("com.huawei.health.h5.annual-report-2021")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -390333326:
                if (!str.equals("com.huawei.health.h5.annual-report-2022")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -250808724:
                if (!str.equals("com.huawei.health.h5.assets")) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case -197172476:
                if (!str.equals("com.huawei.health.h5.course")) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case -183421155:
                if (!str.equals("com.huawei.health.h5.dive")) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -183326325:
                if (!str.equals("com.huawei.health.h5.golf")) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case -80061251:
                if (!str.equals("com.huawei.health.h5.groups")) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 76161450:
                if (!str.equals("com.huawei.health.h5.matter")) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 124403036:
                if (!str.equals("com.huawei.health.h5.ai-fitness-course")) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 125027692:
                if (!str.equals("com.huawei.health.h5.sleeping-music")) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case 398951486:
                if (!str.equals("com.huawei.health.h5.fasting-lite")) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case 980007009:
                if (!str.equals("com.huawei.health.h5.custom-recipe")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC4;
                }
                break;
            case 1226826462:
                if (!str.equals("com.huawei.health.h5.breath-training")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.NAK;
                }
                break;
            case 1485584659:
                if (!str.equals("com.huawei.health.h5.intelligent-recipe-customization")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SYN;
                }
                break;
            case 1926532258:
                if (!str.equals("com.huawei.health.h5.sleep-management")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ETB;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 3:
                return interceptEcgOption(builder);
            case 1:
                return interceptPpgOption(builder);
            case 2:
                return interceptVipOption(builder);
            case 4:
                return interceptAiBodyShapeOption(builder);
            case 5:
            case 11:
                return initInnerFullScreenApp(builder);
            case 6:
                return interceptActiveTargetOption(builder);
            case 7:
                return interceptAISleepMusicOption(builder);
            case 8:
                return interceptVascularOption(builder);
            case 9:
            case 10:
                return interceptAnnualReport(builder);
            case 12:
                return initInnerSeriesCourse(builder);
            case 13:
                return interceptDiveOption(builder);
            case 14:
                return interceptGolfOption(builder);
            case 15:
                return interceptGroupOption(builder);
            case 16:
                return interceptMatterOption(builder);
            case 17:
                return initAiFitnessCourse(builder);
            case 18:
            case 23:
                return initInnerSleepMusic(builder);
            case 19:
                return interceptFastingLiteOption(builder);
            case 20:
            case 22:
                return interceptCustomRecipeOption(builder);
            case 21:
                return interceptBreathOption(builder);
            default:
                return buildOptionAddition(str, builder);
        }
    }

    private static H5ProLaunchOption interceptAISleepMusicOption(H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule(DeviceStatusJsApi.MODEL, DeviceStatusJsApi.class);
        builder.addCustomizeJsModule(MatterDataJsApi.MODEL, MatterDataJsApi.class);
        builder.addCustomizeJsModule("tradeApi", JsTradeApi.class);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("ecgJsModule", EcgJsModule.class);
        builder.addCustomizeJsModule("mediaCenter", MediaCenterH5Api.class);
        builder.addCustomizeJsModule("aiAudio", AiAudioJsApi.class);
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.showStatusBar();
        builder.setImmerse();
        builder.setStatusBarTextBlack(true);
        builder.setForceDarkMode(1);
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    public static H5ProLaunchOption buildOptionAddition(String str, H5ProLaunchOption.Builder builder) {
        str.hashCode();
        switch (str) {
            case "com.huawei.health.h5.cycle-calendar":
                return interceptMenstrual(builder);
            case "com.wequee.healthscores":
                return interceptHealthVitalityOption(builder);
            case "com.huawei.health.h5.complaint":
                return interceptComplaint(builder);
            case "com.huawei.health.h5.my-plan":
                return interceptMyPlan(builder);
            case "com.huawei.health.h5.sleep-apnea":
                return interceptSleepApnea(builder);
            case "com.huawei.health.h5.physical-fitness-test":
                return interceptFitnessTestOption(builder);
            case "com.huawei.health.h5.marketing":
                return interceptMarketingOption(builder);
            case "com.huawei.health.h5.ai-weight":
                return interceptAiWeight(builder);
            case "com.huawei.health.h5.privacy-collection-display":
                return interceptPersonalInfo(builder);
            case "com.huawei.health.h5.health-headlines":
                return interceptHealthHeadLinesOption(builder);
            case "com.huawei.health.h5.walkup":
                return interceptWalkUpOption(builder);
            case "com.huawei.health.h5.snack-control":
                return interceptSnackControl(builder);
            case "com.huawei.health.h5.health-record":
                return interceptHealthRecordOption(builder);
            case "com.huawei.healthkit.auto-login-h5":
                return interceptAutoLoginOption(builder);
            default:
                return buildOtherOptionAddition(str, builder);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    public static H5ProLaunchOption buildOtherOptionAddition(String str, H5ProLaunchOption.Builder builder) {
        LogUtil.a(TAG, "pkgName: ", str, " path: ", builder.getPath());
        str.hashCode();
        switch (str) {
            case "com.huawei.health.h5.health-trend":
                return interceptHealthTrend(builder);
            case "com.huawei.health.h5.sleepdetection":
                return interceptSleepRecord(builder);
            case "com.huawei.health.h5.cycle":
                addInternalApi(true, "com.huawei.health.h5.cycle", builder);
                return builder.build();
            case "com.huawei.health.h5.dm-ccbk":
                String path = builder.getPath();
                if (!TextUtils.isEmpty(path) && path.contains("path=devicePairing")) {
                    return interceptDevicePair(builder);
                }
                return interceptHeartRateOption(builder);
            case "com.huawei.health.h5.diabetic":
                return interceptDisabetic(builder);
            case "com.huawei.health.h5.sports-path":
                return initSportPath(builder);
            case "com.huawei.health.h5.abpm":
                return interceptAbpmOption(builder);
            case "com.huawei.health.h5.kaka":
                return interceptKakaMall(builder);
            case "com.huawei.health.h5.intelligent-training-plan":
                return initIntelligentTrainingPlan(builder);
            case "com.huawei.health.h5.sports-record":
            case "com.huawei.health.h5.health-data-subpage":
                return interceptSubPage(builder);
            case "com.huawei.health.h5.weight":
                return interceptWeight(builder);
            case "com.huawei.health.h5.ai-chat":
                return interceptAiChat(builder);
            case "com.huawei.health.h5.health-clovers":
                return interceptHealthLife(builder);
            case "com.huawei.health.h5.external-task":
                return interceptExternalTask(builder);
            case "com.huawei.health.h5.knowledge":
                return interceptKnowledgePage(builder);
            default:
                LogUtil.a(TAG, "no intercept");
                return builder.build();
        }
    }

    private static H5ProLaunchOption interceptHealthLife(H5ProLaunchOption.Builder builder) {
        H5ProServiceManager.getInstance().registerService((Class<?>) ((BloodPressureApi) Services.b("Main", BloodPressureApi.class)).getBloodPressureJsApi());
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
        }
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class).addCustomizeJsModule("HealthLife", HealthLifeJsApi.class).addCustomizeJsModule("weight", WeightJsApi.class).addCustomizeJsModule("device", Device.class).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).setNeedSoftInputAdapter();
        return builder.build();
    }

    private static H5ProLaunchOption interceptSleepRecord(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule("SleepDetection", pjo.b().getJsModule());
        return builder.build();
    }

    private static H5ProLaunchOption interceptFitnessTestOption(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        H5ProClient.getServiceManager().registerService(CryptoApi.class);
        H5ProServiceManager.getInstance().registerService(PhysicalFitnessH5Interface.class);
        builder.addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).enableSlowWholeDocumentDraw().setNeedSoftInputAdapter();
        return builder.build();
    }

    private static H5ProLaunchOption interceptMatterOption(H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.addCustomizeJsModule(DeviceStatusJsApi.MODEL, DeviceStatusJsApi.class);
        builder.addCustomizeJsModule(MatterDataJsApi.MODEL, MatterDataJsApi.class);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        builder.addCustomizeJsModule("innerapi", InnerApi.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("ecgJsModule", EcgJsModule.class);
        builder.showStatusBar();
        builder.setImmerse();
        builder.setStatusBarTextBlack(true);
        builder.setForceDarkMode(1);
        return builder.build();
    }

    private static H5ProLaunchOption initAiFitnessCourse(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi == null) {
            LogUtil.e(TAG, "fitnessAdviceApi is null.");
        } else {
            H5ProClient.getServiceManager().registerService(fitnessAdviceApi.getAiFitnessServiceH5RepositoryApi());
            H5ProClient.getServiceManager().registerService(SeriesCourseH5Repository.class);
        }
        return builder.build();
    }

    private static H5ProLaunchOption interceptAutoLoginOption(H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule("autoLoginH5", AutoLoginH5Entry.class);
        return interceptHealthVitalityOption(builder);
    }

    private static H5ProLaunchOption interceptHealthVitalityOption(H5ProLaunchOption.Builder builder) {
        builder.setImmerse().showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true);
        return builder.build();
    }

    private static H5ProLaunchOption interceptWalkUpOption(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.setImmerse().addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true).enableImageCache().hideBottomVirtualKeys();
        return builder.build();
    }

    private static H5ProLaunchOption initInnerSleepMusic(H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("notificationAudioControl", ddv.b().getCommonJsModule("notificationAudioControl")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).addCustomizeJsModule("course", ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getCourseDetailH5Bridge()).enableOnPauseCallback().setForceDarkMode(1);
        SeriesCourseH5Repository.registerService();
        return builder.build();
    }

    private static H5ProLaunchOption interceptVascularOption(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.setImmerse().addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).addCustomizeJsModule("ecgJsModule", ddvVarB.getCommonJsModule("ecgJsModule")).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("wearengine", ddvVarB.getCommonJsModule("wearengine")).showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true);
        return builder.build();
    }

    private static H5ProLaunchOption interceptAiBodyShapeOption(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        FamilyHealthZoneApi familyHealthZoneApi = (FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class);
        Class<? extends JsModuleBase> commonJsModule = familyHealthZoneApi != null ? familyHealthZoneApi.getCommonJsModule("healthZoneApi") : null;
        if (commonJsModule != null) {
            builder.addCustomizeJsModule("healthZoneApi", commonJsModule);
        } else {
            LogUtil.j(TAG, "interceptAiBodyShapeOption: healthZoneApi is null");
        }
        return builder.enableOnResumeCallback().build();
    }

    private static H5ProLaunchOption interceptHealthHeadLinesOption(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        ddv ddvVarB = ddv.b();
        HealthHeadLinesJsApi healthHeadLinesJsApi = (HealthHeadLinesJsApi) Services.d("HealthHeadLines", HealthHeadLinesJsApi.class);
        Class<? extends JsModuleBase> commonJsModule = healthHeadLinesJsApi != null ? healthHeadLinesJsApi.getCommonJsModule("healthHeadlines") : null;
        if (commonJsModule != null) {
            builder.addCustomizeJsModule("healthHeadlines", commonJsModule);
        } else {
            LogUtil.j(TAG, "interceptHealthHeadLinesOption: healthHeadLinesInnerApi is null");
        }
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).setImmerse().setStatusBarTextBlack(true).enableSlowWholeDocumentDraw().enableImageCache().showStatusBar();
        H5ProLaunchOption h5ProLaunchOptionBuild = builder.build();
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        return h5ProLaunchOptionBuild;
    }

    private static H5ProLaunchOption interceptActiveTargetOption(H5ProLaunchOption.Builder builder) {
        H5ProServiceManager.getInstance().registerService(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getActiveTargetService());
        initInnerFullScreenApp(builder);
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddvVarB.getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).addCustomizeJsModule(ArkUIJsApi.MODEL, ddvVarB.getCommonJsModule(ArkUIJsApi.MODEL));
        builder.setNeedSoftInputAdapter();
        return builder.build();
    }

    private static H5ProLaunchOption interceptHealthRecordOption(H5ProLaunchOption.Builder builder) {
        H5ProServiceManager.getInstance().registerService(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getHealthRecordsJsApi());
        ffv.r();
        PressureApi pressureApi = (PressureApi) Services.b("Main", PressureApi.class);
        H5ProServiceManager.getInstance().registerService((Class<?>) pressureApi.getPressureJsApi());
        H5ProServiceManager.getInstance().registerService((Class<?>) ((BloodPressureApi) Services.b("Main", BloodPressureApi.class)).getBloodPressureJsApi());
        initInnerFullScreenApp(builder);
        builder.addCustomizeArg("examinationId", "0");
        builder.setNeedSoftInputAdapter();
        builder.addCustomizeJsModule("JsInteraction", JsInteractionCompact.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("PressureNewJsApi", pressureApi.getPressureNewJsApi());
        return builder.build();
    }

    private static H5ProLaunchOption interceptSleepApnea(H5ProLaunchOption.Builder builder) {
        ecu.d().checkBindPhoneService();
        initInnerFullScreenApp(builder);
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.addCustomizeJsModule("ecgJsModule", ddvVarB.getCommonJsModule("ecgJsModule"));
        builder.addCustomizeJsModule("healthosa", kjy.b().getOsaJsModule("healthosa"));
        return builder.build();
    }

    private static H5ProLaunchOption interceptMenstrual(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule("menstrual", ddvVarB.getCommonJsModule("menstrual")).addCustomizeJsModule("JsInteraction", ddvVarB.getCommonJsModule("JsInteraction")).addCustomizeJsModule("AchieveUtil", ddq.d().getCommonJsModule("achievement")).addCustomizeJsModule(ArkUIJsApi.MODEL, ddvVarB.getCommonJsModule(ArkUIJsApi.MODEL));
        return builder.build();
    }

    private static H5ProLaunchOption interceptDiveOption(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddvVarB.getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL));
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi"));
        return builder.build();
    }

    private static H5ProLaunchOption interceptGolfOption(H5ProLaunchOption.Builder builder) {
        H5ProClient.getServiceManager().registerService(CryptoApi.class);
        H5ProServiceManager.getInstance().registerService(GolfH5NativeInterface.class);
        builder.addCustomizeJsModule("healthZoneApi", ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getCommonJsModule("healthZoneApi"));
        builder.addCustomizeJsModule("GolfDeviceInterface", GolfH5DownloadInterface.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        return builder.build();
    }

    private static H5ProLaunchOption initIntelligentTrainingPlan(H5ProLaunchOption.Builder builder) {
        H5ProClient.getServiceManager().registerService(PlanDeviceManager.class);
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("course", ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getCourseDetailH5Bridge()).addCustomizeJsModule("LocationService", ddv.b().getCommonJsModule("LocationService")).setNeedSoftInputAdapter().setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1);
        SeriesCourseH5Repository.registerService();
        H5ProServiceManager.getInstance().registerService(((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getIntelligentPlanH5RepositoryApi());
        return builder.build();
    }

    private static H5ProLaunchOption initSportPath(H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule("SportRouteService", ddv.b().getCommonJsModule("SportRouteService")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("storage", ddv.b().getCommonJsModule("storage")).setImmerse().showStatusBar();
        return builder.build();
    }

    private static H5ProLaunchOption interceptWeight(H5ProLaunchOption.Builder builder) {
        flushCacheToDB();
        initInnerFullScreenApp(builder);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
            H5ProServiceManager.getInstance().registerService(weightApi.getFastingLiteRepositoryApi());
        } else {
            LogUtil.j(TAG, "interceptWeight: weightApi is null");
        }
        H5ProClient.getServiceManager().registerService(PlanDeviceManager.class);
        lua.a("intelligent_plan", KEY_LAST_REFRESH_PLAN_TIME_MILLIS, 0L);
        H5ProServiceManager.getInstance().registerService(((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getIntelligentPlanH5RepositoryApi());
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).addCustomizeJsModule("weight", WeightJsApi.class).addCustomizeJsModule("WeightManagement", WeightManagementJsApi.class).addCustomizeJsModule("device", Device.class).addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class).addCustomizeJsModule("LocationService", ddv.b().getCommonJsModule("LocationService")).enableOnPauseCallback().enableOnDestroyCallback();
        return builder.build();
    }

    private static void flushCacheToDB() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.H5proUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                H5proUtil.lambda$flushCacheToDB$1();
            }
        });
    }

    static /* synthetic */ void lambda$flushCacheToDB$1() {
        fga.d(BaseApplication.getContext()).e().e((IFlushResult) null);
        ReleaseLogUtil.d(TAG, "flushCacheToDB");
    }

    private static H5ProLaunchOption interceptAiChat(H5ProLaunchOption.Builder builder) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
        } else {
            LogUtil.j(TAG, "weightApi is null.");
        }
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class).addCustomizeJsModule("weight", WeightJsApi.class).addCustomizeJsModule("AiChat", AiChatJsApi.class).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setNeedSoftInputAdapter().setImmerse().enableOnPauseCallback().enableOnDestroyCallback();
        return builder.build();
    }

    private static H5ProLaunchOption interceptDevicePair(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class).addCustomizeJsModule("MessageNotificationManager", MessageNotificationJsApi.class).addCustomizeJsModule("UpdateDeviceManager", UpdateDeviceJsApi.class).addCustomizeJsModule("DeviceResourceManager", DeviceResourceJsApi.class).addCustomizeJsModule("FileService", FileServiceJsApi.class).enableOnPauseCallback().enableOnDestroyCallback();
        return builder.build();
    }

    private static H5ProLaunchOption interceptMyPlan(H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule("weight", WeightJsApi.class);
        return builder.build();
    }

    private static H5ProLaunchOption interceptAiWeight(H5ProLaunchOption.Builder builder) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            LogUtil.j(TAG, "interceptCustomRecipeOption: weightApi is null");
        } else {
            H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
        }
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi == null) {
            LogUtil.e(TAG, "fitnessAdviceApi is null.");
        } else {
            H5ProServiceManager.getInstance().registerService(fitnessAdviceApi.getIntelligentPlanH5RepositoryApi());
        }
        H5ProClient.getServiceManager().registerService(SeriesCourseH5Repository.class);
        H5ProClient.getServiceManager().registerService(PlanDeviceManager.class);
        builder.setImmerse().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("WeightManagement", WeightManagementJsApi.class).addCustomizeJsModule("LocationService", ddv.b().getCommonJsModule("LocationService")).addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class).addCustomizeJsModule("weight", ddv.b().getCommonJsModule("weight")).addCustomizeJsModule("device", Device.class).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).showStatusBar().setStatusBarTextBlack(true).setNeedSoftInputAdapter().setForceDarkMode(1);
        return builder.build();
    }

    private static H5ProLaunchOption initInnerFullScreenApp(H5ProLaunchOption.Builder builder) {
        builder.setImmerse().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true);
        HeartRateSettingApi heartRateSettingApi = (HeartRateSettingApi) Services.d("Main", HeartRateSettingApi.class);
        if (heartRateSettingApi != null) {
            H5ProServiceManager.getInstance().registerService(heartRateSettingApi.getCustomDataApi());
        } else {
            LogUtil.j(TAG, "initInnerFullScreenApp: heartRateSettingApi is null");
        }
        return builder.build();
    }

    private static H5ProLaunchOption initInnerSeriesCourse(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).addCustomizeJsModule("course", ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getCourseDetailH5Bridge()).addCustomizeJsModule(BleConstants.BLE_JSINTERACTION, BleJsInteractionCompact.class).addCustomizeJsModule(BleConstants.BLE_HI_LINK, BleJsInteractionCompact.class).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1);
        SeriesCourseH5Repository.registerService();
        HeartRateSettingApi heartRateSettingApi = (HeartRateSettingApi) Services.d("Main", HeartRateSettingApi.class);
        if (heartRateSettingApi != null) {
            H5ProServiceManager.getInstance().registerService(heartRateSettingApi.getCustomDataApi());
        } else {
            LogUtil.j(TAG, "initInnerSeriesCourse: heartRateSettingApi is null");
        }
        return builder.build();
    }

    private static H5ProLaunchOption interceptPpgOption(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.setImmerse().addCustomizeJsModule("ppgJsModule", ddvVarB.getCommonJsModule("ppgJsModule")).addCustomizeJsModule("ecgJsModule", ddvVarB.getCommonJsModule("ecgJsModule")).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true);
        return builder.build();
    }

    private static H5ProLaunchOption interceptBreathOption(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.setImmerse().addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class).addCustomizeJsModule("breathtrain", ddvVarB.getCommonJsModule("breathtrain")).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddvVarB.getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true);
        return builder.build();
    }

    private static H5ProLaunchOption interceptDietDiaryOption(H5ProLaunchOption.Builder builder) {
        flushCacheToDB();
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
            weightApi.joinDietDiary();
            weightApi.syncDietData();
        } else {
            LogUtil.j(TAG, "interceptDietDiaryOption: weightApi is null");
        }
        builder.setImmerse().addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).addCustomizeJsModule("WeightManagement", WeightManagementJsApi.class).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("HealthLife", HealthLifeJsApi.class).showStatusBar().setStatusBarTextBlack(true).setNeedSoftInputAdapter().addCustomizeJsModule("DietKakaUtil", DietKakaUtil.class).addCustomizeJsModule("RecognizeH5Helper", RecognizeH5Helper.class).setForceDarkMode(1);
        return builder.build();
    }

    private static H5ProLaunchOption interceptCustomRecipeOption(H5ProLaunchOption.Builder builder) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            LogUtil.j(TAG, "interceptCustomRecipeOption: weightApi is null");
        } else {
            H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            weightApi.syncDietData();
        }
        lua.a("intelligent_plan", KEY_LAST_REFRESH_PLAN_TIME_MILLIS, 0L);
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi == null) {
            LogUtil.e(TAG, "fitnessAdviceApi is null.");
        } else {
            H5ProServiceManager.getInstance().registerService(fitnessAdviceApi.getIntelligentPlanH5RepositoryApi());
        }
        H5ProClient.getServiceManager().registerService(PlanDeviceManager.class);
        builder.setImmerse().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("tradeApi", JsTradeApi.class).addCustomizeJsModule("weight", WeightJsApi.class).addCustomizeJsModule("WeightManagement", WeightManagementJsApi.class).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).showStatusBar().setStatusBarTextBlack(true).setNeedSoftInputAdapter().addCustomizeJsModule("DietKakaUtil", DietKakaUtil.class).setForceDarkMode(1);
        return builder.build();
    }

    private static H5ProLaunchOption interceptFastingLiteOption(H5ProLaunchOption.Builder builder) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getFastingLiteRepositoryApi());
        } else {
            LogUtil.j(TAG, "interceptFastingLiteOption: weightApi is null");
        }
        builder.setImmerse().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", JsTradeApi.class).showStatusBar().setStatusBarTextBlack(true).enableImageCache().setNeedSoftInputAdapter().setForceDarkMode(1);
        return builder.build();
    }

    private static H5ProLaunchOption interceptAbpmOption(H5ProLaunchOption.Builder builder) {
        LogUtil.a(TAG, "interceptAbpmOption");
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device"));
        BloodPressureApi bloodPressureApi = (BloodPressureApi) Services.b("Main", BloodPressureApi.class);
        LogUtil.a(TAG, "interceptAbpmOption bloodPressureApi", bloodPressureApi.getBloodPressureJsApi().getSimpleName());
        H5ProServiceManager.getInstance().registerService((Class<?>) bloodPressureApi.getBloodPressureJsApi());
        return builder.build();
    }

    private static H5ProLaunchOption interceptHeartRateOption(H5ProLaunchOption.Builder builder) {
        LogUtil.a(TAG, "interceptHeartHealthOption");
        builder.setImmerse().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class).showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true);
        H5ProClient.getServiceManager().registerService((Class<?>) ((HeartRateApi) Services.b("Device", HeartRateApi.class)).getHeartRateJsApi());
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        return builder.build();
    }

    private static H5ProLaunchOption interceptVipOption(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.enableOnResumeCallback();
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddvVarB.getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL));
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        UtilApi utilApi = (UtilApi) Services.b("HomeHealth", UtilApi.class);
        if (utilApi != null) {
            H5ProServiceManager.getInstance().registerService(utilApi.getUtilJsApi());
        }
        builder.addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi != null) {
            builder.addCustomizeJsModule("VipInnerApi", vipApi.getCommonJsModule("VipInnerApi"));
        }
        H5ProServiceManager.getInstance().registerService((Class<?>) ((BloodPressureApi) Services.b("Main", BloodPressureApi.class)).getBloodPressureJsApi());
        ffv.r();
        return builder.build();
    }

    private static H5ProLaunchOption interceptEcgOption(H5ProLaunchOption.Builder builder) {
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        ddv ddvVarB = ddv.b();
        builder.setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1).addCustomizeJsModule("message", messageCenterApi.getCommonJsModule("message")).addCustomizeJsModule("ecgJsModule", ddvVarB.getCommonJsModule("ecgJsModule")).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddvVarB.getCommonJsModule(RemoteMessageConst.NOTIFICATION)).addCustomizeJsModule("notificationAudioControl", ddvVarB.getCommonJsModule("notificationAudioControl")).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule(ArkUIJsApi.MODEL, ddvVarB.getCommonJsModule(ArkUIJsApi.MODEL)).addCustomizeJsModule("shareToCaasApi", ddvVarB.getCommonJsModule("shareToCaasApi"));
        Class<? extends JsModuleBase> commonJsModule = ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getCommonJsModule("healthZoneApi");
        if (commonJsModule != null) {
            builder.addCustomizeJsModule("healthZoneApi", commonJsModule);
        } else {
            LogUtil.j(TAG, "interceptEcgOption: healthZoneApi is null");
        }
        return builder.build();
    }

    private static H5ProLaunchOption interceptGroupOption(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddvVarB.getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).addCustomizeJsModule("sport", ddvVarB.getCommonJsModule("sport")).addCustomizeJsModule("GroupService", GroupJsApi.class).setImmerse().showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true).setNeedSoftInputAdapter();
        return builder.build();
    }

    private static H5ProLaunchOption interceptAnnualReport(H5ProLaunchOption.Builder builder) {
        ddv ddvVarB = ddv.b();
        builder.setImmerse().addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddvVarB.getCommonJsModule("JsInteraction")).addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddvVarB.getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).addCustomizeJsModule("AchieveUtil", ddq.d().getCommonJsModule("achievement")).setForceDarkMode(1).showStatusBar().enableSlowWholeDocumentDraw().enableImageCache().setStatusBarTextBlack(true);
        return builder.build();
    }

    private static H5ProLaunchOption interceptSnackControl(H5ProLaunchOption.Builder builder) {
        H5ProServiceManager.getInstance().registerService(((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).getTodoJsClass());
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            weightApi.syncDietData();
        } else {
            LogUtil.j(TAG, "weightApi is null.");
        }
        builder.setImmerse().enableOnResumeCallback().showStatusBar().setNeedSoftInputAdapter().addCustomizeJsModule("tradeApi", JsTradeApi.class).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("WeightManagement", WeightManagementJsApi.class).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).setForceDarkMode(1);
        return builder.build();
    }

    private static void interceptBodySensorOption(H5ProLaunchOption.Builder builder) {
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi == null) {
            LogUtil.e(TAG, "fitnessAdviceApi is null.");
        } else {
            H5ProServiceManager.getInstance().registerService(fitnessAdviceApi.getBodySenseCourseH5RepositoryApi());
            builder.addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("bodySenseApi", fitnessAdviceApi.getBodySenseJsBridgeApi()).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(0);
        }
    }

    private static void initJsBridgeModule() {
        ShareEntry.setShareImpl(new ShareImpl());
        H5ProResidentExtManager.setPermissionExtApi(new PermissionImpl());
        H5ProClient.getServiceManager().registerService(HealthCommonApi.class);
        H5ProClient.registerBridgeClass("healthyliving", ddv.b().getCommonJsModule("healthyliving"));
        H5ProClient.registerBridgeClass("healthengine", ddv.b().getCommonJsModule("healthengine"));
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi != null) {
            H5ProServiceManager.getInstance().registerService(sleepApi.getSleepManagementJsApi());
        } else {
            LogUtil.a(TAG, "sleepServiceApi is null");
        }
    }

    private static void initSalableServices() {
        H5ProClient.registerScalableService(new H5ProAppLoadStorageServiceImpl());
        if (isOpenH5VersionGraySwitch) {
            H5ProClient.registerVersionInterceptor(new H5ProInterceptor<String, String>() { // from class: com.huawei.operation.h5pro.H5proUtil.1
                @Override // com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor
                public void intercept(String str, H5ProInterceptor.InterceptCallback<String> interceptCallback) {
                    H5ProVersionManager.checkH5Upgrade(str, interceptCallback);
                }
            });
        }
        H5ProClient.registerVersionUpgradeApi(new H5ProVersionUpgradeExitImpl());
        H5ProClient.registerHostRuntimeApi(new H5ProAppRuntimeImpl());
    }

    private static boolean isOpenDebugLog() {
        return Boolean.parseBoolean(SharedPreferenceManager.e(jbg.a(), "2040", "beta_debug_log_switch"));
    }

    private static void initEnvironment() {
        EnvironmentHelper.BuildType buildType;
        synchronized (H5proUtil.class) {
            if (CommonUtil.bu()) {
                buildType = EnvironmentHelper.BuildType.RELEASE;
            } else if (CommonUtil.cl()) {
                buildType = EnvironmentHelper.BuildType.TEST;
            } else if (CommonUtil.ap()) {
                buildType = isOpenDebugLog() ? EnvironmentHelper.BuildType.DEBUG : EnvironmentHelper.BuildType.BETA;
            } else if (CommonUtil.ba()) {
                buildType = EnvironmentHelper.BuildType.GREEN;
            } else if (CommonUtil.ao() || CommonUtil.cj()) {
                buildType = EnvironmentHelper.BuildType.DEBUG;
            } else {
                buildType = EnvironmentHelper.BuildType.RELEASE;
            }
            H5ProClient.setBuildType(buildType);
            H5ProClient.setMobileAppEngine(EnvironmentInfo.m());
            setEnvironmentUrl(buildType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setEnvironmentUrl(final EnvironmentHelper.BuildType buildType) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.H5proUtil$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    H5proUtil.setEnvironmentUrl(buildType);
                }
            });
            return;
        }
        Context context = BaseApplication.getContext();
        if ("1".equals(SharedPreferenceManager.e(context, "developeroptions", "developerswitch"))) {
            String strE = SharedPreferenceManager.e(context, "developeroptions", "hpk_test_environment_change_url");
            if (!TextUtils.isEmpty(strE)) {
                H5ProClient.setBaseUrl(strE);
                LogUtil.a(TAG, "setEnvironmentUrl: end(developer) -> " + strE);
                return;
            }
        }
        String contentCenterDomain = getContentCenterDomain(context);
        if (contentCenterDomain == null) {
            ReleaseLogUtil.e("R_H5PRO_H5proUtil", "domainName is null");
            return;
        }
        ReleaseLogUtil.d("R_H5PRO_H5proUtil", "setEnvironmentUrl: buildType -> " + buildType.name() + "--" + contentCenterDomain.contains(BleConstants.WEIGHT_KEY));
        if (buildType == EnvironmentHelper.BuildType.TEST || buildType == EnvironmentHelper.BuildType.GREEN) {
            H5ProClient.setBaseUrl(String.format(Locale.ENGLISH, "%s%s", contentCenterDomain, "/sandbox/cch5/testappCCH5/"));
        } else if (buildType == EnvironmentHelper.BuildType.DEBUG || buildType == EnvironmentHelper.BuildType.BETA) {
            H5ProClient.setBaseUrl(String.format(Locale.ENGLISH, "%s%s", contentCenterDomain, "/sandbox/cch5/health/"));
        } else {
            H5ProClient.setBaseUrl(String.format(Locale.ENGLISH, "%s%s", contentCenterDomain, "/cch5/health/"));
        }
        LogUtil.a(TAG, "setEnvironmentUrl: end");
    }

    public static String getContentCenterDomain(Context context) {
        String url;
        GRSManager gRSManagerC = GRSManager.c(context);
        if (health.compact.a.Utils.k()) {
            url = gRSManagerC.getNoCheckUrl("domainContentcenterDbankcdnNew", gRSManagerC.getCountryCode());
        } else {
            url = gRSManagerC.getUrl("domainContentcenterDbankcdnNew");
        }
        if (!TextUtils.isEmpty(url)) {
            return url;
        }
        LogUtil.j(TAG, "setEnvironmentUrl: domain name is empty");
        return null;
    }

    private static void initBiAnalyser() {
        Analyzer.enable(lmf.b());
        Analyzer.setEnvironmentParam(lmf.d().c());
    }

    private static void initBiAnalyserOnce() {
        Analyzer.addForceBiPackageName("com.huawei.health.h5.vip");
        Analyzer.addGlobalParamKeys(GLOBAL_BI_PARAM_KEYS);
        Analyzer.setAnalyzerProxy(new AnalyzerProxyImpl());
    }

    public static String bytesToHexString(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return sb.toString();
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(hexString);
                sb.append(str);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString();
    }

    public static byte[] hexStringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.trim().toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    private static byte charToByte(char c2) {
        return (byte) "0123456789ABCDEF".indexOf(c2);
    }

    private static H5ProLaunchOption interceptMarketingOption(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).enableSlowWholeDocumentDraw().setNeedSoftInputAdapter();
        return builder.build();
    }

    private static H5ProLaunchOption interceptComplaint(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        return builder.build();
    }

    private static H5ProLaunchOption interceptPersonalInfo(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule("privacyCollection", PrivacyCollectionJsApi.class);
        return builder.build();
    }

    private static H5ProLaunchOption interceptComplaintCenter(String str, H5ProLaunchOption.Builder builder) {
        Uri uri = Uri.parse(str);
        if (uri.getBooleanQueryParameter("isComplaint", false)) {
            builder.addCustomizeJsModule(com.huawei.openalliance.ad.constant.Constants.GET_COMPLAIN_ADD_INFO_JS_NAME, ComplaintJsApi.class);
            H5ProBundle h5ProBundle = new H5ProBundle(com.huawei.openalliance.ad.constant.Constants.GET_COMPLAIN_ADD_INFO_JS_NAME);
            for (String str2 : ComplaintConstants.COMPLAINT_PARAM_KEYS) {
                h5ProBundle.putString(str2, uri.getQueryParameter(str2));
            }
            builder.addBundle(h5ProBundle);
        }
        return builder.build();
    }

    private static H5ProLaunchOption interceptKakaMall(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        ddq ddqVarD = ddq.d();
        builder.addCustomizeJsModule("DialogApi", DialogApi.class).addCustomizeJsModule("AchieveUtil", ddqVarD.getCommonJsModule("achievement")).addCustomizeJsModule("CloudUtil", ddqVarD.getCommonJsModule("CloudUtil")).addCustomizeJsModule("JsInteraction", JsInteractionCompact.class).enableImageCache();
        return builder.build();
    }

    private static H5ProLaunchOption interceptHealthTrend(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule("JsInteraction", JsInteractionCompact.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        BloodPressureApi bloodPressureApi = (BloodPressureApi) Services.b("Main", BloodPressureApi.class);
        LogUtil.a(TAG, "interceptHealthTrend bloodPressureApi", bloodPressureApi.getBloodPressureJsApi().getSimpleName());
        H5ProServiceManager.getInstance().registerService((Class<?>) bloodPressureApi.getBloodPressureJsApi());
        SummaryApi summaryApi = (SummaryApi) Services.b("HomeHealth", SummaryApi.class);
        LogUtil.a(TAG, "interceptHealthTrend ", summaryApi.getSummaryJsApi().getSimpleName());
        builder.addCustomizeJsModule("healthTrend", summaryApi.getSummaryJsApi());
        return builder.build();
    }

    private static H5ProLaunchOption interceptExternalTask(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        return builder.build();
    }

    private static void buildCommon(String str, H5ProLaunchOption.Builder builder) {
        builder.addCustomizeJsModule("DialogApi", DialogApi.class).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
    }

    private static H5ProLaunchOption interceptSubPage(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("sportsRecord", SportHistoryJsApi.class);
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("BloodPressureImpl", BloodPressureService.class);
        return builder.build();
    }

    private static H5ProLaunchOption interceptKnowledgePage(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        builder.addCustomizeJsModule("device", Device.class);
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        return builder.build();
    }

    public static void putH5ProGlobalBiParams(String str, H5ProLaunchOption.Builder builder) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = Constants.OPEN_HEALTH_SPORT_PREFIX + str;
        }
        Uri uri = Uri.parse(str);
        if (uri.isOpaque()) {
            return;
        }
        for (String str2 : GLOBAL_BI_PARAM_KEYS) {
            String queryParameter = uri.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                builder.addGlobalBiParam(str2, queryParameter);
            }
        }
    }

    public static void initH5ProAndRefreshVersionDataOnce() {
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.j(TAG, "initH5ProAndRefreshVersionDataOnce: getAuthorizationStatus -> false");
            return;
        }
        if (BuildTypeConfig.e()) {
            initH5pro();
        }
        if (isOpenH5VersionGraySwitch) {
            H5ProVersionManager.syncH5VersionSummary();
        }
        H5ProPkgPreloadSyncTask.startTaskWithDelay(BaseApplication.getContext(), HOME_PRELOAD_H5_PKG_ARRAY, new H5PreloadWeightStrategy(), 3000L);
        H5ProPkgPreloadSyncTask.startTaskWithDelay(BaseApplication.getContext(), DEVICE_PRELOAD_H5_PKG_ARRAY, new H5PreloadDeviceStrategy(), 3000L);
    }

    public static void putBiEventFromH5Deeplink(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("Steps", 1);
        map.put("H5package", str2);
        map.put("H5url", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.H5_RESOURCE_LOAD_EVENT_VALUE.value(), map, 0);
    }

    private static H5ProLaunchOption interceptDisabetic(H5ProLaunchOption.Builder builder) {
        initInnerFullScreenApp(builder);
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ArkUIJsApi.class);
        builder.setImmerse().addCustomizeJsModule("ecgJsModule", ddv.b().getCommonJsModule("ecgJsModule")).addCustomizeJsModule("device", Device.class);
        return builder.build();
    }
}
