package com.xiaomi.fitness.sport_eco_manager_export.di;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoGym;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\u0000\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0003\u0010\r\"\u001f\u0010\u0000\u001a\u00020\u000f*\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"instance", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState$Companion;", "getInstance", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState$Companion;)Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData$Companion;", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData$Companion;)Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "instance$delegate$1", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym$Companion;", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym$Companion;)Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoGym;", "instance$delegate$2", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISCMRepository;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISCMRepository$Companion;", "(Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISCMRepository$Companion;)Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISCMRepository;", "instance$delegate$3", "sport-eco-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportEcoManagerExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hln
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportEcoManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iln
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportEcoManagerExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jln
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportEcoManagerExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kln
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportEcoManagerExtKt.instance_delegate$lambda$3();
        }
    });

    @NotNull
    public static final IEcoSportRemoteState getInstance(@NotNull IEcoSportRemoteState.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IEcoSportRemoteState) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IEcoSportRemoteState instance_delegate$lambda$0() {
        return ((SportEcoManagerEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportEcoManagerEntryPoint.class)).getEcoSportStateCaller();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IEcoSportRemoteData instance_delegate$lambda$1() {
        return ((SportEcoManagerEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportEcoManagerEntryPoint.class)).getEcoSportDataCaller();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IEcoGym instance_delegate$lambda$2() {
        return ((EcoGymEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoGymEntryPoint.class)).getEcoGym();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISCMRepository instance_delegate$lambda$3() {
        return ((EcoRepositoryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoRepositoryPoint.class)).getEcoScmRepository();
    }

    @NotNull
    public static final IEcoSportRemoteData getInstance(@NotNull IEcoSportRemoteData.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IEcoSportRemoteData) instance$delegate$1.getValue();
    }

    @NotNull
    public static final IEcoGym getInstance(@NotNull IEcoGym.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IEcoGym) instance$delegate$2.getValue();
    }

    @NotNull
    public static final ISCMRepository getInstance(@NotNull ISCMRepository.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISCMRepository) instance$delegate$3.getValue();
    }
}
