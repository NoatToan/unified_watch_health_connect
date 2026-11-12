package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes4.dex */
public class b5d extends f52<p4d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7g f3817b;
    public final h5d c;
    public final f5d d;

    public b5d(q7g q7gVar, h5d h5dVar, f5d f5dVar) {
        this.f3817b = q7gVar;
        this.c = h5dVar;
        this.d = f5dVar;
    }

    @Override // defpackage.f52, defpackage.uj4
    public void a(String str) {
        super.a(str);
        long jNow = this.f3817b.now();
        int iA = this.c.a();
        if (iA != 3 && iA != 5) {
            this.c.d(jNow);
            this.c.g(str);
            this.d.e(this.c, 4);
        }
        j(jNow);
    }

    @Override // defpackage.f52, defpackage.uj4
    public void b(String str, Object obj) {
        long jNow = this.f3817b.now();
        this.c.i(jNow);
        this.c.g(str);
        this.c.c(obj);
        this.d.e(this.c, 0);
        k(jNow);
    }

    @Override // defpackage.f52, defpackage.uj4
    public void d(String str, Throwable th) {
        long jNow = this.f3817b.now();
        this.c.e(jNow);
        this.c.g(str);
        this.d.e(this.c, 5);
        j(jNow);
    }

    @Override // defpackage.f52, defpackage.uj4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(String str, p4d p4dVar, Animatable animatable) {
        long jNow = this.f3817b.now();
        this.c.f(jNow);
        this.c.n(jNow);
        this.c.g(str);
        this.c.j(p4dVar);
        this.d.e(this.c, 3);
    }

    @Override // defpackage.f52, defpackage.uj4
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(String str, p4d p4dVar) {
        this.c.h(this.f3817b.now());
        this.c.g(str);
        this.c.j(p4dVar);
        this.d.e(this.c, 2);
    }

    public final void j(long j) {
        this.c.v(false);
        this.c.p(j);
        this.d.d(this.c, 2);
    }

    public void k(long j) {
        this.c.v(true);
        this.c.u(j);
        this.d.d(this.c, 1);
    }
}
