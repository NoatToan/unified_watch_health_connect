package com.amazon.alexa.avs.message.request.system;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class UserInactivityReportPayload extends Payload {
    private long inactiveTimeInSeconds;

    public UserInactivityReportPayload(long j) {
        this.inactiveTimeInSeconds = j;
    }

    public long getInactiveTimeInSeconds() {
        return this.inactiveTimeInSeconds;
    }
}
