package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;", "", "sid", "", "key", "time", "", "category", "value", CloudContract.COL_ZONE_OFFSET, "", "zoneName", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getSid", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getCategory", "getValue", "getZoneOffset", "()I", "getZoneName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRecord {

    @SerializedName("category")
    @Nullable
    private final String category;

    @SerializedName("key")
    @Nullable
    private final String key;

    @SerializedName("sid")
    @Nullable
    private final String sid;

    @SerializedName("time")
    private final long time;

    @SerializedName("value")
    @Nullable
    private final String value;

    @SerializedName("zone_name")
    @Nullable
    private final String zoneName;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public SportRecord(@Nullable String str, @Nullable String str2, long j, @Nullable String str3, @Nullable String str4, int i, @Nullable String str5) {
        this.sid = str;
        this.key = str2;
        this.time = j;
        this.category = str3;
        this.value = str4;
        this.zoneOffset = i;
        this.zoneName = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
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

    @NotNull
    public final SportRecord copy(@Nullable String sid, @Nullable String key, long time, @Nullable String category, @Nullable String value, int zoneOffset, @Nullable String zoneName) {
        return new SportRecord(sid, key, time, category, value, zoneOffset, zoneName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecord)) {
            return false;
        }
        SportRecord sportRecord = (SportRecord) other;
        return Intrinsics.areEqual(this.sid, sportRecord.sid) && Intrinsics.areEqual(this.key, sportRecord.key) && this.time == sportRecord.time && Intrinsics.areEqual(this.category, sportRecord.category) && Intrinsics.areEqual(this.value, sportRecord.value) && this.zoneOffset == sportRecord.zoneOffset && Intrinsics.areEqual(this.zoneName, sportRecord.zoneName);
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
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
        String str = this.sid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.time)) * 31;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.zoneOffset)) * 31;
        String str5 = this.zoneName;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SportRecord(sid=" + this.sid + ", key=" + this.key + ", time=" + this.time + ", category=" + this.category + ", value=" + this.value + ", zoneOffset=" + this.zoneOffset + ", zoneName=" + this.zoneName + ")";
    }
}
