package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.collection.ArrayMap;
import com.mi.health.exercise.widget.GoalHelper;
import com.mi.health.router.business.IntentHelper;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.lifecycle.IDataHandler;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class rdo implements IDataHandler<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f32449b;
    public final Map<String, Object> c;

    public rdo(Context context, String[] strArr, String str) {
        Logger.i("StepBriefDatHandler", "StepBriefDatHandler init projection" + Arrays.toString(strArr) + "/callPackage:" + str);
        this.f32448a = context;
        this.f32449b = strArr;
        ArrayMap arrayMap = new ArrayMap();
        this.c = arrayMap;
        arrayMap.put("action_uri", IntentHelper.INSTANCE.getRouterIntentByAction("steps").toUri(1));
    }

    public final int a(Integer num, Integer num2) {
        if (num2.intValue() == 0 && num.intValue() == 0) {
            return ezi.F;
        }
        if (num.intValue() >= num2.intValue()) {
            return ezi.o;
        }
        return Calendar.getInstance().get(11) >= 20 ? ezi.p : ezi.q;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Cursor onDataReady(IDataHandler.DataSet dataSet) {
        int distance;
        int steps;
        int calories;
        int duration;
        Map map = (Map) dataSet.get("step");
        if (map != null) {
            HomeDataType homeDataType = HomeDataType.STEP;
            if (map.containsKey(homeDataType)) {
                Object obj = map.get(homeDataType);
                if (obj instanceof DailyStepReport) {
                    DailyStepReport dailyStepReport = (DailyStepReport) obj;
                    steps = dailyStepReport.getSteps();
                    distance = dailyStepReport.getDistance();
                } else {
                    distance = 0;
                    steps = 0;
                }
            } else {
                distance = 0;
                steps = 0;
            }
        } else {
            distance = 0;
            steps = 0;
        }
        Map map2 = (Map) dataSet.get("calorie");
        if (map2 != null) {
            HomeDataType homeDataType2 = HomeDataType.CALORIE;
            if (map2.containsKey(homeDataType2)) {
                Object obj2 = map2.get(homeDataType2);
                if (obj2 instanceof DailyCalorieReport) {
                    calories = ((DailyCalorieReport) obj2).getCalories();
                } else {
                    calories = 0;
                }
            } else {
                calories = 0;
            }
        } else {
            calories = 0;
        }
        Map map3 = (Map) dataSet.get("strength");
        if (map3 != null) {
            HomeDataType homeDataType3 = HomeDataType.MH_STRENGTH;
            if (map3.containsKey(homeDataType3)) {
                Object obj3 = map3.get(homeDataType3);
                if (obj3 instanceof DailyMHStrengthReport) {
                    duration = ((DailyMHStrengthReport) obj3).getDuration();
                } else {
                    duration = 0;
                }
            } else {
                duration = 0;
            }
        } else {
            duration = 0;
        }
        int goalValue = GoalHelper.INSTANCE.getGoalValue(1, AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false).getRegularGoalList());
        this.c.put("steps", Integer.valueOf(steps));
        this.c.put("distance", Float.valueOf(xr5.e(2, distance / 1000.0f)));
        this.c.put("energy", Integer.valueOf(calories));
        this.c.put("strength_duration", Integer.valueOf(duration));
        this.c.put(FitnessPersistKey.Rainbow, Integer.valueOf(goalValue));
        this.c.put("summary", this.f32448a.getString(a(Integer.valueOf(steps), Integer.valueOf(goalValue))));
        Logger.i("StepBriefDatHandler", "map result" + this.c.toString());
        return yc5.a(this.c, this.f32449b);
    }
}
