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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByTimeParams;", "", "tag", "", "key", "nextKey", "startTime", "", "endTime", "limit", "", "reverse", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;IZ)V", "getTag", "()Ljava/lang/String;", "getKey", "getNextKey", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getLimit", "()I", "getReverse", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;IZ)Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByTimeParams;", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetStatByTimeParams {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    @Nullable
    private final Long endTime;

    @SerializedName("key")
    @NotNull
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

    @SerializedName("tag")
    @NotNull
    private final String tag;

    public GetStatByTimeParams(@NotNull String tag, @NotNull String key, @Nullable String str, @Nullable Long l, @Nullable Long l2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        this.tag = tag;
        this.key = key;
        this.nextKey = str;
        this.startTime = l;
        this.endTime = l2;
        this.limit = i;
        this.reverse = z;
    }

    public static /* synthetic */ GetStatByTimeParams copy$default(GetStatByTimeParams getStatByTimeParams, String str, String str2, String str3, Long l, Long l2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getStatByTimeParams.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = getStatByTimeParams.key;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = getStatByTimeParams.nextKey;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            l = getStatByTimeParams.startTime;
        }
        Long l3 = l;
        if ((i2 & 16) != 0) {
            l2 = getStatByTimeParams.endTime;
        }
        Long l4 = l2;
        if ((i2 & 32) != 0) {
            i = getStatByTimeParams.limit;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = getStatByTimeParams.reverse;
        }
        return getStatByTimeParams.copy(str, str4, str5, l3, l4, i3, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getReverse() {
        return this.reverse;
    }

    @NotNull
    public final GetStatByTimeParams copy(@NotNull String tag, @NotNull String key, @Nullable String nextKey, @Nullable Long startTime, @Nullable Long endTime, int limit, boolean reverse) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        return new GetStatByTimeParams(tag, key, nextKey, startTime, endTime, limit, reverse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetStatByTimeParams)) {
            return false;
        }
        GetStatByTimeParams getStatByTimeParams = (GetStatByTimeParams) other;
        return Intrinsics.areEqual(this.tag, getStatByTimeParams.tag) && Intrinsics.areEqual(this.key, getStatByTimeParams.key) && Intrinsics.areEqual(this.nextKey, getStatByTimeParams.nextKey) && Intrinsics.areEqual(this.startTime, getStatByTimeParams.startTime) && Intrinsics.areEqual(this.endTime, getStatByTimeParams.endTime) && this.limit == getStatByTimeParams.limit && this.reverse == getStatByTimeParams.reverse;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @NotNull
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

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = ((this.tag.hashCode() * 31) + this.key.hashCode()) * 31;
        String str = this.nextKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        return ((((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31) + Integer.hashCode(this.limit)) * 31) + Boolean.hashCode(this.reverse);
    }

    @NotNull
    public String toString() {
        return "GetStatByTimeParams(tag=" + this.tag + ", key=" + this.key + ", nextKey=" + this.nextKey + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", limit=" + this.limit + ", reverse=" + this.reverse + ")";
    }

    public /* synthetic */ GetStatByTimeParams(String str, String str2, String str3, Long l, Long l2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? 50 : i, (i2 & 64) != 0 ? true : z);
    }
}
