package com.xiaomi.fitness.membership.export.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceResponse;", "", "membershipExpirePaidWatch", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "<init>", "(Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;)V", "getMembershipExpirePaidWatch", "()Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipExpiredFaceResponse {

    @SerializedName("membership_expire_paid_watch")
    @Nullable
    private final VipExpiredFaceData membershipExpirePaidWatch;

    public VipExpiredFaceResponse(@Nullable VipExpiredFaceData vipExpiredFaceData) {
        this.membershipExpirePaidWatch = vipExpiredFaceData;
    }

    public static /* synthetic */ VipExpiredFaceResponse copy$default(VipExpiredFaceResponse vipExpiredFaceResponse, VipExpiredFaceData vipExpiredFaceData, int i, Object obj) {
        if ((i & 1) != 0) {
            vipExpiredFaceData = vipExpiredFaceResponse.membershipExpirePaidWatch;
        }
        return vipExpiredFaceResponse.copy(vipExpiredFaceData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VipExpiredFaceData getMembershipExpirePaidWatch() {
        return this.membershipExpirePaidWatch;
    }

    @NotNull
    public final VipExpiredFaceResponse copy(@Nullable VipExpiredFaceData membershipExpirePaidWatch) {
        return new VipExpiredFaceResponse(membershipExpirePaidWatch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VipExpiredFaceResponse) && Intrinsics.areEqual(this.membershipExpirePaidWatch, ((VipExpiredFaceResponse) other).membershipExpirePaidWatch);
    }

    @Nullable
    public final VipExpiredFaceData getMembershipExpirePaidWatch() {
        return this.membershipExpirePaidWatch;
    }

    public int hashCode() {
        VipExpiredFaceData vipExpiredFaceData = this.membershipExpirePaidWatch;
        if (vipExpiredFaceData == null) {
            return 0;
        }
        return vipExpiredFaceData.hashCode();
    }

    @NotNull
    public String toString() {
        return "VipExpiredFaceResponse(membershipExpirePaidWatch=" + this.membershipExpirePaidWatch + ")";
    }
}
