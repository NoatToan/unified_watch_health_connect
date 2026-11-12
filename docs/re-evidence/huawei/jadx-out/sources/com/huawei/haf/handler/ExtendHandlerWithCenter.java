package com.huawei.haf.handler;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class ExtendHandlerWithCenter implements ExtendHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerCenter f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler.Callback f5945b;
    private final String d;

    ExtendHandlerWithCenter(HandlerCenter handlerCenter, Handler.Callback callback, String str) {
        this.f5944a = handlerCenter;
        this.f5945b = callback;
        this.d = str;
        if (callback instanceof BaseHandlerCallback) {
            ((BaseHandlerCallback) callback).setExtentHandler(this);
        }
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void postTask(Runnable runnable) {
        this.f5944a.c(runnable, this.f5945b, 0L, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void postTask(Runnable runnable, long j) {
        this.f5944a.c(runnable, this.f5945b, j, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendEmptyMessage(int i) {
        this.f5944a.c(Message.obtain((Handler) null, i), this.f5945b, 0L, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendEmptyMessage(int i, long j) {
        this.f5944a.c(Message.obtain((Handler) null, i), this.f5945b, j, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendMessage(Message message) {
        this.f5944a.c(message, this.f5945b, 0L, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void sendMessage(Message message, long j) {
        this.f5944a.c(message, this.f5945b, j, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public boolean hasMessages(int i) {
        return this.f5944a.a(i, this.f5945b, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void removeTasks(Runnable runnable) {
        this.f5944a.d(runnable, this.f5945b, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void removeMessages(int i) {
        this.f5944a.e(i, this.f5945b, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void removeTasksAndMessages() {
        this.f5944a.e(this.f5945b, this.d);
    }

    @Override // com.huawei.haf.handler.ExtendHandler
    public void quit(boolean z) {
        this.f5944a.b(this.d, z);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5944a.c(runnable, this.f5945b, 0L, this.d);
    }
}
