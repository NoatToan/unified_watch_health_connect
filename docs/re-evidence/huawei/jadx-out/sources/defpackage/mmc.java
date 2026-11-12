package defpackage;

import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mmc extends mmb {
    @Override // defpackage.mmb, com.huawei.hwdevice.phoneprocess.mgr.common.DataSender
    public void send(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        e(deviceInfo, obj, str, str2);
    }

    private static void e(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        LogUtil.a("BloodPressureRemindSender", "sendBloodPressureRemindData");
        if (d(obj)) {
            HiSampleConfig hiSampleConfig = (HiSampleConfig) ((List) obj).get(0);
            if (hiSampleConfig == null) {
                LogUtil.j("BloodPressureRemindSender", "getBloodPressureReminderPlan empty!");
                return;
            }
            mln.b().b(hiSampleConfig.getConfigData(), hiSampleConfig.getModifiedTime());
            LogUtil.a("BloodPressureRemindSender", "sendBloodPressureRemindData registerScheduleNextReminder");
            ((BloodPressureApi) Services.b("Main", BloodPressureApi.class)).registerScheduleNextReminder(false);
            return;
        }
        LogUtil.j("BloodPressureRemindSender", "getBloodPressureReminderPlan data match fail");
    }
}
