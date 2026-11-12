package qh1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionViewModel$getHasBodyCompositionLast45Days$1", f = "IndexScale2AdjustBodyCompositionViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f144774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f144774b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f144774b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144773a;
        p pVar = this.f144774b;
        if (i14 == 0) {
            o13.r.b(obj);
            pVar.f144768c.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            m mVar = pVar.f144766a;
            LocalDate localDateMinusDays = LocalDate.now().minusDays(45);
            this.f144773a = 1;
            obj = mVar.c(localDateMinusDays, null, this);
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
            pVar.f144768c.j(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            pVar.f144768c.j(fw.m.a.d(fw.m.f73767e, ((v2.a) v2Var).f47383a));
        }
        return Unit.INSTANCE;
    }
}
