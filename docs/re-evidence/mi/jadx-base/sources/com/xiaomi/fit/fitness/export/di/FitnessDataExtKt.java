package com.xiaomi.fit.fitness.export.di;

import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.HealthConnectApi;
import com.xiaomi.fit.fitness.export.api.ISummarySyncManager;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\u0000\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0003\u0010\r\"\u001f\u0010\u0000\u001a\u00020\u000f*\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0003\u0010\u0011\"\u001f\u0010\u0000\u001a\u00020\u0013*\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0003\u0010\u0015\"\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\"\u000e\u0010#\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"instance", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder$Companion;", "getInstance", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder$Companion;)Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter$Companion;", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter$Companion;)Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "instance$delegate$1", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider$Companion;", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider$Companion;)Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "instance$delegate$2", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer$Companion;", "(Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer$Companion;)Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "instance$delegate$3", "Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager;", "Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager$Companion;", "(Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager$Companion;)Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager;", "instance$delegate$4", "curseApi", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getCurseApi", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "sportSummaryApi", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "getSportSummaryApi", "()Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "healthConnectApi", "Lcom/xiaomi/fit/fitness/export/api/HealthConnectApi;", "getHealthConnectApi", "()Lcom/xiaomi/fit/fitness/export/api/HealthConnectApi;", "PAGE_NUM", "", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FitnessDataExtKt {
    public static final int PAGE_NUM = 100;

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataExtKt.instance_delegate$lambda$3();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$4 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataExtKt.instance_delegate$lambda$4();
        }
    });

    @NotNull
    private static final CurseApi curseApi = ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getCurseApi();

    @NotNull
    private static final SportSummaryApi sportSummaryApi = ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getSportSummaryApi();

    @NotNull
    private static final HealthConnectApi healthConnectApi = ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getHealthConnectApi();

    @NotNull
    public static final CurseApi getCurseApi() {
        return curseApi;
    }

    @NotNull
    public static final HealthConnectApi getHealthConnectApi() {
        return healthConnectApi;
    }

    @NotNull
    public static final FitnessDataRecorder getInstance(@NotNull FitnessDataRecorder.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (FitnessDataRecorder) instance$delegate.getValue();
    }

    @NotNull
    public static final SportSummaryApi getSportSummaryApi() {
        return sportSummaryApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder instance_delegate$lambda$0() {
        return ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getFitnessDataRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter instance_delegate$lambda$1() {
        return ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getFitnessDataItemGetter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IRepositoryProvider instance_delegate$lambda$2() {
        return ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getRepositoryProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer instance_delegate$lambda$3() {
        return ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getServerSyncer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISummarySyncManager instance_delegate$lambda$4() {
        return ((FitnessDataEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), FitnessDataEntryPoint.class)).getSummarySyncManager();
    }

    @NotNull
    public static final FitnessDataGetter getInstance(@NotNull FitnessDataGetter.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (FitnessDataGetter) instance$delegate$1.getValue();
    }

    @NotNull
    public static final IRepositoryProvider getInstance(@NotNull IRepositoryProvider.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IRepositoryProvider) instance$delegate$2.getValue();
    }

    @NotNull
    public static final FitnessServerSyncer getInstance(@NotNull FitnessServerSyncer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (FitnessServerSyncer) instance$delegate$3.getValue();
    }

    @NotNull
    public static final ISummarySyncManager getInstance(@NotNull ISummarySyncManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISummarySyncManager) instance$delegate$4.getValue();
    }
}
