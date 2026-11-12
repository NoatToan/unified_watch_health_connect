package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class AudioBecomingNoisyManager {
    private final Context a;
    private final a b;
    private boolean c;

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public final class a extends BroadcastReceiver implements Runnable {
        private final EventListener a;
        private final Handler b;

        public a(Handler eventHandler, EventListener listener) {
            this.b = eventHandler;
            this.a = listener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.c) {
                this.a.onAudioBecomingNoisy();
            }
        }
    }

    public AudioBecomingNoisyManager(Context context, Handler eventHandler, EventListener listener) {
        this.a = context.getApplicationContext();
        this.b = new a(eventHandler, listener);
    }

    public void b(boolean enabled) {
        if (enabled && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (enabled || !this.c) {
                return;
            }
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
