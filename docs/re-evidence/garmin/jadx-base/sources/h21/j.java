package h21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.g1;
import b82.k1;
import c2.b0;
import c22.l3;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o53.f0;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81091a;

        static {
            int[] iArr = new int[g21.x.values().length];
            try {
                iArr[g21.x.MACROS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g21.x.OTHER_NUTRIENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81091a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:92:0x023b  */
    public static final void a(o82.a aVar, i53.c<k01.h> cVar, pi0.e eVar, v21.e eVar2, n82.f fVar, i21.d dVar, p3.m mVar, int i14) {
        k01.h next;
        boolean z14;
        o0 o0VarE = mVar.E(-1213666500);
        i53.c<k01.h> cVar2 = cVar;
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(cVar2) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128) | (o0VarE.r(eVar2) ? 2048 : 1024) | (o0VarE.B(fVar) ? 16384 : 8192) | (o0VarE.r(dVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b63.o oVar = aVar.f130843a;
            boolean z15 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                objQ = new i(aVar, 0);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i(aVar, 0);
                    o0VarE.K(objQ);
                }
            }
            List listG0 = h0.G0(c0.s(c53.q.e((e23.l) objQ, oVar)));
            h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            float f15 = eVar3.f97920e;
            bVar.getClass();
            float f16 = eVar3.f97918c;
            bVar.getClass();
            bVar.getClass();
            h4.r rVarB = c2.l.B(rVarE, f14, f16, f15, f15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(520611863);
            for (Iterator it = listG0.iterator(); it.hasNext(); it = it) {
                b63.o oVar2 = (b63.o) it.next();
                Iterator<k01.h> it3 = cVar2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(next.f102060a, oVar2));
                k01.h hVar = next;
                if (hVar == null) {
                    hVar = new k01.h(oVar2, null, null);
                }
                b63.o oVar3 = hVar.f102060a;
                String string = context.getString(R.string.no_value);
                string.getClass();
                g21.e eVar4 = new g21.e(oVar3, eVar, string);
                pi0.e eVar5 = eVar4.f75411b;
                b63.o oVar4 = eVar4.f75410a;
                String string2 = eVar4.f75412c;
                String strD = oVar4 != null ? eVar5.d(g22.l.h(oVar4), qi0.a.WEEKDAY) : string2;
                if (oVar4 != null) {
                    string2 = eVar5.d(g22.l.h(oVar4), qi0.a.RELATIVE_YEAR_MONTH_DAY);
                }
                k01.k kVar2 = hVar.f102061b;
                Double d14 = kVar2 != null ? kVar2.f102077f : null;
                eVar2.getClass();
                if (d14 == null || d14.doubleValue() <= 0.0d || Double.isNaN(d14.doubleValue())) {
                    z14 = false;
                } else {
                    Context context2 = eVar2.f175324a;
                    l3.a aVar4 = l3.f23124b;
                    l22.a aVar5 = eVar2.f175325b;
                    double dDoubleValue = d14.doubleValue();
                    String str = eVar2.f175327d;
                    aVar4.getClass();
                    z14 = false;
                    string2 = context2.getString(R.string.string_space_bullet_string_pattern, string2, l3.a.B0(aVar5, dDoubleValue, 0, str));
                    string2.getClass();
                }
                z3.e eVarC = z3.f.c(1567113032, new e11.c0(24, eVar2, hVar), o0VarE);
                h4.r.a aVar6 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar6, 0.0f, j92.b.f97899b.f97917b, 1);
                boolean zR = ((i15 & 57344) == 16384 ? true : z14) | o0VarE.r(oVar2) | o0VarE.r(dVar);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new fk0.a(fVar, 18, oVar2, dVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new fk0.a(fVar, 18, oVar2, dVar);
                        o0VarE.K(objQ2);
                    }
                }
                l72.l.d(strD, string2, eVarC, rVarA, null, false, (e23.a) objQ2, o0VarE, 384, 48);
                cVar2 = cVar;
                context = context;
                i15 = i15;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c(aVar, cVar, eVar, eVar2, fVar, dVar, i14, 29);
        }
    }

    public static final void b(final x01.e eVar, final o82.a aVar, final List list, final g21.x xVar, final e23.l lVar, final List list2, final k01.f fVar, final boolean z14, final List list3, final g21.l lVar2, final e23.l lVar3, final List list4, final boolean z15, final g21.r rVar, final e23.l lVar4, final v21.e eVar2, final Integer num, p3.m mVar, final int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1268104057);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.k(xVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        boolean zR = o0VarE.r(list2);
        char c14 = Ascii.MIN;
        int i16 = i15 | (zR ? 131072 : 65536);
        boolean zR2 = o0VarE.r(fVar);
        char c15 = Ascii.MIN;
        int i17 = i16 | (zR2 ? 1048576 : 524288) | (o0VarE.h(z14) ? 8388608 : 4194304) | (o0VarE.r(list3) ? 67108864 : 33554432) | (o0VarE.k(lVar2.ordinal()) ? 536870912 : 268435456);
        int i18 = (o0VarE.r(lVar3) ? (char) 4 : (char) 2) | (o0VarE.r(list4) ? ' ' : (char) 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.k(rVar.ordinal()) ? (char) 2048 : (char) 1024) | (o0VarE.r(lVar4) ? (char) 16384 : (char) 8192);
        if (o0VarE.r(eVar2)) {
            c14 = 0;
        }
        int i19 = i18 | c14;
        if (o0VarE.B(num)) {
            c15 = 0;
        }
        if (o0VarE.n(i17 & 1, ((306783379 & i17) == 306783378 && (599187 & (i19 | c15)) == 599186) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(1122742237);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new g1(gl1.d.T(((g21.x) it.next()).f75534a, o0VarE, 0), null, null, null, 14, null));
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList);
            int iIndexOf = list.indexOf(xVar);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            h4.r rVarA = m0.a(h4.r.S, true, null);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new h02.a(4);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarA, false);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarC, f14, eVar3.f97920e);
            boolean z16 = (i17 & 57344) == 16384;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new fb0.d(lVar, 7);
                o0VarE.K(objQ2);
            }
            k1.a(fVarJ, iIndexOf, rVarZ, null, 0.0f, (e23.l) objQ2, o0VarE, 3072, 16);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81525c;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new h02.a(5);
                o0VarE.K(objQ3);
            }
            r1.b.a(xVar, null, (e23.l) objQ3, gVar, null, null, z3.f.c(-1021645104, new e23.r() { // from class: h21.e
                @Override // e23.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    k01.c cVar;
                    k01.c cVar2;
                    g21.x xVar2 = (g21.x) obj2;
                    p3.m mVar2 = (p3.m) obj3;
                    ((Integer) obj4).getClass();
                    ((r1.l) obj).getClass();
                    xVar2.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    int i24 = j.a.f81091a[xVar2.ordinal()];
                    x01.e eVar4 = eVar;
                    k01.f fVar2 = fVar;
                    o82.a aVar2 = aVar;
                    List list5 = list2;
                    v21.e eVar5 = eVar2;
                    k01.k kVar = null;
                    if (i24 == 1) {
                        mVar2.C(-1690931630);
                        h4.r.a aVar3 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(aVar3, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        b0 b0Var = b0.f22601a;
                        x01.f fVar3 = eVar4.f188255d;
                        if (fVar2 != null && (cVar = fVar2.f102054a) != null) {
                            kVar = cVar.f102020e;
                        }
                        j.c(fVar3, aVar2, list5, z14, lVar2, list3, gl1.y.S(kVar), num, eVar5, lVar3, mVar2, 0);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        if (i24 != 2) {
                            throw n23.j.m(mVar2, 1746568105);
                        }
                        mVar2.C(-1690050951);
                        h4.r.a aVar5 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar3 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA2 = c2.y.a(kVar3, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(aVar5, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar2);
                        b0 b0Var2 = b0.f22601a;
                        x01.f fVar4 = eVar4.f188255d;
                        if (fVar2 != null && (cVar2 = fVar2.f102054a) != null) {
                            kVar = cVar2.f102020e;
                        }
                        j.d(fVar4, aVar2, list4, list5, z15, rVar, gl1.y.T(kVar), eVar5, lVar4, mVar2, 0);
                        mVar2.y();
                        mVar2.f();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, ((i17 >> 9) & 14) | 1576320, 50);
            o0Var = o0VarE;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(aVar, list, xVar, lVar, list2, fVar, z14, list3, lVar2, lVar3, list4, z15, rVar, lVar4, eVar2, num, i14) { // from class: h21.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f81062b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f81063c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ g21.x f81064d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f81065e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f81066f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ k01.f f81067g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f81068h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ List f81069i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ g21.l f81070j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.l f81071k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ List f81072l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ boolean f81073m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ g21.r f81074n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e23.l f81075o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ v21.e f81076p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Integer f81077q;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    j.b(this.f81061a, this.f81062b, this.f81063c, this.f81064d, this.f81065e, this.f81066f, this.f81067g, this.f81068h, this.f81069i, this.f81070j, this.f81071k, this.f81072l, this.f81073m, this.f81074n, this.f81075o, this.f81076p, this.f81077q, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(x01.f fVar, o82.a aVar, List<k01.h> list, boolean z14, g21.l lVar, List<? extends g21.l> list2, g21.b bVar, Integer num, v21.e eVar, e23.l<? super g21.l, Unit> lVar2, p3.m mVar, int i14) {
        g21.l lVar3;
        o0 o0VarE = mVar.E(744982328);
        int i15 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(lVar.ordinal()) ? 16384 : 8192) | (o0VarE.r(list2) ? 131072 : 65536) | (o0VarE.B(bVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(num) ? 8388608 : 4194304) | (o0VarE.r(eVar) ? 67108864 : 33554432) | (o0VarE.r(lVar2) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            if (fVar != x01.f.NEVER) {
                o0VarE.C(1673105475);
                f21.g.b(aVar.f130843a, aVar.f130844b, z14, i53.a.j(list), lVar, num, o0VarE, ((i15 >> 6) & 458752) | ((i15 >> 3) & 896) | (57344 & i15));
                if (z14) {
                    o0VarE.C(1673466625);
                    lVar3 = lVar;
                    f0.f(lVar3, list2, lVar2, o0VarE, ((i15 >> 12) & 126) | ((i15 >> 21) & 896));
                    o0VarE.g0(false);
                } else {
                    lVar3 = lVar;
                    o0VarE.C(1673690538);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                lVar3 = lVar;
                o0VarE.C(1673696490);
                o0VarE.g0(false);
            }
            f21.q.a(bVar, eVar, o0VarE, ((i15 >> 18) & 14) | ((i15 >> 21) & 112));
        } else {
            lVar3 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ci0.g(fVar, aVar, list, z14, lVar3, list2, bVar, num, eVar, lVar2, i14, 3);
        }
    }

    public static final void d(x01.f fVar, o82.a aVar, List<s21.n> list, List<k01.h> list2, boolean z14, g21.r rVar, g21.c cVar, v21.e eVar, e23.l<? super g21.r, Unit> lVar, p3.m mVar, int i14) {
        g21.r rVar2;
        boolean z15;
        Iterator it;
        Object next;
        o0 o0VarE = mVar.E(-1657575837);
        int i15 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(list2) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.k(rVar.ordinal()) ? 131072 : 65536) | (o0VarE.B(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(eVar) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            if (fVar != x01.f.NEVER) {
                o0VarE.C(-1602207703);
                ArrayList arrayList = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    s21.n nVar = (s21.n) it3.next();
                    w13.c cVar2 = g21.r.f75490k;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                    while (true) {
                        if (!bVarN.hasNext()) {
                            it = it3;
                            next = null;
                            break;
                        } else {
                            next = bVarN.next();
                            it = it3;
                            if (p005kotlin.jvm.internal.s.g(((g21.r) next).f75491a, nVar.f156152b)) {
                                break;
                            } else {
                                it3 = it;
                            }
                        }
                    }
                    g21.r rVar3 = (g21.r) next;
                    if (rVar3 != null) {
                        arrayList.add(rVar3);
                    }
                    it3 = it;
                }
                f21.j.b(aVar.f130843a, aVar.f130844b, z14, list, i53.a.j(list2), rVar, arrayList, o0VarE, (458752 & i15) | ((i15 >> 6) & 896) | ((i15 << 3) & 7168));
                if (z14) {
                    o0VarE.C(-1601678378);
                    rVar2 = rVar;
                    xy2.b.e(rVar2, arrayList, lVar, o0VarE, ((i15 >> 15) & 14) | ((i15 >> 18) & 896));
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    rVar2 = rVar;
                    z15 = false;
                    o0VarE.C(-1601454465);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            } else {
                rVar2 = rVar;
                o0VarE.C(-1601448513);
                o0VarE.g0(false);
            }
            int i16 = i15 >> 15;
            f21.x.a(list, cVar, eVar, o0VarE, ((i15 >> 6) & 14) | (i16 & 112) | (i16 & 896));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.r(fVar, aVar, list, list2, z14, rVar2, cVar, eVar, lVar, i14);
        }
    }

    public static final void e(o82.a aVar, x01.e eVar, i21.d dVar, n82.f fVar, i21.c cVar, o82.a aVar2, v21.e eVar2, p3.m mVar, int i14) {
        int i15;
        i21.c cVar2;
        o0 o0Var;
        aVar.getClass();
        eVar.getClass();
        dVar.getClass();
        cVar.getClass();
        eVar2.getClass();
        o0 o0VarE = mVar.E(-1148235991);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            cVar2 = cVar;
            i15 |= o0VarE.r(cVar2) ? 16384 : 8192;
        } else {
            cVar2 = cVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(eVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            u82.e.b(aVar, dVar.f87290x, null, false, z3.f.c(-1809298487, new d(dVar, cVar2, eVar, eVar2, aVar, aVar2, new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), fVar), o0VarE), o0Var, (i16 & 14) | 27648, 4);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, eVar, dVar, fVar, cVar, aVar2, eVar2, i14, 0);
        }
    }
}
