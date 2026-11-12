package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/GetUserInfoByUidParam;", "", "verifyId", "", "verifyType", "<init>", "(JJ)V", "getVerifyId", "()J", "getVerifyType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetUserInfoByUidParam {

    @SerializedName("verify_id")
    private final long verifyId;

    @SerializedName("verify_type")
    private final long verifyType;

    public GetUserInfoByUidParam(long j, long j2) {
        this.verifyId = j;
        this.verifyType = j2;
    }

    public static /* synthetic */ GetUserInfoByUidParam copy$default(GetUserInfoByUidParam getUserInfoByUidParam, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getUserInfoByUidParam.verifyId;
        }
        if ((i & 2) != 0) {
            j2 = getUserInfoByUidParam.verifyType;
        }
        return getUserInfoByUidParam.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVerifyId() {
        return this.verifyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getVerifyType() {
        return this.verifyType;
    }

    @NotNull
    public final GetUserInfoByUidParam copy(long verifyId, long verifyType) {
        return new GetUserInfoByUidParam(verifyId, verifyType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserInfoByUidParam)) {
            return false;
        }
        GetUserInfoByUidParam getUserInfoByUidParam = (GetUserInfoByUidParam) other;
        return this.verifyId == getUserInfoByUidParam.verifyId && this.verifyType == getUserInfoByUidParam.verifyType;
    }

    public final long getVerifyId() {
        return this.verifyId;
    }

    public final long getVerifyType() {
        return this.verifyType;
    }

    public int hashCode() {
        return (Long.hashCode(this.verifyId) * 31) + Long.hashCode(this.verifyType);
    }

    @NotNull
    public String toString() {
        return "GetUserInfoByUidParam(verifyId=" + this.verifyId + ", verifyType=" + this.verifyType + ")";
    }
}
