package com.xiaomi.fitness.health.temperature.adapter;

import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/adapter/WrapperTemperatureItem;", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "coreTimeMillis", "", "groupTimestampMillis", "temperatureItem", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "<init>", "(JJLcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;)V", "getCoreTimeMillis", "()J", "getGroupTimestampMillis", "getTemperatureItem", "()Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WrapperTemperatureItem extends ExpandableBaseDataItem {
    private final long coreTimeMillis;
    private final long groupTimestampMillis;

    @NotNull
    private final TemperatureItem temperatureItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperTemperatureItem(long j, long j2, @NotNull TemperatureItem temperatureItem) {
        super(j, j2);
        Intrinsics.checkNotNullParameter(temperatureItem, "temperatureItem");
        this.coreTimeMillis = j;
        this.groupTimestampMillis = j2;
        this.temperatureItem = temperatureItem;
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
    public final TemperatureItem getTemperatureItem() {
        return this.temperatureItem;
    }
}
