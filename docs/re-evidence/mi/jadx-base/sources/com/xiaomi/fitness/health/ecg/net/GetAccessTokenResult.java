package com.xiaomi.fitness.health.ecg.net;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.account.OAuthAccountManager;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/net/GetAccessTokenResult;", "", q.f13858b, "", "openId", OAuthAccountManager.MiOAuthConstant.TOKEN, "errorCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAppId", "()Ljava/lang/String;", "getOpenId", "getAccessToken", "getErrorCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAccessTokenResult {

    @SerializedName(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2)
    @Nullable
    private final String accessToken;

    @SerializedName(g.d)
    @Nullable
    private final String appId;
    private final int errorCode;

    @SerializedName("open_id")
    @Nullable
    private final String openId;

    public GetAccessTokenResult() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ GetAccessTokenResult copy$default(GetAccessTokenResult getAccessTokenResult, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getAccessTokenResult.appId;
        }
        if ((i2 & 2) != 0) {
            str2 = getAccessTokenResult.openId;
        }
        if ((i2 & 4) != 0) {
            str3 = getAccessTokenResult.accessToken;
        }
        if ((i2 & 8) != 0) {
            i = getAccessTokenResult.errorCode;
        }
        return getAccessTokenResult.copy(str, str2, str3, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOpenId() {
        return this.openId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final GetAccessTokenResult copy(@Nullable String appId, @Nullable String openId, @Nullable String accessToken, int errorCode) {
        return new GetAccessTokenResult(appId, openId, accessToken, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAccessTokenResult)) {
            return false;
        }
        GetAccessTokenResult getAccessTokenResult = (GetAccessTokenResult) other;
        return Intrinsics.areEqual(this.appId, getAccessTokenResult.appId) && Intrinsics.areEqual(this.openId, getAccessTokenResult.openId) && Intrinsics.areEqual(this.accessToken, getAccessTokenResult.accessToken) && this.errorCode == getAccessTokenResult.errorCode;
    }

    @Nullable
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getOpenId() {
        return this.openId;
    }

    public int hashCode() {
        String str = this.appId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.errorCode);
    }

    @NotNull
    public String toString() {
        return "GetAccessTokenResult(appId=" + this.appId + ", openId=" + this.openId + ", accessToken=" + this.accessToken + ", errorCode=" + this.errorCode + ")";
    }

    public GetAccessTokenResult(@Nullable String str, @Nullable String str2, @Nullable String str3, int i) {
        this.appId = str;
        this.openId = str2;
        this.accessToken = str3;
        this.errorCode = i;
    }

    public /* synthetic */ GetAccessTokenResult(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
