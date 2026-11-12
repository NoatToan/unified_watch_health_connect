package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.internal.ActivityLifecycleManager;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.ExecutorUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class Twitter {
    public static final String TAG = "Twitter";
    private static final String h = "com.twitter.sdk.android.CONSUMER_KEY";
    private static final String i = "com.twitter.sdk.android.CONSUMER_SECRET";
    private static final String j = "Must initialize Twitter before using getInstance()";
    public static final Logger k = new DefaultLogger();

    @SuppressLint({"StaticFieldLeak"})
    public static volatile Twitter l;
    private final Context a;
    private final IdManager b;
    private final ExecutorService c;
    private final TwitterAuthConfig d;
    private final ActivityLifecycleManager e;
    private final Logger f;
    private final boolean g;

    private Twitter(TwitterConfig twitterConfig) {
        Context context = twitterConfig.a;
        this.a = context;
        this.b = new IdManager(context);
        this.e = new ActivityLifecycleManager(context);
        TwitterAuthConfig twitterAuthConfig = twitterConfig.c;
        if (twitterAuthConfig == null) {
            this.d = new TwitterAuthConfig(CommonUtils.getStringResourceValue(context, h, ""), CommonUtils.getStringResourceValue(context, i, ""));
        } else {
            this.d = twitterAuthConfig;
        }
        ExecutorService executorService = twitterConfig.d;
        if (executorService == null) {
            this.c = ExecutorUtils.buildThreadPoolExecutorService("twitter-worker");
        } else {
            this.c = executorService;
        }
        Logger logger = twitterConfig.b;
        if (logger == null) {
            this.f = k;
        } else {
            this.f = logger;
        }
        Boolean bool = twitterConfig.e;
        if (bool == null) {
            this.g = false;
        } else {
            this.g = bool.booleanValue();
        }
    }

    public static void a() {
        if (l == null) {
            throw new IllegalStateException(j);
        }
    }

    public static synchronized Twitter b(TwitterConfig twitterConfig) {
        if (l != null) {
            return l;
        }
        l = new Twitter(twitterConfig);
        return l;
    }

    public static Twitter getInstance() {
        a();
        return l;
    }

    public static Logger getLogger() {
        return l == null ? k : l.f;
    }

    public static void initialize(Context context) {
        b(new TwitterConfig.Builder(context).build());
    }

    public static boolean isDebug() {
        if (l == null) {
            return false;
        }
        return l.g;
    }

    public ActivityLifecycleManager getActivityLifecycleManager() {
        return this.e;
    }

    public Context getContext(String str) {
        return new a(this.a, str, ".TwitterKit" + File.separator + str);
    }

    public ExecutorService getExecutorService() {
        return this.c;
    }

    public IdManager getIdManager() {
        return this.b;
    }

    public TwitterAuthConfig getTwitterAuthConfig() {
        return this.d;
    }

    public static void initialize(TwitterConfig twitterConfig) {
        b(twitterConfig);
    }
}
