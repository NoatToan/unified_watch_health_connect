package w52;

import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.io.File;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 {
    public static final void a(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, String str, e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1688245137);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | 48 | (i15 & 14);
            int i17 = i15 << 3;
            b(aVar, false, str, qVar, null, o0VarE, i16 | (i17 & 896) | (i17 & 7168), 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(aVar, str, qVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void b(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, boolean z14, String str, e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar, e23.p<? super com.garmin.android.apps.connectmobile.workouts.data.model.a, ? super File, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar2;
        e23.p<? super com.garmin.android.apps.connectmobile.workouts.data.model.a, ? super File, Unit> pVar2;
        boolean z16;
        p2 p2VarI0;
        e23.p<? super com.garmin.android.apps.connectmobile.workouts.data.model.a, ? super File, Unit> pVar3;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.b bVar;
        p3.o0 o0VarE = mVar.E(1135130247);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i16 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            qVar2 = qVar;
            i16 |= o0VarE.r(qVar2) ? 2048 : 1024;
        } else {
            qVar2 = qVar;
        }
        int i17 = i15 & 16;
        if (i17 == 0) {
            if ((i14 & 24576) == 0) {
                pVar2 = pVar;
                i16 |= o0VarE.r(pVar2) ? 16384 : 8192;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarE = u1.n.e(h4.r.S, am.j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                String strQ = gl1.y.Q(o0VarE, R.string.audio_note);
                d92.b.f58624b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                int i18 = i16 >> 3;
                o0VarE = o0VarE;
                b.a(aVar, str, qVar2, pVar3, z15, o0VarE, ((i16 << 9) & 57344) | com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | (i16 & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168));
                o0VarE.g0(true);
                pVar2 = pVar3;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(aVar, z14, str, qVar, pVar2, i14, i15);
            }
        }
        i16 |= 24576;
        pVar2 = pVar;
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            h4.r rVarE2 = u1.n.e(h4.r.S, am.j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarY2 = c2.l.y(rVarE2, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.audio_note);
            d92.b.f58624b.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            int i19 = i16 >> 3;
            o0VarE = o0VarE;
            b.a(aVar, str, qVar2, pVar3, z15, o0VarE, ((i16 << 9) & 57344) | com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | (i16 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168));
            o0VarE.g0(true);
            pVar2 = pVar3;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(aVar, z14, str, qVar, pVar2, i14, i15);
        }
    }

    public static final void c(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, String str, e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar, e23.p<? super com.garmin.android.apps.connectmobile.workouts.data.model.a, ? super File, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        e23.p<? super com.garmin.android.apps.connectmobile.workouts.data.model.a, ? super File, Unit> pVar2;
        e23.q<? super String, ? super String, ? super e23.a<Unit>, Unit> qVar2;
        String str2;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2;
        aVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(1569425465);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d | 48 | (i15 & 14);
            int i17 = i15 << 3;
            b(aVar, true, str, qVar, pVar, o0VarE, i16 | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 0);
            aVar2 = aVar;
            str2 = str;
            qVar2 = qVar;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            qVar2 = qVar;
            str2 = str;
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(aVar2, str2, qVar2, pVar2, i14);
        }
    }
}
