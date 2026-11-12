package com.google.firebase.installations.remote;

import ch.qos.logback.core.spi.ComponentTracker;
import com.google.firebase.installations.Utils;

/* JADX INFO: loaded from: classes2.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = 86400000;
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = ComponentTracker.DEFAULT_TIMEOUT;
    private int attemptCount;
    private long nextRequestTime;
    private final Utils utils;

    public RequestLimiter() {
        this.utils = Utils.getInstance();
    }

    private synchronized long getBackoffDuration(int i14) {
        if (isRetryableError(i14)) {
            return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
        return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
    }

    private static boolean isRetryableError(int i14) {
        if (i14 != 429) {
            return i14 >= 500 && i14 < 600;
        }
        return true;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i14) {
        return (i14 >= 200 && i14 < 300) || i14 == 401 || i14 == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    public synchronized boolean isRequestAllowed() {
        return this.attemptCount == 0 || this.utils.currentTimeInMillis() > this.nextRequestTime;
    }

    public synchronized void setNextRequestTime(int i14) {
        if (isSuccessfulOrRequiresNewFidCreation(i14)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i14);
    }

    public RequestLimiter(Utils utils) {
        this.utils = utils;
    }
}
