package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cgm extends AbstractSyncTask {
    public cgm() {
        super("RQ_DATA_SYNC_TASK");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("Track_RqDataSyncTask", "RqDataSyncTask start");
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_RqDataSyncTask", "callback is null");
            return;
        }
        if (!a()) {
            ReleaseLogUtil.d("Track_RqDataSyncTask", "device not support");
            iBaseResponseCallback.a(0, "");
        } else {
            gcn.c().pushRqData(ieg.b(new Date(System.currentTimeMillis())));
            iBaseResponseCallback.a(0, "");
            LogUtil.a("Track_RqDataSyncTask", "RqDataSyncTask End");
        }
    }

    private boolean a() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "Track_RqDataSyncTask");
        if (deviceList != null && deviceList.size() > 0) {
            deviceInfo = deviceList.get(0);
        }
        return eey.d(deviceInfo, 53);
    }
}
