package com.xiaomi.fitness.statistics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/statistics/StatConstants;", "", "<init>", "()V", "KEY_ACTIVITY_NAME", "", "KEY_FRAGMENT_NAME", "KEY_FRAGMENT_REFERRER", "KEY_ACTIVITY_REFERRER", "KEY_PAGE_CUSTOM_TYPE", "KEY_PAGE_ORIGIN", "KEY_DURATION_SEC", "KEY_PAGE_EVENT_TYPE", "PARAM_START", "PARAM_END", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatConstants {

    @NotNull
    public static final StatConstants INSTANCE = new StatConstants();

    @NotNull
    public static final String KEY_ACTIVITY_NAME = "activity_name";

    @NotNull
    public static final String KEY_ACTIVITY_REFERRER = "activity_referrer";

    @NotNull
    public static final String KEY_DURATION_SEC = "duration_sec";

    @NotNull
    public static final String KEY_FRAGMENT_NAME = "fragment_name";

    @NotNull
    public static final String KEY_FRAGMENT_REFERRER = "fragment_referrer";

    @NotNull
    public static final String KEY_PAGE_CUSTOM_TYPE = "page_id";

    @NotNull
    public static final String KEY_PAGE_EVENT_TYPE = "expose_type";

    @NotNull
    public static final String KEY_PAGE_ORIGIN = "origin";

    @NotNull
    public static final String PARAM_END = "end";

    @NotNull
    public static final String PARAM_START = "start";

    private StatConstants() {
    }
}
