package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.threeCircle.remind.model.OnRemindHandle;
import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.health.threeCircle.remind.receiver.SportRemindReceiver;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.api.ThreeCircleApi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ikk implements OnRemindHandle {
    private int b(int i, int i2, int i3, int i4) {
        int i5 = i > 0 ? 1 : 0;
        if (i2 > 0) {
            i5++;
        }
        return i3 > 0 ? i5 + 1 : i5;
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(final Map<String, Integer> map, final ikp ikpVar) {
        if (ikpVar == null) {
            return;
        }
        if (ikx.a("TC_YestSummHdlr", System.currentTimeMillis()) <= 0 || CommonUtil.cl() || ikpVar.a()) {
            qhb.c().c(lsl.u(System.currentTimeMillis()), lsl.f(System.currentTimeMillis()), new ResponseCallback() { // from class: ikl
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f37744c.d(ikpVar, map, i, (List) obj);
                }
            });
        }
    }

    /* synthetic */ void d(ikp ikpVar, Map map, int i, List list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_TC_YestSummHdlr", "can not get yesterday three circle data.");
            ikpVar.onResponse(0, e(0, map));
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData == null) {
            ReleaseLogUtil.e("R_TC_YestSummHdlr", "get yesterday three circle data is null.");
            ikpVar.onResponse(0, e(0, map));
            return;
        }
        int i2 = hiHealthData.getInt("durationGoalState");
        int i3 = hiHealthData.getInt("activeGoalState");
        int i4 = hiHealthData.getInt("calorieGoalState");
        int i5 = hiHealthData.getInt("stepGoalState");
        ReleaseLogUtil.e("R_TC_YestSummHdlr", " intensityState:", Integer.valueOf(i2), " activeState:", Integer.valueOf(i3), " caloriesState:", Integer.valueOf(i4), " stepState:", Integer.valueOf(i5));
        ikpVar.onResponse(0, e(b(i2, i3, i4, i5), map));
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Bundle bundle, Map<String, Integer> map, ikp ikpVar) {
        LogUtil.a("TC_YestSummHdlr", "onTrigger data.");
    }

    private ThreeCircleRemindData e(int i, Map<String, Integer> map) {
        String str;
        Integer num;
        ThreeCircleRemindData.d dVar = new ThreeCircleRemindData.d();
        dVar.a("YesterdaySummary");
        dVar.a((map == null || (num = map.get("YesterdaySummary")) == null) ? 0 : num.intValue());
        if (i == 0) {
            str = "ZeroGoal";
        } else if (i == 1) {
            str = "OneGoal";
        } else if (i == 2) {
            str = "TwoGoals";
        } else {
            str = "All";
        }
        ThreeCircleApi threeCircleApi = (ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class);
        dVar.d(str);
        dVar.e(threeCircleApi.getPromptMessage(threeCircleApi.queryRules("YesterdaySummary", str), new HashMap()));
        ikx.a("TC_YestSummHdlr", System.currentTimeMillis(), 1);
        return dVar.c();
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void registerAlarm() {
        long timeInMillis = ikx.c(1, 8, 12).getTimeInMillis();
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) SportRemindReceiver.class);
        intent.putExtra("remindType", new String[]{"YesterdaySummary", "ActiveWeek", "PerfectWeek", "PerfectMonth"});
        try {
            if (Build.VERSION.SDK_INT > 30 && CommonUtil.bg()) {
                xjk.c(101011, intent, 335544320, 0, timeInMillis);
            } else {
                xjk.d(101011, intent, 335544320, 0, timeInMillis);
            }
            SharedPerferenceUtils.j(BaseApplication.b(), DateFormatUtil.a(System.currentTimeMillis()));
        } catch (IllegalStateException e) {
            SharedPerferenceUtils.j(BaseApplication.b(), -1);
            ReleaseLogUtil.a("TC_YestSummHdlr", "registerAlarm：", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public boolean isActiveTrigger() {
        return ikx.d(8, 12);
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void destroy() {
        LogUtil.a("TC_YestSummHdlr", "destroy");
    }
}
