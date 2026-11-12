package defpackage;

import android.os.RemoteException;
import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nba implements EventProcessor {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor
    public void handleSampleEvent(eee eeeVar, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        LogUtil.a("LINKAGE_Event_LinkageProcessor", "handleSampleEvent eventData = ", eeq.e(eeeVar.c()));
        try {
            cql.c cVarA = new cql().a(eeeVar.c(), 0);
            int iD = cVarA.d((byte) 1, -1);
            int iD2 = cVarA.d((byte) 2, -1);
            long jD = cVarA.d((byte) 3, -1L);
            int iD3 = cVarA.d((byte) 4, -1);
            int iD4 = cVarA.d((byte) 5, -1);
            LogUtil.a("LINKAGE_Event_LinkageProcessor", "handle workoutType = ", Integer.valueOf(iD), ", linkageOperation =", Integer.valueOf(iD2), ", linkageTimeStamp =", Long.valueOf(jD), ", replyCode =", Integer.valueOf(iD3), ", currentSportStatus =", Integer.valueOf(iD4));
            nau.c().a(iD);
            e(iD2, iD, iD4, linkageDeviceCommandListener);
        } catch (cpy unused) {
            ReleaseLogUtil.a("R_LINKAGE_Event_LinkageProcessor", "handle event device tlv error");
        }
    }

    private void e(int i, int i2, int i3, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        if (i == 0) {
            d(i2, i3, linkageDeviceCommandListener);
            return;
        }
        if (i == 1) {
            a(linkageDeviceCommandListener);
        } else if (i == 2) {
            c(i2, i3, linkageDeviceCommandListener);
        } else {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "getCommandId nothing");
        }
    }

    private void d(int i, int i2, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        if (linkageDeviceCommandListener == null) {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "startLinkage mDeviceCommandListener null");
            naq.a(i, i2, 100);
            return;
        }
        try {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "startLinkage start");
            linkageDeviceCommandListener.startLinkage(i, i2);
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "startLinkage end");
        } catch (RemoteException unused) {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "startLinkage RemoteException");
            naq.a(i, i2, 100);
        }
    }

    private void c(int i, int i2, LinkageDeviceCommandListener linkageDeviceCommandListener) {
        if (linkageDeviceCommandListener == null) {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "startLinkage mDeviceCommandListener null");
            naq.a(i, i2, 101);
            return;
        }
        try {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "resumeLinkage start");
            linkageDeviceCommandListener.resumeLinkage(i, i2);
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "resumeLinkage end");
        } catch (RemoteException unused) {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "resumeLinkage RemoteException");
            naq.a(i, i2, 101);
        }
    }

    private void a(LinkageDeviceCommandListener linkageDeviceCommandListener) {
        if (linkageDeviceCommandListener == null) {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "startLinkage mDeviceCommandListener null");
            return;
        }
        try {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "stopLinkage start");
            linkageDeviceCommandListener.stopLinkage();
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "stopLinkage end");
        } catch (RemoteException unused) {
            ReleaseLogUtil.d("R_LINKAGE_Event_LinkageProcessor", "stopLinkage RemoteException");
        }
    }
}
