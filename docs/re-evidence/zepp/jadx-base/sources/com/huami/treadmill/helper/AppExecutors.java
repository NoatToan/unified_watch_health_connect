package com.huami.treadmill.helper;

import android.os.Handler;
import android.os.Looper;
import com.tekartik.sqflite.Constant;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0015\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001c\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR$\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\nR$\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u0012\u0004\b\u0013\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huami/treadmill/helper/AppExecutors;", "Lcom/huami/treadmill/helper/AppExecutorsLocator;", "Ljava/util/concurrent/Executor;", "getNetworkExecutor", "getDiskIOExecutor", "getMainExecutor", "Lcom/huami/treadmill/helper/AppExecutors$a;", "a", "Lcom/huami/treadmill/helper/AppExecutors$a;", "getMAIN_EXECUTORS$annotations", "()V", "MAIN_EXECUTORS", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ExecutorService;", "getDISK_IO$annotations", "DISK_IO", "c", "getNETWORK_IO$annotations", "NETWORK_IO", "<init>", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class AppExecutors implements AppExecutorsLocator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final a MAIN_EXECUTORS = new a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ExecutorService DISK_IO = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ExecutorService NETWORK_IO = Executors.newFixedThreadPool(5);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/huami/treadmill/helper/AppExecutors$a", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", Constant.METHOD_EXECUTE, "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mainThreadHandler", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Executor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            this.mainThreadHandler.post(command);
        }
    }

    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    @Override // com.huami.treadmill.helper.AppExecutorsLocator
    @NotNull
    public Executor getDiskIOExecutor() {
        return this.DISK_IO;
    }

    @Override // com.huami.treadmill.helper.AppExecutorsLocator
    @NotNull
    public Executor getMainExecutor() {
        return this.MAIN_EXECUTORS;
    }

    @Override // com.huami.treadmill.helper.AppExecutorsLocator
    @NotNull
    public Executor getNetworkExecutor() {
        return this.NETWORK_IO;
    }
}
