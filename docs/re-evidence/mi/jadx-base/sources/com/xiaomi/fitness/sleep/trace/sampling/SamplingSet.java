package com.xiaomi.fitness.sleep.trace.sampling;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.xiaomi.fitness.sleep.trace.sampling.SamplingSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u0016\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007J\u0014\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0006\u0010\u001c\u001a\u00020\u0014J\u0016\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0014J\b\u0010%\u001a\u00020\u0014H\u0002R&\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingSet;", "T", "", "<init>", "()V", "mTasks", "", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingTask;", "mSamplingLock", "mMediatorCallback", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingSet$MediatorCallback;", "mStartSampling", "", "mSamplingDuration", "", "mSamplingThread", "Landroid/os/HandlerThread;", "mHandler", "Landroid/os/Handler;", "addTask", "", "task", "removeTask", "taskType", "addSamplingCallback", "callback", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingCallback;", "removeSamplingCallback", "startSampling", "setSamplingDuration", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "endSampling", "samplingHandler", "getSamplingHandler", "()Landroid/os/Handler;", "releaseSamplingHandler", "MediatorCallback", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSamplingSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SamplingSet.kt\ncom/xiaomi/fitness/sleep/trace/sampling/SamplingSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class SamplingSet<T> {

    @Nullable
    private Handler mHandler;
    private long mSamplingDuration;

    @Nullable
    private HandlerThread mSamplingThread;
    private boolean mStartSampling;

    @NotNull
    private final Map<SamplingTask<T>, SamplingTask<T>> mTasks = new ArrayMap();

    @NotNull
    private final Object mSamplingLock = new Object();

    @NotNull
    private final MediatorCallback<T> mMediatorCallback = new MediatorCallback<>();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingSet$MediatorCallback;", "T", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingCallback;", "<init>", "()V", "callbackSet", "", "getCallbackSet", "()Ljava/util/Set;", "onCallback", "", "type", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "addSource", "callback", "removeSource", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediatorCallback<T> implements SamplingCallback<T> {

        @NotNull
        private final Set<SamplingCallback<T>> callbackSet = new CopyOnWriteArraySet();

        public final void addSource(@NotNull SamplingCallback<T> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbackSet.add(callback);
        }

        @NotNull
        public final Set<SamplingCallback<T>> getCallbackSet() {
            return this.callbackSet;
        }

        @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingCallback
        public void onCallback(@NotNull String type, @Nullable T data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<SamplingCallback<T>> it = this.callbackSet.iterator();
            while (it.hasNext()) {
                it.next().onCallback(type, data);
            }
        }

        public final void removeSource(@NotNull SamplingCallback<T> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbackSet.remove(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endSampling$lambda$6$lambda$5(SamplingTask task) {
        Intrinsics.checkNotNullParameter(task, "$task");
        task.stopIfNeed();
    }

    private final Handler getSamplingHandler() {
        if (this.mSamplingThread == null) {
            HandlerThread handlerThread = new HandlerThread("sampling-task", 10);
            this.mSamplingThread = handlerThread;
            Intrinsics.checkNotNull(handlerThread);
            handlerThread.start();
            HandlerThread handlerThread2 = this.mSamplingThread;
            Intrinsics.checkNotNull(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            StringBuilder sb = new StringBuilder();
            sb.append(": mSamplingThread!!.looper=");
            sb.append(looper);
            HandlerThread handlerThread3 = this.mSamplingThread;
            Intrinsics.checkNotNull(handlerThread3);
            this.mHandler = new Handler(handlerThread3.getLooper());
        }
        return this.mHandler;
    }

    private final void releaseSamplingHandler() {
        HandlerThread handlerThread = this.mSamplingThread;
        if (handlerThread != null) {
            this.mHandler = null;
            Intrinsics.checkNotNull(handlerThread);
            handlerThread.quitSafely();
            this.mSamplingThread = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeTask$lambda$2$lambda$1(Ref.ObjectRef task) {
        Intrinsics.checkNotNullParameter(task, "$task");
        T t = task.element;
        Intrinsics.checkNotNull(t);
        ((SamplingTask) t).stopIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSampling$lambda$4$lambda$3(SamplingTask task) {
        Intrinsics.checkNotNullParameter(task, "$task");
        task.startIfNeed();
    }

    public final void addSamplingCallback(@NotNull SamplingCallback<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mMediatorCallback.addSource(callback);
    }

    public final void addTask(@NotNull SamplingTask<T> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Objects.requireNonNull(task);
        synchronized (this.mSamplingLock) {
            Map<SamplingTask<T>, SamplingTask<T>> map = this.mTasks;
            Intrinsics.checkNotNull(task);
            map.put(task, task);
        }
    }

    public final void endSampling() {
        synchronized (this.mSamplingLock) {
            try {
                if (this.mStartSampling) {
                    this.mStartSampling = false;
                    for (final SamplingTask<T> samplingTask : this.mTasks.keySet()) {
                        Handler samplingHandler = getSamplingHandler();
                        Intrinsics.checkNotNull(samplingHandler);
                        samplingHandler.post(new Runnable() { // from class: p9l
                            @Override // java.lang.Runnable
                            public final void run() {
                                SamplingSet.endSampling$lambda$6$lambda$5(samplingTask);
                            }
                        });
                    }
                    releaseSamplingHandler();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeSamplingCallback(@NotNull SamplingCallback<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mMediatorCallback.removeSource(callback);
    }

    public final void removeTask(@Nullable SamplingTask<T> taskType) {
        if (taskType == null) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.mSamplingLock) {
            try {
                SamplingTask<T> samplingTaskRemove = this.mTasks.remove(taskType);
                objectRef.element = samplingTaskRemove;
                if (samplingTaskRemove != null) {
                    Handler samplingHandler = getSamplingHandler();
                    Intrinsics.checkNotNull(samplingHandler);
                    samplingHandler.post(new Runnable() { // from class: n9l
                        @Override // java.lang.Runnable
                        public final void run() {
                            SamplingSet.removeTask$lambda$2$lambda$1(objectRef);
                        }
                    });
                }
                if (this.mTasks.isEmpty()) {
                    releaseSamplingHandler();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setSamplingDuration(long duration, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.mSamplingDuration = duration > 0 ? unit.toMillis(duration) : 0L;
    }

    public final void startSampling() {
        synchronized (this.mSamplingLock) {
            try {
                if (this.mStartSampling) {
                    return;
                }
                this.mStartSampling = true;
                for (final SamplingTask<T> samplingTask : this.mTasks.keySet()) {
                    samplingTask.setSamplingCallback(this.mMediatorCallback);
                    Handler samplingHandler = getSamplingHandler();
                    Intrinsics.checkNotNull(samplingHandler);
                    samplingHandler.post(new Runnable() { // from class: o9l
                        @Override // java.lang.Runnable
                        public final void run() {
                            SamplingSet.startSampling$lambda$4$lambda$3(samplingTask);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
