package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.FilterOption;
import com.huawei.basefitnessadvice.model.SearchCondition;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.h5pro.CourseControlManager;
import com.huawei.health.suggestion.ui.fitness.module.EnumDefinitionOptions;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.BelongInfo;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.HealthWorkout;
import com.huawei.trade.datatype.ProductSummary;
import com.huawei.trade.datatype.TradeViewInfo;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class iei {
    public static void a(Motion motion) {
        if (motion == null) {
            return;
        }
        String strAcquireId = motion.acquireId();
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("date", Long.valueOf(System.currentTimeMillis()));
        map.put("type", "");
        map.put("acton_id", strAcquireId);
        map.put("action_name", motion.acquireName());
        idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_DETAIL_1130029.value(), map);
    }

    public static void a(FitWorkout fitWorkout) {
        if (fitWorkout == null || fitWorkout.getCourseBelongInfoByType(0) == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "doSeriesCourseBi mFitWorkout is not SeriesCourse");
            return;
        }
        BelongInfo courseBelongInfoByType = fitWorkout.getCourseBelongInfoByType(0);
        if (courseBelongInfoByType == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "startSeriesCourseBi belongInfo is null.");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        Integer commodityFlag = courseBelongInfoByType.getCommodityFlag();
        if (commodityFlag != null) {
            if (commodityFlag.intValue() == 2) {
                map.put("type", 1);
            } else if (commodityFlag.intValue() == 1) {
                map.put("type", 3);
            } else {
                map.put("type", 2);
            }
        }
        map.put("name", courseBelongInfoByType.getName());
        map.put("id", courseBelongInfoByType.getId());
        idy.b(AnalyticsValue.SERIES_COURSE_USE_DEMAND.value(), map);
    }

    public static void a(FitWorkout fitWorkout, Map<String, Object> map) {
        if (fitWorkout == null || map == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "doViewCourseDetailBi failed with workout is null");
            return;
        }
        HashMap map2 = new HashMap(map);
        map2.put("click", 1);
        map2.put("topic_version", fitWorkout.accquireVersion());
        if (fitWorkout.isCustomCourse()) {
            map2.put("workout_name", hkt.a(BaseApplication.b()));
        } else {
            map2.put("workout_name", fitWorkout.acquireName());
        }
        String strE = gzx.e(fitWorkout.acquireClasses());
        if (TextUtils.isEmpty(strE)) {
            strE = gzx.c(fitWorkout.getPrimaryClassify());
        }
        map2.put("course_type", strE);
        map2.put("body_position", gzx.d(fitWorkout.acquireTrainingpoints()));
        map2.put("course_rate", fitWorkout.acquireDifficulty() + "");
        map2.put("course_time", fitWorkout.acquireDuration() + "");
        map2.put("workout_id", fitWorkout.acquireId());
        if (fitWorkout.getIsAi() == 1) {
            map2.put("isAICourse", true);
        } else {
            map2.put("isAICourse", false);
        }
        a("1130017", map2);
    }

    public static void a(String str, long j) {
        HashMap map = new HashMap();
        map.put("entrance", str);
        map.put("stay_time", Long.valueOf(j));
        idy.b("1130016", map);
    }

    public static void d(FitWorkout fitWorkout, Map<String, Object> map, boolean z) {
        a("1130008", fitWorkout, map, z);
    }

    public static void c(FitWorkout fitWorkout, Map<String, Object> map, boolean z) {
        a("1130007", fitWorkout, map, z);
    }

    private static void a(String str, FitWorkout fitWorkout, Map<String, Object> map, boolean z) {
        if (fitWorkout == null || map == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "doCourseBi failed with workout is null");
            return;
        }
        HashMap map2 = new HashMap(map);
        map2.put("click", 1);
        map2.put("course_version", fitWorkout.accquireVersion());
        if (fitWorkout.isCustomCourse()) {
            map2.put("workout_name", hkt.a(BaseApplication.b()));
        } else {
            map2.put("workout_name", fitWorkout.acquireName());
        }
        String strE = gzx.e(fitWorkout.acquireClasses());
        if (TextUtils.isEmpty(strE)) {
            strE = gzx.c(fitWorkout.getPrimaryClassify());
        }
        map2.put("course_type", strE);
        map2.put("body_position", gzx.d(fitWorkout.acquireTrainingpoints()));
        map2.put("course_rate", String.valueOf(fitWorkout.acquireDifficulty()));
        map2.put("course_time", String.valueOf(fitWorkout.acquireDuration()));
        map2.put("workout_id", fitWorkout.acquireId());
        if (fitWorkout.getIsAi() == 0) {
            map2.put("isAICourse", null);
        } else {
            map2.put("isAICourse", Boolean.valueOf(z));
        }
        a(str, map2);
    }

    public static void a(int i, String str, String str2) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("workout_id", str);
        map.put("workout_name", str2);
        a("1120051", map);
    }

    public static void a() {
        OpAnalyticsUtil.getInstance().setEventWithActionType(5, OperationKey.HEALTH_APP_RUN_START_2050005.value());
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("actiontype", String.valueOf(5));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PVUV_85050001.value(), linkedHashMap);
    }

    public static void a(final String str, final Map<String, Object> map) {
        if (map == null) {
            LogUtil.a("Suggestion_FitnessBiUtils", "sendBiDataEvent key:", str);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ieh
                @Override // java.lang.Runnable
                public final void run() {
                    idy.b(str, map);
                }
            });
        }
    }

    public static void e(int i, int i2) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE, Integer.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        a("1130063", map);
    }

    public static void d(int i, String str, int i2) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE, Integer.valueOf(i));
        map.put("word", str);
        map.put("result", Integer.valueOf(i2));
        a("1130036", map);
    }

    public static void b(String str) {
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("type", str);
        a("1130053", map);
    }

    public static void d(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE, Integer.valueOf(i));
        a("1130064", map);
    }

    public static void b(int i, String str) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE, Integer.valueOf(i));
        map.put("labelType", str);
        a("1130065", map);
    }

    public static Map<String, Object> c(String str, SearchCondition searchCondition) {
        HashMap map = new HashMap(5);
        if (searchCondition == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "getFilterMap workoutListBean == null");
            return map;
        }
        map.put("labelId", str);
        if (njy.e(searchCondition.getFilterConditions())) {
            return map;
        }
        map.put("filters", b(searchCondition));
        return map;
    }

    private static Map<String, List<String>> b(SearchCondition searchCondition) {
        HashMap map = new HashMap();
        for (FilterCondition filterCondition : searchCondition.getFilterConditions()) {
            if (filterCondition != null && !njy.e(filterCondition.getFilterOptions())) {
                ArrayList arrayList = new ArrayList();
                for (FilterOption filterOption : filterCondition.getFilterOptions()) {
                    if (filterOption != null) {
                        arrayList.add(filterOption.getName());
                    }
                }
                map.put(filterCondition.getName(), arrayList);
            }
        }
        return map;
    }

    public static Map<String, Object> d(FitWorkout fitWorkout, String str, String str2, int i) {
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("workout_name", fitWorkout.acquireName());
        map.put("workout_id", fitWorkout.acquireId());
        map.put("body_position", gzx.d(fitWorkout.acquireTrainingpoints()));
        map.put("course_rate", String.valueOf(fitWorkout.acquireDifficulty()));
        map.put("course_time", String.valueOf(fitWorkout.acquireDuration()));
        map.put("resourceType", Integer.valueOf(hkt.b(fitWorkout)));
        map.put("pageId", Integer.valueOf(idy.d(str2)));
        map.put("labelId", str);
        map.put("pullOrder", Integer.valueOf(i));
        String strE = gzx.e(fitWorkout.acquireClasses());
        if (TextUtils.isEmpty(strE)) {
            strE = gzx.c(fitWorkout.getPrimaryClassify());
        }
        map.put("course_type", strE);
        return map;
    }

    public static void d(Map<String, Object> map) {
        if (map == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "sendAllCourseExposureMapClick map == null");
            return;
        }
        HashMap map2 = new HashMap(map);
        map2.put("event", 1);
        a("1130068", map2);
    }

    public static void a(Map<String, Object> map, String str) {
        if (map == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "sendAllCourseExposureMapClick map == null");
            return;
        }
        HashMap map2 = new HashMap(map);
        map2.put("event", 0);
        a(str, map2);
    }

    public static Map<String, Object> e(HealthWorkout healthWorkout, int i) {
        if (healthWorkout == null) {
            return new HashMap();
        }
        HashMap map = new HashMap(7);
        map.put("click", 1);
        map.put("workout_name", healthWorkout.acquireName());
        map.put("itemId", healthWorkout.acquireId());
        int iAcquireDuration = healthWorkout.acquireDuration();
        if (iAcquireDuration == 0) {
            iAcquireDuration = healthWorkout.getChapterCount();
        }
        map.put("course_time", String.valueOf(iAcquireDuration));
        map.put("resourceType", Integer.valueOf(healthWorkout.getCommodityFlag()));
        map.put("pullOrder", Integer.valueOf(i));
        map.put("algId", 0);
        return map;
    }

    public static void a(String str) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("labelType", str);
        a("1130073", map);
    }

    public static void e(String str) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("labelId", str);
        a("1130072", map);
    }

    public static void b(Map<String, Object> map) {
        if (map == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "sendAllCourseExposureMapClick map == null");
            return;
        }
        HashMap map2 = new HashMap(map);
        map2.put("event", 1);
        a("1130069", map2);
    }

    public static String d(WorkoutRecord workoutRecord) {
        if (workoutRecord == null || !workoutRecord.isAiWorkout()) {
            return Constants.NULL;
        }
        if (workoutRecord.getRecordModeType() == 1) {
            return Boolean.toString(true);
        }
        return Boolean.toString(false);
    }

    public static int c(IntPlan intPlan) {
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            return 0;
        }
        return intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) ? 1 : 2;
    }

    public static void d(int i, int i2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (i == 0) {
            map.put(BleConstants.SPORT_TYPE, "SP10001");
        } else {
            map.put(BleConstants.SPORT_TYPE, "SP" + i);
        }
        map.put("from", 1);
        map.put("event", Integer.valueOf(i2));
        idy.b(AnalyticsValue.INT_PLAN_1120055.value(), map);
    }

    public static void b() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 1);
        idy.b(AnalyticsValue.INT_PLAN_2040152.value(), map);
    }

    public static void a(int i, int i2) {
        HashMap map = new HashMap(4);
        if (i == 10) {
            map.put("type", 1);
        } else if (i == 20) {
            map.put("type", 2);
        } else if (i == 30) {
            map.put("type", 3);
        } else {
            LogUtil.j("Suggestion_FitnessBiUtils", "setEventForFoodRecord type ", Integer.valueOf(i));
        }
        map.put("entrance", 6);
        map.put("node", Integer.valueOf(i2));
        map.put("click", 1);
        idy.b(AnalyticsValue.INT_PLAN_2040117.value(), map);
    }

    public static void c() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("enter", 0);
        idy.b(AnalyticsValue.INT_PLAN_2040150.value(), map);
    }

    public static void c(boolean z, String str, String str2) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("result", String.valueOf(z));
        map.put("originCourse", str);
        map.put("NewCourse", str2);
        idy.b(AnalyticsValue.INT_PLAN_1120054.value(), map);
    }

    public static void e(int i, List<IntAction> list) {
        HashMap map = new HashMap(3);
        map.put("isOffDay", Boolean.valueOf(njy.e(list)));
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        idy.b(AnalyticsValue.INT_PLAN_1120035.value(), map);
    }

    public static void d(int i, int i2, int i3) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        map.put("event", Integer.valueOf(i2));
        if (i3 > 0) {
            map.put("leaveDays", Integer.valueOf(i3));
        }
        idy.b(AnalyticsValue.INT_PLAN_1120053.value(), map);
    }

    public static void e(List<IntAction> list, List<IntAction> list2, List<RecordData> list3, Map<String, FitWorkout> map) {
        HashMap map2 = new HashMap(4);
        map2.put("finishNum", Integer.valueOf(d(list) + d(list2)));
        int size = njy.e(list2) ? 0 : list2.size();
        if (njy.b(list)) {
            size += list.size();
        }
        map2.put("goalNum", Integer.valueOf(size));
        boolean zA = a(list, map);
        if (!zA) {
            zA = a(list2, map);
        }
        map2.put("hasAICourse", String.valueOf(zA));
        if (njy.b(list3)) {
            ArrayList arrayList = new ArrayList();
            for (RecordData recordData : list3) {
                if (recordData != null) {
                    arrayList.add(Integer.valueOf(recordData.getSportType()));
                }
            }
            map2.put(BleConstants.SPORT_TYPE, arrayList);
        }
        idy.b(AnalyticsValue.INT_PLAN_1120038.value(), map2);
    }

    private static int d(List<IntAction> list) {
        int punchFlag = 0;
        if (njy.e(list)) {
            return 0;
        }
        for (IntAction intAction : list) {
            if (intAction != null) {
                punchFlag += intAction.getPunchFlag();
            }
        }
        return punchFlag;
    }

    private static boolean a(List<IntAction> list, Map<String, FitWorkout> map) {
        FitWorkout fitWorkout;
        if (njy.e(list) || map == null) {
            return false;
        }
        while (true) {
            boolean z = false;
            for (IntAction intAction : list) {
                if (!z && intAction != null && (fitWorkout = map.get(intAction.getActionId())) != null) {
                    if (fitWorkout.getIsAi() == 1) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 10001;
        }
        if (i == 4 || ien.b(i)) {
            return 0;
        }
        return i;
    }

    public static void e(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            return;
        }
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("workout_name", fitWorkout.acquireName());
        map.put("workout_id", fitWorkout.acquireId());
        map.put("resourceType", Integer.valueOf(hkt.b(fitWorkout)));
        String strE = gzx.e(fitWorkout.acquireClasses());
        if (TextUtils.isEmpty(strE)) {
            strE = gzx.c(fitWorkout.getPrimaryClassify());
        }
        map.put("course_type", strE);
        a("1130075", map);
    }

    public static void a(int i, AtomicAction atomicAction, Map<String, Object> map) {
        HashMap map2;
        if (atomicAction == null) {
            return;
        }
        if (map == null) {
            map2 = new HashMap(5);
        } else {
            map2 = new HashMap(map);
        }
        map2.put("click", 1);
        map2.put("event", Integer.valueOf(i));
        map2.put("type", gzx.d(atomicAction.getTrainingPoints()));
        map2.put("action_id", atomicAction.getId());
        map2.put("action_name", atomicAction.getName());
        a(AnalyticsValue.HEALTH_FITNESS_ACTION_DETAIL_1130029.value(), map2);
    }

    public static void a(FitWorkout fitWorkout, int i, int i2, int i3) {
        int i4;
        if (fitWorkout == null) {
            return;
        }
        int iB = hkt.b(fitWorkout);
        if (iB == 1) {
            i4 = 3;
        } else {
            i4 = iB == 2 ? 2 : 0;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("workout_name", fitWorkout.acquireName());
        map.put("workout_id", fitWorkout.acquireId());
        map.put(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE, Integer.valueOf(fitWorkout.acquireCommodityFlag()));
        map.put("previewDuration", Integer.valueOf(i));
        map.put("previewSetDuration", Integer.valueOf(i2));
        if (i4 != 0) {
            map.put("resourceType", Integer.valueOf(i4));
        }
        if (i3 != 0) {
            map.put("event", Integer.valueOf(i3));
        }
        a(AnalyticsValue.TRADE_DETAIL_VIEW_VIDEOS.value(), map);
    }

    public static void b(hld hldVar) {
        if (hldVar == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "preWatchBuyCourse auditionCourseData == null");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        TradeViewInfo tradeViewInfoA = hldVar.a();
        if (tradeViewInfoA == null) {
            LogUtil.j("Suggestion_FitnessBiUtils", "preWatchBuyCourse tradeViewInfo == null");
        } else {
            map.put("type", Integer.valueOf(tradeViewInfoA.getResType()));
            Map<String, String> biParams = tradeViewInfoA.getBiParams();
            if (biParams != null) {
                MarketingBiUtils.d(map, biParams);
            }
        }
        ProductSummary productSummaryC = hldVar.c();
        if (productSummaryC != null) {
            c(map, productSummaryC, "1");
            a(AnalyticsValue.TRADE_BUY.value(), map);
        } else {
            ProductSummary productSummaryE = hldVar.e();
            if (productSummaryE != null) {
                c(map, productSummaryE, "-1");
            }
            a(AnalyticsValue.TRADE_BUY.value(), map);
        }
    }

    private static void c(Map<String, Object> map, ProductSummary productSummary, String str) {
        map.put("name", productSummary.getProductName());
        map.put(ParsedFieldTag.PRICE, String.valueOf(productSummary.getMicroPrice() / 1000000.0f));
        map.put("id", productSummary.getProductId());
        map.put("priceType", str);
    }

    public static void c(int i) {
        HashMap map = new HashMap();
        map.put("pageId", "Sport_course_0003");
        HashMap map2 = new HashMap();
        map2.put("event", Integer.valueOf(i));
        map2.put("payResourceType", qre.f(R.string.IDS_long_video_vip_experience));
        map2.put("name", qre.f(R.string.IDS_long_video_fhd));
        map2.put(ParamConstants.Param.VIEW_TYPE, "benefits_overview");
        map2.put("moduleName", "main_page");
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        lmf.d().a(BaseApplication.b(), AnalyticsValue.VIP_FUNC_INTRO_OPEN_BY_BUSINESS_SHOW.value(), lmnVar, 0);
    }

    public static void b(String str, boolean z, int i) {
        AbstractMap.SimpleEntry<FitWorkout, pcd> fitAndJumpMap = CourseControlManager.getFitAndJumpMap();
        if (TextUtils.isEmpty(str) || fitAndJumpMap == null) {
            return;
        }
        FitWorkout key = fitAndJumpMap.getKey();
        pcd value = fitAndJumpMap.getValue();
        if (key == null || value == null || !str.equals(value.j())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pageId", "Sport_course_0004");
        HashMap map2 = new HashMap();
        map2.put(WebViewHelp.BI_KEY_PULL_FROM, value.n());
        map2.put("resourceId", value.p());
        map2.put("resourceName", value.r());
        map2.put("pullOrder", value.l());
        HashMap map3 = new HashMap();
        if (z) {
            map3.put("event", 1);
            map3.put(FunctionSetBeanReader.BI_ELEMENT, "video_definition");
            map3.put("resourceType", Integer.valueOf(hkt.b(key)));
        } else {
            map3.put("entrance", value.c());
            map3.put("promoteTag", value.m());
            map3.put("resourceType", Integer.valueOf(hkt.b(key)));
            map3.put("supportDevice", Integer.valueOf(CourseEquipmentConnectionTipsUtil.a(CourseEquipmentConnectionTipsUtil.e(key, value.e()))));
            map3.put("isAICourse", Boolean.valueOf(key.getIsAi() == 1));
            map3.put("algId", value.a());
        }
        map3.put("moduleName", "main_page");
        map3.put("workout_id", key.acquireId());
        map3.put("workout_name", key.acquireName());
        if (i == EnumDefinitionOptions.FHD.getIndex()) {
            map3.put(z ? "value" : "resourcequality", "original");
        } else if (i == EnumDefinitionOptions.HD.getIndex()) {
            map3.put(z ? "value" : "resourcequality", "high");
        } else {
            map3.put(z ? "value" : "resourcequality", "quick");
        }
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.c(map2);
        lmnVar.e(map3);
        lmf.d().a(BaseApplication.b(), (z ? AnalyticsValue.COURSE_SET_PLAY_H11300080001 : AnalyticsValue.EVENT_START_FITNESS_WORKOUT).value(), lmnVar, 0);
    }
}
