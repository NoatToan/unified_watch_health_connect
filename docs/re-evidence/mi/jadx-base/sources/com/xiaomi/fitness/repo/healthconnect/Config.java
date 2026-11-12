package com.xiaomi.fitness.repo.healthconnect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/Config;", "", "<init>", "()V", "DAILY_DATA_TIME_RANGE_IN_MINUTE", "", "TASK_RETRY_INTERVAL_IN_MINUTE", "FAILURE_TIME_THRESH_HOLD", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Config {
    public static final int DAILY_DATA_TIME_RANGE_IN_MINUTE = 30;
    public static final int FAILURE_TIME_THRESH_HOLD = 3;

    @NotNull
    public static final Config INSTANCE = new Config();
    public static final int TASK_RETRY_INTERVAL_IN_MINUTE = 15;

    private Config() {
    }
}
