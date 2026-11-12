package cv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import ca0.j1;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.workouts.data.model.e0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import h4.r;
import i3.e5;
import i71.w;
import j23.t;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import yz1.y;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55887a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.Readiness.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.VO2Max.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.Status.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.BodyBattery.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.IntensityMinutes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.CyclingAbility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n.Placeholder.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f55887a = iArr;
        }
    }

    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2028853216);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            q.a(u1.n.e(rVarD, jC, k2.i.a(j92.b.f97899b.f97918c)), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b3  */
    public static final void b(final oz1.b bVar, final o61.q qVar, final w wVar, final h61.a aVar, final zz1.d dVar, final av1.c cVar, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, p3.m mVar, final int i14) {
        int i15;
        float f14;
        boolean z24;
        o0 o0VarE = mVar.E(-740771074);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = i14 | ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | (o0VarE.B(qVar) ? 32 : 16) | (o0VarE.B(wVar) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.B(dVar) ? 16384 : 8192) | (o0VarE.B(cVar) ? 131072 : 65536) | (o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.h(z15) ? 8388608 : 4194304) | (o0VarE.h(z16) ? 67108864 : 33554432) | (o0VarE.h(z17) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (((o0VarE.h(z18) ? (char) 4 : (char) 2) | (o0VarE.h(z19) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            float f94882b = ((g6.c) o0VarE.A(t1.f91490h)).getF94882b();
            float fH = y.h(f94882b);
            List listN0 = h0.N0(x.m(z14 ? n.Readiness : n.Placeholder, z15 ? n.Status : n.Placeholder, z16 ? n.CyclingAbility : n.Placeholder, z18 ? n.VO2Max : n.Placeholder, z19 ? n.BodyBattery : n.Placeholder, z17 ? n.IntensityMinutes : n.Placeholder), new d());
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f15 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            r rVarX = x2.x(x2.f(r.S, 1.0f), null, 3);
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarX, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int i17 = ((double) f94882b) > 1.5d ? 1 : 2;
            o0VarE.C(-572352085);
            Iterator it = h0.Q(listN0, i17).iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                boolean z25 = true;
                if (list.size() == 1) {
                    if (h0.b0(list) == n.Placeholder) {
                        z25 = false;
                    }
                } else if (list.size() > 1) {
                    Object obj = list.get(0);
                    n nVar = n.Placeholder;
                    if (obj == nVar && list.get(1) == nVar) {
                        z25 = false;
                    } else {
                        z25 = true;
                    }
                } else {
                    z25 = false;
                }
                if (z25) {
                    o0VarE.C(-1284655950);
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f16 = eVar.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI2 = c2.j.i(f16);
                    r rVarF = x2.f(r.S, 1.0f);
                    bVar3.getClass();
                    float f17 = eVar.f97918c;
                    bVar3.getClass();
                    r rVarX2 = x2.x(c2.l.C(rVarF, f17, 0.0f, eVar.f97918c, 0.0f, 10), null, 3);
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI2, h4.d.a.f81533k, o0VarE, 0);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    r rVarC2 = h4.k.c(rVarX2, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (cVar2 == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    u2 u2Var = u2.f22900a;
                    o0VarE.C(1026660894);
                    Iterator<Integer> it3 = t.o(0, i17).iterator();
                    while (((j23.k) it3).f96801c) {
                        int iNextInt = ((p13.p0) it3).nextInt();
                        r rVar = r.S;
                        r rVarH = x2.h(u2Var.a(x2.f(rVar, 1.0f), 1.0f, true), fH);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = q.d(h4.d.a.f81524b, false);
                        x1 x1Var3 = p3.n.f135158a;
                        float f18 = fH;
                        int iHashCode3 = Long.hashCode(o0VarE.U);
                        i2 i2VarA2 = o0VarE.a0();
                        r rVarC3 = h4.k.c(rVarH, o0VarE);
                        h5.g.V.getClass();
                        int i18 = i17;
                        h5.e0.a aVar4 = h5.g.a.f81805b;
                        if (cVar2 == null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        u2 u2Var2 = u2Var;
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA2, o0VarE);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                        u uVar = u.f22885a;
                        n nVar2 = (n) h0.e0(iNextInt, list);
                        if (nVar2 == null) {
                            o0VarE.C(1386483182);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1386483183);
                            int i19 = a.f55887a[nVar2.ordinal()];
                            p3.m.a aVar5 = p3.m.f135153a;
                            switch (i19) {
                                case 1:
                                    z24 = false;
                                    o0VarE.C(-1752886933);
                                    e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                                    g6.f.a aVar6 = g6.f.f75994b;
                                    e3Var.E(c2.l.y(rVar, 0), bVar, o0VarE, 6 | (oz1.b.F << 3) | ((i16 << 3) & 112));
                                    o0VarE.g0(false);
                                    Unit unit = Unit.INSTANCE;
                                    o0VarE.g0(z24);
                                    break;
                                case 2:
                                    z24 = false;
                                    o0VarE.C(-1752457707);
                                    e3 e3Var2 = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                                    g6.f.a aVar7 = g6.f.f75994b;
                                    e3Var2.t(c2.l.y(rVar, 0), qVar, o0VarE, 6 | (i16 & 112));
                                    o0VarE.g0(false);
                                    Unit unit2 = Unit.INSTANCE;
                                    o0VarE.g0(z24);
                                    break;
                                case 3:
                                    o0VarE.C(-1752034588);
                                    g6.f.a aVar8 = g6.f.f75994b;
                                    r rVarY = c2.l.y(rVar, 0);
                                    Object objQ = o0VarE.q();
                                    aVar5.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new e0(14);
                                        o0VarE.K(objQ);
                                    }
                                    k71.b.a(rVarY, wVar, (p) objQ, o0VarE, ((i16 >> 3) & 112) | 390);
                                    z24 = false;
                                    o0VarE.g0(false);
                                    Unit unit3 = Unit.INSTANCE;
                                    o0VarE.g0(z24);
                                    break;
                                case 4:
                                    o0VarE.C(-1751502039);
                                    ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).h(rVar, cVar, o0VarE, ((i16 >> 12) & 112) | 6);
                                    o0VarE.g0(false);
                                    Unit unit4 = Unit.INSTANCE;
                                    z24 = false;
                                    o0VarE.g0(z24);
                                    break;
                                case 5:
                                    o0VarE.C(-1751088840);
                                    g6.f.a aVar9 = g6.f.f75994b;
                                    zz1.c.b(c2.l.y(rVar, 0), dVar, ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).r((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), o0VarE, ((i16 >> 9) & 112) | 6);
                                    o0VarE.g0(false);
                                    Unit unit5 = Unit.INSTANCE;
                                    z24 = false;
                                    o0VarE.g0(z24);
                                    break;
                                case 6:
                                    o0VarE.C(-1750567916);
                                    e3 e3Var3 = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                                    Object obj2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                                    boolean zR = o0VarE.r(e3Var3) | o0VarE.r(obj2);
                                    Object objQ2 = o0VarE.q();
                                    if (zR) {
                                        objQ2 = new j1(12, e3Var3, obj2);
                                        o0VarE.K(objQ2);
                                    } else {
                                        aVar5.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new j1(12, e3Var3, obj2);
                                            o0VarE.K(objQ2);
                                        }
                                    }
                                    e3Var3.i(rVar, aVar, (e23.a) objQ2, o0VarE, 6 | ((i16 >> 6) & 112));
                                    z24 = false;
                                    o0VarE.g0(false);
                                    Unit unit6 = Unit.INSTANCE;
                                    o0VarE.g0(z24);
                                    break;
                                case 7:
                                    o0VarE.C(-1303378549);
                                    a(o0VarE, 0);
                                    o0VarE.g0(false);
                                    Unit unit7 = Unit.INSTANCE;
                                    z24 = false;
                                    o0VarE.g0(z24);
                                    break;
                                default:
                                    throw kg.f.h(o0VarE, -1303471267, false);
                            }
                        }
                        o0VarE.g0(true);
                        fH = f18;
                        i17 = i18;
                        u2Var = u2Var2;
                    }
                    i15 = i17;
                    f14 = fH;
                    e5.u(o0VarE, false, true, false);
                } else {
                    i15 = i17;
                    f14 = fH;
                    o0VarE.C(-1280824009);
                    o0VarE.g0(false);
                }
                it = it;
                fH = f14;
                i17 = i15;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: cv1.c
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    e.b(bVar, qVar, wVar, aVar, dVar, cVar, z14, z15, z16, z17, z18, z19, (p3.m) obj3, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
