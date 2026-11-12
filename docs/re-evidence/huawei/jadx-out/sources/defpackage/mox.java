package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mox implements DataReceiveCallback {
    public static mox e() {
        return e.e;
    }

    private mox() {
    }

    public void d() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.agreementinfo", this);
    }

    public void a(DeviceInfo deviceInfo) {
        d();
        LogUtil.a("HwAcquireAgreementMgr", "sendAcquireAgreementCommand isSuccess: ", Boolean.valueOf(edc.e().sendSampleEventCommand(deviceInfo, b(), "HwAcquireAgreementMgr")));
    }

    private eee b() {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.agreementinfo");
        eeeVar.setWearPkgName("hw.watch.agreementinfo");
        eeeVar.setCommandId(2);
        eeeVar.a(800100035L);
        eeeVar.a(0);
        return eeeVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.agreementinfo");
        if (deviceInfo == null) {
            LogUtil.j("HwAcquireAgreementMgr", "onDataReceived deviceInfo is null");
            return;
        }
        ReleaseLogUtil.e("DEVMGR_HwAcquireAgreementMgr", "get SampleEvent message success");
        if (!(eecVar instanceof eee)) {
            LogUtil.j("HwAcquireAgreementMgr", "onDataReceived sampleBase not instanceof SampleEvent");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (b(eeeVar)) {
            String strD = eeq.d(eeq.e(eeeVar.c()));
            LogUtil.j("HwAcquireAgreementMgr", "harmonyAgreementUrl: ", strD);
            mii.d(deviceInfo.getDeviceIdentify(), strD);
        }
    }

    private boolean b(eee eeeVar) {
        if (!eeeVar.getSrcPkgName().equals("hw.watch.agreementinfo")) {
            LogUtil.j("HwAcquireAgreementMgr", "wearPkgName not match.");
            return false;
        }
        if (eeeVar.getCommandId() != 2) {
            LogUtil.j("HwAcquireAgreementMgr", "command not match.");
            return false;
        }
        if (eeeVar.d() != 800100035) {
            LogUtil.j("HwAcquireAgreementMgr", "eventId not match.");
            return false;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        LogUtil.j("HwAcquireAgreementMgr", "sampleEvent data is empty.");
        return false;
    }

    static class e {
        private static mox e = new mox();
    }
}
