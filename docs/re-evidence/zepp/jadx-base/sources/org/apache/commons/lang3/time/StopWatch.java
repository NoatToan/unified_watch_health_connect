package org.apache.commons.lang3.time;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes23.dex */
public class StopWatch {
    private static final long f = 1000000;
    private c a = c.UNSTARTED;
    private b b = b.UNSPLIT;
    private long c;
    private long d;
    private long e;

    public enum b {
        SPLIT,
        UNSPLIT
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c RUNNING;
        public static final c STOPPED;
        public static final c SUSPENDED;
        public static final c UNSTARTED;

        public static enum a extends c {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean a() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean b() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean c() {
                return false;
            }
        }

        public static enum b extends c {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean a() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean b() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean c() {
                return false;
            }
        }

        /* JADX INFO: renamed from: org.apache.commons.lang3.time.StopWatch$c$c, reason: collision with other inner class name */
        public static enum C1199c extends c {
            public C1199c(String str, int i) {
                super(str, i);
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean a() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean b() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean c() {
                return false;
            }
        }

        public static enum d extends c {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean a() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean b() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.c
            public boolean c() {
                return true;
            }
        }

        static {
            a aVar = new a("UNSTARTED", 0);
            UNSTARTED = aVar;
            b bVar = new b(DebugCoroutineInfoImplKt.RUNNING, 1);
            RUNNING = bVar;
            C1199c c1199c = new C1199c("STOPPED", 2);
            STOPPED = c1199c;
            d dVar = new d(DebugCoroutineInfoImplKt.SUSPENDED, 3);
            SUSPENDED = dVar;
            $VALUES = new c[]{aVar, bVar, c1199c, dVar};
        }

        private c(String str, int i) {
            super(str, i);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract boolean c();
    }

    public static StopWatch createStarted() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        return stopWatch;
    }

    public long getNanoTime() {
        long jNanoTime;
        long j;
        c cVar = this.a;
        if (cVar == c.STOPPED || cVar == c.SUSPENDED) {
            jNanoTime = this.e;
            j = this.c;
        } else {
            if (cVar == c.UNSTARTED) {
                return 0L;
            }
            if (cVar != c.RUNNING) {
                throw new RuntimeException("Illegal running state has occurred.");
            }
            jNanoTime = System.nanoTime();
            j = this.c;
        }
        return jNanoTime - j;
    }

    public long getSplitNanoTime() {
        if (this.b == b.SPLIT) {
            return this.e - this.c;
        }
        throw new IllegalStateException("Stopwatch must be split to get the split time. ");
    }

    public long getSplitTime() {
        return getSplitNanoTime() / 1000000;
    }

    public long getStartTime() {
        if (this.a != c.UNSTARTED) {
            return this.d;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long getTime() {
        return getNanoTime() / 1000000;
    }

    public boolean isStarted() {
        return this.a.a();
    }

    public boolean isStopped() {
        return this.a.b();
    }

    public boolean isSuspended() {
        return this.a.c();
    }

    public void reset() {
        this.a = c.UNSTARTED;
        this.b = b.UNSPLIT;
    }

    public void resume() {
        if (this.a != c.SUSPENDED) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.c += System.nanoTime() - this.e;
        this.a = c.RUNNING;
    }

    public void split() {
        if (this.a != c.RUNNING) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.e = System.nanoTime();
        this.b = b.SPLIT;
    }

    public void start() {
        c cVar = this.a;
        if (cVar == c.STOPPED) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (cVar != c.UNSTARTED) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.c = System.nanoTime();
        this.d = System.currentTimeMillis();
        this.a = c.RUNNING;
    }

    public void stop() {
        c cVar = this.a;
        c cVar2 = c.RUNNING;
        if (cVar != cVar2 && cVar != c.SUSPENDED) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (cVar == cVar2) {
            this.e = System.nanoTime();
        }
        this.a = c.STOPPED;
    }

    public void suspend() {
        if (this.a != c.RUNNING) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.e = System.nanoTime();
        this.a = c.SUSPENDED;
    }

    public String toSplitString() {
        return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public String toString() {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public void unsplit() {
        if (this.b != b.SPLIT) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.b = b.UNSPLIT;
    }

    public long getTime(TimeUnit timeUnit) {
        return timeUnit.convert(getNanoTime(), TimeUnit.NANOSECONDS);
    }
}
