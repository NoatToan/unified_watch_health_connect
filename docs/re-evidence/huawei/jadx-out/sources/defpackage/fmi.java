package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class fmi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f34262a = new LinkedList<String>() { // from class: fmi.1
        {
            add("RhythmType_0");
            add("RhythmType_1");
            add("RhythmType_2");
            add("RhythmType_3");
        }
    };
    private static final List<String> d = new LinkedList<String>() { // from class: fmi.3
        {
            add("MonthlySleepProblem_0");
            add("MonthlySleepProblem_1");
            add("MonthlySleepProblem_2");
            add("MonthlySleepProblem_3");
            add("MonthlySleepProblem_4");
            add("MonthlySleepProblem_5");
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f34264c = new LinkedList<String>() { // from class: fmi.4
        {
            add("DailySleepProblem_0");
            add("DailySleepProblem_1");
            add("DailySleepProblem_2");
            add("DailySleepProblem_3");
            add("DailySleepProblem_4");
            add("DailySleepProblem_5");
            add("DailySleepProblem_6");
            add("DailySleepProblem_7");
            add("DailySleepProblem_8");
            add("DailySleepProblem_9");
        }
    };
    private static final List<String> e = new LinkedList<String>() { // from class: fmi.5
        {
            add("DailyTargetProblem_0");
            add("DailyTargetProblem_1");
            add("DailyTargetProblem_2");
            add("DailyTargetProblem_3");
            add("DailyTargetProblem_4");
            add("DailyTargetProblem_5");
            add("DailyTargetProblem_6");
            add("DailyTargetProblem_7");
            add("DailyTargetProblem_8");
            add("DailyTargetProblem_9");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, List<String>> f34263b = new HashMap<String, List<String>>() { // from class: fmi.2
        {
            put("health_sleep_rhythm_type", fmi.f34262a);
            put("health_monthly_sleep_problem", fmi.d);
            put("health_daily_sleep_problem", fmi.f34264c);
            put("health_daily_sleep_target_problem", fmi.e);
        }
    };

    public static String e(String str, int i) {
        return c(str, i, f34263b.get(str));
    }

    public static String c(String str, List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(e(str, list.get(i).intValue()));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private static String c(String str, int i, List<String> list) {
        if (str == null || !f34263b.containsKey(str)) {
            LogUtil.a("SleepLabelMatcher", str, " is not existing in sleepLabelsMap");
            return null;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("SleepLabelMatcher", str, " value is invalid");
            return null;
        }
        return list.get(i);
    }
}
