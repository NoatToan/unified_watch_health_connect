package q42;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$deleteAllWeightsForDate$1", f = "WeightReportsViewModel.kt", l = {289}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f142782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f142783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, LocalDate localDate, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f142782b = yVar;
        this.f142783c = localDate;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f142782b, this.f142783c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142781a;
        y yVar = this.f142782b;
        if (i14 == 0) {
            o13.r.b(obj);
            m42.b bVar = yVar.f142745a;
            b63.o oVarT = g22.k.t(this.f142783c);
            this.f142781a = 1;
            obj = bVar.a(oVarT, this);
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
        if (!(v2Var instanceof v2.a)) {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            yVar.z4();
        }
        return Unit.INSTANCE;
    }
}
