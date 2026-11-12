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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!Jf\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\rHÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;", "", "relativeId", "", "key", "", "startTime", "endTime", "tag", "reverse", "", "nextKey", "limit", "", "<init>", "(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "getRelativeId", "()J", "getKey", "()Ljava/lang/String;", "getStartTime", "getEndTime", "getTag", "setTag", "(Ljava/lang/String;)V", "getReverse", "()Ljava/lang/Boolean;", "setReverse", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNextKey", "setNextKey", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetDetailDataParam {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private final long endTime;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("limit")
    @Nullable
    private Integer limit;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private String nextKey;

    @SerializedName("relative_uid")
    private final long relativeId;

    @SerializedName("reverse")
    @Nullable
    private Boolean reverse;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private final long startTime;

    @SerializedName("tag")
    @Nullable
    private String tag;

    public GetDetailDataParam(long j, @NotNull String key, long j2, long j3, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.relativeId = j;
        this.key = key;
        this.startTime = j2;
        this.endTime = j3;
        this.tag = str;
        this.reverse = bool;
        this.nextKey = str2;
        this.limit = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getReverse() {
        return this.reverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final GetDetailDataParam copy(long relativeId, @NotNull String key, long startTime, long endTime, @Nullable String tag, @Nullable Boolean reverse, @Nullable String nextKey, @Nullable Integer limit) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new GetDetailDataParam(relativeId, key, startTime, endTime, tag, reverse, nextKey, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDetailDataParam)) {
            return false;
        }
        GetDetailDataParam getDetailDataParam = (GetDetailDataParam) other;
        return this.relativeId == getDetailDataParam.relativeId && Intrinsics.areEqual(this.key, getDetailDataParam.key) && this.startTime == getDetailDataParam.startTime && this.endTime == getDetailDataParam.endTime && Intrinsics.areEqual(this.tag, getDetailDataParam.tag) && Intrinsics.areEqual(this.reverse, getDetailDataParam.reverse) && Intrinsics.areEqual(this.nextKey, getDetailDataParam.nextKey) && Intrinsics.areEqual(this.limit, getDetailDataParam.limit);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    @Nullable
    public final Boolean getReverse() {
        return this.reverse;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.relativeId) * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        String str = this.tag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reverse;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.nextKey;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.limit;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setLimit(@Nullable Integer num) {
        this.limit = num;
    }

    public final void setNextKey(@Nullable String str) {
        this.nextKey = str;
    }

    public final void setReverse(@Nullable Boolean bool) {
        this.reverse = bool;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    @NotNull
    public String toString() {
        return "GetDetailDataParam(relativeId=" + this.relativeId + ", key=" + this.key + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", tag=" + this.tag + ", reverse=" + this.reverse + ", nextKey=" + this.nextKey + ", limit=" + this.limit + ")";
    }

    public /* synthetic */ GetDetailDataParam(long j, String str, long j2, long j3, String str2, Boolean bool, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, j3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? 100 : num);
    }
}
