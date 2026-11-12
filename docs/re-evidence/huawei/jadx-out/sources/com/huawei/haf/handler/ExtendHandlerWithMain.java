package com.huawei.haf.handler;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class ExtendHandlerWithMain implements ExtendHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler.Callback f5946a;
    private final TaskHandler e;

    @Override // com.huawei.haf.handler.ExtendHandler
    public void quit(boolean z) {
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void postTask(Runnable runnable) {
        TaskHandler taskHandler = this.e;
        taskHandler.b(Message.obtain(taskHandler, runnable), 0L, this.f5946a);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void postTask(Runnable runnable, long j) {
        TaskHandler taskHandler = this.e;
        taskHandler.b(Message.obtain(taskHandler, runnable), j, this.f5946a);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendEmptyMessage(int i) {
        e(Message.obtain(this.e, i), this.f5946a, 0L);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendEmptyMessage(int i, long j) {
        e(Message.obtain(this.e, i), this.f5946a, j);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendMessage(Message message) {
        e(message, this.f5946a, 0L);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendMessage(Message message, long j) {
        e(message, this.f5946a, j);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public boolean hasMessages(int i) {
        return this.e.hasMessages(i, this.f5946a);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void removeTasks(Runnable runnable) {
        this.e.removeCallbacks(runnable, this.f5946a);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void removeMessages(int i) {
        this.e.removeMessages(i, this.f5946a);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void removeTasksAndMessages() {
        this.e.removeCallbacksAndMessages(this.f5946a);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        TaskHandler taskHandler = this.e;
        taskHandler.b(Message.obtain(taskHandler, runnable), 0L, this.f5946a);
    }

    private void e(Message message, Handler.Callback callback, long j) {
        if (message.getCallback() == null && (callback instanceof HandlerCenter.OnlyTaskHandlerCallback)) {
            throw new UnsupportedOperationException("The Handler.Callback used does not support processing Message.what messages");
        }
        this.e.b(message, j, this.f5946a);
    }
}
