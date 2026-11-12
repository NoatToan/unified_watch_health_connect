package com.huami.nfc.eid.entities;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/eid/entities/EidStatus;", "", "", "component1", "component2", "component3", "status", "orderNum", "userId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "b", "getOrderNum", "c", "getUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EidStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("bizSerialNo")
    @NotNull
    private final String orderNum;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("userId")
    @Nullable
    private final String userId;

    public EidStatus(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.status = str;
        this.orderNum = str2;
        this.userId = str3;
    }

    public static /* synthetic */ EidStatus copy$default(EidStatus eidStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eidStatus.status;
        }
        if ((i & 2) != 0) {
            str2 = eidStatus.orderNum;
        }
        if ((i & 4) != 0) {
            str3 = eidStatus.userId;
        }
        return eidStatus.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderNum() {
        return this.orderNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final EidStatus copy(@NotNull String status, @NotNull String orderNum, @Nullable String userId) {
        return new EidStatus(status, orderNum, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EidStatus)) {
            return false;
        }
        EidStatus eidStatus = (EidStatus) other;
        return Intrinsics.areEqual(this.status, eidStatus.status) && Intrinsics.areEqual(this.orderNum, eidStatus.orderNum) && Intrinsics.areEqual(this.userId, eidStatus.userId);
    }

    @NotNull
    public final String getOrderNum() {
        return this.orderNum;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((this.status.hashCode() * 31) + this.orderNum.hashCode()) * 31;
        String str = this.userId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "EidStatus(status=" + this.status + ", orderNum=" + this.orderNum + ", userId=" + ((Object) this.userId) + ')';
    }
}
