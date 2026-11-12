package com.chad.library.adapter.base.diff;

import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.h;
import com.xiaomi.onetrack.OneTrack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011B'\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "T", "", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor", "()Ljava/util/concurrent/Executor;", "backgroundThreadExecutor", "getBackgroundThreadExecutor", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "Landroidx/recyclerview/widget/h$f;", "getDiffCallback", "()Landroidx/recyclerview/widget/h$f;", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/h$f;)V", "Builder", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public final class BrvahAsyncDifferConfig<T> {

    @NotNull
    private final Executor backgroundThreadExecutor;

    @NotNull
    private final h.f<T> diffCallback;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    private final Executor mainThreadExecutor;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0013*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0013B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "setMainThreadExecutor", "(Ljava/util/concurrent/Executor;)Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig$Builder;", "setBackgroundThreadExecutor", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", OneTrack.Param.BUILD, "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "mBackgroundThreadExecutor", "Landroidx/recyclerview/widget/h$f;", "mDiffCallback", "Landroidx/recyclerview/widget/h$f;", "<init>", "(Landroidx/recyclerview/widget/h$f;)V", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
    public static final class Builder<T> {
        private static Executor sDiffExecutor;
        private Executor mBackgroundThreadExecutor;
        private final h.f<T> mDiffCallback;
        private Executor mMainThreadExecutor;
        private static final Object sExecutorLock = new Object();

        public Builder(@NotNull h.f<T> fVar) {
            this.mDiffCallback = fVar;
        }

        @NotNull
        public final BrvahAsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    try {
                        if (sDiffExecutor == null) {
                            sDiffExecutor = Executors.newFixedThreadPool(2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            Executor executor = this.mMainThreadExecutor;
            Executor executor2 = this.mBackgroundThreadExecutor;
            if (executor2 == null) {
                Intrinsics.throwNpe();
            }
            return new BrvahAsyncDifferConfig<>(executor, executor2, this.mDiffCallback);
        }

        @NotNull
        public final Builder<T> setBackgroundThreadExecutor(@Nullable Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        @NotNull
        public final Builder<T> setMainThreadExecutor(@Nullable Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    public BrvahAsyncDifferConfig(@Nullable Executor executor, @NotNull Executor executor2, @NotNull h.f<T> fVar) {
        this.mainThreadExecutor = executor;
        this.backgroundThreadExecutor = executor2;
        this.diffCallback = fVar;
    }

    @NotNull
    public final Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    @NotNull
    public final h.f<T> getDiffCallback() {
        return this.diffCallback;
    }

    @Nullable
    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }
}
