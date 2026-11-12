package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public class GuestAuthToken extends OAuth2Token {
    public static final String HEADER_GUEST_TOKEN = "x-guest-token";
    private static final long d = 10800000;

    @SerializedName("guest_token")
    private final String c;

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.c = str3;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.c;
        String str2 = ((GuestAuthToken) obj).c;
        return str == null ? str2 == null : str.equals(str2);
    }

    public String getGuestToken() {
        return this.c;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token, com.twitter.sdk.android.core.AuthToken
    public boolean isExpired() {
        return System.currentTimeMillis() >= this.createdAt + d;
    }

    public GuestAuthToken(String str, String str2, String str3, long j) {
        super(str, str2, j);
        this.c = str3;
    }
}
