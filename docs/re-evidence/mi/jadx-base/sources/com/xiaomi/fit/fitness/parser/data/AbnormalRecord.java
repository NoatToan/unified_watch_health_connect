package com.xiaomi.fit.fitness.parser.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "", "<init>", "()V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "abnormalType", "", "getAbnormalType$annotations", "getAbnormalType", "()I", "setAbnormalType", "(I)V", "abnormalSetValue", "getAbnormalSetValue", "setAbnormalSetValue", "recordCount", "getRecordCount", "setRecordCount", "recordList", "", "Lcom/xiaomi/fit/fitness/parser/data/RecordItem;", "getRecordList", "()Ljava/util/List;", "setRecordList", "(Ljava/util/List;)V", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbnormalRecord {
    private int abnormalSetValue;
    private int abnormalType;
    private long endTime;
    private int recordCount;

    @NotNull
    private List<RecordItem> recordList = CollectionsKt__CollectionsKt.emptyList();
    private long startTime;

    public static /* synthetic */ void getAbnormalType$annotations() {
    }

    public final int getAbnormalSetValue() {
        return this.abnormalSetValue;
    }

    public final int getAbnormalType() {
        return this.abnormalType;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    @NotNull
    public final List<RecordItem> getRecordList() {
        return this.recordList;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setAbnormalSetValue(int i) {
        this.abnormalSetValue = i;
    }

    public final void setAbnormalType(int i) {
        this.abnormalType = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setRecordCount(int i) {
        this.recordCount = i;
    }

    public final void setRecordList(@NotNull List<RecordItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.recordList = list;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        return "AbnormalRecord(startTime=" + this.startTime + ", endTime=" + this.endTime + ", abnormalType=" + this.abnormalType + ", recordCount=" + this.recordCount + ", abnormalSetValue=" + this.abnormalSetValue + ", recordSize=" + this.recordList.size() + ")";
    }
}
