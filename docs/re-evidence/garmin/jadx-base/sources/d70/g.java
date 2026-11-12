package d70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.t1;
import m92.c0;
import m92.d0;
import m92.y;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.x;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.s0;
import s5.x0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58105a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58105a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    public static final void a(final hz.d dVar, final hz.d dVar2, final hz.d dVar3, final o82.g gVar, p3.m mVar, final int i14) {
        final hz.d dVar4;
        final hz.d dVar5;
        final hz.d dVar6;
        final o82.g gVar2;
        DateTime dateTime;
        pi0.e eVar;
        int i15;
        String strA;
        DateTime dateTimePlusDays;
        o0 o0VarE = mVar.E(-1625486931);
        int i16 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(dVar2) ? 32 : 16) | (o0VarE.r(dVar3) ? 256 : 128) | (o0VarE.k(gVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (dVar == null && dVar2 == null && dVar3 == null) {
                o0VarE.C(876868725);
                o0VarE.g0(false);
                dVar4 = dVar;
                dVar5 = dVar2;
                dVar6 = dVar3;
                gVar2 = gVar;
            } else {
                o0VarE.C(875446445);
                if (dVar != null) {
                    dateTime = dVar.f86388a;
                } else if (dVar2 != null) {
                    dateTime = dVar2.f86388a;
                } else {
                    dateTime = dVar3 != null ? dVar3.f86388a : null;
                    if (dateTime == null) {
                        o0VarE.g0(false);
                        p2 p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i17 = 0;
                            p2VarI0.f135219d = new p(dVar, dVar2, dVar3, gVar, i14, i17) { // from class: d70.d

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ int f58094a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ hz.d f58095b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ hz.d f58096c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final /* synthetic */ hz.d f58097d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                public final /* synthetic */ o82.g f58098e;

                                {
                                    this.f58094a = i17;
                                }

                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (this.f58094a) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iT = p0.t(585);
                                            g.a(this.f58095b, this.f58096c, this.f58097d, this.f58098e, (p3.m) obj, iT);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iT2 = p0.t(585);
                                            g.a(this.f58095b, this.f58096c, this.f58097d, this.f58098e, (p3.m) obj, iT2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                dVar4 = dVar;
                dVar5 = dVar2;
                dVar6 = dVar3;
                gVar2 = gVar;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                boolean zB = o0VarE.B(dateTime);
                Object objQ = o0VarE.q();
                if (zB) {
                    eVar = new pi0.e(context);
                    i15 = a.f58105a[gVar2.ordinal()];
                    if (i15 != 1) {
                        strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                    } else if (i15 != 2) {
                        dateTimePlusDays = dateTime.plusDays(6);
                        if (dateTimePlusDays.isAfter(DateTime.now())) {
                            dateTimePlusDays = DateTime.now();
                        }
                        dateTimePlusDays.getClass();
                        strA = eVar.g(dateTime, dateTimePlusDays, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
                    } else if (i15 != 3) {
                        strA = "";
                    } else {
                        strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY);
                    }
                    objQ = strA;
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        eVar = new pi0.e(context);
                        i15 = a.f58105a[gVar2.ordinal()];
                        if (i15 != 1) {
                            strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                        } else if (i15 != 2) {
                            dateTimePlusDays = dateTime.plusDays(6);
                            if (dateTimePlusDays.isAfter(DateTime.now())) {
                                dateTimePlusDays = DateTime.now();
                            }
                            dateTimePlusDays.getClass();
                            strA = eVar.g(dateTime, dateTimePlusDays, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
                        } else if (i15 != 3) {
                            strA = "";
                        } else {
                            strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY);
                        }
                        objQ = strA;
                        o0VarE.K(objQ);
                    }
                }
                y.a((String) objQ, z3.f.c(-259538493, new c50.f(dVar4, 18, dVar5, dVar6), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
        } else {
            dVar4 = dVar;
            dVar5 = dVar2;
            dVar6 = dVar3;
            gVar2 = gVar;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            final int i18 = 1;
            p2VarI1.f135219d = new p(dVar4, dVar5, dVar6, gVar2, i14, i18) { // from class: d70.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f58094a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ hz.d f58095b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ hz.d f58096c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ hz.d f58097d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ o82.g f58098e;

                {
                    this.f58094a = i18;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f58094a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(585);
                            g.a(this.f58095b, this.f58096c, this.f58097d, this.f58098e, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(585);
                            g.a(this.f58095b, this.f58096c, this.f58097d, this.f58098e, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(x0 x0Var, float f14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(108091110);
        int i15 = (o0VarE.B(x0Var) ? 4 : 2) | i14 | (o0VarE.i(f14) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            t0.a(c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1), cVar, null, null, 0, 0, z3.f.c(-1834998879, new e(f14, x0Var, i16), o0VarE), o0VarE, 1572912, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(x0Var, f14, i14, i16);
        }
    }

    public static final void c(r rVar, k61.b bVar, o82.g gVar, DateTime dateTime, DateTime dateTime2, p3.m mVar, int i14) {
        rVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(94721236);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.k(gVar.ordinal()) ? 256 : 128) | (o0VarE.r(dateTime) ? 2048 : 1024) | (o0VarE.r(dateTime2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayListC = c02.a.c(dateTime, dateTime2);
            s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            n92.d dVar = new n92.d(arrayListC, s0Var, d92.c.f(j92.f.f97935l, o0VarE), null, null, 24, null);
            o0VarE.C(47411812);
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97916a;
            gl.c.f77766a.getClass();
            m92.m.d dVar2 = new m92.m.d(gl.c.a(o0VarE).k(), null);
            i53.c<k61.a> cVar = bVar.f103168f;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<k61.a> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f103160a);
            }
            i53.c cVarE = i53.a.e(arrayList);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97917b;
            gl.c.f77766a.getClass();
            d0 d0Var = new d0(f14, dVar2, cVarE, true, f15, o4.d0.a(gl.c.a(o0VarE).k()), null, false, null, 448, null);
            bVar2.getClass();
            float f16 = eVar.f97916a;
            m92.m.d dVar3 = new m92.m.d(gl.c.a(o0VarE).i(), null);
            i53.c<k61.a> cVar2 = bVar.f103169g;
            ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
            Iterator<k61.a> it3 = cVar2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().f103160a);
            }
            i53.c cVarE2 = i53.a.e(arrayList2);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f17 = eVar2.f97917b;
            gl.c.f77766a.getClass();
            d0 d0Var2 = new d0(f16, dVar3, cVarE2, true, f17, o4.d0.a(gl.c.a(o0VarE).i()), null, false, null, 448, null);
            bVar3.getClass();
            float f18 = eVar2.f97916a;
            m92.m.d dVar4 = new m92.m.d(gl.c.a(o0VarE).o(), null);
            i53.c<k61.a> cVar3 = bVar.f103170h;
            ArrayList arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
            Iterator<k61.a> it4 = cVar3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().f103160a);
            }
            i53.c cVarE3 = i53.a.e(arrayList3);
            d92.b bVar4 = d92.b.f58623a;
            bVar4.getClass();
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f19 = eVar3.f97917b;
            gl.c.f77766a.getClass();
            i53.c cVarJ = i53.a.j(x.k(d0Var, d0Var2, new d0(f18, dVar4, cVarE3, true, f19, o4.d0.a(gl.c.a(o0VarE).o()), null, false, null, 448, null)));
            o0VarE.g0(false);
            String strQ = gl1.y.Q(o0VarE, R.string.cycling_ability);
            g6.f.a aVar = g6.f.f75994b;
            r rVarThen = x2.h(x2.f(r.S, 1.0f), 275).then(rVar);
            bVar4.getClass();
            bVar5.getClass();
            r rVarA = c2.l.A(rVarThen, eVar3.f97920e, 0.0f, 2);
            float size = arrayListC.size();
            if (cVarJ == null) {
                cVarJ = j53.l.b();
            }
            n92.j jVar = new n92.j(new d02.c(), Float.valueOf(0.0f), Float.valueOf(100.0f), 0, 8, null);
            s0 s0Var2 = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            d92.b.f58624b.getClass();
            n92.a aVar2 = new n92.a(jVar, null, new n92.g(sn.a.c(o0VarE), s0Var2, d92.c.f(j92.f.f97935l, o0VarE), null, 8, null), dVar, 2, null);
            String strQ2 = gl1.y.Q(o0VarE, R.string.common_no_data);
            Float fValueOf = Float.valueOf(size);
            d70.a.f58080a.getClass();
            c0.b(rVarA, strQ, cVarJ, fValueOf, strQ2, null, aVar2, d70.a.f58081b, z3.f.c(-1096041625, new aa2.f(24, bVar, gVar), o0VarE), o0VarE, 113246720, 32);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, bVar, gVar, dateTime, dateTime2, i14);
        }
    }
}
