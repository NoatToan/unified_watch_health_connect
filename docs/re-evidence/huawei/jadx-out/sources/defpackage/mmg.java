package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mmg extends mmb {
    @Override // defpackage.mmb, com.huawei.hwdevice.phoneprocess.mgr.common.DataSender
    public void send(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        e(deviceInfo, obj, str, str2);
    }

    private static void e(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        if (d(obj)) {
            pqc pqcVar = (pqc) qqt.e(((HiSampleConfig) ((List) obj).get(0)).getConfigData(), pqc.class);
            ReleaseLogUtil.d("R_FtpDataSender", "sendFtpData:", pqcVar);
            if (pqcVar == null) {
                d();
                return;
            } else if (pqcVar.e() == 0) {
                a(deviceInfo, obj, str, str2);
                return;
            } else {
                d();
                return;
            }
        }
        d();
    }

    /* JADX INFO: renamed from: mmg$1, reason: invalid class name */
    class AnonymousClass1 implements ResultCallback<pqd> {
        AnonymousClass1() {
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(pqd pqdVar) {
            ReleaseLogUtil.d("R_FtpDataSender", "getFtpRecord:", pqdVar);
            if (pqdVar == null) {
                return;
            }
            pqe pqeVarD = pqdVar.d();
            if (pqeVarD == null) {
                ReleaseLogUtil.d("R_FtpDataSender", "ftpRecord == null");
                return;
            }
            pqc pqcVar = new pqc();
            pqcVar.c((int) Math.round(pqeVarD.d()));
            pqcVar.e(DateFormatUtil.d(pqeVarD.b()));
            pqcVar.e(1);
            pqcVar.d(0);
            qhq.d("9002", "900200037", HiJsonUtil.d(pqcVar), new HiDataOperateListener() { // from class: mmf
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    ReleaseLogUtil.d("FtpDataSender", "sendPowerZoneForCloud errorCode:", Integer.valueOf(i));
                }
            }, DateFormatUtil.d(pqeVarD.b()));
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            ReleaseLogUtil.e("R_FtpDataSender", "getFtpRecord onFailure", ExceptionUtils.c(th));
        }
    }

    private static void d() {
        ppv.d().d(new AnonymousClass1());
    }
}
