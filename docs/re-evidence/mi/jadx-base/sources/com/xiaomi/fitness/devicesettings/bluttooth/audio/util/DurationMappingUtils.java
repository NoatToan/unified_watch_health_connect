package com.xiaomi.fitness.devicesettings.bluttooth.audio.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/DurationMappingUtils;", "", "<init>", "()V", "getMappingDuration", "", "original", "duration", "currentDuration", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DurationMappingUtils {

    @NotNull
    public static final DurationMappingUtils INSTANCE = new DurationMappingUtils();

    private DurationMappingUtils() {
    }

    public final long getMappingDuration(long original, long duration, long currentDuration) {
        if (original == 0 || currentDuration == 0) {
            return 0L;
        }
        return duration == currentDuration ? original : (long) ((original / duration) * currentDuration);
    }
}
