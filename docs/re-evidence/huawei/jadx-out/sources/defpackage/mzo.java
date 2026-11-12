package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mzo extends AbstractSyncTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mzh f42762b;
    private DeviceInfo d;
    private IBaseResponseCallback e;

    public mzo(DeviceInfo deviceInfo, mzh mzhVar, long j, IBaseResponseCallback iBaseResponseCallback) {
        StringBuilder sb = new StringBuilder("DIC_SEQUENCE_SYNC_TASK ");
        sb.append(deviceInfo == null ? "" : deviceInfo.getDeviceName());
        sb.append("_");
        sb.append(mzhVar.a());
        sb.append("_");
        sb.append(j);
        super(sb.toString());
        this.d = deviceInfo;
        this.f42762b = mzhVar;
        this.e = iBaseResponseCallback;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("DataDicSequenceSyncTask", "startTask callback is null");
            return;
        }
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo != null) {
            LogUtil.a("DataDicSequenceSyncTask", "DataDicSequenceSyncTask start:", deviceInfo.getDeviceName());
            mvl.e().d(this.d, this.f42762b, iBaseResponseCallback, this.e);
            LogUtil.a("DataDicSequenceSyncTask", "DataDicSequenceSyncTask End");
        } else {
            ReleaseLogUtil.e("DEVMGR_DataDicSequenceSyncTask", "DataDicSequenceSyncTask device info is null");
            iBaseResponseCallback.a(-1, "");
        }
    }
}
