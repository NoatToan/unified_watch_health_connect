package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import defpackage.jy0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@AnyThread
public class ConfigCacheClient {
    public static final long d = 5;

    @GuardedBy("ConfigCacheClient.class")
    private static final Map<String, ConfigCacheClient> e = new HashMap();
    private static final Executor f = jy0.a;
    private final ExecutorService a;
    private final ConfigStorageClient b;

    @Nullable
    @GuardedBy("this")
    private Task<ConfigContainer> c = null;

    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        public void a() throws InterruptedException {
            this.a.await();
        }

        public boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    private ConfigCacheClient(ExecutorService executorService, ConfigStorageClient configStorageClient) {
        this.a = executorService;
        this.b = configStorageClient;
    }

    private static <TResult> TResult c(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.b(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void f(ConfigContainer configContainer) throws Exception {
        return this.b.write(configContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task g(boolean z, ConfigContainer configContainer, Void r3) throws Exception {
        if (z) {
            h(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    public static synchronized ConfigCacheClient getInstance(ExecutorService executorService, ConfigStorageClient configStorageClient) {
        String strA;
        Map<String, ConfigCacheClient> map;
        strA = configStorageClient.a();
        map = e;
        if (!map.containsKey(strA)) {
            map.put(strA, new ConfigCacheClient(executorService, configStorageClient));
        }
        return map.get(strA);
    }

    private synchronized void h(ConfigContainer configContainer) {
        this.c = Tasks.forResult(configContainer);
    }

    public void clear() {
        synchronized (this) {
            this.c = Tasks.forResult(null);
        }
        this.b.clear();
    }

    @Nullable
    @VisibleForTesting
    public ConfigContainer d(long j) {
        synchronized (this) {
            Task<ConfigContainer> task = this.c;
            if (task != null && task.isSuccessful()) {
                return this.c.getResult();
            }
            try {
                return (ConfigContainer) c(get(), j, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.d(FirebaseRemoteConfig.TAG, "Reading from storage file failed.", e2);
                return null;
            }
        }
    }

    @Nullable
    @VisibleForTesting
    public synchronized Task<ConfigContainer> e() {
        return this.c;
    }

    public synchronized Task<ConfigContainer> get() {
        Task<ConfigContainer> task = this.c;
        if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
            ExecutorService executorService = this.a;
            final ConfigStorageClient configStorageClient = this.b;
            Objects.requireNonNull(configStorageClient);
            this.c = Tasks.call(executorService, new Callable() { // from class: iy0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return configStorageClient.read();
                }
            });
        }
        return this.c;
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return d(5L);
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.a, new Callable() { // from class: hy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.f(configContainer);
            }
        }).onSuccessTask(this.a, new SuccessContinuation() { // from class: gy0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.a.g(z, configContainer, (Void) obj);
            }
        });
    }
}
