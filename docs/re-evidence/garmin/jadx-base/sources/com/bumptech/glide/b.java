package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jj.p;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile b f28451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile boolean f28452j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi.k f28453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.d f28454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yi.h f28455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f28456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xi.b f28457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f28458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jj.c f28459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f28460h = new ArrayList();

    public interface a {
    }

    public b(Context context, wi.k kVar, yi.h hVar, xi.d dVar, xi.b bVar, p pVar, jj.c cVar, int i14, a aVar, Map<Class<?>, l<?, ?>> map, List<mj.g<Object>> list, List<kj.b> list2, kj.a aVar2, e eVar) {
        f[] fVarArr = f.f28489a;
        this.f28453a = kVar;
        this.f28454b = dVar;
        this.f28457e = bVar;
        this.f28455c = hVar;
        this.f28458f = pVar;
        this.f28459g = cVar;
        this.f28456d = new d(context, bVar, new h(this, list2, aVar2), new nj.f(), aVar, map, list, kVar, eVar, i14);
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f28451i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e4) {
                com.airbnb.lottie.animation.keyframe.a.x("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            } catch (InstantiationException e14) {
                com.airbnb.lottie.animation.keyframe.a.x("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e14);
                return null;
            } catch (NoSuchMethodException e15) {
                com.airbnb.lottie.animation.keyframe.a.x("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e15);
                return null;
            } catch (InvocationTargetException e16) {
                com.airbnb.lottie.animation.keyframe.a.x("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e16);
                return null;
            }
            synchronized (b.class) {
                if (f28451i == null) {
                    if (f28452j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f28452j = true;
                    try {
                        d(context, generatedAppGlideModule);
                        f28452j = false;
                    } catch (Throwable th3) {
                        f28452j = false;
                        throw th3;
                    }
                }
            }
        }
        return f28451i;
    }

    public static p c(Context context) {
        qj.l.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f28458f;
    }

    public static void d(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        c cVar = new c();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            kj.d dVar = new kj.d(applicationContext);
            ArrayList arrayList = new ArrayList();
            try {
                Context context2 = dVar.f104929a;
                ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(kj.d.a(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kj.b bVar = (kj.b) it.next();
                if (hashSet.contains(bVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        bVar.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((kj.b) it3.next()).getClass().toString();
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ((kj.b) it4.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        if (cVar.f28467g == null) {
            zi.a.b bVar2 = new zi.a.b(false);
            if (zi.a.f204826b == 0) {
                zi.a.f204826b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i14 = zi.a.f204826b;
            bVar2.f204829b = i14;
            bVar2.f204830c = i14;
            bVar2.f204833f = "source";
            cVar.f28467g = bVar2.a();
        }
        if (cVar.f28468h == null) {
            zi.a.b bVar3 = new zi.a.b(true);
            bVar3.f204829b = 1;
            bVar3.f204830c = 1;
            bVar3.f204833f = "disk-cache";
            cVar.f28468h = bVar3.a();
        }
        if (cVar.f28474n == null) {
            if (zi.a.f204826b == 0) {
                zi.a.f204826b = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i15 = zi.a.f204826b < 4 ? 1 : 2;
            zi.a.b bVar4 = new zi.a.b(true);
            bVar4.f204829b = i15;
            bVar4.f204830c = i15;
            bVar4.f204833f = "animation";
            cVar.f28474n = bVar4.a();
        }
        if (cVar.f28470j == null) {
            cVar.f28470j = new yi.i(new yi.i.a(applicationContext));
        }
        if (cVar.f28471k == null) {
            cVar.f28471k = new jj.e();
        }
        if (cVar.f28464d == null) {
            int i16 = cVar.f28470j.f197305a;
            if (i16 > 0) {
                cVar.f28464d = new xi.j(i16);
            } else {
                cVar.f28464d = new xi.e();
            }
        }
        if (cVar.f28465e == null) {
            cVar.f28465e = new xi.i(cVar.f28470j.f197307c);
        }
        if (cVar.f28466f == null) {
            cVar.f28466f = new yi.g(cVar.f28470j.f197306b);
        }
        if (cVar.f28469i == null) {
            cVar.f28469i = new yi.f(applicationContext);
        }
        zi.a.C3820a c3820a = null;
        if (cVar.f28463c == null) {
            cVar.f28463c = new wi.k(cVar.f28466f, cVar.f28469i, cVar.f28468h, cVar.f28467g, new zi.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS, new SynchronousQueue(), new zi.a.d(new zi.a.c(), "source-unlimited", zi.a.e.f204841a, false))), cVar.f28474n, false);
        }
        List<mj.g<Object>> list3 = cVar.f28475o;
        if (list3 == null) {
            cVar.f28475o = Collections.EMPTY_LIST;
        } else {
            cVar.f28475o = Collections.unmodifiableList(list3);
        }
        e.a aVar = cVar.f28462b;
        aVar.getClass();
        b bVar5 = new b(applicationContext, cVar.f28463c, cVar.f28466f, cVar.f28464d, cVar.f28465e, new p(null), cVar.f28471k, cVar.f28472l, cVar.f28473m, cVar.f28461a, cVar.f28475o, list, generatedAppGlideModule, new e(aVar));
        applicationContext.registerComponentCallbacks(bVar5);
        f28451i = bVar5;
    }

    public static k e(Context context) {
        return c(context).c(context);
    }

    public final void a() {
        m.a();
        ((qj.i) this.f28455c).e(0L);
        this.f28454b.a();
        this.f28457e.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i14) {
        long j8;
        m.a();
        synchronized (this.f28460h) {
            try {
                Iterator it = this.f28460h.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).getClass();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        yi.g gVar = (yi.g) this.f28455c;
        gVar.getClass();
        if (i14 >= 40) {
            gVar.e(0L);
        } else if (i14 >= 20 || i14 == 15) {
            synchronized (gVar) {
                j8 = gVar.f144974b;
            }
            gVar.e(j8 / 2);
        }
        this.f28454b.b(i14);
        this.f28457e.b(i14);
    }
}
