package com.huami.android.zxing.camera;

import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
final class a implements Camera.AutoFocusCallback {
    private static final String f = a.class.getSimpleName();
    private static final long g = 2000;
    private static final Collection<String> h;
    private boolean a;
    private boolean b;
    private final boolean c;
    private final Camera d;
    private AsyncTask<?, ?, ?> e;

    public final class b extends AsyncTask<Object, Object, Object> {
        private b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            a.this.c();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        h = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera) {
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean zContains = h.contains(focusMode);
        this.c = zContains;
        Log.i(f, "Current focus mode '" + focusMode + "'; use auto focus? " + zContains);
        c();
    }

    private synchronized void a() {
        if (!this.a && this.e == null) {
            b bVar = new b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.e = bVar;
            } catch (RejectedExecutionException e) {
                Log.w(f, "Could not request auto focus", e);
            }
        }
    }

    private synchronized void b() {
        AsyncTask<?, ?, ?> asyncTask = this.e;
        if (asyncTask != null) {
            if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.e.cancel(true);
            }
            this.e = null;
        }
    }

    public synchronized void c() {
        if (this.c) {
            this.e = null;
            if (!this.a && !this.b) {
                try {
                    this.d.autoFocus(this);
                    this.b = true;
                } catch (RuntimeException e) {
                    Log.w(f, "Unexpected exception while focusing", e);
                    a();
                }
            }
        }
    }

    public synchronized void d() {
        this.a = true;
        if (this.c) {
            b();
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f, "Unexpected exception while cancelling focusing", e);
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.b = false;
        a();
    }
}
