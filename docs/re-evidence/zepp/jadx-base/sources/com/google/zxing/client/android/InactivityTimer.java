package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class InactivityTimer {
    private static final String g = "InactivityTimer";
    private static final long h = 300000;
    private final Context a;
    private Runnable e;
    private boolean f;
    private boolean c = false;
    private final BroadcastReceiver b = new b();
    private Handler d = new Handler();

    public final class b extends BroadcastReceiver {

        public class a implements Runnable {
            public final /* synthetic */ boolean a;

            public a(boolean z) {
                this.a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                InactivityTimer.this.d(this.a);
            }
        }

        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                InactivityTimer.this.d.post(new a(intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public InactivityTimer(Context context, Runnable runnable) {
        this.a = context;
        this.e = runnable;
    }

    private void c() {
        this.d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.f = z;
        if (this.c) {
            activity();
        }
    }

    private void e() {
        if (this.c) {
            return;
        }
        this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.c = true;
    }

    private void f() {
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }

    public void activity() {
        c();
        if (this.f) {
            this.d.postDelayed(this.e, 300000L);
        }
    }

    public void cancel() {
        c();
        f();
    }

    public void start() {
        e();
        activity();
    }
}
