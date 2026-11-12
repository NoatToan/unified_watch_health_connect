package ch.qos.logback.core.recovery;

/* JADX INFO: loaded from: classes7.dex */
public class RecoveryCoordinator {
    static long BACKOFF_COEFFICIENT_MAX = 327680;
    public static final long BACKOFF_COEFFICIENT_MIN = 20;
    static long BACKOFF_MULTIPLIER = 4;
    private static long UNSET = -1;
    private long backOffCoefficient;
    private long currentTime;
    private long next;

    public RecoveryCoordinator() {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    private long getBackoffCoefficient() {
        long j8 = this.backOffCoefficient;
        if (j8 < BACKOFF_COEFFICIENT_MAX) {
            this.backOffCoefficient = BACKOFF_MULTIPLIER * j8;
        }
        return j8;
    }

    private long getCurrentTime() {
        long j8 = this.currentTime;
        return j8 != UNSET ? j8 : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long currentTime = getCurrentTime();
        if (currentTime <= this.next) {
            return true;
        }
        this.next = currentTime + getBackoffCoefficient();
        return false;
    }

    public void setCurrentTime(long j8) {
        this.currentTime = j8;
    }

    public RecoveryCoordinator(long j8) {
        this.backOffCoefficient = 20L;
        this.currentTime = j8;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }
}
