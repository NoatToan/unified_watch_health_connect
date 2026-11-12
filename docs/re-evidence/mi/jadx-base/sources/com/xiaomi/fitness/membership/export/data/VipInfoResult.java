package com.xiaomi.fitness.membership.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipInfoResult;", "", "membership", "Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "<init>", "(Lcom/xiaomi/fitness/membership/export/data/VipInfo;)V", "getMembership", "()Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipInfoResult {

    @NotNull
    private final VipInfo membership;

    public VipInfoResult(@NotNull VipInfo membership) {
        Intrinsics.checkNotNullParameter(membership, "membership");
        this.membership = membership;
    }

    public static /* synthetic */ VipInfoResult copy$default(VipInfoResult vipInfoResult, VipInfo vipInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            vipInfo = vipInfoResult.membership;
        }
        return vipInfoResult.copy(vipInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VipInfo getMembership() {
        return this.membership;
    }

    @NotNull
    public final VipInfoResult copy(@NotNull VipInfo membership) {
        Intrinsics.checkNotNullParameter(membership, "membership");
        return new VipInfoResult(membership);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VipInfoResult) && Intrinsics.areEqual(this.membership, ((VipInfoResult) other).membership);
    }

    @NotNull
    public final VipInfo getMembership() {
        return this.membership;
    }

    public int hashCode() {
        return this.membership.hashCode();
    }

    @NotNull
    public String toString() {
        return "VipInfoResult(membership=" + this.membership + ")";
    }
}
