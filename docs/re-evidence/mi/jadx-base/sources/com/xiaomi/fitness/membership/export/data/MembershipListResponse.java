package com.xiaomi.fitness.membership.export.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/MembershipListResponse;", "", "membership", "", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "<init>", "(Ljava/util/List;)V", "getMembership", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MembershipListResponse {

    @NotNull
    private final List<Membership> membership;

    public MembershipListResponse(@NotNull List<Membership> membership) {
        Intrinsics.checkNotNullParameter(membership, "membership");
        this.membership = membership;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipListResponse copy$default(MembershipListResponse membershipListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = membershipListResponse.membership;
        }
        return membershipListResponse.copy(list);
    }

    @NotNull
    public final List<Membership> component1() {
        return this.membership;
    }

    @NotNull
    public final MembershipListResponse copy(@NotNull List<Membership> membership) {
        Intrinsics.checkNotNullParameter(membership, "membership");
        return new MembershipListResponse(membership);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MembershipListResponse) && Intrinsics.areEqual(this.membership, ((MembershipListResponse) other).membership);
    }

    @NotNull
    public final List<Membership> getMembership() {
        return this.membership;
    }

    public int hashCode() {
        return this.membership.hashCode();
    }

    @NotNull
    public String toString() {
        return "MembershipListResponse(membership=" + this.membership + ")";
    }
}
