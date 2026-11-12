package com.huami.watch.task;

import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0013\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/watch/task/TaskQueue;", "", "Lcom/huami/watch/task/Task;", "task", "addTask", "", "runTasks", "a", "Lcom/huami/watch/task/Task;", b.o, "<init>", "(Lcom/huami/watch/task/Task;)V", "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class TaskQueue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Task head;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/watch/task/TaskQueue$Companion;", "", "", "Lcom/huami/watch/task/Task;", "tasks", "Lcom/huami/watch/task/TaskQueue;", "of", "([Lcom/huami/watch/task/Task;)Lcom/huami/watch/task/TaskQueue;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final TaskQueue of(@NotNull Task... tasks) {
            Task task = null;
            for (Task task2 : ArraysKt___ArraysKt.reversed(tasks)) {
                task2.setNext(task);
                task = task2;
            }
            return new TaskQueue(task);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskQueue() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TaskQueue(@Nullable Task task) {
        this.head = task;
    }

    @NotNull
    public final TaskQueue addTask(@NotNull Task task) {
        Task next = this.head;
        if (next == null) {
            this.head = task;
        } else {
            while (true) {
                if ((next != null ? next.getNext() : null) == null) {
                    break;
                }
                next = next.getNext();
            }
            if (next != null) {
                next.setNext(task);
            }
        }
        return this;
    }

    public final boolean runTasks() {
        Task task = this.head;
        if (task != null) {
            return task.runTask();
        }
        return false;
    }

    public /* synthetic */ TaskQueue(Task task, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : task);
    }
}
