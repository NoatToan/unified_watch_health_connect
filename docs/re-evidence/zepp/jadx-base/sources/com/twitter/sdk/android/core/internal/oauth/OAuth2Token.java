package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.AuthToken;

/* JADX INFO: loaded from: classes18.dex */
public class OAuth2Token extends AuthToken implements Parcelable {
    public static final Parcelable.Creator<OAuth2Token> CREATOR = new a();
    public static final String TOKEN_TYPE_BEARER = "bearer";

    @SerializedName("token_type")
    private final String a;

    @SerializedName("access_token")
    private final String b;

    public static class a implements Parcelable.Creator<OAuth2Token> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OAuth2Token createFromParcel(Parcel parcel) {
            return new OAuth2Token(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OAuth2Token[] newArray(int i) {
            return new OAuth2Token[i];
        }
    }

    public /* synthetic */ OAuth2Token(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        String str = this.b;
        if (str == null ? oAuth2Token.b != null : !str.equals(oAuth2Token.b)) {
            return false;
        }
        String str2 = this.a;
        String str3 = oAuth2Token.a;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public String getAccessToken() {
        return this.b;
    }

    public String getTokenType() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.twitter.sdk.android.core.AuthToken
    public boolean isExpired() {
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public OAuth2Token(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public OAuth2Token(String str, String str2, long j) {
        super(j);
        this.a = str;
        this.b = str2;
    }

    private OAuth2Token(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
