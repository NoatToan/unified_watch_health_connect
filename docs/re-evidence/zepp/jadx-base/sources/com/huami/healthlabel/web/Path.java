package com.huami.healthlabel.web;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/healthlabel/web/Path;", "", "", "HEALTH_LABEL_HOME", "Ljava/lang/String;", "HEALTH_LABEL_RECORD", "HEALTH_LABEL_RECORD_DELETE", "EVENT_TYPE", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class Path {

    @NotNull
    public static final String EVENT_TYPE = "HealthTagRecord";

    @NotNull
    public static final String HEALTH_LABEL_HOME = "users/{userId}/properties";

    @NotNull
    public static final String HEALTH_LABEL_RECORD = "users/{userId}/events";

    @NotNull
    public static final String HEALTH_LABEL_RECORD_DELETE = "users/{userId}/events/{eventType}/batchDelete";

    @NotNull
    public static final Path INSTANCE = new Path();

    private Path() {
    }
}
