package com.google.firebase.heartbeatinfo;

import am.j;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    private final long millis;
    private final String sdkName;

    public AutoValue_SdkHeartBeatResult(String str, long j8) {
        if (str == null) {
            x.l("Null sdkName");
            throw null;
        }
        this.sdkName = str;
        this.millis = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkHeartBeatResult) {
            SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
            if (this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.sdkName;
    }

    public int hashCode() {
        int iHashCode = (this.sdkName.hashCode() ^ 1000003) * 1000003;
        long j8 = this.millis;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SdkHeartBeatResult{sdkName=");
        sb3.append(this.sdkName);
        sb3.append(", millis=");
        return j.i(this.millis, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
