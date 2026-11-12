package l70;

import com.garmin.android.apps.connectmobile.dashboard.data.datasource.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.c1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.c2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.f2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.k1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.o1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.v1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.w1;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.y1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001.Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ll70/e;", "Ll70/c;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;", "dashboardConfigDataSource", "Lgm0/a;", "Lpb2/a$b;", "Lj70/h;", "activitiesAndWorkoutsDataSource", "Lpb2/b$g;", "activitiesAndStreaksDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;", "activityTrendsPreferencesDataSource", "Lpb2/e$i;", "commonStatsDataSource", "Lpb2/f$b;", "eventsDataSource", "Lpb2/h$b;", "trainingPlanDataSource", "Lpb2/d$b;", "challengesDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/c1;", "ecgDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a;", "activeCampaignDataSource", "Ll70/b;", "atpTypesRepo", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/f2;", "realTimeDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/x;", "availablePrimaryStatsDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a0;", "availableSecondaryStatsDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/u;", "availableEssentialsStatsDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/c2;", "pregnancyWeightGoalDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a2;", "lastTrainingStatusDeviceDataSource", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "dashboardPreferences", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/y1;", "heartRateZonePreferences", "Lo91/a;", "personalRecordsRepository", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;Lgm0/a;Lgm0/a;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;Lgm0/a;Lgm0/a;Lgm0/a;Lgm0/a;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/c1;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a;Ll70/b;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/f2;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/x;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a0;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/u;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/c2;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a2;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/y1;Lo91/a;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements l70.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f110614w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 f110615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gm0.a<pb2.a.b, j70.h> f110616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gm0.a<pb2.b.g, j70.h> f110617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.o f110618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gm0.a<pb2.e.i, j70.h> f110619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gm0.a<pb2.f.b, j70.h> f110620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gm0.a<pb2.h.b, j70.h> f110621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gm0.a<pb2.d.b, j70.h> f110622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c1 f110623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.a f110624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l70.b f110625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f2 f110626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.x f110627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.a0 f110628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.u f110629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2 f110630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f110631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0 f110632r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y1 f110633t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o91.a f110634v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lj70/k$e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchChallenges$1", f = "DashboardRepositoryImpl.kt", l = {567}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super j70.k.e>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f110636b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j<j70.k.e> f110638a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(r53.j<? super j70.k.e> jVar) {
                this.f110638a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x001e  */
            /* JADX WARN: Code duplicated, block: B:18:0x0032  */
            /* JADX WARN: Code duplicated, block: B:26:0x0046  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                String strA;
                String strA2;
                String strA3;
                gm0.e eVar = (gm0.e) obj;
                yz1.d dVar2 = eVar.f78008a;
                pb2.d.b bVar = (pb2.d.b) eVar.f78009b;
                String strA4 = null;
                if (bVar != null) {
                    Object obj2 = bVar.f136934d;
                    List list = obj2 instanceof List ? (List) obj2 : null;
                    if (list != null) {
                        strA = GsonUtil.a(list);
                    } else {
                        strA = null;
                    }
                } else {
                    strA = null;
                }
                if (bVar != null) {
                    Object obj3 = bVar.f136931a;
                    List list2 = obj3 instanceof List ? (List) obj3 : null;
                    if (list2 != null) {
                        strA2 = GsonUtil.a(list2);
                    } else {
                        strA2 = null;
                    }
                } else {
                    strA2 = null;
                }
                if (bVar != null) {
                    Object obj4 = bVar.f136932b;
                    List list3 = obj4 instanceof List ? (List) obj4 : null;
                    if (list3 != null) {
                        strA3 = GsonUtil.a(list3);
                    } else {
                        strA3 = null;
                    }
                } else {
                    strA3 = null;
                }
                if (bVar != null) {
                    Object obj5 = bVar.f136933c;
                    List list4 = obj5 instanceof List ? (List) obj5 : null;
                    if (list4 != null) {
                        strA4 = GsonUtil.a(list4);
                    }
                }
                j70.k.e eVar2 = new j70.k.e(dVar2, strA, strA2, strA3, strA4);
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String str = "fetchChallenges() status[" + eVar.f78008a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DashboardRepository", str);
                Object objEmit = this.f110638a.emit(eVar2, dVar);
                return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f110636b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j70.k.e> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f110636b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f110635a;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2VarB = e.this.f110622h.b(null);
                a aVar2 = new a(jVar);
                this.f110636b = null;
                this.f110635a = 1;
                if (p2VarB.collect(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lj70/k$h;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchEvents$1", f = "DashboardRepositoryImpl.kt", l = {456}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super j70.k.h>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f110640b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f110642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.j<j70.k.h> f110643b;

            /* JADX INFO: renamed from: l70.e$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C2113a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t7, T t14) {
                    return r13.a.b(((fg0.e) t7).getDate(), ((fg0.e) t14).getDate());
                }
            }

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchEvents$1$1", f = "DashboardRepositoryImpl.kt", l = {473, 474, 490}, m = "emit", v = 2)
            public static final class b extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public gm0.e f110644a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public List f110645b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public List f110646c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public n1 f110647d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public v1 f110648e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public String f110649f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public int f110650g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public /* synthetic */ Object f110651h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ a<T> f110652i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f110653j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(a<? super T> aVar, t13.d<? super b> dVar) {
                    super(dVar);
                    this.f110652i = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f110651h = obj;
                    this.f110653j |= Integer.MIN_VALUE;
                    return this.f110652i.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(e eVar, r53.j<? super j70.k.h> jVar) {
                this.f110642a = eVar;
                this.f110643b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x009c  */
            /* JADX WARN: Code duplicated, block: B:50:0x0185  */
            /* JADX WARN: Code duplicated, block: B:59:0x0192 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:61:0x017f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01e0, code lost:
            
                if (r19.f110643b.emit(r11, r3) == r4) goto L55;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(gm0.e<pb2.f.b> eVar, t13.d<? super Unit> dVar) {
                b bVar;
                List<fg0.e> listA;
                n1 n1Var;
                gm0.e<pb2.f.b> eVar2;
                int i14;
                List<fg0.e> list;
                final v1 v1Var;
                List list2;
                String str;
                List list3;
                List<fg0.e> list4;
                n1 n1Var2;
                gm0.e<pb2.f.b> eVar3;
                ArrayList arrayList;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i15 = bVar.f110653j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        bVar.f110653j = i15 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, dVar);
                    }
                } else {
                    bVar = new b(this, dVar);
                }
                Object obj = bVar.f110651h;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i16 = bVar.f110653j;
                e eVar4 = this.f110642a;
                final int i17 = 1;
                if (i16 == 0) {
                    o13.r.b(obj);
                    LocalDate localDate = DateTime.now().toLocalDate();
                    pb2.f.b bVar2 = (pb2.f.b) eVar.f78009b;
                    if (bVar2 != null) {
                        Object obj2 = bVar2.f137123a;
                        Map map = obj2 instanceof Map ? (Map) obj2 : null;
                        String strA = map != null ? GsonUtil.a(map) : null;
                        if (strA == null || (listA = ((fg0.f) GsonUtil.f47253b.fromJson(strA, (Class) fg0.f.class)).a()) == null) {
                            listA = p13.j0.f134944a;
                        }
                    } else {
                        listA = p13.j0.f134944a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (T t7 : listA) {
                        fg0.e eVar5 = (fg0.e) t7;
                        if (!g22.k.g(eVar5.getDate(), localDate)) {
                            LocalDate localDateA = eVar5.getDate();
                            localDate.getClass();
                            if (g22.k.g(localDateA, jg.b.G(localDate))) {
                            }
                        }
                        arrayList2.add(t7);
                    }
                    List listL = p13.x.l(p13.h0.d0(p13.h0.N0(p13.h0.z0(listA, p13.h0.g1(arrayList2)), new C2113a())));
                    boolean z14 = !p13.h0.z0(listA, p13.h0.g1(listL)).isEmpty();
                    n1Var = new n1(z14, listL);
                    final v1 v1Var2 = new v1(GsonUtil.a(arrayList2), GsonUtil.a(n1Var));
                    int i18 = e.f110614w;
                    eVar4.getClass();
                    final int i19 = 0;
                    k1 k1Var = (k1) KoinJavaComponent.get$default(k1.class, null, new e23.a() { // from class: l70.d
                        @Override // e23.a
                        public final Object invoke() {
                            int i24 = i19;
                            v1 v1Var3 = v1Var2;
                            switch (i24) {
                                case 0:
                                    int i25 = e.f110614w;
                                    break;
                                default:
                                    int i26 = e.f110614w;
                                    break;
                            }
                            return ParametersHolderKt.parametersOf(v1Var3);
                        }
                    }, 2, null);
                    bVar.f110644a = eVar;
                    bVar.f110645b = listA;
                    bVar.f110646c = arrayList2;
                    bVar.f110647d = n1Var;
                    bVar.f110648e = v1Var2;
                    bVar.f110650g = z14 ? 1 : 0;
                    bVar.f110653j = 1;
                    Object objA = k1Var.a(bVar);
                    if (objA != aVar) {
                        eVar2 = eVar;
                        i14 = z14 ? 1 : 0;
                        list = listA;
                        v1Var = v1Var2;
                        obj = objA;
                        list2 = arrayList2;
                    }
                    return aVar;
                }
                if (i16 == 1) {
                    i14 = bVar.f110650g;
                    v1Var = bVar.f110648e;
                    n1 n1Var3 = bVar.f110647d;
                    List list5 = bVar.f110646c;
                    List<fg0.e> list6 = bVar.f110645b;
                    eVar2 = bVar.f110644a;
                    o13.r.b(obj);
                    n1Var = n1Var3;
                    list2 = list5;
                    list = list6;
                } else if (i16 == 2) {
                    i14 = bVar.f110650g;
                    String str2 = bVar.f110649f;
                    n1Var2 = bVar.f110647d;
                    List list7 = bVar.f110646c;
                    list4 = bVar.f110645b;
                    gm0.e<pb2.f.b> eVar6 = bVar.f110644a;
                    o13.r.b(obj);
                    str = str2;
                    eVar3 = eVar6;
                    list3 = list7;
                    String str3 = (String) obj;
                    arrayList = new ArrayList();
                    for (T t14 : list4) {
                        if (((fg0.e) t14).k()) {
                            arrayList.add(t14);
                        }
                    }
                    j70.k.h hVar = new j70.k.h(eVar3.f78008a, GsonUtil.a(list3), GsonUtil.a(n1Var2), str, str3, GsonUtil.a(arrayList));
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    String str4 = "fetchEvents() status[" + eVar3.f78008a + "]";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DashboardRepository", str4);
                    bVar.f110644a = null;
                    bVar.f110645b = null;
                    bVar.f110646c = null;
                    bVar.f110647d = null;
                    bVar.f110648e = null;
                    bVar.f110649f = null;
                    bVar.f110650g = i14;
                    bVar.f110653j = 3;
                } else {
                    if (i16 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                String str5 = (String) obj;
                int i24 = e.f110614w;
                eVar4.getClass();
                o1 o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, new e23.a() { // from class: l70.d
                    @Override // e23.a
                    public final Object invoke() {
                        int i25 = i17;
                        v1 v1Var3 = v1Var;
                        switch (i25) {
                            case 0:
                                int i26 = e.f110614w;
                                break;
                            default:
                                int i27 = e.f110614w;
                                break;
                        }
                        return ParametersHolderKt.parametersOf(v1Var3);
                    }
                }, 2, null);
                bVar.f110644a = eVar2;
                bVar.f110645b = list;
                bVar.f110646c = list2;
                bVar.f110647d = n1Var;
                bVar.f110648e = null;
                bVar.f110649f = str5;
                bVar.f110650g = i14;
                bVar.f110653j = 2;
                Object objA2 = o1Var.a(bVar);
                if (objA2 != aVar) {
                    str = str5;
                    obj = objA2;
                    list3 = list2;
                    list4 = list;
                    n1Var2 = n1Var;
                    eVar3 = eVar2;
                    String str6 = (String) obj;
                    arrayList = new ArrayList();
                    while (r9.hasNext()) {
                        if (((fg0.e) t14).k()) {
                            arrayList.add(t14);
                        }
                    }
                    j70.k.h hVar2 = new j70.k.h(eVar3.f78008a, GsonUtil.a(list3), GsonUtil.a(n1Var2), str, str6, GsonUtil.a(arrayList));
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    String str7 = "fetchEvents() status[" + eVar3.f78008a + "]";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "DashboardRepository", str7);
                    bVar.f110644a = null;
                    bVar.f110645b = null;
                    bVar.f110646c = null;
                    bVar.f110647d = null;
                    bVar.f110648e = null;
                    bVar.f110649f = null;
                    bVar.f110650g = i14;
                    bVar.f110653j = 3;
                }
                return aVar;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = e.this.new c(dVar);
            cVar.f110640b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j70.k.h> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f110640b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f110639a;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = e.this;
                p2 p2VarB = eVar.f110620f.b(null);
                a aVar2 = new a(eVar, jVar);
                this.f110640b = null;
                this.f110639a = 1;
                if (p2VarB.collect(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lj70/k$i;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchTrainingPlans$1", f = "DashboardRepositoryImpl.kt", l = {547, 549}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super j70.k.i>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f110655b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f110657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f110658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r53.j<j70.k.i> f110659c;

            /* JADX INFO: renamed from: l70.e$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchTrainingPlans$1$1", f = "DashboardRepositoryImpl.kt", l = {551, 560}, m = "emit", v = 2)
            public static final class C2114a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public gm0.e f110660a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public boolean f110661b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f110662c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a<T> f110663d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f110664e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2114a(a<? super T> aVar, t13.d<? super C2114a> dVar) {
                    super(dVar);
                    this.f110663d = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f110662c = obj;
                    this.f110664e |= Integer.MIN_VALUE;
                    return this.f110663d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(e eVar, String str, r53.j<? super j70.k.i> jVar) {
                this.f110657a = eVar;
                this.f110658b = str;
                this.f110659c = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0064  */
            /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
            
                if (r11.f110659c.emit(r4, r0) == r1) goto L43;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(gm0.e<pb2.h.b> eVar, t13.d<? super Unit> dVar) {
                C2114a c2114a;
                boolean z14;
                String strA;
                Object objA;
                Object objC;
                String strA2;
                Object objC2;
                if (dVar instanceof C2114a) {
                    c2114a = (C2114a) dVar;
                    int i14 = c2114a.f110664e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2114a.f110664e = i14 - Integer.MIN_VALUE;
                    } else {
                        c2114a = new C2114a(this, dVar);
                    }
                } else {
                    c2114a = new C2114a(this, dVar);
                }
                Object obj = c2114a.f110662c;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2114a.f110664e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        boolean z15 = c2114a.f110661b;
                        gm0.e<pb2.h.b> eVar2 = c2114a.f110660a;
                        o13.r.b(obj);
                        z14 = z15;
                        eVar = eVar2;
                        objA = obj;
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                z14 = eVar.f78008a.f200300c;
                pb2.h.b bVar = (pb2.h.b) eVar.f78009b;
                if (bVar != null) {
                    Object obj2 = bVar.f137159a;
                    Map map = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map == null || (objC = p13.u0.c("trainingPlanWorkoutScheduleDTOS", map)) == null) {
                        strA = null;
                    } else {
                        strA = GsonUtil.a(objC);
                    }
                } else {
                    strA = null;
                }
                int i16 = e.f110614w;
                this.f110657a.getClass();
                w1 w1Var = (w1) KoinJavaComponent.get$default(w1.class, null, new a90.c(strA, 8), 2, null);
                c2114a.f110660a = eVar;
                c2114a.f110661b = z14;
                c2114a.f110664e = 1;
                objA = w1Var.a(z14, c2114a);
                if (objA != aVar) {
                }
                return aVar;
                String str = (String) objA;
                yz1.d dVar2 = eVar.f78008a;
                pb2.h.b bVar2 = (pb2.h.b) eVar.f78009b;
                if (bVar2 != null) {
                    Object obj3 = bVar2.f137159a;
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    if (map2 == null || (objC2 = p13.u0.c("trainingPlanWorkoutScheduleDTOS", map2)) == null) {
                        strA2 = null;
                    } else {
                        strA2 = GsonUtil.a(objC2);
                    }
                } else {
                    strA2 = null;
                }
                j70.k.i iVar = new j70.k.i(dVar2, strA2, this.f110658b, str);
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String str2 = "fetchTrainingPlans() status[" + eVar.f78008a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DashboardRepository", str2);
                c2114a.f110660a = null;
                c2114a.f110661b = z14;
                c2114a.f110664e = 2;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = e.this.new d(dVar);
            dVar2.f110655b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j70.k.i> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            if (r2.collect(r6, r7) == r1) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f110655b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f110654a;
            e eVar = e.this;
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
            fy1.i.f73924a.getClass();
            String strF = fy1.i.a.f();
            l70.b bVar = eVar.f110625k;
            this.f110655b = jVar;
            this.f110654a = 1;
            String strA = l70.b.f110599d.a();
            if (strA == null) {
                obj = l70.b.f110596a.a(strF, this);
                if (obj != aVar) {
                    obj = (String) obj;
                }
            } else {
                obj = strA;
            }
            if (obj != aVar) {
            }
            return aVar;
            p2 p2VarB = eVar.f110621g.b(null);
            a aVar2 = new a(eVar, (String) obj, jVar);
            this.f110655b = null;
            this.f110654a = 2;
        }
    }

    static {
        new a(null);
    }

    public e(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 l0Var, gm0.a<pb2.a.b, j70.h> aVar, gm0.a<pb2.b.g, j70.h> aVar2, com.garmin.android.apps.connectmobile.dashboard.data.datasource.o oVar, gm0.a<pb2.e.i, j70.h> aVar3, gm0.a<pb2.f.b, j70.h> aVar4, gm0.a<pb2.h.b, j70.h> aVar5, gm0.a<pb2.d.b, j70.h> aVar6, c1 c1Var, com.garmin.android.apps.connectmobile.dashboard.data.datasource.a aVar7, l70.b bVar, f2 f2Var, com.garmin.android.apps.connectmobile.dashboard.data.datasource.x xVar, com.garmin.android.apps.connectmobile.dashboard.data.datasource.a0 a0Var, com.garmin.android.apps.connectmobile.dashboard.data.datasource.u uVar, c2 c2Var, a2 a2Var, com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0 s0Var, y1 y1Var, o91.a aVar8) {
        l0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        oVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        c1Var.getClass();
        aVar7.getClass();
        bVar.getClass();
        f2Var.getClass();
        xVar.getClass();
        a0Var.getClass();
        uVar.getClass();
        c2Var.getClass();
        a2Var.getClass();
        s0Var.getClass();
        y1Var.getClass();
        aVar8.getClass();
        this.f110615a = l0Var;
        this.f110616b = aVar;
        this.f110617c = aVar2;
        this.f110618d = oVar;
        this.f110619e = aVar3;
        this.f110620f = aVar4;
        this.f110621g = aVar5;
        this.f110622h = aVar6;
        this.f110623i = c1Var;
        this.f110624j = aVar7;
        this.f110625k = bVar;
        this.f110626l = f2Var;
        this.f110627m = xVar;
        this.f110628n = a0Var;
        this.f110629o = uVar;
        this.f110630p = c2Var;
        this.f110631q = a2Var;
        this.f110632r = s0Var;
        this.f110633t = y1Var;
        this.f110634v = aVar8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(e eVar, v13.c cVar) {
        x xVar;
        eVar.getClass();
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f110830c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f110830c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(eVar, cVar);
            }
        } else {
            xVar = new x(eVar, cVar);
        }
        Object objI = xVar.f110828a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f110830c;
        if (i15 == 0) {
            o13.r.b(objI);
            o91.a aVar2 = eVar.f110634v;
            xVar.f110830c = 1;
            objI = aVar2.i(xVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        v2 v2Var = (v2) objI;
        if (v2Var instanceof v2.b) {
            return GsonUtil.a(((v2.b) v2Var).f47386a);
        }
        return null;
    }

    @Override // l70.c
    public final s53.k D2() {
        return r53.s.N(r53.s.s(new k(this.f110615a.p())), new j(null, this));
    }

    @Override // l70.c
    public final s53.k D3() {
        return r53.s.N(r53.s.s(new h(this.f110615a.p())), new g(null, this));
    }

    @Override // l70.c
    public final r53.i<j70.k.h> G3() {
        r53.c2 c2Var = new r53.c2(new c(null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    @Override // l70.c
    public final f0 M1() {
        return new f0(new r53.i[]{this.f110616b.h(), this.f110623i.a(), this.f110620f.h(), this.f110624j.a(), this.f110617c.h(), this.f110619e.h(), this.f110621g.h(), this.f110622h.h()});
    }

    @Override // l70.c
    public final s53.k P() {
        return r53.s.N(r53.s.s(new v(this.f110615a.p())), new u(null, this));
    }

    @Override // l70.c
    public final r53.c2 P2() {
        return new r53.c2(new f(this, null));
    }

    @Override // l70.c
    public final e0 T2() {
        return new e0(new r53.i[]{this.f110616b.g(), this.f110623i.isLoading(), this.f110620f.g(), this.f110624j.isLoading(), this.f110617c.g(), this.f110619e.g(), this.f110621g.g(), this.f110622h.g()});
    }

    @Override // l70.c
    public final r53.c2 V2() {
        return new r53.c2(new c0(this, null));
    }

    @Override // l70.c
    public final Unit X(boolean z14) {
        this.f110616b.j(z14);
        this.f110623i.b(z14);
        this.f110620f.j(z14);
        this.f110624j.c();
        this.f110617c.j(z14);
        this.f110619e.j(z14);
        this.f110621g.j(z14);
        this.f110622h.j(z14);
        return Unit.INSTANCE;
    }

    @Override // l70.c
    public final s53.k X1() {
        return r53.s.N(r53.s.s(new n(this.f110615a.p())), new m(null, this));
    }

    @Override // l70.c
    public final r53.c2 X2() {
        return new r53.c2(new b0(this, null));
    }

    @Override // l70.c
    public final r53.c2 Z2() {
        return new r53.c2(new d0(this, null));
    }

    @Override // l70.c
    public final void cleanup() {
        this.f110616b.a();
        this.f110617c.a();
        this.f110619e.a();
        this.f110620f.a();
        this.f110621g.a();
        this.f110622h.a();
        this.f110623i.cancel();
        this.f110624j.cancel();
    }

    @Override // l70.c
    public final Object e(o70.f fVar, t13.d<? super Unit> dVar) {
        Object objE = this.f110615a.e(fVar, dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // l70.c
    public final s53.k j4() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DashboardRepository", "fetchRealTimeData()");
        return r53.s.N(r53.s.s(new z(this.f110615a.p())), new y(null, this));
    }

    @Override // l70.c
    public final r53.i<j70.k.e> k1() {
        r53.c2 c2Var = new r53.c2(new b(null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    @Override // l70.c
    public final r53.i<j70.f> p() {
        return r53.s.s(this.f110615a.p());
    }

    @Override // l70.c
    public final Object s(List list, List list2, List list3, List list4, List list5, v13.c cVar) {
        return this.f110615a.s(list, list2, list3, list4, list5, cVar);
    }

    @Override // l70.c
    public final s53.k x3(boolean z14) {
        return r53.s.N(r53.s.s(new r(this.f110615a.p())), new q(null, this, z14));
    }

    @Override // l70.c
    public final r53.i<j70.k.i> y0() {
        r53.c2 c2Var = new r53.c2(new d(null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    @Override // l70.c
    public final void z2() {
        this.f110619e.j(false);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll70/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LAST_7_DAYS_PENDING_DAYS", "I", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
