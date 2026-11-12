package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\bHÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByWMParams;", "", "tag", "", "key", "waterMark", "", "limit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)V", "getTag", "()Ljava/lang/String;", "getKey", "getWaterMark", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLimit", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByWMParams;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetStatByWMParams {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("limit")
    private final int limit;

    @SerializedName("tag")
    @NotNull
    private final String tag;

    @SerializedName("watermark")
    @Nullable
    private final Long waterMark;

    public GetStatByWMParams(@NotNull String tag, @NotNull String key, @Nullable Long l, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        this.tag = tag;
        this.key = key;
        this.waterMark = l;
        this.limit = i;
    }

    public static /* synthetic */ GetStatByWMParams copy$default(GetStatByWMParams getStatByWMParams, String str, String str2, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getStatByWMParams.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = getStatByWMParams.key;
        }
        if ((i2 & 4) != 0) {
            l = getStatByWMParams.waterMark;
        }
        if ((i2 & 8) != 0) {
            i = getStatByWMParams.limit;
        }
        return getStatByWMParams.copy(str, str2, l, i);
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
    public final Long getWaterMark() {
        return this.waterMark;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final GetStatByWMParams copy(@NotNull String tag, @NotNull String key, @Nullable Long waterMark, int limit) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        return new GetStatByWMParams(tag, key, waterMark, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetStatByWMParams)) {
            return false;
        }
        GetStatByWMParams getStatByWMParams = (GetStatByWMParams) other;
        return Intrinsics.areEqual(this.tag, getStatByWMParams.tag) && Intrinsics.areEqual(this.key, getStatByWMParams.key) && Intrinsics.areEqual(this.waterMark, getStatByWMParams.waterMark) && this.limit == getStatByWMParams.limit;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Long getWaterMark() {
        return this.waterMark;
    }

    public int hashCode() {
        int iHashCode = ((this.tag.hashCode() * 31) + this.key.hashCode()) * 31;
        Long l = this.waterMark;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.limit);
    }

    @NotNull
    public String toString() {
        return "GetStatByWMParams(tag=" + this.tag + ", key=" + this.key + ", waterMark=" + this.waterMark + ", limit=" + this.limit + ")";
    }

    public /* synthetic */ GetStatByWMParams(String str, String str2, Long l, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, (i2 & 8) != 0 ? 50 : i);
    }
}
