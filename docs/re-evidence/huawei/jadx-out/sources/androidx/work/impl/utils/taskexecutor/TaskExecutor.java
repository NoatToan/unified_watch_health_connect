package androidx.work.impl.utils.taskexecutor;

import defpackage.asCoroutineDispatcher;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public interface TaskExecutor {
    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();

    default void executeOnTaskThread(Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    default CoroutineDispatcher getTaskCoroutineDispatcher() {
        return asCoroutineDispatcher.d(getSerialTaskExecutor());
    }
}
