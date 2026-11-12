package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mzn extends AbstractSyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f42760a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mzh f42761c;

    public mzn(DeviceInfo deviceInfo, mzh mzhVar, long j) {
        StringBuilder sb = new StringBuilder("DIC_SYNC_TASK ");
        sb.append(deviceInfo == null ? "" : deviceInfo.getDeviceName());
        sb.append("_");
        sb.append(mzhVar.a());
        sb.append("_");
        sb.append(j);
        super(sb.toString());
        this.f42760a = deviceInfo;
        this.f42761c = mzhVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("DataDicSyncTask", "startTask callback is null");
            return;
        }
        DeviceInfo deviceInfo = this.f42760a;
        if (deviceInfo == null) {
            LogUtil.j("DataDicSyncTask", "startTask deviceInfo is null");
            iBaseResponseCallback.a(-1, "");
        } else {
            LogUtil.a("DataDicSyncTask", "DataDicSyncTask start:", deviceInfo.getDeviceName());
            mzc.d().e(this.f42760a, this.f42761c, iBaseResponseCallback);
            LogUtil.a("DataDicSyncTask", "DataDicSyncTask End");
        }
    }
}
