package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public final class f7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f17492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f17493b = new b(this);
    public boolean c = false;
    public AsyncTask<Object, Object, Object> d;

    public static class a extends AsyncTask<Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<Activity> f17494a;

        public a(Activity activity) {
            this.f17494a = new WeakReference<>(activity);
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                Activity activity = this.f17494a.get();
                if (activity == null) {
                    return null;
                }
                activity.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    public static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<f7d> f17495a;

        public b(f7d f7dVar) {
            this.f17495a = new WeakReference<>(f7dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f7d f7dVar;
            if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction()) || (f7dVar = this.f17495a.get()) == null) {
                return;
            }
            if (intent.getIntExtra("plugged", -1) <= 0) {
                f7dVar.c();
            } else {
                f7dVar.b();
            }
        }
    }

    public f7d(Activity activity) {
        this.f17492a = activity;
        c();
    }

    public final void b() {
        AsyncTask<Object, Object, Object> asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    public void c() {
        b();
        a aVar = new a(this.f17492a);
        this.d = aVar;
        try {
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } catch (RejectedExecutionException unused) {
        }
    }

    public void d() {
        b();
        if (this.c) {
            this.f17492a.unregisterReceiver(this.f17493b);
            this.c = false;
        }
    }

    public void e() {
        if (!this.c) {
            this.f17492a.registerReceiver(this.f17493b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.c = true;
        }
        c();
    }

    public void f() {
        b();
    }
}
