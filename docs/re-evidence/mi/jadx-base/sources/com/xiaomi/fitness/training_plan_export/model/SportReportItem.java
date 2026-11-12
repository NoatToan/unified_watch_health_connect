package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\nHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/SportReportItem;", "Ljava/io/Serializable;", "sid", "", "key", "time", "", "category", "value", CloudContract.COL_ZONE_OFFSET, "", "zoneName", "courseName", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSid", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getCategory", "getValue", "getZoneOffset", "()I", "getZoneName", "getCourseName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportReportItem implements Serializable {

    @SerializedName("category")
    @NotNull
    private final String category;

    @SerializedName("course_name")
    @NotNull
    private final String courseName;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("sid")
    @NotNull
    private final String sid;

    @SerializedName("time")
    private final long time;

    @SerializedName("value")
    @NotNull
    private final String value;

    @SerializedName("zone_name")
    @NotNull
    private final String zoneName;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public SportReportItem(@NotNull String sid, @NotNull String key, long j, @NotNull String category, @NotNull String value, int i, @NotNull String zoneName, @NotNull String courseName) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(zoneName, "zoneName");
        Intrinsics.checkNotNullParameter(courseName, "courseName");
        this.sid = sid;
        this.key = key;
        this.time = j;
        this.category = category;
        this.value = value;
        this.zoneOffset = i;
        this.zoneName = zoneName;
        this.courseName = courseName;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
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
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    @NotNull
    public final SportReportItem copy(@NotNull String sid, @NotNull String key, long time, @NotNull String category, @NotNull String value, int zoneOffset, @NotNull String zoneName, @NotNull String courseName) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(zoneName, "zoneName");
        Intrinsics.checkNotNullParameter(courseName, "courseName");
        return new SportReportItem(sid, key, time, category, value, zoneOffset, zoneName, courseName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportReportItem)) {
            return false;
        }
        SportReportItem sportReportItem = (SportReportItem) other;
        return Intrinsics.areEqual(this.sid, sportReportItem.sid) && Intrinsics.areEqual(this.key, sportReportItem.key) && this.time == sportReportItem.time && Intrinsics.areEqual(this.category, sportReportItem.category) && Intrinsics.areEqual(this.value, sportReportItem.value) && this.zoneOffset == sportReportItem.zoneOffset && Intrinsics.areEqual(this.zoneName, sportReportItem.zoneName) && Intrinsics.areEqual(this.courseName, sportReportItem.courseName);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getCourseName() {
        return this.courseName;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        return (((((((((((((this.sid.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + this.category.hashCode()) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.zoneOffset)) * 31) + this.zoneName.hashCode()) * 31) + this.courseName.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportReportItem(sid=" + this.sid + ", key=" + this.key + ", time=" + this.time + ", category=" + this.category + ", value=" + this.value + ", zoneOffset=" + this.zoneOffset + ", zoneName=" + this.zoneName + ", courseName=" + this.courseName + ")";
    }
}
