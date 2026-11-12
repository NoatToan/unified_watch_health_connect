package com.huami.bodymeasurements.temperature.model.record;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/record/TempRecordUtils;", "", "", "id", "", "recordCountEvent", "", "startTime", "endTime", "recordDurationEvent", "a", "Ljava/lang/String;", "START_KEY", "b", "END_KEY", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempRecordUtils {

    @NotNull
    public static final TempRecordUtils INSTANCE = new TempRecordUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String START_KEY = "start";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String END_KEY = "end";

    private TempRecordUtils() {
    }

    public final void recordCountEvent(@NotNull String id) {
        Analytics.recordEvent(new CountEventBuilder(id).setIdentified(true));
    }

    public final void recordDurationEvent(@NotNull String id, long startTime, long endTime) {
        long j = 1000;
        Analytics.recordEvent(new CalculationEventBuilder(id, ((endTime - startTime) / j) / j).setIdentified(true).addExtra("start", String.valueOf(startTime)).addExtra("end", String.valueOf(endTime)));
    }
}
