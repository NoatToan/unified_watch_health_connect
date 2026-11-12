package defpackage;

import com.google.gson.JsonObject;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.time.Instant;
import java.time.zone.ZoneOffsetTransition;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class mvq implements DataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xgt f42518c;

    private mvq() {
        xgt xgtVarB = xgt.b();
        this.f42518c = xgtVarB;
        xgtVarB.a(BaseApplication.getContext());
    }

    public static mvq c() {
        return e.f42519b;
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final mvq f42519b = new mvq();
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.dstsync", this);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("HwUniteDeviceDstSyncMgr", "onDataReceived enter");
        if (deviceInfo == null || eecVar == null) {
            LogUtil.a("HwUniteDeviceDstSyncMgr", "device or message is null.");
            return;
        }
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (eecVar.getCommandId() != 2) {
                LogUtil.j("HwUniteDeviceDstSyncMgr", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            if (eeeVar.d() != 800100020) {
                ReleaseLogUtil.d("Notify_HwUniteDeviceDstSyncMgr", "event id reported is not 800100020L");
            } else if (eeeVar.b() == 0) {
                d();
            } else {
                ReleaseLogUtil.d("Notify_HwUniteDeviceDstSyncMgr", "event Level reported is not 0");
            }
        }
    }

    public void d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwUniteDeviceDstSyncMgr");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("HwUniteDeviceDstSyncMgr", "isSupportSyncIcon deviceInfo is null");
            return;
        }
        if (!eey.d(deviceInfo, 84)) {
            LogUtil.j("HwUniteDeviceDstSyncMgr", "sendSampleEventCommand capability is not support.");
            return;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarC = xjf.c(e());
        if (cmgVarC == null) {
            LogUtil.j("HwUniteDeviceDstSyncMgr", "sendEventConfigCommand commandMessage is invalid.");
        } else {
            LogUtil.j("HwUniteDeviceDstSyncMgr", "sendSampleEventCommand command is ", eeq.e(cmgVarC.b()));
            this.f42518c.sendCommand(uniteDeviceD, cmgVarC);
        }
    }

    private static eee e() {
        long epochSecond;
        int totalSeconds;
        ZoneOffsetTransition zoneOffsetTransitionNextTransition = TimeZone.getDefault().toZoneId().getRules().nextTransition(Instant.now());
        if (zoneOffsetTransitionNextTransition == null) {
            ReleaseLogUtil.d("Notify_HwUniteDeviceDstSyncMgr", "sendTimeDstSyncInfoCommand  next dst is null");
            epochSecond = 0;
            totalSeconds = 0;
        } else {
            epochSecond = zoneOffsetTransitionNextTransition.toEpochSecond();
            totalSeconds = zoneOffsetTransitionNextTransition.getOffsetAfter().getTotalSeconds();
            ReleaseLogUtil.d("Notify_HwUniteDeviceDstSyncMgr", "sendTimeDstSyncInfoCommand  next dst timestamp is ", Long.valueOf(epochSecond), "; offset is :" + totalSeconds);
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("dst_in", Long.valueOf(epochSecond));
        jsonObject.addProperty("time_offset", Integer.valueOf(totalSeconds));
        String string = jsonObject.toString();
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.dstsync");
        eeeVar.setWearPkgName("hw.watch.dst.sync");
        eeeVar.setCommandId(2);
        eeeVar.a(800100020L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(eeq.a(string)));
        return eeeVar;
    }
}
