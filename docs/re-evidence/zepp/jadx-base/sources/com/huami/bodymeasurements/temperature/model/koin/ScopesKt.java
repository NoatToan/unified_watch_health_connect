package com.huami.bodymeasurements.temperature.model.koin;

import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.koin.data.TemperatureCoroutineScope;
import com.huami.bodymeasurements.temperature.model.local.TemperatureDb;
import com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.EightySecondsTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl;
import com.huami.bodymeasurements.temperature.model.usecase.CleanLocalTempUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.FetchTempFromServerUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.UploadUnSyncTempUseCase;
import com.huami.health.bodymeasurements.p014temperatureservice.TemperatureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0000\u001a\n\u0010\u0014\u001a\u00020\u0013*\u00020\u0000\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0000¨\u0006\u0019"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "temperatureScope", "Lcom/huami/bodymeasurements/temperature/model/local/TemperatureDb;", "temperatureDb", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/SingleTempRepositoryImpl;", "singleTempRepository", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/AllDayTempRepositoryImpl;", "allDayTempRepository", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/ManualTempRepositoryImpl;", "manualTempRepository", "Lcom/huami/bodymeasurements/temperature/model/repository/impl/EightySecondsTempRepositoryImpl;", "eightySecondsTempRepository", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "tempExternalApi", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TemperatureCoroutineScope;", "temperatureCoroutineScope", "Lcom/huami/bodymeasurements/temperature/model/usecase/FetchTempFromServerUseCase;", "fetchTempFromServerUseCase", "Lcom/huami/bodymeasurements/temperature/model/usecase/UploadUnSyncTempUseCase;", "uploadUnSyncTempUseCase", "Lcom/huami/bodymeasurements/temperature/model/usecase/CleanLocalTempUseCase;", "cleanLocalTempUseCase", "Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureService;", "temperatureService", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesKt {
    @NotNull
    public static final AllDayTempRepositoryImpl allDayTempRepository(@NotNull Koin koin) {
        return (AllDayTempRepositoryImpl) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(AllDayTempRepositoryImpl.class), QualifierKt.named("AllDayTempRepositoryImpl"), null);
    }

    @NotNull
    public static final CleanLocalTempUseCase cleanLocalTempUseCase(@NotNull Koin koin) {
        return (CleanLocalTempUseCase) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(CleanLocalTempUseCase.class), null, null);
    }

    @NotNull
    public static final EightySecondsTempRepositoryImpl eightySecondsTempRepository(@NotNull Koin koin) {
        return (EightySecondsTempRepositoryImpl) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(EightySecondsTempRepositoryImpl.class), QualifierKt.named("EightySecondsTempRepositoryImpl"), null);
    }

    @NotNull
    public static final FetchTempFromServerUseCase fetchTempFromServerUseCase(@NotNull Koin koin) {
        return (FetchTempFromServerUseCase) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(FetchTempFromServerUseCase.class), null, null);
    }

    @NotNull
    public static final ManualTempRepositoryImpl manualTempRepository(@NotNull Koin koin) {
        return (ManualTempRepositoryImpl) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(ManualTempRepositoryImpl.class), QualifierKt.named("ManualTempRepositoryImpl"), null);
    }

    @NotNull
    public static final SingleTempRepositoryImpl singleTempRepository(@NotNull Koin koin) {
        return (SingleTempRepositoryImpl) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(SingleTempRepositoryImpl.class), QualifierKt.named("SingleTempRepositoryImpl"), null);
    }

    @Nullable
    public static final TempExternalApi tempExternalApi(@NotNull Koin koin) {
        return (TempExternalApi) temperatureScope(koin).getOrNull(Reflection.getOrCreateKotlinClass(TempExternalApi.class), null, null);
    }

    @NotNull
    public static final TemperatureCoroutineScope temperatureCoroutineScope(@NotNull Koin koin) {
        return (TemperatureCoroutineScope) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(TemperatureCoroutineScope.class), null, null);
    }

    @NotNull
    public static final TemperatureDb temperatureDb(@NotNull Koin koin) {
        return (TemperatureDb) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(TemperatureDb.class), null, null);
    }

    @NotNull
    public static final Scope temperatureScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "Temperature", QualifierKt.named("Temperature"), null, 4, null);
    }

    @NotNull
    public static final TemperatureService temperatureService(@NotNull Koin koin) {
        return (TemperatureService) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(TemperatureService.class), null, null);
    }

    @NotNull
    public static final UploadUnSyncTempUseCase uploadUnSyncTempUseCase(@NotNull Koin koin) {
        return (UploadUnSyncTempUseCase) temperatureScope(koin).get(Reflection.getOrCreateKotlinClass(UploadUnSyncTempUseCase.class), null, null);
    }
}
