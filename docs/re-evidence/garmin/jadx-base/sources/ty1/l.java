package ty1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsFragment$handleSetGoalOrTrainingNavigation$1", f = "EventDetailsFragment.kt", l = {1331}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f167165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.k f167167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar, fg0.k kVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f167166c = aVar;
        this.f167167d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f167166c, this.f167167d, dVar);
        lVar.f167165b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f167165b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167164a;
        if (i14 == 0) {
            o13.r.b(obj);
            fg0.k kVar = this.f167167d;
            com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar2 = this.f167166c;
            tn2.s0 s0Var = new tn2.s0(kVar, 4, aVar2, b0Var);
            this.f167165b = null;
            this.f167164a = 1;
            if (com.garmin.android.apps.connectmobile.traininginitiative.ui.a.v6(aVar2, s0Var, this) == aVar) {
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
