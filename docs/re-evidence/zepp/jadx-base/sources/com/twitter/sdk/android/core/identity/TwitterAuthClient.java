package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.services.AccountService;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterAuthClient {
    private static final String e = "android";
    private static final String f = "login";
    private static final String g = "shareemail";
    private static final String h = "";
    private static final String i = "";
    private static final String j = "";
    private static final String k = "impression";
    public final TwitterCore a;
    public final com.twitter.sdk.android.core.identity.a b;
    public final SessionManager<TwitterSession> c;
    public final TwitterAuthConfig d;

    public class a extends Callback<User> {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            this.a.failure(twitterException);
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<User> result) {
            this.a.success(new Result(result.data.email, null));
        }
    }

    public static class b {
        private static final com.twitter.sdk.android.core.identity.a a = new com.twitter.sdk.android.core.identity.a();

        private b() {
        }
    }

    public static class c extends Callback<TwitterSession> {
        private final SessionManager<TwitterSession> a;
        private final Callback<TwitterSession> b;

        public c(SessionManager<TwitterSession> sessionManager, Callback<TwitterSession> callback) {
            this.a = sessionManager;
            this.b = callback;
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            Twitter.getLogger().e("Twitter", "Authorization completed with an error", twitterException);
            this.b.failure(twitterException);
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<TwitterSession> result) {
            Twitter.getLogger().d("Twitter", "Authorization completed successfully");
            this.a.setActiveSession(result.data);
            this.b.success(result);
        }
    }

    public TwitterAuthClient() {
        this(TwitterCore.getInstance(), TwitterCore.getInstance().getAuthConfig(), TwitterCore.getInstance().getSessionManager(), b.a);
    }

    private boolean a(Activity activity, c cVar) {
        Twitter.getLogger().d("Twitter", "Using OAuth");
        com.twitter.sdk.android.core.identity.a aVar = this.b;
        TwitterAuthConfig twitterAuthConfig = this.d;
        return aVar.a(activity, new com.twitter.sdk.android.core.identity.c(twitterAuthConfig, cVar, twitterAuthConfig.getRequestCode()));
    }

    private boolean b(Activity activity, c cVar) {
        if (!f.e(activity)) {
            return false;
        }
        Twitter.getLogger().d("Twitter", "Using SSO");
        com.twitter.sdk.android.core.identity.a aVar = this.b;
        TwitterAuthConfig twitterAuthConfig = this.d;
        return aVar.a(activity, new f(twitterAuthConfig, cVar, twitterAuthConfig.getRequestCode()));
    }

    private void c(Activity activity, Callback<TwitterSession> callback) {
        d();
        c cVar = new c(this.c, callback);
        if (b(activity, cVar) || a(activity, cVar)) {
            return;
        }
        cVar.failure(new TwitterAuthException("Authorize failed."));
    }

    private void d() {
        DefaultScribeClient scribeClient = getScribeClient();
        if (scribeClient == null) {
            return;
        }
        scribeClient.scribe(new EventNamespace.Builder().setClient("android").setPage("login").setSection("").setComponent("").setElement("").setAction("impression").builder());
    }

    private void e() {
        DefaultScribeClient scribeClient = getScribeClient();
        if (scribeClient == null) {
            return;
        }
        scribeClient.scribe(new EventNamespace.Builder().setClient("android").setPage(g).setSection("").setComponent("").setElement("").setAction("impression").builder());
    }

    public void authorize(Activity activity, Callback<TwitterSession> callback) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null.");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback must not be null.");
        }
        if (activity.isFinishing()) {
            Twitter.getLogger().e("Twitter", "Cannot authorize, activity is finishing.", null);
        } else {
            c(activity, callback);
        }
    }

    public void cancelAuthorize() {
        this.b.b();
    }

    public int getRequestCode() {
        return this.d.getRequestCode();
    }

    public DefaultScribeClient getScribeClient() {
        return TwitterCoreScribeClientHolder.getScribeClient();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Twitter.getLogger().d("Twitter", "onActivityResult called with " + i2 + " " + i3);
        if (!this.b.d()) {
            Twitter.getLogger().e("Twitter", "Authorize not in progress", null);
            return;
        }
        AuthHandler authHandlerC = this.b.c();
        if (authHandlerC == null || !authHandlerC.handleOnActivityResult(i2, i3, intent)) {
            return;
        }
        this.b.b();
    }

    public void requestEmail(TwitterSession twitterSession, Callback<String> callback) {
        e();
        AccountService accountService = this.a.getApiClient(twitterSession).getAccountService();
        Boolean bool = Boolean.FALSE;
        accountService.verifyCredentials(bool, bool, Boolean.TRUE).enqueue(new a(callback));
    }

    public TwitterAuthClient(TwitterCore twitterCore, TwitterAuthConfig twitterAuthConfig, SessionManager<TwitterSession> sessionManager, com.twitter.sdk.android.core.identity.a aVar) {
        this.a = twitterCore;
        this.b = aVar;
        this.d = twitterAuthConfig;
        this.c = sessionManager;
    }
}
