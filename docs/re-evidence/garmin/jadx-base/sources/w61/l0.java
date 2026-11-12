package w61;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$pauseTrainingPlan$1", f = "TrainingStatusViewModel.kt", l = {990}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x61.p f183213c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$pauseTrainingPlan$1$1", f = "TrainingStatusViewModel.kt", l = {993}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f183215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x61.p f183216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, x61.p pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f183215b = xVar;
            this.f183216c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f183215b, this.f183216c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            xw1.d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183214a;
            x xVar = this.f183215b;
            if (i14 == 0) {
                o13.r.b(obj);
                fu1.w wVar = xVar.T;
                Long l14 = (wVar == null || (dVar = wVar.f73566c) == null) ? null : new Long(dVar.getAthletePlanId());
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    this.f183214a = 1;
                    t13.i iVar = new t13.i(u13.f.b(this));
                    ((wt1.u) xVar.P.getValue()).k(jLongValue, new m0(iVar));
                    obj = iVar.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar = (com.garmin.android.library.backgroundtaskmanagement.b.c) obj;
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                f12.l.f68084a.getClass();
                f12.l.a.a().N2(false);
                xVar.f183274j.j(fw.m.a.g(fw.m.f73767e, this.f183216c, 1));
                y0<f<o13.p<String, String>>> y0Var = xVar.E;
                l22.b bVar = xVar.f183267c.f189261b;
                y0Var.j(new f<>(new o13.p(bVar.getString(R.string.gcm_training_status_plan_paused_label), bVar.getString(R.string.gcm_training_status_plan_paused_desc))));
            } else {
                f12.l.f68084a.getClass();
                f12.l.a.a().N2(true);
                xVar.f183274j.j(fw.m.a.c(fw.m.f73767e, null, cVar, 5));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(x xVar, x61.p pVar, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f183212b = xVar;
        this.f183213c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f183212b, this.f183213c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183211a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f183212b, this.f183213c, null);
            this.f183211a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
