package com.xiaomi.hm.health.running;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/running/HistoryRecordHeader;", "", "max", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HistoryRecordHeaderKt {
    public static final long max(@NotNull HistoryRecordHeader historyRecordHeader) {
        long jLongValue = 0;
        for (Map.Entry<Long, Long> entry : historyRecordHeader.getData().entrySet()) {
            if (entry.getValue().longValue() > jLongValue) {
                jLongValue = entry.getValue().longValue();
            }
        }
        return jLongValue;
    }
}
