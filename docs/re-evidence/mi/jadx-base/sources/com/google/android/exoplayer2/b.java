package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7859b;
    public boolean c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0183b f7860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f7861b;

        public a(Handler handler, InterfaceC0183b interfaceC0183b) {
            this.f7861b = handler;
            this.f7860a = interfaceC0183b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f7861b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.c) {
                this.f7860a.a();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0183b {
        void a();
    }

    public b(Context context, Handler handler, InterfaceC0183b interfaceC0183b) {
        this.f7858a = context.getApplicationContext();
        this.f7859b = new a(handler, interfaceC0183b);
    }

    public void b(boolean z) {
        if (z && !this.c) {
            this.f7858a.registerReceiver(this.f7859b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.f7858a.unregisterReceiver(this.f7859b);
            this.c = false;
        }
    }
}
