package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.util.Preconditions;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
final class c implements ConnectivityMonitor {
    private static final String f = "ConnectivityMonitor";
    private final Context a;
    public final ConnectivityMonitor.ConnectivityListener b;
    public boolean c;
    private boolean d;
    private final BroadcastReceiver e = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            c cVar = c.this;
            boolean z = cVar.c;
            cVar.c = cVar.a(context);
            if (z != c.this.c) {
                if (Log.isLoggable(c.f, 3)) {
                    Log.d(c.f, "connectivity changed, isConnected: " + c.this.c);
                }
                c cVar2 = c.this;
                cVar2.b.onConnectivityChanged(cVar2.c);
            }
        }
    }

    public c(@NonNull Context context, @NonNull ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.a = context.getApplicationContext();
        this.b = connectivityListener;
    }

    private void b() {
        if (this.d) {
            return;
        }
        this.c = a(this.a);
        try {
            this.a.registerReceiver(this.e, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
            this.d = true;
        } catch (SecurityException e) {
            if (Log.isLoggable(f, 5)) {
                Log.w(f, "Failed to register", e);
            }
        }
    }

    private void c() {
        if (this.d) {
            this.a.unregisterReceiver(this.e);
            this.d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public boolean a(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) Preconditions.checkNotNull((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable(f, 5)) {
                Log.w(f, "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        b();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        c();
    }
}
