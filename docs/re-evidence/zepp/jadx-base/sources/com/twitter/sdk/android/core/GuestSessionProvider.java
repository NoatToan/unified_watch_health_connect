package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes18.dex */
public class GuestSessionProvider {
    private final OAuth2Service a;
    private final SessionManager<GuestSession> b;

    public class a extends Callback<GuestAuthToken> {
        public final /* synthetic */ CountDownLatch a;

        public a(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void failure(TwitterException twitterException) {
            GuestSessionProvider.this.b.clearSession(0L);
            this.a.countDown();
        }

        @Override // com.twitter.sdk.android.core.Callback
        public void success(Result<GuestAuthToken> result) {
            GuestSessionProvider.this.b.setActiveSession(new GuestSession(result.data));
            this.a.countDown();
        }
    }

    public GuestSessionProvider(OAuth2Service oAuth2Service, SessionManager<GuestSession> sessionManager) {
        this.a = oAuth2Service;
        this.b = sessionManager;
    }

    public boolean b(GuestSession guestSession) {
        return (guestSession == null || guestSession.getAuthToken() == null || guestSession.getAuthToken().isExpired()) ? false : true;
    }

    public void c() {
        Twitter.getLogger().d("GuestSessionProvider", "Refreshing expired guest session.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.requestGuestAuthToken(new a(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            this.b.clearSession(0L);
        }
    }

    public synchronized GuestSession getCurrentSession() {
        GuestSession guestSession = (GuestSession) this.b.getActiveSession();
        if (b(guestSession)) {
            return guestSession;
        }
        c();
        return (GuestSession) this.b.getActiveSession();
    }

    public synchronized GuestSession refreshCurrentSession(GuestSession guestSession) {
        GuestSession guestSession2 = (GuestSession) this.b.getActiveSession();
        if (guestSession != null && guestSession.equals(guestSession2)) {
            c();
        }
        return (GuestSession) this.b.getActiveSession();
    }
}
