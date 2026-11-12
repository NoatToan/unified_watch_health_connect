package com.xiaomi.hm.health.temperature.koin;

import com.xiaomi.hm.health.temperature.usecase.CleanTempDbUseCase;
import com.xiaomi.hm.health.temperature.usecase.FetchTempFromServerUseCase;
import com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase;
import com.xiaomi.hm.health.temperature.usecase.UploadManualTempUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000¨\u0006\t"}, d2 = {"Lorg/koin/core/Koin;", "Lcom/xiaomi/hm/health/temperature/usecase/FetchTempFromServerUseCase;", "fetchTempFromServerUseCase", "Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;", "getAllTypeTempBetweenTimeStampUseCase", "Lcom/xiaomi/hm/health/temperature/usecase/UploadManualTempUseCase;", "uploadManualTempUseCase", "Lcom/xiaomi/hm/health/temperature/usecase/CleanTempDbUseCase;", "cleanTempDbUseCase", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ScopesKt {
    @NotNull
    public static final CleanTempDbUseCase cleanTempDbUseCase(@NotNull Koin koin) {
        return (CleanTempDbUseCase) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CleanTempDbUseCase.class), null, null);
    }

    @NotNull
    public static final FetchTempFromServerUseCase fetchTempFromServerUseCase(@NotNull Koin koin) {
        return (FetchTempFromServerUseCase) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FetchTempFromServerUseCase.class), null, null);
    }

    @NotNull
    public static final GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase(@NotNull Koin koin) {
        return (GetAllTypeTempBetweenTimeStampUseCase) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(GetAllTypeTempBetweenTimeStampUseCase.class), null, null);
    }

    @NotNull
    public static final UploadManualTempUseCase uploadManualTempUseCase(@NotNull Koin koin) {
        return (UploadManualTempUseCase) koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UploadManualTempUseCase.class), null, null);
    }
}
