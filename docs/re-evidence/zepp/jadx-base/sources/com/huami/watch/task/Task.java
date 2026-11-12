package com.huami.watch.task;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/task/Task;", "Lcom/huami/watch/task/ITask;", "", "runTask", "task", "setNext", "getNext", "a", "Lcom/huami/watch/task/Task;", "next", "b", "Z", "resultMatters", "c", "Lcom/huami/watch/task/ITask;", "selfTask", "<init>", "(ZLcom/huami/watch/task/ITask;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public class Task implements ITask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Task next;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean resultMatters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ITask selfTask;

    public Task(boolean z, @NotNull ITask iTask) {
        this.resultMatters = z;
        this.selfTask = iTask;
    }

    @Nullable
    public final Task getNext() {
        return this.next;
    }

    @Override // com.huami.watch.task.ITask
    public boolean runTask() {
        Task task;
        boolean zRunTask = this.selfTask.runTask();
        if (this.resultMatters) {
            if (!zRunTask || (task = this.next) == null) {
                return false;
            }
            return task.runTask();
        }
        Task task2 = this.next;
        if (task2 != null) {
            return task2.runTask();
        }
        return false;
    }

    @Nullable
    public final Task setNext(@Nullable Task task) {
        this.next = task;
        return task;
    }
}
