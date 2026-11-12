package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import okio.ByteString;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes18.dex */
public class OAuth2Service extends c {
    public OAuth2Api f;

    public interface OAuth2Api {
        @FormUrlEncoded
        @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @POST("/oauth2/token")
        Call<OAuth2Token> getAppAuthToken(@Header("Authorization") String str, @Field("grant_type") String str2);

        @POST("/1.1/guest/activate.json")
        Call<com.twitter.sdk.android.core.internal.oauth.a> getGuestToken(@Header("Authorization") String str);
    }

    public class a extends Callback<OAuth2Token> {
        public final /* synthetic */ Callback a;

        /* JADX INFO: renamed from: com.twitter.sdk.android.core.internal.oauth.OAuth2Service$a$a, reason: collision with other inner class name */
        public class C0761a extends Callback<com.twitter.sdk.android.core.internal.oauth.a> {
            public final /* synthetic */ OAuth2Token a;

            public C0761a(OAuth2Token oAuth2Token) {
                this.a = oAuth2Token;
            }

            @Override // com.twitter.sdk.android.core.Callback
            public void failure(TwitterException twitterException) {
                Twitter.getLogger().e("Twitter", "Your app may not allow guest auth. Please talk to us regarding upgrading your consumer key.", twitterException);
                a.this.a.failure(twitterException);
            }

            @Override // com.twitter.sdk.android.core.Callback
            public void success(Result<com.twitter.sdk.android.core.internal.oauth.a> result) {
                a.this.a.success(new Result(new GuestAuthToken(this.a.getTokenType(), this.a.getAccessToken(), result.data.a), null));
            }
        }

        public a(Callback callback) {
            this.a = callback;
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            Twitter.getLogger().e("Twitter", "Failed to get app auth token", twitterException);
            Callback callback = this.a;
            if (callback != null) {
                callback.failure(twitterException);
            }
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<OAuth2Token> result) {
            OAuth2Token oAuth2Token = result.data;
            OAuth2Service.this.d(new C0761a(oAuth2Token), oAuth2Token);
        }
    }

    public OAuth2Service(TwitterCore twitterCore, TwitterApi twitterApi) {
        super(twitterCore, twitterApi);
        this.f = (OAuth2Api) getRetrofit().create(OAuth2Api.class);
    }

    private String a() {
        TwitterAuthConfig authConfig = getTwitterCore().getAuthConfig();
        return "Basic " + ByteString.encodeUtf8(UrlUtils.percentEncode(authConfig.getConsumerKey()) + ":" + UrlUtils.percentEncode(authConfig.getConsumerSecret())).base64();
    }

    private String b(OAuth2Token oAuth2Token) {
        return "Bearer " + oAuth2Token.getAccessToken();
    }

    public void c(Callback<OAuth2Token> callback) {
        this.f.getAppAuthToken(a(), OAuthConstants.GRANT_TYPE_CLIENT_CREDENTIALS).enqueue(callback);
    }

    public void d(Callback<com.twitter.sdk.android.core.internal.oauth.a> callback, OAuth2Token oAuth2Token) {
        this.f.getGuestToken(b(oAuth2Token)).enqueue(callback);
    }

    public void requestGuestAuthToken(Callback<GuestAuthToken> callback) {
        c(new a(callback));
    }
}
