package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.active.pk.PkConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/CreateInviteRecordResult;", "", PkConstants.PARAM_INVITE_ID, "", "code", "", "<init>", "(JI)V", "getInviteId", "()J", "getCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreateInviteRecordResult {

    @SerializedName("code")
    private final int code;

    @SerializedName("invite_id")
    private final long inviteId;

    public CreateInviteRecordResult(long j, int i) {
        this.inviteId = j;
        this.code = i;
    }

    public static /* synthetic */ CreateInviteRecordResult copy$default(CreateInviteRecordResult createInviteRecordResult, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = createInviteRecordResult.inviteId;
        }
        if ((i2 & 2) != 0) {
            i = createInviteRecordResult.code;
        }
        return createInviteRecordResult.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getInviteId() {
        return this.inviteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final CreateInviteRecordResult copy(long inviteId, int code) {
        return new CreateInviteRecordResult(inviteId, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateInviteRecordResult)) {
            return false;
        }
        CreateInviteRecordResult createInviteRecordResult = (CreateInviteRecordResult) other;
        return this.inviteId == createInviteRecordResult.inviteId && this.code == createInviteRecordResult.code;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getInviteId() {
        return this.inviteId;
    }

    public int hashCode() {
        return (Long.hashCode(this.inviteId) * 31) + Integer.hashCode(this.code);
    }

    @NotNull
    public String toString() {
        return "CreateInviteRecordResult(inviteId=" + this.inviteId + ", code=" + this.code + ")";
    }
}
