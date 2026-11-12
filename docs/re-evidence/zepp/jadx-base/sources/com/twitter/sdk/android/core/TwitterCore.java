package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.internal.SessionMonitor;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.TwitterSessionVerifier;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl;
import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterCore {
    public static final String TAG = "Twitter";

    @SuppressLint({"StaticFieldLeak"})
    public static volatile TwitterCore i = null;
    public static final String j = "active_twittersession";
    public static final String k = "twittersession";
    public static final String l = "active_guestsession";
    public static final String m = "guestsession";
    public static final String n = "session_store";
    public static final String o = "TwitterCore";
    public SessionManager<TwitterSession> a;
    public SessionManager<GuestSession> b;
    public SessionMonitor<TwitterSession> c;
    private final TwitterAuthConfig d;
    private final ConcurrentHashMap<Session, TwitterApiClient> e;
    private final Context f;
    private volatile TwitterApiClient g;
    private volatile GuestSessionProvider h;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TwitterCore.i.d();
        }
    }

    public TwitterCore(TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, new ConcurrentHashMap(), null);
    }

    private synchronized void a() {
        if (this.g == null) {
            this.g = new TwitterApiClient();
        }
    }

    private synchronized void b(TwitterApiClient twitterApiClient) {
        if (this.g == null) {
            this.g = twitterApiClient;
        }
    }

    private synchronized void c() {
        if (this.h == null) {
            this.h = new GuestSessionProvider(new OAuth2Service(this, new TwitterApi()), this.b);
        }
    }

    private void e() {
        TwitterCoreScribeClientHolder.initialize(this.f, getSessionManager(), getGuestSessionProvider(), Twitter.getInstance().getIdManager(), o, getVersion());
    }

    public static TwitterCore getInstance() {
        if (i == null) {
            synchronized (TwitterCore.class) {
                if (i == null) {
                    i = new TwitterCore(Twitter.getInstance().getTwitterAuthConfig());
                    Twitter.getInstance().getExecutorService().execute(new a());
                }
            }
        }
        return i;
    }

    public void addApiClient(TwitterSession twitterSession, TwitterApiClient twitterApiClient) {
        if (this.e.containsKey(twitterSession)) {
            return;
        }
        this.e.putIfAbsent(twitterSession, twitterApiClient);
    }

    public void addGuestApiClient(TwitterApiClient twitterApiClient) {
        if (this.g == null) {
            b(twitterApiClient);
        }
    }

    public void d() {
        this.a.getActiveSession();
        this.b.getActiveSession();
        getGuestSessionProvider();
        e();
        this.c.monitorActivityLifecycle(Twitter.getInstance().getActivityLifecycleManager());
    }

    public TwitterApiClient getApiClient() {
        TwitterSession twitterSession = (TwitterSession) this.a.getActiveSession();
        return twitterSession == null ? getGuestApiClient() : getApiClient(twitterSession);
    }

    public TwitterAuthConfig getAuthConfig() {
        return this.d;
    }

    public TwitterApiClient getGuestApiClient() {
        if (this.g == null) {
            a();
        }
        return this.g;
    }

    public GuestSessionProvider getGuestSessionProvider() {
        if (this.h == null) {
            c();
        }
        return this.h;
    }

    public String getIdentifier() {
        return "com.twitter.sdk.android:twitter-core";
    }

    public SessionManager<TwitterSession> getSessionManager() {
        return this.a;
    }

    public String getVersion() {
        return "3.0.0.7";
    }

    public TwitterCore(TwitterAuthConfig twitterAuthConfig, ConcurrentHashMap<Session, TwitterApiClient> concurrentHashMap, TwitterApiClient twitterApiClient) {
        this.d = twitterAuthConfig;
        this.e = concurrentHashMap;
        this.g = twitterApiClient;
        Context context = Twitter.getInstance().getContext(getIdentifier());
        this.f = context;
        this.a = new PersistedSessionManager(new PreferenceStoreImpl(context, n), new TwitterSession.a(), j, k);
        this.b = new PersistedSessionManager(new PreferenceStoreImpl(context, n), new GuestSession.Serializer(), l, m);
        this.c = new SessionMonitor<>(this.a, Twitter.getInstance().getExecutorService(), new TwitterSessionVerifier());
    }

    public TwitterApiClient getApiClient(TwitterSession twitterSession) {
        if (!this.e.containsKey(twitterSession)) {
            this.e.putIfAbsent(twitterSession, new TwitterApiClient(twitterSession));
        }
        return this.e.get(twitterSession);
    }
}
