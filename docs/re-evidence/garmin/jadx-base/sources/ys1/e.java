package ys1;

import am.j;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import e23.r;
import fo.b0;
import h4.k;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.List;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import pt1.i;
import u1.w;
import u4.p;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l<i, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<i, Unit> f199170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f199171b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super i, Unit> lVar, i iVar) {
            this.f199170a = lVar;
            this.f199171b = iVar;
        }

        @Override // e23.l
        public final Unit invoke(i iVar) {
            iVar.getClass();
            this.f199170a.invoke(this.f199171b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f199172a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f199173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f199174b;

        public c(l lVar, List list) {
            this.f199173a = lVar;
            this.f199174b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f199173a.invoke(this.f199174b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f199175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f199176b;

        public d(l lVar, List list) {
            this.f199175a = lVar;
            this.f199176b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f199175a.invoke(this.f199176b.get(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: ys1.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3732e implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f199177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f199178b;

        public C3732e(List list, l lVar) {
            this.f199177a = list;
            this.f199178b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006c  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
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
                x1 x1Var = n.f135158a;
                i iVar = (i) this.f199177a.get(iIntValue);
                mVar2.C(1228913012);
                l lVar = this.f199178b;
                boolean zB = mVar2.B(lVar) | mVar2.r(iVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new a(lVar, iVar);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(lVar, iVar);
                        mVar2.K(objQ);
                    }
                }
                e.b(iVar, (l) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    public static final void a(int i14, l lVar, h4.r rVar, i53.c cVar, m mVar) {
        cVar.getClass();
        rVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1548190901);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.r rVarE = u1.n.e(rVar, j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d50.j(4, lVar, cVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d50.j(4, lVar, cVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b0(cVar, rVar, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    public static final void b(i iVar, l<? super i, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1534460518);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.B(iVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new xr.a(28, lVar, iVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new xr.a(28, lVar, iVar);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarF, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new yq.d(4);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = v.c((l) objQ2, rVarY, true);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar, eVar.f97920e, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarF, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            i7.a(p.b(iVar.f140859d.f172394c, o0VarE), null, x2.q(aVar, j92.b.f97901d.f97905d), 0L, o0VarE, 56, 8);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = iVar.f140856a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            String str2 = iVar.f140861f;
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(iVar, lVar, i14, 18);
        }
    }
}
