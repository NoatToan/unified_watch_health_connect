package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jj.m;
import jj.o;
import jj.q;
import jj.r;
import jj.u;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class k implements ComponentCallbacks2, m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mj.h f28507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mj.h f28508l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.b f28509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj.k f28511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f28512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f28513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f28514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f28515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jj.b f28516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList<mj.g<Object>> f28517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mj.h f28518j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            kVar.f28511c.a(kVar);
        }
    }

    public class b implements jj.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f28520a;

        public b(r rVar) {
            this.f28520a = rVar;
        }

        @Override // jj.b.a
        public final void a(boolean z14) {
            if (z14) {
                synchronized (k.this) {
                    r rVar = this.f28520a;
                    for (mj.d dVar : qj.m.e(rVar.f98930a)) {
                        if (!dVar.isComplete() && !dVar.b()) {
                            dVar.clear();
                            if (rVar.f98932c) {
                                rVar.f98931b.add(dVar);
                            } else {
                                dVar.g();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        mj.h hVarC = new mj.h().c(Bitmap.class);
        hVarC.f119011r = true;
        f28507k = hVarC;
        mj.h hVarC2 = new mj.h().c(hj.c.class);
        hVarC2.f119011r = true;
        f28508l = hVarC2;
        new mj.h().d(wi.j.f185366c).m(g.LOW).s(true);
    }

    public k(com.bumptech.glide.b bVar, jj.k kVar, q qVar, r rVar, jj.c cVar, Context context) {
        mj.h hVar;
        this.f28514f = new u();
        a aVar = new a();
        this.f28515g = aVar;
        this.f28509a = bVar;
        this.f28511c = kVar;
        this.f28513e = qVar;
        this.f28512d = rVar;
        this.f28510b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(rVar);
        ((jj.e) cVar).getClass();
        jj.b dVar = a7.b.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new jj.d(applicationContext, bVar2) : new o();
        this.f28516h = dVar;
        synchronized (bVar.f28460h) {
            if (bVar.f28460h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f28460h.add(this);
        }
        char[] cArr = qj.m.f144982a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            kVar.a(this);
        } else {
            qj.m.f().post(aVar);
        }
        kVar.a(dVar);
        this.f28517i = new CopyOnWriteArrayList<>(bVar.f28456d.f28481e);
        d dVar2 = bVar.f28456d;
        synchronized (dVar2) {
            try {
                if (dVar2.f28486j == null) {
                    ((c.a) dVar2.f28480d).getClass();
                    mj.h hVar2 = new mj.h();
                    hVar2.f119011r = true;
                    dVar2.f28486j = hVar2;
                }
                hVar = dVar2.f28486j;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this) {
            mj.h hVarClone = hVar.clone();
            if (hVarClone.f119011r && !hVarClone.f119013v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            hVarClone.f119013v = true;
            hVarClone.f119011r = true;
            this.f28518j = hVarClone;
        }
    }

    public final <ResourceType> j<ResourceType> d(Class<ResourceType> cls) {
        return new j<>(this.f28509a, this, cls, this.f28510b);
    }

    public final j<Bitmap> g() {
        return d(Bitmap.class).a(f28507k);
    }

    public final void j(nj.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        boolean zO = o(hVar);
        mj.d request = hVar.getRequest();
        if (zO) {
            return;
        }
        com.bumptech.glide.b bVar = this.f28509a;
        synchronized (bVar.f28460h) {
            try {
                Iterator it = bVar.f28460h.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).o(hVar)) {
                        return;
                    }
                }
                if (request != null) {
                    hVar.i(null);
                    request.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized void k() {
        try {
            Iterator it = qj.m.e(this.f28514f.f98946a).iterator();
            while (it.hasNext()) {
                j((nj.h) it.next());
            }
            this.f28514f.f98946a.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final j<Drawable> l(String str) {
        return d(Drawable.class).J(str);
    }

    public final synchronized void m() {
        r rVar = this.f28512d;
        rVar.f98932c = true;
        for (mj.d dVar : qj.m.e(rVar.f98930a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                rVar.f98931b.add(dVar);
            }
        }
    }

    public final synchronized void n() {
        r rVar = this.f28512d;
        rVar.f98932c = false;
        for (mj.d dVar : qj.m.e(rVar.f98930a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.g();
            }
        }
        rVar.f98931b.clear();
    }

    public final synchronized boolean o(nj.h<?> hVar) {
        mj.d request = hVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f28512d.a(request)) {
            return false;
        }
        this.f28514f.f98946a.remove(hVar);
        hVar.i(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // jj.m
    public final synchronized void onDestroy() {
        this.f28514f.onDestroy();
        k();
        r rVar = this.f28512d;
        Iterator it = qj.m.e(rVar.f98930a).iterator();
        while (it.hasNext()) {
            rVar.a((mj.d) it.next());
        }
        rVar.f98931b.clear();
        this.f28511c.b(this);
        this.f28511c.b(this.f28516h);
        qj.m.f().removeCallbacks(this.f28515g);
        com.bumptech.glide.b bVar = this.f28509a;
        synchronized (bVar.f28460h) {
            if (!bVar.f28460h.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f28460h.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // jj.m
    public final synchronized void onStart() {
        n();
        this.f28514f.onStart();
    }

    @Override // jj.m
    public final synchronized void onStop() {
        this.f28514f.onStop();
        m();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i14) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f28512d + ", treeNode=" + this.f28513e + StringSubstitutor.DEFAULT_VAR_END;
    }

    public k(com.bumptech.glide.b bVar, jj.k kVar, q qVar, Context context) {
        this(bVar, kVar, qVar, new r(), bVar.f28459g, context);
    }
}
