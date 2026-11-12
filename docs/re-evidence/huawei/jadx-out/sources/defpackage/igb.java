package defpackage;

import com.google.protobuf.UninitializedMessageException;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.protobuf.GeneralPlanDataForDevice;
import com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class igb extends BaseCoursePlanDataCustomer {
    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public int handleShakeBusinessType() {
        return SportHiWearBusinessType.FITNESS_RUN_PLAN_HANDLE_SHAKE.getTypeValue();
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public int distributeBusinessType() {
        return SportHiWearBusinessType.FITNESS_AI_FITNESS_PLAN_INFO_FILE.getTypeValue();
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public int finishPlanBusinessType() {
        return SportHiWearBusinessType.FITNESS_AI_FITNESS_PLAN_FINISH.getTypeValue();
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer
    public String getPlanFileName() {
        return "dietcalplan.bin";
    }

    @Override // com.huawei.health.suggestion.wearengine.model.BaseCoursePlanDataCustomer, com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public byte[] getPlanBasicData(IntPlan intPlan, Map<String, FitWorkout> map) throws dfh {
        GeneralPlanDataForDevice.GeneralPlanInfo.Builder builderA = a(intPlan, map);
        if (builderA == null) {
            ReleaseLogUtil.e("Suggestion_GeneralPlanDataCustomer", "getPlanBasicData() planBuilder null");
            return null;
        }
        try {
            ReleaseLogUtil.d("Suggestion_GeneralPlanDataCustomer", "getPlanBasicData() ", builderA.build().toString());
            return builderA.build().toByteArray();
        } catch (UninitializedMessageException e) {
            ReleaseLogUtil.a("Suggestion_GeneralPlanDataCustomer", "getPlanBasicData() exception", LogAnonymous.b(e));
            return null;
        }
    }

    private GeneralPlanDataForDevice.GeneralPlanInfo.Builder a(IntPlan intPlan, Map<String, FitWorkout> map) throws dfh {
        GeneralPlanDataForDevice.GeneralPlanInfo.Plan.Builder builderNewBuilder = GeneralPlanDataForDevice.GeneralPlanInfo.Plan.newBuilder();
        if (intPlan == null || intPlan.getPlanTimeInfo() == null || intPlan.getMetaInfo() == null) {
            ReleaseLogUtil.e("Suggestion_GeneralPlanDataCustomer", "convertPlanData intWeekPlan getPlanTimeInfo getMetaInfo == null");
            return null;
        }
        builderNewBuilder.setPlanId(intPlan.getPlanId());
        builderNewBuilder.setCategory(1);
        builderNewBuilder.setSubCategory(0);
        builderNewBuilder.setStatus(1);
        builderNewBuilder.setTimeZone(intPlan.getTimeZone());
        builderNewBuilder.setStartTime(intPlan.getPlanTimeInfo().getBeginDate());
        builderNewBuilder.setEndTime(intPlan.getPlanTimeInfo().getEndDate());
        GeneralPlanDataForDevice.GeneralPlanInfo.Metadata.Builder builderNewBuilder2 = GeneralPlanDataForDevice.GeneralPlanInfo.Metadata.newBuilder();
        GeneralPlanDataForDevice.GeneralPlanInfo.PlanMetadata.Builder builderNewBuilder3 = GeneralPlanDataForDevice.GeneralPlanInfo.PlanMetadata.newBuilder();
        builderNewBuilder3.setPlanTotalDays(intPlan.getMetaInfo().getDayCount());
        builderNewBuilder3.setPlanTotalWeeks(intPlan.getMetaInfo().getWeekCount());
        int iH = btw.h(intPlan);
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(iH);
        if (weekInfoByOrder == null) {
            ReleaseLogUtil.e("Suggestion_GeneralPlanDataCustomer", "convertPlanData intWeekPlan == null currentWeek:", Integer.valueOf(iH));
            return null;
        }
        builderNewBuilder3.addAllWeekPlanName(dfe.b(weekInfoByOrder.getWeekPeriod()));
        builderNewBuilder3.setExerciseTimes(a(weekInfoByOrder));
        builderNewBuilder3.setCurrentWeekDays(weekInfoByOrder.getDayCount());
        builderNewBuilder3.setWeekNum(weekInfoByOrder.getWeekOrder());
        builderNewBuilder3.setWeekPlanStartTime((int) btw.e(intPlan, weekInfoByOrder.getWeekOrder()));
        builderNewBuilder3.setWeekPlanEndTime((int) btw.d(intPlan, weekInfoByOrder.getWeekOrder()));
        builderNewBuilder2.setPlanMetadata(builderNewBuilder3);
        builderNewBuilder.setMetadata(builderNewBuilder2);
        GeneralPlanDataForDevice.GeneralPlanInfo.Task.Builder builderNewBuilder4 = GeneralPlanDataForDevice.GeneralPlanInfo.Task.newBuilder();
        builderNewBuilder4.addAllName(dfe.b(BaseApplication.getContext().getString(R.string.IDS_course_title_sport)));
        builderNewBuilder4.setType(100);
        builderNewBuilder4.setStatus(1);
        e(intPlan, map, weekInfoByOrder, builderNewBuilder4);
        builderNewBuilder.addTasks(builderNewBuilder4);
        GeneralPlanDataForDevice.GeneralPlanInfo.Builder builderNewBuilder5 = GeneralPlanDataForDevice.GeneralPlanInfo.newBuilder();
        builderNewBuilder5.setPlanBasicInfo(builderNewBuilder);
        return builderNewBuilder5;
    }

    private int a(IntWeekPlan intWeekPlan) {
        int inPlanActionCnt = 0;
        for (int i = 0; i < intWeekPlan.getDayCount(); i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                inPlanActionCnt += dayByIdx.getInPlanActionCnt();
            }
        }
        return inPlanActionCnt;
    }

    private void e(IntPlan intPlan, Map<String, FitWorkout> map, IntWeekPlan intWeekPlan, GeneralPlanDataForDevice.GeneralPlanInfo.Task.Builder builder) throws dfh {
        for (int i = 0; i < intWeekPlan.getDayCount(); i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    GeneralPlanDataForDevice.GeneralPlanInfo.Schedule.Builder builderNewBuilder = GeneralPlanDataForDevice.GeneralPlanInfo.Schedule.newBuilder();
                    builderNewBuilder.setAllDayType(false);
                    long jB = ift.b(TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getBeginDate()), intWeekPlan.getWeekOrder() - 1, dayByIdx.getDayOrder(), lsl.a(lsl.q(System.currentTimeMillis())));
                    builderNewBuilder.setDtStart(jB / 1000);
                    builderNewBuilder.setDtEnd(ift.d(jB) / 1000);
                    GeneralPlanDataForDevice.GeneralPlanInfo.Metadata.Builder builderNewBuilder2 = GeneralPlanDataForDevice.GeneralPlanInfo.Metadata.newBuilder();
                    builderNewBuilder2.setCourseMsg(c(map, dayByIdx, i2, intPlan));
                    builderNewBuilder.setMetadata(builderNewBuilder2);
                    builderNewBuilder.setTimeZone(intPlan.getTimeZone());
                    builder.addSchedules(builderNewBuilder);
                }
            }
        }
    }

    private GeneralPlanDataForDevice.GeneralPlanInfo.CourseMetadata.Builder c(Map<String, FitWorkout> map, IntDayPlan intDayPlan, int i, IntPlan intPlan) throws dfh {
        GeneralPlanDataForDevice.GeneralPlanInfo.CourseMetadata.Builder builderNewBuilder = GeneralPlanDataForDevice.GeneralPlanInfo.CourseMetadata.newBuilder();
        builderNewBuilder.setDayOrder(intDayPlan.getDayOrder());
        builderNewBuilder.setCourseIndex(i);
        builderNewBuilder.setIsDayPunch(intDayPlan.getPunchFlag());
        IntAction inPlanAction = intDayPlan.getInPlanAction(i);
        builderNewBuilder.setCourseId(inPlanAction.getActionId());
        FitWorkout fitWorkout = map.get(inPlanAction.getActionId());
        if (fitWorkout == null) {
            ReleaseLogUtil.a("Suggestion_GeneralPlanDataCustomer", "relative courseId not has workout.");
            throw new dfh(-101, "relative courseId not has workout.");
        }
        builderNewBuilder.addAllCourseName(dfe.b(fitWorkout.acquireName()));
        builderNewBuilder.setCourseType(intPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue() ? 1 : fitWorkout.getType());
        builderNewBuilder.setUpdateTime((int) (Math.max(fitWorkout.getPublishDate(), fitWorkout.getModified()) / 1000));
        builderNewBuilder.setIsCoursePunch(inPlanAction.getPunchFlag());
        return builderNewBuilder;
    }
}
