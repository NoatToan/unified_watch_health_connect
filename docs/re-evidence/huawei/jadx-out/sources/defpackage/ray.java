package defpackage;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class ray {
    private static boolean a(int i, int i2) {
        boolean z = i == 0 && i2 == 1;
        if (i == 1 && i2 == 2) {
            return true;
        }
        return z;
    }

    public static void b(ScanMode scanMode, List<cmy> list, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_ScanDeviceUtils", "scanDevice:", Integer.valueOf(list.size()));
        a(list, iBaseResponseCallback);
        xgt.b().scanDevice(scanMode, list, new DeviceScanCallback() { // from class: ray.5
            @Override // com.huawei.devicesdk.callback.DeviceScanCallback
            public void scanResult(UniteDevice uniteDevice, byte[] bArr, String str, int i) {
                if (uniteDevice == null || uniteDevice.getDeviceInfo() == null) {
                    LogUtil.a("ScanDeviceUtils", "scanResult device is null,", " addition :", str, " status :", Integer.valueOf(i));
                    iBaseResponseCallback.a(22, null);
                    return;
                }
                try {
                    rbe rbeVar = new rbe();
                    rbeVar.c(uniteDevice.getDeviceInfo().getDeviceName());
                    rbeVar.a(uniteDevice.getDeviceInfo().getDeviceMac());
                    cmu cmuVar = (cmu) new Gson().fromJson(str, cmu.class);
                    if (ray.e(rbeVar, cmuVar)) {
                        return;
                    }
                    if (ray.b(rbeVar, cmuVar)) {
                        LogUtil.a("ScanDeviceUtils", "isHideByProduct true");
                        return;
                    }
                    ReleaseLogUtil.d("R_ScanDeviceUtils", "scanResult name:", uniteDevice.getDeviceInfo().getDeviceName(), " addition :", str, " status :", Integer.valueOf(i));
                    int iAbs = Math.abs(cmuVar.d());
                    LogUtil.a("ScanDeviceUtils", "scanResult rssi:", Integer.valueOf(iAbs));
                    rbeVar.e(iAbs);
                    rbeVar.a(cmuVar.c());
                    iBaseResponseCallback.a(0, rbeVar);
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("ScanDeviceUtils", "scanResult JsonSyntaxException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(rbe rbeVar, cmu cmuVar) {
        eds edsVar;
        List<eds> deviceInfoByBluetooth = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(rbeVar.c());
        if (!njy.e(deviceInfoByBluetooth) && (edsVar = deviceInfoByBluetooth.get(0)) != null && !TextUtils.isEmpty(edsVar.s()) && edsVar.s().startsWith("wear_")) {
            LogUtil.a("ScanDeviceUtils", "scanResult is wear device, bt type: ", Integer.valueOf(edsVar.c()), " scan bt type: ", Integer.valueOf(cmuVar.c()));
            if (a(edsVar.c(), cmuVar.c())) {
                LogUtil.a("ScanDeviceUtils", "scanResult need intercept");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(rbe rbeVar, cmu cmuVar) {
        List<eds> deviceInfoByBluetooth = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(rbeVar.c());
        if (njy.e(deviceInfoByBluetooth)) {
            LogUtil.j("ScanDeviceUtils", "isHideByProduct infoBeans is null");
            return false;
        }
        eds edsVar = deviceInfoByBluetooth.get(0);
        if (edsVar != null && !TextUtils.isEmpty(edsVar.s()) && edsVar.s().startsWith("wear_")) {
            LogUtil.a("ScanDeviceUtils", "isHideByProduct info.getDeviceName():", edsVar.n(), "; item.getDeviceName():", rbeVar.c());
            if (cmuVar.c() == 2) {
                return !(!"IDS_huawei_watch_gt_series".equals(edsVar.n()) || rbeVar.c().startsWith("fortuna-") || rbeVar.c().startsWith("HUAWEI WATCH GT-")) || rbeVar.c().startsWith("HUAWEI Yoda-") || rbeVar.c().startsWith("HUAWEI WATCH FIT 2-") || rbeVar.c().startsWith("HUAWEI WATCH B5-") || rbeVar.c().startsWith("HUAWEI WATCH B7-") || rbeVar.c().startsWith("HUAWEI WATCH FIT 3-") || rbeVar.c().startsWith("HUAWEI SOLO-") || rbeVar.c().startsWith("HUAWEI WATCH D2-") || rbeVar.c().startsWith("HUAWEI LUCA-") || rbeVar.c().startsWith("HUAWEI WATCH FIT 4-") || rbeVar.c().startsWith("HUAWEI SEIYA-") || rbeVar.c().startsWith("HUAWEI Band 11-") || rbeVar.c().startsWith("HUAWEI Band Candy-") || rbeVar.c().startsWith("HUAWEI Band 11 Pro-") || rbeVar.c().startsWith("HUAWEI Band CandyPro-") || rbeVar.c().startsWith("HUAWEI Band HA5B0-") || rbeVar.c().startsWith("HUAWEI NIKI-") || rbeVar.c().startsWith("HUAWEI WATCH FIT 5-") || rbeVar.c().startsWith("HUAWEI WATCH FIT 5 Pro-") || rbeVar.c().startsWith("HUAWEI RIVA-") || rbeVar.c().startsWith("HUAWEI WATCH D3-") || rbeVar.c().startsWith("HUAWEI NIKI Pro-") || rbeVar.c().startsWith("HUAWEI KITA-");
            }
        }
        return false;
    }

    public static void a(List<cmy> list, IBaseResponseCallback iBaseResponseCallback) {
        qtx qtxVar = new qtx();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "ScanDeviceUtils");
        List<BluetoothDevice> listE = qtxVar.e();
        if (!njy.e(listE)) {
            a(list, listE, deviceList, iBaseResponseCallback);
        }
        List<BluetoothDevice> listA = qtxVar.a();
        if (njy.e(listA)) {
            return;
        }
        a(list, listA, deviceList, iBaseResponseCallback);
    }

    private static void a(List<cmy> list, List<BluetoothDevice> list2, List<DeviceInfo> list3, IBaseResponseCallback iBaseResponseCallback) {
        for (BluetoothDevice bluetoothDevice : list2) {
            try {
                String name = bluetoothDevice.getName();
                String address = bluetoothDevice.getAddress();
                if (name != null && address != null && a(name, list) && !d(list3, name)) {
                    rbe rbeVar = new rbe();
                    rbeVar.c(name);
                    rbeVar.a(bluetoothDevice.getAddress());
                    rbeVar.a(bluetoothDevice.getType() == 3 ? 1 : bluetoothDevice.getType());
                    rbeVar.e(0);
                    iBaseResponseCallback.a(0, rbeVar);
                }
            } catch (SecurityException e) {
                LogUtil.e("ScanDeviceUtils", "handleCompare SecurityException:", ExceptionUtils.c(e));
                xjt.aj("get system bluetooth device exception ");
            }
        }
    }

    public static boolean a(String str, List<cmy> list) {
        if (njy.e(list)) {
            return false;
        }
        for (cmy cmyVar : list) {
            if (cmyVar != null || cmyVar.a() != null) {
                if (str.toLowerCase(Locale.ENGLISH).contains(cmyVar.a().toLowerCase(Locale.ENGLISH))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean d(List<DeviceInfo> list, String str) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<DeviceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().getDeviceName())) {
                LogUtil.a("ScanDeviceUtils", "isDeviceConnected name:", str);
                return true;
            }
        }
        return false;
    }
}
