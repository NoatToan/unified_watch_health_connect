package com.xiaomi.fitness.data.model;

import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/data/model/WrapperHrAndPaceFibRecord;", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "coreTimeMillis", "", "groupTimestampMillis", "lactateThresholdItem", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "<init>", "(JJLcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;)V", "getCoreTimeMillis", "()J", "getGroupTimestampMillis", "getLactateThresholdItem", "()Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WrapperHrAndPaceFibRecord extends ExpandableBaseDataItem {
    private final long coreTimeMillis;
    private final long groupTimestampMillis;

    @NotNull
    private final LactateThresholdItem lactateThresholdItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperHrAndPaceFibRecord(long j, long j2, @NotNull LactateThresholdItem lactateThresholdItem) {
        super(j, j2);
        Intrinsics.checkNotNullParameter(lactateThresholdItem, "lactateThresholdItem");
        this.coreTimeMillis = j;
        this.groupTimestampMillis = j2;
        this.lactateThresholdItem = lactateThresholdItem;
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem
    public long getCoreTimeMillis() {
        return this.coreTimeMillis;
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem
    public long getGroupTimestampMillis() {
        return this.groupTimestampMillis;
    }

    @NotNull
    public final LactateThresholdItem getLactateThresholdItem() {
        return this.lactateThresholdItem;
    }
}
