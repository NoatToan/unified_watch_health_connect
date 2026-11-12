package ck0;

import am.i1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import ca0.j1;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import kotlin.t1;
import o4.d0;
import o4.h1;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import r53.o2;
import u1.a2;
import z6.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    public static final void a(t tVar, e23.a aVar, boolean z14, p3.m mVar, int i14) {
        boolean z15;
        boolean zD;
        o0 o0VarE = mVar.E(1017766880);
        int i15 = (o0VarE.r(tVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | 128;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b.f58623a.getClass();
                zD = d92.b.d(o0VarE);
            } else {
                o0VarE.e();
                zD = z14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            c cVar = tVar.f27889g;
            boolean z16 = (cVar != null ? cVar.f27821b : null) == null;
            l72.l.f(z3.f.c(-1592127941, new i1((g6.o) o0VarE.A(t1.f91496n), zD, tVar, 5), o0VarE), x2.f(h4.r.S, 1.0f), z16, z16 ? aVar : null, o0VarE, 54, 4);
            z15 = zD;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(tVar, aVar, z15, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i53.c<t> cVar, o2<e> o2Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super t, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        o2Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(406817156);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(o2Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Boolean.valueOf(a0.a(context).f202582b.areNotificationsEnabled());
                o0VarE.K(objQ);
            }
            boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            p1 p1VarC = p0.c(o2Var, o0VarE, (i15 >> 3) & 14);
            boolean zB = o0VarE.B((e) p1VarC.getF182175a());
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = Boolean.valueOf(!((e) p1VarC.getF182175a()).f27826a && (!zBooleanValue || p005kotlin.jvm.internal.s.g(((e) p1VarC.getF182175a()).f27827b, Boolean.FALSE)));
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            c0.e(((Boolean) objQ2).booleanValue(), null, null, null, null, z3.f.c(-1250984532, new aa2.f(20, aVar, aVar2), o0VarE), o0Var, 196608, 30);
            h4.r rVarD = c2.l.D(a2.b(x2.f(h4.r.S, 1.0f), a2.a(o0Var), true));
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0Var, 0);
            int iHashCode = Long.hashCode(o0Var.U);
            i2 i2VarA0 = o0Var.a0();
            h4.r rVarC = h4.k.c(rVarY, o0Var);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0Var.f135177b == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0Var);
            b4.c(h5.g.a.f81809f, i2VarA0, o0Var);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0Var);
            b0 b0Var = b0.f22601a;
            if (cVar.isEmpty()) {
                o0Var.C(1909623205);
                u4.d dVarC = f.f27828a;
                if (dVarC == null) {
                    float f15 = 24;
                    g6.f.a aVar4 = g6.f.f75994b;
                    u4.d.a aVar5 = new u4.d.a("ExclusiveDiscounts", f15, f15, 24.0f, 24.0f, 0L, 0, false, 224, null);
                    d0.f128823b.getClass();
                    o4.t1 t1Var = new o4.t1(d0.f128824c, null);
                    h1.f128863b.getClass();
                    int i16 = h1.f128864c;
                    j0 j0Var = u4.m.f168519a;
                    u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(22.167f, 11.281f, 11.406f, 22.0f);
                    eVarM.i(2.167f, 12.79f);
                    c22.t.k(eVarM, 12.833f, 2.0f, 22.167f, 11.281f);
                    eVarM.k(9.676f, 15.976f);
                    eVarM.i(11.659f, 16.549f);
                    eVarM.i(14.117f, 8.12f);
                    com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 12.135f, 7.545f, 9.676f, 15.976f);
                    eVarM.k(16.536f, 12.388f);
                    eVarM.d(16.122f, 11.845f, 15.345f, 11.739f, 14.801f, 12.151f);
                    eVarM.d(14.256f, 12.564f, 14.15f, 13.339f, 14.563f, 13.881f);
                    eVarM.d(14.977f, 14.424f, 15.755f, 14.531f, 16.3f, 14.118f);
                    eVarM.d(16.845f, 13.705f, 16.95f, 12.931f, 16.536f, 12.388f);
                    eVarM.c();
                    eVarM.k(9.093f, 10.788f);
                    eVarM.d(8.679f, 10.245f, 7.902f, 10.14f, 7.357f, 10.552f);
                    eVarM.d(6.812f, 10.965f, 6.706f, 11.74f, 7.12f, 12.283f);
                    eVarM.d(7.534f, 12.826f, 8.311f, 12.931f, 8.856f, 12.518f);
                    eVarM.d(9.4f, 12.106f, 9.507f, 11.331f, 9.093f, 10.788f);
                    eVarM.c();
                    u4.d.a.b(aVar5, eVarM.f168407a, i16, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
                    dVarC = aVar5.c();
                    f.f27828a = dVarC;
                }
                b82.n.c(dVarC, gl1.y.Q(o0Var, R.string.lbl_no_current_offers), gl1.y.Q(o0Var, R.string.check_back_later_for_discounts), null, null, o0Var, 0, 24);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(1909990121);
                for (t tVar : cVar) {
                    boolean zR = ((57344 & i15) == 16384) | o0Var.r(tVar);
                    Object objQ3 = o0Var.q();
                    if (zR || objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j1(5, lVar, tVar);
                        o0Var.K(objQ3);
                    }
                    a(tVar, (e23.a) objQ3, false, o0Var, 0);
                }
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z((Object) cVar, (Object) o2Var, (e23.a) aVar, (e23.a) aVar2, (Object) lVar, i14, 13);
        }
    }
}
