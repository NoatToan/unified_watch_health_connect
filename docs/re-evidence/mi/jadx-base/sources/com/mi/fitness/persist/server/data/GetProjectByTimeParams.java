package com.mi.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006%"}, d2 = {"Lcom/mi/fitness/persist/server/data/GetProjectByTimeParams;", "", "key", "", "startTime", "", "endTime", "limit", "", "reverse", "", "nextKey", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;IZLjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getLimit", "()I", "getReverse", "()Z", "getNextKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;IZLjava/lang/String;)Lcom/mi/fitness/persist/server/data/GetProjectByTimeParams;", "equals", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetProjectByTimeParams {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    @Nullable
    private final Long endTime;

    @SerializedName("key")
    @Nullable
    private final String key;

    @SerializedName("limit")
    private final int limit;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final String nextKey;

    @SerializedName("reverse")
    private final boolean reverse;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    @Nullable
    private final Long startTime;

    public GetProjectByTimeParams(@Nullable String str, @Nullable Long l, @Nullable Long l2, int i, boolean z, @Nullable String str2) {
        this.key = str;
        this.startTime = l;
        this.endTime = l2;
        this.limit = i;
        this.reverse = z;
        this.nextKey = str2;
    }

    public static /* synthetic */ GetProjectByTimeParams copy$default(GetProjectByTimeParams getProjectByTimeParams, String str, Long l, Long l2, int i, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getProjectByTimeParams.key;
        }
        if ((i2 & 2) != 0) {
            l = getProjectByTimeParams.startTime;
        }
        Long l3 = l;
        if ((i2 & 4) != 0) {
            l2 = getProjectByTimeParams.endTime;
        }
        Long l4 = l2;
        if ((i2 & 8) != 0) {
            i = getProjectByTimeParams.limit;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = getProjectByTimeParams.reverse;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str2 = getProjectByTimeParams.nextKey;
        }
        return getProjectByTimeParams.copy(str, l3, l4, i3, z2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getReverse() {
        return this.reverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final GetProjectByTimeParams copy(@Nullable String key, @Nullable Long startTime, @Nullable Long endTime, int limit, boolean reverse, @Nullable String nextKey) {
        return new GetProjectByTimeParams(key, startTime, endTime, limit, reverse, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProjectByTimeParams)) {
            return false;
        }
        GetProjectByTimeParams getProjectByTimeParams = (GetProjectByTimeParams) other;
        return Intrinsics.areEqual(this.key, getProjectByTimeParams.key) && Intrinsics.areEqual(this.startTime, getProjectByTimeParams.startTime) && Intrinsics.areEqual(this.endTime, getProjectByTimeParams.endTime) && this.limit == getProjectByTimeParams.limit && this.reverse == getProjectByTimeParams.reverse && Intrinsics.areEqual(this.nextKey, getProjectByTimeParams.nextKey);
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    public final boolean getReverse() {
        return this.reverse;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.startTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int iHashCode3 = (((((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.limit)) * 31) + Boolean.hashCode(this.reverse)) * 31;
        String str2 = this.nextKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetProjectByTimeParams(key=" + this.key + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", limit=" + this.limit + ", reverse=" + this.reverse + ", nextKey=" + this.nextKey + ")";
    }

    public /* synthetic */ GetProjectByTimeParams(String str, Long l, Long l2, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? 30 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) == 0 ? str2 : null);
    }
}
