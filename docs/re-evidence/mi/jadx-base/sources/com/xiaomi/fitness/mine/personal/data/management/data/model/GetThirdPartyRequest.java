package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyRequest;", "", "thirdPartyType", "", q.f13858b, "", "<init>", "(IJ)V", "getThirdPartyType", "()I", "getAppId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetThirdPartyRequest {

    @SerializedName(g.d)
    private final long appId;

    @SerializedName(PersonalDataManagementExtKt.PARAM_THIRD_PARTY_TYPE)
    private final int thirdPartyType;

    public GetThirdPartyRequest(int i, long j) {
        this.thirdPartyType = i;
        this.appId = j;
    }

    public static /* synthetic */ GetThirdPartyRequest copy$default(GetThirdPartyRequest getThirdPartyRequest, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getThirdPartyRequest.thirdPartyType;
        }
        if ((i2 & 2) != 0) {
            j = getThirdPartyRequest.appId;
        }
        return getThirdPartyRequest.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getThirdPartyType() {
        return this.thirdPartyType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final GetThirdPartyRequest copy(int thirdPartyType, long appId) {
        return new GetThirdPartyRequest(thirdPartyType, appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetThirdPartyRequest)) {
            return false;
        }
        GetThirdPartyRequest getThirdPartyRequest = (GetThirdPartyRequest) other;
        return this.thirdPartyType == getThirdPartyRequest.thirdPartyType && this.appId == getThirdPartyRequest.appId;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final int getThirdPartyType() {
        return this.thirdPartyType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.thirdPartyType) * 31) + Long.hashCode(this.appId);
    }

    @NotNull
    public String toString() {
        return "GetThirdPartyRequest(thirdPartyType=" + this.thirdPartyType + ", appId=" + this.appId + ")";
    }
}
