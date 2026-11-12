package com.twitter.sdk.android.core;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterConfig {
    public final Context a;
    public final Logger b;
    public final TwitterAuthConfig c;
    public final ExecutorService d;
    public final Boolean e;

    public static class Builder {
        private final Context a;
        private Logger b;
        private TwitterAuthConfig c;
        private ExecutorService d;
        private Boolean e;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context.getApplicationContext();
        }

        public TwitterConfig build() {
            return new TwitterConfig(this.a, this.b, this.c, this.d, this.e);
        }

        public Builder debug(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public Builder executorService(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("ExecutorService must not be null.");
            }
            this.d = executorService;
            return this;
        }

        public Builder logger(Logger logger) {
            if (logger == null) {
                throw new IllegalArgumentException("Logger must not be null.");
            }
            this.b = logger;
            return this;
        }

        public Builder twitterAuthConfig(TwitterAuthConfig twitterAuthConfig) {
            if (twitterAuthConfig == null) {
                throw new IllegalArgumentException("TwitterAuthConfig must not be null.");
            }
            this.c = twitterAuthConfig;
            return this;
        }
    }

    private TwitterConfig(Context context, Logger logger, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool) {
        this.a = context;
        this.b = logger;
        this.c = twitterAuthConfig;
        this.d = executorService;
        this.e = bool;
    }
}
