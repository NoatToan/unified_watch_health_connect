package com.xiaomi.fit.fitness.export.data.item;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.utils.TimeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "sid", "", "time", "", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Ljava/lang/String;J)V", "getDataType", "()Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getSid", "()Ljava/lang/String;", "getTime", "()J", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FitnessDeviceItem {

    @NotNull
    private final HomeDataType dataType;

    @NotNull
    private final String sid;
    private final long time;

    public FitnessDeviceItem(@NotNull HomeDataType dataType, @NotNull String sid, long j) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.dataType = dataType;
        this.sid = sid;
        this.time = j;
    }

    public static /* synthetic */ FitnessDeviceItem copy$default(FitnessDeviceItem fitnessDeviceItem, HomeDataType homeDataType, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDataType = fitnessDeviceItem.dataType;
        }
        if ((i & 2) != 0) {
            str = fitnessDeviceItem.sid;
        }
        if ((i & 4) != 0) {
            j = fitnessDeviceItem.time;
        }
        return fitnessDeviceItem.copy(homeDataType, str, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HomeDataType getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final FitnessDeviceItem copy(@NotNull HomeDataType dataType, @NotNull String sid, long time) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new FitnessDeviceItem(dataType, sid, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessDeviceItem)) {
            return false;
        }
        FitnessDeviceItem fitnessDeviceItem = (FitnessDeviceItem) other;
        return this.dataType == fitnessDeviceItem.dataType && Intrinsics.areEqual(this.sid, fitnessDeviceItem.sid) && this.time == fitnessDeviceItem.time;
    }

    @NotNull
    public final HomeDataType getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.dataType.hashCode() * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        HomeDataType homeDataType = this.dataType;
        String str = this.sid;
        long j = this.time;
        return "FitnessDeviceItem(dataType=" + homeDataType + ", sid='" + str + "', time=" + j + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(((long) 1000) * j)) + ")";
    }
}
