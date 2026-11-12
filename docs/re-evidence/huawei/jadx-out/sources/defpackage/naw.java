package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class naw implements SampelBaseHandler {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler
    public void handle(eec eecVar, LinkageDeviceCommandListener linkageDeviceCommandListener, IBaseCallback iBaseCallback) {
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            long jD = eeeVar.d();
            ReleaseLogUtil.d("R_LINKAGE_Event_SampleEventHandler", "handle eventId: ", Long.valueOf(jD));
            naz.d(Long.valueOf(jD)).handleSampleEvent(eeeVar, linkageDeviceCommandListener);
            return;
        }
        ReleaseLogUtil.d("R_LINKAGE_Event_SampleEventHandler", "message not SampleEvent");
    }
}
