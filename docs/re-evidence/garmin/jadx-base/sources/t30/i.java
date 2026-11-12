package t30;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.p9;
import c2.k3;
import c2.n3;
import c2.q3;
import c2.t2;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.google.android.exoplayer2.audio.WavUtil;
import e23.p;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import l72.c1;
import o4.m1;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.i0;
import s5.r0;
import s5.x0;
import s70.j1;
import t21.l0;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f162177a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f162177a = 300;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final x30.c cVar, p3.m mVar, final int i14) {
        int i15;
        final int i16;
        p1 p1Var;
        o0 o0VarE = mVar.E(1606603077);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (!cVar.f188570a) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: t30.d
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    i.a(cVar, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    i.a(cVar, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            s5.c.b bVarH = l2.h(o0VarE, 2052304879, 0, 1, null);
            d92.b.f58623a.getClass();
            r0 r0Var = new r0(new i0(d92.b.a(o0VarE).k().a(), 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new h(p1Var2, 0);
                o0VarE.K(objQ2);
            }
            s5.m.a aVar = new s5.m.a("", r0Var, (s5.n) objQ2);
            bVarH.b(y.Q(o0VarE, R.string.you_are_using_automatic));
            bVarH.b(StringUtils.SPACE);
            o0VarE.C(2052314669);
            int iG = bVarH.g(aVar);
            try {
                bVarH.b(y.Q(o0VarE, cVar.f188571b ? R.string.lbl_exit_course_editor : R.string.lbl_exit_course_creator));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iG);
                o0VarE.g0(false);
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                r.a aVar2 = r.S;
                d92.b.f58625c.getClass();
                boolean z14 = true;
                int i18 = i15;
                mh.d(cVarK, c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97920e, 1), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF, o0VarE, 0, 0, 262140);
                o0VarE = o0VarE;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(-802283871);
                    c1 c1Var = c1.f110940a;
                    String strQ = y.Q(o0VarE, R.string.title_exit_without_saving);
                    String strQ2 = y.Q(o0VarE, R.string.you_will_loose_your_course);
                    String strQ3 = y.Q(o0VarE, R.string.lbl_exit);
                    if ((i18 & 14) != 4) {
                        z14 = false;
                    }
                    Object objQ3 = o0VarE.q();
                    if (z14 || objQ3 == c2565a) {
                        p1Var = p1Var2;
                        objQ3 = new j1(18, cVar, p1Var);
                        o0VarE.K(objQ3);
                    } else {
                        p1Var = p1Var2;
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ3;
                    String strQ4 = y.Q(o0VarE, R.string.lbl_cancel);
                    Object objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new sg0.l(p1Var, 23);
                        o0VarE.K(objQ4);
                    }
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, strQ4, (e23.a) objQ4, o0VarE, 6, 6, 216);
                    i16 = 0;
                    o0VarE.g0(false);
                } else {
                    i16 = 0;
                    o0VarE.C(-801734179);
                    o0VarE.g0(false);
                }
            } catch (Throwable th3) {
                bVarH.f(iG);
                throw th3;
            }
        } else {
            i16 = 0;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new p() { // from class: t30.d
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i16;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            i.a(cVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            i.a(cVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final x30.a aVar, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(241294221);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (aVar.f188562a) {
                l72.f0.a aVar2 = l72.f0.a.f111000a;
                u4.d.b bVar = u4.d.f168373k;
                u4.d dVarB = n5.e.b(R.drawable.icon_add_climb, o0VarE, 6);
                String strQ = y.Q(o0VarE, R.string.add_full_climb);
                r.a aVar3 = r.S;
                r rVarF = x2.f(aVar3, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                aVar2.c(0, 8, aVar.f188565d, c2.l.A(rVarF, 0.0f, eVar.f97917b, 1), strQ, o0VarE, dVarB, false);
                if (aVar.f188564c) {
                    o0VarE.C(-1378207019);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1378630820);
                    u4.d dVarB2 = n5.e.b(R.drawable.courses_pin, o0VarE, 6);
                    String strQ2 = y.Q(o0VarE, aVar.f188563b ? R.string.start_course_here : R.string.add_this_point_to_course);
                    r rVarF2 = x2.f(aVar3, 1.0f);
                    bVar2.getClass();
                    aVar2.h(0, 8, aVar.f188566e, c2.l.A(rVarF2, 0.0f, eVar.f97917b, 1), strQ2, o0VarE, dVarB2, false);
                    o0VarE.g0(false);
                }
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new p() { // from class: t30.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i16;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    i.b(aVar, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    i.b(aVar, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new p() { // from class: t30.g
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            i.b(aVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            i.b(aVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void c(ClimbDTO climbDTO, x30.a aVar, x30.c cVar, p3.m mVar, int i14) {
        climbDTO.getClass();
        o0 o0VarE = mVar.E(-1545242024);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(climbDTO) : o0VarE.r(climbDTO) ? 4 : 2) | i14 | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int i16 = k3.f22728a;
            float f22739d = n3.c(q3.a(o0VarE), o0VarE).getF22739d();
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            bVar.getClass();
            bVar.getClass();
            r rVarB = c2.l.B(rVarE, f15, f14, f15, f22739d);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            int i17 = ClimbDTO.f32776p | (i15 & 14);
            e(climbDTO, o0VarE, i17);
            b(aVar, o0VarE, (i15 >> 3) & 14);
            d(climbDTO, o0VarE, i17);
            a(cVar, o0VarE, (i15 >> 6) & 14);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(climbDTO, aVar, cVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    public static final void d(ClimbDTO climbDTO, p3.m mVar, int i14) {
        int i15;
        ClimbDTO climbDTO2;
        o0 o0Var;
        boolean z14;
        boolean z15;
        Object objQ;
        o0 o0VarE = mVar.E(532524799);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(climbDTO) : o0VarE.r(climbDTO) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(context);
            Object objQ2 = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ2 = new CustomLineChart(context);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new CustomLineChart(context);
                    o0VarE.K(objQ2);
                }
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ2;
            boolean zB2 = o0VarE.B(customLineChart);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                tz.a aVar2 = new tz.a(customLineChart, new u30.a(context), new u30.d(customLineChart), null, new u30.c(customLineChart), null, 40, null);
                o0VarE.K(aVar2);
                objQ3 = aVar2;
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    tz.a aVar3 = new tz.a(customLineChart, new u30.a(context), new u30.d(customLineChart), null, new u30.c(customLineChart), null, 40, null);
                    o0VarE.K(aVar3);
                    objQ3 = aVar3;
                }
            }
            tz.a aVar4 = (tz.a) objQ3;
            String strQ = y.Q(o0VarE, R.string.activity_details_elevation);
            r.a aVar5 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar5, 0.0f, j92.b.f97899b.f97917b, 1);
            d92.b.f58624b.getClass();
            int i16 = i15;
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            r rVarH = x2.h(x2.f(aVar5, 1.0f), f162177a);
            boolean zR = o0VarE.r(customLineChart);
            Object objQ4 = o0VarE.q();
            if (zR) {
                objQ4 = new b40.a(customLineChart, 13);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new b40.a(customLineChart, 13);
                    o0VarE.K(objQ4);
                }
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(aVar4);
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    climbDTO2 = climbDTO;
                    if (o0VarE.r(climbDTO2)) {
                    }
                    z15 = zR2 | z14;
                    objQ = o0VarE.q();
                    if (z15) {
                        objQ = new sy.i(4, aVar4, climbDTO2);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new sy.i(4, aVar4, climbDTO2);
                            o0VarE.K(objQ);
                        }
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) objQ, o0VarE, 48, 0);
                    o0Var = o0VarE;
                } else {
                    climbDTO2 = climbDTO;
                }
                z14 = false;
                z15 = zR2 | z14;
                objQ = o0VarE.q();
                if (z15) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sy.i(4, aVar4, climbDTO2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new sy.i(4, aVar4, climbDTO2);
                    o0VarE.K(objQ);
                }
                p002j6.c.b(lVar, rVarH, (e23.l) objQ, o0VarE, 48, 0);
                o0Var = o0VarE;
            } else {
                climbDTO2 = climbDTO;
            }
            z14 = true;
            z15 = zR2 | z14;
            objQ = o0VarE.q();
            if (z15) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sy.i(4, aVar4, climbDTO2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new sy.i(4, aVar4, climbDTO2);
                o0VarE.K(objQ);
            }
            p002j6.c.b(lVar, rVarH, (e23.l) objQ, o0VarE, 48, 0);
            o0Var = o0VarE;
        } else {
            climbDTO2 = climbDTO;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(climbDTO2, i14, 0);
        }
    }

    public static final void e(final ClimbDTO climbDTO, p3.m mVar, int i14) {
        int i15;
        ClimbDTO climbDTO2;
        o0 o0VarE = mVar.E(-913233340);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(climbDTO) : o0VarE.r(climbDTO) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            final boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            final y30.a aVar = new y30.a(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            l72.x0 x0Var = l72.x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            z3.e eVarC = z3.f.c(-149976867, new ry0.g(14, climbDTO, aVar), o0VarE);
            int i16 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(rVarC, eVarC, o0VarE, i16, 0);
            bVar.getClass();
            x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(-1959540716, new p9(zY, aVar, climbDTO, 12), o0VarE), o0VarE, i16, 0);
            final Double pavedPercentage = climbDTO.getPavedPercentage();
            if (pavedPercentage != null) {
                o0VarE.C(-1809447545);
                final double dDoubleValue = 100.0d - pavedPercentage.doubleValue();
                if (dDoubleValue > 0.0d) {
                    o0VarE.C(-1809375656);
                    bVar.getClass();
                    climbDTO2 = climbDTO;
                    x0Var.e(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(1304012243, new e23.q(dDoubleValue, zY, aVar, pavedPercentage) { // from class: t30.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ double f162169b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f162170c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ Double f162171d;

                        {
                            this.f162171d = pavedPercentage;
                        }

                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = n.f135158a;
                                ClimbDTO climbDTO3 = this.f162168a;
                                if (zf.b.D(climbDTO3.getPavedDistance()) && zf.b.D(Double.valueOf(climbDTO3.getDistance()))) {
                                    mVar2.C(-150350063);
                                    String strQ = y.Q(mVar2, R.string.unpaved);
                                    double distance = climbDTO3.getDistance();
                                    Double pavedDistance = climbDTO3.getPavedDistance();
                                    c40.k.a(t2Var, strQ, this.f162169b, distance - (pavedDistance != null ? pavedDistance.doubleValue() : 0.0d), this.f162170c, mVar2, iIntValue & 14);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-149998926);
                                    l72.x0 x0Var2 = l72.x0.f111346a;
                                    double dDoubleValue2 = 100.0d - this.f162171d.doubleValue();
                                    l3.f23124b.getClass();
                                    String str = l3.f23131i.format(Integer.valueOf(MathKt.b(dDoubleValue2)));
                                    str.getClass();
                                    x0Var2.a((l72.x0.f111348c << 24) | (iIntValue & 14), 124, null, t2Var, null, null, y.P(R.string.lbl_value_percent, new Object[]{str}, mVar2), y.Q(mVar2, R.string.unpaved), null, null, mVar2);
                                    t2Var = t2Var;
                                    mVar2 = mVar2;
                                    mVar2.f();
                                }
                                l72.x0.f111346a.h(t2Var, mVar2, (iIntValue & 14) | (l72.x0.f111348c << 3));
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, i16, 0);
                    o0VarE.g0(false);
                } else {
                    climbDTO2 = climbDTO;
                    o0VarE.C(-1808508834);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                climbDTO2 = climbDTO;
                o0VarE.C(-1808502882);
                o0VarE.g0(false);
            }
        } else {
            climbDTO2 = climbDTO;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(climbDTO2, i14, 1);
        }
    }
}
