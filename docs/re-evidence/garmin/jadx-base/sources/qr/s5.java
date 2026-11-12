package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initLapsDetailsCollector$1", f = "ActivityDetailsViewModel.kt", l = {3519}, m = "invokeSuspend", v = 2)
public final class s5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146491b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lps/r;", "summaryData", "Lps/p;", "splits", "Lnr/v;", "deviceData", "", "weight", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "workoutsList", "Lnr/t$e;", "<anonymous>", "(Lps/r;Lps/p;Lnr/v;DLjava/util/List;)Lnr/t$e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initLapsDetailsCollector$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.t<ps.r, ps.p, nr.v, Double, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j>, t13.d<? super nr.t.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ ps.r f146492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ps.p f146493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ nr.v f146494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Double f146495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ List f146496e;

        public a(t13.d<? super a> dVar) {
            super(6, dVar);
        }

        @Override // e23.t
        public final Object invoke(ps.r rVar, ps.p pVar, nr.v vVar, Double d14, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list, t13.d<? super nr.t.e> dVar) {
            a aVar = new a(dVar);
            aVar.f146492a = rVar;
            aVar.f146493b = pVar;
            aVar.f146494c = vVar;
            aVar.f146495d = d14;
            aVar.f146496e = list;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ps.r rVar = this.f146492a;
            ps.p pVar = this.f146493b;
            nr.v vVar = this.f146494c;
            Double d14 = this.f146495d;
            List list = this.f146496e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new nr.t.e(rVar, pVar, vVar != null ? vVar.f127379b : null, list, d14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/t$e;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initLapsDetailsCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.t.e>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, t13.d<? super b> dVar) {
            super(3, dVar);
            this.f146499c = tVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.t.e> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f146499c, dVar);
            bVar.f146497a = jVar;
            bVar.f146498b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146498b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("LapsState ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            this.f146499c.L1.k(null, new nr.i(null, false, true, null, 11, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146500a;

        public c(t tVar) {
            this.f146500a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f146500a.S1.setValue((nr.t.e) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t tVar, t13.d<? super s5> dVar) {
        super(2, dVar);
        this.f146491b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s5(this.f146491b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146490a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146491b;
            r53.w wVar = new r53.w(r53.s.n(tVar.W4(), tVar.U4(), tVar.h5(), (r53.z1) tVar.f146542n1.getValue(), tVar.Y4(), new a(null)), new b(tVar, null));
            c cVar = new c(tVar);
            this.f146490a = 1;
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
