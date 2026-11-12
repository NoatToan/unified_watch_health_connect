package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i14, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i14, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i14;
    }

    public synchronized boolean blockUntilDelivered(long j8) {
        boolean z14;
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.clock.elapsedRealtime() + j8;
            while (true) {
                z14 = this.isProcessed;
                if (z14 || j8 <= 0) {
                    break;
                }
                this.clock.onThreadBlocked();
                wait(j8);
                j8 = jElapsedRealtime - this.clock.elapsedRealtime();
            }
            if (!z14) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.isDelivered;
    }

    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z14) {
        this.isDelivered = z14 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z14) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z14;
        return this;
    }

    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    public PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    public PlayerMessage setPayload(Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public PlayerMessage setPosition(int i14, long j8) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j8 != C.TIME_UNSET);
        if (i14 < 0 || (!this.timeline.isEmpty() && i14 >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i14, j8);
        }
        this.mediaItemIndex = i14;
        this.positionMs = j8;
        return this;
    }

    public PlayerMessage setType(int i14) {
        Assertions.checkState(!this.isSent);
        this.type = i14;
        return this;
    }

    public PlayerMessage setPosition(long j8) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j8;
        return this;
    }

    public synchronized boolean blockUntilDelivered() {
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.isDelivered;
    }
}
