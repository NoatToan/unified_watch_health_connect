package com.hm.sport.player;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class f {
    private Context a;
    private volatile Looper b;
    private volatile a c;
    private com.hm.sport.player.a d;

    public final class a extends Handler {
        public static final int b = 1;
        public static final int c = 2;

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            f.this.c(message);
        }
    }

    public f(Context context, com.hm.sport.player.a aVar) {
        this.a = null;
        this.d = null;
        this.a = context;
        this.d = aVar;
        HandlerThread handlerThread = new HandlerThread("PlayTask", -16);
        handlerThread.start();
        this.b = handlerThread.getLooper();
        this.c = new a(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) throws Throwable {
        int i = message.what;
        if (i != 1) {
            if (i == 2 && this.b != null) {
                this.b.quit();
                return;
            }
            return;
        }
        Object obj = message.obj;
        if (obj instanceof PlayCommand) {
            PlayCommand playCommand = (PlayCommand) obj;
            this.d.a(playCommand.getId(), e.a(this.a, playCommand.getDataList(), playCommand.getId(), this.d));
        }
    }

    public void b(boolean z) {
        if (z) {
            this.c.removeMessages(1);
        }
        this.c.sendEmptyMessage(2);
    }

    public void d(PlayCommand playCommand) {
        if (playCommand == null) {
            throw new IllegalArgumentException();
        }
        Message messageObtainMessage = this.c.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = playCommand;
        this.c.sendMessage(messageObtainMessage);
    }
}
