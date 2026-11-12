package ch.qos.logback.core.util;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultInvocationGate implements InvocationGate {
    static final int DEFAULT_MASK = 15;
    static final int MASK_DECREASE_RIGHT_SHIFT_COUNT = 2;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    private long invocationCounter;
    long lowerLimitForMaskMatch;
    private volatile long mask;
    private long maxDelayThreshold;
    private long minDelayThreshold;
    long upperLimitForNoMaskMatch;

    public DefaultInvocationGate(long j8, long j14, long j15) {
        this.mask = 15L;
        this.invocationCounter = 0L;
        this.minDelayThreshold = j8;
        this.maxDelayThreshold = j14;
        this.lowerLimitForMaskMatch = j8 + j15;
        this.upperLimitForNoMaskMatch = j15 + j14;
    }

    private void decreaseMask() {
        this.mask >>>= 2;
    }

    private void increaseMask() {
        if (this.mask >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        this.mask = (this.mask << 1) | 1;
    }

    private void updateLimits(long j8) {
        this.lowerLimitForMaskMatch = this.minDelayThreshold + j8;
        this.upperLimitForNoMaskMatch = j8 + this.maxDelayThreshold;
    }

    public long getInvocationCounter() {
        return this.invocationCounter;
    }

    public long getMask() {
        return this.mask;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j8) {
        long j14 = this.invocationCounter;
        this.invocationCounter = 1 + j14;
        boolean z14 = (j14 & this.mask) == this.mask;
        if (z14) {
            if (j8 < this.lowerLimitForMaskMatch) {
                increaseMask();
            }
            updateLimits(j8);
        } else if (j8 > this.upperLimitForNoMaskMatch) {
            decreaseMask();
            updateLimits(j8);
            return false;
        }
        return !z14;
    }

    public DefaultInvocationGate() {
        this(MASK_INCREASE_THRESHOLD, MASK_DECREASE_THRESHOLD, System.currentTimeMillis());
    }
}
