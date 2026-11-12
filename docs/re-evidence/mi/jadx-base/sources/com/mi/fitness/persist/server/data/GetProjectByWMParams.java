package com.mi.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/mi/fitness/persist/server/data/GetProjectByWMParams;", "", "phoneId", "", "waterMark", "", "limit", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;I)V", "getPhoneId", "()Ljava/lang/String;", "getWaterMark", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLimit", "()I", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;I)Lcom/mi/fitness/persist/server/data/GetProjectByWMParams;", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetProjectByWMParams {

    @SerializedName("limit")
    private final int limit;

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    @SerializedName("watermark")
    @Nullable
    private final Long waterMark;

    public GetProjectByWMParams(@NotNull String phoneId, @Nullable Long l, int i) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        this.phoneId = phoneId;
        this.waterMark = l;
        this.limit = i;
    }

    public static /* synthetic */ GetProjectByWMParams copy$default(GetProjectByWMParams getProjectByWMParams, String str, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getProjectByWMParams.phoneId;
        }
        if ((i2 & 2) != 0) {
            l = getProjectByWMParams.waterMark;
        }
        if ((i2 & 4) != 0) {
            i = getProjectByWMParams.limit;
        }
        return getProjectByWMParams.copy(str, l, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getWaterMark() {
        return this.waterMark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final GetProjectByWMParams copy(@NotNull String phoneId, @Nullable Long waterMark, int limit) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        return new GetProjectByWMParams(phoneId, waterMark, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProjectByWMParams)) {
            return false;
        }
        GetProjectByWMParams getProjectByWMParams = (GetProjectByWMParams) other;
        return Intrinsics.areEqual(this.phoneId, getProjectByWMParams.phoneId) && Intrinsics.areEqual(this.waterMark, getProjectByWMParams.waterMark) && this.limit == getProjectByWMParams.limit;
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    @Nullable
    public final Long getWaterMark() {
        return this.waterMark;
    }

    public int hashCode() {
        int iHashCode = this.phoneId.hashCode() * 31;
        Long l = this.waterMark;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.limit);
    }

    @NotNull
    public String toString() {
        return "GetProjectByWMParams(phoneId=" + this.phoneId + ", waterMark=" + this.waterMark + ", limit=" + this.limit + ")";
    }

    public /* synthetic */ GetProjectByWMParams(String str, Long l, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, (i2 & 4) != 0 ? 30 : i);
    }
}
