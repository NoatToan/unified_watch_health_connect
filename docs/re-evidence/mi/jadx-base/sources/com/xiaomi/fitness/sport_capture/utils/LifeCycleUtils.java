package com.xiaomi.fitness.sport_capture.utils;

import com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/LifeCycleUtils;", "", "<init>", "()V", "isAppForeground", "", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LifeCycleUtils {

    @NotNull
    public static final LifeCycleUtils INSTANCE = new LifeCycleUtils();

    private LifeCycleUtils() {
    }

    public final boolean isAppForeground() {
        return SportCapturePreference.INSTANCE.isAppForeground();
    }
}
