package a3;

import c2.x2;
import com.google.android.exoplayer2.C;
import i3.i7;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f731d;

    public /* synthetic */ l0(zf2.b bVar, long j8, e23.a aVar, int i14) {
        this.f728a = 10;
        this.f730c = bVar;
        this.f729b = j8;
        this.f731d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.lifecycle.j1 j1VarA;
        int i14 = this.f728a;
        long j8 = this.f729b;
        Object obj3 = this.f731d;
        Object obj4 = this.f730c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                m0.b((t4.d) obj4, (h4.r) obj3, this.f729b, (p3.m) obj, p3.p0.t(57));
                break;
            case 1:
                lc.m0 m0Var = (lc.m0) obj4;
                String str = (String) obj3;
                b63.v vVar = (b63.v) obj;
                b63.v vVar2 = (b63.v) obj2;
                vVar.getClass();
                vVar2.getClass();
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(new o21.e(this.f729b, str, vVar, vVar2), "mealWindowResult");
                }
                m0Var.n();
                break;
            case 2:
                ((Integer) obj2).getClass();
                c22.g0.b(this.f729b, (e23.a) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ea0.f.a(this.f729b, (ea0.g) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 4:
                ((a42.d0) obj4).invoke(Long.valueOf(j8), (zf2.d) obj3, (zf2.i) obj, (String) obj2);
                break;
            case 5:
                u4.d dVar = (u4.d) obj4;
                String str2 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (dVar == null) {
                        mVar.C(1982013341);
                        mVar.f();
                    } else {
                        mVar.C(1982013342);
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.b(dVar, str2, x2.q(aVar, j92.b.f97901d.f97904c), this.f729b, mVar, 0, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                hx0.m0.a(this.f729b, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ib0.e.a((h4.r) obj3, (jb0.c) obj4, this.f729b, (p3.m) obj, p3.p0.t(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                il1.f.b(p3.p0.t(1), this.f729b, (h4.r) obj3, (p3.m) obj, (u4.d) obj4);
                break;
            case 9:
                ((Integer) obj2).getClass();
                l72.f0 f0Var = l72.f0.f110999a;
                ((l72.f0) obj4).l((h4.r) obj3, this.f729b, (p3.m) obj, p3.p0.t(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                mg2.a.a((zf2.b) obj4, this.f729b, (e23.a) obj3, (p3.m) obj, p3.p0.t(7));
                break;
            case 11:
                e23.a aVar2 = (e23.a) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zB = mVar2.B(aVar2) | mVar2.B(lVar);
                    long j14 = this.f729b;
                    boolean zL = zB | mVar2.l(j14);
                    Object objQ = mVar2.q();
                    if (zL) {
                        d62.s sVar = new d62.s(aVar2, lVar, j14, 8);
                        mVar2.K(sVar);
                        objQ = sVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            d62.s sVar2 = new d62.s(aVar2, lVar, j14, 8);
                            mVar2.K(sVar2);
                            objQ = sVar2;
                        }
                    }
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = 0;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarB = c2.l.B(aVar3, f14, f15, f15, eVar.f97917b);
                    i3.c1 c1Var = i3.c1.f87691a;
                    long jE = d92.b.a(mVar2).k().e();
                    c1Var.getClass();
                    i3.b1 b1VarC = i3.c1.c(0L, jE, 0L, mVar2, 13);
                    tg1.i.f164519a.getClass();
                    i3.h1.c((e23.a) objQ, rVarB, false, null, b1VarC, null, null, null, tg1.i.f164520b, mVar2, C.ENCODING_PCM_32BIT, 492);
                } else {
                    mVar2.e();
                }
                break;
            default:
                Double d14 = (Double) obj4;
                yp0.o oVar = (yp0.o) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    m92.y.b(o4.d0.a(j8), String.valueOf((int) d14.doubleValue()), "", null, oVar.f198684e.g(d14.doubleValue(), true), null, mVar3, 384, 40);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l0(h4.r rVar, Object obj, long j8, int i14, int i15) {
        this.f728a = i15;
        this.f731d = rVar;
        this.f730c = obj;
        this.f729b = j8;
    }

    public /* synthetic */ l0(Object obj, long j8, Object obj2, int i14) {
        this.f728a = i14;
        this.f730c = obj;
        this.f729b = j8;
        this.f731d = obj2;
    }

    public /* synthetic */ l0(Object obj, h4.r rVar, long j8, int i14, int i15) {
        this.f728a = i15;
        this.f730c = obj;
        this.f731d = rVar;
        this.f729b = j8;
    }

    public /* synthetic */ l0(Object obj, Object obj2, long j8, int i14) {
        this.f728a = i14;
        this.f730c = obj;
        this.f731d = obj2;
        this.f729b = j8;
    }

    public /* synthetic */ l0(long j8, Object obj, o13.h hVar, int i14, int i15) {
        this.f728a = i15;
        this.f729b = j8;
        this.f730c = obj;
        this.f731d = hVar;
    }
}
