package com.xiaomi.fitness.sleep.trace.sampling;

import android.content.Context;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u000fH'J\u0017\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0004¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u000f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rJ\b\u0010\u001d\u001a\u00020\u000fH\u0007J\b\u0010\u001e\u001a\u00020\u000fH\u0007R\u0014\u0010\u0007\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingTask;", "T", "", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "mStart", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mSamplingCallback", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingCallback;", LifecycleConstantKt.ON_START, "", LifecycleConstantKt.ON_STOP, "type", "", "getType", "()Ljava/lang/String;", "inputSamplingData", "data", "(Ljava/lang/Object;)V", "setSamplingCallback", "callback", "isStart", "", "()Z", "startIfNeed", "stopIfNeed", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SamplingTask<T> {

    @NotNull
    private final Context applicationContext;

    @Nullable
    private SamplingCallback<T> mSamplingCallback;

    @NotNull
    private final AtomicBoolean mStart;

    public SamplingTask(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.applicationContext = ApplicationExtKt.getSafeContext(ctx);
        this.mStart = new AtomicBoolean();
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @NotNull
    public abstract String getType();

    public final void inputSamplingData(@Nullable T data) {
        SamplingCallback<T> samplingCallback = this.mSamplingCallback;
        if (samplingCallback != null) {
            samplingCallback.onCallback(getType(), data);
        }
    }

    public final boolean isStart() {
        return this.mStart.get();
    }

    public abstract void onStart();

    public abstract void onStop();

    public final void setSamplingCallback(@Nullable SamplingCallback<T> callback) {
        this.mSamplingCallback = callback;
    }

    public final void startIfNeed() {
        if (this.mStart.compareAndSet(false, true)) {
            onStart();
        }
    }

    public final void stopIfNeed() {
        if (this.mStart.compareAndSet(true, false)) {
            onStop();
        }
    }
}
