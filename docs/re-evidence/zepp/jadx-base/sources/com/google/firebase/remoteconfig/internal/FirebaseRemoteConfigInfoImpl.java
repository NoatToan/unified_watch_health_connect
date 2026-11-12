package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {
    private final long a;
    private final int b;
    private final FirebaseRemoteConfigSettings c;

    public static class Builder {
        private long a;
        private int b;
        private FirebaseRemoteConfigSettings c;

        public Builder a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.c = firebaseRemoteConfigSettings;
            return this;
        }

        public Builder b(int i) {
            this.b = i;
            return this;
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.a, this.b, this.c);
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j) {
            this.a = j;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder a() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.c;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.b;
    }

    private FirebaseRemoteConfigInfoImpl(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.a = j;
        this.b = i;
        this.c = firebaseRemoteConfigSettings;
    }
}
