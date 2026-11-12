package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetMiAppAuthConfigListParam;", "", q.f13858b, "", "scopeType", "", "<init>", "(JLjava/lang/Integer;)V", "getAppId", "()J", "getScopeType", "()Ljava/lang/Integer;", "setScopeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(JLjava/lang/Integer;)Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetMiAppAuthConfigListParam;", "equals", "", "other", "hashCode", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetMiAppAuthConfigListParam {

    @SerializedName(g.d)
    private final long appId;

    @SerializedName("scope_type")
    @Nullable
    private Integer scopeType;

    public GetMiAppAuthConfigListParam(long j, @Nullable Integer num) {
        this.appId = j;
        this.scopeType = num;
    }

    public static /* synthetic */ GetMiAppAuthConfigListParam copy$default(GetMiAppAuthConfigListParam getMiAppAuthConfigListParam, long j, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getMiAppAuthConfigListParam.appId;
        }
        if ((i & 2) != 0) {
            num = getMiAppAuthConfigListParam.scopeType;
        }
        return getMiAppAuthConfigListParam.copy(j, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getScopeType() {
        return this.scopeType;
    }

    @NotNull
    public final GetMiAppAuthConfigListParam copy(long appId, @Nullable Integer scopeType) {
        return new GetMiAppAuthConfigListParam(appId, scopeType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMiAppAuthConfigListParam)) {
            return false;
        }
        GetMiAppAuthConfigListParam getMiAppAuthConfigListParam = (GetMiAppAuthConfigListParam) other;
        return this.appId == getMiAppAuthConfigListParam.appId && Intrinsics.areEqual(this.scopeType, getMiAppAuthConfigListParam.scopeType);
    }

    public final long getAppId() {
        return this.appId;
    }

    @Nullable
    public final Integer getScopeType() {
        return this.scopeType;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.appId) * 31;
        Integer num = this.scopeType;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setScopeType(@Nullable Integer num) {
        this.scopeType = num;
    }

    @NotNull
    public String toString() {
        return "GetMiAppAuthConfigListParam(appId=" + this.appId + ", scopeType=" + this.scopeType + ")";
    }

    public /* synthetic */ GetMiAppAuthConfigListParam(long j, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : num);
    }
}
