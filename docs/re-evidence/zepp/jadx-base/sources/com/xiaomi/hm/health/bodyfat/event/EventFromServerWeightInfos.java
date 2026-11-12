package com.xiaomi.hm.health.bodyfat.event;

import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes19.dex */
public class EventFromServerWeightInfos {
    private static final String c = "Weight - EventFromServerWeightInfos";
    private long a;
    private boolean b;

    public EventFromServerWeightInfos(long j, boolean z) {
        HMLog.d(c, "EventFromServerWeightInfos", new Object[0]);
        this.a = j;
        this.b = z;
    }

    public long getUserId() {
        return this.a;
    }

    public boolean isSuccess() {
        return this.b;
    }

    public void setSuccess(boolean z) {
        this.b = z;
    }

    public void setUserId(long j) {
        this.a = j;
    }

    public String toString() {
        return "EventFromServerWeightInfos{mUserId=" + this.a + ", mSuccess=" + this.b + '}';
    }
}
