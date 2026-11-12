package com.xiaomi.fitness.training_plan.config;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import defpackage.xfl;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/training_plan/config/TrainingPlanComponent;", "", "<init>", "()V", "init", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "training_plan")
public final class TrainingPlanComponent {
    @ComponentTask(notLaterThan = 3, onMainThread = true)
    public final void init() {
        Logger.d(TrainingPlanComponentKt.TAG, "training_plan component init");
        xfl.a().d(new TrainingPlanSchemaHandler());
    }
}
