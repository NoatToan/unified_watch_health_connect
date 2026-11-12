package defpackage;

import com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class qgp implements SamplePointAfterProcess {
    @Override // com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess
    public HiHealthData onSamplePointAfterProcess(HiHealthData hiHealthData, String str) {
        if (hiHealthData == null) {
            LogUtil.j("ActiveHourPointAfterProcess", "hiHealthData == null");
            return null;
        }
        long startTime = hiHealthData.getStartTime();
        hiHealthData.setStartTime(ieg.a(startTime));
        hiHealthData.setEndTime(ieg.d(startTime));
        LogUtil.a("ActiveHourPointAfterProcess", "onSamplePointAfterProcess activeHour data after ", Long.valueOf(hiHealthData.getStartTime()));
        return hiHealthData;
    }
}
