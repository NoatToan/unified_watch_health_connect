package ou1;

import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.text.DecimalFormat;
import lc.u0;
import o53.j0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getFitnessAge$2", f = "TrainingPlanFitnessStatsUseCase.kt", l = {329, 339}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends String, ? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yw1.k f134084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f134086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f134087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalDate f134088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocalDate f134089f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyw1/k;", "<anonymous>", "(Lo53/b0;)Lyw1/k;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getFitnessAge$2$fitnessAgeEnd$1", f = "TrainingPlanFitnessStatsUseCase.kt", l = {332}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super yw1.k>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f134091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f134092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f134093d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, LocalDate localDate, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134092c = iVar;
            this.f134093d = localDate;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f134092c, this.f134093d, dVar);
            aVar.f134091b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super yw1.k> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f134091b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134090a;
            LocalDate localDate = this.f134093d;
            if (i14 == 0) {
                o13.r.b(obj);
                cx1.o oVar = this.f134092c.f134058a;
                String string = localDate.toString();
                string.getClass();
                this.f134091b = b0Var;
                this.f134090a = 1;
                obj = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.d(oVar, string, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (yw1.k) ((v2.b) v2Var).f47386a;
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String str = "Error in getting fitness age " + localDate + " :: " + ((v2.a) v2Var).f47383a;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", str);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyw1/k;", "<anonymous>", "(Lo53/b0;)Lyw1/k;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getFitnessAge$2$fitnessAgeStart$1", f = "TrainingPlanFitnessStatsUseCase.kt", l = {322}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super yw1.k>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f134095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f134096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f134097d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, LocalDate localDate, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f134096c = iVar;
            this.f134097d = localDate;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f134096c, this.f134097d, dVar);
            bVar.f134095b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super yw1.k> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f134095b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134094a;
            LocalDate localDate = this.f134097d;
            if (i14 == 0) {
                o13.r.b(obj);
                cx1.o oVar = this.f134096c.f134058a;
                String string = localDate.toString();
                string.getClass();
                this.f134095b = b0Var;
                this.f134094a = 1;
                obj = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.d(oVar, string, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (yw1.k) ((v2.b) v2Var).f47386a;
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String str = "Error in getting fitness age " + localDate + " :: " + ((v2.a) v2Var).f47383a;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", str);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f134087d = iVar;
        this.f134088e = localDate;
        this.f134089f = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f134087d, this.f134088e, this.f134089f, dVar);
        oVar.f134086c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends String, ? extends String>> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        yw1.k kVar;
        yw1.k kVar2;
        double dDoubleValue;
        double dDoubleValue2;
        Double dA;
        Double dA2;
        o53.b0 b0Var = (o53.b0) this.f134086c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134085b;
        i iVar = this.f134087d;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(iVar, this.f134088e, null), 3);
            this.f134086c = b0Var;
            this.f134085b = 1;
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
            kVar = this.f134084a;
            o13.r.b(obj);
        }
        kVar2 = (yw1.k) obj;
        dDoubleValue = Double.NaN;
        if (kVar != null || (dA2 = kVar.a()) == null) {
            dDoubleValue2 = Double.NaN;
        } else {
            dDoubleValue2 = dA2.doubleValue();
        }
        if (kVar2 != null && (dA = kVar2.a()) != null) {
            dDoubleValue = dA.doubleValue();
        }
        if (zf.b.D(new Double(dDoubleValue2)) || !zf.b.D(new Double(dDoubleValue)) || dDoubleValue2 <= dDoubleValue || dDoubleValue2 <= dDoubleValue) {
            return null;
        }
        DecimalFormat decimalFormat = l3.f23137o;
        return new o13.p(decimalFormat.format(dDoubleValue2), decimalFormat.format(dDoubleValue));
        yw1.k kVar3 = (yw1.k) obj;
        j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(iVar, this.f134089f, null), 3);
        this.f134086c = null;
        this.f134084a = kVar3;
        this.f134085b = 2;
        Object objC = j0VarJ2.C(this);
        if (objC != aVar) {
            kVar = kVar3;
            obj = objC;
            kVar2 = (yw1.k) obj;
            dDoubleValue = Double.NaN;
            if (kVar != null) {
                dDoubleValue2 = Double.NaN;
            } else {
                dDoubleValue2 = Double.NaN;
            }
            if (kVar2 != null) {
                dDoubleValue = dA.doubleValue();
            }
            if (zf.b.D(new Double(dDoubleValue2))) {
            }
            return null;
        }
        return aVar;
    }
}
