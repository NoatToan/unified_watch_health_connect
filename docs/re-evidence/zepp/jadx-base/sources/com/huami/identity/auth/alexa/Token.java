package com.huami.identity.auth.alexa;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/identity/auth/alexa/Token;", "", "", "component1", "component2", "component3", "", "component4", "accessToken", "refreshToken", "tokenType", "intervalExpiryTime", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "b", "getRefreshToken", "c", "getTokenType", GoogleApiAvailabilityLight.a, "J", "getIntervalExpiryTime", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Token {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("refresh_token")
    @Nullable
    private final String refreshToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("token_type")
    @NotNull
    private final String tokenType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("expires_in")
    private final long intervalExpiryTime;

    public Token(@NotNull String str, @Nullable String str2, @NotNull String str3, long j) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.tokenType = str3;
        this.intervalExpiryTime = j;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = token.refreshToken;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = token.tokenType;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = token.intervalExpiryTime;
        }
        return token.copy(str, str4, str5, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getIntervalExpiryTime() {
        return this.intervalExpiryTime;
    }

    @NotNull
    public final Token copy(@NotNull String accessToken, @Nullable String refreshToken, @NotNull String tokenType, long intervalExpiryTime) {
        return new Token(accessToken, refreshToken, tokenType, intervalExpiryTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Token)) {
            return false;
        }
        Token token = (Token) other;
        return Intrinsics.areEqual(this.accessToken, token.accessToken) && Intrinsics.areEqual(this.refreshToken, token.refreshToken) && Intrinsics.areEqual(this.tokenType, token.tokenType) && this.intervalExpiryTime == token.intervalExpiryTime;
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getIntervalExpiryTime() {
        return this.intervalExpiryTime;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        String str = this.refreshToken;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.tokenType.hashCode()) * 31) + b.a(this.intervalExpiryTime);
    }

    @NotNull
    public String toString() {
        return "Token(accessToken=" + this.accessToken + ", refreshToken=" + ((Object) this.refreshToken) + ", tokenType=" + this.tokenType + ", intervalExpiryTime=" + this.intervalExpiryTime + ')';
    }
}
