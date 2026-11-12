package com.xiaomi.fitness.aivs.request.model;

import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/UserCredentialsIssuedTokenResp;", "", "error", "", XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, "", XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2, "", "refresh_token", "scope", XiaomiOAuthConstants.EXTRA_MAC_KEY_2, "openId", XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2, "<init>", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()I", "getError_description", "()Ljava/lang/String;", "getAccess_token", "getExpires_in", "()J", "getRefresh_token", "getScope", "getMac_key", "getOpenId", "getMac_algorithm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCredentialsIssuedTokenResp {

    @NotNull
    private final String access_token;
    private final int error;

    @NotNull
    private final String error_description;
    private final long expires_in;

    @NotNull
    private final String mac_algorithm;

    @NotNull
    private final String mac_key;

    @NotNull
    private final String openId;

    @NotNull
    private final String refresh_token;

    @NotNull
    private final String scope;

    public UserCredentialsIssuedTokenResp(int i, @NotNull String error_description, @NotNull String access_token, long j, @NotNull String refresh_token, @NotNull String scope, @NotNull String mac_key, @NotNull String openId, @NotNull String mac_algorithm) {
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(refresh_token, "refresh_token");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mac_key, "mac_key");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(mac_algorithm, "mac_algorithm");
        this.error = i;
        this.error_description = error_description;
        this.access_token = access_token;
        this.expires_in = j;
        this.refresh_token = refresh_token;
        this.scope = scope;
        this.mac_key = mac_key;
        this.openId = openId;
        this.mac_algorithm = mac_algorithm;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getError() {
        return this.error;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_description() {
        return this.error_description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccess_token() {
        return this.access_token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getExpires_in() {
        return this.expires_in;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMac_key() {
        return this.mac_key;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOpenId() {
        return this.openId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMac_algorithm() {
        return this.mac_algorithm;
    }

    @NotNull
    public final UserCredentialsIssuedTokenResp copy(int error, @NotNull String error_description, @NotNull String access_token, long expires_in, @NotNull String refresh_token, @NotNull String scope, @NotNull String mac_key, @NotNull String openId, @NotNull String mac_algorithm) {
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(refresh_token, "refresh_token");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mac_key, "mac_key");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(mac_algorithm, "mac_algorithm");
        return new UserCredentialsIssuedTokenResp(error, error_description, access_token, expires_in, refresh_token, scope, mac_key, openId, mac_algorithm);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCredentialsIssuedTokenResp)) {
            return false;
        }
        UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp = (UserCredentialsIssuedTokenResp) other;
        return this.error == userCredentialsIssuedTokenResp.error && Intrinsics.areEqual(this.error_description, userCredentialsIssuedTokenResp.error_description) && Intrinsics.areEqual(this.access_token, userCredentialsIssuedTokenResp.access_token) && this.expires_in == userCredentialsIssuedTokenResp.expires_in && Intrinsics.areEqual(this.refresh_token, userCredentialsIssuedTokenResp.refresh_token) && Intrinsics.areEqual(this.scope, userCredentialsIssuedTokenResp.scope) && Intrinsics.areEqual(this.mac_key, userCredentialsIssuedTokenResp.mac_key) && Intrinsics.areEqual(this.openId, userCredentialsIssuedTokenResp.openId) && Intrinsics.areEqual(this.mac_algorithm, userCredentialsIssuedTokenResp.mac_algorithm);
    }

    @NotNull
    public final String getAccess_token() {
        return this.access_token;
    }

    public final int getError() {
        return this.error;
    }

    @NotNull
    public final String getError_description() {
        return this.error_description;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    @NotNull
    public final String getMac_algorithm() {
        return this.mac_algorithm;
    }

    @NotNull
    public final String getMac_key() {
        return this.mac_key;
    }

    @NotNull
    public final String getOpenId() {
        return this.openId;
    }

    @NotNull
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    @NotNull
    public final String getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.error) * 31) + this.error_description.hashCode()) * 31) + this.access_token.hashCode()) * 31) + Long.hashCode(this.expires_in)) * 31) + this.refresh_token.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.mac_key.hashCode()) * 31) + this.openId.hashCode()) * 31) + this.mac_algorithm.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserCredentialsIssuedTokenResp(error=" + this.error + ", error_description=" + this.error_description + ", access_token=" + this.access_token + ", expires_in=" + this.expires_in + ", refresh_token=" + this.refresh_token + ", scope=" + this.scope + ", mac_key=" + this.mac_key + ", openId=" + this.openId + ", mac_algorithm=" + this.mac_algorithm + ")";
    }
}
