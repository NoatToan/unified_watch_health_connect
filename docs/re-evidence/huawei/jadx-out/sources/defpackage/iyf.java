package defpackage;

import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;

/* JADX INFO: loaded from: classes10.dex */
public class iyf extends iye {
    @Override // defpackage.iye
    protected float c(ActivityCaloriesCalculateApi activityCaloriesCalculateApi, chg chgVar) {
        return Math.max(activityCaloriesCalculateApi != null ? (float) activityCaloriesCalculateApi.calculateCalories(System.currentTimeMillis(), chgVar) : 0.0f, 0.0f);
    }

    @Override // defpackage.iye
    protected String d() {
        return "Track_ActiveCalorieCalculate";
    }
}
