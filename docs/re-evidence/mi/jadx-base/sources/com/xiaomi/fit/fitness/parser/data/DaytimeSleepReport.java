package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/DaytimeSleepReport;", "", "tzIn15Min", "", "<init>", "(I)V", "getTzIn15Min", "()I", "sleepDuration", "getSleepDuration", "setSleepDuration", "sleepItems", "", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "getSleepItems", "()Ljava/util/List;", "setSleepItems", "(Ljava/util/List;)V", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaytimeSleepReport {
    private int sleepDuration;

    @Nullable
    private List<SleepStateItem> sleepItems;
    private final int tzIn15Min;

    public DaytimeSleepReport(int i) {
        this.tzIn15Min = i;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @Nullable
    public final List<SleepStateItem> getSleepItems() {
        return this.sleepItems;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    public final void setSleepDuration(int i) {
        this.sleepDuration = i;
    }

    public final void setSleepItems(@Nullable List<SleepStateItem> list) {
        this.sleepItems = list;
    }
}
