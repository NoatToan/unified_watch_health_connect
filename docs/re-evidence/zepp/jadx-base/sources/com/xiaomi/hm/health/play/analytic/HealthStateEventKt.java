package com.xiaomi.hm.health.play.analytic;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"", "getEventId", "id", "source", "", "recordEvent", HealthStateEventKt.HEALTH_V, "Ljava/lang/String;", HealthStateEventKt.HEALTH_C, "SLEEP_PRANA", "STRESS_PRANA", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HealthStateEventKt {

    @NotNull
    public static final String HEALTH_C = "HEALTH_C";

    @NotNull
    public static final String HEALTH_V = "HEALTH_V";

    @NotNull
    public static final String SLEEP_PRANA = "sleep_prana";

    @NotNull
    public static final String STRESS_PRANA = "stress_prana";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[ORIG_RETURN, RETURN] */
    @Nullable
    public static final String getEventId(@NotNull String str) {
        switch (str) {
            case "JZ":
                return "walking";
            case "PB":
                return "running";
            case "QX":
                return "riding";
            case "QY":
                return "friends";
            case "BJKP":
                return "healthsort";
            case "HSJC":
                return "snoring_dream";
            case "HXXL":
                return "pranayama";
            case "MBSZ":
                return "target_set";
            default:
                return null;
        }
    }

    public static final void recordEvent(@NotNull String str, @NotNull String str2) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        countEventBuilder.addExtra("source", str2);
        Analytics.recordEvent(countEventBuilder);
    }
}
