package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initRoundsExerciseSetsCollector$2", f = "ActivityDetailsViewModel.kt", l = {1698}, m = "invokeSuspend", v = 2)
public final class w5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146814b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "rounds", "Lps/s0;", "exerciseSets", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "", "showMuscleMapHint", "Lnr/n0;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;Lps/s0;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Z)Lnr/n0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initRoundsExerciseSetsCollector$2$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.s<com.garmin.android.apps.connectmobile.activities.newmodel.f, ps.s0, com.garmin.android.apps.connectmobile.repcounting.model.c, Boolean, t13.d<? super nr.n0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.activities.newmodel.f f146815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ps.s0 f146816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.c f146817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f146818d;

        public a(t13.d<? super a> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, ps.s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, Boolean bool, t13.d<? super nr.n0> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(dVar);
            aVar.f146815a = fVar;
            aVar.f146816b = s0Var;
            aVar.f146817c = cVar;
            aVar.f146818d = zBooleanValue;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f146815a;
            ps.s0 s0Var = this.f146816b;
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f146817c;
            boolean z14 = this.f146818d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new nr.n0(fVar, s0Var, cVar, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/n0;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initRoundsExerciseSetsCollector$2$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.n0>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146820b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.n0> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f146819a = jVar;
            bVar.f146820b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146820b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("roundsExerciseSetsDataFlow ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146821a;

        public c(t tVar) {
            this.f146821a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar;
            List<ps.r0> listD;
            nr.n0 n0Var = (nr.n0) obj;
            r53.z1 z1Var = (r53.z1) this.f146821a.Z0.getValue();
            ps.s0 s0Var = n0Var.f127266b;
            if (s0Var != null && (cVar = n0Var.f127267c) != null && (listD = s0Var.d()) != null) {
                for (ps.r0 r0Var : listD) {
                    ps.q0 q0VarH = r0Var.h();
                    String category = q0VarH != null ? q0VarH.getCategory() : null;
                    String strF = r0Var.f();
                    if (g22.n.d(category) && g22.n.d(strF) && !p005kotlin.jvm.internal.s.g(strF, "UNKNOWN")) {
                        r0Var.f140205l = cVar.G(category, strF);
                        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = cVar.D(category, strF);
                        r0Var.f140203j = dVarD != null ? dVarD.f41108g : null;
                        r0Var.f140204k = dVarD != null ? dVarD.f41109h : null;
                        r0Var.f140206m = dVarD != null ? Boolean.valueOf(dVarD.f41105d) : null;
                    }
                }
            }
            z1Var.setValue(n0Var);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(t tVar, t13.d<? super w5> dVar) {
        super(2, dVar);
        this.f146814b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w5(this.f146814b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146813a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146814b;
            r53.w wVar = new r53.w(r53.s.m((r53.z1) tVar.Y0.getValue(), tVar.k5(), tVar.W0, (r53.z1) tVar.Y1.getValue(), new a(null)), new b(null));
            c cVar = new c(tVar);
            this.f146813a = 1;
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
