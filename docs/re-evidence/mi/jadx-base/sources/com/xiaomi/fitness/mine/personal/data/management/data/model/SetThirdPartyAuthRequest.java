package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthRequest;", "", "thirdPartyType", "", q.f13858b, "", "status", "<init>", "(IJI)V", "getThirdPartyType", "()I", "getAppId", "()J", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetThirdPartyAuthRequest {

    @SerializedName("project_id")
    private final long appId;

    @SerializedName("status")
    private final int status;

    @SerializedName(PersonalDataManagementExtKt.PARAM_THIRD_PARTY_TYPE)
    private final int thirdPartyType;

    public SetThirdPartyAuthRequest(int i, long j, int i2) {
        this.thirdPartyType = i;
        this.appId = j;
        this.status = i2;
    }

    public static /* synthetic */ SetThirdPartyAuthRequest copy$default(SetThirdPartyAuthRequest setThirdPartyAuthRequest, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = setThirdPartyAuthRequest.thirdPartyType;
        }
        if ((i3 & 2) != 0) {
            j = setThirdPartyAuthRequest.appId;
        }
        if ((i3 & 4) != 0) {
            i2 = setThirdPartyAuthRequest.status;
        }
        return setThirdPartyAuthRequest.copy(i, j, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getThirdPartyType() {
        return this.thirdPartyType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final SetThirdPartyAuthRequest copy(int thirdPartyType, long appId, int status) {
        return new SetThirdPartyAuthRequest(thirdPartyType, appId, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetThirdPartyAuthRequest)) {
            return false;
        }
        SetThirdPartyAuthRequest setThirdPartyAuthRequest = (SetThirdPartyAuthRequest) other;
        return this.thirdPartyType == setThirdPartyAuthRequest.thirdPartyType && this.appId == setThirdPartyAuthRequest.appId && this.status == setThirdPartyAuthRequest.status;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getThirdPartyType() {
        return this.thirdPartyType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.thirdPartyType) * 31) + Long.hashCode(this.appId)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "SetThirdPartyAuthRequest(thirdPartyType=" + this.thirdPartyType + ", appId=" + this.appId + ", status=" + this.status + ")";
    }
}
