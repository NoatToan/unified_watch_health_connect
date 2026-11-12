package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerMessage {
    private final Target a;
    private final Sender b;
    private final Clock c;
    private final Timeline d;
    private int e;

    @Nullable
    private Object f;
    private Looper g;
    private int h;
    private long i = C.TIME_UNSET;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface Sender {
        void sendMessage(PlayerMessage message);
    }

    public interface Target {
        void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int defaultWindowIndex, Clock clock, Looper defaultLooper) {
        this.b = sender;
        this.a = target;
        this.d = timeline;
        this.g = defaultLooper;
        this.c = clock;
        this.h = defaultWindowIndex;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        Assertions.checkState(this.k);
        Assertions.checkState(this.g.getThread() != Thread.currentThread());
        while (!this.m) {
            wait();
        }
        return this.l;
    }

    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.k);
        this.n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.j;
    }

    public Looper getLooper() {
        return this.g;
    }

    @Nullable
    public Object getPayload() {
        return this.f;
    }

    public long getPositionMs() {
        return this.i;
    }

    public Target getTarget() {
        return this.a;
    }

    public Timeline getTimeline() {
        return this.d;
    }

    public int getType() {
        return this.e;
    }

    public int getWindowIndex() {
        return this.h;
    }

    public synchronized boolean isCanceled() {
        return this.n;
    }

    public synchronized void markAsProcessed(boolean isDelivered) {
        this.l = isDelivered | this.l;
        this.m = true;
        notifyAll();
    }

    public PlayerMessage send() {
        Assertions.checkState(!this.k);
        if (this.i == C.TIME_UNSET) {
            Assertions.checkArgument(this.j);
        }
        this.k = true;
        this.b.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean deleteAfterDelivery) {
        Assertions.checkState(!this.k);
        this.j = deleteAfterDelivery;
        return this;
    }

    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    public PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.k);
        this.g = looper;
        return this;
    }

    public PlayerMessage setPayload(@Nullable Object payload) {
        Assertions.checkState(!this.k);
        this.f = payload;
        return this;
    }

    public PlayerMessage setPosition(long positionMs) {
        Assertions.checkState(!this.k);
        this.i = positionMs;
        return this;
    }

    public PlayerMessage setType(int messageType) {
        Assertions.checkState(!this.k);
        this.e = messageType;
        return this;
    }

    public PlayerMessage setPosition(int windowIndex, long positionMs) {
        Assertions.checkState(!this.k);
        Assertions.checkArgument(positionMs != C.TIME_UNSET);
        if (windowIndex >= 0 && (this.d.isEmpty() || windowIndex < this.d.getWindowCount())) {
            this.h = windowIndex;
            this.i = positionMs;
            return this;
        }
        throw new IllegalSeekPositionException(this.d, windowIndex, positionMs);
    }

    public synchronized boolean blockUntilDelivered(long timeoutMs) throws InterruptedException, TimeoutException {
        boolean z;
        Assertions.checkState(this.k);
        Assertions.checkState(this.g.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.c.elapsedRealtime() + timeoutMs;
        while (true) {
            z = this.m;
            if (z || timeoutMs <= 0) {
                break;
            }
            this.c.onThreadBlocked();
            wait(timeoutMs);
            timeoutMs = jElapsedRealtime - this.c.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.l;
    }
}
