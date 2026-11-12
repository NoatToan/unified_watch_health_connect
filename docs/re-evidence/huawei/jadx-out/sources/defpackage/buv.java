package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class buv extends AbstractSyncTask {
    public buv() {
        super("BLOOD_SUGAR_SYNC_TASK");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("BloodSugarSyncTask", "BloodSugarSyncTask start");
        if (iBaseResponseCallback == null) {
            LogUtil.j("BloodSugarSyncTask", "callback == null");
            return;
        }
        bum.c();
        iBaseResponseCallback.a(0, "");
        LogUtil.a("BloodSugarSyncTask", "BloodSugarSyncTask End");
    }
}
