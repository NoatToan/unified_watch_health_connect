package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.suggestion.protobuf.PlanDataForDevice;
import com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class igi extends BaseCoursePlanDataCustomer {
    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public int handleShakeBusinessType() {
        return SportHiWearBusinessType.FITNESS_RUN_PLAN_HANDLE_SHAKE.getTypeValue();
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public int distributeBusinessType() {
        return SportHiWearBusinessType.FITNESS_RUN_PLAN_INFO_FILE.getTypeValue();
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public int finishPlanBusinessType() {
        return SportHiWearBusinessType.FITNESS_RUN_PLAN_FINISH.getTypeValue();
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer
    public String getPlanFileName() {
        return "planInfo.bin";
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public byte[] getPlanBasicData(IntPlan intPlan, Map<String, FitWorkout> map) {
        PlanDataForDevice.PlanInfo.Builder builderC = c(intPlan, map);
        ReleaseLogUtil.d("Suggestion_RunPlanDataCustomer", "getPlanBasicData() ", builderC.build().toString());
        return builderC.build().toByteArray();
    }

    private PlanDataForDevice.PlanInfo.Builder c(IntPlan intPlan, Map<String, FitWorkout> map) {
        IntWeekPlan intWeekPlan;
        int i;
        IntWeekPlan intWeekPlan2;
        int i2;
        PlanDataForDevice.PlanInfo.Builder builderNewBuilder = PlanDataForDevice.PlanInfo.newBuilder();
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(btw.h(intPlan));
        if (weekInfoByOrder != null) {
            PlanDataForDevice.PlanInfo.WeekPlanBasicInfo.Builder builderD = d(weekInfoByOrder, intPlan);
            int iE = (int) btw.e(intPlan, weekInfoByOrder.getWeekOrder());
            int i3 = 0;
            if (weekInfoByOrder.getDayCount() != 0) {
                int courseNum = 0;
                while (i3 < weekInfoByOrder.getDayCount()) {
                    IntDayPlan dayByIdx = weekInfoByOrder.getDayByIdx(i3);
                    if (dayByIdx == null) {
                        intWeekPlan2 = weekInfoByOrder;
                        i2 = iE;
                    } else {
                        int iE2 = btw.e(iE, (String) null, dayByIdx.getDayOrder());
                        intWeekPlan2 = weekInfoByOrder;
                        i2 = iE;
                        if (iE2 > ((long) iE) - TimeUnit.DAYS.toSeconds(1L)) {
                            PlanDataForDevice.PlanInfo.DayPlanBasicInfo.Builder builderE = e(iE2, dayByIdx, map);
                            builderNewBuilder.addDayPlanBasicInfo(builderE);
                            courseNum += builderE.getCourseNum();
                        }
                        i3++;
                        weekInfoByOrder = intWeekPlan2;
                        iE = i2;
                    }
                    i3++;
                    weekInfoByOrder = intWeekPlan2;
                    iE = i2;
                }
                intWeekPlan = weekInfoByOrder;
                i = iE;
                i3 = courseNum;
            } else {
                intWeekPlan = weekInfoByOrder;
                i = iE;
            }
            builderD.setExerciseTimes(i3);
            builderD.setCurrentWeekDays(intWeekPlan.getDayCount());
            builderNewBuilder.addWeekPlanBasicInfo(builderD);
            seconds = i;
        }
        builderNewBuilder.setPlanBasicInfo(a(intPlan, seconds));
        return builderNewBuilder;
    }

    private PlanDataForDevice.PlanInfo.PlanBasicInfo.Builder a(IntPlan intPlan, int i) {
        PlanDataForDevice.PlanInfo.PlanBasicInfo.Builder builderNewBuilder = PlanDataForDevice.PlanInfo.PlanBasicInfo.newBuilder();
        builderNewBuilder.setPlanId(intPlan.getPlanId());
        builderNewBuilder.addAllPlanName(dfe.b(a(intPlan.getMetaInfo().getName(), 30)));
        builderNewBuilder.setLanguageType(CommonUtil.z());
        builderNewBuilder.setPlanTotalDays(intPlan.getMetaInfo().getDayCount());
        builderNewBuilder.setPlanTotalWeeks(intPlan.getMetaInfo().getWeekCount());
        builderNewBuilder.setPlanStartTime((int) intPlan.getPlanTimeInfo().getBeginDate());
        long millis = TimeUnit.SECONDS.toMillis(i);
        builderNewBuilder.setZoneOffset(btw.b(lsl.q(millis), millis));
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (intPlan.getCompatiblePlan() != null) {
            iCurrentTimeMillis = (int) (intPlan.getCompatiblePlan().getLatestClockInTime() / 1000);
        }
        builderNewBuilder.setPunchTimeStamp(iCurrentTimeMillis);
        return builderNewBuilder;
    }

    private static String a(String str, int i) {
        if (TextUtils.isEmpty(str) || str.getBytes(StandardCharsets.UTF_8).length <= i) {
            return str;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length() && (length = length + String.valueOf(str.charAt(i3)).getBytes(StandardCharsets.UTF_8).length) <= i - 3; i3++) {
            i2++;
        }
        return str.substring(0, i2) + "...";
    }

    private PlanDataForDevice.PlanInfo.WeekPlanBasicInfo.Builder d(IntWeekPlan intWeekPlan, IntPlan intPlan) {
        PlanDataForDevice.PlanInfo.WeekPlanBasicInfo.Builder builderNewBuilder = PlanDataForDevice.PlanInfo.WeekPlanBasicInfo.newBuilder();
        builderNewBuilder.addAllWeekPlanName(dfe.b(intWeekPlan.getWeekPeriod()));
        builderNewBuilder.setCurrentWeekDays(intWeekPlan.getDayCount());
        builderNewBuilder.setExerciseTimes(intWeekPlan.getDayCount());
        builderNewBuilder.setWeekNum(intWeekPlan.getWeekOrder());
        builderNewBuilder.setWeekPlanStartTime((int) btw.e(intPlan, intWeekPlan.getWeekOrder()));
        builderNewBuilder.setWeekPlanEndTime((int) btw.d(intPlan, intWeekPlan.getWeekOrder()));
        return builderNewBuilder;
    }

    private PlanDataForDevice.PlanInfo.DayPlanBasicInfo.Builder e(int i, IntDayPlan intDayPlan, Map<String, FitWorkout> map) {
        PlanDataForDevice.PlanInfo.DayPlanBasicInfo.Builder builderNewBuilder = PlanDataForDevice.PlanInfo.DayPlanBasicInfo.newBuilder();
        builderNewBuilder.setTime(i);
        if (intDayPlan.getInPlanActionCnt() != 0) {
            builderNewBuilder.setIsDayPunch(intDayPlan.getPunchFlag());
            boolean z = false;
            for (int i2 = 0; i2 < intDayPlan.getInPlanActionCnt(); i2++) {
                IntAction inPlanAction = intDayPlan.getInPlanAction(i2);
                if (inPlanAction != null) {
                    if ("Race".equals(inPlanAction.getActionId())) {
                        ReleaseLogUtil.d("Suggestion_RunPlanDataCustomer", "getDayBasicInfo race day");
                        z = true;
                    } else {
                        builderNewBuilder.addDayPlanCourse(a(inPlanAction, map.get(inPlanAction.getActionId())));
                    }
                }
            }
            builderNewBuilder.setCourseNum(z ? 0 : intDayPlan.getInPlanActionCnt());
            return builderNewBuilder;
        }
        builderNewBuilder.setCourseNum(0);
        builderNewBuilder.setIsDayPunch(0);
        return builderNewBuilder;
    }

    private PlanDataForDevice.PlanInfo.CourseOutLine.Builder a(IntAction intAction, FitWorkout fitWorkout) {
        PlanDataForDevice.PlanInfo.CourseOutLine.Builder builderNewBuilder = PlanDataForDevice.PlanInfo.CourseOutLine.newBuilder();
        builderNewBuilder.setCourseId(intAction.getActionId());
        builderNewBuilder.addAllCourseName(dfe.b(fitWorkout.acquireName()));
        int iMax = (int) (Math.max(fitWorkout.getPublishDate(), fitWorkout.getModified()) / 1000);
        LogUtil.a("Suggestion_RunPlanDataCustomer", "getCourseOutline updateTime:", Integer.valueOf(iMax));
        builderNewBuilder.setUpdateTime(iMax);
        builderNewBuilder.setCourseType(fitWorkout.getType());
        builderNewBuilder.setIsCoursePunch(intAction.getPunchFlag());
        return builderNewBuilder;
    }
}
