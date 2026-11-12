package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003Jw\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/AggregatedFitnessData;", "", "sid", "", "tag", "key", "time", "", "value", CloudContract.COL_ZONE_OFFSET, "", "zoneName", "deleteStatus", "", "updateTime", "waterMark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;ZJJ)V", "getSid", "()Ljava/lang/String;", "getTag", "getKey", "getTime", "()J", "getValue", "getZoneOffset", "()I", "getZoneName", "getDeleteStatus", "()Z", "getUpdateTime", "getWaterMark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregatedFitnessData {

    @SerializedName("deleted")
    private final boolean deleteStatus;

    @SerializedName("key")
    @Nullable
    private final String key;

    @SerializedName("sid")
    @Nullable
    private final String sid;

    @SerializedName("tag")
    @Nullable
    private final String tag;

    @SerializedName("time")
    private final long time;

    @SerializedName("update_time")
    private final long updateTime;

    @SerializedName("value")
    @Nullable
    private final String value;

    @SerializedName("watermark")
    private final long waterMark;

    @SerializedName("zone_name")
    @Nullable
    private final String zoneName;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public AggregatedFitnessData(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, int i, @Nullable String str5, boolean z, long j2, long j3) {
        this.sid = str;
        this.tag = str2;
        this.key = str3;
        this.time = j;
        this.value = str4;
        this.zoneOffset = i;
        this.zoneName = str5;
        this.deleteStatus = z;
        this.updateTime = j2;
        this.waterMark = j3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getWaterMark() {
        return this.waterMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDeleteStatus() {
        return this.deleteStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final AggregatedFitnessData copy(@Nullable String sid, @Nullable String tag, @Nullable String key, long time, @Nullable String value, int zoneOffset, @Nullable String zoneName, boolean deleteStatus, long updateTime, long waterMark) {
        return new AggregatedFitnessData(sid, tag, key, time, value, zoneOffset, zoneName, deleteStatus, updateTime, waterMark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregatedFitnessData)) {
            return false;
        }
        AggregatedFitnessData aggregatedFitnessData = (AggregatedFitnessData) other;
        return Intrinsics.areEqual(this.sid, aggregatedFitnessData.sid) && Intrinsics.areEqual(this.tag, aggregatedFitnessData.tag) && Intrinsics.areEqual(this.key, aggregatedFitnessData.key) && this.time == aggregatedFitnessData.time && Intrinsics.areEqual(this.value, aggregatedFitnessData.value) && this.zoneOffset == aggregatedFitnessData.zoneOffset && Intrinsics.areEqual(this.zoneName, aggregatedFitnessData.zoneName) && this.deleteStatus == aggregatedFitnessData.deleteStatus && this.updateTime == aggregatedFitnessData.updateTime && this.waterMark == aggregatedFitnessData.waterMark;
    }

    public final boolean getDeleteStatus() {
        return this.deleteStatus;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final long getWaterMark() {
        return this.waterMark;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        String str = this.sid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.time)) * 31;
        String str4 = this.value;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.zoneOffset)) * 31;
        String str5 = this.zoneName;
        return ((((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.deleteStatus)) * 31) + Long.hashCode(this.updateTime)) * 31) + Long.hashCode(this.waterMark);
    }

    @NotNull
    public String toString() {
        return "AggregatedFitnessData(sid=" + this.sid + ", tag=" + this.tag + ", key=" + this.key + ", time=" + this.time + ", value=" + this.value + ", zoneOffset=" + this.zoneOffset + ", zoneName=" + this.zoneName + ", deleteStatus=" + this.deleteStatus + ", updateTime=" + this.updateTime + ", waterMark=" + this.waterMark + ")";
    }
}
