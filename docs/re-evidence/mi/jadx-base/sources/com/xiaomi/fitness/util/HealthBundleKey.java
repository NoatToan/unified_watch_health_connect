package com.xiaomi.fitness.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/util/HealthBundleKey;", "", "<init>", "()V", "BUNDLE_PARAMS_TIME_STAMP", "", "BUNDLE_PARAMS_SPORT_REPORT", "BUNDLE_PARAMS_EXTEND_VALUE", "BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG", "BUNDLE_PARAMS_DID", "BUNDLE_PARAMS_LOCAL_DATE", "BUNDLE_PARAMS_LOCAL_DATE_TIME", "BUNDLE_RELATIVE_ID", "KEY_RELATIVE_UID", "KEY_RELATIVE_NOTE", "BUNDLE_PARAMS_LOCAL_DATE_END", "BUNDLE_PARAMS_LOCAL_DATE_START", "KEY_REQUEST_SET_CODE_FROM_HEALTH", "", "KEY_REQUEST_SET_NODE", "KEY_ORIGIN", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthBundleKey {

    @NotNull
    public static final String BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG = "three_circle_flag";

    @NotNull
    public static final String BUNDLE_PARAMS_DID = "did";

    @NotNull
    public static final String BUNDLE_PARAMS_EXTEND_VALUE = "data_extend_value";

    @NotNull
    public static final String BUNDLE_PARAMS_LOCAL_DATE = "local_date";

    @NotNull
    public static final String BUNDLE_PARAMS_LOCAL_DATE_END = "local_date_end";

    @NotNull
    public static final String BUNDLE_PARAMS_LOCAL_DATE_START = "local_date_start";

    @NotNull
    public static final String BUNDLE_PARAMS_LOCAL_DATE_TIME = "local_date_time";

    @NotNull
    public static final String BUNDLE_PARAMS_SPORT_REPORT = "sport_report";

    @NotNull
    public static final String BUNDLE_PARAMS_TIME_STAMP = "time_stamp";

    @NotNull
    public static final String BUNDLE_RELATIVE_ID = "relative_id";

    @NotNull
    public static final HealthBundleKey INSTANCE = new HealthBundleKey();

    @NotNull
    public static final String KEY_ORIGIN = "origin";

    @NotNull
    public static final String KEY_RELATIVE_NOTE = "key_relative_note";

    @NotNull
    public static final String KEY_RELATIVE_UID = "key_relative_uid";
    public static final int KEY_REQUEST_SET_CODE_FROM_HEALTH = 1;

    @NotNull
    public static final String KEY_REQUEST_SET_NODE = "ket_request_set_node";

    private HealthBundleKey() {
    }
}
