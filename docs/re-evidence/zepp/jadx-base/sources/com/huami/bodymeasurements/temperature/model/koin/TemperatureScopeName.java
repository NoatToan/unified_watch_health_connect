package com.huami.bodymeasurements.temperature.model.koin;

import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/koin/TemperatureScopeName;", "", "", SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, "Ljava/lang/String;", "SINGLE_REPO_IMPL", "ALL_DAY_REPO_IMPL", "MANUAL_REPO_IMPL", "EIGHTY_SECONDS_REPO_IMPL", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureScopeName {

    @NotNull
    public static final String ALL_DAY_REPO_IMPL = "AllDayTempRepositoryImpl";

    @NotNull
    public static final String EIGHTY_SECONDS_REPO_IMPL = "EightySecondsTempRepositoryImpl";

    @NotNull
    public static final TemperatureScopeName INSTANCE = new TemperatureScopeName();

    @NotNull
    public static final String MANUAL_REPO_IMPL = "ManualTempRepositoryImpl";

    @NotNull
    public static final String SINGLE_REPO_IMPL = "SingleTempRepositoryImpl";

    @NotNull
    public static final String TEMPERATURE = "Temperature";

    private TemperatureScopeName() {
    }
}
