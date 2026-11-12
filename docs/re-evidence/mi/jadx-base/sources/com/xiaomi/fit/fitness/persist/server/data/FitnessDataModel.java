package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J'\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "", "sid", "", "key", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getSid", "()Ljava/lang/String;", "getKey", "getTime", "()J", "zoneOffsetInSec", "", "getZoneOffsetInSec", "()Ljava/lang/Integer;", "setZoneOffsetInSec", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "zoneName", "getZoneName", "setZoneName", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "isDeleted", "", "()Ljava/lang/Boolean;", "setDeleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FitnessDataModel {

    @SerializedName("deleted")
    @Nullable
    private Boolean isDeleted;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("sid")
    @NotNull
    private final String sid;

    @SerializedName("time")
    private final long time;

    @SerializedName("value")
    @Nullable
    private String value;

    @SerializedName("zone_name")
    @Nullable
    private String zoneName;

    @SerializedName("zone_offset")
    @Nullable
    private Integer zoneOffsetInSec;

    public FitnessDataModel(@NotNull String sid, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        this.sid = sid;
        this.key = key;
        this.time = j;
    }

    public static /* synthetic */ FitnessDataModel copy$default(FitnessDataModel fitnessDataModel, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fitnessDataModel.sid;
        }
        if ((i & 2) != 0) {
            str2 = fitnessDataModel.key;
        }
        if ((i & 4) != 0) {
            j = fitnessDataModel.time;
        }
        return fitnessDataModel.copy(str, str2, j);
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
    public final FitnessDataModel copy(@NotNull String sid, @NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        return new FitnessDataModel(sid, key, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessDataModel)) {
            return false;
        }
        FitnessDataModel fitnessDataModel = (FitnessDataModel) other;
        return Intrinsics.areEqual(this.sid, fitnessDataModel.sid) && Intrinsics.areEqual(this.key, fitnessDataModel.key) && this.time == fitnessDataModel.time;
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

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    @Nullable
    public final Integer getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        return (((this.sid.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @Nullable
    /* JADX INFO: renamed from: isDeleted, reason: from getter */
    public final Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public final void setDeleted(@Nullable Boolean bool) {
        this.isDeleted = bool;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    public final void setZoneOffsetInSec(@Nullable Integer num) {
        this.zoneOffsetInSec = num;
    }

    @NotNull
    public String toString() {
        return "FitnessDataModel(sid=" + this.sid + ", key=" + this.key + ", time=" + this.time + ")";
    }
}
