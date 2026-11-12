package com.huami.watch.companion.dataflow;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.sync.SyncCloudHealthHelper;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.dataflow.chart.DynamicDetailChartView;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.dataflow.model.health.HRDataManager;
import com.huami.watch.dataflow.model.health.HealthDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthSummaryItem;
import com.huami.watch.dataflow.model.health.process.DaySportData;
import com.huami.watch.dataflow.model.health.process.HeartRateDetailsInfo;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class HealthData {
    public static final int GOAL_CAL_DEFAULT = 300;
    private static final String a = "HealthData";
    private static final int b = 8000;
    private static int c = -1;
    private static int d = -1;
    private static String e = null;
    private static Map<String, HealthSummaryItem> f = Collections.synchronizedMap(new HashMap());
    private static Map<String, HealthSummaryItem> g = Collections.synchronizedMap(new HashMap());
    private static Map<String, DaySportData> h = Collections.synchronizedMap(new a());
    private static Map<String, HeartRateDetailsInfo> i = Collections.synchronizedMap(new HashMap());
    private static Map<String, SleepChartData> j = Collections.synchronizedMap(new HashMap(1));
    private static Map<String, DynamicDetailChartView.DynamicDetailChartData> k = Collections.synchronizedMap(new HashMap(1));
    private static DynamicDetailChartView.DynamicDetailChartData l = null;
    private static String m = null;
    private static AtomicBoolean n = null;
    private static AtomicBoolean o = null;
    private static AtomicBoolean p = null;
    private static final int q = 120;
    private static final int r = 10;

    public static class SleepChartData {
        public DynamicDetailChartView.DynamicDetailChartData chartData;
        public int endIndex;
        public int startIndex;
    }

    public class a extends LinkedHashMap<String, DaySportData> {
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, DaySportData> entry) {
            return size() > 12;
        }
    }

    private static HealthSummaryItem A(String str, boolean z, boolean z2) {
        DateDay dateDayFrom = DateDay.from(str);
        String strH = h(dateDayFrom, z, z2);
        if (g.containsKey(strH)) {
            Log.d(a, "Summary WeekMonth Cached : " + strH, new Object[0]);
            return g.get(strH);
        }
        if (z) {
            preloadSummaryCache(str, dateDayFrom.add(7).str());
            return null;
        }
        preloadSummaryCache(str, dateDayFrom.getMonthEndDay().str());
        return null;
    }

    public static void cacheSleepMonthSummary(String str, HealthSummaryItem healthSummaryItem) {
        f(str, false, false, healthSummaryItem);
    }

    public static void cacheSleepWeekSummary(String str, HealthSummaryItem healthSummaryItem) {
        f(str, true, false, healthSummaryItem);
    }

    public static void cacheStepMonthSummary(String str, HealthSummaryItem healthSummaryItem) {
        f(str, false, true, healthSummaryItem);
    }

    public static void cacheStepWeekSummary(String str, HealthSummaryItem healthSummaryItem) {
        f(str, true, true, healthSummaryItem);
    }

    public static void cleanAllDayCacheHR() {
        i.clear();
    }

    public static void clearAllCache() {
        f.clear();
        h.clear();
        i.clear();
        g.clear();
        j.clear();
        k.clear();
        l = null;
        m = null;
        c = -1;
        d = -1;
        n = null;
    }

    public static void clearCacheHR() {
        l = null;
    }

    private static void f(String str, boolean z, boolean z2, HealthSummaryItem healthSummaryItem) {
        String strH = h(DateDay.from(str), z, z2);
        if (g.containsKey(strH)) {
            return;
        }
        Log.d(a, "Cache WeekMonth Summary : <" + strH + SearchCriteria.GT, new Object[0]);
        g.put(strH, healthSummaryItem);
        z(str, z);
    }

    private static void g(DateDay dateDay, DateDay dateDay2, List<String> list, List<String> list2) {
        if (dateDay2.offsetDay(dateDay) > 2 && SyncCloudHealthHelper.checkIsNeedSync(dateDay.str())) {
            HealthDataItem syncState = HealthDataManager.getManager().getSyncState(dateDay.str());
            if (syncState == null) {
                list.add(dateDay.str());
            } else if (SyncCloudHealthHelper.checkIsNeedSyncFromDB(dateDay.str(), syncState)) {
                list.add(dateDay.str());
            }
        }
    }

    public static synchronized String getAfDisturbTime(Context context) {
        if (e == null) {
            e = t(UserSettings.get(context.getContentResolver(), "huami.watch.health.config"));
        }
        return e;
    }

    public static DynamicDetailChartView.DynamicDetailChartData getCachedAllDayHRChartData(String str) {
        return k.get(str);
    }

    @AnyThread
    public static HeartRateDetailsInfo getCachedAllDayHRDetail(String str) {
        return i.get(str);
    }

    @AnyThread
    public static DaySportData getCachedDetail(String str) {
        return h.get(str);
    }

    public static DynamicDetailChartView.DynamicDetailChartData getCachedHRChartData() {
        return l;
    }

    public static SleepChartData getCachedSleepChartData(String str) {
        return j.get(str);
    }

    @AnyThread
    public static HealthSummaryItem getCachedSummary(String str) {
        return f.get(str);
    }

    public static List<String> getCalendarMarkDates(DateDay dateDay, DateDay dateDay2, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, HealthSummaryItem> entry : HealthDataManager.getManager().getAllSummary(dateDay.str(), dateDay2.str()).entrySet()) {
            HealthSummaryItem value = entry.getValue();
            if (value != null) {
                if (i2 != 1) {
                    if (i2 != 16) {
                        if (i2 == 1048576 && value.getStep() != null && value.getStep().getCalories() > 0.0f) {
                            arrayList.add(entry.getKey());
                        }
                    } else if (value.getSleep() != null && value.getSleep().getDuration() > 0) {
                        arrayList.add(entry.getKey());
                    }
                } else if (value.getStep() != null && value.getStep().getTotal() > 0) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        return arrayList;
    }

    public static String getHealthSettingAfDisturbTime(Context context, @NonNull String str) {
        return k(context, "timed_not_disturb", str);
    }

    public static String getHealthSettingAllDayStress(Context context, boolean z) {
        return k(context, "allday_pressure", Integer.valueOf(z ? 1 : 0));
    }

    public static String getHealthSettingAtrialFibrillation(Context context, boolean z) {
        return k(context, "is_remind_atrial_fibrillation", Integer.valueOf(z ? 1 : 0));
    }

    public static String getHealthSettingCalorie(Context context, int i2) {
        return k(context, "calory_target", Integer.valueOf(i2));
    }

    public static String getHealthSettingHRAllDay(Context context, boolean z) {
        return k(context, com.xiaomi.hm.health.Constant.KEY_WATCH_CONFIG_HEARTE, Integer.valueOf(z ? 1 : 0));
    }

    public static String getHealthSettingLongSitRemind(Context context, boolean z) {
        return k(context, "is_remind_long_sit", Boolean.valueOf(z));
    }

    public static String getHealthSettingStepGoalRemind(Context context, boolean z) {
        return k(context, "is_remind_achievement", Boolean.valueOf(z));
    }

    public static String getHealthSettingSteps(Context context, int i2) {
        return k(context, "step_target", Integer.valueOf(i2));
    }

    public static String getStartDay() {
        if (m == null) {
            m = HealthDataManager.getManager().getStartDay();
        }
        if (m == null) {
            m = getStopDay();
        }
        return m;
    }

    public static String getStopDay() {
        return DateDay.today().str();
    }

    public static int getUserGoalCal(Context context) {
        if (d == -1) {
            d = x(UserSettings.get(context.getContentResolver(), "huami.watch.health.config"));
        }
        return d;
    }

    public static int getUserGoalSteps(Context context) {
        if (c == -1) {
            c = y(UserSettings.get(context.getContentResolver(), "huami.watch.health.config"));
        }
        return c;
    }

    @NonNull
    private static String h(DateDay dateDay, boolean z, boolean z2) {
        String strJ = z ? j(dateDay) : i(dateDay);
        if (z2) {
            return strJ + "-step";
        }
        return strJ + "-sleep";
    }

    private static String i(DateDay dateDay) {
        return dateDay.year() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + dateDay.calendar().get(2) + "-month";
    }

    public static synchronized boolean isAllDayHR(Context context) {
        if (n == null) {
            n = new AtomicBoolean(u(UserSettings.get(context.getContentResolver(), "huami.watch.health.config")));
        }
        return n.get();
    }

    public static synchronized boolean isAllDayStress(Context context) {
        if (o == null) {
            o = new AtomicBoolean(v(UserSettings.get(context.getContentResolver(), "huami.watch.health.config")));
        }
        return o.get();
    }

    public static synchronized boolean isAtrialFibrillation(Context context) {
        if (p == null) {
            p = new AtomicBoolean(w(UserSettings.get(context.getContentResolver(), "huami.watch.health.config")));
        }
        return p.get();
    }

    public static boolean isLongSitRemindEnable(Context context) {
        boolean zOptBoolean = true;
        try {
            String str = UserSettings.get(context.getContentResolver(), "huami.watch.health.config");
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            zOptBoolean = new JSONObject(str).optBoolean("is_remind_long_sit", true);
            Log.d(a, "Read long sit remind enable: " + zOptBoolean, new Object[0]);
            return zOptBoolean;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.w(a, "Parse WatchHealth Err!!", e2, new Object[0]);
            return zOptBoolean;
        }
    }

    public static boolean isStepGoalRemindEnable(Context context) {
        boolean zOptBoolean;
        try {
            String str = UserSettings.get(context.getContentResolver(), "huami.watch.health.config");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            zOptBoolean = new JSONObject(str).optBoolean("is_remind_achievement", true);
            try {
                Log.d(a, "Read step goal remind enable: " + zOptBoolean, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                Log.w(a, "Parse WatchHealth Err!!", e, new Object[0]);
            }
            return zOptBoolean;
        } catch (Exception e3) {
            e = e3;
            zOptBoolean = false;
        }
        e.printStackTrace();
        Log.w(a, "Parse WatchHealth Err!!", e, new Object[0]);
        return zOptBoolean;
    }

    private static String j(DateDay dateDay) {
        return dateDay.year() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + dateDay.calendar().get(3) + "-week";
    }

    private static String k(Context context, String str, Object obj) {
        String string;
        String str2 = UserSettings.get(context.getContentResolver(), "huami.watch.health.config");
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(str2) ? new JSONObject(str2) : new JSONObject();
            jSONObject.put(str, obj);
            string = jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            Log.w(a, "ParseWatchHealthSettingErr!!", e2, new Object[0]);
            string = null;
        }
        Log.d(a, "Get New HealthSetting : " + string, new Object[0]);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(List list, Context context, ObservableEmitter observableEmitter) throws Exception {
        Log.i(a, "Start Async Details : <" + Arrays.toString(list.toArray()) + SearchCriteria.GT, new Object[0]);
        observableEmitter.onNext(Boolean.valueOf(SyncCloudHealthHelper.syncDaysDetail(context, list)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(String str, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            RxBus.get().post(new HealthDataUpdatedEvent(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n() {
        RxBus.get().post(new HealthDataUpdatedEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o() {
        HealthDataUpdatedEvent healthDataUpdatedEvent = new HealthDataUpdatedEvent();
        healthDataUpdatedEvent.onlyUpdateStepGoal = true;
        RxBus.get().post(healthDataUpdatedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p() {
        HealthDataUpdatedEvent healthDataUpdatedEvent = new HealthDataUpdatedEvent();
        healthDataUpdatedEvent.onlyUpdateHRIsAllDay = true;
        RxBus.get().post(healthDataUpdatedEvent);
    }

    public static void preloadSummaryCache(String str, String str2) {
        DateDay dateDayFrom = DateDay.from(str);
        DateDay dateDayFrom2 = DateDay.from(str2);
        DateDay dateDay = DateDay.today();
        if (dateDayFrom2.after(dateDay)) {
            dateDayFrom2 = dateDay;
        }
        if (s(dateDayFrom.str(), dateDayFrom2.str())) {
            Log.i(a, "PreloadSummaryCache : <" + dateDayFrom + Constants.WAVE_SEPARATOR + dateDayFrom2 + SearchCriteria.GT, new Object[0]);
            f.putAll(HealthDataManager.getManager().getAllSummary(dateDayFrom.str(), dateDayFrom2.str()));
            while (!dateDayFrom.after(dateDayFrom2)) {
                if (!f.containsKey(dateDayFrom.str())) {
                    f.put(dateDayFrom.str(), null);
                }
                dateDayFrom = dateDayFrom.tomorrow();
            }
        }
    }

    private static DynamicDetailChartView.DynamicDetailChartData q(Context context, String str) {
        byte[] regulateHeartRate;
        DynamicDetailChartView.DynamicDetailChartData dynamicDetailChartData = new DynamicDetailChartView.DynamicDetailChartData();
        ArrayList arrayList = new ArrayList();
        HeartRateDetailsInfo heartRateDetailsInfoRequestAllDayHRDetail = requestAllDayHRDetail(context, str);
        if (heartRateDetailsInfoRequestAllDayHRDetail != null && (regulateHeartRate = heartRateDetailsInfoRequestAllDayHRDetail.getRegulateHeartRate()) != null) {
            Calendar calendar = Calendar.getInstance();
            int i2 = (((calendar.get(11) * 60) + calendar.get(12)) - 120) * 2;
            if (i2 < 0) {
                i2 = 0;
            }
            boolean z = true;
            int i3 = 0;
            while (i2 < regulateHeartRate.length && i3 <= 120) {
                DynamicDetailChartView.FullDayHRDetailItem fullDayHRDetailItem = new DynamicDetailChartView.FullDayHRDetailItem();
                fullDayHRDetailItem.index = i3;
                int i4 = regulateHeartRate[i2 + 1] & 255;
                fullDayHRDetailItem.heartRate = i4;
                if (z && i4 > 0) {
                    z = false;
                }
                fullDayHRDetailItem.mode = regulateHeartRate[i2];
                arrayList.add(fullDayHRDetailItem);
                i3++;
                i2 += 2;
            }
            dynamicDetailChartData.isAllZeroData = z;
        }
        dynamicDetailChartData.heartRateData = arrayList;
        return dynamicDetailChartData;
    }

    private static DynamicDetailChartView.DynamicDetailChartData r() {
        int size;
        DynamicDetailChartView.DynamicDetailChartData dynamicDetailChartData = new DynamicDetailChartView.DynamicDetailChartData();
        ArrayList arrayList = new ArrayList();
        List<HealthHRDataItem> all = HRDataManager.getManager().getAll(0L, System.currentTimeMillis() / 1000, 10);
        if (all != null && (size = all.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                HealthHRDataItem healthHRDataItem = all.get(i2);
                DynamicDetailChartView.LineDetailItem lineDetailItem = new DynamicDetailChartView.LineDetailItem();
                lineDetailItem.index = 9 - i2;
                lineDetailItem.value = healthHRDataItem.getHeartRate();
                arrayList.add(lineDetailItem);
            }
        }
        dynamicDetailChartData.lineChartData = arrayList;
        return dynamicDetailChartData;
    }

    public static void removeCache(String str) {
        Log.v(a, "Remove Cache: " + str, new Object[0]);
        f.remove(str);
        h.remove(str);
        i.remove(str);
        j.remove(str);
        k.remove(str);
        g.remove(h(DateDay.from(str), true, true));
        g.remove(h(DateDay.from(str), false, true));
        g.remove(h(DateDay.from(str), true, false));
        g.remove(h(DateDay.from(str), false, false));
    }

    public static void removeCaches(String str, String str2) {
        DateDay dateDayFrom = DateDay.from(str2);
        for (DateDay dateDayFrom2 = DateDay.from(str); !dateDayFrom2.after(dateDayFrom); dateDayFrom2 = dateDayFrom2.tomorrow()) {
            removeCache(dateDayFrom2.str());
        }
    }

    public static void removeUnnecessarySummaryCache() {
        DateDay dateDay = DateDay.today();
        DateDay dateDayFrom = DateDay.from(getStartDay());
        DateDay dateDayAddWeek = dateDay.addMonth(-4).addWeek(-1);
        if (dateDayAddWeek.before(dateDayFrom)) {
            return;
        }
        Log.d(a, "Summary Cached Before : " + f.size(), new Object[0]);
        while (!dateDayFrom.after(dateDayAddWeek)) {
            f.remove(dateDayFrom.str());
            dateDayFrom = dateDayFrom.tomorrow();
        }
        Log.d(a, "Summary Cached After : " + f.size(), new Object[0]);
    }

    public static DynamicDetailChartView.DynamicDetailChartData requestAllDayHRChartData(Context context, String str) {
        if (k.containsKey(str)) {
            return k.get(str);
        }
        DynamicDetailChartView.DynamicDetailChartData dynamicDetailChartDataQ = q(context, str);
        k.put(str, dynamicDetailChartDataQ);
        return dynamicDetailChartDataQ;
    }

    @WorkerThread
    public static HeartRateDetailsInfo requestAllDayHRDetail(Context context, String str) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (requestDetail(context, str) == null) {
            return null;
        }
        requestDetail(context, DateDay.from(str).tomorrow().toString());
        UserInfoManager.get().getBirthday().getAge();
        return null;
    }

    @WorkerThread
    public static DaySportData requestDetail(final Context context, final String str) {
        DateDay dateDayFrom = DateDay.from(str);
        DateDay dateDay = DateDay.today();
        if (dateDayFrom.after(dateDay)) {
            return null;
        }
        if (h.containsKey(str)) {
            return h.get(str);
        }
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (!dateDayFrom.equals(dateDay)) {
            DateDay dateDayYesterday = dateDayFrom.yesterday();
            DateDay dateDay2 = dateDayFrom.tomorrow();
            g(dateDayFrom, dateDay, arrayList, arrayList2);
            g(dateDayYesterday, dateDay, arrayList, arrayList2);
            g(dateDay2, dateDay, arrayList, arrayList2);
            if (!arrayList.isEmpty()) {
                SyncCloudHealthHelper.syncDaysDetail(context, arrayList);
            }
        }
        if (!arrayList2.isEmpty()) {
            Rx.io(new ObservableOnSubscribe() { // from class: su3
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    HealthData.l(arrayList2, context, observableEmitter);
                }
            }).safeSubscribe(new Consumer() { // from class: tu3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    HealthData.m(str, (Boolean) obj);
                }
            });
        }
        return null;
    }

    public static DynamicDetailChartView.DynamicDetailChartData requestHRChartData() {
        DynamicDetailChartView.DynamicDetailChartData dynamicDetailChartData = l;
        if (dynamicDetailChartData != null) {
            return dynamicDetailChartData;
        }
        DynamicDetailChartView.DynamicDetailChartData dynamicDetailChartDataR = r();
        l = dynamicDetailChartDataR;
        return dynamicDetailChartDataR;
    }

    @WorkerThread
    public static List<HeartRateDetailsInfo> requestRecent7DaysAllDayHRDetail(Context context, String str) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 7; i2++) {
            arrayList.add(requestAllDayHRDetail(context, DateDay.from(str).add(i2).str()));
        }
        return arrayList;
    }

    @WorkerThread
    public static List<HealthSummaryItem> requestRecent7DaysSummary(String str) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 7; i2++) {
            arrayList.add(requestSummary(DateDay.from(str).add(i2).str()));
        }
        return arrayList;
    }

    public static HealthSummaryItem requestSleepMonthSummary(String str) {
        return A(str, false, false);
    }

    public static HealthSummaryItem requestSleepWeekSummary(String str) {
        return A(str, true, false);
    }

    public static HealthSummaryItem requestStepMonthSummary(String str) {
        return A(str, false, true);
    }

    public static HealthSummaryItem requestStepWeekSummary(String str) {
        return A(str, true, true);
    }

    @WorkerThread
    public static HealthSummaryItem requestSummary(String str) {
        if (DateDay.from(str).after(DateDay.today())) {
            return null;
        }
        if (f.containsKey(str)) {
            return f.get(str);
        }
        HealthSummaryItem summary = HealthDataManager.getManager().getSummary(str);
        f.put(str, summary);
        return summary;
    }

    private static boolean s(String str, String str2) {
        DateDay dateDayFrom = DateDay.from(str2);
        for (DateDay dateDayFrom2 = DateDay.from(str); !dateDayFrom2.after(dateDayFrom); dateDayFrom2 = dateDayFrom2.tomorrow()) {
            if (!f.containsKey(dateDayFrom2.str())) {
                return true;
            }
        }
        return false;
    }

    public static void saveHealthSetting(Context context, @NonNull String str) {
        UserSettings.putString(context.getContentResolver(), "huami.watch.health.config", str);
    }

    private static String t(String str) {
        String strOptString = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            strOptString = new JSONObject(str).optString("timed_not_disturb", "");
            Log.d(a, "Read Atrial Fibrillation Not Disturb Time : " + strOptString, new Object[0]);
            return strOptString;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.w(a, "Parse Atrial Fibrillation Not Disturb Time!!", e2, new Object[0]);
            return strOptString;
        }
    }

    private static boolean u(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            z = new JSONObject(str).optInt(com.xiaomi.hm.health.Constant.KEY_WATCH_CONFIG_HEARTE, 0) == 1;
            try {
                Log.d(a, "Read AllDay HR Is ON : " + z, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                Log.w(a, "Parse AllDay HR Err!!", e, new Object[0]);
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
        return z;
    }

    public static void updateAfDisturbTime(String str) {
        String strT = t(str);
        String str2 = e;
        if (str2 == null || !str2.equals(strT)) {
            e = strT;
        }
    }

    public static void updateIsAllDayStress(String str) {
        boolean zV = v(str);
        AtomicBoolean atomicBoolean = o;
        if (atomicBoolean == null || atomicBoolean.get() != zV) {
            if (o == null) {
                o = new AtomicBoolean();
            }
            o.set(zV);
            Log.d(a, "Set AllDay Pressure, ON: " + zV, new Object[0]);
        }
    }

    public static void updateIsAtrialFibrillation(String str) {
        boolean zW = w(str);
        AtomicBoolean atomicBoolean = p;
        if (atomicBoolean == null || atomicBoolean.get() != zW) {
            if (p == null) {
                p = new AtomicBoolean();
            }
            p.set(zW);
        }
    }

    public static void updateUserGoalCalorie(String str) {
        int iX = x(str);
        if (iX == d) {
            return;
        }
        d = iX;
        Rx.mainThread(new Runnable() { // from class: vu3
            @Override // java.lang.Runnable
            public final void run() {
                HealthData.n();
            }
        });
    }

    public static void updateUserGoalSteps(String str) {
        int iY = y(str);
        if (iY == c) {
            return;
        }
        c = iY;
        Rx.mainThread(new Runnable() { // from class: wu3
            @Override // java.lang.Runnable
            public final void run() {
                HealthData.o();
            }
        });
    }

    public static void updateUserIsAllDayHR(String str) {
        boolean zU = u(str);
        AtomicBoolean atomicBoolean = n;
        if (atomicBoolean == null || atomicBoolean.get() != zU) {
            if (n == null) {
                n = new AtomicBoolean();
            }
            n.set(zU);
            Log.d(a, "Update AllDay HR, ON: " + zU, new Object[0]);
            Rx.mainThread(new Runnable() { // from class: uu3
                @Override // java.lang.Runnable
                public final void run() {
                    HealthData.p();
                }
            });
        }
    }

    private static boolean v(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            z = new JSONObject(str).optInt("allday_pressure", 0) == 1;
            try {
                Log.d(a, "Read AllDay Pressure Is ON : " + z, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                Log.w(a, "Parse AllDay Pressure Err!!", e, new Object[0]);
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
        return z;
    }

    private static boolean w(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            z = new JSONObject(str).optInt("is_remind_atrial_fibrillation", 0) == 1;
            try {
                Log.d(a, "Read Atrial Fibrillation Is ON : " + z, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                Log.w(a, "Parse Atrial Fibrillation!!", e, new Object[0]);
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
        return z;
    }

    private static int x(String str) {
        int i2 = 300;
        if (TextUtils.isEmpty(str)) {
            return 300;
        }
        try {
            int iOptInt = new JSONObject(str).optInt("calory_target", 300);
            i2 = iOptInt <= 0 ? 8000 : iOptInt;
            Log.d(a, "Read GoalCalorie: " + i2, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.w(a, "Parse WatchHealth Err!!", e2, new Object[0]);
        }
        return i2;
    }

    private static int y(String str) {
        int iOptInt = 8000;
        if (TextUtils.isEmpty(str)) {
            return 8000;
        }
        try {
            iOptInt = new JSONObject(str).optInt("step_target", 8000);
            Log.d(a, "Read GoalSteps: " + iOptInt, new Object[0]);
            return iOptInt;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.w(a, "Parse WatchHealth Err!!", e2, new Object[0]);
            return iOptInt;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    private static void z(String str, boolean z) {
        boolean z2;
        DateDay dateDayFrom = DateDay.from(str);
        DateDay dateDay = DateDay.today();
        if ((z && dateDay.offsetWeek(dateDayFrom) == 0) || dateDay.offsetMonth(dateDayFrom) == 0) {
            return;
        }
        boolean zContainsKey = g.containsKey(h(dateDayFrom, true, true));
        if (zContainsKey) {
            if (g.containsKey(h(dateDayFrom, false, true))) {
                zContainsKey = true;
            }
        }
        if (zContainsKey) {
            z2 = g.containsKey(h(dateDayFrom, true, false)) ? true : zContainsKey;
        }
        if (z2) {
            if (g.containsKey(h(dateDayFrom, false, false))) {
                DateDay dateDayAdd = z ? dateDayFrom.add(7) : dateDayFrom.getMonthEndDay();
                if (!dateDayAdd.after(dateDay)) {
                    dateDay = dateDayAdd;
                }
                Log.d(a, "Summary Cached Before : " + f.size(), new Object[0]);
                while (!dateDayFrom.after(dateDay)) {
                    f.remove(dateDayFrom.str());
                    dateDayFrom = dateDayFrom.tomorrow();
                }
                Log.d(a, "Summary Cached After : " + f.size(), new Object[0]);
            }
        }
    }
}
