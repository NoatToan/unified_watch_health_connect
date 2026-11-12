package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
class mki {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mkj f41805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41806c = new Object();
    private static mki d;

    private mki() {
        LogUtil.j("HwGetDeviceListMgr", "Init HwGetDeviceListMgr.");
        f41805b = mkj.d();
    }

    public static mki d() {
        mki mkiVar;
        synchronized (f41806c) {
            if (d == null) {
                d = new mki();
            }
            mkiVar = d;
        }
        return mkiVar;
    }

    public List<DeviceInfo> b() {
        ArrayList arrayList = new ArrayList(24);
        arrayList.clear();
        HashSet hashSet = new HashSet(16);
        Iterator<DeviceInfo> it = mkf.d().a().iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfoA = f41805b.a(it.next());
            arrayList.add(deviceInfoA);
            String deviceName = deviceInfoA.getDeviceName();
            if (!hashSet.add(deviceName)) {
                LogUtil.a("HwGetDeviceListMgr", "return getAllDeviceList() isExist:", deviceName);
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getAllDeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }

    public List<DeviceInfo> h() {
        ArrayList arrayList = new ArrayList(24);
        arrayList.clear();
        if (mkf.d().a() == null || mkf.d().a().isEmpty()) {
            LogUtil.j("HwGetDeviceListMgr", "return getConnectedMainDeviceList() size is 0.");
            return arrayList;
        }
        for (DeviceInfo deviceInfo : mkf.d().a()) {
            if (deviceInfo.getDeviceConnectState() == 2 && deviceInfo.getAutoDetectSwitchStatus() != 1) {
                LogUtil.a("HwGetDeviceListMgr", "getConnectedMainDeviceList Connected Device :", deviceInfo.getDeviceName());
                arrayList.add(deviceInfo);
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getConnectedMainDeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }

    public List<DeviceInfo> e() {
        ArrayList arrayList = new ArrayList(24);
        arrayList.clear();
        if (mkf.d().a() != null && !mkf.d().a().isEmpty()) {
            for (DeviceInfo deviceInfo : mkf.d().a()) {
                if (deviceInfo.getDeviceConnectState() == 2) {
                    LogUtil.a("HwGetDeviceListMgr", "getConnectedDeviceList Connected Device :", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getConnectedDeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }

    public List<DeviceInfo> a() {
        ArrayList arrayList = new ArrayList(24);
        if (mkf.d().a() != null && !mkf.d().a().isEmpty()) {
            for (DeviceInfo deviceInfo : mkf.d().a()) {
                if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() == 2 && eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("HwGetDeviceListMgr", "getConnectedAw70Device device name:", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getConnectedAw70DeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }

    public List<DeviceInfo> c() {
        ArrayList arrayList = new ArrayList(24);
        if (mkf.d().a() != null && !mkf.d().a().isEmpty()) {
            for (DeviceInfo deviceInfo : mkf.d().a()) {
                if (deviceInfo.getDeviceActiveState() == 1) {
                    LogUtil.a("HwGetDeviceListMgr", "get getActiveDeviceList() name ", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getActiveDeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }

    public List<DeviceInfo> e(HwGetDevicesParameter hwGetDevicesParameter) {
        ArrayList arrayList = new ArrayList(24);
        if (hwGetDevicesParameter == null) {
            LogUtil.j("HwGetDeviceListMgr", "getSpecificDeviceList parameter is null.");
            return arrayList;
        }
        String deviceIdentify = hwGetDevicesParameter.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j("HwGetDeviceListMgr", "getSpecificDeviceList identify of parameter is null.");
            return arrayList;
        }
        String strReplaceAll = deviceIdentify.replaceAll(":", "");
        if (mkf.d().a() != null && !mkf.d().a().isEmpty()) {
            String strReplaceAll2 = "";
            for (DeviceInfo deviceInfo : mkf.d().a()) {
                String deviceIdentify2 = deviceInfo.getDeviceIdentify();
                if (deviceIdentify2 != null) {
                    strReplaceAll2 = deviceIdentify2.replaceAll(":", "");
                }
                if (strReplaceAll2.contains(strReplaceAll)) {
                    arrayList.add(deviceInfo);
                    break;
                }
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getSpecificDeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }

    public List<DeviceInfo> j() {
        ArrayList arrayList = new ArrayList(24);
        if (mkf.d().a() != null && !mkf.d().a().isEmpty()) {
            for (DeviceInfo deviceInfo : mkf.d().a()) {
                if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getAutoDetectSwitchStatus() == 1) {
                    LogUtil.a("HwGetDeviceListMgr", "get getFollowedDeviceList() name ", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        if (arrayList.size() != 0) {
            LogUtil.a("HwGetDeviceListMgr", "getFollowedDeviceList deviceInfoListBaks size is ", Integer.valueOf(arrayList.size()));
        }
        return mkl.d().a(arrayList);
    }
}
