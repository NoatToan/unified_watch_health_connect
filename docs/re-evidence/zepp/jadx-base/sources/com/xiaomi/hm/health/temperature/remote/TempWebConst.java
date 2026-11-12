package com.xiaomi.hm.health.temperature.remote;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/TempWebConst;", "", "", "USER_EVENTS", "Ljava/lang/String;", "USER_DATE_EVENTS", "EVENT_TYPE_ALL_DAY_TEMP", "EVENT_TYPE_SINGLE_TEMP", "EVENT_TYPE_MANUAL_TEMP", "SUB_TYPE_MANUAL_TEMP", "APP_NAME", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TempWebConst {

    @NotNull
    public static final String APP_NAME = "com.huami.midong";

    @NotNull
    public static final String EVENT_TYPE_ALL_DAY_TEMP = "allDayTemperature";

    @NotNull
    public static final String EVENT_TYPE_MANUAL_TEMP = "health_data";

    @NotNull
    public static final String EVENT_TYPE_SINGLE_TEMP = "singleTemperature";

    @NotNull
    public static final TempWebConst INSTANCE = new TempWebConst();

    @NotNull
    public static final String SUB_TYPE_MANUAL_TEMP = "temperature";

    @NotNull
    public static final String USER_DATE_EVENTS = "users/{userId}/date/events";

    @NotNull
    public static final String USER_EVENTS = "users/{userId}/events";

    private TempWebConst() {
    }
}
