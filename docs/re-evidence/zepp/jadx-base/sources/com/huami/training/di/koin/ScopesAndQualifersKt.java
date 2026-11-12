package com.huami.training.di.koin;

import com.huami.training.api.TrainingWebApi;
import com.huami.training.db.TrainingDb;
import com.huami.training.dto.Trainer;
import com.huami.training.helper.AppExecutors;
import com.huami.training.util.ConfigManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0001¨\u0006\u0010"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "trainingScope", "Lcom/huami/training/helper/AppExecutors;", "trainingAppExecutors", "Lcom/huami/training/api/TrainingWebApi;", "trainingWebApi", "Lcom/huami/training/db/TrainingDb;", "trainingDb", "Lcom/huami/training/util/ConfigManager;", "trainingConfigManager", "appExecutors", "Lcom/huami/training/dto/Trainer;", "trainer", "", "webHost", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {
    @NotNull
    public static final AppExecutors appExecutors(@NotNull Scope scope) {
        return (AppExecutors) trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null);
    }

    @NotNull
    public static final Trainer trainer(@NotNull Scope scope) {
        return (Trainer) trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null);
    }

    @NotNull
    public static final AppExecutors trainingAppExecutors(@NotNull Koin koin) {
        return (AppExecutors) trainingScope(koin).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null);
    }

    @NotNull
    public static final ConfigManager trainingConfigManager(@NotNull Koin koin) {
        return (ConfigManager) trainingScope(koin).get(Reflection.getOrCreateKotlinClass(ConfigManager.class), null, null);
    }

    @NotNull
    public static final TrainingDb trainingDb(@NotNull Koin koin) {
        return (TrainingDb) trainingScope(koin).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null);
    }

    @NotNull
    public static final Scope trainingScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "Training", QualifierKt.named("Training"), null, 4, null);
    }

    @NotNull
    public static final TrainingWebApi trainingWebApi(@NotNull Koin koin) {
        return (TrainingWebApi) trainingScope(koin).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null);
    }

    @NotNull
    public static final String webHost(@NotNull Scope scope) {
        return (String) trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(TrainingQualifierNames.HOST), null);
    }
}
