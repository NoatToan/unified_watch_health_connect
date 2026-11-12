package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.u;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8327b;
    public final b c;
    public final AudioManager d;
    public c e;
    public int f;
    public int g;
    public boolean h;

    public interface b {
        void h(int i);

        void q(int i, boolean z);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = u.this.f8327b;
            final u uVar = u.this;
            handler.post(new Runnable() { // from class: cjo
                @Override // java.lang.Runnable
                public final void run() {
                    u.b(uVar);
                }
            });
        }
    }

    public u(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8326a = applicationContext;
        this.f8327b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) rk1.i((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = f(audioManager, 3);
        this.h = e(audioManager, this.f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e) {
            toe.i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static /* synthetic */ void b(u uVar) {
        uVar.i();
    }

    public static boolean e(AudioManager audioManager, int i) {
        if (wlq.f38110a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return f(audioManager, i) == 0;
    }

    public static int f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            toe.i("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public int c() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int d() {
        if (wlq.f38110a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.f8326a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                toe.i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    public void h(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        i();
        this.c.h(i);
    }

    public final void i() {
        int iF = f(this.d, this.f);
        boolean zE = e(this.d, this.f);
        if (this.g == iF && this.h == zE) {
            return;
        }
        this.g = iF;
        this.h = zE;
        this.c.q(iF, zE);
    }
}
