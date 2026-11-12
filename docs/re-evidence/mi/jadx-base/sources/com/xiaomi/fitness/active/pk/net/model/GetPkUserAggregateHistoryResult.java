package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/GetPkUserAggregateHistoryResult;", "", "aggregatePkInfo", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "medalIcon", "", "<init>", "(Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;Ljava/lang/String;)V", "getAggregatePkInfo", "()Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "getMedalIcon", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetPkUserAggregateHistoryResult {

    @SerializedName("pk_history")
    @Nullable
    private final AggregatePkInfo aggregatePkInfo;

    @SerializedName("medal_icon_url")
    @Nullable
    private final String medalIcon;

    public GetPkUserAggregateHistoryResult(@Nullable AggregatePkInfo aggregatePkInfo, @Nullable String str) {
        this.aggregatePkInfo = aggregatePkInfo;
        this.medalIcon = str;
    }

    public static /* synthetic */ GetPkUserAggregateHistoryResult copy$default(GetPkUserAggregateHistoryResult getPkUserAggregateHistoryResult, AggregatePkInfo aggregatePkInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            aggregatePkInfo = getPkUserAggregateHistoryResult.aggregatePkInfo;
        }
        if ((i & 2) != 0) {
            str = getPkUserAggregateHistoryResult.medalIcon;
        }
        return getPkUserAggregateHistoryResult.copy(aggregatePkInfo, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AggregatePkInfo getAggregatePkInfo() {
        return this.aggregatePkInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMedalIcon() {
        return this.medalIcon;
    }

    @NotNull
    public final GetPkUserAggregateHistoryResult copy(@Nullable AggregatePkInfo aggregatePkInfo, @Nullable String medalIcon) {
        return new GetPkUserAggregateHistoryResult(aggregatePkInfo, medalIcon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPkUserAggregateHistoryResult)) {
            return false;
        }
        GetPkUserAggregateHistoryResult getPkUserAggregateHistoryResult = (GetPkUserAggregateHistoryResult) other;
        return Intrinsics.areEqual(this.aggregatePkInfo, getPkUserAggregateHistoryResult.aggregatePkInfo) && Intrinsics.areEqual(this.medalIcon, getPkUserAggregateHistoryResult.medalIcon);
    }

    @Nullable
    public final AggregatePkInfo getAggregatePkInfo() {
        return this.aggregatePkInfo;
    }

    @Nullable
    public final String getMedalIcon() {
        return this.medalIcon;
    }

    public int hashCode() {
        AggregatePkInfo aggregatePkInfo = this.aggregatePkInfo;
        int iHashCode = (aggregatePkInfo == null ? 0 : aggregatePkInfo.hashCode()) * 31;
        String str = this.medalIcon;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetPkUserAggregateHistoryResult(aggregatePkInfo=" + this.aggregatePkInfo + ", medalIcon=" + this.medalIcon + ")";
    }
}
