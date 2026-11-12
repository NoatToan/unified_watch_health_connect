package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import com.example.statistics.export.OneTrackConstant;
import com.google.android.exoplayer2.scheduler.Requirements;

/* JADX INFO: loaded from: classes4.dex */
public final class apk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Requirements f3331b;
    public final Handler c = wlq.z();
    public b d;
    public int e;
    public d f;

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            apk.this.e();
        }
    }

    public interface c {
    }

    @RequiresApi(24)
    public final class d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3334b;

        public d() {
        }

        public final /* synthetic */ void c() {
            if (apk.this.f != null) {
                apk.this.e();
            }
        }

        public final /* synthetic */ void d() {
            if (apk.this.f != null) {
                apk.this.g();
            }
        }

        public final void e() {
            apk.this.c.post(new Runnable() { // from class: bpk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4461a.c();
                }
            });
        }

        public final void f() {
            apk.this.c.post(new Runnable() { // from class: cpk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14601a.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f3333a && this.f3334b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.f3333a = true;
                this.f3334b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    public apk(Context context, c cVar, Requirements requirements) {
        this.f3330a = context.getApplicationContext();
        this.f3331b = requirements;
    }

    public final void e() {
        int iC = this.f3331b.c(this.f3330a);
        if (this.e == iC) {
            return;
        }
        this.e = iC;
        throw null;
    }

    public Requirements f() {
        return this.f3331b;
    }

    public final void g() {
        if ((this.e & 3) == 0) {
            return;
        }
        e();
    }

    @RequiresApi(24)
    public final void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) rk1.e((ConnectivityManager) this.f3330a.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY));
        d dVar = new d();
        this.f = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    public int i() {
        this.e = this.f3331b.c(this.f3330a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f3331b.i()) {
            if (wlq.f38110a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f3331b.d()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f3331b.g()) {
            if (wlq.f38110a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f3331b.k()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        b bVar = new b();
        this.d = bVar;
        this.f3330a.registerReceiver(bVar, intentFilter, null, this.c);
        return this.e;
    }

    public void j() {
        this.f3330a.unregisterReceiver((BroadcastReceiver) rk1.e(this.d));
        this.d = null;
        if (wlq.f38110a < 24 || this.f == null) {
            return;
        }
        k();
    }

    @RequiresApi(24)
    public final void k() {
        ((ConnectivityManager) rk1.e((ConnectivityManager) this.f3330a.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) rk1.e(this.f));
        this.f = null;
    }
}
