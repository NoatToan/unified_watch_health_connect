package com.huawei.health.suggestion.wearengine.model;

import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.suggestion.protobuf.CourseDataForDevice;
import com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import defpackage.dfe;
import defpackage.dfh;
import defpackage.njy;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseCoursePlanDataCustomer implements CoursePlanDataCustomer {
    @Override // com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public abstract int distributeBusinessType();

    @Override // com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public abstract int finishPlanBusinessType();

    @Override // com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public abstract byte[] getPlanBasicData(IntPlan intPlan, Map<String, FitWorkout> map) throws dfh;

    public abstract String getPlanFileName();

    @Override // com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public abstract int handleShakeBusinessType();

    @Override // com.huawei.health.suggestion.wearengine.CoursePlanDataCustomer
    public byte[] getCourseData(FitWorkout fitWorkout, int i) throws dfh {
        return convertFitWorkout(fitWorkout, i).build().toByteArray();
    }

    private CourseDataForDevice.CourseStorageInfo.Builder convertFitWorkout(FitWorkout fitWorkout, int i) throws dfh {
        CourseDataForDevice.CourseStorageInfo.Builder builderNewBuilder = CourseDataForDevice.CourseStorageInfo.newBuilder();
        int iMax = (int) (Math.max(fitWorkout.getPublishDate(), fitWorkout.getModified()) / 1000);
        LogUtil.a(CoursePlanDataCustomer.TAG, "convertFitWorkout updateTime:", Integer.valueOf(iMax));
        builderNewBuilder.setExerciseId(fitWorkout.acquireId()).addAllExerciseName(dfe.b(fitWorkout.acquireName())).setTotalMeasurementType(fitWorkout.acquireMeasurementType()).setTotalMeasurementValue(fitWorkout.acquireDuration()).setExerciseVersion(fitWorkout.accquireVersion() + "").setDifficult(fitWorkout.acquireDifficulty()).setUsingType(i).setUpdateTime(iMax).setDefineType(fitWorkout.getCourseDefineType()).setCourseType(fitWorkout.getType());
        if (fitWorkout.isNewRunCourse()) {
            addActions(builderNewBuilder, fitWorkout.getCourseActions());
            builderNewBuilder.setActionTotalNum(getTotalActions(fitWorkout));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(fitWorkout.acquireWarmUpRunAction());
            arrayList.addAll(fitWorkout.acquireWorkoutActions());
            arrayList.add(fitWorkout.acquireCoolDownRunAction());
            addOldActions(builderNewBuilder, arrayList);
            builderNewBuilder.setActionTotalNum(arrayList.size());
        }
        if (builderNewBuilder.getActionTotalNum() <= 0) {
            throw new dfh(-101, "course data convert error with null actions.");
        }
        LogUtil.j(CoursePlanDataCustomer.TAG, "courseInfo ", builderNewBuilder.build().toString());
        builderNewBuilder.build().toByteArray();
        return builderNewBuilder;
    }

    private void addActions(CourseDataForDevice.CourseStorageInfo.Builder builder, List<ChoreographedMultiActions> list) {
        Iterator<ChoreographedMultiActions> it = list.iterator();
        while (it.hasNext()) {
            builder.addCombineInfo(convertAction(it.next()));
        }
    }

    private CourseDataForDevice.CourseStorageInfo.CombineInfo.Builder convertAction(WorkoutAction workoutAction) {
        CourseDataForDevice.CourseStorageInfo.ActionInfo.Builder builderNewBuilder = CourseDataForDevice.CourseStorageInfo.ActionInfo.newBuilder();
        builderNewBuilder.setActionId(workoutAction.getActionId()).setMeasurementType(workoutAction.acquireIntensityType()).setMeasurementValue(workoutAction.acquireMeasurementValue()).setInstensityType(workoutAction.acquireIntensityType()).setInstensityValueH(0).setInstensityValueL(0);
        CourseDataForDevice.CourseStorageInfo.CombineInfo.Builder builderNewBuilder2 = CourseDataForDevice.CourseStorageInfo.CombineInfo.newBuilder();
        builderNewBuilder2.setActionNum(1).setRepeatNum(1).addActionInfo(builderNewBuilder);
        return builderNewBuilder2;
    }

    private void addOldActions(CourseDataForDevice.CourseStorageInfo.Builder builder, List<WorkoutAction> list) {
        Iterator<WorkoutAction> it = list.iterator();
        while (it.hasNext()) {
            builder.addCombineInfo(convertAction(it.next()));
        }
    }

    private CourseDataForDevice.CourseStorageInfo.CombineInfo.Builder convertAction(ChoreographedMultiActions choreographedMultiActions) {
        CourseDataForDevice.CourseStorageInfo.CombineInfo.Builder builderNewBuilder = CourseDataForDevice.CourseStorageInfo.CombineInfo.newBuilder();
        List<ChoreographedSingleAction> actionList = choreographedMultiActions.getActionList();
        if (actionList == null) {
            builderNewBuilder.setActionNum(0);
            return builderNewBuilder;
        }
        builderNewBuilder.setActionNum(actionList.size());
        builderNewBuilder.setRepeatNum(choreographedMultiActions.getRepeatTimes());
        for (ChoreographedSingleAction choreographedSingleAction : actionList) {
            if (choreographedSingleAction != null) {
                CourseDataForDevice.CourseStorageInfo.ActionInfo.Builder builderNewBuilder2 = CourseDataForDevice.CourseStorageInfo.ActionInfo.newBuilder();
                builderNewBuilder2.setActionId(choreographedSingleAction.getAction().getId());
                TargetConfig targetConfig = choreographedSingleAction.getTargetConfig();
                if (targetConfig != null) {
                    builderNewBuilder2.setMeasurementType(CommonUtil.e(targetConfig.getId(), 255)).setMeasurementValue((int) Math.round(TargetConfig.ValueTypes.LOW_VALUE.getValue() == targetConfig.getValueType() ? targetConfig.getValueL() : targetConfig.getValueH()));
                } else {
                    builderNewBuilder2.setMeasurementType(255).setMeasurementValue(0);
                }
                TargetConfig intensityConfig = choreographedSingleAction.getIntensityConfig();
                if (intensityConfig != null) {
                    builderNewBuilder2.setInstensityType(CommonUtil.e(intensityConfig.getId(), 255)).setInstensityValueH((int) Math.round(intensityConfig.getValueH())).setInstensityValueL((int) Math.round(intensityConfig.getValueL()));
                } else {
                    builderNewBuilder2.setInstensityType(255).setInstensityValueH(0).setInstensityValueL(0);
                }
                builderNewBuilder.addActionInfo(builderNewBuilder2);
            }
        }
        return builderNewBuilder;
    }

    private int getTotalActions(FitWorkout fitWorkout) {
        List<ChoreographedMultiActions> courseActions = fitWorkout.getCourseActions();
        int size = 0;
        if (njy.e(courseActions)) {
            return 0;
        }
        for (ChoreographedMultiActions choreographedMultiActions : courseActions) {
            if (choreographedMultiActions != null && !njy.e(choreographedMultiActions.getActionList())) {
                size += choreographedMultiActions.getActionList().size();
            }
        }
        return size;
    }

    public static int getFinishPlanBusinessType(int i) {
        if (IntPlan.PlanType.AI_RUN_PLAN.getType() == i) {
            return SportHiWearBusinessType.FITNESS_RUN_PLAN_FINISH.getTypeValue();
        }
        return SportHiWearBusinessType.FITNESS_AI_FITNESS_PLAN_FINISH.getTypeValue();
    }
}
