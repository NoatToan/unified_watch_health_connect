package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.activity.update.UpdateVersionActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import com.huawei.ui.homehealth.syncwifi.WifiConnectReceiver;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import com.huawei.ui.main.stories.userprofile.activity.WorkModeConflictDialogActivity;
import com.huawei.watchface.WatchFaceApi;
import com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes17.dex */
public class rtk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, Integer> f47637c = new HashMap<>(16);
    private static boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f47636b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f47635a = new HashMap<String, String>() { // from class: rtk.4
        {
            put("41bfc883-69f1-494e-8f6a-8e545202565c", "com.huawei.health.h5.matter");
        }
    };

    public static void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "registerNonLocalBroadcastReceiver nonLocalBroadcastReceiver == null");
            return;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        intentFilter.addAction("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_UPGRADING");
        intentFilter.addAction("action_ota_check_new_version_state");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        intentFilter.addAction("broadcast_receiver_user_setting");
        intentFilter.addAction("com.huawei.bone.action.UI_DEVICE_LIST_CHANGED");
        intentFilter.addAction("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
        BroadcastManagerUtil.c(BaseApplication.getContext(), broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static void e(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "registerBatteryBroadcast deviceBatteryOrRemainingTimeReceiver == null");
            return;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter registerBatteryBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.REMAINING_TIME");
        BroadcastManagerUtil.c(BaseApplication.getContext(), broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static void d(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "registerEarphonePairBroadcast BroadcastReceiver == null");
            return;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter registerEarphonePairBroadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.pair_earphone");
        BroadcastManagerUtil.d(BaseApplication.getContext(), broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static void b(BroadcastReceiver broadcastReceiver, BroadcastReceiver broadcastReceiver2) {
        if (broadcastReceiver == null || broadcastReceiver2 == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "registerWatchfaceBroadcastReceiver BroadcastReceiver == null");
            return;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter registerWatchfaceBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PrivacyStatementActivity.ACTION_WATCHFACE_SERVICE_DISABLE);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(broadcastReceiver, intentFilter);
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SIM_STATE_CHANGED");
        BaseApplication.getContext().registerReceiver(broadcastReceiver2, intentFilter2);
    }

    public static void d(final Context context, BroadcastReceiver broadcastReceiver, final boolean z) {
        if (context == null || broadcastReceiver == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "registerLoginStatusReceiver Parameters is null");
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: rtk.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zHasLoginAccount;
                if (CommonUtil.z(context)) {
                    String logoutFlag = ThirdLoginDataStorageUtil.getLogoutFlag();
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "registerLoginStatusReceiver logoutFlag ", logoutFlag);
                    zHasLoginAccount = "false".equals(logoutFlag);
                } else {
                    zHasLoginAccount = HuaweiLoginManager.hasLoginAccount(context);
                }
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "registerLoginStatusReceiver isLogin ", Boolean.valueOf(zHasLoginAccount));
                if (zHasLoginAccount) {
                    rtk.e(z);
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        BroadcastManagerUtil.d(BaseApplication.getContext(), broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static void l() {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter registerWifiConnectedReceiver.");
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("saved_support_sync_wifi");
        if (tfi.n(BaseApplication.getContext()) && "1".equals(strC)) {
            WifiConnectReceiver.e().b();
        } else {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "not have location permissions or not support sync wifi");
        }
    }

    public static void b(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "unRegisterNonLocalBroadcastReceiver nonLocalBroadcastReceiver == null");
            return;
        }
        try {
            BaseApplication.getContext().unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "unRegisterNonLocalBroadcastReceiver Exception: ", ExceptionUtils.c(e));
        }
    }

    public static void c(BroadcastReceiver broadcastReceiver, BroadcastReceiver broadcastReceiver2) {
        if (broadcastReceiver == null || broadcastReceiver2 == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "unRegisterWatchfaceBroadcastReceiver BroadcastReceiver == null");
            return;
        }
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
            BaseApplication.getContext().unregisterReceiver(broadcastReceiver2);
        } catch (IllegalArgumentException unused) {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "unRegisterWatchfaceBroadcastReceiver Exception");
        }
    }

    public static void c(ExecutorService executorService) {
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: rtk.1
                @Override // java.lang.Runnable
                public void run() {
                    DeviceCapability deviceCapabilityC = eej.c();
                    DeviceInfo deviceInfoJ = tfn.a().j();
                    if (deviceCapabilityC != null && deviceCapabilityC.isSupportWatchFace() && deviceInfoJ != null && (deviceInfoJ.getPowerSaveModel() != 1 || !tqp.e(deviceInfoJ.getProductType()))) {
                        if (!DevicePairGuideActivity.f24605c || CommonUtil.bg()) {
                            tqp.g(BaseApplication.getContext());
                        } else {
                            LogUtil.a("CardDeviceFragment CardDeviceUtil", "initDeviceState, is first addDevice");
                        }
                    }
                    if (deviceCapabilityC != null && deviceCapabilityC.isSupportMenstrual()) {
                        rtk.c(deviceInfoJ);
                    }
                    if (deviceCapabilityC == null || !deviceCapabilityC.isMessageAlert()) {
                        return;
                    }
                    rtk.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(DeviceInfo deviceInfo) {
        new miq().e(new IBaseResponseCallback() { // from class: rtk.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "queryMenstrualSwitch errorCode:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof MenstrualSwitchStatus)) {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "device connected sendMenstrualSwitchInMain");
                    sox.d().a((MenstrualSwitchStatus) obj);
                }
            }
        });
        sox.d().c(deviceInfo);
    }

    public static void d() {
        ReleaseLogUtil.d("CardDeviceFragment CardDeviceUtil", "Overwrite Installation open default app");
        int i = Integer.parseInt("1");
        for (String str : cio.e) {
            String switchSettingFromLocal = mhs.a().getSwitchSettingFromLocal(str, 10001);
            ReleaseLogUtil.d("CardDeviceFragment CardDeviceUtil", "getSwitchSettingFromLocal packageName: ", str, ", value: ", switchSettingFromLocal);
            if (TextUtils.isEmpty(switchSettingFromLocal)) {
                lzi.a().d(str, i);
            }
        }
    }

    public static void g() {
        List<DeviceInfo> listG;
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        boolean zC = SharedPreferenceManager.c(BaseApplication.getContext(), accountInfo);
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "isHonorSpecifiedDeviceAndPrivacyIsAgree isAgree:", Boolean.valueOf(zC));
        if (zC || !b(BaseApplication.getContext(), accountInfo) || !etn.d(BaseApplication.getContext()) || (listG = dxx.d().g()) == null || listG.isEmpty()) {
            return;
        }
        for (int i = 0; i < listG.size(); i++) {
            DeviceInfo deviceInfo = listG.get(i);
            if (deviceInfo != null && eei.d(deviceInfo)) {
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(deviceInfo.getDeviceIdentify());
                rcv.a(BaseApplication.getContext()).b((List<String>) arrayList, true);
            }
        }
    }

    private static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "HONOR_NOT_CLOUD_USE_ID_KEY";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "APP_UPLOAD_NATIVE_KEY");
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "APP_UPLOAD_NATIVE_KEY", str, new StorageParams(1));
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "nativeKey is empty");
            return false;
        }
        if (strE != null && strE.equals(str)) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "nativeKey equals tempUserId");
            return false;
        }
        SharedPreferenceManager.e(context, String.valueOf(10000), "APP_UPLOAD_NATIVE_KEY", str, new StorageParams(1));
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "isDeleteHonorDevice");
        return true;
    }

    public static boolean f() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_cancel_times");
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "updateLayout countShowTimes number ", strE);
        return TextUtils.isEmpty(strE) || CommonUtil.b(strE, 10) < 2;
    }

    public static boolean k() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_check_time");
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "updateLayout isEnableDialog lastTime ", strE);
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        long jI = CommonUtil.i(strE);
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "updateLayout isEnableDialog NowTime ", Long.valueOf(System.currentTimeMillis()));
        return Math.abs(System.currentTimeMillis() - jI) > 86400000;
    }

    public static boolean h() {
        ArrayList arrayList = new ArrayList(10);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "CardDeviceFragment CardDeviceUtil");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if ("main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType())) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() > 0) {
            if (arrayList.size() == 1) {
                DeviceInfo deviceInfo2 = (DeviceInfo) arrayList.get(0);
                if (eel.d(deviceInfo2.getProductType(), deviceInfo2.getAutoDetectSwitchStatus())) {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "isHas aw70 run work mode return true");
                    return true;
                }
            }
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "one wear device return false");
            return false;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "connectDeviceList is zero return true");
        return true;
    }

    public static void m() {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_check_time", System.currentTimeMillis() + "", new StorageParams(0));
        rdt.c("1");
    }

    public static void r() {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_check_time", System.currentTimeMillis() + "", new StorageParams(0));
        StorageParams storageParams = new StorageParams(0);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_cancel_times");
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "updateLayout setDialogShowTime,number ", strE);
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_cancel_times", "1", storageParams);
        } else {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "sp_update_cancel_times", String.valueOf(CommonUtil.b(strE, 10) + 1), storageParams);
        }
    }

    public static void e(Context context) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(BaseApplication.getContext().getResources().getString(R.string.IDS_device_fragment_connect_device)).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: rtk.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("CardDeviceFragment CardDeviceUtil", "showDisConnectedDialog,click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void e(final Context context, final Activity activity, ExecutorService executorService) {
        if (context == null || activity == null || executorService == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: rtk.8
            @Override // java.lang.Runnable
            public void run() {
                final DeviceInfo deviceInfoC = mgg.c("CardDeviceFragment CardDeviceUtil");
                if (deviceInfoC == null) {
                    LogUtil.j("CardDeviceFragment CardDeviceUtil", "startDeviceUpdate deviceInfo is null");
                } else {
                    activity.runOnUiThread(new Runnable() { // from class: rtk.8.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Intent intent = new Intent();
                            intent.setClass(context, UpdateVersionActivity.class);
                            intent.putExtra("device_id", deviceInfoC.getDeviceIdentify());
                            rtk.d(context, intent, "UpdateVersionActivity");
                        }
                    });
                }
            }
        });
    }

    public static boolean a() {
        if (maq.b().f()) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "wear device is OTAing");
            return true;
        }
        LogUtil.j("CardDeviceFragment CardDeviceUtil", "no OTAing");
        return false;
    }

    public static GridLayoutManager c(List<RecommendedItem> list) {
        if (list == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "recommendedLists == null");
            return a(2);
        }
        if (qrs.af(BaseApplication.getContext())) {
            if (list.size() == 1) {
                return a(1);
            }
            if (list.size() == 2) {
                return a(2);
            }
            if (list.size() == 3) {
                return a(3);
            }
            if (list.size() == 4) {
                return a(4);
            }
            return a(5);
        }
        if (list.size() == 1) {
            return a(1);
        }
        return a(2);
    }

    public static GridLayoutManager a(final int i) {
        final Context context = BaseApplication.getContext();
        final int i2 = 1;
        final boolean z = false;
        return new GridLayoutManager(context, i, i2, z) { // from class: com.huawei.ui.homehealth.device.util.CardDeviceUtil$7
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
    }

    public static LinearLayoutManager e() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager.setOrientation(0);
        return linearLayoutManager;
    }

    public static void e(Context context, String str) {
        if (context == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "context == null");
            return;
        }
        rdt.i();
        if (WalletAppManager.getInstance().isOverseaService()) {
            WalletAppManager.getInstance().startNfcWalletH5();
        } else {
            tqp.b(context);
            tqp.d(context, str);
        }
    }

    public static void b(Activity activity) {
        if (activity == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "activity == null");
        } else {
            new tfv(activity, "com.huawei.health.MainActivity").c(-1);
            HwWatchFaceUtil.d().a(1);
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "startWebViewActivity context == null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str));
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        intent.putExtra("uniqueId", str2);
        if (elhVarD != null) {
            if (elhVarD.l() != null) {
                intent.putExtra("name", elo.a(str, elhVarD.l().d()));
            }
            if (elhVarD.m() != null) {
                intent.putExtra("deviceType", elhVarD.m().name());
            }
            if (elhVarD.v() != null) {
                intent.putExtra(Constants.KEY_BLE_SCAN_MODE, elhVarD.v().c());
            }
        }
        intent.putExtra("bleIntroductionType", str3);
        d(context, intent, "com.huawei.operation.activity.WebViewActivity");
    }

    public static void d(Context context, dxy dxyVar) {
        if (context == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "openWearHome context == null");
            return;
        }
        String strJ = lvi.j(dxyVar.g());
        String str = f47635a.get(strJ);
        if (str != null) {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "Enter openNativeWearHome ");
            e(context, dxyVar, strJ, str);
        } else {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "Enter openNativeWearHome ");
            a(context, dxyVar.d());
        }
    }

    private static void e(Context context, dxy dxyVar, String str, String str2) {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeArg(MatterDataContans.KEY_MAC_ADDRESS, dxyVar.d());
        builder.addCustomizeArg(BleConstants.BLUETOOTH_NAME, dxyVar.i());
        if ("41bfc883-69f1-494e-8f6a-8e545202565c".equals(str)) {
            builder.addCustomizeArg("pin", "");
            builder.addCustomizeArg("jumpPage", "home");
        }
        ddv.b().loadH5ProApp(context, str2, builder);
    }

    private static void a(Context context, String str) {
        if (maq.b().c(str) == 6) {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "wear device is OTAing");
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
            intent.putExtra("device_id", str);
            d(context, intent, "UpdateVersionActivity");
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(10099), "key_ui_nps_enter_wear_home", "true", null);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent2.putExtra("device_id", str);
        intent2.putExtra("FROM_APP_HOME_PAGE_TYPE", true);
        d(context, intent2, "com.huawei.ui.homewear21.home.WearHomeActivity");
        tqp.e(context);
    }

    public static void c(Context context, dxy dxyVar, boolean z) {
        if (context == null || dxyVar == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "jumpToNoConnectActivity deviceInfoForWear == null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        intent.putExtra("is_cloud_device", dxyVar.h());
        intent.putExtra("device_name", dxyVar.i());
        intent.putExtra("device_identify", dxyVar.d());
        intent.putExtra("device_picID", dxyVar.o());
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, dxyVar.g());
        intent.putExtra("device_only_one", z);
        d(context, intent, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        tqp.e(context);
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "onclick wear not connected name:", dxyVar.i(), "device_type :", Integer.valueOf(dxyVar.g()));
    }

    public static void d(Context context, int i) {
        DeviceInfo next;
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "gotoConflictDialogActivity enter");
        if (context == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "gotoConflictDialogActivity context is null");
            return;
        }
        List<DeviceInfo> listG = dxx.d().g();
        if (listG == null) {
            next = null;
            break;
        }
        Iterator<DeviceInfo> it = listG.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getDeviceConnectState() == 2) {
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "gotoConflictDialogActivity find connected device");
                break;
            }
        }
        if (next == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "gotoConflictDialogActivity connectedDevice is null");
            return;
        }
        String str = String.format(Locale.ENGLISH, context.getString(R.string.IDS_work_mode_conflict_dialog_content), d(next.getProductType()), d(i));
        Intent intent = new Intent();
        intent.putExtra("content", str);
        intent.setClass(context, WorkModeConflictDialogActivity.class);
        d(context, intent, "WorkModeConflictDialogActivity");
    }

    private static String d(int i) {
        DeviceInfo deviceInfoE = dxx.d().e();
        if (deviceInfoE == null) {
            return com.huawei.hms.hihealth.data.DeviceInfo.STR_TYPE_UNKNOWN;
        }
        String strI = "PORSCHE DESIGN";
        if ((TextUtils.isEmpty(deviceInfoE.getDeviceName()) || !TextUtils.equals(deviceInfoE.getDeviceName(), "PORSCHE DESIGN")) && (TextUtils.isEmpty(deviceInfoE.getDeviceModel()) || !TextUtils.equals(deviceInfoE.getDeviceModel(), "PORSCHE DESIGN"))) {
            strI = lvi.a(i).i();
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "transDeviceProductTypeIntToStr: mDeviceProductType = ", strI);
        return strI;
    }

    public static void a(dxy dxyVar, List<DeviceInfo> list) {
        if (dxyVar == null || list == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "handleDeviceState deviceInfoForWear == null");
            return;
        }
        if (eel.d(dxyVar.g())) {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "handleWorkMode goingReConnected == AW70");
            for (DeviceInfo deviceInfo : list) {
                if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "Reconnected AW70 set device enable");
                    deviceInfo.setDeviceActiveState(1);
                    deviceInfo.setDeviceConnectState(1);
                } else if (eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "Connected AW70 target device disable");
                    deviceInfo.setDeviceActiveState(0);
                    deviceInfo.setDeviceConnectState(3);
                } else {
                    LogUtil.j("CardDeviceFragment CardDeviceUtil", "handleDeviceState is other");
                }
            }
            return;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE");
        for (DeviceInfo deviceInfo2 : list) {
            if (dxyVar.d().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "handleWorkMode set device enable");
                deviceInfo2.setDeviceActiveState(1);
                deviceInfo2.setDeviceConnectState(1);
            }
            if (!dxyVar.d().equalsIgnoreCase(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getAutoDetectSwitchStatus() != 1 && !rdp.d(dxyVar.g()) && deviceInfo2.getDeviceActiveState() == 1) {
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "handleWorkMode target device disable");
                deviceInfo2.setDeviceActiveState(0);
                deviceInfo2.setDeviceConnectState(3);
            }
        }
        dxx.d().j();
    }

    public static void e(Context context, int i) {
        if (context == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "showTipDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(i)).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: rtk.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("CardDeviceFragment CardDeviceUtil", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void a(List<dru> list, dru druVar) {
        if (list == null || druVar == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "productInfoListAdd connectedList == null");
            return;
        }
        if (!list.isEmpty()) {
            Object objI = list.get(0).i();
            if (objI instanceof dxy) {
                if (((dxy) objI).b() == 2) {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "add to normal");
                    e(list, druVar);
                    return;
                } else {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "add to first");
                    list.add(0, druVar);
                    return;
                }
            }
            return;
        }
        list.add(druVar);
    }

    private static void e(List<dru> list, dru druVar) {
        if (list.size() > 1) {
            list.add(1, druVar);
        } else {
            list.add(druVar);
        }
    }

    public static void b(ExecutorService executorService) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "isMultipleDevices");
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: rtk.9
                @Override // java.lang.Runnable
                public void run() {
                    List<DeviceInfo> listG = dxx.d().g();
                    int i = 0;
                    if (listG == null || listG.isEmpty()) {
                        LogUtil.j("CardDeviceFragment CardDeviceUtil", "deviceInfoList wear_device_count 0");
                        SharedPreferenceManager.b(BaseApplication.getContext(), 0);
                        return;
                    }
                    Iterator<DeviceInfo> it = listG.iterator();
                    while (it.hasNext()) {
                        int productType = it.next().getProductType();
                        LogUtil.a("CardDeviceFragment CardDeviceUtil", "deviceGroupInfo type:", Integer.valueOf(productType));
                        if (lvi.l(productType)) {
                            i++;
                        }
                    }
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "isMultipleDevices set wear_device_count:", Integer.valueOf(i));
                    SharedPreferenceManager.b(BaseApplication.getContext(), i);
                }
            });
        }
    }

    public static dru c(DeviceInfo deviceInfo, List<dru> list) {
        dru druVar = null;
        if (deviceInfo == null || njy.e(list)) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "getMainRecommendedGroupInfo deviceInfo == null");
            return null;
        }
        for (dru druVar2 : list) {
            if (druVar2 != null && druVar2.e() == 1 && (druVar2.i() instanceof dxy)) {
                dxy dxyVar = (dxy) druVar2.i();
                if (dxyVar.b() == 2 && TextUtils.equals(deviceInfo.getDeviceIdentify(), dxyVar.d())) {
                    druVar = druVar2;
                }
            }
        }
        return druVar;
    }

    public static void e(Context context, DeviceInfo deviceInfo) {
        if (context == null || deviceInfo == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "gotoAgreementDeclarationActivity deviceInfo == null");
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, AgreementDeclarationActivity.class);
        intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceInfo", deviceInfo);
        intent.putExtras(bundle);
        intent.putExtra("device_country_code", deviceInfo.getCountryCode());
        intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
        d(context, intent, "AgreementDeclarationActivity");
    }

    public static void d(List<RecommendedItem> list) {
        if (list.size() > 0) {
            try {
                StorageParams storageParams = new StorageParams(0);
                SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10038), "SAVE_RECOMMENDED_LIST", new Gson().toJson(list), storageParams);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("CardDeviceFragment CardDeviceUtil", "saveRecommendList JsonSyntaxException");
            }
        }
    }

    public static List<RecommendedItem> b() {
        ArrayList arrayList = new ArrayList(16);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10038), "SAVE_RECOMMENDED_LIST");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", " mResetRecommendedLists json is null");
            return arrayList;
        }
        try {
            List<RecommendedItem> list = (List) new Gson().fromJson(strE, new TypeToken<List<RecommendedItem>>() { // from class: com.huawei.ui.homehealth.device.util.CardDeviceUtil$10
            }.getType());
            if (list != null && list.size() != 0) {
                return list;
            }
            LogUtil.j("CardDeviceFragment CardDeviceUtil", " getRecommendedList() mRecommendedLists is null or list is empty");
            return arrayList;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("CardDeviceFragment CardDeviceUtil", "getRecommendedList JsonSyntaxException");
            return arrayList;
        }
    }

    public static DeviceCapability c(String str) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "serviceCapabilityNegotiation(deviceIdentify)");
        if (eej.a(str) == null) {
            DeviceInfo deviceInfoB = mgi.b(str, "CardDeviceFragment CardDeviceUtil");
            if (deviceInfoB != null && deviceInfoB.getDeviceConnectState() == 2) {
                Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "CardDeviceFragment CardDeviceUtil");
                if (mapD != null && mapD.get(str) != null) {
                    eej.a(str, mapD.get(str));
                    return mapD.get(str);
                }
                LogUtil.j("CardDeviceFragment CardDeviceUtil", "serviceCapabilityNegotiation(deviceIdentify) capability is null");
                return null;
            }
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "serviceCapabilityNegotiation(deviceIdentify) device is not connected");
            return null;
        }
        return eej.a(str);
    }

    public static void e(boolean z) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter automaticReconnectionDevices");
        if (BTDeviceMgrUtil.c().h() != 3) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "automaticReconnectionDevices bluetooth off");
            return;
        }
        if (z) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "automaticReconnectionDevices exist device is connecting");
            return;
        }
        List<DeviceInfo> listG = dxx.d().g();
        if (listG == null || listG.size() <= 0) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "automaticReconnectionDevices return");
            return;
        }
        DeviceInfo deviceInfoD = null;
        boolean z2 = false;
        for (DeviceInfo deviceInfo : listG) {
            if (deviceInfo != null) {
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "deviceInfo: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), " , connectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()), " , activeState: ", Integer.valueOf(deviceInfo.getDeviceActiveState()));
                if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getAutoDetectSwitchStatus() != 1) {
                    LogUtil.a("CardDeviceFragment CardDeviceUtil", "update isHasActivityDevice: ", Boolean.valueOf(z2));
                    z2 = true;
                }
                boolean zB = SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "basic_service_switch", false);
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "isSwitchedBasic: ", Boolean.valueOf(zB));
                deviceInfoD = d(deviceInfoD, deviceInfo, zB);
            }
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "reconnect active brDisableDeviceInfo: ", deviceInfoD, " , !isHasActivityDevice: ", Boolean.valueOf(!z2));
        if (deviceInfoD == null || z2) {
            return;
        }
        deviceInfoD.setDeviceActiveState(1);
        tfn.a().d(listG, deviceInfoD.getDeviceIdentify());
    }

    private static DeviceInfo d(DeviceInfo deviceInfo, DeviceInfo deviceInfo2, boolean z) {
        if (deviceInfo2.getDeviceConnectState() != 3 && deviceInfo2.getDeviceConnectState() != 4) {
            return deviceInfo;
        }
        if (!z) {
            return (deviceInfo2.getDeviceActiveState() == 1 || deviceInfo2.getSupportAccountSwitch() != 1) ? deviceInfo : e(deviceInfo, deviceInfo2);
        }
        if (deviceInfo2.getDeviceActiveState() == 1) {
            return deviceInfo;
        }
        DeviceInfo deviceInfoE = e(deviceInfo, deviceInfo2);
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "basic_service_switch", false);
        return deviceInfoE;
    }

    private static DeviceInfo e(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        if (deviceInfo2 == null) {
            return deviceInfo;
        }
        if (deviceInfo == null) {
            return deviceInfo2;
        }
        if (deviceInfo2.getLastConnectedTime() > deviceInfo.getLastConnectedTime()) {
            deviceInfo = deviceInfo2;
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "getLastAccountDevice deviceName is ", deviceInfo.getDeviceName());
        return deviceInfo;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        rcv.a(BaseApplication.getContext()).b((List<String>) arrayList, true);
    }

    public static void d(DeviceInfo deviceInfo, List<String> list) {
        if (deviceInfo == null || list == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "addPermission deviceInfo is null");
            return;
        }
        String strD = Sha256.d(deviceInfo.getDeviceIdentify(), "SHA-256");
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + strD))) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "showPermissionDialog has shown");
            return;
        }
        DeviceCapability deviceCapabilityC = c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "addPermission deviceCapability == null");
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        if (deviceCapabilityC.isOtaUpdate() || deviceCapabilityC.isWeatherPush()) {
            if (hashSet.add("android.permission.ACCESS_COARSE_LOCATION")) {
                list.add("android.permission.ACCESS_COARSE_LOCATION");
            }
            if (hashSet.add("android.permission.ACCESS_FINE_LOCATION")) {
                list.add("android.permission.ACCESS_FINE_LOCATION");
            }
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "addPermission permissions size ", Integer.valueOf(list.size()));
    }

    public static boolean b(long j, long j2) {
        long jH = ltb.h();
        return jH >= j && jH <= j2;
    }

    public static void d(Context context, int i, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "clickDeviceInboxInfo can not jump");
            return;
        }
        if (i == 1) {
            Intent intent = new Intent();
            intent.setClass(context, WebViewActivity.class);
            intent.putExtra("url", OperationUtils.newPathConcat(str, "from", "5"));
            d(context, intent, "WebViewActivity");
            return;
        }
        if (i != 2) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "clickDeviceInboxInfo error linkType");
            return;
        }
        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(OperationUtils.newPathConcat(str, "from", "5")));
        intent2.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        d(context, intent2, CommonConstant.ACTION.HWID_SCHEME_URL);
    }

    public static Message b(int i) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "createMessage errCode is ", Integer.valueOf(i));
        Message messageObtain = Message.obtain();
        messageObtain.what = 41;
        messageObtain.obj = Integer.valueOf(i);
        return messageObtain;
    }

    public static Message c(int i, int i2) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "createTimeoutMessage deviceStatus = ", Integer.valueOf(i), " deviceType = ", Integer.valueOf(i2));
        Message messageObtain = Message.obtain();
        messageObtain.what = 31;
        messageObtain.arg1 = i;
        messageObtain.arg2 = i2;
        return messageObtain;
    }

    public static Message c(boolean z, dxy dxyVar, int i) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "createTimeoutMessage isCloudDevice = ", Boolean.valueOf(z));
        Message messageObtain = Message.obtain();
        messageObtain.what = 31;
        messageObtain.arg1 = z ? 1 : 0;
        messageObtain.arg2 = i;
        messageObtain.obj = dxyVar;
        return messageObtain;
    }

    public static CustomAlertDialog e(Context context, View view) {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.b(context.getString(R.string.IDS_device_mgr_pair_note_can_not_connect)).a(view).d(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: rtp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "showAlertDialog onclick PositiveButton");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(true);
        customAlertDialogB.show();
        return customAlertDialogB;
    }

    public static RecommendedItem e(int i, dxy dxyVar) {
        RecommendedItem recommendedItem = new RecommendedItem();
        if (dxyVar == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "createRecommendedItem deviceInfoForWear == null");
            return recommendedItem;
        }
        recommendedItem.setDeviceType(dxyVar.g());
        recommendedItem.setMac(nio.c(dxyVar.d()));
        recommendedItem.setId(i);
        return recommendedItem;
    }

    public static void e(Context context, ContentValues contentValues, elh elhVar) {
        if (context == null || contentValues == null || elhVar == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "openDeviceMainActivity context == null");
            return;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("arg1", "DeviceInfoList");
        bundle.putString("productId", elhVar.t());
        bundle.putString("uniqueId", contentValues.getAsString("uniqueId"));
        intent.setPackage(roq.f47547c);
        intent.setClassName(roq.f47547c, "com.huawei.health.device.ui.DeviceMainActivity");
        bundle.putParcelable("commonDeviceInfo", contentValues);
        intent.putExtras(bundle);
        d(context, intent, "com.huawei.health.device.ui.DeviceMainActivity");
    }

    public static void d(Context context, Intent intent, String str) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("CardDeviceFragment CardDeviceUtil", "handleActivityNotFoundException ActivityNotFoundException ", str);
        }
    }

    public static void j() {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "start product map background download");
        if (lql.a(BaseApplication.getContext())) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: rtq
                @Override // java.lang.Runnable
                public final void run() {
                    lql.b(BaseApplication.getContext(), 0);
                }
            });
        }
    }

    public static void a(boolean z) {
        d = z;
    }

    public static void c(boolean z) {
        f47636b = z;
        qun.e(z);
    }

    public static boolean i() {
        return f47636b;
    }

    public static void d(List<dru> list, List<dru> list2, CardDeviceFragment cardDeviceFragment) {
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter setList");
        ArrayList<dxy> arrayListJ = lvl.j();
        int i = 2;
        boolean z = true;
        int i2 = arrayListJ.size() > 1 ? 2 : 1;
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "enter setList displayType：", Integer.valueOf(i2));
        int iA = a(arrayListJ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(16);
        for (dxy dxyVar : arrayListJ) {
            dru druVar = new dru();
            druVar.d(z ? 1 : 0);
            druVar.b(dxyVar.k());
            druVar.c(i2);
            druVar.c(dxyVar);
            if (dxyVar.c() == z && dxyVar.b() == i) {
                c(iA, jCurrentTimeMillis, dxyVar, druVar);
                if (rdp.d(dxyVar.g())) {
                    d = z;
                    arrayList.add(druVar);
                } else {
                    a(list2, druVar);
                    i = 2;
                    z = true;
                }
            } else {
                druVar.d(dxyVar.j());
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear last connected time:", Long.valueOf(dxyVar.j()));
                if (rdp.d(dxyVar.g())) {
                    arrayList.add(druVar);
                } else {
                    list.add(druVar);
                }
                i = 2;
                z = true;
            }
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "has wear deviceInfoForWears : ", arrayListJ.toArray());
        e(list, list2, arrayList, i2, cardDeviceFragment);
    }

    private static void c(int i, long j, dxy dxyVar, dru druVar) {
        if (i > 1) {
            druVar.d(((long) f47637c.get(dxyVar.d()).intValue()) + j);
        } else {
            druVar.d(j);
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "deviceInfoForWear name: ", dxyVar.i(), "deviceInfoForWear current connected time:", Long.valueOf(j), ",compareTime:", Long.valueOf(druVar.c()));
    }

    private static void e(List<dru> list, List<dru> list2, List<dru> list3, int i, CardDeviceFragment cardDeviceFragment) {
        String strSubstring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (dru druVar : list3) {
            if (druVar.i() instanceof dxy) {
                String strI = ((dxy) druVar.i()).i();
                if (!strI.contains(com.huawei.openalliance.ad.constant.Constants.LINK)) {
                    strSubstring = "";
                } else {
                    strSubstring = strI.substring(0, strI.lastIndexOf(com.huawei.openalliance.ad.constant.Constants.LINK));
                }
                if (linkedHashMap.containsKey(strSubstring)) {
                    ((List) linkedHashMap.get(strSubstring)).add(druVar);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(druVar);
                    linkedHashMap.put(strSubstring, arrayList);
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            b(list, list2, i, (Map.Entry<String, List<dru>>) it.next());
        }
        if (d && f47636b) {
            lwt.d().e(new rmf(cardDeviceFragment), "CardDeviceFragment CardDeviceUtil");
        }
    }

    private static void b(List<dru> list, List<dru> list2, int i, Map.Entry<String, List<dru>> entry) {
        dru druVar = new dru();
        List<dru> value = entry.getValue();
        if (njy.b(value)) {
            Collections.sort(value);
            dru druVar2 = value.get(0);
            if (value.size() == 1) {
                druVar = druVar2;
            } else {
                d = false;
                druVar.d(4);
                druVar.c(i);
                druVar.d(druVar2.c());
                druVar.c(entry.getKey());
                druVar.b(value);
            }
            if (druVar2.i() instanceof dxy) {
                if (((dxy) druVar2.i()).b() == 2) {
                    a(list2, druVar);
                } else {
                    list.add(druVar);
                }
            }
        }
    }

    private static int a(ArrayList<dxy> arrayList) {
        ArrayList arrayList2 = new ArrayList(16);
        int i = 0;
        for (dxy dxyVar : arrayList) {
            if (dxyVar.c() == 1 && dxyVar.b() == 2) {
                i++;
                dru druVar = new dru();
                druVar.c(dxyVar);
                druVar.d(dxyVar.j());
                arrayList2.add(druVar);
            }
        }
        if (i > 1) {
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object objI = ((dru) arrayList2.get(i2)).i();
                if (objI instanceof dxy) {
                    dxy dxyVar2 = (dxy) objI;
                    LogUtil.d("CardDeviceFragment CardDeviceUtil", "getConnectedDevices connectedDevice name:", dxyVar2.i());
                    f47637c.put(dxyVar2.d(), Integer.valueOf((size - i2) * 30));
                }
            }
        }
        LogUtil.a("CardDeviceFragment CardDeviceUtil", "getConnectedDevices connectedCount:", Integer.valueOf(i));
        return i;
    }

    public static boolean e(String str) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "CardDeviceFragment CardDeviceUtil");
        if (deviceList == null) {
            LogUtil.j("CardDeviceFragment CardDeviceUtil", "isContinueConnecting devices == null");
            return true;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (TextUtils.equals(deviceInfo.getDeviceIdentify(), str) && deviceInfo.getDeviceConnectState() == 2) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<dru> c() {
        ArrayList<ContentValues> arrayListF = dmp.d().f();
        if (njy.e(arrayListF)) {
            LogUtil.a("CardDeviceFragment CardDeviceUtil", "no bonded devices");
            return new ArrayList<>(0);
        }
        ArrayList<dru> arrayList = new ArrayList<>(arrayListF.size());
        for (ContentValues contentValues : arrayListF) {
            String asString = contentValues.getAsString("productId");
            String asString2 = contentValues.getAsString("uniqueId");
            if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                LogUtil.j("CardDeviceFragment CardDeviceUtil", "getDeviceList : productId or deviceIdentify is empty");
            } else {
                elh elhVarD = ResourceManager.c().d(asString);
                LogUtil.a("CardDeviceFragment CardDeviceUtil", "getDeviceList: productId: ", asString, ", code: ", CommonUtil.n(asString2));
                if (elhVarD == null) {
                    LogUtil.j("CardDeviceFragment CardDeviceUtil", "getDeviceList : productInfo is null");
                } else {
                    elh.d dVarL = elhVarD.l();
                    if (dVarL == null) {
                        LogUtil.j("CardDeviceFragment CardDeviceUtil", "getDeviceList : Manifest is null");
                    } else {
                        String strB = dVarL.b();
                        if (TextUtils.isEmpty(strB) || strB.trim().isEmpty()) {
                            LogUtil.j("CardDeviceFragment CardDeviceUtil", "getDeviceList : icon is empty");
                        } else if (contentValues.getAsInteger("showInList").intValue() != 0) {
                            dru druVarB = ekd.b(elhVarD);
                            druVarB.a(contentValues);
                            druVarB.d(new dsa("deviceUsedTime").b(dxw.d(), contentValues.getAsString("uniqueId")));
                            arrayList.add(druVarB);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void o() {
        ReleaseLogUtil.d("CardDeviceFragment CardDeviceUtil", "openMyWatchFace");
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        if (watchFaceApi != null) {
            watchFaceApi.openMyWatchFace(new IBaseResponseCallback() { // from class: rtr
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    rtk.d(i, obj);
                }
            });
        }
    }

    static /* synthetic */ void d(int i, Object obj) {
        if (i == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
            H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
            mgu.a("e1");
        }
    }
}
