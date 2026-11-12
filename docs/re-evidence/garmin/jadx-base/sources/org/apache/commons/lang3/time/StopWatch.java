package org.apache.commons.lang3.time;

import i3.e5;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000;
    private final String message;
    private State runningState;
    private SplitState splitState;
    private long startTimeMillis;
    private long startTimeNanos;
    private long stopTimeMillis;
    private long stopTimeNanos;

    public enum SplitState {
        SPLIT,
        UNSPLIT
    }

    public enum State {
        RUNNING { // from class: org.apache.commons.lang3.time.StopWatch.State.1
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return false;
            }
        },
        STOPPED { // from class: org.apache.commons.lang3.time.StopWatch.State.2
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return false;
            }
        },
        SUSPENDED { // from class: org.apache.commons.lang3.time.StopWatch.State.3
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return true;
            }
        },
        UNSTARTED { // from class: org.apache.commons.lang3.time.StopWatch.State.4
            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            public boolean isSuspended() {
                return false;
            }
        };

        public abstract boolean isStarted();

        public abstract boolean isStopped();

        public abstract boolean isSuspended();
    }

    public StopWatch(String str) {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
        this.message = str;
    }

    public static StopWatch create() {
        return new StopWatch();
    }

    public static StopWatch createStarted() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        return stopWatch;
    }

    public String formatSplitTime() {
        return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public String formatTime() {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public String getMessage() {
        return this.message;
    }

    public long getNanoTime() {
        State state = this.runningState;
        if (state == State.STOPPED || state == State.SUSPENDED) {
            return this.stopTimeNanos - this.startTimeNanos;
        }
        if (state == State.UNSTARTED) {
            return 0L;
        }
        if (state == State.RUNNING) {
            return System.nanoTime() - this.startTimeNanos;
        }
        h.z("Illegal running state has occurred.");
        return 0L;
    }

    public long getSplitNanoTime() {
        if (this.splitState == SplitState.SPLIT) {
            return this.stopTimeNanos - this.startTimeNanos;
        }
        h.z("Stopwatch must be split to get the split time.");
        return 0L;
    }

    public long getSplitTime() {
        return getSplitNanoTime() / 1000000;
    }

    public long getStartTime() {
        if (this.runningState != State.UNSTARTED) {
            return this.startTimeMillis;
        }
        h.z("Stopwatch has not been started");
        return 0L;
    }

    public long getStopTime() {
        if (this.runningState != State.UNSTARTED) {
            return this.stopTimeMillis;
        }
        h.z("Stopwatch has not been started");
        return 0L;
    }

    public long getTime(TimeUnit timeUnit) {
        return timeUnit.convert(getNanoTime(), TimeUnit.NANOSECONDS);
    }

    public boolean isStarted() {
        return this.runningState.isStarted();
    }

    public boolean isStopped() {
        return this.runningState.isStopped();
    }

    public boolean isSuspended() {
        return this.runningState.isSuspended();
    }

    public void reset() {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
    }

    public void resume() {
        if (this.runningState != State.SUSPENDED) {
            h.z("Stopwatch must be suspended to resume. ");
            return;
        }
        this.startTimeNanos = (System.nanoTime() - this.stopTimeNanos) + this.startTimeNanos;
        this.runningState = State.RUNNING;
    }

    public void split() {
        if (this.runningState != State.RUNNING) {
            h.z("Stopwatch is not running. ");
        } else {
            this.stopTimeNanos = System.nanoTime();
            this.splitState = SplitState.SPLIT;
        }
    }

    public void start() {
        State state = this.runningState;
        if (state == State.STOPPED) {
            h.z("Stopwatch must be reset before being restarted. ");
        } else {
            if (state != State.UNSTARTED) {
                h.z("Stopwatch already started. ");
                return;
            }
            this.startTimeNanos = System.nanoTime();
            this.startTimeMillis = System.currentTimeMillis();
            this.runningState = State.RUNNING;
        }
    }

    public void stop() {
        State state = this.runningState;
        State state2 = State.RUNNING;
        if (state != state2 && state != State.SUSPENDED) {
            h.z("Stopwatch is not running. ");
            return;
        }
        if (state == state2) {
            this.stopTimeNanos = System.nanoTime();
            this.stopTimeMillis = System.currentTimeMillis();
        }
        this.runningState = State.STOPPED;
    }

    public void suspend() {
        if (this.runningState != State.RUNNING) {
            h.z("Stopwatch must be running to suspend. ");
            return;
        }
        this.stopTimeNanos = System.nanoTime();
        this.stopTimeMillis = System.currentTimeMillis();
        this.runningState = State.SUSPENDED;
    }

    public String toSplitString() {
        String string = Objects.toString(this.message, "");
        String splitTime = formatSplitTime();
        return string.isEmpty() ? splitTime : e5.g(string, StringUtils.SPACE, splitTime);
    }

    public String toString() {
        String string = Objects.toString(this.message, "");
        String time = formatTime();
        return string.isEmpty() ? time : e5.g(string, StringUtils.SPACE, time);
    }

    public void unsplit() {
        if (this.splitState == SplitState.SPLIT) {
            this.splitState = SplitState.UNSPLIT;
        } else {
            h.z("Stopwatch has not been split. ");
        }
    }

    public long getTime() {
        return getNanoTime() / 1000000;
    }

    public StopWatch() {
        this(null);
    }
}
