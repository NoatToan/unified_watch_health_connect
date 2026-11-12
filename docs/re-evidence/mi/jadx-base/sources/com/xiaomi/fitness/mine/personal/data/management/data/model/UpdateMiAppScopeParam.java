package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/UpdateMiAppScopeParam;", "", "grantScopeIds", "", "", "revokeScopeIds", q.f13858b, "", "<init>", "(Ljava/util/List;Ljava/util/List;J)V", "getGrantScopeIds", "()Ljava/util/List;", "getRevokeScopeIds", "getAppId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpdateMiAppScopeParam {

    @SerializedName(g.d)
    private final long appId;

    @SerializedName("grant_scope_ids")
    @NotNull
    private final List<String> grantScopeIds;

    @SerializedName("revoke_scope_ids")
    @NotNull
    private final List<String> revokeScopeIds;

    public UpdateMiAppScopeParam(@NotNull List<String> grantScopeIds, @NotNull List<String> revokeScopeIds, long j) {
        Intrinsics.checkNotNullParameter(grantScopeIds, "grantScopeIds");
        Intrinsics.checkNotNullParameter(revokeScopeIds, "revokeScopeIds");
        this.grantScopeIds = grantScopeIds;
        this.revokeScopeIds = revokeScopeIds;
        this.appId = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateMiAppScopeParam copy$default(UpdateMiAppScopeParam updateMiAppScopeParam, List list, List list2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateMiAppScopeParam.grantScopeIds;
        }
        if ((i & 2) != 0) {
            list2 = updateMiAppScopeParam.revokeScopeIds;
        }
        if ((i & 4) != 0) {
            j = updateMiAppScopeParam.appId;
        }
        return updateMiAppScopeParam.copy(list, list2, j);
    }

    @NotNull
    public final List<String> component1() {
        return this.grantScopeIds;
    }

    @NotNull
    public final List<String> component2() {
        return this.revokeScopeIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final UpdateMiAppScopeParam copy(@NotNull List<String> grantScopeIds, @NotNull List<String> revokeScopeIds, long appId) {
        Intrinsics.checkNotNullParameter(grantScopeIds, "grantScopeIds");
        Intrinsics.checkNotNullParameter(revokeScopeIds, "revokeScopeIds");
        return new UpdateMiAppScopeParam(grantScopeIds, revokeScopeIds, appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMiAppScopeParam)) {
            return false;
        }
        UpdateMiAppScopeParam updateMiAppScopeParam = (UpdateMiAppScopeParam) other;
        return Intrinsics.areEqual(this.grantScopeIds, updateMiAppScopeParam.grantScopeIds) && Intrinsics.areEqual(this.revokeScopeIds, updateMiAppScopeParam.revokeScopeIds) && this.appId == updateMiAppScopeParam.appId;
    }

    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final List<String> getGrantScopeIds() {
        return this.grantScopeIds;
    }

    @NotNull
    public final List<String> getRevokeScopeIds() {
        return this.revokeScopeIds;
    }

    public int hashCode() {
        return (((this.grantScopeIds.hashCode() * 31) + this.revokeScopeIds.hashCode()) * 31) + Long.hashCode(this.appId);
    }

    @NotNull
    public String toString() {
        return "UpdateMiAppScopeParam(grantScopeIds=" + this.grantScopeIds + ", revokeScopeIds=" + this.revokeScopeIds + ", appId=" + this.appId + ")";
    }
}
