package zs0;

import c2.b0;
import c2.j;
import c2.l;
import c2.y;
import c2.z;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import l72.x0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;
import vd0.s0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o13.p f206821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f206822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f206823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f206824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f206825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f206826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f206827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f206828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f206829j;

    public /* synthetic */ c(o13.p pVar, String str, d dVar, String str2, String str3, String str4, String str5, String str6, String str7, int i14) {
        this.f206820a = i14;
        this.f206821b = pVar;
        this.f206822c = str;
        this.f206823d = dVar;
        this.f206824e = str2;
        this.f206825f = str3;
        this.f206826g = str4;
        this.f206827h = str5;
        this.f206828i = str6;
        this.f206829j = str7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        switch (this.f206820a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1460269635, new c(this.f206821b, this.f206822c, this.f206823d, this.f206824e, this.f206825f, this.f206826g, this.f206827h, this.f206828i, this.f206829j, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(aVar, mVar);
                    g.V.getClass();
                    e0.a aVar2 = g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar);
                    b4.c(g.a.f81809f, i2VarX, mVar);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    x0 x0Var = x0.f111346a;
                    float f14 = 16;
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarC2 = l.C(aVar, f14, 0.0f, f14, f14, 2);
                    String str = this.f206822c;
                    d dVar = this.f206823d;
                    z3.e eVarC = z3.f.c(-534016948, new ak0.g(str, dVar, this.f206824e, this.f206825f, this.f206826g, this.f206827h, this.f206828i, this.f206829j, 14), mVar);
                    int i14 = (x0.f111348c << 6) | 54;
                    x0Var.e(rVarC2, eVarC, mVar, i14, 0);
                    o13.p pVar = this.f206821b;
                    if (pVar != null) {
                        mVar.C(495329714);
                        x0Var.e(l.C(aVar, f14, 0.0f, f14, f14, 2), z3.f.c(155533735, new s0(dVar, (String) pVar.f128594a, 23, (String) pVar.f128595b), mVar), mVar, i14, 0);
                        mVar.f();
                    } else {
                        mVar.C(497971503);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
