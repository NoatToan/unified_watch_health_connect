package com.xiaomi.fitness.health.sleep.ui.setting.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/util/SnoreAndSleepWordsConverter;", "", "<init>", "()V", "convertStatusToBoolean", "", "status", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnoreAndSleepWordsConverter {

    @NotNull
    public static final SnoreAndSleepWordsConverter INSTANCE = new SnoreAndSleepWordsConverter();

    private SnoreAndSleepWordsConverter() {
    }

    public final boolean convertStatusToBoolean(int status) {
        return status == 2;
    }
}
