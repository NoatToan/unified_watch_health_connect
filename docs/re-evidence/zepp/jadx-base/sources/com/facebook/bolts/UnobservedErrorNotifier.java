package com.facebook.bolts;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0004\u001a\u00020\u0002R\u001c\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/bolts/UnobservedErrorNotifier;", "", "", "finalize", "setObserved", "Lcom/facebook/bolts/Task;", "a", "Lcom/facebook/bolts/Task;", "task", "<init>", "(Lcom/facebook/bolts/Task;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UnobservedErrorNotifier {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Task<?> task;

    public UnobservedErrorNotifier(@Nullable Task<?> task) {
        this.task = task;
    }

    @VisibleForTesting(otherwise = 4)
    public final void finalize() {
        Task.UnobservedExceptionHandler unobservedExceptionHandler;
        Task<?> task = this.task;
        if (task == null || (unobservedExceptionHandler = Task.INSTANCE.getUnobservedExceptionHandler()) == null) {
            return;
        }
        unobservedExceptionHandler.unobservedException(task, new UnobservedTaskException(task.getError()));
    }

    public final void setObserved() {
        this.task = null;
    }
}
