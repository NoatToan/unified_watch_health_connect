package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.inner.utils.CheckConfigUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessCommon;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.taskplatform.TaskEnum;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import defpackage.iov;
import health.compact.a.CommonUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes17.dex */
public class sqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f48537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f48538b;
    private static int e;
    private static final List<e> d = Arrays.asList(new e(3, Arrays.asList(new a(TaskEnum.WAKEUP_TIME.getTaskId(), R.string.IDS_regular_wake_up, R.string.IDS_health_life_blank_unit, 1, R.drawable.ic_health_sleep_point_4, "regular_getup_clover"), new a(TaskEnum.SLEEP_DURATION.getTaskId(), R.string.IDS_sleep_duration_today, R.plurals.IDS_health_life_float_hour_unit, 2, R.drawable.ic_health_sleep_point_4, "sleep_duration_clover"), new a(TaskEnum.BEDTIME.getTaskId(), R.string.IDS_regular_bedtime, R.string.IDS_health_life_blank_unit, 3, R.drawable.ic_health_sleep_point_4, "go_to_bed_clover"))), new e(1, Arrays.asList(new a(TaskEnum.EXERCISE_DURATION.getTaskId(), R.string.IDS_active_workout, R.plurals.IDS_health_life_min_unit, 1, R.drawable.ic_health_point_sport_4, "exercise_time_clover"), new a(TaskEnum.STEPS.getTaskId(), R.string.IDS_settings_steps, R.plurals.IDS_health_life_step_unit, 2, R.drawable.ic_health_point_sport_4, "steps_clover"), new a(TaskEnum.ACTIVITY_CALORIES.getTaskId(), R.string.IDS_active_caloric, R.plurals.IDS_health_life_kcal_unit, 3, R.drawable.ic_health_point_sport_4, "exercise_Calories_clover"), new a(TaskEnum.ACTIVITY_HOURS.getTaskId(), R.string.IDS_active_hours, R.plurals.IDS_health_life_hour_unit, 4, R.drawable.ic_health_point_sport_4, "standup_exercise_clover"))), new e(2, Arrays.asList(new a(TaskEnum.AVG_DAILY_PRESSURE.getTaskId(), R.string.IDS_stress_mean, R.string.IDS_health_life_pressure_unit, 1, R.drawable.ic_health_point_emotion_4, "huaweischeme://healthapp/router/emotionHealth?tab=stress", "average_stress_clover"), new a(TaskEnum.DECOMP_AND_RELAX.getTaskId(), R.string.IDS_stress_relax, R.plurals.IDS_health_life_times_unit, 2, R.drawable.ic_health_point_emotion_4, "huaweischeme://healthapp/router/resourceAggregationPage?pageTypeId=12", "relaxation_clover"))), new e(4, Arrays.asList(new a(TaskEnum.CALORIES_INTAKE.getTaskId(), R.string.IDS_diet_caloric, R.plurals.IDS_health_life_intake_unit, 1, R.drawable.ic_health_point_diet_4, "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.diet-diary?h5pro=true&urlType=4&pName=com.huawei.health&path=record_breakfast", "calories_intake_clover"), new a(TaskEnum.DRINK_WATER.getTaskId(), R.string.IDS_drink_water_new, R.plurals.IDS_health_life_water_unit, 2, R.drawable.ic_health_point_diet_4, "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-clovers?h5pro=true&urlType=4&pName=com.huawei.health&path=HealthyLiving&taskId=10", "drink_water_clover"))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<b> f48539c = Arrays.asList(new b("sleep", R.drawable.icon_sleep, R.color.clover_bg_start_sleep, R.color.clover_bg_end_sleep, R.color.clover_start_sleep, R.color.clover_end_sleep), new b("sport", R.drawable.icon_sport_new, R.color.clover_bg_start_sport, R.color.clover_bg_end_sport, R.color.clover_start_sport, R.color.clover_end_sport), new b("emotion", R.drawable.icon_emotion, R.color.clover_bg_start_emotion, R.color.clover_bg_end_emotion, R.color.clover_start_emotion, R.color.clover_end_emotion), new b("diet", R.drawable.icon_diet, R.color.clover_bg_start_diet, R.color.clover_bg_end_diet, R.color.clover_start_diet, R.color.clover_end_diet));

    static /* synthetic */ qfz c(qfz qfzVar, qfz qfzVar2) {
        return qfzVar;
    }

    static /* synthetic */ qfz e(qfz qfzVar) {
        return qfzVar;
    }

    static {
        HashMap map = new HashMap();
        f48537a = map;
        map.put("ACTIVITY_CAL_KEY", TaskEnum.ACTIVITY_CALORIES.getTaskId());
        map.put("ACTIVE_HOUR_KEY", TaskEnum.ACTIVITY_HOURS.getTaskId());
        map.put("INTENSITY_KEY", TaskEnum.EXERCISE_DURATION.getTaskId());
        map.put("STEP_KEY", TaskEnum.STEPS.getTaskId());
        map.put("SLEEP_DURATION_KEY", TaskEnum.SLEEP_DURATION.getTaskId());
        map.put("BEDTIME_KEY", TaskEnum.BEDTIME.getTaskId());
        map.put("WAKE_UP_TIME_KEY", TaskEnum.WAKEUP_TIME.getTaskId());
        map.put("AVG_PRESSURE_KEY", TaskEnum.AVG_DAILY_PRESSURE.getTaskId());
        map.put("RELAXATION_KEY", TaskEnum.DECOMP_AND_RELAX.getTaskId());
        map.put("DRINK_WATER_KEY", TaskEnum.DRINK_WATER.getTaskId());
        map.put("CALORIE_INTAKE_KEY", TaskEnum.CALORIES_INTAKE.getTaskId());
    }

    public static qtg e(qfj qfjVar) {
        if (qfjVar == null) {
            ReleaseLogUtil.d("R_LeafCardUtils", "getLeafProgress, querySchedulesResp is null");
            return d();
        }
        return a(qfjVar.d());
    }

    private static qtg a(Map<String, Integer> map) {
        if (njy.e(map)) {
            return d();
        }
        Context contextB = BaseApplication.b();
        ArrayList arrayList = new ArrayList();
        for (b bVar : f48539c) {
            int iC = qqw.c(map, bVar.f48545c, -1);
            if (iC >= 0) {
                arrayList.add(a(contextB, bVar, iC));
            }
        }
        qtg qtgVar = new qtg();
        qtgVar.c(arrayList);
        qtgVar.c(arrayList.size());
        return qtgVar;
    }

    private static qtg d() {
        Context contextB = BaseApplication.b();
        List<b> list = f48539c;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(contextB, it.next(), 0));
        }
        qtg qtgVar = new qtg();
        qtgVar.c(arrayList);
        qtgVar.c(arrayList.size());
        return qtgVar;
    }

    private static qtg.c a(Context context, b bVar, int i) {
        return new qtg.c(new qtg.c.a().d(new int[]{bVar.f, bVar.d}).b(new int[]{bVar.f48543a, bVar.f48544b}).c(qre.d(context, bVar.e)).b(i));
    }

    public static List<String> c(qfj qfjVar) {
        if (qfjVar == null) {
            ReleaseLogUtil.d("R_LeafCardUtils", "getLeafTaskIdList querySchedulesResp is null");
            return Collections.EMPTY_LIST;
        }
        List<String> listH = qfjVar.h();
        if (njy.e(listH)) {
            ReleaseLogUtil.d("R_LeafCardUtils", "getLeafTaskIdList list ", listH);
            return Collections.EMPTY_LIST;
        }
        String taskId = TaskEnum.TAKE_MEDICINE.getTaskId();
        String taskId2 = TaskEnum.BLOOD_PRESS_MEASURE.getTaskId();
        String taskId3 = TaskEnum.WEIGHT_MEASURE.getTaskId();
        ArrayList arrayList = new ArrayList();
        for (String str : listH) {
            if (!TextUtils.isEmpty(str) && !Objects.equals(str, taskId) && !Objects.equals(str, taskId2) && !Objects.equals(str, taskId3)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static List<fru> b(qfj qfjVar, List<String> list, int i, int i2) {
        f48538b = i;
        e = i2;
        if (!ffv.l()) {
            ReleaseLogUtil.d("R_LeafCardUtils", "convertSchedules not HealthLife");
            return new ArrayList();
        }
        if (qfjVar == null) {
            ReleaseLogUtil.d("R_LeafCardUtils", "convertSchedules querySchedulesResp is null");
            return e();
        }
        List<qfz> listI = qfjVar.i();
        if (njy.e(listI)) {
            ReleaseLogUtil.d("R_LeafCardUtils", "convertSchedules list ", listI, " querySchedulesResp ", qfjVar, " taskOrderIdList ", list);
            return new ArrayList();
        }
        LogUtil.a("LeafCardUtils", "convertSchedules taskOrderIdList ", list);
        ArrayList arrayList = new ArrayList(listI);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll((Map) arrayList.stream().collect(Collectors.toMap(new Function() { // from class: sra
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((qfz) obj).g();
            }
        }, new Function() { // from class: srk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return sqw.e((qfz) obj);
            }
        }, new BinaryOperator() { // from class: sre
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return sqw.c((qfz) obj, (qfz) obj2);
            }
        })));
        return b(concurrentHashMap, list);
    }

    private static List<fru> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(TaskEnum.SLEEP_DURATION.getTaskId(), "", String.valueOf(FitnessCommon.GTM_800_OFFSET_IN_SECOND)));
        arrayList.add(b(TaskEnum.EXERCISE_DURATION.getTaskId(), String.valueOf(f48538b), String.valueOf(e)));
        arrayList.add(b(TaskEnum.AVG_DAILY_PRESSURE.getTaskId(), "", String.valueOf(60)));
        arrayList.add(b(TaskEnum.CALORIES_INTAKE.getTaskId(), "", ""));
        return arrayList;
    }

    private static fru b(String str, String str2, String str3) {
        a aVarB = b(str);
        if (aVarB == null) {
            return new fru();
        }
        fru fruVar = new fru();
        fruVar.a(aVarB.g());
        fruVar.e(a(str2, aVarB.a()));
        fruVar.d(d(str3, aVarB.j(), aVarB.a()));
        fruVar.b(aVarB.d());
        return fruVar;
    }

    private static List<fru> b(Map<String, qfz> map, List<String> list) {
        if (!b(list, map)) {
            return e(map);
        }
        return e(list, map);
    }

    private static boolean b(List<String> list, final Map<String, qfz> map) {
        if (njy.e(map) || njy.e(list)) {
            ReleaseLogUtil.d("R_LeafCardUtils", "taskScheduleMap or taskIds is empty");
            return false;
        }
        Stream<String> streamFilter = list.stream().filter(new qqd());
        Objects.requireNonNull(map);
        return streamFilter.allMatch(new Predicate() { // from class: src
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return map.containsKey((String) obj);
            }
        });
    }

    private static List<fru> e(List<String> list, Map<String, qfz> map) {
        fru fruVarA;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                ReleaseLogUtil.b("R_LeafCardUtils", "taskId is null");
            } else {
                qfz qfzVar = map.get(str);
                if (qfzVar != null && (fruVarA = a(qfzVar)) != null) {
                    arrayList.add(fruVarA);
                }
            }
        }
        return arrayList;
    }

    private static List<fru> e(Map<String, qfz> map) {
        ArrayList<qfz> arrayList = new ArrayList();
        Iterator<e> it = d.iterator();
        while (it.hasNext()) {
            qfz qfzVarC = c(it.next(), map);
            if (qfzVarC != null) {
                arrayList.add(qfzVarC);
            }
        }
        if (arrayList.size() < 4) {
            HashSet hashSet = new HashSet();
            for (qfz qfzVar : arrayList) {
                if (qfzVar != null && qfzVar.g() != null) {
                    hashSet.add(qfzVar.g());
                }
            }
            qfz qfzVarB = b(hashSet, map);
            if (qfzVarB != null) {
                arrayList.add(qfzVarB);
            }
        }
        return d(arrayList);
    }

    private static qfz c(e eVar, Map<String, qfz> map) {
        Iterator<a> it = eVar.a().iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
        }
        return null;
    }

    private static qfz b(Set<String> set, Map<String, qfz> map) {
        Iterator<e> it = d.iterator();
        while (it.hasNext()) {
            Iterator<a> it2 = it.next().a().iterator();
            while (it2.hasNext()) {
                String strA = it2.next().a();
                if (map.containsKey(strA) && !set.contains(strA)) {
                    return map.get(strA);
                }
            }
        }
        return null;
    }

    private static List<fru> d(List<qfz> list) {
        fru fruVarA;
        ArrayList arrayList = new ArrayList();
        for (qfz qfzVar : list) {
            if (qfzVar != null && (fruVarA = a(qfzVar)) != null) {
                arrayList.add(fruVarA);
            }
        }
        return arrayList;
    }

    private static fru a(qfz qfzVar) {
        qfk qfkVar;
        if (qfzVar == null || njy.e(qfzVar.j())) {
            LogUtil.j("LeafCardUtils", "taskSchedule is null or schedules is empty");
            return null;
        }
        a aVarB = b(qfzVar.g());
        if (aVarB == null || (qfkVar = qfzVar.j().get(0)) == null) {
            return null;
        }
        fru fruVar = new fru();
        fruVar.a(e(aVarB.g()));
        fruVar.b(aVarB.d());
        fruVar.e(a(qfkVar.aa(), aVarB.a()));
        fruVar.d(d(qfkVar.j(), aVarB.j(), aVarB.a()));
        fruVar.b(c(qfkVar.aa(), aVarB.a()));
        fruVar.d(e(e(qfkVar.aa(), aVarB.a(), aVarB.c()), aVarB.b()));
        return fruVar;
    }

    private static View.OnClickListener e(final String str, String str2, final String str3) {
        final Context contextB = BaseApplication.b();
        if (str2.equals(TaskEnum.WAKEUP_TIME.getTaskId()) || str2.equals(TaskEnum.BEDTIME.getTaskId()) || str2.equals(TaskEnum.SLEEP_DURATION.getTaskId())) {
            if (CommonUtils.i(str) > 0) {
                return new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.utils.LeafCardUtils$$ExternalSyntheticLambda17
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Context context = contextB;
                        iov.d(context, new Intent(context, (Class<?>) KnitSleepDetailActivity.class));
                    }
                };
            }
            return new View.OnClickListener() { // from class: srb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uck.c(BaseApplication.b());
                }
            };
        }
        if (str2.equals(TaskEnum.STEPS.getTaskId())) {
            return new View.OnClickListener() { // from class: srd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tdy.e((HealthOpenSDK) null, contextB, CommonUtils.j(str), 0);
                }
            };
        }
        if (str2.equals(TaskEnum.EXERCISE_DURATION.getTaskId())) {
            return new View.OnClickListener() { // from class: sri
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tdy.b((HealthOpenSDK) null, contextB, CommonUtils.j(str));
                }
            };
        }
        if (str2.equals(TaskEnum.ACTIVITY_CALORIES.getTaskId())) {
            return new View.OnClickListener() { // from class: srf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tdy.a((HealthOpenSDK) null, contextB, Math.round(CommonUtils.j(str) / 1000.0f));
                }
            };
        }
        if (str2.equals(TaskEnum.ACTIVITY_HOURS.getTaskId())) {
            return new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.utils.LeafCardUtils$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KnitActiveHoursActivity.e(contextB);
                }
            };
        }
        if (str2.equals(TaskEnum.DECOMP_AND_RELAX.getTaskId())) {
            return new View.OnClickListener() { // from class: srg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sqw.c(contextB, str3, view);
                }
            };
        }
        if (str2.equals(TaskEnum.CALORIES_INTAKE.getTaskId())) {
            return new View.OnClickListener() { // from class: srh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sqw.a(str, contextB, str3, view);
                }
            };
        }
        return new View.OnClickListener() { // from class: srj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sqw.c(str3, contextB);
            }
        };
    }

    static /* synthetic */ void c(Context context, String str, View view) {
        if (Utils.k() || LoginInit.getInstance(context).isMinorAccount()) {
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.breath-training", null);
        } else {
            c(str, context);
        }
    }

    static /* synthetic */ void a(String str, Context context, String str2, View view) {
        if (CommonUtils.j(str) > 0) {
            ddv.b().loadH5ProApp(context, ddx.e, null);
        } else {
            c(str2, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.b("LeafCardUtils", "deeplink is null");
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        lsx.c(intent, context);
    }

    private static View.OnClickListener e(final View.OnClickListener onClickListener, final String str) {
        return new View.OnClickListener() { // from class: srl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sqw.c(str, onClickListener, view);
            }
        };
    }

    static /* synthetic */ void c(String str, View.OnClickListener onClickListener, View view) {
        if (qrs.r()) {
            ReleaseLogUtil.d("R_LeafCardUtils", "fast click");
        } else {
            e(CheckConfigUtils.Constants.HTTP_2, str, (Boolean) true);
            onClickListener.onClick(view);
        }
    }

    private static CharSequence e(String str) {
        Context contextB = BaseApplication.b();
        SpannableString spannableString = new SpannableString(str);
        qri.a(spannableString, str, new TextAppearanceSpan(contextB, R.style.model_card_title_font_Style));
        return spannableString;
    }

    private static CharSequence a(String str, String str2) {
        String strB = b(str, str2);
        Context contextB = BaseApplication.b();
        SpannableString spannableString = new SpannableString(strB);
        qri.a(spannableString, strB, new TextAppearanceSpan(contextB, R.style.model_card_value_font_Style));
        qri.a(spannableString, strB);
        return spannableString;
    }

    private static CharSequence c(String str, String str2) {
        int iJ;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.b("LeafCardUtils", "currentValue is null or taskId is null");
            return null;
        }
        if (!str2.equals(TaskEnum.AVG_DAILY_PRESSURE.getTaskId()) || (iJ = CommonUtils.j(str)) <= 0) {
            return null;
        }
        int iD = wvb.d(iJ);
        String strA = wvb.a(iJ);
        SpannableString spannableString = new SpannableString(strA);
        qri.a(spannableString, strA, new TextAppearanceSpan(BaseApplication.b(), R.style.model_card_unit_font_Style));
        qri.b(spannableString, strA, wvb.e(iD));
        return spannableString;
    }

    private static CharSequence d(String str, int i, String str2) {
        String strB = b(str, i, str2);
        Context contextB = BaseApplication.b();
        SpannableString spannableString = new SpannableString(strB);
        qri.a(spannableString, strB, new TextAppearanceSpan(contextB, R.style.model_card_unit_font_Style));
        return spannableString;
    }

    private static String b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.b("LeafCardUtils", "currentValue is null or taskId is null");
            return "--";
        }
        int iJ = CommonUtils.j(str);
        if (str2.equals(TaskEnum.WAKEUP_TIME.getTaskId()) || str2.equals(TaskEnum.BEDTIME.getTaskId())) {
            long jI = CommonUtils.i(str);
            return jI <= 0 ? "--" : DateFormatUtil.d(jI, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE);
        }
        if (str2.equals(TaskEnum.SLEEP_DURATION.getTaskId())) {
            float f = iJ;
            return Float.compare(f, 0.0f) <= 0 ? "--" : UnitUtil.e(f / 3600.0f, 1, 1);
        }
        if (str2.equals(TaskEnum.ACTIVITY_CALORIES.getTaskId())) {
            iJ = Math.round(iJ / 1000.0f);
        } else if (str2.equals(TaskEnum.AVG_DAILY_PRESSURE.getTaskId())) {
            if (iJ <= 0) {
                return "--";
            }
        } else if (str2.equals(TaskEnum.DRINK_WATER.getTaskId())) {
            iJ = Math.min(iJ, 6000);
        }
        return UnitUtil.e(iJ, 1, 0);
    }

    private static String b(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.b("LeafCardUtils", "taskGoal is null or taskId is null with ", str);
            return "--";
        }
        int iJ = CommonUtils.j(str);
        if (str2.equals(TaskEnum.WAKEUP_TIME.getTaskId()) || str2.equals(TaskEnum.BEDTIME.getTaskId())) {
            return qre.a(i, d(str));
        }
        if (str2.equals(TaskEnum.SLEEP_DURATION.getTaskId())) {
            float f = iJ / 3600.0f;
            return qre.e(i, (int) f, UnitUtil.e(f, 1, 1));
        }
        if (str2.equals(TaskEnum.AVG_DAILY_PRESSURE.getTaskId())) {
            return qre.a(i, UnitUtil.e(iJ, 1, 0));
        }
        if (str2.equals(TaskEnum.ACTIVITY_CALORIES.getTaskId())) {
            iJ = Math.round(iJ / 1000.0f);
        }
        return qre.e(i, iJ, UnitUtil.e(iJ, 1, 0));
    }

    private static String d(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 2) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(11, CommonUtils.j(strArrSplit[0]));
        calendar.set(12, CommonUtils.j(strArrSplit[1]));
        return DateFormatUtil.d(calendar.getTimeInMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE);
    }

    private static a b(String str) {
        if (str == null) {
            ReleaseLogUtil.d("LeafCardUtils", "taskId is null");
            return null;
        }
        Iterator<e> it = d.iterator();
        while (it.hasNext()) {
            for (a aVar : it.next().a()) {
                if (str.equals(aVar.a())) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public static List<String> a() {
        List list = (List) HiJsonUtil.d(lua.e(String.valueOf(10000), "TASK_ORDER_KEY", ""), new TypeToken<ArrayList<String>>() { // from class: com.huawei.ui.homehealth.knit.utils.LeafCardUtils$1
        }.getType());
        if (njy.e(list)) {
            return new ArrayList();
        }
        Stream stream = list.stream();
        final Map<String, String> map = f48537a;
        Objects.requireNonNull(map);
        return (List) stream.map(new Function() { // from class: srn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) map.get((String) obj);
            }
        }).filter(new qqd()).collect(Collectors.toList());
    }

    public static void e(String str, String str2, Boolean bool) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap();
        map.put("pageId", "Today_0001");
        lmnVar.d(map);
        HashMap map2 = new HashMap();
        map2.put("event", 1);
        map2.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map2.put("value", str2);
        map2.put("moduleName", "health_model");
        lmnVar.e(map2);
        ArrayList arrayList = new ArrayList();
        e(arrayList);
        if (bool != null) {
            arrayList.add(c("cloverLife_status", bool));
        }
        lmnVar.d(arrayList);
        lmf.d().a(BaseApplication.b(), AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value(), lmnVar, 0);
    }

    private static void e(List<Map<String, Object>> list) {
        Map<String, Integer> mapD;
        qfj qfjVarA = ffv.a((List<String>) Collections.EMPTY_LIST, (ResponseCallback<qfj>) null);
        if (qfjVarA == null || (mapD = qfjVarA.d()) == null) {
            return;
        }
        if (mapD.containsKey("sport")) {
            list.add(c("mvpa", mapD.get("sport")));
        }
        if (mapD.containsKey("sleep")) {
            list.add(c("sleep", mapD.get("sleep")));
        }
        if (mapD.containsKey("emotion")) {
            list.add(c("moods", mapD.get("emotion")));
        }
        if (mapD.containsKey("diet")) {
            list.add(c("diet", mapD.get("diet")));
        }
    }

    private static Map<String, Object> c(String str, Object obj) {
        HashMap map = new HashMap();
        map.put("action", 0);
        map.put("moduleName", str);
        map.put(FunctionSetBeanReader.BI_HAS_DATA, obj);
        return map;
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48546c;
        private final List<a> d;

        public e(int i, List<a> list) {
            this.f48546c = i;
            this.d = list;
            list.sort(Comparator.comparingInt(new ToIntFunction() { // from class: srm
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((sqw.a) obj).e();
                }
            }));
        }

        public List<a> a() {
            return this.d;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f48542c;
        private String d;
        private final String e;
        private final int g;
        private final int h;

        public a(String str, int i, int i2, int i3, int i4, String str2) {
            this.e = str;
            this.h = i;
            this.g = i2;
            this.f48541b = i3;
            this.f48540a = i4;
            this.f48542c = str2;
        }

        public a(String str, int i, int i2, int i3, int i4, String str2, String str3) {
            this.e = str;
            this.h = i;
            this.g = i2;
            this.f48541b = i3;
            this.f48540a = i4;
            this.d = str2;
            this.f48542c = str3;
        }

        public String a() {
            return this.e;
        }

        public String g() {
            return qre.f(this.h);
        }

        public int j() {
            return this.g;
        }

        public int e() {
            return this.f48541b;
        }

        public int d() {
            return this.f48540a;
        }

        public String c() {
            return this.d;
        }

        public String b() {
            return this.f48542c;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f48545c;
        private final int d;
        private final int e;
        private final int f;

        public b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f48545c = str;
            this.e = i;
            this.f = i2;
            this.d = i3;
            this.f48543a = i4;
            this.f48544b = i5;
        }
    }
}
