package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MLTaskExecutor {
    private static final Object zza = new Object();
    private static MLTaskExecutor zzb;
    private final Handler zzc;

    private MLTaskExecutor(Looper looper) {
        this.zzc = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    @KeepForSdk
    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    zzb = new MLTaskExecutor(handlerThread.getLooper());
                }
                mLTaskExecutor = zzb;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mLTaskExecutor;
    }

    @KeepForSdk
    public static Executor workerThreadExecutor() {
        return zzh.zza;
    }

    @KeepForSdk
    public Handler getHandler() {
        return this.zzc;
    }

    @KeepForSdk
    public <ResultT> Task<ResultT> scheduleCallable(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        scheduleRunnable(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e4) {
                    taskCompletionSource2.setException(e4);
                } catch (Exception e14) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e14));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public void scheduleRunnable(Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    @KeepForSdk
    public void scheduleRunnableDelayed(Runnable runnable, long j8) {
        this.zzc.postDelayed(runnable, j8);
    }

    @KeepForSdk
    public <ResultT> Task<ResultT> scheduleTaskCallable(Callable<Task<ResultT>> callable) {
        return (Task<ResultT>) scheduleCallable(callable).continueWithTask(zzaw.zza(), new Continuation() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (Task) task.getResult();
            }
        });
    }
}
