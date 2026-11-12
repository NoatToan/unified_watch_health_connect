package com.xiaomi.fit.fitness.persist.dailyreport.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessData;", "", "tag", "", "key", "time", "", "value", CloudContract.COL_ZONE_OFFSET, "", "sid", "zoneName", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getValue", "getZoneOffset", "()I", "getSid", "getZoneName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregateFitnessData {

    @NotNull
    private final String key;

    @Nullable
    private final String sid;

    @NotNull
    private final String tag;
    private final long time;

    @NotNull
    private final String value;

    @SerializedName("zone_name")
    @Nullable
    private final String zoneName;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public AggregateFitnessData(@NotNull String tag, @NotNull String key, long j, @NotNull String value, int i, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.tag = tag;
        this.key = key;
        this.time = j;
        this.value = value;
        this.zoneOffset = i;
        this.sid = str;
        this.zoneName = str2;
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

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    @NotNull
    public final AggregateFitnessData copy(@NotNull String tag, @NotNull String key, long time, @NotNull String value, int zoneOffset, @Nullable String sid, @Nullable String zoneName) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new AggregateFitnessData(tag, key, time, value, zoneOffset, sid, zoneName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregateFitnessData)) {
            return false;
        }
        AggregateFitnessData aggregateFitnessData = (AggregateFitnessData) other;
        return Intrinsics.areEqual(this.tag, aggregateFitnessData.tag) && Intrinsics.areEqual(this.key, aggregateFitnessData.key) && this.time == aggregateFitnessData.time && Intrinsics.areEqual(this.value, aggregateFitnessData.value) && this.zoneOffset == aggregateFitnessData.zoneOffset && Intrinsics.areEqual(this.sid, aggregateFitnessData.sid) && Intrinsics.areEqual(this.zoneName, aggregateFitnessData.zoneName);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.tag.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.zoneOffset)) * 31;
        String str = this.sid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zoneName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AggregateFitnessData(tag=" + this.tag + ", key=" + this.key + ", time=" + this.time + ", value=" + this.value + ", zoneOffset=" + this.zoneOffset + ", sid=" + this.sid + ", zoneName=" + this.zoneName + ")";
    }

    public /* synthetic */ AggregateFitnessData(String str, String str2, long j, String str3, int i, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, i, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }
}
