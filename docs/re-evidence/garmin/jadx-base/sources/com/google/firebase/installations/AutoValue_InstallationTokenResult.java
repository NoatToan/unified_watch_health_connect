package com.google.firebase.installations;

import am.j;
import j20.x;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    private AutoValue_InstallationTokenResult(String str, long j8, long j14) {
        this.token = str;
        this.tokenExpirationTimestamp = j8;
        this.tokenCreationTimestamp = j14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            if (this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int iHashCode = (this.token.hashCode() ^ 1000003) * 1000003;
        long j8 = this.tokenExpirationTimestamp;
        long j14 = this.tokenCreationTimestamp;
        return ((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("InstallationTokenResult{token=");
        sb3.append(this.token);
        sb3.append(", tokenExpirationTimestamp=");
        sb3.append(this.tokenExpirationTimestamp);
        sb3.append(", tokenCreationTimestamp=");
        return j.i(this.tokenCreationTimestamp, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }

    public static final class Builder extends InstallationTokenResult.Builder {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        private Builder(InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.tokenCreationTimestamp = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String strConcat = this.token == null ? " token" : "";
            if (this.tokenExpirationTimestamp == null) {
                strConcat = strConcat.concat(" tokenExpirationTimestamp");
            }
            if (this.tokenCreationTimestamp == null) {
                strConcat = strConcat.concat(" tokenCreationTimestamp");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue());
            }
            h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.token = str;
                return this;
            }
            x.l("Null token");
            return null;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j8) {
            this.tokenCreationTimestamp = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j8) {
            this.tokenExpirationTimestamp = Long.valueOf(j8);
            return this;
        }

        public Builder() {
        }
    }
}
