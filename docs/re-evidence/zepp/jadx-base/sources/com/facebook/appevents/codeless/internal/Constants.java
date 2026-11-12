package com.facebook.appevents.codeless.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/codeless/internal/Constants;", "", "", "MAX_TREE_DEPTH", LogUtil.I, "", "IS_CODELESS_EVENT_KEY", "Ljava/lang/String;", "EVENT_MAPPING_PATH_TYPE_KEY", "PATH_TYPE_RELATIVE", "PATH_TYPE_ABSOLUTE", "PLATFORM", "APP_INDEXING_SCHEDULE_INTERVAL_MS", "APP_INDEXING_ENABLED", "DEVICE_SESSION_ID", "EXTINFO", "APP_INDEXING", "BUTTON_SAMPLING", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Constants {

    @NotNull
    public static final String APP_INDEXING = "app_indexing";

    @NotNull
    public static final String APP_INDEXING_ENABLED = "is_app_indexing_enabled";
    public static final int APP_INDEXING_SCHEDULE_INTERVAL_MS = 1000;

    @NotNull
    public static final String BUTTON_SAMPLING = "button_sampling";

    @NotNull
    public static final String DEVICE_SESSION_ID = "device_session_id";

    @NotNull
    public static final String EVENT_MAPPING_PATH_TYPE_KEY = "path_type";

    @NotNull
    public static final String EXTINFO = "extinfo";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String IS_CODELESS_EVENT_KEY = "_is_fb_codeless";
    public static final int MAX_TREE_DEPTH = 25;

    @NotNull
    public static final String PATH_TYPE_ABSOLUTE = "absolute";

    @NotNull
    public static final String PATH_TYPE_RELATIVE = "relative";

    @NotNull
    public static final String PLATFORM = "android";

    private Constants() {
    }
}
