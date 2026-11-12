package defpackage;

import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.plan.model.PlanStat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gly {
    public static PlanStat d(JSONObject jSONObject) {
        PlanStat planStat = new PlanStat();
        if (jSONObject != null) {
            planStat.setBestRecordForFirstOneKm(jSONObject.optInt("103"));
            planStat.setFarthestRunning(ped.b(jSONObject.optInt("1")));
            planStat.setLongestRunning(jSONObject.optInt("2"));
            planStat.setBestRecordForOneKm(jSONObject.optInt("3"));
            planStat.setBestRecordForFiveKm(jSONObject.optInt("4"));
            planStat.setBestRecordForTenKm(jSONObject.optInt("5"));
            planStat.setBestRecordForHalfMarathon(jSONObject.optInt("6"));
            planStat.setBestRecordForMarathon(jSONObject.optInt("7"));
            planStat.saveLongestTimePerWeek(jSONObject.optInt("8"));
            planStat.saveMostCaloriePerWeek((float) jSONObject.optDouble("9"));
            planStat.saveMostWorkoutTimes(jSONObject.optInt("10"));
            planStat.setMostWorkoutName(jSONObject.optString(MessageConstant.CERTIFICATE));
            planStat.saveHighestCompleteRate(ped.a((float) jSONObject.optDouble("11", 0.0d)));
        }
        return planStat;
    }
}
