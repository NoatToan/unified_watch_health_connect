package qn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c22.g0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import h2.j0;
import h2.u;
import h4.k;
import h5.g;
import i53.f;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s1.b2;
import s1.e0;
import s1.l;
import sm1.a0;
import sm1.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: qn1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.summary.SleepDailySummaryReportsPageKt$SleepConsistencyAndAlignmentTab$1$1$1$1", f = "SleepDailySummaryReportsPage.kt", l = {200}, m = "invokeSuspend", v = 2)
    public static final class C2746a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f145825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f145826c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2746a(j0 j0Var, int i14, d<? super C2746a> dVar) {
            super(2, dVar);
            this.f145825b = j0Var;
            this.f145826c = i14;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C2746a(this.f145825b, this.f145826c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2746a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145824a;
            if (i14 == 0) {
                r.b(obj);
                b2 b2VarD = l.d(100, 0, e0.f155563d, 2);
                this.f145824a = 1;
                if (j0.g(this.f145825b, this.f145826c, b2VarD, this, 2) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.summary.SleepDailySummaryReportsPageKt$SleepConsistencyAndAlignmentTab$1$3$1", f = "SleepDailySummaryReportsPage.kt", l = {226}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f145828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f145829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var, int i14, d<? super b> dVar) {
            super(2, dVar);
            this.f145828b = j0Var;
            this.f145829c = i14;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f145828b, this.f145829c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145827a;
            if (i14 == 0) {
                r.b(obj);
                j0 j0Var = this.f145828b;
                int iIntValue = ((Number) j0Var.f80947w.getF182175a()).intValue();
                int i15 = this.f145829c;
                if (iIntValue != i15) {
                    this.f145827a = 1;
                    if (j0.w(j0Var, i15, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mm1.b bVar, s sVar, LocalDate localDate, LocalDate localDate2, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-300278408);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(sVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(localDate) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(localDate2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarE = u1.n.e(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), ds.e0.f(o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarE, o0VarE);
            g.V.getClass();
            h5.e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            int i16 = ((a0) s9.c.c(sVar.f160188h, o0VarE).getF182175a()).f160099o.f153657a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new qn0.m(1);
                o0VarE.K(objQ);
            }
            h2.b bVarB = h2.o0.b(i16, (e23.a) objQ, o0VarE, 384, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var2 = (b0) objQ2;
            f fVarA = i53.a.a(gl1.y.Q(o0VarE, R.string.lbl_sleep_consistency), gl1.y.Q(o0VarE, R.string.lbl_sleep_alignment));
            boolean zR = o0VarE.r(b0Var2) | o0VarE.B(bVarB) | o0VarE.r(sVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new en1.a(b0Var2, sVar, bVarB, 1);
                o0VarE.K(objQ3);
            }
            g0.a(i16, fVarA, null, false, (e23.l) objQ3, o0VarE, 3072, 4);
            u.a(bVarB, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-1382127121, new i91.e(bVar, 24, localDate, localDate2), o0VarE), o0VarE, 100663296, 24576, 16126);
            o0VarE = o0VarE;
            Integer numValueOf = Integer.valueOf(i16);
            boolean zB = o0VarE.B(bVarB) | o0VarE.k(i16);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new b(bVarB, i16, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, numValueOf, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(bVar, sVar, localDate, localDate2, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:86:0x0248  */
    /* JADX WARN: Code duplicated, block: B:97:0x0277  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void b(mm1.b bVar, DateTime dateTime, DateTime dateTime2, s sVar, e23.l lVar, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar, e23.l lVar2, m mVar, int i14) {
        ?? r14;
        ?? r15;
        o0 o0Var;
        List<mm1.c> listB;
        sVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1055384844);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(sVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.k(cVar == null ? -1 : cVar.ordinal()) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(sVar.f160188h, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarE, o0VarE);
            g.V.getClass();
            h5.e0.a aVar2 = g.a.f81805b;
            List listN0 = null;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            sn1.b.f160414a.getClass();
            boolean zG = sn1.b.g();
            m.a aVar3 = m.f135153a;
            if (zG) {
                o0VarE.C(1168367213);
                ArrayList arrayListC = sn1.b.c(((a0) p1VarC.getF182175a()).f160097m);
                rl1.i iVar = ((a0) p1VarC.getF182175a()).f160091g;
                boolean zR = o0VarE.r(sVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new in1.c(sVar, 3);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new in1.c(sVar, 3);
                        o0VarE.K(objQ);
                    }
                }
                r15 = 0;
                rn1.l.a(bVar, dateTime, dateTime2, iVar, arrayListC, (e23.l) objQ, o0VarE, (i15 & 14) | 8 | (i15 & 112) | (i15 & 896));
                o0 o0Var2 = o0VarE;
                rn1.j.h(bVar != null ? bVar.getOverallStats() : null, ((a0) p1VarC.getF182175a()).f160097m, o0Var2, mm1.a.f119613m);
                o0Var2.g0(false);
                o0Var = o0Var2;
            } else {
                r15 = 0;
                o0VarE.C(1168969760);
                o0VarE.g0(false);
                o0Var = o0VarE;
            }
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            LocalDate localDate2 = dateTime2.toLocalDate();
            localDate2.getClass();
            o0 o0Var3 = o0Var;
            int i16 = 8 | (i15 & 14);
            rn1.g.a(bVar, localDate, localDate2, false, cVar == com.garmin.android.apps.connectmobile.sleep.presentation.c.SLEEP_NEED ? lVar2 : null, o0Var3, i16, 8);
            ?? r16 = o0Var3;
            if (sn1.b.e()) {
                r16.C(1169308776);
                LocalDate localDate3 = dateTime.toLocalDate();
                localDate3.getClass();
                LocalDate localDate4 = dateTime2.toLocalDate();
                localDate4.getClass();
                a(bVar, sVar, localDate3, localDate4, r16, i16 | ((i15 >> 6) & 112));
                r16.g0(r15);
            } else {
                r16.C(1169435752);
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), r16);
                LocalDate localDate5 = dateTime.toLocalDate();
                localDate5.getClass();
                LocalDate localDate6 = dateTime2.toLocalDate();
                localDate6.getClass();
                rn1.c.a(bVar, localDate5, localDate6, false, r16, i16, 8);
                r16.g0(r15);
            }
            if (bVar != null && (listB = bVar.b()) != null) {
                listN0 = h0.N0(listB, new qn1.b());
            }
            List list = listN0;
            if (sn1.b.g()) {
                r16.C(1169773125);
                ?? r17 = (i15 & 57344) == 16384 ? 1 : r15;
                Object objQ2 = r16.q();
                if (r17 == 0) {
                    aVar3.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new qe2.c(lVar, 1);
                        r16.K(objQ2);
                    }
                } else {
                    objQ2 = new qe2.c(lVar, 1);
                    r16.K(objQ2);
                }
                d(list, (e23.l) objQ2, r16, r15);
                r16.g0(r15);
            } else {
                r16.C(1169869380);
                ?? r18 = (i15 & 57344) == 16384 ? 1 : r15;
                Object objQ3 = r16.q();
                if (r18 == 0) {
                    aVar3.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new qe2.c(lVar, 2);
                        r16.K(objQ3);
                    }
                } else {
                    objQ3 = new qe2.c(lVar, 2);
                    r16.K(objQ3);
                }
                c(list, (e23.l) objQ3, r16, r15);
                r16.g0(r15);
            }
            r16.g0(true);
            r14 = r16;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(i14, 28, bVar, dateTime, dateTime2, sVar, lVar, cVar, lVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    public static final void c(List<mm1.c> list, e23.l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        c42.e0 e0Var;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(394847602);
        int i15 = 16;
        int i16 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new c42.e0(lVar, i14, 12, list);
                }
            } else {
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
                pi0.e eVar = new pi0.e((Context) o0VarE.A(y3Var));
                h4.r.a aVar = h4.r.S;
                g6.f.a aVar2 = g6.f.f75994b;
                h4.r rVarA = c2.l.A(aVar, 0.0f, 8, 1);
                h4.r rVarY = c2.l.y(aVar, 16);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = k.c(rVarY, o0VarE);
                g.V.getClass();
                h5.e0.a aVar3 = g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar = g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarE.C(88879319);
                for (mm1.c cVar : list) {
                    LocalDate localDateA = mm1.d.a(cVar);
                    an1.b bVar2 = new an1.b(localDateA, eVar, dVar.b());
                    mm1.c.a values = cVar.getValues();
                    Integer totalSleepTimeInSeconds = values != null ? values.getTotalSleepTimeInSeconds() : null;
                    if (totalSleepTimeInSeconds != null && totalSleepTimeInSeconds.intValue() < 60) {
                        totalSleepTimeInSeconds = 0;
                    }
                    String strD = dVar.d(totalSleepTimeInSeconds);
                    pi0.e eVar2 = bVar2.f4477b;
                    LocalDate localDate = bVar2.f4476a;
                    String strD2 = localDate != null ? eVar2.d(localDate, qi0.a.WEEKDAY) : bVar2.f4478c;
                    String strD3 = localDate != null ? eVar2.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY) : null;
                    z3.e eVarC = z3.f.c(1613744027, new o72.b(i15, strD, cVar), o0VarE);
                    boolean zR = o0VarE.r(localDateA) | ((i16 & 112) == 32);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new di0.e(localDateA, lVar, 5);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new di0.e(localDateA, lVar, 5);
                            o0VarE.K(objQ);
                        }
                    }
                    b10.d dVar2 = dVar;
                    String str = strD2;
                    h4.r rVar = rVarA;
                    l72.l.d(str, strD3, eVarC, rVar, null, false, (e23.a) objQ, o0VarE, 3456, 48);
                    rVarA = rVar;
                    eVar = eVar;
                    dVar = dVar2;
                    i15 = 16;
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = e0Var;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            e0Var = new c42.e0(lVar, i14, 13, list);
            p2VarI0.f135219d = e0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    public static final void d(List<mm1.c> list, e23.l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        c42.e0 e0Var;
        p2 p2VarI0;
        Integer totalSleepTimeInSeconds;
        o0 o0VarE = mVar.E(486544355);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new c42.e0(lVar, i14, 14, list);
                }
            } else {
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
                pi0.e eVar = new pi0.e((Context) o0VarE.A(y3Var));
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(aVar, 0.0f, eVar2.f97918c, 1);
                bVar.getClass();
                float f14 = eVar2.f97918c;
                bVar.getClass();
                h4.r rVarC = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar2.f97920e, 5);
                bVar.getClass();
                h4.r rVarA2 = c2.l.A(rVarC, eVar2.f97920e, 0.0f, 2);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = k.c(rVarA2, o0VarE);
                g.V.getClass();
                h5.e0.a aVar2 = g.a.f81805b;
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
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar2 = g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(g.a.f81807d, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarE.C(-1735930557);
                for (mm1.c cVar : list) {
                    LocalDate localDateA = mm1.d.a(cVar);
                    an1.b bVar3 = new an1.b(localDateA, eVar, dVar.b());
                    pi0.e eVar3 = bVar3.f4477b;
                    LocalDate localDate = bVar3.f4476a;
                    String strD = localDate != null ? eVar3.d(localDate, qi0.a.WEEKDAY) : bVar3.f4478c;
                    String strD2 = localDate != null ? eVar3.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY) : null;
                    mm1.c.a values = cVar.getValues();
                    String strE = dVar.e(values != null ? values.getSleepScore() : null);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_score);
                    mm1.c.a values2 = cVar.getValues();
                    if (values2 == null || (totalSleepTimeInSeconds = values2.getTotalSleepTimeInSeconds()) == null) {
                        totalSleepTimeInSeconds = null;
                    }
                    String strD3 = dVar.d(totalSleepTimeInSeconds);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.txt_duration);
                    int i16 = i15;
                    boolean zR = o0VarE.r(localDateA) | ((i15 & 112) == 32);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new di0.e(localDateA, lVar, 6);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new di0.e(localDateA, lVar, 6);
                            o0VarE.K(objQ);
                        }
                    }
                    pi0.e eVar4 = eVar;
                    h4.r rVar = rVarA;
                    l72.l.e(strD, strD2, strE, strQ, strD3, strQ2, rVar, null, false, (e23.a) objQ, o0VarE, 0, 384);
                    dVar = dVar;
                    z14 = false;
                    rVarA = rVar;
                    i15 = i16;
                    eVar = eVar4;
                }
                o0VarE.g0(z14);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = e0Var;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            e0Var = new c42.e0(lVar, i14, 11, list);
            p2VarI0.f135219d = e0Var;
        }
    }
}
