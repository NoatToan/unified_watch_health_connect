package com.huami.health.bodymeasurements.p014temperatureservice;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/bodymeasurements/temperatureservice/Temperature;", "loadLatestTemperature", "", "supportWristTempDevice", "temperatureservice_release"}, k = 1, mv = {1, 4, 0})
public interface TemperatureService {
    @NotNull
    Flow<Temperature> loadLatestTemperature();

    boolean supportWristTempDevice();
}
