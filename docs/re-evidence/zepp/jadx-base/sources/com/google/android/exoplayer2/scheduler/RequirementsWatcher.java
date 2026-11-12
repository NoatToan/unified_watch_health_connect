package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class RequirementsWatcher {
    private final Context a;
    private final Listener b;
    private final Requirements c;
    private final Handler d = Util.createHandlerForCurrentOrMainLooper();

    @Nullable
    private b e;
    private int f;

    @Nullable
    private c g;

    public interface Listener {
        void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int notMetRequirements);
    }

    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.this.e();
        }
    }

    @RequiresApi(24)
    public final class c extends ConnectivityManager.NetworkCallback {
        private boolean a;
        private boolean b;

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (RequirementsWatcher.this.g != null) {
                RequirementsWatcher.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (RequirementsWatcher.this.g != null) {
                RequirementsWatcher.this.f();
            }
        }

        private void e() {
            RequirementsWatcher.this.d.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        }

        private void f() {
            RequirementsWatcher.this.d.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean blocked) {
            if (blocked) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.a && this.b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.a = true;
                this.b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
        this.a = context.getApplicationContext();
        this.b = listener;
        this.c = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int notMetRequirements = this.c.getNotMetRequirements(this.a);
        if (this.f != notMetRequirements) {
            this.f = notMetRequirements;
            this.b.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if ((this.f & 3) == 0) {
            return;
        }
        e();
    }

    @RequiresApi(24)
    private void g() {
        ConnectivityManager connectivityManager = (ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.a.getSystemService("connectivity"));
        c cVar = new c();
        this.g = cVar;
        connectivityManager.registerDefaultNetworkCallback(cVar);
    }

    @RequiresApi(24)
    private void h() {
        ((ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) Assertions.checkNotNull(this.g));
        this.g = null;
    }

    public Requirements getRequirements() {
        return this.c;
    }

    public int start() {
        this.f = this.c.getNotMetRequirements(this.a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.c.isNetworkRequired()) {
            if (Util.SDK_INT >= 24) {
                g();
            } else {
                intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            }
        }
        if (this.c.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.c.isIdleRequired()) {
            if (Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.c.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        b bVar = new b();
        this.e = bVar;
        this.a.registerReceiver(bVar, intentFilter, null, this.d);
        return this.f;
    }

    public void stop() {
        this.a.unregisterReceiver((BroadcastReceiver) Assertions.checkNotNull(this.e));
        this.e = null;
        if (Util.SDK_INT < 24 || this.g == null) {
            return;
        }
        h();
    }
}
