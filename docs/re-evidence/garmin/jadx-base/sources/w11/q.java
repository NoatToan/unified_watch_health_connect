package w11;

import c2.x2;
import gl1.y;
import i3.mh;
import java.util.List;
import l72.p2;
import l72.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import p5.v;
import s5.x0;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f181241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f181242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21.e f181243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f181244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p f181245e;

    public q(List list, e23.a aVar, v21.e eVar, e23.l lVar, e23.p pVar) {
        this.f181241a = list;
        this.f181242b = aVar;
        this.f181243c = eVar;
        this.f181244d = lVar;
        this.f181245e = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x016b  */
    /* JADX WARN: Code duplicated, block: B:46:0x018e  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        String strA;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            v11.b bVar = (v11.b) this.f181241a.get(iIntValue);
            mVar2.C(-469365844);
            if (bVar instanceof v11.b.C3248b) {
                mVar2.C(-469342130);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar, j92.b.f97899b.f97921f);
                String strC = r.c(((v11.b.C3248b) bVar).f174670a, mVar2);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                d6.h.f57752b.getClass();
                mh.c(strC, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                mVar2 = mVar2;
                mVar2.f();
            } else {
                boolean z14 = bVar instanceof v11.b.a;
                p3.m.a aVar2 = p3.m.f135153a;
                if (z14) {
                    mVar2.C(-468877595);
                    p2 p2Var = p2.f111205a;
                    h4.r.a aVar3 = h4.r.S;
                    Object objQ = mVar2.q();
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = k.f181232a;
                        mVar2.K(objQ);
                    }
                    p2Var.g(r.c(((v11.b.a) bVar).f174668a, mVar2), v.c((e23.l) objQ, aVar3, false), null, null, z3.f.c(-101590819, new l(bVar), mVar2), false, false, this.f181242b, mVar2, 24576, 236);
                    mVar2 = mVar2;
                    mVar2.f();
                } else if (bVar instanceof v11.b.d) {
                    mVar2.C(-468022987);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar4, j92.b.f97899b.f97917b), mVar2);
                    r1.b(r.c(((v11.b.d) bVar).f174675a, mVar2), null, mVar2, 0, 2);
                    mVar2.f();
                } else if (bVar instanceof v11.b.e) {
                    mVar2.C(-467752295);
                    v11.b.e eVar = (v11.b.e) bVar;
                    e23.l lVar = this.f181244d;
                    boolean zB = mVar2.B(lVar) | mVar2.r(bVar);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new m(lVar, bVar);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new m(lVar, bVar);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ2;
                    e23.p pVar = this.f181245e;
                    boolean zB2 = mVar2.B(pVar) | mVar2.r(bVar);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new n(pVar, bVar);
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new n(pVar, bVar);
                            mVar2.K(objQ3);
                        }
                    }
                    r.b(this.f181243c, eVar, aVar5, (e23.l) objQ3, null, mVar2, 0);
                    mVar2.f();
                } else {
                    if (!(bVar instanceof v11.b.c)) {
                        throw n23.j.m(mVar2, 816143159);
                    }
                    mVar2.C(-467284040);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar6, j92.b.f97899b.f97921f), mVar2);
                    v11.b.c cVar = (v11.b.c) bVar;
                    g21.p pVar2 = cVar.f174672b;
                    b11.l lVar2 = pVar2 != null ? pVar2.f75473a : null;
                    if (lVar2 == null) {
                        mVar2.C(-467158584);
                        mVar2.f();
                        strA = null;
                    } else {
                        mVar2.C(816214361);
                        strA = lVar2.a(a0.s(mVar2));
                        mVar2.f();
                    }
                    if (strA == null) {
                        mVar2.C(816215774);
                        strA = y.Q(mVar2, b11.c.SNACKS.f14251b);
                    } else {
                        mVar2.C(816213666);
                    }
                    mVar2.f();
                    String str = strA;
                    g21.h hVar = cVar.f174671a;
                    z01.f.a(this.f181243c, hVar.f75428e, hVar.f75429f.g(), str, pVar2 != null ? pVar2.f75474b : null, pVar2 != null ? pVar2.f75475c : null, cVar.f174673c, cVar.f174674d, mVar2, 0);
                    mVar2.f();
                }
            }
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
