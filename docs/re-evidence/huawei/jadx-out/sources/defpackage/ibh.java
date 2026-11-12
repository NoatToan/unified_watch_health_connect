package defpackage;

import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class ibh {
    public static void b(WorkoutRecord[] workoutRecordArr) {
        if (workoutRecordArr == null || workoutRecordArr.length == 0) {
            return;
        }
        gzg gzgVar = new gzg(0);
        for (WorkoutRecord workoutRecord : workoutRecordArr) {
            if (workoutRecord != null) {
                b(workoutRecord, gzgVar);
            }
        }
    }

    private static void b(WorkoutRecord workoutRecord, gzg gzgVar) {
        if (e(workoutRecord.acquireWorkoutName())) {
            int iJ = CommonUtil.j(workoutRecord.acquireWorkoutName());
            workoutRecord.saveWorkoutName(gzgVar.e(iJ));
            LogUtil.d("ShowPlanHelper", "replacePlanPlaceHodler workoutRecord name:", Integer.valueOf(iJ), " to ", workoutRecord.acquireWorkoutName());
        }
    }

    private static boolean e(String str) {
        return str != null && Pattern.compile("[0-9]+").matcher(str).matches();
    }
}
