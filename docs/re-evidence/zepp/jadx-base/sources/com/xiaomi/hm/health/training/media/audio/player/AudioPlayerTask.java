package com.xiaomi.hm.health.training.media.audio.player;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.training.media.audio.model.IPlayerListener;

/* JADX INFO: loaded from: classes21.dex */
public class AudioPlayerTask {
    private Context a;
    private IPlayerListener b;
    private Looper c;
    private a d;

    public final class a extends Handler {
        public static final int b = 1;
        public static final int c = 2;

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AudioPlayerTask.this.doMessage(message);
        }
    }

    public AudioPlayerTask(Context context, IPlayerListener iPlayerListener) {
        this.a = context;
        this.b = iPlayerListener;
        HandlerThread handlerThread = new HandlerThread("TrainingPlayer", -16);
        handlerThread.start();
        this.c = handlerThread.getLooper();
        this.d = new a(this.c);
    }

    public void doMessage(Message message) {
        Looper looper;
        int i = message.what;
        if (i != 1) {
            if (i == 2 && (looper = this.c) != null) {
                looper.quit();
                return;
            }
            return;
        }
        Object obj = message.obj;
        if (obj instanceof AudioRes) {
            this.b.onPrepared((AudioRes) message.obj, AudioPlayerCreator.play(this.a, (AudioRes) obj, this.b));
        }
    }

    public void quitPlayer() {
        this.d.removeMessages(1);
        this.d.sendEmptyMessage(2);
    }

    public void startPlayer(AudioRes audioRes) {
        if (audioRes == null) {
            throw new IllegalArgumentException();
        }
        Message messageObtainMessage = this.d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = audioRes;
        this.d.sendMessage(messageObtainMessage);
    }
}
