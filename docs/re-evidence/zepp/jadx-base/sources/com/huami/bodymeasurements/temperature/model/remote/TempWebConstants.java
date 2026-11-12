package com.huami.bodymeasurements.temperature.model.remote;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/TempWebConstants;", "", "", "APP_NAME", "Ljava/lang/String;", "FRIEND_DATA_TYPE", "<init>", "()V", "EventType", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempWebConstants {

    @NotNull
    public static final String APP_NAME = "com.huami.midong";

    @NotNull
    public static final String FRIEND_DATA_TYPE = "tempData";

    @NotNull
    public static final TempWebConstants INSTANCE = new TempWebConstants();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/TempWebConstants$EventType;", "", "", "ALL_DAY_TEMP", "Ljava/lang/String;", "SINGLE_TEMP", "MANUAL_TEMP", "SUB_TYPE_MANUAL_TEMP", "EIGHTY_SECONDS_TEMPS", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class EventType {

        @NotNull
        public static final String ALL_DAY_TEMP = "allDayTemperature";

        @NotNull
        public static final String EIGHTY_SECONDS_TEMPS = "eightySecondsTemperature";

        @NotNull
        public static final EventType INSTANCE = new EventType();

        @NotNull
        public static final String MANUAL_TEMP = "health_data";

        @NotNull
        public static final String SINGLE_TEMP = "singleTemperature";

        @NotNull
        public static final String SUB_TYPE_MANUAL_TEMP = "temperature";

        private EventType() {
        }
    }

    private TempWebConstants() {
    }
}
