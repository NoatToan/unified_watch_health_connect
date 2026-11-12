package defpackage;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.fitness.training_plan.di.TrainingModule;

/* JADX INFO: loaded from: classes10.dex */
public final class mup implements dei {
    public static CapabilityModel a(TrainingModule trainingModule) {
        return (CapabilityModel) f6i.c(trainingModule.provideTrainingModule());
    }
}
