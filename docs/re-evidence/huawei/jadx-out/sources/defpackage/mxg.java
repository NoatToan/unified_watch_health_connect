package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mxg f42640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42641b = new Object();

    public static mxg b() {
        mxg mxgVar;
        synchronized (f42641b) {
            if (f42640a == null) {
                f42640a = new mxg();
            }
            mxgVar = f42640a;
        }
        return mxgVar;
    }

    public boolean a(DeviceInfo deviceInfo) {
        return c(deviceInfo, false);
    }

    public boolean c(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isSupportMultiConnect deviceInfo is null.");
            return false;
        }
        if (cpx.e()) {
            return false;
        }
        if (TextUtils.isEmpty(deviceInfo.getExpandCapability())) {
            HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
            hwGetDevicesParameter.setDeviceIdentify(deviceInfo.getDeviceIdentify());
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "DEVMGR_HwMultiDeviceUtils");
            if (deviceList != null && deviceList.size() > 0) {
                return c(deviceInfo, z, deviceList.get(0));
            }
        }
        boolean zD = eey.d(deviceInfo, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "isSupportMultiConnect: ", Boolean.valueOf(zD), " identify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        return zD;
    }

    private boolean c(DeviceInfo deviceInfo, boolean z, DeviceInfo deviceInfo2) {
        boolean zD;
        if (deviceInfo2 != null) {
            if (z && deviceInfo.getDeviceConnectState() == 1 && TextUtils.isEmpty(deviceInfo2.getExpandCapability())) {
                deviceInfo2.setExpandCapability(d(deviceInfo.getDeviceIdentify()));
            }
            zD = eey.d(deviceInfo2, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        } else {
            zD = false;
        }
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "isSupportMultiConnect get expandCapability: ", Boolean.valueOf(zD), " identify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        return zD;
    }

    private String d(String str) {
        SharedPreferences sharedPreferencesA = SharedStoreManager.a("keyvaldb_encrypt_udsdevice");
        try {
            return ((ExternalDeviceCapability) new Gson().fromJson(sharedPreferencesA.getString(str + "_deviceCapability", "[]"), ExternalDeviceCapability.class)).getCapacity();
        } catch (JsonSyntaxException unused) {
            LogUtil.e("DEVMGR_HwMultiDeviceUtils", "getOldExpandCapability fromJson error");
            lng.c("MultiDeviceMessage", "getOldExpandCapability fromJson error.");
            return "";
        }
    }

    public boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isFollowedShipDevice deviceInfo is null.");
            return false;
        }
        boolean z = mkl.d().a(deviceInfo.getProductType()) || "followed_relationship".equalsIgnoreCase(mkl.d().a(deviceInfo.getDeviceIdentify()));
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "isFollowedShipDevice isFollowDevice: ", Boolean.valueOf(z));
        return z;
    }

    public void d(String str, List<DeviceInfo> list) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "setFollowedDeviceShip deviceIdentify is empty.");
            return;
        }
        if (coq.d(list)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "setFollowedDeviceShip deviceInfoList is empty.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                deviceInfo.setRelationship("followed_relationship");
                break;
            }
        }
        d(list);
        mkl.d().c(list, "followDeviceUpdate");
    }

    public boolean e(int i, String str) {
        boolean z = false;
        if (i == -1) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isFollowExcludeAw70RunPostureDevice productType is unknown.");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isFollowExcludeAw70RunPostureDevice deviceIdentify is empty.");
            return false;
        }
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "isFollowExcludeAw70RunPostureDevice deviceIdentify: ", CommonUtil.n(str));
        if (mkl.d().a(i) && !eel.d(i)) {
            z = true;
        }
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "isFollowExcludeAw70RunPostureDevice: ", Boolean.valueOf(z));
        return z;
    }

    public boolean b(String str, List<DeviceInfo> list) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isMainDevice deviceIdentify is empty.");
            return false;
        }
        if (coq.d(list)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isMainDevice allDeviceList is empty.");
            return false;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && str.equals(deviceInfo.getDeviceIdentify()) && "main_relationship".equals(deviceInfo.getRelationship())) {
                z = true;
                break;
            }
        }
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "isMainDevice: ", Boolean.valueOf(z));
        return z;
    }

    public DeviceInfo c(List<DeviceInfo> list) {
        DeviceInfo deviceInfoA = null;
        if (coq.d(list)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "getMainShipDevice allDeviceList is empty.");
            return null;
        }
        for (DeviceInfo deviceInfo : list) {
            if ("assistant_relationship".equals(deviceInfo.getRelationship())) {
                deviceInfoA = deviceInfo;
                break;
            }
        }
        boolean zE = e(list);
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "getMainShipDevice isHasAw70Run: ", Boolean.valueOf(zE));
        if (deviceInfoA == null) {
            LogUtil.a("DEVMGR_HwMultiDeviceUtils", "getMainShipDevice first method is null.");
            deviceInfoA = a(list, zE);
        }
        if (deviceInfoA != null) {
            return deviceInfoA;
        }
        LogUtil.a("DEVMGR_HwMultiDeviceUtils", "getMainShipDevice second method is null.");
        return c(list, zE);
    }

    private DeviceInfo a(List<DeviceInfo> list, boolean z) {
        for (DeviceInfo deviceInfo : list) {
            LogUtil.a("DEVMGR_HwMultiDeviceUtils", "searchMainDeviceBySecond deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            if (!b(deviceInfo) && deviceInfo.getDeviceActiveState() == 1) {
                if ((eel.d(deviceInfo.getProductType()) && deviceInfo.getAutoDetectSwitchStatus() == 0 && !z) || !eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
                LogUtil.j("DEVMGR_HwMultiDeviceUtils", "searchMainDeviceBySecond else.");
            }
        }
        return null;
    }

    private DeviceInfo c(List<DeviceInfo> list, boolean z) {
        for (DeviceInfo deviceInfo : list) {
            LogUtil.a("DEVMGR_HwMultiDeviceUtils", "searchMainDeviceByThird deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            if (!b(deviceInfo) && deviceInfo.getDeviceActiveState() == 0) {
                if ((eel.d(deviceInfo.getProductType()) && !z) || !eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
                LogUtil.j("DEVMGR_HwMultiDeviceUtils", "searchMainDeviceByThird else.");
            }
        }
        return null;
    }

    private boolean e(List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (eel.d(deviceInfo.getProductType()) && deviceInfo.getAutoDetectSwitchStatus() == 1 && deviceInfo.getDeviceActiveState() == 1) {
                return true;
            }
        }
        return false;
    }

    public boolean b(List<DeviceInfo> list) {
        if (coq.d(list)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "isHasMainDeviceInList deviceInfoList is empty.");
            return false;
        }
        Iterator<DeviceInfo> it = list.iterator();
        while (it.hasNext()) {
            if ("main_relationship".equalsIgnoreCase(mkl.d().a(it.next().getDeviceIdentify()))) {
                return true;
            }
        }
        return false;
    }

    public List<DeviceInfo> a(String str, List<DeviceInfo> list) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "getDeleteShipDevices deviceIdentify is empty.");
            return Collections.EMPTY_LIST;
        }
        if (coq.d(list)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "getDeleteShipDevices allDeviceList is empty.");
            return Collections.EMPTY_LIST;
        }
        for (DeviceInfo deviceInfo : list) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                list.remove(deviceInfo);
                break;
            }
        }
        return list;
    }

    public void d(List<DeviceInfo> list) {
        if (coq.d(list)) {
            LogUtil.j("DEVMGR_HwMultiDeviceUtils", "printUpdateListShip deviceInfoList is empty.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            ReleaseLogUtil.d("DEVMGR_HwMultiDeviceUtils", "fuzzIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", ship: ", deviceInfo.getRelationship());
        }
    }

    public void d() {
        c();
    }

    private static void c() {
        synchronized (f42641b) {
            f42640a = null;
        }
    }
}
