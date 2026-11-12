package com.amazon.alexa.avs.message.response.audioplayer;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class ClearQueue extends Payload {
    private ClearBehavior clearBehavior;

    public enum ClearBehavior {
        CLEAR_ENQUEUED,
        CLEAR_ALL
    }

    public ClearBehavior getClearBehavior() {
        return this.clearBehavior;
    }

    public void setClearBehavior(String str) {
        this.clearBehavior = ClearBehavior.valueOf(str);
    }
}
