package com.xiaomi.hm.health.bt.model.statistic;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/statistic/EarbudStatistic;", "Lcom/xiaomi/hm/health/bt/model/statistic/BaseStatistic;", "Lcom/xiaomi/hm/health/bt/model/statistic/Statistic;", "getStatistic", "Lcom/xiaomi/hm/health/bt/model/statistic/BaseEarbudStatistic;", "component1", "statistic", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/xiaomi/hm/health/bt/model/statistic/BaseEarbudStatistic;", "()Lcom/xiaomi/hm/health/bt/model/statistic/BaseEarbudStatistic;", "<init>", "(Lcom/xiaomi/hm/health/bt/model/statistic/BaseEarbudStatistic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EarbudStatistic extends BaseStatistic {

    @NotNull
    private final BaseEarbudStatistic statistic;

    public EarbudStatistic(@NotNull BaseEarbudStatistic baseEarbudStatistic) {
        this.statistic = baseEarbudStatistic;
    }

    public static /* synthetic */ EarbudStatistic copy$default(EarbudStatistic earbudStatistic, BaseEarbudStatistic baseEarbudStatistic, int i, Object obj) {
        if ((i & 1) != 0) {
            baseEarbudStatistic = earbudStatistic.statistic;
        }
        return earbudStatistic.copy(baseEarbudStatistic);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BaseEarbudStatistic getStatistic() {
        return this.statistic;
    }

    @NotNull
    public final EarbudStatistic copy(@NotNull BaseEarbudStatistic statistic) {
        return new EarbudStatistic(statistic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EarbudStatistic) && Intrinsics.areEqual(this.statistic, ((EarbudStatistic) other).statistic);
    }

    @Override // com.xiaomi.hm.health.bt.model.statistic.BaseStatistic
    @NotNull
    public final BaseEarbudStatistic getStatistic() {
        return this.statistic;
    }

    public int hashCode() {
        return this.statistic.hashCode();
    }

    @NotNull
    public String toString() {
        return "EarbudStatistic(statistic=" + this.statistic + ')';
    }

    @Override // com.xiaomi.hm.health.bt.model.statistic.BaseStatistic
    @NotNull
    public Statistic getStatistic() {
        return this.statistic;
    }
}
