package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mzs extends AbstractSyncTask {
    public mzs() {
        super("DFX_NOTIFY_TASK");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        mjq.e();
        ReleaseLogUtil.d("Dfx_NotifyDfxTask", "task end");
        iBaseResponseCallback.a(0, "dfx notify success.");
    }
}
