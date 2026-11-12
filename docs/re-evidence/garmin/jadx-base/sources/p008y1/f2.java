package p008y1;

import g6.c;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u13.a;
import u53.x;
import vb.h;
import z53.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly1/f2;", "Ly1/c2;", "Lg6/c;", "density", "<init>", "(Lg6/c;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f2 implements c2, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f193198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f193199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f193200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f193201d;

    public f2(c cVar) {
        this.f193198a = cVar;
        x xVar = z53.c.f202558a;
        this.f193201d = new b(false);
    }

    @Override // g6.c
    public final long A(long j8) {
        return this.f193198a.A(j8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p008y1.c2
    public final Object C(v13.c cVar) {
        e2 e2Var;
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i14 = e2Var.f193181c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e2Var.f193181c = i14 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(this, cVar);
            }
        } else {
            e2Var = new e2(this, cVar);
        }
        Object obj = e2Var.f193179a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = e2Var.f193181c;
        b bVar = this.f193201d;
        if (i15 == 0) {
            r.b(obj);
            if (!this.f193199b && !this.f193200c) {
                e2Var.f193181c = 1;
                if (bVar.c(e2Var) == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.f193199b);
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        bVar.e(null);
        return Boolean.valueOf(this.f193199b);
    }

    @Override // g6.c
    public final long D(float f14) {
        return this.f193198a.D(f14);
    }

    @Override // g6.i
    public final float H0(long j8) {
        return this.f193198a.H0(j8);
    }

    @Override // g6.i
    public final long Y(float f14) {
        return this.f193198a.Y(f14);
    }

    @Override // g6.c
    public final float c1(int i14) {
        return this.f193198a.c1(i14);
    }

    @Override // g6.c
    public final float d1(float f14) {
        return this.f193198a.d1(f14);
    }

    public final void e() {
        this.f193200c = true;
        b bVar = this.f193201d;
        if (bVar.a()) {
            bVar.e(null);
        }
    }

    public final void f() {
        this.f193199b = true;
        b bVar = this.f193201d;
        if (bVar.a()) {
            bVar.e(null);
        }
    }

    @Override // g6.c
    public final int f0(float f14) {
        return this.f193198a.f0(f14);
    }

    @Override // g6.c
    public final float g0(long j8) {
        return this.f193198a.g0(j8);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f193198a.getF75991a();
    }

    @Override // g6.c
    public final long k1(long j8) {
        return this.f193198a.k1(j8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(v13.c cVar) {
        d2 d2Var;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i14 = d2Var.f193166c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d2Var.f193166c = i14 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(this, cVar);
            }
        } else {
            d2Var = new d2(this, cVar);
        }
        Object obj = d2Var.f193164a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = d2Var.f193166c;
        if (i15 == 0) {
            r.b(obj);
            d2Var.f193166c = 1;
            if (this.f193201d.c(d2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f193199b = false;
        this.f193200c = false;
        return Unit.INSTANCE;
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f193198a.getF75992b();
    }

    @Override // g6.c
    public final float s0(float f14) {
        return this.f193198a.s0(f14);
    }

    @Override // g6.c
    public final int v0(long j8) {
        return this.f193198a.v0(j8);
    }
}
