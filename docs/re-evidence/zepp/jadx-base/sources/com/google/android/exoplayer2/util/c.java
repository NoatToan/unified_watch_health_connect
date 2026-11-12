package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c implements HandlerWrapper {
    private static final int b = 50;

    @GuardedBy("messagePool")
    private static final List<b> c = new ArrayList(50);
    private final Handler a;

    public static final class b implements HandlerWrapper.Message {

        @Nullable
        private Message a;

        @Nullable
        private c b;

        private b() {
        }

        private void a() {
            this.a = null;
            this.b = null;
            c.c(this);
        }

        public boolean b(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.a));
            a();
            return zSendMessageAtFrontOfQueue;
        }

        public b c(Message message, c handler) {
            this.a = message;
            this.b = handler;
            return this;
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.b);
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.a)).sendToTarget();
            a();
        }
    }

    public c(Handler handler) {
        this.a = handler;
    }

    private static b b() {
        b bVar;
        List<b> list = c;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(b message) {
        List<b> list = c;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(message);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Looper getLooper() {
        return this.a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean hasMessages(int what) {
        return this.a.hasMessages(what);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int what) {
        return b().c(this.a.obtainMessage(what), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.a.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long delayMs) {
        return this.a.postDelayed(runnable, delayMs);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeCallbacksAndMessages(@Nullable Object token) {
        this.a.removeCallbacksAndMessages(token);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeMessages(int what) {
        this.a.removeMessages(what);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessage(int what) {
        return this.a.sendEmptyMessage(what);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int what, long uptimeMs) {
        return this.a.sendEmptyMessageAtTime(what, uptimeMs);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int what, int delayMs) {
        return this.a.sendEmptyMessageDelayed(what, delayMs);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((b) message).b(this.a);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int what, @Nullable Object obj) {
        return b().c(this.a.obtainMessage(what, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int what, int arg1, int arg2) {
        return b().c(this.a.obtainMessage(what, arg1, arg2), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int what, int arg1, int arg2, @Nullable Object obj) {
        return b().c(this.a.obtainMessage(what, arg1, arg2, obj), this);
    }
}
