package com.amazon.alexa.avs.http;

import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRetryPolicy implements RetryPolicy {
    private static final Logger log = LoggerFactory.getLogger(AbstractRetryPolicy.class);
    private int maxAttempts;

    public AbstractRetryPolicy(int i) {
        this.maxAttempts = i;
    }

    public abstract long getDelay(int i);

    @Override // com.amazon.alexa.avs.http.RetryPolicy
    public void tryCall(Callable<Void> callable, Class<? extends Throwable> cls) throws Exception {
        int i = 0;
        while (i < this.maxAttempts) {
            try {
                callable.call();
                return;
            } catch (Exception e) {
                i++;
                if (cls == null || !cls.isAssignableFrom(e.getClass()) || i >= this.maxAttempts) {
                    throw e;
                }
                log.warn("Error occured while making call. This call will retry.", e);
                Thread.sleep(getDelay(i));
            }
        }
    }
}
