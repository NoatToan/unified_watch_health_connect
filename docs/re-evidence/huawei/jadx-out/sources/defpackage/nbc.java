package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbc implements EventProcessor {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor
    public void handleSampleEvent(eee eeeVar, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        ReleaseLogUtil.d("R_LINKAGE_Event_DefaultProcessor", "handleSampleEvent start");
    }
}
