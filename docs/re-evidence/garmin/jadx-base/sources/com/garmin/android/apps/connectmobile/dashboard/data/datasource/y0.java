package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/y0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/f2;", "Lf12/l;", "userSettings", "Lhd1/a;", "cachedRealTimeData", "Lo53/z;", "ioDispatcher", "<init>", "(Lf12/l;Lhd1/a;Lo53/z;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f33395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd1.a f33396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f33397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hd1.m f33398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hd1.o f33399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd1.y f33400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hd1.a0 f33401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hd1.c0 f33402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public hd1.i0 f33403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hd1.e0 f33404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hd1.k0 f33405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hd1.g0 f33406l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lj70/i;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DeviceRealTimeDataSource$getRealTimeData$1", f = "DeviceRealTimeDataSource.kt", l = {74, 243}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<q53.t<? super j70.i>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f33408b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set<o70.o> f33410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set<o70.t> f33411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Set<o70.i> f33412f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$a", "Lhd1/d;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements hd1.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33414b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33413a = y0Var;
                this.f33414b = tVar;
            }

            @Override // hd1.d
            public final void a(hd1.m mVar) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeBodyBatteryChanged " + mVar);
                y0 y0Var = this.f33413a;
                y0Var.f33398d = mVar;
                this.f33414b.i(y0.b(y0Var));
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.data.datasource.y0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$b", "Lhd1/e;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0547b implements hd1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33415a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33416b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0547b(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33415a = y0Var;
                this.f33416b = tVar;
            }

            @Override // hd1.e
            public final void a(hd1.o oVar) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeCaloriesChanged " + oVar);
                y0 y0Var = this.f33415a;
                y0Var.f33399e = oVar;
                this.f33416b.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$c", "Lhd1/f;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c implements hd1.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33417a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33418b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33417a = y0Var;
                this.f33418b = tVar;
            }

            @Override // hd1.f
            public final void a(hd1.y yVar) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeFloorsChanged " + yVar);
                y0 y0Var = this.f33417a;
                y0Var.f33400f = yVar;
                this.f33418b.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$d", "Lhd1/g;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d implements hd1.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.m0 f33420b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33421c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(y0 y0Var, p005kotlin.jvm.internal.m0 m0Var, q53.t<? super j70.i> tVar) {
                this.f33419a = y0Var;
                this.f33420b = m0Var;
                this.f33421c = tVar;
            }

            @Override // hd1.g
            public final void a(hd1.a0 a0Var, Long l14) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeHeartRateChanged " + a0Var);
                y0 y0Var = this.f33419a;
                y0Var.f33401g = a0Var;
                int i14 = a0Var.f83363b;
                p005kotlin.jvm.internal.m0 m0Var = this.f33420b;
                if (!m0Var.f105804a && l14 != null && i14 != 0 && i14 != 1) {
                    y0Var.f33395a.g2(l14.longValue());
                    m0Var.f105804a = true;
                }
                this.f33421c.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$e", "Lhd1/h;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e implements hd1.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33423b;

            /* JADX WARN: Multi-variable type inference failed */
            public e(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33422a = y0Var;
                this.f33423b = tVar;
            }

            @Override // hd1.h
            public final void a(hd1.c0 c0Var) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeIntensityMinutesChanged " + c0Var);
                y0 y0Var = this.f33422a;
                y0Var.f33402h = c0Var;
                this.f33423b.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$f", "Lhd1/i;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class f implements hd1.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33425b;

            /* JADX WARN: Multi-variable type inference failed */
            public f(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33424a = y0Var;
                this.f33425b = tVar;
            }

            @Override // hd1.i
            public final void a(hd1.e0 e0Var) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimePushesChanged " + e0Var);
                y0 y0Var = this.f33424a;
                y0Var.f33404j = e0Var;
                this.f33425b.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$g", "Lhd1/j;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class g implements hd1.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33427b;

            /* JADX WARN: Multi-variable type inference failed */
            public g(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33426a = y0Var;
                this.f33427b = tVar;
            }

            @Override // hd1.j
            public final void a(hd1.g0 g0Var) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeRespirationChanged " + g0Var);
                y0 y0Var = this.f33426a;
                y0Var.f33406l = g0Var;
                this.f33427b.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$h", "Lhd1/k;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class h implements hd1.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33429b;

            /* JADX WARN: Multi-variable type inference failed */
            public h(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33428a = y0Var;
                this.f33429b = tVar;
            }

            @Override // hd1.k
            public final void a(hd1.i0 i0Var) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeStepsChanged " + i0Var);
                y0 y0Var = this.f33428a;
                y0Var.f33403i = i0Var;
                this.f33429b.i(y0.b(y0Var));
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$b$i", "Lhd1/l;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class i implements hd1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y0 f33430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<j70.i> f33431b;

            /* JADX WARN: Multi-variable type inference failed */
            public i(y0 y0Var, q53.t<? super j70.i> tVar) {
                this.f33430a = y0Var;
                this.f33431b = tVar;
            }

            @Override // hd1.l
            public final void a(hd1.k0 k0Var) {
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "DeviceRealTimeDataSource", "onRealTimeTrainingReadinessChanged " + k0Var);
                y0 y0Var = this.f33430a;
                y0Var.f33405k = k0Var;
                this.f33431b.i(y0.b(y0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Set<? extends o70.o> set, Set<? extends o70.t> set2, Set<? extends o70.i> set3, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f33410d = set;
            this.f33411e = set2;
            this.f33412f = set3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = y0.this.new b(this.f33410d, this.f33411e, this.f33412f, dVar);
            bVar.f33408b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(q53.t<? super j70.i> tVar, t13.d<? super Unit> dVar) {
            return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:174:0x0413  */
        /* JADX WARN: Code restructure failed: missing block: B:181:0x042e, code lost:
        
            if (q53.r.a(r3, r2, r20) == r0) goto L182;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            final C0547b c0547b;
            final c cVar;
            final d dVar;
            final e eVar;
            final h hVar;
            final f fVar;
            final i iVar;
            final g gVar;
            final q53.t tVar = (q53.t) this.f33408b;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33407a;
            if (i14 != 0) {
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
            }
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceRealTimeDataSource", "getRealTimeData()");
            y0 y0Var = y0.this;
            this.f33408b = tVar;
            this.f33407a = 1;
            y0Var.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceRealTimeDataSource", "initialize()");
            Object objE0 = ge1.b.e0(y0Var.f33397c, new a1(y0Var, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 != obj2) {
            }
            return obj2;
            Unit unit = Unit.INSTANCE;
            tVar.i(y0.b(y0.this));
            if (this.f33410d.contains(o70.o.BODY_BATTERY) || this.f33411e.contains(o70.t.f130065i) || this.f33412f.contains(o70.i.f129999g)) {
                aVar = new a(y0.this, tVar);
                hd1.t tVar2 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList = hd1.t.f83417u;
                    copyOnWriteArrayList.add(aVar);
                    if (copyOnWriteArrayList.size() == 1) {
                        hd1.t tVar3 = hd1.t.f83397a;
                        long j8 = hd1.t.f83399c;
                        tVar3.getClass();
                        String strC = hd1.t.c(j8);
                        if (strC != null) {
                            ge1.b.T(hd1.t.f83398b, null, null, new hd1.v(strC, null), 3);
                        }
                    }
                }
            } else {
                aVar = null;
            }
            if (this.f33411e.contains(o70.t.f130066j)) {
                c0547b = new C0547b(y0.this, tVar);
                hd1.t tVar4 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = hd1.t.f83415s;
                    copyOnWriteArrayList2.add(c0547b);
                    if (copyOnWriteArrayList2.size() == 1) {
                        hd1.t tVar5 = hd1.t.f83397a;
                        long j14 = hd1.t.f83399c;
                        tVar5.getClass();
                        String strC2 = hd1.t.c(j14);
                        if (strC2 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener caloriesObserver macAddress[" + strC2 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB = xm2.g.a.b();
                            hd1.p pVar = hd1.t.f83406j;
                            pVar.getClass();
                            xm2.h hVar2 = xm2.h.CALORIES;
                            hVar2.getClass();
                            gVarB.a(pVar, hVar2, strC2);
                        }
                    }
                }
            } else {
                c0547b = null;
            }
            if (this.f33411e.contains(o70.t.f130075r)) {
                cVar = new c(y0.this, tVar);
                hd1.t tVar6 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = hd1.t.f83413q;
                    copyOnWriteArrayList3.add(cVar);
                    if (copyOnWriteArrayList3.size() == 1) {
                        hd1.t tVar7 = hd1.t.f83397a;
                        long j15 = hd1.t.f83399c;
                        tVar7.getClass();
                        String strC3 = hd1.t.c(j15);
                        if (strC3 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener floorsObserver macAddress[" + strC3 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB2 = xm2.g.a.b();
                            hd1.z zVar = hd1.t.f83404h;
                            zVar.getClass();
                            xm2.h hVar3 = xm2.h.ASCENT;
                            hVar3.getClass();
                            gVarB2.a(zVar, hVar3, strC3);
                        }
                    }
                }
            } else {
                cVar = null;
            }
            p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
            m0Var.f105804a = y0.this.f33395a.C3() > 0;
            if (this.f33411e.contains(o70.t.f130077v)) {
                d dVar2 = new d(y0.this, m0Var, tVar);
                hd1.t tVar8 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList4 = hd1.t.f83410n;
                    copyOnWriteArrayList4.add(dVar2);
                    if (copyOnWriteArrayList4.size() == 1) {
                        hd1.t.f83397a.getClass();
                        hd1.t.d();
                    }
                }
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (this.f33411e.contains(o70.t.C)) {
                eVar = new e(y0.this, tVar);
                hd1.t tVar9 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList5 = hd1.t.f83414r;
                    copyOnWriteArrayList5.add(eVar);
                    if (copyOnWriteArrayList5.size() == 1) {
                        hd1.t tVar10 = hd1.t.f83397a;
                        long j16 = hd1.t.f83399c;
                        tVar10.getClass();
                        String strC4 = hd1.t.c(j16);
                        if (strC4 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener intensityMinutesObserver macAddress[" + strC4 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB3 = xm2.g.a.b();
                            hd1.d0 d0Var = hd1.t.f83405i;
                            d0Var.getClass();
                            xm2.h hVar4 = xm2.h.INTENSITY_MINUTES;
                            hVar4.getClass();
                            gVarB3.a(d0Var, hVar4, strC4);
                        }
                    }
                }
            } else {
                eVar = null;
            }
            Set<o70.o> set = this.f33410d;
            o70.o oVar = o70.o.STEPS;
            if (set.contains(oVar) || this.f33411e.contains(o70.t.H0) || this.f33412f.contains(o70.i.f130002j)) {
                hVar = new h(y0.this, tVar);
                hd1.t tVar11 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList6 = hd1.t.f83411o;
                    copyOnWriteArrayList6.add(hVar);
                    if (copyOnWriteArrayList6.size() == 1) {
                        hd1.t tVar12 = hd1.t.f83397a;
                        long j17 = hd1.t.f83399c;
                        tVar12.getClass();
                        String strC5 = hd1.t.c(j17);
                        if (strC5 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener stepsObserver macAddress[" + strC5 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB4 = xm2.g.a.b();
                            hd1.j0 j0Var = hd1.t.f83402f;
                            j0Var.getClass();
                            xm2.h hVar5 = xm2.h.STEPS;
                            hVar5.getClass();
                            gVarB4.a(j0Var, hVar5, strC5);
                        }
                    }
                }
            } else {
                hVar = null;
            }
            if (this.f33410d.contains(oVar) || this.f33411e.contains(o70.t.H0) || this.f33412f.contains(o70.i.f130002j)) {
                fVar = new f(y0.this, tVar);
                hd1.t tVar13 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList7 = hd1.t.f83412p;
                    copyOnWriteArrayList7.add(fVar);
                    if (copyOnWriteArrayList7.size() == 1) {
                        hd1.t tVar14 = hd1.t.f83397a;
                        long j18 = hd1.t.f83399c;
                        tVar14.getClass();
                        String strC6 = hd1.t.c(j18);
                        if (strC6 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener pushesObserver macAddress[" + strC6 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB5 = xm2.g.a.b();
                            hd1.f0 f0Var = hd1.t.f83403g;
                            f0Var.getClass();
                            xm2.h hVar6 = xm2.h.PUSHES;
                            hVar6.getClass();
                            gVarB5.a(f0Var, hVar6, strC6);
                        }
                    }
                }
            } else {
                fVar = null;
            }
            if (this.f33410d.contains(o70.o.TRAINING_READINESS) || this.f33411e.contains(o70.t.L0) || this.f33412f.contains(o70.i.f130003k)) {
                iVar = new i(y0.this, tVar);
                hd1.t tVar15 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList8 = hd1.t.f83418v;
                    copyOnWriteArrayList8.add(iVar);
                    if (copyOnWriteArrayList8.size() == 1) {
                        hd1.t tVar16 = hd1.t.f83397a;
                        long j19 = hd1.t.f83399c;
                        tVar16.getClass();
                        String strC7 = hd1.t.c(j19);
                        if (strC7 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener trainingReadinessObserver macAddress[" + strC7 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB6 = xm2.g.a.b();
                            hd1.l0 l0Var = hd1.t.f83409m;
                            l0Var.getClass();
                            gVarB6.a(l0Var, xm2.h.TRAINING_READINESS, strC7);
                        }
                    }
                }
            } else {
                iVar = null;
            }
            if (this.f33411e.contains(o70.t.Y)) {
                g gVar2 = new g(y0.this, tVar);
                hd1.t tVar17 = hd1.t.f83397a;
                synchronized (hd1.t.class) {
                    CopyOnWriteArrayList copyOnWriteArrayList9 = hd1.t.f83416t;
                    copyOnWriteArrayList9.add(gVar2);
                    if (copyOnWriteArrayList9.size() == 1) {
                        hd1.t tVar18 = hd1.t.f83397a;
                        long j24 = hd1.t.f83399c;
                        tVar18.getClass();
                        String strC8 = hd1.t.c(j24);
                        if (strC8 != null) {
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider addListener respirationObserver macAddress[" + strC8 + "]");
                            xm2.g.f191527c.getClass();
                            xm2.g gVarB7 = xm2.g.a.b();
                            hd1.h0 h0Var = hd1.t.f83407k;
                            h0Var.getClass();
                            gVarB7.a(h0Var, xm2.h.RESPIRATION, strC8);
                        }
                    }
                }
                gVar = gVar2;
            } else {
                aVar = aVar;
                gVar = null;
            }
            final a aVar2 = aVar;
            e23.a aVar3 = new e23.a() { // from class: com.garmin.android.apps.connectmobile.dashboard.data.datasource.z0
                @Override // e23.a
                public final Object invoke() {
                    y0.b.a aVar4 = aVar2;
                    y0.b.C0547b c0547b2 = c0547b;
                    y0.b.c cVar2 = cVar;
                    y0.b.d dVar3 = dVar;
                    y0.b.e eVar2 = eVar;
                    y0.b.h hVar7 = hVar;
                    y0.b.f fVar2 = fVar;
                    y0.b.i iVar2 = iVar;
                    y0.b.g gVar3 = gVar;
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "DeviceRealTimeDataSource", "getRealTimeData() - Removing device realtime listeners");
                    if (aVar4 != null) {
                        hd1.t tVar19 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            CopyOnWriteArrayList copyOnWriteArrayList10 = hd1.t.f83417u;
                            copyOnWriteArrayList10.remove(aVar4);
                            if (copyOnWriteArrayList10.size() == 0) {
                                hd1.t tVar20 = hd1.t.f83397a;
                                long j25 = hd1.t.f83399c;
                                tVar20.getClass();
                                String strC9 = hd1.t.c(j25);
                                if (strC9 != null) {
                                    com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener bodyBatteryObserver macAddress[" + strC9 + "]");
                                    xm2.g.f191527c.getClass();
                                    xm2.g gVarB8 = xm2.g.a.b();
                                    hd1.n nVar = hd1.t.f83408l;
                                    nVar.getClass();
                                    gVarB8.b(nVar, xm2.h.BODY_BATTERY, strC9);
                                }
                            }
                        }
                    }
                    if (c0547b2 != null) {
                        hd1.t tVar21 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList11 = hd1.t.f83415s;
                                copyOnWriteArrayList11.remove(c0547b2);
                                if (copyOnWriteArrayList11.size() == 0) {
                                    hd1.t tVar22 = hd1.t.f83397a;
                                    long j26 = hd1.t.f83399c;
                                    tVar22.getClass();
                                    String strC10 = hd1.t.c(j26);
                                    if (strC10 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener caloriesObserver macAddress[" + strC10 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB9 = xm2.g.a.b();
                                        hd1.p pVar2 = hd1.t.f83406j;
                                        pVar2.getClass();
                                        xm2.h hVar8 = xm2.h.CALORIES;
                                        hVar8.getClass();
                                        gVarB9.b(pVar2, hVar8, strC10);
                                    }
                                    hd1.t.g(hd1.t.A, zy0.a.REAL_TIME_CALORIES);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (cVar2 != null) {
                        hd1.t tVar23 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList12 = hd1.t.f83413q;
                                copyOnWriteArrayList12.remove(cVar2);
                                if (copyOnWriteArrayList12.size() == 0) {
                                    hd1.t tVar24 = hd1.t.f83397a;
                                    long j27 = hd1.t.f83399c;
                                    tVar24.getClass();
                                    String strC11 = hd1.t.c(j27);
                                    if (strC11 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener floorsObserver macAddress[" + strC11 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB10 = xm2.g.a.b();
                                        hd1.z zVar2 = hd1.t.f83404h;
                                        zVar2.getClass();
                                        xm2.h hVar9 = xm2.h.ASCENT;
                                        hVar9.getClass();
                                        gVarB10.b(zVar2, hVar9, strC11);
                                    }
                                    hd1.t.g(hd1.t.f83421y, zy0.a.REAL_TIME_FLOORS);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    if (dVar3 != null) {
                        hd1.t tVar25 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            CopyOnWriteArrayList copyOnWriteArrayList13 = hd1.t.f83410n;
                            copyOnWriteArrayList13.remove(dVar3);
                            if (copyOnWriteArrayList13.size() == 0) {
                                hd1.t.f83397a.getClass();
                                hd1.t.f();
                            }
                        }
                    }
                    if (eVar2 != null) {
                        hd1.t tVar26 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList14 = hd1.t.f83414r;
                                copyOnWriteArrayList14.remove(eVar2);
                                if (copyOnWriteArrayList14.size() == 0) {
                                    hd1.t tVar27 = hd1.t.f83397a;
                                    long j28 = hd1.t.f83399c;
                                    tVar27.getClass();
                                    String strC12 = hd1.t.c(j28);
                                    if (strC12 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener intensityMinutesObserver macAddress[" + strC12 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB11 = xm2.g.a.b();
                                        hd1.d0 d0Var2 = hd1.t.f83405i;
                                        d0Var2.getClass();
                                        xm2.h hVar10 = xm2.h.INTENSITY_MINUTES;
                                        hVar10.getClass();
                                        gVarB11.b(d0Var2, hVar10, strC12);
                                    }
                                    hd1.t.g(hd1.t.f83422z, zy0.a.REAL_TIME_INTENSITY_MINUTES);
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                    if (hVar7 != null) {
                        hd1.t tVar28 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList15 = hd1.t.f83411o;
                                copyOnWriteArrayList15.remove(hVar7);
                                if (copyOnWriteArrayList15.size() == 0) {
                                    hd1.t tVar29 = hd1.t.f83397a;
                                    long j29 = hd1.t.f83399c;
                                    tVar29.getClass();
                                    String strC13 = hd1.t.c(j29);
                                    if (strC13 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener stepsObserver macAddress[" + strC13 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB12 = xm2.g.a.b();
                                        hd1.j0 j0Var2 = hd1.t.f83402f;
                                        j0Var2.getClass();
                                        xm2.h hVar11 = xm2.h.STEPS;
                                        hVar11.getClass();
                                        gVarB12.b(j0Var2, hVar11, strC13);
                                    }
                                    hd1.t.g(hd1.t.f83419w, zy0.a.REAL_TIME_STEPS);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                    }
                    if (fVar2 != null) {
                        hd1.t tVar30 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList16 = hd1.t.f83412p;
                                copyOnWriteArrayList16.remove(fVar2);
                                if (copyOnWriteArrayList16.size() == 0) {
                                    hd1.t tVar31 = hd1.t.f83397a;
                                    long j34 = hd1.t.f83399c;
                                    tVar31.getClass();
                                    String strC14 = hd1.t.c(j34);
                                    if (strC14 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener pushesObserver macAddress[" + strC14 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB13 = xm2.g.a.b();
                                        hd1.f0 f0Var2 = hd1.t.f83403g;
                                        f0Var2.getClass();
                                        xm2.h hVar12 = xm2.h.PUSHES;
                                        hVar12.getClass();
                                        gVarB13.b(f0Var2, hVar12, strC14);
                                    }
                                    hd1.t.g(hd1.t.f83420x, zy0.a.REAL_TIME_PUSHES);
                                }
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                    }
                    if (iVar2 != null) {
                        hd1.t tVar32 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList17 = hd1.t.f83418v;
                                copyOnWriteArrayList17.remove(iVar2);
                                if (copyOnWriteArrayList17.size() == 0) {
                                    hd1.t tVar33 = hd1.t.f83397a;
                                    long j35 = hd1.t.f83399c;
                                    tVar33.getClass();
                                    String strC15 = hd1.t.c(j35);
                                    if (strC15 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener trainingReadinessObserver macAddress[" + strC15 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB14 = xm2.g.a.b();
                                        hd1.l0 l0Var2 = hd1.t.f83409m;
                                        l0Var2.getClass();
                                        gVarB14.b(l0Var2, xm2.h.TRAINING_READINESS, strC15);
                                    }
                                    hd1.t.g(hd1.t.C, zy0.a.REAL_TIME_TRAINING_READINESS);
                                }
                            } catch (Throwable th8) {
                                throw th8;
                            }
                        }
                    }
                    if (gVar3 != null) {
                        hd1.t tVar34 = hd1.t.f83397a;
                        synchronized (hd1.t.class) {
                            try {
                                CopyOnWriteArrayList copyOnWriteArrayList18 = hd1.t.f83416t;
                                copyOnWriteArrayList18.remove(gVar3);
                                if (copyOnWriteArrayList18.size() == 0) {
                                    hd1.t tVar35 = hd1.t.f83397a;
                                    long j36 = hd1.t.f83399c;
                                    tVar35.getClass();
                                    String strC16 = hd1.t.c(j36);
                                    if (strC16 != null) {
                                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICES, "RealTimeDataProvider removeListener respirationObserver macAddress[" + strC16 + "]");
                                        xm2.g.f191527c.getClass();
                                        xm2.g gVarB15 = xm2.g.a.b();
                                        hd1.h0 h0Var2 = hd1.t.f83407k;
                                        h0Var2.getClass();
                                        gVarB15.b(h0Var2, xm2.h.RESPIRATION, strC16);
                                    }
                                    hd1.t.g(hd1.t.B, zy0.a.REAL_TIME_RESPIRATION);
                                }
                            } catch (Throwable th9) {
                                throw th9;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.f33408b = null;
            this.f33407a = 2;
        }
    }

    static {
        new a(null);
    }

    public y0(f12.l lVar, hd1.a aVar, o53.z zVar) {
        lVar.getClass();
        aVar.getClass();
        zVar.getClass();
        this.f33395a = lVar;
        this.f33396b = aVar;
        this.f33397c = zVar;
    }

    public static final j70.i b(y0 y0Var) {
        return new j70.i(y0Var.f33398d, y0Var.f33399e, y0Var.f33400f, y0Var.f33401g, y0Var.f33402h, y0Var.f33403i, y0Var.f33404j, y0Var.f33405k, y0Var.f33406l);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.f2
    public final r53.i<j70.i> a(Set<? extends o70.o> set, Set<? extends o70.t> set2, Set<? extends o70.i> set3) {
        return r53.s.A(r53.s.f(new b(set, set2, set3, null)), this.f33397c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/y0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(f12.l lVar, hd1.a aVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(lVar, aVar, zVar);
    }
}
