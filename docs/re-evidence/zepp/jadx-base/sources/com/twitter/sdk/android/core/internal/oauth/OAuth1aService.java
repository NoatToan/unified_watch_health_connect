package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes18.dex */
public class OAuth1aService extends c {
    private static final String g = "oauth";
    private static final String h = "twittersdk://callback";
    private static final String i = "screen_name";
    private static final String j = "user_id";
    public OAuthApi f;

    public interface OAuthApi {
        @POST("/oauth/access_token")
        Call<ResponseBody> getAccessToken(@Header("Authorization") String str, @Query(OAuthConstants.PARAM_VERIFIER) String str2);

        @POST("/oauth/request_token")
        Call<ResponseBody> getTempToken(@Header("Authorization") String str);
    }

    public class a extends Callback<ResponseBody> {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            this.a.failure(twitterException);
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<ResponseBody> result) throws Throwable {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(result.data.byteStream()));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    String string = sb.toString();
                    OAuthResponse authResponse = OAuth1aService.parseAuthResponse(string);
                    if (authResponse != null) {
                        this.a.success(new Result(authResponse, null));
                        return;
                    }
                    this.a.failure(new TwitterAuthException("Failed to parse auth response: " + string));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e) {
                this.a.failure(new TwitterAuthException(e.getMessage(), e));
            }
        }
    }

    public OAuth1aService(TwitterCore twitterCore, TwitterApi twitterApi) {
        super(twitterCore, twitterApi);
        this.f = (OAuthApi) getRetrofit().create(OAuthApi.class);
    }

    public static OAuthResponse parseAuthResponse(String str) {
        TreeMap<String, String> queryParams = UrlUtils.getQueryParams(str, false);
        String str2 = queryParams.get(OAuthConstants.PARAM_TOKEN);
        String str3 = queryParams.get(OAuthConstants.PARAM_TOKEN_SECRET);
        String str4 = queryParams.get("screen_name");
        long j2 = queryParams.containsKey("user_id") ? Long.parseLong(queryParams.get("user_id")) : 0L;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), str4, j2);
    }

    public String a() {
        return getApi().getBaseHostUrl() + "/oauth/access_token";
    }

    public Callback<ResponseBody> b(Callback<OAuthResponse> callback) {
        return new a(callback);
    }

    public String buildCallbackUrl(TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse(h).buildUpon().appendQueryParameter("version", getTwitterCore().getVersion()).appendQueryParameter("app", twitterAuthConfig.getConsumerKey()).build().toString();
    }

    public String c() {
        return getApi().getBaseHostUrl() + "/oauth/request_token";
    }

    public String getAuthorizeUrl(TwitterAuthToken twitterAuthToken) {
        return getApi().buildUponBaseHostUrl("oauth", "authorize").appendQueryParameter(OAuthConstants.PARAM_TOKEN, twitterAuthToken.token).build().toString();
    }

    public void requestAccessToken(Callback<OAuthResponse> callback, TwitterAuthToken twitterAuthToken, String str) {
        this.f.getAccessToken(new OAuth1aHeaders().getAuthorizationHeader(getTwitterCore().getAuthConfig(), twitterAuthToken, null, "POST", a(), null), str).enqueue(b(callback));
    }

    public void requestTempToken(Callback<OAuthResponse> callback) {
        TwitterAuthConfig authConfig = getTwitterCore().getAuthConfig();
        this.f.getTempToken(new OAuth1aHeaders().getAuthorizationHeader(authConfig, null, buildCallbackUrl(authConfig), "POST", c(), null)).enqueue(b(callback));
    }
}
