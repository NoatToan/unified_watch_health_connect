package defpackage;

import android.content.Context;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hjx {
    public static void d(Context context, WorkoutRecord workoutRecord) {
        FitWorkout workout;
        if (context == null || workoutRecord == null) {
            LogUtil.j("Suggestion_LongCoachDataHelper", "saveFitnessDataToOdmf context or record is null");
            return;
        }
        SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
        if (sportServiceApi == null || (workout = sportServiceApi.getWorkout(workoutRecord.acquireWorkoutId())) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        Iterator<Attribute> it = workout.acquireClasses().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getName());
            sb.append(",");
        }
        if (sb.length() >= 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        StringBuilder sb2 = new StringBuilder(16);
        Iterator<Attribute> it2 = workout.acquireTrainingpoints().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next().getName());
            sb2.append(",");
        }
        if (sb2.length() >= 1) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        int duration = workoutRecord.getDuration() / 1000;
        String strD = DateFormatUtil.d(workoutRecord.acquireExerciseTime() - (((long) duration) * 1000), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT);
        int iCeil = (int) Math.ceil(((double) workoutRecord.acquireActualCalorie()) / 1000.0d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", 1001);
            jSONObject.put("SportStartTime", strD);
            jSONObject.put("SportDuration", duration);
            jSONObject.put("HeatQuantity", iCeil);
            jSONObject.put("BodyBuildingType", sb.toString());
            jSONObject.put("BodyBuildingPart", sb2.toString());
            ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).saveTrackDataToOdmf(jSONObject.toString());
        } catch (JSONException e) {
            LogUtil.e("Suggestion_LongCoachDataHelper", "Jsons parse error:", LogAnonymous.b(e));
        }
    }
}
