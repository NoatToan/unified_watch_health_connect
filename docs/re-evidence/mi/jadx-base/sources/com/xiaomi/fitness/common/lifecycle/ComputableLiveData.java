package com.xiaomi.fitness.common.lifecycle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.lifecycle.ComputableLiveData;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/ComputableLiveData;", "T", "", "computeCallback", "Lcom/xiaomi/fitness/common/lifecycle/OnCompute;", "computeOnMainThread", "", "<init>", "(Lcom/xiaomi/fitness/common/lifecycle/OnCompute;Z)V", "mComputeCallback", "mComputeOnMainThread", "mInvalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mComputing", "mLiveData", "Landroidx/lifecycle/MutableLiveData;", "mComputeTask", "Ljava/lang/Runnable;", "asLiveData", "Landroidx/lifecycle/LiveData;", "invalidate", "", "startCompute", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComputableLiveData<T> {

    @NotNull
    private OnCompute<T> mComputeCallback;
    private final boolean mComputeOnMainThread;

    @NotNull
    private final Runnable mComputeTask;

    @NotNull
    private final AtomicBoolean mComputing;

    @NotNull
    private final AtomicBoolean mInvalid;

    @Nullable
    private MutableLiveData<T> mLiveData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComputableLiveData(@NotNull OnCompute<T> computeCallback) {
        this(computeCallback, false, 2, null);
        Intrinsics.checkNotNullParameter(computeCallback, "computeCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mComputeTask$lambda$0(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = false;
        do {
            if (this$0.mComputing.compareAndSet(false, true)) {
                T tOnCompute = null;
                while (this$0.mInvalid.compareAndSet(true, false)) {
                    try {
                        tOnCompute = this$0.mComputeCallback.onCompute();
                        z = true;
                    } catch (Throwable th) {
                        this$0.mComputing.compareAndSet(true, false);
                        throw th;
                    }
                }
                if (z) {
                    MutableLiveData<T> mutableLiveData = this$0.mLiveData;
                    Intrinsics.checkNotNull(mutableLiveData);
                    mutableLiveData.postValue(tOnCompute);
                }
                this$0.mComputing.compareAndSet(true, false);
            }
            if (!z) {
                return;
            }
        } while (this$0.mInvalid.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCompute() {
        if (this.mComputeOnMainThread) {
            ExecutorHelper.INSTANCE.runInMain(this.mComputeTask);
        } else {
            ExecutorHelper.runInBackground(this.mComputeTask);
        }
    }

    @NotNull
    public final LiveData<T> asLiveData() {
        if (this.mLiveData == null) {
            this.mLiveData = new MutableLiveData<T>(this) { // from class: com.xiaomi.fitness.common.lifecycle.ComputableLiveData.asLiveData.1
                final /* synthetic */ ComputableLiveData<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.lifecycle.LiveData
                public void onActive() {
                    super.onActive();
                    this.this$0.startCompute();
                }
            };
        }
        MutableLiveData<T> mutableLiveData = this.mLiveData;
        Intrinsics.checkNotNull(mutableLiveData);
        return mutableLiveData;
    }

    public final void invalidate() {
        if (this.mLiveData != null && this.mInvalid.compareAndSet(false, true)) {
            MutableLiveData<T> mutableLiveData = this.mLiveData;
            Intrinsics.checkNotNull(mutableLiveData);
            if (mutableLiveData.hasActiveObservers()) {
                startCompute();
            }
        }
    }

    @JvmOverloads
    public ComputableLiveData(@NotNull OnCompute<T> computeCallback, boolean z) {
        Intrinsics.checkNotNullParameter(computeCallback, "computeCallback");
        Objects.requireNonNull(computeCallback);
        Intrinsics.checkNotNullExpressionValue(computeCallback, "requireNonNull(...)");
        this.mComputeCallback = computeCallback;
        this.mComputeOnMainThread = z;
        this.mInvalid = new AtomicBoolean(true);
        this.mComputing = new AtomicBoolean(false);
        this.mComputeTask = new Runnable() { // from class: ya4
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.mComputeTask$lambda$0(this.f39974a);
            }
        };
    }

    public /* synthetic */ ComputableLiveData(OnCompute onCompute, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onCompute, (i & 2) != 0 ? false : z);
    }
}
