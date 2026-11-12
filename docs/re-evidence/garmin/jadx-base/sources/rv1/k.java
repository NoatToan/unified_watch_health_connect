package rv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import f5.z0;
import h5.e0;
import i3.mh;
import l72.y0;
import lc.u0;
import org.joda.time.LocalDate;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f154735a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f154735a = 300;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0190  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x019b  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01db  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0201  */
    /* JADX WARN: Code duplicated, block: B:73:0x025e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0287  */
    /* JADX WARN: Code duplicated, block: B:78:0x028b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0294  */
    /* JADX WARN: Code duplicated, block: B:83:0x0298  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x02de  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e2  */
    public static final void a(LocalDate localDate, LocalDate localDate2, TrainingStatusReportDTO trainingStatusReportDTO, p3.m mVar, int i14) {
        int i15;
        Context context;
        h5.g.a.f fVar;
        j92.f fVar2;
        x0 x0Var;
        Context context2;
        int i16;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.g.a.b bVar;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        Object objQ;
        p3.m.a.C2565a c2565a;
        TrainingStatusReportDTO trainingStatusReportDTO2;
        boolean z14;
        boolean z15;
        Object e0Var;
        TrainingStatusReportDTO trainingStatusReportDTO3 = trainingStatusReportDTO;
        o0 o0VarE = mVar.E(249061106);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(localDate) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(trainingStatusReportDTO3) : o0VarE.r(trainingStatusReportDTO3) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context3 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                context = context3;
            } else {
                context = context3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                String strQ = gl1.y.Q(o0VarE, uv1.d.f172944h.f172956a);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97931h;
                x0 x0VarB = d92.c.b(d92.c.e(x0Var), o0VarE);
                h4.r rVarB = b0Var.b(aVar, aVar2);
                bVar2.getClass();
                h4.r rVarC4 = c2.l.C(rVarB, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                context2 = context;
                i16 = i15;
                mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                bVar2.getClass();
                h4.r rVarC5 = c2.l.C(aVar, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                zVarA = y.a(kVar, aVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T && p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    bVar = bVar3;
                } else {
                    bVar = bVar3;
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar = u.f22885a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_4w_timeline);
                fVar2.getClass();
                mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                h4.r rVarH = x2.h(x2.f(aVar, 1.0f), f154735a);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new rk0.n(28);
                    o0VarE.K(objQ);
                }
                e23.l lVar = (e23.l) objQ;
                boolean zR = o0VarE.r(localDate) | o0VarE.r(localDate2) | o0VarE.r(context2);
                if ((i16 & 896) != 256) {
                    if ((i16 & 512) != 0) {
                        trainingStatusReportDTO2 = trainingStatusReportDTO;
                        if (o0VarE.r(trainingStatusReportDTO2)) {
                        }
                        z15 = zR | z14;
                        Object objQ2 = o0VarE.q();
                        if (!z15 || objQ2 == c2565a) {
                            TrainingStatusReportDTO trainingStatusReportDTO4 = trainingStatusReportDTO2;
                            e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO4, 21);
                            trainingStatusReportDTO3 = trainingStatusReportDTO4;
                            o0VarE.K(e0Var);
                        } else {
                            e0Var = objQ2;
                            trainingStatusReportDTO3 = trainingStatusReportDTO2;
                        }
                        p002j6.c.b(lVar, rVarH, (e23.l) e0Var, o0VarE, 54, 0);
                        o0VarE.g0(r43);
                        b(trainingStatusReportDTO3, o0VarE, TrainingStatusReportDTO.f39909g | ((i16 >> 6) & 14));
                        o0VarE.g0(r43);
                        o0VarE.g0(true);
                    } else {
                        trainingStatusReportDTO2 = trainingStatusReportDTO;
                    }
                    z14 = false;
                    z15 = zR | z14;
                    Object objQ3 = o0VarE.q();
                    if (z15) {
                        TrainingStatusReportDTO trainingStatusReportDTO5 = trainingStatusReportDTO2;
                        e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO5, 21);
                        trainingStatusReportDTO3 = trainingStatusReportDTO5;
                        o0VarE.K(e0Var);
                    } else {
                        TrainingStatusReportDTO trainingStatusReportDTO6 = trainingStatusReportDTO2;
                        e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO6, 21);
                        trainingStatusReportDTO3 = trainingStatusReportDTO6;
                        o0VarE.K(e0Var);
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) e0Var, o0VarE, 54, 0);
                    o0VarE.g0(r43);
                    b(trainingStatusReportDTO3, o0VarE, TrainingStatusReportDTO.f39909g | ((i16 >> 6) & 14));
                    o0VarE.g0(r43);
                    o0VarE.g0(true);
                } else {
                    trainingStatusReportDTO2 = trainingStatusReportDTO;
                }
                z14 = true;
                z15 = zR | z14;
                Object objQ4 = o0VarE.q();
                if (z15) {
                    TrainingStatusReportDTO trainingStatusReportDTO7 = trainingStatusReportDTO2;
                    e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO7, 21);
                    trainingStatusReportDTO3 = trainingStatusReportDTO7;
                    o0VarE.K(e0Var);
                } else {
                    TrainingStatusReportDTO trainingStatusReportDTO8 = trainingStatusReportDTO2;
                    e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO8, 21);
                    trainingStatusReportDTO3 = trainingStatusReportDTO8;
                    o0VarE.K(e0Var);
                }
                p002j6.c.b(lVar, rVarH, (e23.l) e0Var, o0VarE, 54, 0);
                o0VarE.g0(r43);
                b(trainingStatusReportDTO3, o0VarE, TrainingStatusReportDTO.f39909g | ((i16 >> 6) & 14));
                o0VarE.g0(r43);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            String strQ3 = gl1.y.Q(o0VarE, uv1.d.f172944h.f172956a);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97931h;
            x0 x0VarB2 = d92.c.b(d92.c.e(x0Var), o0VarE);
            h4.r rVarB2 = b0Var2.b(aVar, aVar2);
            bVar2.getClass();
            h4.r rVarC6 = c2.l.C(rVarB2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            context2 = context;
            i16 = i15;
            mh.c(strQ3, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
            bVar2.getClass();
            h4.r rVarC7 = c2.l.C(aVar, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            zVarA = y.a(kVar, aVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC7, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                bVar = bVar3;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                bVar = bVar3;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u uVar2 = u.f22885a;
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_4w_timeline);
            fVar2.getClass();
            mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            h4.r rVarH2 = x2.h(x2.f(aVar, 1.0f), f154735a);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new rk0.n(28);
                o0VarE.K(objQ);
            }
            e23.l lVar2 = (e23.l) objQ;
            boolean zR2 = o0VarE.r(localDate) | o0VarE.r(localDate2) | o0VarE.r(context2);
            if ((i16 & 896) != 256) {
                if ((i16 & 512) != 0) {
                    trainingStatusReportDTO2 = trainingStatusReportDTO;
                    if (o0VarE.r(trainingStatusReportDTO2)) {
                    }
                    z15 = zR2 | z14;
                    Object objQ5 = o0VarE.q();
                    if (z15) {
                        TrainingStatusReportDTO trainingStatusReportDTO9 = trainingStatusReportDTO2;
                        e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO9, 21);
                        trainingStatusReportDTO3 = trainingStatusReportDTO9;
                        o0VarE.K(e0Var);
                    } else {
                        TrainingStatusReportDTO trainingStatusReportDTO10 = trainingStatusReportDTO2;
                        e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO10, 21);
                        trainingStatusReportDTO3 = trainingStatusReportDTO10;
                        o0VarE.K(e0Var);
                    }
                    p002j6.c.b(lVar2, rVarH2, (e23.l) e0Var, o0VarE, 54, 0);
                    o0VarE.g0(r43);
                    b(trainingStatusReportDTO3, o0VarE, TrainingStatusReportDTO.f39909g | ((i16 >> 6) & 14));
                    o0VarE.g0(r43);
                    o0VarE.g0(true);
                } else {
                    trainingStatusReportDTO2 = trainingStatusReportDTO;
                }
                z14 = false;
                z15 = zR2 | z14;
                Object objQ6 = o0VarE.q();
                if (z15) {
                    TrainingStatusReportDTO trainingStatusReportDTO11 = trainingStatusReportDTO2;
                    e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO11, 21);
                    trainingStatusReportDTO3 = trainingStatusReportDTO11;
                    o0VarE.K(e0Var);
                } else {
                    TrainingStatusReportDTO trainingStatusReportDTO12 = trainingStatusReportDTO2;
                    e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO12, 21);
                    trainingStatusReportDTO3 = trainingStatusReportDTO12;
                    o0VarE.K(e0Var);
                }
                p002j6.c.b(lVar2, rVarH2, (e23.l) e0Var, o0VarE, 54, 0);
                o0VarE.g0(r43);
                b(trainingStatusReportDTO3, o0VarE, TrainingStatusReportDTO.f39909g | ((i16 >> 6) & 14));
                o0VarE.g0(r43);
                o0VarE.g0(true);
            } else {
                trainingStatusReportDTO2 = trainingStatusReportDTO;
            }
            z14 = true;
            z15 = zR2 | z14;
            Object objQ7 = o0VarE.q();
            if (z15) {
                TrainingStatusReportDTO trainingStatusReportDTO13 = trainingStatusReportDTO2;
                e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO13, 21);
                trainingStatusReportDTO3 = trainingStatusReportDTO13;
                o0VarE.K(e0Var);
            } else {
                TrainingStatusReportDTO trainingStatusReportDTO14 = trainingStatusReportDTO2;
                e0Var = new mt0.e0(localDate, localDate2, context2, trainingStatusReportDTO14, 21);
                trainingStatusReportDTO3 = trainingStatusReportDTO14;
                o0VarE.K(e0Var);
            }
            p002j6.c.b(lVar2, rVarH2, (e23.l) e0Var, o0VarE, 54, 0);
            o0VarE.g0(r43);
            b(trainingStatusReportDTO3, o0VarE, TrainingStatusReportDTO.f39909g | ((i16 >> 6) & 14));
            o0VarE.g0(r43);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(localDate, localDate2, trainingStatusReportDTO3, i14, 27);
        }
    }

    public static final void b(TrainingStatusReportDTO trainingStatusReportDTO, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strL;
        o0 o0VarE = mVar.E(469114203);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(trainingStatusReportDTO) : o0VarE.r(trainingStatusReportDTO) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            o61.n nVar = (o61.n) h0.n0(trainingStatusReportDTO.D());
            o61.a acuteTrainingLoad = nVar != null ? nVar.getAcuteTrainingLoad() : null;
            String acwrStatus = acuteTrainingLoad != null ? acuteTrainingLoad.getAcwrStatus() : null;
            Integer dailyTrainingLoadAcute = acuteTrainingLoad != null ? acuteTrainingLoad.getDailyTrainingLoadAcute() : null;
            String acwrStatusFeedback = acuteTrainingLoad != null ? acuteTrainingLoad.getAcwrStatusFeedback() : null;
            if (acwrStatus == null || acwrStatusFeedback == null) {
                o0Var = o0VarE;
                o0Var.C(-441124569);
                o0Var.g0(false);
            } else {
                o0VarE.C(-441999079);
                e71.m.f63320c.getClass();
                e71.m mVarB = e71.m.a.b(acwrStatus, acwrStatusFeedback);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarF = x2.f(c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 1.0f);
                c2.j.f22691a.getClass();
                c2.j.c cVar = c2.j.f22696f;
                h4.d.f81522a.getClass();
                z zVarA = y.a(cVar, h4.d.a.f81537o, o0VarE, 54);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
                Integer num = mVarB.f63321a;
                if (num == null) {
                    o0VarE.C(-1729866435);
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    strL = u0.l(o0VarE, -1729866434, num, o0VarE, false);
                }
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
                bVar.getClass();
                h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97919d, 7);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57755e;
                mh.c(dailyTrainingLoadAcute + " - " + strL, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                String strQ = gl1.y.Q(o0VarE, mVarB.f63322b);
                fVar.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130046);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(trainingStatusReportDTO, i14, 20);
        }
    }
}
