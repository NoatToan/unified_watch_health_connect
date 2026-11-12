package com.xiaomi.fitness.trail.data;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/trail/data/DimTotalData;", "", "summary", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "durationList", "", "Lcom/xiaomi/fitness/trail/data/SportPercent;", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportSummary;Ljava/util/List;)V", "getSummary", "()Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "setSummary", "(Lcom/xiaomi/fit/data/common/data/sport/SportSummary;)V", "getDurationList", "()Ljava/util/List;", "setDurationList", "(Ljava/util/List;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DimTotalData {

    @Nullable
    private List<SportPercent> durationList;

    @Nullable
    private SportSummary summary;

    public DimTotalData(@Nullable SportSummary sportSummary, @Nullable List<SportPercent> list) {
        this.summary = sportSummary;
        this.durationList = list;
    }

    @Nullable
    public final List<SportPercent> getDurationList() {
        return this.durationList;
    }

    @Nullable
    public final SportSummary getSummary() {
        return this.summary;
    }

    public final void setDurationList(@Nullable List<SportPercent> list) {
        this.durationList = list;
    }

    public final void setSummary(@Nullable SportSummary sportSummary) {
        this.summary = sportSummary;
    }
}
