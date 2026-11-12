package com.xiaomi.fitness.detail.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/detail/util/TriathlonDataConfig;", "", "<init>", "()V", "DETAIL_TYPE_COMMON", "", "DETAIL_TYPE_TRIATHLON_SWIM", "DETAIL_TYPE_TRIATHLON_RIDE", "DETAIL_TYPE_TRIATHLON_RUN", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriathlonDataConfig {
    public static final int DETAIL_TYPE_COMMON = -1;
    public static final int DETAIL_TYPE_TRIATHLON_RIDE = 1;
    public static final int DETAIL_TYPE_TRIATHLON_RUN = 2;
    public static final int DETAIL_TYPE_TRIATHLON_SWIM = 0;

    @NotNull
    public static final TriathlonDataConfig INSTANCE = new TriathlonDataConfig();

    private TriathlonDataConfig() {
    }
}
