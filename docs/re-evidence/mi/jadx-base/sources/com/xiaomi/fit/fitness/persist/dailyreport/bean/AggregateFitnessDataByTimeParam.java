package com.xiaomi.fit.fitness.persist.dailyreport.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001b¨\u0006+"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByTimeParam;", "", "tag", "", "key", "reverse", "", "limit", "", "nextKey", "startTime", "", "hasMore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getKey", "getReverse", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextKey", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHasMore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByTimeParam;", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregateFitnessDataByTimeParam {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    @Nullable
    private final Long hasMore;

    @Nullable
    private final String key;

    @Nullable
    private final Integer limit;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final String nextKey;

    @Nullable
    private final Boolean reverse;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    @Nullable
    private final Long startTime;

    @NotNull
    private final String tag;

    public AggregateFitnessDataByTimeParam(@NotNull String tag, @Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str2, @Nullable Long l, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.key = str;
        this.reverse = bool;
        this.limit = num;
        this.nextKey = str2;
        this.startTime = l;
        this.hasMore = l2;
    }

    public static /* synthetic */ AggregateFitnessDataByTimeParam copy$default(AggregateFitnessDataByTimeParam aggregateFitnessDataByTimeParam, String str, String str2, Boolean bool, Integer num, String str3, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aggregateFitnessDataByTimeParam.tag;
        }
        if ((i & 2) != 0) {
            str2 = aggregateFitnessDataByTimeParam.key;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = aggregateFitnessDataByTimeParam.reverse;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            num = aggregateFitnessDataByTimeParam.limit;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = aggregateFitnessDataByTimeParam.nextKey;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            l = aggregateFitnessDataByTimeParam.startTime;
        }
        Long l3 = l;
        if ((i & 64) != 0) {
            l2 = aggregateFitnessDataByTimeParam.hasMore;
        }
        return aggregateFitnessDataByTimeParam.copy(str, str4, bool2, num2, str5, l3, l2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getReverse() {
        return this.reverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final AggregateFitnessDataByTimeParam copy(@NotNull String tag, @Nullable String key, @Nullable Boolean reverse, @Nullable Integer limit, @Nullable String nextKey, @Nullable Long startTime, @Nullable Long hasMore) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new AggregateFitnessDataByTimeParam(tag, key, reverse, limit, nextKey, startTime, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregateFitnessDataByTimeParam)) {
            return false;
        }
        AggregateFitnessDataByTimeParam aggregateFitnessDataByTimeParam = (AggregateFitnessDataByTimeParam) other;
        return Intrinsics.areEqual(this.tag, aggregateFitnessDataByTimeParam.tag) && Intrinsics.areEqual(this.key, aggregateFitnessDataByTimeParam.key) && Intrinsics.areEqual(this.reverse, aggregateFitnessDataByTimeParam.reverse) && Intrinsics.areEqual(this.limit, aggregateFitnessDataByTimeParam.limit) && Intrinsics.areEqual(this.nextKey, aggregateFitnessDataByTimeParam.nextKey) && Intrinsics.areEqual(this.startTime, aggregateFitnessDataByTimeParam.startTime) && Intrinsics.areEqual(this.hasMore, aggregateFitnessDataByTimeParam.hasMore);
    }

    @Nullable
    public final Long getHasMore() {
        return this.hasMore;
    }

    @Nullable
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

    @Nullable
    public final Boolean getReverse() {
        return this.reverse;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = this.tag.hashCode() * 31;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reverse;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nextKey;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.hasMore;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AggregateFitnessDataByTimeParam(tag=" + this.tag + ", key=" + this.key + ", reverse=" + this.reverse + ", limit=" + this.limit + ", nextKey=" + this.nextKey + ", startTime=" + this.startTime + ", hasMore=" + this.hasMore + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AggregateFitnessDataByTimeParam(@NotNull String tag, @Nullable String str) {
        this(tag, null, Boolean.TRUE, 100, str, null, null);
        Intrinsics.checkNotNullParameter(tag, "tag");
    }
}
