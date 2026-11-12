package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.GuestSession;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class GuestAuthInterceptor implements Interceptor {
    public final GuestSessionProvider a;

    public GuestAuthInterceptor(GuestSessionProvider guestSessionProvider) {
        this.a = guestSessionProvider;
    }

    public static void a(Request.Builder builder, GuestAuthToken guestAuthToken) {
        builder.header("Authorization", guestAuthToken.getTokenType() + " " + guestAuthToken.getAccessToken());
        builder.header("x-guest-token", guestAuthToken.getGuestToken());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        GuestSession currentSession = this.a.getCurrentSession();
        GuestAuthToken authToken = currentSession == null ? null : currentSession.getAuthToken();
        if (authToken == null) {
            return chain.proceed(request);
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        a(builderNewBuilder, authToken);
        return chain.proceed(builderNewBuilder.build());
    }
}
