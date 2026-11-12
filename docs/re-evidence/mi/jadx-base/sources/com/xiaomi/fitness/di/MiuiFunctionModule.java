package com.xiaomi.fitness.di;

import com.xiaomi.fitness.motion.recognition.SceneStepProvider;
import com.xiaomi.fitness.motion.recognition.Step;
import com.xiaomi.fitness.steps.PhoneStepsProvider;
import com.xiaomi.fitness.steps.StepItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/di/MiuiFunctionModule;", "", "<init>", "()V", "provideSceneStepProvider", "Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiFunctionModule {
    @NotNull
    public final SceneStepProvider provideSceneStepProvider() {
        return new SceneStepProvider() { // from class: com.xiaomi.fitness.di.MiuiFunctionModule.provideSceneStepProvider.1
            @Override // com.xiaomi.fitness.motion.recognition.SceneStepProvider
            public List<Step> getActsByTime(long beginTime, long endTime) {
                List<StepItem> stepsOptimization = PhoneStepsProvider.INSTANCE.getStepsOptimization(beginTime, endTime, 0);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stepsOptimization, 10));
                for (StepItem stepItem : stepsOptimization) {
                    arrayList.add(new Step(stepItem.getBeginTime(), stepItem.getEndTime(), stepItem.getMode(), stepItem.getSteps()));
                }
                return arrayList;
            }

            @Override // com.xiaomi.fitness.motion.recognition.SceneStepProvider
            public List<Step> getStepCount(long beginTime, long endTime) {
                List<StepItem> stepsOptimization = PhoneStepsProvider.INSTANCE.getStepsOptimization(beginTime, endTime, 0);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stepsOptimization, 10));
                for (StepItem stepItem : stepsOptimization) {
                    arrayList.add(new Step(stepItem.getBeginTime(), stepItem.getEndTime(), stepItem.getMode(), stepItem.getSteps()));
                }
                return arrayList;
            }
        };
    }
}
