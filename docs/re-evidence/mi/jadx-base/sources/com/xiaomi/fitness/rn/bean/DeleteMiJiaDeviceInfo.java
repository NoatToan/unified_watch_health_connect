package com.xiaomi.fitness.rn.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/DeleteMiJiaDeviceInfo;", "", "did", "", "pid", "", "ownerUid", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "getDid", "()Ljava/lang/String;", "getPid", "()I", "getOwnerUid", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lcom/xiaomi/fitness/rn/bean/DeleteMiJiaDeviceInfo;", "equals", "", "other", "hashCode", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteMiJiaDeviceInfo {

    @SerializedName("did")
    @NotNull
    private final String did;

    @SerializedName("ownerUid")
    @Nullable
    private final Long ownerUid;

    @SerializedName("pid")
    private final int pid;

    public DeleteMiJiaDeviceInfo(@NotNull String did, int i, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
        this.pid = i;
        this.ownerUid = l;
    }

    public static /* synthetic */ DeleteMiJiaDeviceInfo copy$default(DeleteMiJiaDeviceInfo deleteMiJiaDeviceInfo, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deleteMiJiaDeviceInfo.did;
        }
        if ((i2 & 2) != 0) {
            i = deleteMiJiaDeviceInfo.pid;
        }
        if ((i2 & 4) != 0) {
            l = deleteMiJiaDeviceInfo.ownerUid;
        }
        return deleteMiJiaDeviceInfo.copy(str, i, l);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getOwnerUid() {
        return this.ownerUid;
    }

    @NotNull
    public final DeleteMiJiaDeviceInfo copy(@NotNull String did, int pid, @Nullable Long ownerUid) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new DeleteMiJiaDeviceInfo(did, pid, ownerUid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteMiJiaDeviceInfo)) {
            return false;
        }
        DeleteMiJiaDeviceInfo deleteMiJiaDeviceInfo = (DeleteMiJiaDeviceInfo) other;
        return Intrinsics.areEqual(this.did, deleteMiJiaDeviceInfo.did) && this.pid == deleteMiJiaDeviceInfo.pid && Intrinsics.areEqual(this.ownerUid, deleteMiJiaDeviceInfo.ownerUid);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final Long getOwnerUid() {
        return this.ownerUid;
    }

    public final int getPid() {
        return this.pid;
    }

    public int hashCode() {
        int iHashCode = ((this.did.hashCode() * 31) + Integer.hashCode(this.pid)) * 31;
        Long l = this.ownerUid;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeleteMiJiaDeviceInfo(did=" + this.did + ", pid=" + this.pid + ", ownerUid=" + this.ownerUid + ")";
    }

    public /* synthetic */ DeleteMiJiaDeviceInfo(String str, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : l);
    }
}
