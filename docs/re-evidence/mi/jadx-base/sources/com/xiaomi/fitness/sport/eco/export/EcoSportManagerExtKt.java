package com.xiaomi.fitness.sport.eco.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport.eco.export.EcoSportManagerExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"INSTANCE", "Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager;", "Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager$Companion;", "getINSTANCE", "(Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager$Companion;)Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "sport-eco-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoSportManagerExtKt {

    @NotNull
    private static final Lazy INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: my7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoSportManagerExtKt.INSTANCE_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoSportManager INSTANCE_delegate$lambda$0() {
        return ((EcoSportManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoSportManagerPoint.class)).getEcoSportManager();
    }

    @NotNull
    public static final EcoSportManager getINSTANCE(@NotNull EcoSportManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoSportManager) INSTANCE$delegate.getValue();
    }
}
