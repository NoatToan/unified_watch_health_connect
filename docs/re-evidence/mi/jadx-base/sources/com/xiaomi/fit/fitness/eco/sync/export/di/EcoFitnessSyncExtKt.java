package com.xiaomi.fit.fitness.eco.sync.export.di;

import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fit.fitness.eco.sync.export.di.EcoFitnessSyncExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer$Companion;", "getInstance", "(Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer$Companion;)Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "instance$delegate", "Lkotlin/Lazy;", "fitness-eco-sync-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoFitnessSyncExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ot7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoFitnessSyncExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final EcoFitnessSyncer getInstance(@NotNull EcoFitnessSyncer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoFitnessSyncer) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoFitnessSyncer instance_delegate$lambda$0() {
        return ((EcoFitnessSyncEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoFitnessSyncEntryPoint.class)).getEcoFitnessSyncer();
    }
}
