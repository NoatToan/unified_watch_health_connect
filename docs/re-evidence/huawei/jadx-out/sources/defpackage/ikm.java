package defpackage;

import android.os.Bundle;
import com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler;
import com.huawei.health.threeCircle.remind.model.OnRemindHandle;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.LogUtil;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class ikm extends BaseWeekMonthDataHandler implements OnRemindHandle {
    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void destroy() {
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public boolean isActiveTrigger() {
        return false;
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void registerAlarm() {
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Map<String, Integer> map, ikp ikpVar) {
        acquireSummaryData(map, ikpVar, DateFormatUtil.a(lsl.e(System.currentTimeMillis(), 2, -1), TimeZone.getDefault()));
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Bundle bundle, Map<String, Integer> map, ikp ikpVar) {
        if (bundle == null) {
            LogUtil.e("R_TC_WeekSummaryHandler", "onTrigger data = null");
        } else {
            acquireSummaryData(map, ikpVar, bundle.getInt("reportDate"));
        }
    }

    @Override // com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler
    public String getLogTag() {
        return "R_TC_WeekSummaryHandler";
    }

    @Override // com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler
    public String getQueryType() {
        return "weekReport";
    }
}
