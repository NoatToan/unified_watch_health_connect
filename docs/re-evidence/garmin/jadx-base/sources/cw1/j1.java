package cw1;

import aq.j2;
import b21.v4;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import i3.e5;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import p3.y1;

/* JADX INFO: loaded from: classes10.dex */
public final class j1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, final bg0.a.b bVar, final List list, final e23.l lVar, final jv1.h hVar, final double d14, final double d15, final e23.l lVar2, final e23.l lVar3, p3.m mVar, final int i14) {
        e23.l lVar4;
        p3.o0 o0Var;
        final h4.r rVar2;
        String strJ;
        Object obj;
        h4.r.a aVar;
        boolean z14;
        bVar.getClass();
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(-976159254);
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(bVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(hVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.m(d14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.m(d15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            lVar4 = lVar3;
            i15 |= o0VarE.r(lVar4) ? 67108864 : 33554432;
        } else {
            lVar4 = lVar3;
        }
        if (o0VarE.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(hVar == null || (hVar instanceof jv1.g), o0VarE);
            }
            final p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                jv1.g gVar = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                objQ2 = p3.p0.n(gVar != null ? gVar.f101056e : null);
                o0VarE.K(objQ2);
            }
            final p3.p1 p1Var2 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = hb.a.n(hVar instanceof jv1.i, o0VarE);
            }
            final p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                jv1.i iVar = hVar instanceof jv1.i ? (jv1.i) hVar : null;
                objQ4 = new y1(iVar != null ? iVar.f101059c : 3600.0d);
                o0VarE.K(objQ4);
            }
            p3.l1 l1Var = (p3.l1) objQ4;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            int i16 = i15;
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.this_is_a_distance_based_event);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            if (zBooleanValue) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 291041429, R.string.selected, o0VarE, false);
            } else {
                o0VarE.C(432437406);
                o0VarE.g0(false);
                strJ = "";
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ, ". ", strJ));
            b92.a aVarB = c0235a.b();
            int i17 = i16 & 234881024;
            int i18 = i16 & 29360128;
            boolean z15 = ((i16 & 458752) == 131072) | ((i16 & 112) == 32) | (i17 == 67108864) | ((i16 & 3670016) == 1048576) | (i18 == 8388608);
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == c2565a) {
                final e23.l lVar5 = lVar4;
                obj = new e23.a() { // from class: cw1.h1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        gg0.i iVar2 = bVar == bg0.a.b.MILE ? gg0.i.MILE : gg0.i.KILOMETER;
                        p3.p1 p1Var4 = p1Var2;
                        lVar5.invoke(Boolean.valueOf(m1.b(d14, d15, (Double) p1Var4.getF182175a())));
                        lVar2.invoke(new jv1.g(null, iVar2, (Double) p1Var4.getF182175a()));
                        p1Var3.setValue(Boolean.FALSE);
                        p1Var.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj);
            } else {
                obj = objQ5;
            }
            int i19 = b92.a.f16960b;
            r.a(null, strQ, aVarB, zBooleanValue, false, (e23.a) obj, o0VarE, 0, 17);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(433540791);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                aVar = aVar2;
                Double d16 = (Double) p1Var2.getF182175a();
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new a11.m(p1Var2, 10);
                    o0VarE.K(objQ6);
                }
                int i24 = i16 << 6;
                u.a(rVarC2, false, d16, bVar, list, lVar, (e23.l) objQ6, d14, d15, lVar2, lVar3, o0VarE, (i24 & 7168) | 1572912 | (i24 & 57344) | (i24 & 458752) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192), (i16 >> 24) & 14);
                o0Var = o0VarE;
                z14 = false;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                aVar = aVar2;
                z14 = false;
                o0Var.C(434197154);
                o0Var.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r.a aVar4 = aVar;
            h4.r rVarC3 = c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
            double doubleValue = l1Var.getDoubleValue();
            Object objQ7 = o0Var.q();
            if (objQ7 == c2565a) {
                objQ7 = new j2(l1Var, 1);
                o0Var.K(objQ7);
            }
            e23.l lVar6 = (e23.l) objQ7;
            boolean z16 = (i17 == 67108864 ? true : z14) | (i18 == 8388608 ? true : z14);
            Object objQ8 = o0Var.q();
            if (z16 || objQ8 == c2565a) {
                v4 v4Var = new v4(lVar3, lVar2, p1Var3, p1Var, l1Var, 5);
                o0Var.K(v4Var);
                objQ8 = v4Var;
            }
            b1.a(rVarC3, zBooleanValue2, doubleValue, lVar6, lVar2, (e23.a) objQ8, o0Var, ((i16 >> 9) & 57344) | 3072);
            o0Var.g0(true);
            rVar2 = aVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cw1.i1
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    j1.a(rVar2, bVar, list, lVar, hVar, d14, d15, lVar2, lVar3, (p3.m) obj2, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
