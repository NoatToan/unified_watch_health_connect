package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initSummaries$1", f = "ActivityDetailsViewModel.kt", l = {1715}, m = "invokeSuspend", v = 2)
public final class y5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146858b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lps/r;", "currentSummary", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "ownerSocialProfileDTO", "", "childSummaryList", "Ljr/m;", "childrenStats", "Lnr/o;", "<anonymous>", "(Lps/r;Lcom/garmin/android/apps/connectmobile/userprofile/model/l;Ljava/util/List;Ljava/util/List;)Lnr/o;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initSummaries$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.s<ps.r, com.garmin.android.apps.connectmobile.userprofile.model.l, List<? extends ps.r>, List<? extends jr.m>, t13.d<? super nr.o>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ ps.r f146859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.l f146860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ List f146861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ List f146862d;

        public a(t13.d<? super a> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(ps.r rVar, com.garmin.android.apps.connectmobile.userprofile.model.l lVar, List<? extends ps.r> list, List<? extends jr.m> list2, t13.d<? super nr.o> dVar) {
            a aVar = new a(dVar);
            aVar.f146859a = rVar;
            aVar.f146860b = lVar;
            aVar.f146861c = list;
            aVar.f146862d = list2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ps.r rVar = this.f146859a;
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = this.f146860b;
            List list = this.f146861c;
            List list2 = this.f146862d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new nr.o(rVar, lVar, list, list2);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/o;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initSummaries$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.o>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146864b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.o> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f146863a = jVar;
            bVar.f146864b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146864b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("summaries ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146865a;

        public c(t tVar) {
            this.f146865a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ((r53.z1) this.f146865a.f146576z1.getValue()).setValue((nr.o) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(t tVar, t13.d<? super y5> dVar) {
        super(2, dVar);
        this.f146858b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y5(this.f146858b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146857a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146858b;
            r53.w wVar = new r53.w(r53.s.m(tVar.W4(), (r53.z1) tVar.P0.getValue(), (r53.z1) tVar.f146570x1.getValue(), tVar.I, new a(null)), new b(null));
            c cVar = new c(tVar);
            this.f146857a = 1;
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
