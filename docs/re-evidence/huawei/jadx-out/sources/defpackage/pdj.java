package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class pdj extends pcz {
    @Override // defpackage.pcz, com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse
    /* JADX INFO: renamed from: c */
    public FitWorkout parse(String str, JSONObject jSONObject) {
        FitWorkout fitWorkout = super.parse(str, jSONObject);
        int iE = ied.e();
        if (fitWorkout.getCourseAttr() != 2) {
            iE = fitWorkout.getCourseAttr();
        }
        LogUtil.a("Suggestion_VideoCourseWorkoutParse", "DataFitnessConvert toWorkout  CourseAttr:", Integer.valueOf(fitWorkout.getCourseAttr()), "workout:", fitWorkout.acquireName());
        if (iE == 0) {
            fitWorkout.saveDuration(jSONObject.optInt("durationMan"));
            fitWorkout.saveCalorie(jSONObject.optInt("calorieMan"));
            fitWorkout.saveDifficulty(jSONObject.optInt("difficultyMan"));
        }
        fitWorkout.setVideoProperty(jSONObject.optInt("videoProperty"));
        fitWorkout.setWorkoutActionProperty(jSONObject.optInt("workoutActionProperty"));
        fitWorkout.setShowCalories(jSONObject.optInt("showCalories"));
        fitWorkout.setShowCountdown(jSONObject.optInt("showCountdown"));
        fitWorkout.setShowHeartRate(jSONObject.optInt("showHeartRate"));
        fitWorkout.setFitnessGoal(jSONObject.optString("fitnessGoal"));
        return fitWorkout;
    }
}
