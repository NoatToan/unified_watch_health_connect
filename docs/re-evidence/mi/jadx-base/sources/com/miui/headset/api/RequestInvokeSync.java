package com.miui.headset.api;

import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/miui/headset/api/RequestInvokeSync;", "", "()V", "condition", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "invokeId", "", "getInvokeId", "()Ljava/lang/String;", "setInvokeId", "(Ljava/lang/String;)V", "lock", "Ljava/util/concurrent/locks/Lock;", "state", "", "blockInvoke", "id", "timeOutMillis", "", "resultId", BroadcastsKt.SILENT_PUSHING_CANCEL, "", "isBlocking", "", "isCanceled", "signal", "result", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestInvokeSync {
    private final Condition condition;

    @NotNull
    private volatile String invokeId;

    @NotNull
    private final Lock lock;
    private volatile int state;

    public RequestInvokeSync() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.state = -1;
        this.invokeId = "";
    }

    public static /* synthetic */ int blockInvoke$default(RequestInvokeSync requestInvokeSync, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 202;
        }
        return requestInvokeSync.blockInvoke(str, j, i);
    }

    public final int blockInvoke(@NotNull String id, long timeOutMillis, int resultId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Lock lock = this.lock;
        lock.lock();
        try {
            this.invokeId = id;
            this.state = -2;
            if (this.state == -2) {
                this.condition.await(timeOutMillis, TimeUnit.MILLISECONDS);
            }
            this.invokeId = "";
            Unit unit = Unit.INSTANCE;
            lock.unlock();
            if (this.state == -2) {
                this.state = resultId;
            }
            return this.state;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final void cancel() {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.state = -3;
            this.condition.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    @NotNull
    public final String getInvokeId() {
        return this.invokeId;
    }

    public final boolean isBlocking() {
        return this.state == -2;
    }

    public final boolean isCanceled() {
        return this.state == -3;
    }

    public final void setInvokeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invokeId = str;
    }

    public final void signal(@NotNull String id, int result) {
        Intrinsics.checkNotNullParameter(id, "id");
        if ((!Intrinsics.areEqual(this.invokeId, id)) || (this.state != -2)) {
            return;
        }
        Lock lock = this.lock;
        lock.lock();
        try {
            this.state = result;
            this.condition.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }
}
