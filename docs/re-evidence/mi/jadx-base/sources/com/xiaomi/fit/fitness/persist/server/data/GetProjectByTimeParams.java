package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByTimeParams;", "", "key", "", "nextKey", "startTime", "", "endTime", "limit", "", "reverse", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;IZ)V", "getKey", "()Ljava/lang/String;", "getNextKey", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getLimit", "()I", "getReverse", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;IZ)Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByTimeParams;", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public GetProjectByTimeParams(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Long l2, int i, boolean z) {
        this.key = str;
        this.nextKey = str2;
        this.startTime = l;
        this.endTime = l2;
        this.limit = i;
        this.reverse = z;
    }

    public static /* synthetic */ GetProjectByTimeParams copy$default(GetProjectByTimeParams getProjectByTimeParams, String str, String str2, Long l, Long l2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getProjectByTimeParams.key;
        }
        if ((i2 & 2) != 0) {
            str2 = getProjectByTimeParams.nextKey;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            l = getProjectByTimeParams.startTime;
        }
        Long l3 = l;
        if ((i2 & 8) != 0) {
            l2 = getProjectByTimeParams.endTime;
        }
        Long l4 = l2;
        if ((i2 & 16) != 0) {
            i = getProjectByTimeParams.limit;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = getProjectByTimeParams.reverse;
        }
        return getProjectByTimeParams.copy(str, str3, l3, l4, i3, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getReverse() {
        return this.reverse;
    }

    @NotNull
    public final GetProjectByTimeParams copy(@Nullable String key, @Nullable String nextKey, @Nullable Long startTime, @Nullable Long endTime, int limit, boolean reverse) {
        return new GetProjectByTimeParams(key, nextKey, startTime, endTime, limit, reverse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProjectByTimeParams)) {
            return false;
        }
        GetProjectByTimeParams getProjectByTimeParams = (GetProjectByTimeParams) other;
        return Intrinsics.areEqual(this.key, getProjectByTimeParams.key) && Intrinsics.areEqual(this.nextKey, getProjectByTimeParams.nextKey) && Intrinsics.areEqual(this.startTime, getProjectByTimeParams.startTime) && Intrinsics.areEqual(this.endTime, getProjectByTimeParams.endTime) && this.limit == getProjectByTimeParams.limit && this.reverse == getProjectByTimeParams.reverse;
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
        String str2 = this.nextKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        return ((((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31) + Integer.hashCode(this.limit)) * 31) + Boolean.hashCode(this.reverse);
    }

    @NotNull
    public String toString() {
        return "GetProjectByTimeParams(key=" + this.key + ", nextKey=" + this.nextKey + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", limit=" + this.limit + ", reverse=" + this.reverse + ")";
    }

    public /* synthetic */ GetProjectByTimeParams(String str, String str2, Long l, Long l2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : l, (i2 & 8) == 0 ? l2 : null, (i2 & 16) != 0 ? 30 : i, (i2 & 32) != 0 ? true : z);
    }
}
