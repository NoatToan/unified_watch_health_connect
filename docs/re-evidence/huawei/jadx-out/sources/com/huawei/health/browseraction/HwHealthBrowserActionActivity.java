package com.huawei.health.browseraction;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.MainActivity;
import com.huawei.health.R;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.marketing.datatype.VipPageSourceArea;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5DeepLinkUsePermissionsHelper;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.btw;
import defpackage.ddv;
import defpackage.dmp;
import defpackage.fcn;
import defpackage.glw;
import defpackage.gvd;
import defpackage.iov;
import defpackage.iqq;
import defpackage.iqy;
import defpackage.irz;
import defpackage.isa;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.pfi;
import defpackage.qey;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qsr;
import defpackage.tqp;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class HwHealthBrowserActionActivity extends BaseActivity {
    private boolean e;
    private String h;
    private Uri o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f6224c = this;
    private String g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6223b = null;
    private String k = null;
    private Observer i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6222a = false;
    private String j = null;
    private String l = null;
    private String f = null;
    private String d = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri uriB = AppRouterUtils.b(getIntent());
        this.o = uriB;
        if (uriB == null) {
            ReleaseLogUtil.d("R_HwHealthBrowserActionActivity", "onCreate mSchemeData is null");
            finish();
            return;
        }
        try {
            d();
            a(getIntent());
            String string = this.o.toString();
            String strSubstring = string.substring(string.indexOf("address") + 8);
            this.g = strSubstring;
            String strTrim = TextUtils.isEmpty(strSubstring) ? "" : Uri.decode(this.g).trim();
            if (strTrim.startsWith("http://")) {
                if (!CommonUtil.bu() && !CommonUtil.ap()) {
                    this.g = strTrim;
                }
                LogUtil.j("HwHealthBrowserActionActivity", "onCreate: disableHttpLoad -> " + this.g);
                finish();
                return;
            }
            this.k = this.o.getQueryParameter("type");
            this.f6223b = this.o.getQueryParameter("from");
            this.h = this.o.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
            this.f6222a = this.o.getBooleanQueryParameter("scrollDown", false);
            this.e = this.o.getBooleanQueryParameter("isNeedLogin", false);
            v();
            LogUtil.a("HwHealthBrowserActionActivity", "onCreate mQueryParameter ", this.g, " mTypeParameter ", this.k, " mFromWhere ", this.f6223b, " mPullFrom ", this.h, " mIsScrollDown ", Boolean.valueOf(this.f6222a));
            if (TextUtils.isEmpty(this.g)) {
                ReleaseLogUtil.d("R_HwHealthBrowserActionActivity", "onCreate mQueryParameter ", this.g);
                finish();
            } else {
                g();
                finish();
            }
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.b("R_HwHealthBrowserActionActivity", "onCreate IllegalArgumentException ", ExceptionUtils.c(e));
            finish();
        } catch (Exception e2) {
            ReleaseLogUtil.b("R_HwHealthBrowserActionActivity", "onCreate exception ", ExceptionUtils.c(e2));
            finish();
        }
    }

    private void d() {
        Uri uri = this.o;
        if (uri == null) {
            ReleaseLogUtil.d("R_HwHealthBrowserActionActivity", "initCustomRecipe mSchemeData is null");
            return;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            ReleaseLogUtil.d("R_HwHealthBrowserActionActivity", "initCustomRecipe uriString ", string);
            return;
        }
        if (string.contains("com.huawei.health.h5.custom-recipe")) {
            if (!qsr.c().i()) {
                ReleaseLogUtil.c("R_HwHealthBrowserActionActivity", "initCustomRecipe switch old recipe");
            } else {
                LogUtil.a("HwHealthBrowserActionActivity", "initCustomRecipe uriString ", string);
                this.o = Uri.parse(string.replace("com.huawei.health.h5.custom-recipe", "com.huawei.health.h5.intelligent-recipe-customization"));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
    }

    private void a(Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.d("R_HwHealthBrowserActionActivity", "getExtrasData intent is null");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.j = extras.getString("pushId");
            this.l = extras.getString("serviceId");
            this.f = extras.getString("notifiUri");
            this.d = extras.getString("messageContent");
            LogUtil.a("HwHealthBrowserActionActivity", "mPushId = ", this.j, "mServiceId =", this.l);
        }
    }

    private void g() {
        if (Utils.o() && H5DeepLinkUsePermissionsHelper.isOnlySupportedInChina(this.g)) {
            LogUtil.a("HwHealthBrowserActionActivity", "deepLink: not supported oversea");
            gvd.a(this);
            return;
        }
        PluginOperation pluginOperation = PluginOperation.getInstance(this.f6224c);
        PluginBaseAdapter adapter = pluginOperation.getAdapter();
        PluginOperationAdapter pluginOperationAdapter = adapter instanceof PluginOperationAdapter ? (PluginOperationAdapter) adapter : null;
        LogUtil.a("HwHealthBrowserActionActivity", "adapter=", pluginOperationAdapter);
        if (pluginOperationAdapter == null) {
            i();
        }
        b(pluginOperation);
    }

    private void b(PluginOperation pluginOperation) {
        LoginInit loginInit = LoginInit.getInstance(this.f6224c);
        boolean z = (!Utils.o() || OperationUtils.isOperation(loginInit.getAccountInfo(1010)) || m() || n() || h()) ? false : true;
        boolean z2 = (!loginInit.isKidAccount() || H5DeepLinkUsePermissionsHelper.isSupportKid(this.g) || h()) ? false : true;
        boolean isLogined = loginInit.getIsLogined();
        boolean zC = AuthorizationUtils.c(this.f6224c);
        boolean z3 = (zC && isLogined) ? false : true;
        if (e(this.f6223b)) {
            c(z3, z, loginInit, pluginOperation);
            return;
        }
        if (c(Boolean.valueOf(z), Boolean.valueOf((Utils.h() && (j() || f())) || H5DeepLinkUsePermissionsHelper.isSupportNoCloud(this.g)), Boolean.valueOf(z2))) {
            return;
        }
        String str = this.g;
        if (str != null && str.contains("/hwtips/scene/deviceList")) {
            LogUtil.a("HwHealthBrowserActionActivity", "jump free", this.g);
        } else if (z3) {
            if (!isLogined && zC && isa.d() && y()) {
                return;
            }
            x();
            return;
        }
        a(pluginOperation);
    }

    private boolean h() {
        if (TextUtils.isEmpty(this.g)) {
            LogUtil.j("HwHealthBrowserActionActivity", "isArkuixSupportOperationDeeplink mQueryParameter is empty.");
            return false;
        }
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("HwHealthBrowserActionActivity", "isArkuixSupportOperationDeeplink mIntent is null.");
            return false;
        }
        int intExtra = intent.getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
        LogUtil.a("HwHealthBrowserActionActivity", "isArkuixSupportOperationDeeplink fromType=", Integer.valueOf(intExtra));
        if (intExtra == 1) {
            return this.g.contains("com.huawei.health.h5.setting") || this.g.contains("com.huawei.health.h5.health-data-subpage");
        }
        LogUtil.j("HwHealthBrowserActionActivity", "isArkuixSupportOperationDeeplink is not from arkuix.");
        return false;
    }

    private boolean f() {
        return this.g.contains("photo-dial-new");
    }

    private boolean j() {
        return !TextUtils.isEmpty(this.g) && this.g.contains("h5pro=true");
    }

    private boolean l() {
        return !TextUtils.isEmpty(this.g) && this.g.contains("com.huawei.health.h5.watchface");
    }

    private boolean o() {
        if (!this.g.contains("com.huawei.health.h5.sports-path")) {
            LogUtil.a("HwHealthBrowserActionActivity", "Deeplink is not jump to sports-path");
            return false;
        }
        String queryParameter = this.o.getQueryParameter(BleConstants.KEY_PATH);
        int i = this.o.getQueryParameter("pathClass") == null ? 0 : Integer.parseInt(this.o.getQueryParameter("pathClass"));
        if (!"route-detail".equals(queryParameter) || 1 != i) {
            return false;
        }
        String queryParameter2 = this.o.getQueryParameter("pathId");
        Intent intent = new Intent(this.f6224c, (Class<?>) ClockingRankActivity.class);
        intent.putExtra("PATH_ID", queryParameter2);
        intent.putExtra("pathClass", i);
        iov.d(this.f6224c, intent);
        return true;
    }

    private boolean k() {
        return TitleBean.RIGHT_BTN_TYPE_SHARE.equals(Uri.parse(this.g).getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM));
    }

    private void a(PluginOperation pluginOperation) {
        if ("aar".equals(this.k)) {
            LogUtil.a("HwHealthBrowserActionActivity", "jump to aar webviewactivity");
            tqp.c(this.f6224c, this.g);
            finish();
            return;
        }
        if (l()) {
            iqy.c(this.g);
            finish();
            return;
        }
        if (isa.d() && y()) {
            return;
        }
        if (o()) {
            LogUtil.a("HwHealthBrowserActionActivity", "Deeplink is JumpToDrawRoute");
            return;
        }
        if ("openDiscover".equals(this.f6223b)) {
            Intent intent = new Intent(this.f6224c, (Class<?>) MainActivity.class);
            intent.putExtra("openDiscover", true);
            intent.addFlags(67108864);
            intent.putExtra("scrollDown", this.f6222a);
            this.f6224c.startActivity(intent);
            return;
        }
        if ("walletBanner".equals(this.f6223b)) {
            r();
            return;
        }
        if ("thirdDevice".equals(this.f6223b)) {
            q();
            return;
        }
        if ("thirdDeviceToApp".equals(this.f6223b)) {
            p();
            return;
        }
        if (PayPalPaymentIntent.ORDER.equals(this.f6223b)) {
            t();
            return;
        }
        if ("healthRecord".equals(this.f6223b)) {
            s();
            return;
        }
        if ("7".equals(this.f6223b)) {
            c(pluginOperation);
            return;
        }
        if (!TextUtils.isEmpty(this.g) && this.g.contains("com.huawei.health.h5.intelligent-training-plan") && this.g.contains("train_plan_create_guide") && btw.i()) {
            e(pluginOperation);
        } else if (!TextUtils.isEmpty(this.g) && this.g.contains("com.huawei.health.h5.intelligent-recipe-customization")) {
            d(pluginOperation);
        } else {
            pluginOperation.startOperationWebPage(this.f6224c, this.g, this.f6223b);
        }
    }

    private void d(PluginOperation pluginOperation) {
        if (irz.i()) {
            pluginOperation.startOperationWebPage(this.f6224c, this.g, this.f6223b);
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/PrivilegeDetail?functionId=4&nextPage=huaweischeme://healthapp/router/openwith?address=" + this.g);
        ddv.b().loadH5ProApp(this.f6224c, "com.huawei.health.h5.vip", builder);
    }

    private void e(final PluginOperation pluginOperation) {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (Objects.equals(Integer.toString(4048), this.h)) {
            c(pluginOperation, (qey) null);
            return;
        }
        if (planApi == null || planApi.getCurrentIntPlan() != null) {
            c(pluginOperation, (qey) null);
        } else if (!glw.c().a()) {
            c(pluginOperation, planApi.getPlanDetail());
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dfs
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(planApi, pluginOperation);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.browseraction.HwHealthBrowserActionActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends UiCallback<qey> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PluginOperation f6225c;

        AnonymousClass2(PluginOperation pluginOperation) {
            this.f6225c = pluginOperation;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("HwHealthBrowserActionActivity", "getCurrentPlan errorCode:", Integer.valueOf(i), ",errorInfo:", str);
            final PluginOperation pluginOperation = this.f6225c;
            HandlerExecutor.b(new Runnable() { // from class: dfw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31762c.a(pluginOperation);
                }
            });
        }

        public /* synthetic */ void a(PluginOperation pluginOperation) {
            HwHealthBrowserActionActivity.this.c(pluginOperation, (qey) null);
        }

        public /* synthetic */ void e(PluginOperation pluginOperation, qey qeyVar) {
            HwHealthBrowserActionActivity.this.c(pluginOperation, qeyVar);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final qey qeyVar) {
            final PluginOperation pluginOperation = this.f6225c;
            HandlerExecutor.b(new Runnable() { // from class: dfu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31749a.e(pluginOperation, qeyVar);
                }
            });
        }
    }

    public /* synthetic */ void e(PlanApi planApi, PluginOperation pluginOperation) {
        planApi.getCurrentPlan(1, 0, false, new AnonymousClass2(pluginOperation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PluginOperation pluginOperation, qey qeyVar) {
        if (btw.d(qeyVar)) {
            JumpUtil.a(this.f6224c, String.format("#/train_plan_detail?planId=%s", qeyVar.h()), "plan_page", "com.huawei.health.h5.intelligent-training-plan");
        } else if (pluginOperation == null) {
            LogUtil.j("HwHealthBrowserActionActivity", "jumpToCreateSmartTrainPlan operation is null");
        } else {
            pluginOperation.startOperationWebPage(this.f6224c, this.g, this.f6223b);
        }
    }

    private boolean m() {
        if (TextUtils.isEmpty(this.g)) {
            return false;
        }
        return this.g.startsWith("com.huawei.health.h5.health-record") && "micro_report_detail".equals(Uri.parse(this.g).getQueryParameter(BleConstants.KEY_PATH));
    }

    private boolean n() {
        if (TextUtils.isEmpty(this.g)) {
            return false;
        }
        return this.g.startsWith("com.huawei.health.h5.weight");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (Uri.parse(this.g).isOpaque()) {
            return;
        }
        LogUtil.a("HwHealthBrowserActionActivity", "putBiEventFromDeeplink");
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        H5proUtil.putBiEventFromH5Deeplink(this.o.toString(), strA);
    }

    private String a() {
        if (this.g.startsWith("http://") || this.g.startsWith("https://") || this.g.startsWith(Constants.PREFIX_FILE)) {
            return this.g;
        }
        if (this.g.contains("h5pro=true")) {
            return H5proUtil.getPackageNameFromUrl(this.g);
        }
        return "";
    }

    private boolean y() {
        String queryParameter = this.o.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        String queryParameter2 = this.o.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        if (!TextUtils.isEmpty(this.g) && this.g.contains("vip")) {
            String queryParameter3 = this.o.getQueryParameter(BleConstants.KEY_PATH);
            LogUtil.a("HwHealthBrowserActionActivity", "jump to h5 vip page");
            if (TextUtils.equals("ExclusiveGuard", queryParameter3) || TextUtils.equals("VipActivate", queryParameter3) || TextUtils.equals("PrivilegeRedeem", queryParameter3)) {
                d(queryParameter3);
                return true;
            }
            if (!TextUtils.isEmpty(queryParameter3) && !queryParameter3.equals("VipSubscribe") && !queryParameter3.equals("MemberCenter")) {
                LogUtil.a("HwHealthBrowserActionActivity", "not jump to vip center page");
                return false;
            }
            if (!this.g.contains("customContent")) {
                return false;
            }
            String queryParameter4 = this.o.getQueryParameter("customContent");
            LogUtil.a("HwHealthBrowserActionActivity", "jump to h5 vip page with qrcode, customContent is", queryParameter4);
            VipPageSourceArea vipPageSourceArea = (VipPageSourceArea) qqt.e(queryParameter4, VipPageSourceArea.class);
            fcn.b(vipPageSourceArea.getProvince());
            fcn.e(vipPageSourceArea.getCity());
            fcn.i(queryParameter);
            fcn.d(queryParameter2);
            AppRouter.c("/home/main").e("openDiscover", true).e("jumpVipTabWithQrCode", true).b(this.f6224c);
            return true;
        }
        if (!"openDiscover".equals(this.f6223b)) {
            return false;
        }
        LogUtil.a("HwHealthBrowserActionActivity", "jump to from=openDiscover, redirect to relay vip page");
        irz.d(this.f6224c, "");
        return true;
    }

    private void d(String str) {
        LogUtil.a("HwHealthBrowserActionActivity", "HwHealthBrowserActionActivity jumpToBenefitHalfMode type is ", str);
        if (TextUtils.equals("ExclusiveGuard", str)) {
            irz.b(this.f6224c, 3, 2);
            return;
        }
        if (TextUtils.equals("VipActivate", str)) {
            irz.b(this.f6224c, 3, 1);
        } else if (TextUtils.equals("PrivilegeRedeem", str)) {
            irz.b(this.f6224c, 3, 3);
        } else {
            LogUtil.a("HwHealthBrowserActionActivity", "HwHealthBrowserActionActivity jumpToBenefitHalfMode type is error");
        }
    }

    private void x() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        if (l() && k()) {
            launchIntentForPackage.putExtra("start_my_watchface", true);
            launchIntentForPackage.setFlags(67108864);
        } else {
            launchIntentForPackage.putExtra("schemeUrl", this.g);
        }
        launchIntentForPackage.putExtra("type", this.k);
        launchIntentForPackage.putExtra("needLogin", this.e);
        launchIntentForPackage.putExtra("from", this.f6223b);
        startActivity(launchIntentForPackage);
    }

    private void c(final PluginOperation pluginOperation) {
        String queryParameter = this.o.getQueryParameter("address");
        if (!TextUtils.isEmpty(queryParameter)) {
            String str = queryParameter.split("\\?")[0];
            LogUtil.a("HwHealthBrowserActionActivity", "jumpToPpgResult split url=", str);
            if ("com.huawei.health.h5.ppg".equals(str)) {
                LogUtil.a("HwHealthBrowserActionActivity", "jumpToPpgResult jumping...");
                pfi.c().launchActivity(this.f6224c, new Intent(), new AppBundleLauncher.InstallCallback() { // from class: dft
                    @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                    public final boolean call(Context context, Intent intent) {
                        return this.f31748c.e(pluginOperation, context, intent);
                    }
                });
                return;
            } else {
                LogUtil.a("HwHealthBrowserActionActivity", "jumpToPpgResult failed, jumping by WebViewActivity...");
                pluginOperation.startOperationWebPage(this.f6224c, this.g, this.f6223b);
                return;
            }
        }
        LogUtil.e("HwHealthBrowserActionActivity", "jumpToPpgResult failed, address is empty!");
    }

    public /* synthetic */ boolean e(PluginOperation pluginOperation, Context context, Intent intent) {
        pluginOperation.startOperationWebPage(this.f6224c, this.g, this.f6223b);
        return false;
    }

    private void r() {
        StringBuilder sb = new StringBuilder("wallet://com.huawei.wallet/walletbus?action=com.huawei.wallet.transit.action.COMMON&classPath=com.huawei.nfc.carrera.ui.bus.opencard.BindBusCardAddActivity");
        Uri uri = Uri.parse(this.g);
        String queryParameter = uri.getQueryParameter("issuerId");
        String queryParameter2 = uri.getQueryParameter("aarVersion");
        String queryParameter3 = uri.getQueryParameter("activityCode");
        if (!TextUtils.isEmpty(queryParameter)) {
            sb.append("&issuerId=");
            sb.append(queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            sb.append("&aarVersion=");
            sb.append(queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            sb.append("&activityCode=");
            sb.append(queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("channel");
        if (!TextUtils.isEmpty(queryParameter4)) {
            sb.append("&channel=");
            sb.append(queryParameter4);
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.huawei.health.messagecenter.model.CommonUtil.DETAIL_URI, sb.toString());
        bundle.putString("msgId", "123456");
        AppRouter.c("/PluginMessageCenter/DispatchSkipEventActivity").d(bundle).b(this.f6224c);
    }

    private void c(boolean z, boolean z2, LoginInit loginInit, PluginOperation pluginOperation) {
        if (z2 || z || loginInit.isKidAccount()) {
            u();
            x();
        } else {
            Intent intent = new Intent();
            intent.setClass(this, MainActivity.class);
            startActivity(intent);
            pluginOperation.startOperationWebPage(this.g, this.f6223b);
        }
    }

    private boolean e(String str) {
        return !TextUtils.isEmpty(str) && "fa".equals(str);
    }

    private void u() {
        Observer observer = new Observer() { // from class: com.huawei.health.browseraction.HwHealthBrowserActionActivity.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                LogUtil.a("HwHealthBrowserActionActivity", "registerObservers, notify");
                HwHealthBrowserActionActivity.this.c();
                if (HwHealthBrowserActionActivity.this.i != null) {
                    ObserverManagerUtil.a(HwHealthBrowserActionActivity.this.i, "com.huawei.plugin.trigger.checklogin");
                }
                HwHealthBrowserActionActivity.this.i = null;
            }
        };
        this.i = observer;
        ObserverManagerUtil.d(observer, "com.huawei.plugin.trigger.checklogin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LoginInit.getInstance(this.f6224c).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.health.browseraction.HwHealthBrowserActionActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                SharedPreferenceManager.e(HwHealthBrowserActionActivity.this.f6224c, String.valueOf(20000), "needLogin", String.valueOf(false), null);
                LogUtil.j("HwHealthBrowserActionActivity", "onResponse errorCode = ", Integer.valueOf(i));
            }
        }, "");
    }

    private void q() {
        Uri uri = Uri.parse(this.g);
        String queryParameter = uri.getQueryParameter("productId");
        String queryParameter2 = uri.getQueryParameter("sn");
        if (!dmp.d().g(queryParameter2) || TextUtils.isEmpty(queryParameter)) {
            LogUtil.a("HwHealthBrowserActionActivity", "The device is not bound to jump to the home page.");
            AppRouter.c("/home/main").c(Constants.HOME_TAB_NAME, Constants.HOME).b(this);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", queryParameter);
        contentValues.put("uniqueId", queryParameter2);
        new BleJsInteractionCompact().startH5Pro(BaseApplication.getContext(), "com.huawei.health.device." + queryParameter, contentValues, "#/type=3");
    }

    private void p() {
        LogUtil.a("HwHealthBrowserActionActivity", "jumpToThirdGprsDeviceAppByPush mQueryParameter: ", this.g);
        Uri uri = Uri.parse(this.g);
        String queryParameter = uri.getQueryParameter("productId");
        String queryParameter2 = uri.getQueryParameter("sn");
        if (!dmp.d().g(queryParameter2) || TextUtils.isEmpty(queryParameter)) {
            LogUtil.a("HwHealthBrowserActionActivity", "The device is not bound to jump to the home page.");
            AppRouter.c("/home/main").c(Constants.HOME_TAB_NAME, Constants.HOME).b(this);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", queryParameter);
        contentValues.put("uniqueId", queryParameter2);
        Intent intent = new Intent();
        intent.putExtra("commonDeviceInfo", contentValues);
        intent.setPackage("com.huawei.health");
        intent.setClassName("com.huawei.health", "com.huawei.health.ecologydevice.ui.healthdata.activity.BloodSugarHistoryActivity");
        lsx.c(intent, this);
    }

    private void t() {
        AppRouter.c("/TradeService/TradeOrderListActivity").b(BaseApplication.getContext());
    }

    private void v() {
        if (AuthorizationUtils.c(this.f6224c)) {
            e();
            if (TextUtils.isEmpty(this.f6223b) && TextUtils.isEmpty(this.h)) {
                return;
            }
            Context context = BaseApplication.getContext();
            lmf.d().c(LoginInit.getInstance(context).getAccountInfo(1011));
            lmf.d().a(LoginInit.getInstance(context).getAccountInfo(1010));
            OpAnalyticsUtil.getInstance().init(context, new b(this));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<HwHealthBrowserActionActivity> f6227c;

        public b(HwHealthBrowserActionActivity hwHealthBrowserActionActivity) {
            this.f6227c = new WeakReference<>(hwHealthBrowserActionActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            HwHealthBrowserActionActivity hwHealthBrowserActionActivity = this.f6227c.get();
            if (hwHealthBrowserActionActivity == null || hwHealthBrowserActionActivity.isDestroyed() || hwHealthBrowserActionActivity.isFinishing()) {
                return;
            }
            hwHealthBrowserActionActivity.b(BaseApplication.getContext());
            hwHealthBrowserActionActivity.a(BaseApplication.getContext());
            hwHealthBrowserActionActivity.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (TextUtils.isEmpty(this.f6223b)) {
            return;
        }
        HashMap map = new HashMap(2);
        map.put("from", this.f6223b);
        map.put("url", this.g);
        lmf.d().c(context, AnalyticsValue.HEALTH_BROWSER_1100044.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (e(this.f6223b)) {
            HashMap map = new HashMap(2);
            map.put("click_enter_health_app", 1);
            map.put("card_id", this.o.getQueryParameter("cardId"));
            map.put("card_type", this.o.getQueryParameter("cardType"));
            lmf.d().c(context, AnalyticsValue.FA_ENTER_APP.value(), map, 0);
            b();
        }
    }

    private void b() {
        LogUtil.a("HwHealthBrowserActionActivity", "doBiFromFaStartApp");
        HashMap map = new HashMap(16);
        map.put("from", 1);
        map.put("click", 1);
        map.put("FAPackageName", this.o.getQueryParameter("FAPackageName"));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    private void e() {
        iqq.c(iqq.d(this.f6223b, this.j, this.l, this.d, this.o), this.f6223b, !TextUtils.isEmpty(this.f));
    }

    private void i() {
        PluginOperation pluginOperation = PluginOperation.getInstance(this.f6224c);
        pluginOperation.setAdapter(PluginOperationAdapterImpl.getInstance(this.f6224c));
        pluginOperation.init(this.f6224c);
    }

    private void s() {
        String queryParameter = Uri.parse(this.g).getQueryParameter("examinationId");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "1";
        }
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).gotoH5HealthRecord(this.f6224c, queryParameter, "-1");
    }

    private boolean c(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool.booleanValue() && !bool2.booleanValue()) {
            Intent intent = new Intent();
            intent.setFlags(67108864);
            intent.setPackage(getPackageName());
            intent.setClassName(this, "com.huawei.health.MainActivity");
            if (Utils.k() || !WatchFaceUtil.isSupportWatchFaceMarket()) {
                intent.putExtra("TOAST", qre.f(R.string.IDS_not_available_in_your_region));
            }
            startActivity(intent);
            return true;
        }
        if (!bool3.booleanValue()) {
            return false;
        }
        gvd.a(this);
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void finish() {
        setIntent(null);
        super.finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
