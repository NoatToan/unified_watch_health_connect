package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public final class ur1 implements Camera.AutoFocusCallback {
    public static final Collection<String> f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36041b;
    public final boolean c;
    public final Camera d;
    public AsyncTask<?, ?, ?> e;

    public static class a extends AsyncTask<Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ur1> f36042a;

        public a(ur1 ur1Var) {
            this.f36042a = new WeakReference<>(ur1Var);
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(1200L);
            } catch (InterruptedException unused) {
            }
            ur1 ur1Var = this.f36042a.get();
            if (ur1Var == null) {
                return null;
            }
            ur1Var.c();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public ur1(Context context, Camera camera) {
        this.d = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        boolean z = defaultSharedPreferences.getBoolean("preferences_auto_focus", true) && f.contains(focusMode);
        this.c = z;
        ipe.f("Current focus mode '" + focusMode + "'; use auto focus? " + z);
        c();
    }

    public final synchronized void a() {
        if (!this.f36040a && this.e == null) {
            a aVar = new a(this);
            try {
                aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.e = aVar;
            } catch (RejectedExecutionException e) {
                ipe.i("Could not request auto focus", e);
            }
        }
    }

    public final synchronized void b() {
        try {
            AsyncTask<?, ?, ?> asyncTask = this.e;
            if (asyncTask != null) {
                if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                    this.e.cancel(true);
                }
                this.e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        if (this.c) {
            this.e = null;
            if (!this.f36040a && !this.f36041b) {
                try {
                    this.d.autoFocus(this);
                    this.f36041b = true;
                } catch (RuntimeException e) {
                    ipe.i("Unexpected exception while focusing", e);
                    a();
                }
            }
        }
    }

    public synchronized void d() {
        this.f36040a = true;
        if (this.c) {
            b();
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                ipe.i("Unexpected exception while cancelling focusing", e);
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.f36041b = false;
        a();
    }
}
