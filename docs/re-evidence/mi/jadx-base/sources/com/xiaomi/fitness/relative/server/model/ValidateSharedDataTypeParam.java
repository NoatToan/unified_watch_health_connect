package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.active.pk.PkConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/ValidateSharedDataTypeParam;", "", "relativeId", "", PkConstants.PARAM_INVITE_ID, "<init>", "(JJ)V", "getRelativeId", "()J", "getInviteId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidateSharedDataTypeParam {

    @SerializedName("invite_id")
    private final long inviteId;

    @SerializedName("relative_uid")
    private final long relativeId;

    public ValidateSharedDataTypeParam(long j, long j2) {
        this.relativeId = j;
        this.inviteId = j2;
    }

    public static /* synthetic */ ValidateSharedDataTypeParam copy$default(ValidateSharedDataTypeParam validateSharedDataTypeParam, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = validateSharedDataTypeParam.relativeId;
        }
        if ((i & 2) != 0) {
            j2 = validateSharedDataTypeParam.inviteId;
        }
        return validateSharedDataTypeParam.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInviteId() {
        return this.inviteId;
    }

    @NotNull
    public final ValidateSharedDataTypeParam copy(long relativeId, long inviteId) {
        return new ValidateSharedDataTypeParam(relativeId, inviteId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateSharedDataTypeParam)) {
            return false;
        }
        ValidateSharedDataTypeParam validateSharedDataTypeParam = (ValidateSharedDataTypeParam) other;
        return this.relativeId == validateSharedDataTypeParam.relativeId && this.inviteId == validateSharedDataTypeParam.inviteId;
    }

    public final long getInviteId() {
        return this.inviteId;
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    public int hashCode() {
        return (Long.hashCode(this.relativeId) * 31) + Long.hashCode(this.inviteId);
    }

    @NotNull
    public String toString() {
        return "ValidateSharedDataTypeParam(relativeId=" + this.relativeId + ", inviteId=" + this.inviteId + ")";
    }
}
