package com.google.firebase.remoteconfig;

import androidx.room.a0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    public static class Builder {
        private long fetchTimeoutInSeconds = 60;
        private long minimumFetchInterval = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.fetchTimeoutInSeconds;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.minimumFetchInterval;
        }

        public Builder setFetchTimeoutInSeconds(long j8) {
            if (j8 >= 0) {
                this.fetchTimeoutInSeconds = j8;
                return this;
            }
            org.apache.commons.lang3.e.s("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j8)});
            return null;
        }

        public Builder setMinimumFetchIntervalInSeconds(long j8) {
            if (j8 >= 0) {
                this.minimumFetchInterval = j8;
                return this;
            }
            h.s(a0.f(j8, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
            return null;
        }
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.fetchTimeoutInSeconds = builder.fetchTimeoutInSeconds;
        this.minimumFetchInterval = builder.minimumFetchInterval;
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }
}
