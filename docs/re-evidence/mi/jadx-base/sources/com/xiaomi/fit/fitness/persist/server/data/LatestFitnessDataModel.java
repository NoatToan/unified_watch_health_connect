package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessDataModel;", "", "key", "", "limit", "", "time", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "getKey", "()Ljava/lang/String;", "getLimit", "()I", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessDataModel;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatestFitnessDataModel {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("limit")
    private final int limit;

    @SerializedName("time")
    @Nullable
    private final Long time;

    public LatestFitnessDataModel(@NotNull String key, int i, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.limit = i;
        this.time = l;
    }

    public static /* synthetic */ LatestFitnessDataModel copy$default(LatestFitnessDataModel latestFitnessDataModel, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = latestFitnessDataModel.key;
        }
        if ((i2 & 2) != 0) {
            i = latestFitnessDataModel.limit;
        }
        if ((i2 & 4) != 0) {
            l = latestFitnessDataModel.time;
        }
        return latestFitnessDataModel.copy(str, i, l);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final LatestFitnessDataModel copy(@NotNull String key, int limit, @Nullable Long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new LatestFitnessDataModel(key, limit, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestFitnessDataModel)) {
            return false;
        }
        LatestFitnessDataModel latestFitnessDataModel = (LatestFitnessDataModel) other;
        return Intrinsics.areEqual(this.key, latestFitnessDataModel.key) && this.limit == latestFitnessDataModel.limit && Intrinsics.areEqual(this.time, latestFitnessDataModel.time);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((this.key.hashCode() * 31) + Integer.hashCode(this.limit)) * 31;
        Long l = this.time;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "LatestFitnessDataModel(key=" + this.key + ", limit=" + this.limit + ", time=" + this.time + ")";
    }

    public /* synthetic */ LatestFitnessDataModel(String str, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : l);
    }
}
