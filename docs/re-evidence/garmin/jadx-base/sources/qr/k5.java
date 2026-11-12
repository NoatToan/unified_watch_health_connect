package qr;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initActivityBasicDataCollector$1", f = "ActivityDetailsViewModel.kt", l = {1733}, m = "invokeSuspend", v = 2)
public final class k5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146297b;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Ljr/d;", "configuration", "Lnr/o;", "summaries", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "details", "Lps/p;", "splits", "", "weight", "Lnr/a;", "<anonymous>", "(Ljr/d;Lnr/o;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lps/p;D)Lnr/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initActivityBasicDataCollector$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.t<jr.d, nr.o, ActivityDetailChartDTO, ps.p, Double, t13.d<? super nr.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ jr.d f146298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ nr.o f146299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ ActivityDetailChartDTO f146300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ ps.p f146301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Double f146302e;

        public a(t13.d<? super a> dVar) {
            super(6, dVar);
        }

        @Override // e23.t
        public final Object invoke(jr.d dVar, nr.o oVar, ActivityDetailChartDTO activityDetailChartDTO, ps.p pVar, Double d14, t13.d<? super nr.a> dVar2) {
            a aVar = new a(dVar2);
            aVar.f146298a = dVar;
            aVar.f146299b = oVar;
            aVar.f146300c = activityDetailChartDTO;
            aVar.f146301d = pVar;
            aVar.f146302e = d14;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            jr.d dVar = this.f146298a;
            nr.o oVar = this.f146299b;
            ActivityDetailChartDTO activityDetailChartDTO = this.f146300c;
            ps.p pVar = this.f146301d;
            Double d14 = this.f146302e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new nr.a(dVar, oVar, activityDetailChartDTO, pVar, d14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/a;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initActivityBasicDataCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.a>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146304b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.a> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f146303a = jVar;
            bVar.f146304b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146304b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("activity basic data ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146305a;

        public c(t tVar) {
            this.f146305a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int i14 = t.A2;
            this.f146305a.L4().setValue((nr.a) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(t tVar, t13.d<? super k5> dVar) {
        super(2, dVar);
        this.f146297b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k5(this.f146297b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146296a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f146297b;
            r53.w wVar = new r53.w(r53.s.n(tVar.F, (r53.z1) tVar.f146576z1.getValue(), tVar.N4(), tVar.U4(), (r53.z1) tVar.f146542n1.getValue(), new a(null)), new b(null));
            c cVar = new c(tVar);
            this.f146296a = 1;
            if (wVar.collect(cVar, this) == aVar) {
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
