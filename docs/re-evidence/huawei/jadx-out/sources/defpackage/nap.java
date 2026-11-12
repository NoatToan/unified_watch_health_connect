package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nap implements DataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f42833c = 0;
    private LinkageDeviceCommandListener d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseCallback f42832a = null;

    public void d(LinkageDeviceCommandListener linkageDeviceCommandListener) {
        ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "registerDeviceCommandListener :", linkageDeviceCommandListener);
        this.d = linkageDeviceCommandListener;
    }

    public void d(IBaseCallback iBaseCallback) {
        ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "registerLinkageDeviceDataListener :", iBaseCallback);
        this.f42832a = iBaseCallback;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (i != 100000) {
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "onDataReceived errCode is error");
            return;
        }
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "onDataReceived deviceInfo or sampleBase is null.");
            return;
        }
        String srcPkgName = eecVar.getSrcPkgName();
        String wearPkgName = eecVar.getWearPkgName();
        LogUtil.a("LINKAGE_LinkageDeviceChannel", "onDataReceived srcPkgNam: ", srcPkgName, ", wearPkgName:", wearPkgName);
        if (!b(srcPkgName, wearPkgName)) {
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "onDataReceived pkg error srcPkgNam: ", srcPkgName, ", wearPkgName:", wearPkgName);
        } else {
            nav.a(eecVar).handle(eecVar, this.d, this.f42832a);
        }
    }

    public void d(DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.a("LINKAGE_LinkageDeviceChannel", "sendSampleEventToDevice operationType=", Integer.valueOf(i), " workoutType=", Integer.valueOf(i2));
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "sendSampleEventToDevice deviceInfo null");
            return;
        }
        if (!edc.e().sendSampleEventCommand(deviceInfo, nbn.d(i).createSampleEvent(i2, null), "LINKAGE_LinkageDeviceChannel")) {
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "sendSampleEventToDevice failed operationType=", Integer.valueOf(i), " workoutType=", Integer.valueOf(i2));
        }
        if (i == 102 || i == 204) {
            nfl.e(false);
        }
    }

    public void e(DeviceInfo deviceInfo, int i, String str, int i2) {
        LogUtil.a("LINKAGE_LinkageDeviceChannel", "replyDevice operationType=", Integer.valueOf(i), "replyCode: ", str, " workoutType=", Integer.valueOf(i2));
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "sendSampleEventToDevice deviceInfo null");
            return;
        }
        eee eeeVarCreateSampleEvent = nbn.e(i, str).createSampleEvent(i2, str);
        if (eeeVarCreateSampleEvent.d() != Long.MAX_VALUE) {
            if (edc.e().sendSampleEventCommand(deviceInfo, eeeVarCreateSampleEvent, "LINKAGE_LinkageDeviceChannel")) {
                return;
            }
            ReleaseLogUtil.e("R_LINKAGE_LinkageDeviceChannel", "replyDevice failed operationType=", Integer.valueOf(i), "replyCode: ", str, " workoutType=", Integer.valueOf(i2));
            return;
        }
        ReleaseLogUtil.d("R_LINKAGE_LinkageDeviceChannel", "sendSampleEventToDevice sampleEvent null");
    }

    private boolean b(String str, String str2) {
        return "hw.sport.linkage.device".equals(str) && "hw.sport.linkage.app".equals(str2);
    }
}
