package com.huami.bodymeasurements.temperature.view;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureTypeConstants;", "", "", "ALL_DAY_TEMP", "Ljava/lang/String;", "SINGLE_TEMP", "MANUAL_TEMP", "EIGHTY_SECONDS_TEMP", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureTypeConstants {

    @NotNull
    public static final String ALL_DAY_TEMP = "all_day_temperature";

    @NotNull
    public static final String EIGHTY_SECONDS_TEMP = "eighty_seconds_temperature";

    @NotNull
    public static final TemperatureTypeConstants INSTANCE = new TemperatureTypeConstants();

    @NotNull
    public static final String MANUAL_TEMP = "manual_temperature";

    @NotNull
    public static final String SINGLE_TEMP = "single_temperature";

    private TemperatureTypeConstants() {
    }
}
