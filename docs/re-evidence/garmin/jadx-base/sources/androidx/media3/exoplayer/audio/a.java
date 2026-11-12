package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f8752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f8753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f8754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f8755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f8756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ka.a f8757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ka.b f8758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.media3.common.d f8759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8760j;

    public final class b extends AudioDeviceCallback {
        private b() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            a aVar = a.this;
            aVar.a(ka.a.c(aVar.f8751a, aVar.f8759i, aVar.f8758h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            a aVar = a.this;
            if (z.k(audioDeviceInfoArr, aVar.f8758h)) {
                aVar.f8758h = null;
            }
            aVar.a(ka.a.c(aVar.f8751a, aVar.f8759i, aVar.f8758h));
        }
    }

    public final class c extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f8762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f8763b;

        public c(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f8762a = contentResolver;
            this.f8763b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z14) {
            a aVar = a.this;
            aVar.a(ka.a.c(aVar.f8751a, aVar.f8759i, aVar.f8758h));
        }
    }

    public final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            a aVar = a.this;
            aVar.a(ka.a.b(context, intent, aVar.f8759i, aVar.f8758h));
        }
    }

    public interface e {
        void c(ka.a aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, e eVar, androidx.media3.common.d dVar, ka.b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8751a = applicationContext;
        eVar.getClass();
        this.f8752b = eVar;
        this.f8759i = dVar;
        this.f8758h = bVar;
        int i14 = z.f70071a;
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f8753c = handler;
        this.f8754d = z.f70071a >= 23 ? new b() : null;
        this.f8755e = new d();
        ka.a aVar = ka.a.f103656c;
        String str = z.f70073c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f8756f = uriFor != null ? new c(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(ka.a aVar) {
        if (!this.f8760j || aVar.equals(this.f8757g)) {
            return;
        }
        this.f8757g = aVar;
        this.f8752b.c(aVar);
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        ka.b bVar = this.f8758h;
        AudioDeviceInfo audioDeviceInfo2 = bVar == null ? null : bVar.f103665a;
        int i14 = z.f70071a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        ka.b bVar2 = audioDeviceInfo != null ? new ka.b(audioDeviceInfo) : null;
        this.f8758h = bVar2;
        a(ka.a.c(this.f8751a, this.f8759i, bVar2));
    }

    public a(Context context, e eVar, androidx.media3.common.d dVar, AudioDeviceInfo audioDeviceInfo) {
        this(context, eVar, dVar, (z.f70071a < 23 || audioDeviceInfo == null) ? null : new ka.b(audioDeviceInfo));
    }

    @Deprecated
    public a(Context context, e eVar) {
        this(context, eVar, androidx.media3.common.d.f8178g, (AudioDeviceInfo) null);
    }
}
