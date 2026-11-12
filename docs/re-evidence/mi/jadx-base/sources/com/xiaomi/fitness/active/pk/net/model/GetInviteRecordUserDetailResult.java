package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/GetInviteRecordUserDetailResult;", "", "inviteRecordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "code", "", "<init>", "(Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;I)V", "getInviteRecordDetail", "()Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "getCode", "()I", "setCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetInviteRecordUserDetailResult {

    @SerializedName("code")
    private int code;

    @SerializedName("invite_record_detail")
    @Nullable
    private final InviteRecordDetail inviteRecordDetail;

    public GetInviteRecordUserDetailResult(@Nullable InviteRecordDetail inviteRecordDetail, int i) {
        this.inviteRecordDetail = inviteRecordDetail;
        this.code = i;
    }

    public static /* synthetic */ GetInviteRecordUserDetailResult copy$default(GetInviteRecordUserDetailResult getInviteRecordUserDetailResult, InviteRecordDetail inviteRecordDetail, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            inviteRecordDetail = getInviteRecordUserDetailResult.inviteRecordDetail;
        }
        if ((i2 & 2) != 0) {
            i = getInviteRecordUserDetailResult.code;
        }
        return getInviteRecordUserDetailResult.copy(inviteRecordDetail, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InviteRecordDetail getInviteRecordDetail() {
        return this.inviteRecordDetail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final GetInviteRecordUserDetailResult copy(@Nullable InviteRecordDetail inviteRecordDetail, int code) {
        return new GetInviteRecordUserDetailResult(inviteRecordDetail, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInviteRecordUserDetailResult)) {
            return false;
        }
        GetInviteRecordUserDetailResult getInviteRecordUserDetailResult = (GetInviteRecordUserDetailResult) other;
        return Intrinsics.areEqual(this.inviteRecordDetail, getInviteRecordUserDetailResult.inviteRecordDetail) && this.code == getInviteRecordUserDetailResult.code;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final InviteRecordDetail getInviteRecordDetail() {
        return this.inviteRecordDetail;
    }

    public int hashCode() {
        InviteRecordDetail inviteRecordDetail = this.inviteRecordDetail;
        return ((inviteRecordDetail == null ? 0 : inviteRecordDetail.hashCode()) * 31) + Integer.hashCode(this.code);
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @NotNull
    public String toString() {
        return "GetInviteRecordUserDetailResult(inviteRecordDetail=" + this.inviteRecordDetail + ", code=" + this.code + ")";
    }
}
