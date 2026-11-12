package defpackage;

import android.os.RemoteException;
import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbe implements EventProcessor {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor
    public void handleSampleEvent(eee eeeVar, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        LogUtil.a("LINKAGE_Event_SportStartProcessor", "handleSampleEvent eventData = ", eeq.e(eeeVar.c()));
        try {
            cql.c cVarA = new cql().a(eeeVar.c(), 0);
            long jD = cVarA.d((byte) 1, -1L);
            int iD = (int) cVarA.d((byte) 2, -1L);
            LogUtil.a("LINKAGE_Event_SportStartProcessor", "handle workoutType = ", Integer.valueOf(iD), ", linkageTimeStamp =", Long.valueOf(jD));
            if (linkageDeviceCommandListener == null) {
                ReleaseLogUtil.d("R_LINKAGE_Event_SportStartProcessor", "startSport mDeviceCommandListener null");
                naq.a(iD, Integer.MAX_VALUE, 201);
                return;
            }
            try {
                ReleaseLogUtil.d("R_LINKAGE_Event_SportStartProcessor", "startSport start");
                linkageDeviceCommandListener.start(iD);
            } catch (RemoteException unused) {
                ReleaseLogUtil.d("R_LINKAGE_Event_SportStartProcessor", "startSport RemoteException");
                naq.a(iD, Integer.MAX_VALUE, 201);
            }
        } catch (cpy unused2) {
            ReleaseLogUtil.a("R_LINKAGE_Event_SportStartProcessor", "handle event device tlv error");
        }
    }
}
