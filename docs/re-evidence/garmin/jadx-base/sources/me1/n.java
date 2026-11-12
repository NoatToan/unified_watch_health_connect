package me1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.b0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g02.q0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import l72.n2;
import m92.c0;
import m92.d0;
import m92.h0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.s0;
import s5.x0;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:84:0x0255  */
    public static final void a(i53.f fVar, int i14, o oVar, o oVar2, r rVar, p3.m mVar, int i15) {
        r rVar2;
        String strJ;
        Double d14;
        r.a aVar;
        i53.f<be1.b> fVar2 = fVar;
        oVar.getClass();
        oVar2.getClass();
        o0 o0VarE = mVar.E(2128149203);
        int i16 = i15 | (o0VarE.B(fVar2) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(oVar) ? 256 : 128) | (o0VarE.r(oVar2) ? 2048 : 1024) | 24576;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            r.a aVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            if (dh.b.H(Integer.valueOf(i14))) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1680927180, R.string.lbl_daily_averages, o0VarE, false);
            } else {
                o0VarE.C(1680998387);
                o0VarE.g0(false);
                strJ = null;
            }
            g6.f.a aVar3 = g6.f.f75994b;
            final float f14 = (float) 1.5d;
            float f15 = f14 * 2;
            final DateTime dateTimeAtStartOfDay = g22.l.h(oVar).toDateTimeAtStartOfDay();
            DateTime dateTimeAtStartOfDay2 = g22.l.h(oVar2).toDateTimeAtStartOfDay();
            r rVarH = x2.h(x2.f(aVar2, 1.0f), 350);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarThen = c2.l.y(rVarH, j92.b.f97899b.f97920e).then(aVar2);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            final ArrayList arrayList = new ArrayList();
            final ArrayList<hz.d> arrayList2 = new ArrayList();
            if (fVar2 != null && !fVar2.isEmpty() && !fVar2.isEmpty()) {
                Iterator<E> it = fVar2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        be1.b bVar2 = (be1.b) it.next();
                        bVar2.getClass();
                        Double d15 = bVar2.f17740c;
                        if ((d15 == null || d15.doubleValue() <= 0.0d) && ((d14 = bVar2.f17739b) == null || d14.doubleValue() <= 0.0d)) {
                            fVar2 = fVar;
                            aVar2 = aVar2;
                        } else {
                            for (be1.b bVar3 : fVar2) {
                                bVar3.getClass();
                                String str = bVar3.f17738a;
                                LocalDate localDateW = str != null ? g22.k.w(str, "yyyy-MM-dd") : null;
                                DateTime dateTimeAtStartOfDay3 = localDateW != null ? localDateW.toDateTimeAtStartOfDay() : null;
                                if (dateTimeAtStartOfDay3 != null) {
                                    Double d16 = bVar3.f17740c;
                                    aVar = aVar2;
                                    if (d16 != null) {
                                        arrayList.add(new hz.d(dateTimeAtStartOfDay3, (float) d16.doubleValue()));
                                    }
                                    Double d17 = bVar3.f17739b;
                                    if (d17 != null) {
                                        arrayList2.add(new hz.d(dateTimeAtStartOfDay3, (float) d17.doubleValue()));
                                    }
                                } else {
                                    aVar = aVar2;
                                }
                                aVar2 = aVar;
                            }
                        }
                    }
                }
            }
            r.a aVar6 = aVar2;
            s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            final a10.a aVar7 = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            final x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            f02.y.f67753a.getClass();
            x1 x1Var2 = p3.n.f135158a;
            gl.c cVar = gl.c.f77766a;
            cVar.getClass();
            final long jN = gl.c.a(o0VarE).n();
            f02.z.f67754a.getClass();
            cVar.getClass();
            final long jC = gl.c.a(o0VarE).c();
            boolean zB = o0VarE.B(oVar) | o0VarE.B(oVar2);
            Object objQ = o0VarE.q();
            if (zB) {
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                objQ = c02.a.c(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    dateTimeAtStartOfDay.getClass();
                    dateTimeAtStartOfDay2.getClass();
                    objQ = c02.a.c(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                    o0VarE.K(objQ);
                }
            }
            List list = (List) objQ;
            r rVarD = x2.d(r.S, 1.0f);
            m92.m.d dVar = new m92.m.d(jC, null);
            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
            for (Iterator it3 = arrayList.iterator(); it3.hasNext(); it3 = it3) {
                hz.d dVar2 = (hz.d) it3.next();
                arrayList3.add(new h0.e.a(Days.daysBetween(dateTimeAtStartOfDay, dVar2.f86388a).getDays(), dVar2.f86389b));
            }
            d0 d0Var = new d0(f14, dVar, i53.a.j(arrayList3), true, f15, o4.d0.a(jC), null, true, null, 320, null);
            m92.m.d dVar3 = new m92.m.d(jN, null);
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList2, 10));
            for (hz.d dVar4 : arrayList2) {
                arrayList4.add(new h0.e.a(Days.daysBetween(dateTimeAtStartOfDay, dVar4.f86388a).getDays(), dVar4.f86389b));
                dVar3 = dVar3;
            }
            i53.f fVarJ = i53.a.j(x.k(d0Var, new d0(f14, dVar3, i53.a.j(arrayList4), true, f15, o4.d0.a(jN), null, true, null, 320, null)));
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_respiration_data);
            float days = Days.daysBetween(dateTimeAtStartOfDay, dateTimeAtStartOfDay2).getDays() + 1;
            d02.c cVar2 = new d02.c();
            Float fU = gl1.y.u(arrayList2);
            float fFloatValue = fU != null ? fU.floatValue() : 8.0f;
            Float fU2 = gl1.y.u(arrayList);
            Float fValueOf = Float.valueOf(Math.min(Math.min(fFloatValue, fU2 != null ? fU2.floatValue() : 8.0f), 8.0f));
            Float fS = gl1.y.s(arrayList2);
            float fFloatValue2 = fS != null ? fS.floatValue() : 20.0f;
            Float fS2 = gl1.y.s(arrayList);
            n92.e eVar = new n92.e(cVar2, fValueOf, Float.valueOf(Math.max(Math.max(fFloatValue2, fS2 != null ? fS2.floatValue() : 20.0f), 20.0f)), 0.0f, 0, 24, null);
            d92.b.f58623a.getClass();
            c0.b(rVarD, strJ, fVarJ, Float.valueOf(days), strQ, null, new n92.a(eVar, null, new n92.g(d92.b.a(o0VarE).j().c(), s0Var, x0VarF, null, 8, null), new n92.b(list, null, null, false, 0, null, s0Var, x0VarF, 62, null), 2, null), z3.f.c(297775637, new p() { // from class: me1.j
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                            mVar2.C(1926989965);
                            mVar2.f();
                        } else {
                            mVar2.C(1926640161);
                            n.c(aVar7, x0VarF, f14, jC, jN, mVar2, 392);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), z3.f.c(1469454000, new e23.q() { // from class: me1.k
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    DateTime dateTime;
                    Object next;
                    Float f16 = (Float) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(f16) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var3 = p3.n.f135158a;
                        o13.p pVar = null;
                        Object obj4 = null;
                        if (f16 != null) {
                            int iFloatValue = (int) f16.floatValue();
                            Iterator it4 = arrayList.iterator();
                            do {
                                boolean zHasNext = it4.hasNext();
                                dateTime = dateTimeAtStartOfDay;
                                if (!zHasNext) {
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                            } while (Days.daysBetween(dateTime, ((hz.d) next).f86388a).getDays() != iFloatValue);
                            for (Object obj5 : arrayList2) {
                                if (Days.daysBetween(dateTime, ((hz.d) obj5).f86388a).getDays() == iFloatValue) {
                                    obj4 = obj5;
                                    break;
                                }
                            }
                            pVar = new o13.p(next, obj4);
                        }
                        if (pVar == null) {
                            mVar2.C(-2097182401);
                            mVar2.f();
                        } else {
                            mVar2.C(-2097182400);
                            n.b((hz.d) pVar.f128594a, (hz.d) pVar.f128595b, aVar7, jC, jN, mVar2, 584);
                            mVar2.f();
                        }
                        x1 x1Var4 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 113246726, 32);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
            rVar2 = aVar6;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(fVar, i14, oVar, oVar2, rVar2, i15, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    public static final void b(final hz.d dVar, final hz.d dVar2, final a10.a aVar, final long j8, final long j14, p3.m mVar, final int i14) {
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        DateTime dateTime;
        o0 o0VarE = mVar.E(-1518097022);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(dVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.l(j14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            if (dVar == null && dVar2 == null) {
                o0VarE.C(379120352);
                o0VarE.g0(false);
            } else {
                o0VarE.C(377553922);
                if (dVar == null) {
                    if (dVar2 != null) {
                        dateTime = dVar2.f86388a;
                    } else {
                        o0VarE.g0(false);
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        final int i16 = 0;
                        pVar = new p(dVar, dVar2, aVar, j8, j14, i14, i16) { // from class: me1.l

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f118106a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ hz.d f118107b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ hz.d f118108c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ a10.a f118109d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ long f118110e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ long f118111f;

                            {
                                this.f118106a = i16;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                switch (this.f118106a) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iT = p0.t(585);
                                        n.b(this.f118107b, this.f118108c, this.f118109d, this.f118110e, this.f118111f, (p3.m) obj, iT);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iT2 = p0.t(585);
                                        n.b(this.f118107b, this.f118108c, this.f118109d, this.f118110e, this.f118111f, (p3.m) obj, iT2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    }
                    p2VarI0.f135219d = pVar;
                }
                dateTime = dVar.f86388a;
                boolean zB = o0VarE.B(dateTime);
                Object objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (zB) {
                    objQ = aVar.f243b.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = aVar.f243b.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        o0VarE.K(objQ);
                    }
                }
                String str = (String) objQ;
                Object objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = aVar.f244c;
                    o0VarE.K(objQ2);
                }
                m92.y.a(str, z3.f.c(1524730284, new a3.b(dVar, gl1.y.Q(o0VarE, R.string.no_value_card), j8, (String) objQ2, dVar2, j14, aVar), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new p(dVar, dVar2, aVar, j8, j14, i14, i17) { // from class: me1.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f118106a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ hz.d f118107b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ hz.d f118108c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a10.a f118109d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f118110e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f118111f;

                {
                    this.f118106a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f118106a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(585);
                            n.b(this.f118107b, this.f118108c, this.f118109d, this.f118110e, this.f118111f, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(585);
                            n.b(this.f118107b, this.f118108c, this.f118109d, this.f118110e, this.f118111f, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void c(final a10.a aVar, final x0 x0Var, final float f14, final long j8, final long j14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1044005445);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.B(x0Var) ? 32 : 16) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.l(j14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            t0.a(c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1), cVar, null, null, 0, 0, z3.f.c(-514355798, new e23.q() { // from class: me1.m
                /* JADX WARN: Code duplicated, block: B:34:0x019a  */
                /* JADX WARN: Code duplicated, block: B:37:0x01ac  */
                /* JADX WARN: Code duplicated, block: B:41:0x01d2  */
                /* JADX WARN: Code duplicated, block: B:44:0x0202  */
                /* JADX WARN: Code duplicated, block: B:46:0x020b  */
                /* JADX WARN: Code duplicated, block: B:48:0x0213  */
                /* JADX WARN: Code duplicated, block: B:53:0x0233  */
                /* JADX WARN: Code duplicated, block: B:57:0x028c  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str;
                    h5.g.a.f fVar;
                    float f15;
                    m1.a aVar2;
                    x0 x0Var2;
                    Object objQ;
                    String str2;
                    Object objQ2;
                    String strB;
                    boolean zB;
                    Object objQ3;
                    s2 s2VarA;
                    int iHashCode;
                    i2 i2VarX;
                    r rVarC;
                    l22.a aVar3 = aVar.f242a;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c1) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        Object objQ4 = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ4 == c2565a) {
                            objQ4 = aVar3.getString(R.string.sleep_lbl_avg_short);
                            mVar2.K(objQ4);
                        }
                        String str3 = (String) objQ4;
                        Object objQ5 = mVar2.q();
                        if (objQ5 == c2565a) {
                            objQ5 = new m30.n(26);
                            mVar2.K(objQ5);
                        }
                        String strB2 = oi0.c.B(str3, (e23.l) objQ5, mVar2);
                        r.a aVar4 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f16 = eVar.f97918c;
                        float f17 = eVar.f97920e;
                        r rVarA = c2.l.A(aVar4, f16, 0.0f, 2);
                        boolean zB2 = mVar2.B(strB2);
                        Object objQ6 = mVar2.q();
                        if (zB2 || objQ6 == c2565a) {
                            objQ6 = new n2(strB2, 21);
                            mVar2.K(objQ6);
                        }
                        r rVarB = v.b(rVarA, (e23.l) objQ6);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j = c2.j.f22692b;
                        s2 s2VarA2 = q2.a(c0343j, bVar, mVar2, 48);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        r rVarC2 = h4.k.c(rVarB, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, s2VarA2, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX2, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            str = str3;
                        } else {
                            str = str3;
                            if (!s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC2, mVar2);
                            u2 u2Var = u2.f22900a;
                            f15 = f14;
                            r rVarR = x2.r(aVar4, f17, f15);
                            aVar2 = m1.f128891a;
                            c2.q.a(u1.n.e(l4.k.b(rVarR, aVar2), j8, aVar2), mVar2, 0);
                            r rVarC3 = c2.l.C(aVar4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                            x0Var2 = x0Var;
                            mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar2, 6, 0, 131068);
                            mVar2.y();
                            objQ = mVar2.q();
                            if (objQ == c2565a) {
                                objQ = aVar3.getString(R.string.respiration_lbl_awake_avg_short);
                                mVar2.K(objQ);
                            }
                            str2 = (String) objQ;
                            objQ2 = mVar2.q();
                            if (objQ2 == c2565a) {
                                objQ2 = new m30.n(21);
                                mVar2.K(objQ2);
                            }
                            strB = oi0.c.B(str2, (e23.l) objQ2, mVar2);
                            r rVarA2 = c2.l.A(aVar4, eVar.f97918c, 0.0f, 2);
                            zB = mVar2.B(strB);
                            objQ3 = mVar2.q();
                            if (zB || objQ3 == c2565a) {
                                objQ3 = new n2(strB, 20);
                                mVar2.K(objQ3);
                            }
                            r rVarB2 = v.b(rVarA2, (e23.l) objQ3);
                            s2VarA = q2.a(c0343j, bVar, mVar2, 48);
                            iHashCode = Long.hashCode(mVar2.getU());
                            i2VarX = mVar2.x();
                            rVarC = h4.k.c(rVarB2, mVar2);
                            if (mVar2.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar5);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, s2VarA, mVar2);
                            b4.c(c1623g, i2VarX, mVar2);
                            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                            }
                            b4.c(fVar, rVarC, mVar2);
                            c2.q.a(u1.n.e(l4.k.b(x2.r(aVar4, f17, f15), aVar2), j14, aVar2), mVar2, 0);
                            mh.c(str2, c2.l.C(aVar4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar2, 6, 0, 131068);
                            mVar2.y();
                        }
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar2);
                        u2 u2Var2 = u2.f22900a;
                        f15 = f14;
                        r rVarR2 = x2.r(aVar4, f17, f15);
                        aVar2 = m1.f128891a;
                        c2.q.a(u1.n.e(l4.k.b(rVarR2, aVar2), j8, aVar2), mVar2, 0);
                        r rVarC4 = c2.l.C(aVar4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        x0Var2 = x0Var;
                        mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar2, 6, 0, 131068);
                        mVar2.y();
                        objQ = mVar2.q();
                        if (objQ == c2565a) {
                            objQ = aVar3.getString(R.string.respiration_lbl_awake_avg_short);
                            mVar2.K(objQ);
                        }
                        str2 = (String) objQ;
                        objQ2 = mVar2.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new m30.n(21);
                            mVar2.K(objQ2);
                        }
                        strB = oi0.c.B(str2, (e23.l) objQ2, mVar2);
                        r rVarA3 = c2.l.A(aVar4, eVar.f97918c, 0.0f, 2);
                        zB = mVar2.B(strB);
                        objQ3 = mVar2.q();
                        if (zB) {
                            objQ3 = new n2(strB, 20);
                            mVar2.K(objQ3);
                        } else {
                            objQ3 = new n2(strB, 20);
                            mVar2.K(objQ3);
                        }
                        r rVarB3 = v.b(rVarA3, (e23.l) objQ3);
                        s2VarA = q2.a(c0343j, bVar, mVar2, 48);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = h4.k.c(rVarB3, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        } else {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        c2.q.a(u1.n.e(l4.k.b(x2.r(aVar4, f17, f15), aVar2), j14, aVar2), mVar2, 0);
                        mh.c(str2, c2.l.C(aVar4, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar2, 6, 0, 131068);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 1572912, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k71.d(aVar, x0Var, f14, j8, j14, i14);
        }
    }
}
