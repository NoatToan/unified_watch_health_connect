package kotlinx.coroutines.scheduling;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.extractor.mp3.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.e;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0016\u0010\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00048\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u00078\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00078\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0016\u0010\f\u001a\u00020\u00048\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0016\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\t\"\u0016\u0010\u0011\u001a\u00020\u00078\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\t\"\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00128À\u0002@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "DEFAULT_DISPATCHER_NAME", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "WORK_STEALING_TIME_RESOLUTION_NS", "J", "", "BLOCKING_DEFAULT_PARALLELISM", LogUtil.I, "CORE_POOL_SIZE", "MAX_POOL_SIZE", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "Lkotlinx/coroutines/scheduling/Task;", "", "isBlocking", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class TasksKt {

    @JvmField
    public static final int CORE_POOL_SIZE;

    @NotNull
    public static final String DEFAULT_DISPATCHER_NAME = "Dispatchers.Default";

    @NotNull
    public static final String DEFAULT_SCHEDULER_NAME = "DefaultDispatcher";

    @JvmField
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;

    @JvmField
    public static final int MAX_POOL_SIZE;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;

    @JvmField
    @NotNull
    public static SchedulerTimeSource schedulerTimeSource;

    @JvmField
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = d.e("kotlinx.coroutines.scheduler.resolution.ns", b.e, 0, 0, 12, null);

    @JvmField
    public static final int BLOCKING_DEFAULT_PARALLELISM = d.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);

    static {
        int iD = d.d("kotlinx.coroutines.scheduler.core.pool.size", e.coerceAtLeast(SystemPropsKt.getAVAILABLE_PROCESSORS(), 2), 1, 0, 8, null);
        CORE_POOL_SIZE = iD;
        MAX_POOL_SIZE = d.d("kotlinx.coroutines.scheduler.max.pool.size", e.coerceIn(SystemPropsKt.getAVAILABLE_PROCESSORS() * 128, iD, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE), 0, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 4, null);
        IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(d.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        schedulerTimeSource = NanoTimeSource.INSTANCE;
    }

    public static final boolean isBlocking(@NotNull Task task) {
        return task.taskContext.getTaskMode() == 1;
    }
}
