package defpackage;

import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ibi {
    public static void b(List<WorkoutRecord> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_ShowPlanHelper", "workoutRecords == null || workoutRecords.size() == 0");
        } else {
            ibh.b((WorkoutRecord[]) list.toArray(new WorkoutRecord[list.size()]));
        }
    }
}
