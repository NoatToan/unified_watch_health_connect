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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetFitnessDataByTime;", "", "key", "", "startTime", "", "endTime", "reverse", "", "nextKey", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getReverse", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNextKey", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/xiaomi/fit/fitness/persist/server/data/GetFitnessDataByTime;", "equals", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetFitnessDataByTime {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    @Nullable
    private final Long endTime;

    @SerializedName("key")
    @Nullable
    private final String key;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final String nextKey;

    @SerializedName("reverse")
    @Nullable
    private final Boolean reverse;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    @Nullable
    private final Long startTime;

    public GetFitnessDataByTime(@Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Boolean bool, @Nullable String str2) {
        this.key = str;
        this.startTime = l;
        this.endTime = l2;
        this.reverse = bool;
        this.nextKey = str2;
    }

    public static /* synthetic */ GetFitnessDataByTime copy$default(GetFitnessDataByTime getFitnessDataByTime, String str, Long l, Long l2, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFitnessDataByTime.key;
        }
        if ((i & 2) != 0) {
            l = getFitnessDataByTime.startTime;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = getFitnessDataByTime.endTime;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            bool = getFitnessDataByTime.reverse;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str2 = getFitnessDataByTime.nextKey;
        }
        return getFitnessDataByTime.copy(str, l3, l4, bool2, str2);
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getReverse() {
        return this.reverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final GetFitnessDataByTime copy(@Nullable String key, @Nullable Long startTime, @Nullable Long endTime, @Nullable Boolean reverse, @Nullable String nextKey) {
        return new GetFitnessDataByTime(key, startTime, endTime, reverse, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetFitnessDataByTime)) {
            return false;
        }
        GetFitnessDataByTime getFitnessDataByTime = (GetFitnessDataByTime) other;
        return Intrinsics.areEqual(this.key, getFitnessDataByTime.key) && Intrinsics.areEqual(this.startTime, getFitnessDataByTime.startTime) && Intrinsics.areEqual(this.endTime, getFitnessDataByTime.endTime) && Intrinsics.areEqual(this.reverse, getFitnessDataByTime.reverse) && Intrinsics.areEqual(this.nextKey, getFitnessDataByTime.nextKey);
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getKey() {
        return this.key;
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

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.startTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.reverse;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.nextKey;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetFitnessDataByTime(key=" + this.key + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", reverse=" + this.reverse + ", nextKey=" + this.nextKey + ")";
    }

    public /* synthetic */ GetFitnessDataByTime(String str, Long l, Long l2, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, l2, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? null : str2);
    }

    public GetFitnessDataByTime(@Nullable Long l, @Nullable Long l2, @Nullable String str) {
        this(null, l, l2, Boolean.TRUE, str);
    }
}
