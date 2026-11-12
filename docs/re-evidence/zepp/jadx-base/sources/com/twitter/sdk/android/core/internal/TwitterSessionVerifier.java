package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterSessionVerifier implements SessionVerifier<TwitterSession> {
    public static final String c = "android";
    public static final String d = "credentials";
    public static final String e = "";
    public static final String f = "";
    public static final String g = "";
    public static final String h = "impression";
    private final AccountServiceProvider a;
    private final DefaultScribeClient b;

    public static class AccountServiceProvider {
        public AccountService getAccountService(TwitterSession twitterSession) {
            return new TwitterApiClient(twitterSession).getAccountService();
        }
    }

    public TwitterSessionVerifier() {
        this.a = new AccountServiceProvider();
        this.b = TwitterCoreScribeClientHolder.getScribeClient();
    }

    private void a() {
        if (this.b == null) {
            return;
        }
        this.b.scribe(new EventNamespace.Builder().setClient("android").setPage(d).setSection("").setComponent("").setElement("").setAction("impression").builder());
    }

    @Override // com.twitter.sdk.android.core.internal.SessionVerifier
    public void verifySession(TwitterSession twitterSession) {
        AccountService accountService = this.a.getAccountService(twitterSession);
        try {
            a();
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            accountService.verifyCredentials(bool, bool2, bool2).execute();
        } catch (IOException | RuntimeException unused) {
        }
    }

    public TwitterSessionVerifier(AccountServiceProvider accountServiceProvider, DefaultScribeClient defaultScribeClient) {
        this.a = accountServiceProvider;
        this.b = defaultScribeClient;
    }
}
