package com.xiaomi.fitness.common.recycer.expandable;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "Ljava/io/Serializable;", "coreTimeMillis", "", "groupTimestampMillis", "<init>", "(JJ)V", "getCoreTimeMillis", "()J", "getGroupTimestampMillis", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ExpandableBaseDataItem implements Serializable {
    private final long coreTimeMillis;
    private final long groupTimestampMillis;

    public ExpandableBaseDataItem(long j, long j2) {
        this.coreTimeMillis = j;
        this.groupTimestampMillis = j2;
    }

    public long getCoreTimeMillis() {
        return this.coreTimeMillis;
    }

    public long getGroupTimestampMillis() {
        return this.groupTimestampMillis;
    }

    public /* synthetic */ ExpandableBaseDataItem(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? 0L : j2);
    }
}
