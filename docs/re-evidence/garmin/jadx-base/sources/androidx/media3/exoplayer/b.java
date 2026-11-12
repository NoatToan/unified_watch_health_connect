package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8798c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0122b f8799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f8800b;

        public a(Handler handler, InterfaceC0122b interfaceC0122b) {
            this.f8800b = handler;
            this.f8799a = interfaceC0122b;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f8800b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f8798c) {
                v vVar = v.this;
                int i14 = v.f9731j0;
                vVar.B(false, -1, 3);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0122b {
    }

    public b(Context context, Handler handler, InterfaceC0122b interfaceC0122b) {
        this.f8796a = context.getApplicationContext();
        this.f8797b = new a(handler, interfaceC0122b);
    }

    public final void a() {
        if (this.f8798c) {
            this.f8796a.unregisterReceiver(this.f8797b);
            this.f8798c = false;
        }
    }
}
