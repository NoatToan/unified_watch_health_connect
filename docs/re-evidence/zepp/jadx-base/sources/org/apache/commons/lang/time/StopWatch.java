package org.apache.commons.lang.time;

/* JADX INFO: loaded from: classes23.dex */
public class StopWatch {
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 10;
    private static final int j = 11;
    private int a = 0;
    private int b = 10;
    private long c = -1;
    private long d = -1;

    public long getSplitTime() {
        if (this.b == 11) {
            return this.d - this.c;
        }
        throw new IllegalStateException("Stopwatch must be split to get the split time. ");
    }

    public long getStartTime() {
        if (this.a != 0) {
            return this.c;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long getTime() {
        long jCurrentTimeMillis;
        long j2;
        int i2 = this.a;
        if (i2 == 2 || i2 == 3) {
            jCurrentTimeMillis = this.d;
            j2 = this.c;
        } else {
            if (i2 == 0) {
                return 0L;
            }
            if (i2 != 1) {
                throw new RuntimeException("Illegal running state has occured. ");
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            j2 = this.c;
        }
        return jCurrentTimeMillis - j2;
    }

    public void reset() {
        this.a = 0;
        this.b = 10;
        this.c = -1L;
        this.d = -1L;
    }

    public void resume() {
        if (this.a != 3) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.c += System.currentTimeMillis() - this.d;
        this.d = -1L;
        this.a = 1;
    }

    public void split() {
        if (this.a != 1) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.d = System.currentTimeMillis();
        this.b = 11;
    }

    public void start() {
        int i2 = this.a;
        if (i2 == 2) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (i2 != 0) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.d = -1L;
        this.c = System.currentTimeMillis();
        this.a = 1;
    }

    public void stop() {
        int i2 = this.a;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (i2 == 1) {
            this.d = System.currentTimeMillis();
        }
        this.a = 2;
    }

    public void suspend() {
        if (this.a != 1) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.d = System.currentTimeMillis();
        this.a = 3;
    }

    public String toSplitString() {
        return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public String toString() {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public void unsplit() {
        if (this.b != 11) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.d = -1L;
        this.b = 10;
    }
}
