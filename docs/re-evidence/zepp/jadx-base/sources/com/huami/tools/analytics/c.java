package com.huami.tools.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks;

/* JADX INFO: loaded from: classes15.dex */
class c {

    @VisibleForTesting
    public static final long i = 700;
    private static volatile c j;
    private Handler f;
    private b g;
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;
    private Runnable h = new Runnable() { // from class: com.huami.tools.analytics.b
        @Override // java.lang.Runnable
        public final void run() {
            this.a.k();
        }
    };

    public class a extends EmptyActivityLifecycleCallbacks {
        public a() {
        }

        @Override // com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            c.this.b();
        }

        @Override // com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            c.this.c();
        }

        @Override // com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            c.this.d();
        }

        @Override // com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            c.this.e();
        }
    }

    public interface b {
        void a();

        void b();
    }

    private c() {
    }

    private void g() {
        if (this.b == 0) {
            this.c = true;
        }
    }

    private void h() {
        if (this.a == 0 && this.c) {
            this.e = true;
            b bVar = this.g;
            if (bVar != null) {
                bVar.a();
            }
            this.d = true;
        }
    }

    public static c i() {
        if (j == null) {
            synchronized (c.class) {
                if (j == null) {
                    j = new c();
                }
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        g();
        h();
    }

    @VisibleForTesting
    public static void l(c cVar) {
        j = cVar;
    }

    @VisibleForTesting
    public void b() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            this.f.postDelayed(this.h, 700L);
        }
    }

    @VisibleForTesting
    public void c() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.c = false;
            } else {
                this.f.removeCallbacks(this.h);
            }
        }
    }

    @VisibleForTesting
    public void d() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.e = false;
            b bVar = this.g;
            if (bVar != null) {
                bVar.b();
            }
            this.d = false;
        }
    }

    @VisibleForTesting
    public void e() {
        this.a--;
        h();
    }

    public void f(@NonNull Context context) {
        this.f = new Handler(Looper.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }

    public boolean j() {
        return this.e;
    }

    public void m(b bVar) {
        this.g = bVar;
    }
}
