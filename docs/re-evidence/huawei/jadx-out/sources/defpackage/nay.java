package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nay implements SampelBaseHandler {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler
    public void handle(eec eecVar, LinkageDeviceCommandListener linkageDeviceCommandListener, IBaseCallback iBaseCallback) {
        if (eecVar instanceof eef) {
            e((eef) eecVar);
        } else {
            ReleaseLogUtil.d("R_LINKAGE_Config_SamlpeConfigHandler", "message not SamplePoint");
        }
    }

    private void e(eef eefVar) {
        LogUtil.a("LINKAGE_Config_SamlpeConfigHandler", "handleSampleConfig sampleConfig = ", eefVar);
    }
}
