package com.amazon.alexa.avs.http;

/* JADX INFO: loaded from: classes2.dex */
public class ExponentialRetryPolicy extends AbstractRetryPolicy {
    private long mulitiplier;

    public ExponentialRetryPolicy(long j, int i) {
        super(i);
        this.mulitiplier = j;
    }

    @Override // com.amazon.alexa.avs.http.AbstractRetryPolicy
    public long getDelay(int i) {
        if (i == 0) {
            return 0L;
        }
        return Math.round(Math.pow(2.0d, Math.max(0, i - 1)) * this.mulitiplier);
    }
}
