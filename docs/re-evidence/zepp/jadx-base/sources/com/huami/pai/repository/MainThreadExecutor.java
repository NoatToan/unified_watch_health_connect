package com.huami.pai.repository;

import android.os.Handler;
import android.os.Looper;
import com.tekartik.sqflite.Constant;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/pai/repository/MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", Constant.METHOD_EXECUTE, "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mainThreadHandler", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MainThreadExecutor implements Executor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        this.mainThreadHandler.post(command);
    }
}
