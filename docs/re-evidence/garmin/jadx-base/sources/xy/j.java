package xy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.y;
import c2.z;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h5.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import o13.r;
import o4.m1;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
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
import xn.t;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.summary.DailyCaloriesReportsPageKt$DailyCaloriesReportsPage$1$1$1", f = "DailyCaloriesReportsPage.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f192628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f192629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ny.b f192630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sy.k f192631e;

        /* JADX INFO: renamed from: xy.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.summary.DailyCaloriesReportsPageKt$DailyCaloriesReportsPage$1$1$1$3", f = "DailyCaloriesReportsPage.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C3596a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ny.b f192632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sy.k f192633b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3596a(ny.b bVar, sy.k kVar, t13.d<? super C3596a> dVar) {
                super(2, dVar);
                this.f192632a = bVar;
                this.f192633b = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3596a(this.f192632a, this.f192633b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((C3596a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Double restingCaloriesAverage;
                Double activeCaloriesAverage;
                Double totalCaloriesAverage;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                ny.b bVar = this.f192632a;
                ny.b.C2462b aggregations = bVar != null ? bVar.getAggregations() : null;
                int iDoubleValue = (aggregations == null || (totalCaloriesAverage = aggregations.getTotalCaloriesAverage()) == null) ? 0 : (int) totalCaloriesAverage.doubleValue();
                int iDoubleValue2 = (aggregations == null || (activeCaloriesAverage = aggregations.getActiveCaloriesAverage()) == null) ? 0 : (int) activeCaloriesAverage.doubleValue();
                int iDoubleValue3 = (aggregations == null || (restingCaloriesAverage = aggregations.getRestingCaloriesAverage()) == null) ? 0 : (int) restingCaloriesAverage.doubleValue();
                sy.k kVar = this.f192633b;
                kVar.getClass();
                kVar.f161184e = new sy.b(iDoubleValue, iDoubleValue2, iDoubleValue3, false);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f192634a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f192635b;

            /* JADX INFO: renamed from: xy.j$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3597a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f192636a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f192637b;

                /* JADX INFO: renamed from: xy.j$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.calories.presentation.summary.DailyCaloriesReportsPageKt$DailyCaloriesReportsPage$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "DailyCaloriesReportsPage.kt", l = {50}, m = "emit", v = 2)
                public static final class C3598a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f192638a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f192639b;

                    public C3598a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f192638a = obj;
                        this.f192639b |= Integer.MIN_VALUE;
                        return C3597a.this.emit(null, this);
                    }
                }

                public C3597a(r53.j jVar, o82.a aVar) {
                    this.f192636a = jVar;
                    this.f192637b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3598a c3598a;
                    if (dVar instanceof C3598a) {
                        c3598a = (C3598a) dVar;
                        int i14 = c3598a.f192639b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3598a.f192639b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3598a = new C3598a(dVar);
                        }
                    } else {
                        c3598a = new C3598a(dVar);
                    }
                    Object obj2 = c3598a.f192638a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3598a.f192639b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f192637b)) {
                            c3598a.f192639b = 1;
                            if (this.f192636a.emit(obj, c3598a) == aVar) {
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
                this.f192634a = iVar;
                this.f192635b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f192634a.collect(new C3597a(jVar, this.f192635b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n82.f fVar, o82.a aVar, ny.b bVar, sy.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f192628b = fVar;
            this.f192629c = aVar;
            this.f192630d = bVar;
            this.f192631e = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f192628b, this.f192629c, this.f192630d, this.f192631e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192627a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f192628b, 24)), this.f192629c);
                C3596a c3596a = new C3596a(this.f192630d, this.f192631e, null);
                this.f192627a = 1;
                if (r53.s.k(bVar, c3596a, this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:62:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    public static final void a(TreeMap treeMap, e23.l lVar, m mVar, int i14) {
        ?? r14;
        ?? r15;
        String strG;
        LocalDate localDate;
        Integer totalCalories;
        o0 o0VarE = mVar.E(1874378091);
        int i15 = 4;
        int i16 = 32;
        int i17 = (o0VarE.r(treeMap) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i18 = 0;
        int i19 = 1;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            ArrayList<b> arrayList = new ArrayList();
            sy.a aVar = new sy.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            for (Map.Entry entry : treeMap.entrySet()) {
                o13.p pVar = new o13.p((String) entry.getKey(), ((ny.c) entry.getValue()).getValues());
                DateTime dateTimeQ = g22.k.q((String) pVar.f128594a, "yyyy-MM-dd", null);
                j0.f23099a.getClass();
                String strV = j0.v(dateTimeQ);
                String strN = dateTimeQ != null ? j0.n(dateTimeQ, 'L') : "";
                ny.c.b bVar = (ny.c.b) pVar.f128595b;
                if (bVar == null || (totalCalories = bVar.getTotalCalories()) == null) {
                    strG = aVar.f161153c;
                } else {
                    int iIntValue = totalCalories.intValue();
                    l3.f23124b.getClass();
                    strG = e5.g(l3.f23131i.format(Integer.valueOf(iIntValue)), StringUtils.SPACE, aVar.f161151a.getString(R.string.lbl_total));
                }
                arrayList.add(new b(strV, strN, strG, bVar, (dateTimeQ == null || (localDate = dateTimeQ.toLocalDate()) == null) ? null : g22.k.t(localDate)));
            }
            if (arrayList.isEmpty()) {
                r15 = 0;
                o0VarE.C(730250679);
                o0VarE.g0(false);
            } else {
                o0VarE.C(728415169);
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
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
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
                o0VarE.C(1244521927);
                for (b bVar4 : arrayList) {
                    String str = bVar4.f192603a;
                    String str2 = bVar4.f192604b;
                    z3.e eVarC = z3.f.c(-1511092519, new t(bVar4, i15), o0VarE);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, i19);
                    int i24 = ((i17 & 112) == i16 ? i19 : i18) | (o0VarE.r(bVar4) ? 1 : 0);
                    Object objQ = o0VarE.q();
                    if (i24 == 0) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new xr.a(i15, lVar, bVar4);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new xr.a(i15, lVar, bVar4);
                        o0VarE.K(objQ);
                    }
                    l72.l.d(str, str2, eVarC, rVarA, null, false, (e23.a) objQ, o0VarE, 384, 48);
                    i18 = i18;
                    i19 = i19;
                    i15 = 4;
                    i16 = 32;
                }
                ?? r16 = i18;
                e5.u(o0VarE, r16, i19, r16);
                r15 = r16;
            }
            x1 x1Var3 = n.f135158a;
            r14 = r15;
        } else {
            r14 = 0;
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
        o0 o0VarE = mVar.E(1799468014);
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
            u82.e.b(aVar, kVar.f161181b, null, false, z3.f.c(57715534, new wy.a(aVar3, aVar, fVar2, kVar, 1), o0VarE), o0VarE, (i16 & 14) | 24576, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wy.b(aVar, kVar, fVar, aVar2, i14, 1);
        }
    }
}
