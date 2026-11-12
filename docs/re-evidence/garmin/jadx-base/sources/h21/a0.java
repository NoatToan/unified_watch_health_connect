package h21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.g1;
import b82.k1;
import c2.b0;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import f21.m0;
import f21.n0;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o53.f0;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81033a;

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
            f81033a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    public static final void a(o82.a aVar, i53.f<k01.l> fVar, v21.e eVar, pi0.e eVar2, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        List<b63.o> listG0;
        k01.l next;
        o0 o0VarE = mVar.E(314995313);
        i53.f<k01.l> fVar2 = fVar;
        int i15 = 16384;
        int i16 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(fVar2) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128) | (o0VarE.r(eVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            v21.f fVar3 = v21.f.f175333a;
            b63.o oVar = v21.d.f175306j;
            fVar3.getClass();
            oVar.getClass();
            b63.o oVar2 = aVar.f130843a;
            if (p005kotlin.jvm.internal.s.g(oVar2, oVar)) {
                b63.o oVar3 = aVar.f130844b;
                b63.i.INSTANCE.getClass();
                listG0 = c0.s(c53.q.e(new i(aVar, 2), b63.q.c(oVar3, 6, b63.i.f16190d)));
            } else {
                listG0 = h0.G0(c0.s(c53.q.e(new i(aVar, 3), oVar2)));
            }
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
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            o0VarE.C(-1298784468);
            for (b63.o oVar4 : listG0) {
                Iterator<k01.l> it = fVar2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(next.f102094a, oVar4));
                k01.l lVar2 = next;
                if (lVar2 == null) {
                    b63.i.INSTANCE.getClass();
                    lVar2 = new k01.l(oVar4, b63.q.e(oVar4, i17, b63.i.f16191e), (k01.k) null, (k01.k) null, 12, (p005kotlin.jvm.internal.j) null);
                }
                b63.o oVar5 = lVar2.f102095b;
                b63.o oVar6 = lVar2.f102094a;
                String strM = (oVar6 == null || oVar5 == null) ? eVar.f175327d : eVar2.m(g22.l.h(oVar6), g22.l.h(oVar5), pi0.f.SHORT_MONTH_NO_WEEKDAY);
                k01.k kVar2 = lVar2.f102096c;
                String strC = eVar.c(kVar2 != null ? kVar2.f102072a : null);
                String strQ = gl1.y.Q(o0VarE, R.string.common_lbl_avg_daily);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97917b, i17);
                int i18 = ((57344 & i16) == i15 ? i17 : 0) | (o0VarE.r(lVar2) ? 1 : 0);
                Object objQ = o0VarE.q();
                if (i18 == 0) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new gp.f(13, lVar, lVar2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new gp.f(13, lVar, lVar2);
                    o0VarE.K(objQ);
                }
                o0 o0Var2 = o0VarE;
                l72.l.e(strM, null, strC, strQ, null, null, rVarA, null, false, (e23.a) objQ, o0Var2, 0, 434);
                fVar2 = fVar;
                o0VarE = o0Var2;
                i15 = i15;
                i17 = 1;
            }
            o0Var = o0VarE;
            o0Var.g0(false);
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p(aVar, fVar, eVar, eVar2, lVar, i14, 15);
        }
    }

    public static final void b(x01.f fVar, o82.a aVar, ArrayList arrayList, boolean z14, g21.l lVar, List list, g21.b bVar, v21.e eVar, pi0.e eVar2, Integer num, e23.l lVar2, p3.m mVar, int i14) {
        g21.l lVar3;
        fVar.getClass();
        aVar.getClass();
        lVar.getClass();
        list.getClass();
        eVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1598367);
        int i15 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(arrayList) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(lVar.ordinal()) ? 16384 : 8192) | (o0VarE.r(list) ? 131072 : 65536) | (o0VarE.B(bVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(eVar) ? 8388608 : 4194304) | (o0VarE.r(eVar2) ? 67108864 : 33554432) | (o0VarE.B(num) ? 536870912 : 268435456);
        int i16 = o0VarE.r(lVar2) ? 4 : 2;
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            if (fVar != x01.f.NEVER) {
                o0VarE.C(372950821);
                int i17 = i15 >> 9;
                m0.b(aVar.f130843a, aVar.f130844b, z14, i53.a.j(arrayList), lVar, eVar2, num, o0VarE, ((i15 >> 3) & 896) | (i15 & 57344) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE | (i17 & 458752) | (i17 & 3670016));
                if (z14) {
                    o0VarE.C(373364826);
                    lVar3 = lVar;
                    f0.f(lVar3, list, lVar2, o0VarE, ((i15 >> 12) & 126) | ((i16 << 6) & 896));
                    o0VarE.g0(false);
                } else {
                    lVar3 = lVar;
                    o0VarE.C(373588739);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                lVar3 = lVar;
                o0VarE.C(373594691);
                o0VarE.g0(false);
            }
            f21.q.a(bVar, eVar, o0VarE, (i15 >> 18) & 126);
        } else {
            lVar3 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et1.e(fVar, aVar, arrayList, z14, lVar3, list, bVar, eVar, eVar2, num, lVar2, i14);
        }
    }

    public static final void c(final x01.e eVar, final o82.a aVar, List list, g21.x xVar, e23.l lVar, final ArrayList arrayList, final k01.g gVar, final boolean z14, final List list2, final g21.l lVar2, final e23.l lVar3, final boolean z15, final List list3, final g21.r rVar, final e23.l lVar4, final v21.e eVar2, final pi0.e eVar3, final Integer num, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(246385263);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.k(xVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        boolean zR = o0VarE.r(arrayList);
        char c14 = Ascii.MIN;
        int i16 = i15 | (zR ? 131072 : 65536);
        boolean zR2 = o0VarE.r(gVar);
        char c15 = Ascii.MIN;
        int i17 = i16 | (zR2 ? 1048576 : 524288);
        boolean zH = o0VarE.h(z14);
        char c16 = Ascii.MIN;
        int i18 = i17 | (zH ? 8388608 : 4194304) | (o0VarE.r(list2) ? 67108864 : 33554432) | (o0VarE.k(lVar2.ordinal()) ? 536870912 : 268435456);
        int i19 = 0 | (o0VarE.r(lVar3) ? (char) 4 : (char) 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.r(list3) ? 256 : 128) | (o0VarE.k(rVar.ordinal()) ? (char) 2048 : (char) 1024) | (o0VarE.r(lVar4) ? (char) 16384 : (char) 8192);
        if (o0VarE.r(eVar2)) {
            c14 = 0;
        }
        int i24 = i19 | c14;
        if (o0VarE.r(eVar3)) {
            c15 = 0;
        }
        int i25 = i24 | c15;
        if (o0VarE.B(num)) {
            c16 = 0;
        }
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (4793491 & (i25 | c16)) == 4793490) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(553066981);
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new g1(gl1.d.T(((g21.x) it.next()).f75534a, o0VarE, 0), null, null, null, 14, null));
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList2);
            int iIndexOf = list.indexOf(xVar);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            h4.r rVarA = u1.m0.a(h4.r.S, true, null);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new h02.a(6);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarA, false);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar4 = j92.b.f97899b;
            float f14 = eVar4.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarC, f14, eVar4.f97920e);
            boolean z16 = (i18 & 57344) == 16384;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new fb0.d(lVar, 9);
                o0VarE.K(objQ2);
            }
            k1.a(fVarJ, iIndexOf, rVarZ, null, 0.0f, (e23.l) objQ2, o0VarE, 3072, 16);
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81525c;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new h02.a(7);
                o0VarE.K(objQ3);
            }
            r1.b.a(xVar, null, (e23.l) objQ3, gVar2, null, null, z3.f.c(-767022664, new e23.r() { // from class: h21.z
                @Override // e23.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    k01.e eVar5;
                    k01.e eVar6;
                    g21.x xVar2 = (g21.x) obj2;
                    p3.m mVar2 = (p3.m) obj3;
                    ((Integer) obj4).getClass();
                    ((r1.l) obj).getClass();
                    xVar2.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    int i26 = a0.a.f81033a[xVar2.ordinal()];
                    x01.e eVar7 = eVar;
                    k01.g gVar3 = gVar;
                    o82.a aVar2 = aVar;
                    ArrayList arrayList3 = arrayList;
                    v21.e eVar8 = eVar2;
                    pi0.e eVar9 = eVar3;
                    k01.k kVar = null;
                    if (i26 == 1) {
                        mVar2.C(-1146064280);
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
                        x01.f fVar = eVar7.f188255d;
                        if (gVar3 != null && (eVar5 = gVar3.f102057a) != null) {
                            kVar = eVar5.f102052e;
                        }
                        a0.b(fVar, aVar2, arrayList3, z14, lVar2, list2, gl1.y.S(kVar), eVar8, eVar9, num, lVar3, mVar2, 134217728);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        if (i26 != 2) {
                            throw n23.j.m(mVar2, 1625597205);
                        }
                        mVar2.C(-1145118129);
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
                        x01.f fVar2 = eVar7.f188255d;
                        if (gVar3 != null && (eVar6 = gVar3.f102057a) != null) {
                            kVar = eVar6.f102052e;
                        }
                        a0.d(fVar2, aVar2, arrayList3, z15, list3, rVar, gl1.y.T(kVar), eVar8, eVar9, lVar4, mVar2, 134217728);
                        mVar2.y();
                        mVar2.f();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, ((i18 >> 9) & 14) | 1576320, 50);
            o0VarE = o0VarE;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.k(eVar, aVar, list, xVar, lVar, arrayList, gVar, z14, list2, lVar2, lVar3, z15, list3, rVar, lVar4, eVar2, eVar3, num, i14);
        }
    }

    public static final void d(x01.f fVar, o82.a aVar, ArrayList arrayList, boolean z14, List list, g21.r rVar, g21.c cVar, v21.e eVar, pi0.e eVar2, e23.l lVar, p3.m mVar, int i14) {
        g21.r rVar2;
        Iterator it;
        Object next;
        List list2 = list;
        fVar.getClass();
        aVar.getClass();
        list2.getClass();
        rVar.getClass();
        eVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2043906203);
        int i15 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(arrayList) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(list2) ? 16384 : 8192) | (o0VarE.k(rVar.ordinal()) ? 131072 : 65536) | (o0VarE.B(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(eVar) ? 8388608 : 4194304) | (o0VarE.r(eVar2) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            if (fVar != x01.f.NEVER) {
                o0VarE.C(258937723);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
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
                        arrayList2.add(rVar3);
                    }
                    it3 = it;
                }
                int i16 = i15 >> 3;
                n0.b(aVar.f130843a, aVar.f130844b, z14, list2, i53.a.j(arrayList), rVar, arrayList2, eVar2, o0VarE, (i16 & 8064) | (458752 & i15) | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE | (i16 & 29360128));
                list2 = list2;
                if (z14) {
                    o0VarE.C(259518942);
                    rVar2 = rVar;
                    xy2.b.e(rVar2, arrayList2, lVar, o0VarE, ((i15 >> 15) & 14) | ((i15 >> 21) & 896));
                    o0VarE.g0(false);
                } else {
                    rVar2 = rVar;
                    o0VarE.C(259742855);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                rVar2 = rVar;
                o0VarE.C(259748807);
                o0VarE.g0(false);
            }
            int i17 = i15 >> 15;
            f21.x.a(list2, cVar, eVar, o0VarE, ((i15 >> 12) & 14) | (i17 & 112) | (i17 & 896));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ci0.g(fVar, aVar, arrayList, z14, list2, rVar2, cVar, eVar, eVar2, lVar, i14, 5);
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
        o0 o0VarE = mVar.E(1156170147);
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
            u82.e.b(aVar, dVar.f87291y, null, false, z3.f.c(1530271299, new d(aVar, dVar, cVar2, eVar, eVar2, aVar2, new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), fVar), o0VarE), o0Var, (i16 & 14) | 27648, 4);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, eVar, dVar, fVar, cVar, aVar2, eVar2, i14, 1);
        }
    }
}
