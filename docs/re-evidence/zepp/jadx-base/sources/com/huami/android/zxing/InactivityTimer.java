package com.huami.android.zxing;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class InactivityTimer {
    private static final String e = "InactivityTimer";
    private static final long f = 300000;
    private final Activity a;
    private final BroadcastReceiver b = new c();
    private boolean c = false;
    private AsyncTask<Object, Object, Object> d;

    public final class b extends AsyncTask<Object, Object, Object> {
        private b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                Log.i(InactivityTimer.e, "Finishing activity due to inactivity");
                InactivityTimer.this.a.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    InactivityTimer.this.onActivity();
                } else {
                    InactivityTimer.this.d();
                }
            }
        }
    }

    public InactivityTimer(Activity activity) {
        this.a = activity;
        onActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        AsyncTask<Object, Object, Object> asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    public synchronized void onActivity() {
        d();
        b bVar = new b();
        this.d = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    public synchronized void onPause() {
        d();
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        } else {
            Log.w(e, "PowerStatusReceiver was never registered?");
        }
    }

    public synchronized void onResume() {
        if (this.c) {
            Log.w(e, "PowerStatusReceiver was already registered?");
        } else {
            this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.c = true;
        }
        onActivity();
    }

    public void shutdown() {
        d();
    }
}
