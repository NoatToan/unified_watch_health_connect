package com.huami.bloodpressure_ui.analytics;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"Lcom/huami/mifit/analytics/builder/CalculationEventBuilder;", "", "record", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureAnalyticsExKt {
    public static final void record(@NotNull CalculationEventBuilder calculationEventBuilder) {
        Analytics.recordEvent(calculationEventBuilder);
    }

    public static final void record(@NotNull CountEventBuilder countEventBuilder) {
        Analytics.recordEvent(countEventBuilder);
    }
}
