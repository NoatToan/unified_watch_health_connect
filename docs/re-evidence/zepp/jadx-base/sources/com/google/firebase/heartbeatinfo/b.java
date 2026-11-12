package com.google.firebase.heartbeatinfo;

import com.alipay.sdk.m.u.i;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class b extends SdkHeartBeatResult {
    private final String a;
    private final long b;

    public b(String str, long j) {
        Objects.requireNonNull(str, "Null sdkName");
        this.a = str;
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        return this.a.equals(sdkHeartBeatResult.getSdkName()) && this.b == sdkHeartBeatResult.getMillis();
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.b;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.a + ", millis=" + this.b + i.d;
    }
}
