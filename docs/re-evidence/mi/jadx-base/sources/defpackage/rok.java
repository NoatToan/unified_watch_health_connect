package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import com.bumptech.glide.Priority;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class rok implements ComponentCallbacks2, mfe {
    public static final vok m = vok.l0(Bitmap.class).O();
    public static final vok n = vok.l0(kza.class).O();
    public static final vok o = vok.m0(jy6.c).Y(Priority.LOW).f0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.a f32750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32751b;
    public final kfe c;

    @GuardedBy("this")
    public final yok d;

    @GuardedBy("this")
    public final sok e;

    @GuardedBy("this")
    public final b1p f;
    public final Runnable g;
    public final af4 h;
    public final CopyOnWriteArrayList<pok<Object>> i;

    @GuardedBy("this")
    public vok j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32752k;
    public boolean l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rok rokVar = rok.this;
            rokVar.c.a(rokVar);
        }
    }

    public static class b extends oe5<View, Object> {
        public b(View view) {
            super(view);
        }

        @Override // defpackage.e0p
        public void a(Object obj, lzp<? super Object> lzpVar) {
        }

        @Override // defpackage.e0p
        public void g(Drawable drawable) {
        }

        @Override // defpackage.oe5
        public void k(Drawable drawable) {
        }
    }

    public class c implements af4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final yok f32754a;

        public c(yok yokVar) {
            this.f32754a = yokVar;
        }

        @Override // af4.a
        public void a(boolean z) {
            if (z) {
                synchronized (rok.this) {
                    this.f32754a.e();
                }
            }
        }
    }

    public rok(com.bumptech.glide.a aVar, kfe kfeVar, sok sokVar, Context context) {
        this(aVar, kfeVar, sokVar, new yok(), aVar.h(), context);
    }

    @CheckResult
    public <ResourceType> cnk<ResourceType> h(Class<ResourceType> cls) {
        return new cnk<>(this.f32750a, this, cls, this.f32751b);
    }

    @CheckResult
    public cnk<Bitmap> i() {
        return h(Bitmap.class).a(m);
    }

    @CheckResult
    public cnk<Drawable> j() {
        return h(Drawable.class);
    }

    public void k(e0p<?> e0pVar) {
        if (e0pVar == null) {
            return;
        }
        y(e0pVar);
    }

    public void l(View view) {
        k(new b(view));
    }

    public final synchronized void m() {
        try {
            Iterator<e0p<?>> it = this.f.i().iterator();
            while (it.hasNext()) {
                k(it.next());
            }
            this.f.h();
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<pok<Object>> n() {
        return this.i;
    }

    public synchronized vok o() {
        return this.j;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.mfe
    public synchronized void onDestroy() {
        this.f.onDestroy();
        m();
        this.d.b();
        this.c.b(this);
        this.c.b(this.h);
        ulq.w(this.g);
        this.f32750a.t(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // defpackage.mfe
    public synchronized void onStart() {
        u();
        this.f.onStart();
    }

    @Override // defpackage.mfe
    public synchronized void onStop() {
        try {
            this.f.onStop();
            if (this.l) {
                m();
            } else {
                t();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f32752k) {
            s();
        }
    }

    public <T> zzp<?, T> p(Class<T> cls) {
        return this.f32750a.j().e(cls);
    }

    @CheckResult
    public cnk<Drawable> q(Object obj) {
        return j().A0(obj);
    }

    public synchronized void r() {
        this.d.c();
    }

    public synchronized void s() {
        r();
        Iterator<rok> it = this.e.a().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public synchronized void t() {
        this.d.d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    public synchronized void u() {
        this.d.f();
    }

    public synchronized void v(vok vokVar) {
        this.j = vokVar.clone().b();
    }

    public synchronized void w(e0p<?> e0pVar, zmk zmkVar) {
        this.f.j(e0pVar);
        this.d.g(zmkVar);
    }

    public synchronized boolean x(e0p<?> e0pVar) {
        zmk request = e0pVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.d.a(request)) {
            return false;
        }
        this.f.k(e0pVar);
        e0pVar.f(null);
        return true;
    }

    public final void y(e0p<?> e0pVar) {
        boolean zX = x(e0pVar);
        zmk request = e0pVar.getRequest();
        if (zX || this.f32750a.q(e0pVar) || request == null) {
            return;
        }
        e0pVar.f(null);
        request.clear();
    }

    public rok(com.bumptech.glide.a aVar, kfe kfeVar, sok sokVar, yok yokVar, bf4 bf4Var, Context context) {
        this.f = new b1p();
        a aVar2 = new a();
        this.g = aVar2;
        this.f32750a = aVar;
        this.c = kfeVar;
        this.e = sokVar;
        this.d = yokVar;
        this.f32751b = context;
        af4 af4VarA = bf4Var.a(context.getApplicationContext(), new c(yokVar));
        this.h = af4VarA;
        aVar.p(this);
        if (ulq.r()) {
            ulq.v(aVar2);
        } else {
            kfeVar.a(this);
        }
        kfeVar.a(af4VarA);
        this.i = new CopyOnWriteArrayList<>(aVar.j().c());
        v(aVar.j().d());
    }
}
