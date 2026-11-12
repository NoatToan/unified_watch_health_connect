package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mym {
    public static int b(ees eesVar) {
        int iV = 0;
        if (eesVar == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_FitnessUnTlvSample", "unTlvGetBloodOxygenDownSampleFrameCount tlvFather is null");
            return 0;
        }
        for (eew eewVar : eesVar.e()) {
            if (CommonUtil.v(eewVar.e()) == 3) {
                iV = CommonUtil.v(eewVar.b());
            } else {
                LogUtil.d("FitnessUnTlvSample", "unTlvGetBloodOxygenDownSampleFrameCount else");
            }
        }
        LogUtil.a("FitnessUnTlvSample", "unTlvGetBloodOxygenDownSampleFrameCount count: ", Integer.valueOf(iV));
        return iV;
    }
}
