package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.GuestSession;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.io.IOException;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes18.dex */
public class GuestAuthenticator implements Authenticator {
    public static final int b = 2;
    public final GuestSessionProvider a;

    public GuestAuthenticator(GuestSessionProvider guestSessionProvider) {
        this.a = guestSessionProvider;
    }

    public boolean a(Response response) {
        int i = 1;
        while (true) {
            response = response.priorResponse();
            if (response == null) {
                break;
            }
            i++;
        }
        return i < 2;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        return c(response);
    }

    public GuestSession b(Response response) {
        Headers headers = response.request().headers();
        String str = headers.get("Authorization");
        String str2 = headers.get("x-guest-token");
        if (str == null || str2 == null) {
            return null;
        }
        return new GuestSession(new GuestAuthToken(OAuth2Token.TOKEN_TYPE_BEARER, str.replace("bearer ", ""), str2));
    }

    public Request c(Response response) {
        if (a(response)) {
            GuestSession guestSessionRefreshCurrentSession = this.a.refreshCurrentSession(b(response));
            GuestAuthToken authToken = guestSessionRefreshCurrentSession == null ? null : guestSessionRefreshCurrentSession.getAuthToken();
            if (authToken != null) {
                return d(response.request(), authToken);
            }
        }
        return null;
    }

    public Request d(Request request, GuestAuthToken guestAuthToken) {
        Request.Builder builderNewBuilder = request.newBuilder();
        GuestAuthInterceptor.a(builderNewBuilder, guestAuthToken);
        return builderNewBuilder.build();
    }
}
