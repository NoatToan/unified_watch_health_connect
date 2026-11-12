package com.xiaomi.fitness.health.ecg.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/net/GetAccessTokenRequestParams;", "", q.f13858b, "", "<init>", "(Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAccessTokenRequestParams {

    @SerializedName(g.d)
    @NotNull
    private final String appId;

    public GetAccessTokenRequestParams(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.appId = appId;
    }

    public static /* synthetic */ GetAccessTokenRequestParams copy$default(GetAccessTokenRequestParams getAccessTokenRequestParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccessTokenRequestParams.appId;
        }
        return getAccessTokenRequestParams.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final GetAccessTokenRequestParams copy(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new GetAccessTokenRequestParams(appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetAccessTokenRequestParams) && Intrinsics.areEqual(this.appId, ((GetAccessTokenRequestParams) other).appId);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    public int hashCode() {
        return this.appId.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetAccessTokenRequestParams(appId=" + this.appId + ")";
    }
}
