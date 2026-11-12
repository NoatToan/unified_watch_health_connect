package com.amazon.alexa.avs.http;

/* JADX INFO: loaded from: classes2.dex */
public class LinearRetryPolicy extends AbstractRetryPolicy {
    private long initialDelay;

    public LinearRetryPolicy(long j, int i) {
        super(i);
        this.initialDelay = j;
    }

    @Override // com.amazon.alexa.avs.http.AbstractRetryPolicy
    public long getDelay(int i) {
        return ((long) i) * this.initialDelay;
    }
}
