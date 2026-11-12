package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class s0 {
    private static final String e = "WakeLockManager";
    private static final String f = "ExoPlayer:WakeLockManager";

    @Nullable
    private final PowerManager a;

    @Nullable
    private PowerManager.WakeLock b;
    private boolean c;
    private boolean d;

    public s0(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean enabled) {
        if (enabled && this.b == null) {
            PowerManager powerManager = this.a;
            if (powerManager == null) {
                Log.w(e, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, f);
                this.b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.c = enabled;
        c();
    }

    public void b(boolean stayAwake) {
        this.d = stayAwake;
        c();
    }
}
