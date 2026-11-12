package defpackage;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.common.DeviceConfigInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mml extends mmb {
    @Override // defpackage.mmb, com.huawei.hwdevice.phoneprocess.mgr.common.DataSender
    public void send(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        c(deviceInfo, obj);
    }

    private static void c(DeviceInfo deviceInfo, Object obj) {
        if (d(obj)) {
            ppz ppzVar = (ppz) qqt.e(((HiSampleConfig) ((List) obj).get(0)).getConfigData(), ppz.class);
            ReleaseLogUtil.d("R_FtpDataSender", "sendFtpData:", ppzVar);
            if (ppzVar == null) {
                d(deviceInfo, null, obj);
                return;
            } else {
                d(deviceInfo, ppzVar, obj);
                return;
            }
        }
        d(deviceInfo, null, obj);
    }

    private static void d(final DeviceInfo deviceInfo, final ppz ppzVar, final Object obj) {
        ppv.d().b(new UiCallback<pqc>() { // from class: mml.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                if (ppzVar != null) {
                    mmb.a(deviceInfo, obj, DeviceConfigInfo.FtpDevice.getSrcPkgName(), DeviceConfigInfo.FtpDevice.getWearPkgName());
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pqc pqcVar) {
                mml.b(pqcVar, ppzVar, deviceInfo, obj);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(pqc pqcVar, ppz ppzVar, DeviceInfo deviceInfo, Object obj) {
        ppz ppzVarE;
        if (pqcVar == null) {
            if (ppzVar != null) {
                a(deviceInfo, obj, DeviceConfigInfo.FtpDevice.getSrcPkgName(), DeviceConfigInfo.FtpDevice.getWearPkgName());
            }
        } else {
            if (ppzVar == null) {
                ppzVarE = ppv.a(pqcVar.b());
            } else {
                ppzVarE = ppv.e(pqcVar.b(), ppzVar);
            }
            qhq.d("9002", "900200036", HiJsonUtil.d(ppzVarE), new HiDataOperateListener() { // from class: mmq
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj2) {
                    ReleaseLogUtil.d("FtpDataSender", "sendPowerZoneForCloud errorCode:", Integer.valueOf(i));
                }
            }, pqcVar.d());
        }
    }
}
