package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.TaskExecutors;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorItem;
import health.compact.a.HuaweiHealth;
import health.compact.a.Services;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33397a;
    private static final String d;

    static {
        String strD = fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", (String) null);
        f33397a = strD;
        d = strD + File.separator;
    }

    public static String c(ArrayList<elh.c> arrayList, String str, int i) {
        if (njy.c(arrayList, i)) {
            return elo.a(str, arrayList.get(i).c());
        }
        LogUtil.j("PluginDevice_PluginDeviceUtils", "getZipText index is out of bounds");
        return "";
    }

    public static Bitmap a(ArrayList<elh.c> arrayList, String str, int i) {
        if (njy.c(arrayList, i)) {
            return elo.c(elg.e().d(str, arrayList.get(i).d()));
        }
        LogUtil.j("PluginDevice_PluginDeviceUtils", "getZipImage index is out of bounds");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004c  */
    public static boolean a(Activity activity) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        if (activity != null) {
            Object systemService = BaseApplication.getContext().getSystemService("location");
            if (systemService instanceof LocationManager) {
                LocationManager locationManager = (LocationManager) systemService;
                zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
                LogUtil.a("PluginDevice_PluginDeviceUtils", "isGPSLocationEnable：" + zIsProviderEnabled2);
                zIsProviderEnabled = locationManager.isProviderEnabled("network");
                LogUtil.a("PluginDevice_PluginDeviceUtils", "isNetWorkLocationEnable：" + zIsProviderEnabled);
            } else {
                zIsProviderEnabled = true;
                zIsProviderEnabled2 = true;
            }
        } else {
            zIsProviderEnabled = true;
            zIsProviderEnabled2 = true;
        }
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }

    public static boolean a() {
        BluetoothAdapter adapter;
        Object systemService = HuaweiHealth.a().getSystemService("bluetooth");
        if (systemService == null || !(systemService instanceof BluetoothManager) || (adapter = ((BluetoothManager) systemService).getAdapter()) == null) {
            return false;
        }
        return adapter.isEnabled();
    }

    public static void b(Activity activity, boolean z, int i) {
        if (z) {
            activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), i);
        } else {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "skipSettingView HagridWiFiInfoConfirmFragment is not attached");
        }
    }

    public static void b(Fragment fragment, boolean z, int i) {
        if (z) {
            fragment.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), i);
        } else {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "skipSettingView HagridWiFiInfoConfirmFragment is not attached");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public static String e(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "speeding_mode":
                b2 = 0;
                break;
            case "enhanced_fat_burning_jump_mode":
                b2 = 1;
                break;
            case "easy_fat_burning_jump_mode":
                b2 = 2;
                break;
            case "deep_fat_burning_jump_mode":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return d + "pic_speeding.webp";
        }
        if (b2 == 1) {
            return d + "pic_enhanced_fat_burning.webp";
        }
        if (b2 == 2) {
            return d + "pic_easy_fat_burning.webp";
        }
        if (b2 == 3) {
            return d + "pic_deep_fat_burning.webp";
        }
        return "";
    }

    public static void c(ActivityResultLauncher activityResultLauncher, String str) {
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(new Intent(str));
        }
    }

    public static void c(final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            return;
        }
        LogUtil.a("PluginDevice_PluginDeviceUtils", "checkWearStatus: start");
        ThreadPoolManager.c().execute(new Runnable() { // from class: esd
            @Override // java.lang.Runnable
            public final void run() {
                eru.b(responseCallback);
            }
        });
    }

    static /* synthetic */ void b(final ResponseCallback responseCallback) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "PluginDevice_PluginDeviceUtils");
        if (deviceList == null || deviceList.isEmpty()) {
            responseCallback.onResponse(-2, false);
            return;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2.getDeviceConnectState() == 2) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        if (deviceInfo == null) {
            responseCallback.onResponse(-2, false);
            return;
        }
        LogUtil.a("PluginDevice_PluginDeviceUtils", "checkWearStatus: deviceInfo = ", deviceInfo);
        if (!edh.d(deviceInfo.getProductType()) && !edd.a().a(deviceInfo.getProductType())) {
            responseCallback.onResponse(-3, false);
            return;
        }
        if (b(deviceInfo.getDeviceIdentify())) {
            responseCallback.onResponse(-4, false);
            return;
        }
        yjj yjjVarE = yhw.e(BaseApplication.getContext());
        Device deviceD = ykx.d(deviceInfo);
        LogUtil.a("PluginDevice_PluginDeviceUtils", "checkWearStatus: query wear status start");
        yjjVarE.d(deviceD, MonitorItem.MONITOR_ITEM_WEAR).addOnSuccessListener(TaskExecutors.immediate(), new OnSuccessListener() { // from class: ers
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                eru.b(responseCallback, (MonitorData) obj);
            }
        }).addOnFailureListener(TaskExecutors.immediate(), new OnFailureListener() { // from class: erx
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                eru.c(responseCallback, exc);
            }
        });
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, MonitorData monitorData) {
        int iAsInt = monitorData.asInt();
        LogUtil.a("PluginDevice_PluginDeviceUtils", "checkWearStatus: wearStatus = ", Integer.valueOf(iAsInt));
        if (iAsInt == 2) {
            responseCallback.onResponse(iAsInt, false);
        } else {
            responseCallback.onResponse(iAsInt, true);
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, Exception exc) {
        LogUtil.e("PluginDevice_PluginDeviceUtils", "checkWearStatus: call query api for wearStatus exception: ", exc);
        responseCallback.onResponse(-1, false);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).isDeviceOtaUpdating(str);
    }

    public static void c(final Activity activity, final int i) {
        if (activity == null) {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showNoConnectedDeviceDialog: activity is null");
        } else {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showNoConnectedDeviceDialog");
            activity.runOnUiThread(new Runnable() { // from class: erz
                @Override // java.lang.Runnable
                public final void run() {
                    eru.e(activity, i);
                }
            });
        }
    }

    static /* synthetic */ void e(final Activity activity, int i) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_no_connected_device_title);
        if (i == 265) {
            builder.b(R.string.IDS_no_connected_device_content_indoorbike);
        } else {
            builder.b(R.string.IDS_no_connected_device_content_treadmill);
        }
        builder.a(R.string.IDS_device_go_to_pair, new View.OnClickListener() { // from class: ese
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                erj.a(activity);
            }
        });
        builder.e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: esb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_PluginDeviceUtils", "showNoConnectedDeviceDialog: click cancel btn");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void b(final Activity activity, final int i) {
        if (activity == null) {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showNotSupportDialog: activity is null");
        } else {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showNotSupportDialog");
            activity.runOnUiThread(new Runnable() { // from class: err
                @Override // java.lang.Runnable
                public final void run() {
                    eru.d(activity, i);
                }
            });
        }
    }

    static /* synthetic */ void d(final Activity activity, int i) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_not_supoort_heart_rate_title);
        if (i == 265) {
            builder.b(R.string.IDS_not_supoort_heart_rate_content_indoorbike);
        } else {
            builder.b(R.string.IDS_not_supoort_heart_rate_content_treadmill);
        }
        builder.a(R.string.IDS_device_go_to_pair, new View.OnClickListener() { // from class: erv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                erj.a(activity);
            }
        });
        builder.e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: esa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_PluginDeviceUtils", "showNotSupportDialog: click cancel btn");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void b(final Activity activity) {
        if (activity == null) {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showNotWearDialog: activity is null");
        } else {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showNotWearDialog");
            activity.runOnUiThread(new Runnable() { // from class: ert
                @Override // java.lang.Runnable
                public final void run() {
                    eru.d(activity);
                }
            });
        }
    }

    static /* synthetic */ void d(Activity activity) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_not_wear_title);
        builder.b(R.string.IDS_not_wear_content);
        builder.a(R.string.IDS_device_know, new View.OnClickListener() { // from class: esc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_PluginDeviceUtils", "showNotWearDialog: click positive btn");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void g(final Activity activity) {
        if (activity == null) {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showQueryTimeoutDialog: activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ery
                @Override // java.lang.Runnable
                public final void run() {
                    eru.e(activity);
                }
            });
        }
    }

    static /* synthetic */ void e(Activity activity) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_not_wear_title);
        builder.b(R.string.IDS_query_wear_status_timeout);
        builder.a(R.string.IDS_device_know, new View.OnClickListener() { // from class: erw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_PluginDeviceUtils", "showQueryTimeoutDialog: click positive btn");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void f(final Activity activity) {
        if (activity == null) {
            LogUtil.a("PluginDevice_PluginDeviceUtils", "showOtaUpdatingDialog: activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: esg
                @Override // java.lang.Runnable
                public final void run() {
                    eru.c(activity);
                }
            });
        }
    }

    static /* synthetic */ void c(Activity activity) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_not_wear_title);
        builder.b(R.string.IDS_wear_device_ota_updating);
        builder.a(R.string.IDS_device_know, new View.OnClickListener() { // from class: erq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_PluginDeviceUtils", "showOtaUpdatingDialog: click positive btn");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }
}
