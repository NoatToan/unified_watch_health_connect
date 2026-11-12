package com.huami.training.helper;

import android.os.Handler;
import android.os.Looper;
import com.tekartik.sqflite.Constant;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/training/helper/AppExecutors;", "", "Ljava/util/concurrent/Executor;", "diskIO", "networkIO", "mainThread", "a", "Ljava/util/concurrent/Executor;", "b", "c", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class AppExecutors {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Executor diskIO;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Executor networkIO;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Executor mainThread;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/huami/training/helper/AppExecutors$a", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", Constant.METHOD_EXECUTE, "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mainThreadHandler", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Executor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            this.mainThreadHandler.post(command);
        }
    }

    public AppExecutors(@NotNull Executor executor, @NotNull Executor executor2, @NotNull Executor executor3) {
        this.diskIO = executor;
        this.networkIO = executor2;
        this.mainThread = executor3;
    }

    @NotNull
    /* JADX INFO: renamed from: diskIO, reason: from getter */
    public final Executor getDiskIO() {
        return this.diskIO;
    }

    @NotNull
    /* JADX INFO: renamed from: mainThread, reason: from getter */
    public final Executor getMainThread() {
        return this.mainThread;
    }

    @NotNull
    /* JADX INFO: renamed from: networkIO, reason: from getter */
    public final Executor getNetworkIO() {
        return this.networkIO;
    }

    public AppExecutors() {
        this(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(3), new a());
    }
}
