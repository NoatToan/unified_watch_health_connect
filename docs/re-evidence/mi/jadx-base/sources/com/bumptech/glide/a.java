package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import defpackage.a6i;
import defpackage.b0b;
import defpackage.bf4;
import defpackage.c6d;
import defpackage.cq2;
import defpackage.e0p;
import defpackage.fpf;
import defpackage.hg1;
import defpackage.nj1;
import defpackage.ob8;
import defpackage.pok;
import defpackage.rok;
import defpackage.ulq;
import defpackage.vok;
import defpackage.x3f;
import defpackage.zzp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("Glide.class")
    public static volatile a f6936k;
    public static volatile boolean l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob8 f6937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f6938b;
    public final fpf c;
    public final c d;
    public final nj1 e;
    public final com.bumptech.glide.manager.b f;
    public final bf4 g;
    public final InterfaceC0132a i;

    @GuardedBy("managers")
    public final List<rok> h = new ArrayList();
    public MemoryCategory j = MemoryCategory.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.a$a, reason: collision with other inner class name */
    public interface InterfaceC0132a {
        vok build();
    }

    public a(Context context, ob8 ob8Var, fpf fpfVar, cq2 cq2Var, nj1 nj1Var, com.bumptech.glide.manager.b bVar, bf4 bf4Var, int i, InterfaceC0132a interfaceC0132a, Map<Class<?>, zzp<?, ?>> map, List<pok<Object>> list, List<b0b> list2, hg1 hg1Var, d dVar) {
        this.f6937a = ob8Var;
        this.f6938b = cq2Var;
        this.e = nj1Var;
        this.c = fpfVar;
        this.f = bVar;
        this.g = bf4Var;
        this.i = interfaceC0132a;
        this.d = new c(context, nj1Var, e.d(this, list2, hg1Var), new c6d(), interfaceC0132a, map, list, ob8Var, dVar, i);
    }

    @GuardedBy("Glide.class")
    @VisibleForTesting
    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        l = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            l = false;
        }
    }

    public static a d(Context context) {
        if (f6936k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleE = e(context.getApplicationContext());
            synchronized (a.class) {
                try {
                    if (f6936k == null) {
                        a(context, generatedAppGlideModuleE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6936k;
    }

    public static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
            return null;
        } catch (IllegalAccessException e) {
            r(e);
            return null;
        } catch (InstantiationException e2) {
            r(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            r(e3);
            return null;
        } catch (InvocationTargetException e4) {
            r(e4);
            return null;
        }
    }

    public static com.bumptech.glide.manager.b m(Context context) {
        a6i.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    @GuardedBy("Glide.class")
    public static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new b(), generatedAppGlideModule);
    }

    @GuardedBy("Glide.class")
    public static void o(Context context, b bVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<b0b> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new x3f(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<b0b> it = listEmptyList.iterator();
            while (it.hasNext()) {
                b0b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (b0b b0bVar : listEmptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(b0bVar.getClass());
            }
        }
        bVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<b0b> it2 = listEmptyList.iterator();
        while (it2.hasNext()) {
            it2.next().a(applicationContext, bVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, bVar);
        }
        a aVarA = bVar.a(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(aVarA);
        f6936k = aVarA;
    }

    public static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static rok u(Context context) {
        return m(context).d(context);
    }

    public void b() {
        ulq.a();
        this.f6937a.e();
    }

    public void c() {
        ulq.b();
        this.c.clearMemory();
        this.f6938b.clearMemory();
        this.e.clearMemory();
    }

    public nj1 f() {
        return this.e;
    }

    public cq2 g() {
        return this.f6938b;
    }

    public bf4 h() {
        return this.g;
    }

    public Context i() {
        return this.d.getBaseContext();
    }

    public c j() {
        return this.d;
    }

    public Registry k() {
        return this.d.i();
    }

    public com.bumptech.glide.manager.b l() {
        return this.f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        s(i);
    }

    public void p(rok rokVar) {
        synchronized (this.h) {
            try {
                if (this.h.contains(rokVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.h.add(rokVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q(e0p<?> e0pVar) {
        synchronized (this.h) {
            try {
                Iterator<rok> it = this.h.iterator();
                while (it.hasNext()) {
                    if (it.next().x(e0pVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i) {
        ulq.b();
        synchronized (this.h) {
            try {
                Iterator<rok> it = this.h.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.trimMemory(i);
        this.f6938b.trimMemory(i);
        this.e.trimMemory(i);
    }

    public void t(rok rokVar) {
        synchronized (this.h) {
            try {
                if (!this.h.contains(rokVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.h.remove(rokVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
