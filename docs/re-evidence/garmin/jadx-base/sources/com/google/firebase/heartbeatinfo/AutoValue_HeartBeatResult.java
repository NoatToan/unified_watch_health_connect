package com.google.firebase.heartbeatinfo;

import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List<String> usedDates;
    private final String userAgent;

    public AutoValue_HeartBeatResult(String str, List<String> list) {
        if (str == null) {
            x.l("Null userAgent");
            throw null;
        }
        this.userAgent = str;
        if (list != null) {
            this.usedDates = list;
        } else {
            x.l("Null usedDates");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeartBeatResult) {
            HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
            if (this.userAgent.equals(heartBeatResult.getUserAgent()) && this.usedDates.equals(heartBeatResult.getUsedDates())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> getUsedDates() {
        return this.usedDates;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("HeartBeatResult{userAgent=");
        sb3.append(this.userAgent);
        sb3.append(", usedDates=");
        return z.c(sb3, this.usedDates, StringSubstitutor.DEFAULT_VAR_END);
    }
}
