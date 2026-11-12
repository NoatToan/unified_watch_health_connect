package com.xiaomi.fit.fitness.export.step;

import com.xiaomi.fit.fitness.export.step.StepExportExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"INSTANCE", "Lcom/xiaomi/fit/fitness/export/step/IStepProviderSyncer;", "Lcom/xiaomi/fit/fitness/export/step/IStepProviderSyncer$Companion;", "getINSTANCE", "(Lcom/xiaomi/fit/fitness/export/step/IStepProviderSyncer$Companion;)Lcom/xiaomi/fit/fitness/export/step/IStepProviderSyncer;", "INSTANCE$delegate", "Lkotlin/Lazy;", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StepExportExtKt {

    @NotNull
    private static final Lazy INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eeo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StepExportExtKt.INSTANCE_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final IStepProviderSyncer INSTANCE_delegate$lambda$0() {
        return ((StepSyncerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), StepSyncerPoint.class)).geStepSyncer();
    }

    @NotNull
    public static final IStepProviderSyncer getINSTANCE(@NotNull IStepProviderSyncer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IStepProviderSyncer) INSTANCE$delegate.getValue();
    }
}
