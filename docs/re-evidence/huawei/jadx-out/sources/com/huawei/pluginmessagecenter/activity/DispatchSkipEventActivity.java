package com.huawei.pluginmessagecenter.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.webkit.ProxyConfig;
import com.braintreepayments.api.PayPalRequest;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.adapterhealthmgr.api.AdapterHealthMgrApi;
import com.huawei.health.adapterwear.api.AdapterWearMgrApi;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.msgcontent.NotificationMsgContent;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPay;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.stories.about.AboutApi;
import defpackage.ddv;
import defpackage.ddy;
import defpackage.dmg;
import defpackage.ecu;
import defpackage.eel;
import defpackage.fcn;
import defpackage.fti;
import defpackage.fua;
import defpackage.gcn;
import defpackage.hcb;
import defpackage.idy;
import defpackage.ifp;
import defpackage.iov;
import defpackage.irz;
import defpackage.iun;
import defpackage.lmf;
import defpackage.lmm;
import defpackage.lsx;
import defpackage.ohf;
import defpackage.pha;
import defpackage.phb;
import defpackage.phn;
import defpackage.prf;
import defpackage.qhu;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class DispatchSkipEventActivity extends BaseActivity {
    private static volatile Runnable d;
    private Bundle f;
    private String h;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String r;
    private String t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22375b = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22374a = new Object();
    private static Handler e = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f22376c = new ArrayList<Integer>() { // from class: com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity.3
        {
            add(10002);
            add(10003);
            add(10006);
        }
    };
    private String s = null;
    private String q = null;
    private ExecutorService g = Executors.newCachedThreadPool();
    private boolean j = false;
    private final Handler i = new Handler() { // from class: com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                DispatchSkipEventActivity.e.removeCallbacks(DispatchSkipEventActivity.d);
            }
            super.handleMessage(message);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        d(intent);
        Bundle bundle2 = this.f;
        String string = bundle2 != null ? bundle2.getString(CommonUtil.DETAIL_URI) : intent.getStringExtra(CommonUtil.DETAIL_URI);
        if (TextUtils.isEmpty(this.h) || TextUtils.isEmpty(string)) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "msgId or detailUri is null");
            finish();
            return;
        }
        ThreadPoolManager.c().execute(new a(this));
        LogUtil.d("UIDV_DispatchSkipEventActivity", "onCreate detailUri" + string + "  msgId = " + this.h);
        if (string.startsWith("huaweischeme")) {
            k(string);
        } else if (string.startsWith("huaweihealth")) {
            h(string);
        } else {
            d(string);
        }
        if (this.j) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "isLogining，not need finish");
        } else {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        d(intent);
    }

    /* JADX INFO: loaded from: classes14.dex */
    static class a implements Runnable {
        private WeakReference<DispatchSkipEventActivity> d;

        a(DispatchSkipEventActivity dispatchSkipEventActivity) {
            this.d = new WeakReference<>(dispatchSkipEventActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            DispatchSkipEventActivity dispatchSkipEventActivity = this.d.get();
            if (dispatchSkipEventActivity != null && !dispatchSkipEventActivity.isFinishing() && !dispatchSkipEventActivity.isDestroyed()) {
                pha.e(BaseApplication.getContext()).d(dispatchSkipEventActivity.h);
            } else {
                LogUtil.j("UIDV_DispatchSkipEventActivity", "activity is null or finishing or destroyed");
            }
        }
    }

    private void h(String str) {
        if (str.contains("com.huawei.health.h5.my-annual-flag")) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "isAnnualFlag jump");
            n();
        } else {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            lsx.c(intent, getApplicationContext());
        }
    }

    private void n() {
        LoginInit loginInit = LoginInit.getInstance(this);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "LoginInit status", Boolean.valueOf(loginInit.getIsLogined()));
        if (!loginInit.getIsLogined() || !AuthorizationUtils.c(this) || health.compact.a.CommonUtil.ae(this)) {
            b("activeTarget", "activeTarget");
        } else {
            f("activeTarget");
        }
    }

    private void d(Intent intent) {
        if (intent.getExtras() != null) {
            this.f = intent.getExtras();
        }
        Bundle bundle = this.f;
        this.h = bundle != null ? bundle.getString("msgId") : intent.getStringExtra("msgId");
        Bundle bundle2 = this.f;
        this.o = bundle2 != null ? bundle2.getString("notifiUri") : intent.getStringExtra("notifiUri");
        Bundle bundle3 = this.f;
        this.n = bundle3 != null ? bundle3.getString("messageContent") : intent.getStringExtra("messageContent");
        Bundle bundle4 = this.f;
        this.r = bundle4 != null ? bundle4.getString("EXTRA_BI_NAME") : intent.getStringExtra("EXTRA_BI_NAME");
        Bundle bundle5 = this.f;
        this.p = bundle5 != null ? bundle5.getString("EXTRA_BI_SOURCE") : intent.getStringExtra("EXTRA_BI_SOURCE");
        Bundle bundle6 = this.f;
        this.t = bundle6 != null ? bundle6.getString("SHOW_TIME_BI") : intent.getStringExtra("SHOW_TIME_BI");
        Bundle bundle7 = this.f;
        this.k = bundle7 != null ? bundle7.getString("OPEN_STYLE") : intent.getStringExtra("OPEN_STYLE");
        Bundle bundle8 = this.f;
        this.l = bundle8 != null ? bundle8.getString(MessageConstant.MESSAGE_TITLE) : intent.getStringExtra(MessageConstant.MESSAGE_TITLE);
        Bundle bundle9 = this.f;
        this.m = bundle9 != null ? bundle9.getString("module") : intent.getStringExtra("module");
        Bundle bundle10 = this.f;
        this.s = bundle10 != null ? bundle10.getString("pushId") : intent.getStringExtra("pushId");
        Bundle bundle11 = this.f;
        this.q = bundle11 != null ? bundle11.getString("serviceId") : intent.getStringExtra("serviceId");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.i.removeCallbacksAndMessages(null);
    }

    private void k(String str) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "skipScheme");
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        } else {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "marketRouterApi = null");
        }
    }

    private void d(String str) {
        String scheme;
        String host;
        if (String.valueOf(82).equals(this.m)) {
            str = "messagecenter://ecgDetail?ecgPageType=monthReport";
        }
        Uri uri = Uri.parse(str);
        if (uri == null || (scheme = uri.getScheme()) == null || (host = uri.getHost()) == null) {
            return;
        }
        LogUtil.a("UIDV_DispatchSkipEventActivity", "handleDetailUri scheme = " + scheme);
        if (!TextUtils.isEmpty(this.o)) {
            e(scheme, host);
        }
        c(scheme, str);
        d(host, uri);
        g(host);
        f(uri);
        h(uri);
        i(uri);
        j(host);
        d(uri, host);
        f(host);
        e(str);
    }

    private void f(String str) {
        if ("activeTarget".equals(str)) {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).gotoH5ActiveTarget(this);
        }
    }

    private void d(Uri uri, String str) {
        if ("nativeDevice".equals(str)) {
            String queryParameter = uri.getQueryParameter("action");
            String queryParameter2 = uri.getQueryParameter("arg1");
            String queryParameter3 = uri.getQueryParameter("arg2");
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                intent.setAction(queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("arg1", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("arg2", queryParameter3);
            }
            if ("SWITCH_PLUGINDEVICE".equals(queryParameter)) {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "goto device");
                intent.setPackage("com.huaei.health");
                intent.setClassName(f22375b, "com.huawei.health.device.ui.DeviceMainActivity");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
    }

    private void c(String str, String str2) {
        if (str.equals("http") || str.equals(ProxyConfig.MATCH_HTTPS)) {
            LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
            boolean zIsBrowseMode = loginInit.isBrowseMode();
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (zIsBrowseMode && operationUtilsApi != null && operationUtilsApi.isNotSupportBrowseUrl(str2)) {
                this.j = true;
                loginInit.browsingToLogin(new d(this, str2, ProxyConfig.MATCH_HTTPS), null);
            } else {
                o(str2);
            }
            c(this.m);
        }
        "messagecenter".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        if (!"BROWSER".equals(this.k)) {
            ddv ddvVarB = ddv.b();
            PluginBaseAdapter adapter = ddvVarB.getAdapter(this);
            if (!LoginInit.getInstance(this).getIsLogined()) {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "not login!");
                a(this, str, null);
                return;
            } else if (adapter != null) {
                d(ddvVarB, str);
                return;
            } else {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "adaper not ready, jump to main.");
                a(this, str, null);
                return;
            }
        }
        LogUtil.a("UIDV_DispatchSkipEventActivity", "BROWSER is not equals mOpenStyle");
    }

    private void d(ddv ddvVar, String str) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "adapter ready jump to h5");
        SharedPreferences.Editor editorEdit = getSharedPreferences("pushNotificationIntent", 0).edit();
        editorEdit.putBoolean(Constants.KEY_IS_PUSH_NOTIFICATION, true);
        editorEdit.apply();
        if ("SHOW_TIME_BI".equals(this.t)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putString("EXTRA_BI_ID", this.h);
            bundle.putString("EXTRA_BI_NAME", this.r);
            bundle.putString("EXTRA_BI_SOURCE", this.p);
            bundle.putString("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
            AppRouter.c("/PluginOperation/WebViewActivity").d(bundle).b(this);
            return;
        }
        ddvVar.startOperationWebPage(this, str);
    }

    private void a(Context context, String str, Uri uri) {
        Intent intent = new Intent();
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            try {
                String str2 = f22375b;
                intent.setComponent(new ComponentName(str2, packageManager.getLaunchIntentForPackage(str2).getComponent().getClassName()));
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(268468224);
                intent.putExtra("webUrl", str);
                intent.putExtra("weekMonthReportUri", uri);
                context.startActivity(intent);
            } catch (IllegalStateException e2) {
                LogUtil.e("UIDV_DispatchSkipEventActivity", "getHealthAPPIntent()", e2.getMessage());
            }
        }
    }

    private void d(String str, Uri uri) {
        e(str, uri);
        f(str, uri);
        c(str, uri);
        a(str, uri);
        b(str, uri);
    }

    private void e(String str) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "commonJump, strUri = ", str);
        if (TextUtils.isEmpty(str) || !str.contains(MessageConstant.SKIP_TYPE)) {
            return;
        }
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter(MessageConstant.SKIP_TYPE);
        queryParameter.hashCode();
        if (queryParameter.equals("1")) {
            String queryParameter2 = uri.getQueryParameter("destination");
            if (!TextUtils.isEmpty(queryParameter2) && phb.f45365c.contains(queryParameter2)) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("common_jump_uri", str);
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
                LogUtil.a("UIDV_DispatchSkipEventActivity", "OpAnalytics finish");
                Intent intent = new Intent();
                for (Map.Entry<String, String> entry : AppRouterUtils.a(uri).entrySet()) {
                    if (!"destination".equals(entry.getKey()) && !MessageConstant.SKIP_TYPE.equals(entry.getKey())) {
                        intent.putExtra(entry.getKey(), entry.getValue());
                    }
                }
                if ("com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity".equals(queryParameter2)) {
                    if (fua.p()) {
                        m();
                        return;
                    }
                    intent.setFlags(603979776);
                    long jLongValue = Long.valueOf(uri.getQueryParameter("key_marker_view_time")).longValue();
                    intent.putExtra("key_marker_view_time", jLongValue);
                    intent.putExtra("key_bundle_health_last_data_time", jLongValue);
                }
                intent.setClassName(this, queryParameter2);
                startActivity(intent);
            }
        }
    }

    private void m() {
        Bundle bundle = new Bundle();
        bundle.putString("page_id", ArkUIXConstants.KNIT_BLOOD_PRESSURE);
        bundle.putInt("module_type", 6);
        bundle.putString("bi_from_pullFrom", "Today_0001");
        bundle.putString("bi_from_resourceName", "home_card");
        bundle.putString("bi_from_pullOrder", "");
        fti.e(BaseApplication.getContext(), bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    private void e(String str, Uri uri) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "achieveMedal":
                b2 = 0;
                break;
            case "kakaMessage":
                b2 = 1;
                break;
            case "historyBestMessage":
                b2 = 2;
                break;
            case "sportReport":
                b2 = 3;
                break;
            case "dataShare":
                b2 = 4;
                break;
            case "nps_question":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            a(str, uri.getQueryParameter(ParsedFieldTag.MEDAL_ID));
            return;
        }
        if (b2 == 1) {
            Intent intent = getIntent();
            if (intent != null) {
                phn.d(this, uri, intent.getIntExtra("from", 1));
                return;
            }
            return;
        }
        if (b2 == 2) {
            AppRouter.c("/Main/FitnessStepDetailActivity").b(this);
            return;
        }
        if (b2 == 3) {
            if (j()) {
                a(this, null, uri);
                return;
            } else {
                b(uri);
                return;
            }
        }
        if (b2 != 4) {
            if (b2 != 5) {
                return;
            }
            AppRouter.c("/Main/QuestionMainActivity").b(this);
        } else {
            Intent intent2 = new Intent();
            String str2 = f22375b;
            intent2.setPackage(str2);
            intent2.setClassName(str2, "com.huawei.ui.thirdpartservice.activity.ThirdPartServiceActivity");
            startActivity(intent2);
        }
    }

    private void b(Uri uri) {
        Guidepost guidepostC;
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        if (achieveDataApi == null || achieveDataApi.getAdapter(this) == null) {
            a(this, null, uri);
            return;
        }
        try {
            int i = Integer.parseInt(uri.getQueryParameter("max_report_no"));
            int i2 = Integer.parseInt(uri.getQueryParameter("min_report_no"));
            int i3 = Integer.parseInt(uri.getQueryParameter("report_stype"));
            LogUtil.d("UIDV_DispatchSkipEventActivity", "handleDetailUri==>max-->" + i + ":min-->" + i2 + ":reportType-->" + i3);
            Bundle bundle = new Bundle();
            bundle.putString("max_report_no", String.valueOf(i));
            bundle.putString("min_report_no", String.valueOf(i2));
            bundle.putString("report_stype", String.valueOf(i3));
            if (i3 == 0) {
                guidepostC = AppRouter.c("/PluginAchievement/AchieveMonthReportActivity");
            } else {
                guidepostC = AppRouter.c("/PluginAchievement/AchieveWeekReportActivity");
            }
            guidepostC.d(276824064).d(bundle).b(this);
        } catch (NumberFormatException e2) {
            LogUtil.e("UIDV_DispatchSkipEventActivity", e2.getMessage());
        }
    }

    private void f(String str, Uri uri) {
        AboutApi aboutApi;
        if ("intPlan".equals(str)) {
            FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
            if (fitnessAdviceApi == null) {
                LogUtil.e("UIDV_DispatchSkipEventActivity", "fitnessAdviceApi is null.");
                return;
            } else {
                fitnessAdviceApi.launchPlanTab();
                return;
            }
        }
        if ("device_guide".equals(str)) {
            k(uri);
            return;
        }
        if (!"aw70_device_guide".equals(str) || (aboutApi = (AboutApi) Services.d("About", AboutApi.class)) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        String queryParameter = uri.getQueryParameter(MedalConstants.EVENT_KEY);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "handleDetailUri productType ", queryParameter);
        try {
            bundle.putString("url", aboutApi.getAw70HelpUrl(Integer.parseInt(queryParameter), this));
            bundle.putInt(Constants.JUMP_MODE_KEY, 0);
            AppRouter.c("/PluginOperation/WebViewActivity").d(bundle).b(this);
        } catch (NumberFormatException e2) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "handleDetailUri NumberFormatException ", e2.getMessage());
        }
    }

    private void c(String str, Uri uri) {
        if ("device_app_update_health".equals(str)) {
            if (AuthorizationUtils.c(this)) {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "start AppUpdateDialogActivity");
                ((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).showNewVersionDialog(this, new Intent());
                return;
            } else {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268468224);
                    startActivity(launchIntentForPackage);
                    LogUtil.a("UIDV_DispatchSkipEventActivity", "jump to main activity!");
                    return;
                }
                return;
            }
        }
        if ("device_ota".equals(str)) {
            Intent intent = new Intent();
            intent.putExtra("device_id", uri.getQueryParameter(MedalConstants.EVENT_KEY));
            intent.setClassName(this, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
            startActivity(intent);
            return;
        }
        if ("device_ota1".equals(str)) {
            Intent intent2 = new Intent();
            intent2.putExtra("device_id", uri.getQueryParameter(MedalConstants.EVENT_KEY));
            intent2.setClassName(this, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
            startActivity(intent2);
            return;
        }
        if ("download_plugin".equals(str)) {
            i();
        }
    }

    private void i() {
        String stringExtra = getIntent().getStringExtra("moduleName");
        LogUtil.a("UIDV_DispatchSkipEventActivity", "moduleName:", stringExtra);
        if (health.compact.a.CommonUtil.ae(this)) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("moduleName", stringExtra);
                launchIntentForPackage.addFlags(268468224);
                startActivity(launchIntentForPackage);
            }
            finish();
            return;
        }
        ohf.e().c(this, stringExtra);
    }

    private void a(String str, Uri uri) {
        if ("device_scale_ota".equals(str)) {
            dmg.a().scaleUpdateJump(this, uri);
        }
        if ("special_person_setting".equals(str)) {
            AppRouter.c("/Main/PrivacyCenterActivity").b(this);
            return;
        }
        if ("userinfo_weight".equals(str)) {
            Intent intent = new Intent();
            intent.putExtra("base_health_data_type_key", 1);
            intent.putExtra("weight_user_id", uri.getQueryParameter(MedalConstants.EVENT_KEY));
            intent.putExtra(ParamConstants.Param.FLAGS, 67108864);
            iun.d(String.valueOf(10), intent);
            return;
        }
        if ("claim_weight".equals(str)) {
            AppRouter.c("/Main/ClaimMeasureDataActivity").b(this);
            return;
        }
        if ("wifi_device".equals(str)) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "showAuthNotify productId ", uri.getQueryParameter("productId"));
            Intent intent2 = new Intent();
            intent2.putExtra(ArkUIXConstants.FROM_TYPE, "push");
            intent2.putExtra("deviceId", uri.getQueryParameter("deviceId"));
            String str2 = f22375b;
            intent2.setPackage(str2);
            intent2.setFlags(67108864);
            intent2.addFlags(536870912);
            intent2.setClassName(str2, "com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity");
            startActivity(intent2);
            return;
        }
        if ("choose_device".equals(str)) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "showAuthNotify kind ", uri.getQueryParameter("kind"));
            Intent intent3 = new Intent();
            String str3 = f22375b;
            intent3.setPackage(str3);
            intent3.setClassName(str3, "com.huawei.health.device.ui.DeviceMainActivity");
            intent3.putExtra("view", "ListDevice");
            intent3.putExtra("root_in_me", "me");
            intent3.putExtra("kind", "HDK_UNKNOWN");
            startActivity(intent3);
        }
    }

    private void b(String str, Uri uri) {
        if ("wifi_device_auth_release".equals(str)) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "otherJump() wifi device auth release");
            Intent intent = new Intent();
            String str2 = f22375b;
            intent.setPackage(str2);
            intent.setClassName(str2, "com.huawei.health.MainActivity");
            intent.setFlags(67108864);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
            startActivity(intent);
            return;
        }
        if ("wifi_device_auth_list".equals(str)) {
            d(uri);
            return;
        }
        if ("device_management_page".equals(str)) {
            e(uri);
            return;
        }
        if (MessageConstant.GROUP_MEDAL_TYPE.equals(str)) {
            g(uri);
            return;
        }
        if (MessageConstant.MEMBER_TYPE.equals(str)) {
            j(uri);
            return;
        }
        if ("trade".equals(str)) {
            i(uri.getQueryParameter("orderCode"));
            return;
        }
        if (MessageConstant.BENEFIT_TYPE.equals(str)) {
            c(uri);
        } else if ("asset".equals(str)) {
            try {
                qhu.e(Integer.parseInt(uri.getQueryParameter("type")), 1);
            } catch (NumberFormatException unused) {
                LogUtil.e("UIDV_DispatchSkipEventActivity", "jump asset NumberFormatException");
            }
        }
    }

    private void c(Uri uri) {
        String strNewPathConcat;
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpBenefit");
        String queryParameter = uri.getQueryParameter("type");
        String queryParameter2 = uri.getQueryParameter(MedalConstants.EVENT_KEY);
        LogUtil.a("UIDV_DispatchSkipEventActivity", queryParameter, com.huawei.openalliance.ad.constant.Constants.LINK, queryParameter2);
        if (TextUtils.isEmpty(queryParameter2) && Constants.NULL.equals(queryParameter2)) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "linkUrl is empty");
            return;
        }
        String strE = ifp.e(queryParameter2);
        if (TextUtils.isEmpty(this.o)) {
            strNewPathConcat = CommonUtil.newPathConcat(strE, "from", String.valueOf(4));
        } else {
            strNewPathConcat = CommonUtil.newPathConcat(strE, "from", String.valueOf(12));
        }
        Context context = BaseApplication.getContext();
        if ("1".equals(queryParameter)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", strNewPathConcat);
            Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(context, bundle, 268435456);
            if (intentCreateWebViewIntent != null) {
                context.startActivity(intentCreateWebViewIntent);
                LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpBenefit jump to webviewActivity");
                return;
            } else {
                LogUtil.j("UIDV_DispatchSkipEventActivity", "jumpBenefit h5 intent is null");
                return;
            }
        }
        if ("2".equals(queryParameter)) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(strNewPathConcat));
            intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            lsx.c(intent, context);
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpBenefitt jump to scheme page");
            return;
        }
        LogUtil.j("UIDV_DispatchSkipEventActivity", "jumpBenefit error linkType");
    }

    private void i(String str) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpOrder");
        LoginInit loginInit = LoginInit.getInstance(this);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "LoginInit status", Boolean.valueOf(loginInit.getIsLogined()));
        if (!loginInit.getIsLogined() || !AuthorizationUtils.c(this)) {
            b("orderCode", str);
        } else {
            l(str);
        }
        f();
    }

    private void f() {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, 2);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.TRADE_REFUND_MESSAGE.value(), map, 0);
    }

    /* JADX INFO: loaded from: classes14.dex */
    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22385c;
        private WeakReference<DispatchSkipEventActivity> d;
        private String e;

        d(DispatchSkipEventActivity dispatchSkipEventActivity, String str, String str2) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "LoginedCallback type:", str2);
            this.d = new WeakReference<>(dispatchSkipEventActivity);
            this.f22385c = str2;
            this.e = str;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DispatchSkipEventActivity dispatchSkipEventActivity = this.d.get();
            if (dispatchSkipEventActivity != null) {
                if (i != 0) {
                    LogUtil.j("UIDV_DispatchSkipEventActivity", "login fail");
                } else {
                    String str = this.f22385c;
                    str.hashCode();
                    if (str.equals(ProxyConfig.MATCH_HTTPS)) {
                        dispatchSkipEventActivity.o(this.e);
                    } else if (str.equals("trade")) {
                        dispatchSkipEventActivity.l(this.e);
                    } else {
                        LogUtil.j("UIDV_DispatchSkipEventActivity", "mType not match");
                    }
                }
                dispatchSkipEventActivity.j = false;
                dispatchSkipEventActivity.finish();
                return;
            }
            LogUtil.j("UIDV_DispatchSkipEventActivity", "LoginedCallback activity is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("orderCode", str);
        if (!Utils.o() && fua.n()) {
            iov.b(BaseApplication.getContext(), ArkUIXConstants.ORDER_DETAIL, "23", str);
        } else {
            AppRouter.c("/TradeService/TradeOrderDetailActivity").d(bundle).b(BaseApplication.getContext());
        }
        LogUtil.a("UIDV_DispatchSkipEventActivity", "UIDV_DispatchSkipEventActivity jump to orderDetail");
    }

    private void j(Uri uri) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpMember");
        String queryParameter = uri.getQueryParameter("type");
        String queryParameter2 = uri.getQueryParameter(MessageConstant.MESSAGE_TITLE);
        String queryParameter3 = uri.getQueryParameter("activityId");
        String queryParameter4 = uri.getQueryParameter("orderCode");
        m(queryParameter3);
        d(queryParameter2, queryParameter);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "orderCode:", queryParameter4);
        if (!TextUtils.isEmpty(queryParameter4) && !Constants.NULL.equals(queryParameter4) && b(queryParameter)) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "ordercode is not empty");
            i(queryParameter4);
        } else {
            d(TextUtils.isEmpty(this.o) ? 3 : 4);
        }
    }

    private boolean b(String str) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "type:", str);
        try {
            return f22376c.contains(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            LogUtil.e("UIDV_DispatchSkipEventActivity", "isNeedSkipOrder NumberFormatException");
            return false;
        }
    }

    private void d(int i) {
        LoginInit loginInit = LoginInit.getInstance(this);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "LoginInit status", Boolean.valueOf(loginInit.getIsLogined()));
        String str = "from=" + i;
        if (!loginInit.getIsLogined() || !AuthorizationUtils.c(this)) {
            b("memberUri", irz.e(str));
        } else {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jump to loading data activity");
            irz.d(this, str);
        }
    }

    private void m(String str) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "setMemberMessageRead");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "messageId is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "getVipMessages VipApi is null");
        } else {
            vipApi.setVipMessageRead(arrayList);
        }
    }

    private void d(String str, String str2) {
        String strValue;
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("title", str);
        map.put("type", str2);
        if (TextUtils.isEmpty(this.o)) {
            strValue = AnalyticsValue.VIP_MESSAGE_CLICK.value();
            fcn.a(3);
        } else {
            strValue = AnalyticsValue.VIP_NOTIFICATION_CLICK.value();
            fcn.a(4);
        }
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), strValue, map, 0);
    }

    private void g(Uri uri) {
        String queryParameter = uri.getQueryParameter("type");
        String queryParameter2 = uri.getQueryParameter("groupId");
        String queryParameter3 = uri.getQueryParameter("activityId");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        if (TextUtils.isEmpty(queryParameter3)) {
            builder.addPath("#/?messageType=" + queryParameter + "&groupId=" + queryParameter2);
        } else {
            builder.addPath("#/?messageType=" + queryParameter + "&groupId=" + queryParameter2 + "&activityId=" + queryParameter3);
        }
        ddv.b().loadH5ProApp(this, "com.huawei.health.h5.groups", builder);
    }

    private void a(String str, String str2) {
        if (k()) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "PluginAchieveAdapter == null || PluginOperationAdapter == null!");
            g();
            b(str, str);
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(this);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "LoginInit ", Boolean.valueOf(loginInit.getIsLogined()));
        if (!loginInit.getIsLogined() || !AuthorizationUtils.c(this)) {
            b(str, str);
            return;
        }
        AchieveNavigationApi achieveNavigationApi = (AchieveNavigationApi) Services.d("PluginAchievement", AchieveNavigationApi.class);
        if (achieveNavigationApi != null) {
            achieveNavigationApi.showAchieveMedalById(this, str2, "2");
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jump to loading data activity");
        } else {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "achieveNavigationApi is null");
        }
    }

    private boolean k() {
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        return (achieveDataApi != null ? achieveDataApi.getAdapter(this) : null) == null || ddv.b().getAdapter(this) == null;
    }

    private void b(String str, String str2) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            launchIntentForPackage.putExtra(str, str2);
            launchIntentForPackage.putExtra("needLogin", true);
            startActivity(launchIntentForPackage);
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jump to main activity");
        }
    }

    private boolean j() {
        return (LoginInit.getInstance(this).getIsLogined() && AuthorizationUtils.c(this)) ? false : true;
    }

    private void g(String str) {
        Intent intent = getIntent();
        if (!"sportHistory".equals(str) || intent == null) {
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(this);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "LoginInit ", Boolean.valueOf(loginInit.getIsLogined()));
        String stringExtra = intent.getStringExtra("jumpFromFileSyncNotify");
        LogUtil.a("UIDV_DispatchSkipEventActivity", str, stringExtra);
        if (!AuthorizationUtils.c(this) || (Utils.h() && !loginInit.getIsLogined())) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("entrance", stringExtra);
                launchIntentForPackage.addFlags(268468224);
                launchIntentForPackage.putExtra(str, str);
                startActivity(launchIntentForPackage);
                LogUtil.a("UIDV_DispatchSkipEventActivity", "jump to main activity");
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("entrance", stringExtra);
        Guidepost guidepostC = AppRouter.c("/Main/SportHistoryActivity");
        int iD = hcb.a().d();
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromFileSyncNotify fitState = ", Integer.valueOf(iD));
        boolean z = iD == 2 || iD == 5;
        if (!gcn.c().isSportingStatus() && !z) {
            guidepostC.d(67108864);
        }
        guidepostC.d(bundle).b(this);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jump to history activity");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[Catch: NumberFormatException -> 0x0038, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0038, blocks: (B:7:0x002f, B:12:0x003e), top: B:24:0x002f }] */
    private void f(Uri uri) {
        String host = uri.getHost();
        Intent intent = getIntent();
        if (!"sleepDetail".equals(host) || intent == null) {
            return;
        }
        h();
        long longExtra = intent.getLongExtra("startTime", 0L);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        if (longExtra == 0) {
            try {
                longExtra = Long.parseLong(uri.getQueryParameter("startTime"));
                if (longExtra2 == 0) {
                    longExtra2 = Long.parseLong(uri.getQueryParameter("endTime"));
                }
            } catch (NumberFormatException e2) {
                LogUtil.e("UIDV_DispatchSkipEventActivity", e2);
            }
        } else if (longExtra2 == 0) {
            longExtra2 = Long.parseLong(uri.getQueryParameter("endTime"));
        }
        String stringExtra = intent.getStringExtra("jumpFromFileSyncNotify");
        LogUtil.a("UIDV_DispatchSkipEventActivity", "startTime ", Long.valueOf(longExtra), " endTime ", Long.valueOf(longExtra2), " jumpFromTag ", stringExtra);
        LoginInit loginInit = LoginInit.getInstance(this);
        if (!AuthorizationUtils.c(this) || !loginInit.getIsLogined()) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "without login, jump to main activity");
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("startTime", longExtra);
                launchIntentForPackage.putExtra("endTime", longExtra2);
                launchIntentForPackage.putExtra("jumpFromFileSyncNotify", stringExtra);
                launchIntentForPackage.addFlags(268468224);
                launchIntentForPackage.putExtra("sleepDetail", host);
                startActivity(launchIntentForPackage);
                finish();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("endTime", longExtra2);
        bundle.putString("jumpFromFileSyncNotify", stringExtra);
        AppRouter.c("/Main/KnitSleepDetailActivity").d(bundle).b(this);
    }

    private void h(Uri uri) {
        String host = uri.getHost();
        String queryParameter = uri.getQueryParameter("ecgPageType");
        if ("ecgDetail".equals(host)) {
            c(this.m);
            LoginInit loginInit = LoginInit.getInstance(this);
            if (!AuthorizationUtils.c(this) || ((Utils.h() && !loginInit.getIsLogined()) || health.compact.a.CommonUtil.ae(this))) {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromEcgSyncNotify,jump to MainActivity");
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage == null) {
                    LogUtil.j("UIDV_DispatchSkipEventActivity", "jumpFromEcgSyncNotify,launchIntentForPackage is null");
                    finish();
                    return;
                }
                launchIntentForPackage.putExtra("pullEcgQuick", 1);
                launchIntentForPackage.putExtra("ecgPageType", queryParameter);
                if ("donate".equals(queryParameter)) {
                    launchIntentForPackage.putExtra("donateId", uri.getQueryParameter("donateId"));
                }
                launchIntentForPackage.putExtra("needLogin", !loginInit.getIsLogined());
                startActivity(launchIntentForPackage);
                finish();
                return;
            }
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromEcgSyncNotify, startEcgQuick");
            prf.c(this, uri.getQueryParameter("donateId"), queryParameter);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    private void j(String str) {
        byte b2;
        Intent intent = getIntent();
        if (intent == null || !"com.huawei.wallet".equals(str)) {
            return;
        }
        Uri uri = Uri.parse(intent.getStringExtra(CommonUtil.DETAIL_URI));
        PluginPay pluginPay = PluginPay.getInstance(com.huawei.haf.application.BaseApplication.b());
        AdapterWearMgrApi adapterWearMgrApi = (AdapterWearMgrApi) Services.d("HwAdapterWearMgr", AdapterWearMgrApi.class);
        if (adapterWearMgrApi == null) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "adapterWearMgrApi is null");
        } else {
            pluginPay.setAdapter(adapterWearMgrApi.getPayAdapterImpl(this));
        }
        LoginInit loginInit = LoginInit.getInstance(this);
        if (!AuthorizationUtils.c(this) || (Utils.h() && !loginInit.getIsLogined())) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromWalletNotify, jump to Device");
            e(this, PayPalRequest.LANDING_PAGE_TYPE_LOGIN);
            finish();
            return;
        }
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromWalletNotify, start wallet market activity.");
        String strB = b();
        strB.hashCode();
        int iHashCode = strB.hashCode();
        if (iHashCode != -2115809389) {
            if (iHashCode != -1708699727) {
                if (iHashCode == 1080704861 && strB.equals("oldDevice")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strB.equals("deviceDisconnected")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strB.equals("newDeviceConnected")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            d(this, uri);
            finish();
            return;
        }
        if (b2 == 1) {
            e(this, "device");
            e(this, uri, "checkDeviceToPlugin");
            finish();
        } else {
            if (b2 != 2) {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromWalletNotify, unknown device connection state.");
                return;
            }
            e(this, "oldDevice");
            e(this, uri, "checkDeviceToPlugin");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return ddy.e().isPluginAvaiable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, Uri uri) {
        if (a()) {
            a(context, uri);
        } else {
            e(context, "walletPlugin");
            e(context, uri, "checkPlugin");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public void b(Context context, Uri uri) {
        byte b2;
        String strB = b();
        strB.hashCode();
        int iHashCode = strB.hashCode();
        if (iHashCode != -2115809389) {
            if (iHashCode != -1708699727) {
                if (iHashCode == 1080704861 && strB.equals("oldDevice")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strB.equals("deviceDisconnected")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strB.equals("newDeviceConnected")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            a(context, uri);
            return;
        }
        if (b2 == 1) {
            e(context, "device");
            e(context, uri, "checkDevice");
        } else if (b2 != 2) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "detectDeviceToWallet, unknown device connection state.");
        } else {
            e(context, "oldDevice");
            e(context, uri, "checkDevice");
        }
    }

    private void e(final Context context, final Uri uri, final String str) {
        d();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = e;
        Runnable runnable = new Runnable() { // from class: com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity.5
            @Override // java.lang.Runnable
            public void run() {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                if (SystemClock.elapsedRealtime() - jElapsedRealtime >= 60000) {
                    DispatchSkipEventActivity.this.i.sendMessage(messageObtain);
                }
                if (str.equals("checkDevice") && DispatchSkipEventActivity.this.b().equals("newDeviceConnected")) {
                    DispatchSkipEventActivity.this.i.sendMessage(messageObtain);
                    DispatchSkipEventActivity.this.a(context, uri);
                    return;
                }
                if (str.equals("checkDeviceToPlugin") && DispatchSkipEventActivity.this.b().equals("newDeviceConnected")) {
                    DispatchSkipEventActivity.this.i.sendMessage(messageObtain);
                    DispatchSkipEventActivity.this.d(context, uri);
                } else if (!str.equals("checkPlugin") || !DispatchSkipEventActivity.this.a()) {
                    DispatchSkipEventActivity.e.postDelayed(this, 1000L);
                } else {
                    DispatchSkipEventActivity.this.i.sendMessage(messageObtain);
                    DispatchSkipEventActivity.this.b(context, uri);
                }
            }
        };
        d = runnable;
        handler.postDelayed(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        PluginBaseAdapter adapter = PluginPay.getInstance(this).getAdapter();
        DeviceInfo deviceInfo = null;
        PluginPayAdapter pluginPayAdapter = adapter instanceof PluginPayAdapter ? (PluginPayAdapter) adapter : null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "UIDV_DispatchSkipEventActivity");
        if (deviceList == null) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "getActiveDeviceInfo() deviceInfoList is null.", "UIDV_DispatchSkipEventActivity");
        } else {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
            LogUtil.a("UIDV_DispatchSkipEventActivity", "getActiveDeviceInfo deviceInfo ", deviceInfo, " , tag is ", "UIDV_DispatchSkipEventActivity");
        }
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() == 3) {
            return "deviceDisconnected";
        }
        if (deviceInfo.getDeviceConnectState() == 2 && pluginPayAdapter != null && pluginPayAdapter.isWalletOpenCard()) {
            return "newDeviceConnected";
        }
        return "oldDevice";
    }

    private void d() {
        if (d != null) {
            synchronized (f22374a) {
                if (d != null) {
                    e.removeCallbacks(d);
                    d = null;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    private void e(Context context, String str) {
        byte b2;
        Intent intent = new Intent();
        String str2 = f22375b;
        intent.setPackage(str2);
        intent.setClassName(str2, "com.huawei.health.MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        str.hashCode();
        switch (str) {
            case "device":
                b2 = 0;
                break;
            case "login":
                b2 = 1;
                break;
            case "walletPlugin":
                b2 = 2;
                break;
            case "oldDevice":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_pair_connect_detail, 1).show();
        } else if (b2 == 1) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_login_to_connect, 1).show();
        } else if (b2 == 2) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_download_bundle, 1).show();
        } else if (b2 == 3) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_old_wearable, 1).show();
        } else {
            throw new IllegalStateException("Unexpected value: " + str);
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Uri uri) {
        ddy.e().initHealthPayAdapter(context);
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), ComponentInfo.PluginPay_A_47);
        String queryParameter = uri.getQueryParameter("needConnect");
        intent.putExtra("fromPush", "true");
        intent.putExtra("issuerId", uri.getQueryParameter("issuerId"));
        intent.putExtra("aarVersion", uri.getQueryParameter("aarVersion"));
        intent.putExtra("activityCode", uri.getQueryParameter("activityCode"));
        intent.putExtra("classPath", uri.getQueryParameter("classPath"));
        if (queryParameter == null || queryParameter.isEmpty()) {
            queryParameter = "true";
        }
        intent.putExtra("needConnect", queryParameter);
        LogUtil.a("UIDV_DispatchSkipEventActivity", "go to ", ComponentInfo.PluginPay_A_47);
        ddy.e().launchActivity(context, intent);
    }

    private void i(Uri uri) {
        if (!"healthDetail".equals(uri.getHost()) || getIntent() == null) {
            return;
        }
        try {
            String queryParameter = uri.getQueryParameter("extra_service_id");
            int i = Integer.parseInt(uri.getQueryParameter("extra_page_type"));
            long j = Long.parseLong(uri.getQueryParameter("extra_time_stamp"));
            Bundle bundle = new Bundle();
            LoginInit loginInit = LoginInit.getInstance(this);
            if (AuthorizationUtils.c(this) && loginInit.getIsLogined()) {
                LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromHealthSyncNotify, startDetail=", queryParameter, ", ", Integer.valueOf(i), ", ", Long.valueOf(j));
                if ("BloodSugarCardConstructor".equals(queryParameter)) {
                    a(uri);
                }
                d(queryParameter, i, j, bundle);
                AppRouter.c("/Main/HealthDataDetailActivity").d(bundle).b(this);
                finish();
                return;
            }
            c(queryParameter, i, j, bundle);
            finish();
        } catch (NumberFormatException e2) {
            LogUtil.e("UIDV_DispatchSkipEventActivity", e2);
        }
    }

    private void d(String str, int i, long j, Bundle bundle) {
        bundle.putString("extra_service_id", str);
        bundle.putLong("extra_time_stamp", j);
        bundle.putInt("extra_page_type", i);
        Bundle bundle2 = new Bundle();
        bundle2.putString("jump_from_tag", "jump_from_notify");
        bundle.putBundle("extra_bundle", bundle2);
    }

    private void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("notification_type");
        HashMap map = new HashMap(16);
        if ("sport_notification".equals(queryParameter)) {
            map.put("type", 1);
        }
        if (queryParameter != null && queryParameter.equals("sleep_notification")) {
            map.put("type", 2);
        }
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_JUMP_DETAIL_2040132.value();
        map.put("click", "1");
        idy.b(strValue, map);
    }

    private void c(String str, int i, long j, Bundle bundle) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpFromHealthSyncNotify, jump to MainActivity");
            bundle.putString("jump_from_tag", "jump_from_notify");
            launchIntentForPackage.addFlags(268468224);
            launchIntentForPackage.putExtra("extra_service_id", str);
            launchIntentForPackage.putExtra("extra_page_type", i);
            launchIntentForPackage.putExtra("extra_time_stamp", j);
            launchIntentForPackage.putExtra("extra_bundle", bundle);
            startActivity(launchIntentForPackage);
        }
    }

    private void g() {
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        AdapterHealthMgrApi adapterHealthMgrApi = (AdapterHealthMgrApi) Services.d("HwAdpaterHealthMgr", AdapterHealthMgrApi.class);
        if (achieveDataApi == null) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "achieveDataApi = null");
            return;
        }
        if (achieveDataApi.getAdapter(this) == null) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "pluginAchieveAdapter = null");
            if (adapterHealthMgrApi == null) {
                LogUtil.j("UIDV_DispatchSkipEventActivity", "adapterHealth is null");
            } else {
                achieveDataApi.initAdapter(this, adapterHealthMgrApi.getAchieveAdapterImpl());
            }
        }
        h();
    }

    private void h() {
        AdapterHealthMgrApi adapterHealthMgrApi = (AdapterHealthMgrApi) Services.d("HwAdpaterHealthMgr", AdapterHealthMgrApi.class);
        if (adapterHealthMgrApi == null) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "initPluginOperation adapterHealth is null");
        } else {
            ddv.b().initAdapter(this, adapterHealthMgrApi.getOperationAdapterImpl(this));
        }
    }

    private void k(final Uri uri) {
        this.g.execute(new Runnable() { // from class: com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity.1
            @Override // java.lang.Runnable
            public void run() {
                AboutApi aboutApi = (AboutApi) Services.d("About", AboutApi.class);
                if (aboutApi != null) {
                    String queryParameter = uri.getQueryParameter(MedalConstants.EVENT_KEY);
                    String queryParameter2 = uri.getQueryParameter(BleConstants.BLE_HI_LINK);
                    if (queryParameter == null || "".equals(queryParameter)) {
                        LogUtil.j("UIDV_DispatchSkipEventActivity", "productType is null");
                        return;
                    }
                    LogUtil.a("UIDV_DispatchSkipEventActivity", "handleDetailUri productType ", queryParameter);
                    final String strAdaptUrlInMessageCenter = aboutApi.adaptUrlInMessageCenter(DispatchSkipEventActivity.this, health.compact.a.CommonUtil.j(queryParameter), queryParameter2);
                    DispatchSkipEventActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Bundle bundle = new Bundle();
                            bundle.putString("url", strAdaptUrlInMessageCenter);
                            bundle.putInt(Constants.JUMP_MODE_KEY, 0);
                            AppRouter.c("/PluginOperation/WebViewActivity").d(bundle).b(DispatchSkipEventActivity.this);
                        }
                    });
                }
            }
        });
    }

    private void d(Uri uri) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jump device share auth list activity");
        String queryParameter = uri.getQueryParameter("devId");
        if (TextUtils.isEmpty(queryParameter)) {
            LogUtil.e("UIDV_DispatchSkipEventActivity", "jumpAuthList fail: devId is empty");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("dev_id", queryParameter);
        AppRouter.c("/PluginDevice/WifiDeviceAuthRequestListActivity").d(536870912).d(bundle).b(this);
    }

    private void e(Uri uri) {
        LogUtil.a("UIDV_DispatchSkipEventActivity", "jumpDeviceManagementPage:jump device management page");
        String queryParameter = uri.getQueryParameter("proId");
        if (TextUtils.isEmpty(queryParameter)) {
            LogUtil.e("UIDV_DispatchSkipEventActivity", "jumpDeviceManagementPage fail: proId is empty");
            return;
        }
        Intent intent = new Intent();
        String str = f22375b;
        intent.setPackage(str);
        intent.setClassName(str, "com.huawei.health.device.ui.DeviceMainActivity");
        intent.addFlags(536870912);
        intent.putExtra("view", "deviceManage");
        intent.putExtra("productId", queryParameter);
        intent.putExtra("goto", "devicebind");
        startActivity(intent);
    }

    private void e(String str, String str2) {
        lmf.d().d(new lmm.e().c(1).b(this.r).a(this.o).d(this.s).e(this.q).c(this.n).e());
        HashMap map = new HashMap();
        map.put("click", 1);
        Uri uri = Uri.parse(this.o);
        if (str.equals("http") || str.equals(ProxyConfig.MATCH_HTTPS)) {
            if (uri == null) {
                return;
            }
            String queryParameter = uri.getQueryParameter("activityId");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "noActivity";
            }
            map.put("type", queryParameter);
        } else if ("messagecenter".equals(str)) {
            if ("sportReport".equals(str2)) {
                String queryParameter2 = uri.getQueryParameter("report_stype");
                a(queryParameter2);
                if (queryParameter2 != null && "1".equals(queryParameter2)) {
                    map.put("type", "1");
                } else if (queryParameter2 != null && "0".equals(queryParameter2)) {
                    map.put("type", "2");
                } else {
                    map.put("type", "WEEK_MONTH_REPORT");
                }
            }
            if ("kakaMessage".equals(str2)) {
                map.put("type", "3");
            }
            if (NotificationMsgContent.MSG_TYPE_HISTORY_BEST_MSG.equals(str2)) {
                map.put("type", "4");
            }
        } else {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "setNotifyBiAnalyticsEvent is other scheme");
        }
        LogUtil.a("UIDV_DispatchSkipEventActivity", "setNotifyBiAnalyticsEvent type = ", map.get("type"));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_NOTIFICATION_MESSAGE_CENTER_2110001.value(), map, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    private void c(String str) {
        byte b2;
        String str2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "type is empty");
            return;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case 1785:
                if (!str.equals("81")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1786:
                if (!str.equals("82")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1787:
                if (!str.equals("83")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1788:
            default:
                b2 = -1;
                break;
            case 1789:
                if (!str.equals("85")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1790:
                if (!str.equals("86")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            str2 = "ECGacquisition";
        } else if (b2 == 3 || b2 == 4) {
            str2 = "electrocardiogram";
        } else {
            LogUtil.j("UIDV_DispatchSkipEventActivity", "doEcgBiEvent is not support, type = ", str);
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", str);
        map.put("serviceType", str2);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.ECG_MESSAGE_CLICK_11000317.value(), map, 0);
    }

    private void a(String str) {
        HashMap map = new HashMap();
        if (str != null && "1".equals(str)) {
            map.put("report", "1");
        } else if (str != null && "0".equals(str)) {
            map.put("report", "2");
        }
        map.put("from", 3);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100009.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
