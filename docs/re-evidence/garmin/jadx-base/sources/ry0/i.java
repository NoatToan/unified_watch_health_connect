package ry0;

import am.w0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e11.t;
import e2.i0;
import e23.p;
import h5.e0;
import i3.mh;
import i3.ve;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mg2.o;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r53.c2;
import rk0.a1;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListKt$MultiDayActivitiesList$2$1$1", f = "MultiDayActivitiesList.kt", l = {173}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f155084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f155085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f155086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f155087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x3<i53.c<ry0.c>> f155088f;

        /* JADX INFO: renamed from: ry0.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2937a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i0 f155089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f155090b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x3<Boolean> f155091c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x3<Boolean> f155092d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x3<i53.c<ry0.c>> f155093e;

            /* JADX WARN: Multi-variable type inference failed */
            public C2937a(i0 i0Var, j jVar, x3<Boolean> x3Var, x3<Boolean> x3Var2, x3<? extends i53.c<ry0.c>> x3Var3) {
                this.f155089a = i0Var;
                this.f155090b = jVar;
                this.f155091c = x3Var;
                this.f155092d = x3Var2;
                this.f155093e = x3Var3;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Integer num = (Integer) obj;
                if (num != null) {
                    if (num.intValue() == this.f155089a.j().getF62554n() - 1 && this.f155091c.getF182175a().booleanValue() && !this.f155092d.getF182175a().booleanValue() && !this.f155093e.getF182175a().isEmpty()) {
                        Object objY4 = this.f155090b.y4(dVar);
                        return objY4 == u13.a.COROUTINE_SUSPENDED ? objY4 : Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i0 i0Var, j jVar, x3<Boolean> x3Var, x3<Boolean> x3Var2, x3<? extends i53.c<ry0.c>> x3Var3, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155084b = i0Var;
            this.f155085c = jVar;
            this.f155086d = x3Var;
            this.f155087e = x3Var2;
            this.f155088f = x3Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f155084b, this.f155085c, this.f155086d, this.f155087e, this.f155088f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155083a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new ct1.c(this.f155084b, 12));
                C2937a c2937a = new C2937a(this.f155084b, this.f155085c, this.f155086d, this.f155087e, this.f155088f);
                this.f155083a = 1;
                if (c2VarS.collect(c2937a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListKt$MultiDayActivitiesList$2$2$1$1", f = "MultiDayActivitiesList.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ly0.r f155095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f155096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ly0.r rVar, j jVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f155095b = rVar;
            this.f155096c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f155095b, this.f155096c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155094a;
            if (i14 == 0) {
                r.b(obj);
                this.f155095b.f115382a.clear();
                this.f155094a = 1;
                if (this.f155096c.x4(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListKt$MultiDayActivitiesList$2$activityDetailLauncher$1$1$1", f = "MultiDayActivitiesList.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ly0.r f155098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f155099c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ly0.r rVar, j jVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f155098b = rVar;
            this.f155099c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f155098b, this.f155099c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155097a;
            if (i14 == 0) {
                r.b(obj);
                this.f155098b.f115382a.clear();
                this.f155097a = 1;
                if (this.f155099c.x4(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            long millis = DateTime.now().getMillis();
            DateTime dateTimeG = ((ry0.c) t7).f155064a.g();
            Integer numValueOf = Integer.valueOf((int) new Duration(millis, dateTimeG != null ? dateTimeG.getMillis() : 0L).getStandardDays());
            long millis2 = DateTime.now().getMillis();
            DateTime dateTimeG2 = ((ry0.c) t14).f155064a.g();
            return r13.a.b(numValueOf, Integer.valueOf((int) new Duration(millis2, dateTimeG2 != null ? dateTimeG2.getMillis() : 0L).getStandardDays()));
        }
    }

    public static final void a(j jVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        b0 b0Var;
        Object obj;
        p1 p1Var;
        p1 p1Var2;
        LocalDate localDate;
        jVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1026493214);
        int i15 = i14 | (o0VarE.r(jVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var2 = (b0) objQ;
            p1 p1VarC = s9.c.c(jVar.f155111l, o0VarE);
            p1 p1VarC2 = s9.c.c(jVar.f155115p, o0VarE);
            p1 p1VarC3 = s9.c.c(jVar.f155113n, o0VarE);
            p1 p1VarC4 = s9.c.c(jVar.f155117r, o0VarE);
            p1 p1VarC5 = s9.c.c(jVar.f155119v, o0VarE);
            p1 p1VarC6 = s9.c.c(jVar.f155121x, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ly0.r();
                o0VarE.K(objQ2);
            }
            ly0.r rVar = (ly0.r) objQ2;
            boolean zB = o0VarE.B((i53.c) p1VarC.getF182175a());
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                i53.c cVar = (i53.c) p1VarC.getF182175a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : cVar) {
                    DateTime dateTimeG = ((ry0.c) obj2).f155064a.g();
                    b0 b0Var3 = b0Var2;
                    if (dateTimeG != null && dateTimeG.compareTo((ReadableInstant) DateTime.now()) > 0) {
                        arrayList.add(obj2);
                    }
                    b0Var2 = b0Var3;
                }
                b0Var = b0Var2;
                List<ry0.c> listN0 = h0.N0(arrayList, new d());
                ArrayList arrayList2 = new ArrayList(y.r(listN0, 10));
                for (ry0.c cVar2 : listN0) {
                    arrayList2.add(ry0.c.a(cVar2, ry0.b.a(cVar2, context, rVar)));
                }
                o0VarE.K(arrayList2);
                obj = arrayList2;
            } else {
                b0Var = b0Var2;
                obj = objQ3;
            }
            List list = (List) obj;
            boolean zB2 = o0VarE.B((i53.c) p1VarC.getF182175a());
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == p3.m.a.f135155b) {
                i53.c cVar3 = (i53.c) p1VarC.getF182175a();
                ArrayList<ry0.c> arrayList3 = new ArrayList();
                Iterator it = cVar3.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    ry0.c cVar4 = (ry0.c) next;
                    Iterator it3 = it;
                    DateTime dateTimeG2 = cVar4.f155064a.g();
                    DateTime dateTimeB = cVar4.f155064a.b();
                    if (dateTimeB == null || (localDate = dateTimeB.toLocalDate()) == null) {
                        p1Var2 = p1VarC;
                    } else {
                        p1Var2 = p1VarC;
                        LocalDate localDatePlusDays = localDate.plusDays(1);
                        DateTime dateTimeAtStartOfDay = localDatePlusDays != null ? localDatePlusDays.toDateTimeAtStartOfDay() : null;
                        if (dateTimeG2 == null && dateTimeAtStartOfDay != null) {
                            DateTime dateTimeNow = DateTime.now();
                            dateTimeNow.getClass();
                            if (dateTimeNow.compareTo(dateTimeG2) >= 0 && dateTimeNow.compareTo(dateTimeAtStartOfDay) <= 0) {
                                arrayList3.add(next);
                            }
                        }
                        it = it3;
                        p1VarC = p1Var2;
                    }
                    if (dateTimeG2 == null) {
                    }
                    it = it3;
                    p1VarC = p1Var2;
                }
                p1Var = p1VarC;
                ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                for (ry0.c cVar5 : arrayList3) {
                    arrayList4.add(ry0.c.a(cVar5, ry0.b.a(cVar5, context, rVar)));
                }
                o0VarE.K(arrayList4);
                objQ4 = arrayList4;
            } else {
                p1Var = p1VarC;
            }
            List list2 = (List) objQ4;
            boolean zB3 = o0VarE.B((i53.c) p1Var.getF182175a());
            Object objQ5 = o0VarE.q();
            if (zB3 || objQ5 == p3.m.a.f135155b) {
                i53.c cVar6 = (i53.c) p1Var.getF182175a();
                ArrayList<ry0.c> arrayList5 = new ArrayList();
                Iterator it4 = cVar6.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    DateTime dateTimeB2 = ((ry0.c) next2).f155064a.b();
                    Iterator it5 = it4;
                    if (dateTimeB2 != null && dateTimeB2.compareTo((ReadableInstant) DateTime.now()) < 0) {
                        arrayList5.add(next2);
                    }
                    it4 = it5;
                }
                ArrayList arrayList6 = new ArrayList(y.r(arrayList5, 10));
                for (ry0.c cVar7 : arrayList5) {
                    arrayList6.add(ry0.c.a(cVar7, ry0.b.a(cVar7, context, rVar)));
                }
                o0VarE.K(arrayList6);
                objQ5 = arrayList6;
            }
            o0 o0Var2 = o0VarE;
            z02.d.a(false, z3.f.c(-2115680515, new lp1.j(aVar, context, 1), o0VarE), null, null, null, z3.f.c(434465657, new t(p1VarC6, p1VarC5, p1Var, jVar, b0Var, p1VarC4, rVar, p1VarC2, list2, p1VarC3, context, list, (List) objQ5, 3), o0Var2), o0Var2, 196656, 29);
            x1 x1Var2 = n.f135158a;
            o0Var = o0Var2;
        } else {
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(jVar, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    public static final void b(ry0.c cVar, w0 w0Var, m mVar, e23.l<? super String, Unit> lVar, p3.m mVar2, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar2.E(1946278470);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(w0Var) : o0VarE.r(w0Var) ? 32 : 16;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            l22.a aVar = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            u00.a aVar2 = new u00.a(aVar);
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarF = x2.f(c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97917b, 1), 1.0f);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new rk0.f(14, cVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.f(14, cVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            ve.a(w.d(rVarF, false, null, null, (e23.a) objQ, 15), null, v.h.t(o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(1461272161, new ob0.e(cVar, mVar, w0Var, aVar, aVar2, 24), o0VarE), o0Var, 12582912, 122);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(cVar, w0Var, mVar, lVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(List<ry0.c> list, List<o13.p<String, w0>> list2, m mVar, e23.l<? super String, Unit> lVar, p3.m mVar2, int i14) {
        o0 o0Var;
        w0 w0Var;
        Object next;
        A a14;
        cy0.r uuid;
        o0 o0VarE = mVar2.E(1739681781);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(list2) ? 32 : 16) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar, f14, eVar.f97920e, f15, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strT = gl1.d.T(mVar.a(), o0VarE, 0);
            d92.b.f58624b.getClass();
            mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE.g0(true);
            for (ry0.c cVar : list) {
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            a14 = ((o13.p) next).f128594a;
                            uuid = cVar.f155064a.getUuid();
                        }
                    } while (!s.g(a14, uuid != null ? uuid.getUuid() : null));
                    o13.p pVar = (o13.p) next;
                    if (pVar != null) {
                        w0Var = (w0) pVar.f128595b;
                    } else {
                        w0Var = null;
                    }
                } else {
                    w0Var = null;
                }
                b(cVar, w0Var, mVar, lVar, o0VarE, (w0.f4256d << 3) | 384 | (i15 & 7168));
            }
            o0Var = o0VarE;
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(list, list2, mVar, lVar, i14, 19);
        }
    }

    public static final void d(w0 w0Var, i53.c<ry0.c> cVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1753394094);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(w0Var) : o0VarE.r(w0Var) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            l22.a aVar = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            u00.a aVar2 = new u00.a(aVar);
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            ve.a(x2.f(c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97917b, 1), 1.0f), null, ds.e0.f(o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(624663959, new qy0.d(w0Var, aVar, cVar, aVar2, 20), o0VarE), o0Var, 12582912, 122);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(w0Var, cVar, i14, 26);
        }
    }
}
