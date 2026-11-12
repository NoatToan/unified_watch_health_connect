package com.xiaomi.fit.fitness.sync.export.di;

import com.xiaomi.fit.fitness.sync.export.api.FitnessExternalSyncer;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"instance", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer$Companion;", "getInstance", "(Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer$Companion;)Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessExternalSyncer;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessExternalSyncer$Companion;", "(Lcom/xiaomi/fit/fitness/sync/export/api/FitnessExternalSyncer$Companion;)Lcom/xiaomi/fit/fitness/sync/export/api/FitnessExternalSyncer;", "instance$delegate$1", "fitness-sync-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FitnessSyncExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final FitnessSyncer getInstance(@NotNull FitnessSyncer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (FitnessSyncer) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessSyncer instance_delegate$lambda$0() {
        return ((FitnessSyncEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessSyncEntryPoint.class)).getFitnessSyncer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessExternalSyncer instance_delegate$lambda$1() {
        return ((FitnessSyncEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessSyncEntryPoint.class)).getExternalFitnessSyncer();
    }

    @NotNull
    public static final FitnessExternalSyncer getInstance(@NotNull FitnessExternalSyncer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (FitnessExternalSyncer) instance$delegate$1.getValue();
    }
}
