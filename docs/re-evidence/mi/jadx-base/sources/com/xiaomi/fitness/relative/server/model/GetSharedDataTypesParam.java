package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/GetSharedDataTypesParam;", "", "relativeId", "", "type", "", "<init>", "(JLjava/lang/Integer;)V", "getRelativeId", "()J", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(JLjava/lang/Integer;)Lcom/xiaomi/fitness/relative/server/model/GetSharedDataTypesParam;", "equals", "", "other", "hashCode", "toString", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSharedDataTypesParam {

    @SerializedName("relative_uid")
    private final long relativeId;

    @SerializedName("type")
    @Nullable
    private final Integer type;

    public GetSharedDataTypesParam(long j, @Nullable Integer num) {
        this.relativeId = j;
        this.type = num;
    }

    public static /* synthetic */ GetSharedDataTypesParam copy$default(GetSharedDataTypesParam getSharedDataTypesParam, long j, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getSharedDataTypesParam.relativeId;
        }
        if ((i & 2) != 0) {
            num = getSharedDataTypesParam.type;
        }
        return getSharedDataTypesParam.copy(j, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final GetSharedDataTypesParam copy(long relativeId, @Nullable Integer type) {
        return new GetSharedDataTypesParam(relativeId, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSharedDataTypesParam)) {
            return false;
        }
        GetSharedDataTypesParam getSharedDataTypesParam = (GetSharedDataTypesParam) other;
        return this.relativeId == getSharedDataTypesParam.relativeId && Intrinsics.areEqual(this.type, getSharedDataTypesParam.type);
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.relativeId) * 31;
        Integer num = this.type;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetSharedDataTypesParam(relativeId=" + this.relativeId + ", type=" + this.type + ")";
    }

    public /* synthetic */ GetSharedDataTypesParam(long j, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : num);
    }
}
