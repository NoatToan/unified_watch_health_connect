package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<j.c> f9398a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<j.c> f9399b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.a f9400c = new k.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b.a f9401d = new androidx.media3.exoplayer.drm.b.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f9402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f9403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ja.q f9404g;

    @Override // androidx.media3.exoplayer.source.j
    public final void a(Handler handler, k kVar) {
        handler.getClass();
        k.a aVar = this.f9400c;
        aVar.getClass();
        aVar.f9526c.add(new k.a.C0128a(handler, kVar));
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void b(j.c cVar) {
        ArrayList<j.c> arrayList = this.f9398a;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            f(cVar);
            return;
        }
        this.f9402e = null;
        this.f9403f = null;
        this.f9404g = null;
        this.f9399b.clear();
        r();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void d(j.c cVar, ha.n nVar, ja.q qVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f9402e;
        fa.a.a(looper == null || looper == looperMyLooper);
        this.f9404g = qVar;
        d0 d0Var = this.f9403f;
        this.f9398a.add(cVar);
        if (this.f9402e == null) {
            this.f9402e = looperMyLooper;
            this.f9399b.add(cVar);
            p(nVar);
        } else if (d0Var != null) {
            e(cVar);
            cVar.a(this, d0Var);
        }
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void e(j.c cVar) {
        this.f9402e.getClass();
        HashSet<j.c> hashSet = this.f9399b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            n();
        }
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void f(j.c cVar) {
        HashSet<j.c> hashSet = this.f9399b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        m();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void g(Handler handler, androidx.media3.exoplayer.drm.b bVar) {
        handler.getClass();
        androidx.media3.exoplayer.drm.b.a aVar = this.f9401d;
        aVar.getClass();
        aVar.f8896c.add(new androidx.media3.exoplayer.drm.b.a.C0123a(handler, bVar));
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void i(k kVar) {
        CopyOnWriteArrayList<k.a.C0128a> copyOnWriteArrayList = this.f9400c.f9526c;
        for (k.a.C0128a c0128a : copyOnWriteArrayList) {
            if (c0128a.f9528b == kVar) {
                copyOnWriteArrayList.remove(c0128a);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void j(androidx.media3.exoplayer.drm.b bVar) {
        CopyOnWriteArrayList<androidx.media3.exoplayer.drm.b.a.C0123a> copyOnWriteArrayList = this.f9401d.f8896c;
        for (androidx.media3.exoplayer.drm.b.a.C0123a c0123a : copyOnWriteArrayList) {
            if (c0123a.f8898b == bVar) {
                copyOnWriteArrayList.remove(c0123a);
            }
        }
    }

    public final k.a l(j.b bVar) {
        return this.f9400c.g(0, bVar);
    }

    public void m() {
    }

    public void n() {
    }

    public void o(d0 d0Var) {
        q(d0Var);
    }

    public abstract void p(ha.n nVar);

    public final void q(d0 d0Var) {
        this.f9403f = d0Var;
        Iterator<j.c> it = this.f9398a.iterator();
        while (it.hasNext()) {
            it.next().a(this, d0Var);
        }
    }

    public abstract void r();
}
