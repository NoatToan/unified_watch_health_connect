package i;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import h0.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f86561a = new c(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f86562b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h7.g f86563c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h7.g f86564d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f86565e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f86566f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p1.b<WeakReference<e>> f86567g = new p1.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f86568h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f86569i = new Object();

    public static class a {
        private a() {
        }

        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        private b() {
        }

        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f86570a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayDeque f86571b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f86572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f86573d;

        public c(Executor executor) {
            this.f86572c = executor;
        }

        public final void a() {
            synchronized (this.f86570a) {
                try {
                    Runnable runnable = (Runnable) this.f86571b.poll();
                    this.f86573d = runnable;
                    if (runnable != null) {
                        this.f86572c.execute(runnable);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f86570a) {
                try {
                    this.f86571b.add(new r0(12, this, runnable));
                    if (this.f86573d == null) {
                        a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean l(Context context) {
        if (f86565e == null) {
            try {
                int i14 = o.f86643a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) o.class), o.a.a() | 128).metaData;
                if (bundle != null) {
                    f86565e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f86565e = Boolean.FALSE;
            }
        }
        return f86565e.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(e eVar) {
        synchronized (f86568h) {
            try {
                p1.b<WeakReference<e>> bVar = f86567g;
                bVar.getClass();
                p1.b.a aVar = new p1.b.a();
                while (aVar.hasNext()) {
                    e eVar2 = (e) ((WeakReference) aVar.next()).get();
                    if (eVar2 == eVar || eVar2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(int i14) {
        if ((i14 == -1 || i14 == 0 || i14 == 1 || i14 == 2 || i14 == 3) && f86562b != i14) {
            f86562b = i14;
            synchronized (f86568h) {
                try {
                    p1.b<WeakReference<e>> bVar = f86567g;
                    bVar.getClass();
                    p1.b.a aVar = new p1.b.a();
                    while (aVar.hasNext()) {
                        e eVar = (e) ((WeakReference) aVar.next()).get();
                        if (eVar != null) {
                            eVar.b();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void A(int i14) {
    }

    public abstract void B(CharSequence charSequence);

    public abstract m.b C(m.b.a aVar);

    public abstract void a(View view2, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b();

    public Context c(Context context) {
        return context;
    }

    public abstract <T extends View> T d(int i14);

    public Context e() {
        return null;
    }

    public abstract f.b f();

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract i.a i();

    public abstract void j();

    public abstract void k();

    public abstract void m(Configuration configuration);

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i14);

    public abstract void v(int i14);

    public abstract void w(View view2);

    public abstract void x(View view2, ViewGroup.LayoutParams layoutParams);

    public abstract void z(Toolbar toolbar);
}
