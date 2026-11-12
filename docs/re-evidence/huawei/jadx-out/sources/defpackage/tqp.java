package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.JumpToPageCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPay;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.HelpCustomerOperate;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.notification.NotificationSettingActivity;
import com.huawei.ui.device.activity.update.UpdateVersionActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import com.huawei.ui.device.utlis.clouddevice.DevicePopTipBiUtil;
import com.huawei.watchface.WatchFaceApi;
import com.huawei.watchface.WatchFaceType;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import com.huawei.wear.oversea.overseamanger.OverSeaQueryCallBack;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class tqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static NoTitleCustomAlertDialog f49537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f49538b;
    private static CommonDialog21 d;
    private static String h;
    private static final String[] e = {"android.permission.RECEIVE_SENSITIVE_NOTIFICATIONS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f49539c = new Handler(Looper.getMainLooper()) { // from class: tqp.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.j("WearHomeUtils", "handleMessage message is:", Integer.valueOf(message.what));
            if (message.what == 0) {
                ddy.e().initHealthPayAdapter(BaseApplication.getContext());
                Intent intent = new Intent();
                if (!LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014).equals("CN")) {
                    intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_58);
                    LogUtil.a("WearHomeUtils", "go to WearWalletOverSeaMainActivity");
                } else {
                    intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_47);
                    LogUtil.a("WearHomeUtils", "go to WearWalletMainActivity");
                }
                intent.setFlags(268435456);
                ddy.e().launchActivity(tqp.f49538b, intent);
                return;
            }
            if (message.what == 7 || message.what == 6) {
                tqp.d(message);
            } else {
                tqp.d(message.what);
            }
        }
    };

    public static boolean d() {
        return false;
    }

    public static boolean e(int i) {
        return i == 78 || i == 57;
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver, String... strArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        if (context != null) {
            try {
                BroadcastManagerUtil.c(context, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("MainUI", 0, "WearHomeUtils", "IllegalArgumentException");
            }
        }
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver, int i, String str) {
        if (context != null) {
            try {
                IntentFilter intentFilter = new IntentFilter(str);
                intentFilter.setPriority(i);
                BroadcastManagerUtil.c(context, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("MainUI", 0, "WearHomeUtils", "registerPriorityBroadcast IllegalArgumentException");
            }
        }
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (context != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                LogUtil.e("MainUI", 0, "WearHomeUtils", e2.getMessage());
            }
        }
    }

    public static void e(BroadcastReceiver broadcastReceiver, String... strArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void a(BroadcastReceiver broadcastReceiver) {
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("MainUI", 0, "WearHomeUtils", e2.getMessage());
        }
    }

    public static void b(Context context) {
        PluginPay.getInstance(context).setAdapter(lkw.t());
        ReleaseLogUtil.d("R_WearHomeUtils", "initPluginPayAdapter");
    }

    public static boolean b(String str) {
        return a(str, 2);
    }

    public static boolean a(String str, int i) {
        long jI = CommonUtil.i(KeyValDbManager.d(BaseApplication.getContext()).c(str));
        LogUtil.a("WearHomeUtils", str, "isTimeExpired last time:", Long.valueOf(jI));
        return System.currentTimeMillis() - jI > ((long) i) * 86400000;
    }

    public static void d(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).b(str, String.valueOf(System.currentTimeMillis()));
    }

    public static void g(final Context context) {
        LogUtil.a("WearHomeUtils", "initWatchfaceAdapter");
        final String string = Arrays.toString(Thread.currentThread().getStackTrace());
        ThreadPoolManager.c().a("WearHomeUtils", new Runnable() { // from class: tqp.10
            @Override // java.lang.Runnable
            public void run() {
                mca.a(context);
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("watchFaceInitAar", "stackTraceMessage :" + string);
            }
        });
    }

    public static void b(final Context context, final String str) {
        LogUtil.a("WearHomeUtils", "initWatchfaceAdapter");
        final String string = Arrays.toString(Thread.currentThread().getStackTrace());
        ThreadPoolManager.c().a("WearHomeUtils", new Runnable() { // from class: tqp.6
            @Override // java.lang.Runnable
            public void run() {
                mca.a(context);
                mca.c(context, str);
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("watchFaceInitAar", "stackTraceMessageH5 :" + string);
            }
        });
    }

    public static void d(Context context, String str) {
        if (context == null) {
            ReleaseLogUtil.e("R_WearHomeUtils", "goToCardHolderTransitActivity context is null");
            return;
        }
        ddu.c();
        if (!rgd.a(str)) {
            ReleaseLogUtil.d("R_WearHomeUtils", "goToCardHolderTransitActivity not isSupportQuery");
            ddy.e().initHealthPayAdapter(context);
            Intent intent = new Intent();
            if (k()) {
                intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_47);
                ReleaseLogUtil.d("R_WearHomeUtils", "go to WearWalletMainActivity");
            } else {
                intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_31);
                ReleaseLogUtil.d("R_WearHomeUtils", "go to CardHolderActivity");
            }
            ddy.e().launchActivity(context, intent);
            ReleaseLogUtil.d("R_WearHomeUtils", "launchActivity WearWalletMainActivity");
            return;
        }
        i(context, str);
    }

    public static void d(Context context) {
        SharedPreferenceManager.a(String.valueOf(10008), "click_satcom_card", true);
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginPay_A_70);
        ddy.e().launchActivity(context, intent);
        ReleaseLogUtil.d("R_WearHomeUtils", "gotoSatcomCardActivity");
    }

    private static void i(final Context context, final String str) {
        f49538b = context;
        i(context);
        OverSeaMangerUtil.a(context).e(rgd.a(eej.a()), new OverSeaQueryCallBack() { // from class: tqp.8
            @Override // com.huawei.wear.oversea.overseamanger.OverSeaQueryCallBack
            public int onSuccess(int i) {
                ReleaseLogUtil.d("R_WearHomeUtils", "OverSeaQueryCallBack onSuccess");
                tqp.a(context);
                tqp.b(0, str);
                return i;
            }

            @Override // com.huawei.wear.oversea.overseamanger.OverSeaQueryCallBack
            public int onFail(int i) {
                ReleaseLogUtil.d("R_WearHomeUtils", "OverSeaQueryCallBack fail returnCode is:", Integer.valueOf(i));
                tqp.a(context);
                if (i != 5 || !Utils.k()) {
                    tqp.b(i, str);
                    return i;
                }
                tqp.b(2, str);
                return i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = str;
        f49539c.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final Message message) {
        int i;
        if (message.what == 7) {
            i = R.string.IDS_network_connect_error;
        } else {
            i = R.string.IDS_hwh_home_healthshop_unable_connect_server_tips;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(f49538b);
        builder.b(i).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tqp.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tqp.f49537a.dismiss();
            }
        }).c(R.string.IDS_network_set, new View.OnClickListener() { // from class: tqp.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str;
                if (message.what == 7) {
                    try {
                        tqp.f49538b.startActivity(new Intent("android.settings.SETTINGS"));
                        return;
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("WearHomeUtils", "ActivityNotFoundException BindAlipayProgressActivity");
                        return;
                    }
                }
                LogUtil.j("WearHomeUtils", "network error retry");
                if (message.obj != null && !(message.obj instanceof String)) {
                    LogUtil.a("WearHomeUtils", "showRetryDialog object instance error");
                } else {
                    if (message.obj instanceof String) {
                        str = (String) message.obj;
                    }
                    tqp.d(tqp.f49538b, str);
                }
                str = "";
                tqp.d(tqp.f49538b, str);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        f49537a = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        f49537a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(f49538b);
        if (i == 3 || i == 1) {
            builder.b(com.huawei.plugindevice.R.string.wallet_unenable_device);
        } else if (i == 2) {
            builder.b(com.huawei.plugindevice.R.string.wallet_unenable_country);
        } else if (i == 4) {
            builder.b(com.huawei.plugindevice.R.string.wallet_unenable_version);
        } else {
            builder.b(com.huawei.plugindevice.R.string.IDS_wallet_query_failed);
            LogUtil.j("WearHomeUtils", "code is:", Integer.valueOf(i));
        }
        builder.c(com.huawei.plugindevice.R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: tqp.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tqp.f49537a.dismiss();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        f49537a = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        f49537a.show();
    }

    private static void i(Context context) {
        if (d != null) {
            a(f49538b);
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            new CommonDialog21(context, com.huawei.ui.main.R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(context);
            d = commonDialog21B;
            commonDialog21B.b(context.getString(com.huawei.ui.main.R.string.wallet_load_service));
            d.setCancelable(false);
            d.c();
            d.show();
            ReleaseLogUtil.d("R_WearHomeUtils", "showLoadingDialog...mLoadingDialog.show()");
        }
    }

    public static void a(Context context) {
        CommonDialog21 commonDialog21;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || (commonDialog21 = d) == null) {
            return;
        }
        commonDialog21.cancel();
        d = null;
        LogUtil.a("WearHomeUtils", "destroy mLoadingDialog");
    }

    private static boolean k() {
        ReleaseLogUtil.d("R_WearHomeUtils", "isOpenCardNewWay");
        if (lkw.t() != null) {
            return lkw.t().isWalletOpenCard();
        }
        return false;
    }

    public static String a(Context context, String str, String str2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return b(context, str, z);
        }
        if (str2.contains(Constants.LINK)) {
            if (str2.contains("HUAWEI CM-R1P") || str2.contains("HUAWEI AM-R1")) {
                return str2.replace(Constants.LINK, " -");
            }
            if (z && str2.length() > 4) {
                return str2.substring(0, str2.length() - 4);
            }
            if (z2) {
                return str2.replace(Constants.LINK, " -");
            }
        }
        return str2;
    }

    public static String a(Context context, String str) {
        return b(context, str, false);
    }

    public static String b(Context context, String str, boolean z) {
        String deviceName;
        if (context == null) {
            LogUtil.j("WearHomeUtils", "getTitle, context is null");
            return "";
        }
        context.getResources().getString(com.huawei.ui.homewear21.R.string.IDS_app_name);
        DeviceInfo deviceInfoA = tfn.a().a(str);
        if (deviceInfoA != null) {
            if (TextUtils.isEmpty(deviceInfoA.getDeviceName())) {
                deviceName = rcv.a(context).d(deviceInfoA.getProductType());
                ReleaseLogUtil.d("WearHomeUtils", "getTitle transDeviceProductTypeIntToStr titleName:", deviceName);
            } else {
                deviceName = deviceInfoA.getDeviceName();
                ReleaseLogUtil.d("R_WearHomeUtils", "getTitle getDeviceName titleName:", deviceName);
                h = deviceName;
            }
        } else {
            deviceName = h;
            ReleaseLogUtil.d("R_WearHomeUtils", "getTitle mTitleNameValue titleName:", deviceName);
        }
        if (TextUtils.isEmpty(deviceName)) {
            return deviceName;
        }
        if (deviceName.contains("HUAWEI CM-R1P")) {
            String strSubstring = deviceName.substring(0, 13);
            ReleaseLogUtil.d("R_WearHomeUtils", "getTitle  CMR1P  titleName:", strSubstring);
            return strSubstring;
        }
        if (deviceName.contains("HUAWEI AM-R1")) {
            String strSubstring2 = deviceName.substring(0, 12);
            ReleaseLogUtil.d("R_WearHomeUtils", "getTitle  AMR1  titleName:", strSubstring2);
            return strSubstring2;
        }
        String strB = b(z, deviceName);
        ReleaseLogUtil.d("R_WearHomeUtils", "getTitle  getOnlyOneDeviceName  titleName:", strB);
        return strB;
    }

    private static String b(boolean z, String str) {
        return (z && str.contains(Constants.LINK)) ? str.substring(0, str.length() - 4) : str;
    }

    public static void e(Activity activity, int i) {
        int identifier;
        if (activity == null) {
            return;
        }
        if (activity.getApplicationContext().getTheme() == null) {
            LogUtil.j("WearHomeUtils", "setActivityTheme theme is null");
            return;
        }
        LogUtil.a("WearHomeUtils", "loadApplicationTheme() themeType:", Integer.valueOf(i));
        if ("com.huawei.health".equals(BaseApplication.getAppPackage())) {
            identifier = i != 2 ? activity.getResources().getIdentifier("HealthTheme", TtmlNode.TAG_STYLE, "com.huawei.health") : activity.getResources().getIdentifier("HealthTransparentTheme", TtmlNode.TAG_STYLE, "com.huawei.health");
        } else {
            identifier = 0;
        }
        if (identifier == 0) {
            LogUtil.a("WearHomeUtils", "themeResources is DEFAULT_THEME_ID");
        } else {
            LogUtil.a("WearHomeUtils", "themeResources is ", Integer.valueOf(identifier));
            activity.setTheme(identifier);
        }
    }

    public static void e(Context context) {
        if (context instanceof Activity) {
            if (LanguageUtil.ba(context)) {
                ((Activity) context).overridePendingTransition(com.huawei.ui.homewear21.R.anim.right_enter_duration, com.huawei.ui.homewear21.R.anim.right_exit_duration);
            } else {
                ((Activity) context).overridePendingTransition(com.huawei.ui.homewear21.R.anim.left_enter_duration, com.huawei.ui.homewear21.R.anim.left_exit_duration);
            }
        }
    }

    public static void c(Context context) {
        if (context instanceof Activity) {
            if (LanguageUtil.ba(context)) {
                ((Activity) context).overridePendingTransition(0, com.huawei.ui.homewear21.R.anim.left_exit_duration);
            } else {
                ((Activity) context).overridePendingTransition(0, com.huawei.ui.homewear21.R.anim.right_exit_duration);
            }
        }
    }

    public static void e(final Context context, String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(str).c(com.huawei.ui.homewear21.R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: tqp.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WearHomeUtils", "user choose open gps");
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                Context context2 = context;
                if (context2 instanceof Activity) {
                    ((Activity) context2).startActivityForResult(intent, 0);
                }
            }
        }).a(com.huawei.ui.homewear21.R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: tqp.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WearHomeUtils", "user choose cancel");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void e(Context context, String str, Intent intent) {
        if (TextUtils.isEmpty(str) || intent == null) {
            LogUtil.j("WearHomeUtils", "jumpSpecifiedActivity params is null");
            return;
        }
        int intExtra = intent.getIntExtra("key_page_id", -1);
        if (intExtra == -1) {
            LogUtil.j("WearHomeUtils", "jumpSpecifiedActivity pageId is -1");
            return;
        }
        LogUtil.j("WearHomeUtils", "jumpSpecifiedActivity jump");
        try {
            Intent intent2 = new Intent();
            if (intExtra == 0) {
                intent2.setClassName(context, NotificationSettingActivity.class.getCanonicalName());
            } else {
                intent2.setClassName(context, UpdateVersionActivity.class.getCanonicalName());
            }
            intent2.setPackage(BaseApplication.getAppPackage());
            intent2.putExtra("device_id", str);
            context.startActivity(intent2);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeUtils", "jumpSpecifiedActivity ActivityNotFoundException");
        }
    }

    public static boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "isSupportEditSms deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 82);
    }

    public static boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "isSupportSmsReject deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 16);
    }

    public static boolean h(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "isSupportSmsReject deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 73);
    }

    public static void c(Context context, int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("dialogType", 1);
        String strValue = AnalyticsValue.ECG_DIALOG_SHOW_COUNT.value();
        lmf.d().c(context, strValue, map, 0);
        LogUtil.a("WearHomeUtils", "BI ecg dialog, value: ", strValue, ", typeMap: ", map.toString());
    }

    public static boolean b(DeviceInboxInfo deviceInboxInfo) {
        if (deviceInboxInfo == null) {
            LogUtil.j("WearHomeUtils", "isEffectiveExclusiveGuardian deviceInboxInfo is null");
            return false;
        }
        if (deviceInboxInfo.getBenefitType() == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long effectiveStartTime = deviceInboxInfo.getEffectiveStartTime();
            long effectiveEndTime = deviceInboxInfo.getEffectiveEndTime();
            LogUtil.a("WearHomeUtils", "isEffectiveExclusiveGuardian currentTime = ", Long.valueOf(jCurrentTimeMillis), ",effectiveStartTime = ", Long.valueOf(effectiveStartTime), ",effectiveEndTime = ", Long.valueOf(effectiveEndTime));
            if (jCurrentTimeMillis >= effectiveStartTime && jCurrentTimeMillis <= effectiveEndTime) {
                return true;
            }
        }
        return false;
    }

    public static String e(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("WearHomeUtils", "getExclusiveGuardianData context is null");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearHomeUtils", "getExclusiveGuardianData deviceIdentify is empty");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("WearHomeUtils", "getExclusiveGuardianData keywords is empty");
            return "";
        }
        String strC = c(str, str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("WearHomeUtils", "getExclusiveGuardianData key is empty");
            return "";
        }
        LogUtil.a("WearHomeUtils", "getExclusiveGuardianData key = ", strC);
        return SharedPreferenceManager.e(context, String.valueOf(10008), strC);
    }

    public static void e(Context context, String str, String str2, String str3) {
        if (context == null) {
            LogUtil.j("WearHomeUtils", "saveExclusiveGuardianData context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearHomeUtils", "saveExclusiveGuardianData deviceIdentify is empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("WearHomeUtils", "saveExclusiveGuardianData keywords is empty");
            return;
        }
        String strC = c(str, str2);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        LogUtil.a("WearHomeUtils", "saveExclusiveGuardianData key = ", strC);
        SharedPreferenceManager.e(context, String.valueOf(10008), strC, str3, null);
    }

    private static String c(String str, String str2) {
        String accountInfo = LoginInit.getInstance(f49538b).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("WearHomeUtils", "getExclusiveGuardianStatusKey userId is empty");
            return "";
        }
        return accountInfo + "_" + str2 + "_" + nio.e(str);
    }

    public static void b(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addOutgoingCallPermission deviceInfo is null");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("WearHomeUtils", "addOutgoingCallPermission is family_pair_mode");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE != null && deviceCapabilityE.isMessageAlert() && rcv.a(f49538b).j()) {
            list.add("android.permission.PROCESS_OUTGOING_CALLS");
        }
    }

    public static void i(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addSmsPermission deviceInfo is null");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("WearHomeUtils", "addSmsPermission is family_pair_mode");
            return;
        }
        if (d(deviceInfo) || h(deviceInfo)) {
            list.add("android.permission.SEND_SMS");
            list.add("android.permission.READ_SMS");
            LogUtil.j("WearHomeUtils", "addSmsPermission add sms all permission");
        } else {
            DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
            if (deviceCapabilityE == null || !deviceCapabilityE.isSupportSendSosSms()) {
                return;
            }
            list.add("android.permission.SEND_SMS");
        }
    }

    public static void a(DeviceCapability deviceCapability, List<String> list) {
        if (deviceCapability == null || !deviceCapability.isWeatherPush()) {
            LogUtil.j("WearHomeUtils", "addForegroundLocationPermission not support WeatherPush");
        } else {
            list.add("android.permission.ACCESS_COARSE_LOCATION");
            list.add("android.permission.ACCESS_FINE_LOCATION");
        }
    }

    public static boolean a(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction) {
        lsg.a(activity, strArr, permissionsResultAction);
        KeyValDbManager.d(BaseApplication.getContext()).b("wear_local_permission_time", String.valueOf(System.currentTimeMillis()));
        return true;
    }

    public static boolean d(Activity activity, String[] strArr) {
        if (activity == null || strArr == null || strArr.length == 0) {
            LogUtil.j("WearHomeUtils", "checkPermissions activity == null");
            return false;
        }
        if (!b("wear_local_permission_time")) {
            LogUtil.j("WearHomeUtils", "request local permission < 48h");
            return false;
        }
        if (!lsg.d(BaseApplication.getContext(), strArr)) {
            return true;
        }
        LogUtil.j("WearHomeUtils", "has local permission");
        return false;
    }

    public static void d(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addAnswerPhoneCallsPermission deviceInfo is null");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("WearHomeUtils", "addAnswerPhoneCallsPermission is family_pair_mode");
            return;
        }
        if (!j()) {
            LogUtil.j("WearHomeUtils", "addAnswerPhoneCallsPermission not support call phone");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null) {
            LogUtil.j("WearHomeUtils", "addAnswerPhoneCallsPermission deviceCapability is null");
        } else if (deviceCapabilityE.isSupportCallingOperationType() || deviceInfo.getProductType() == 57) {
            list.add("android.permission.ANSWER_PHONE_CALLS");
        }
    }

    public static void c(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addReadCallLogPermission deviceInfo is null");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null || !deviceCapabilityE.isMessageAlert()) {
            LogUtil.j("WearHomeUtils", "addReadCallLogPermission not support MessageAlert");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("WearHomeUtils", "addReadCallLogPermission is family_pair_mode");
        } else if (!j()) {
            LogUtil.j("WearHomeUtils", "addReadCallLogPermission not support call phone");
        } else {
            list.add("android.permission.READ_CALL_LOG");
        }
    }

    public static void a(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addCallPhonePermission deviceInfo is null");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("WearHomeUtils", "addCallPhonePermission is family_pair_mode");
            return;
        }
        if (!j()) {
            LogUtil.j("WearHomeUtils", "addCallPhonePermission not support call phone");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null) {
            LogUtil.j("WearHomeUtils", "addCallPhonePermission deviceCapability is null");
        } else if (deviceCapabilityE.isSupportCallingOperationType() || deviceInfo.getProductType() == 57) {
            list.add("android.permission.CALL_PHONE");
        }
    }

    public static void j(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addReadContactsPermission deviceInfo is null");
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify()) || mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("WearHomeUtils", "addReadContactsPermission is family_pair_mode");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null) {
            LogUtil.j("WearHomeUtils", "addReadContactsPermission deviceCapability is null");
        } else if (deviceCapabilityE.isMessageAlert() || deviceCapabilityE.isContacts() || deviceCapabilityE.isSupportSosTransmission()) {
            list.add("android.permission.READ_CONTACTS");
        }
    }

    public static void g(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addReadPhoneStatePermission deviceInfo is null");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null) {
            LogUtil.j("WearHomeUtils", "addReadPhoneStatePermission deviceCapability is null");
        } else if (deviceCapabilityE.isMessageAlert() || deviceCapabilityE.isSupportCallingOperationType() || deviceCapabilityE.isSupportEsim()) {
            list.add("android.permission.READ_PHONE_STATE");
        }
    }

    public static void e(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null) {
            LogUtil.j("WearHomeUtils", "addReadAndWriteCalendarPermission deviceInfo is null");
            return;
        }
        boolean zD = eey.d(deviceInfo, 171);
        boolean zD2 = eey.d(deviceInfo, 184);
        if (!zD && !zD2) {
            LogUtil.a("WearHomeUtils", "Not SupportOtherPhoneCalendarSync");
        } else {
            list.add("android.permission.READ_CALENDAR");
            list.add("android.permission.WRITE_CALENDAR");
        }
    }

    public static void c(int i, String str, boolean z) {
        SharedPreferenceManager.a(Integer.toString(10008), "watchface_" + i + BTDeviceMgrUtil.c().e(str), z);
    }

    public static boolean e(int i, String str) {
        return SharedPreferenceManager.b(Integer.toString(10008), "watchface_" + i + BTDeviceMgrUtil.c().e(str), false);
    }

    public static String f() {
        if (b() != null) {
            return WatchFaceUtil.isSupportMyWatch() ? "1" : "0";
        }
        ReleaseLogUtil.e("R_WearHomeUtils", "isCurrentSupportMyWatchFace currentDevice is null.");
        return "2";
    }

    public static DeviceInfo b() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "WearHomeUtils");
    }

    public static void c(Context context, String str) {
        if (!str.contains("photo-dial-new")) {
            if (!WatchFaceUtil.isSupportWatchFaceMarket()) {
                ReleaseLogUtil.d("R_WearHomeUtils", "startWatchFaceMarket current watch face market not supported");
                return;
            } else {
                b(context, str);
                return;
            }
        }
        String strF = f();
        ReleaseLogUtil.d("R_WearHomeUtils", "startWatchFaceMarket onResponse supportMyWatchFace：", strF);
        if ("1".equals(strF)) {
            a(WatchFaceType.ALBUM.value());
            return;
        }
        if ("2".equals(strF)) {
            qpx.e(BaseApplication.getContext(), com.huawei.ui.homewear21.R.string.IDS_device_not_support_my_watch_face_deeplink);
        } else if (!WatchFaceUtil.isSupportWatchFaceMarket()) {
            LogUtil.a("WearHomeUtils", "startWatchFaceMarket watch face market not supported");
        } else {
            b(context, str);
        }
    }

    public static void m() {
        String strF = f();
        ReleaseLogUtil.d("R_WearHomeUtils", "startMyWatchFace onResponse supportMyWatchFace：", strF);
        if ("1".equals(strF)) {
            a(WatchFaceType.ALBUM.value());
        } else if ("0".equals(strF) || "2".equals(strF)) {
            qpx.e(BaseApplication.getContext(), com.huawei.ui.homewear21.R.string.IDS_device_not_support_my_watch_face_deeplink);
        } else {
            LogUtil.a("WearHomeUtils", "startMyWatchFace fail");
        }
    }

    private static void a(int i) {
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        if (watchFaceApi == null) {
            ReleaseLogUtil.d("R_WearHomeUtils", "startMyWatchFaceH5 watchFaceApi is null");
        } else {
            watchFaceApi.openWatchFaceDetail(i, new IBaseResponseCallback() { // from class: tqp.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
                        H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
                        mgu.a("e3");
                    }
                }
            });
        }
    }

    public static void a(int i, String str) {
        SharedPreferenceManager.b(Integer.toString(10008), "watchface_" + i + BTDeviceMgrUtil.c().e(str));
    }

    public static boolean j() {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null) {
            LogUtil.j("WearHomeUtils", "isSupportCallPhone packageManager is null");
            return true;
        }
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.telephony");
        LogUtil.a("WearHomeUtils", "isSupportCallPhone isSupportCallPhone:", Boolean.valueOf(zHasSystemFeature));
        return zHasSystemFeature;
    }

    public static String c(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceIdType() == 1) {
            return eeq.d(deviceInfo.getUuid());
        }
        if (deviceInfo.getDeviceIdType() == 10) {
            return deviceInfo.getUuid();
        }
        return eeq.d(deviceInfo.getUuid());
    }

    public static boolean i() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains("nubia");
    }

    public static void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("WearHomeUtils", "device info is enpty");
            return;
        }
        boolean zC = rdp.c();
        Boolean boolValueOf = Boolean.valueOf(zC);
        boolValueOf.getClass();
        if (!zC) {
            LogUtil.a("WearHomeUtils", "downloadPluginBackground needDownload is ", boolValueOf);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("PluginHiAiEngine");
        AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), arrayList, true, true);
        j(deviceInfo);
    }

    private static void j(DeviceInfo deviceInfo) {
        long j;
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("downloadHiAiPlugin");
        if (TextUtils.isEmpty(strC) || !"voiceAssistant".equals(strC)) {
            LogUtil.a("WearHomeUtils", "showDownloadToast showFlag is ", strC);
            return;
        }
        String str = "keyToastShowTime" + erh.d(deviceInfo.getDeviceIdentify());
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str);
        if (TextUtils.isEmpty(strE)) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(strE);
            } catch (NumberFormatException e2) {
                LogUtil.e("WearHomeUtils", "showDownloadToast NumberFormatException:", ExceptionUtils.c(e2));
                j = 0;
            }
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        LogUtil.a("WearHomeUtils", "showDownloadToast spanTime is ", Long.valueOf(jCurrentTimeMillis));
        if (TextUtils.isEmpty(strC) || jCurrentTimeMillis <= k.b.m) {
            return;
        }
        qpx.b(BaseApplication.getContext(), com.huawei.ui.homewear21.R.string.IDS_hi_ai_plugin_download_tips);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str, String.valueOf(System.currentTimeMillis()), null);
    }

    public static boolean h() {
        boolean z = Utils.o() && !OperationUtils.isOperation(LoginInit.getInstance(f49538b).getAccountInfo(1010));
        LogUtil.a("WearHomeUtils", "isSupportDetectionVersion isUnSupportOperation:", Boolean.valueOf(z), "  SDK_INT = ", Integer.valueOf(Build.VERSION.SDK_INT));
        return !z && Build.VERSION.SDK_INT >= 28;
    }

    public static boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null || Utils.o() || !CommonUtil.bc()) {
            return false;
        }
        boolean zD = eey.d(deviceInfo, 176);
        ReleaseLogUtil.d("R_WearHomeUtils", "isSupportNotificationLive isSupportOperation:", Boolean.valueOf(zD));
        if (!zD) {
            zD = eey.d(deviceInfo, 219);
            ReleaseLogUtil.d("R_WearHomeUtils", "isSupportNotificationLiveLevel isSupportOperation:", Boolean.valueOf(zD));
        }
        return zD && EnvironmentInfo.g();
    }

    public static boolean b(Context context, int i, boolean z) {
        LogUtil.a("WearHomeUtils", "isShowMissSensitiveNotificationDialog productType:", Integer.valueOf(i));
        if (CommonUtil.bg()) {
            LogUtil.a("WearHomeUtils", "isShowMissSensitiveNotificationDialog huawei system");
            return false;
        }
        if (Build.VERSION.SDK_INT <= 31) {
            LogUtil.a("WearHomeUtils", "isShowMissSensitiveNotificationDialog sdk version:", Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        boolean zB = SharedPreferenceManager.b("HEARTBEAT_INFO", "companion_device_manager_flag", false);
        LogUtil.a("WearHomeUtils", "isShowMissSensitiveNotificationDialog companionDeviceFlag :", Boolean.valueOf(zB));
        if (lsg.d(context.getApplicationContext(), e) && zB) {
            LogUtil.a("WearHomeUtils", "isShowMissSensitiveNotificationDialog has Sensitive Permission");
            return false;
        }
        if (i == 75) {
            LogUtil.a("WearHomeUtils", "isShowMissSensitiveNotificationDialog deviceInfo is blot");
            return false;
        }
        if (z || a("wear_sensitive_notification_time", 30)) {
            return true;
        }
        ReleaseLogUtil.d("R_WearHomeUtils", "isShowMissSensitiveNotificationDialog isTimeExpired:false");
        return false;
    }

    public static boolean d(Context context, int i, boolean z) {
        LogUtil.a("WearHomeUtils", "isShowMessageNotificationDialog productType:", Integer.valueOf(i));
        if (CommonUtil.bg()) {
            LogUtil.a("WearHomeUtils", "isShowMessageNotificationDialog huawei system");
            return false;
        }
        if (Build.VERSION.SDK_INT < 35) {
            LogUtil.a("WearHomeUtils", "isShowMessageNotificationDialog sdk version:", Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        boolean zB = SharedPreferenceManager.b("HEARTBEAT_INFO", "companion_device_manager_flag", false);
        LogUtil.a("WearHomeUtils", "isShowMessageNotificationDialog companionDeviceFlag :", Boolean.valueOf(zB));
        if (lsg.d(context.getApplicationContext(), e) && zB) {
            LogUtil.a("WearHomeUtils", "isShowMessageNotificationDialog has Sensitive Permission");
            return false;
        }
        if (i == 75) {
            LogUtil.a("WearHomeUtils", "isShowMessageNotificationDialog deviceInfo is blot");
            return false;
        }
        if (z || a("wear_sensitive_notification_time", 30)) {
            return true;
        }
        ReleaseLogUtil.d("R_WearHomeUtils", "isShowMessageNotificationDialog isTimeExpired:false");
        return false;
    }

    public static void e(String str, Intent intent) {
        LogUtil.a("WearHomeUtils", "enter startObservingDevicePresence :", CommonUtil.n(str));
        if (Build.VERSION.SDK_INT < 31) {
            LogUtil.a("WearHomeUtils", "enter startObservingDevicePresence return");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                DeviceInfo deviceInfoE = e();
                if (deviceInfoE != null) {
                    str = deviceInfoE.getDeviceIdentify();
                    LogUtil.a("WearHomeUtils", " startObservingDevicePresence usedDevice:", CommonUtil.n(str));
                } else {
                    LogUtil.a("WearHomeUtils", "recentlyUsedDevice is null");
                }
            }
            if (!TextUtils.isEmpty(str)) {
                BluetoothAdapter.getDefaultAdapter();
                if (BluetoothAdapter.checkBluetoothAddress(str)) {
                    rdp.d("WearHomeUtils", str, intent);
                    SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
                    ReleaseLogUtil.d("R_WearHomeUtils", "startObservingDevicePresence：", CommonUtil.n(str));
                    return;
                }
            }
            ReleaseLogUtil.d("R_WearHomeUtils", "startObservingDevicePresence deviceMac is empty");
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("WearHomeUtils_CompanionDeviceManager", "startObservingDevicePresence deviceMac is empty");
        } catch (Exception e2) {
            LogUtil.e("WearHomeUtils", "startObservingDevicePresence exception:", CommonUtil.n(str));
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("WearHomeUtils_CompanionDeviceManager", e2.getMessage());
        }
    }

    public static DeviceInfo e() {
        List<DeviceInfo> listK = tfn.a().k();
        if (!CollectionUtils.a(listK)) {
            Collections.sort(listK, new Comparator<DeviceInfo>() { // from class: tqp.5
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
                    return deviceInfo.getLastConnectedTime() >= deviceInfo2.getLastConnectedTime() ? -1 : 1;
                }
            });
            return listK.get(0);
        }
        LogUtil.a("WearHomeUtils", "startObservingDevicePresence deviceList is empty");
        return null;
    }

    public static boolean f(Context context) {
        return g() || e(context, false);
    }

    public static boolean e(Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 35) {
            LogUtil.a("WearHomeUtils", "isShowReopenNotificationTip sdk version:", Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!lsg.d(context.getApplicationContext(), e)) {
            LogUtil.a("WearHomeUtils", "isShowReopenNotificationTip not Sensitive Permission");
            return false;
        }
        if (!mir.a()) {
            LogUtil.a("WearHomeUtils", "isShowReopenNotificationTip NotificationAuthorizeEnabled false");
            return false;
        }
        String strB = SharedPreferenceManager.b("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", "");
        LogUtil.a("WearHomeUtils", "isShowReopenNotificationTip sensitivePermissionStatus:", strB);
        if (!SensitivePermissionStatus.RESTART.getValue().equals(strB)) {
            return false;
        }
        if (z || a("wear_reopen_notification_time", 30)) {
            return true;
        }
        ReleaseLogUtil.d("R_WearHomeUtils", "isShowReopenNotificationTip isTimeExpired:false");
        return false;
    }

    public static boolean g() {
        if (!a("reopen_notifications_by_service_exe_time", 30)) {
            LogUtil.a("WearHomeUtils", "NotificationPushListener is not TimeExpired:");
            return false;
        }
        boolean zAg = CommonUtil.ag(com.huawei.haf.application.BaseApplication.b());
        LogUtil.a("WearHomeUtils", "NotificationPushListener is running:", Boolean.valueOf(zAg));
        return !zAg;
    }

    public static void e(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setClassName(activity, "com.huawei.ui.homehealth.devicearkui.ArkuiDeviceActivity");
        intent.putExtra("device_id", str);
        iov.d(activity, intent);
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
            intent.setFlags(67108864);
            intent.putExtra(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME_TAB_DEVICE);
            intent.putExtra("SHORTCUT", "SC_DEVICE");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("WearHomeUtils", "ActivityNotFoundException e：", e2.getMessage());
        }
    }

    public static void c(final String str, final JumpToPageCallback jumpToPageCallback) {
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            if (jumpToPageCallback != null) {
                jumpToPageCallback.onFail("Activity is null ");
                return;
            }
            return;
        }
        final DeviceInfo deviceInfoC = mgg.c(str, "WearHomeUtils");
        if (deviceInfoC != null) {
            activity.runOnUiThread(new Runnable() { // from class: tqt
                @Override // java.lang.Runnable
                public final void run() {
                    tqp.b(str, deviceInfoC, activity, jumpToPageCallback);
                }
            });
        } else if (jumpToPageCallback != null) {
            jumpToPageCallback.onFail("device info is null");
        }
    }

    static /* synthetic */ void b(String str, final DeviceInfo deviceInfo, Activity activity, JumpToPageCallback jumpToPageCallback) {
        final Intent intent = new Intent();
        intent.putExtra("device_id", str);
        boolean zD = eey.d(deviceInfo, 108);
        boolean zD2 = eey.d(deviceInfo, 58);
        LogUtil.e("WearHomeUtils", "isSupportDetect：", Boolean.valueOf(zD2), " ,isSupportUpgrade：", Boolean.valueOf(zD));
        if (zD2 || zD) {
            final boolean z = zD2 || (zD && Utils.k());
            intent.putExtra("moduleName", "PluginWearAbility");
            LogUtil.e("WearHomeUtils", "isSupportUpdate：", Boolean.valueOf(z));
            dad.c().launchActivity(activity, intent, new AppBundleLauncher.InstallCallback() { // from class: tqp.4
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent2) {
                    HwOtaUpgradeManager.d().c(deviceInfo.getDeviceUdid(), (InitCallback) null);
                    if (z) {
                        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
                    } else {
                        intent.putExtra("UNIQUE_ID", deviceInfo.getDeviceUdid());
                        intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginWearAbility_A_0);
                    }
                    ohf.e().b("PluginWearAbility");
                    LogUtil.a("WearHomeUtils", "PluginWearOtaProxy launchActivity call");
                    iov.d(BaseApplication.getContext(), intent);
                    return false;
                }

                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public void onFailed(Context context, Intent intent2) {
                    super.onFailed(context, intent2);
                    LogUtil.e("WearHomeUtils", "versionUpgrade onFailed");
                }
            });
            if (jumpToPageCallback != null) {
                jumpToPageCallback.onSuccess();
                return;
            }
            return;
        }
        LogUtil.e("WearHomeUtils", "versionUpgrade -> UpdateVersionActivity");
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
        iov.d(BaseApplication.getContext(), intent);
        if (jumpToPageCallback != null) {
            jumpToPageCallback.onSuccess();
        }
    }

    public static void b(Context context, final DeviceInfo deviceInfo) {
        f49538b = context;
        o();
        GRSManager.c(f49538b).d("helpCustomerUrl", new GrsQueryCallback() { // from class: tqp.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    tqp.d(str, deviceInfo);
                } else {
                    LogUtil.j("WearHomeUtils", "obtainTipsUrlDomain urlDomain is empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("WearHomeUtils", "obtainTipsUrlDomain onCallBackFail");
            }
        });
    }

    private static void o() {
        if (CommonUtil.bu() && LoginInit.getInstance(f49538b).getIsLogined() && !i() && !lli.e().b() && !lli.e().f()) {
            LogUtil.a("WearHomeUtils", "enter initFeedbackSdk");
            lli.e().b(false, null);
        } else {
            LogUtil.j("WearHomeUtils", "initData , phoneservicesdk is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, DeviceInfo deviceInfo) {
        String str2;
        int i;
        String helpCustomerUrl = HelpCustomerOperate.getHelpCustomerUrl(str, "#/help?cid=11069");
        if (!i(deviceInfo)) {
            str2 = "&isDevice=1";
        } else {
            boolean zD = eey.d(deviceInfo, 62);
            ReleaseLogUtil.d("R_WearHomeUtils", "startWebViewActivity isEnhanceMode: ", Boolean.valueOf(zD));
            str2 = "&isDevice=1&unitId=" + deviceInfo.getDeviceIdentify() + "&isEnhancementMode=" + zD;
        }
        String str3 = helpCustomerUrl + str2;
        ReleaseLogUtil.d("R_WearHomeUtils", "startWebViewActivity isSupport: ", Boolean.valueOf(i(deviceInfo)));
        try {
            Activity activity = BaseApplication.getActivity();
            if (activity == null) {
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            boolean zIsShowOnlineEntry = OnlineImUtil.isShowOnlineEntry();
            intent.putExtra("url", str3);
            Context context = f49538b;
            if (zIsShowOnlineEntry) {
                i = com.huawei.ui.main.R.string.IDS_hw_personal_cetenr_help_customer_service;
            } else {
                i = com.huawei.ui.main.R.string.IDS_hwh_health_vo2max_help;
            }
            intent.putExtra("title", context.getString(i));
            intent.putExtra("deviceId", deviceInfo.getDeviceIdentify());
            iov.d(BaseApplication.getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeUtils", "startWebViewActivity ActivityNotFoundException");
        }
    }

    private static boolean i(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        LogUtil.a("WearHomeUtils", "isHonorDevice: ", Boolean.valueOf(eei.d(deviceInfo)));
        if (eei.d(deviceInfo)) {
            return false;
        }
        int versionType = deviceInfo.getVersionType();
        ReleaseLogUtil.d("R_WearHomeUtils", "Device version type is ", Integer.valueOf(versionType));
        boolean z = versionType == 0;
        boolean zH = Utils.h();
        boolean zC = lli.c();
        boolean zO = Utils.o();
        boolean z2 = (!z || i() || mjh.k(deviceInfo.getDeviceIdentify())) ? false : true;
        boolean z3 = (zO || !z2 || lli.a()) ? false : true;
        boolean z4 = zO && z2 && zC && zH;
        ReleaseLogUtil.d("R_WearHomeUtils", "isAllowLogin: ", Boolean.valueOf(zH), ", isOpen: ", Boolean.valueOf(zC), ", isOverSea: ", Boolean.valueOf(zO));
        return z3 || z4;
    }

    public static void b(DeviceInfo deviceInfo, DevicePopTipBiUtil.Content content, DevicePopTipBiUtil.Action action, DevicePopTipBiUtil.Event event) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_WearHomeUtils", "reportWechatTipBiEvent mCurrentDeviceInfo is null");
            return;
        }
        DevicePopTipBiUtil.TipType tipType = DevicePopTipBiUtil.TipType.TIP;
        String deviceName = deviceInfo.getDeviceName();
        int productType = deviceInfo.getProductType();
        DevicePopTipBiUtil.a(tipType, content, action, deviceName, String.valueOf(productType), deviceInfo.getHiLinkDeviceId(), DevicePopTipBiUtil.Page.DEVICE_DETAIL, event);
    }

    public static boolean b(int i) {
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(BaseApplication.getContext());
        String strB = rdi.c().b();
        LogUtil.a("WearHomeUtils", "deviceProductType:", Integer.valueOf(i));
        if (i == 32) {
            return notificationPushInteractor.a(strB);
        }
        return notificationPushInteractor.b() && notificationPushInteractor.e();
    }

    public static String c(edl edlVar) {
        String strAm = edlVar.i().am();
        return TextUtils.isEmpty(strAm) ? "ZAAA" : strAm;
    }

    public static ViewGroup.LayoutParams d(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        DisplayMetrics displayMetrics = BaseApplication.getContext().getResources().getDisplayMetrics();
        float f = (displayMetrics.widthPixels / displayMetrics.density) / 360.0f;
        int i3 = (int) (i * f);
        LogUtil.a("WearHomeUtils", "computeImageViewSize imageViewWidth:", Integer.valueOf(i3));
        int i4 = (int) (i3 * displayMetrics.density);
        int i5 = (int) (((int) (i2 * f)) * displayMetrics.density);
        layoutParams.width = i4;
        layoutParams.height = i5;
        return layoutParams;
    }

    public static void d(Context context, DeviceInfo deviceInfo) {
        if (Utils.o()) {
            LogUtil.a("WearHomeUtils", "Oversea not down.");
            return;
        }
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        if (indexList == null || indexList.size() == 0) {
            LogUtil.j("WearHomeUtils", " startDownloadIndex indexList is null");
            ThreadPoolManager.c().a("WearHomeUtils", new Runnable() { // from class: tqs
                @Override // java.lang.Runnable
                public final void run() {
                    tqp.n();
                }
            });
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("WearHomeUtils", " nowTime : ", Long.valueOf(jCurrentTimeMillis));
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "download_plugin_source");
        LogUtil.a("WearHomeUtils", " lastDownloadTime : ", strE);
        if (jCurrentTimeMillis - CommonUtils.i(strE) < 86400000) {
            LogUtil.a("WearHomeUtils", "The interval was less than one days");
            g(deviceInfo);
        } else {
            LogUtil.a("WearHomeUtils", "The interval was longer than one days");
            LogUtil.a("WearHomeUtils", "The interval was more than one days");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "download_plugin_source", String.valueOf(jCurrentTimeMillis), null);
            l();
        }
    }

    static /* synthetic */ void n() {
        LogUtil.a("WearHomeUtils", " startDownloadIndex indexList");
        l();
    }

    private static void l() {
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByDeviceType("SMART_ALL");
    }

    private static void g(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            deviceInfo = mgg.c("WearHomeUtils");
        }
        if (deviceInfo != null) {
            String strD = lvi.d(deviceInfo.getProductType());
            LogUtil.a("WearHomeUtils", "download uuid：", strD);
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strD)) {
                return;
            }
            LogUtil.a("WearHomeUtils", "downloadCurrentDeviceResource downloadIndexByUuidList");
            ArrayList arrayList = new ArrayList();
            arrayList.add(strD);
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(arrayList, null);
        }
    }
}
