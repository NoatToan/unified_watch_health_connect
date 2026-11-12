package ky0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.joda.time.DateTime;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lky0/w0;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "applicationContext", "", "epicUUID", "Lfy0/a;", "multiDayActivitiesDelegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lfy0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 extends androidx.lifecycle.u1 implements KoinComponent {
    public final Object A;
    public final r53.b2 A1;
    public final Object B;
    public final r53.b2 B1;
    public final Object C;
    public final p2 C1;
    public final Object D;
    public final r53.b2 D1;
    public final Object E;
    public final AtomicBoolean E1;
    public final Object F;
    public final r53.b2 H0;
    public final Object I;
    public final p2 I0;
    public final r53.b2 J0;
    public final p2 K0;
    public final r53.b2 L0;
    public final p2 M0;
    public final r53.b2 N0;
    public final p2 O0;
    public final Object P;
    public final r53.b2 P0;
    public final p2 Q0;
    public final r53.b2 R0;
    public final p2 S0;
    public final Object T;
    public final r53.b2 T0;
    public final p2 U0;
    public final r53.b2 V0;
    public final p2 W0;
    public final Object X;
    public final r53.b2 X0;
    public final Object Y;
    public final p2 Y0;
    public final Object Z;
    public final r53.b2 Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f107577a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final p2 f107578a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107579b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final r53.b2 f107580b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fy0.a f107581c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final p2 f107582c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f107583d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final r53.b2 f107584d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f107585e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final p2 f107586e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f107587f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final r53.b2 f107588f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f107589g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final p2 f107590g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f107591h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final r53.b2 f107592h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f107593i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final p2 f107594i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f107595j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final r53.b2 f107596j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f107597k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p2 f107598k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final p2 f107599k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f107600l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final r53.b2 f107601l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f107602m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final p2 f107603m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f107604n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final r53.b2 f107605n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f107606o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final p2 f107607o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f107608p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final r53.b2 f107609p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f107610q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final p2 f107611q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f107612r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final r53.b2 f107613r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final p2 f107614s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f107615t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final r53.b2 f107616t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final AtomicInteger f107617u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f107618v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final long f107619v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f107620w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final u82.a f107621w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f107622x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final p2 f107623x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f107624y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final p2 f107625y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f107626z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final p2 f107627z1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {331, 332}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107628a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (r2.H4(r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107628a;
            w0 w0Var = w0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107628a = 1;
                if (w0Var.J4(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            this.f107628a = 2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a0 implements e23.a<gy0.n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107632c;

        public a0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107630a = scope;
            this.f107631b = qualifier;
            this.f107632c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.n0, java.lang.Object] */
        @Override // e23.a
        public final gy0.n0 invoke() {
            return this.f107630a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.n0.class), this.f107631b, this.f107632c);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lk30/n;", "courseSortFilterValue", "", "Lsy0/f;", "coursesListValue", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "epicCourseValue", "Lsy0/e;", "<anonymous>", "(Lk30/n;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/e;)Lsy0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$courseDetails$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.r<k30.n, List<? extends sy0.f>, com.garmin.android.apps.connectmobile.courses.model.e, t13.d<? super sy0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ k30.n f107633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f107634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f107635c;

        public b(t13.d<? super b> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(k30.n nVar, List<? extends sy0.f> list, com.garmin.android.apps.connectmobile.courses.model.e eVar, t13.d<? super sy0.e> dVar) {
            b bVar = new b(dVar);
            bVar.f107633a = nVar;
            bVar.f107634b = list;
            bVar.f107635c = eVar;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<sy0.f> listB;
            k30.n nVar = this.f107633a;
            List list = this.f107634b;
            com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f107635c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new sy0.e(eVar != null ? eVar.courseName : null, (list == null || (listB = ay0.b.b(ay0.b.a(list, nVar), nVar)) == null) ? null : i53.a.j(listB));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b0 implements e23.a<gy0.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107638c;

        public b0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107636a = scope;
            this.f107637b = qualifier;
            this.f107638c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.q, java.lang.Object] */
        @Override // e23.a
        public final gy0.q invoke() {
            return this.f107636a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.q.class), this.f107637b, this.f107638c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMoreActivityResources$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {591}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107639a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMoreActivityResources$1$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {599}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f107641a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f107642b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w0 f107643c;

            /* JADX INFO: renamed from: ky0.w0$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/c;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMoreActivityResources$1$1$results$2$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {595}, m = "invokeSuspend", v = 2)
            public static final class C2068a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.c>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f107644a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w0 f107645b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List<Long> f107646c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2068a(w0 w0Var, List<Long> list, t13.d<? super C2068a> dVar) {
                    super(2, dVar);
                    this.f107645b = w0Var;
                    this.f107646c = list;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2068a(this.f107645b, this.f107646c, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.c>> dVar) {
                    return ((C2068a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f107644a;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            o13.r.b(obj);
                            return obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    w0 w0Var = this.f107645b;
                    int iIncrementAndGet = w0Var.f107617u1.incrementAndGet();
                    this.f107644a = 1;
                    Object objC4 = w0Var.C4(this.f107646c, iIncrementAndGet, this);
                    return objC4 == aVar ? aVar : objC4;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/c;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMoreActivityResources$1$1$results$2$2", f = "MultiDayActivitiesDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.c>>, Object> {
                public b(t13.d<? super b> dVar) {
                    super(2, dVar);
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new b(dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.c>> dVar) {
                    return new b(dVar).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    o13.r.b(obj);
                    return p13.j0.f134944a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f107643c = w0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f107643c, dVar);
                aVar.f107642b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object next;
                o53.b0 b0Var = (o53.b0) this.f107642b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f107641a;
                w0 w0Var = this.f107643c;
                if (i14 == 0) {
                    o13.r.b(obj);
                    Iterable iterable = (Iterable) w0Var.Z0.f150540a.getValue();
                    ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        q6.f.s(((ly0.a) it.next()).f115281a.f29250b, arrayList);
                    }
                    o53.j0 j0VarJ = ((double) w0Var.f107617u1.get()) < Math.ceil(((double) arrayList.size()) / 20.0d) ? ge1.b.j(b0Var, null, null, new C2068a(w0Var, arrayList, null), 3) : ge1.b.j(b0Var, null, null, new b(null), 3);
                    this.f107642b = b0Var;
                    this.f107641a = 1;
                    obj = j0VarJ.C(this);
                    u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                List list = (List) obj;
                if (!list.isEmpty()) {
                    Iterable<ly0.a> iterable2 = (Iterable) w0Var.Z0.f150540a.getValue();
                    ArrayList arrayList2 = new ArrayList(p13.y.r(iterable2, 10));
                    for (ly0.a aVar3 : iterable2) {
                        Iterator it3 = list.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((cy0.c) next).getActivityId() != aVar3.f115281a.f29250b);
                        cy0.c cVar = (cy0.c) next;
                        if (cVar != null) {
                            aVar3 = new ly0.a(aVar3.f115281a, aVar3.f115282b, cVar);
                        }
                        arrayList2.add(aVar3);
                    }
                    i53.f fVarJ = i53.a.j(arrayList2);
                    p2 p2Var = w0Var.Y0;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, fVarJ));
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w0.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107639a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(w0.this, null);
                this.f107639a = 1;
                if (o53.c0.e(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c0 implements e23.a<gy0.a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107649c;

        public c0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107647a = scope;
            this.f107648b = qualifier;
            this.f107649c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.a2, java.lang.Object] */
        @Override // e23.a
        public final gy0.a2 invoke() {
            return this.f107647a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.a2.class), this.f107648b, this.f107649c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "interval", "Lsy0/n;", "<anonymous>", "(Lo82/a;)Lsy0/n;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$reportsDataCachedState$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {280, 281, 282, 283, 284, 285, 286, 287}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super sy0.n>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public mm1.b f107650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q71.d f107651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i53.c f107652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k61.b f107653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i53.c f107654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i53.c f107655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public gy0.k f107656g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f107657h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f107658i;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = w0.this.new d(dVar);
            dVar2.f107658i = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super sy0.n> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:24:0x011b  */
        /* JADX WARN: Code duplicated, block: B:28:0x0145  */
        /* JADX WARN: Code duplicated, block: B:32:0x0172  */
        /* JADX WARN: Code duplicated, block: B:36:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:40:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:44:0x020c  */
        /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            mm1.b bVar;
            Object objA;
            mm1.b bVar2;
            q71.d dVar2;
            Object objA2;
            mm1.b bVar3;
            q71.d dVar3;
            i53.c cVar;
            Object objA3;
            mm1.b bVar4;
            q71.d dVar4;
            i53.c cVar2;
            k61.b bVar5;
            Object objA4;
            mm1.b bVar6;
            q71.d dVar5;
            i53.c cVar3;
            k61.b bVar7;
            i53.c cVar4;
            Object objA5;
            i53.c cVar5;
            k61.b bVar8;
            i53.c cVar6;
            q71.d dVar6;
            i53.c cVar7;
            Object objB;
            i53.c cVar8;
            i53.c cVar9;
            k61.b bVar9;
            q71.d dVar7;
            mm1.b bVar10;
            i53.c cVar10;
            gy0.k kVar;
            Object objA6;
            gy0.k kVar2;
            i53.c cVar11;
            i53.c cVar12;
            k61.b bVar11;
            i53.c cVar13;
            q71.d dVar8;
            mm1.b bVar12;
            o82.a aVar = (o82.a) this.f107658i;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107657h;
            w0 w0Var = w0.this;
            switch (i14) {
                case 0:
                    o13.r.b(obj);
                    i2.f36769a.getClass();
                    i2.a.a(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "Epic Reports reportsDataCachedState - interval:" + aVar);
                    gy0.e1 e1Var = (gy0.e1) w0Var.f107604n.getValue();
                    String str = w0Var.f107579b;
                    b63.o oVarZ4 = w0Var.z4();
                    b63.o oVarY4 = w0Var.y4();
                    this.f107658i = aVar;
                    this.f107657h = 1;
                    dVar = this;
                    obj = e1Var.a(str, aVar, oVarZ4, oVarY4, dVar);
                    if (obj != aVar2) {
                        bVar = (mm1.b) obj;
                        gy0.d0 d0Var = (gy0.d0) w0Var.f107606o.getValue();
                        String str2 = w0Var.f107579b;
                        b63.o oVarZ5 = w0Var.z4();
                        b63.o oVarY5 = w0Var.y4();
                        dVar.f107658i = aVar;
                        dVar.f107650a = bVar;
                        dVar.f107657h = 2;
                        objA = d0Var.a(str2, aVar, oVarZ5, oVarY5, dVar);
                        if (objA != aVar2) {
                            bVar2 = bVar;
                            obj = objA;
                            dVar2 = (q71.d) obj;
                            gy0.q0 q0Var = (gy0.q0) w0Var.f107608p.getValue();
                            String str3 = w0Var.f107579b;
                            b63.o oVarZ6 = w0Var.z4();
                            b63.o oVarY6 = w0Var.y4();
                            dVar.f107658i = aVar;
                            dVar.f107650a = bVar2;
                            dVar.f107651b = dVar2;
                            dVar.f107657h = 3;
                            objA2 = q0Var.a(str3, aVar, oVarZ6, oVarY6, dVar);
                            if (objA2 != aVar2) {
                                bVar3 = bVar2;
                                dVar3 = dVar2;
                                obj = objA2;
                                cVar = (i53.c) obj;
                                gy0.y yVar = (gy0.y) w0Var.f107610q.getValue();
                                String str4 = w0Var.f107579b;
                                b63.o oVarZ7 = w0Var.z4();
                                b63.o oVarY7 = w0Var.y4();
                                dVar.f107658i = aVar;
                                dVar.f107650a = bVar3;
                                dVar.f107651b = dVar3;
                                dVar.f107652c = cVar;
                                dVar.f107657h = 4;
                                objA3 = yVar.a(str4, aVar, oVarZ7, oVarY7, dVar);
                                if (objA3 != aVar2) {
                                    bVar4 = bVar3;
                                    dVar4 = dVar3;
                                    cVar2 = cVar;
                                    obj = objA3;
                                    bVar5 = (k61.b) obj;
                                    gy0.h1 h1Var = (gy0.h1) w0Var.f107612r.getValue();
                                    String str5 = w0Var.f107579b;
                                    b63.o oVarZ8 = w0Var.z4();
                                    b63.o oVarY8 = w0Var.y4();
                                    dVar.f107658i = aVar;
                                    dVar.f107650a = bVar4;
                                    dVar.f107651b = dVar4;
                                    dVar.f107652c = cVar2;
                                    dVar.f107653d = bVar5;
                                    dVar.f107657h = 5;
                                    objA4 = h1Var.a(str5, aVar, oVarZ8, oVarY8, dVar);
                                    if (objA4 != aVar2) {
                                        bVar6 = bVar4;
                                        dVar5 = dVar4;
                                        cVar3 = cVar2;
                                        bVar7 = bVar5;
                                        obj = objA4;
                                        cVar4 = (i53.c) obj;
                                        gy0.j1 j1Var = (gy0.j1) w0Var.f107620w.getValue();
                                        String str6 = w0Var.f107579b;
                                        b63.o oVarZ9 = w0Var.z4();
                                        b63.o oVarY9 = w0Var.y4();
                                        dVar.f107658i = aVar;
                                        dVar.f107650a = bVar6;
                                        dVar.f107651b = dVar5;
                                        dVar.f107652c = cVar3;
                                        dVar.f107653d = bVar7;
                                        dVar.f107654e = cVar4;
                                        dVar.f107657h = 6;
                                        objA5 = j1Var.a(str6, aVar, oVarZ9, oVarY9, dVar);
                                        if (objA5 != aVar2) {
                                            cVar5 = cVar4;
                                            obj = objA5;
                                            bVar8 = bVar7;
                                            cVar6 = cVar3;
                                            dVar6 = dVar5;
                                            cVar7 = (i53.c) obj;
                                            gy0.g0 g0Var = (gy0.g0) w0Var.f107615t.getValue();
                                            String str7 = w0Var.f107579b;
                                            b63.o oVarZ10 = w0Var.z4();
                                            b63.o oVarY10 = w0Var.y4();
                                            dVar.f107658i = aVar;
                                            dVar.f107650a = bVar6;
                                            dVar.f107651b = dVar6;
                                            dVar.f107652c = cVar6;
                                            dVar.f107653d = bVar8;
                                            dVar.f107654e = cVar5;
                                            dVar.f107655f = cVar7;
                                            dVar.f107657h = 7;
                                            objB = g0Var.b(str7, oVarZ10, oVarY10, this);
                                            if (objB != aVar2) {
                                                cVar8 = cVar7;
                                                obj = objB;
                                                cVar9 = cVar5;
                                                bVar9 = bVar8;
                                                dVar7 = dVar6;
                                                bVar10 = bVar6;
                                                cVar10 = cVar6;
                                                kVar = (gy0.k) obj;
                                                gy0.b0 b0Var = (gy0.b0) w0Var.f107618v.getValue();
                                                String str8 = w0Var.f107579b;
                                                b63.o oVarZ11 = w0Var.z4();
                                                b63.o oVarY11 = w0Var.y4();
                                                dVar.f107658i = null;
                                                dVar.f107650a = bVar10;
                                                dVar.f107651b = dVar7;
                                                dVar.f107652c = cVar10;
                                                dVar.f107653d = bVar9;
                                                dVar.f107654e = cVar9;
                                                dVar.f107655f = cVar8;
                                                dVar.f107656g = kVar;
                                                dVar.f107657h = 8;
                                                objA6 = b0Var.a(str8, aVar, oVarZ11, oVarY11, dVar);
                                                if (objA6 != aVar2) {
                                                    kVar2 = kVar;
                                                    obj = objA6;
                                                    cVar11 = cVar8;
                                                    cVar12 = cVar9;
                                                    bVar11 = bVar9;
                                                    cVar13 = cVar10;
                                                    dVar8 = dVar7;
                                                    bVar12 = bVar10;
                                                    return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 1:
                    o13.r.b(obj);
                    dVar = this;
                    bVar = (mm1.b) obj;
                    gy0.d0 d0Var2 = (gy0.d0) w0Var.f107606o.getValue();
                    String str9 = w0Var.f107579b;
                    b63.o oVarZ12 = w0Var.z4();
                    b63.o oVarY12 = w0Var.y4();
                    dVar.f107658i = aVar;
                    dVar.f107650a = bVar;
                    dVar.f107657h = 2;
                    objA = d0Var2.a(str9, aVar, oVarZ12, oVarY12, dVar);
                    if (objA != aVar2) {
                        bVar2 = bVar;
                        obj = objA;
                        dVar2 = (q71.d) obj;
                        gy0.q0 q0Var2 = (gy0.q0) w0Var.f107608p.getValue();
                        String str10 = w0Var.f107579b;
                        b63.o oVarZ13 = w0Var.z4();
                        b63.o oVarY13 = w0Var.y4();
                        dVar.f107658i = aVar;
                        dVar.f107650a = bVar2;
                        dVar.f107651b = dVar2;
                        dVar.f107657h = 3;
                        objA2 = q0Var2.a(str10, aVar, oVarZ13, oVarY13, dVar);
                        if (objA2 != aVar2) {
                            bVar3 = bVar2;
                            dVar3 = dVar2;
                            obj = objA2;
                            cVar = (i53.c) obj;
                            gy0.y yVar2 = (gy0.y) w0Var.f107610q.getValue();
                            String str11 = w0Var.f107579b;
                            b63.o oVarZ14 = w0Var.z4();
                            b63.o oVarY14 = w0Var.y4();
                            dVar.f107658i = aVar;
                            dVar.f107650a = bVar3;
                            dVar.f107651b = dVar3;
                            dVar.f107652c = cVar;
                            dVar.f107657h = 4;
                            objA3 = yVar2.a(str11, aVar, oVarZ14, oVarY14, dVar);
                            if (objA3 != aVar2) {
                                bVar4 = bVar3;
                                dVar4 = dVar3;
                                cVar2 = cVar;
                                obj = objA3;
                                bVar5 = (k61.b) obj;
                                gy0.h1 h1Var2 = (gy0.h1) w0Var.f107612r.getValue();
                                String str12 = w0Var.f107579b;
                                b63.o oVarZ15 = w0Var.z4();
                                b63.o oVarY15 = w0Var.y4();
                                dVar.f107658i = aVar;
                                dVar.f107650a = bVar4;
                                dVar.f107651b = dVar4;
                                dVar.f107652c = cVar2;
                                dVar.f107653d = bVar5;
                                dVar.f107657h = 5;
                                objA4 = h1Var2.a(str12, aVar, oVarZ15, oVarY15, dVar);
                                if (objA4 != aVar2) {
                                    bVar6 = bVar4;
                                    dVar5 = dVar4;
                                    cVar3 = cVar2;
                                    bVar7 = bVar5;
                                    obj = objA4;
                                    cVar4 = (i53.c) obj;
                                    gy0.j1 j1Var2 = (gy0.j1) w0Var.f107620w.getValue();
                                    String str13 = w0Var.f107579b;
                                    b63.o oVarZ16 = w0Var.z4();
                                    b63.o oVarY16 = w0Var.y4();
                                    dVar.f107658i = aVar;
                                    dVar.f107650a = bVar6;
                                    dVar.f107651b = dVar5;
                                    dVar.f107652c = cVar3;
                                    dVar.f107653d = bVar7;
                                    dVar.f107654e = cVar4;
                                    dVar.f107657h = 6;
                                    objA5 = j1Var2.a(str13, aVar, oVarZ16, oVarY16, dVar);
                                    if (objA5 != aVar2) {
                                        cVar5 = cVar4;
                                        obj = objA5;
                                        bVar8 = bVar7;
                                        cVar6 = cVar3;
                                        dVar6 = dVar5;
                                        cVar7 = (i53.c) obj;
                                        gy0.g0 g0Var2 = (gy0.g0) w0Var.f107615t.getValue();
                                        String str14 = w0Var.f107579b;
                                        b63.o oVarZ17 = w0Var.z4();
                                        b63.o oVarY17 = w0Var.y4();
                                        dVar.f107658i = aVar;
                                        dVar.f107650a = bVar6;
                                        dVar.f107651b = dVar6;
                                        dVar.f107652c = cVar6;
                                        dVar.f107653d = bVar8;
                                        dVar.f107654e = cVar5;
                                        dVar.f107655f = cVar7;
                                        dVar.f107657h = 7;
                                        objB = g0Var2.b(str14, oVarZ17, oVarY17, this);
                                        if (objB != aVar2) {
                                            cVar8 = cVar7;
                                            obj = objB;
                                            cVar9 = cVar5;
                                            bVar9 = bVar8;
                                            dVar7 = dVar6;
                                            bVar10 = bVar6;
                                            cVar10 = cVar6;
                                            kVar = (gy0.k) obj;
                                            gy0.b0 b0Var2 = (gy0.b0) w0Var.f107618v.getValue();
                                            String str15 = w0Var.f107579b;
                                            b63.o oVarZ18 = w0Var.z4();
                                            b63.o oVarY18 = w0Var.y4();
                                            dVar.f107658i = null;
                                            dVar.f107650a = bVar10;
                                            dVar.f107651b = dVar7;
                                            dVar.f107652c = cVar10;
                                            dVar.f107653d = bVar9;
                                            dVar.f107654e = cVar9;
                                            dVar.f107655f = cVar8;
                                            dVar.f107656g = kVar;
                                            dVar.f107657h = 8;
                                            objA6 = b0Var2.a(str15, aVar, oVarZ18, oVarY18, dVar);
                                            if (objA6 != aVar2) {
                                                kVar2 = kVar;
                                                obj = objA6;
                                                cVar11 = cVar8;
                                                cVar12 = cVar9;
                                                bVar11 = bVar9;
                                                cVar13 = cVar10;
                                                dVar8 = dVar7;
                                                bVar12 = bVar10;
                                                return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 2:
                    mm1.b bVar13 = this.f107650a;
                    o13.r.b(obj);
                    dVar = this;
                    bVar2 = bVar13;
                    dVar2 = (q71.d) obj;
                    gy0.q0 q0Var3 = (gy0.q0) w0Var.f107608p.getValue();
                    String str16 = w0Var.f107579b;
                    b63.o oVarZ19 = w0Var.z4();
                    b63.o oVarY19 = w0Var.y4();
                    dVar.f107658i = aVar;
                    dVar.f107650a = bVar2;
                    dVar.f107651b = dVar2;
                    dVar.f107657h = 3;
                    objA2 = q0Var3.a(str16, aVar, oVarZ19, oVarY19, dVar);
                    if (objA2 != aVar2) {
                        bVar3 = bVar2;
                        dVar3 = dVar2;
                        obj = objA2;
                        cVar = (i53.c) obj;
                        gy0.y yVar3 = (gy0.y) w0Var.f107610q.getValue();
                        String str17 = w0Var.f107579b;
                        b63.o oVarZ110 = w0Var.z4();
                        b63.o oVarY110 = w0Var.y4();
                        dVar.f107658i = aVar;
                        dVar.f107650a = bVar3;
                        dVar.f107651b = dVar3;
                        dVar.f107652c = cVar;
                        dVar.f107657h = 4;
                        objA3 = yVar3.a(str17, aVar, oVarZ110, oVarY110, dVar);
                        if (objA3 != aVar2) {
                            bVar4 = bVar3;
                            dVar4 = dVar3;
                            cVar2 = cVar;
                            obj = objA3;
                            bVar5 = (k61.b) obj;
                            gy0.h1 h1Var3 = (gy0.h1) w0Var.f107612r.getValue();
                            String str18 = w0Var.f107579b;
                            b63.o oVarZ111 = w0Var.z4();
                            b63.o oVarY111 = w0Var.y4();
                            dVar.f107658i = aVar;
                            dVar.f107650a = bVar4;
                            dVar.f107651b = dVar4;
                            dVar.f107652c = cVar2;
                            dVar.f107653d = bVar5;
                            dVar.f107657h = 5;
                            objA4 = h1Var3.a(str18, aVar, oVarZ111, oVarY111, dVar);
                            if (objA4 != aVar2) {
                                bVar6 = bVar4;
                                dVar5 = dVar4;
                                cVar3 = cVar2;
                                bVar7 = bVar5;
                                obj = objA4;
                                cVar4 = (i53.c) obj;
                                gy0.j1 j1Var3 = (gy0.j1) w0Var.f107620w.getValue();
                                String str19 = w0Var.f107579b;
                                b63.o oVarZ112 = w0Var.z4();
                                b63.o oVarY112 = w0Var.y4();
                                dVar.f107658i = aVar;
                                dVar.f107650a = bVar6;
                                dVar.f107651b = dVar5;
                                dVar.f107652c = cVar3;
                                dVar.f107653d = bVar7;
                                dVar.f107654e = cVar4;
                                dVar.f107657h = 6;
                                objA5 = j1Var3.a(str19, aVar, oVarZ112, oVarY112, dVar);
                                if (objA5 != aVar2) {
                                    cVar5 = cVar4;
                                    obj = objA5;
                                    bVar8 = bVar7;
                                    cVar6 = cVar3;
                                    dVar6 = dVar5;
                                    cVar7 = (i53.c) obj;
                                    gy0.g0 g0Var3 = (gy0.g0) w0Var.f107615t.getValue();
                                    String str110 = w0Var.f107579b;
                                    b63.o oVarZ113 = w0Var.z4();
                                    b63.o oVarY113 = w0Var.y4();
                                    dVar.f107658i = aVar;
                                    dVar.f107650a = bVar6;
                                    dVar.f107651b = dVar6;
                                    dVar.f107652c = cVar6;
                                    dVar.f107653d = bVar8;
                                    dVar.f107654e = cVar5;
                                    dVar.f107655f = cVar7;
                                    dVar.f107657h = 7;
                                    objB = g0Var3.b(str110, oVarZ113, oVarY113, this);
                                    if (objB != aVar2) {
                                        cVar8 = cVar7;
                                        obj = objB;
                                        cVar9 = cVar5;
                                        bVar9 = bVar8;
                                        dVar7 = dVar6;
                                        bVar10 = bVar6;
                                        cVar10 = cVar6;
                                        kVar = (gy0.k) obj;
                                        gy0.b0 b0Var3 = (gy0.b0) w0Var.f107618v.getValue();
                                        String str111 = w0Var.f107579b;
                                        b63.o oVarZ114 = w0Var.z4();
                                        b63.o oVarY114 = w0Var.y4();
                                        dVar.f107658i = null;
                                        dVar.f107650a = bVar10;
                                        dVar.f107651b = dVar7;
                                        dVar.f107652c = cVar10;
                                        dVar.f107653d = bVar9;
                                        dVar.f107654e = cVar9;
                                        dVar.f107655f = cVar8;
                                        dVar.f107656g = kVar;
                                        dVar.f107657h = 8;
                                        objA6 = b0Var3.a(str111, aVar, oVarZ114, oVarY114, dVar);
                                        if (objA6 != aVar2) {
                                            kVar2 = kVar;
                                            obj = objA6;
                                            cVar11 = cVar8;
                                            cVar12 = cVar9;
                                            bVar11 = bVar9;
                                            cVar13 = cVar10;
                                            dVar8 = dVar7;
                                            bVar12 = bVar10;
                                            return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 3:
                    q71.d dVar9 = this.f107651b;
                    mm1.b bVar14 = this.f107650a;
                    o13.r.b(obj);
                    dVar = this;
                    dVar3 = dVar9;
                    bVar3 = bVar14;
                    cVar = (i53.c) obj;
                    gy0.y yVar4 = (gy0.y) w0Var.f107610q.getValue();
                    String str112 = w0Var.f107579b;
                    b63.o oVarZ115 = w0Var.z4();
                    b63.o oVarY115 = w0Var.y4();
                    dVar.f107658i = aVar;
                    dVar.f107650a = bVar3;
                    dVar.f107651b = dVar3;
                    dVar.f107652c = cVar;
                    dVar.f107657h = 4;
                    objA3 = yVar4.a(str112, aVar, oVarZ115, oVarY115, dVar);
                    if (objA3 != aVar2) {
                        bVar4 = bVar3;
                        dVar4 = dVar3;
                        cVar2 = cVar;
                        obj = objA3;
                        bVar5 = (k61.b) obj;
                        gy0.h1 h1Var4 = (gy0.h1) w0Var.f107612r.getValue();
                        String str113 = w0Var.f107579b;
                        b63.o oVarZ116 = w0Var.z4();
                        b63.o oVarY116 = w0Var.y4();
                        dVar.f107658i = aVar;
                        dVar.f107650a = bVar4;
                        dVar.f107651b = dVar4;
                        dVar.f107652c = cVar2;
                        dVar.f107653d = bVar5;
                        dVar.f107657h = 5;
                        objA4 = h1Var4.a(str113, aVar, oVarZ116, oVarY116, dVar);
                        if (objA4 != aVar2) {
                            bVar6 = bVar4;
                            dVar5 = dVar4;
                            cVar3 = cVar2;
                            bVar7 = bVar5;
                            obj = objA4;
                            cVar4 = (i53.c) obj;
                            gy0.j1 j1Var4 = (gy0.j1) w0Var.f107620w.getValue();
                            String str114 = w0Var.f107579b;
                            b63.o oVarZ117 = w0Var.z4();
                            b63.o oVarY117 = w0Var.y4();
                            dVar.f107658i = aVar;
                            dVar.f107650a = bVar6;
                            dVar.f107651b = dVar5;
                            dVar.f107652c = cVar3;
                            dVar.f107653d = bVar7;
                            dVar.f107654e = cVar4;
                            dVar.f107657h = 6;
                            objA5 = j1Var4.a(str114, aVar, oVarZ117, oVarY117, dVar);
                            if (objA5 != aVar2) {
                                cVar5 = cVar4;
                                obj = objA5;
                                bVar8 = bVar7;
                                cVar6 = cVar3;
                                dVar6 = dVar5;
                                cVar7 = (i53.c) obj;
                                gy0.g0 g0Var4 = (gy0.g0) w0Var.f107615t.getValue();
                                String str115 = w0Var.f107579b;
                                b63.o oVarZ118 = w0Var.z4();
                                b63.o oVarY118 = w0Var.y4();
                                dVar.f107658i = aVar;
                                dVar.f107650a = bVar6;
                                dVar.f107651b = dVar6;
                                dVar.f107652c = cVar6;
                                dVar.f107653d = bVar8;
                                dVar.f107654e = cVar5;
                                dVar.f107655f = cVar7;
                                dVar.f107657h = 7;
                                objB = g0Var4.b(str115, oVarZ118, oVarY118, this);
                                if (objB != aVar2) {
                                    cVar8 = cVar7;
                                    obj = objB;
                                    cVar9 = cVar5;
                                    bVar9 = bVar8;
                                    dVar7 = dVar6;
                                    bVar10 = bVar6;
                                    cVar10 = cVar6;
                                    kVar = (gy0.k) obj;
                                    gy0.b0 b0Var4 = (gy0.b0) w0Var.f107618v.getValue();
                                    String str116 = w0Var.f107579b;
                                    b63.o oVarZ119 = w0Var.z4();
                                    b63.o oVarY119 = w0Var.y4();
                                    dVar.f107658i = null;
                                    dVar.f107650a = bVar10;
                                    dVar.f107651b = dVar7;
                                    dVar.f107652c = cVar10;
                                    dVar.f107653d = bVar9;
                                    dVar.f107654e = cVar9;
                                    dVar.f107655f = cVar8;
                                    dVar.f107656g = kVar;
                                    dVar.f107657h = 8;
                                    objA6 = b0Var4.a(str116, aVar, oVarZ119, oVarY119, dVar);
                                    if (objA6 != aVar2) {
                                        kVar2 = kVar;
                                        obj = objA6;
                                        cVar11 = cVar8;
                                        cVar12 = cVar9;
                                        bVar11 = bVar9;
                                        cVar13 = cVar10;
                                        dVar8 = dVar7;
                                        bVar12 = bVar10;
                                        return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 4:
                    i53.c cVar14 = this.f107652c;
                    q71.d dVar10 = this.f107651b;
                    mm1.b bVar15 = this.f107650a;
                    o13.r.b(obj);
                    dVar = this;
                    cVar2 = cVar14;
                    dVar4 = dVar10;
                    bVar4 = bVar15;
                    bVar5 = (k61.b) obj;
                    gy0.h1 h1Var5 = (gy0.h1) w0Var.f107612r.getValue();
                    String str117 = w0Var.f107579b;
                    b63.o oVarZ1110 = w0Var.z4();
                    b63.o oVarY1110 = w0Var.y4();
                    dVar.f107658i = aVar;
                    dVar.f107650a = bVar4;
                    dVar.f107651b = dVar4;
                    dVar.f107652c = cVar2;
                    dVar.f107653d = bVar5;
                    dVar.f107657h = 5;
                    objA4 = h1Var5.a(str117, aVar, oVarZ1110, oVarY1110, dVar);
                    if (objA4 != aVar2) {
                        bVar6 = bVar4;
                        dVar5 = dVar4;
                        cVar3 = cVar2;
                        bVar7 = bVar5;
                        obj = objA4;
                        cVar4 = (i53.c) obj;
                        gy0.j1 j1Var5 = (gy0.j1) w0Var.f107620w.getValue();
                        String str118 = w0Var.f107579b;
                        b63.o oVarZ1111 = w0Var.z4();
                        b63.o oVarY1111 = w0Var.y4();
                        dVar.f107658i = aVar;
                        dVar.f107650a = bVar6;
                        dVar.f107651b = dVar5;
                        dVar.f107652c = cVar3;
                        dVar.f107653d = bVar7;
                        dVar.f107654e = cVar4;
                        dVar.f107657h = 6;
                        objA5 = j1Var5.a(str118, aVar, oVarZ1111, oVarY1111, dVar);
                        if (objA5 != aVar2) {
                            cVar5 = cVar4;
                            obj = objA5;
                            bVar8 = bVar7;
                            cVar6 = cVar3;
                            dVar6 = dVar5;
                            cVar7 = (i53.c) obj;
                            gy0.g0 g0Var5 = (gy0.g0) w0Var.f107615t.getValue();
                            String str119 = w0Var.f107579b;
                            b63.o oVarZ1112 = w0Var.z4();
                            b63.o oVarY1112 = w0Var.y4();
                            dVar.f107658i = aVar;
                            dVar.f107650a = bVar6;
                            dVar.f107651b = dVar6;
                            dVar.f107652c = cVar6;
                            dVar.f107653d = bVar8;
                            dVar.f107654e = cVar5;
                            dVar.f107655f = cVar7;
                            dVar.f107657h = 7;
                            objB = g0Var5.b(str119, oVarZ1112, oVarY1112, this);
                            if (objB != aVar2) {
                                cVar8 = cVar7;
                                obj = objB;
                                cVar9 = cVar5;
                                bVar9 = bVar8;
                                dVar7 = dVar6;
                                bVar10 = bVar6;
                                cVar10 = cVar6;
                                kVar = (gy0.k) obj;
                                gy0.b0 b0Var5 = (gy0.b0) w0Var.f107618v.getValue();
                                String str1110 = w0Var.f107579b;
                                b63.o oVarZ1113 = w0Var.z4();
                                b63.o oVarY1113 = w0Var.y4();
                                dVar.f107658i = null;
                                dVar.f107650a = bVar10;
                                dVar.f107651b = dVar7;
                                dVar.f107652c = cVar10;
                                dVar.f107653d = bVar9;
                                dVar.f107654e = cVar9;
                                dVar.f107655f = cVar8;
                                dVar.f107656g = kVar;
                                dVar.f107657h = 8;
                                objA6 = b0Var5.a(str1110, aVar, oVarZ1113, oVarY1113, dVar);
                                if (objA6 != aVar2) {
                                    kVar2 = kVar;
                                    obj = objA6;
                                    cVar11 = cVar8;
                                    cVar12 = cVar9;
                                    bVar11 = bVar9;
                                    cVar13 = cVar10;
                                    dVar8 = dVar7;
                                    bVar12 = bVar10;
                                    return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                                }
                            }
                        }
                    }
                    return aVar2;
                case 5:
                    k61.b bVar16 = this.f107653d;
                    i53.c cVar15 = this.f107652c;
                    q71.d dVar11 = this.f107651b;
                    mm1.b bVar17 = this.f107650a;
                    o13.r.b(obj);
                    dVar = this;
                    bVar7 = bVar16;
                    cVar3 = cVar15;
                    dVar5 = dVar11;
                    bVar6 = bVar17;
                    cVar4 = (i53.c) obj;
                    gy0.j1 j1Var6 = (gy0.j1) w0Var.f107620w.getValue();
                    String str1111 = w0Var.f107579b;
                    b63.o oVarZ1114 = w0Var.z4();
                    b63.o oVarY1114 = w0Var.y4();
                    dVar.f107658i = aVar;
                    dVar.f107650a = bVar6;
                    dVar.f107651b = dVar5;
                    dVar.f107652c = cVar3;
                    dVar.f107653d = bVar7;
                    dVar.f107654e = cVar4;
                    dVar.f107657h = 6;
                    objA5 = j1Var6.a(str1111, aVar, oVarZ1114, oVarY1114, dVar);
                    if (objA5 != aVar2) {
                        cVar5 = cVar4;
                        obj = objA5;
                        bVar8 = bVar7;
                        cVar6 = cVar3;
                        dVar6 = dVar5;
                        cVar7 = (i53.c) obj;
                        gy0.g0 g0Var6 = (gy0.g0) w0Var.f107615t.getValue();
                        String str1112 = w0Var.f107579b;
                        b63.o oVarZ1115 = w0Var.z4();
                        b63.o oVarY1115 = w0Var.y4();
                        dVar.f107658i = aVar;
                        dVar.f107650a = bVar6;
                        dVar.f107651b = dVar6;
                        dVar.f107652c = cVar6;
                        dVar.f107653d = bVar8;
                        dVar.f107654e = cVar5;
                        dVar.f107655f = cVar7;
                        dVar.f107657h = 7;
                        objB = g0Var6.b(str1112, oVarZ1115, oVarY1115, this);
                        if (objB != aVar2) {
                            cVar8 = cVar7;
                            obj = objB;
                            cVar9 = cVar5;
                            bVar9 = bVar8;
                            dVar7 = dVar6;
                            bVar10 = bVar6;
                            cVar10 = cVar6;
                            kVar = (gy0.k) obj;
                            gy0.b0 b0Var6 = (gy0.b0) w0Var.f107618v.getValue();
                            String str1113 = w0Var.f107579b;
                            b63.o oVarZ1116 = w0Var.z4();
                            b63.o oVarY1116 = w0Var.y4();
                            dVar.f107658i = null;
                            dVar.f107650a = bVar10;
                            dVar.f107651b = dVar7;
                            dVar.f107652c = cVar10;
                            dVar.f107653d = bVar9;
                            dVar.f107654e = cVar9;
                            dVar.f107655f = cVar8;
                            dVar.f107656g = kVar;
                            dVar.f107657h = 8;
                            objA6 = b0Var6.a(str1113, aVar, oVarZ1116, oVarY1116, dVar);
                            if (objA6 != aVar2) {
                                kVar2 = kVar;
                                obj = objA6;
                                cVar11 = cVar8;
                                cVar12 = cVar9;
                                bVar11 = bVar9;
                                cVar13 = cVar10;
                                dVar8 = dVar7;
                                bVar12 = bVar10;
                                return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                            }
                        }
                    }
                    return aVar2;
                case 6:
                    cVar5 = this.f107654e;
                    bVar8 = this.f107653d;
                    cVar6 = this.f107652c;
                    dVar6 = this.f107651b;
                    mm1.b bVar18 = this.f107650a;
                    o13.r.b(obj);
                    bVar6 = bVar18;
                    dVar = this;
                    cVar7 = (i53.c) obj;
                    gy0.g0 g0Var7 = (gy0.g0) w0Var.f107615t.getValue();
                    String str1114 = w0Var.f107579b;
                    b63.o oVarZ1117 = w0Var.z4();
                    b63.o oVarY1117 = w0Var.y4();
                    dVar.f107658i = aVar;
                    dVar.f107650a = bVar6;
                    dVar.f107651b = dVar6;
                    dVar.f107652c = cVar6;
                    dVar.f107653d = bVar8;
                    dVar.f107654e = cVar5;
                    dVar.f107655f = cVar7;
                    dVar.f107657h = 7;
                    objB = g0Var7.b(str1114, oVarZ1117, oVarY1117, this);
                    if (objB != aVar2) {
                        cVar8 = cVar7;
                        obj = objB;
                        cVar9 = cVar5;
                        bVar9 = bVar8;
                        dVar7 = dVar6;
                        bVar10 = bVar6;
                        cVar10 = cVar6;
                        kVar = (gy0.k) obj;
                        gy0.b0 b0Var7 = (gy0.b0) w0Var.f107618v.getValue();
                        String str1115 = w0Var.f107579b;
                        b63.o oVarZ1118 = w0Var.z4();
                        b63.o oVarY1118 = w0Var.y4();
                        dVar.f107658i = null;
                        dVar.f107650a = bVar10;
                        dVar.f107651b = dVar7;
                        dVar.f107652c = cVar10;
                        dVar.f107653d = bVar9;
                        dVar.f107654e = cVar9;
                        dVar.f107655f = cVar8;
                        dVar.f107656g = kVar;
                        dVar.f107657h = 8;
                        objA6 = b0Var7.a(str1115, aVar, oVarZ1118, oVarY1118, dVar);
                        if (objA6 != aVar2) {
                            kVar2 = kVar;
                            obj = objA6;
                            cVar11 = cVar8;
                            cVar12 = cVar9;
                            bVar11 = bVar9;
                            cVar13 = cVar10;
                            dVar8 = dVar7;
                            bVar12 = bVar10;
                            return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                        }
                    }
                    return aVar2;
                case 7:
                    i53.c cVar16 = this.f107655f;
                    i53.c cVar17 = this.f107654e;
                    k61.b bVar19 = this.f107653d;
                    i53.c cVar18 = this.f107652c;
                    q71.d dVar12 = this.f107651b;
                    mm1.b bVar20 = this.f107650a;
                    o13.r.b(obj);
                    cVar9 = cVar17;
                    bVar9 = bVar19;
                    cVar10 = cVar18;
                    dVar7 = dVar12;
                    bVar10 = bVar20;
                    dVar = this;
                    cVar8 = cVar16;
                    kVar = (gy0.k) obj;
                    gy0.b0 b0Var8 = (gy0.b0) w0Var.f107618v.getValue();
                    String str1116 = w0Var.f107579b;
                    b63.o oVarZ1119 = w0Var.z4();
                    b63.o oVarY1119 = w0Var.y4();
                    dVar.f107658i = null;
                    dVar.f107650a = bVar10;
                    dVar.f107651b = dVar7;
                    dVar.f107652c = cVar10;
                    dVar.f107653d = bVar9;
                    dVar.f107654e = cVar9;
                    dVar.f107655f = cVar8;
                    dVar.f107656g = kVar;
                    dVar.f107657h = 8;
                    objA6 = b0Var8.a(str1116, aVar, oVarZ1119, oVarY1119, dVar);
                    if (objA6 != aVar2) {
                        kVar2 = kVar;
                        obj = objA6;
                        cVar11 = cVar8;
                        cVar12 = cVar9;
                        bVar11 = bVar9;
                        cVar13 = cVar10;
                        dVar8 = dVar7;
                        bVar12 = bVar10;
                        return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                    }
                    return aVar2;
                case 8:
                    gy0.k kVar3 = this.f107656g;
                    i53.c cVar19 = this.f107655f;
                    i53.c cVar20 = this.f107654e;
                    k61.b bVar21 = this.f107653d;
                    i53.c cVar21 = this.f107652c;
                    q71.d dVar13 = this.f107651b;
                    mm1.b bVar22 = this.f107650a;
                    o13.r.b(obj);
                    cVar11 = cVar19;
                    bVar12 = bVar22;
                    cVar12 = cVar20;
                    dVar8 = dVar13;
                    bVar11 = bVar21;
                    cVar13 = cVar21;
                    kVar2 = kVar3;
                    return new sy0.n(bVar12, dVar8, cVar13, bVar11, cVar12, cVar11, kVar2, (i53.c) obj);
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d0 implements e23.a<gy0.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107662c;

        public d0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107660a = scope;
            this.f107661b = qualifier;
            this.f107662c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.g, java.lang.Object] */
        @Override // e23.a
        public final gy0.g invoke() {
            return this.f107660a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.g.class), this.f107661b, this.f107662c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$saveEditNotesSheet$1", f = "MultiDayActivitiesDetailViewModel.kt", l = {628, 629}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107663a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<String, cy0.l> f107665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set<ActivityListItemDTO> f107666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set<ActivityListItemDTO> f107667e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Map<String, cy0.l> map, Set<? extends ActivityListItemDTO> set, Set<? extends ActivityListItemDTO> set2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f107665c = map;
            this.f107666d = set;
            this.f107667e = set2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w0.this.new e(this.f107665c, this.f107666d, this.f107667e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        
            if (r4.T4(r10, r1, r9) == r0) goto L26;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107663a;
            w0 w0Var = w0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = w0Var.Q0;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, yc.z0.b.f196664b));
                this.f107663a = 1;
                if (w0Var.O4(this.f107665c, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            w0Var.R4();
            p2 p2Var2 = w0Var.Q0;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, new yc.z0.c(true)));
            return Unit.INSTANCE;
            Set<ActivityListItemDTO> set = this.f107666d;
            ArrayList arrayList = new ArrayList(p13.y.r(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                q6.f.s(((ActivityListItemDTO) it.next()).f29250b, arrayList);
            }
            Set setG1 = p13.h0.g1(arrayList);
            Set<ActivityListItemDTO> set2 = this.f107667e;
            ArrayList arrayList2 = new ArrayList(p13.y.r(set2, 10));
            Iterator<T> it3 = set2.iterator();
            while (it3.hasNext()) {
                q6.f.s(((ActivityListItemDTO) it3.next()).f29250b, arrayList2);
            }
            Set setG2 = p13.h0.g1(arrayList2);
            this.f107663a = 2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e0 implements e23.a<f12.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f107668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107670c;

        public e0(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f107668a = koinComponent;
            this.f107669b = qualifier;
            this.f107670c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [f12.b, java.lang.Object] */
        @Override // e23.a
        public final f12.b invoke() {
            KoinComponent koinComponent = this.f107668a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), this.f107669b, this.f107670c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<gy0.v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107673c;

        public f(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107671a = scope;
            this.f107672b = qualifier;
            this.f107673c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.v, java.lang.Object] */
        @Override // e23.a
        public final gy0.v invoke() {
            return this.f107671a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.v.class), this.f107672b, this.f107673c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f0 implements e23.a<gy0.k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107676c;

        public f0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107674a = scope;
            this.f107675b = qualifier;
            this.f107676c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.k0, java.lang.Object] */
        @Override // e23.a
        public final gy0.k0 invoke() {
            return this.f107674a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.k0.class), this.f107675b, this.f107676c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<gy0.e1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107679c;

        public g(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107677a = scope;
            this.f107678b = qualifier;
            this.f107679c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.e1, java.lang.Object] */
        @Override // e23.a
        public final gy0.e1 invoke() {
            return this.f107677a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.e1.class), this.f107678b, this.f107679c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g0 implements e23.a<gy0.j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107682c;

        public g0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107680a = scope;
            this.f107681b = qualifier;
            this.f107682c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.j0, java.lang.Object] */
        @Override // e23.a
        public final gy0.j0 invoke() {
            return this.f107680a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.j0.class), this.f107681b, this.f107682c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<gy0.d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107685c;

        public h(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107683a = scope;
            this.f107684b = qualifier;
            this.f107685c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.d0, java.lang.Object] */
        @Override // e23.a
        public final gy0.d0 invoke() {
            return this.f107683a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.d0.class), this.f107684b, this.f107685c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h0 implements e23.a<gy0.n1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107688c;

        public h0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107686a = scope;
            this.f107687b = qualifier;
            this.f107688c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.n1, java.lang.Object] */
        @Override // e23.a
        public final gy0.n1 invoke() {
            return this.f107686a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.n1.class), this.f107687b, this.f107688c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<gy0.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107691c;

        public i(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107689a = scope;
            this.f107690b = qualifier;
            this.f107691c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.q0, java.lang.Object] */
        @Override // e23.a
        public final gy0.q0 invoke() {
            return this.f107689a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.q0.class), this.f107690b, this.f107691c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i0 implements e23.a<gy0.v0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107694c;

        public i0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107692a = scope;
            this.f107693b = qualifier;
            this.f107694c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.v0, java.lang.Object] */
        @Override // e23.a
        public final gy0.v0 invoke() {
            return this.f107692a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.v0.class), this.f107693b, this.f107694c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<gy0.y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107697c;

        public j(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107695a = scope;
            this.f107696b = qualifier;
            this.f107697c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.y, java.lang.Object] */
        @Override // e23.a
        public final gy0.y invoke() {
            return this.f107695a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.y.class), this.f107696b, this.f107697c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j0 implements e23.a<gy0.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107700c;

        public j0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107698a = scope;
            this.f107699b = qualifier;
            this.f107700c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.j, java.lang.Object] */
        @Override // e23.a
        public final gy0.j invoke() {
            return this.f107698a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.j.class), this.f107699b, this.f107700c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<gy0.h1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107703c;

        public k(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107701a = scope;
            this.f107702b = qualifier;
            this.f107703c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.h1, java.lang.Object] */
        @Override // e23.a
        public final gy0.h1 invoke() {
            return this.f107701a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.h1.class), this.f107702b, this.f107703c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k0 implements e23.a<gy0.t1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107706c;

        public k0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107704a = scope;
            this.f107705b = qualifier;
            this.f107706c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.t1, java.lang.Object] */
        @Override // e23.a
        public final gy0.t1 invoke() {
            return this.f107704a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.t1.class), this.f107705b, this.f107706c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.a<gy0.g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107709c;

        public l(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107707a = scope;
            this.f107708b = qualifier;
            this.f107709c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.g0, java.lang.Object] */
        @Override // e23.a
        public final gy0.g0 invoke() {
            return this.f107707a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.g0.class), this.f107708b, this.f107709c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l0 implements e23.a<gy0.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107712c;

        public l0(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107710a = scope;
            this.f107711b = qualifier;
            this.f107712c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.w, java.lang.Object] */
        @Override // e23.a
        public final gy0.w invoke() {
            return this.f107710a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.w.class), this.f107711b, this.f107712c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<gy0.b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107715c;

        public m(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107713a = scope;
            this.f107714b = qualifier;
            this.f107715c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.b0, java.lang.Object] */
        @Override // e23.a
        public final gy0.b0 invoke() {
            return this.f107713a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.b0.class), this.f107714b, this.f107715c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.a<gy0.j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107718c;

        public n(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107716a = scope;
            this.f107717b = qualifier;
            this.f107718c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.j1, java.lang.Object] */
        @Override // e23.a
        public final gy0.j1 invoke() {
            return this.f107716a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.j1.class), this.f107717b, this.f107718c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.a<gy0.x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107721c;

        public o(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107719a = scope;
            this.f107720b = qualifier;
            this.f107721c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.x0, java.lang.Object] */
        @Override // e23.a
        public final gy0.x0 invoke() {
            return this.f107719a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.x0.class), this.f107720b, this.f107721c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.a<hy0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f107722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107724c;

        public p(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f107722a = koinComponent;
            this.f107723b = qualifier;
            this.f107724c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [hy0.a, java.lang.Object] */
        @Override // e23.a
        public final hy0.a invoke() {
            KoinComponent koinComponent = this.f107722a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(hy0.a.class), this.f107723b, this.f107724c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.a<gy0.t0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107727c;

        public q(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107725a = scope;
            this.f107726b = qualifier;
            this.f107727c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.t0, java.lang.Object] */
        @Override // e23.a
        public final gy0.t0 invoke() {
            return this.f107725a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.t0.class), this.f107726b, this.f107727c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class r implements e23.a<gy0.a1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107730c;

        public r(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107728a = scope;
            this.f107729b = qualifier;
            this.f107730c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.a1, java.lang.Object] */
        @Override // e23.a
        public final gy0.a1 invoke() {
            return this.f107728a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.a1.class), this.f107729b, this.f107730c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class s implements e23.a<gy0.o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107733c;

        public s(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107731a = scope;
            this.f107732b = qualifier;
            this.f107733c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.o1, java.lang.Object] */
        @Override // e23.a
        public final gy0.o1 invoke() {
            return this.f107731a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.o1.class), this.f107732b, this.f107733c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class t implements e23.a<gy0.d1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107736c;

        public t(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107734a = scope;
            this.f107735b = qualifier;
            this.f107736c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.d1, java.lang.Object] */
        @Override // e23.a
        public final gy0.d1 invoke() {
            return this.f107734a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.d1.class), this.f107735b, this.f107736c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class u implements e23.a<gy0.o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107739c;

        public u(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107737a = scope;
            this.f107738b = qualifier;
            this.f107739c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.o0, java.lang.Object] */
        @Override // e23.a
        public final gy0.o0 invoke() {
            return this.f107737a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.o0.class), this.f107738b, this.f107739c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class v implements e23.a<gy0.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107742c;

        public v(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107740a = scope;
            this.f107741b = qualifier;
            this.f107742c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.r, java.lang.Object] */
        @Override // e23.a
        public final gy0.r invoke() {
            return this.f107740a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.r.class), this.f107741b, this.f107742c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class w implements e23.a<gy0.r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107745c;

        public w(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107743a = scope;
            this.f107744b = qualifier;
            this.f107745c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.r0, java.lang.Object] */
        @Override // e23.a
        public final gy0.r0 invoke() {
            return this.f107743a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.r0.class), this.f107744b, this.f107745c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class x implements e23.a<gy0.k1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107748c;

        public x(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107746a = scope;
            this.f107747b = qualifier;
            this.f107748c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.k1, java.lang.Object] */
        @Override // e23.a
        public final gy0.k1 invoke() {
            return this.f107746a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.k1.class), this.f107747b, this.f107748c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class y implements e23.a<gy0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107751c;

        public y(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107749a = scope;
            this.f107750b = qualifier;
            this.f107751c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.i0, java.lang.Object] */
        @Override // e23.a
        public final gy0.i0 invoke() {
            return this.f107749a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.i0.class), this.f107750b, this.f107751c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class z implements e23.a<gy0.s1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f107752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f107753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f107754c;

        public z(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f107752a = scope;
            this.f107753b = qualifier;
            this.f107754c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.s1, java.lang.Object] */
        @Override // e23.a
        public final gy0.s1 invoke() {
            return this.f107752a.get(p005kotlin.jvm.internal.s0.f105811a.b(gy0.s1.class), this.f107753b, this.f107754c);
        }
    }

    public w0(Context context, String str, fy0.a aVar) {
        context.getClass();
        str.getClass();
        aVar.getClass();
        this.f107577a = context;
        this.f107579b = str;
        this.f107581c = aVar;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f107583d = o13.m.a(koinPlatformTools.defaultLazyMode(), new p(this, null, null));
        Scope scopeV = xy2.b.v();
        o13.n nVar = o13.n.SYNCHRONIZED;
        this.f107585e = o13.m.a(nVar, new a0(scopeV, null, null));
        this.f107587f = o13.m.a(nVar, new f0(scopeV, null, null));
        this.f107589g = o13.m.a(nVar, new g0(scopeV, null, null));
        this.f107591h = o13.m.a(nVar, new h0(scopeV, null, null));
        this.f107593i = o13.m.a(nVar, new i0(scopeV, null, null));
        this.f107595j = o13.m.a(nVar, new j0(scopeV, null, null));
        this.f107597k = o13.m.a(nVar, new k0(scopeV, null, null));
        this.f107600l = o13.m.a(nVar, new l0(scopeV, null, null));
        this.f107602m = o13.m.a(nVar, new f(scopeV, null, null));
        this.f107604n = o13.m.a(nVar, new g(scopeV, null, null));
        this.f107606o = o13.m.a(nVar, new h(scopeV, null, null));
        this.f107608p = o13.m.a(nVar, new i(scopeV, null, null));
        this.f107610q = o13.m.a(nVar, new j(scopeV, null, null));
        this.f107612r = o13.m.a(nVar, new k(scopeV, null, null));
        this.f107615t = o13.m.a(nVar, new l(scopeV, null, null));
        this.f107618v = o13.m.a(nVar, new m(scopeV, null, null));
        this.f107620w = o13.m.a(nVar, new n(scopeV, null, null));
        this.f107622x = o13.m.a(nVar, new o(scopeV, null, null));
        this.f107624y = o13.m.a(nVar, new q(scopeV, null, null));
        this.f107626z = o13.m.a(nVar, new r(scopeV, null, null));
        this.A = o13.m.a(nVar, new s(scopeV, null, null));
        this.B = o13.m.a(nVar, new t(scopeV, null, null));
        this.C = o13.m.a(nVar, new u(scopeV, null, null));
        this.D = o13.m.a(nVar, new v(scopeV, null, null));
        this.E = o13.m.a(nVar, new w(scopeV, null, null));
        this.F = o13.m.a(nVar, new x(scopeV, null, null));
        this.I = o13.m.a(nVar, new y(scopeV, null, null));
        this.P = o13.m.a(nVar, new z(scopeV, null, null));
        this.T = o13.m.a(nVar, new b0(scopeV, null, null));
        this.X = o13.m.a(nVar, new c0(scopeV, null, null));
        this.Y = o13.m.a(nVar, new d0(scopeV, null, null));
        o13.l lVarA = o13.m.a(koinPlatformTools.defaultLazyMode(), new e0(this, null, null));
        this.Z = lVarA;
        p2 p2VarA = q2.a(new sy0.k(null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, null, 65535, null));
        this.f107598k0 = p2VarA;
        this.H0 = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(new ly0.s(null, null, null, 7, null));
        this.I0 = p2VarA2;
        this.J0 = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(null);
        this.K0 = p2VarA3;
        this.L0 = r53.s.d(p2VarA3);
        p2 p2VarA4 = q2.a(j53.l.b());
        this.M0 = p2VarA4;
        this.N0 = r53.s.d(p2VarA4);
        p2 p2VarA5 = q2.a(new sy0.o(false, null, null, false, null, 31, null));
        this.O0 = p2VarA5;
        this.P0 = r53.s.d(p2VarA5);
        p2 p2VarA6 = q2.a(new yc.z0.c(true));
        this.Q0 = p2VarA6;
        this.R0 = r53.s.d(p2VarA6);
        p2 p2VarA7 = q2.a(null);
        this.S0 = p2VarA7;
        this.T0 = r53.s.d(p2VarA7);
        p2 p2VarA8 = q2.a(null);
        this.U0 = p2VarA8;
        this.V0 = r53.s.d(p2VarA8);
        p2 p2VarA9 = q2.a(null);
        this.W0 = p2VarA9;
        this.X0 = r53.s.d(p2VarA9);
        p2 p2VarA10 = q2.a(j53.l.b());
        this.Y0 = p2VarA10;
        this.Z0 = r53.s.d(p2VarA10);
        p2 p2VarA11 = q2.a(j53.l.b());
        this.f107578a1 = p2VarA11;
        this.f107580b1 = r53.s.d(p2VarA11);
        p2 p2VarA12 = q2.a(j53.l.b());
        this.f107582c1 = p2VarA12;
        this.f107584d1 = r53.s.d(p2VarA12);
        Boolean bool = Boolean.FALSE;
        p2 p2VarA13 = q2.a(bool);
        this.f107586e1 = p2VarA13;
        this.f107588f1 = r53.s.d(p2VarA13);
        p2 p2VarA14 = q2.a(oy0.i.OLDEST_FIRST);
        this.f107590g1 = p2VarA14;
        this.f107592h1 = r53.s.d(p2VarA14);
        p2 p2VarA15 = q2.a(0);
        this.f107594i1 = p2VarA15;
        this.f107596j1 = r53.s.d(p2VarA15);
        p2 p2VarA16 = q2.a(bool);
        this.f107599k1 = p2VarA16;
        this.f107601l1 = r53.s.d(p2VarA16);
        p2 p2VarA17 = q2.a(new sy0.t(null, null, null, 7, null));
        this.f107603m1 = p2VarA17;
        this.f107605n1 = r53.s.d(p2VarA17);
        p2 p2VarA18 = q2.a(new sy0.h(null, null, null, null, 15, null));
        this.f107607o1 = p2VarA18;
        this.f107609p1 = r53.s.d(p2VarA18);
        p2 p2VarA19 = q2.a(bool);
        this.f107611q1 = p2VarA19;
        this.f107613r1 = r53.s.d(p2VarA19);
        p2 p2VarA20 = q2.a(null);
        this.f107614s1 = p2VarA20;
        this.f107616t1 = r53.s.d(p2VarA20);
        this.f107617u1 = new AtomicInteger(0);
        this.f107619v1 = ((f12.b) lVarA.getValue()).getUserProfilePk();
        x53.c cVar = o53.s0.f129406a;
        this.f107621w1 = new u82.a(o53.c0.a(x53.b.f189152a), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        p2 p2VarA21 = q2.a(null);
        this.f107623x1 = p2VarA21;
        p2 p2VarA22 = q2.a(null);
        this.f107625y1 = p2VarA22;
        p2 p2VarA23 = q2.a(lg.d.r());
        this.f107627z1 = p2VarA23;
        r53.b2 b2VarD = r53.s.d(p2VarA23);
        this.A1 = b2VarD;
        r53.r1 r1VarL = r53.s.l(b2VarD, p2VarA22, p2VarA21, new b(null));
        w9.a aVarA = androidx.lifecycle.v1.a(this);
        k2.f150703a.getClass();
        this.B1 = r53.s.K(r1VarL, aVarA, k2.a.f150706c, new sy0.e(null, null, 3, null));
        p2 p2VarA24 = q2.a(i53.a.c());
        this.C1 = p2VarA24;
        this.D1 = r53.s.d(p2VarA24);
        this.E1 = new AtomicBoolean(false);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final gy0.j0 A4() {
        return (gy0.j0) this.f107589g.getValue();
    }

    public final void B4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f107599k1;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.FALSE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, o13.l] */
    public final Object C4(List list, int i14, v13.c cVar) {
        a1 a1Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i15 = a1Var.f107175c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                a1Var.f107175c = i15 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objF = a1Var.f107173a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = a1Var.f107175c;
        if (i16 == 0) {
            o13.r.b(objF);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "loadActivityResources - start!");
            gy0.r rVar = (gy0.r) this.D.getValue();
            a1Var.f107175c = 1;
            rVar.getClass();
            objF = rVar.f80220a.f(p13.h0.S0(p13.h0.U(list, i14 * 20), 20), a1Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        return (List) objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
    public final Object D4(sy0.k kVar, v13.c cVar) {
        b1 b1Var;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        Long l14;
        p2 p2Var;
        Object value;
        p2 p2Var2;
        Object value2;
        com.garmin.android.library.mapsdkadapter.p pVarC;
        com.garmin.android.library.mapsdkadapter.p pVarD;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i14 = b1Var.f107217c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b1Var.f107217c = i14 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objA = b1Var.f107215a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b1Var.f107217c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (!kVar.f161246n) {
                i53.c<Long> cVar2 = kVar.f161243k;
                if (cVar2 == null || (l14 = (Long) p13.h0.d0(cVar2)) == null) {
                    eVar = null;
                } else {
                    long jLongValue = l14.longValue();
                    gy0.v vVar = (gy0.v) this.f107602m.getValue();
                    b1Var.f107217c = 1;
                    objA = vVar.a(jLongValue, b1Var);
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                do {
                    p2Var = this.f107623x1;
                    value = p2Var.getValue();
                } while (!p2Var.b(value, eVar));
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objA);
        eVar = (com.garmin.android.apps.connectmobile.courses.model.e) objA;
        com.garmin.android.library.mapsdkadapter.q qVarA = py0.a.a(this.f107577a, eVar);
        if (qVarA != null) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "updateCoursePolyline - setupMapView - courseDetail updated");
            i53.c<com.garmin.android.library.mapsdkadapter.p> cVar3 = ((ly0.s) this.J0.f150540a.getValue()).f115384b;
            ArrayList arrayList = cVar3 != null ? new ArrayList(cVar3) : new ArrayList();
            if (eVar != null && (pVarD = py0.a.d(eVar)) != null) {
                arrayList.add(pVarD);
            }
            if (eVar != null && (pVarC = py0.a.c(eVar)) != null) {
                arrayList.add(pVarC);
            }
            do {
                p2Var2 = this.I0;
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, ly0.s.a((ly0.s) p2Var2.getValue(), i53.a.e(arrayList), qVarA)));
        }
        do {
            p2Var = this.f107623x1;
            value = p2Var.getValue();
        } while (!p2Var.b(value, eVar));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, o13.l] */
    public final Object E4(v13.c cVar) {
        c1 c1Var;
        p2 p2Var;
        Object value;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i14 = c1Var.f107245c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1Var.f107245c = i14 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, cVar);
            }
        } else {
            c1Var = new c1(this, cVar);
        }
        Object objA = c1Var.f107243a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1Var.f107245c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (((sy0.k) this.H0.f150540a.getValue()).f161235c) {
                gy0.w wVar = (gy0.w) this.f107600l.getValue();
                c1Var.f107245c = 1;
                objA = wVar.a(c1Var);
                if (objA == obj) {
                    return obj;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objA);
        ArrayList arrayListA = sy0.s.a((List) objA);
        do {
            p2Var = this.f107625y1;
            value = p2Var.getValue();
        } while (!p2Var.b(value, arrayListA));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
    public final Object F4(v13.c cVar) {
        d1 d1Var;
        p2 p2Var;
        Object value;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i14 = d1Var.f107275c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d1Var.f107275c = i14 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object objA = d1Var.f107273a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d1Var.f107275c;
        if (i15 == 0) {
            o13.r.b(objA);
            gy0.i0 i0Var = (gy0.i0) this.I.getValue();
            d1Var.f107275c = 1;
            objA = i0Var.a(this.f107579b, d1Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        i53.c cVar2 = (i53.c) objA;
        if (cVar2 != null) {
            do {
                p2Var = this.f107578a1;
                value = p2Var.getValue();
            } while (!p2Var.b(value, cVar2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x0226  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o13.l] */
    public final Object G4(v13.c cVar) {
        e1 e1Var;
        b63.o oVar;
        b63.o oVar2;
        p2 p2Var;
        Object value;
        boolean z14;
        sy0.p pVar;
        i53.c cVarB;
        String strA;
        cy0.l lVar;
        Iterator it;
        Object next;
        boolean z15;
        Iterator it3;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i14 = e1Var.f107292e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e1Var.f107292e = i14 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, cVar);
            }
        } else {
            e1Var = new e1(this, cVar);
        }
        e1 e1Var2 = e1Var;
        Object objA = e1Var2.f107290c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e1Var2.f107292e;
        r53.b2 b2Var = this.H0;
        boolean z16 = true;
        if (i15 == 0) {
            o13.r.b(objA);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "onSaveEditNotes - loadEditingNotesItems start!");
            sy0.k kVar = (sy0.k) b2Var.f150540a.getValue();
            kVar.getClass();
            DateTime dateTimeC = ay0.b.c(kVar.f161238f);
            Long lValueOf = dateTimeC != null ? Long.valueOf(dateTimeC.getMillis()) : null;
            sy0.k kVar2 = (sy0.k) b2Var.f150540a.getValue();
            kVar2.getClass();
            DateTime dateTimeC2 = ay0.b.c(kVar2.f161239g);
            Long lValueOf2 = dateTimeC2 != null ? Long.valueOf(dateTimeC2.getMillis()) : null;
            b63.o oVarZ4 = z4();
            b63.o oVarY4 = y4();
            if (lValueOf != null && lValueOf2 != null && oVarZ4 != null && oVarY4 != null) {
                gy0.q qVar = (gy0.q) this.T.getValue();
                long jLongValue = lValueOf.longValue();
                long jLongValue2 = lValueOf2.longValue();
                String str = ((sy0.t) this.f107605n1.f150540a.getValue()).f161283b;
                e1Var2.f107288a = oVarZ4;
                e1Var2.f107289b = oVarY4;
                e1Var2.f107292e = 1;
                objA = qVar.a(jLongValue, jLongValue2, str, e1Var2);
                if (objA == aVar) {
                    return aVar;
                }
                oVar = oVarZ4;
                oVar2 = oVarY4;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oVar2 = e1Var2.f107289b;
        oVar = e1Var2.f107288a;
        o13.r.b(objA);
        i53.c cVar2 = (i53.c) objA;
        if (cVar2 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("EEEE, MMM d", Locale.getDefault());
            sy0.k kVar3 = (sy0.k) b2Var.f150540a.getValue();
            i53.c<Long> cVar3 = kVar3 != null ? kVar3.f161244l : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : cVar2) {
                String str2 = ((ActivityListItemDTO) obj).f29259e;
                String strA2 = str2 != null ? py0.g.a(simpleDateFormat, simpleDateFormat2, str2) : null;
                Object arrayList = linkedHashMap.get(strA2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strA2, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            i53.f<b63.o> fVarI = i53.a.i(c53.c0.r(c53.q.e(new kn1.m(14), oVar), new kp2.a(oVar2, 2)));
            ArrayList<o13.p> arrayList2 = new ArrayList();
            for (b63.o oVar3 : fVarI) {
                String strA3 = py0.g.a(simpleDateFormat3, simpleDateFormat2, oVar3.toString());
                o13.p pVar2 = strA3 != null ? new o13.p(strA3, oVar3) : null;
                if (pVar2 != null) {
                    arrayList2.add(pVar2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (o13.p pVar3 : arrayList2) {
                String str3 = (String) pVar3.f128594a;
                b63.o oVar4 = (b63.o) pVar3.f128595b;
                String strA4 = py0.g.a(simpleDateFormat2, simpleDateFormat4, str3);
                if (strA4 != null) {
                    List list = (List) linkedHashMap.get(str3);
                    if (list != null) {
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) it4.next();
                            if (cVar3 != null) {
                                it3 = it4;
                                z15 = true;
                                boolean z17 = cVar3.contains(new Long(activityListItemDTO.f29250b));
                                arrayList4.add(new sy0.q(activityListItemDTO, z17));
                                z16 = z15;
                                it4 = it3;
                            } else {
                                z15 = z16;
                                it3 = it4;
                            }
                            arrayList4.add(new sy0.q(activityListItemDTO, z17));
                            z16 = z15;
                            it4 = it3;
                        }
                        z14 = z16;
                        cVarB = i53.a.j(arrayList4);
                        if (cVarB == null) {
                        }
                        strA = py0.g.a(simpleDateFormat2, simpleDateFormat3, str3);
                        if (strA != null) {
                            it = ((Iterable) this.f107580b1.f150540a.getValue()).iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!p005kotlin.jvm.internal.s.g(((cy0.l) next).getDate(), strA));
                            lVar = (cy0.l) next;
                        } else {
                            lVar = null;
                        }
                        pVar = new sy0.p(strA4, oVar4, cVarB, lVar);
                    } else {
                        z14 = z16;
                    }
                    cVarB = j53.l.b();
                    strA = py0.g.a(simpleDateFormat2, simpleDateFormat3, str3);
                    if (strA != null) {
                        it = ((Iterable) this.f107580b1.f150540a.getValue()).iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!p005kotlin.jvm.internal.s.g(((cy0.l) next).getDate(), strA));
                        lVar = (cy0.l) next;
                    } else {
                        lVar = null;
                    }
                    pVar = new sy0.p(strA4, oVar4, cVarB, lVar);
                } else {
                    z14 = z16;
                    pVar = null;
                }
                if (pVar != null) {
                    arrayList3.add(pVar);
                }
                z16 = z14;
            }
            i53.f fVarJ = i53.a.j(arrayList3);
            do {
                p2Var = this.f107582c1;
                value = p2Var.getValue();
            } while (!p2Var.b(value, fVarJ));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d4 A[LOOP:5: B:33:0x00ce->B:35:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef A[PHI: r1 r4 r6
      0x00ef: PHI (r1v15 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:37:0x00eb, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r4v15 java.util.List) = (r4v14 java.util.List), (r4v20 java.util.List) binds: [B:37:0x00eb, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r6v3 java.util.List) = (r6v2 java.util.List), (r6v10 java.util.List) binds: [B:37:0x00eb, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0130 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0191, code lost:
    
        if (G4(r2) == r3) goto L73;
     */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, o13.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H4(v13.c cVar) {
        f1 f1Var;
        Object value;
        List<ActivityListItemDTO> list;
        List list2;
        ArrayList arrayList;
        Iterator it;
        List list3;
        ArrayList arrayList2;
        i53.f fVarJ;
        p2 p2Var;
        Object value2;
        Iterator it3;
        Object next;
        Iterator it4;
        Object next2;
        cy0.p pVar;
        ps.m mVar;
        Long activityId;
        Object value3;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i14 = f1Var.f107308e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f1Var.f107308e = i14 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object objA = f1Var.f107306c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = f1Var.f107308e;
        String str = this.f107579b;
        p2 p2Var2 = this.f107586e1;
        if (i15 == 0) {
            o13.r.b(objA);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "loadInitialTimelineSummaries - start!");
            do {
                value = p2Var2.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var2.b(value, Boolean.TRUE));
            gy0.a1 a1Var = (gy0.a1) this.f107626z.getValue();
            oy0.i iVar = (oy0.i) this.f107590g1.getValue();
            String str2 = ((sy0.t) this.f107605n1.f150540a.getValue()).f161283b;
            f1Var.f107308e = 1;
            objA = a1Var.a(str, iVar, str2, f1Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objA);
        } else {
            if (i15 == 2) {
                List list4 = f1Var.f107304a;
                o13.r.b(objA);
                list = list4;
                list2 = (List) objA;
                arrayList = new ArrayList(p13.y.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    q6.f.s(((ActivityListItemDTO) it.next()).f29250b, arrayList);
                }
                f1Var.f107304a = list;
                f1Var.f107305b = list2;
                f1Var.f107308e = 3;
                objA = C4(arrayList, 0, f1Var);
                if (objA != obj) {
                    list3 = (List) objA;
                    arrayList2 = new ArrayList(p13.y.r(list, 10));
                    for (ActivityListItemDTO activityListItemDTO : list) {
                        it3 = list3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((cy0.c) next).getActivityId() != activityListItemDTO.f29250b);
                        cy0.c cVar2 = (cy0.c) next;
                        it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                            long j8 = activityListItemDTO.f29250b;
                            activityId = ((cy0.p) next2).f56776b.getActivityId();
                            if (activityId == null) {
                                break;
                                break;
                            }
                        }
                        pVar = (cy0.p) next2;
                        if (pVar != null) {
                            mVar = pVar.f56776b;
                        } else {
                            mVar = null;
                        }
                        arrayList2.add(new ly0.a(activityListItemDTO, mVar, cVar2));
                    }
                    fVarJ = i53.a.j(arrayList2);
                    do {
                        p2Var = this.Y0;
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, fVarJ));
                    f1Var.f107304a = null;
                    f1Var.f107305b = null;
                    f1Var.f107308e = 4;
                    if (F4(f1Var) != obj) {
                        f1Var.f107304a = null;
                        f1Var.f107305b = null;
                        f1Var.f107308e = 5;
                    }
                }
                return obj;
            }
            if (i15 == 3) {
                list2 = f1Var.f107305b;
                list = f1Var.f107304a;
                o13.r.b(objA);
                list3 = (List) objA;
                arrayList2 = new ArrayList(p13.y.r(list, 10));
                while (r5.hasNext()) {
                    it3 = list3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (((cy0.c) next).getActivityId() != activityListItemDTO.f29250b);
                    cy0.c cVar3 = (cy0.c) next;
                    it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        long j14 = activityListItemDTO.f29250b;
                        activityId = ((cy0.p) next2).f56776b.getActivityId();
                        if (activityId == null && j14 == activityId.longValue()) {
                            break;
                        }
                    }
                    pVar = (cy0.p) next2;
                    if (pVar != null) {
                        mVar = pVar.f56776b;
                    } else {
                        mVar = null;
                    }
                    arrayList2.add(new ly0.a(activityListItemDTO, mVar, cVar3));
                }
                fVarJ = i53.a.j(arrayList2);
                do {
                    p2Var = this.Y0;
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, fVarJ));
                f1Var.f107304a = null;
                f1Var.f107305b = null;
                f1Var.f107308e = 4;
                if (F4(f1Var) != obj) {
                    f1Var.f107304a = null;
                    f1Var.f107305b = null;
                    f1Var.f107308e = 5;
                }
                return obj;
            }
            if (i15 == 4) {
                o13.r.b(objA);
                f1Var.f107304a = null;
                f1Var.f107305b = null;
                f1Var.f107308e = 5;
            } else {
                if (i15 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
        }
        do {
            value3 = p2Var2.getValue();
            ((Boolean) value3).getClass();
        } while (!p2Var2.b(value3, Boolean.FALSE));
        return Unit.INSTANCE;
        List list5 = (List) objA;
        gy0.n0 n0Var = (gy0.n0) this.f107585e.getValue();
        f1Var.f107304a = list5;
        f1Var.f107308e = 2;
        Object objA2 = n0Var.a(str, f1Var);
        if (objA2 != obj) {
            list = list5;
            objA = objA2;
            list2 = (List) objA;
            arrayList = new ArrayList(p13.y.r(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                q6.f.s(((ActivityListItemDTO) it.next()).f29250b, arrayList);
            }
            f1Var.f107304a = list;
            f1Var.f107305b = list2;
            f1Var.f107308e = 3;
            objA = C4(arrayList, 0, f1Var);
            if (objA != obj) {
                list3 = (List) objA;
                arrayList2 = new ArrayList(p13.y.r(list, 10));
                while (r5.hasNext()) {
                    it3 = list3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (((cy0.c) next).getActivityId() != activityListItemDTO.f29250b);
                    cy0.c cVar4 = (cy0.c) next;
                    it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        long j15 = activityListItemDTO.f29250b;
                        activityId = ((cy0.p) next2).f56776b.getActivityId();
                        if (activityId == null) {
                            break;
                            break;
                        }
                    }
                    pVar = (cy0.p) next2;
                    if (pVar != null) {
                        mVar = pVar.f56776b;
                    } else {
                        mVar = null;
                    }
                    arrayList2.add(new ly0.a(activityListItemDTO, mVar, cVar4));
                }
                fVarJ = i53.a.j(arrayList2);
                do {
                    p2Var = this.Y0;
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, fVarJ));
                f1Var.f107304a = null;
                f1Var.f107305b = null;
                f1Var.f107308e = 4;
                if (F4(f1Var) != obj) {
                    f1Var.f107304a = null;
                    f1Var.f107305b = null;
                    f1Var.f107308e = 5;
                }
            }
        }
        return obj;
    }

    public final void I4() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        i2.f36769a.getClass();
        i2.a.a(a2Var, "loadMoreActivityResources - start!");
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new c(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ed, code lost:
    
        if (E4(r2) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0207, code lost:
    
        if (o53.c0.e(r1, r2) == r3) goto L70;
     */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [o53.d0, t13.d, t13.g] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J4(v13.c cVar) {
        i1 i1Var;
        p2 p2Var;
        Object value;
        String str;
        Map linkedHashMap;
        cy0.k kVar;
        Object value2;
        Object value3;
        p2 p2Var2;
        Object value4;
        sy0.k kVar2;
        int i14;
        Long l14;
        sy0.k kVar3;
        cy0.k kVar4;
        ?? r14;
        Object value5;
        p2 p2Var3;
        Object value6;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i15 = i1Var.f107364f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                i1Var.f107364f = i15 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objE = i1Var.f107362d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = i1Var.f107364f;
        p2 p2Var4 = this.O0;
        p2 p2Var5 = this.Q0;
        char c14 = 5;
        char c15 = 3;
        p2 p2Var6 = this.f107598k0;
        boolean z14 = true;
        if (i16 == 0) {
            o13.r.b(objE);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            i2.f36769a.getClass();
            i2.a.a(a2Var, "loadMultiDayActivityDetails - start!");
            while (true) {
                Object value7 = p2Var5.getValue();
                if (p2Var5.b(value7, yc.z0.b.f196664b)) {
                    break;
                }
                z14 = z14;
                c15 = c15;
                c14 = c14;
            }
            while (true) {
                Object value8 = p2Var4.getValue();
                if (p2Var4.b(value8, sy0.o.a((sy0.o) value8, true, null, null, false, null, 30))) {
                    break;
                }
                z14 = z14;
                c15 = c15;
                c14 = c14;
            }
            do {
                p2Var = this.C1;
                value = p2Var.getValue();
                gy0.d1 d1Var = (gy0.d1) this.B.getValue();
                d1Var.getClass();
                o13.t tVar = d1Var.f80132b;
                str = this.f107579b;
                str.getClass();
                String strA = ((gy0.n) tVar.getValue()).a(str);
                if (strA == null) {
                    w13.c cVar2 = a2.f107187m;
                    int iA = p13.t0.a(p13.y.r(cVar2, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj2 : cVar2) {
                        linkedHashMap.put(obj2, Boolean.TRUE);
                    }
                    gy0.n nVar = (gy0.n) tVar.getValue();
                    n63.b.a aVar = n63.b.f123892d;
                    aVar.getClass();
                    nVar.b(str, aVar.b(new m63.q0(new m63.b0("com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesReportsSettingsType", a2.values()), m63.g.f116948a), linkedHashMap));
                } else {
                    n63.b.a aVar2 = n63.b.f123892d;
                    aVar2.getClass();
                    linkedHashMap = (Map) aVar2.c(new m63.q0(new m63.b0("com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesReportsSettingsType", a2.values()), m63.g.f116948a), strA);
                }
            } while (!p2Var.b(value, i53.a.k(linkedHashMap)));
            gy0.j0 j0VarA4 = A4();
            i1Var.f107364f = 1;
            objE = j0VarA4.f80181a.e(str, i1Var);
            if (objE != obj) {
            }
            return obj;
        }
        if (i16 == 1) {
            o13.r.b(objE);
        } else {
            if (i16 == 2) {
                i14 = i1Var.f107361c;
                kVar2 = i1Var.f107360b;
                cy0.k kVar5 = i1Var.f107359a;
                o13.r.b(objE);
                kVar = kVar5;
                l14 = kVar2.f161234b;
                i1Var.f107359a = kVar;
                kVar3 = null;
                i1Var.f107360b = null;
                i1Var.f107361c = i14;
                i1Var.f107364f = 3;
                if (K4(l14, i1Var) != obj) {
                    kVar4 = kVar;
                    i1Var.f107359a = kVar4;
                    i1Var.f107360b = kVar3;
                    i1Var.f107361c = i14;
                    i1Var.f107364f = 4;
                }
                return obj;
            }
            if (i16 == 3) {
                i14 = i1Var.f107361c;
                kVar4 = i1Var.f107359a;
                o13.r.b(objE);
                kVar3 = null;
                i1Var.f107359a = kVar4;
                i1Var.f107360b = kVar3;
                i1Var.f107361c = i14;
                i1Var.f107364f = 4;
            } else if (i16 == 4) {
                o13.r.b(objE);
                this.E1.set(true);
                r14 = 0;
                j1 j1Var = new j1(this, null);
                i1Var.f107359a = null;
                i1Var.f107360b = null;
                i1Var.f107364f = 5;
            } else {
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE);
                r14 = 0;
            }
        }
        x53.c cVar3 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        ge1.b.T(o53.c0.a(bVar), r14, r14, new k1(this, r14), 3);
        if (!((Collection) this.M0.getValue()).isEmpty()) {
            ge1.b.T(o53.c0.a(bVar), r14, r14, new l1(this, r14), 3);
        }
        ge1.b.T(o53.c0.a(bVar), r14, r14, new m1(this, r14), 3);
        ge1.b.T(o53.c0.a(bVar), r14, r14, new g1(this, r14), 3);
        do {
            value5 = p2Var5.getValue();
        } while (!p2Var5.b(value5, new yc.z0.c(true)));
        if (((sy0.k) p2Var6.getValue()).f161247o && ((sy0.k) p2Var6.getValue()).f161242j) {
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new h1(this, null), 3);
        } else {
            do {
                p2Var3 = this.f107607o1;
                value6 = p2Var3.getValue();
            } while (!p2Var3.b(value6, sy0.h.a((sy0.h) value6)));
        }
        return Unit.INSTANCE;
        kVar = (cy0.k) objE;
        if (kVar != null) {
            sy0.k kVarB = sy0.s.b(kVar, this.f107619v1);
            this.I0.k(null, new ly0.s(null, null, null, 7, null));
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, sy0.o.a((sy0.o) value2, false, null, null, false, null, 30)));
            do {
                value3 = p2Var6.getValue();
            } while (!p2Var6.b(value3, kVarB));
            do {
                p2Var2 = this.f107590g1;
                value4 = p2Var2.getValue();
            } while (!p2Var2.b(value4, kVarB.f161247o ? oy0.i.NEWEST_FIRST : oy0.i.OLDEST_FIRST));
            i1Var.f107359a = kVar;
            i1Var.f107360b = kVarB;
            i1Var.f107361c = 0;
            i1Var.f107364f = 2;
            if (D4(kVarB, i1Var) != obj) {
                kVar2 = kVarB;
                i14 = 0;
                l14 = kVar2.f161234b;
                i1Var.f107359a = kVar;
                kVar3 = null;
                i1Var.f107360b = null;
                i1Var.f107361c = i14;
                i1Var.f107364f = 3;
                if (K4(l14, i1Var) != obj) {
                    kVar4 = kVar;
                    i1Var.f107359a = kVar4;
                    i1Var.f107360b = kVar3;
                    i1Var.f107361c = i14;
                    i1Var.f107364f = 4;
                }
            }
        } else {
            r14 = 0;
            j1 j1Var2 = new j1(this, null);
            i1Var.f107359a = null;
            i1Var.f107360b = null;
            i1Var.f107364f = 5;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o13.l] */
    public final Object K4(Long l14, v13.c cVar) throws Throwable {
        n1 n1Var;
        String strValueOf;
        p2 p2Var;
        Object value;
        String fullName;
        String displayName;
        b12.b bVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i14 = n1Var.f107440c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n1Var.f107440c = i14 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        Object objP = n1Var.f107438a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n1Var.f107440c;
        if (i15 == 0) {
            o13.r.b(objP);
            if (l14 != null && (strValueOf = String.valueOf(l14.longValue())) != null) {
                gy0.k1 k1Var = (gy0.k1) this.F.getValue();
                n1Var.f107440c = 1;
                by0.a aVar2 = k1Var.f80186a;
                objP = aVar2.j().p(strValueOf, new by0.h0(aVar2, strValueOf, null), n1Var);
                if (objP == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objP);
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) objP;
        do {
            p2Var = this.f107603m1;
            value = p2Var.getValue();
            sy0.t tVar = (sy0.t) this.f107605n1.f150540a.getValue();
            fullName = lVar != null ? lVar.getFullName() : null;
            displayName = lVar != null ? lVar.getDisplayName() : null;
            if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                bVar = null;
            } else {
                String str = profileImageUrls.f46878g;
                if (str == null && (str = profileImageUrls.f46879h) == null && (str = profileImageUrls.f46880i) == null && (str = profileImageUrls.f46875d) == null && (str = profileImageUrls.f46876e) == null) {
                    str = profileImageUrls.f46877f;
                }
                bVar = new b12.b(str, null, null, null, null, 30, null);
            }
            tVar.getClass();
        } while (!p2Var.b(value, new sy0.t(fullName, displayName, bVar)));
        return Unit.INSTANCE;
    }

    public final void L4(Activity activity) {
        activity.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(((sy0.h) this.f107607o1.getValue()).f161224d));
        activity.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (H4(r0) == r1) goto L32;
     */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, o13.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M4(v13.c cVar) {
        o1 o1Var;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f107450c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f107450c = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object obj = o1Var.f107448a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var.f107450c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
            } else if (i15 == 2) {
                o13.r.b(obj);
                o1Var.f107450c = 3;
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        this.f107617u1.set(0);
        o1Var.f107450c = 1;
        gy0.n1 n1Var = (gy0.n1) this.f107591h.getValue();
        Object objC = n1Var.f80202a.c(this.f107579b, o1Var);
        if (objC != obj2) {
            objC = Unit.INSTANCE;
        }
        if (objC != obj2) {
            objC = Unit.INSTANCE;
        }
        if (objC != obj2) {
        }
        return obj2;
        o1Var.f107450c = 2;
        if (J4(o1Var) != obj2) {
            o1Var.f107450c = 3;
        }
        return obj2;
    }

    public final void N4(Map<String, cy0.l> map, Set<? extends ActivityListItemDTO> set, Set<? extends ActivityListItemDTO> set2) {
        map.getClass();
        set.getClass();
        set2.getClass();
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e(map, set, set2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, o13.l] */
    public final Object O4(Map map, v13.c cVar) {
        p1 p1Var;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i14 = p1Var.f107458c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p1Var.f107458c = i14 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(this, cVar);
            }
        } else {
            p1Var = new p1(this, cVar);
        }
        Object objA = p1Var.f107456a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p1Var.f107458c;
        if (i15 == 0) {
            o13.r.b(objA);
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((cy0.l) ((Map.Entry) it.next()).getValue());
            }
            if (arrayList.isEmpty()) {
                return Unit.INSTANCE;
            }
            gy0.s1 s1Var = (gy0.s1) this.P.getValue();
            p1Var.f107458c = 1;
            objA = s1Var.a(this.f107579b, arrayList, p1Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("onSaveEditNotes - saveEpicNotes api call done! - isSuccess: ", zBooleanValue);
        i2.f36769a.getClass();
        i2.a.a(a2Var, strH);
        if (zBooleanValue) {
            Q4();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0090 A[LOOP:0: B:30:0x0090->B:36:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o13.l] */
    public final Object P4(v13.c cVar) {
        r1 r1Var;
        cy0.k kVar;
        p2 p2Var;
        Object value;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f107492d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f107492d = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objE = r1Var.f107490b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f107492d;
        String str = this.f107579b;
        boolean z14 = false;
        if (i15 == 0) {
            o13.r.b(objE);
            gy0.j0 j0VarA4 = A4();
            r1Var.f107492d = 1;
            objE = j0VarA4.f80181a.e(str, r1Var);
            if (objE != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = r1Var.f107489a;
            o13.r.b(objE);
        }
        if (p005kotlin.jvm.internal.s.g((gy0.u1) objE, gy0.u1.c.f80244a)) {
            do {
                p2Var = this.f107598k0;
                value = p2Var.getValue();
            } while (!p2Var.b(value, sy0.s.b(kVar, this.f107619v1)));
            Q4();
            z14 = true;
        }
        return Boolean.valueOf(z14);
        cy0.k kVar2 = (cy0.k) objE;
        cy0.k kVarB = kVar2 != null ? cy0.k.b(kVar2, null, null, null, null, sy0.m.EVERYONE.f161256a, false, null, null, 8063) : null;
        if (kVarB != null) {
            gy0.t1 t1Var = (gy0.t1) this.f107597k.getValue();
            r1Var.f107489a = kVarB;
            r1Var.f107492d = 2;
            Object objU = t1Var.f80234a.u(str, kVarB, r1Var);
            if (objU != aVar) {
                kVar = kVarB;
                objE = objU;
                if (p005kotlin.jvm.internal.s.g((gy0.u1) objE, gy0.u1.c.f80244a)) {
                    do {
                        p2Var = this.f107598k0;
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, sy0.s.b(kVar, this.f107619v1)));
                    Q4();
                    z14 = true;
                }
            }
            return aVar;
        }
        return Boolean.valueOf(z14);
    }

    public final void Q4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f107611q1;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
    }

    public final void R4() {
        Object value;
        p2 p2Var = this.f107598k0;
        sy0.k kVar = (sy0.k) p2Var.getValue();
        String str = kVar.f161233a;
        Long l14 = kVar.f161234b;
        boolean z14 = kVar.f161235c;
        String str2 = kVar.f161236d;
        String str3 = kVar.f161237e;
        String str4 = kVar.f161238f;
        String str5 = kVar.f161239g;
        i53.c<cy0.o> cVar = kVar.f161240h;
        sy0.m mVar = kVar.f161241i;
        boolean z15 = kVar.f161242j;
        i53.c<Long> cVar2 = kVar.f161243k;
        i53.c<Long> cVar3 = kVar.f161244l;
        boolean z16 = kVar.f161246n;
        boolean z17 = kVar.f161247o;
        ry0.m mVar2 = kVar.f161248p;
        hb.a.p(str, str2, str3, str4, str5);
        mVar.getClass();
        mVar2.getClass();
        sy0.k kVar2 = new sy0.k(str, l14, z14, str2, str3, str4, str5, cVar, mVar, z15, cVar2, cVar3, true, z16, z17, mVar2);
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, kVar2));
    }

    public final void S4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f107599k1;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[LOOP:0: B:44:0x00f1->B:50:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, o13.l] */
    public final Object T4(Set set, Set set2, v13.c cVar) {
        s1 s1Var;
        Set set3;
        Set set4;
        cy0.k kVar;
        List listZ0;
        gy0.u1 u1Var;
        p2 p2Var;
        Object value;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i14 = s1Var.f107536f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s1Var.f107536f = i14 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object objE = s1Var.f107534d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s1Var.f107536f;
        String str = this.f107579b;
        if (i15 == 0) {
            o13.r.b(objE);
            if (set.isEmpty() && set2.isEmpty()) {
                return Unit.INSTANCE;
            }
            gy0.j0 j0VarA4 = A4();
            s1Var.f107531a = set;
            s1Var.f107532b = set2;
            s1Var.f107536f = 1;
            objE = j0VarA4.f80181a.e(str, s1Var);
            if (objE != aVar) {
                set3 = set;
                set4 = set2;
            }
            return aVar;
        }
        if (i15 == 1) {
            set4 = s1Var.f107532b;
            set3 = s1Var.f107531a;
            o13.r.b(objE);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = s1Var.f107533c;
            Set set5 = s1Var.f107532b;
            Set set6 = s1Var.f107531a;
            o13.r.b(objE);
        }
        u1Var = (gy0.u1) objE;
        i2.f36769a.getClass();
        i2.a.a(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "onSaveEditNotes - updateActivities api call done! - data: " + u1Var);
        if (p005kotlin.jvm.internal.s.g(u1Var, gy0.u1.c.f80244a)) {
            do {
                p2Var = this.f107598k0;
                value = p2Var.getValue();
            } while (!p2Var.b(value, sy0.s.b(kVar, this.f107619v1)));
            Q4();
        }
        return Unit.INSTANCE;
        cy0.k kVar2 = (cy0.k) objE;
        if (kVar2 != null) {
            List<Long> listD = kVar2.d();
            ArrayList arrayListC0 = (listD == null || (listZ0 = p13.h0.z0(listD, set4)) == null) ? null : p13.h0.C0(listZ0, set3);
            if (arrayListC0 != null && !arrayListC0.isEmpty()) {
                cy0.k kVarB = cy0.k.b(kVar2, null, null, null, null, null, false, null, arrayListC0, 7167);
                gy0.t1 t1Var = (gy0.t1) this.f107597k.getValue();
                s1Var.f107531a = null;
                s1Var.f107532b = null;
                s1Var.f107533c = kVarB;
                s1Var.f107536f = 2;
                objE = t1Var.f80234a.u(str, kVarB, s1Var);
                if (objE != aVar) {
                    kVar = kVarB;
                    u1Var = (gy0.u1) objE;
                    i2.f36769a.getClass();
                    i2.a.a(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "onSaveEditNotes - updateActivities api call done! - data: " + u1Var);
                    if (p005kotlin.jvm.internal.s.g(u1Var, gy0.u1.c.f80244a)) {
                        do {
                            p2Var = this.f107598k0;
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, sy0.s.b(kVar, this.f107619v1)));
                        Q4();
                    }
                }
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f7 -> B:43:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object U4(sy0.f r22, v13.c r23) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.w0.U4(sy0.f, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[LOOP:0: B:33:0x00a1->B:39:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, o13.l] */
    public final Object V4(String str, String str2, v13.c cVar) {
        u1 u1Var;
        String str3;
        String str4;
        cy0.k kVarB;
        cy0.k kVar;
        p2 p2Var;
        Object value;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i14 = u1Var.f107569f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u1Var.f107569f = i14 - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(this, cVar);
            }
        } else {
            u1Var = new u1(this, cVar);
        }
        Object objE = u1Var.f107567d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u1Var.f107569f;
        String str5 = this.f107579b;
        if (i15 == 0) {
            o13.r.b(objE);
            gy0.j0 j0VarA4 = A4();
            u1Var.f107564a = str;
            u1Var.f107565b = str2;
            u1Var.f107569f = 1;
            objE = j0VarA4.f80181a.e(str5, u1Var);
            if (objE != aVar) {
                str3 = str;
                str4 = str2;
            }
            return aVar;
        }
        if (i15 == 1) {
            str4 = u1Var.f107565b;
            String str6 = u1Var.f107564a;
            o13.r.b(objE);
            str3 = str6;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = u1Var.f107566c;
            o13.r.b(objE);
        }
        if (p005kotlin.jvm.internal.s.g((gy0.u1) objE, gy0.u1.c.f80244a)) {
            do {
                p2Var = this.f107598k0;
                value = p2Var.getValue();
            } while (!p2Var.b(value, sy0.s.b(kVar, this.f107619v1)));
            Q4();
        }
        return Unit.INSTANCE;
        cy0.k kVar2 = (cy0.k) objE;
        if (kVar2 != null) {
            if (str4 == null) {
                str4 = "";
            }
            kVarB = cy0.k.b(kVar2, str3, str4, null, null, null, false, null, null, 8179);
        } else {
            kVarB = null;
        }
        if (kVarB != null) {
            gy0.t1 t1Var = (gy0.t1) this.f107597k.getValue();
            u1Var.f107564a = null;
            u1Var.f107565b = null;
            u1Var.f107566c = kVarB;
            u1Var.f107569f = 2;
            objE = t1Var.f80234a.u(str5, kVarB, u1Var);
            if (objE != aVar) {
                kVar = kVarB;
                if (p005kotlin.jvm.internal.s.g((gy0.u1) objE, gy0.u1.c.f80244a)) {
                    do {
                        p2Var = this.f107598k0;
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, sy0.s.b(kVar, this.f107619v1)));
                    Q4();
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
    public final Object x4(v13.c cVar) {
        y0 y0Var;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i14 = y0Var.f107765c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f107765c = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object obj = y0Var.f107763a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var.f107765c;
        if (i15 == 0) {
            o13.r.b(obj);
            gy0.j jVar = (gy0.j) this.f107595j.getValue();
            y0Var.f107765c = 1;
            if (jVar.a(this.f107579b, y0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        Q4();
        return Unit.INSTANCE;
    }

    public final b63.o y4() {
        sy0.k kVar = (sy0.k) this.H0.f150540a.getValue();
        kVar.getClass();
        return ay0.b.d(kVar.f161239g);
    }

    public final b63.o z4() {
        sy0.k kVar = (sy0.k) this.H0.f150540a.getValue();
        kVar.getClass();
        return ay0.b.d(kVar.f161238f);
    }
}
