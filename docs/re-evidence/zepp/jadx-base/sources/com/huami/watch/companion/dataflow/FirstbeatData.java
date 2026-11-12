package com.huami.watch.companion.dataflow;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.model.firstbeat.SportLoadManager;
import com.huami.watch.dataflow.model.firstbeat.VO2maxManager;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class FirstbeatData {
    public static final float VO2MAX_MAX_VALUE = 105.0f;
    private static final String a = "FirstBeatData";
    private static Map<String, VO2maxDataItem> b = new HashMap();
    private static Map<String, SportLoadDataItem> c = new HashMap();
    private static Map<String, VO2maxDataItem> d = new HashMap();

    @NonNull
    private static String a(DateDay dateDay, boolean z, int i) {
        if (z) {
            return c(dateDay) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i;
        }
        return b(dateDay) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i;
    }

    private static String b(DateDay dateDay) {
        return dateDay.year() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + dateDay.calendar().get(2) + "-month";
    }

    private static String c(DateDay dateDay) {
        return dateDay.year() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + dateDay.calendar().get(3) + "-week";
    }

    public static void clearAllCache() {
        b.clear();
        c.clear();
        d.clear();
    }

    public static boolean existSportLoadData() {
        DateDay dateDay = DateDay.today();
        List<SportLoadDataItem> list = SportLoadManager.getManager().get(dateDay.add(-27).str(), dateDay.str());
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static boolean existVO2MaxData(int i) {
        return VO2maxManager.getManager().getOldest(i == 1 ? "vo2_max_run" : VO2maxDataItem.COLUMN_VO2_MAX_WALK) != null;
    }

    public static String getSportLoadStartDay() {
        SportLoadDataItem oldest = SportLoadManager.getManager().getOldest();
        String date = oldest != null ? oldest.getDate() : null;
        return TextUtils.isEmpty(date) ? getStopDay() : date;
    }

    public static String getStopDay() {
        return DateDay.today().str();
    }

    public static String getVO2MaxStartDay(int i) {
        VO2maxDataItem oldest = VO2maxManager.getManager().getOldest(i == 1 ? "vo2_max_run" : VO2maxDataItem.COLUMN_VO2_MAX_WALK);
        String date = oldest != null ? oldest.getDate() : null;
        return TextUtils.isEmpty(date) ? getStopDay() : date;
    }

    public static SportLoadDataItem requestSportLoadDayInfo(String str) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        if (c.containsKey(str)) {
            return c.get(str);
        }
        SportLoadDataItem sportLoadDataItem = SportLoadManager.getManager().get(str);
        c.put(str, sportLoadDataItem);
        return sportLoadDataItem;
    }

    public static VO2maxDataItem requestVO2maxData(String str) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        VO2maxDataItem vO2maxDataItem = VO2maxManager.getManager().get(str);
        b.put(str, vO2maxDataItem);
        return vO2maxDataItem;
    }

    public static VO2maxDataItem requestVO2maxWeekMonthMax(int i, String str, boolean z) {
        DateDay dateDayFrom = DateDay.from(str);
        String strA = a(dateDayFrom, z, i);
        if (d.containsKey(strA)) {
            Log.d(a, "WeekMonth Cached : " + strA, new Object[0]);
            return d.get(strA);
        }
        String str2 = i == 1 ? "vo2_max_run" : VO2maxDataItem.COLUMN_VO2_MAX_WALK;
        VO2maxDataItem rangeMaxInfo = z ? VO2maxManager.getManager().getRangeMaxInfo(str, dateDayFrom.add(7).str(), str2) : VO2maxManager.getManager().getRangeMaxInfo(str, dateDayFrom.getMonthEndDay().str(), str2);
        if (rangeMaxInfo != null) {
            d.put(strA, rangeMaxInfo);
        }
        return rangeMaxInfo;
    }
}
