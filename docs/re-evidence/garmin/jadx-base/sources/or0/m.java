package or0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;
import r53.b2;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lor0/m;", "Landroidx/lifecycle/u1;", "Ljr0/a;", "intensityMinutesRepository", "Lal0/k;", "goalsRepository", "<init>", "(Ljr0/a;Lal0/k;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr0.a f133362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al0.k f133363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f133364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f133365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.o f133366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f133367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f133368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f133369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f133370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f133371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a f133372k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133373a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f133373a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lir0/e;", "<anonymous>", "(Lo82/a;)Lir0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsViewModel$dailyReportsDataState$1", f = "IntensityMinutesReportsViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o82.a, t13.d<? super ir0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f133374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f133375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f133376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f133377d;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = m.this.new c(dVar);
            cVar.f133377d = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ir0.e> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f133377d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133376c;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                jr0.a aVar3 = mVar.f133362a;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f133377d = null;
                this.f133374a = dateTimeAtStartOfDay2;
                this.f133375b = dateTimeAtStartOfDay;
                this.f133376c = 1;
                Object objC = aVar3.c(dateTimeAtStartOfDay2, dateTimeAtStartOfDay, this);
                if (objC == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objC;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f133375b;
                dateTime = this.f133374a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching daily summary intensity minutes data.");
                return null;
            }
            List list = (List) ((v2.b) v2Var).f47386a;
            m.y4(mVar, list);
            dateTime.getClass();
            dateTimeAtStartOfDay.getClass();
            return p.d(list, dateTime, dateTimeAtStartOfDay, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lir0/a;", "<anonymous>", "(Lo82/a;)Lir0/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsViewModel$detailsDataState$1", f = "IntensityMinutesReportsViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super ir0.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f133379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f133380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f133381c;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = m.this.new d(dVar);
            dVar2.f133381c = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ir0.a> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            Object value;
            o82.a aVar = (o82.a) this.f133381c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133380b;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                jr0.a aVar3 = mVar.f133362a;
                dateTimeAtStartOfDay.getClass();
                this.f133381c = null;
                this.f133379a = dateTimeAtStartOfDay;
                this.f133380b = 1;
                obj = aVar3.a(dateTimeAtStartOfDay, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f133379a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching daily intensity minutes data.");
                return null;
            }
            if (g22.k.i(dateTimeAtStartOfDay, DateTime.now())) {
                int i15 = ((ir0.a) ((v2.b) v2Var).f47386a).f94770g;
                p2 p2Var = mVar.f133367f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, q.a((q) value, false, false, null, null, i15, null, 47)));
            }
            return (ir0.a) ((v2.b) v2Var).f47386a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lir0/e;", "<anonymous>", "(Lo82/a;)Lir0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsViewModel$hourlyReportsDataState$1", f = "IntensityMinutesReportsViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super ir0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f133383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f133384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f133385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f133386d;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = m.this.new e(dVar);
            eVar.f133386d = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ir0.e> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f133386d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133385c;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                jr0.a aVar3 = mVar.f133362a;
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                int iA = g22.k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2) + 1;
                this.f133386d = null;
                this.f133383a = dateTimeAtStartOfDay2;
                this.f133384b = dateTimeAtStartOfDay;
                this.f133385c = 1;
                Object objD = aVar3.d(dateTimeAtStartOfDay, iA, this);
                if (objD == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objD;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f133384b;
                dateTime = this.f133383a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching hourly summary intensity minutes data.");
                return null;
            }
            List list = (List) ((v2.b) v2Var).f47386a;
            m.y4(mVar, list);
            dateTime.getClass();
            dateTimeAtStartOfDay.getClass();
            return p.d(list, dateTime, dateTimeAtStartOfDay, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lir0/e;", "<anonymous>", "(Lo82/a;)Lir0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsViewModel$weeklyReportsDataState$1", f = "IntensityMinutesReportsViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o82.a, t13.d<? super ir0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f133388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f133389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f133390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f133391d;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = m.this.new f(dVar);
            fVar.f133391d = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ir0.e> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f133391d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133390c;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                jr0.a aVar3 = mVar.f133362a;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f133391d = null;
                this.f133388a = dateTimeAtStartOfDay2;
                this.f133389b = dateTimeAtStartOfDay;
                this.f133390c = 1;
                Object objB = aVar3.b(dateTimeAtStartOfDay2, dateTimeAtStartOfDay, this);
                if (objB == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objB;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f133389b;
                dateTime = this.f133388a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching weekly summary intensity minutes data.");
                return null;
            }
            List list = (List) ((v2.b) v2Var).f47386a;
            m.y4(mVar, list);
            dateTime.getClass();
            dateTimeAtStartOfDay.getClass();
            return p.d(list, dateTime, dateTimeAtStartOfDay, 7);
        }
    }

    static {
        new a(null);
    }

    public m(jr0.a aVar, al0.k kVar) {
        aVar.getClass();
        kVar.getClass();
        this.f133362a = aVar;
        this.f133363b = kVar;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        this.f133364c = g22.k.z(dateTimeNow).b();
        this.f133365d = g22.k.z(g22.k.o(1, dateTimeNow)).b();
        this.f133366e = g22.k.z(g22.k.b(1, dateTimeNow)).b();
        p2 p2VarA = r53.q2.a(new q(false, false, null, null, 0, null, 63, null));
        this.f133367f = p2VarA;
        this.f133368g = s.d(p2VarA);
        this.f133369h = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f133370i = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
        this.f133371j = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f133372k = new u82.a(v1.a(this), new y82.e(new y82.c(new f(null)), null, 2, null), false, 4, null);
    }

    public static final void x4(m mVar, boolean z14) {
        p2 p2Var = mVar.f133367f;
        while (true) {
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, q.a((q) value, z15, false, null, null, 0, null, 62))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public static final void y4(m mVar, List list) {
        Object value;
        mVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        DateTime dateTimeNow = DateTime.now();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LocalDate localDateB = ((ir0.f) obj).b();
            if (g22.k.i(dateTimeNow, localDateB != null ? localDateB.toDateTimeAtStartOfDay() : null)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numD = ((ir0.f) it.next()).d();
            iIntValue += numD != null ? numD.intValue() : 0;
        }
        Iterator it3 = arrayList.iterator();
        int iIntValue2 = 0;
        while (it3.hasNext()) {
            Integer numG = ((ir0.f) it3.next()).g();
            iIntValue2 += numG != null ? numG.intValue() : 0;
        }
        p2 p2Var = mVar.f133367f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, false, false, null, null, 0, new ir0.d(iIntValue, iIntValue2, 0, 4, null), 31)));
    }

    public final void z4(u82.d<o82.a, ?> dVar) {
        Set<o82.a> setB = dVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB) {
            o82.a aVar = (o82.a) obj;
            if (aVar.f130843a.compareTo(this.f133366e) <= 0 && aVar.f130844b.compareTo(this.f133365d) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dVar.a((o82.a) it.next());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lor0/m$a;", "", "<init>", "()V", "", "DAYS_DELTA_DAILY", "I", "DAYS_DELTA_WEEKLY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
