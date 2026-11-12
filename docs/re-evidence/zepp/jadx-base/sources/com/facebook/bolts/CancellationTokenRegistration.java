package com.facebook.bolts;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/bolts/CancellationTokenRegistration;", "Ljava/io/Closeable;", "", "a", "close", "runAction$facebook_core_release", "()V", "runAction", "", "Z", "closed", "Lcom/facebook/bolts/CancellationTokenSource;", "b", "Lcom/facebook/bolts/CancellationTokenSource;", "tokenSource", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "action", "<init>", "(Lcom/facebook/bolts/CancellationTokenSource;Ljava/lang/Runnable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CancellationTokenRegistration implements Closeable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private CancellationTokenSource tokenSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Runnable action;

    public CancellationTokenRegistration(@NotNull CancellationTokenSource cancellationTokenSource, @Nullable Runnable runnable) {
        this.action = runnable;
        this.tokenSource = cancellationTokenSource;
    }

    private final void a() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            CancellationTokenSource cancellationTokenSource = this.tokenSource;
            if (cancellationTokenSource != null) {
                cancellationTokenSource.unregister$facebook_core_release(this);
            }
            this.tokenSource = null;
            this.action = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void runAction$facebook_core_release() {
        synchronized (this) {
            a();
            Runnable runnable = this.action;
            if (runnable != null) {
                runnable.run();
            }
            close();
            Unit unit = Unit.INSTANCE;
        }
    }
}
