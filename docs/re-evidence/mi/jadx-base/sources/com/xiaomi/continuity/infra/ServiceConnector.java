package com.xiaomi.continuity.infra;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.UserHandle;
import com.xiaomi.continuity.infra.ServiceConnector;
import defpackage.da1;
import defpackage.fdo;
import defpackage.j3s;
import defpackage.lkb;
import defpackage.uoe;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public interface ServiceConnector<I extends IInterface> {

    public static class Impl<I extends IInterface> extends ArrayDeque<a<I, ?>> implements ServiceConnector<I>, ServiceConnection, IBinder.DeathRecipient, Runnable {
        public static final boolean DEBUG = false;
        private static final long DEFAULT_DISCONNECT_TIMEOUT_MS = 15000;
        private static final long DEFAULT_REQUEST_TIMEOUT_MS = 30000;
        public static final String LOG_TAG = "ServiceConnector.Impl";
        private final Function<IBinder, I> mBinderAsInterface;
        private final int mBindingFlags;
        public final Context mContext;
        public final Executor mExecutor;
        private final Handler mHandler;
        private final Intent mIntent;
        private final Queue<a<I, ?>> mQueue = this;
        private final List<Impl<I>.a<I, ?>> mUnfinishedJobs = new ArrayList();
        private final Handler mMainHandler = new Handler(Looper.getMainLooper());
        private final ServiceConnection mServiceConnection = this;
        private final Runnable mTimeoutDisconnect = this;
        private volatile b<I> mServiceLifecycleCallbacks = null;
        private volatile I mService = null;
        private boolean mBinding = false;
        private boolean mUnbinding = false;
        private Impl<I>.a<I, I> mServiceConnectionFutureCache = null;

        public class a<II, R> extends da1<R> implements a<II, R>, BiConsumer<R, Throwable> {
            public a<II, R> h;
            public boolean i = false;

            public a() {
                long requestTimeoutMs = Impl.this.getRequestTimeoutMs();
                if (requestTimeoutMs > 0) {
                    orTimeout(requestTimeoutMs, TimeUnit.MILLISECONDS);
                }
            }

            @Override // defpackage.da1, java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                if (z) {
                    uoe.h(Impl.LOG_TAG, "mayInterruptIfRunning not supported - ignoring");
                }
                return super.cancel(z) || Impl.this.mQueue.remove(this);
            }

            @Override // defpackage.da1
            public void i(R r2, Throwable th) {
                super.i(r2, th);
                if (Impl.this.mUnfinishedJobs.remove(this)) {
                    Impl.this.maybeScheduleUnbindTimeout();
                }
            }

            @Override // com.xiaomi.continuity.infra.ServiceConnector.a
            public R run(II ii) {
                return this.h.run(ii);
            }

            @Override // java.util.function.BiConsumer
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void accept(R r2, Throwable th) {
                if (th != null) {
                    completeExceptionally(th);
                } else {
                    complete(r2);
                }
            }

            @Override // java.util.concurrent.CompletableFuture
            public String toString() {
                return this.h + " wrapped into " + super.toString();
            }
        }

        public Impl(Context context, Intent intent, int i, Function<IBinder, I> function) {
            this.mContext = context;
            this.mIntent = intent;
            this.mBindingFlags = i;
            this.mBinderAsInterface = function;
            Handler jobHandler = getJobHandler();
            this.mHandler = jobHandler;
            this.mExecutor = new lkb(jobHandler);
        }

        private boolean bindServiceInner(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler) {
            try {
                return ((Boolean) Context.class.getMethod(new String(fdo.f17686a) + new String(fdo.f17687b, 0, 2) + new String(fdo.c, 0, 4), Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class).invoke(context, intent, serviceConnection, Integer.valueOf(i), handler, Process.myUserHandle())).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
                return false;
            }
        }

        private void cancelTimeout() {
            this.mMainHandler.removeCallbacks(this.mTimeoutDisconnect);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <BASE, T extends BASE> T castOrNull(BASE base, Class<T> cls) {
            if (cls.isInstance(base)) {
                return base;
            }
            return null;
        }

        private void dispatchOnBinderDied() {
            b<I> bVar = this.mServiceLifecycleCallbacks;
            if (bVar != null) {
                bVar.h();
            }
        }

        private void dispatchOnServiceConnectionStatusChanged(I i, boolean z) {
            b<I> bVar = this.mServiceLifecycleCallbacks;
            if (bVar != null) {
                if (z) {
                    bVar.b(i);
                } else {
                    bVar.a(i);
                }
            }
            onServiceConnectionStatusChanged(i, z);
        }

        private boolean enqueue(final a<I, ?> aVar) {
            cancelTimeout();
            return this.mHandler.post(new Runnable() { // from class: iyl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22230a.lambda$enqueue$1(aVar);
                }
            });
        }

        private boolean isBound() {
            return this.mService != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ IInterface lambda$connect$0(IInterface iInterface) {
            return iInterface;
        }

        private void logTrace() {
            uoe.f(LOG_TAG, "See stacktrace", new Throwable());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeScheduleUnbindTimeout() {
            if (this.mUnfinishedJobs.isEmpty() && this.mQueue.isEmpty()) {
                scheduleUnbindTimeout();
            }
        }

        private void onTimeout() {
            unbind();
        }

        private void processQueue() {
            while (true) {
                a<I, ?> aVarPoll = this.mQueue.poll();
                if (aVarPoll == null) {
                    maybeScheduleUnbindTimeout();
                    return;
                }
                Impl<I>.a<I, ?> aVar = (a) castOrNull(aVarPoll, a.class);
                try {
                    I i = this.mService;
                    if (i == null) {
                        return;
                    }
                    Object objRun = aVarPoll.run(i);
                    if (aVar != null) {
                        if (aVar.i) {
                            this.mUnfinishedJobs.add(aVar);
                            ((CompletionStage) objRun).whenComplete(aVar);
                        } else {
                            aVar.complete(objRun);
                        }
                    }
                } catch (Throwable th) {
                    completeExceptionally(aVarPoll, th);
                }
            }
        }

        private void scheduleUnbindTimeout() {
            long autoDisconnectTimeoutMs = getAutoDisconnectTimeoutMs();
            if (autoDisconnectTimeoutMs > 0) {
                this.mMainHandler.postDelayed(this.mTimeoutDisconnect, autoDisconnectTimeoutMs);
            }
        }

        private String stateToString() {
            if (this.mBinding) {
                return "Binding...";
            }
            if (this.mUnbinding) {
                return "Unbinding...";
            }
            return isBound() ? "Bound" : "Unbound";
        }

        public boolean bindService(ServiceConnection serviceConnection) {
            int i = this.mBindingFlags | 1;
            return Build.VERSION.SDK_INT >= 29 ? this.mContext.bindService(this.mIntent, i, this.mExecutor, serviceConnection) : bindServiceInner(this.mContext, this.mIntent, serviceConnection, i, this.mHandler);
        }

        public I binderAsInterface(IBinder iBinder) {
            return this.mBinderAsInterface.apply(iBinder);
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.mService = null;
            unbind();
            dispatchOnBinderDied();
        }

        public void cancelPendingJobs() {
            while (true) {
                a<I, ?> aVarPoll = this.mQueue.poll();
                if (aVarPoll == null) {
                    return;
                }
                a aVar = (a) castOrNull(aVarPoll, a.class);
                if (aVar != null) {
                    try {
                        aVar.cancel(false);
                    } catch (Throwable th) {
                        StringBuilder sbA = j3s.a("cancelPendingJobs exception :");
                        sbA.append(th.getMessage());
                        uoe.b(LOG_TAG, sbA.toString());
                        aVar.p();
                    }
                }
            }
        }

        public void completeExceptionally(a<?, ?> aVar, Throwable th) {
            a aVar2 = (a) castOrNull(aVar, a.class);
            if (aVar2 != null) {
                aVar2.completeExceptionally(th);
            }
            if (aVar2 != null) {
                return;
            }
            uoe.c(LOG_TAG, "Job failed: " + aVar, th);
        }

        public synchronized da1<I> connect() {
            try {
                if (this.mServiceConnectionFutureCache == null) {
                    Impl<I>.a<I, I> aVar = new a<>();
                    this.mServiceConnectionFutureCache = aVar;
                    aVar.h = new a() { // from class: hyl
                        @Override // com.xiaomi.continuity.infra.ServiceConnector.a
                        public final Object run(Object obj) {
                            return ServiceConnector.Impl.lambda$connect$0((IInterface) obj);
                        }
                    };
                    I i = this.mService;
                    if (i != null) {
                        this.mServiceConnectionFutureCache.complete(i);
                    } else {
                        enqueue((Impl<I>.a<I, ?>) this.mServiceConnectionFutureCache);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.mServiceConnectionFutureCache;
        }

        public void dump(String str, PrintWriter printWriter) {
            printWriter.append((CharSequence) str).append("ServiceConnector:").println();
            printWriter.append((CharSequence) str).append("  ").append((CharSequence) String.valueOf(this.mIntent)).println();
            printWriter.append((CharSequence) str).append("  ").append("State: ").append((CharSequence) stateToString()).println();
            printWriter.append((CharSequence) str).append("  ").append("Pending jobs: ").append((CharSequence) String.valueOf(this.mQueue.size())).println();
            printWriter.append((CharSequence) str).append("  ").append("Unfinished async jobs: ").append((CharSequence) String.valueOf(this.mUnfinishedJobs.size())).println();
        }

        /* JADX INFO: renamed from: enqueueJobThread, reason: merged with bridge method [inline-methods] */
        public void lambda$enqueue$1(a<I, ?> aVar) {
            IllegalStateException illegalStateException;
            cancelTimeout();
            if (this.mUnbinding) {
                illegalStateException = new IllegalStateException("Service is unbinding. Ignoring " + aVar);
            } else {
                if (this.mQueue.offer(aVar)) {
                    if (isBound()) {
                        processQueue();
                        return;
                    }
                    if (this.mBinding) {
                        return;
                    }
                    if (bindService(this.mServiceConnection)) {
                        this.mBinding = true;
                        return;
                    }
                    StringBuilder sbA = j3s.a("Failed to bind to service ");
                    sbA.append(this.mIntent);
                    completeExceptionally(aVar, new IllegalStateException(sbA.toString()));
                    return;
                }
                illegalStateException = new IllegalStateException("Failed to add to queue: " + aVar);
            }
            completeExceptionally(aVar, illegalStateException);
        }

        public long getAutoDisconnectTimeoutMs() {
            return 15000L;
        }

        public Handler getJobHandler() {
            return this.mMainHandler;
        }

        public long getRequestTimeoutMs() {
            return 30000L;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            binderDied();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (this.mUnbinding) {
                uoe.e(LOG_TAG, "Ignoring onServiceConnected due to ongoing unbinding: " + this);
                return;
            }
            I i = (I) binderAsInterface(iBinder);
            this.mService = i;
            this.mBinding = false;
            try {
                iBinder.linkToDeath(this, 0);
            } catch (RemoteException e) {
                uoe.c(LOG_TAG, "onServiceConnected " + componentName + ": ", e);
            }
            dispatchOnServiceConnectionStatusChanged(i, true);
            processQueue();
        }

        public void onServiceConnectionStatusChanged(I i, boolean z) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.mBinding = true;
            I i = this.mService;
            if (i != null) {
                dispatchOnServiceConnectionStatusChanged(i, false);
                this.mService = null;
            }
        }

        public void onServiceUnbound() {
        }

        public da1<Void> post(c<I> cVar) {
            return postForResult((a) cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <R> da1<R> postAsync(a<I, CompletableFuture<R>> aVar) {
            Impl<I>.a<I, ?> aVar2 = new a<>();
            Objects.requireNonNull(aVar);
            aVar2.h = aVar;
            aVar2.i = true;
            enqueue(aVar2);
            return aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            onTimeout();
        }

        @Override // com.xiaomi.continuity.infra.ServiceConnector
        public void setServiceLifecycleCallbacks(b<I> bVar) {
            this.mServiceLifecycleCallbacks = bVar;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder("ServiceConnector@");
            sb.append(System.identityHashCode(this) % 1000);
            sb.append("(");
            sb.append(")[");
            sb.append(stateToString());
            if (!this.mQueue.isEmpty()) {
                sb.append(", ");
                sb.append(this.mQueue.size());
                sb.append(" pending job(s)");
            }
            if (!this.mUnfinishedJobs.isEmpty()) {
                sb.append(", ");
                sb.append(this.mUnfinishedJobs.size());
                sb.append(" unfinished async job(s)");
            }
            sb.append("]");
            return sb.toString();
        }

        @Override // com.xiaomi.continuity.infra.ServiceConnector
        public void unbind() {
            this.mUnbinding = true;
            this.mHandler.post(new Runnable() { // from class: jyl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23249a.unbindJobThread();
                }
            });
        }

        public void unbindJobThread() {
            cancelTimeout();
            I i = this.mService;
            boolean z = i != null;
            if (z || this.mBinding) {
                try {
                    this.mContext.unbindService(this.mServiceConnection);
                } catch (IllegalArgumentException e) {
                    uoe.b(LOG_TAG, "Failed to unbind: " + e);
                }
            }
            if (z) {
                dispatchOnServiceConnectionStatusChanged(i, false);
                try {
                    i.asBinder().unlinkToDeath(this, 0);
                } catch (NoSuchElementException e2) {
                    uoe.c(LOG_TAG, "death recipient already released", e2);
                }
                this.mService = null;
            }
            this.mBinding = false;
            this.mUnbinding = false;
            synchronized (this) {
                try {
                    Impl<I>.a<I, I> aVar = this.mServiceConnectionFutureCache;
                    if (aVar != null) {
                        aVar.cancel(true);
                        this.mServiceConnectionFutureCache = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            cancelPendingJobs();
            if (z) {
                onServiceUnbound();
            }
        }

        private void enqueue(Impl<I>.a<I, ?> aVar) {
            if (enqueue(aVar)) {
                return;
            }
            StringBuilder sbA = j3s.a("Failed to post a job to handler. Likely ");
            sbA.append(this.mHandler.getLooper());
            sbA.append(" is exiting");
            aVar.completeExceptionally(new IllegalStateException(sbA.toString()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.continuity.infra.ServiceConnector
        public <R> Impl<I>.a<I, R> postForResult(a<I, R> aVar) {
            Impl<I>.a<I, R> aVar2 = new a<>();
            Objects.requireNonNull(aVar);
            aVar2.h = aVar;
            enqueue((Impl<I>.a<I, ?>) aVar2);
            return aVar2;
        }

        public boolean run(c<I> cVar) {
            return enqueue(cVar);
        }
    }

    @FunctionalInterface
    public interface a<II, R> {
        R run(II ii);
    }

    public interface b<II extends IInterface> {
        default void a(II ii) {
        }

        default void b(II ii) {
        }

        default void h() {
        }
    }

    @FunctionalInterface
    public interface c<II> extends a<II, Void> {
    }

    <R> da1<R> postForResult(a<I, R> aVar);

    void setServiceLifecycleCallbacks(b<I> bVar);

    void unbind();
}
