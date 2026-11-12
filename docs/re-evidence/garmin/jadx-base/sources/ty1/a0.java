package ty1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsTrainingFragment$handleGarminCoachPlans$1", f = "EventDetailsTrainingFragment.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg0.k f167065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar, fg0.k kVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f167064b = eVar;
        this.f167065c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f167064b, this.f167065c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167063a;
        if (i14 == 0) {
            o13.r.b(obj);
            fg0.k kVar = this.f167065c;
            com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167064b;
            sy.i iVar = new sy.i(27, kVar, eVar);
            this.f167063a = 1;
            if (com.garmin.android.apps.connectmobile.traininginitiative.ui.e.u6(eVar, iVar, this) == aVar) {
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
