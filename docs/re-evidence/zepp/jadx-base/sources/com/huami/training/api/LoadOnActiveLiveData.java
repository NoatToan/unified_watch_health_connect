package com.huami.training.api;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.training.api.LoadOnActiveLiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/training/api/LoadOnActiveLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "", "onActive", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "loader", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", SnoreMonitorActivity.PAGE_STARTED, "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LoadOnActiveLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<T> loader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean started = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u000b"}, d2 = {"Lcom/huami/training/api/LoadOnActiveLiveData$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "loader", "Lcom/huami/training/api/LoadOnActiveLiveData;", "create", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> LoadOnActiveLiveData<T> create(@NotNull Executor executor, @NotNull Function0<? extends T> loader) {
            return new LoadOnActiveLiveData<>(executor, loader);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadOnActiveLiveData(@NotNull Executor executor, @NotNull Function0<? extends T> function0) {
        this.executor = executor;
        this.loader = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LoadOnActiveLiveData loadOnActiveLiveData) {
        loadOnActiveLiveData.postValue(loadOnActiveLiveData.loader.invoke());
    }

    @Override // androidx.p008lifecycle.LiveData
    public void onActive() {
        super.onActive();
        if (this.started.compareAndSet(false, true)) {
            this.executor.execute(new Runnable() { // from class: up4
                @Override // java.lang.Runnable
                public final void run() {
                    LoadOnActiveLiveData.b(this.a);
                }
            });
        }
    }
}
