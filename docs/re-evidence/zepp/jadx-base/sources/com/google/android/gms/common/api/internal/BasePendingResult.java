package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zas;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    public static final ThreadLocal<Boolean> p = new a1();
    private final Object a;
    private final CallbackHandler<R> b;
    private final WeakReference<GoogleApiClient> c;
    private final CountDownLatch d;
    private final ArrayList<PendingResult.StatusListener> e;

    @Nullable
    private ResultCallback<? super R> f;
    private final AtomicReference<v0> g;

    @Nullable
    private R h;
    private Status i;
    private volatile boolean j;
    private boolean k;
    private boolean l;

    @Nullable
    private ICancelToken m;

    @KeepName
    private a mResultGuardian;
    private volatile zacn<R> n;
    private boolean o;

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zas {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(@RecentlyNonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.onResult(result);
            } catch (RuntimeException e) {
                BasePendingResult.zaa(result);
                throw e;
            }
        }

        public final void zaa(@RecentlyNonNull ResultCallback<? super R> resultCallback, @RecentlyNonNull R r) {
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(BasePendingResult.c(resultCallback)), r)));
        }

        public CallbackHandler(@RecentlyNonNull Looper looper) {
            super(looper);
        }
    }

    public final class a {
        private a() {
        }

        public final void finalize() throws Throwable {
            BasePendingResult.zaa(BasePendingResult.this.h);
            super.finalize();
        }

        public /* synthetic */ a(BasePendingResult basePendingResult, a1 a1Var) {
            this();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.o = false;
        this.b = new CallbackHandler<>(Looper.getMainLooper());
        this.c = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static <R extends Result> ResultCallback<R> c(@Nullable ResultCallback<R> resultCallback) {
        return resultCallback;
    }

    private final void d(R r) {
        this.h = r;
        this.i = r.getStatus();
        a1 a1Var = null;
        this.m = null;
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            ResultCallback<? super R> resultCallback = this.f;
            if (resultCallback != null) {
                this.b.removeMessages(2);
                this.b.zaa(resultCallback, e());
            } else if (this.h instanceof Releasable) {
                this.mResultGuardian = new a(this, a1Var);
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i);
            i++;
            statusListener.onComplete(this.i);
        }
        this.e.clear();
    }

    private final R e() {
        R r;
        synchronized (this.a) {
            Preconditions.checkState(!this.j, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        v0 andSet = this.g.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return (R) Preconditions.checkNotNull(r);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@RecentlyNonNull PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (isReady()) {
                statusListener.onComplete(this.i);
            } else {
                this.e.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @RecentlyNonNull
    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        Preconditions.checkState(!this.j, "Result has already been consumed");
        Preconditions.checkState(this.n == null, "Cannot await if then() has been called.");
        try {
            this.d.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) e();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.a) {
            if (!this.k && !this.j) {
                ICancelToken iCancelToken = this.m;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zaa(this.h);
                this.k = true;
                d(createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public abstract R createFailedResult(@RecentlyNonNull Status status);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(@RecentlyNonNull Status status) {
        synchronized (this.a) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.l = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        boolean z;
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.d.getCount() == 0;
    }

    @KeepForSdk
    public final void setCancelToken(@RecentlyNonNull ICancelToken iCancelToken) {
        synchronized (this.a) {
            this.m = iCancelToken;
        }
    }

    @KeepForSdk
    public final void setResult(@RecentlyNonNull R r) {
        synchronized (this.a) {
            if (this.l || this.k) {
                zaa(r);
                return;
            }
            isReady();
            boolean z = true;
            Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.j) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            d(r);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@Nullable ResultCallback<? super R> resultCallback) {
        synchronized (this.a) {
            try {
                if (resultCallback == null) {
                    this.f = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.j, "Result has already been consumed.");
                if (this.n != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.b.zaa(resultCallback, e());
                } else {
                    this.f = resultCallback;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @RecentlyNonNull
    public <S extends Result> TransformedResult<S> then(@RecentlyNonNull ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> transformedResultThen;
        Preconditions.checkState(!this.j, "Result has already been consumed.");
        synchronized (this.a) {
            Preconditions.checkState(this.n == null, "Cannot call then() twice.");
            Preconditions.checkState(this.f == null, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(this.k ? false : true, "Cannot call then() if result was canceled.");
            this.o = true;
            this.n = new zacn<>(this.c);
            transformedResultThen = this.n.then(resultTransform);
            if (isReady()) {
                this.b.zaa(this.n, e());
            } else {
                this.f = this.n;
            }
        }
        return transformedResultThen;
    }

    public final boolean zaa() {
        boolean zIsCanceled;
        synchronized (this.a) {
            if (this.c.get() == null || !this.o) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    public final void zab() {
        this.o = this.o || p.get().booleanValue();
    }

    public final void zaa(@Nullable v0 v0Var) {
        this.g.set(v0Var);
    }

    public static void zaa(@Nullable Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @RecentlyNonNull
    public final R await(long j, @RecentlyNonNull TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.checkState(!this.j, "Result has already been consumed.");
        Preconditions.checkState(this.n == null, "Cannot await if then() has been called.");
        try {
            if (!this.d.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) e();
    }

    @KeepForSdk
    public BasePendingResult(@Nullable GoogleApiClient googleApiClient) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.o = false;
        this.b = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.c = new WeakReference<>(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@RecentlyNonNull ResultCallback<? super R> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit) {
        synchronized (this.a) {
            try {
                if (resultCallback == null) {
                    this.f = null;
                    return;
                }
                boolean z = true;
                Preconditions.checkState(!this.j, "Result has already been consumed.");
                if (this.n != null) {
                    z = false;
                }
                Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.b.zaa(resultCallback, e());
                } else {
                    this.f = resultCallback;
                    CallbackHandler<R> callbackHandler = this.b;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(@RecentlyNonNull Looper looper) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.o = false;
        this.b = new CallbackHandler<>(looper);
        this.c = new WeakReference<>(null);
    }

    @VisibleForTesting
    @KeepForSdk
    public BasePendingResult(@RecentlyNonNull CallbackHandler<R> callbackHandler) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.g = new AtomicReference<>();
        this.o = false;
        this.b = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.c = new WeakReference<>(null);
    }
}
