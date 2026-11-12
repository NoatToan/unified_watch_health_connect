package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;", "", "tag", "", "key", "time", "", CloudContract.COL_ZONE_OFFSET, "", "value", "updateTime", "isDeleted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;JZ)V", "getTag", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getZoneOffset", "()I", "getValue", "getUpdateTime", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StatDataModel {

    @SerializedName("deleted")
    private final boolean isDeleted;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("tag")
    @NotNull
    private final String tag;

    @SerializedName("time")
    private final long time;

    @SerializedName("update_time")
    private final long updateTime;

    @SerializedName("value")
    @NotNull
    private final String value;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public StatDataModel(@NotNull String tag, @NotNull String key, long j, int i, @NotNull String value, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.tag = tag;
        this.key = key;
        this.time = j;
        this.zoneOffset = i;
        this.value = value;
        this.updateTime = j2;
        this.isDeleted = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @NotNull
    public final StatDataModel copy(@NotNull String tag, @NotNull String key, long time, int zoneOffset, @NotNull String value, long updateTime, boolean isDeleted) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new StatDataModel(tag, key, time, zoneOffset, value, updateTime, isDeleted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatDataModel)) {
            return false;
        }
        StatDataModel statDataModel = (StatDataModel) other;
        return Intrinsics.areEqual(this.tag, statDataModel.tag) && Intrinsics.areEqual(this.key, statDataModel.key) && this.time == statDataModel.time && this.zoneOffset == statDataModel.zoneOffset && Intrinsics.areEqual(this.value, statDataModel.value) && this.updateTime == statDataModel.updateTime && this.isDeleted == statDataModel.isDeleted;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        return (((((((((((this.tag.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.zoneOffset)) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + Boolean.hashCode(this.isDeleted);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    @NotNull
    public String toString() {
        return "StatDataModel(tag=" + this.tag + ", key=" + this.key + ", time=" + this.time + ", zoneOffset=" + this.zoneOffset + ", value=" + this.value + ", updateTime=" + this.updateTime + ", isDeleted=" + this.isDeleted + ")";
    }
}
