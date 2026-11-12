package jf1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o70.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.y;
import p3.c2;
import p3.p0;
import r1.q2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljf1/b;", "Landroidx/lifecycle/u1;", "Lff1/a;", "runningToleranceRepository", "<init>", "(Lff1/a;)V", "a", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff1.a f98698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f98699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f98700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u82.a f98701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u82.a f98702e;

    /* JADX INFO: renamed from: jf1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "<unused var>", "Lef1/a;", "<anonymous>", "(Lo82/a;)Lef1/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsViewModel$currentReportsDataState$1", f = "RunningToleranceReportsViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
    public static final class C1896b extends i implements p<o82.a, t13.d<? super ef1.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98703a;

        public C1896b(t13.d<? super C1896b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C1896b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ef1.a> dVar) {
            return ((C1896b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Double acuteDistance;
            Double acuteImpactLoad;
            Double acuteTolerance;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98703a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = b.this;
                o oVar = bVar.f98699b;
                this.f98703a = 1;
                obj = bVar.f98698a.c(oVar, oVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching running tolerance current data");
                return null;
            }
            ef1.b bVar2 = (ef1.b) ((List) ((v2.b) v2Var).f47386a).get(0);
            return new ef1.a(bVar2 != null ? bVar2.getCalendarDate() : null, (bVar2 == null || (acuteImpactLoad = bVar2.getAcuteImpactLoad()) == null) ? null : Integer.valueOf((int) acuteImpactLoad.doubleValue()), (bVar2 == null || (acuteDistance = bVar2.getAcuteDistance()) == null) ? null : Integer.valueOf((int) acuteDistance.doubleValue()), (bVar2 == null || (acuteTolerance = bVar2.getAcuteTolerance()) == null) ? null : Integer.valueOf((int) acuteTolerance.doubleValue()), bVar2 != null ? bVar2.getRunningToleranceFeedBackPhrase() : null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lif1/c;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsViewModel$weeklyReportsDataState$1", f = "RunningToleranceReportsViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<o82.a, t13.d<? super List<? extends if1.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98706b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((if1.c) t7).f93211b, ((if1.c) t14).f93211b);
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = b.this.new c(dVar);
            cVar.f98706b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends if1.c>> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objB;
            int iB;
            Double totalImpactLoad;
            Double tolerance;
            Double tolerance2;
            Double totalDistance;
            Double totalImpactLoad2;
            o82.a aVar = (o82.a) this.f98706b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98705a;
            Integer num = null;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130843a;
                o oVar2 = aVar.f130844b;
                this.f98706b = null;
                this.f98705a = 1;
                objB = b.this.f98698a.b(oVar, oVar2, this);
                if (objB == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objB = obj;
            }
            v2 v2Var = (v2) objB;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching running tolerance weekly data");
                return null;
            }
            Iterable<ef1.d> iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            for (ef1.d dVar : iterable) {
                boolean z14 = ef1.e.f63968a;
                String startOfWeek = dVar != null ? dVar.getStartOfWeek() : num;
                String endOfWeek = dVar != null ? dVar.getEndOfWeek() : num;
                Integer weekIndex = dVar != null ? dVar.getWeekIndex() : num;
                Float fValueOf = Float.valueOf(ef1.e.a((dVar == null || (totalImpactLoad2 = dVar.getTotalImpactLoad()) == null) ? num : Integer.valueOf((int) totalImpactLoad2.doubleValue())));
                Float fValueOf2 = Float.valueOf(ef1.e.a((dVar == null || (totalDistance = dVar.getTotalDistance()) == null) ? num : Integer.valueOf((int) totalDistance.doubleValue())));
                Integer numValueOf = (dVar == null || (tolerance2 = dVar.getTolerance()) == null) ? num : Integer.valueOf((int) tolerance2.doubleValue());
                if (numValueOf != null) {
                    m3 m3Var = ef1.e.f63968a ? m3.KILOMETER : m3.MILE;
                    l3.a aVar3 = l3.f23124b;
                    double dIntValue = numValueOf.intValue();
                    aVar3.getClass();
                    iB = MathKt.b(l3.a.j(dIntValue, m3Var));
                } else {
                    iB = 0;
                }
                Integer numValueOf2 = Integer.valueOf(iB);
                int iDoubleValue = (dVar == null || (tolerance = dVar.getTolerance()) == null) ? 0 : (int) tolerance.doubleValue();
                int iDoubleValue2 = (dVar == null || (totalImpactLoad = dVar.getTotalImpactLoad()) == null) ? 0 : (int) totalImpactLoad.doubleValue();
                arrayList.add(new if1.c(startOfWeek, endOfWeek, weekIndex, fValueOf, fValueOf2, numValueOf2, (iDoubleValue2 < iDoubleValue || iDoubleValue2 == 0 || iDoubleValue == 0) ? false : true));
                num = num;
            }
            return h0.N0(arrayList, new a());
        }
    }

    static {
        new a(null);
    }

    public b(ff1.a aVar) {
        aVar.getClass();
        this.f98698a = aVar;
        j jVar = null;
        this.f98699b = ((f) s.d(r53.q2.a(new f(false, null, null, 7, jVar))).f150540a.getValue()).f98718c;
        this.f98700c = p0.n(Boolean.FALSE);
        this.f98701d = new u82.a(v1.a(this), new y82.e(new y82.c(new C1896b(null)), null, 2, null), false, 4, jVar);
        this.f98702e = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        ge1.b.T(v1.a(this), null, null, new d(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(b bVar, v13.c cVar) {
        jf1.c cVar2;
        j70.c dailyStatsConfig;
        List<j70.b> listG;
        bVar.getClass();
        if (cVar instanceof jf1.c) {
            cVar2 = (jf1.c) cVar;
            int i14 = cVar2.f98710c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f98710c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new jf1.c(bVar, cVar);
            }
        } else {
            cVar2 = new jf1.c(bVar, cVar);
        }
        Object objY = cVar2.f98708a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f98710c;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objY);
            r53.i<j70.f> iVarP = ((l0) KoinJavaComponent.get$default(l0.class, null, null, 6, null)).p();
            cVar2.f98710c = 1;
            objY = s.y(iVarP, cVar2);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objY);
        }
        j70.f fVar = (j70.f) objY;
        if (fVar == null || (dailyStatsConfig = fVar.getDailyStatsConfig()) == null || (listG = dailyStatsConfig.g()) == null || listG.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((j70.b) it.next()).getCardType(), t.f130078w.f130082a)) {
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ljf1/b$a;", "", "<init>", "()V", "", "AGGREGATION_DAILY", "Ljava/lang/String;", "AGGREGATION_WEEKLY", "PREFERENCES_KEY", "PREFERENCES_KEY_VALUE", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
