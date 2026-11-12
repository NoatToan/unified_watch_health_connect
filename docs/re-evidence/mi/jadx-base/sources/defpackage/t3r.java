package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes4.dex */
public final class t3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerManager f34280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f34281b;
    public boolean c;
    public boolean d;

    public t3r(Context context) {
        this.f34280a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z) {
        if (z && this.f34281b == null) {
            PowerManager powerManager = this.f34280a;
            if (powerManager == null) {
                toe.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f34281b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        c();
    }

    public void b(boolean z) {
        this.d = z;
        c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void c() {
        PowerManager.WakeLock wakeLock = this.f34281b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
