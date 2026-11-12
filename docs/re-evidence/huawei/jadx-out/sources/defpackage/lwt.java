package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.callback.WearPlaceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lwt implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static lwt f40989a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40990c = new Object();
    private WearPlaceCallback e;

    private lwt() {
    }

    public static lwt d() {
        lwt lwtVar;
        synchronized (f40990c) {
            if (f40989a == null) {
                f40989a = new lwt();
            }
            lwtVar = f40989a;
        }
        return lwtVar;
    }

    public void d(String str) {
        edc.e().registerDeviceSampleListener(str, this);
    }

    public void c(DeviceInfo deviceInfo, WearPlaceCallback wearPlaceCallback, String str) {
        this.e = wearPlaceCallback;
        d("hw.unitedevice.querywearplace");
        if (deviceInfo == null || !eey.d(deviceInfo, 78) || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwQueryWearPlaceMgr", "no send command");
            return;
        }
        if (edc.e().sendSampleConfigCommand(deviceInfo, b(), "HwQueryWearPlaceMgr " + str)) {
            return;
        }
        LogUtil.j("HwQueryWearPlaceMgr", "sendQueryWearPlaceCommand fail");
    }

    public void e(WearPlaceCallback wearPlaceCallback, String str) {
        this.e = wearPlaceCallback;
        d("hw.unitedevice.querywearplace");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwQueryWearPlaceMgr");
        if (deviceList == null || deviceList.size() <= 0) {
            return;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && eey.d(deviceInfo, 78)) {
                edc.e().sendSampleConfigCommand(deviceInfo, b(), "HwQueryWearPlaceMgr " + str);
            }
        }
    }

    private eef b() {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.querywearplace");
        eefVar.setWearPkgName("queryWearPlace");
        ArrayList arrayList = new ArrayList(5);
        eeg eegVar = new eeg();
        eegVar.b(900100001L);
        eegVar.b(2);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null || b(eecVar)) {
            LogUtil.j("HwQueryWearPlaceMgr", "device == null or isCheckSampleError");
            return;
        }
        if (eecVar instanceof eef) {
            LogUtil.a("HwQueryWearPlaceMgr", "onDataReceived");
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("HwQueryWearPlaceMgr", "onDataReceived sampleConfigInfos empty");
                return;
            }
            eeg eegVar = configInfoList.get(0);
            if (eegVar.d() == 2) {
                LogUtil.a("HwQueryWearPlaceMgr", deviceInfo.getDeviceName(), " sampleConfigInfo.getConfigData() = ", Integer.valueOf(CommonUtil.v(eeq.e(eegVar.e()))));
                int iV = CommonUtil.v(eeq.e(eegVar.e()));
                lwr.e().b(deviceInfo.getDeviceIdentify(), iV);
                WearPlaceCallback wearPlaceCallback = this.e;
                if (wearPlaceCallback != null) {
                    wearPlaceCallback.onResponse(deviceInfo, iV);
                }
            }
        }
    }

    private boolean b(eec eecVar) {
        if (eecVar == null) {
            LogUtil.a("HwQueryWearPlaceMgr", "sampleBase == null");
            return true;
        }
        if (eecVar.getCommandId() == 1 && "queryWearPlace".equals(eecVar.getSrcPkgName()) && "hw.unitedevice.querywearplace".equals(eecVar.getWearPkgName())) {
            return false;
        }
        LogUtil.j("HwQueryWearPlaceMgr", "message: ", eecVar.toString());
        return true;
    }
}
