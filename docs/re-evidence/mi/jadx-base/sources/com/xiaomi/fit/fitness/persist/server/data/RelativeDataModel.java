package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"Jf\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\bHÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00065"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "", "time", "", "key", "", "value", "zoneOffsetInSec", "", "sid", "tag", "zoneName", "latestAbnormalRecordTime", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getTime", "()J", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "setValue", "getZoneOffsetInSec", "()I", "setZoneOffsetInSec", "(I)V", "getSid", "setSid", "getTag", "setTag", "getZoneName", "setZoneName", "getLatestAbnormalRecordTime", "()Ljava/lang/Long;", "setLatestAbnormalRecordTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RelativeDataModel {

    @SerializedName("key")
    @NotNull
    private String key;

    @SerializedName("latest_abnormal_data_time")
    @Nullable
    private Long latestAbnormalRecordTime;

    @SerializedName("sid")
    @Nullable
    private String sid;

    @SerializedName("tag")
    @Nullable
    private String tag;

    @SerializedName("time")
    private final long time;

    @SerializedName("value")
    @NotNull
    private String value;

    @SerializedName("zone_name")
    @Nullable
    private String zoneName;

    @SerializedName("zone_offset")
    private int zoneOffsetInSec;

    public RelativeDataModel(long j, @NotNull String key, @NotNull String value, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.time = j;
        this.key = key;
        this.value = value;
        this.zoneOffsetInSec = i;
        this.sid = str;
        this.tag = str2;
        this.zoneName = str3;
        this.latestAbnormalRecordTime = l;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getLatestAbnormalRecordTime() {
        return this.latestAbnormalRecordTime;
    }

    @NotNull
    public final RelativeDataModel copy(long time, @NotNull String key, @NotNull String value, int zoneOffsetInSec, @Nullable String sid, @Nullable String tag, @Nullable String zoneName, @Nullable Long latestAbnormalRecordTime) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new RelativeDataModel(time, key, value, zoneOffsetInSec, sid, tag, zoneName, latestAbnormalRecordTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelativeDataModel)) {
            return false;
        }
        RelativeDataModel relativeDataModel = (RelativeDataModel) other;
        return this.time == relativeDataModel.time && Intrinsics.areEqual(this.key, relativeDataModel.key) && Intrinsics.areEqual(this.value, relativeDataModel.value) && this.zoneOffsetInSec == relativeDataModel.zoneOffsetInSec && Intrinsics.areEqual(this.sid, relativeDataModel.sid) && Intrinsics.areEqual(this.tag, relativeDataModel.tag) && Intrinsics.areEqual(this.zoneName, relativeDataModel.zoneName) && Intrinsics.areEqual(this.latestAbnormalRecordTime, relativeDataModel.latestAbnormalRecordTime);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Long getLatestAbnormalRecordTime() {
        return this.latestAbnormalRecordTime;
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

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.time) * 31) + this.key.hashCode()) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.zoneOffsetInSec)) * 31;
        String str = this.sid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tag;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zoneName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.latestAbnormalRecordTime;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setLatestAbnormalRecordTime(@Nullable Long l) {
        this.latestAbnormalRecordTime = l;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    public final void setZoneOffsetInSec(int i) {
        this.zoneOffsetInSec = i;
    }

    @NotNull
    public String toString() {
        return "RelativeDataModel(time=" + this.time + ", key=" + this.key + ", value=" + this.value + ", zoneOffsetInSec=" + this.zoneOffsetInSec + ", sid=" + this.sid + ", tag=" + this.tag + ", zoneName=" + this.zoneName + ", latestAbnormalRecordTime=" + this.latestAbnormalRecordTime + ")";
    }

    public /* synthetic */ RelativeDataModel(long j, String str, String str2, int i, String str3, String str4, String str5, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : l);
    }
}
