package com.huawei.ui.main.stories.fitness.interactors;

import android.app.Activity;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import defpackage.lmf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class ClassifiedViewsBIMarker {

    public enum Type {
        DayView,
        WeekView,
        MonthView,
        YearView
    }

    public static void d(Activity activity, Type type) {
        HashMap map = new HashMap();
        String strB = FitnessUtils.b(activity.getClass().getSimpleName());
        map.put("click", "1");
        map.put("activityName", strB);
        if ("Step".equals(strB) || "Calorie".equals(strB) || "Distance".equals(strB) || "Climb".equals(strB)) {
            int iOrdinal = type.ordinal();
            if (iOrdinal == 0) {
                lmf.d().c(activity, AnalyticsValue.HEALTH_DETAIL_DAY_TAB_21300001.value(), map, 0);
                return;
            }
            if (iOrdinal == 1) {
                lmf.d().c(activity, AnalyticsValue.HEALTH_DETAIL_WEEK_TAB_21300002.value(), map, 0);
            } else if (iOrdinal == 2) {
                lmf.d().c(activity, AnalyticsValue.HEALTH_DETAIL_MONTH_TAB_21300003.value(), map, 0);
            } else {
                if (iOrdinal == 3) {
                    lmf.d().c(activity, AnalyticsValue.HEALTH_DETAIL_YEAR_TAB_21300004.value(), map, 0);
                    return;
                }
                throw new RuntimeException("UnKnownBI Point");
            }
        }
    }
}
