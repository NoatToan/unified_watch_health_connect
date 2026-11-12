package j21;

import android.graphics.Bitmap;
import c2.u;
import c2.x2;
import f5.z0;
import h5.e0;
import nr.p0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96683a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f96684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f96685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f96686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f96687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f96688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f96689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a f96690h;

    public /* synthetic */ n(ds.n nVar, h4.r rVar, Bitmap bitmap, p0 p0Var, boolean z14, float f14, e23.a aVar) {
        this.f96684b = nVar;
        this.f96685c = rVar;
        this.f96687e = bitmap;
        this.f96686d = p0Var;
        this.f96688f = z14;
        this.f96689g = f14;
        this.f96690h = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14 = this.f96683a;
        Object obj3 = this.f96686d;
        Object obj4 = this.f96687e;
        Object obj5 = this.f96685c;
        Object obj6 = this.f96684b;
        switch (i14) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                b92.a aVar = (b92.a) obj3;
                String str3 = (String) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i15 = b92.a.f16960b;
                    q.b(str, str2, aVar, str3, this.f96688f, this.f96689g, this.f96690h, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                q.b((String) obj6, (String) obj5, (b92.a) obj3, (String) obj4, this.f96688f, this.f96689g, this.f96690h, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ds.n nVar = (ds.n) obj6;
                h4.r rVar = (h4.r) obj5;
                Bitmap bitmap = (Bitmap) obj4;
                p0 p0Var = (p0) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarThen = l4.k.c(c2.l.g(x2.f(aVar2, 1.0f), nVar.f61018b)).then(rVar);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarThen, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u uVar = u.f22885a;
                    bitmap.getClass();
                    o4.f fVar = new o4.f(bitmap);
                    h4.r rVarD = x2.d(aVar2, 1.0f);
                    f5.k.f68985a.getClass();
                    y0.c(fVar, null, rVarD, f5.k.a.f68988c, mVar2, 25008, 232);
                    jr.h hVar = ((p0.a.c) p0Var.f127286e).f127293e;
                    boolean z14 = hVar instanceof jr.h.a;
                    boolean z15 = this.f96688f;
                    float f14 = this.f96689g;
                    e23.a aVar4 = this.f96690h;
                    if (z14) {
                        mVar2.C(877849307);
                        es.d.a(null, p0Var, nVar, z15, f14, aVar4, mVar2, 0);
                        mVar2.f();
                    } else if (hVar instanceof jr.h.b) {
                        mVar2.C(877855559);
                        es.e.a(null, p0Var, nVar, z15, f14, aVar4, mVar2, 0);
                        mVar2.f();
                    } else if (hVar instanceof jr.h.e) {
                        mVar2.C(877861688);
                        es.g.a(null, p0Var, nVar, z15, f14, aVar4, mVar2, 0);
                        mVar2.f();
                    } else if (hVar instanceof jr.h.c) {
                        mVar2.C(877867352);
                        es.h.a(null, p0Var, nVar, z15, f14, aVar4, mVar2, 0);
                        mVar2.f();
                    } else if (hVar instanceof jr.h.d) {
                        mVar2.C(877873280);
                        es.j.a(null, p0Var, nVar, z15, f14, aVar4, mVar2, 0);
                        mVar2.f();
                    } else {
                        if (!(hVar instanceof jr.h.f)) {
                            throw n23.j.m(mVar2, 877846757);
                        }
                        mVar2.C(877879324);
                        es.k.a(null, p0Var, nVar, z15, f14, aVar4, mVar2, 0);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(String str, String str2, b92.a aVar, String str3, boolean z14, float f14, e23.a aVar2) {
        this.f96684b = str;
        this.f96685c = str2;
        this.f96686d = aVar;
        this.f96687e = str3;
        this.f96688f = z14;
        this.f96689g = f14;
        this.f96690h = aVar2;
    }

    public /* synthetic */ n(String str, String str2, b92.a aVar, String str3, boolean z14, float f14, e23.a aVar2, int i14) {
        this.f96684b = str;
        this.f96685c = str2;
        this.f96686d = aVar;
        this.f96687e = str3;
        this.f96688f = z14;
        this.f96689g = f14;
        this.f96690h = aVar2;
    }
}
