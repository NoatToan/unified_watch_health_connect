package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class z {
    public static final void a(c62.y0 y0Var, com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        dVar.getClass();
        p3.o0 o0VarE = mVar.E(-108915278);
        if ((i14 & 48) == 0) {
            i15 = ((i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            c(dVar, z14, null, o0VarE, (i15 >> 3) & 126, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(y0Var, dVar, z14, i14, 27);
        }
    }

    public static final void b(com.garmin.android.apps.connectmobile.workouts.presentation.edit.k kVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, e23.a aVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        dVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-122433352);
        if ((i14 & 48) == 0) {
            i15 = ((i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1169) != 1168)) {
            p3.x1 x1Var = p3.n.f135158a;
            c(dVar, z14, aVar, o0VarE, (i15 & 896) | ((i15 >> 3) & 14) | ((i15 >> 6) & 112), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(kVar, dVar, aVar, z14, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void c(com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.a<Unit> aVar2;
        boolean z15;
        p3.o0 o0Var;
        e23.a<Unit> aVar3;
        p2 p2VarI0;
        e23.a<Unit> aVar4;
        Context context;
        String string;
        Object objQ;
        String strA;
        h4.r.a aVar5;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar6;
        h5.g.a.b bVar;
        p3.o0 o0VarE = mVar.E(730760925);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                aVar2 = aVar;
                i16 |= o0VarE.r(aVar2) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i17 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.b) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.b bVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.b) dVar;
                    string = v52.f.g(context, bVar2.f48947b, bVar2.f48948c);
                } else {
                    string = context.getString(R.string.lbl_workout_unspecified);
                    string.getClass();
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ig1.l0(12);
                    o0VarE.K(objQ);
                }
                strA = oi0.d.a(context, string, (oi0.f) objQ);
                aVar5 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar5, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, R.string.workout_pool_size);
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("label_secondary", strA);
                b92.a aVarB = c0235a.b();
                int i18 = b92.a.f16960b;
                p2Var.h(strQ, string, null, null, aVarB, false, false, null, null, null, aVar4, o0VarE, 0, (i16 >> 6) & 14, 1004);
                e23.a<Unit> aVar7 = aVar4;
                o0Var = o0VarE;
                if (z14) {
                    o0Var.C(2051203349);
                    String strQ2 = gl1.y.Q(o0Var, R.string.msg_workout_multiple_pool_leg_footer);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var);
                    h4.r rVarF = x2.f(aVar5, 1.0f);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
                    bVar3.getClass();
                    h4.r rVarC2 = c2.l.C(rVarA, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
                    o0Var = o0Var;
                    o0Var.g0(false);
                } else {
                    o0Var.C(2051638031);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                aVar3 = aVar7;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cn1.a(dVar, z14, aVar3, i14, i15, 12);
            }
        }
        i16 |= 384;
        aVar2 = aVar;
        if ((i16 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i17 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (dVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.b) {
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.b bVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.b) dVar;
                string = v52.f.g(context, bVar4.f48947b, bVar4.f48948c);
            } else {
                string = context.getString(R.string.lbl_workout_unspecified);
                string.getClass();
            }
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ig1.l0(12);
                o0VarE.K(objQ);
            }
            strA = oi0.d.a(context, string, (oi0.f) objQ);
            aVar5 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar5, o0VarE);
            h5.g.V.getClass();
            aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            l72.p2 p2Var2 = l72.p2.f111205a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.workout_pool_size);
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            c0235a2.f16962a.put("label_secondary", strA);
            b92.a aVarB2 = c0235a2.b();
            int i19 = b92.a.f16960b;
            p2Var2.h(strQ3, string, null, null, aVarB2, false, false, null, null, null, aVar4, o0VarE, 0, (i16 >> 6) & 14, 1004);
            e23.a<Unit> aVar8 = aVar4;
            o0Var = o0VarE;
            if (z14) {
                o0Var.C(2051203349);
                String strQ4 = gl1.y.Q(o0Var, R.string.msg_workout_multiple_pool_leg_footer);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0Var);
                h4.r rVarF2 = x2.f(aVar5, 1.0f);
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA2 = c2.l.A(rVarF2, eVar2.f97920e, 0.0f, 2);
                bVar5.getClass();
                h4.r rVarC3 = c2.l.C(rVarA2, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                d6.h.f57752b.getClass();
                mh.c(strQ4, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 130044);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(2051638031);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            aVar3 = aVar8;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar3 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(dVar, z14, aVar3, i14, i15, 12);
        }
    }
}
