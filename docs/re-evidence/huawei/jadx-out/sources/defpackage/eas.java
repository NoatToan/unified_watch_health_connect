package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eas {
    private static volatile eas d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomAlertDialog f32616c = null;

    private eas() {
    }

    public static eas b() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new eas();
                }
            }
        }
        return d;
    }

    public void b(final String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.e(false, "WifiOtaUpdateConstants", "autoCheckVersion devId is null");
            return;
        }
        if (!h(str)) {
            dyg.a(false, "WifiOtaUpdateConstants", " no need check ota version.");
            return;
        }
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        wifiDeviceServiceInfoReq.setDevId(str);
        wifiDeviceServiceInfoReq.setSid("devOtaInfo");
        lqo.b(BaseApplication.getContext()).d(wifiDeviceServiceInfoReq, new ICloudOperationResult<WifiDeviceServiceInfoRsp>() { // from class: eas.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str2, boolean z) {
                DeviceServiceInfo next;
                Map<String, String> data;
                if (!z) {
                    dyg.e(false, "WifiOtaUpdateConstants", "get device status fail. text: ", str2, ", res: ", wifiDeviceServiceInfoRsp);
                    return;
                }
                if (wifiDeviceServiceInfoRsp == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo() == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
                    dyg.e(false, "WifiOtaUpdateConstants", "get device info is empty.");
                    return;
                }
                Iterator<DeviceServiceInfo> it = wifiDeviceServiceInfoRsp.getDeviceServiceInfo().iterator();
                while (it.hasNext() && ((data = (next = it.next()).getData()) == null || !eas.this.a(str, next, data))) {
                    dyg.c(false, "WifiOtaUpdateConstants", "getDeviceStatus map is null");
                }
                dyg.a(false, "WifiOtaUpdateConstants", "res: ", wifiDeviceServiceInfoRsp, ", text: ", str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, DeviceServiceInfo deviceServiceInfo, Map<String, String> map) throws Throwable {
        String productId;
        String str2 = map.get("fwNewVer");
        String str3 = map.get("fwCurVer");
        String str4 = map.get("releaseNote");
        String str5 = map.get("status");
        if (ean.i(str) && map.containsKey("upgrade_auto")) {
            String str6 = map.get("upgrade_auto");
            LogUtil.a("WifiOtaUpdateConstants", "getOtaStatus Hagrid autoUpgradeStatus:", str6);
            a(str, str6);
        }
        dyg.a(false, "WifiOtaUpdateConstants", "sid: ", deviceServiceInfo.getSid(), ", note: ", str4, ", newVer: ", str2, ", nowVersion: ", str3, ", status: ", str5);
        boolean z = (TextUtils.isEmpty(str3) || str2.equals(str3)) ? false : true;
        if (TextUtils.isEmpty(str2) || !z || str5 == null || !"1".equals(str5)) {
            return false;
        }
        dyg.e(false, "WifiOtaUpdateConstants", "exist new version nowVersion: ", str3, ", new ver: ", str2);
        Bundle bundle = new Bundle();
        bundle.putString("version", str2);
        bundle.putString("cer_version", str3);
        bundle.putString("update_nodes", str4);
        eby ebyVarD = ecf.d(str);
        if (ebyVarD != null) {
            productId = ebyVarD.getProductId();
            bundle.putString("productId", productId);
        } else {
            LogUtil.j("WifiOtaUpdateConstants", "get wifi device error maybe because the devId is null ");
            productId = "";
        }
        bundle.putString("devId", str);
        bundle.putBoolean("is_exist_new_version", true);
        if (dxm.y(productId)) {
            LogUtil.a("WifiOtaUpdateConstants", "checkVersion : isSupportUploadOtaInfoDualModeProduct false");
            return true;
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.setAction("com.huawei.health.action.ACTION_WIFI_OTA_UPDATE_ACTION");
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
        c(str, true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0064  */
    private boolean h(String str) {
        boolean z = false;
        if (!ecj.b(BaseApplication.getContext())) {
            dyg.e(false, "WifiOtaUpdateConstants", "network is off. no check version.");
        } else {
            String strF = f(str);
            dyg.e(false, "WifiOtaUpdateConstants", "last check version time: ", strF);
            if (TextUtils.isEmpty(strF)) {
                z = true;
            } else {
                long jI = CommonUtil.i(strF);
                Date date = new Date(System.currentTimeMillis());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.set(5, calendar.get(5) - 7);
                long timeInMillis = calendar.getTimeInMillis();
                dyg.e(false, "WifiOtaUpdateConstants", "seven days ago time: ", Long.valueOf(timeInMillis), ", time: ", Long.valueOf(jI));
                if (jI < timeInMillis) {
                    z = true;
                }
            }
        }
        i(str);
        return z;
    }

    private void i(String str) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        Map<String, String> mapA = deviceCloudSharePreferencesManager.a(str);
        mapA.put("key_last_check_ota_version_time", System.currentTimeMillis() + "");
        deviceCloudSharePreferencesManager.d(str, mapA);
    }

    private String f(String str) {
        return new DeviceCloudSharePreferencesManager(dxw.d()).a(str).get("key_last_check_ota_version_time");
    }

    public void c(String str, boolean z) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        Map<String, String> mapA = deviceCloudSharePreferencesManager.a(str);
        mapA.put("key_is_exist_new_version", String.valueOf(z));
        deviceCloudSharePreferencesManager.d(str, mapA);
    }

    public boolean j(String str) {
        return Boolean.valueOf(new DeviceCloudSharePreferencesManager(dxw.d()).a(str).get("key_is_exist_new_version")).booleanValue();
    }

    public void a(String str, Map<String, String> map) {
        new DeviceCloudSharePreferencesManager(dxw.d()).d(str, map);
    }

    public Map<String, String> c(String str) {
        return new DeviceCloudSharePreferencesManager(dxw.d()).a(str);
    }

    public void a() {
        CustomAlertDialog customAlertDialog = this.f32616c;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        this.f32616c.dismiss();
        this.f32616c = null;
    }

    public void a(final Activity activity, final Bundle bundle) {
        if (!CommonUtil.i(activity, activity.getClass().getName())) {
            LogUtil.j("WifiOtaUpdateConstants", "showUpdateDialog activity is not showing:", activity.getClass().getName());
            return;
        }
        if (bundle == null) {
            LogUtil.j("WifiOtaUpdateConstants", "showUpdateDialog bundle null");
            return;
        }
        LogUtil.a("WifiOtaUpdateConstants", "showUpdateDialog in");
        CustomAlertDialog customAlertDialog = this.f32616c;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            View viewInflate = View.inflate(activity, R.layout.wifi_ota_update_prompt_dialog, null);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.version_code);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.version_node);
            healthTextView.setText(bundle.getString("version"));
            healthTextView2.setText(bundle.getString("update_nodes"));
            final String string = bundle.getString("devId");
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activity);
            builder.d(R.string.IDS_device_wear_home_device_ota_upgrade);
            builder.a(viewInflate);
            builder.d(R.string.IDS_device_wifi_ota_go_upgrade, new DialogInterface.OnClickListener() { // from class: ear
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.d.a(string, activity, bundle, dialogInterface, i);
                }
            });
            builder.a(R.string.IDS_device_wifi_ota_try_again_later, new DialogInterface.OnClickListener() { // from class: eat
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    eas.c(string, dialogInterface, i);
                }
            });
            CustomAlertDialog customAlertDialogB = builder.b();
            this.f32616c = customAlertDialogB;
            customAlertDialogB.setCancelable(false);
            this.f32616c.show();
            return;
        }
        LogUtil.j("WifiOtaUpdateConstants", "showUpdateDialog Dialog is displayed");
    }

    /* synthetic */ void a(String str, Activity activity, Bundle bundle, DialogInterface dialogInterface, int i) {
        if (!TextUtils.isEmpty(str)) {
            c(str, false);
        }
        Intent intent = new Intent(activity, (Class<?>) DeviceMainActivity.class);
        bundle.putString("view", "WifiVersionDetails");
        intent.putExtras(bundle);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WifiOtaUpdateConstants", "showUpdateDialog activity exception");
        }
        dialogInterface.cancel();
    }

    static /* synthetic */ void c(String str, DialogInterface dialogInterface, int i) {
        if (!TextUtils.isEmpty(str)) {
            b().i(str);
        }
        dialogInterface.cancel();
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiOtaUpdateConstants", "saveHagridAutoUpgradeSwitch deviceId is null");
            return "0";
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        LogUtil.a("WifiOtaUpdateConstants", "userId: ", CommonUtil.n(accountInfo));
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), accountInfo + str + "hagrid_auto_upgrade");
        LogUtil.a("WifiOtaUpdateConstants", "getHagridAutoUpgradeSwitch value:", strE);
        return TextUtils.isEmpty(strE) ? "0" : strE;
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiOtaUpdateConstants", "saveHagridAutoUpgradeSwitch deviceId is null");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("WifiOtaUpdateConstants", "saveHagridAutoUpgradeSwitch autoUpgrade is null");
            return;
        }
        if (!"1".equals(str2) && !"0".equals(str2)) {
            LogUtil.j("WifiOtaUpdateConstants", "saveHagridAutoUpgradeSwitch autoUpgrade is error,", str2);
            return;
        }
        LogUtil.a("WifiOtaUpdateConstants", "saveHagridAutoUpgradeSwitch autoUpgrade:", str2);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + str + "hagrid_auto_upgrade", str2, null);
    }

    public static void a(String str, String str2) {
        if ("1".equals(e(str)) && "0".equals(str2)) {
            LogUtil.j("WifiOtaUpdateConstants", "saveHagridAutoUpgradeSwitchFormCloud no update.");
        } else {
            b(str, str2);
        }
    }

    public static void c(String str, long j) {
        if (TextUtils.isEmpty(str) || j == 0) {
            LogUtil.j("WifiOtaUpdateConstants", "setOtaStartUpgradeTime deviceId is null");
            return;
        }
        LogUtil.a("WifiOtaUpdateConstants", "setOtaStartUpgradeTime startTime:", Long.valueOf(j));
        SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", str + "upgrade_time", String.valueOf(j), null);
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiOtaUpdateConstants", "getOtaUpgradeTimeLeft deviceId is null");
            return 0L;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", str + "upgrade_time");
        if (!TextUtils.isEmpty(strE)) {
            try {
                long j = Long.parseLong(strE);
                long jCurrentTimeMillis = System.currentTimeMillis();
                LogUtil.a("WifiOtaUpdateConstants", "getOtaUpgradeTimeLeft otaStartTime:", Long.valueOf(j), "|currentTime:", Long.valueOf(jCurrentTimeMillis));
                return jCurrentTimeMillis - j;
            } catch (NumberFormatException unused) {
                LogUtil.e("WifiOtaUpdateConstants", "getOtaUpgradeTimeLeft get ota upgrade start time exception");
            }
        } else {
            LogUtil.j("WifiOtaUpdateConstants", "getOtaUpgradeTimeLeft startTime is null");
        }
        return 0L;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiOtaUpdateConstants", "isOtaTimeout deviceId is null");
            return true;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", str + "upgrade_time");
        if (!TextUtils.isEmpty(strE)) {
            try {
                long j = Long.parseLong(strE);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = ean.i(str) ? 470000L : 170000L;
                LogUtil.a("WifiOtaUpdateConstants", "isOtaTimeout otaStartTime :", Long.valueOf(j), " currentTime:", Long.valueOf(jCurrentTimeMillis));
                if (jCurrentTimeMillis - j < j2) {
                    return false;
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("WifiOtaUpdateConstants", "isOtaTimeout get ota upgrade start time exception");
            }
        } else {
            LogUtil.j("WifiOtaUpdateConstants", "isOtaTimeout startTime is null");
        }
        return true;
    }
}
