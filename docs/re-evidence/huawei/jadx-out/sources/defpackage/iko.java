package defpackage;

import android.os.Bundle;
import com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler;
import com.huawei.health.threeCircle.remind.model.OnRemindHandle;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class iko extends BaseWeekMonthDataHandler implements OnRemindHandle {
    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void destroy() {
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void registerAlarm() {
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Map<String, Integer> map, ikp ikpVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ikx.a("R_TC_WkEncrgHdlr", jCurrentTimeMillis) <= 0 || CommonUtil.cl() || ikpVar.a()) {
            acquireEncourageData(map, DateFormatUtil.a(jCurrentTimeMillis), ikpVar);
            ikx.a("R_TC_WkEncrgHdlr", jCurrentTimeMillis, 1);
        }
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public boolean isActiveTrigger() {
        return ikx.d(8, 12) && ikx.a();
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Bundle bundle, Map<String, Integer> map, ikp ikpVar) {
        if (bundle == null) {
            LogUtil.e("R_TC_WkEncrgHdlr", "onTrigger data = null");
        } else {
            acquireEncourageData(map, bundle.getInt("reportDate"), ikpVar);
        }
    }

    @Override // com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler
    public String getLogTag() {
        return "R_TC_WkEncrgHdlr";
    }

    @Override // com.huawei.health.threeCircle.remind.handler.BaseWeekMonthDataHandler
    public String getQueryType() {
        return "weekEncourage";
    }
}
