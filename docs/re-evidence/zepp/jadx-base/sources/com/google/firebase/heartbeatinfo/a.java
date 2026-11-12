package com.google.firebase.heartbeatinfo;

import com.alipay.sdk.m.u.i;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a extends HeartBeatResult {
    private final String a;
    private final long b;
    private final HeartBeatInfo.HeartBeat c;

    public a(String str, long j, HeartBeatInfo.HeartBeat heartBeat) {
        Objects.requireNonNull(str, "Null sdkName");
        this.a = str;
        this.b = j;
        Objects.requireNonNull(heartBeat, "Null heartBeat");
        this.c = heartBeat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.a.equals(heartBeatResult.getSdkName()) && this.b == heartBeatResult.getMillis() && this.c.equals(heartBeatResult.getHeartBeat());
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public HeartBeatInfo.HeartBeat getHeartBeat() {
        return this.c;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public long getMillis() {
        return this.b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getSdkName() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{sdkName=" + this.a + ", millis=" + this.b + ", heartBeat=" + this.c + i.d;
    }
}
