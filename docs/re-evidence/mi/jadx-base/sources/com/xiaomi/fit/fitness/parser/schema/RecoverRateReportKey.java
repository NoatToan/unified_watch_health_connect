package com.xiaomi.fit.fitness.parser.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/RecoverRateReportKey;", "", "<init>", "()V", "startTime", "", RecoverRateReportKey.restoreHeartRate, RecoverRateReportKey.restoreRateHeartRate, RecoverRateReportKey.heartRateRecordCount, RecoverRateReportKey.heartRateList, "heartRate", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecoverRateReportKey {

    @NotNull
    public static final RecoverRateReportKey INSTANCE = new RecoverRateReportKey();

    @NotNull
    public static final String heartRate = "heartRate";

    @NotNull
    public static final String heartRateList = "heartRateList";

    @NotNull
    public static final String heartRateRecordCount = "heartRateRecordCount";

    @NotNull
    public static final String restoreHeartRate = "restoreHeartRate";

    @NotNull
    public static final String restoreRateHeartRate = "restoreRateHeartRate";

    @NotNull
    public static final String startTime = "startTime";

    private RecoverRateReportKey() {
    }
}
