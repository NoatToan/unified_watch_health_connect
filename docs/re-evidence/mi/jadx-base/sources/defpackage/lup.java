package defpackage;

import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.training_plan.manager.TrainingManager;

/* JADX INFO: loaded from: classes10.dex */
public final class lup {
    public static void a(TrainingManager trainingManager, FitnessDataGetter fitnessDataGetter) {
        trainingManager.dataGetter = fitnessDataGetter;
    }

    public static void b(TrainingManager trainingManager, MainHelper mainHelper) {
        trainingManager.mainHelper = mainHelper;
    }
}
