package com.huami.lib.qrcode;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes10.dex */
final class b {
    private static final String e = "b";
    private static final long f = 300000;
    private final Activity a;
    private final BroadcastReceiver b = new c();
    private boolean c = false;
    private AsyncTask<Object, Object, Object> d;

    /* JADX INFO: renamed from: com.huami.lib.qrcode.b$b, reason: collision with other inner class name */
    public final class AsyncTaskC0461b extends AsyncTask<Object, Object, Object> {
        private AsyncTaskC0461b() {
        }

        @Override // android.os.AsyncTask
        @Nullable
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                Log.i(b.e, "Finishing activity due to inactivity");
                b.this.a.finish();
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
                    b.this.e();
                } else {
                    b.this.d();
                }
            }
        }
    }

    public b(Activity activity) {
        this.a = activity;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        AsyncTask<Object, Object, Object> asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    public synchronized void e() {
        d();
        AsyncTaskC0461b asyncTaskC0461b = new AsyncTaskC0461b();
        this.d = asyncTaskC0461b;
        try {
            asyncTaskC0461b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } catch (RejectedExecutionException unused) {
            Log.w(e, "Couldn't schedule inactivity task; ignoring");
        }
    }

    public synchronized void f() {
        d();
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        } else {
            Log.w(e, "PowerStatusReceiver was never registered?");
        }
    }

    public synchronized void g() {
        if (this.c) {
            Log.w(e, "PowerStatusReceiver was already registered?");
        } else {
            this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.c = true;
        }
        e();
    }

    public void h() {
        d();
    }
}
