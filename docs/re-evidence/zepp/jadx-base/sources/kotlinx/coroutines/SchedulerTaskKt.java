package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0080\b\"(\u0010\n\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0004j\u0002`\u00058@@\u0000X\u0080\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007*\f\b\u0000\u0010\u000b\"\u00020\u00042\u00020\u0004*\f\b\u0000\u0010\f\"\u00020\u00002\u00020\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskContext;", "Lkotlinx/coroutines/SchedulerTaskContext;", "", "afterTask", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "getTaskContext", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/TaskContext;", "getTaskContext$annotations", "(Lkotlinx/coroutines/scheduling/Task;)V", "taskContext", "SchedulerTask", "SchedulerTaskContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class SchedulerTaskKt {
    public static final void afterTask(@NotNull TaskContext taskContext) {
        taskContext.afterTask();
    }

    @NotNull
    public static final TaskContext getTaskContext(@NotNull Task task) {
        return task.taskContext;
    }

    public static /* synthetic */ void getTaskContext$annotations(Task task) {
    }
}
