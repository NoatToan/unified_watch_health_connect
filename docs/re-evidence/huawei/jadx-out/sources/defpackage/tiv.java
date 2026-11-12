package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitOptions;
import com.huawei.maps.offlinedata.health.init.OnCreateResultListener;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.device.activity.alarm.AlarmActivity;
import com.huawei.ui.device.activity.appmarket.HwSmartAppMarketLoadingActivity;
import com.huawei.ui.device.activity.finddevice.FindDeviceActivity;
import com.huawei.ui.device.activity.notification.NotificationSettingActivity;
import com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity;
import com.huawei.ui.device.activity.selectcontact.ContactMainActivity;
import com.huawei.ui.device.activity.setwheelsize.SetWheelSizeActivity;
import com.huawei.ui.device.activity.smsquickreply.SmsQuickReplyActivity;
import com.huawei.ui.device.activity.update.UpdateVersionActivity;
import com.huawei.ui.device.activity.weatherreport.WeatherReportActivity;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity;
import com.huawei.ui.homewear21.home.WearHomeHealthMonitoringActivity;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import com.huawei.ui.main.stories.settings.activity.heartrate.StudentHeartRateActivity;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.openservice.db.control.OpenServiceControl;
import com.huawei.ui.openservice.db.model.OpenService;
import com.huawei.watchface.WatchFaceApi;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tiv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f49168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f49169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f49170c;
    private HealthProgressBar d;
    private HealthButton e;
    private HealthTextView f;
    private CustomAlertDialog g;
    private HealthButton h;
    private CustomAlertDialog i;
    private HealthTextView j;
    private CustomTextAlertDialog k;
    private String l;
    private CustomAlertDialog m;
    private WearHomeOldActivity n;
    private CustomAlertDialog o;
    private CustomTextAlertDialog p;
    private Context q;
    private CustomAlertDialog r;
    private LinearLayout s;
    private LinearLayout t;
    private List<OpenService> u;

    public tiv(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.n = wearHomeOldActivity;
        this.q = context;
    }

    public void x() {
        Intent intent = new Intent();
        intent.putExtra("device_id", this.n.f26233a);
        intent.setClass(this.q, WearHomeHealthMonitoringActivity.class);
        this.n.startActivity(intent);
        qrs.ae(this.q);
    }

    public void b() {
        Intent intent = new Intent(this.q, (Class<?>) NotificationSettingActivity.class);
        intent.putExtra("device_id", this.n.f26233a);
        this.n.startActivity(intent);
        qrs.ae(this.q);
        rdt.a(this.n.d);
    }

    public void a(final DeviceInfo deviceInfo, final OnCreateResultListener onCreateResultListener) {
        if (!CommonUtil.ab(this.q)) {
            qpx.e(this.q, R.string.IDS_connect_network);
            LogUtil.j("WearHomeFeatureAction", "Network not Available");
        } else if (mga.h()) {
            qpx.e(this.q, R.string.IDS_offline_map_mcu_mode_tip);
        } else if (deviceInfo == null) {
            ReleaseLogUtil.d("R_WearHomeFeatureAction", "jumpToOfflineMap deviceInfo == null");
        } else {
            lsy.a(new Runnable() { // from class: tiu
                @Override // java.lang.Runnable
                public final void run() {
                    tiv.e(deviceInfo, onCreateResultListener);
                }
            });
        }
    }

    static /* synthetic */ void e(DeviceInfo deviceInfo, OnCreateResultListener onCreateResultListener) {
        H5proUtil.initH5pro();
        OfflineMapInitOptions offlineMapInitOptions = new OfflineMapInitOptions();
        offlineMapInitOptions.setContext(BaseApplication.f());
        offlineMapInitOptions.setDeviceName(deviceInfo.getDeviceName());
        offlineMapInitOptions.setUniqueDevice(deviceInfo.getDeviceUdid());
        offlineMapInitOptions.setH5proUrl(rdo.b().d());
        boolean zCreateOfflineDataMap = OfflineMapInitManager.getInstance().createOfflineDataMap(offlineMapInitOptions, onCreateResultListener);
        ReleaseLogUtil.d("WearHomeFeatureAction", "jumpToOfflineMap enter ", Boolean.valueOf(zCreateOfflineDataMap));
        if (zCreateOfflineDataMap) {
            return;
        }
        xjt.ai("open map page error");
    }

    public void j() {
        LogUtil.a("WearHomeFeatureAction", "enter jumpToOutdoorAdventure");
        H5ProLaunchOption.Builder builderAc = ac();
        builderAc.addPath("#/route-query-list?sportType=222");
        ddv.b().loadH5ProApp(this.n, "com.huawei.health.h5.sports-path", builderAc);
    }

    private static H5ProLaunchOption.Builder ac() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SportRouteService", ddv.b().getCommonJsModule("SportRouteService")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device"));
        builder.setImmerse();
        builder.showStatusBar();
        return builder;
    }

    public void m() {
        HashMap map = new HashMap(16);
        LogUtil.a("WearHomeFeatureAction", "gotoEsimCard");
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010021.value(), map, 0);
        pvh pvhVarB = pvh.b(this.q);
        pxi.e();
        if (pvhVarB != null) {
            if (this.n.e != null && this.n.e.isSupportNewEsim()) {
                LogUtil.a("WearHomeFeatureAction", "openEsimCard isSupportNewEsim : true");
                boolean zD = eey.d(mgg.c("WearHomeFeatureAction"), 148);
                LogUtil.a("WearHomeFeatureAction", "openEsimCard isSupportStandaloneNum = ", Boolean.valueOf(zD));
                if (zD) {
                    pvhVarB.c(this.n);
                    return;
                } else {
                    pvhVarB.d(this.n);
                    return;
                }
            }
            pvhVarB.a(this.n);
        }
    }

    public void d() {
        this.n.u.execute(new Runnable() { // from class: tiv.3
            @Override // java.lang.Runnable
            public void run() {
                tiv.this.l = tqu.e().d(tiv.this.n.d);
                LogUtil.d("WearHomeFeatureAction", "initGrsUrl url isEmpty:", Boolean.valueOf(TextUtils.isEmpty(tiv.this.l)));
            }
        });
    }

    public void o() {
        rdt.d(this.n.d);
        if (!TextUtils.isEmpty(this.l)) {
            LogUtil.a("WearHomeFeatureAction", "mBandUrl url is not empty");
            z();
        } else {
            LogUtil.j("WearHomeFeatureAction", "openAppHelpActivity mBandUrl is null");
            this.n.u.execute(new Runnable() { // from class: tiv.15
                @Override // java.lang.Runnable
                public void run() {
                    tiv.this.l = tqu.e().d(tiv.this.n.d);
                    if (tiv.this.n.d() != null) {
                        tiv.this.n.d().post(new Runnable() { // from class: tiv.15.3
                            @Override // java.lang.Runnable
                            public void run() {
                                tiv.this.z();
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        LogUtil.d("WearHomeFeatureAction", "enter openAppHelpActivity url");
        Intent intent = new Intent(this.q, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", this.l);
        intent.putExtra(Constants.JUMP_MODE_KEY, 0);
        this.n.startActivity(intent);
    }

    public void c() {
        this.n.u.execute(new Runnable() { // from class: tiv.14
            @Override // java.lang.Runnable
            public void run() {
                if (tiv.this.n.d != null) {
                    rdt.b(100107, tiv.this.n.d.getDeviceName());
                }
                rdp.d(tiv.this.n, "11073");
            }
        });
    }

    public void k() {
        Intent intent = new Intent();
        intent.putExtra("device_id", this.n.f26233a);
        intent.setClass(this.q, MusicSecondaryMenuActivity.class);
        this.n.startActivity(intent);
        HashMap map = new HashMap(16);
        map.put("click", "1");
        idy.b(AnalyticsValue.HOME_1090080.value(), map);
    }

    public void n() {
        if (lyy.b().j()) {
            LogUtil.j("WearHomeFeatureAction", "openAppMarketView isDeviceVersionNotSupport");
            xjt.j("openAppMarketView isDeviceVersionNotSupport");
            ag();
        } else {
            lyy.b().d(this.n, new AppBundleLauncher.InstallCallback() { // from class: tiv.13
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent) {
                    lyy.b().f();
                    if (lyy.b().b(tiv.this.n.d)) {
                        try {
                            Intent intent2 = new Intent();
                            intent2.setClass(tiv.this.q, HwSmartAppMarketLoadingActivity.class);
                            tiv.this.n.startActivity(intent2);
                            return false;
                        } catch (ActivityNotFoundException unused) {
                            LogUtil.e("WearHomeFeatureAction", "openAppMarketView NotFoundException");
                            return false;
                        }
                    }
                    lyy.b().g();
                    return false;
                }
            });
            rdt.a();
            lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_101002042.value(), new HashMap(16), 0);
        }
    }

    private void ag() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.q).a(R.string.IDS_hw_health_show_common_dialog_title).b(com.huawei.ui.commonui.R.string.IDS_app_market_device_update).e(R.string.IDS_app_update_later, new View.OnClickListener() { // from class: tiv.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (tiv.this.p != null) {
                    tiv.this.p.dismiss();
                    tiv.this.p = null;
                }
            }
        }).a(R.string.IDS_app_update_now, new View.OnClickListener() { // from class: tiv.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tiv.this.ah();
            }
        }).b();
        this.p = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.p.isShowing() || this.n.isFinishing()) {
            return;
        }
        this.p.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        Intent intent = new Intent();
        intent.setClass(this.q, UpdateVersionActivity.class);
        intent.putExtra("device_id", this.n.f26233a);
        this.n.startActivity(intent);
    }

    public void y() {
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010018.value(), new HashMap(16), 0);
        if (WalletAppManager.getInstance().isOverseaService()) {
            WalletAppManager.getInstance().startNfcWalletH5();
            return;
        }
        tqp.b(this.q);
        WearHomeOldActivity wearHomeOldActivity = this.n;
        tqp.d(wearHomeOldActivity, wearHomeOldActivity.f26233a);
    }

    public void ad() {
        tqp.b(this.q);
        tqp.d(this.n);
    }

    public void r() {
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010028.value(), new HashMap(16), 0);
        Intent intent = new Intent(this.q, (Class<?>) AlarmActivity.class);
        intent.putExtra("device_id", this.n.f26233a);
        this.n.startActivity(intent);
    }

    public void aa() {
        Intent intent = new Intent(this.q, (Class<?>) WeatherReportActivity.class);
        Bundle bundle = new Bundle();
        if (this.n.e != null) {
            bundle.putParcelable("key_bundle_cache_capability", this.n.e);
        } else {
            LogUtil.j("WearHomeFeatureAction", "mActivity.mDeviceCapability is null.");
        }
        intent.putExtra("key_cache_capability", bundle);
        this.n.startActivity(intent);
        qrs.ae(this.q);
        OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.HOME_1010030.value(), new LinkedHashMap<>(16));
    }

    public void t() {
        this.n.d(ContactMainActivity.class);
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010031.value(), new HashMap(16), 0);
    }

    public void s() {
        try {
            Intent intent = new Intent(this.q, (Class<?>) SmsQuickReplyActivity.class);
            intent.putExtra("device_id", this.n.f26233a);
            this.q.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeFeatureAction", "ActivityNotFoundException SmsQuickReplyActivity");
        }
    }

    public void q() {
        this.n.d(StudentHeartRateActivity.class);
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.CLICK_HEART_RATE_FAMILY_MODE.value(), map, 0);
    }

    public void w() {
        try {
            Intent intent = new Intent();
            intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
            intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.me.activity.StudentInfoActivity");
            this.q.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeFeatureAction", "ActivityNotFoundException STUDENT_INFO_ACTIVITY_NAME");
        }
        rdt.b();
    }

    public void h() {
        try {
            if (lsj.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "com.huawei.study.hiresearch")) {
                qrs.c(this.n.getPackageManager().getLaunchIntentForPackage("com.huawei.study.hiresearch"), "com.huawei.study.hiresearch", this.n, this.n.getString(R.string.IDS_hw_innovation_research).replace("\n", ""));
            } else {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.study.hiresearch"));
                intent.addFlags(268435456);
                b(intent, "/#/app/C102552669", "");
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeFeatureAction", "jumpToHiResearchHealth ActivityNotFoundException");
        }
    }

    public void a(boolean z) {
        try {
            if (z) {
                LogUtil.a("WearHomeFeatureAction", "isInstalledBloodSugar");
                Context context = this.q;
                if (context == null) {
                    LogUtil.j("WearHomeFeatureAction", "jumpToContinueBloodSugar mContext is null");
                    return;
                } else {
                    HealthDataDetailActivity.a(context, "BloodSugarCardConstructor", 8);
                    return;
                }
            }
            ai();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeFeatureAction", "Exception ActivityNotFoundException");
        }
    }

    private void ai() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.n);
        builder.b(R.string.IDS_device_blood_sugar_con).a(R.string.IDS_hw_health_show_common_dialog_title).a(R.string.IDS_hw_hms_install_alert_ok, new View.OnClickListener() { // from class: tiv.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("WearHomeFeatureAction", "cancel showEcgDurationDialog");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.k = customTextAlertDialogB;
        customTextAlertDialogB.show();
    }

    private void b(Intent intent, String str, String str2) {
        if (lsj.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "com.huawei.appmarket")) {
            intent.setPackage("com.huawei.appmarket");
            try {
                WearHomeOldActivity wearHomeOldActivity = this.n;
                qrs.c(intent, "com.huawei.appmarket", wearHomeOldActivity, wearHomeOldActivity.getString(R.string.IDS_device_fragment_application_market));
                return;
            } catch (Exception e) {
                ReleaseLogUtil.a("WearHomeFeatureAction", ExceptionUtils.c(e));
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent2.setData(Uri.parse(tlo.a() + str + str2));
        PackageManager packageManager = this.n.getPackageManager();
        if (packageManager != null) {
            LogUtil.a("WearHomeFeatureAction", "checkIsInstalledMarket packageManager is not null");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent2, 65536);
            if (resolveInfoResolveActivity != null) {
                LogUtil.a("WearHomeFeatureAction", "checkIsInstalledMarket resolveInfo is not null");
                ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
                intent2.setComponent(componentName);
                String packageName = componentName.getPackageName();
                WearHomeOldActivity wearHomeOldActivity2 = this.n;
                qrs.c(intent2, packageName, wearHomeOldActivity2, wearHomeOldActivity2.getString(R.string.IDS_browser_app_name));
            }
        }
    }

    public void g() {
        LogUtil.a("WearHomeFeatureAction", "enter jumpToQuickAppEcg");
        prf.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "com.huawei.health.ecg.collection", 3, (String) null);
    }

    public void i() {
        LogUtil.a("WearHomeFeatureAction", "enter jumpToEcgAnalysis");
        qrg.a(false);
        prf.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "com.huawei.health.h5.ecgce", 3, (String) null);
    }

    public void f() {
        LogUtil.a("WearHomeFeatureAction", "enter jumpToVascularElasticityTest");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?from=3");
        ddv.b().loadH5ProApp(this.n, "com.huawei.health.h5.vascular-health", builder);
    }

    public void a() {
        this.u = new ArrayList(10);
        List<OpenService> listQueryAllService = OpenServiceControl.getInstance(this.n).queryAllService();
        if (njy.b(listQueryAllService)) {
            LogUtil.a("WearHomeFeatureAction", "initOpenService: mServiceList size is ", Integer.valueOf(listQueryAllService.size()));
            for (OpenService openService : listQueryAllService) {
                String serviceID = openService.getServiceID();
                if (serviceID == null) {
                    LogUtil.j("WearHomeFeatureAction", "initOpenService: serviceId is null");
                } else if (serviceID.contains("xinqing")) {
                    this.u.add(openService);
                } else {
                    LogUtil.a("WearHomeFeatureAction", "initOpenService: serviceId ", serviceID);
                }
            }
        }
        OpenService.orderOpenService(this.u);
        LogUtil.a("WearHomeFeatureAction", "mServiceList selected size is ", Integer.valueOf(this.u.size()));
        if (eey.d(this.n.d, 112)) {
            cok.d();
        }
    }

    public void l() {
        LogUtil.a("WearHomeFeatureAction", "openHeartIndexActivity: start xinqing service");
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("healthRecommendUrl");
        LogUtil.d("WearHomeFeatureAction", "openHeartIndexActivity: openHeartIndexActivity recommendHost = ", url);
        if (this.u.size() > 0) {
            c(this.u.get(0));
            return;
        }
        if (!TextUtils.isEmpty(url)) {
            LogUtil.a("WearHomeFeatureAction", "openHeartIndexActivity: xinqing service is null , create OpenService");
            OpenService openService = new OpenService();
            openService.setServiceUrl(url + "/heartIndex/index.html");
            openService.setServiceID("xinqing");
            openService.setProductName(this.n.getString(R.string.IDS_hw_heart_index));
            c(openService);
            return;
        }
        LogUtil.j("WearHomeFeatureAction", "openHeartIndexActivity: recommendHost is empty");
    }

    private void c(OpenService openService) {
        Intent intent = new Intent(this.n, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", openService.getServiceUrl());
        intent.putExtra("EXTRA_BI_ID", openService.getServiceID());
        intent.putExtra("EXTRA_BI_NAME", openService.getProductName());
        intent.putExtra("EXTRA_BI_SOURCE", "HeadSetManager");
        intent.putExtra(Constants.IS_START_FROM_HEART_RATE_BOARD, true);
        intent.putExtra("type", Constants.OPEN_SERVICE_TYPE);
        this.n.startActivity(intent);
        rdt.c(openService.getServiceID(), openService.getProductName());
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.a("WearHomeFeatureAction", "Entering startFindDeviceActivity");
        Intent intent = new Intent(this.n, (Class<?>) FindDeviceActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("device", deviceInfo);
        intent.putExtras(bundle);
        this.n.startActivity(intent);
        tqp.e(this.n);
    }

    public void a(DeviceInfo deviceInfo) {
        LogUtil.a("WearHomeFeatureAction", "Entering startSetWheelSizeActivity");
        Intent intent = new Intent(this.n, (Class<?>) SetWheelSizeActivity.class);
        intent.putExtra("rimSize", med.c().a(this.n.d));
        intent.putExtra("device", deviceInfo);
        LogUtil.a("rimSize device " + deviceInfo, new Object[0]);
        this.n.startActivity(intent);
        tqp.e(this.n);
    }

    public void d(String str) {
        LogUtil.a("WearHomeFeatureAction", "startExclusiveGuardian status = ", str);
        if ("1".equals(str)) {
            irz.b(this.q, 5, 2);
            return;
        }
        if ("2".equals(str) || "3".equals(str)) {
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath("#/ExclusiveGuardService?from=3");
            ddv.b().loadH5ProApp(this.n, "com.huawei.health.h5.vip", builder);
            return;
        }
        LogUtil.j("WearHomeFeatureAction", "startExclusiveGuardian else branch");
    }

    public void b(final edj edjVar) {
        LogUtil.a("WearHomeFeatureAction", "startHeadsetHealth enter");
        if (this.n.d == null) {
            LogUtil.j("WearHomeFeatureAction", "startHeadsetHealth mCurrentDeviceInfo is null!");
            return;
        }
        String strJ = lvi.j(this.n.d.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.e("WearHomeFeatureAction", "startHeadsetHealth uuid is null!");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.e("WearHomeFeatureAction", "startHeadsetHealth descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAk = pluginInfoByUuid.i().ak();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("WearHomeFeatureAction", "startFindEarphonePage getEarPhoneManagerUri :", strAk, ", earPhoneProductId: ", strC);
        if (TextUtils.isEmpty(strAk)) {
            return;
        }
        this.n.runOnUiThread(new Runnable() { // from class: tiv.16
            @Override // java.lang.Runnable
            public void run() {
                ddp.a().initAudioDeviceKitAdapter(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                Intent intent = new Intent();
                intent.setData(Uri.parse(strAk));
                Bundle bundle = new Bundle();
                bundle.putString("mac", edjVar.d());
                bundle.putString("deviceName", edjVar.c());
                bundle.putString("productId", strC);
                intent.putExtras(bundle);
                LogUtil.a("WearHomeFeatureAction", "startEarphoneHealth detail page. ");
                ddp.a().launchActivity(tiv.this.q, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final edj edjVar) {
        LogUtil.a("WearHomeFeatureAction", "startFindEarphonePage enter");
        if (this.n.d == null) {
            LogUtil.j("WearHomeFeatureAction", "startFindEarphonePage mCurrentDeviceInfo is null!");
            return;
        }
        String strJ = lvi.j(this.n.d.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.e("WearHomeFeatureAction", "startFindEarphonePage uuid is null!");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.e("WearHomeFeatureAction", "startFindEarphonePage descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAj = pluginInfoByUuid.i().aj();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("WearHomeFeatureAction", "startFindEarphonePage getEarPhoneFindrUri :", strAj, ", earPhoneProductId: ", strC);
        if (TextUtils.isEmpty(strAj)) {
            return;
        }
        this.n.runOnUiThread(new Runnable() { // from class: tiv.20
            @Override // java.lang.Runnable
            public void run() {
                ddp.a().initAudioDeviceKitAdapter(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                Intent intent = new Intent();
                intent.setData(Uri.parse(strAj));
                Bundle bundle = new Bundle();
                bundle.putString("mac", edjVar.d());
                bundle.putString("deviceName", edjVar.c());
                bundle.putString("productId", strC);
                intent.putExtras(bundle);
                LogUtil.a("WearHomeFeatureAction", "startFindEarphonePage");
                ddp.a().launchActivity(tiv.this.q, intent);
            }
        });
    }

    public boolean e() {
        CustomAlertDialog customAlertDialog = this.i;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            return true;
        }
        CustomAlertDialog customAlertDialog2 = this.m;
        if (customAlertDialog2 != null && customAlertDialog2.isShowing()) {
            return true;
        }
        CustomAlertDialog customAlertDialog3 = this.o;
        if (customAlertDialog3 != null && customAlertDialog3.isShowing()) {
            return true;
        }
        CustomAlertDialog customAlertDialog4 = this.g;
        return customAlertDialog4 != null && customAlertDialog4.isShowing();
    }

    public void v() {
        LogUtil.a("WearHomeFeatureAction", "startArrhythmia");
        final H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?from=2");
        pfi.c().launchActivity(this.n, new Intent(), new AppBundleLauncher.InstallCallback() { // from class: tix
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f49199c.a(builder, context, intent);
            }
        });
    }

    /* synthetic */ boolean a(H5ProLaunchOption.Builder builder, Context context, Intent intent) {
        ddv.b().loadH5ProApp(this.n, "com.huawei.health.h5.ppg", builder);
        return false;
    }

    public void p() {
        ReleaseLogUtil.d("WearHomeFeatureAction", "openMyWatchFace");
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        if (watchFaceApi != null) {
            watchFaceApi.openMyWatchFace(new IBaseResponseCallback() { // from class: tiv.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
                        H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
                        mgu.a("e2");
                    }
                }
            });
        }
    }

    public void a(int i) {
        CustomAlertDialog customAlertDialog = this.m;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
            c(this.n.d, i);
        }
    }

    public void a(final DeviceInfo deviceInfo, final int i, final boolean z) {
        LogUtil.a("WearHomeFeatureAction", "checkEarphoneState in. ");
        ab();
        lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: tiv.5
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i2, edj edjVar) {
                if (edjVar == null || TextUtils.isEmpty(edjVar.d())) {
                    tiv.this.ae();
                    return;
                }
                if (!lxb.c().b(edjVar.d())) {
                    tiv.this.a(edjVar, z, deviceInfo, i);
                    return;
                }
                LogUtil.a("WearHomeFeatureAction", "checkEarphoneState in. type: ", Integer.valueOf(i));
                int i3 = i;
                if (i3 == 104) {
                    tiv.this.b(edjVar);
                } else {
                    if (i3 != 115) {
                        return;
                    }
                    tiv.this.d(edjVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(edj edjVar, boolean z, DeviceInfo deviceInfo, int i) {
        if (!a(edjVar)) {
            ae();
            return;
        }
        if (!e(edjVar)) {
            c(deviceInfo, i);
        } else if (z) {
            b(deviceInfo, i);
        } else {
            d(deviceInfo, edjVar, i);
        }
    }

    private boolean a(edj edjVar) {
        return (edjVar.b() & 1) > 0;
    }

    private boolean e(edj edjVar) {
        return (edjVar.a() == 1) && (edjVar.e() != 0);
    }

    private void ab() {
        View viewInflate = View.inflate(this.q, R.layout.wear_home_earphone_dialog_layout, null);
        this.f49168a = viewInflate;
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.earphone_pair_dialog_loading_image);
        this.d = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        ImageView imageView = (ImageView) this.f49168a.findViewById(R.id.earphone_pair_dialog_image);
        this.f49170c = imageView;
        imageView.setBackgroundResource(R.drawable.icon_pair_watch_earphone);
        this.f = (HealthTextView) this.f49168a.findViewById(R.id.earphone_pair_dialog_title);
        this.j = (HealthTextView) this.f49168a.findViewById(R.id.earphone_pair_dialog_tip);
        this.f49169b = (LinearLayout) this.f49168a.findViewById(R.id.earphone_dialog_btn_layout);
        this.h = (HealthButton) this.f49168a.findViewById(R.id.earphone_dialog_btn_positive);
        this.e = (HealthButton) this.f49168a.findViewById(R.id.earphone_dialog_btn_negative);
    }

    /* JADX INFO: renamed from: tiv$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49171a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ edj f49173c;
        final /* synthetic */ DeviceInfo e;

        AnonymousClass1(edj edjVar, DeviceInfo deviceInfo, int i) {
            this.f49173c = edjVar;
            this.e = deviceInfo;
            this.f49171a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            tiv.this.d.setVisibility(8);
            tiv.this.f.setVisibility(0);
            tiv.this.f.setText(this.f49173c.c());
            tiv.this.j.setVisibility(8);
            tiv.this.h.setVisibility(8);
            tiv.this.e.setVisibility(8);
            tiv.this.f49169b.setVisibility(8);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(tiv.this.q);
            if (tiv.this.i != null) {
                tiv.this.i.dismiss();
            }
            tiv.this.i = builder.b();
            if (tiv.this.f49168a.getParent() != null) {
                ViewParent parent = tiv.this.f49168a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(tiv.this.f49168a);
                }
            }
            builder.a(tiv.this.f49168a);
            int i = R.string.IDS_blite_guide_title;
            final DeviceInfo deviceInfo = this.e;
            final int i2 = this.f49171a;
            builder.d(i, new DialogInterface.OnClickListener() { // from class: tja
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.d.b(deviceInfo, i2, dialogInterface, i3);
                }
            });
            builder.a(R.string.IDS_settings_button_cancal_ios_btn, new DialogInterface.OnClickListener() { // from class: tiy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    LogUtil.j("WearHomeFeatureAction", "onClick showEarphonePairDialog NegativeButton");
                }
            });
            tiv.this.i.setCancelable(false);
            tiv.this.i.show();
        }

        /* synthetic */ void b(DeviceInfo deviceInfo, int i, DialogInterface dialogInterface, int i2) {
            tiv.this.i.dismiss();
            tiv.this.b(deviceInfo, i);
        }
    }

    private void d(DeviceInfo deviceInfo, edj edjVar, int i) {
        LogUtil.a("WearHomeFeatureAction", "showEarphonePairDialog. ");
        this.n.runOnUiThread(new AnonymousClass1(edjVar, deviceInfo, i));
    }

    /* JADX INFO: renamed from: tiv$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        final /* synthetic */ int d;
        final /* synthetic */ DeviceInfo e;

        AnonymousClass4(int i, DeviceInfo deviceInfo) {
            this.d = i;
            this.e = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            tiv.this.d.setVisibility(0);
            tiv.this.f.setVisibility(0);
            tiv.this.j.setVisibility(8);
            tiv.this.h.setVisibility(8);
            tiv.this.e.setVisibility(8);
            tiv.this.f49169b.setVisibility(8);
            tiv.this.f.setText(R.string.IDS_blite_guide_paire_opt_title);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(tiv.this.q);
            if (tiv.this.m != null) {
                tiv.this.m.dismiss();
            }
            tiv.this.m = builder.b();
            if (tiv.this.f49168a.getParent() != null) {
                ViewParent parent = tiv.this.f49168a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(tiv.this.f49168a);
                }
            }
            builder.a(tiv.this.f49168a);
            builder.a(R.string.IDS_ear_phone_pair_close, new DialogInterface.OnClickListener() { // from class: tjb
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f49204c.e(dialogInterface, i);
                }
            });
            tiv.this.m.setCancelable(false);
            tiv.this.m.show();
            if (tiv.this.n != null && tiv.this.n.d() != null) {
                Message messageObtainMessage = tiv.this.n.d().obtainMessage();
                messageObtainMessage.what = 1040;
                messageObtainMessage.obj = Integer.valueOf(this.d);
                tiv.this.n.d().sendMessageDelayed(messageObtainMessage, 60000L);
            }
            lxb.c().c(this.e, new EarPhoneResponseCallback() { // from class: tiv.4.5
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                public void onResponse(int i, edj edjVar) {
                    tiv.this.b(i, edjVar, AnonymousClass4.this.d, AnonymousClass4.this.e);
                }
            });
        }

        /* synthetic */ void e(DialogInterface dialogInterface, int i) {
            LogUtil.j("WearHomeFeatureAction", "onClick showEarphonePairingDialog NegativeButton");
            tiv.this.m.dismiss();
            tiv.this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo, int i) {
        LogUtil.a("WearHomeFeatureAction", "showEarphonePairingDialog. ");
        this.n.runOnUiThread(new AnonymousClass4(i, deviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, edj edjVar, int i2, DeviceInfo deviceInfo) {
        WearHomeOldActivity wearHomeOldActivity = this.n;
        if (wearHomeOldActivity != null && wearHomeOldActivity.d() != null) {
            this.n.d().removeMessages(1040);
        }
        CustomAlertDialog customAlertDialog = this.m;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            LogUtil.j("WearHomeFeatureAction", "EarphonePairingDialog is not showing. ");
            return;
        }
        this.m.dismiss();
        this.m = null;
        if (i == 1) {
            LogUtil.a("WearHomeFeatureAction", "earphonePairCallBack in. type: ", Integer.valueOf(i2));
            if (i2 == 104) {
                b(edjVar);
                return;
            } else {
                if (i2 != 115) {
                    return;
                }
                d(edjVar);
                return;
            }
        }
        c(deviceInfo, i2);
    }

    /* JADX INFO: renamed from: tiv$7, reason: invalid class name */
    class AnonymousClass7 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f49192a;
        final /* synthetic */ int e;

        AnonymousClass7(DeviceInfo deviceInfo, int i) {
            this.f49192a = deviceInfo;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            tiv.this.af();
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(tiv.this.q);
            tiv.this.o = builder.b();
            if (tiv.this.f49168a.getParent() != null) {
                ViewParent parent = tiv.this.f49168a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(tiv.this.f49168a);
                }
            }
            builder.a(tiv.this.f49168a);
            tiv.this.h.setOnClickListener(new View.OnClickListener() { // from class: tiv.7.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("WearHomeFeatureAction", "onClick showEarphonePairFailedDialog PositiveButton");
                    tiv.this.o.dismiss();
                    lxb.c().e(AnonymousClass7.this.f49192a, new EarPhoneResponseCallback() { // from class: tiv.7.4.5
                        @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                        public void onResponse(int i, edj edjVar) {
                            tiv.this.a(edjVar, true, AnonymousClass7.this.f49192a, AnonymousClass7.this.e);
                        }
                    });
                }
            });
            tiv.this.e.setOnClickListener(new View.OnClickListener() { // from class: tiv.7.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("WearHomeFeatureAction", "onClick showEarphonePairFailedDialog NegativeButton");
                    tiv.this.o.dismiss();
                }
            });
            tiv.this.o.setCancelable(false);
            tiv.this.o.show();
        }
    }

    private void c(DeviceInfo deviceInfo, int i) {
        LogUtil.a("WearHomeFeatureAction", "showEarphonePairFailedDialog. ");
        this.n.runOnUiThread(new AnonymousClass7(deviceInfo, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        this.h = (HealthButton) this.f49168a.findViewById(R.id.earphone_dialog_btn_positive);
        this.e = (HealthButton) this.f49168a.findViewById(R.id.earphone_dialog_btn_negative);
        this.f49169b.setVisibility(0);
        this.f49169b.setOrientation(0);
        if (LanguageUtil.bc(this.q)) {
            LogUtil.a("WearHomeFeatureAction", "language444 in:");
            this.h = (HealthButton) this.f49168a.findViewById(R.id.earphone_dialog_btn_negative);
            this.e = (HealthButton) this.f49168a.findViewById(R.id.earphone_dialog_btn_positive);
            this.f49169b.setOrientation(1);
            this.f49169b.setShowDividers(0);
        }
        this.d.setVisibility(8);
        this.f.setVisibility(0);
        this.j.setVisibility(0);
        this.f.setText(R.string.IDS_ear_phone_pair_guide_error);
        this.j.setText(R.string.IDS_ear_phone_pair_failed_reconnect_tip);
        this.h.setText(R.string.IDS_btsdk_confirm_repair);
        this.e.setText(R.string.IDS_settings_button_cancal_ios_btn);
        this.h.setVisibility(0);
        this.e.setVisibility(0);
    }

    /* JADX INFO: renamed from: tiv$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {
        AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewInflate = View.inflate(tiv.this.q, R.layout.wear_home_earphone_not_found_dialog, null);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(tiv.this.q);
            builder.a(viewInflate);
            builder.a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tiz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.j("WearHomeFeatureAction", "onClick NegativeButton");
                }
            });
            if (tiv.this.g != null && tiv.this.g.isShowing()) {
                LogUtil.a("WearHomeFeatureAction", "earphoneNotFoundDialog is show");
                return;
            }
            tiv.this.g = builder.b();
            tiv.this.g.setCancelable(false);
            tiv.this.g.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        LogUtil.a("WearHomeFeatureAction", "showEarphoneNotFoundDialog. ");
        this.n.runOnUiThread(new AnonymousClass8());
    }

    public void d(final DeviceInfo deviceInfo) {
        CustomAlertDialog customAlertDialog = this.r;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            this.r.dismiss();
        }
        View viewInflate = View.inflate(this.q, R.layout.find_device_dialog_layout, null);
        this.s = (LinearLayout) viewInflate.findViewById(R.id.find_watch_layout);
        this.t = (LinearLayout) viewInflate.findViewById(R.id.find_earphone_layout);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: tiv.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tiv.this.b(deviceInfo);
                tiv.this.r.dismiss();
            }
        });
        this.t.setOnClickListener(new View.OnClickListener() { // from class: tiv.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tiv.this.a(deviceInfo, 115, false);
                tiv.this.r.dismiss();
            }
        });
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.q);
        builder.b("");
        builder.a(viewInflate);
        builder.a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: tiv.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                tiv.this.r.dismiss();
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.r = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.r.show();
    }

    public void u() {
        boolean zD = eey.d(this.n.d, FitnessSleepType.HW_FITNESS_NOON);
        LogUtil.a("WearHomeFeatureAction", "isSupportLiveView", Boolean.valueOf(zD));
        Intent intent = new Intent(this.q, (Class<?>) NotificationLiveActivity.class);
        intent.putExtra("device_id", this.n.f26233a);
        intent.putExtra("LiveViewType", zD);
        iov.d(this.n, intent);
    }
}
