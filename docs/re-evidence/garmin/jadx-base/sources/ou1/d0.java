package ou1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import o53.j0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getVO2MAX$2", f = "TrainingPlanFitnessStatsUseCase.kt", l = {521, 522}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends Integer, ? extends Integer>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f134025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f134027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt1.o f134028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f134029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocalDate f134030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LocalDate f134031g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyw1/j;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getVO2MAX$2$vo2maxEnd$1", f = "TrainingPlanFitnessStatsUseCase.kt", l = {522}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends yw1.j>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f134033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f134034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vt1.o f134035d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, LocalDate localDate, vt1.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134033b = iVar;
            this.f134034c = localDate;
            this.f134035d = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f134033b, this.f134034c, this.f134035d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends yw1.j>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134032a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            cx1.o oVar = this.f134033b.f134058a;
            String str = this.f134035d.f180185b;
            this.f134032a = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.n(oVar, this.f134034c, str, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyw1/j;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getVO2MAX$2$vo2maxStart$1", f = "TrainingPlanFitnessStatsUseCase.kt", l = {521}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends yw1.j>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f134037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f134038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vt1.o f134039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, LocalDate localDate, vt1.o oVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f134037b = iVar;
            this.f134038c = localDate;
            this.f134039d = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f134037b, this.f134038c, this.f134039d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends yw1.j>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134036a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            cx1.o oVar = this.f134037b.f134058a;
            String str = this.f134039d.f180185b;
            this.f134036a = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.n(oVar, this.f134038c, str, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vt1.o oVar, i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f134028d = oVar;
        this.f134029e = iVar;
        this.f134030f = localDate;
        this.f134031g = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f134028d, this.f134029e, this.f134030f, this.f134031g, dVar);
        d0Var.f134027c = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends Integer, ? extends Integer>> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        v2 v2Var2;
        o13.p pVar;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        o53.b0 b0Var = (o53.b0) this.f134027c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134026b;
        i iVar = this.f134029e;
        vt1.o oVar = this.f134028d;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(iVar, this.f134030f, oVar, null), 3);
            this.f134027c = b0Var;
            this.f134026b = 1;
            obj = j0VarJ.C(this);
            if (obj != aVar) {
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
            v2Var = this.f134025a;
            o13.r.b(obj);
        }
        v2Var2 = (v2) obj;
        if ((v2Var instanceof v2.b) || !(v2Var2 instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching vo2 max start values ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            }
            if (v2Var2 instanceof v2.a) {
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error occurred while fetching vo2 max end values ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "TrainingPlanFitnessStatsUseCase", strD2);
            }
        } else {
            if (oVar == vt1.o.f180175f) {
                yw1.v vVar = ((yw1.j) ((v2.b) v2Var).f47386a).f199944b;
                Integer num = (vVar == null || (d17 = vVar.f199986b) == null) ? null : new Integer((int) d17.doubleValue());
                yw1.v vVar2 = ((yw1.j) ((v2.b) v2Var2).f47386a).f199944b;
                pVar = new o13.p(num, (vVar2 == null || (d16 = vVar2.f199986b) == null) ? null : new Integer((int) d16.doubleValue()));
            } else {
                yw1.v vVar3 = ((yw1.j) ((v2.b) v2Var).f47386a).f199945c;
                Integer num2 = (vVar3 == null || (d15 = vVar3.f199986b) == null) ? null : new Integer((int) d15.doubleValue());
                yw1.v vVar4 = ((yw1.j) ((v2.b) v2Var2).f47386a).f199945c;
                pVar = new o13.p(num2, (vVar4 == null || (d14 = vVar4.f199986b) == null) ? null : new Integer((int) d14.doubleValue()));
            }
            Integer num3 = (Integer) pVar.f128594a;
            Integer num4 = (Integer) pVar.f128595b;
            if (num4 != null && num3 != null && num3.intValue() < num4.intValue()) {
                return new o13.p(num3, num4);
            }
        }
        return null;
        v2 v2Var3 = (v2) obj;
        j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(iVar, this.f134031g, oVar, null), 3);
        this.f134027c = b0Var;
        this.f134025a = v2Var3;
        this.f134026b = 2;
        Object objC = j0VarJ2.C(this);
        if (objC != aVar) {
            v2Var = v2Var3;
            obj = objC;
            v2Var2 = (v2) obj;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching vo2 max start values ");
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var3, "TrainingPlanFitnessStatsUseCase", strD3);
                }
                if (v2Var2 instanceof v2.a) {
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error occurred while fetching vo2 max end values ");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var4, "TrainingPlanFitnessStatsUseCase", strD4);
                }
            } else {
                if (v2Var instanceof v2.a) {
                    String strD5 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching vo2 max start values ");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var5, "TrainingPlanFitnessStatsUseCase", strD5);
                }
                if (v2Var2 instanceof v2.a) {
                    String strD6 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error occurred while fetching vo2 max end values ");
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.f(a2Var6, "TrainingPlanFitnessStatsUseCase", strD6);
                }
            }
            return null;
        }
        return aVar;
    }
}
