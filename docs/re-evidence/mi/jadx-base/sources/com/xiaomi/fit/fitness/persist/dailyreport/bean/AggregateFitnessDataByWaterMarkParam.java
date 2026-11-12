package com.xiaomi.fit.fitness.persist.dailyreport.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByWaterMarkParam;", "", "tag", "", "watermark", "", "phoneId", "limit", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)V", "getTag", "()Ljava/lang/String;", "getWatermark", "()J", "getPhoneId", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByWaterMarkParam;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregateFitnessDataByWaterMarkParam {

    @Nullable
    private final Integer limit;

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    @NotNull
    private final String tag;
    private final long watermark;

    public AggregateFitnessDataByWaterMarkParam(@NotNull String tag, long j, @NotNull String phoneId, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        this.tag = tag;
        this.watermark = j;
        this.phoneId = phoneId;
        this.limit = num;
    }

    public static /* synthetic */ AggregateFitnessDataByWaterMarkParam copy$default(AggregateFitnessDataByWaterMarkParam aggregateFitnessDataByWaterMarkParam, String str, long j, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aggregateFitnessDataByWaterMarkParam.tag;
        }
        if ((i & 2) != 0) {
            j = aggregateFitnessDataByWaterMarkParam.watermark;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = aggregateFitnessDataByWaterMarkParam.phoneId;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            num = aggregateFitnessDataByWaterMarkParam.limit;
        }
        return aggregateFitnessDataByWaterMarkParam.copy(str, j2, str3, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWatermark() {
        return this.watermark;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final AggregateFitnessDataByWaterMarkParam copy(@NotNull String tag, long watermark, @NotNull String phoneId, @Nullable Integer limit) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        return new AggregateFitnessDataByWaterMarkParam(tag, watermark, phoneId, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregateFitnessDataByWaterMarkParam)) {
            return false;
        }
        AggregateFitnessDataByWaterMarkParam aggregateFitnessDataByWaterMarkParam = (AggregateFitnessDataByWaterMarkParam) other;
        return Intrinsics.areEqual(this.tag, aggregateFitnessDataByWaterMarkParam.tag) && this.watermark == aggregateFitnessDataByWaterMarkParam.watermark && Intrinsics.areEqual(this.phoneId, aggregateFitnessDataByWaterMarkParam.phoneId) && Intrinsics.areEqual(this.limit, aggregateFitnessDataByWaterMarkParam.limit);
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getWatermark() {
        return this.watermark;
    }

    public int hashCode() {
        int iHashCode = ((((this.tag.hashCode() * 31) + Long.hashCode(this.watermark)) * 31) + this.phoneId.hashCode()) * 31;
        Integer num = this.limit;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "AggregateFitnessDataByWaterMarkParam(tag=" + this.tag + ", watermark=" + this.watermark + ", phoneId=" + this.phoneId + ", limit=" + this.limit + ")";
    }
}
