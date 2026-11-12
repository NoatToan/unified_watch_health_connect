package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class iem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f37531b = {8, 15, 13, 16, 20, 21, 18, 19, 34, 35, 44, 45};

    private static boolean b(int i, Context context) {
        for (int i2 : f37531b) {
            if (i2 == i) {
                LogUtil.a("Suggestion_HWDeviceManager", "isSupportIndependentSport is true, productType is:", Integer.valueOf(i));
                return true;
            }
        }
        if (a(i, context)) {
            LogUtil.a("Suggestion_HWDeviceManager", "support workout");
            return true;
        }
        LogUtil.a("Suggestion_HWDeviceManager", "isSupportIndependentSport is false, productType is:", Integer.valueOf(i));
        return false;
    }

    private static boolean a(int i, Context context) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "Suggestion_HWDeviceManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("Suggestion_HWDeviceManager", "isSupportWorkout getDeviceList is null or empty");
            return false;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo.getProductType() == i) {
                Map<String, DeviceCapability> mapQueryDeviceCapability = ecu.d().queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "Suggestion_HWDeviceManager");
                if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
                    LogUtil.j("Suggestion_HWDeviceManager", "isSupportWorkout deviceCapabilityHashMaps is null or empty");
                    break;
                }
                return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify()).isSupportExerciseAdvice();
            }
        }
        return false;
    }

    public static boolean a(Context context, boolean z) {
        if (z) {
            return e(context, z) || a();
        }
        LogUtil.e("Suggestion_HWDeviceManager", "isConnectedHeartRateDeviceAll()=false", "bluetoothIsEnabled = false");
        return false;
    }

    public static boolean a() {
        if (dmg.a().getBondedProductsForDeviceOnly(HealthDevice.HealthDeviceKind.HDK_HEART_RATE).size() > 0) {
            LogUtil.a("Suggestion_HWDeviceManager", "isConnectedHeartRateDeviceOther() = true");
            return true;
        }
        LogUtil.j("Suggestion_HWDeviceManager", "isConnectedHeartRateDeviceOther() = false");
        return false;
    }

    public static boolean e(Context context, boolean z) {
        if (!z) {
            LogUtil.j("Suggestion_HWDeviceManager", "isConnectedHeartRateDeviceWear()=false, bluetoothIsEnabled=false");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_HWDeviceManager");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2 || (!edh.d(deviceInfo.getProductType()) && !edd.a().a(deviceInfo.getProductType()))) {
            LogUtil.j("Suggestion_HWDeviceManager", "isConnectedHeartRateDeviceWear()=false, failed");
            return false;
        }
        LogUtil.a("Suggestion_HWDeviceManager", "isConnectedHeartRateDeviceWear()=true, isSupportHeartRate Wear=true, realtime_hearrate");
        return true;
    }

    public static boolean e() {
        boolean zIsBindingHeartRateDeviceWear = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isBindingHeartRateDeviceWear(null);
        LogUtil.a("Suggestion_HWDeviceManager", "isBindedHeartRateDeviceWear()=", Boolean.valueOf(zIsBindingHeartRateDeviceWear));
        return zIsBindingHeartRateDeviceWear;
    }

    public static boolean d() {
        boolean zIsBindingHeartRateDeviceWear = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isBindingHeartRateDeviceWear(null);
        LogUtil.a("Suggestion_HWDeviceManager", "isBindedHeartRateDeviceAll() wear=", Boolean.valueOf(zIsBindingHeartRateDeviceWear));
        if (zIsBindingHeartRateDeviceWear) {
            return true;
        }
        boolean zA = a();
        LogUtil.a("Suggestion_HWDeviceManager", "isBindedHeartRateDeviceAll() other=", Boolean.valueOf(zA));
        return zA;
    }

    public static void b(Context context) {
        if (context == null) {
            LogUtil.j("Suggestion_HWDeviceManager", "startSelectDeviceActivity context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.adddevice.AllDeviceListActivity");
        intent.putExtra("progressbar", 0);
        intent.putExtra("isFromFitnessAdvice", true);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Suggestion_HWDeviceManager", "startSelectDeviceActivity() exception: ", LogAnonymous.b(e));
        }
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.j("Suggestion_HWDeviceManager", "startMoreDeviceActivity context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Suggestion_HWDeviceManager", "startMoreDeviceActivity() exception: ", LogAnonymous.b(e));
        }
    }

    public static boolean b() {
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.j("Suggestion_HWDeviceManager", "isIndependentSportDevice context is null");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_HWDeviceManager");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2 || !b(deviceInfo.getProductType(), context)) {
            LogUtil.j("Suggestion_HWDeviceManager", "isIndependentSportDevice()=false, failed");
            return false;
        }
        LogUtil.a("Suggestion_HWDeviceManager", "isIndependentSportDevice()=true, isSupportHeartRate Wear=true, realtime_hearrate");
        return true;
    }
}
