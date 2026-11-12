package defpackage;

import android.os.RemoteException;
import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbg implements EventProcessor {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor
    public void handleSampleEvent(eee eeeVar, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        if (linkageDeviceCommandListener == null) {
            ReleaseLogUtil.d("R_LINKAGE_Event_SportResumeProcessor", "resumeSport mDeviceCommandListener null");
            return;
        }
        LogUtil.a("LINKAGE_Event_SportResumeProcessor", "handleSampleEvent eventData = ", eeq.e(eeeVar.c()));
        try {
            cql.c cVarA = new cql().a(eeeVar.c(), 0);
            LogUtil.a("LINKAGE_Event_SportResumeProcessor", "handleLinkageEvent: workoutType = ", Integer.valueOf((int) cVarA.d((byte) 2, -1L)), ", linkageTimeStamp =", Long.valueOf(cVarA.d((byte) 1, -1L)));
            try {
                ReleaseLogUtil.d("R_LINKAGE_Event_SportResumeProcessor", "resumeSport start");
                linkageDeviceCommandListener.resume();
            } catch (RemoteException unused) {
                ReleaseLogUtil.d("R_LINKAGE_Event_SportResumeProcessor", "resumeSport RemoteException");
            }
        } catch (cpy unused2) {
            ReleaseLogUtil.a("R_LINKAGE_Event_SportResumeProcessor", "handle event device tlv error");
        }
    }
}
