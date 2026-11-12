package com.huami.ai.speech.api.auth;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/ai/speech/api/auth/TokenInfo;", "", "", "component1", "component2", "", "component3", "component4", "accessToken", "refreshToken", "tokenStartTime", "intervalExpiryTime", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "b", "getRefreshToken", "c", "J", "getTokenStartTime", "()J", GoogleApiAvailabilityLight.a, "getIntervalExpiryTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "speech-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TokenInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String refreshToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long tokenStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long intervalExpiryTime;

    public TokenInfo(@NotNull String str, @Nullable String str2, long j, long j2) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.tokenStartTime = j;
        this.intervalExpiryTime = j2;
    }

    public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenInfo.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = tokenInfo.refreshToken;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = tokenInfo.tokenStartTime;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = tokenInfo.intervalExpiryTime;
        }
        return tokenInfo.copy(str, str3, j3, j2);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTokenStartTime() {
        return this.tokenStartTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getIntervalExpiryTime() {
        return this.intervalExpiryTime;
    }

    @NotNull
    public final TokenInfo copy(@NotNull String accessToken, @Nullable String refreshToken, long tokenStartTime, long intervalExpiryTime) {
        return new TokenInfo(accessToken, refreshToken, tokenStartTime, intervalExpiryTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return Intrinsics.areEqual(this.accessToken, tokenInfo.accessToken) && Intrinsics.areEqual(this.refreshToken, tokenInfo.refreshToken) && this.tokenStartTime == tokenInfo.tokenStartTime && this.intervalExpiryTime == tokenInfo.intervalExpiryTime;
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

    public final long getTokenStartTime() {
        return this.tokenStartTime;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        String str = this.refreshToken;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + b.a(this.tokenStartTime)) * 31) + b.a(this.intervalExpiryTime);
    }

    @NotNull
    public String toString() {
        return "TokenInfo(accessToken=" + this.accessToken + ", refreshToken=" + ((Object) this.refreshToken) + ", tokenStartTime=" + this.tokenStartTime + ", intervalExpiryTime=" + this.intervalExpiryTime + ')';
    }
}
