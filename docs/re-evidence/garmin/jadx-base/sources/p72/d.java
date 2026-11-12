package p72;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import d53.w;
import e23.l;
import e23.r;
import f5.z0;
import h4.k;
import h5.e0;
import i3.i5;
import i3.mh;
import i3.ua;
import java.util.List;
import o72.h3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.u;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<String, Unit> {
        public a(Object obj) {
            super(1, obj, i.class, "onSearchTextChange", "onSearchTextChange(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            i iVar = (i) this.receiver;
            iVar.getClass();
            iVar.f136326a.k(null, str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f136322a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f136323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f136324b;

        public c(l lVar, List list) {
            this.f136323a = lVar;
            this.f136324b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f136323a.invoke(this.f136324b.get(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: p72.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2581d implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f136325a;

        public C2581d(List list) {
            this.f136325a = list;
        }

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
                p72.b bVar = (p72.b) this.f136325a.get(iIntValue);
                mVar2.C(-1512967254);
                d.d(0, bVar.f136316b, bVar.f136317c, mVar2, bVar.f136315a);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(1248656704);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            f("Activity", o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.e(i14, 16);
        }
    }

    public static final void b(m mVar, int i14) {
        o0 o0VarE = mVar.E(-328614262);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            f("All", o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.e(i14, 19);
        }
    }

    public static final void c(m mVar, int i14) {
        o0 o0VarE = mVar.E(461114890);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            f("App", o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.e(i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0184  */
    /* JADX WARN: Code duplicated, block: B:37:0x018b  */
    /* JADX WARN: Code duplicated, block: B:38:0x018f  */
    /* JADX WARN: Code duplicated, block: B:43:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x028d  */
    public static final void d(int i14, String str, String str2, m mVar, u4.d dVar) {
        int i15;
        h5.g.a.f fVar;
        int i16;
        float f14;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        u4.d dVar2 = dVar;
        o0 o0VarE = mVar.E(-801319599);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(dVar2) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strG = g(dVar2.f168376a);
            String strK0 = h0.k0(u.C(new String[]{str, str2, strG}), ".", null, null, null, 62);
            h4.r.a aVar = h4.r.S;
            float f15 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.l.C(aVar, 0.0f, f15, 0.0f, 0.0f, 13), o0VarE);
            h4.r rVarA = c2.l.A(aVar, f15, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarA, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i17;
            } else {
                i15 = i17;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                i16 = i15;
                mh.c(strG, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131070);
                String strConcat = "GdsIcons.".concat(strK0);
                fVar2.getClass();
                mh.c(strConcat, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                f14 = 8;
                h4.r rVarC3 = c2.l.C(aVar, f15, f14, f15, 0.0f, 8);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.c cVar2 = j92.b.f97901d;
                int i18 = 48 | (i16 & 14);
                y0.b(dVar, null, x2.q(aVar, cVar2.f97907f), null, o0VarE, i18, 120);
                o4.e0.a aVar4 = o4.e0.f128843b;
                o4.r rVarA2 = o4.e0.a.a(aVar4, d92.b.a(o0VarE).f().b());
                bVar2.getClass();
                y0.b(dVar, null, x2.q(aVar, cVar2.f97906e), rVarA2, o0VarE, i18, 56);
                o4.r rVarA3 = o4.e0.a.a(aVar4, d92.b.a(o0VarE).f().d());
                h4.r rVarC4 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
                bVar2.getClass();
                y0.b(dVar, null, x2.q(rVarC4, cVar2.f97905d), rVarA3, o0VarE, i18, 56);
                o4.r rVarA4 = o4.e0.a.a(aVar4, d92.b.a(o0VarE).f().a());
                h4.r rVarC5 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
                bVar2.getClass();
                y0.b(dVar, null, x2.q(rVarC5, cVar2.f97904c), rVarA4, o0VarE, i18, 56);
                o4.r rVarA5 = o4.e0.a.a(aVar4, d92.b.a(o0VarE).f().e());
                h4.r rVarC6 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
                bVar2.getClass();
                y0.b(dVar, null, x2.q(rVarC6, cVar2.f97903b), rVarA5, o0VarE, i18, 56);
                o4.r rVarA6 = o4.e0.a.a(aVar4, d92.b.a(o0VarE).f().f());
                h4.r rVarC7 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
                bVar2.getClass();
                h4.r rVarQ = x2.q(rVarC7, cVar2.f97902a);
                dVar2 = dVar;
                y0.b(dVar2, null, rVarQ, rVarA6, o0VarE, i18, 56);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            i16 = i15;
            mh.c(strG, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131070);
            String strConcat2 = "GdsIcons.".concat(strK0);
            fVar3.getClass();
            mh.c(strConcat2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            f14 = 8;
            h4.r rVarC8 = c2.l.C(aVar, f15, f14, f15, 0.0f, 8);
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC8, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.c cVar3 = j92.b.f97901d;
            int i19 = 48 | (i16 & 14);
            y0.b(dVar, null, x2.q(aVar, cVar3.f97907f), null, o0VarE, i19, 120);
            o4.e0.a aVar5 = o4.e0.f128843b;
            o4.r rVarA7 = o4.e0.a.a(aVar5, d92.b.a(o0VarE).f().b());
            bVar3.getClass();
            y0.b(dVar, null, x2.q(aVar, cVar3.f97906e), rVarA7, o0VarE, i19, 56);
            o4.r rVarA8 = o4.e0.a.a(aVar5, d92.b.a(o0VarE).f().d());
            h4.r rVarC9 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            bVar3.getClass();
            y0.b(dVar, null, x2.q(rVarC9, cVar3.f97905d), rVarA8, o0VarE, i19, 56);
            o4.r rVarA9 = o4.e0.a.a(aVar5, d92.b.a(o0VarE).f().a());
            h4.r rVarC10 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            bVar3.getClass();
            y0.b(dVar, null, x2.q(rVarC10, cVar3.f97904c), rVarA9, o0VarE, i19, 56);
            o4.r rVarA10 = o4.e0.a.a(aVar5, d92.b.a(o0VarE).f().e());
            h4.r rVarC11 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            bVar3.getClass();
            y0.b(dVar, null, x2.q(rVarC11, cVar3.f97903b), rVarA10, o0VarE, i19, 56);
            o4.r rVarA11 = o4.e0.a.a(aVar5, d92.b.a(o0VarE).f().f());
            h4.r rVarC12 = c2.l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            bVar3.getClass();
            h4.r rVarQ2 = x2.q(rVarC12, cVar3.f97902a);
            dVar2 = dVar;
            y0.b(dVar2, null, rVarQ2, rVarA11, o0VarE, i19, 56);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p72.c(dVar2, str, str2, i14);
        }
    }

    public static final void e(m mVar, int i14) {
        o0 o0VarE = mVar.E(-160349998);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            f("Features", o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.e(i14, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(String str, m mVar, int i14) {
        boolean z14;
        o0 o0VarE = mVar.E(643121598);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j(str);
                o0VarE.K(objQ);
            }
            j jVar = (j) objQ;
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            i iVar = (i) v9.b.a(s0.f105811a.b(i.class), viewModelStoreOwnerA, null, jVar, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            p1 p1VarC = p0.c(iVar.f136327b, o0VarE, 0);
            p1 p1VarC2 = p0.c(iVar.f136330e, o0VarE, 0);
            p1 p1VarC3 = p0.c(iVar.f136329d, o0VarE, 0);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String str2 = (String) p1VarC.getF182175a();
            p72.a.f136312a.getClass();
            z3.e eVar2 = p72.a.f136313b;
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(iVar);
                o0VarE.K(objQ2);
            }
            l72.p1.a(str2, null, "Search", null, false, false, null, 0L, null, null, eVar2, null, null, (l) ((k23.g) objQ2), o0VarE, 384, 6, 15354);
            o0VarE = o0VarE;
            g6.f.a aVar3 = g6.f.f75994b;
            c2.l.f(x2.h(aVar, 16), o0VarE);
            if (((Boolean) p1VarC3.getF182175a()).booleanValue()) {
                o0VarE.C(1892655746);
                h4.r rVarD2 = x2.d(aVar, 1.0f);
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = k.c(rVarD2, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                ua.a(0.0f, 0.0f, 0, 0, 62, 0L, 0L, c2.u.f22885a.c(aVar, h4.d.a.f81528f), o0VarE);
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(1892873707);
                h4.r rVarF = x2.f(aVar, 1.0f);
                boolean zB = o0VarE.B(p1VarC2);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new i5(p1VarC2, 8);
                    o0VarE.K(objQ3);
                }
                e2.c.b(rVarF, null, null, null, null, null, false, null, (l) objQ3, o0VarE, 6, 510);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 6);
        }
    }

    public static final String g(String str) {
        str.getClass();
        return h0.k0(w.W(str, new String[]{"_"}), StringUtils.SPACE, null, null, new p40.h(2), 30);
    }
}
