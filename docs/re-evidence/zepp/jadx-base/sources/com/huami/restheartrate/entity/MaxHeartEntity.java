package com.huami.restheartrate.entity;

import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.dataflow.Constant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity(primaryKeys = {"userId", "date"}, tableName = "max_heart_rate")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/restheartrate/entity/MaxHeartEntity;", "", "", "component1", "component2", "", "component3", "", "component4", "userId", "date", Constant.KEY_HR_VALUE, "timestamp", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getDate", "c", LogUtil.I, "getHeartRate", "()I", GoogleApiAvailabilityLight.a, "J", "getTimestamp", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MaxHeartEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int heartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long timestamp;

    public MaxHeartEntity(@NotNull String str, @NotNull String str2, int i, long j) {
        this.userId = str;
        this.date = str2;
        this.heartRate = i;
        this.timestamp = j;
    }

    public static /* synthetic */ MaxHeartEntity copy$default(MaxHeartEntity maxHeartEntity, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = maxHeartEntity.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = maxHeartEntity.date;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = maxHeartEntity.heartRate;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = maxHeartEntity.timestamp;
        }
        return maxHeartEntity.copy(str, str3, i3, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final MaxHeartEntity copy(@NotNull String userId, @NotNull String date, int heartRate, long timestamp) {
        return new MaxHeartEntity(userId, date, heartRate, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxHeartEntity)) {
            return false;
        }
        MaxHeartEntity maxHeartEntity = (MaxHeartEntity) other;
        return Intrinsics.areEqual(this.userId, maxHeartEntity.userId) && Intrinsics.areEqual(this.date, maxHeartEntity.date) && this.heartRate == maxHeartEntity.heartRate && this.timestamp == maxHeartEntity.timestamp;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.date.hashCode()) * 31) + this.heartRate) * 31) + b.a(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "MaxHeartEntity(userId=" + this.userId + ", date=" + this.date + ", heartRate=" + this.heartRate + ", timestamp=" + this.timestamp + ")";
    }
}
