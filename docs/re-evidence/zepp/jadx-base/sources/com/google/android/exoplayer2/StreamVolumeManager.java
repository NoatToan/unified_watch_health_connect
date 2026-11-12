package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class StreamVolumeManager {
    private static final String i = "StreamVolumeManager";
    private static final String j = "android.media.VOLUME_CHANGED_ACTION";
    private static final int k = 1;
    private final Context a;
    private final Handler b;
    private final Listener c;
    private final AudioManager d;

    @Nullable
    private b e;
    private int f;
    private int g;
    private boolean h;

    public interface Listener {
        void onStreamTypeChanged(int streamType);

        void onStreamVolumeChanged(int streamVolume, boolean streamMuted);
    }

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.b;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.r0
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.b(streamVolumeManager);
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Handler eventHandler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = eventHandler;
        this.c = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = h(audioManager, 3);
        this.h = f(audioManager, this.f);
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter(j));
            this.e = bVar;
        } catch (RuntimeException e) {
            Log.w(i, "Error registering stream volume receiver", e);
        }
    }

    public static /* synthetic */ void b(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.o();
    }

    private static boolean f(AudioManager audioManager, int streamType) {
        if (Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(streamType);
        }
        return h(audioManager, streamType) == 0;
    }

    private static int h(AudioManager audioManager, int streamType) {
        try {
            return audioManager.getStreamVolume(streamType);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(streamType);
            Log.w(i, sb.toString(), e);
            return audioManager.getStreamMaxVolume(streamType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int iH = h(this.d, this.f);
        boolean zF = f(this.d, this.f);
        if (this.g == iH && this.h == zF) {
            return;
        }
        this.g = iH;
        this.h = zF;
        this.c.onStreamVolumeChanged(iH, zF);
    }

    public void c() {
        if (this.g <= e()) {
            return;
        }
        this.d.adjustStreamVolume(this.f, -1, 1);
        o();
    }

    public int d() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int e() {
        if (Util.SDK_INT >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public int g() {
        return this.g;
    }

    public void i() {
        if (this.g >= d()) {
            return;
        }
        this.d.adjustStreamVolume(this.f, 1, 1);
        o();
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        b bVar = this.e;
        if (bVar != null) {
            try {
                this.a.unregisterReceiver(bVar);
            } catch (RuntimeException e) {
                Log.w(i, "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    public void l(boolean muted) {
        if (Util.SDK_INT >= 23) {
            this.d.adjustStreamVolume(this.f, muted ? -100 : 100, 1);
        } else {
            this.d.setStreamMute(this.f, muted);
        }
        o();
    }

    public void m(int streamType) {
        if (this.f == streamType) {
            return;
        }
        this.f = streamType;
        o();
        this.c.onStreamTypeChanged(streamType);
    }

    public void n(int volume) {
        if (volume < e() || volume > d()) {
            return;
        }
        this.d.setStreamVolume(this.f, volume, 1);
        o();
    }
}
