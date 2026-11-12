package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.b2;
import i3.e5;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 {
    /* JADX WARN: Code duplicated, block: B:157:0x0371  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03bb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, tw1.k kVar, tw1.k kVar2, boolean z14, String str, boolean z15, vt1.o oVar, int i14, int i15, Integer num, e23.l lVar, p3.m mVar, int i16) {
        e23.l lVar2;
        Context context;
        i53.f fVarA;
        i53.f fVar;
        i53.f fVarA2;
        boolean zK;
        Object objQ;
        p3.p1 p1Var;
        boolean z16;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-722907539);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = (o0VarE.k(kVar == null ? -1 : kVar.ordinal()) ? 32 : 16) | i16 | (o0VarE.k(kVar2 == null ? -1 : kVar2.ordinal()) ? 256 : 128);
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        int i18 = i17 | (o0VarE.B(str) ? 16384 : 8192);
        if ((196608 & i16) == 0) {
            i18 |= o0VarE.h(z15) ? 131072 : 65536;
        }
        int i19 = (o0VarE.k(oVar != null ? oVar.ordinal() : -1) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | i18;
        if ((12582912 & i16) == 0) {
            i19 |= o0VarE.k(i14) ? 8388608 : 4194304;
        }
        if ((100663296 & i16) == 0) {
            i19 |= o0VarE.k(i15) ? 67108864 : 33554432;
        }
        int i24 = i19 | (o0VarE.B(num) ? 536870912 : 268435456);
        if (o0VarE.n(i24 & 1, ((306783379 & i24) == 306783378 && ((o0VarE.r(lVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = p3.p0.n(kVar == null ? kVar2 : kVar);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar3, aVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarB = a2.b(b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            c2.z zVarA2 = c2.y.a(kVar3, aVar, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            int i25 = i24 >> 12;
            int i26 = i24 >> 15;
            Context context3 = context2;
            p3.p1 p1Var3 = p1Var2;
            b2.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar2.f97921f, 7), z15, i14, i15, gl1.y.Q(o0VarE, R.string.select_training_plan_for_plan), z14 ? str : null, null, null, null, o0VarE, (i26 & 7168) | (i25 & 112) | (i26 & 896), 448);
            o0VarE = o0VarE;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2);
            boolean z17 = false;
            c2.z zVarA3 = c2.y.a(kVar3, aVar, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar2, rVarC3, o0VarE);
            o0VarE.C(2050390452);
            w13.c cVar2 = tw1.k.f166746h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            int i27 = 0;
            while (bVarN.hasNext()) {
                Object next = bVarN.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    p13.x.q();
                    throw null;
                }
                tw1.k kVar4 = (tw1.k) next;
                boolean z18 = ((tw1.k) p1Var3.getF182175a()) == kVar4 ? true : z17;
                boolean z19 = kVar2 == kVar4 ? true : z17;
                kVar4.getClass();
                context3.getClass();
                o13.p pVar = new o13.p(oVar, kVar4);
                vt1.o oVar2 = vt1.o.f180176g;
                tw1.k kVar5 = tw1.k.BEGINNER;
                if (pVar.equals(new o13.p(oVar2, kVar5))) {
                    context = context3;
                    String string = context.getString(R.string.lbl_heart_rate_monitor);
                    string.getClass();
                    fVarA = i53.a.a(string);
                } else {
                    context = context3;
                    if (pVar.equals(new o13.p(oVar2, tw1.k.INTERMEDIATE))) {
                        String string2 = context.getString(R.string.power_meter_and_heart_rate_monitor);
                        string2.getClass();
                        fVarA = i53.a.a(string2);
                    } else {
                        fVarA = null;
                    }
                }
                o13.p pVar2 = new o13.p(oVar, kVar4);
                if (pVar2.equals(new o13.p(oVar2, kVar5))) {
                    String string3 = context.getString(R.string.power_meter_or_indoor_trainer);
                    string3.getClass();
                    fVarA2 = i53.a.a(string3);
                } else {
                    if (pVar2.equals(new o13.p(oVar2, tw1.k.INTERMEDIATE))) {
                        String string4 = context.getString(R.string.lbl_indoor_trainer);
                        string4.getClass();
                        fVarA2 = i53.a.a(string4);
                    } else {
                        fVar = null;
                    }
                    zK = o0VarE.k(kVar4.ordinal());
                    objQ = o0VarE.q();
                    if (!zK || objQ == p3.m.a.f135155b) {
                        p1Var = p1Var3;
                        objQ = new ca0.j1(18, kVar4, p1Var);
                        o0VarE.K(objQ);
                    } else {
                        p1Var = p1Var3;
                    }
                    p13.c.b bVar3 = bVarN;
                    Context context4 = context;
                    p3.o0 o0Var = o0VarE;
                    i53.f fVar3 = fVarA;
                    p3.p1 p1Var4 = p1Var;
                    q1.c(null, kVar4, oVar, z18, z19, num, fVar3, fVar, (e23.a) objQ, o0Var, i25 & 459648);
                    o0VarE = o0Var;
                    if (i27 < tw1.k.f166746h.getF134973e() - 1) {
                        o0VarE.C(247272105);
                        h4.r.a aVar4 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        z16 = false;
                        e5.t(aVar4, j92.b.f97899b.f97918c, o0VarE, false);
                    } else {
                        z16 = false;
                        o0VarE.C(247374932);
                        o0VarE.g0(false);
                    }
                    bVarN = bVar3;
                    i27 = i28;
                    p1Var3 = p1Var4;
                    z17 = z16;
                    context3 = context4;
                }
                fVar = fVarA2;
                zK = o0VarE.k(kVar4.ordinal());
                objQ = o0VarE.q();
                if (zK) {
                    p1Var = p1Var3;
                    objQ = new ca0.j1(18, kVar4, p1Var);
                    o0VarE.K(objQ);
                } else {
                    p1Var = p1Var3;
                    objQ = new ca0.j1(18, kVar4, p1Var);
                    o0VarE.K(objQ);
                }
                p13.c.b bVar4 = bVarN;
                Context context5 = context;
                p3.o0 o0Var2 = o0VarE;
                i53.f fVar4 = fVarA;
                p3.p1 p1Var5 = p1Var;
                q1.c(null, kVar4, oVar, z18, z19, num, fVar4, fVar, (e23.a) objQ, o0Var2, i25 & 459648);
                o0VarE = o0Var2;
                if (i27 < tw1.k.f166746h.getF134973e() - 1) {
                    o0VarE.C(247272105);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    z16 = false;
                    e5.t(aVar5, j92.b.f97899b.f97918c, o0VarE, false);
                } else {
                    z16 = false;
                    o0VarE.C(247374932);
                    o0VarE.g0(false);
                }
                bVarN = bVar4;
                i27 = i28;
                p1Var3 = p1Var5;
                z17 = z16;
                context3 = context5;
            }
            o0VarE.g0(z17);
            o0VarE.g0(true);
            o0VarE.g0(true);
            lVar2 = lVar;
            b82.c.b(null, null, z3.f.c(-952604798, new bt1.k(lVar2, p1Var3, 3), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c1(rVar, kVar, kVar2, z14, str, z15, oVar, i14, i15, num, lVar2, i16);
        }
    }
}
