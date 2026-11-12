package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 {
    public static final void a(String str, String str2, String str3, p3.m mVar, int i14, int i15) {
        String str4;
        int i16;
        String str5;
        p3.o0 o0VarE = mVar.E(1322040594);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            str4 = str3;
        } else {
            str4 = str3;
            i16 = i17 | (o0VarE.B(str4) ? 256 : 128);
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            String str6 = i18 != 0 ? null : str4;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            l72.x0 x0Var = l72.x0.f111346a;
            b92.a aVarA = str6 != null ? wz1.a.a(str6) : null;
            int i19 = i16 << 3;
            int i24 = b92.a.f16960b;
            x0Var.a((l72.x0.f111348c << 24) | (i19 & 896) | (i19 & 112) | 6, 60, aVarA, u2Var, null, null, str, str2, null, null, o0VarE);
            o0VarE.g0(true);
            str5 = str6;
        } else {
            o0VarE.e();
            str5 = str4;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l0(i14, i15, str, str2, str5);
        }
    }

    public static final void b(c62.y0 y0Var, Double d14, m52.b bVar, m52.j jVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(34867306);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(y0Var) : o0VarE.r(y0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(d14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(jVar != null ? jVar.ordinal() : -1) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = (i15 & 14) | 48;
            int i17 = i15 << 3;
            j(y0Var, null, d14, bVar, jVar, o0VarE, i16 | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(y0Var, d14, bVar, jVar, i14, 9);
        }
    }

    public static final void c(com.garmin.android.apps.connectmobile.workouts.presentation.edit.k kVar, Double d14, m52.b bVar, m52.j jVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(908737328);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(d14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(jVar != null ? jVar.ordinal() : -1) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = (i15 & 14) | 48;
            int i17 = i15 << 3;
            i(kVar, null, d14, bVar, jVar, o0VarE, i16 | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(kVar, d14, bVar, jVar, i14, 10);
        }
    }

    public static final void d(final Double d14, final m52.b bVar, final m52.j jVar, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String strJ;
        p3.o0 o0VarE = mVar.E(-1351759829);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(d14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(jVar != null ? jVar.ordinal() : -1) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (d14 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p() { // from class: w52.g0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i16;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).intValue();
                        switch (i17) {
                            case 0:
                                l0.d(d14, bVar, jVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                l0.d(d14, bVar, jVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                if (v52.e.j(true, bVar)) {
                    o0VarE.C(-663398268);
                    strJ = gl1.y.Q(o0VarE, R.string.lbl_estimated_abbrev) + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.lbl_distance);
                    o0VarE.g0(false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -663279972, R.string.lbl_total_distance, o0VarE, false);
                }
                String str = strJ;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                context.getClass();
                String strA = v52.e.a(context, d14, false, m52.a.f116649e, jVar, false, false, 64);
                if (strA == null) {
                    strA = "";
                }
                o0Var = o0VarE;
                a(strA, str, null, o0Var, 0, 4);
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p() { // from class: w52.g0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i18) {
                        case 0:
                            l0.d(d14, bVar, jVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            l0.d(d14, bVar, jVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void e(com.garmin.android.apps.connectmobile.workouts.presentation.edit.k kVar, Integer num, m52.b bVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1775346644);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(num) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            i(kVar, num, null, bVar, null, o0VarE, (i15 & 14) | 24960 | (i15 & 112) | ((i15 << 3) & 7168));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(kVar, num, bVar, i14, 0);
        }
    }

    public static final void f(v0 v0Var, Integer num, m52.b bVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-2130486478);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(v0Var) : o0VarE.r(v0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(num) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            j(v0Var, num, null, bVar, null, o0VarE, (i15 & 14) | 24960 | (i15 & 112) | ((i15 << 3) & 7168));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l0(v0Var, num, bVar, i14, 29);
        }
    }

    public static final void g(v0 v0Var, Integer num, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-844499766);
        int i15 = (o0VarE.B(num) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            m(num, o0VarE, (i15 >> 3) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(v0Var, num, i14, 24);
        }
    }

    public static final void h(x0 x0Var, Integer num, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-913382000);
        int i15 = (o0VarE.B(num) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            m(num, o0VarE, (i15 >> 3) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(x0Var, num, i14, 25);
        }
    }

    public static final void i(com.garmin.android.apps.connectmobile.workouts.presentation.edit.k kVar, Integer num, Double d14, m52.b bVar, m52.j jVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1264830688);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(num) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(jVar != null ? jVar.ordinal() : -1) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9361) != 9360)) {
            p3.x1 x1Var = p3.n.f135158a;
            k(num, d14, bVar, jVar, o0VarE, (i15 >> 3) & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(kVar, num, d14, bVar, jVar, i14, 0);
        }
    }

    public static final void j(v0 v0Var, Integer num, Double d14, m52.b bVar, m52.j jVar, p3.m mVar, int i14) {
        int i15;
        v0Var.getClass();
        p3.o0 o0VarE = mVar.E(-336975270);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(num) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(jVar != null ? jVar.ordinal() : -1) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9361) != 9360)) {
            p3.x1 x1Var = p3.n.f135158a;
            k(num, d14, bVar, jVar, o0VarE, (i15 >> 3) & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(v0Var, num, d14, bVar, jVar, i14, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void k(final Integer num, Double d14, final m52.b bVar, final m52.j jVar, p3.m mVar, final int i14) {
        int i15;
        final m52.b bVar2;
        final m52.j jVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        p3.c<?> cVar;
        int i16;
        boolean z14;
        h4.r.a aVar;
        ?? r14;
        boolean z15;
        final Double d15 = d14;
        p3.o0 o0VarE = mVar.E(-185407589);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(num) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(d15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(jVar != null ? jVar.ordinal() : -1) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (num == null && d15 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p() { // from class: w52.f0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                ((Integer) obj2).intValue();
                                l0.k(num, d15, bVar, jVar, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                l0.k(num, d15, bVar, jVar, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                int i18 = i15;
                bVar2 = bVar;
                jVar2 = jVar;
                h4.r.a aVar2 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                if (num != null) {
                    o0VarE.C(463536782);
                    cVar = cVar2;
                    h4.r rVarA = u2Var.a(aVar2, 1.0f, true);
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
                    if (cVar == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    i16 = i18;
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    l(num, bVar2, o0VarE, (i16 & 14) | ((i16 >> 3) & 112));
                    o0VarE.g0(true);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    cVar = cVar2;
                    i16 = i18;
                    z14 = false;
                    o0VarE.C(463656907);
                    o0VarE.g0(false);
                }
                if (d14 == null || jVar2 == null) {
                    d15 = d14;
                    aVar = aVar2;
                    o0VarE.C(463857291);
                    o0VarE.g0(z14);
                    r14 = z14;
                } else {
                    o0VarE.C(463716024);
                    aVar = aVar2;
                    h4.r rVarA2 = u2Var.a(aVar, 1.0f, true);
                    f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, z14);
                    int iHashCode3 = Long.hashCode(o0VarE.U);
                    i2 i2VarA2 = o0VarE.a0();
                    h4.r rVarC3 = h4.k.c(rVarA2, o0VarE);
                    if (cVar == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    c2.u uVar2 = c2.u.f22885a;
                    d15 = d14;
                    d(d15, bVar2, jVar2, o0VarE, (i16 >> 3) & 1022);
                    o0VarE.g0(true);
                    r14 = 0;
                    o0VarE.g0(false);
                }
                if (num == null || d15 == null) {
                    o0VarE.C(463905744);
                    z15 = true;
                    c2.q.a(u2Var.a(aVar, 1.0f, true), o0VarE, r14);
                    o0VarE.g0(r14);
                } else {
                    o0VarE.C(463962443);
                    o0VarE.g0(r14);
                    z15 = true;
                }
                o0VarE.g0(z15);
            }
            p2VarI0.f135219d = pVar;
        }
        bVar2 = bVar;
        jVar2 = jVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i19 = 1;
            pVar = new e23.p() { // from class: w52.f0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i19) {
                        case 0:
                            ((Integer) obj2).intValue();
                            l0.k(num, d15, bVar2, jVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            l0.k(num, d15, bVar2, jVar2, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void l(final Integer num, final m52.b bVar, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String strJ;
        p3.o0 o0VarE = mVar.E(-806913007);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(num) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 32 : 16;
        }
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (num == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p() { // from class: w52.h0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i18) {
                                case 0:
                                    l0.l(num, bVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    l0.l(num, bVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                if (v52.e.j(false, bVar)) {
                    o0VarE.C(186791810);
                    strJ = gl1.y.Q(o0VarE, R.string.lbl_estimated_abbrev) + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.lbl_time);
                    o0VarE.g0(false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 186906913, R.string.activity_stats_details_total_time_label, o0VarE, false);
                }
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                String strC = v52.e.c((Context) o0VarE.A(y3Var), Double.valueOf(num.intValue()), false, false);
                if (strC == null) {
                    strC = "";
                }
                String strC2 = v52.e.c((Context) o0VarE.A(y3Var), Double.valueOf(num.intValue()), false, true);
                a(strC, strJ, strC2 != null ? e5.g(strJ, StringUtils.SPACE, strC2) : null, o0VarE, 0, 0);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p() { // from class: w52.h0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i16;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i18) {
                        case 0:
                            l0.l(num, bVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            l0.l(num, bVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void m(final Integer num, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        p3.o0 o0VarE = mVar.E(-119089781);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(num) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (num == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p() { // from class: w52.i0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i16;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i18) {
                                case 0:
                                    l0.m(num, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    l0.m(num, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                String strQ = gl1.y.Q(o0VarE, R.string.activity_stats_details_total_time_label);
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                String strC = v52.e.c((Context) o0VarE.A(y3Var), Double.valueOf(num.intValue()), false, false);
                if (strC == null) {
                    strC = "";
                }
                String strC2 = v52.e.c((Context) o0VarE.A(y3Var), Double.valueOf(num.intValue()), false, true);
                a(strC, strQ, strC2 != null ? e5.g(strQ, StringUtils.SPACE, strC2) : null, o0VarE, 0, 0);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p() { // from class: w52.i0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i18) {
                        case 0:
                            l0.m(num, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            l0.m(num, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
