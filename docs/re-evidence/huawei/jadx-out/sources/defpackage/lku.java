package defpackage;

import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lku extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile lku f40375a;
    private static final Object e = new Object();

    private lku() {
        super(BaseApplication.getContext());
    }

    public static lku a() {
        LogUtil.a("HwMedalMessageManager", "HwMedalMessageManager getInstance.");
        if (f40375a == null) {
            synchronized (e) {
                if (f40375a == null) {
                    f40375a = new lku();
                }
            }
        }
        return f40375a;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.j("HwMedalMessageManager", "onReceiveDeviceCommand code：", Integer.valueOf(i));
        if (i == 207 || i == 206) {
            return;
        }
        prd.a().receiveFromDevice(i, xiuVar);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.MEDAL_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        LogUtil.a("HwMedalMessageManager", "getWearPkgName: ", "com.huawei.sport.dailytrack");
        return "com.huawei.sport.dailytrack";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        LogUtil.a("HwMedalMessageManager", "getWearFingerprint SportWatchType: ", Integer.valueOf(c()), " WatchType: ", Integer.valueOf(e()));
        if (c() == 1 || e() == 1) {
            if (c(155)) {
                LogUtil.a("HwMedalMessageManager", "getWearFingerprint=", "11CC31B7123B2AA2E6AEBB54BD4789104F0979F598BC63F3C0EE68698F442869");
                return "11CC31B7123B2AA2E6AEBB54BD4789104F0979F598BC63F3C0EE68698F442869";
            }
            LogUtil.a("HwMedalMessageManager", "getWearFingerprint=", OfflineMapWearEngineManager.WEAR_FINGERPRINT);
            return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
        }
        if (c(155)) {
            LogUtil.a("HwMedalMessageManager", "getWearFingerprint: ", OfflineMapWearEngineManager.WEAR_FINGERPRINT);
            return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
        }
        LogUtil.a("HwMedalMessageManager", "getWearFingerprint: ", "11CC31B7123B2AA2E6AEBB54BD4789104F0979F598BC63F3C0EE68698F442869");
        return "11CC31B7123B2AA2E6AEBB54BD4789104F0979F598BC63F3C0EE68698F442869";
    }

    public int e() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HwMedalMessageManager");
        if (deviceInfo != null) {
            return d(deviceInfo) ? 1 : 0;
        }
        ReleaseLogUtil.a("HwMedalMessageManager", "getWatchType failed");
        return -1;
    }

    private boolean d(DeviceInfo deviceInfo) {
        if (eey.d(deviceInfo, 159)) {
            return true;
        }
        int productType = deviceInfo.getProductType();
        LogUtil.a("HwMedalMessageManager", "getProductType: ", Integer.valueOf(productType));
        return productType == 57 || productType == 78;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        if (connectState == ConnectState.CONNECTED) {
            prd.a().a(0);
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void sendComand(xiu xiuVar, SendCallback sendCallback) {
        super.sendComand(xiuVar, sendCallback);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void pingComand(PingCallback pingCallback, String str) {
        super.pingComand(pingCallback, str);
    }

    public static boolean c(int i) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwMedalMessageManager");
        if (njy.e(deviceList)) {
            LogUtil.j("HwMedalMessageManager", "isSupportCapability connected device list is isEmpty.");
            return false;
        }
        LogUtil.a("HwMedalMessageManager", "isSupportCapability deviceInfos: ", deviceList.toString());
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            if (eey.d(it.next(), i)) {
                LogUtil.a("HwMedalMessageManager", "isSupportCapability isSupportSportDevice", Integer.valueOf(i), true);
                return true;
            }
        }
        return false;
    }

    public static int c() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HwMedalMessageManager");
        if (deviceInfo == null) {
            LogUtil.j("HwMedalMessageManager", "isSportWatch deviceInfo is null!");
            return -1;
        }
        return deviceInfo.getSportVersion();
    }
}
