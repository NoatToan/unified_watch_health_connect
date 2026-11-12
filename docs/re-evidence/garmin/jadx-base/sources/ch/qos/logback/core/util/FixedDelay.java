package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes7.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    public FixedDelay(long j8, long j14) {
        this.nextDelay = j8;
        this.subsequentDelay = j14;
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j8 = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDelay(int i14) {
        long j8 = i14;
        this(j8, j8);
    }
}
