package ou1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getVigorousMInsAndCalories$2", f = "TrainingPlanFitnessStatsUseCase.kt", l = {355}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends Integer, ? extends Integer>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f134047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalDate f134048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f134046c = iVar;
        this.f134047d = localDate;
        this.f134048e = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f134046c, this.f134047d, this.f134048e, dVar);
        e0Var.f134045b = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends Integer, ? extends Integer>> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Map<String, yw1.e> map;
        Set<Map.Entry<String, yw1.e>> setEntrySet;
        Map.Entry entry;
        yw1.e eVar;
        Double d14;
        Double d15;
        o53.b0 b0Var = (o53.b0) this.f134045b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134044a;
        LocalDate localDate = this.f134048e;
        LocalDate localDate2 = this.f134047d;
        Integer num = null;
        if (i14 == 0) {
            o13.r.b(obj);
            cx1.o oVar = this.f134046c.f134058a;
            this.f134045b = b0Var;
            this.f134044a = 1;
            obj = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.f(oVar, localDate2, localDate, null), this);
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
            yw1.g gVar = (yw1.g) h0.d0((List) ((v2.b) v2Var).f47386a);
            if (gVar == null || (map = gVar.f199923c) == null || (setEntrySet = map.entrySet()) == null || (entry = (Map.Entry) h0.c0(setEntrySet)) == null || (eVar = (yw1.e) entry.getValue()) == null) {
                return null;
            }
            yw1.f fVar = eVar.f199910h;
            Integer num2 = (fVar == null || (d15 = fVar.f199916c) == null) ? null : new Integer((int) d15.doubleValue());
            yw1.f fVar2 = eVar.f199905c;
            if (fVar2 != null && (d14 = fVar2.f199916c) != null) {
                num = new Integer(MathKt.b(d14.doubleValue()));
            }
            return new o13.p(num2, num);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String str = "Error in getting vigorousIM's age startDate " + localDate2 + " :: endDate " + localDate + StringUtils.SPACE + ((v2.a) v2Var).f47383a;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", str);
        return null;
    }
}
