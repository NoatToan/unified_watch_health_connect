package qr1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g22.l;
import gs1.t;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.j0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r53.b2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import tf0.i;
import vb.h;
import zd0.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lqr1/d;", "Landroidx/lifecycle/u1;", "Lis1/e;", "timelineRepository", "Llr1/b;", "stressRepository", "Lwr1/a;", "tooltipAvailability", "Lzd0/h;", "getAutorotateEnabledUseCase", "<init>", "(Lis1/e;Llr1/b;Lwr1/a;Lzd0/h;)V", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f146904j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is1.e f146905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr1.b f146906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wr1.a f146907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u82.a f146908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u82.a f146909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u82.a f146910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f146911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f146912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f146913i;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.StressDetailsViewModel$1", f = "StressReportsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f146914a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f146914a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z14 = this.f146914a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = d.this.f146911g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, false, false, false, 0, z14, 127)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lkr1/a;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.StressDetailsViewModel$dailyReportsDataState$1", f = "StressReportsViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super List<? extends kr1.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f146917b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = d.this.new c(dVar);
            cVar.f146917b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends kr1.a>> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f146917b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146916a;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                lr1.b bVar = d.this.f146906b;
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                this.f146917b = null;
                this.f146916a = 1;
                obj = bVar.b(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (List) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    /* JADX INFO: renamed from: qr1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lgs1/t;", "<anonymous>", "(Lo82/a;)Lgs1/t;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.StressDetailsViewModel$detailsDataState$1", f = "StressReportsViewModel.kt", l = {62}, m = "invokeSuspend", v = 2)
    public static final class C2763d extends v13.i implements p<o82.a, t13.d<? super t>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f146920b;

        /* JADX INFO: renamed from: qr1.d$d$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.StressDetailsViewModel$detailsDataState$1$deferredTimelineChartData$1", f = "StressReportsViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f146923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f146924c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, DateTime dateTime, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f146923b = dVar;
                this.f146924c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f146923b, this.f146924c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends t>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146922a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                is1.e eVar = this.f146923b.f146905a;
                DateTime dateTime = this.f146924c;
                dateTime.getClass();
                this.f146922a = 1;
                Object objA = eVar.a(dateTime, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public C2763d(t13.d<? super C2763d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C2763d c2763d = d.this.new C2763d(dVar);
            c2763d.f146920b = obj;
            return c2763d;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super t> dVar) {
            return ((C2763d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f146920b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146919a;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                d dVar = d.this;
                j0 j0VarJ = ge1.b.j(v1.a(dVar), null, null, new a(dVar, dateTimeAtStartOfDay, null), 3);
                this.f146920b = null;
                this.f146919a = 1;
                obj = j0VarJ.C(this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (t) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lkr1/c;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.stress.presentation.StressDetailsViewModel$weeklyReportDataState$1", f = "StressReportsViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<o82.a, t13.d<? super List<? extends kr1.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f146926b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = d.this.new e(dVar);
            eVar.f146926b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends kr1.c>> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f146926b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146925a;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                lr1.b bVar = d.this.f146906b;
                dateTimeAtStartOfDay.getClass();
                this.f146926b = null;
                this.f146925a = 1;
                obj = bVar.a(dateTimeAtStartOfDay, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (List) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    static {
        new b(null);
        f146904j = 8;
    }

    public d(is1.e eVar, lr1.b bVar, wr1.a aVar, zd0.h hVar) {
        eVar.getClass();
        bVar.getClass();
        aVar.getClass();
        hVar.getClass();
        this.f146905a = eVar;
        this.f146906b = bVar;
        this.f146907c = aVar;
        j jVar = null;
        this.f146908d = new u82.a(v1.a(this), new y82.e(new y82.c(new C2763d(null)), null, 2, null), false, 4, jVar);
        this.f146909e = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f146910f = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, jVar);
        p2 p2VarA = q2.a(new qr1.c(null, null, false, false, false, false, 0, false, 255, null));
        this.f146911g = p2VarA;
        this.f146912h = s.d(p2VarA);
        this.f146913i = new i(v1.a(this), null, 2, null);
        z4();
        s.C(new m1(s.f(new g(hVar, null)), new a(null)), v1.a(this));
    }

    public final void x4(int i14) {
        while (true) {
            p2 p2Var = this.f146911g;
            Object value = p2Var.getValue();
            int i15 = i14;
            if (p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, false, false, false, i15, false, 191))) {
                return;
            } else {
                i14 = i15;
            }
        }
    }

    public final void y4(boolean z14) {
        while (true) {
            p2 p2Var = this.f146911g;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, false, false, z15, 0, false, 223))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void z4() {
        boolean zD;
        Object value;
        p2 p2Var = this.f146911g;
        boolean z14 = ((qr1.c) p2Var.getValue()).f146898c;
        wr1.a aVar = this.f146907c;
        if (z14) {
            aVar.getClass();
            zD = wr1.a.f186797c.a();
        } else {
            aVar.getClass();
            zD = wr1.a.f186797c.d();
        }
        boolean z15 = zD;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, false, z15, false, 0, false, 239)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqr1/d$b;", "", "<init>", "()V", "", "NO_STRESS_DATA", "I", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
