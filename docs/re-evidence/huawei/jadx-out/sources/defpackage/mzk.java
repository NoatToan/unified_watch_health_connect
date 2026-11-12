package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mzk extends mzp implements TaskInterface {
    public mzk(String str, String str2) {
        super(str, str2);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface
    public void handleEvent(DeviceInfo deviceInfo, eee eeeVar) {
        mqn.d().c().onDataReceived(0, deviceInfo, eeeVar);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface
    public void handlePoint(DeviceInfo deviceInfo, eea eeaVar) {
        List<eeb> listE = eeaVar.e();
        LogUtil.b("MatterTask", "device is ", deviceInfo.getDeviceName(), " id: ", Long.valueOf(eeaVar.c()), " listSize: ", Integer.valueOf(listE.size()));
        mzb.e().b(listE, eeaVar, deviceInfo);
    }
}
