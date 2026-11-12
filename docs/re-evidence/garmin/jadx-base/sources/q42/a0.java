package q42;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$deleteChosenWeighIn$1$1", f = "WeightReportsViewModel.kt", l = {279}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l42.c f142597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f142598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l42.c cVar, y yVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f142597b = cVar;
        this.f142598c = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f142597b, this.f142598c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142596a;
        y yVar = this.f142598c;
        if (i14 == 0) {
            o13.r.b(obj);
            l42.c cVar = this.f142597b;
            LocalDate localDate = new DateTime(cVar.m(), DateTimeZone.getDefault()).toLocalDate();
            localDate.getClass();
            b63.o oVarT = g22.k.t(localDate);
            m42.b bVar = yVar.f142745a;
            long jM = cVar.m();
            long samplePk = cVar.getSamplePk();
            this.f142596a = 1;
            obj = bVar.b(oVarT, jM, samplePk, this);
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
