package okhttp3.internal.concurrent;

import am.j;
import e23.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "", "taskLog", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Le23/a;)V", "T", "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Le23/a;)Ljava/lang/Object;", "message", "log", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", "formatDuration", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TaskLoggerKt {
    public static final String formatDuration(long j8) {
        String strI;
        if (j8 <= -999500000) {
            strI = j.i((j8 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j8 <= -999500) {
            strI = j.i((j8 - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j8 <= 0) {
            strI = j.i((j8 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j8 < 999500) {
            strI = j.i((j8 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j8 < 999500000) {
            strI = j.i((j8 + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strI = j.i((j8 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        x0 x0Var = x0.f105818a;
        return String.format("%6s", Arrays.copyOf(new Object[]{strI}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(taskQueue.getName());
        sb3.append(' ');
        x0 x0Var = x0.f105818a;
        sb3.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb3.append(": ");
        sb3.append(task.getName());
        logger.fine(sb3.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a<? extends T> aVar) {
        long jNanoTime;
        task.getClass();
        taskQueue.getClass();
        aVar.getClass();
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = aVar.invoke();
            if (zIsLoggable) {
                long jNanoTime2 = taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime;
                StringBuilder sb3 = new StringBuilder("finished run in ");
            }
            return tInvoke;
        } finally {
            if (zIsLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a<String> aVar) {
        task.getClass();
        taskQueue.getClass();
        aVar.getClass();
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, aVar.invoke());
        }
    }
}
