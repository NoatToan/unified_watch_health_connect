package y12;

import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import e23.l;
import e23.r;
import f4.s;
import gl1.y;
import h4.k;
import h5.e0;
import i3.i7;
import j2.g;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements r<f2.r, Integer, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f194035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f194036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f194037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f194038d;

    public e(List list, s sVar, l lVar, float f14) {
        this.f194035a = list;
        this.f194036b = sVar;
        this.f194037c = lVar;
        this.f194038d = f14;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    @Override // e23.r
    public final Unit invoke(f2.r rVar, Integer num, m mVar, Integer num2) {
        int i14;
        long jD;
        f2.r rVar2 = rVar;
        int iIntValue = num.intValue();
        m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(rVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            a aVar = (a) this.f194035a.get(iIntValue);
            mVar2.C(-1098255140);
            s sVar = this.f194036b;
            boolean zContains = sVar.contains(aVar);
            String strQ = y.Q(mVar2, aVar.f194027c);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97917b;
            h4.r rVarA = c2.l.A(rVarD, 0.0f, f14, 1);
            p5.l.f136032b.getClass();
            p5.l lVarA = p5.l.a(p5.l.f136033c);
            boolean zH = mVar2.h(zContains) | mVar2.k(aVar.ordinal());
            l lVar = this.f194037c;
            boolean zB = zH | mVar2.B(lVar);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new c(zContains, sVar, aVar, lVar);
                mVar2.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(zContains, sVar, aVar, lVar);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarB = g.b(rVarA, zContains, false, lVarA, (l) objQ, 10);
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(cVar, h4.d.a.f81537o, mVar2, 54);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = k.c(rVarB, mVar2);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            b0 b0Var = b0.f22601a;
            t4.d dVarA = n5.c.a(aVar.f194026b, mVar2, 0);
            if (zContains) {
                mVar2.C(573194271);
                jD = d92.b.a(mVar2).f().a();
            } else {
                mVar2.C(573195170);
                jD = d92.b.a(mVar2).f().d();
            }
            mVar2.f();
            long j8 = jD;
            float f16 = j92.b.f97901d.f97906e * this.f194038d;
            g6.f.a aVar4 = g6.f.f75994b;
            i7.a(dVarA, null, c2.l.y(x2.q(aVar2, f16), f15), j8, mVar2, 48, 0);
            h4.r rVarA2 = c2.l.A(x2.d(aVar2, 1.0f), f15, 0.0f, 2);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
            d6.h.f57752b.getClass();
            g02.c.a(strQ, rVarA2, 0L, d6.h.a(d6.h.f57755e), 0, false, 0, x0VarB, 0.0d, mVar2, 0, 372);
            mVar2.y();
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
