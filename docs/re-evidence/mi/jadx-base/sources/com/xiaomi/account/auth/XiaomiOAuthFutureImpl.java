package com.xiaomi.account.auth;

import android.accounts.OperationCanceledException;
import android.os.Looper;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class XiaomiOAuthFutureImpl<V> extends FutureTask<V> implements XiaomiOAuthFuture<V> {
    private static final long DEFAULT_TIMEOUT_MINUTE = 10;

    public XiaomiOAuthFutureImpl(Callable<V> callable) {
        super(callable);
    }

    private void ensureNotOnMainThread() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
    }

    private V internalGetResult(Long l, TimeUnit timeUnit) throws OperationCanceledException, IOException, XMAuthericationException {
        if (!isDone()) {
            ensureNotOnMainThread();
        }
        try {
            try {
                try {
                    if (l == null) {
                        V v = get();
                        cancel(true);
                        return v;
                    }
                    V v2 = get(l.longValue(), timeUnit);
                    cancel(true);
                    return v2;
                } catch (Throwable th) {
                    cancel(true);
                    throw th;
                }
            } catch (InterruptedException | TimeoutException unused) {
                cancel(true);
                throw new OperationCanceledException();
            }
        } catch (CancellationException unused2) {
            throw new OperationCanceledException();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            if (cause instanceof XMAuthericationException) {
                throw ((XMAuthericationException) cause);
            }
            if (cause instanceof OperationCanceledException) {
                throw ((OperationCanceledException) cause);
            }
            throw new XMAuthericationException(cause);
        }
    }

    @Override // com.xiaomi.account.openauth.XiaomiOAuthFuture
    public V getResult() throws OperationCanceledException, IOException, XMAuthericationException {
        return internalGetResult(Long.valueOf(DEFAULT_TIMEOUT_MINUTE), TimeUnit.MINUTES);
    }

    @Override // com.xiaomi.account.openauth.XiaomiOAuthFuture
    public V getResult(long j, TimeUnit timeUnit) throws OperationCanceledException, IOException, XMAuthericationException {
        return internalGetResult(Long.valueOf(j), timeUnit);
    }
}
