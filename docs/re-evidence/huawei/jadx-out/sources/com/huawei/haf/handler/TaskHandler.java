package com.huawei.haf.handler;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
class TaskHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5955a;

    protected void e(Message message) {
    }

    TaskHandler(Looper looper) {
        super(looper);
        this.f5955a = String.valueOf(System.identityHashCode(this));
    }

    protected final boolean b(Message message, long j, Handler.Callback callback) {
        b(message, callback);
        if (sendMessageDelayed(message, j)) {
            return true;
        }
        c(message);
        return false;
    }

    protected final String c() {
        return this.f5955a;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Handler.Callback callbackC = c(message);
        if (callbackC == null || !callbackC.handleMessage(message)) {
            super.dispatchMessage(message);
        }
        e(message);
    }

    private void b(Message message, Handler.Callback callback) {
        if (message.obj == this) {
            return;
        }
        if (message.obj != null) {
            message.getData().putBinder(this.f5955a, new MessageObjectWapper(message.obj));
        }
        message.obj = callback;
    }

    private Handler.Callback c(Message message) {
        if (message.obj == this) {
            return null;
        }
        Handler.Callback callback = message.obj instanceof Handler.Callback ? (Handler.Callback) message.obj : null;
        message.obj = null;
        Bundle bundlePeekData = message.peekData();
        if (bundlePeekData != null) {
            IBinder binder = bundlePeekData.getBinder(this.f5955a);
            if (binder instanceof MessageObjectWapper) {
                message.obj = ((MessageObjectWapper) binder).f5956c;
                bundlePeekData.remove(this.f5955a);
            }
        }
        return callback;
    }

    static class MessageObjectWapper extends Binder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f5956c;

        MessageObjectWapper(Object obj) {
            this.f5956c = obj;
        }
    }
}
