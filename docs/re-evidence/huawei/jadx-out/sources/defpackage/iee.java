package defpackage;

import android.media.AudioManager;
import com.huawei.health.suggestion.protobuf.CourseProto;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class iee {
    private static int c(int i) {
        return i == 1 ? 6 : 1;
    }

    public static CourseProto.CourseStorageInfo.Builder a(FitWorkout fitWorkout, int i, boolean z) throws dfh {
        CourseProto.CourseStorageInfo.Builder builderNewBuilder = CourseProto.CourseStorageInfo.newBuilder();
        if (fitWorkout == null) {
            ReleaseLogUtil.e("Suggestion_CourseLinkDataUtil", "convertFitWorkout fitWorkout == null");
            return builderNewBuilder;
        }
        int iMax = (int) (Math.max(fitWorkout.getPublishDate(), fitWorkout.getModified()) / 1000);
        LogUtil.a("Suggestion_CourseLinkDataUtil", "convertFitWorkout updateTime:", Integer.valueOf(iMax));
        builderNewBuilder.setExerciseId(fitWorkout.acquireId()).addAllExerciseName(dfe.b(fitWorkout.acquireName())).setTotalMeasurementType(fitWorkout.acquireMeasurementType()).setTotalMeasurementValue(fitWorkout.acquireDuration()).setExerciseVersion(fitWorkout.accquireVersion() + "").setDifficult(fitWorkout.acquireDifficulty()).setUsingType(i).setUpdateTime(iMax).setDefineType(fitWorkout.getCourseDefineType()).setCourseType(fitWorkout.getType());
        if (z) {
            return builderNewBuilder;
        }
        if (fitWorkout.isNewRunCourse()) {
            e(builderNewBuilder, fitWorkout.getCourseActions());
            builderNewBuilder.setActionTotalNum(a(fitWorkout));
        } else {
            ArrayList arrayList = new ArrayList();
            e(fitWorkout, arrayList);
            a(builderNewBuilder, arrayList);
            builderNewBuilder.setActionTotalNum(arrayList.size());
        }
        if (builderNewBuilder.getActionTotalNum() <= 0) {
            LogUtil.j("Suggestion_CourseLinkDataUtil", "courseInfo getActionTotalNum < 0");
        }
        LogUtil.j("Suggestion_CourseLinkDataUtil", "courseInfo ", builderNewBuilder.build().toString());
        return builderNewBuilder;
    }

    private static void e(FitWorkout fitWorkout, List<WorkoutAction> list) {
        if (fitWorkout.acquireWarmUpRunAction() != null) {
            list.add(fitWorkout.acquireWarmUpRunAction());
        }
        List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
        if (listAcquireWorkoutActions != null) {
            list.addAll(listAcquireWorkoutActions);
        }
        if (fitWorkout.acquireWarmUpRunAction() != null) {
            list.add(fitWorkout.acquireCoolDownRunAction());
        }
    }

    private static int a(FitWorkout fitWorkout) {
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

    private static void a(CourseProto.CourseStorageInfo.Builder builder, List<WorkoutAction> list) {
        for (WorkoutAction workoutAction : list) {
            if (workoutAction != null) {
                builder.addCombineInfo(c(workoutAction));
            }
        }
    }

    private static void e(CourseProto.CourseStorageInfo.Builder builder, List<ChoreographedMultiActions> list) {
        for (ChoreographedMultiActions choreographedMultiActions : list) {
            if (choreographedMultiActions != null) {
                builder.addCombineInfo(c(choreographedMultiActions));
            }
        }
    }

    private static CourseProto.CourseStorageInfo.CombineInfo.Builder c(ChoreographedMultiActions choreographedMultiActions) {
        CourseProto.CourseStorageInfo.CombineInfo.Builder builderNewBuilder = CourseProto.CourseStorageInfo.CombineInfo.newBuilder();
        List<ChoreographedSingleAction> actionList = choreographedMultiActions.getActionList();
        if (actionList == null) {
            builderNewBuilder.setActionNum(0);
            return builderNewBuilder;
        }
        builderNewBuilder.setActionNum(actionList.size());
        builderNewBuilder.setRepeatNum(choreographedMultiActions.getRepeatTimes());
        for (ChoreographedSingleAction choreographedSingleAction : actionList) {
            if (choreographedSingleAction != null) {
                CourseProto.CourseStorageInfo.ActionInfo.Builder builderNewBuilder2 = CourseProto.CourseStorageInfo.ActionInfo.newBuilder();
                builderNewBuilder2.setActionId(choreographedSingleAction.getAction().getId());
                builderNewBuilder2.setActionName(choreographedSingleAction.getAction().getName());
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

    private static CourseProto.CourseStorageInfo.CombineInfo.Builder c(WorkoutAction workoutAction) {
        AtomicAction action = workoutAction.getAction();
        CourseProto.CourseStorageInfo.ActionInfo.Builder builderNewBuilder = CourseProto.CourseStorageInfo.ActionInfo.newBuilder();
        if (action == null) {
            ReleaseLogUtil.e("Suggestion_CourseLinkDataUtil", "convertAction atomicAction == null");
            return CourseProto.CourseStorageInfo.CombineInfo.newBuilder();
        }
        ReleaseLogUtil.d("Suggestion_CourseLinkDataUtil", "convertAction actionType", Integer.valueOf(action.getActionSportType()));
        builderNewBuilder.setActionId(workoutAction.getActionId() == null ? "" : workoutAction.getActionId()).setActionName(workoutAction.getAction() != null ? workoutAction.getAction().getName() : "").setMeasurementType(c(action.getActionSportType())).setMeasurementValue(b(action, workoutAction)).setInstensityType(workoutAction.acquireIntensityType()).setInstensityValueH(0).setInstensityValueL(0);
        CourseProto.CourseStorageInfo.CombineInfo.Builder builderNewBuilder2 = CourseProto.CourseStorageInfo.CombineInfo.newBuilder();
        builderNewBuilder2.setActionNum(1).setRepeatNum(1).addActionInfo(builderNewBuilder);
        return builderNewBuilder2;
    }

    private static int b(AtomicAction atomicAction, WorkoutAction workoutAction) {
        if ("timer".equals(gzq.d(atomicAction.getActionSportType()))) {
            return workoutAction.getDuration();
        }
        return atomicAction.getExtendPropertyInt("frequency");
    }

    public static CourseStateProto.CourseState.Builder b(int i, int i2, int i3) {
        if (i2 == 0) {
            ReleaseLogUtil.d("Suggestion_CourseLinkDataUtil", "setChapterBreak restTime == 0");
            return CourseStateProto.CourseState.newBuilder();
        }
        int i4 = i - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        ReleaseLogUtil.d("Suggestion_CourseLinkDataUtil", "buildBreakCourseState tempCurrent:", Integer.valueOf(i4));
        CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
        builderNewBuilder.setCourseIndex(i4);
        builderNewBuilder.setCourseSleepTime(i3);
        builderNewBuilder.setCourseSleepTotalTime(i2);
        return builderNewBuilder;
    }

    public static int c() {
        AudioManager audioManager = (AudioManager) BaseApplication.getContext().getSystemService("audio");
        if (audioManager != null) {
            return (int) ((((double) audioManager.getStreamVolume(3)) * 100.0d) / ((double) audioManager.getStreamMaxVolume(3)));
        }
        return 0;
    }
}
