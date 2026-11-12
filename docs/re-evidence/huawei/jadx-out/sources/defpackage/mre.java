package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mre {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile mre f42248b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42247a = new Object();

    private mre() {
    }

    private static String e() {
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_cloudDevice";
    }

    private static StorageParams c() {
        StorageParams storageParams = new StorageParams();
        storageParams.e(1);
        return storageParams;
    }

    private static List<CloudDeviceInfo> a() throws Throwable {
        ArrayList arrayList = new ArrayList();
        String strB = KeyValDbManager.d(BaseApplication.getContext()).b(e(), c());
        if (strB != null) {
            try {
                ArrayList arrayList2 = (ArrayList) new Gson().fromJson(strB, new TypeToken<ArrayList<CloudDeviceInfo>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwclouddevicemgr.HwCloudDeviceManager$1
                }.getType());
                if (arrayList2 != null) {
                    LogUtil.a("HwCloudDeviceManager", "getDeviceListFromDB deviceList size:", Integer.valueOf(arrayList2.size()));
                    return arrayList2;
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.e("HwCloudDeviceManager", "getStorageCloudDevices JsonSyntaxException");
            }
        }
        return arrayList;
    }

    private static void b(List<CloudDeviceInfo> list) {
        LogUtil.a("HwCloudDeviceManager", "setDeviceListToDB deviceList size:", Integer.valueOf(list.size()));
        try {
            KeyValDbManager.d(BaseApplication.getContext()).b(e(), new Gson().toJson(list), c());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HwCloudDeviceManager", "JsonSyntaxException");
        }
    }

    private static List<CloudDeviceInfo> c(List<CloudDeviceInfo> list, CloudDeviceInfo cloudDeviceInfo) {
        ArrayList arrayList = new ArrayList();
        for (CloudDeviceInfo cloudDeviceInfo2 : list) {
            if (!cloudDeviceInfo2.getDeviceName().equalsIgnoreCase(cloudDeviceInfo.getDeviceName())) {
                arrayList.add(cloudDeviceInfo2);
            }
        }
        return arrayList;
    }

    public static mre d() {
        if (f42248b == null) {
            synchronized (f42247a) {
                if (f42248b == null) {
                    f42248b = new mre();
                }
            }
        }
        return f42248b;
    }

    public void c(CloudDeviceInfo cloudDeviceInfo) {
        LogUtil.a("HwCloudDeviceManager", "addStorageDevices device: ", cloudDeviceInfo.toString());
        List<CloudDeviceInfo> listC = c(b(), cloudDeviceInfo);
        listC.add(cloudDeviceInfo);
        b(listC);
    }

    public void d(CloudDeviceInfo cloudDeviceInfo) {
        synchronized (e) {
            try {
                if (cloudDeviceInfo == null) {
                    return;
                }
                LogUtil.a("HwCloudDeviceManager", "deleteStorageDevice device: ", cloudDeviceInfo.toString());
                b(c(b(), cloudDeviceInfo));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<CloudDeviceInfo> b() {
        List<CloudDeviceInfo> listA;
        LogUtil.a("HwCloudDeviceManager", "getCloudDeviceInfoList. ");
        synchronized (e) {
            listA = a();
            Collections.sort(listA, new Comparator<DeviceInfo>() { // from class: mre.4
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
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
            LogUtil.a("HwCloudDeviceManager", "getCloudDeviceInfoList size:", Integer.valueOf(listA.size()));
        }
        return listA;
    }
}
