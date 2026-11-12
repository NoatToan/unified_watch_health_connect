package com.xiaomi.fitness.training_plan.util;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseItem;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekAbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekHabitPlan;
import com.xiaomi.fitness.training_plan_export.model.DeviceTrainingInfoParseResult;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.RunningPaceRange;
import defpackage.hr9;
import defpackage.qu9;
import defpackage.s7r;
import defpackage.ur9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ#\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001c2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/TrainPlanDeviceUtils;", "", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "dayPlanList", "", "Lqu9$b;", "buildAbilityProtoPlans", "(Ljava/util/List;)[Lqu9$b;", "plan", "Lqu9$a;", "buildAbilityProtoItems", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;)[Lqu9$a;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "course", "Lhr9$b;", "buildProtoCourseParts", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;)[Lhr9$b;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;", "item", "buildProtoPart", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;)Lhr9$b;", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "buildHabitProtoPlans", "Lur9;", "fitness", "Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;", "callback", "", "syncTraining2Device", "(Lur9;Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;)V", "stopTrainingPlan", "(Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;)V", "Lqu9;", "training", "Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "unpackDeviceTrainingInfo", "(Lqu9;)Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;", "currentWeekAbilityPlan", "abilityPlanData2Proto", "(Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;)Lur9;", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;", "habitPlan", "habitPlanData2Proto", "(Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;)Lur9;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrainPlanDeviceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainPlanDeviceUtils.kt\ncom/xiaomi/fitness/training_plan/util/TrainPlanDeviceUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n37#2:316\n36#2,3:317\n37#2:322\n36#2,3:323\n37#2:328\n36#2,3:329\n37#2:332\n36#2,3:333\n1863#3,2:320\n1863#3,2:326\n*S KotlinDebug\n*F\n+ 1 TrainPlanDeviceUtils.kt\ncom/xiaomi/fitness/training_plan/util/TrainPlanDeviceUtils\n*L\n207#1:316\n207#1:317,3\n238#1:322\n238#1:323,3\n257#1:328\n257#1:329,3\n313#1:332\n313#1:333,3\n213#1:320,2\n244#1:326,2\n*E\n"})
public final class TrainPlanDeviceUtils {

    @NotNull
    public static final TrainPlanDeviceUtils INSTANCE = new TrainPlanDeviceUtils();

    @NotNull
    private static final String TAG = "TrainPlanDeviceUtils";

    private TrainPlanDeviceUtils() {
    }

    private final qu9.a[] buildAbilityProtoItems(AbilityDayPlan plan) {
        ArrayList arrayList = new ArrayList();
        try {
            List<AbilityDayPlanCourse> courseList = plan.getCourseList();
            if (courseList != null) {
                for (AbilityDayPlanCourse abilityDayPlanCourse : courseList) {
                    qu9.a aVar = new qu9.a();
                    aVar.d = PlanModelsKt.isFinished(abilityDayPlanCourse);
                    Integer startTime = abilityDayPlanCourse.getStartTime();
                    aVar.e = startTime != null ? startTime.intValue() : -1;
                    hr9 hr9Var = new hr9();
                    hr9Var.c = abilityDayPlanCourse.getCourseContent().getRunningCourse() != null ? 1 : 2;
                    hr9Var.d = abilityDayPlanCourse.getCourseId();
                    hr9.a aVar2 = new hr9.a();
                    aVar2.c = abilityDayPlanCourse.getName();
                    aVar2.d = abilityDayPlanCourse.getDuration();
                    aVar2.f = abilityDayPlanCourse.getDesc();
                    aVar2.g = INSTANCE.buildProtoCourseParts(abilityDayPlanCourse);
                    hr9Var.e = aVar2;
                    aVar.c = hr9Var;
                    arrayList.add(aVar);
                }
            }
        } catch (Exception e) {
            LogExtKt.loge(TAG, "buildAbilityProtoItems exception: " + e.getMessage());
        }
        return (qu9.a[]) arrayList.toArray(new qu9.a[0]);
    }

    private final qu9.b[] buildAbilityProtoPlans(List<AbilityDayPlan> dayPlanList) {
        return (qu9.b[]) new ArrayList().toArray(new qu9.b[0]);
    }

    private final qu9.b[] buildHabitProtoPlans(List<HabitDayPlan> dayPlanList) {
        return (qu9.b[]) new ArrayList().toArray(new qu9.b[0]);
    }

    private final hr9.b[] buildProtoCourseParts(AbilityDayPlanCourse course) {
        List<AbilityPlanRunningCourseContent> courseContent;
        Integer loopCount;
        ArrayList arrayList = new ArrayList();
        try {
            AbilityPlanRunningCourse runningCourse = course.getCourseContent().getRunningCourse();
            if (runningCourse != null && (courseContent = runningCourse.getCourseContent()) != null) {
                for (AbilityPlanRunningCourseContent abilityPlanRunningCourseContent : courseContent) {
                    if (!abilityPlanRunningCourseContent.isLoop() || (loopCount = abilityPlanRunningCourseContent.getLoopCount()) == null || loopCount.intValue() <= 0) {
                        arrayList.add(INSTANCE.buildProtoPart(abilityPlanRunningCourseContent.getCourseList().get(0)));
                    } else {
                        Integer loopCount2 = abilityPlanRunningCourseContent.getLoopCount();
                        Intrinsics.checkNotNull(loopCount2);
                        int iIntValue = loopCount2.intValue();
                        for (int i = 0; i < iIntValue; i++) {
                            arrayList.add(INSTANCE.buildProtoPart(abilityPlanRunningCourseContent.getCourseList().get(i)));
                        }
                    }
                }
            }
        } catch (Exception e) {
            LogExtKt.loge(TAG, "buildProtoCourseParts exception: " + e.getMessage());
        }
        return (hr9.b[]) arrayList.toArray(new hr9.b[0]);
    }

    private final hr9.b buildProtoPart(AbilityPlanRunningCourseItem item) {
        hr9.b bVar = new hr9.b();
        bVar.c = item.getType();
        bVar.d = item.getDuration();
        if (item.getPaceRange() != null) {
            hr9.c cVar = new hr9.c();
            cVar.c = 1;
            RunningPaceRange paceRange = item.getPaceRange();
            Intrinsics.checkNotNull(paceRange);
            cVar.d = paceRange.getMinPace();
            RunningPaceRange paceRange2 = item.getPaceRange();
            Intrinsics.checkNotNull(paceRange2);
            cVar.d = paceRange2.getMaxPace();
            bVar.e = cVar;
        }
        return bVar;
    }

    public static /* synthetic */ void stopTrainingPlan$default(TrainPlanDeviceUtils trainPlanDeviceUtils, ITrainingManager.ISyncCallback iSyncCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            iSyncCallback = null;
        }
        trainPlanDeviceUtils.stopTrainingPlan(iSyncCallback);
    }

    public static /* synthetic */ void syncTraining2Device$default(TrainPlanDeviceUtils trainPlanDeviceUtils, ur9 ur9Var, ITrainingManager.ISyncCallback iSyncCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            iSyncCallback = null;
        }
        trainPlanDeviceUtils.syncTraining2Device(ur9Var, iSyncCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, ur9] */
    @Nullable
    public final ur9 abilityPlanData2Proto(@Nullable CurrentWeekAbilityPlan currentWeekAbilityPlan) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (currentWeekAbilityPlan != null) {
            ?? ur9Var = new ur9();
            qu9 qu9Var = new qu9();
            qu9Var.c = 2;
            qu9Var.d = currentWeekAbilityPlan.getPlanId();
            qu9Var.e = INSTANCE.buildAbilityProtoPlans(currentWeekAbilityPlan.getAbilityDayPlans());
            ur9Var.R0(qu9Var);
            objectRef.element = ur9Var;
        }
        return (ur9) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, ur9] */
    @Nullable
    public final ur9 habitPlanData2Proto(@Nullable CurrentWeekHabitPlan habitPlan) {
        List<HabitDayPlan> habitDayPlans;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (habitPlan != null && (habitDayPlans = habitPlan.getHabitDayPlans()) != null) {
            ?? ur9Var = new ur9();
            qu9 qu9Var = new qu9();
            qu9Var.c = 1;
            qu9Var.d = habitPlan.getPlanId();
            qu9Var.e = INSTANCE.buildHabitProtoPlans(habitDayPlans);
            ur9Var.R0(qu9Var);
            objectRef.element = ur9Var;
        }
        return (ur9) objectRef.element;
    }

    public final void stopTrainingPlan(@Nullable final ITrainingManager.ISyncCallback callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 88;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.training_plan.util.TrainPlanDeviceUtils.stopTrainingPlan.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                LogExtKt.logi(TrainPlanDeviceUtils.TAG, "stop training plan fail " + code);
                ITrainingManager.ISyncCallback iSyncCallback = callback;
                if (iSyncCallback != null) {
                    iSyncCallback.onFail("stop training plan fail", code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                LogExtKt.logi(TrainPlanDeviceUtils.TAG, "stop training plan success");
                ITrainingManager.ISyncCallback iSyncCallback = callback;
                if (iSyncCallback != null) {
                    iSyncCallback.onSuccess();
                }
            }
        }, 0, 8, null);
    }

    public final void syncTraining2Device(@Nullable ur9 fitness, @Nullable final ITrainingManager.ISyncCallback callback) {
        if (fitness == null) {
            LogExtKt.loge(TAG, "can not syncTraining2Device with empty fitness data!!");
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 87;
        s7rVar.S(fitness);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.training_plan.util.TrainPlanDeviceUtils$syncTraining2Device$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                LogExtKt.loge("TrainPlanDeviceUtils", "syncTraining2Device fail!! " + did + " " + code);
                ITrainingManager.ISyncCallback iSyncCallback = callback;
                if (iSyncCallback != null) {
                    iSyncCallback.onFail("syncTraining2Device fail!!", code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                LogExtKt.logi("TrainPlanDeviceUtils", "syncTraining2Device success");
                ITrainingManager.ISyncCallback iSyncCallback = callback;
                if (iSyncCallback != null) {
                    iSyncCallback.onSuccess();
                }
            }
        }, 0, 8, null);
    }

    @Nullable
    public final DeviceTrainingInfoParseResult unpackDeviceTrainingInfo(@NotNull qu9 training) {
        Intrinsics.checkNotNullParameter(training, "training");
        return null;
    }
}
