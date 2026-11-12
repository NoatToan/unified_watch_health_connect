package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.awarenessdonate.AwarenessDonateApi;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SystemProperties;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class hvp {
    public static List<ddt.b> d(long j) {
        LogUtil.a("FaFitnessCardUtil", "getNearTimePeriod, sportStartTime is ", Long.valueOf(j));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j - 1800000);
        calendar.set(13, 0);
        calendar.set(14, 0);
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 6; i++) {
            calendar.add(6, 1);
            long timeInMillis = calendar.getTimeInMillis();
            arrayList.add(new ddt.b(timeInMillis, 3600000 + timeInMillis));
        }
        return arrayList;
    }

    public static List<ddt.b> b(long j) {
        LogUtil.a("FaFitnessCardUtil", "getLastHourTimePeriod, remindTime is ", Long.valueOf(j));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ddt.b(j - 3600000, j));
        return arrayList;
    }

    public static void c(Map<String, String> map) {
        if (map == null || !map.containsKey("sport_remind_switch_status")) {
            LogUtil.a("FaFitnessCardUtil", "donateBySportRemind remindData is null or not contain sportRemind switchStatus");
            return;
        }
        String str = map.get("sport_remind_switch_status");
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            LogUtil.j("FaFitnessCardUtil", "donateBySportRemind sportRemind switchStatus is ", str);
            return;
        }
        if (map.containsKey("sport_remind_period") && map.containsKey("sport_remind_time")) {
            String str2 = map.get("sport_remind_period");
            String str3 = map.get("sport_remind_time");
            LogUtil.a("FaFitnessCardUtil", "donateBySportRemind remindPeriod is ", str2, ", remindTime is ", str3);
            a(str2, CommonUtil.n(BaseApplication.b(), str3));
        }
    }

    private static void a(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            LogUtil.a("FaFitnessCardUtil", "donateBySportRemind remindPeriod is empty or remindTime is empty");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = i / 60;
        calendar.set(11, ped.d(i2));
        calendar.set(12, ped.c(i2));
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.get(7);
        ArrayList arrayList = new ArrayList(7);
        for (int i3 = 0; i3 <= 6; i3++) {
            if (str.contains(String.valueOf(ift.b(calendar.get(7))))) {
                long timeInMillis = calendar.getTimeInMillis();
                if (System.currentTimeMillis() < timeInMillis) {
                    arrayList.addAll(b(timeInMillis));
                }
            }
            calendar.add(6, 1);
        }
        if (njy.b(arrayList)) {
            d(1, arrayList);
        }
    }

    public static void d(int i, List<ddt.b> list) {
        if (njy.e(list)) {
            LogUtil.j("FaFitnessCardUtil", "donateFitnessCard, predictInfo is empty");
            return;
        }
        AwarenessDonateApi awarenessDonateApi = (AwarenessDonateApi) Services.d("HWSmartInteractMgr", AwarenessDonateApi.class);
        if (awarenessDonateApi == null || !awarenessDonateApi.isSupportDonate()) {
            LogUtil.j("FaFitnessCardUtil", "donateFitnessCard, awarenessDonateApi is null or not support donate");
        } else {
            awarenessDonateApi.donateFeature(new ddt.d().g("featurePrediction").f(UUID.randomUUID().toString()).e(Build.MODEL).a(SystemProperties.d("ro.build.characteristics")).d(Build.PRODUCT).e(i).n(CommonUtil.ak()).d(System.currentTimeMillis()).e(list.get(0).b()).a(list.get(list.size() - 1).d()).c(FaCardAgdsApi.FA_CARD_PACKAGE_NAME).l(FaCardAgdsApi.SPORT_FA_CARD).b("com.huawei.ohos.healthservice.sport.FitnessCoursesFormAbility").h("fitness_courses_medium").i("2*2").j(i == 1 ? "fitnessSchedule" : "fitnessTutorial").e(list).a());
        }
    }

    public static void d() {
        AwarenessDonateApi awarenessDonateApi = (AwarenessDonateApi) Services.d("HWSmartInteractMgr", AwarenessDonateApi.class);
        if (awarenessDonateApi == null || !awarenessDonateApi.isSupportDonate()) {
            LogUtil.j("FaFitnessCardUtil", "awarenessDonateApi is null or not support donate");
            return;
        }
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        awarenessDonateApi.deleteDonateFeature(new ddt.d().g("featurePrediction").f(string).e(Build.MODEL).a(SystemProperties.d("ro.build.characteristics")).d(Build.PRODUCT).e(0).n(TimeZone.getDefault().getDisplayName(false, 0)).d(jCurrentTimeMillis).a(jCurrentTimeMillis).e(jCurrentTimeMillis).j("fitnessSchedule").e(new ArrayList()).a());
    }
}
