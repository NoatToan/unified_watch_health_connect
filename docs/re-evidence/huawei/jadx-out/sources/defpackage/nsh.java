package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.process.HiHealthProcess;

/* JADX INFO: loaded from: classes11.dex */
public class nsh implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        return null;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HiSyncOption preProcess(String str) {
        nrd nrdVar = (nrd) HiJsonUtil.d(str, nrd.class);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncId(System.currentTimeMillis());
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(nqj.a().b(nrdVar.e()));
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        return hiSyncOption;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.b()).synCloud(preProcess(str), null);
    }
}
