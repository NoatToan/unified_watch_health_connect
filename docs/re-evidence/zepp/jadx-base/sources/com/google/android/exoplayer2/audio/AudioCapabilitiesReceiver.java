package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilitiesReceiver {
    private final Context a;
    private final Listener b;
    private final Handler c;

    @Nullable
    private final BroadcastReceiver d;

    @Nullable
    private final b e;

    @Nullable
    public AudioCapabilities f;
    private boolean g;

    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    public final class b extends ContentObserver {
        private final ContentResolver a;
        private final Uri b;

        public b(Handler handler, ContentResolver resolver, Uri settingUri) {
            super(handler);
            this.a = resolver;
            this.b = settingUri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, this);
        }

        public void b() {
            this.a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.c(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.a));
        }
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver.this.c(AudioCapabilities.c(context, intent));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = (Listener) Assertions.checkNotNull(listener);
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.c = handlerCreateHandlerForCurrentOrMainLooper;
        this.d = Util.SDK_INT >= 21 ? new c() : null;
        Uri uriD = AudioCapabilities.d();
        this.e = uriD != null ? new b(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), uriD) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AudioCapabilities newAudioCapabilities) {
        if (!this.g || newAudioCapabilities.equals(this.f)) {
            return;
        }
        this.f = newAudioCapabilities;
        this.b.onAudioCapabilitiesChanged(newAudioCapabilities);
    }

    public AudioCapabilities register() {
        if (this.g) {
            return (AudioCapabilities) Assertions.checkNotNull(this.f);
        }
        this.g = true;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
        Intent intentRegisterReceiver = null;
        if (this.d != null) {
            intentRegisterReceiver = this.a.registerReceiver(this.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.c);
        }
        AudioCapabilities audioCapabilitiesC = AudioCapabilities.c(this.a, intentRegisterReceiver);
        this.f = audioCapabilitiesC;
        return audioCapabilitiesC;
    }

    public void unregister() {
        if (this.g) {
            this.f = null;
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                this.a.unregisterReceiver(broadcastReceiver);
            }
            b bVar = this.e;
            if (bVar != null) {
                bVar.b();
            }
            this.g = false;
        }
    }
}
