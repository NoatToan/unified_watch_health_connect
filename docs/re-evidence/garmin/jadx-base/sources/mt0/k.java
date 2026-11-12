package mt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsViewModel$getChallengeDetails$1", f = "AdHocChallengeDetailsViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<o13.p<com.garmin.android.apps.connectmobile.g3<AdHocChallengeDTO>, Integer>> f120678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f120679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f120680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.lifecycle.y0<o13.p<com.garmin.android.apps.connectmobile.g3<AdHocChallengeDTO>, Integer>> y0Var, q qVar, String str, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f120678b = y0Var;
        this.f120679c = qVar;
        this.f120680d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f120678b, this.f120679c, this.f120680d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120677a;
        q qVar = this.f120679c;
        androidx.lifecycle.y0<o13.p<com.garmin.android.apps.connectmobile.g3<AdHocChallengeDTO>, Integer>> y0Var = this.f120678b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(new o13.p<>(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f), null));
            yt0.a aVar2 = qVar.f120814a;
            this.f120677a = 1;
            aVar2.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new yt0.g(aVar2, this.f120680d, null), this);
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
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            com.garmin.android.apps.connectmobile.g3.a aVar3 = com.garmin.android.apps.connectmobile.g3.f35298f;
            com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            T t7 = bVar.f47386a;
            aVar3.getClass();
            y0Var.j(new o13.p<>(com.garmin.android.apps.connectmobile.g3.a.d(t7), new Integer(bVar.f47387b)));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.g3.a aVar4 = com.garmin.android.apps.connectmobile.g3.f35298f;
            com.garmin.android.apps.connectmobile.v2.a aVar5 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
            qVar.getClass();
            y0Var.j(new o13.p<>(com.garmin.android.apps.connectmobile.g3.a.a(aVar4, aVar5.f47383a.toString(), null, null, null, 14), aVar5.f47384b));
        }
        return Unit.INSTANCE;
    }
}
