package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes10.dex */
public class lvl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40905c = new Object();
    private static int d;

    public static List<CloudDeviceInfo> c() {
        synchronized (f40905c) {
            ArrayList arrayList = new ArrayList(0);
            if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() && !Utils.o()) {
                List<CloudDeviceInfo> listH = h();
                d = listH.size();
                Collections.sort(listH, new Comparator<DeviceInfo>() { // from class: lvl.3
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public int compare(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
                        if (deviceInfo == null || deviceInfo2 == null) {
                            return 0;
                        }
                        if (deviceInfo2.getLastConnectedTime() > deviceInfo.getLastConnectedTime()) {
                            return 1;
                        }
                        return deviceInfo2.getLastConnectedTime() < deviceInfo.getLastConnectedTime() ? -1 : 0;
                    }
                });
                LogUtil.a("WearDeviceUtils", "getStorageCloudDevices size:", Integer.valueOf(listH.size()));
                return listH;
            }
            d = 0;
            return arrayList;
        }
    }

    public static int a() {
        int i;
        synchronized (f40905c) {
            i = d;
        }
        return i;
    }

    public static void a(DeviceInfo deviceInfo) {
        synchronized (f40905c) {
            try {
                if (deviceInfo == null) {
                    return;
                }
                List<CloudDeviceInfo> listC = c();
                Iterator<CloudDeviceInfo> it = listC.iterator();
                while (it.hasNext()) {
                    CloudDeviceInfo next = it.next();
                    if (Objects.equals(deviceInfo.getDeviceIdentify(), next.getDeviceIdentify()) || Objects.equals(deviceInfo.getDeviceName(), next.getDeviceName())) {
                        if (deviceInfo.getProductType() == next.getProductType()) {
                            LogUtil.a("WearDeviceUtils", "deleteStorageDevice deviceName:", CommonUtil.n(deviceInfo.getDeviceName()));
                            it.remove();
                            break;
                        }
                    }
                }
                d(listC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static CloudDeviceInfo e(int i, String str) {
        synchronized (f40905c) {
            CloudDeviceInfo cloudDeviceInfo = null;
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("WearDeviceUtils", "getCloudDevice, deviceName is empty");
                return null;
            }
            for (CloudDeviceInfo cloudDeviceInfo2 : c()) {
                if (cloudDeviceInfo2 != null && str.equals(cloudDeviceInfo2.getDeviceName()) && i == cloudDeviceInfo2.getProductType()) {
                    cloudDeviceInfo = cloudDeviceInfo2;
                    break;
                }
            }
            return cloudDeviceInfo;
        }
    }

    private static String f() {
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_cloudDevice";
    }

    public static void b(int i, String str, boolean z) {
        synchronized (f40905c) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LogUtil.a("WearDeviceUtils", "Enter updateDeviceConnectingState isConnect", Boolean.valueOf(z), "deviceName:", CommonUtil.n(str));
            List<CloudDeviceInfo> listC = c();
            for (CloudDeviceInfo cloudDeviceInfo : listC) {
                if (z && cloudDeviceInfo.getDeviceName().equals(str) && cloudDeviceInfo.getProductType() == i) {
                    cloudDeviceInfo.setDeviceActiveState(1);
                    cloudDeviceInfo.setDeviceConnectState(1);
                } else {
                    cloudDeviceInfo.setDeviceActiveState(0);
                    cloudDeviceInfo.setDeviceConnectState(3);
                }
            }
            d(listC);
        }
    }

    private static int c(List<CloudDeviceInfo> list, CloudDeviceInfo cloudDeviceInfo) {
        for (int i = 0; i < list.size(); i++) {
            CloudDeviceInfo cloudDeviceInfo2 = list.get(i);
            if (cloudDeviceInfo2.getDeviceIdentify().equals(cloudDeviceInfo.getDeviceIdentify()) || cloudDeviceInfo2.getDeviceName().equals(cloudDeviceInfo.getDeviceName())) {
                return i;
            }
        }
        return -1;
    }

    public static void b(List<CloudDeviceInfo> list) {
        synchronized (f40905c) {
            LogUtil.a("WearDeviceUtils", "Enter updateStorageDevices.");
            if (list == null) {
                return;
            }
            List<CloudDeviceInfo> listC = c();
            HashMap map = new HashMap(0);
            HashMap map2 = new HashMap(0);
            for (CloudDeviceInfo cloudDeviceInfo : listC) {
                map.put(cloudDeviceInfo.getDeviceIdentify(), cloudDeviceInfo);
                map2.put(cloudDeviceInfo.getDeviceName(), cloudDeviceInfo);
                LogUtil.a("WearDeviceUtils", "updateStorageDevices mapMacValue: ", CommonUtil.n(cloudDeviceInfo.getDeviceIdentify()), "updateStorageDevices mapDeviceNameValue: ", CommonUtil.n(cloudDeviceInfo.getDeviceName()));
            }
            for (CloudDeviceInfo cloudDeviceInfo2 : list) {
                String deviceIdentify = cloudDeviceInfo2.getDeviceIdentify();
                String deviceName = cloudDeviceInfo2.getDeviceName();
                if (!map.containsKey(deviceIdentify) && !map2.containsKey(deviceName)) {
                    LogUtil.a("WearDeviceUtils", "updateStorageDevices mapMacValue.containsKey(getDeviceIdentify):", CommonUtil.n(cloudDeviceInfo2.getDeviceIdentify()));
                    listC.add(cloudDeviceInfo2);
                    map.put(deviceIdentify, cloudDeviceInfo2);
                    map2.put(deviceName, cloudDeviceInfo2);
                } else {
                    int iC = c(listC, cloudDeviceInfo2);
                    LogUtil.a("WearDeviceUtils", "updateStorageDevices replace:", CommonUtil.n(cloudDeviceInfo2.getDeviceIdentify()), "indexValue:", Integer.valueOf(iC));
                    if (iC != -1) {
                        listC.set(iC, cloudDeviceInfo2);
                    }
                }
            }
            LogUtil.a("WearDeviceUtils", "Enter mapMacValue.", Integer.valueOf(map.keySet().size()));
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearDeviceUtils");
            if (deviceList != null && !deviceList.isEmpty()) {
                for (DeviceInfo deviceInfo : deviceList) {
                    String deviceIdentify2 = deviceInfo.getDeviceIdentify();
                    String deviceName2 = deviceInfo.getDeviceName();
                    LogUtil.a("WearDeviceUtils", "updateStorageDevices deviceInfo.getDeviceIdentify():", CommonUtil.n(deviceIdentify2));
                    if (map.containsKey(deviceIdentify2)) {
                        listC.remove(map.get(deviceIdentify2));
                        a(deviceInfo);
                    }
                    if (map2.containsKey(deviceName2)) {
                        listC.remove(map2.get(deviceName2));
                        a(deviceInfo);
                    }
                }
            }
            LogUtil.a("WearDeviceUtils", "deviceInfoList size:", Integer.valueOf(listC.size()));
            d(listC);
            a(list);
        }
    }

    public static void a(final List<CloudDeviceInfo> list) {
        LogUtil.a("WearDeviceUtils", "updateDeviceInfoToHiHealth enter. deviceInfoList size: ", Integer.valueOf(list.size()));
        ThreadPoolManager.c().a("WearDeviceUtils", new Runnable() { // from class: lvn
            @Override // java.lang.Runnable
            public final void run() {
                HiHealthManager.d(BaseApplication.getContext()).readDeviceInfo(new HiDataHiDeviceInfoListener() { // from class: lvl.1
                    @Override // com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener
                    public void onResult(List<HiDeviceInfo> list2) {
                        if (coq.d(list2)) {
                            LogUtil.j("WearDeviceUtils", "updateDeviceInfoToHiHealth onResult infoList is null.");
                        } else {
                            LogUtil.a("WearDeviceUtils", "updateDeviceInfoToHiHealth onResult. infoList size: ", Integer.valueOf(list2.size()));
                            lvl.e(list2, (List<CloudDeviceInfo>) list);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(List<HiDeviceInfo> list, List<CloudDeviceInfo> list2) {
        ArrayList<CloudDeviceInfo> arrayList = new ArrayList();
        for (CloudDeviceInfo cloudDeviceInfo : list2) {
            for (HiDeviceInfo hiDeviceInfo : list) {
                if (Objects.equals(cloudDeviceInfo.getDeviceIdentify(), hiDeviceInfo.getDeviceMac()) && !Objects.equals(cloudDeviceInfo.getDeviceName(), hiDeviceInfo.getDeviceName())) {
                    arrayList.add(cloudDeviceInfo);
                }
            }
        }
        if (coq.d(arrayList)) {
            return;
        }
        LogUtil.a("WearDeviceUtils", "updateDeviceInfoToHiHealth list size:", Integer.valueOf(arrayList.size()));
        for (CloudDeviceInfo cloudDeviceInfo2 : arrayList) {
            LogUtil.a("WearDeviceUtils", "updateDeviceInfoToHiHealth list cloudDeviceInfo:", cloudDeviceInfo2.getDeviceName());
            mga.h(cloudDeviceInfo2);
        }
    }

    private static StorageParams g() {
        StorageParams storageParams = new StorageParams();
        storageParams.e(1);
        return storageParams;
    }

    public static List<DeviceInfo> d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearDeviceUtils");
        List<CloudDeviceInfo> listC = c();
        if (listC.size() == 0) {
            return deviceList;
        }
        if (deviceList == null) {
            LogUtil.j("WearDeviceUtils", "deviceList is null");
            deviceList = new ArrayList(0);
        } else {
            LogUtil.j("WearDeviceUtils", "deviceInfoList size:", Integer.valueOf(deviceList.size()));
        }
        HashMap map = new HashMap(0);
        HashMap map2 = new HashMap(0);
        for (DeviceInfo deviceInfo : deviceList) {
            map.put(deviceInfo.getDeviceIdentify(), deviceInfo);
            map2.put(deviceInfo.getDeviceName(), deviceInfo);
            LogUtil.a("WearDeviceUtils", "deviceInfoList mapMacValue:", deviceInfo.getDeviceName());
        }
        for (CloudDeviceInfo cloudDeviceInfo : listC) {
            if (!map.containsKey(cloudDeviceInfo.getDeviceIdentify()) && !map2.containsKey(cloudDeviceInfo.getDeviceName())) {
                CloudDeviceInfo cloudDeviceInfo2 = new CloudDeviceInfo();
                cloudDeviceInfo2.setProductType(cloudDeviceInfo.getProductType());
                cloudDeviceInfo2.setDeviceConnectState(cloudDeviceInfo.getDeviceConnectState());
                cloudDeviceInfo2.setDeviceActiveState(cloudDeviceInfo.getDeviceActiveState());
                cloudDeviceInfo2.setDeviceIdentify(cloudDeviceInfo.getDeviceIdentify());
                cloudDeviceInfo2.setDeviceName(cloudDeviceInfo.getDeviceName());
                cloudDeviceInfo2.setIsCloudDevice(cloudDeviceInfo.getIsCloudDevice());
                cloudDeviceInfo2.setSmartDeviceUdid(cloudDeviceInfo.getSmartDeviceUdid());
                cloudDeviceInfo2.setDeviceProfileId(cloudDeviceInfo.getDeviceProfileId());
                deviceList.add(cloudDeviceInfo2);
            } else {
                LogUtil.a("WearDeviceUtils", "getCloudDeviceInfoList delete device: ", cloudDeviceInfo.toString());
                a(cloudDeviceInfo);
            }
        }
        return deviceList;
    }

    public static DeviceInfo e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearDeviceUtils", "getDeviceByMac mac isEmpty");
            return null;
        }
        List<DeviceInfo> listD = d();
        if (listD == null || listD.size() == 0) {
            LogUtil.j("WearDeviceUtils", "getDeviceByMac (deviceList == null) || (deviceList.size() == 0)");
            return null;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (deviceInfo != null && str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                return deviceInfo;
            }
        }
        LogUtil.j("WearDeviceUtils", "getDeviceByMac no device");
        return null;
    }

    private static ArrayList<dxy> i() {
        ArrayList<dxy> arrayList = new ArrayList<>(16);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearDeviceUtils");
        if (coq.d(deviceList)) {
            ReleaseLogUtil.d("R_WearDeviceUtils", "getWearInfo wearDeviceList is null");
            return arrayList;
        }
        ReleaseLogUtil.d("R_WearDeviceUtils", "getWearInfo wearDeviceList size is ", Integer.valueOf(deviceList.size()));
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo == null) {
                ReleaseLogUtil.e("R_WearDeviceUtils", "getWearInfo deviceInfo  is null");
            } else {
                int iU = lvi.a(deviceInfo.getProductType()).u();
                int iY = lvi.a(deviceInfo.getProductType()).y();
                dxy dxyVar = new dxy();
                dxyVar.c(deviceInfo, iU, iY);
                dxyVar.e(deviceInfo.getProductType());
                dxyVar.c(deviceInfo.getSecurityUuid() + "#ANDROID21");
                dxyVar.a(deviceInfo.getLastConnectedTime());
                c(deviceInfo, dxyVar);
                dxyVar.c(deviceInfo);
                arrayList.add(dxyVar);
            }
        }
        return arrayList;
    }

    private static void c(DeviceInfo deviceInfo, dxy dxyVar) {
        if (TextUtils.isEmpty(deviceInfo.getDeviceName())) {
            if (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN")) {
                dxyVar.a("PORSCHE DESIGN");
                ReleaseLogUtil.d("R_WearDeviceUtils", "setDeviceName is DEVICE_NAME_PORSCHE_DESIGN");
                return;
            } else {
                dxyVar.a(deviceInfo.getDeviceName());
                ReleaseLogUtil.d("WearDeviceUtils", "device name is null");
                return;
            }
        }
        ReleaseLogUtil.d("R_WearDeviceUtils", "setDeviceName is ", deviceInfo.getDeviceName());
        if (TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN") || (!TextUtils.isEmpty(deviceInfo.getDeviceModel()) && TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN"))) {
            dxyVar.a("PORSCHE DESIGN");
        } else {
            dxyVar.a(deviceInfo.getDeviceName());
        }
    }

    public static ArrayList<dxy> j() {
        ArrayList<dxy> arrayListI = i();
        List<CloudDeviceInfo> listC = c();
        if (listC.size() == 0) {
            ReleaseLogUtil.d("R_WearDeviceUtils", "getWearInfoList cloudDevices.size = 0");
            b(arrayListI);
            return arrayListI;
        }
        HashMap map = new HashMap(0);
        HashMap map2 = new HashMap(0);
        for (dxy dxyVar : arrayListI) {
            map.put(dxyVar.d(), dxyVar);
            map2.put(dxyVar.i(), dxyVar);
            LogUtil.a("WearDeviceUtils", "getCloudDeviceInfoList mapmacValue:", dxyVar.i());
        }
        for (CloudDeviceInfo cloudDeviceInfo : listC) {
            if (!map.containsKey(cloudDeviceInfo.getDeviceIdentify()) && !map2.containsKey(cloudDeviceInfo.getDeviceName())) {
                LogUtil.a("WearDeviceUtils", "getWearInfoList cloudDevices DeviceName:", cloudDeviceInfo.getDeviceName(), " ProductType:", Integer.valueOf(cloudDeviceInfo.getProductType()));
                if (275 == cloudDeviceInfo.getProductType()) {
                    LogUtil.a("WearDeviceUtils", "getWearInfoList remove MATTER cloudDevices");
                } else {
                    arrayListI.add(e(cloudDeviceInfo));
                }
            } else {
                LogUtil.a("WearDeviceUtils", "getCloudDeviceInfoList delete device: ", cloudDeviceInfo.toString());
                a(cloudDeviceInfo);
            }
        }
        b(arrayListI);
        return arrayListI;
    }

    public static dxy e(CloudDeviceInfo cloudDeviceInfo) {
        int iU = lvi.a(cloudDeviceInfo.getProductType()).u();
        int iY = lvi.a(cloudDeviceInfo.getProductType()).y();
        dxy dxyVar = new dxy();
        dxyVar.d(iU);
        dxyVar.e(String.valueOf(iY));
        dxyVar.e(cloudDeviceInfo.getProductType());
        dxyVar.b(cloudDeviceInfo.getDeviceConnectState());
        dxyVar.c(cloudDeviceInfo.getDeviceActiveState());
        dxyVar.d(cloudDeviceInfo.getDeviceIdentify());
        dxyVar.g(cloudDeviceInfo.getAutoDetectSwitchStatus());
        dxyVar.a(cloudDeviceInfo.getDeviceName());
        dxyVar.d(cloudDeviceInfo.getIsCloudDevice());
        dxyVar.c(cloudDeviceInfo.getDeviceProfileId());
        dxyVar.a(cloudDeviceInfo.getLastConnectedTime());
        dxyVar.a(cloudDeviceInfo);
        return dxyVar;
    }

    private static void b(ArrayList<dxy> arrayList) {
        LogUtil.a("WearDeviceUtils", "checkSameTypeDevice deviceList.size(): ", Integer.valueOf(arrayList.size()));
        HashMap map = new HashMap();
        Iterator<dxy> it = arrayList.iterator();
        while (it.hasNext()) {
            String strD = d(it.next().i());
            if (map.containsKey(strD)) {
                map.put(strD, Integer.valueOf(((Integer) map.get(strD)).intValue() + 1));
            } else {
                map.put(strD, 1);
            }
            LogUtil.a("WearDeviceUtils", "checkSameTypeDevice DeviceInfoForWear device name: ", strD, " count: ", map.get(strD));
        }
        for (dxy dxyVar : arrayList) {
            if (((Integer) map.get(d(dxyVar.i()))).intValue() > 1) {
                dxyVar.c(false);
            }
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return (str.contains("HUAWEI CM-R1P") || str.contains("HUAWEI AM-R1") || str.length() <= 4) ? str : str.substring(0, str.length() - 4);
    }

    public static void a(List<DeviceInfo> list, final String str) {
        if (list == null || TextUtils.isEmpty(str)) {
            LogUtil.j("WearDeviceUtils", "updateConnectDevice deviceInfoList size is null or mac is null");
            return;
        }
        final ArrayList arrayList = new ArrayList(0);
        DeviceInfo deviceInfo = null;
        DeviceInfo deviceInfo2 = null;
        for (DeviceInfo deviceInfo3 : list) {
            if ("main_relationship".equals(deviceInfo3.getRelationship())) {
                deviceInfo = deviceInfo3;
            }
            if (str.equalsIgnoreCase(deviceInfo3.getDeviceIdentify())) {
                deviceInfo2 = deviceInfo3;
            }
            if (!(deviceInfo3 instanceof CloudDeviceInfo)) {
                arrayList.add(deviceInfo3);
            }
        }
        boolean zC = c(str, deviceInfo, deviceInfo2);
        LogUtil.a("WearDeviceUtils", "updateConnectDevice localList:", Integer.valueOf(arrayList.size()), ",isSizeToDevice: ", Boolean.valueOf(zC), ",mainDeviceInfo: ", deviceInfo, ",sizeDevice: ", deviceInfo2);
        if (zC) {
            lvb.e().b("seizeDevice", deviceInfo, 0, str);
        }
        if (arrayList.size() <= 0 || str.contains(Constants.LINK)) {
            return;
        }
        try {
            KeyValDbManager.d(BaseApplication.getContext()).b("isUserConnect", Boolean.toString(true));
            lvb.e().d(arrayList, str);
            ThreadPoolManager.c().a("WearDeviceUtils", new Runnable() { // from class: lvq
                @Override // java.lang.Runnable
                public final void run() {
                    lvl.b(arrayList, str);
                }
            });
        } catch (RemoteException e) {
            LogUtil.e("WearDeviceUtils", "RemoteException switchDevice:", e.getMessage());
        }
    }

    static /* synthetic */ void b(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            if (TextUtils.equals(deviceInfo.getDeviceIdentify(), str)) {
                net.b("WearDeviceUtils", net.b(deviceInfo), net.e("WearDeviceUtils", deviceInfo));
            }
        }
    }

    private static boolean c(String str, DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        if (deviceInfo == null || str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("WearDeviceUtils", "device is not fit.");
            return false;
        }
        if (str.contains(Constants.LINK) || deviceInfo2 == null || (deviceInfo2 instanceof CloudDeviceInfo)) {
            LogUtil.a("WearDeviceUtils", "sizeDevice is invalid.");
            return false;
        }
        if (eey.d(deviceInfo, 93) && eey.d(deviceInfo2, 26)) {
            return true;
        }
        LogUtil.a("WearDeviceUtils", "checkSupportCapability is false.");
        return false;
    }

    public static void b() {
        KeyValDbManager.d(BaseApplication.getContext()).d("isUserConnect");
    }

    private static List<CloudDeviceInfo> h() throws Throwable {
        ArrayList arrayList = new ArrayList();
        String strB = KeyValDbManager.d(BaseApplication.getContext()).b(f(), g());
        if (strB == null) {
            d = 0;
            return arrayList;
        }
        try {
            ArrayList arrayList2 = (ArrayList) new Gson().fromJson(strB, new TypeToken<ArrayList<CloudDeviceInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.device.clouddevice.WearDeviceUtils$3
            }.getType());
            if (arrayList2 != null) {
                LogUtil.a("WearDeviceUtils", "getDeviceListFromDB deviceList size:", Integer.valueOf(arrayList2.size()));
                return arrayList2;
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.e("WearDeviceUtils", "getStorageCloudDevices JsonSyntaxException");
        }
        return arrayList;
    }

    private static void d(List<CloudDeviceInfo> list) {
        LogUtil.a("WearDeviceUtils", "setDeviceListToDb deviceList size:", Integer.valueOf(list.size()));
        try {
            KeyValDbManager.d(BaseApplication.getContext()).b(f(), new Gson().toJson(list), g());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("WearDeviceUtils", "JsonSyntaxException");
        }
    }

    public static void e() {
        d(new ArrayList());
        mgz.a(true);
    }

    private static DeviceInfo e(List<? extends DeviceInfo> list, Predicate<DeviceInfo> predicate) {
        if (njy.e(list)) {
            return null;
        }
        for (DeviceInfo deviceInfo : list) {
            if (predicate.test(deviceInfo)) {
                return deviceInfo;
            }
        }
        return null;
    }

    public static DeviceInfo a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        DeviceInfo deviceInfoE = e(ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearDeviceUtils"), (Predicate<DeviceInfo>) new Predicate() { // from class: lvo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((DeviceInfo) obj).getDeviceIdentify());
            }
        });
        return deviceInfoE != null ? deviceInfoE : e(c(), (Predicate<DeviceInfo>) new Predicate() { // from class: lvp
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((DeviceInfo) obj).getDeviceIdentify());
            }
        });
    }
}
