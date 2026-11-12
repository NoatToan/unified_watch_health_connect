package com.mapbox.common;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import o53.c1;
import p005kotlin.Metadata;
import t13.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/SchedulerExecutorDispatcher;", "Lo53/c1;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "block", "", "dispatch", "(Lt13/g;Ljava/lang/Runnable;)V", "close", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SchedulerExecutorDispatcher extends c1 {
    private final Executor executor;

    public SchedulerExecutorDispatcher(Executor executor) {
        executor.getClass();
        this.executor = executor;
    }

    @Override // o53.c1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o53.z
    public void dispatch(g context, Runnable block) {
        context.getClass();
        block.getClass();
        getExecutor().execute(block);
    }

    @Override // o53.c1
    public Executor getExecutor() {
        return this.executor;
    }
}
