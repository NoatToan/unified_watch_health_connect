package defpackage;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final axh f17421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7g f17422b;
    public final h5d c = new h5d();
    public z4d d;
    public y4d e;
    public g5d f;
    public b5d g;
    public v1a h;
    public List<d5d> i;
    public boolean j;

    public f5d(q7g q7gVar, axh axhVar) {
        this.f17422b = q7gVar;
        this.f17421a = axhVar;
    }

    public void a(d5d d5dVar) {
        if (d5dVar == null) {
            return;
        }
        if (this.i == null) {
            this.i = new LinkedList();
        }
        this.i.add(d5dVar);
    }

    public void b() {
        h57 h57VarD = this.f17421a.d();
        if (h57VarD == null || h57VarD.b() == null) {
            return;
        }
        Rect bounds = h57VarD.b().getBounds();
        this.c.r(bounds.width());
        this.c.q(bounds.height());
    }

    public void c() {
        List<d5d> list = this.i;
        if (list != null) {
            list.clear();
        }
    }

    public void d(h5d h5dVar, int i) {
        List<d5d> list;
        if (!this.j || (list = this.i) == null || list.isEmpty()) {
            return;
        }
        c5d c5dVarW = h5dVar.w();
        Iterator<d5d> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().b(c5dVarW, i);
        }
    }

    public void e(h5d h5dVar, int i) {
        List<d5d> list;
        h5dVar.k(i);
        if (!this.j || (list = this.i) == null || list.isEmpty()) {
            return;
        }
        if (i == 3) {
            b();
        }
        c5d c5dVarW = h5dVar.w();
        Iterator<d5d> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(c5dVarW, i);
        }
    }

    public void f() {
        c();
        g(false);
        this.c.b();
    }

    public void g(boolean z) {
        this.j = z;
        if (!z) {
            y4d y4dVar = this.e;
            if (y4dVar != null) {
                this.f17421a.e0(y4dVar);
            }
            b5d b5dVar = this.g;
            if (b5dVar != null) {
                this.f17421a.G(b5dVar);
            }
            v1a v1aVar = this.h;
            if (v1aVar != null) {
                this.f17421a.f0(v1aVar);
                return;
            }
            return;
        }
        h();
        y4d y4dVar2 = this.e;
        if (y4dVar2 != null) {
            this.f17421a.P(y4dVar2);
        }
        b5d b5dVar2 = this.g;
        if (b5dVar2 != null) {
            this.f17421a.h(b5dVar2);
        }
        v1a v1aVar2 = this.h;
        if (v1aVar2 != null) {
            this.f17421a.Q(v1aVar2);
        }
    }

    public final void h() {
        if (this.g == null) {
            this.g = new b5d(this.f17422b, this.c, this);
        }
        if (this.f == null) {
            this.f = new g5d(this.f17422b, this.c);
        }
        if (this.e == null) {
            this.e = new e5d(this.c, this);
        }
        z4d z4dVar = this.d;
        if (z4dVar == null) {
            this.d = new z4d(this.f17421a.p(), this.e);
        } else {
            z4dVar.l(this.f17421a.p());
        }
        if (this.h == null) {
            this.h = new v1a(this.f, this.d);
        }
    }
}
