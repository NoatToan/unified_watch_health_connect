package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import androidx.health.connect.client.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007HÆ\u0003J3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/GeneratedHandleRecordsInfo;", "T", "Landroidx/health/connect/client/records/Record;", "", "unAggregateAbleRecordsInfo", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/UnAggregateAbleRecordsInfo;", "aggregateAbleRecordsInfo", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/AggregateAbleRecordsInfo;", "<init>", "(Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/UnAggregateAbleRecordsInfo;Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/AggregateAbleRecordsInfo;)V", "getUnAggregateAbleRecordsInfo", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/UnAggregateAbleRecordsInfo;", "getAggregateAbleRecordsInfo", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/AggregateAbleRecordsInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeneratedHandleRecordsInfo<T extends Record> {

    @Nullable
    private final AggregateAbleRecordsInfo<T> aggregateAbleRecordsInfo;

    @Nullable
    private final UnAggregateAbleRecordsInfo<T> unAggregateAbleRecordsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratedHandleRecordsInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeneratedHandleRecordsInfo copy$default(GeneratedHandleRecordsInfo generatedHandleRecordsInfo, UnAggregateAbleRecordsInfo unAggregateAbleRecordsInfo, AggregateAbleRecordsInfo aggregateAbleRecordsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            unAggregateAbleRecordsInfo = generatedHandleRecordsInfo.unAggregateAbleRecordsInfo;
        }
        if ((i & 2) != 0) {
            aggregateAbleRecordsInfo = generatedHandleRecordsInfo.aggregateAbleRecordsInfo;
        }
        return generatedHandleRecordsInfo.copy(unAggregateAbleRecordsInfo, aggregateAbleRecordsInfo);
    }

    @Nullable
    public final UnAggregateAbleRecordsInfo<T> component1() {
        return this.unAggregateAbleRecordsInfo;
    }

    @Nullable
    public final AggregateAbleRecordsInfo<T> component2() {
        return this.aggregateAbleRecordsInfo;
    }

    @NotNull
    public final GeneratedHandleRecordsInfo<T> copy(@Nullable UnAggregateAbleRecordsInfo<T> unAggregateAbleRecordsInfo, @Nullable AggregateAbleRecordsInfo<T> aggregateAbleRecordsInfo) {
        return new GeneratedHandleRecordsInfo<>(unAggregateAbleRecordsInfo, aggregateAbleRecordsInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratedHandleRecordsInfo)) {
            return false;
        }
        GeneratedHandleRecordsInfo generatedHandleRecordsInfo = (GeneratedHandleRecordsInfo) other;
        return Intrinsics.areEqual(this.unAggregateAbleRecordsInfo, generatedHandleRecordsInfo.unAggregateAbleRecordsInfo) && Intrinsics.areEqual(this.aggregateAbleRecordsInfo, generatedHandleRecordsInfo.aggregateAbleRecordsInfo);
    }

    @Nullable
    public final AggregateAbleRecordsInfo<T> getAggregateAbleRecordsInfo() {
        return this.aggregateAbleRecordsInfo;
    }

    @Nullable
    public final UnAggregateAbleRecordsInfo<T> getUnAggregateAbleRecordsInfo() {
        return this.unAggregateAbleRecordsInfo;
    }

    public int hashCode() {
        UnAggregateAbleRecordsInfo<T> unAggregateAbleRecordsInfo = this.unAggregateAbleRecordsInfo;
        int iHashCode = (unAggregateAbleRecordsInfo == null ? 0 : unAggregateAbleRecordsInfo.hashCode()) * 31;
        AggregateAbleRecordsInfo<T> aggregateAbleRecordsInfo = this.aggregateAbleRecordsInfo;
        return iHashCode + (aggregateAbleRecordsInfo != null ? aggregateAbleRecordsInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GeneratedHandleRecordsInfo(unAggregateAbleRecordsInfo=" + this.unAggregateAbleRecordsInfo + ", aggregateAbleRecordsInfo=" + this.aggregateAbleRecordsInfo + ")";
    }

    public GeneratedHandleRecordsInfo(@Nullable UnAggregateAbleRecordsInfo<T> unAggregateAbleRecordsInfo, @Nullable AggregateAbleRecordsInfo<T> aggregateAbleRecordsInfo) {
        this.unAggregateAbleRecordsInfo = unAggregateAbleRecordsInfo;
        this.aggregateAbleRecordsInfo = aggregateAbleRecordsInfo;
    }

    public /* synthetic */ GeneratedHandleRecordsInfo(UnAggregateAbleRecordsInfo unAggregateAbleRecordsInfo, AggregateAbleRecordsInfo aggregateAbleRecordsInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unAggregateAbleRecordsInfo, (i & 2) != 0 ? null : aggregateAbleRecordsInfo);
    }
}
