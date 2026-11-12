package defpackage;

import android.provider.Settings;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxs implements DataReceiveCallback {

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final mxs f42666b = new mxs();
    }

    private mxs() {
    }

    public static mxs a() {
        return b.f42666b;
    }

    public void c() {
        edc.e().registerDeviceSampleListener("hw.app.settingsprovider", this);
        mxx.b(BaseApplication.b().getContentResolver(), new myb(null), "device_retail_warehouse");
        LogUtil.a("HwStorePutBackManager", "registerDeviceSampleListener success");
    }

    public void d() {
        edc.e().unRegisterDeviceSampleListener("hw.app.settingsprovider");
        mxx.e(BaseApplication.b());
        LogUtil.a("HwStorePutBackManager", "unRegisterDeviceSampleListener success");
    }

    public void e() {
        if (Utils.n() && !Utils.o()) {
            edc.e().sendSampleEventCommand(b(), h(), "HwStorePutBackManager");
        } else {
            LogUtil.a("HwStorePutBackManager", "sendStorePutBackEvent error");
        }
    }

    private eee h() {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.app.settingsprovider");
        eeeVar.setWearPkgName("hw.watch.retailmode");
        eeeVar.setCommandId(2);
        eeeVar.a(800100010L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(j()));
        return eeeVar;
    }

    private String j() {
        int i;
        try {
            i = Settings.Secure.getInt(BaseApplication.b().getContentResolver(), "device_retail_warehouse");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            i = 0;
        }
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a("Settings.Secure");
        sb.append(eeq.d(1) + eeq.b(strA.length() / 2) + strA);
        String strA2 = eeq.a("RETAILMODE_PUTBACK");
        sb.append(eeq.d(2) + eeq.b(strA2.length() / 2) + strA2);
        String strA3 = eeq.a("int");
        sb.append(eeq.d(3) + eeq.b(strA3.length() / 2) + strA3);
        String strD = eeq.d(i);
        sb.append(eeq.d(6) + eeq.b(strD.length() / 2) + strD);
        LogUtil.a("HwStorePutBackManager", "getEventData tlv:", sb.toString());
        return sb.toString();
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("HwStorePutBackManager", "errorCode is ", Integer.valueOf(i));
        if (deviceInfo == null || eecVar == null) {
            LogUtil.e("HwStorePutBackManager", "onDataReceived, deviceInfo or message is null");
            return;
        }
        if (!(eecVar instanceof eee)) {
            LogUtil.e("HwStorePutBackManager", "onDataReceived, message is error");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (eecVar.getCommandId() != 2) {
            LogUtil.e("HwStorePutBackManager", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
            return;
        }
        if (eeeVar.d() != 800100010) {
            LogUtil.e("HwStorePutBackManager", "onDataReceived, sampleEvent EventId is error");
            return;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC == null) {
            LogUtil.e("HwStorePutBackManager", "onDataReceived, eventData is null");
        } else {
            LogUtil.a("HwStorePutBackManager", "onDataReceived data:", eeq.d(eeq.e(bArrC)));
        }
    }

    public static DeviceInfo b() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwStorePutBackManager");
        if (deviceList != null && !deviceList.isEmpty()) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        LogUtil.a("HwStorePutBackManager", "getConnectDeviceInfo() deviceInfo ", deviceInfo);
        return deviceInfo;
    }
}
