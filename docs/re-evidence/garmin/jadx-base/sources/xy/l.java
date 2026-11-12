package xy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h5.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import o13.r;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.summary.WeeklyCaloriesReportsPageKt$WeeklyCaloriesReportsPage$1$1$1", f = "WeeklyCaloriesReportsPage.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f192642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f192643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sy.k f192644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ny.d f192645e;

        /* JADX INFO: renamed from: xy.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.summary.WeeklyCaloriesReportsPageKt$WeeklyCaloriesReportsPage$1$1$1$3", f = "WeeklyCaloriesReportsPage.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C3599a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sy.k f192646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ny.d f192647b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3599a(sy.k kVar, ny.d dVar, t13.d<? super C3599a> dVar2) {
                super(2, dVar2);
                this.f192646a = kVar;
                this.f192647b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3599a(this.f192646a, this.f192647b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((C3599a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Integer numB;
                Integer numA;
                Integer numC;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                ny.d dVar = this.f192647b;
                int iIntValue = (dVar == null || (numC = dVar.c()) == null) ? 0 : numC.intValue();
                int iIntValue2 = (dVar == null || (numA = dVar.a()) == null) ? 0 : numA.intValue();
                int iIntValue3 = (dVar == null || (numB = dVar.b()) == null) ? 0 : numB.intValue();
                sy.k kVar = this.f192646a;
                kVar.getClass();
                kVar.f161184e = new sy.b(iIntValue, iIntValue2, iIntValue3, false);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f192648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f192649b;

            /* JADX INFO: renamed from: xy.l$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3600a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f192650a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f192651b;

                /* JADX INFO: renamed from: xy.l$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.summary.WeeklyCaloriesReportsPageKt$WeeklyCaloriesReportsPage$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "WeeklyCaloriesReportsPage.kt", l = {50}, m = "emit", v = 2)
                public static final class C3601a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f192652a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f192653b;

                    public C3601a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f192652a = obj;
                        this.f192653b |= Integer.MIN_VALUE;
                        return C3600a.this.emit(null, this);
                    }
                }

                public C3600a(r53.j jVar, o82.a aVar) {
                    this.f192650a = jVar;
                    this.f192651b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3601a c3601a;
                    if (dVar instanceof C3601a) {
                        c3601a = (C3601a) dVar;
                        int i14 = c3601a.f192653b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3601a.f192653b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3601a = new C3601a(dVar);
                        }
                    } else {
                        c3601a = new C3601a(dVar);
                    }
                    Object obj2 = c3601a.f192652a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3601a.f192653b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f192651b)) {
                            c3601a.f192653b = 1;
                            if (this.f192650a.emit(obj, c3601a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar, o82.a aVar) {
                this.f192648a = iVar;
                this.f192649b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f192648a.collect(new C3600a(jVar, this.f192649b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n82.f fVar, o82.a aVar, sy.k kVar, ny.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f192642b = fVar;
            this.f192643c = aVar;
            this.f192644d = kVar;
            this.f192645e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f192642b, this.f192643c, this.f192644d, this.f192645e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192641a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f192642b, 25)), this.f192643c);
                C3599a c3599a = new C3599a(this.f192644d, this.f192645e, null);
                this.f192641a = 1;
                if (r53.s.k(bVar, c3599a, this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:67:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean] */
    public static final void a(TreeMap treeMap, e23.l lVar, m mVar, int i14) {
        ?? r14;
        ?? r15;
        LocalDate localDate;
        Integer averageDailyTotalCalories;
        o0 o0VarE = mVar.E(1414550269);
        int i15 = (o0VarE.r(treeMap) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i16 = 0;
        int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            ArrayList<d> arrayList = new ArrayList();
            sy.a aVar = new sy.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            for (Map.Entry entry : treeMap.entrySet()) {
                o13.p pVar = new o13.p((String) entry.getKey(), ((ny.e) entry.getValue()).getValues());
                DateTime dateTimeQ = g22.k.q((String) pVar.f128594a, "yyyy-MM-dd", null);
                DateTime dateTimePlusDays = dateTimeQ != null ? dateTimeQ.plusDays(6) : null;
                String str = aVar.f161153c;
                String strL = (dateTimeQ == null || dateTimePlusDays == null) ? str : aVar.f161152b.l(dateTimeQ, dateTimePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                ny.e.b bVar = (ny.e.b) pVar.f128595b;
                if (bVar != null && (averageDailyTotalCalories = bVar.getAverageDailyTotalCalories()) != null) {
                    int iIntValue = averageDailyTotalCalories.intValue();
                    l3.f23124b.getClass();
                    String str2 = l3.f23131i.format(Integer.valueOf(iIntValue));
                    if (str2 != null) {
                        str = str2;
                    }
                }
                arrayList.add(new d(strL, str, (dateTimeQ == null || (localDate = dateTimeQ.toLocalDate()) == null) ? null : g22.k.t(localDate)));
            }
            if (arrayList.isEmpty()) {
                r15 = 1;
                o0VarE.C(-1350704379);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1351550059);
                String strQ = y.Q(o0VarE, R.string.common_lbl_avg_daily);
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                bVar2.getClass();
                float f16 = eVar.f97918c;
                bVar2.getClass();
                bVar2.getClass();
                h4.r rVarB = c2.l.B(rVarE, f14, f16, f15, f15);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarE.C(-1229438269);
                for (d dVar : arrayList) {
                    String str3 = dVar.f192614a;
                    String str4 = dVar.f192615b;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, i17);
                    int i18 = ((i15 & 112) == 32 ? i17 : i16) | (o0VarE.r(dVar) ? 1 : 0);
                    Object objQ = o0VarE.q();
                    if (i18 == 0) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new xr.a(5, lVar, dVar);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new xr.a(5, lVar, dVar);
                        o0VarE.K(objQ);
                    }
                    int i19 = i16;
                    String str5 = strQ;
                    l72.l.e(str3, null, str4, str5, null, null, rVarA, null, false, (e23.a) objQ, o0VarE, 0, 434);
                    i17 = i17;
                    strQ = str5;
                    i16 = i19;
                    i15 = i15;
                }
                ?? r16 = i16;
                ?? r17 = i17;
                e5.u(o0VarE, r16, r17, r16);
                r15 = r17;
            }
            x1 x1Var3 = n.f135158a;
            r14 = r15;
        } else {
            r14 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(treeMap, lVar, i14, r14);
        }
    }

    public static final void b(o82.a aVar, sy.k kVar, n82.f fVar, sy.a aVar2, m mVar, int i14) {
        int i15;
        n82.f fVar2;
        sy.a aVar3;
        aVar.getClass();
        kVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1245824442);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            fVar2 = fVar;
            i15 |= o0VarE.B(fVar2) ? 256 : 128;
        } else {
            fVar2 = fVar;
        }
        if ((i14 & 3072) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 2048 : 1024;
        } else {
            aVar3 = aVar2;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            u82.e.b(aVar, kVar.f161182c, null, false, z3.f.c(-32712282, new wy.a(aVar3, aVar, fVar2, kVar, 2), o0VarE), o0VarE, (i16 & 14) | 24576, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wy.b(aVar, kVar, fVar, aVar2, i14, 2);
        }
    }
}
